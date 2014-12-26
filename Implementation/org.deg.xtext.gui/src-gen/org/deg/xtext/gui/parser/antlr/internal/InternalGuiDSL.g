/*
* generated by Xtext
*/
grammar InternalGuiDSL;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.deg.xtext.gui.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.deg.xtext.gui.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.deg.xtext.gui.services.GuiDSLGrammarAccess;

}

@parser::members {

 	private GuiDSLGrammarAccess grammarAccess;
 	
    public InternalGuiDSLParser(TokenStream input, GuiDSLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "UIDescription";	
   	}
   	
   	@Override
   	protected GuiDSLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleUIDescription
entryRuleUIDescription returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getUIDescriptionRule()); }
	 iv_ruleUIDescription=ruleUIDescription 
	 { $current=$iv_ruleUIDescription.current; } 
	 EOF 
;

// Rule UIDescription
ruleUIDescription returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getUIDescriptionAccess().getUnorderedGroup());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 0);
	 				}
					({true}?=>((
(
		{ 
	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getAreaCountAreaCountParserRuleCall_0_0_0()); 
	    }
		lv_areaCount_1_0=ruleAreaCount		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getUIDescriptionRule());
	        }
       		set(
       			$current, 
       			"areaCount",
        		lv_areaCount_1_0, 
        		"AreaCount");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getTypeDefinitionTypeDefinitionParserRuleCall_0_1_0()); 
	    }
		lv_typeDefinition_2_0=ruleTypeDefinition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getUIDescriptionRule());
	        }
       		set(
       			$current, 
       			"typeDefinition",
        		lv_typeDefinition_2_0, 
        		"TypeDefinition");
	        afterParserOrEnumRuleCall();
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUIDescriptionAccess().getUnorderedGroup());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 1);
	 				}
					({true}?=>((
(
		{ 
	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getPropertyPropertyParserRuleCall_1_0_0()); 
	    }
		lv_property_3_0=ruleProperty		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getUIDescriptionRule());
	        }
       		set(
       			$current, 
       			"property",
        		lv_property_3_0, 
        		"Property");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getUsedDescriptionsUsedDescriptionsParserRuleCall_1_1_0()); 
	    }
		lv_usedDescriptions_4_0=ruleUsedDescriptions		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getUIDescriptionRule());
	        }
       		add(
       			$current, 
       			"usedDescriptions",
        		lv_usedDescriptions_4_0, 
        		"UsedDescriptions");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getDefinitionsDefinitionParserRuleCall_1_2_0()); 
	    }
		lv_definitions_5_0=ruleDefinition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getUIDescriptionRule());
	        }
       		add(
       			$current, 
       			"definitions",
        		lv_definitions_5_0, 
        		"Definition");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getAreasAreaAssignmentParserRuleCall_1_3_0()); 
	    }
		lv_areas_6_0=ruleAreaAssignment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getUIDescriptionRule());
	        }
       		add(
       			$current, 
       			"areas",
        		lv_areas_6_0, 
        		"AreaAssignment");
	        afterParserOrEnumRuleCall();
	    }

)
)*))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUIDescriptionAccess().getUnorderedGroup());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getUIDescriptionAccess().getUnorderedGroup())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getUIDescriptionAccess().getUnorderedGroup());
	}

)
;





// Entry rule entryRuleProperty
entryRuleProperty returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPropertyRule()); }
	 iv_ruleProperty=ruleProperty 
	 { $current=$iv_ruleProperty.current; } 
	 EOF 
;

// Rule Property
ruleProperty returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='get properties from:' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getGetPropertiesFromKeyword_0());
    }
(
(
		lv_propertiesFile_1_0=RULE_STRING
		{
			newLeafNode(lv_propertiesFile_1_0, grammarAccess.getPropertyAccess().getPropertiesFileSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPropertyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"propertiesFile",
        		lv_propertiesFile_1_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRuleUsedDescriptions
entryRuleUsedDescriptions returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getUsedDescriptionsRule()); }
	 iv_ruleUsedDescriptions=ruleUsedDescriptions 
	 { $current=$iv_ruleUsedDescriptions.current; } 
	 EOF 
;

// Rule UsedDescriptions
ruleUsedDescriptions returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='use: ' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getUsedDescriptionsAccess().getUseKeyword_0());
    }
(
(
(
		{ 
	        newCompositeNode(grammarAccess.getUsedDescriptionsAccess().getDescriptionUIDescriptionImportParserRuleCall_1_0_0()); 
	    }
		lv_description_1_1=ruleUIDescriptionImport		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getUsedDescriptionsRule());
	        }
       		set(
       			$current, 
       			"description",
        		lv_description_1_1, 
        		"UIDescriptionImport");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getUsedDescriptionsAccess().getDescriptionComplexComponentParserRuleCall_1_0_1()); 
	    }
		lv_description_1_2=rulecomplexComponent		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getUsedDescriptionsRule());
	        }
       		set(
       			$current, 
       			"description",
        		lv_description_1_2, 
        		"complexComponent");
	        afterParserOrEnumRuleCall();
	    }

)

)
)(	otherlv_2=' as: ' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getUsedDescriptionsAccess().getAsKeyword_2_0());
    }
(
(
		lv_localName_3_0=RULE_STRING
		{
			newLeafNode(lv_localName_3_0, grammarAccess.getUsedDescriptionsAccess().getLocalNameSTRINGTerminalRuleCall_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getUsedDescriptionsRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"localName",
        		lv_localName_3_0, 
        		"STRING");
	    }

)
))?)
;





// Entry rule entryRuleAreaCount
entryRuleAreaCount returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAreaCountRule()); }
	 iv_ruleAreaCount=ruleAreaCount 
	 { $current=$iv_ruleAreaCount.current; } 
	 EOF 
;

// Rule AreaCount
ruleAreaCount returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Area count: ' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAreaCountAccess().getAreaCountKeyword_0());
    }
(
(
		lv_areaCount_1_0=RULE_INT
		{
			newLeafNode(lv_areaCount_1_0, grammarAccess.getAreaCountAccess().getAreaCountINTTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAreaCountRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"areaCount",
        		lv_areaCount_1_0, 
        		"INT");
	    }

)
))
;





// Entry rule entryRuleDefinition
entryRuleDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDefinitionRule()); }
	 iv_ruleDefinition=ruleDefinition 
	 { $current=$iv_ruleDefinition.current; } 
	 EOF 
;

// Rule Definition
ruleDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='DEF ' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getDEFKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDefinitionAccess().getConcreteDefitionComponentDefinitionParserRuleCall_1_0()); 
	    }
		lv_concreteDefition_1_0=ruleComponentDefinition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDefinitionRule());
	        }
       		set(
       			$current, 
       			"concreteDefition",
        		lv_concreteDefition_1_0, 
        		"ComponentDefinition");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='END DEF' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getDefinitionAccess().getENDDEFKeyword_2());
    }
)
;





// Entry rule entryRuleTypeDefinition
entryRuleTypeDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeDefinitionRule()); }
	 iv_ruleTypeDefinition=ruleTypeDefinition 
	 { $current=$iv_ruleTypeDefinition.current; } 
	 EOF 
;

// Rule TypeDefinition
ruleTypeDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='type: ' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTypeDefinitionAccess().getTypeKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getTypeTypeParserRuleCall_1_0()); 
	    }
		lv_type_1_0=ruleType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTypeDefinitionRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_1_0, 
        		"Type");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleType
entryRuleType returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeRule()); } 
	 iv_ruleType=ruleType 
	 { $current=$iv_ruleType.current.getText(); }  
	 EOF 
;

// Rule Type
ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='WINDOW' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTypeAccess().getWINDOWKeyword_0()); 
    }

    |
	kw='INNERCOMPLEX' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTypeAccess().getINNERCOMPLEXKeyword_1()); 
    }
)
    ;





// Entry rule entryRuleUIDescriptionImport
entryRuleUIDescriptionImport returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getUIDescriptionImportRule()); }
	 iv_ruleUIDescriptionImport=ruleUIDescriptionImport 
	 { $current=$iv_ruleUIDescriptionImport.current; } 
	 EOF 
;

// Rule UIDescriptionImport
ruleUIDescriptionImport returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_descriptionName_0_0=RULE_STRING
		{
			newLeafNode(lv_descriptionName_0_0, grammarAccess.getUIDescriptionImportAccess().getDescriptionNameSTRINGTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getUIDescriptionImportRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"descriptionName",
        		lv_descriptionName_0_0, 
        		"STRING");
	    }

)
)
;





// Entry rule entryRulecomplexComponent
entryRulecomplexComponent returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getComplexComponentRule()); }
	 iv_rulecomplexComponent=rulecomplexComponent 
	 { $current=$iv_rulecomplexComponent.current; } 
	 EOF 
;

// Rule complexComponent
rulecomplexComponent returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getComplexComponentAccess().getMultiselectionParserRuleCall()); 
    }
    this_Multiselection_0=ruleMultiselection
    { 
        $current = $this_Multiselection_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleMultiselection
entryRuleMultiselection returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMultiselectionRule()); }
	 iv_ruleMultiselection=ruleMultiselection 
	 { $current=$iv_ruleMultiselection.current; } 
	 EOF 
;

// Rule Multiselection
ruleMultiselection returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_descriptionName_0_0=	'Multiselection' 
    {
        newLeafNode(lv_descriptionName_0_0, grammarAccess.getMultiselectionAccess().getDescriptionNameMultiselectionKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMultiselectionRule());
	        }
       		setWithLastConsumed($current, "descriptionName", lv_descriptionName_0_0, "Multiselection");
	    }

)
)(	otherlv_1='<' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMultiselectionAccess().getLessThanSignKeyword_1_0());
    }
(
(
		lv_inputType_2_0=RULE_STRING
		{
			newLeafNode(lv_inputType_2_0, grammarAccess.getMultiselectionAccess().getInputTypeSTRINGTerminalRuleCall_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMultiselectionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"inputType",
        		lv_inputType_2_0, 
        		"STRING");
	    }

)
)	otherlv_3='>' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMultiselectionAccess().getGreaterThanSignKeyword_1_2());
    }
)?)
;





// Entry rule entryRuleAreaAssignment
entryRuleAreaAssignment returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAreaAssignmentRule()); }
	 iv_ruleAreaAssignment=ruleAreaAssignment 
	 { $current=$iv_ruleAreaAssignment.current; } 
	 EOF 
;

// Rule AreaAssignment
ruleAreaAssignment returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='Area:' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAreaAssignmentAccess().getAreaKeyword_0_0());
    }
(
(
		lv_area_1_0=RULE_INT
		{
			newLeafNode(lv_area_1_0, grammarAccess.getAreaAssignmentAccess().getAreaINTTerminalRuleCall_0_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAreaAssignmentRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"area",
        		lv_area_1_0, 
        		"INT");
	    }

)
)	otherlv_2='<-' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAreaAssignmentAccess().getLessThanSignHyphenMinusKeyword_0_2());
    }
(
(
		lv_elements_3_0=RULE_STRING
		{
			newLeafNode(lv_elements_3_0, grammarAccess.getAreaAssignmentAccess().getElementsSTRINGTerminalRuleCall_0_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAreaAssignmentRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"elements",
        		lv_elements_3_0, 
        		"STRING");
	    }

)
)+)
    |((
(
		lv_elements_4_0=RULE_STRING
		{
			newLeafNode(lv_elements_4_0, grammarAccess.getAreaAssignmentAccess().getElementsSTRINGTerminalRuleCall_1_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAreaAssignmentRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"elements",
        		lv_elements_4_0, 
        		"STRING");
	    }

)
)+	otherlv_5='->' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getAreaAssignmentAccess().getHyphenMinusGreaterThanSignKeyword_1_1());
    }
	otherlv_6='Area:' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getAreaAssignmentAccess().getAreaKeyword_1_2());
    }
(
(
		lv_area_7_0=RULE_INT
		{
			newLeafNode(lv_area_7_0, grammarAccess.getAreaAssignmentAccess().getAreaINTTerminalRuleCall_1_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAreaAssignmentRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"area",
        		lv_area_7_0, 
        		"INT");
	    }

)
)))
;





// Entry rule entryRuleComponentDefinition
entryRuleComponentDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getComponentDefinitionRule()); }
	 iv_ruleComponentDefinition=ruleComponentDefinition 
	 { $current=$iv_ruleComponentDefinition.current; } 
	 EOF 
;

// Rule ComponentDefinition
ruleComponentDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getComponentDefinitionAccess().getLabelDefinitionParserRuleCall_0()); 
    }
    this_LabelDefinition_0=ruleLabelDefinition
    { 
        $current = $this_LabelDefinition_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getComponentDefinitionAccess().getButtonDefinitionParserRuleCall_1()); 
    }
    this_ButtonDefinition_1=ruleButtonDefinition
    { 
        $current = $this_ButtonDefinition_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getComponentDefinitionAccess().getTextfieldDefinitionParserRuleCall_2()); 
    }
    this_TextfieldDefinition_2=ruleTextfieldDefinition
    { 
        $current = $this_TextfieldDefinition_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getComponentDefinitionAccess().getTreeDefinitionParserRuleCall_3()); 
    }
    this_TreeDefinition_3=ruleTreeDefinition
    { 
        $current = $this_TreeDefinition_3.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getComponentDefinitionAccess().getTableDefinitionParserRuleCall_4()); 
    }
    this_TableDefinition_4=ruleTableDefinition
    { 
        $current = $this_TableDefinition_4.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getComponentDefinitionAccess().getRadioboxDefinitionParserRuleCall_5()); 
    }
    this_RadioboxDefinition_5=ruleRadioboxDefinition
    { 
        $current = $this_RadioboxDefinition_5.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getComponentDefinitionAccess().getCheckboxDefinitionParserRuleCall_6()); 
    }
    this_CheckboxDefinition_6=ruleCheckboxDefinition
    { 
        $current = $this_CheckboxDefinition_6.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleCheckboxDefinition
entryRuleCheckboxDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCheckboxDefinitionRule()); }
	 iv_ruleCheckboxDefinition=ruleCheckboxDefinition 
	 { $current=$iv_ruleCheckboxDefinition.current; } 
	 EOF 
;

// Rule CheckboxDefinition
ruleCheckboxDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_type_0_0=	'Checkbox' 
    {
        newLeafNode(lv_type_0_0, grammarAccess.getCheckboxDefinitionAccess().getTypeCheckboxKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCheckboxDefinitionRule());
	        }
       		setWithLastConsumed($current, "type", lv_type_0_0, "Checkbox");
	    }

)
)	otherlv_1=' as ' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getCheckboxDefinitionAccess().getAsKeyword_1());
    }
(
(
		lv_name_2_0=RULE_STRING
		{
			newLeafNode(lv_name_2_0, grammarAccess.getCheckboxDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCheckboxDefinitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"STRING");
	    }

)
)	otherlv_3=':' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getCheckboxDefinitionAccess().getColonKeyword_3());
    }
(	otherlv_4='text=' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getCheckboxDefinitionAccess().getTextKeyword_4_0());
    }
(
(
		lv_text_5_0=RULE_STRING
		{
			newLeafNode(lv_text_5_0, grammarAccess.getCheckboxDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCheckboxDefinitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"text",
        		lv_text_5_0, 
        		"STRING");
	    }

)
))?)
;





// Entry rule entryRuleRadioboxDefinition
entryRuleRadioboxDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRadioboxDefinitionRule()); }
	 iv_ruleRadioboxDefinition=ruleRadioboxDefinition 
	 { $current=$iv_ruleRadioboxDefinition.current; } 
	 EOF 
;

// Rule RadioboxDefinition
ruleRadioboxDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_type_0_0=	'Radiobox' 
    {
        newLeafNode(lv_type_0_0, grammarAccess.getRadioboxDefinitionAccess().getTypeRadioboxKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRadioboxDefinitionRule());
	        }
       		setWithLastConsumed($current, "type", lv_type_0_0, "Radiobox");
	    }

)
)	otherlv_1=' as ' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getRadioboxDefinitionAccess().getAsKeyword_1());
    }
(
(
		lv_name_2_0=RULE_STRING
		{
			newLeafNode(lv_name_2_0, grammarAccess.getRadioboxDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRadioboxDefinitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"STRING");
	    }

)
)	otherlv_3=':' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getRadioboxDefinitionAccess().getColonKeyword_3());
    }
(	otherlv_4='text=' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getRadioboxDefinitionAccess().getTextKeyword_4_0());
    }
(
(
		lv_text_5_0=RULE_STRING
		{
			newLeafNode(lv_text_5_0, grammarAccess.getRadioboxDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRadioboxDefinitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"text",
        		lv_text_5_0, 
        		"STRING");
	    }

)
))?)
;





// Entry rule entryRuleTableDefinition
entryRuleTableDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTableDefinitionRule()); }
	 iv_ruleTableDefinition=ruleTableDefinition 
	 { $current=$iv_ruleTableDefinition.current; } 
	 EOF 
;

// Rule TableDefinition
ruleTableDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_type_0_0=	'Table' 
    {
        newLeafNode(lv_type_0_0, grammarAccess.getTableDefinitionAccess().getTypeTableKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTableDefinitionRule());
	        }
       		setWithLastConsumed($current, "type", lv_type_0_0, "Table");
	    }

)
)	otherlv_1=' as ' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getTableDefinitionAccess().getAsKeyword_1());
    }
(
(
		lv_name_2_0=RULE_STRING
		{
			newLeafNode(lv_name_2_0, grammarAccess.getTableDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTableDefinitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"STRING");
	    }

)
)	otherlv_3=':' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getTableDefinitionAccess().getColonKeyword_3());
    }
(	otherlv_4='text=' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getTableDefinitionAccess().getTextKeyword_4_0());
    }
(
(
		lv_text_5_0=RULE_STRING
		{
			newLeafNode(lv_text_5_0, grammarAccess.getTableDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTableDefinitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"text",
        		lv_text_5_0, 
        		"STRING");
	    }

)
))?)
;





// Entry rule entryRuleTreeDefinition
entryRuleTreeDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTreeDefinitionRule()); }
	 iv_ruleTreeDefinition=ruleTreeDefinition 
	 { $current=$iv_ruleTreeDefinition.current; } 
	 EOF 
;

// Rule TreeDefinition
ruleTreeDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_type_0_0=	'Tree' 
    {
        newLeafNode(lv_type_0_0, grammarAccess.getTreeDefinitionAccess().getTypeTreeKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTreeDefinitionRule());
	        }
       		setWithLastConsumed($current, "type", lv_type_0_0, "Tree");
	    }

)
)	otherlv_1=' as ' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getTreeDefinitionAccess().getAsKeyword_1());
    }
(
(
		lv_name_2_0=RULE_STRING
		{
			newLeafNode(lv_name_2_0, grammarAccess.getTreeDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTreeDefinitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"STRING");
	    }

)
)	otherlv_3=':' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getTreeDefinitionAccess().getColonKeyword_3());
    }
(	otherlv_4='text=' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getTreeDefinitionAccess().getTextKeyword_4_0());
    }
(
(
		lv_text_5_0=RULE_STRING
		{
			newLeafNode(lv_text_5_0, grammarAccess.getTreeDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTreeDefinitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"text",
        		lv_text_5_0, 
        		"STRING");
	    }

)
))?)
;





// Entry rule entryRuleTextfieldDefinition
entryRuleTextfieldDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTextfieldDefinitionRule()); }
	 iv_ruleTextfieldDefinition=ruleTextfieldDefinition 
	 { $current=$iv_ruleTextfieldDefinition.current; } 
	 EOF 
;

// Rule TextfieldDefinition
ruleTextfieldDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_type_0_0=	'Textfield' 
    {
        newLeafNode(lv_type_0_0, grammarAccess.getTextfieldDefinitionAccess().getTypeTextfieldKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTextfieldDefinitionRule());
	        }
       		setWithLastConsumed($current, "type", lv_type_0_0, "Textfield");
	    }

)
)	otherlv_1=' as ' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getTextfieldDefinitionAccess().getAsKeyword_1());
    }
(
(
		lv_name_2_0=RULE_STRING
		{
			newLeafNode(lv_name_2_0, grammarAccess.getTextfieldDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTextfieldDefinitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"STRING");
	    }

)
)	otherlv_3=':' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getTextfieldDefinitionAccess().getColonKeyword_3());
    }
(	otherlv_4='text=' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getTextfieldDefinitionAccess().getTextKeyword_4_0());
    }
(
(
		lv_text_5_0=RULE_STRING
		{
			newLeafNode(lv_text_5_0, grammarAccess.getTextfieldDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTextfieldDefinitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"text",
        		lv_text_5_0, 
        		"STRING");
	    }

)
))?)
;





// Entry rule entryRuleButtonDefinition
entryRuleButtonDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getButtonDefinitionRule()); }
	 iv_ruleButtonDefinition=ruleButtonDefinition 
	 { $current=$iv_ruleButtonDefinition.current; } 
	 EOF 
;

// Rule ButtonDefinition
ruleButtonDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_type_0_0=	'Button' 
    {
        newLeafNode(lv_type_0_0, grammarAccess.getButtonDefinitionAccess().getTypeButtonKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getButtonDefinitionRule());
	        }
       		setWithLastConsumed($current, "type", lv_type_0_0, "Button");
	    }

)
)	otherlv_1=' as ' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getButtonDefinitionAccess().getAsKeyword_1());
    }
(
(
		lv_name_2_0=RULE_STRING
		{
			newLeafNode(lv_name_2_0, grammarAccess.getButtonDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getButtonDefinitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"STRING");
	    }

)
)	otherlv_3=':' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getButtonDefinitionAccess().getColonKeyword_3());
    }
(	otherlv_4='propertyKey=' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getButtonDefinitionAccess().getPropertyKeyKeyword_4_0());
    }
(
(
		lv_propertyKey_5_0=RULE_STRING
		{
			newLeafNode(lv_propertyKey_5_0, grammarAccess.getButtonDefinitionAccess().getPropertyKeySTRINGTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getButtonDefinitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"propertyKey",
        		lv_propertyKey_5_0, 
        		"STRING");
	    }

)
))?(	otherlv_6='text=' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getButtonDefinitionAccess().getTextKeyword_5_0());
    }
(
(
		lv_text_7_0=RULE_STRING
		{
			newLeafNode(lv_text_7_0, grammarAccess.getButtonDefinitionAccess().getTextSTRINGTerminalRuleCall_5_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getButtonDefinitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"text",
        		lv_text_7_0, 
        		"STRING");
	    }

)
))?(	otherlv_8='interactiontype=' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getButtonDefinitionAccess().getInteractiontypeKeyword_6_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getButtonDefinitionAccess().getInteractiontypeInteractiontypeParserRuleCall_6_1_0()); 
	    }
		lv_interactiontype_9_0=ruleInteractiontype		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getButtonDefinitionRule());
	        }
       		add(
       			$current, 
       			"interactiontype",
        		lv_interactiontype_9_0, 
        		"Interactiontype");
	        afterParserOrEnumRuleCall();
	    }

)
)+)?)
;







// Entry rule entryRuleLabelDefinition
entryRuleLabelDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLabelDefinitionRule()); }
	 iv_ruleLabelDefinition=ruleLabelDefinition 
	 { $current=$iv_ruleLabelDefinition.current; } 
	 EOF 
;

// Rule LabelDefinition
ruleLabelDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_type_0_0=	'Label' 
    {
        newLeafNode(lv_type_0_0, grammarAccess.getLabelDefinitionAccess().getTypeLabelKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getLabelDefinitionRule());
	        }
       		setWithLastConsumed($current, "type", lv_type_0_0, "Label");
	    }

)
)	otherlv_1=' as ' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getLabelDefinitionAccess().getAsKeyword_1());
    }
(
(
		lv_name_2_0=RULE_STRING
		{
			newLeafNode(lv_name_2_0, grammarAccess.getLabelDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getLabelDefinitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"STRING");
	    }

)
)	otherlv_3=':' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getLabelDefinitionAccess().getColonKeyword_3());
    }
(	otherlv_4='propertyKey=' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getLabelDefinitionAccess().getPropertyKeyKeyword_4_0());
    }
(
(
		lv_propertyKey_5_0=RULE_STRING
		{
			newLeafNode(lv_propertyKey_5_0, grammarAccess.getLabelDefinitionAccess().getPropertyKeySTRINGTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getLabelDefinitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"propertyKey",
        		lv_propertyKey_5_0, 
        		"STRING");
	    }

)
))?(	otherlv_6='text=' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getLabelDefinitionAccess().getTextKeyword_5_0());
    }
(
(
		lv_text_7_0=RULE_STRING
		{
			newLeafNode(lv_text_7_0, grammarAccess.getLabelDefinitionAccess().getTextSTRINGTerminalRuleCall_5_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getLabelDefinitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"text",
        		lv_text_7_0, 
        		"STRING");
	    }

)
))?)
;





// Entry rule entryRuleInteractiontype
entryRuleInteractiontype returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getInteractiontypeRule()); } 
	 iv_ruleInteractiontype=ruleInteractiontype 
	 { $current=$iv_ruleInteractiontype.current.getText(); }  
	 EOF 
;

// Rule Interactiontype
ruleInteractiontype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='Click' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getInteractiontypeAccess().getClickKeyword_0()); 
    }

    |
	kw='ChangeText' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getInteractiontypeAccess().getChangeTextKeyword_1()); 
    }
)
    ;





RULE_WS : (' '|'\t'|'\r'|'\n'|',')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_ANY_OTHER : .;


