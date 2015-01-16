package org.deg.xtext.gui.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.deg.xtext.gui.guiDSL.ButtonDefinition;
import org.deg.xtext.gui.guiDSL.ButtonProperties;
import org.deg.xtext.gui.guiDSL.ButtonRefinement;
import org.deg.xtext.gui.guiDSL.CommonProperties;
import org.deg.xtext.gui.guiDSL.Definition;
import org.deg.xtext.gui.guiDSL.Element;
import org.deg.xtext.gui.guiDSL.GuiDSLPackage;
import org.deg.xtext.gui.guiDSL.Interactiontype;
import org.deg.xtext.gui.guiDSL.InterchangeableDefinition;
import org.deg.xtext.gui.guiDSL.InterchangeableRefinement;
import org.deg.xtext.gui.guiDSL.LabelDefinition;
import org.deg.xtext.gui.guiDSL.LabelProperties;
import org.deg.xtext.gui.guiDSL.LabelRefinement;
import org.deg.xtext.gui.guiDSL.Layout;
import org.deg.xtext.gui.guiDSL.Multiselection;
import org.deg.xtext.gui.guiDSL.Property;
import org.deg.xtext.gui.guiDSL.Refinement;
import org.deg.xtext.gui.guiDSL.Structure;
import org.deg.xtext.gui.guiDSL.TabDefinition;
import org.deg.xtext.gui.guiDSL.TabViewDefinition;
import org.deg.xtext.gui.guiDSL.TabViewRefinement;
import org.deg.xtext.gui.guiDSL.TableDefinition;
import org.deg.xtext.gui.guiDSL.TableRefinement;
import org.deg.xtext.gui.guiDSL.TextareaDefinition;
import org.deg.xtext.gui.guiDSL.TextareaProperties;
import org.deg.xtext.gui.guiDSL.TextareaRefinement;
import org.deg.xtext.gui.guiDSL.TextfieldDefinition;
import org.deg.xtext.gui.guiDSL.TextfieldProperties;
import org.deg.xtext.gui.guiDSL.TextfieldRefinement;
import org.deg.xtext.gui.guiDSL.TreeDefinition;
import org.deg.xtext.gui.guiDSL.TreeRefinement;
import org.deg.xtext.gui.guiDSL.Type;
import org.deg.xtext.gui.guiDSL.TypeDefinition;
import org.deg.xtext.gui.guiDSL.UIDescription;
import org.deg.xtext.gui.guiDSL.UIDescriptionImport;
import org.deg.xtext.gui.guiDSL.UsedDescriptions;
import org.deg.xtext.gui.services.GuiDSLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class GuiDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GuiDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == GuiDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case GuiDSLPackage.BUTTON_DEFINITION:
				if(context == grammarAccess.getButtonDefinitionRule() ||
				   context == grammarAccess.getComponentDefinitionRule()) {
					sequence_ButtonDefinition(context, (ButtonDefinition) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.BUTTON_PROPERTIES:
				if(context == grammarAccess.getButtonPropertiesRule()) {
					sequence_ButtonProperties(context, (ButtonProperties) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.BUTTON_REFINEMENT:
				if(context == grammarAccess.getButtonRefinementRule() ||
				   context == grammarAccess.getComponentRefinementRule()) {
					sequence_ButtonRefinement(context, (ButtonRefinement) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.COMMON_PROPERTIES:
				if(context == grammarAccess.getCommonPropertiesRule()) {
					sequence_CommonProperties(context, (CommonProperties) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.DEFINITION:
				if(context == grammarAccess.getDefinitionRule()) {
					sequence_Definition(context, (Definition) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.ELEMENT:
				if(context == grammarAccess.getElementRule()) {
					sequence_Element(context, (Element) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.INTERACTIONTYPE:
				if(context == grammarAccess.getInteractiontypeRule()) {
					sequence_Interactiontype(context, (Interactiontype) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.INTERCHANGEABLE_DEFINITION:
				if(context == grammarAccess.getComponentDefinitionRule() ||
				   context == grammarAccess.getInterchangeableDefinitionRule()) {
					sequence_InterchangeableDefinition(context, (InterchangeableDefinition) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.INTERCHANGEABLE_REFINEMENT:
				if(context == grammarAccess.getComponentRefinementRule() ||
				   context == grammarAccess.getInterchangeableRefinementRule()) {
					sequence_InterchangeableRefinement(context, (InterchangeableRefinement) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.LABEL_DEFINITION:
				if(context == grammarAccess.getComponentDefinitionRule() ||
				   context == grammarAccess.getLabelDefinitionRule()) {
					sequence_LabelDefinition(context, (LabelDefinition) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.LABEL_PROPERTIES:
				if(context == grammarAccess.getLabelPropertiesRule()) {
					sequence_LabelProperties(context, (LabelProperties) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.LABEL_REFINEMENT:
				if(context == grammarAccess.getComponentRefinementRule() ||
				   context == grammarAccess.getLabelRefinementRule()) {
					sequence_LabelRefinement(context, (LabelRefinement) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.LAYOUT:
				if(context == grammarAccess.getLayoutRule()) {
					sequence_Layout(context, (Layout) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.MULTISELECTION:
				if(context == grammarAccess.getComplexComponentRule() ||
				   context == grammarAccess.getDescriptionTypeRule() ||
				   context == grammarAccess.getMultiselectionRule()) {
					sequence_Multiselection(context, (Multiselection) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.PROPERTY:
				if(context == grammarAccess.getPropertyRule()) {
					sequence_Property(context, (Property) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.REFINEMENT:
				if(context == grammarAccess.getRefinementRule()) {
					sequence_Refinement(context, (Refinement) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.STRUCTURE:
				if(context == grammarAccess.getStructureRule()) {
					sequence_Structure(context, (Structure) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.TAB_DEFINITION:
				if(context == grammarAccess.getTabDefinitionRule()) {
					sequence_TabDefinition(context, (TabDefinition) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.TAB_VIEW_DEFINITION:
				if(context == grammarAccess.getComponentDefinitionRule() ||
				   context == grammarAccess.getTabViewDefinitionRule()) {
					sequence_TabViewDefinition(context, (TabViewDefinition) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.TAB_VIEW_REFINEMENT:
				if(context == grammarAccess.getComponentRefinementRule() ||
				   context == grammarAccess.getTabViewRefinementRule()) {
					sequence_TabViewRefinement(context, (TabViewRefinement) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.TABLE_DEFINITION:
				if(context == grammarAccess.getComponentDefinitionRule() ||
				   context == grammarAccess.getTableDefinitionRule()) {
					sequence_TableDefinition(context, (TableDefinition) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.TABLE_REFINEMENT:
				if(context == grammarAccess.getComponentRefinementRule() ||
				   context == grammarAccess.getTableRefinementRule()) {
					sequence_TableRefinement(context, (TableRefinement) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.TEXTAREA_DEFINITION:
				if(context == grammarAccess.getComponentDefinitionRule() ||
				   context == grammarAccess.getTextareaDefinitionRule()) {
					sequence_TextareaDefinition(context, (TextareaDefinition) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.TEXTAREA_PROPERTIES:
				if(context == grammarAccess.getTextareaPropertiesRule()) {
					sequence_TextareaProperties(context, (TextareaProperties) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.TEXTAREA_REFINEMENT:
				if(context == grammarAccess.getComponentRefinementRule() ||
				   context == grammarAccess.getTextareaRefinementRule()) {
					sequence_TextareaRefinement(context, (TextareaRefinement) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.TEXTFIELD_DEFINITION:
				if(context == grammarAccess.getComponentDefinitionRule() ||
				   context == grammarAccess.getTextfieldDefinitionRule()) {
					sequence_TextfieldDefinition(context, (TextfieldDefinition) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.TEXTFIELD_PROPERTIES:
				if(context == grammarAccess.getTextfieldPropertiesRule()) {
					sequence_TextfieldProperties(context, (TextfieldProperties) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.TEXTFIELD_REFINEMENT:
				if(context == grammarAccess.getComponentRefinementRule() ||
				   context == grammarAccess.getTextfieldRefinementRule()) {
					sequence_TextfieldRefinement(context, (TextfieldRefinement) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.TREE_DEFINITION:
				if(context == grammarAccess.getComponentDefinitionRule() ||
				   context == grammarAccess.getTreeDefinitionRule()) {
					sequence_TreeDefinition(context, (TreeDefinition) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.TREE_REFINEMENT:
				if(context == grammarAccess.getComponentRefinementRule() ||
				   context == grammarAccess.getTreeRefinementRule()) {
					sequence_TreeRefinement(context, (TreeRefinement) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.TYPE:
				if(context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (Type) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.TYPE_DEFINITION:
				if(context == grammarAccess.getTypeDefinitionRule()) {
					sequence_TypeDefinition(context, (TypeDefinition) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.UI_DESCRIPTION:
				if(context == grammarAccess.getUIDescriptionRule()) {
					sequence_UIDescription(context, (UIDescription) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.UI_DESCRIPTION_IMPORT:
				if(context == grammarAccess.getDescriptionTypeRule() ||
				   context == grammarAccess.getUIDescriptionImportRule()) {
					sequence_UIDescriptionImport(context, (UIDescriptionImport) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.USED_DESCRIPTIONS:
				if(context == grammarAccess.getUsedDescriptionsRule()) {
					sequence_UsedDescriptions(context, (UsedDescriptions) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name='Button' id=STRING properties=ButtonProperties?)
	 */
	protected void sequence_ButtonDefinition(EObject context, ButtonDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (commonProperties=CommonProperties text=STRING?)
	 */
	protected void sequence_ButtonProperties(EObject context, ButtonProperties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='Button' id=STRING properties=ButtonProperties?)
	 */
	protected void sequence_ButtonRefinement(EObject context, ButtonRefinement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (propertyKey=STRING? layoutKey=STRING? interactiontype+=Interactiontype*)
	 */
	protected void sequence_CommonProperties(EObject context, CommonProperties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     concreteDefition=ComponentDefinition
	 */
	protected void sequence_Definition(EObject context, Definition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GuiDSLPackage.Literals.DEFINITION__CONCRETE_DEFITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDSLPackage.Literals.DEFINITION__CONCRETE_DEFITION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDefinitionAccess().getConcreteDefitionComponentDefinitionParserRuleCall_0_0(), semanticObject.getConcreteDefition());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     id=STRING
	 */
	protected void sequence_Element(EObject context, Element semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GuiDSLPackage.Literals.ELEMENT__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDSLPackage.Literals.ELEMENT__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getElementAccess().getIdSTRINGTerminalRuleCall_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (id='IfActivator' | id='IfTextDisplay' | id='IfViewImage')
	 */
	protected void sequence_Interactiontype(EObject context, Interactiontype semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='Interchangeable Area' id=STRING properties=CommonProperties?)
	 */
	protected void sequence_InterchangeableDefinition(EObject context, InterchangeableDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='Interchangeable' id=STRING properties=CommonProperties?)
	 */
	protected void sequence_InterchangeableRefinement(EObject context, InterchangeableRefinement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='Label' id=STRING properties=LabelProperties?)
	 */
	protected void sequence_LabelDefinition(EObject context, LabelDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (commonProperties=CommonProperties text=STRING?)
	 */
	protected void sequence_LabelProperties(EObject context, LabelProperties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='Label' id=STRING properties=LabelProperties?)
	 */
	protected void sequence_LabelRefinement(EObject context, LabelRefinement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     layoutFiles+=STRING+
	 */
	protected void sequence_Layout(EObject context, Layout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='Multiselection' inputType=INPUT_DESCRIPTION?)
	 */
	protected void sequence_Multiselection(EObject context, Multiselection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     propertiesFiles+=STRING+
	 */
	protected void sequence_Property(EObject context, Property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     concreteRefinement=ComponentRefinement
	 */
	protected void sequence_Refinement(EObject context, Refinement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GuiDSLPackage.Literals.REFINEMENT__CONCRETE_REFINEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDSLPackage.Literals.REFINEMENT__CONCRETE_REFINEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRefinementAccess().getConcreteRefinementComponentRefinementParserRuleCall_0_0(), semanticObject.getConcreteRefinement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name='Structure' orderedElements+=Element*)
	 */
	protected void sequence_Structure(EObject context, Structure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=TABNAME
	 */
	protected void sequence_TabDefinition(EObject context, TabDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GuiDSLPackage.Literals.TAB_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDSLPackage.Literals.TAB_DEFINITION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTabDefinitionAccess().getNameTABNAMETerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name='TabView' tabs+=TabDefinition* id=STRING properties=CommonProperties?)
	 */
	protected void sequence_TabViewDefinition(EObject context, TabViewDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='TabView' tabs+=TabDefinition? id=STRING properties=CommonProperties?)
	 */
	protected void sequence_TabViewRefinement(EObject context, TabViewRefinement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='Table' inputType=INPUT_DESCRIPTION id=STRING properties=CommonProperties?)
	 */
	protected void sequence_TableDefinition(EObject context, TableDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='Table' inputType=INPUT_DESCRIPTION? id=STRING properties=CommonProperties?)
	 */
	protected void sequence_TableRefinement(EObject context, TableRefinement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='Textarea' id=STRING properties=TextareaProperties?)
	 */
	protected void sequence_TextareaDefinition(EObject context, TextareaDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (commonProperties=CommonProperties text=STRING? editable=BOOLEAN?)
	 */
	protected void sequence_TextareaProperties(EObject context, TextareaProperties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='Textarea' id=STRING properties=TextareaProperties?)
	 */
	protected void sequence_TextareaRefinement(EObject context, TextareaRefinement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='Textfield' id=STRING properties=TextfieldProperties?)
	 */
	protected void sequence_TextfieldDefinition(EObject context, TextfieldDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (commonProperties=CommonProperties text=STRING? editable=BOOLEAN?)
	 */
	protected void sequence_TextfieldProperties(EObject context, TextfieldProperties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='Textfield' id=STRING properties=TextfieldProperties?)
	 */
	protected void sequence_TextfieldRefinement(EObject context, TextfieldRefinement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='Tree' inputType=INPUT_DESCRIPTION id=STRING properties=CommonProperties?)
	 */
	protected void sequence_TreeDefinition(EObject context, TreeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='Tree' inputType=INPUT_DESCRIPTION? id=STRING properties=CommonProperties?)
	 */
	protected void sequence_TreeRefinement(EObject context, TreeRefinement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=Type
	 */
	protected void sequence_TypeDefinition(EObject context, TypeDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GuiDSLPackage.Literals.TYPE_DEFINITION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDSLPackage.Literals.TYPE_DEFINITION__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeDefinitionAccess().getTypeTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (id='WINDOW' | id='INNERCOMPLEX')
	 */
	protected void sequence_Type(EObject context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     descriptionName=STRING
	 */
	protected void sequence_UIDescriptionImport(EObject context, UIDescriptionImport semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GuiDSLPackage.Literals.UI_DESCRIPTION_IMPORT__DESCRIPTION_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDSLPackage.Literals.UI_DESCRIPTION_IMPORT__DESCRIPTION_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUIDescriptionImportAccess().getDescriptionNameSTRINGTerminalRuleCall_0(), semanticObject.getDescriptionName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         typeDefinition=TypeDefinition 
	 *         property=Property? 
	 *         layout=Layout? 
	 *         usedDescriptions+=UsedDescriptions* 
	 *         refinements+=Refinement* 
	 *         definitions+=Definition* 
	 *         structure=Structure
	 *     )
	 */
	protected void sequence_UIDescription(EObject context, UIDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (description=DescriptionType id=STRING?)
	 */
	protected void sequence_UsedDescriptions(EObject context, UsedDescriptions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
