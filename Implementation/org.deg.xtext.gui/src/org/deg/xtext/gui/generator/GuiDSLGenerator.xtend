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
import java.util.Map
import java.util.HashMap

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
	Map<String, String> commands = new HashMap<String, String>();

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		descriptionname = resource.URI.getDescriptionName
		packageName = resource.URI.getPackageName
		genGuiClass(resource.allContents.toIterable.filter(UIDescription), fsa)
		genFpClass(fsa)
		genIpClass(resource.allContents.toIterable.filter(UIDescription), fsa)

	}
	
	def genIpClass(Iterable<UIDescription> uiDescriptions, IFileSystemAccess fsa) {
		specificFilename = "Ip" + descriptionname
		var d = uiDescriptions.get(0)
		var source = d.genIpSource
		fsa.generateFile(packageName + "/" + specificFilename + ".java", genPackage + genImports + source)
		imports.clear
		globalVars.clear
		commands.clear
	}
	
	def genIpSource(UIDescription description)'''
		«addImport("import DE.data_experts.jwam.tools.IpObject;")»
		«addImport("import de.jwamx.technology.iafpf.guimanagement.IAFContext;")»
		«addImport("import DE.data_experts.util.degexception.ExceptionManager;")»
		
		/**
		* Generated by Xtext.
		*/
		
		public class «specificFilename» extends IpObject{
			public «specificFilename»( IAFContext iafContext, final Fp«descriptionname» fp) {
    			super( iafContext, fp );
    			«addGlobalVar("Fp" + descriptionname + ' fp;')»
   				this.fp = fp;
   				try {
      				initCommands();
				    initIAFs( iafContext );
			    }
    			catch ( Exception ex ) {
      				ExceptionManager.getManager().addAndShow( ex );
    			}
   			}
   				«description.genIAF»
   				«description.genCommands»
   				«description.genCommandMethods»
   				«genGlobalVars»
		}
		
	'''
	
	def genCommandMethods(UIDescription description)'''
		«FOR commandId : commands.keySet»
		public void «commandId»(){
			
		}
		«ENDFOR»
	
	'''
	
	def genCommands(UIDescription description)'''
	 protected void initCommands() {
	 	«FOR id : commands.keySet»
	 		«var commandName = commands.get(id)»
	 		«addImport("import DE.data_experts.jwam.util.CmdAusfuehrer" + commandName + ";")»
	 		«id»Command = new CmdAusfuehrer«commandName»( getAusfuehrer() ) {
      @Override
      public void ausfuehren() {
        «id»();
      }
    };
	 	«ENDFOR»
	 }
	'''
	
	def genIAF(UIDescription description)'''
	 protected void initIAFs( IAFContext iafContext ) {
	 	«FOR definition : description.definitions»
	 		«definition.compileIAF»
	 	«ENDFOR»
	 }
	'''
	
	def compileIAF(Definition definition)'''
	«IF definition.concreteDefition.name == 'Label'»
		«(definition.concreteDefition as LabelDefinition).compileLabelStandardIAF»
	«ELSEIF definition.concreteDefition.name == 'Tree'»
		«(definition.concreteDefition as TreeDefinition).compileTreeStandardIAF»
	«ENDIF»
	«««		Spezielle Interaktionsformen
		«definition.compileSpecificInteractionTypes»
	'''
	
	def compileTreeStandardIAF(TreeDefinition definition)'''
		«definition.id.genIAFActivator»
		«definition.id.genIAFTree»
	'''
	
	def genIAFTree(String id) '''
		«genIAFSource("DE.data_experts.jwam.gui.interaction.IfTree","de.jwamx.technology.iafpf.command.cmdSelect",id)»
	'''
	
	def genIAFActivator(String id) '''
		«genIAFSource("de.jwamx.technology.iafpf.interaction.ifActivator", "de.jwamx.technology.iafpf.command.cmdActivate", id)»
	'''
	
	def compileLabelStandardIAF(LabelDefinition definition)'''
		«definition.id.genIAFTextDisplay»
	'''
	
	def genIAFTextDisplay(String id) '''
		«genIAFSource("de.jwamx.technology.iafpf.interaction.ifTextDisplay", "", id)»
	'''
	
	def  compileSpecificInteractionTypes(Definition definition)'''
	'''
	
	def genIAFSource(String iafSource, String commandSource, String id) '''
		«addImport("import "+ iafSource +  ";")»
		«var iafNameWithPrefix = iafSource.split("\\.").last»
		«var iafName = iafNameWithPrefix.substring(2)»
		«addGlobalVar(iafNameWithPrefix + " "+id+iafName+';')»
		«id+iafName» = («iafNameWithPrefix») iafContext.interactionForm( «iafNameWithPrefix».class, "«id»" );
		«IF !commandSource.equals("")»
		«addImport("import "+ commandSource +  ";")»
		«var commandNameWithPrefix = commandSource.getClassOfSource»
		«var commandName = commandNameWithPrefix.substring(3)» 
		«id + iafName».attach«commandName»Command( «id + commandName»Command );
		«addCommand(id, commandName)»
		«ENDIF»
	'''
	
	def getClassOfSource(String source) {
		return source.split("\\.").last
	}
	
	def addCommand(String id, String commandName) {
		addGlobalVar("cmd"+commandName + ' ' + id + commandName + "Command;")
		commands.put(id+commandName, commandName);
		return ""
	}
	
	
	def genFpClass(IFileSystemAccess fsa) {
		specificFilename = "Fp" + descriptionname
		
		val source = genFpSource
		fsa.generateFile(packageName + "/" + specificFilename + ".java", genPackage + genImports + source)
		
		imports.clear
		globalVars.clear
	}
	
	
	def genFpSource() '''
		«addImport("import DE.data_experts.jwam.tools.FpObject;")»
		«addImport("import de.jwam.handling.toolconstruction.request.RequestHandler;")»
		/**
		* Generated by Xtext.
		*/
		
		public class «specificFilename» extends FpObject{
			
			 public «specificFilename»( RequestHandler parent ) {
   		 		super( parent, "«descriptionname»" );
  			}
		}
	'''	
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
		var d = uiDescriptions.get(0)
			if (d.typeDefinition.type.id.equals("WINDOW")) {
				mainContainer = "contentPane"
				var source = d.compileWindow
				fsa.generateFile(packageName + "/" + specificFilename + ".java", genPackage + genImports + source)
			} else {
				mainContainer = "this"
				var source = d.compileComplex
				fsa.generateFile(packageName + "/" + specificFilename + ".java", genPackage + genImports + source)

		}
		
			imports.clear
			globalVars.clear
		
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

	def genInit(UIDescription description) '''
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
		
			«description.genInit»
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

	def compileDefinition(Definition definition) '''
	«IF definition.concreteDefition.name == 'Label'»
		«(definition.concreteDefition as LabelDefinition).compileLabel»
	«ELSEIF definition.concreteDefition.name == 'Tree'»
		«(definition.concreteDefition as TreeDefinition).compileTree»
		«ELSEIF definition.concreteDefition.name == 'Interchangeable'»
		«(definition.concreteDefition as InterchangeableDefinition).compileInterchangeable»
	«ENDIF»
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

	def compileLabel(LabelDefinition definition) '''
		«addImport("import DE.data_experts.jwammc.core.pf.PfLabel;")»
		«addGlobalVar("PfLabel " + definition.id + ";")»
		«definition.id» = new PfLabel();
		«definition.id».setIfName("«definition.id»");
		«IF definition.properties != null»
			«genProperty(definition.id, 'setText', definition.properties.text, true)»
		«ENDIF»
		
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

}
