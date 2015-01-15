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
					put(grammarAccess.getComponentRefinementAccess().getAlternatives(), "rule__ComponentRefinement__Alternatives");
					put(grammarAccess.getDescriptionTypeAccess().getAlternatives(), "rule__DescriptionType__Alternatives");
					put(grammarAccess.getTypeAccess().getIdAlternatives_0(), "rule__Type__IdAlternatives_0");
					put(grammarAccess.getComponentDefinitionAccess().getAlternatives(), "rule__ComponentDefinition__Alternatives");
					put(grammarAccess.getInteractiontypeAccess().getIdAlternatives_0(), "rule__Interactiontype__IdAlternatives_0");
					put(grammarAccess.getUIDescriptionAccess().getGroup(), "rule__UIDescription__Group__0");
					put(grammarAccess.getLayoutAccess().getGroup(), "rule__Layout__Group__0");
					put(grammarAccess.getStructureAccess().getGroup(), "rule__Structure__Group__0");
					put(grammarAccess.getRefinementAccess().getGroup(), "rule__Refinement__Group__0");
					put(grammarAccess.getButtonRefinementAccess().getGroup(), "rule__ButtonRefinement__Group__0");
					put(grammarAccess.getButtonRefinementAccess().getGroup_3(), "rule__ButtonRefinement__Group_3__0");
					put(grammarAccess.getLabelRefinementAccess().getGroup(), "rule__LabelRefinement__Group__0");
					put(grammarAccess.getLabelRefinementAccess().getGroup_3(), "rule__LabelRefinement__Group_3__0");
					put(grammarAccess.getPropertyAccess().getGroup(), "rule__Property__Group__0");
					put(grammarAccess.getUsedDescriptionsAccess().getGroup(), "rule__UsedDescriptions__Group__0");
					put(grammarAccess.getUsedDescriptionsAccess().getGroup_2(), "rule__UsedDescriptions__Group_2__0");
					put(grammarAccess.getDefinitionAccess().getGroup(), "rule__Definition__Group__0");
					put(grammarAccess.getTypeDefinitionAccess().getGroup(), "rule__TypeDefinition__Group__0");
					put(grammarAccess.getTabViewDefinitionAccess().getGroup(), "rule__TabViewDefinition__Group__0");
					put(grammarAccess.getTabViewDefinitionAccess().getGroup_4(), "rule__TabViewDefinition__Group_4__0");
					put(grammarAccess.getMultiselectionAccess().getGroup(), "rule__Multiselection__Group__0");
					put(grammarAccess.getTextfieldDefinitionAccess().getGroup(), "rule__TextfieldDefinition__Group__0");
					put(grammarAccess.getTextfieldDefinitionAccess().getGroup_3(), "rule__TextfieldDefinition__Group_3__0");
					put(grammarAccess.getTextfieldPropertiesAccess().getGroup(), "rule__TextfieldProperties__Group__0");
					put(grammarAccess.getTextfieldPropertiesAccess().getGroup_1(), "rule__TextfieldProperties__Group_1__0");
					put(grammarAccess.getTextfieldPropertiesAccess().getGroup_2(), "rule__TextfieldProperties__Group_2__0");
					put(grammarAccess.getTextareaDefinitionAccess().getGroup(), "rule__TextareaDefinition__Group__0");
					put(grammarAccess.getTextareaDefinitionAccess().getGroup_3(), "rule__TextareaDefinition__Group_3__0");
					put(grammarAccess.getTextareaPropertiesAccess().getGroup(), "rule__TextareaProperties__Group__0");
					put(grammarAccess.getTextareaPropertiesAccess().getGroup_1(), "rule__TextareaProperties__Group_1__0");
					put(grammarAccess.getTextareaPropertiesAccess().getGroup_2(), "rule__TextareaProperties__Group_2__0");
					put(grammarAccess.getTreeDefinitionAccess().getGroup(), "rule__TreeDefinition__Group__0");
					put(grammarAccess.getTreeDefinitionAccess().getGroup_4(), "rule__TreeDefinition__Group_4__0");
					put(grammarAccess.getTableDefinitionAccess().getGroup(), "rule__TableDefinition__Group__0");
					put(grammarAccess.getTableDefinitionAccess().getGroup_4(), "rule__TableDefinition__Group_4__0");
					put(grammarAccess.getInterchangeableDefinitionAccess().getGroup(), "rule__InterchangeableDefinition__Group__0");
					put(grammarAccess.getInterchangeableDefinitionAccess().getGroup_3(), "rule__InterchangeableDefinition__Group_3__0");
					put(grammarAccess.getButtonDefinitionAccess().getGroup(), "rule__ButtonDefinition__Group__0");
					put(grammarAccess.getButtonPropertiesAccess().getGroup(), "rule__ButtonProperties__Group__0");
					put(grammarAccess.getButtonPropertiesAccess().getGroup_1(), "rule__ButtonProperties__Group_1__0");
					put(grammarAccess.getCommonPropertiesAccess().getGroup(), "rule__CommonProperties__Group__0");
					put(grammarAccess.getCommonPropertiesAccess().getGroup_1(), "rule__CommonProperties__Group_1__0");
					put(grammarAccess.getCommonPropertiesAccess().getGroup_2(), "rule__CommonProperties__Group_2__0");
					put(grammarAccess.getCommonPropertiesAccess().getGroup_3(), "rule__CommonProperties__Group_3__0");
					put(grammarAccess.getLabelDefinitionAccess().getGroup(), "rule__LabelDefinition__Group__0");
					put(grammarAccess.getLabelDefinitionAccess().getGroup_3(), "rule__LabelDefinition__Group_3__0");
					put(grammarAccess.getLabelPropertiesAccess().getGroup(), "rule__LabelProperties__Group__0");
					put(grammarAccess.getLabelPropertiesAccess().getGroup_1(), "rule__LabelProperties__Group_1__0");
					put(grammarAccess.getUIDescriptionAccess().getTypeDefinitionAssignment_0(), "rule__UIDescription__TypeDefinitionAssignment_0");
					put(grammarAccess.getUIDescriptionAccess().getPropertyAssignment_1(), "rule__UIDescription__PropertyAssignment_1");
					put(grammarAccess.getUIDescriptionAccess().getLayoutAssignment_2(), "rule__UIDescription__LayoutAssignment_2");
					put(grammarAccess.getUIDescriptionAccess().getUsedDescriptionsAssignment_3(), "rule__UIDescription__UsedDescriptionsAssignment_3");
					put(grammarAccess.getUIDescriptionAccess().getRefinementsAssignment_4(), "rule__UIDescription__RefinementsAssignment_4");
					put(grammarAccess.getUIDescriptionAccess().getDefinitionsAssignment_5(), "rule__UIDescription__DefinitionsAssignment_5");
					put(grammarAccess.getUIDescriptionAccess().getStructureAssignment_6(), "rule__UIDescription__StructureAssignment_6");
					put(grammarAccess.getLayoutAccess().getLayoutFilesAssignment_1(), "rule__Layout__LayoutFilesAssignment_1");
					put(grammarAccess.getStructureAccess().getNameAssignment_0(), "rule__Structure__NameAssignment_0");
					put(grammarAccess.getStructureAccess().getOrderedElementsAssignment_2(), "rule__Structure__OrderedElementsAssignment_2");
					put(grammarAccess.getElementAccess().getIdAssignment(), "rule__Element__IdAssignment");
					put(grammarAccess.getRefinementAccess().getConcreteRefinementAssignment_0(), "rule__Refinement__ConcreteRefinementAssignment_0");
					put(grammarAccess.getButtonRefinementAccess().getNameAssignment_0(), "rule__ButtonRefinement__NameAssignment_0");
					put(grammarAccess.getButtonRefinementAccess().getIdAssignment_2(), "rule__ButtonRefinement__IdAssignment_2");
					put(grammarAccess.getButtonRefinementAccess().getPropertiesAssignment_3_1(), "rule__ButtonRefinement__PropertiesAssignment_3_1");
					put(grammarAccess.getLabelRefinementAccess().getNameAssignment_0(), "rule__LabelRefinement__NameAssignment_0");
					put(grammarAccess.getLabelRefinementAccess().getIdAssignment_2(), "rule__LabelRefinement__IdAssignment_2");
					put(grammarAccess.getLabelRefinementAccess().getPropertiesAssignment_3_1(), "rule__LabelRefinement__PropertiesAssignment_3_1");
					put(grammarAccess.getPropertyAccess().getPropertiesFilesAssignment_1(), "rule__Property__PropertiesFilesAssignment_1");
					put(grammarAccess.getUsedDescriptionsAccess().getDescriptionAssignment_1(), "rule__UsedDescriptions__DescriptionAssignment_1");
					put(grammarAccess.getUsedDescriptionsAccess().getIdAssignment_2_1(), "rule__UsedDescriptions__IdAssignment_2_1");
					put(grammarAccess.getDefinitionAccess().getConcreteDefitionAssignment_0(), "rule__Definition__ConcreteDefitionAssignment_0");
					put(grammarAccess.getTypeDefinitionAccess().getTypeAssignment_1(), "rule__TypeDefinition__TypeAssignment_1");
					put(grammarAccess.getTypeAccess().getIdAssignment(), "rule__Type__IdAssignment");
					put(grammarAccess.getUIDescriptionImportAccess().getDescriptionNameAssignment(), "rule__UIDescriptionImport__DescriptionNameAssignment");
					put(grammarAccess.getTabViewDefinitionAccess().getNameAssignment_0(), "rule__TabViewDefinition__NameAssignment_0");
					put(grammarAccess.getTabViewDefinitionAccess().getTabsAssignment_1(), "rule__TabViewDefinition__TabsAssignment_1");
					put(grammarAccess.getTabViewDefinitionAccess().getIdAssignment_3(), "rule__TabViewDefinition__IdAssignment_3");
					put(grammarAccess.getTabViewDefinitionAccess().getPropertiesAssignment_4_1(), "rule__TabViewDefinition__PropertiesAssignment_4_1");
					put(grammarAccess.getTabDefinitionAccess().getNameAssignment(), "rule__TabDefinition__NameAssignment");
					put(grammarAccess.getMultiselectionAccess().getNameAssignment_0(), "rule__Multiselection__NameAssignment_0");
					put(grammarAccess.getMultiselectionAccess().getInputTypeAssignment_1(), "rule__Multiselection__InputTypeAssignment_1");
					put(grammarAccess.getTextfieldDefinitionAccess().getNameAssignment_0(), "rule__TextfieldDefinition__NameAssignment_0");
					put(grammarAccess.getTextfieldDefinitionAccess().getIdAssignment_2(), "rule__TextfieldDefinition__IdAssignment_2");
					put(grammarAccess.getTextfieldDefinitionAccess().getPropertiesAssignment_3_1(), "rule__TextfieldDefinition__PropertiesAssignment_3_1");
					put(grammarAccess.getTextfieldPropertiesAccess().getCommonPropertiesAssignment_0(), "rule__TextfieldProperties__CommonPropertiesAssignment_0");
					put(grammarAccess.getTextfieldPropertiesAccess().getTextAssignment_1_1(), "rule__TextfieldProperties__TextAssignment_1_1");
					put(grammarAccess.getTextfieldPropertiesAccess().getEditableAssignment_2_1(), "rule__TextfieldProperties__EditableAssignment_2_1");
					put(grammarAccess.getTextareaDefinitionAccess().getNameAssignment_0(), "rule__TextareaDefinition__NameAssignment_0");
					put(grammarAccess.getTextareaDefinitionAccess().getIdAssignment_2(), "rule__TextareaDefinition__IdAssignment_2");
					put(grammarAccess.getTextareaDefinitionAccess().getPropertiesAssignment_3_1(), "rule__TextareaDefinition__PropertiesAssignment_3_1");
					put(grammarAccess.getTextareaPropertiesAccess().getCommonPropertiesAssignment_0(), "rule__TextareaProperties__CommonPropertiesAssignment_0");
					put(grammarAccess.getTextareaPropertiesAccess().getTextAssignment_1_1(), "rule__TextareaProperties__TextAssignment_1_1");
					put(grammarAccess.getTextareaPropertiesAccess().getEditableAssignment_2_1(), "rule__TextareaProperties__EditableAssignment_2_1");
					put(grammarAccess.getTreeDefinitionAccess().getNameAssignment_0(), "rule__TreeDefinition__NameAssignment_0");
					put(grammarAccess.getTreeDefinitionAccess().getInputTypeAssignment_1(), "rule__TreeDefinition__InputTypeAssignment_1");
					put(grammarAccess.getTreeDefinitionAccess().getIdAssignment_3(), "rule__TreeDefinition__IdAssignment_3");
					put(grammarAccess.getTreeDefinitionAccess().getPropertiesAssignment_4_1(), "rule__TreeDefinition__PropertiesAssignment_4_1");
					put(grammarAccess.getTableDefinitionAccess().getNameAssignment_0(), "rule__TableDefinition__NameAssignment_0");
					put(grammarAccess.getTableDefinitionAccess().getInputTypeAssignment_1(), "rule__TableDefinition__InputTypeAssignment_1");
					put(grammarAccess.getTableDefinitionAccess().getIdAssignment_3(), "rule__TableDefinition__IdAssignment_3");
					put(grammarAccess.getTableDefinitionAccess().getPropertiesAssignment_4_1(), "rule__TableDefinition__PropertiesAssignment_4_1");
					put(grammarAccess.getInterchangeableDefinitionAccess().getNameAssignment_0(), "rule__InterchangeableDefinition__NameAssignment_0");
					put(grammarAccess.getInterchangeableDefinitionAccess().getIdAssignment_2(), "rule__InterchangeableDefinition__IdAssignment_2");
					put(grammarAccess.getInterchangeableDefinitionAccess().getPropertiesAssignment_3_1(), "rule__InterchangeableDefinition__PropertiesAssignment_3_1");
					put(grammarAccess.getButtonDefinitionAccess().getNameAssignment_0(), "rule__ButtonDefinition__NameAssignment_0");
					put(grammarAccess.getButtonDefinitionAccess().getIdAssignment_2(), "rule__ButtonDefinition__IdAssignment_2");
					put(grammarAccess.getButtonDefinitionAccess().getPropertiesAssignment_3(), "rule__ButtonDefinition__PropertiesAssignment_3");
					put(grammarAccess.getButtonPropertiesAccess().getCommonPropertiesAssignment_0(), "rule__ButtonProperties__CommonPropertiesAssignment_0");
					put(grammarAccess.getButtonPropertiesAccess().getTextAssignment_1_1(), "rule__ButtonProperties__TextAssignment_1_1");
					put(grammarAccess.getCommonPropertiesAccess().getNameAssignment_1_0(), "rule__CommonProperties__NameAssignment_1_0");
					put(grammarAccess.getCommonPropertiesAccess().getPropertyKeyAssignment_1_2(), "rule__CommonProperties__PropertyKeyAssignment_1_2");
					put(grammarAccess.getCommonPropertiesAccess().getNameAssignment_2_0(), "rule__CommonProperties__NameAssignment_2_0");
					put(grammarAccess.getCommonPropertiesAccess().getLayoutKeyAssignment_2_2(), "rule__CommonProperties__LayoutKeyAssignment_2_2");
					put(grammarAccess.getCommonPropertiesAccess().getNameAssignment_3_0(), "rule__CommonProperties__NameAssignment_3_0");
					put(grammarAccess.getCommonPropertiesAccess().getInteractiontypeAssignment_3_2(), "rule__CommonProperties__InteractiontypeAssignment_3_2");
					put(grammarAccess.getLabelDefinitionAccess().getNameAssignment_0(), "rule__LabelDefinition__NameAssignment_0");
					put(grammarAccess.getLabelDefinitionAccess().getIdAssignment_2(), "rule__LabelDefinition__IdAssignment_2");
					put(grammarAccess.getLabelDefinitionAccess().getPropertiesAssignment_3_1(), "rule__LabelDefinition__PropertiesAssignment_3_1");
					put(grammarAccess.getLabelPropertiesAccess().getCommonPropertiesAssignment_0(), "rule__LabelProperties__CommonPropertiesAssignment_0");
					put(grammarAccess.getLabelPropertiesAccess().getTextAssignment_1_1(), "rule__LabelProperties__TextAssignment_1_1");
					put(grammarAccess.getLabelPropertiesAccess().getNameAssignment_1_2(), "rule__LabelProperties__NameAssignment_1_2");
					put(grammarAccess.getInteractiontypeAccess().getIdAssignment(), "rule__Interactiontype__IdAssignment");
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
