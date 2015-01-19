/*
 * generated by Xtext
 */
package org.deg.xtext.gui.generator

import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import org.deg.xtext.gui.guiDSL.ButtonDefinition
import org.deg.xtext.gui.guiDSL.Definition
import org.deg.xtext.gui.guiDSL.LabelDefinition
import org.deg.xtext.gui.guiDSL.Refinement
import org.deg.xtext.gui.guiDSL.TreeDefinition
import org.deg.xtext.gui.guiDSL.UIDescription
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class GuiDSLGenerator implements IGenerator {
	
	String descriptionname
	String guiFilename
	String ipFilename
	List<String> imports = new ArrayList<String>()
	Boolean compiled = false
//	List<Interaction> interactions = new ArrayList<Interaction>()
	Map<String, String> uiElemetsToType = new HashMap()
	List<String> globalVars = new ArrayList<String>()

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		descriptionname = resource.URI.segment(3).split('\\.').get(0)
		guiFilename = "Gui"+descriptionname
		ipFilename = "Ip"+descriptionname
		for (def : resource.allContents.toIterable.filter(Definition)) {
			var element = def.concreteDefition.name
//			var type = def.concreteDefition.type
//			uiElemetsToType.put(element, type)
		}

		for (d : resource.allContents.toIterable.filter(UIDescription)) {
			if (d.typeDefinition.type.equals("WINDOW")) {
				var source = d.compileWindow
				fsa.generateFile(guiFilename + ".java", genImports + source)
			} else {
				var source = d.compileComplex
				fsa.generateFile(guiFilename + ".java", genImports + source)
			}
			//Müssen geleert werden, da sie ansonsten beim nächsten Übersetzen wieder benutzt werden.
			imports.clear
			globalVars.clear
//			interactions.clear
		}

	}

	def String genImports() {
		var sb = new StringBuilder()
		for (import : imports) {
			sb.append(import).append("\n");
		}
		return sb.toString
	}

	def compileComplex(UIDescription description) '''
		«addImport("import DE.data_experts.jwammc.core.pf.PfPanel;")»
		«addImport("import java.awt.BorderLayout;")»
		/**
		* Generated by Xtext.
		*/
		
		public class «guiFilename» extends PfPanel{
			
			public «guiFilename»(){
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
		* Generated interactions.
		*/
		«genInteractions»
		/**
		* Generated global variables.
		*/
		«genGlobalVars»
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
				}
	'''
	
	def compileRefinement(Refinement refinement){
		
	}
	
	

	def String addImport(String newImport) {
		if (!imports.contains(newImport)) {
			imports.add(newImport)
		}
		return ""
	}

	def String switchCompiled() {
		compiled = !compiled
		return ""
	}

	def compileWindow(UIDescription description) '''
		«addImport("import javafx.scene.Node;")»
		«addImport("import javafx.scene.Scene;")»
		«addImport("import javafx.scene.layout.VBox;")»
		
		/**
		* Generated by Xtext.
		*/
		
		public class «descriptionname» extends Scene{
			
				public «descriptionname»(){
«««				«description.inputTypes.genConstrutorParameter»
				super(null);
				VBox b = new VBox();
				setRoot(b);
				initBox(b);
			}
			
		«description.genOtherStuff»
		}
	'''
	
//	def String genConstrutorParameter(EList<inputType> inputTypes){
//		val parameterBuilder = new StringBuilder()
//		for(inputType input : inputTypes){
//			addGlobalVar(input.type+' '+input.name+';');
//			parameterBuilder.append(input.type + ' ' + input.name)
//			if(input!=inputTypes.last){
//				parameterBuilder.append(', ')
//			}
//		}
//		return parameterBuilder.toString;
//	}
	
	
	def genOtherStuff(UIDescription description)'''
		«description.init»
		/**
		* Generated interactions.
		*/
		«genInteractions»
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
	
	def compileTree(TreeDefinition definition)'''
		«addImport("import DE.data_experts.jwammc.core.pf.PfTree;")»
		«addImport("import DE.data_experts.jwammc.core.pf.TreeCellRenderer;")»
		«addImport("import DE.data_experts.jwammc.core.pf.PfTree;")»
			«addImport("import javax.swing.tree.DefaultTreeModel;")»
		«addGlobalVar("PfTree " + definition.id + ";")»
		«definition.id» = new PfTree();
		«definition.id».setIfName("«definition.id»");
		«IF definition.inputType == null»
			«addImport("import DE.data_experts.util.ObjectNode;")»
			«definition.id».setTreeModel( new DefaultTreeModel( new ObjectNode() ) );
		«ELSE»
			«definition.id».setTreeModel( new DefaultTreeModel( new «definition.inputType.substring(1,definition.inputType.length-1)»() ) );
		«ENDIF»
			«definition.id».setCellRenderer( new TreeCellRenderer() );
		
		
«««		Layout kommt in eine separate Datei
		 this.add( «definition.id», BorderLayout.CENTER );
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
			«genProperty(definition.id, 'setText',definition.properties.text, true)»
		«ENDIF»
		
«««		TODO
«««		Label wird in der Layoutdatei genommen werden
		this.add(«definition.id», BorderLayout.NORTH);
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
		if(!globalVars.contains(globalVar))
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
