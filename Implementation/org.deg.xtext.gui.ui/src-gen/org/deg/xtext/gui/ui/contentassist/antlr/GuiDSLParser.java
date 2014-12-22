/*
* generated by Xtext
*/
package org.deg.xtext.gui.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.deg.xtext.gui.services.GuiDSLGrammarAccess;

public class GuiDSLParser extends AbstractContentAssistParser {
	
	@Inject
	private GuiDSLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.deg.xtext.gui.ui.contentassist.antlr.internal.InternalGuiDSLParser createParser() {
		org.deg.xtext.gui.ui.contentassist.antlr.internal.InternalGuiDSLParser result = new org.deg.xtext.gui.ui.contentassist.antlr.internal.InternalGuiDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAreaAssignmentAccess().getAlternatives(), "rule__AreaAssignment__Alternatives");
					put(grammarAccess.getComponentDefinitionAccess().getAlternatives(), "rule__ComponentDefinition__Alternatives");
					put(grammarAccess.getUIDescriptionAccess().getGroup_0(), "rule__UIDescription__Group_0__0");
					put(grammarAccess.getUIDescriptionAccess().getGroup_2(), "rule__UIDescription__Group_2__0");
					put(grammarAccess.getInputTypeAccess().getGroup(), "rule__InputType__Group__0");
					put(grammarAccess.getUsedDescriptionsAccess().getGroup(), "rule__UsedDescriptions__Group__0");
					put(grammarAccess.getAreaCountAccess().getGroup(), "rule__AreaCount__Group__0");
					put(grammarAccess.getDefinitionAccess().getGroup(), "rule__Definition__Group__0");
					put(grammarAccess.getTypeDefinitionAccess().getGroup(), "rule__TypeDefinition__Group__0");
					put(grammarAccess.getUIDescriptionImportAccess().getGroup(), "rule__UIDescriptionImport__Group__0");
					put(grammarAccess.getUIDescriptionImportAccess().getGroup_1(), "rule__UIDescriptionImport__Group_1__0");
					put(grammarAccess.getAreaAssignmentAccess().getGroup_0(), "rule__AreaAssignment__Group_0__0");
					put(grammarAccess.getAreaAssignmentAccess().getGroup_1(), "rule__AreaAssignment__Group_1__0");
					put(grammarAccess.getMultiSelectionDefinitionAccess().getGroup(), "rule__MultiSelectionDefinition__Group__0");
					put(grammarAccess.getMultiSelectionDefinitionAccess().getGroup_3(), "rule__MultiSelectionDefinition__Group_3__0");
					put(grammarAccess.getMultiSelectionDefinitionAccess().getGroup_3_2(), "rule__MultiSelectionDefinition__Group_3_2__0");
					put(grammarAccess.getMultiSelectionDefinitionAccess().getGroup_3_2_2(), "rule__MultiSelectionDefinition__Group_3_2_2__0");
					put(grammarAccess.getCheckboxDefinitionAccess().getGroup(), "rule__CheckboxDefinition__Group__0");
					put(grammarAccess.getCheckboxDefinitionAccess().getGroup_4(), "rule__CheckboxDefinition__Group_4__0");
					put(grammarAccess.getRadioboxDefinitionAccess().getGroup(), "rule__RadioboxDefinition__Group__0");
					put(grammarAccess.getRadioboxDefinitionAccess().getGroup_4(), "rule__RadioboxDefinition__Group_4__0");
					put(grammarAccess.getTableDefinitionAccess().getGroup(), "rule__TableDefinition__Group__0");
					put(grammarAccess.getTableDefinitionAccess().getGroup_4(), "rule__TableDefinition__Group_4__0");
					put(grammarAccess.getTreeDefinitionAccess().getGroup(), "rule__TreeDefinition__Group__0");
					put(grammarAccess.getTreeDefinitionAccess().getGroup_4(), "rule__TreeDefinition__Group_4__0");
					put(grammarAccess.getTextfieldDefinitionAccess().getGroup(), "rule__TextfieldDefinition__Group__0");
					put(grammarAccess.getTextfieldDefinitionAccess().getGroup_4(), "rule__TextfieldDefinition__Group_4__0");
					put(grammarAccess.getButtonDefinitionAccess().getGroup(), "rule__ButtonDefinition__Group__0");
					put(grammarAccess.getButtonDefinitionAccess().getGroup_4(), "rule__ButtonDefinition__Group_4__0");
					put(grammarAccess.getButtonDefinitionAccess().getGroup_5(), "rule__ButtonDefinition__Group_5__0");
					put(grammarAccess.getInteractionAccess().getGroup(), "rule__Interaction__Group__0");
					put(grammarAccess.getLabelDefinitionAccess().getGroup(), "rule__LabelDefinition__Group__0");
					put(grammarAccess.getLabelDefinitionAccess().getGroup_4(), "rule__LabelDefinition__Group_4__0");
					put(grammarAccess.getUIActionAccess().getGroup(), "rule__UIAction__Group__0");
					put(grammarAccess.getCommonPropertyAccess().getGroup(), "rule__CommonProperty__Group__0");
					put(grammarAccess.getUIDescriptionAccess().getAreaCountAssignment_0_0(), "rule__UIDescription__AreaCountAssignment_0_0");
					put(grammarAccess.getUIDescriptionAccess().getTypeDefinitionAssignment_0_1(), "rule__UIDescription__TypeDefinitionAssignment_0_1");
					put(grammarAccess.getUIDescriptionAccess().getUsedDescriptionsAssignment_0_2(), "rule__UIDescription__UsedDescriptionsAssignment_0_2");
					put(grammarAccess.getUIDescriptionAccess().getInputTypesAssignment_1(), "rule__UIDescription__InputTypesAssignment_1");
					put(grammarAccess.getUIDescriptionAccess().getDefinitionsAssignment_2_0(), "rule__UIDescription__DefinitionsAssignment_2_0");
					put(grammarAccess.getUIDescriptionAccess().getAreasAssignment_2_1(), "rule__UIDescription__AreasAssignment_2_1");
					put(grammarAccess.getInputTypeAccess().getTypeAssignment_1(), "rule__InputType__TypeAssignment_1");
					put(grammarAccess.getInputTypeAccess().getNameAssignment_3(), "rule__InputType__NameAssignment_3");
					put(grammarAccess.getUsedDescriptionsAccess().getDescriptionAssignment_1(), "rule__UsedDescriptions__DescriptionAssignment_1");
					put(grammarAccess.getAreaCountAccess().getAreaCountAssignment_1(), "rule__AreaCount__AreaCountAssignment_1");
					put(grammarAccess.getDefinitionAccess().getConcreteDefitionAssignment_1(), "rule__Definition__ConcreteDefitionAssignment_1");
					put(grammarAccess.getTypeDefinitionAccess().getTypeAssignment_1(), "rule__TypeDefinition__TypeAssignment_1");
					put(grammarAccess.getUIDescriptionImportAccess().getDescriptionNameAssignment_0(), "rule__UIDescriptionImport__DescriptionNameAssignment_0");
					put(grammarAccess.getUIDescriptionImportAccess().getLocalNameAssignment_1_1(), "rule__UIDescriptionImport__LocalNameAssignment_1_1");
					put(grammarAccess.getAreaAssignmentAccess().getAreaAssignment_0_1(), "rule__AreaAssignment__AreaAssignment_0_1");
					put(grammarAccess.getAreaAssignmentAccess().getElementAssignment_0_3(), "rule__AreaAssignment__ElementAssignment_0_3");
					put(grammarAccess.getAreaAssignmentAccess().getElementAssignment_1_0(), "rule__AreaAssignment__ElementAssignment_1_0");
					put(grammarAccess.getAreaAssignmentAccess().getAreaAssignment_1_3(), "rule__AreaAssignment__AreaAssignment_1_3");
					put(grammarAccess.getMultiSelectionDefinitionAccess().getTypeAssignment_0(), "rule__MultiSelectionDefinition__TypeAssignment_0");
					put(grammarAccess.getMultiSelectionDefinitionAccess().getNameAssignment_2(), "rule__MultiSelectionDefinition__NameAssignment_2");
					put(grammarAccess.getMultiSelectionDefinitionAccess().getInputTypeAssignment_3_1(), "rule__MultiSelectionDefinition__InputTypeAssignment_3_1");
					put(grammarAccess.getMultiSelectionDefinitionAccess().getSelectableValuesLocationAssignment_3_2_1(), "rule__MultiSelectionDefinition__SelectableValuesLocationAssignment_3_2_1");
					put(grammarAccess.getMultiSelectionDefinitionAccess().getSelectedValuesLocationAssignment_3_2_2_1(), "rule__MultiSelectionDefinition__SelectedValuesLocationAssignment_3_2_2_1");
					put(grammarAccess.getCheckboxDefinitionAccess().getTypeAssignment_0(), "rule__CheckboxDefinition__TypeAssignment_0");
					put(grammarAccess.getCheckboxDefinitionAccess().getNameAssignment_2(), "rule__CheckboxDefinition__NameAssignment_2");
					put(grammarAccess.getCheckboxDefinitionAccess().getTextAssignment_4_1(), "rule__CheckboxDefinition__TextAssignment_4_1");
					put(grammarAccess.getRadioboxDefinitionAccess().getTypeAssignment_0(), "rule__RadioboxDefinition__TypeAssignment_0");
					put(grammarAccess.getRadioboxDefinitionAccess().getNameAssignment_2(), "rule__RadioboxDefinition__NameAssignment_2");
					put(grammarAccess.getRadioboxDefinitionAccess().getTextAssignment_4_1(), "rule__RadioboxDefinition__TextAssignment_4_1");
					put(grammarAccess.getTableDefinitionAccess().getTypeAssignment_0(), "rule__TableDefinition__TypeAssignment_0");
					put(grammarAccess.getTableDefinitionAccess().getNameAssignment_2(), "rule__TableDefinition__NameAssignment_2");
					put(grammarAccess.getTableDefinitionAccess().getTextAssignment_4_1(), "rule__TableDefinition__TextAssignment_4_1");
					put(grammarAccess.getTreeDefinitionAccess().getTypeAssignment_0(), "rule__TreeDefinition__TypeAssignment_0");
					put(grammarAccess.getTreeDefinitionAccess().getNameAssignment_2(), "rule__TreeDefinition__NameAssignment_2");
					put(grammarAccess.getTreeDefinitionAccess().getTextAssignment_4_1(), "rule__TreeDefinition__TextAssignment_4_1");
					put(grammarAccess.getTextfieldDefinitionAccess().getTypeAssignment_0(), "rule__TextfieldDefinition__TypeAssignment_0");
					put(grammarAccess.getTextfieldDefinitionAccess().getNameAssignment_2(), "rule__TextfieldDefinition__NameAssignment_2");
					put(grammarAccess.getTextfieldDefinitionAccess().getTextAssignment_4_1(), "rule__TextfieldDefinition__TextAssignment_4_1");
					put(grammarAccess.getButtonDefinitionAccess().getTypeAssignment_0(), "rule__ButtonDefinition__TypeAssignment_0");
					put(grammarAccess.getButtonDefinitionAccess().getNameAssignment_2(), "rule__ButtonDefinition__NameAssignment_2");
					put(grammarAccess.getButtonDefinitionAccess().getTextAssignment_4_1(), "rule__ButtonDefinition__TextAssignment_4_1");
					put(grammarAccess.getButtonDefinitionAccess().getInteractionAssignment_5_1(), "rule__ButtonDefinition__InteractionAssignment_5_1");
					put(grammarAccess.getInteractionAccess().getNameAssignment_0(), "rule__Interaction__NameAssignment_0");
					put(grammarAccess.getInteractionAccess().getActionsAssignment_4(), "rule__Interaction__ActionsAssignment_4");
					put(grammarAccess.getLabelDefinitionAccess().getTypeAssignment_0(), "rule__LabelDefinition__TypeAssignment_0");
					put(grammarAccess.getLabelDefinitionAccess().getNameAssignment_2(), "rule__LabelDefinition__NameAssignment_2");
					put(grammarAccess.getLabelDefinitionAccess().getTextAssignment_4_1(), "rule__LabelDefinition__TextAssignment_4_1");
					put(grammarAccess.getUIActionAccess().getTypeAssignment_1(), "rule__UIAction__TypeAssignment_1");
					put(grammarAccess.getUIActionAccess().getUiElementNameAssignment_3(), "rule__UIAction__UiElementNameAssignment_3");
					put(grammarAccess.getUIActionAccess().getPropertiesAssignment_5(), "rule__UIAction__PropertiesAssignment_5");
					put(grammarAccess.getCommonPropertyAccess().getNameAssignment_0(), "rule__CommonProperty__NameAssignment_0");
					put(grammarAccess.getCommonPropertyAccess().getValueAssignment_2(), "rule__CommonProperty__ValueAssignment_2");
					put(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), "rule__UIDescription__UnorderedGroup");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.deg.xtext.gui.ui.contentassist.antlr.internal.InternalGuiDSLParser typedParser = (org.deg.xtext.gui.ui.contentassist.antlr.internal.InternalGuiDSLParser) parser;
			typedParser.entryRuleUIDescription();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public GuiDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(GuiDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
