package org.deg.xtext.gui.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.deg.xtext.gui.guiDSL.AreaAssignment;
import org.deg.xtext.gui.guiDSL.AreaCount;
import org.deg.xtext.gui.guiDSL.ButtonDefinition;
import org.deg.xtext.gui.guiDSL.CheckboxDefinition;
import org.deg.xtext.gui.guiDSL.CommonProperty;
import org.deg.xtext.gui.guiDSL.Definition;
import org.deg.xtext.gui.guiDSL.GuiDSLPackage;
import org.deg.xtext.gui.guiDSL.Interaction;
import org.deg.xtext.gui.guiDSL.LabelDefinition;
import org.deg.xtext.gui.guiDSL.MultiSelectionDefinition;
import org.deg.xtext.gui.guiDSL.RadioboxDefinition;
import org.deg.xtext.gui.guiDSL.TableDefinition;
import org.deg.xtext.gui.guiDSL.TextfieldDefinition;
import org.deg.xtext.gui.guiDSL.TreeDefinition;
import org.deg.xtext.gui.guiDSL.TypeDefinition;
import org.deg.xtext.gui.guiDSL.UIAction;
import org.deg.xtext.gui.guiDSL.UIDescription;
import org.deg.xtext.gui.guiDSL.UIDescriptionImport;
import org.deg.xtext.gui.guiDSL.UsedDescriptions;
import org.deg.xtext.gui.guiDSL.inputType;
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
			case GuiDSLPackage.AREA_ASSIGNMENT:
				if(context == grammarAccess.getAreaAssignmentRule()) {
					sequence_AreaAssignment(context, (AreaAssignment) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.AREA_COUNT:
				if(context == grammarAccess.getAreaCountRule()) {
					sequence_AreaCount(context, (AreaCount) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.BUTTON_DEFINITION:
				if(context == grammarAccess.getButtonDefinitionRule() ||
				   context == grammarAccess.getComponentDefinitionRule()) {
					sequence_ButtonDefinition(context, (ButtonDefinition) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.CHECKBOX_DEFINITION:
				if(context == grammarAccess.getCheckboxDefinitionRule() ||
				   context == grammarAccess.getComponentDefinitionRule()) {
					sequence_CheckboxDefinition(context, (CheckboxDefinition) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.COMMON_PROPERTY:
				if(context == grammarAccess.getCommonPropertyRule() ||
				   context == grammarAccess.getPropertyRule()) {
					sequence_CommonProperty(context, (CommonProperty) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.DEFINITION:
				if(context == grammarAccess.getDefinitionRule()) {
					sequence_Definition(context, (Definition) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.INTERACTION:
				if(context == grammarAccess.getInteractionRule()) {
					sequence_Interaction(context, (Interaction) semanticObject); 
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
			case GuiDSLPackage.MULTI_SELECTION_DEFINITION:
				if(context == grammarAccess.getComponentDefinitionRule() ||
				   context == grammarAccess.getMultiSelectionDefinitionRule()) {
					sequence_MultiSelectionDefinition(context, (MultiSelectionDefinition) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.RADIOBOX_DEFINITION:
				if(context == grammarAccess.getComponentDefinitionRule() ||
				   context == grammarAccess.getRadioboxDefinitionRule()) {
					sequence_RadioboxDefinition(context, (RadioboxDefinition) semanticObject); 
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
			case GuiDSLPackage.TEXTFIELD_DEFINITION:
				if(context == grammarAccess.getComponentDefinitionRule() ||
				   context == grammarAccess.getTextfieldDefinitionRule()) {
					sequence_TextfieldDefinition(context, (TextfieldDefinition) semanticObject); 
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
			case GuiDSLPackage.TYPE_DEFINITION:
				if(context == grammarAccess.getTypeDefinitionRule()) {
					sequence_TypeDefinition(context, (TypeDefinition) semanticObject); 
					return; 
				}
				else break;
			case GuiDSLPackage.UI_ACTION:
				if(context == grammarAccess.getUIActionRule()) {
					sequence_UIAction(context, (UIAction) semanticObject); 
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
				if(context == grammarAccess.getUIDescriptionImportRule()) {
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
			case GuiDSLPackage.INPUT_TYPE:
				if(context == grammarAccess.getInputTypeRule()) {
					sequence_inputType(context, (inputType) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     ((area=INT element=STRING) | (element=STRING area=INT))
	 */
	protected void sequence_AreaAssignment(EObject context, AreaAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     areaCount=INT
	 */
	protected void sequence_AreaCount(EObject context, AreaCount semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GuiDSLPackage.Literals.AREA_COUNT__AREA_COUNT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDSLPackage.Literals.AREA_COUNT__AREA_COUNT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAreaCountAccess().getAreaCountINTTerminalRuleCall_1_0(), semanticObject.getAreaCount());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type='Button' name=STRING text=STRING? interaction=Interaction?)
	 */
	protected void sequence_ButtonDefinition(EObject context, ButtonDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type='Checkbox' name=STRING text=STRING?)
	 */
	protected void sequence_CheckboxDefinition(EObject context, CheckboxDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=CommonPropertyType value=STRING)
	 */
	protected void sequence_CommonProperty(EObject context, CommonProperty semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GuiDSLPackage.Literals.COMMON_PROPERTY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDSLPackage.Literals.COMMON_PROPERTY__NAME));
			if(transientValues.isValueTransient(semanticObject, GuiDSLPackage.Literals.COMMON_PROPERTY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDSLPackage.Literals.COMMON_PROPERTY__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCommonPropertyAccess().getNameCommonPropertyTypeParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCommonPropertyAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
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
		feeder.accept(grammarAccess.getDefinitionAccess().getConcreteDefitionComponentDefinitionParserRuleCall_1_0(), semanticObject.getConcreteDefition());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING actions+=UIAction*)
	 */
	protected void sequence_Interaction(EObject context, Interaction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type='Label' name=STRING text=STRING?)
	 */
	protected void sequence_LabelDefinition(EObject context, LabelDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type='MultiSelection' name=STRING (inputType=STRING (selectableValuesLocation=STRING selectedValuesLocation=STRING?)?)?)
	 */
	protected void sequence_MultiSelectionDefinition(EObject context, MultiSelectionDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type='Radiobox' name=STRING text=STRING?)
	 */
	protected void sequence_RadioboxDefinition(EObject context, RadioboxDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type='Table' name=STRING text=STRING?)
	 */
	protected void sequence_TableDefinition(EObject context, TableDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type='Textfield' name=STRING text=STRING?)
	 */
	protected void sequence_TextfieldDefinition(EObject context, TextfieldDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type='Tree' name=STRING text=STRING?)
	 */
	protected void sequence_TreeDefinition(EObject context, TreeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=TYPE
	 */
	protected void sequence_TypeDefinition(EObject context, TypeDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GuiDSLPackage.Literals.TYPE_DEFINITION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDSLPackage.Literals.TYPE_DEFINITION__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeDefinitionAccess().getTypeTYPETerminalRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type='UiAction' uiElementName=STRING properties+=Property*)
	 */
	protected void sequence_UIAction(EObject context, UIAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (descriptionName=STRING localName=STRING?)
	 */
	protected void sequence_UIDescriptionImport(EObject context, UIDescriptionImport semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         areaCount=AreaCount 
	 *         typeDefinition=TypeDefinition 
	 *         usedDescriptions+=UsedDescriptions* 
	 *         inputTypes+=inputType* 
	 *         definitions+=Definition* 
	 *         areas+=AreaAssignment*
	 *     )
	 */
	protected void sequence_UIDescription(EObject context, UIDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     description=UIDescriptionImport
	 */
	protected void sequence_UsedDescriptions(EObject context, UsedDescriptions semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GuiDSLPackage.Literals.USED_DESCRIPTIONS__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDSLPackage.Literals.USED_DESCRIPTIONS__DESCRIPTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUsedDescriptionsAccess().getDescriptionUIDescriptionImportParserRuleCall_1_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=STRING name=STRING)
	 */
	protected void sequence_inputType(EObject context, inputType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GuiDSLPackage.Literals.INPUT_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDSLPackage.Literals.INPUT_TYPE__TYPE));
			if(transientValues.isValueTransient(semanticObject, GuiDSLPackage.Literals.INPUT_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDSLPackage.Literals.INPUT_TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInputTypeAccess().getTypeSTRINGTerminalRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getInputTypeAccess().getNameSTRINGTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
}
