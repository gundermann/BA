/*
 * generated by Xtext
 */
package org.deg.xtext.gui.generator

import java.util.ArrayList
import java.util.List
import org.deg.xtext.gui.guiDSL.ButtonDefinition
import org.deg.xtext.gui.guiDSL.Definition
import org.deg.xtext.gui.guiDSL.InterchangeableDefinition
import org.deg.xtext.gui.guiDSL.LabelDefinition
import org.deg.xtext.gui.guiDSL.Refinement
import org.deg.xtext.gui.guiDSL.TreeDefinition
import org.deg.xtext.gui.guiDSL.UIDescription
import org.deg.xtext.gui.guiDSL.UIDescriptionImport
import org.deg.xtext.gui.guiDSL.UsedDescription
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.common.util.URI

/**
 * Generates code from your model files on save.
 * 
 */
class GuiDSLGenerator implements IGenerator {

	String specificFilename
	String descriptionname
	List<String> imports = new ArrayList<String>()
	List<String> globalVars = new ArrayList<String>()
	String mainContainer 
	String packageName

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		descriptionname = resource.URI.getDescriptionName
		packageName = resource.URI.getPackageName
		genGuiClass(resource.allContents.toIterable.filter(UIDescription), fsa)
		

	}
	
	def String getGetPackageName(URI uri){
		for(var index = 0; index < uri.segmentCount-1; index++){
			if(uri.segment(index).equals('src')){
				index++
				if(index != uri.segmentCount - 1 ){
				var sb = new StringBuilder()
				sb.append(uri.segment(index))
				for(index++; index < uri.segmentCount-1; index++){
					sb.append('\\/').append(uri.segment(index))
				}
				return sb.toString
				}
			}
				 
		}
		return ''	
	}
	
	def String getDescriptionName(URI uri){
		return uri.segment(uri.segmentCount-1).split('\\.').get(0)
	}

	def genGuiClass(Iterable<UIDescription> uiDescriptions, IFileSystemAccess fsa) {
		specificFilename = "Gui" + descriptionname
		for (d : uiDescriptions) {
			if (d.typeDefinition.type.id.equals("WINDOW")) {
				mainContainer = "contentPane"
				var source = d.compileWindow
				fsa.generateFile(packageName + "/" + specificFilename + ".java", genPackage + genImports + source)
			} else {
				mainContainer = "this"
				var source = d.compileComplex
				fsa.generateFile(packageName + "/" + specificFilename + ".java", genPackage + genImports + source)
			}

			//Müssen geleert werden, da sie ansonsten beim nächsten Übersetzen wieder benutzt werden.
			imports.clear
			globalVars.clear
		}
		
		
	}
	
	def genIpClass( IFileSystemAccess fsa) {
		specificFilename = "Ip" + descriptionname
	}

	def genPackage() '''
		package «packageName.replace("\\/", "\\.")»;
		
	'''

	def String genImports() {
		var sb = new StringBuilder()
		for (import : imports) {
			sb.append(import).append("\n");
		}
		return sb.toString
	}

	def compileComplex(UIDescription description) '''
		«addImport("import DE.data_experts.jwammc.core.pf.PfPanel;")»
		/**
		* Generated by Xtext.
		*/
		
		public class «specificFilename» extends PfPanel{
			
		
		«description.genRest»
		}	
	'''

	def getInit(UIDescription description) '''
		public void init(){
						«FOR def : description.definitions»
							«def.compileDefinition»
						«ENDFOR»
						«FOR ref : description.refinements»
							«ref.compileRefinement»
						«ENDFOR»
						«FOR usedDescription : description.usedDescriptions»
							«usedDescription.compile»
						«ENDFOR»
«««						Layout Start
						«IF !description.usedDescriptions.empty»
							«addImport("import DE.data_experts.jwammc.core.pf.PfPanel;")»
							PfPanel panel = new PfPanel(new BorderLayout());
							panel.add(«description.usedDescriptions.get(0).id», BorderLayout.NORTH);
							panel.add(«description.usedDescriptions.get(1).id», BorderLayout.SOUTH);
							this.add(panel, BorderLayout.WEST);
						«ENDIF»
«««						Layout Ende
				}
	'''

	def compile(UsedDescription description) '''
		«IF description.descriptionType instanceof UIDescriptionImport»
			«var castedDescriptionType = description.descriptionType as UIDescriptionImport»
			«var usedQualifiedClassName = castedDescriptionType.descriptionName.genGuiFileName»
			«addGlobalVar(usedQualifiedClassName + ' ' + description.id + ';')»
				«description.id» = new « usedQualifiedClassName»();
		«ELSE»
			«genComplexComponent(description)»
		«ENDIF»
	'''
	
	def genGuiFileName(String descriptionName) {
		var separatedName = descriptionName.split('\\.')
		separatedName.set(separatedName.size-1, "Gui"+ separatedName.get(separatedName.size-1))
		return separatedName.join('.')
	}

	def genComplexComponent(UsedDescription description) {
	}

	def compileRefinement(Refinement refinement) {
	}

	def String addImport(String newImport) {
		if (!imports.contains(newImport)) {
			imports.add(newImport)
		}
		return ""
	}

	def compileWindow(UIDescription description) '''
		«addImport("import DE.data_experts.jwammc.core.pf.PfRootPane;")»
		
		/**
		* Generated by Xtext.
		*/
		
		public class «specificFilename» extends PfRootPane{
			
		«description.genRest»
		}
	'''

	def genRest(UIDescription description) '''
		«addImport("import java.awt.BorderLayout;")»
			public «specificFilename»(){
					super( new BorderLayout() );
					try {
					 				init();
					 			}
								catch ( Exception e ) {
										 e.printStackTrace();
								 }
				}
		
			«description.init»
			/**
			* Generated global variables.
			*/
			«genGlobalVars»
	'''

	def genGlobalVars() '''
		«FOR v : globalVars»
			private «v»
		«ENDFOR»
	'''

	def genInteractions() '''
«««		«FOR i : interactions»
«««			public void invoke«i.name»(){
«««				«FOR a : i.actions»
«««					«IF a.type.equals('UiAction')»
«««						«(a as UIAction).extract»
«««					«ENDIF»
«««				«ENDFOR»
«««			}
«««		«ENDFOR»
«««		
	'''

	def compileDefinition(Definition definition) '''
	«IF definition.concreteDefition.name == 'Label'»
		«(definition.concreteDefition as LabelDefinition).compileLabel»
	«ELSEIF definition.concreteDefition.name == 'Tree'»
		«(definition.concreteDefition as TreeDefinition).compileTree»
		«ELSEIF definition.concreteDefition.name == 'Interchangeable'»
		«(definition.concreteDefition as InterchangeableDefinition).compileInterchangeable»
	«ENDIF»
	
	«««		«IF definition.concreteDefition.type.equals("Button")»
«««			«(definition.concreteDefition as ButtonDefinition).compileButton»
««««««		«ELSEIF definition.concreteDefition.type.equals("Checkbox")»
««««««			«(definition.concreteDefition as CheckboxDefinition).compileCheckbox»
««««««		«ELSEIF definition.concreteDefition.type.equals("Radiobox")»
««««««			«(definition.concreteDefition as RadioboxDefinition).compileRadiobox»
«««		«ELSE»
«««			«(definition.concreteDefition as LabelDefinition).compileLabel»
«««		«ENDIF»
	'''
	
	def compileInterchangeable(InterchangeableDefinition definition)'''
	«addImport("import DE.data_experts.jwammc.core.pf.PfCardPanel;")»
	«addGlobalVar("PfCardPanel " + definition.id + ";")»
	«definition.id» = new PfCardPanel();
		«definition.id».setIfName("«definition.id»");
		
«««		Layout Start
	this.add(«definition.id», BorderLayout.CENTER);
«««		Layout Ende
	'''

	def compileTree(TreeDefinition definition) '''
		«addImport("import DE.data_experts.jwammc.core.pf.PfTree;")»
		«addImport("import DE.data_experts.jwammc.core.pf.TreeCellRenderer;")»
		«addImport("import javax.swing.tree.DefaultTreeModel;")»
		«addGlobalVar("PfTree " + definition.id + ";")»
		«definition.id» = new PfTree();
		«definition.id».setIfName("«definition.id»");
		«IF definition.inputType == null»
			«addImport("import DE.data_experts.util.ObjectNode;")»
			«definition.id».setTreeModel( new DefaultTreeModel( new ObjectNode() ) );
		«ELSE»
			«definition.id».setTreeModel( new DefaultTreeModel( new «definition.inputType.substring(1,
			definition.inputType.length - 1)»() ) );
		«ENDIF»
			«definition.id».setCellRenderer( new TreeCellRenderer() );
		
		
		«««		Layout kommt in eine separate Datei
		«addImport("import DE.data_experts.jwammc.core.pf.PfScrollPane;")»
		«addImport("import java.awt.Dimension;")»
		«addGlobalVar("PfScrollPane scrollPane;")»
		scrollPane = new PfScrollPane(«definition.id»);
		scrollPane.setMinimumSize( new Dimension( 200, 200 ) );
		this.add( scrollPane, BorderLayout.CENTER );
	'''

	//	def compileMultiSelection(MultiSelectionDefinition definition)'''
	//		«addImport("import test.JavaFXMultiSelection;")»
	//			«IF definition.inputType != null»
	//				«addImport("import "+definition.inputType+";")»
	//				«addGlobalVar( "JavaFXMultiSelection<"+definition.inputType+"> " + definition.name + ";")»
	//				«definition.name» = new JavaFXMultiSelection<«definition.inputType»>();
	//				«IF definition.selectableValuesLocation != null»
	//				«definition.name».setSelectable(«definition.selectableValuesLocation»);
	//					«IF definition.selectedValuesLocation != null»
	//				«definition.name».setSelected(«definition.selectedValuesLocation»);
	//					«ENDIF»
	//				«ENDIF»
	//			«ELSE»
	//		«addGlobalVar( "JavaFXMultiSelection<?> " + definition.name + ";")»
	//				«definition.name» = new JavaFXMultiSelection<?>();
	//			«ENDIF»
	//			return «definition.name»;
	//	'''
	//	def compileCheckbox(CheckboxDefinition definition) '''
	//		«addImport("import javafx.scene.control.CheckBox;")»
	//		«addGlobalVar( "CheckBox " + definition.name + ";")»
	//			«definition.name» = new CheckBox();
	//			«definition.name».setText("«definition.text»");
	//			return «definition.name»;
	//	'''
	//	def compileRadiobox(RadioboxDefinition definition) '''
	//		«addImport("import javafx.scene.control.RadioButton;")»
	//		«addGlobalVar( "RadioButton " + definition.name + ";")»
	//			«definition.name» = new RadioButton();
	//			«definition.name».setText("«definition.text»");
	//			return «definition.name»;
	//	'''
	//	def compileTextfield(TextfieldDefinition definition) '''
	//		«addImport("import javafx.scene.control.TextField;")»
	//		«addGlobalVar( "TextField " + definition.name + ";")»
	//			«definition.name» = new TextField();
	//			«definition.name».setText("«definition.text»");
	//			return «definition.name»;
	//	'''
	def compileLabel(LabelDefinition definition) '''
		«addImport("import DE.data_experts.jwammc.core.pf.PfLabel;")»
		«addGlobalVar("PfLabel " + definition.id + ";")»
		«definition.id» = new PfLabel();
		«definition.id».setIfName("«definition.id»");
		«IF definition.properties != null»
			«genProperty(definition.id, 'setText', definition.properties.text, true)»
		«ENDIF»
		
		«««		TODO
«««		Label wird in der Layoutdatei genommen werden
		«mainContainer».add(«definition.id», BorderLayout.NORTH);
	'''

	def genProperty(String id, String method, String value, Boolean isString) '''
		«IF value != null»
			«IF isString»
				«id».«method»("«value»");
			«ELSE»
				«id».«method»(«value»);
			«ENDIF»
		«ENDIF»
	'''

	def addGlobalVar(String globalVar) {
		if (!globalVars.contains(globalVar))
			globalVars.add(globalVar)
		return '';
	}

	def compileButton(ButtonDefinition definition) '''
		«addImport("import javafx.scene.control.Button;")»
		«addGlobalVar("Button " + definition.name + ";")»
			«definition.name»= new Button();
		«««			«definition.name».setText("«definition.text»");
«««			«IF definition.interaction != null»
«««				«addImport("import javafx.event.ActionEvent;")»
«««				«addImport("import javafx.event.EventHandler;")»
«««				«definition.name».setOnAction(new EventHandler<ActionEvent>() {
«««					@Override
«««					public void handle(ActionEvent actionEvent) {
«««						invoke«(definition as ButtonDefinition).interaction.name»();
«««					}
«««				});
«««				«definition.interaction.addInteractionMethod»
«««			«ENDIF»
			return «definition.name»;
	'''

//	def String addInteractionMethod(Interaction interaction) {
//		interactions.add(interaction)
//		return ""
//	}
}
