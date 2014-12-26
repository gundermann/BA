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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGuiDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_WS", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'get properties from:'", "'use: '", "' as: '", "'Area count: '", "'DEF '", "'END DEF'", "'type: '", "'WINDOW'", "'INNERCOMPLEX'", "'Multiselection'", "'<'", "'>'", "'Area:'", "'<-'", "'->'", "'Checkbox'", "' as '", "':'", "'text='", "'Radiobox'", "'Table'", "'Tree'", "'Textfield'", "'Button'", "'propertyKey='", "'interactiontype='", "'Label'", "'Click'", "'ChangeText'"
    };
    public static final int RULE_ID=7;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=6;

    // delegates
    // delegators


        public InternalGuiDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGuiDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGuiDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g"; }



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



    // $ANTLR start "entryRuleUIDescription"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:67:1: entryRuleUIDescription returns [EObject current=null] : iv_ruleUIDescription= ruleUIDescription EOF ;
    public final EObject entryRuleUIDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIDescription = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:68:2: (iv_ruleUIDescription= ruleUIDescription EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:69:2: iv_ruleUIDescription= ruleUIDescription EOF
            {
             newCompositeNode(grammarAccess.getUIDescriptionRule()); 
            pushFollow(FOLLOW_ruleUIDescription_in_entryRuleUIDescription75);
            iv_ruleUIDescription=ruleUIDescription();

            state._fsp--;

             current =iv_ruleUIDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIDescription85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUIDescription"


    // $ANTLR start "ruleUIDescription"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:76:1: ruleUIDescription returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_property_3_0= ruleProperty ) ) ( (lv_usedDescriptions_4_0= ruleUsedDescriptions ) )* ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleUIDescription() throws RecognitionException {
        EObject current = null;

        EObject lv_areaCount_1_0 = null;

        EObject lv_typeDefinition_2_0 = null;

        EObject lv_property_3_0 = null;

        EObject lv_usedDescriptions_4_0 = null;

        EObject lv_definitions_5_0 = null;

        EObject lv_areas_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:79:28: ( ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_property_3_0= ruleProperty ) ) ( (lv_usedDescriptions_4_0= ruleUsedDescriptions ) )* ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* ) ) ) ) )+ {...}?) ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:80:1: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_property_3_0= ruleProperty ) ) ( (lv_usedDescriptions_4_0= ruleUsedDescriptions ) )* ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* ) ) ) ) )+ {...}?) ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:80:1: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_property_3_0= ruleProperty ) ) ( (lv_usedDescriptions_4_0= ruleUsedDescriptions ) )* ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* ) ) ) ) )+ {...}?) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:82:1: ( ( ( ({...}? => ( ({...}? => ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_property_3_0= ruleProperty ) ) ( (lv_usedDescriptions_4_0= ruleUsedDescriptions ) )* ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* ) ) ) ) )+ {...}?) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:82:1: ( ( ( ({...}? => ( ({...}? => ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_property_3_0= ruleProperty ) ) ( (lv_usedDescriptions_4_0= ruleUsedDescriptions ) )* ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* ) ) ) ) )+ {...}?) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:83:2: ( ( ({...}? => ( ({...}? => ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_property_3_0= ruleProperty ) ) ( (lv_usedDescriptions_4_0= ruleUsedDescriptions ) )* ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getUIDescriptionAccess().getUnorderedGroup());
            	
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:86:2: ( ( ({...}? => ( ({...}? => ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_property_3_0= ruleProperty ) ) ( (lv_usedDescriptions_4_0= ruleUsedDescriptions ) )* ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* ) ) ) ) )+ {...}?)
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:87:3: ( ({...}? => ( ({...}? => ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_property_3_0= ruleProperty ) ) ( (lv_usedDescriptions_4_0= ruleUsedDescriptions ) )* ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* ) ) ) ) )+ {...}?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:87:3: ( ({...}? => ( ({...}? => ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_property_3_0= ruleProperty ) ) ( (lv_usedDescriptions_4_0= ruleUsedDescriptions ) )* ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* ) ) ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( LA4_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 0) ) {
                    alt4=1;
                }
                else if ( LA4_0 ==11 && getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 1) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:89:4: ({...}? => ( ({...}? => ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) ) ) ) )
            	    {
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:89:4: ({...}? => ( ({...}? => ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) ) ) ) )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:90:5: {...}? => ( ({...}? => ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleUIDescription", "getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:90:108: ( ({...}? => ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) ) ) )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:91:6: ({...}? => ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:94:6: ({...}? => ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) ) )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:94:7: {...}? => ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUIDescription", "true");
            	    }
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:94:16: ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:94:17: ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) )
            	    {
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:94:17: ( (lv_areaCount_1_0= ruleAreaCount ) )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:95:1: (lv_areaCount_1_0= ruleAreaCount )
            	    {
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:95:1: (lv_areaCount_1_0= ruleAreaCount )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:96:3: lv_areaCount_1_0= ruleAreaCount
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getAreaCountAreaCountParserRuleCall_0_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAreaCount_in_ruleUIDescription176);
            	    lv_areaCount_1_0=ruleAreaCount();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUIDescriptionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"areaCount",
            	            		lv_areaCount_1_0, 
            	            		"AreaCount");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:112:2: ( (lv_typeDefinition_2_0= ruleTypeDefinition ) )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:113:1: (lv_typeDefinition_2_0= ruleTypeDefinition )
            	    {
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:113:1: (lv_typeDefinition_2_0= ruleTypeDefinition )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:114:3: lv_typeDefinition_2_0= ruleTypeDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getTypeDefinitionTypeDefinitionParserRuleCall_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeDefinition_in_ruleUIDescription197);
            	    lv_typeDefinition_2_0=ruleTypeDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUIDescriptionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"typeDefinition",
            	            		lv_typeDefinition_2_0, 
            	            		"TypeDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUIDescriptionAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:137:4: ({...}? => ( ({...}? => ( ( (lv_property_3_0= ruleProperty ) ) ( (lv_usedDescriptions_4_0= ruleUsedDescriptions ) )* ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* ) ) ) )
            	    {
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:137:4: ({...}? => ( ({...}? => ( ( (lv_property_3_0= ruleProperty ) ) ( (lv_usedDescriptions_4_0= ruleUsedDescriptions ) )* ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* ) ) ) )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:138:5: {...}? => ( ({...}? => ( ( (lv_property_3_0= ruleProperty ) ) ( (lv_usedDescriptions_4_0= ruleUsedDescriptions ) )* ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleUIDescription", "getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:138:108: ( ({...}? => ( ( (lv_property_3_0= ruleProperty ) ) ( (lv_usedDescriptions_4_0= ruleUsedDescriptions ) )* ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* ) ) )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:139:6: ({...}? => ( ( (lv_property_3_0= ruleProperty ) ) ( (lv_usedDescriptions_4_0= ruleUsedDescriptions ) )* ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:142:6: ({...}? => ( ( (lv_property_3_0= ruleProperty ) ) ( (lv_usedDescriptions_4_0= ruleUsedDescriptions ) )* ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* ) )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:142:7: {...}? => ( ( (lv_property_3_0= ruleProperty ) ) ( (lv_usedDescriptions_4_0= ruleUsedDescriptions ) )* ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUIDescription", "true");
            	    }
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:142:16: ( ( (lv_property_3_0= ruleProperty ) ) ( (lv_usedDescriptions_4_0= ruleUsedDescriptions ) )* ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:142:17: ( (lv_property_3_0= ruleProperty ) ) ( (lv_usedDescriptions_4_0= ruleUsedDescriptions ) )* ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )*
            	    {
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:142:17: ( (lv_property_3_0= ruleProperty ) )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:143:1: (lv_property_3_0= ruleProperty )
            	    {
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:143:1: (lv_property_3_0= ruleProperty )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:144:3: lv_property_3_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getPropertyPropertyParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleUIDescription274);
            	    lv_property_3_0=ruleProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUIDescriptionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"property",
            	            		lv_property_3_0, 
            	            		"Property");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:160:2: ( (lv_usedDescriptions_4_0= ruleUsedDescriptions ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==12) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:161:1: (lv_usedDescriptions_4_0= ruleUsedDescriptions )
            	    	    {
            	    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:161:1: (lv_usedDescriptions_4_0= ruleUsedDescriptions )
            	    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:162:3: lv_usedDescriptions_4_0= ruleUsedDescriptions
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getUsedDescriptionsUsedDescriptionsParserRuleCall_1_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleUsedDescriptions_in_ruleUIDescription295);
            	    	    lv_usedDescriptions_4_0=ruleUsedDescriptions();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getUIDescriptionRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"usedDescriptions",
            	    	            		lv_usedDescriptions_4_0, 
            	    	            		"UsedDescriptions");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);

            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:178:3: ( (lv_definitions_5_0= ruleDefinition ) )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==15) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:179:1: (lv_definitions_5_0= ruleDefinition )
            	    	    {
            	    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:179:1: (lv_definitions_5_0= ruleDefinition )
            	    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:180:3: lv_definitions_5_0= ruleDefinition
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getDefinitionsDefinitionParserRuleCall_1_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDefinition_in_ruleUIDescription317);
            	    	    lv_definitions_5_0=ruleDefinition();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getUIDescriptionRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"definitions",
            	    	            		lv_definitions_5_0, 
            	    	            		"Definition");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);

            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:196:3: ( (lv_areas_6_0= ruleAreaAssignment ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==RULE_STRING||LA3_0==23) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:197:1: (lv_areas_6_0= ruleAreaAssignment )
            	    	    {
            	    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:197:1: (lv_areas_6_0= ruleAreaAssignment )
            	    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:198:3: lv_areas_6_0= ruleAreaAssignment
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getAreasAreaAssignmentParserRuleCall_1_3_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleAreaAssignment_in_ruleUIDescription339);
            	    	    lv_areas_6_0=ruleAreaAssignment();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getUIDescriptionRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"areas",
            	    	            		lv_areas_6_0, 
            	    	            		"AreaAssignment");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUIDescriptionAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getUIDescriptionAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleUIDescription", "getUnorderedGroupHelper().canLeave(grammarAccess.getUIDescriptionAccess().getUnorderedGroup())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getUIDescriptionAccess().getUnorderedGroup());
            	

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUIDescription"


    // $ANTLR start "entryRuleProperty"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:237:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:238:2: (iv_ruleProperty= ruleProperty EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:239:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty422);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty432); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:246:1: ruleProperty returns [EObject current=null] : (otherlv_0= 'get properties from:' ( (lv_propertiesFile_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_propertiesFile_1_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:249:28: ( (otherlv_0= 'get properties from:' ( (lv_propertiesFile_1_0= RULE_STRING ) ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:250:1: (otherlv_0= 'get properties from:' ( (lv_propertiesFile_1_0= RULE_STRING ) ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:250:1: (otherlv_0= 'get properties from:' ( (lv_propertiesFile_1_0= RULE_STRING ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:250:3: otherlv_0= 'get properties from:' ( (lv_propertiesFile_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleProperty469); 

                	newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getGetPropertiesFromKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:254:1: ( (lv_propertiesFile_1_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:255:1: (lv_propertiesFile_1_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:255:1: (lv_propertiesFile_1_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:256:3: lv_propertiesFile_1_0= RULE_STRING
            {
            lv_propertiesFile_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProperty486); 

            			newLeafNode(lv_propertiesFile_1_0, grammarAccess.getPropertyAccess().getPropertiesFileSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"propertiesFile",
                    		lv_propertiesFile_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleUsedDescriptions"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:280:1: entryRuleUsedDescriptions returns [EObject current=null] : iv_ruleUsedDescriptions= ruleUsedDescriptions EOF ;
    public final EObject entryRuleUsedDescriptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsedDescriptions = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:281:2: (iv_ruleUsedDescriptions= ruleUsedDescriptions EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:282:2: iv_ruleUsedDescriptions= ruleUsedDescriptions EOF
            {
             newCompositeNode(grammarAccess.getUsedDescriptionsRule()); 
            pushFollow(FOLLOW_ruleUsedDescriptions_in_entryRuleUsedDescriptions527);
            iv_ruleUsedDescriptions=ruleUsedDescriptions();

            state._fsp--;

             current =iv_ruleUsedDescriptions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsedDescriptions537); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUsedDescriptions"


    // $ANTLR start "ruleUsedDescriptions"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:289:1: ruleUsedDescriptions returns [EObject current=null] : (otherlv_0= 'use: ' ( ( (lv_description_1_1= ruleUIDescriptionImport | lv_description_1_2= rulecomplexComponent ) ) ) (otherlv_2= ' as: ' ( (lv_localName_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleUsedDescriptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_localName_3_0=null;
        EObject lv_description_1_1 = null;

        EObject lv_description_1_2 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:292:28: ( (otherlv_0= 'use: ' ( ( (lv_description_1_1= ruleUIDescriptionImport | lv_description_1_2= rulecomplexComponent ) ) ) (otherlv_2= ' as: ' ( (lv_localName_3_0= RULE_STRING ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:293:1: (otherlv_0= 'use: ' ( ( (lv_description_1_1= ruleUIDescriptionImport | lv_description_1_2= rulecomplexComponent ) ) ) (otherlv_2= ' as: ' ( (lv_localName_3_0= RULE_STRING ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:293:1: (otherlv_0= 'use: ' ( ( (lv_description_1_1= ruleUIDescriptionImport | lv_description_1_2= rulecomplexComponent ) ) ) (otherlv_2= ' as: ' ( (lv_localName_3_0= RULE_STRING ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:293:3: otherlv_0= 'use: ' ( ( (lv_description_1_1= ruleUIDescriptionImport | lv_description_1_2= rulecomplexComponent ) ) ) (otherlv_2= ' as: ' ( (lv_localName_3_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleUsedDescriptions574); 

                	newLeafNode(otherlv_0, grammarAccess.getUsedDescriptionsAccess().getUseKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:297:1: ( ( (lv_description_1_1= ruleUIDescriptionImport | lv_description_1_2= rulecomplexComponent ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:298:1: ( (lv_description_1_1= ruleUIDescriptionImport | lv_description_1_2= rulecomplexComponent ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:298:1: ( (lv_description_1_1= ruleUIDescriptionImport | lv_description_1_2= rulecomplexComponent ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:299:1: (lv_description_1_1= ruleUIDescriptionImport | lv_description_1_2= rulecomplexComponent )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:299:1: (lv_description_1_1= ruleUIDescriptionImport | lv_description_1_2= rulecomplexComponent )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==20) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:300:3: lv_description_1_1= ruleUIDescriptionImport
                    {
                     
                    	        newCompositeNode(grammarAccess.getUsedDescriptionsAccess().getDescriptionUIDescriptionImportParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUIDescriptionImport_in_ruleUsedDescriptions597);
                    lv_description_1_1=ruleUIDescriptionImport();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUsedDescriptionsRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_1_1, 
                            		"UIDescriptionImport");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:315:8: lv_description_1_2= rulecomplexComponent
                    {
                     
                    	        newCompositeNode(grammarAccess.getUsedDescriptionsAccess().getDescriptionComplexComponentParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_rulecomplexComponent_in_ruleUsedDescriptions616);
                    lv_description_1_2=rulecomplexComponent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUsedDescriptionsRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_1_2, 
                            		"complexComponent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:333:2: (otherlv_2= ' as: ' ( (lv_localName_3_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:333:4: otherlv_2= ' as: ' ( (lv_localName_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleUsedDescriptions632); 

                        	newLeafNode(otherlv_2, grammarAccess.getUsedDescriptionsAccess().getAsKeyword_2_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:337:1: ( (lv_localName_3_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:338:1: (lv_localName_3_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:338:1: (lv_localName_3_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:339:3: lv_localName_3_0= RULE_STRING
                    {
                    lv_localName_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUsedDescriptions649); 

                    			newLeafNode(lv_localName_3_0, grammarAccess.getUsedDescriptionsAccess().getLocalNameSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUsedDescriptionsRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"localName",
                            		lv_localName_3_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUsedDescriptions"


    // $ANTLR start "entryRuleAreaCount"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:363:1: entryRuleAreaCount returns [EObject current=null] : iv_ruleAreaCount= ruleAreaCount EOF ;
    public final EObject entryRuleAreaCount() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAreaCount = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:364:2: (iv_ruleAreaCount= ruleAreaCount EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:365:2: iv_ruleAreaCount= ruleAreaCount EOF
            {
             newCompositeNode(grammarAccess.getAreaCountRule()); 
            pushFollow(FOLLOW_ruleAreaCount_in_entryRuleAreaCount692);
            iv_ruleAreaCount=ruleAreaCount();

            state._fsp--;

             current =iv_ruleAreaCount; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAreaCount702); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAreaCount"


    // $ANTLR start "ruleAreaCount"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:372:1: ruleAreaCount returns [EObject current=null] : (otherlv_0= 'Area count: ' ( (lv_areaCount_1_0= RULE_INT ) ) ) ;
    public final EObject ruleAreaCount() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_areaCount_1_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:375:28: ( (otherlv_0= 'Area count: ' ( (lv_areaCount_1_0= RULE_INT ) ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:376:1: (otherlv_0= 'Area count: ' ( (lv_areaCount_1_0= RULE_INT ) ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:376:1: (otherlv_0= 'Area count: ' ( (lv_areaCount_1_0= RULE_INT ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:376:3: otherlv_0= 'Area count: ' ( (lv_areaCount_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleAreaCount739); 

                	newLeafNode(otherlv_0, grammarAccess.getAreaCountAccess().getAreaCountKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:380:1: ( (lv_areaCount_1_0= RULE_INT ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:381:1: (lv_areaCount_1_0= RULE_INT )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:381:1: (lv_areaCount_1_0= RULE_INT )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:382:3: lv_areaCount_1_0= RULE_INT
            {
            lv_areaCount_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAreaCount756); 

            			newLeafNode(lv_areaCount_1_0, grammarAccess.getAreaCountAccess().getAreaCountINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAreaCountRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"areaCount",
                    		lv_areaCount_1_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAreaCount"


    // $ANTLR start "entryRuleDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:406:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:407:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:408:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition797);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition807); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:415:1: ruleDefinition returns [EObject current=null] : (otherlv_0= 'DEF ' ( (lv_concreteDefition_1_0= ruleComponentDefinition ) ) otherlv_2= 'END DEF' ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_concreteDefition_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:418:28: ( (otherlv_0= 'DEF ' ( (lv_concreteDefition_1_0= ruleComponentDefinition ) ) otherlv_2= 'END DEF' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:419:1: (otherlv_0= 'DEF ' ( (lv_concreteDefition_1_0= ruleComponentDefinition ) ) otherlv_2= 'END DEF' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:419:1: (otherlv_0= 'DEF ' ( (lv_concreteDefition_1_0= ruleComponentDefinition ) ) otherlv_2= 'END DEF' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:419:3: otherlv_0= 'DEF ' ( (lv_concreteDefition_1_0= ruleComponentDefinition ) ) otherlv_2= 'END DEF'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleDefinition844); 

                	newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getDEFKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:423:1: ( (lv_concreteDefition_1_0= ruleComponentDefinition ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:424:1: (lv_concreteDefition_1_0= ruleComponentDefinition )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:424:1: (lv_concreteDefition_1_0= ruleComponentDefinition )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:425:3: lv_concreteDefition_1_0= ruleComponentDefinition
            {
             
            	        newCompositeNode(grammarAccess.getDefinitionAccess().getConcreteDefitionComponentDefinitionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleComponentDefinition_in_ruleDefinition865);
            lv_concreteDefition_1_0=ruleComponentDefinition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"concreteDefition",
                    		lv_concreteDefition_1_0, 
                    		"ComponentDefinition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleDefinition877); 

                	newLeafNode(otherlv_2, grammarAccess.getDefinitionAccess().getENDDEFKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleTypeDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:453:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:454:2: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:455:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
            {
             newCompositeNode(grammarAccess.getTypeDefinitionRule()); 
            pushFollow(FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition913);
            iv_ruleTypeDefinition=ruleTypeDefinition();

            state._fsp--;

             current =iv_ruleTypeDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinition923); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeDefinition"


    // $ANTLR start "ruleTypeDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:462:1: ruleTypeDefinition returns [EObject current=null] : (otherlv_0= 'type: ' ( (lv_type_1_0= ruleType ) ) ) ;
    public final EObject ruleTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:465:28: ( (otherlv_0= 'type: ' ( (lv_type_1_0= ruleType ) ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:466:1: (otherlv_0= 'type: ' ( (lv_type_1_0= ruleType ) ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:466:1: (otherlv_0= 'type: ' ( (lv_type_1_0= ruleType ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:466:3: otherlv_0= 'type: ' ( (lv_type_1_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleTypeDefinition960); 

                	newLeafNode(otherlv_0, grammarAccess.getTypeDefinitionAccess().getTypeKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:470:1: ( (lv_type_1_0= ruleType ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:471:1: (lv_type_1_0= ruleType )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:471:1: (lv_type_1_0= ruleType )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:472:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleTypeDefinition981);
            lv_type_1_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTypeDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeDefinition"


    // $ANTLR start "entryRuleType"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:496:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:497:2: (iv_ruleType= ruleType EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:498:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1018);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1029); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:505:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'WINDOW' | kw= 'INNERCOMPLEX' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:508:28: ( (kw= 'WINDOW' | kw= 'INNERCOMPLEX' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:509:1: (kw= 'WINDOW' | kw= 'INNERCOMPLEX' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:509:1: (kw= 'WINDOW' | kw= 'INNERCOMPLEX' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            else if ( (LA7_0==19) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:510:2: kw= 'WINDOW'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleType1067); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getWINDOWKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:517:2: kw= 'INNERCOMPLEX'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleType1086); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getINNERCOMPLEXKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleUIDescriptionImport"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:530:1: entryRuleUIDescriptionImport returns [EObject current=null] : iv_ruleUIDescriptionImport= ruleUIDescriptionImport EOF ;
    public final EObject entryRuleUIDescriptionImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIDescriptionImport = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:531:2: (iv_ruleUIDescriptionImport= ruleUIDescriptionImport EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:532:2: iv_ruleUIDescriptionImport= ruleUIDescriptionImport EOF
            {
             newCompositeNode(grammarAccess.getUIDescriptionImportRule()); 
            pushFollow(FOLLOW_ruleUIDescriptionImport_in_entryRuleUIDescriptionImport1126);
            iv_ruleUIDescriptionImport=ruleUIDescriptionImport();

            state._fsp--;

             current =iv_ruleUIDescriptionImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIDescriptionImport1136); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUIDescriptionImport"


    // $ANTLR start "ruleUIDescriptionImport"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:539:1: ruleUIDescriptionImport returns [EObject current=null] : ( (lv_descriptionName_0_0= RULE_STRING ) ) ;
    public final EObject ruleUIDescriptionImport() throws RecognitionException {
        EObject current = null;

        Token lv_descriptionName_0_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:542:28: ( ( (lv_descriptionName_0_0= RULE_STRING ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:543:1: ( (lv_descriptionName_0_0= RULE_STRING ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:543:1: ( (lv_descriptionName_0_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:544:1: (lv_descriptionName_0_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:544:1: (lv_descriptionName_0_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:545:3: lv_descriptionName_0_0= RULE_STRING
            {
            lv_descriptionName_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUIDescriptionImport1177); 

            			newLeafNode(lv_descriptionName_0_0, grammarAccess.getUIDescriptionImportAccess().getDescriptionNameSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUIDescriptionImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"descriptionName",
                    		lv_descriptionName_0_0, 
                    		"STRING");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUIDescriptionImport"


    // $ANTLR start "entryRulecomplexComponent"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:569:1: entryRulecomplexComponent returns [EObject current=null] : iv_rulecomplexComponent= rulecomplexComponent EOF ;
    public final EObject entryRulecomplexComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecomplexComponent = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:570:2: (iv_rulecomplexComponent= rulecomplexComponent EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:571:2: iv_rulecomplexComponent= rulecomplexComponent EOF
            {
             newCompositeNode(grammarAccess.getComplexComponentRule()); 
            pushFollow(FOLLOW_rulecomplexComponent_in_entryRulecomplexComponent1217);
            iv_rulecomplexComponent=rulecomplexComponent();

            state._fsp--;

             current =iv_rulecomplexComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecomplexComponent1227); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecomplexComponent"


    // $ANTLR start "rulecomplexComponent"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:578:1: rulecomplexComponent returns [EObject current=null] : this_Multiselection_0= ruleMultiselection ;
    public final EObject rulecomplexComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Multiselection_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:581:28: (this_Multiselection_0= ruleMultiselection )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:583:5: this_Multiselection_0= ruleMultiselection
            {
             
                    newCompositeNode(grammarAccess.getComplexComponentAccess().getMultiselectionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleMultiselection_in_rulecomplexComponent1273);
            this_Multiselection_0=ruleMultiselection();

            state._fsp--;

             
                    current = this_Multiselection_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecomplexComponent"


    // $ANTLR start "entryRuleMultiselection"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:599:1: entryRuleMultiselection returns [EObject current=null] : iv_ruleMultiselection= ruleMultiselection EOF ;
    public final EObject entryRuleMultiselection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiselection = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:600:2: (iv_ruleMultiselection= ruleMultiselection EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:601:2: iv_ruleMultiselection= ruleMultiselection EOF
            {
             newCompositeNode(grammarAccess.getMultiselectionRule()); 
            pushFollow(FOLLOW_ruleMultiselection_in_entryRuleMultiselection1307);
            iv_ruleMultiselection=ruleMultiselection();

            state._fsp--;

             current =iv_ruleMultiselection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiselection1317); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiselection"


    // $ANTLR start "ruleMultiselection"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:608:1: ruleMultiselection returns [EObject current=null] : ( ( (lv_descriptionName_0_0= 'Multiselection' ) ) (otherlv_1= '<' ( (lv_inputType_2_0= RULE_STRING ) ) otherlv_3= '>' )? ) ;
    public final EObject ruleMultiselection() throws RecognitionException {
        EObject current = null;

        Token lv_descriptionName_0_0=null;
        Token otherlv_1=null;
        Token lv_inputType_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:611:28: ( ( ( (lv_descriptionName_0_0= 'Multiselection' ) ) (otherlv_1= '<' ( (lv_inputType_2_0= RULE_STRING ) ) otherlv_3= '>' )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:612:1: ( ( (lv_descriptionName_0_0= 'Multiselection' ) ) (otherlv_1= '<' ( (lv_inputType_2_0= RULE_STRING ) ) otherlv_3= '>' )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:612:1: ( ( (lv_descriptionName_0_0= 'Multiselection' ) ) (otherlv_1= '<' ( (lv_inputType_2_0= RULE_STRING ) ) otherlv_3= '>' )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:612:2: ( (lv_descriptionName_0_0= 'Multiselection' ) ) (otherlv_1= '<' ( (lv_inputType_2_0= RULE_STRING ) ) otherlv_3= '>' )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:612:2: ( (lv_descriptionName_0_0= 'Multiselection' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:613:1: (lv_descriptionName_0_0= 'Multiselection' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:613:1: (lv_descriptionName_0_0= 'Multiselection' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:614:3: lv_descriptionName_0_0= 'Multiselection'
            {
            lv_descriptionName_0_0=(Token)match(input,20,FOLLOW_20_in_ruleMultiselection1360); 

                    newLeafNode(lv_descriptionName_0_0, grammarAccess.getMultiselectionAccess().getDescriptionNameMultiselectionKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMultiselectionRule());
            	        }
                   		setWithLastConsumed(current, "descriptionName", lv_descriptionName_0_0, "Multiselection");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:627:2: (otherlv_1= '<' ( (lv_inputType_2_0= RULE_STRING ) ) otherlv_3= '>' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:627:4: otherlv_1= '<' ( (lv_inputType_2_0= RULE_STRING ) ) otherlv_3= '>'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleMultiselection1386); 

                        	newLeafNode(otherlv_1, grammarAccess.getMultiselectionAccess().getLessThanSignKeyword_1_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:631:1: ( (lv_inputType_2_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:632:1: (lv_inputType_2_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:632:1: (lv_inputType_2_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:633:3: lv_inputType_2_0= RULE_STRING
                    {
                    lv_inputType_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMultiselection1403); 

                    			newLeafNode(lv_inputType_2_0, grammarAccess.getMultiselectionAccess().getInputTypeSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiselectionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"inputType",
                            		lv_inputType_2_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleMultiselection1420); 

                        	newLeafNode(otherlv_3, grammarAccess.getMultiselectionAccess().getGreaterThanSignKeyword_1_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiselection"


    // $ANTLR start "entryRuleAreaAssignment"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:661:1: entryRuleAreaAssignment returns [EObject current=null] : iv_ruleAreaAssignment= ruleAreaAssignment EOF ;
    public final EObject entryRuleAreaAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAreaAssignment = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:662:2: (iv_ruleAreaAssignment= ruleAreaAssignment EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:663:2: iv_ruleAreaAssignment= ruleAreaAssignment EOF
            {
             newCompositeNode(grammarAccess.getAreaAssignmentRule()); 
            pushFollow(FOLLOW_ruleAreaAssignment_in_entryRuleAreaAssignment1458);
            iv_ruleAreaAssignment=ruleAreaAssignment();

            state._fsp--;

             current =iv_ruleAreaAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAreaAssignment1468); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAreaAssignment"


    // $ANTLR start "ruleAreaAssignment"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:670:1: ruleAreaAssignment returns [EObject current=null] : ( (otherlv_0= 'Area:' ( (lv_area_1_0= RULE_INT ) ) otherlv_2= '<-' ( (lv_elements_3_0= RULE_STRING ) )+ ) | ( ( (lv_elements_4_0= RULE_STRING ) )+ otherlv_5= '->' otherlv_6= 'Area:' ( (lv_area_7_0= RULE_INT ) ) ) ) ;
    public final EObject ruleAreaAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_area_1_0=null;
        Token otherlv_2=null;
        Token lv_elements_3_0=null;
        Token lv_elements_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_area_7_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:673:28: ( ( (otherlv_0= 'Area:' ( (lv_area_1_0= RULE_INT ) ) otherlv_2= '<-' ( (lv_elements_3_0= RULE_STRING ) )+ ) | ( ( (lv_elements_4_0= RULE_STRING ) )+ otherlv_5= '->' otherlv_6= 'Area:' ( (lv_area_7_0= RULE_INT ) ) ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:674:1: ( (otherlv_0= 'Area:' ( (lv_area_1_0= RULE_INT ) ) otherlv_2= '<-' ( (lv_elements_3_0= RULE_STRING ) )+ ) | ( ( (lv_elements_4_0= RULE_STRING ) )+ otherlv_5= '->' otherlv_6= 'Area:' ( (lv_area_7_0= RULE_INT ) ) ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:674:1: ( (otherlv_0= 'Area:' ( (lv_area_1_0= RULE_INT ) ) otherlv_2= '<-' ( (lv_elements_3_0= RULE_STRING ) )+ ) | ( ( (lv_elements_4_0= RULE_STRING ) )+ otherlv_5= '->' otherlv_6= 'Area:' ( (lv_area_7_0= RULE_INT ) ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_STRING) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:674:2: (otherlv_0= 'Area:' ( (lv_area_1_0= RULE_INT ) ) otherlv_2= '<-' ( (lv_elements_3_0= RULE_STRING ) )+ )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:674:2: (otherlv_0= 'Area:' ( (lv_area_1_0= RULE_INT ) ) otherlv_2= '<-' ( (lv_elements_3_0= RULE_STRING ) )+ )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:674:4: otherlv_0= 'Area:' ( (lv_area_1_0= RULE_INT ) ) otherlv_2= '<-' ( (lv_elements_3_0= RULE_STRING ) )+
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleAreaAssignment1506); 

                        	newLeafNode(otherlv_0, grammarAccess.getAreaAssignmentAccess().getAreaKeyword_0_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:678:1: ( (lv_area_1_0= RULE_INT ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:679:1: (lv_area_1_0= RULE_INT )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:679:1: (lv_area_1_0= RULE_INT )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:680:3: lv_area_1_0= RULE_INT
                    {
                    lv_area_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAreaAssignment1523); 

                    			newLeafNode(lv_area_1_0, grammarAccess.getAreaAssignmentAccess().getAreaINTTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAreaAssignmentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"area",
                            		lv_area_1_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleAreaAssignment1540); 

                        	newLeafNode(otherlv_2, grammarAccess.getAreaAssignmentAccess().getLessThanSignHyphenMinusKeyword_0_2());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:700:1: ( (lv_elements_3_0= RULE_STRING ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_STRING) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:701:1: (lv_elements_3_0= RULE_STRING )
                    	    {
                    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:701:1: (lv_elements_3_0= RULE_STRING )
                    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:702:3: lv_elements_3_0= RULE_STRING
                    	    {
                    	    lv_elements_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAreaAssignment1557); 

                    	    			newLeafNode(lv_elements_3_0, grammarAccess.getAreaAssignmentAccess().getElementsSTRINGTerminalRuleCall_0_3_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAreaAssignmentRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_3_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:719:6: ( ( (lv_elements_4_0= RULE_STRING ) )+ otherlv_5= '->' otherlv_6= 'Area:' ( (lv_area_7_0= RULE_INT ) ) )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:719:6: ( ( (lv_elements_4_0= RULE_STRING ) )+ otherlv_5= '->' otherlv_6= 'Area:' ( (lv_area_7_0= RULE_INT ) ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:719:7: ( (lv_elements_4_0= RULE_STRING ) )+ otherlv_5= '->' otherlv_6= 'Area:' ( (lv_area_7_0= RULE_INT ) )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:719:7: ( (lv_elements_4_0= RULE_STRING ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_STRING) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:720:1: (lv_elements_4_0= RULE_STRING )
                    	    {
                    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:720:1: (lv_elements_4_0= RULE_STRING )
                    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:721:3: lv_elements_4_0= RULE_STRING
                    	    {
                    	    lv_elements_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAreaAssignment1588); 

                    	    			newLeafNode(lv_elements_4_0, grammarAccess.getAreaAssignmentAccess().getElementsSTRINGTerminalRuleCall_1_0_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAreaAssignmentRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_4_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleAreaAssignment1606); 

                        	newLeafNode(otherlv_5, grammarAccess.getAreaAssignmentAccess().getHyphenMinusGreaterThanSignKeyword_1_1());
                        
                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleAreaAssignment1618); 

                        	newLeafNode(otherlv_6, grammarAccess.getAreaAssignmentAccess().getAreaKeyword_1_2());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:745:1: ( (lv_area_7_0= RULE_INT ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:746:1: (lv_area_7_0= RULE_INT )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:746:1: (lv_area_7_0= RULE_INT )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:747:3: lv_area_7_0= RULE_INT
                    {
                    lv_area_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAreaAssignment1635); 

                    			newLeafNode(lv_area_7_0, grammarAccess.getAreaAssignmentAccess().getAreaINTTerminalRuleCall_1_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAreaAssignmentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"area",
                            		lv_area_7_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAreaAssignment"


    // $ANTLR start "entryRuleComponentDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:771:1: entryRuleComponentDefinition returns [EObject current=null] : iv_ruleComponentDefinition= ruleComponentDefinition EOF ;
    public final EObject entryRuleComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:772:2: (iv_ruleComponentDefinition= ruleComponentDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:773:2: iv_ruleComponentDefinition= ruleComponentDefinition EOF
            {
             newCompositeNode(grammarAccess.getComponentDefinitionRule()); 
            pushFollow(FOLLOW_ruleComponentDefinition_in_entryRuleComponentDefinition1677);
            iv_ruleComponentDefinition=ruleComponentDefinition();

            state._fsp--;

             current =iv_ruleComponentDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentDefinition1687); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentDefinition"


    // $ANTLR start "ruleComponentDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:780:1: ruleComponentDefinition returns [EObject current=null] : (this_LabelDefinition_0= ruleLabelDefinition | this_ButtonDefinition_1= ruleButtonDefinition | this_TextfieldDefinition_2= ruleTextfieldDefinition | this_TreeDefinition_3= ruleTreeDefinition | this_TableDefinition_4= ruleTableDefinition | this_RadioboxDefinition_5= ruleRadioboxDefinition | this_CheckboxDefinition_6= ruleCheckboxDefinition ) ;
    public final EObject ruleComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_LabelDefinition_0 = null;

        EObject this_ButtonDefinition_1 = null;

        EObject this_TextfieldDefinition_2 = null;

        EObject this_TreeDefinition_3 = null;

        EObject this_TableDefinition_4 = null;

        EObject this_RadioboxDefinition_5 = null;

        EObject this_CheckboxDefinition_6 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:783:28: ( (this_LabelDefinition_0= ruleLabelDefinition | this_ButtonDefinition_1= ruleButtonDefinition | this_TextfieldDefinition_2= ruleTextfieldDefinition | this_TreeDefinition_3= ruleTreeDefinition | this_TableDefinition_4= ruleTableDefinition | this_RadioboxDefinition_5= ruleRadioboxDefinition | this_CheckboxDefinition_6= ruleCheckboxDefinition ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:784:1: (this_LabelDefinition_0= ruleLabelDefinition | this_ButtonDefinition_1= ruleButtonDefinition | this_TextfieldDefinition_2= ruleTextfieldDefinition | this_TreeDefinition_3= ruleTreeDefinition | this_TableDefinition_4= ruleTableDefinition | this_RadioboxDefinition_5= ruleRadioboxDefinition | this_CheckboxDefinition_6= ruleCheckboxDefinition )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:784:1: (this_LabelDefinition_0= ruleLabelDefinition | this_ButtonDefinition_1= ruleButtonDefinition | this_TextfieldDefinition_2= ruleTextfieldDefinition | this_TreeDefinition_3= ruleTreeDefinition | this_TableDefinition_4= ruleTableDefinition | this_RadioboxDefinition_5= ruleRadioboxDefinition | this_CheckboxDefinition_6= ruleCheckboxDefinition )
            int alt12=7;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt12=1;
                }
                break;
            case 34:
                {
                alt12=2;
                }
                break;
            case 33:
                {
                alt12=3;
                }
                break;
            case 32:
                {
                alt12=4;
                }
                break;
            case 31:
                {
                alt12=5;
                }
                break;
            case 30:
                {
                alt12=6;
                }
                break;
            case 26:
                {
                alt12=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:785:5: this_LabelDefinition_0= ruleLabelDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getLabelDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLabelDefinition_in_ruleComponentDefinition1734);
                    this_LabelDefinition_0=ruleLabelDefinition();

                    state._fsp--;

                     
                            current = this_LabelDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:795:5: this_ButtonDefinition_1= ruleButtonDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getButtonDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleButtonDefinition_in_ruleComponentDefinition1761);
                    this_ButtonDefinition_1=ruleButtonDefinition();

                    state._fsp--;

                     
                            current = this_ButtonDefinition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:805:5: this_TextfieldDefinition_2= ruleTextfieldDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getTextfieldDefinitionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTextfieldDefinition_in_ruleComponentDefinition1788);
                    this_TextfieldDefinition_2=ruleTextfieldDefinition();

                    state._fsp--;

                     
                            current = this_TextfieldDefinition_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:815:5: this_TreeDefinition_3= ruleTreeDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getTreeDefinitionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleTreeDefinition_in_ruleComponentDefinition1815);
                    this_TreeDefinition_3=ruleTreeDefinition();

                    state._fsp--;

                     
                            current = this_TreeDefinition_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:825:5: this_TableDefinition_4= ruleTableDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getTableDefinitionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleTableDefinition_in_ruleComponentDefinition1842);
                    this_TableDefinition_4=ruleTableDefinition();

                    state._fsp--;

                     
                            current = this_TableDefinition_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:835:5: this_RadioboxDefinition_5= ruleRadioboxDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getRadioboxDefinitionParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleRadioboxDefinition_in_ruleComponentDefinition1869);
                    this_RadioboxDefinition_5=ruleRadioboxDefinition();

                    state._fsp--;

                     
                            current = this_RadioboxDefinition_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:845:5: this_CheckboxDefinition_6= ruleCheckboxDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getCheckboxDefinitionParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleCheckboxDefinition_in_ruleComponentDefinition1896);
                    this_CheckboxDefinition_6=ruleCheckboxDefinition();

                    state._fsp--;

                     
                            current = this_CheckboxDefinition_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentDefinition"


    // $ANTLR start "entryRuleCheckboxDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:861:1: entryRuleCheckboxDefinition returns [EObject current=null] : iv_ruleCheckboxDefinition= ruleCheckboxDefinition EOF ;
    public final EObject entryRuleCheckboxDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckboxDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:862:2: (iv_ruleCheckboxDefinition= ruleCheckboxDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:863:2: iv_ruleCheckboxDefinition= ruleCheckboxDefinition EOF
            {
             newCompositeNode(grammarAccess.getCheckboxDefinitionRule()); 
            pushFollow(FOLLOW_ruleCheckboxDefinition_in_entryRuleCheckboxDefinition1931);
            iv_ruleCheckboxDefinition=ruleCheckboxDefinition();

            state._fsp--;

             current =iv_ruleCheckboxDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckboxDefinition1941); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCheckboxDefinition"


    // $ANTLR start "ruleCheckboxDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:870:1: ruleCheckboxDefinition returns [EObject current=null] : ( ( (lv_type_0_0= 'Checkbox' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleCheckboxDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_text_5_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:873:28: ( ( ( (lv_type_0_0= 'Checkbox' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:874:1: ( ( (lv_type_0_0= 'Checkbox' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:874:1: ( ( (lv_type_0_0= 'Checkbox' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:874:2: ( (lv_type_0_0= 'Checkbox' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:874:2: ( (lv_type_0_0= 'Checkbox' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:875:1: (lv_type_0_0= 'Checkbox' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:875:1: (lv_type_0_0= 'Checkbox' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:876:3: lv_type_0_0= 'Checkbox'
            {
            lv_type_0_0=(Token)match(input,26,FOLLOW_26_in_ruleCheckboxDefinition1984); 

                    newLeafNode(lv_type_0_0, grammarAccess.getCheckboxDefinitionAccess().getTypeCheckboxKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCheckboxDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_0_0, "Checkbox");
            	    

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleCheckboxDefinition2009); 

                	newLeafNode(otherlv_1, grammarAccess.getCheckboxDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:893:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:894:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:894:1: (lv_name_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:895:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCheckboxDefinition2026); 

            			newLeafNode(lv_name_2_0, grammarAccess.getCheckboxDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCheckboxDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleCheckboxDefinition2043); 

                	newLeafNode(otherlv_3, grammarAccess.getCheckboxDefinitionAccess().getColonKeyword_3());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:915:1: (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:915:3: otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleCheckboxDefinition2056); 

                        	newLeafNode(otherlv_4, grammarAccess.getCheckboxDefinitionAccess().getTextKeyword_4_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:919:1: ( (lv_text_5_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:920:1: (lv_text_5_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:920:1: (lv_text_5_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:921:3: lv_text_5_0= RULE_STRING
                    {
                    lv_text_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCheckboxDefinition2073); 

                    			newLeafNode(lv_text_5_0, grammarAccess.getCheckboxDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCheckboxDefinitionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"text",
                            		lv_text_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheckboxDefinition"


    // $ANTLR start "entryRuleRadioboxDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:945:1: entryRuleRadioboxDefinition returns [EObject current=null] : iv_ruleRadioboxDefinition= ruleRadioboxDefinition EOF ;
    public final EObject entryRuleRadioboxDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadioboxDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:946:2: (iv_ruleRadioboxDefinition= ruleRadioboxDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:947:2: iv_ruleRadioboxDefinition= ruleRadioboxDefinition EOF
            {
             newCompositeNode(grammarAccess.getRadioboxDefinitionRule()); 
            pushFollow(FOLLOW_ruleRadioboxDefinition_in_entryRuleRadioboxDefinition2116);
            iv_ruleRadioboxDefinition=ruleRadioboxDefinition();

            state._fsp--;

             current =iv_ruleRadioboxDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRadioboxDefinition2126); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRadioboxDefinition"


    // $ANTLR start "ruleRadioboxDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:954:1: ruleRadioboxDefinition returns [EObject current=null] : ( ( (lv_type_0_0= 'Radiobox' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleRadioboxDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_text_5_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:957:28: ( ( ( (lv_type_0_0= 'Radiobox' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:958:1: ( ( (lv_type_0_0= 'Radiobox' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:958:1: ( ( (lv_type_0_0= 'Radiobox' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:958:2: ( (lv_type_0_0= 'Radiobox' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:958:2: ( (lv_type_0_0= 'Radiobox' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:959:1: (lv_type_0_0= 'Radiobox' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:959:1: (lv_type_0_0= 'Radiobox' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:960:3: lv_type_0_0= 'Radiobox'
            {
            lv_type_0_0=(Token)match(input,30,FOLLOW_30_in_ruleRadioboxDefinition2169); 

                    newLeafNode(lv_type_0_0, grammarAccess.getRadioboxDefinitionAccess().getTypeRadioboxKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRadioboxDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_0_0, "Radiobox");
            	    

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleRadioboxDefinition2194); 

                	newLeafNode(otherlv_1, grammarAccess.getRadioboxDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:977:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:978:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:978:1: (lv_name_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:979:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRadioboxDefinition2211); 

            			newLeafNode(lv_name_2_0, grammarAccess.getRadioboxDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRadioboxDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleRadioboxDefinition2228); 

                	newLeafNode(otherlv_3, grammarAccess.getRadioboxDefinitionAccess().getColonKeyword_3());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:999:1: (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:999:3: otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleRadioboxDefinition2241); 

                        	newLeafNode(otherlv_4, grammarAccess.getRadioboxDefinitionAccess().getTextKeyword_4_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1003:1: ( (lv_text_5_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1004:1: (lv_text_5_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1004:1: (lv_text_5_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1005:3: lv_text_5_0= RULE_STRING
                    {
                    lv_text_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRadioboxDefinition2258); 

                    			newLeafNode(lv_text_5_0, grammarAccess.getRadioboxDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRadioboxDefinitionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"text",
                            		lv_text_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRadioboxDefinition"


    // $ANTLR start "entryRuleTableDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1029:1: entryRuleTableDefinition returns [EObject current=null] : iv_ruleTableDefinition= ruleTableDefinition EOF ;
    public final EObject entryRuleTableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1030:2: (iv_ruleTableDefinition= ruleTableDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1031:2: iv_ruleTableDefinition= ruleTableDefinition EOF
            {
             newCompositeNode(grammarAccess.getTableDefinitionRule()); 
            pushFollow(FOLLOW_ruleTableDefinition_in_entryRuleTableDefinition2301);
            iv_ruleTableDefinition=ruleTableDefinition();

            state._fsp--;

             current =iv_ruleTableDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableDefinition2311); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTableDefinition"


    // $ANTLR start "ruleTableDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1038:1: ruleTableDefinition returns [EObject current=null] : ( ( (lv_type_0_0= 'Table' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleTableDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_text_5_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1041:28: ( ( ( (lv_type_0_0= 'Table' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1042:1: ( ( (lv_type_0_0= 'Table' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1042:1: ( ( (lv_type_0_0= 'Table' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1042:2: ( (lv_type_0_0= 'Table' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1042:2: ( (lv_type_0_0= 'Table' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1043:1: (lv_type_0_0= 'Table' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1043:1: (lv_type_0_0= 'Table' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1044:3: lv_type_0_0= 'Table'
            {
            lv_type_0_0=(Token)match(input,31,FOLLOW_31_in_ruleTableDefinition2354); 

                    newLeafNode(lv_type_0_0, grammarAccess.getTableDefinitionAccess().getTypeTableKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTableDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_0_0, "Table");
            	    

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleTableDefinition2379); 

                	newLeafNode(otherlv_1, grammarAccess.getTableDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1061:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1062:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1062:1: (lv_name_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1063:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTableDefinition2396); 

            			newLeafNode(lv_name_2_0, grammarAccess.getTableDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTableDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleTableDefinition2413); 

                	newLeafNode(otherlv_3, grammarAccess.getTableDefinitionAccess().getColonKeyword_3());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1083:1: (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1083:3: otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleTableDefinition2426); 

                        	newLeafNode(otherlv_4, grammarAccess.getTableDefinitionAccess().getTextKeyword_4_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1087:1: ( (lv_text_5_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1088:1: (lv_text_5_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1088:1: (lv_text_5_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1089:3: lv_text_5_0= RULE_STRING
                    {
                    lv_text_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTableDefinition2443); 

                    			newLeafNode(lv_text_5_0, grammarAccess.getTableDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTableDefinitionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"text",
                            		lv_text_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTableDefinition"


    // $ANTLR start "entryRuleTreeDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1113:1: entryRuleTreeDefinition returns [EObject current=null] : iv_ruleTreeDefinition= ruleTreeDefinition EOF ;
    public final EObject entryRuleTreeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTreeDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1114:2: (iv_ruleTreeDefinition= ruleTreeDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1115:2: iv_ruleTreeDefinition= ruleTreeDefinition EOF
            {
             newCompositeNode(grammarAccess.getTreeDefinitionRule()); 
            pushFollow(FOLLOW_ruleTreeDefinition_in_entryRuleTreeDefinition2486);
            iv_ruleTreeDefinition=ruleTreeDefinition();

            state._fsp--;

             current =iv_ruleTreeDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTreeDefinition2496); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTreeDefinition"


    // $ANTLR start "ruleTreeDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1122:1: ruleTreeDefinition returns [EObject current=null] : ( ( (lv_type_0_0= 'Tree' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleTreeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_text_5_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1125:28: ( ( ( (lv_type_0_0= 'Tree' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1126:1: ( ( (lv_type_0_0= 'Tree' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1126:1: ( ( (lv_type_0_0= 'Tree' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1126:2: ( (lv_type_0_0= 'Tree' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1126:2: ( (lv_type_0_0= 'Tree' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1127:1: (lv_type_0_0= 'Tree' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1127:1: (lv_type_0_0= 'Tree' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1128:3: lv_type_0_0= 'Tree'
            {
            lv_type_0_0=(Token)match(input,32,FOLLOW_32_in_ruleTreeDefinition2539); 

                    newLeafNode(lv_type_0_0, grammarAccess.getTreeDefinitionAccess().getTypeTreeKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTreeDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_0_0, "Tree");
            	    

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleTreeDefinition2564); 

                	newLeafNode(otherlv_1, grammarAccess.getTreeDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1145:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1146:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1146:1: (lv_name_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1147:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTreeDefinition2581); 

            			newLeafNode(lv_name_2_0, grammarAccess.getTreeDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTreeDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleTreeDefinition2598); 

                	newLeafNode(otherlv_3, grammarAccess.getTreeDefinitionAccess().getColonKeyword_3());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1167:1: (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1167:3: otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleTreeDefinition2611); 

                        	newLeafNode(otherlv_4, grammarAccess.getTreeDefinitionAccess().getTextKeyword_4_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1171:1: ( (lv_text_5_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1172:1: (lv_text_5_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1172:1: (lv_text_5_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1173:3: lv_text_5_0= RULE_STRING
                    {
                    lv_text_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTreeDefinition2628); 

                    			newLeafNode(lv_text_5_0, grammarAccess.getTreeDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTreeDefinitionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"text",
                            		lv_text_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTreeDefinition"


    // $ANTLR start "entryRuleTextfieldDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1197:1: entryRuleTextfieldDefinition returns [EObject current=null] : iv_ruleTextfieldDefinition= ruleTextfieldDefinition EOF ;
    public final EObject entryRuleTextfieldDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextfieldDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1198:2: (iv_ruleTextfieldDefinition= ruleTextfieldDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1199:2: iv_ruleTextfieldDefinition= ruleTextfieldDefinition EOF
            {
             newCompositeNode(grammarAccess.getTextfieldDefinitionRule()); 
            pushFollow(FOLLOW_ruleTextfieldDefinition_in_entryRuleTextfieldDefinition2671);
            iv_ruleTextfieldDefinition=ruleTextfieldDefinition();

            state._fsp--;

             current =iv_ruleTextfieldDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextfieldDefinition2681); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextfieldDefinition"


    // $ANTLR start "ruleTextfieldDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1206:1: ruleTextfieldDefinition returns [EObject current=null] : ( ( (lv_type_0_0= 'Textfield' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleTextfieldDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_text_5_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1209:28: ( ( ( (lv_type_0_0= 'Textfield' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1210:1: ( ( (lv_type_0_0= 'Textfield' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1210:1: ( ( (lv_type_0_0= 'Textfield' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1210:2: ( (lv_type_0_0= 'Textfield' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1210:2: ( (lv_type_0_0= 'Textfield' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1211:1: (lv_type_0_0= 'Textfield' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1211:1: (lv_type_0_0= 'Textfield' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1212:3: lv_type_0_0= 'Textfield'
            {
            lv_type_0_0=(Token)match(input,33,FOLLOW_33_in_ruleTextfieldDefinition2724); 

                    newLeafNode(lv_type_0_0, grammarAccess.getTextfieldDefinitionAccess().getTypeTextfieldKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextfieldDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_0_0, "Textfield");
            	    

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleTextfieldDefinition2749); 

                	newLeafNode(otherlv_1, grammarAccess.getTextfieldDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1229:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1230:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1230:1: (lv_name_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1231:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextfieldDefinition2766); 

            			newLeafNode(lv_name_2_0, grammarAccess.getTextfieldDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextfieldDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleTextfieldDefinition2783); 

                	newLeafNode(otherlv_3, grammarAccess.getTextfieldDefinitionAccess().getColonKeyword_3());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1251:1: (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1251:3: otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleTextfieldDefinition2796); 

                        	newLeafNode(otherlv_4, grammarAccess.getTextfieldDefinitionAccess().getTextKeyword_4_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1255:1: ( (lv_text_5_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1256:1: (lv_text_5_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1256:1: (lv_text_5_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1257:3: lv_text_5_0= RULE_STRING
                    {
                    lv_text_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextfieldDefinition2813); 

                    			newLeafNode(lv_text_5_0, grammarAccess.getTextfieldDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTextfieldDefinitionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"text",
                            		lv_text_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextfieldDefinition"


    // $ANTLR start "entryRuleButtonDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1281:1: entryRuleButtonDefinition returns [EObject current=null] : iv_ruleButtonDefinition= ruleButtonDefinition EOF ;
    public final EObject entryRuleButtonDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1282:2: (iv_ruleButtonDefinition= ruleButtonDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1283:2: iv_ruleButtonDefinition= ruleButtonDefinition EOF
            {
             newCompositeNode(grammarAccess.getButtonDefinitionRule()); 
            pushFollow(FOLLOW_ruleButtonDefinition_in_entryRuleButtonDefinition2856);
            iv_ruleButtonDefinition=ruleButtonDefinition();

            state._fsp--;

             current =iv_ruleButtonDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonDefinition2866); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleButtonDefinition"


    // $ANTLR start "ruleButtonDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1290:1: ruleButtonDefinition returns [EObject current=null] : ( ( (lv_type_0_0= 'Button' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'propertyKey=' ( (lv_propertyKey_5_0= RULE_STRING ) ) )? (otherlv_6= 'text=' ( (lv_text_7_0= RULE_STRING ) ) )? (otherlv_8= 'interactiontype=' ( (lv_interactiontype_9_0= ruleInteractiontype ) )+ )? ) ;
    public final EObject ruleButtonDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_propertyKey_5_0=null;
        Token otherlv_6=null;
        Token lv_text_7_0=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_interactiontype_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1293:28: ( ( ( (lv_type_0_0= 'Button' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'propertyKey=' ( (lv_propertyKey_5_0= RULE_STRING ) ) )? (otherlv_6= 'text=' ( (lv_text_7_0= RULE_STRING ) ) )? (otherlv_8= 'interactiontype=' ( (lv_interactiontype_9_0= ruleInteractiontype ) )+ )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1294:1: ( ( (lv_type_0_0= 'Button' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'propertyKey=' ( (lv_propertyKey_5_0= RULE_STRING ) ) )? (otherlv_6= 'text=' ( (lv_text_7_0= RULE_STRING ) ) )? (otherlv_8= 'interactiontype=' ( (lv_interactiontype_9_0= ruleInteractiontype ) )+ )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1294:1: ( ( (lv_type_0_0= 'Button' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'propertyKey=' ( (lv_propertyKey_5_0= RULE_STRING ) ) )? (otherlv_6= 'text=' ( (lv_text_7_0= RULE_STRING ) ) )? (otherlv_8= 'interactiontype=' ( (lv_interactiontype_9_0= ruleInteractiontype ) )+ )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1294:2: ( (lv_type_0_0= 'Button' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'propertyKey=' ( (lv_propertyKey_5_0= RULE_STRING ) ) )? (otherlv_6= 'text=' ( (lv_text_7_0= RULE_STRING ) ) )? (otherlv_8= 'interactiontype=' ( (lv_interactiontype_9_0= ruleInteractiontype ) )+ )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1294:2: ( (lv_type_0_0= 'Button' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1295:1: (lv_type_0_0= 'Button' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1295:1: (lv_type_0_0= 'Button' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1296:3: lv_type_0_0= 'Button'
            {
            lv_type_0_0=(Token)match(input,34,FOLLOW_34_in_ruleButtonDefinition2909); 

                    newLeafNode(lv_type_0_0, grammarAccess.getButtonDefinitionAccess().getTypeButtonKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getButtonDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_0_0, "Button");
            	    

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleButtonDefinition2934); 

                	newLeafNode(otherlv_1, grammarAccess.getButtonDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1313:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1314:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1314:1: (lv_name_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1315:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleButtonDefinition2951); 

            			newLeafNode(lv_name_2_0, grammarAccess.getButtonDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getButtonDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleButtonDefinition2968); 

                	newLeafNode(otherlv_3, grammarAccess.getButtonDefinitionAccess().getColonKeyword_3());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1335:1: (otherlv_4= 'propertyKey=' ( (lv_propertyKey_5_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1335:3: otherlv_4= 'propertyKey=' ( (lv_propertyKey_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleButtonDefinition2981); 

                        	newLeafNode(otherlv_4, grammarAccess.getButtonDefinitionAccess().getPropertyKeyKeyword_4_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1339:1: ( (lv_propertyKey_5_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1340:1: (lv_propertyKey_5_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1340:1: (lv_propertyKey_5_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1341:3: lv_propertyKey_5_0= RULE_STRING
                    {
                    lv_propertyKey_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleButtonDefinition2998); 

                    			newLeafNode(lv_propertyKey_5_0, grammarAccess.getButtonDefinitionAccess().getPropertyKeySTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getButtonDefinitionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"propertyKey",
                            		lv_propertyKey_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1357:4: (otherlv_6= 'text=' ( (lv_text_7_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1357:6: otherlv_6= 'text=' ( (lv_text_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleButtonDefinition3018); 

                        	newLeafNode(otherlv_6, grammarAccess.getButtonDefinitionAccess().getTextKeyword_5_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1361:1: ( (lv_text_7_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1362:1: (lv_text_7_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1362:1: (lv_text_7_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1363:3: lv_text_7_0= RULE_STRING
                    {
                    lv_text_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleButtonDefinition3035); 

                    			newLeafNode(lv_text_7_0, grammarAccess.getButtonDefinitionAccess().getTextSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getButtonDefinitionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"text",
                            		lv_text_7_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1379:4: (otherlv_8= 'interactiontype=' ( (lv_interactiontype_9_0= ruleInteractiontype ) )+ )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1379:6: otherlv_8= 'interactiontype=' ( (lv_interactiontype_9_0= ruleInteractiontype ) )+
                    {
                    otherlv_8=(Token)match(input,36,FOLLOW_36_in_ruleButtonDefinition3055); 

                        	newLeafNode(otherlv_8, grammarAccess.getButtonDefinitionAccess().getInteractiontypeKeyword_6_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1383:1: ( (lv_interactiontype_9_0= ruleInteractiontype ) )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( ((LA20_0>=38 && LA20_0<=39)) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1384:1: (lv_interactiontype_9_0= ruleInteractiontype )
                    	    {
                    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1384:1: (lv_interactiontype_9_0= ruleInteractiontype )
                    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1385:3: lv_interactiontype_9_0= ruleInteractiontype
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getButtonDefinitionAccess().getInteractiontypeInteractiontypeParserRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInteractiontype_in_ruleButtonDefinition3076);
                    	    lv_interactiontype_9_0=ruleInteractiontype();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getButtonDefinitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"interactiontype",
                    	            		lv_interactiontype_9_0, 
                    	            		"Interactiontype");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleButtonDefinition"


    // $ANTLR start "entryRuleLabelDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1411:1: entryRuleLabelDefinition returns [EObject current=null] : iv_ruleLabelDefinition= ruleLabelDefinition EOF ;
    public final EObject entryRuleLabelDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1412:2: (iv_ruleLabelDefinition= ruleLabelDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1413:2: iv_ruleLabelDefinition= ruleLabelDefinition EOF
            {
             newCompositeNode(grammarAccess.getLabelDefinitionRule()); 
            pushFollow(FOLLOW_ruleLabelDefinition_in_entryRuleLabelDefinition3117);
            iv_ruleLabelDefinition=ruleLabelDefinition();

            state._fsp--;

             current =iv_ruleLabelDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelDefinition3127); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabelDefinition"


    // $ANTLR start "ruleLabelDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1420:1: ruleLabelDefinition returns [EObject current=null] : ( ( (lv_type_0_0= 'Label' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'propertyKey=' ( (lv_propertyKey_5_0= RULE_STRING ) ) )? (otherlv_6= 'text=' ( (lv_text_7_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleLabelDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_propertyKey_5_0=null;
        Token otherlv_6=null;
        Token lv_text_7_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1423:28: ( ( ( (lv_type_0_0= 'Label' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'propertyKey=' ( (lv_propertyKey_5_0= RULE_STRING ) ) )? (otherlv_6= 'text=' ( (lv_text_7_0= RULE_STRING ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1424:1: ( ( (lv_type_0_0= 'Label' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'propertyKey=' ( (lv_propertyKey_5_0= RULE_STRING ) ) )? (otherlv_6= 'text=' ( (lv_text_7_0= RULE_STRING ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1424:1: ( ( (lv_type_0_0= 'Label' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'propertyKey=' ( (lv_propertyKey_5_0= RULE_STRING ) ) )? (otherlv_6= 'text=' ( (lv_text_7_0= RULE_STRING ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1424:2: ( (lv_type_0_0= 'Label' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'propertyKey=' ( (lv_propertyKey_5_0= RULE_STRING ) ) )? (otherlv_6= 'text=' ( (lv_text_7_0= RULE_STRING ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1424:2: ( (lv_type_0_0= 'Label' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1425:1: (lv_type_0_0= 'Label' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1425:1: (lv_type_0_0= 'Label' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1426:3: lv_type_0_0= 'Label'
            {
            lv_type_0_0=(Token)match(input,37,FOLLOW_37_in_ruleLabelDefinition3170); 

                    newLeafNode(lv_type_0_0, grammarAccess.getLabelDefinitionAccess().getTypeLabelKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_0_0, "Label");
            	    

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleLabelDefinition3195); 

                	newLeafNode(otherlv_1, grammarAccess.getLabelDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1443:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1444:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1444:1: (lv_name_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1445:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabelDefinition3212); 

            			newLeafNode(lv_name_2_0, grammarAccess.getLabelDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleLabelDefinition3229); 

                	newLeafNode(otherlv_3, grammarAccess.getLabelDefinitionAccess().getColonKeyword_3());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1465:1: (otherlv_4= 'propertyKey=' ( (lv_propertyKey_5_0= RULE_STRING ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1465:3: otherlv_4= 'propertyKey=' ( (lv_propertyKey_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleLabelDefinition3242); 

                        	newLeafNode(otherlv_4, grammarAccess.getLabelDefinitionAccess().getPropertyKeyKeyword_4_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1469:1: ( (lv_propertyKey_5_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1470:1: (lv_propertyKey_5_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1470:1: (lv_propertyKey_5_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1471:3: lv_propertyKey_5_0= RULE_STRING
                    {
                    lv_propertyKey_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabelDefinition3259); 

                    			newLeafNode(lv_propertyKey_5_0, grammarAccess.getLabelDefinitionAccess().getPropertyKeySTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelDefinitionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"propertyKey",
                            		lv_propertyKey_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1487:4: (otherlv_6= 'text=' ( (lv_text_7_0= RULE_STRING ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1487:6: otherlv_6= 'text=' ( (lv_text_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleLabelDefinition3279); 

                        	newLeafNode(otherlv_6, grammarAccess.getLabelDefinitionAccess().getTextKeyword_5_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1491:1: ( (lv_text_7_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1492:1: (lv_text_7_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1492:1: (lv_text_7_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1493:3: lv_text_7_0= RULE_STRING
                    {
                    lv_text_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabelDefinition3296); 

                    			newLeafNode(lv_text_7_0, grammarAccess.getLabelDefinitionAccess().getTextSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelDefinitionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"text",
                            		lv_text_7_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabelDefinition"


    // $ANTLR start "entryRuleInteractiontype"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1517:1: entryRuleInteractiontype returns [String current=null] : iv_ruleInteractiontype= ruleInteractiontype EOF ;
    public final String entryRuleInteractiontype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteractiontype = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1518:2: (iv_ruleInteractiontype= ruleInteractiontype EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1519:2: iv_ruleInteractiontype= ruleInteractiontype EOF
            {
             newCompositeNode(grammarAccess.getInteractiontypeRule()); 
            pushFollow(FOLLOW_ruleInteractiontype_in_entryRuleInteractiontype3340);
            iv_ruleInteractiontype=ruleInteractiontype();

            state._fsp--;

             current =iv_ruleInteractiontype.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractiontype3351); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteractiontype"


    // $ANTLR start "ruleInteractiontype"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1526:1: ruleInteractiontype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Click' | kw= 'ChangeText' ) ;
    public final AntlrDatatypeRuleToken ruleInteractiontype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1529:28: ( (kw= 'Click' | kw= 'ChangeText' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1530:1: (kw= 'Click' | kw= 'ChangeText' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1530:1: (kw= 'Click' | kw= 'ChangeText' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            else if ( (LA24_0==39) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1531:2: kw= 'Click'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleInteractiontype3389); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInteractiontypeAccess().getClickKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1538:2: kw= 'ChangeText'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleInteractiontype3408); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInteractiontypeAccess().getChangeTextKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteractiontype"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleUIDescription_in_entryRuleUIDescription75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIDescription85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAreaCount_in_ruleUIDescription176 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleUIDescription197 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleUIDescription274 = new BitSet(new long[]{0x000000000080D812L});
    public static final BitSet FOLLOW_ruleUsedDescriptions_in_ruleUIDescription295 = new BitSet(new long[]{0x000000000080D812L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleUIDescription317 = new BitSet(new long[]{0x000000000080D812L});
    public static final BitSet FOLLOW_ruleAreaAssignment_in_ruleUIDescription339 = new BitSet(new long[]{0x000000000080D812L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProperty469 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProperty486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsedDescriptions_in_entryRuleUsedDescriptions527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsedDescriptions537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleUsedDescriptions574 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_ruleUIDescriptionImport_in_ruleUsedDescriptions597 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rulecomplexComponent_in_ruleUsedDescriptions616 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleUsedDescriptions632 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUsedDescriptions649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAreaCount_in_entryRuleAreaCount692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAreaCount702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleAreaCount739 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAreaCount756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleDefinition844 = new BitSet(new long[]{0x00000027C4000000L});
    public static final BitSet FOLLOW_ruleComponentDefinition_in_ruleDefinition865 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDefinition877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleTypeDefinition960 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypeDefinition981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleType1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleType1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIDescriptionImport_in_entryRuleUIDescriptionImport1126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIDescriptionImport1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUIDescriptionImport1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecomplexComponent_in_entryRulecomplexComponent1217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecomplexComponent1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiselection_in_rulecomplexComponent1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiselection_in_entryRuleMultiselection1307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiselection1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleMultiselection1360 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleMultiselection1386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMultiselection1403 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleMultiselection1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAreaAssignment_in_entryRuleAreaAssignment1458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAreaAssignment1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleAreaAssignment1506 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAreaAssignment1523 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAreaAssignment1540 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAreaAssignment1557 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAreaAssignment1588 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_25_in_ruleAreaAssignment1606 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAreaAssignment1618 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAreaAssignment1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDefinition_in_entryRuleComponentDefinition1677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentDefinition1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelDefinition_in_ruleComponentDefinition1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonDefinition_in_ruleComponentDefinition1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfieldDefinition_in_ruleComponentDefinition1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreeDefinition_in_ruleComponentDefinition1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableDefinition_in_ruleComponentDefinition1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadioboxDefinition_in_ruleComponentDefinition1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckboxDefinition_in_ruleComponentDefinition1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckboxDefinition_in_entryRuleCheckboxDefinition1931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckboxDefinition1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleCheckboxDefinition1984 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleCheckboxDefinition2009 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCheckboxDefinition2026 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCheckboxDefinition2043 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleCheckboxDefinition2056 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCheckboxDefinition2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadioboxDefinition_in_entryRuleRadioboxDefinition2116 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRadioboxDefinition2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleRadioboxDefinition2169 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleRadioboxDefinition2194 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRadioboxDefinition2211 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleRadioboxDefinition2228 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleRadioboxDefinition2241 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRadioboxDefinition2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableDefinition_in_entryRuleTableDefinition2301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableDefinition2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleTableDefinition2354 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTableDefinition2379 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTableDefinition2396 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTableDefinition2413 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleTableDefinition2426 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTableDefinition2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreeDefinition_in_entryRuleTreeDefinition2486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTreeDefinition2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleTreeDefinition2539 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTreeDefinition2564 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTreeDefinition2581 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTreeDefinition2598 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleTreeDefinition2611 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTreeDefinition2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfieldDefinition_in_entryRuleTextfieldDefinition2671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextfieldDefinition2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleTextfieldDefinition2724 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTextfieldDefinition2749 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextfieldDefinition2766 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTextfieldDefinition2783 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleTextfieldDefinition2796 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextfieldDefinition2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonDefinition_in_entryRuleButtonDefinition2856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonDefinition2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleButtonDefinition2909 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleButtonDefinition2934 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleButtonDefinition2951 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleButtonDefinition2968 = new BitSet(new long[]{0x0000001820000002L});
    public static final BitSet FOLLOW_35_in_ruleButtonDefinition2981 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleButtonDefinition2998 = new BitSet(new long[]{0x0000001020000002L});
    public static final BitSet FOLLOW_29_in_ruleButtonDefinition3018 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleButtonDefinition3035 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleButtonDefinition3055 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_ruleInteractiontype_in_ruleButtonDefinition3076 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_ruleLabelDefinition_in_entryRuleLabelDefinition3117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelDefinition3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleLabelDefinition3170 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleLabelDefinition3195 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabelDefinition3212 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleLabelDefinition3229 = new BitSet(new long[]{0x0000000820000002L});
    public static final BitSet FOLLOW_35_in_ruleLabelDefinition3242 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabelDefinition3259 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleLabelDefinition3279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabelDefinition3296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractiontype_in_entryRuleInteractiontype3340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractiontype3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleInteractiontype3389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleInteractiontype3408 = new BitSet(new long[]{0x0000000000000002L});

}
