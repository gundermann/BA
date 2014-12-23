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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'inputType='", "' as '", "'use: '", "'Area count: '", "'DEF '", "'END DEF'", "'type: '", "'WINDOW'", "'INNERCOMPLEX'", "' As: '", "'Area:'", "'<-'", "'->'", "'MultiSelection'", "'selectableValues='", "'selectedValues='", "'Checkbox'", "':'", "'text='", "'Radiobox'", "'Table'", "'Tree'", "'Textfield'", "'Button'", "'interaction='", "' type='", "' with actions:'", "'Label'", "'type='", "'UiAction'", "'element='", "'='", "'Text'", "'CLICK'"
    };
    public static final int RULE_ID=6;
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
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:76:1: ruleUIDescription returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) ( (lv_usedDescriptions_3_0= ruleUsedDescriptions ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inputTypes_4_0= ruleinputType ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleUIDescription() throws RecognitionException {
        EObject current = null;

        EObject lv_areaCount_1_0 = null;

        EObject lv_typeDefinition_2_0 = null;

        EObject lv_usedDescriptions_3_0 = null;

        EObject lv_inputTypes_4_0 = null;

        EObject lv_definitions_5_0 = null;

        EObject lv_areas_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:79:28: ( ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) ( (lv_usedDescriptions_3_0= ruleUsedDescriptions ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inputTypes_4_0= ruleinputType ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* ) ) ) ) )+ {...}?) ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:80:1: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) ( (lv_usedDescriptions_3_0= ruleUsedDescriptions ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inputTypes_4_0= ruleinputType ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* ) ) ) ) )+ {...}?) ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:80:1: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) ( (lv_usedDescriptions_3_0= ruleUsedDescriptions ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inputTypes_4_0= ruleinputType ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* ) ) ) ) )+ {...}?) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:82:1: ( ( ( ({...}? => ( ({...}? => ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) ( (lv_usedDescriptions_3_0= ruleUsedDescriptions ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inputTypes_4_0= ruleinputType ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* ) ) ) ) )+ {...}?) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:82:1: ( ( ( ({...}? => ( ({...}? => ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) ( (lv_usedDescriptions_3_0= ruleUsedDescriptions ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inputTypes_4_0= ruleinputType ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* ) ) ) ) )+ {...}?) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:83:2: ( ( ({...}? => ( ({...}? => ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) ( (lv_usedDescriptions_3_0= ruleUsedDescriptions ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inputTypes_4_0= ruleinputType ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getUIDescriptionAccess().getUnorderedGroup());
            	
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:86:2: ( ( ({...}? => ( ({...}? => ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) ( (lv_usedDescriptions_3_0= ruleUsedDescriptions ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inputTypes_4_0= ruleinputType ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* ) ) ) ) )+ {...}?)
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:87:3: ( ({...}? => ( ({...}? => ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) ( (lv_usedDescriptions_3_0= ruleUsedDescriptions ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inputTypes_4_0= ruleinputType ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* ) ) ) ) )+ {...}?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:87:3: ( ({...}? => ( ({...}? => ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) ( (lv_usedDescriptions_3_0= ruleUsedDescriptions ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inputTypes_4_0= ruleinputType ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* ) ) ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=4;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==EOF) ) {
                    int LA5_1 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2) ) {
                        alt5=3;
                    }


                }
                else if ( LA5_0 ==14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 0) ) ) {
                    int LA5_2 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 0) ) {
                        alt5=1;
                    }
                    else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2) ) {
                        alt5=3;
                    }


                }
                else if ( LA5_0 ==11 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2) ) ) {
                    int LA5_3 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 1) ) {
                        alt5=2;
                    }
                    else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2) ) {
                        alt5=3;
                    }


                }
                else if ( (LA5_0==RULE_STRING||LA5_0==15||LA5_0==21) && getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2) ) {
                    alt5=3;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:89:4: ({...}? => ( ({...}? => ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) ( (lv_usedDescriptions_3_0= ruleUsedDescriptions ) )* ) ) ) )
            	    {
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:89:4: ({...}? => ( ({...}? => ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) ( (lv_usedDescriptions_3_0= ruleUsedDescriptions ) )* ) ) ) )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:90:5: {...}? => ( ({...}? => ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) ( (lv_usedDescriptions_3_0= ruleUsedDescriptions ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleUIDescription", "getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:90:108: ( ({...}? => ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) ( (lv_usedDescriptions_3_0= ruleUsedDescriptions ) )* ) ) )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:91:6: ({...}? => ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) ( (lv_usedDescriptions_3_0= ruleUsedDescriptions ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:94:6: ({...}? => ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) ( (lv_usedDescriptions_3_0= ruleUsedDescriptions ) )* ) )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:94:7: {...}? => ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) ( (lv_usedDescriptions_3_0= ruleUsedDescriptions ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUIDescription", "true");
            	    }
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:94:16: ( ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) ( (lv_usedDescriptions_3_0= ruleUsedDescriptions ) )* )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:94:17: ( (lv_areaCount_1_0= ruleAreaCount ) ) ( (lv_typeDefinition_2_0= ruleTypeDefinition ) ) ( (lv_usedDescriptions_3_0= ruleUsedDescriptions ) )*
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

            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:130:2: ( (lv_usedDescriptions_3_0= ruleUsedDescriptions ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==13) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:131:1: (lv_usedDescriptions_3_0= ruleUsedDescriptions )
            	    	    {
            	    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:131:1: (lv_usedDescriptions_3_0= ruleUsedDescriptions )
            	    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:132:3: lv_usedDescriptions_3_0= ruleUsedDescriptions
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getUsedDescriptionsUsedDescriptionsParserRuleCall_0_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleUsedDescriptions_in_ruleUIDescription218);
            	    	    lv_usedDescriptions_3_0=ruleUsedDescriptions();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getUIDescriptionRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"usedDescriptions",
            	    	            		lv_usedDescriptions_3_0, 
            	    	            		"UsedDescriptions");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUIDescriptionAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:155:4: ({...}? => ( ({...}? => ( (lv_inputTypes_4_0= ruleinputType ) ) )+ ) )
            	    {
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:155:4: ({...}? => ( ({...}? => ( (lv_inputTypes_4_0= ruleinputType ) ) )+ ) )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:156:5: {...}? => ( ({...}? => ( (lv_inputTypes_4_0= ruleinputType ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleUIDescription", "getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:156:108: ( ({...}? => ( (lv_inputTypes_4_0= ruleinputType ) ) )+ )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:157:6: ({...}? => ( (lv_inputTypes_4_0= ruleinputType ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:160:6: ({...}? => ( (lv_inputTypes_4_0= ruleinputType ) ) )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==11) ) {
            	            int LA2_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt2=1;
            	            }


            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:160:7: {...}? => ( (lv_inputTypes_4_0= ruleinputType ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleUIDescription", "true");
            	    	    }
            	    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:160:16: ( (lv_inputTypes_4_0= ruleinputType ) )
            	    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:161:1: (lv_inputTypes_4_0= ruleinputType )
            	    	    {
            	    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:161:1: (lv_inputTypes_4_0= ruleinputType )
            	    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:162:3: lv_inputTypes_4_0= ruleinputType
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getInputTypesInputTypeParserRuleCall_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleinputType_in_ruleUIDescription295);
            	    	    lv_inputTypes_4_0=ruleinputType();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getUIDescriptionRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"inputTypes",
            	    	            		lv_inputTypes_4_0, 
            	    	            		"inputType");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt2 >= 1 ) break loop2;
            	                EarlyExitException eee =
            	                    new EarlyExitException(2, input);
            	                throw eee;
            	        }
            	        cnt2++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUIDescriptionAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:185:4: ({...}? => ( ({...}? => ( ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* ) ) ) )
            	    {
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:185:4: ({...}? => ( ({...}? => ( ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* ) ) ) )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:186:5: {...}? => ( ({...}? => ( ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleUIDescription", "getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2)");
            	    }
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:186:108: ( ({...}? => ( ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* ) ) )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:187:6: ({...}? => ( ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2);
            	    	 				
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:190:6: ({...}? => ( ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* ) )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:190:7: {...}? => ( ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUIDescription", "true");
            	    }
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:190:16: ( ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:190:17: ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )*
            	    {
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:190:17: ( (lv_definitions_5_0= ruleDefinition ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==15) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:191:1: (lv_definitions_5_0= ruleDefinition )
            	    	    {
            	    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:191:1: (lv_definitions_5_0= ruleDefinition )
            	    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:192:3: lv_definitions_5_0= ruleDefinition
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getDefinitionsDefinitionParserRuleCall_2_0_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDefinition_in_ruleUIDescription372);
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
            	    	    break loop3;
            	        }
            	    } while (true);

            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:208:3: ( (lv_areas_6_0= ruleAreaAssignment ) )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==21) ) {
            	            alt4=1;
            	        }
            	        else if ( (LA4_0==RULE_STRING) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:209:1: (lv_areas_6_0= ruleAreaAssignment )
            	    	    {
            	    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:209:1: (lv_areas_6_0= ruleAreaAssignment )
            	    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:210:3: lv_areas_6_0= ruleAreaAssignment
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getAreasAreaAssignmentParserRuleCall_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleAreaAssignment_in_ruleUIDescription394);
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
            	    	    break loop4;
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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


    // $ANTLR start "entryRuleinputType"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:249:1: entryRuleinputType returns [EObject current=null] : iv_ruleinputType= ruleinputType EOF ;
    public final EObject entryRuleinputType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinputType = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:250:2: (iv_ruleinputType= ruleinputType EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:251:2: iv_ruleinputType= ruleinputType EOF
            {
             newCompositeNode(grammarAccess.getInputTypeRule()); 
            pushFollow(FOLLOW_ruleinputType_in_entryRuleinputType477);
            iv_ruleinputType=ruleinputType();

            state._fsp--;

             current =iv_ruleinputType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinputType487); 

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
    // $ANTLR end "entryRuleinputType"


    // $ANTLR start "ruleinputType"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:258:1: ruleinputType returns [EObject current=null] : (otherlv_0= 'inputType=' ( (lv_type_1_0= RULE_STRING ) ) otherlv_2= ' as ' ( (lv_name_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleinputType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:261:28: ( (otherlv_0= 'inputType=' ( (lv_type_1_0= RULE_STRING ) ) otherlv_2= ' as ' ( (lv_name_3_0= RULE_STRING ) ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:262:1: (otherlv_0= 'inputType=' ( (lv_type_1_0= RULE_STRING ) ) otherlv_2= ' as ' ( (lv_name_3_0= RULE_STRING ) ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:262:1: (otherlv_0= 'inputType=' ( (lv_type_1_0= RULE_STRING ) ) otherlv_2= ' as ' ( (lv_name_3_0= RULE_STRING ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:262:3: otherlv_0= 'inputType=' ( (lv_type_1_0= RULE_STRING ) ) otherlv_2= ' as ' ( (lv_name_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleinputType524); 

                	newLeafNode(otherlv_0, grammarAccess.getInputTypeAccess().getInputTypeKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:266:1: ( (lv_type_1_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:267:1: (lv_type_1_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:267:1: (lv_type_1_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:268:3: lv_type_1_0= RULE_STRING
            {
            lv_type_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleinputType541); 

            			newLeafNode(lv_type_1_0, grammarAccess.getInputTypeAccess().getTypeSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInputTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleinputType558); 

                	newLeafNode(otherlv_2, grammarAccess.getInputTypeAccess().getAsKeyword_2());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:288:1: ( (lv_name_3_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:289:1: (lv_name_3_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:289:1: (lv_name_3_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:290:3: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleinputType575); 

            			newLeafNode(lv_name_3_0, grammarAccess.getInputTypeAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInputTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
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
    // $ANTLR end "ruleinputType"


    // $ANTLR start "entryRuleUsedDescriptions"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:314:1: entryRuleUsedDescriptions returns [EObject current=null] : iv_ruleUsedDescriptions= ruleUsedDescriptions EOF ;
    public final EObject entryRuleUsedDescriptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsedDescriptions = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:315:2: (iv_ruleUsedDescriptions= ruleUsedDescriptions EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:316:2: iv_ruleUsedDescriptions= ruleUsedDescriptions EOF
            {
             newCompositeNode(grammarAccess.getUsedDescriptionsRule()); 
            pushFollow(FOLLOW_ruleUsedDescriptions_in_entryRuleUsedDescriptions616);
            iv_ruleUsedDescriptions=ruleUsedDescriptions();

            state._fsp--;

             current =iv_ruleUsedDescriptions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsedDescriptions626); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:323:1: ruleUsedDescriptions returns [EObject current=null] : (otherlv_0= 'use: ' ( (lv_description_1_0= ruleUIDescriptionImport ) ) ) ;
    public final EObject ruleUsedDescriptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_description_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:326:28: ( (otherlv_0= 'use: ' ( (lv_description_1_0= ruleUIDescriptionImport ) ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:327:1: (otherlv_0= 'use: ' ( (lv_description_1_0= ruleUIDescriptionImport ) ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:327:1: (otherlv_0= 'use: ' ( (lv_description_1_0= ruleUIDescriptionImport ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:327:3: otherlv_0= 'use: ' ( (lv_description_1_0= ruleUIDescriptionImport ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleUsedDescriptions663); 

                	newLeafNode(otherlv_0, grammarAccess.getUsedDescriptionsAccess().getUseKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:331:1: ( (lv_description_1_0= ruleUIDescriptionImport ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:332:1: (lv_description_1_0= ruleUIDescriptionImport )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:332:1: (lv_description_1_0= ruleUIDescriptionImport )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:333:3: lv_description_1_0= ruleUIDescriptionImport
            {
             
            	        newCompositeNode(grammarAccess.getUsedDescriptionsAccess().getDescriptionUIDescriptionImportParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleUIDescriptionImport_in_ruleUsedDescriptions684);
            lv_description_1_0=ruleUIDescriptionImport();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUsedDescriptionsRule());
            	        }
                   		set(
                   			current, 
                   			"description",
                    		lv_description_1_0, 
                    		"UIDescriptionImport");
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
    // $ANTLR end "ruleUsedDescriptions"


    // $ANTLR start "entryRuleAreaCount"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:357:1: entryRuleAreaCount returns [EObject current=null] : iv_ruleAreaCount= ruleAreaCount EOF ;
    public final EObject entryRuleAreaCount() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAreaCount = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:358:2: (iv_ruleAreaCount= ruleAreaCount EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:359:2: iv_ruleAreaCount= ruleAreaCount EOF
            {
             newCompositeNode(grammarAccess.getAreaCountRule()); 
            pushFollow(FOLLOW_ruleAreaCount_in_entryRuleAreaCount720);
            iv_ruleAreaCount=ruleAreaCount();

            state._fsp--;

             current =iv_ruleAreaCount; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAreaCount730); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:366:1: ruleAreaCount returns [EObject current=null] : (otherlv_0= 'Area count: ' ( (lv_areaCount_1_0= RULE_INT ) ) ) ;
    public final EObject ruleAreaCount() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_areaCount_1_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:369:28: ( (otherlv_0= 'Area count: ' ( (lv_areaCount_1_0= RULE_INT ) ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:370:1: (otherlv_0= 'Area count: ' ( (lv_areaCount_1_0= RULE_INT ) ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:370:1: (otherlv_0= 'Area count: ' ( (lv_areaCount_1_0= RULE_INT ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:370:3: otherlv_0= 'Area count: ' ( (lv_areaCount_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleAreaCount767); 

                	newLeafNode(otherlv_0, grammarAccess.getAreaCountAccess().getAreaCountKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:374:1: ( (lv_areaCount_1_0= RULE_INT ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:375:1: (lv_areaCount_1_0= RULE_INT )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:375:1: (lv_areaCount_1_0= RULE_INT )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:376:3: lv_areaCount_1_0= RULE_INT
            {
            lv_areaCount_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAreaCount784); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:400:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:401:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:402:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition825);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition835); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:409:1: ruleDefinition returns [EObject current=null] : (otherlv_0= 'DEF ' ( (lv_concreteDefition_1_0= ruleComponentDefinition ) ) otherlv_2= 'END DEF' ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_concreteDefition_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:412:28: ( (otherlv_0= 'DEF ' ( (lv_concreteDefition_1_0= ruleComponentDefinition ) ) otherlv_2= 'END DEF' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:413:1: (otherlv_0= 'DEF ' ( (lv_concreteDefition_1_0= ruleComponentDefinition ) ) otherlv_2= 'END DEF' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:413:1: (otherlv_0= 'DEF ' ( (lv_concreteDefition_1_0= ruleComponentDefinition ) ) otherlv_2= 'END DEF' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:413:3: otherlv_0= 'DEF ' ( (lv_concreteDefition_1_0= ruleComponentDefinition ) ) otherlv_2= 'END DEF'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleDefinition872); 

                	newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getDEFKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:417:1: ( (lv_concreteDefition_1_0= ruleComponentDefinition ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:418:1: (lv_concreteDefition_1_0= ruleComponentDefinition )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:418:1: (lv_concreteDefition_1_0= ruleComponentDefinition )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:419:3: lv_concreteDefition_1_0= ruleComponentDefinition
            {
             
            	        newCompositeNode(grammarAccess.getDefinitionAccess().getConcreteDefitionComponentDefinitionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleComponentDefinition_in_ruleDefinition893);
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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleDefinition905); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:447:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:448:2: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:449:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
            {
             newCompositeNode(grammarAccess.getTypeDefinitionRule()); 
            pushFollow(FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition941);
            iv_ruleTypeDefinition=ruleTypeDefinition();

            state._fsp--;

             current =iv_ruleTypeDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinition951); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:456:1: ruleTypeDefinition returns [EObject current=null] : (otherlv_0= 'type: ' ( (lv_type_1_0= ruleTYPE ) ) ) ;
    public final EObject ruleTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:459:28: ( (otherlv_0= 'type: ' ( (lv_type_1_0= ruleTYPE ) ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:460:1: (otherlv_0= 'type: ' ( (lv_type_1_0= ruleTYPE ) ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:460:1: (otherlv_0= 'type: ' ( (lv_type_1_0= ruleTYPE ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:460:3: otherlv_0= 'type: ' ( (lv_type_1_0= ruleTYPE ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleTypeDefinition988); 

                	newLeafNode(otherlv_0, grammarAccess.getTypeDefinitionAccess().getTypeKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:464:1: ( (lv_type_1_0= ruleTYPE ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:465:1: (lv_type_1_0= ruleTYPE )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:465:1: (lv_type_1_0= ruleTYPE )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:466:3: lv_type_1_0= ruleTYPE
            {
             
            	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getTypeTYPEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTYPE_in_ruleTypeDefinition1009);
            lv_type_1_0=ruleTYPE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTypeDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"TYPE");
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


    // $ANTLR start "entryRuleTYPE"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:490:1: entryRuleTYPE returns [String current=null] : iv_ruleTYPE= ruleTYPE EOF ;
    public final String entryRuleTYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTYPE = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:491:2: (iv_ruleTYPE= ruleTYPE EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:492:2: iv_ruleTYPE= ruleTYPE EOF
            {
             newCompositeNode(grammarAccess.getTYPERule()); 
            pushFollow(FOLLOW_ruleTYPE_in_entryRuleTYPE1046);
            iv_ruleTYPE=ruleTYPE();

            state._fsp--;

             current =iv_ruleTYPE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTYPE1057); 

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
    // $ANTLR end "entryRuleTYPE"


    // $ANTLR start "ruleTYPE"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:499:1: ruleTYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'WINDOW' | kw= 'INNERCOMPLEX' ) ;
    public final AntlrDatatypeRuleToken ruleTYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:502:28: ( (kw= 'WINDOW' | kw= 'INNERCOMPLEX' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:503:1: (kw= 'WINDOW' | kw= 'INNERCOMPLEX' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:503:1: (kw= 'WINDOW' | kw= 'INNERCOMPLEX' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:504:2: kw= 'WINDOW'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleTYPE1095); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTYPEAccess().getWINDOWKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:511:2: kw= 'INNERCOMPLEX'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleTYPE1114); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTYPEAccess().getINNERCOMPLEXKeyword_1()); 
                        

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
    // $ANTLR end "ruleTYPE"


    // $ANTLR start "entryRuleUIDescriptionImport"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:524:1: entryRuleUIDescriptionImport returns [EObject current=null] : iv_ruleUIDescriptionImport= ruleUIDescriptionImport EOF ;
    public final EObject entryRuleUIDescriptionImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIDescriptionImport = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:525:2: (iv_ruleUIDescriptionImport= ruleUIDescriptionImport EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:526:2: iv_ruleUIDescriptionImport= ruleUIDescriptionImport EOF
            {
             newCompositeNode(grammarAccess.getUIDescriptionImportRule()); 
            pushFollow(FOLLOW_ruleUIDescriptionImport_in_entryRuleUIDescriptionImport1154);
            iv_ruleUIDescriptionImport=ruleUIDescriptionImport();

            state._fsp--;

             current =iv_ruleUIDescriptionImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIDescriptionImport1164); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:533:1: ruleUIDescriptionImport returns [EObject current=null] : ( ( (lv_descriptionName_0_0= RULE_STRING ) ) (otherlv_1= ' As: ' ( (lv_localName_2_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleUIDescriptionImport() throws RecognitionException {
        EObject current = null;

        Token lv_descriptionName_0_0=null;
        Token otherlv_1=null;
        Token lv_localName_2_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:536:28: ( ( ( (lv_descriptionName_0_0= RULE_STRING ) ) (otherlv_1= ' As: ' ( (lv_localName_2_0= RULE_STRING ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:537:1: ( ( (lv_descriptionName_0_0= RULE_STRING ) ) (otherlv_1= ' As: ' ( (lv_localName_2_0= RULE_STRING ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:537:1: ( ( (lv_descriptionName_0_0= RULE_STRING ) ) (otherlv_1= ' As: ' ( (lv_localName_2_0= RULE_STRING ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:537:2: ( (lv_descriptionName_0_0= RULE_STRING ) ) (otherlv_1= ' As: ' ( (lv_localName_2_0= RULE_STRING ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:537:2: ( (lv_descriptionName_0_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:538:1: (lv_descriptionName_0_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:538:1: (lv_descriptionName_0_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:539:3: lv_descriptionName_0_0= RULE_STRING
            {
            lv_descriptionName_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUIDescriptionImport1206); 

            			newLeafNode(lv_descriptionName_0_0, grammarAccess.getUIDescriptionImportAccess().getDescriptionNameSTRINGTerminalRuleCall_0_0()); 
            		

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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:555:2: (otherlv_1= ' As: ' ( (lv_localName_2_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:555:4: otherlv_1= ' As: ' ( (lv_localName_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleUIDescriptionImport1224); 

                        	newLeafNode(otherlv_1, grammarAccess.getUIDescriptionImportAccess().getAsKeyword_1_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:559:1: ( (lv_localName_2_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:560:1: (lv_localName_2_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:560:1: (lv_localName_2_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:561:3: lv_localName_2_0= RULE_STRING
                    {
                    lv_localName_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUIDescriptionImport1241); 

                    			newLeafNode(lv_localName_2_0, grammarAccess.getUIDescriptionImportAccess().getLocalNameSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUIDescriptionImportRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"localName",
                            		lv_localName_2_0, 
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
    // $ANTLR end "ruleUIDescriptionImport"


    // $ANTLR start "entryRuleAreaAssignment"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:585:1: entryRuleAreaAssignment returns [EObject current=null] : iv_ruleAreaAssignment= ruleAreaAssignment EOF ;
    public final EObject entryRuleAreaAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAreaAssignment = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:586:2: (iv_ruleAreaAssignment= ruleAreaAssignment EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:587:2: iv_ruleAreaAssignment= ruleAreaAssignment EOF
            {
             newCompositeNode(grammarAccess.getAreaAssignmentRule()); 
            pushFollow(FOLLOW_ruleAreaAssignment_in_entryRuleAreaAssignment1284);
            iv_ruleAreaAssignment=ruleAreaAssignment();

            state._fsp--;

             current =iv_ruleAreaAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAreaAssignment1294); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:594:1: ruleAreaAssignment returns [EObject current=null] : ( (otherlv_0= 'Area:' ( (lv_area_1_0= RULE_INT ) ) otherlv_2= '<-' ( (lv_element_3_0= RULE_STRING ) ) ) | ( ( (lv_element_4_0= RULE_STRING ) ) otherlv_5= '->' otherlv_6= 'Area:' ( (lv_area_7_0= RULE_INT ) ) ) ) ;
    public final EObject ruleAreaAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_area_1_0=null;
        Token otherlv_2=null;
        Token lv_element_3_0=null;
        Token lv_element_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_area_7_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:597:28: ( ( (otherlv_0= 'Area:' ( (lv_area_1_0= RULE_INT ) ) otherlv_2= '<-' ( (lv_element_3_0= RULE_STRING ) ) ) | ( ( (lv_element_4_0= RULE_STRING ) ) otherlv_5= '->' otherlv_6= 'Area:' ( (lv_area_7_0= RULE_INT ) ) ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:598:1: ( (otherlv_0= 'Area:' ( (lv_area_1_0= RULE_INT ) ) otherlv_2= '<-' ( (lv_element_3_0= RULE_STRING ) ) ) | ( ( (lv_element_4_0= RULE_STRING ) ) otherlv_5= '->' otherlv_6= 'Area:' ( (lv_area_7_0= RULE_INT ) ) ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:598:1: ( (otherlv_0= 'Area:' ( (lv_area_1_0= RULE_INT ) ) otherlv_2= '<-' ( (lv_element_3_0= RULE_STRING ) ) ) | ( ( (lv_element_4_0= RULE_STRING ) ) otherlv_5= '->' otherlv_6= 'Area:' ( (lv_area_7_0= RULE_INT ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_STRING) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:598:2: (otherlv_0= 'Area:' ( (lv_area_1_0= RULE_INT ) ) otherlv_2= '<-' ( (lv_element_3_0= RULE_STRING ) ) )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:598:2: (otherlv_0= 'Area:' ( (lv_area_1_0= RULE_INT ) ) otherlv_2= '<-' ( (lv_element_3_0= RULE_STRING ) ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:598:4: otherlv_0= 'Area:' ( (lv_area_1_0= RULE_INT ) ) otherlv_2= '<-' ( (lv_element_3_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleAreaAssignment1332); 

                        	newLeafNode(otherlv_0, grammarAccess.getAreaAssignmentAccess().getAreaKeyword_0_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:602:1: ( (lv_area_1_0= RULE_INT ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:603:1: (lv_area_1_0= RULE_INT )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:603:1: (lv_area_1_0= RULE_INT )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:604:3: lv_area_1_0= RULE_INT
                    {
                    lv_area_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAreaAssignment1349); 

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

                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleAreaAssignment1366); 

                        	newLeafNode(otherlv_2, grammarAccess.getAreaAssignmentAccess().getLessThanSignHyphenMinusKeyword_0_2());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:624:1: ( (lv_element_3_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:625:1: (lv_element_3_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:625:1: (lv_element_3_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:626:3: lv_element_3_0= RULE_STRING
                    {
                    lv_element_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAreaAssignment1383); 

                    			newLeafNode(lv_element_3_0, grammarAccess.getAreaAssignmentAccess().getElementSTRINGTerminalRuleCall_0_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAreaAssignmentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"element",
                            		lv_element_3_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:643:6: ( ( (lv_element_4_0= RULE_STRING ) ) otherlv_5= '->' otherlv_6= 'Area:' ( (lv_area_7_0= RULE_INT ) ) )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:643:6: ( ( (lv_element_4_0= RULE_STRING ) ) otherlv_5= '->' otherlv_6= 'Area:' ( (lv_area_7_0= RULE_INT ) ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:643:7: ( (lv_element_4_0= RULE_STRING ) ) otherlv_5= '->' otherlv_6= 'Area:' ( (lv_area_7_0= RULE_INT ) )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:643:7: ( (lv_element_4_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:644:1: (lv_element_4_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:644:1: (lv_element_4_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:645:3: lv_element_4_0= RULE_STRING
                    {
                    lv_element_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAreaAssignment1413); 

                    			newLeafNode(lv_element_4_0, grammarAccess.getAreaAssignmentAccess().getElementSTRINGTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAreaAssignmentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"element",
                            		lv_element_4_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleAreaAssignment1430); 

                        	newLeafNode(otherlv_5, grammarAccess.getAreaAssignmentAccess().getHyphenMinusGreaterThanSignKeyword_1_1());
                        
                    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleAreaAssignment1442); 

                        	newLeafNode(otherlv_6, grammarAccess.getAreaAssignmentAccess().getAreaKeyword_1_2());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:669:1: ( (lv_area_7_0= RULE_INT ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:670:1: (lv_area_7_0= RULE_INT )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:670:1: (lv_area_7_0= RULE_INT )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:671:3: lv_area_7_0= RULE_INT
                    {
                    lv_area_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAreaAssignment1459); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:695:1: entryRuleComponentDefinition returns [EObject current=null] : iv_ruleComponentDefinition= ruleComponentDefinition EOF ;
    public final EObject entryRuleComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:696:2: (iv_ruleComponentDefinition= ruleComponentDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:697:2: iv_ruleComponentDefinition= ruleComponentDefinition EOF
            {
             newCompositeNode(grammarAccess.getComponentDefinitionRule()); 
            pushFollow(FOLLOW_ruleComponentDefinition_in_entryRuleComponentDefinition1501);
            iv_ruleComponentDefinition=ruleComponentDefinition();

            state._fsp--;

             current =iv_ruleComponentDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentDefinition1511); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:704:1: ruleComponentDefinition returns [EObject current=null] : (this_LabelDefinition_0= ruleLabelDefinition | this_ButtonDefinition_1= ruleButtonDefinition | this_TextfieldDefinition_2= ruleTextfieldDefinition | this_TreeDefinition_3= ruleTreeDefinition | this_TableDefinition_4= ruleTableDefinition | this_RadioboxDefinition_5= ruleRadioboxDefinition | this_CheckboxDefinition_6= ruleCheckboxDefinition | this_MultiSelectionDefinition_7= ruleMultiSelectionDefinition ) ;
    public final EObject ruleComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_LabelDefinition_0 = null;

        EObject this_ButtonDefinition_1 = null;

        EObject this_TextfieldDefinition_2 = null;

        EObject this_TreeDefinition_3 = null;

        EObject this_TableDefinition_4 = null;

        EObject this_RadioboxDefinition_5 = null;

        EObject this_CheckboxDefinition_6 = null;

        EObject this_MultiSelectionDefinition_7 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:707:28: ( (this_LabelDefinition_0= ruleLabelDefinition | this_ButtonDefinition_1= ruleButtonDefinition | this_TextfieldDefinition_2= ruleTextfieldDefinition | this_TreeDefinition_3= ruleTreeDefinition | this_TableDefinition_4= ruleTableDefinition | this_RadioboxDefinition_5= ruleRadioboxDefinition | this_CheckboxDefinition_6= ruleCheckboxDefinition | this_MultiSelectionDefinition_7= ruleMultiSelectionDefinition ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:708:1: (this_LabelDefinition_0= ruleLabelDefinition | this_ButtonDefinition_1= ruleButtonDefinition | this_TextfieldDefinition_2= ruleTextfieldDefinition | this_TreeDefinition_3= ruleTreeDefinition | this_TableDefinition_4= ruleTableDefinition | this_RadioboxDefinition_5= ruleRadioboxDefinition | this_CheckboxDefinition_6= ruleCheckboxDefinition | this_MultiSelectionDefinition_7= ruleMultiSelectionDefinition )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:708:1: (this_LabelDefinition_0= ruleLabelDefinition | this_ButtonDefinition_1= ruleButtonDefinition | this_TextfieldDefinition_2= ruleTextfieldDefinition | this_TreeDefinition_3= ruleTreeDefinition | this_TableDefinition_4= ruleTableDefinition | this_RadioboxDefinition_5= ruleRadioboxDefinition | this_CheckboxDefinition_6= ruleCheckboxDefinition | this_MultiSelectionDefinition_7= ruleMultiSelectionDefinition )
            int alt9=8;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt9=1;
                }
                break;
            case 34:
                {
                alt9=2;
                }
                break;
            case 33:
                {
                alt9=3;
                }
                break;
            case 32:
                {
                alt9=4;
                }
                break;
            case 31:
                {
                alt9=5;
                }
                break;
            case 30:
                {
                alt9=6;
                }
                break;
            case 27:
                {
                alt9=7;
                }
                break;
            case 24:
                {
                alt9=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:709:5: this_LabelDefinition_0= ruleLabelDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getLabelDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLabelDefinition_in_ruleComponentDefinition1558);
                    this_LabelDefinition_0=ruleLabelDefinition();

                    state._fsp--;

                     
                            current = this_LabelDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:719:5: this_ButtonDefinition_1= ruleButtonDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getButtonDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleButtonDefinition_in_ruleComponentDefinition1585);
                    this_ButtonDefinition_1=ruleButtonDefinition();

                    state._fsp--;

                     
                            current = this_ButtonDefinition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:729:5: this_TextfieldDefinition_2= ruleTextfieldDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getTextfieldDefinitionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTextfieldDefinition_in_ruleComponentDefinition1612);
                    this_TextfieldDefinition_2=ruleTextfieldDefinition();

                    state._fsp--;

                     
                            current = this_TextfieldDefinition_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:739:5: this_TreeDefinition_3= ruleTreeDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getTreeDefinitionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleTreeDefinition_in_ruleComponentDefinition1639);
                    this_TreeDefinition_3=ruleTreeDefinition();

                    state._fsp--;

                     
                            current = this_TreeDefinition_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:749:5: this_TableDefinition_4= ruleTableDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getTableDefinitionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleTableDefinition_in_ruleComponentDefinition1666);
                    this_TableDefinition_4=ruleTableDefinition();

                    state._fsp--;

                     
                            current = this_TableDefinition_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:759:5: this_RadioboxDefinition_5= ruleRadioboxDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getRadioboxDefinitionParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleRadioboxDefinition_in_ruleComponentDefinition1693);
                    this_RadioboxDefinition_5=ruleRadioboxDefinition();

                    state._fsp--;

                     
                            current = this_RadioboxDefinition_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:769:5: this_CheckboxDefinition_6= ruleCheckboxDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getCheckboxDefinitionParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleCheckboxDefinition_in_ruleComponentDefinition1720);
                    this_CheckboxDefinition_6=ruleCheckboxDefinition();

                    state._fsp--;

                     
                            current = this_CheckboxDefinition_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:779:5: this_MultiSelectionDefinition_7= ruleMultiSelectionDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getMultiSelectionDefinitionParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleMultiSelectionDefinition_in_ruleComponentDefinition1747);
                    this_MultiSelectionDefinition_7=ruleMultiSelectionDefinition();

                    state._fsp--;

                     
                            current = this_MultiSelectionDefinition_7; 
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


    // $ANTLR start "entryRuleMultiSelectionDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:795:1: entryRuleMultiSelectionDefinition returns [EObject current=null] : iv_ruleMultiSelectionDefinition= ruleMultiSelectionDefinition EOF ;
    public final EObject entryRuleMultiSelectionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiSelectionDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:796:2: (iv_ruleMultiSelectionDefinition= ruleMultiSelectionDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:797:2: iv_ruleMultiSelectionDefinition= ruleMultiSelectionDefinition EOF
            {
             newCompositeNode(grammarAccess.getMultiSelectionDefinitionRule()); 
            pushFollow(FOLLOW_ruleMultiSelectionDefinition_in_entryRuleMultiSelectionDefinition1782);
            iv_ruleMultiSelectionDefinition=ruleMultiSelectionDefinition();

            state._fsp--;

             current =iv_ruleMultiSelectionDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiSelectionDefinition1792); 

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
    // $ANTLR end "entryRuleMultiSelectionDefinition"


    // $ANTLR start "ruleMultiSelectionDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:804:1: ruleMultiSelectionDefinition returns [EObject current=null] : ( ( (lv_type_0_0= 'MultiSelection' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'inputType=' ( (lv_inputType_4_0= RULE_STRING ) ) (otherlv_5= 'selectableValues=' ( (lv_selectableValuesLocation_6_0= RULE_STRING ) ) (otherlv_7= 'selectedValues=' ( (lv_selectedValuesLocation_8_0= RULE_STRING ) ) )? )? )? ) ;
    public final EObject ruleMultiSelectionDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_inputType_4_0=null;
        Token otherlv_5=null;
        Token lv_selectableValuesLocation_6_0=null;
        Token otherlv_7=null;
        Token lv_selectedValuesLocation_8_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:807:28: ( ( ( (lv_type_0_0= 'MultiSelection' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'inputType=' ( (lv_inputType_4_0= RULE_STRING ) ) (otherlv_5= 'selectableValues=' ( (lv_selectableValuesLocation_6_0= RULE_STRING ) ) (otherlv_7= 'selectedValues=' ( (lv_selectedValuesLocation_8_0= RULE_STRING ) ) )? )? )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:808:1: ( ( (lv_type_0_0= 'MultiSelection' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'inputType=' ( (lv_inputType_4_0= RULE_STRING ) ) (otherlv_5= 'selectableValues=' ( (lv_selectableValuesLocation_6_0= RULE_STRING ) ) (otherlv_7= 'selectedValues=' ( (lv_selectedValuesLocation_8_0= RULE_STRING ) ) )? )? )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:808:1: ( ( (lv_type_0_0= 'MultiSelection' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'inputType=' ( (lv_inputType_4_0= RULE_STRING ) ) (otherlv_5= 'selectableValues=' ( (lv_selectableValuesLocation_6_0= RULE_STRING ) ) (otherlv_7= 'selectedValues=' ( (lv_selectedValuesLocation_8_0= RULE_STRING ) ) )? )? )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:808:2: ( (lv_type_0_0= 'MultiSelection' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'inputType=' ( (lv_inputType_4_0= RULE_STRING ) ) (otherlv_5= 'selectableValues=' ( (lv_selectableValuesLocation_6_0= RULE_STRING ) ) (otherlv_7= 'selectedValues=' ( (lv_selectedValuesLocation_8_0= RULE_STRING ) ) )? )? )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:808:2: ( (lv_type_0_0= 'MultiSelection' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:809:1: (lv_type_0_0= 'MultiSelection' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:809:1: (lv_type_0_0= 'MultiSelection' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:810:3: lv_type_0_0= 'MultiSelection'
            {
            lv_type_0_0=(Token)match(input,24,FOLLOW_24_in_ruleMultiSelectionDefinition1835); 

                    newLeafNode(lv_type_0_0, grammarAccess.getMultiSelectionDefinitionAccess().getTypeMultiSelectionKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMultiSelectionDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_0_0, "MultiSelection");
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleMultiSelectionDefinition1860); 

                	newLeafNode(otherlv_1, grammarAccess.getMultiSelectionDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:827:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:828:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:828:1: (lv_name_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:829:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMultiSelectionDefinition1877); 

            			newLeafNode(lv_name_2_0, grammarAccess.getMultiSelectionDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMultiSelectionDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:845:2: (otherlv_3= 'inputType=' ( (lv_inputType_4_0= RULE_STRING ) ) (otherlv_5= 'selectableValues=' ( (lv_selectableValuesLocation_6_0= RULE_STRING ) ) (otherlv_7= 'selectedValues=' ( (lv_selectedValuesLocation_8_0= RULE_STRING ) ) )? )? )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==11) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:845:4: otherlv_3= 'inputType=' ( (lv_inputType_4_0= RULE_STRING ) ) (otherlv_5= 'selectableValues=' ( (lv_selectableValuesLocation_6_0= RULE_STRING ) ) (otherlv_7= 'selectedValues=' ( (lv_selectedValuesLocation_8_0= RULE_STRING ) ) )? )?
                    {
                    otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleMultiSelectionDefinition1895); 

                        	newLeafNode(otherlv_3, grammarAccess.getMultiSelectionDefinitionAccess().getInputTypeKeyword_3_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:849:1: ( (lv_inputType_4_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:850:1: (lv_inputType_4_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:850:1: (lv_inputType_4_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:851:3: lv_inputType_4_0= RULE_STRING
                    {
                    lv_inputType_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMultiSelectionDefinition1912); 

                    			newLeafNode(lv_inputType_4_0, grammarAccess.getMultiSelectionDefinitionAccess().getInputTypeSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiSelectionDefinitionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"inputType",
                            		lv_inputType_4_0, 
                            		"STRING");
                    	    

                    }


                    }

                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:867:2: (otherlv_5= 'selectableValues=' ( (lv_selectableValuesLocation_6_0= RULE_STRING ) ) (otherlv_7= 'selectedValues=' ( (lv_selectedValuesLocation_8_0= RULE_STRING ) ) )? )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==25) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:867:4: otherlv_5= 'selectableValues=' ( (lv_selectableValuesLocation_6_0= RULE_STRING ) ) (otherlv_7= 'selectedValues=' ( (lv_selectedValuesLocation_8_0= RULE_STRING ) ) )?
                            {
                            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleMultiSelectionDefinition1930); 

                                	newLeafNode(otherlv_5, grammarAccess.getMultiSelectionDefinitionAccess().getSelectableValuesKeyword_3_2_0());
                                
                            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:871:1: ( (lv_selectableValuesLocation_6_0= RULE_STRING ) )
                            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:872:1: (lv_selectableValuesLocation_6_0= RULE_STRING )
                            {
                            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:872:1: (lv_selectableValuesLocation_6_0= RULE_STRING )
                            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:873:3: lv_selectableValuesLocation_6_0= RULE_STRING
                            {
                            lv_selectableValuesLocation_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMultiSelectionDefinition1947); 

                            			newLeafNode(lv_selectableValuesLocation_6_0, grammarAccess.getMultiSelectionDefinitionAccess().getSelectableValuesLocationSTRINGTerminalRuleCall_3_2_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getMultiSelectionDefinitionRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"selectableValuesLocation",
                                    		lv_selectableValuesLocation_6_0, 
                                    		"STRING");
                            	    

                            }


                            }

                            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:889:2: (otherlv_7= 'selectedValues=' ( (lv_selectedValuesLocation_8_0= RULE_STRING ) ) )?
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( (LA10_0==26) ) {
                                alt10=1;
                            }
                            switch (alt10) {
                                case 1 :
                                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:889:4: otherlv_7= 'selectedValues=' ( (lv_selectedValuesLocation_8_0= RULE_STRING ) )
                                    {
                                    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleMultiSelectionDefinition1965); 

                                        	newLeafNode(otherlv_7, grammarAccess.getMultiSelectionDefinitionAccess().getSelectedValuesKeyword_3_2_2_0());
                                        
                                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:893:1: ( (lv_selectedValuesLocation_8_0= RULE_STRING ) )
                                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:894:1: (lv_selectedValuesLocation_8_0= RULE_STRING )
                                    {
                                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:894:1: (lv_selectedValuesLocation_8_0= RULE_STRING )
                                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:895:3: lv_selectedValuesLocation_8_0= RULE_STRING
                                    {
                                    lv_selectedValuesLocation_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMultiSelectionDefinition1982); 

                                    			newLeafNode(lv_selectedValuesLocation_8_0, grammarAccess.getMultiSelectionDefinitionAccess().getSelectedValuesLocationSTRINGTerminalRuleCall_3_2_2_1_0()); 
                                    		

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getMultiSelectionDefinitionRule());
                                    	        }
                                           		setWithLastConsumed(
                                           			current, 
                                           			"selectedValuesLocation",
                                            		lv_selectedValuesLocation_8_0, 
                                            		"STRING");
                                    	    

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;

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
    // $ANTLR end "ruleMultiSelectionDefinition"


    // $ANTLR start "entryRuleCheckboxDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:919:1: entryRuleCheckboxDefinition returns [EObject current=null] : iv_ruleCheckboxDefinition= ruleCheckboxDefinition EOF ;
    public final EObject entryRuleCheckboxDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckboxDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:920:2: (iv_ruleCheckboxDefinition= ruleCheckboxDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:921:2: iv_ruleCheckboxDefinition= ruleCheckboxDefinition EOF
            {
             newCompositeNode(grammarAccess.getCheckboxDefinitionRule()); 
            pushFollow(FOLLOW_ruleCheckboxDefinition_in_entryRuleCheckboxDefinition2029);
            iv_ruleCheckboxDefinition=ruleCheckboxDefinition();

            state._fsp--;

             current =iv_ruleCheckboxDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckboxDefinition2039); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:928:1: ruleCheckboxDefinition returns [EObject current=null] : ( ( (lv_type_0_0= 'Checkbox' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? ) ;
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
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:931:28: ( ( ( (lv_type_0_0= 'Checkbox' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:932:1: ( ( (lv_type_0_0= 'Checkbox' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:932:1: ( ( (lv_type_0_0= 'Checkbox' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:932:2: ( (lv_type_0_0= 'Checkbox' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:932:2: ( (lv_type_0_0= 'Checkbox' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:933:1: (lv_type_0_0= 'Checkbox' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:933:1: (lv_type_0_0= 'Checkbox' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:934:3: lv_type_0_0= 'Checkbox'
            {
            lv_type_0_0=(Token)match(input,27,FOLLOW_27_in_ruleCheckboxDefinition2082); 

                    newLeafNode(lv_type_0_0, grammarAccess.getCheckboxDefinitionAccess().getTypeCheckboxKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCheckboxDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_0_0, "Checkbox");
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleCheckboxDefinition2107); 

                	newLeafNode(otherlv_1, grammarAccess.getCheckboxDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:951:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:952:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:952:1: (lv_name_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:953:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCheckboxDefinition2124); 

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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleCheckboxDefinition2141); 

                	newLeafNode(otherlv_3, grammarAccess.getCheckboxDefinitionAccess().getColonKeyword_3());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:973:1: (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:973:3: otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleCheckboxDefinition2154); 

                        	newLeafNode(otherlv_4, grammarAccess.getCheckboxDefinitionAccess().getTextKeyword_4_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:977:1: ( (lv_text_5_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:978:1: (lv_text_5_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:978:1: (lv_text_5_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:979:3: lv_text_5_0= RULE_STRING
                    {
                    lv_text_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCheckboxDefinition2171); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1003:1: entryRuleRadioboxDefinition returns [EObject current=null] : iv_ruleRadioboxDefinition= ruleRadioboxDefinition EOF ;
    public final EObject entryRuleRadioboxDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadioboxDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1004:2: (iv_ruleRadioboxDefinition= ruleRadioboxDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1005:2: iv_ruleRadioboxDefinition= ruleRadioboxDefinition EOF
            {
             newCompositeNode(grammarAccess.getRadioboxDefinitionRule()); 
            pushFollow(FOLLOW_ruleRadioboxDefinition_in_entryRuleRadioboxDefinition2214);
            iv_ruleRadioboxDefinition=ruleRadioboxDefinition();

            state._fsp--;

             current =iv_ruleRadioboxDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRadioboxDefinition2224); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1012:1: ruleRadioboxDefinition returns [EObject current=null] : ( ( (lv_type_0_0= 'Radiobox' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? ) ;
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
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1015:28: ( ( ( (lv_type_0_0= 'Radiobox' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1016:1: ( ( (lv_type_0_0= 'Radiobox' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1016:1: ( ( (lv_type_0_0= 'Radiobox' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1016:2: ( (lv_type_0_0= 'Radiobox' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1016:2: ( (lv_type_0_0= 'Radiobox' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1017:1: (lv_type_0_0= 'Radiobox' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1017:1: (lv_type_0_0= 'Radiobox' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1018:3: lv_type_0_0= 'Radiobox'
            {
            lv_type_0_0=(Token)match(input,30,FOLLOW_30_in_ruleRadioboxDefinition2267); 

                    newLeafNode(lv_type_0_0, grammarAccess.getRadioboxDefinitionAccess().getTypeRadioboxKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRadioboxDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_0_0, "Radiobox");
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleRadioboxDefinition2292); 

                	newLeafNode(otherlv_1, grammarAccess.getRadioboxDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1035:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1036:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1036:1: (lv_name_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1037:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRadioboxDefinition2309); 

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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleRadioboxDefinition2326); 

                	newLeafNode(otherlv_3, grammarAccess.getRadioboxDefinitionAccess().getColonKeyword_3());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1057:1: (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1057:3: otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleRadioboxDefinition2339); 

                        	newLeafNode(otherlv_4, grammarAccess.getRadioboxDefinitionAccess().getTextKeyword_4_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1061:1: ( (lv_text_5_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1062:1: (lv_text_5_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1062:1: (lv_text_5_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1063:3: lv_text_5_0= RULE_STRING
                    {
                    lv_text_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRadioboxDefinition2356); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1087:1: entryRuleTableDefinition returns [EObject current=null] : iv_ruleTableDefinition= ruleTableDefinition EOF ;
    public final EObject entryRuleTableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1088:2: (iv_ruleTableDefinition= ruleTableDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1089:2: iv_ruleTableDefinition= ruleTableDefinition EOF
            {
             newCompositeNode(grammarAccess.getTableDefinitionRule()); 
            pushFollow(FOLLOW_ruleTableDefinition_in_entryRuleTableDefinition2399);
            iv_ruleTableDefinition=ruleTableDefinition();

            state._fsp--;

             current =iv_ruleTableDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableDefinition2409); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1096:1: ruleTableDefinition returns [EObject current=null] : ( ( (lv_type_0_0= 'Table' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? ) ;
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
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1099:28: ( ( ( (lv_type_0_0= 'Table' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1100:1: ( ( (lv_type_0_0= 'Table' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1100:1: ( ( (lv_type_0_0= 'Table' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1100:2: ( (lv_type_0_0= 'Table' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1100:2: ( (lv_type_0_0= 'Table' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1101:1: (lv_type_0_0= 'Table' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1101:1: (lv_type_0_0= 'Table' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1102:3: lv_type_0_0= 'Table'
            {
            lv_type_0_0=(Token)match(input,31,FOLLOW_31_in_ruleTableDefinition2452); 

                    newLeafNode(lv_type_0_0, grammarAccess.getTableDefinitionAccess().getTypeTableKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTableDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_0_0, "Table");
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleTableDefinition2477); 

                	newLeafNode(otherlv_1, grammarAccess.getTableDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1119:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1120:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1120:1: (lv_name_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1121:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTableDefinition2494); 

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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleTableDefinition2511); 

                	newLeafNode(otherlv_3, grammarAccess.getTableDefinitionAccess().getColonKeyword_3());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1141:1: (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1141:3: otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleTableDefinition2524); 

                        	newLeafNode(otherlv_4, grammarAccess.getTableDefinitionAccess().getTextKeyword_4_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1145:1: ( (lv_text_5_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1146:1: (lv_text_5_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1146:1: (lv_text_5_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1147:3: lv_text_5_0= RULE_STRING
                    {
                    lv_text_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTableDefinition2541); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1171:1: entryRuleTreeDefinition returns [EObject current=null] : iv_ruleTreeDefinition= ruleTreeDefinition EOF ;
    public final EObject entryRuleTreeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTreeDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1172:2: (iv_ruleTreeDefinition= ruleTreeDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1173:2: iv_ruleTreeDefinition= ruleTreeDefinition EOF
            {
             newCompositeNode(grammarAccess.getTreeDefinitionRule()); 
            pushFollow(FOLLOW_ruleTreeDefinition_in_entryRuleTreeDefinition2584);
            iv_ruleTreeDefinition=ruleTreeDefinition();

            state._fsp--;

             current =iv_ruleTreeDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTreeDefinition2594); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1180:1: ruleTreeDefinition returns [EObject current=null] : ( ( (lv_type_0_0= 'Tree' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? ) ;
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
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1183:28: ( ( ( (lv_type_0_0= 'Tree' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1184:1: ( ( (lv_type_0_0= 'Tree' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1184:1: ( ( (lv_type_0_0= 'Tree' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1184:2: ( (lv_type_0_0= 'Tree' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1184:2: ( (lv_type_0_0= 'Tree' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1185:1: (lv_type_0_0= 'Tree' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1185:1: (lv_type_0_0= 'Tree' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1186:3: lv_type_0_0= 'Tree'
            {
            lv_type_0_0=(Token)match(input,32,FOLLOW_32_in_ruleTreeDefinition2637); 

                    newLeafNode(lv_type_0_0, grammarAccess.getTreeDefinitionAccess().getTypeTreeKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTreeDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_0_0, "Tree");
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleTreeDefinition2662); 

                	newLeafNode(otherlv_1, grammarAccess.getTreeDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1203:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1204:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1204:1: (lv_name_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1205:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTreeDefinition2679); 

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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleTreeDefinition2696); 

                	newLeafNode(otherlv_3, grammarAccess.getTreeDefinitionAccess().getColonKeyword_3());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1225:1: (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1225:3: otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleTreeDefinition2709); 

                        	newLeafNode(otherlv_4, grammarAccess.getTreeDefinitionAccess().getTextKeyword_4_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1229:1: ( (lv_text_5_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1230:1: (lv_text_5_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1230:1: (lv_text_5_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1231:3: lv_text_5_0= RULE_STRING
                    {
                    lv_text_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTreeDefinition2726); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1255:1: entryRuleTextfieldDefinition returns [EObject current=null] : iv_ruleTextfieldDefinition= ruleTextfieldDefinition EOF ;
    public final EObject entryRuleTextfieldDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextfieldDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1256:2: (iv_ruleTextfieldDefinition= ruleTextfieldDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1257:2: iv_ruleTextfieldDefinition= ruleTextfieldDefinition EOF
            {
             newCompositeNode(grammarAccess.getTextfieldDefinitionRule()); 
            pushFollow(FOLLOW_ruleTextfieldDefinition_in_entryRuleTextfieldDefinition2769);
            iv_ruleTextfieldDefinition=ruleTextfieldDefinition();

            state._fsp--;

             current =iv_ruleTextfieldDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextfieldDefinition2779); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1264:1: ruleTextfieldDefinition returns [EObject current=null] : ( ( (lv_type_0_0= 'Textfield' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? ) ;
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
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1267:28: ( ( ( (lv_type_0_0= 'Textfield' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1268:1: ( ( (lv_type_0_0= 'Textfield' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1268:1: ( ( (lv_type_0_0= 'Textfield' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1268:2: ( (lv_type_0_0= 'Textfield' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1268:2: ( (lv_type_0_0= 'Textfield' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1269:1: (lv_type_0_0= 'Textfield' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1269:1: (lv_type_0_0= 'Textfield' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1270:3: lv_type_0_0= 'Textfield'
            {
            lv_type_0_0=(Token)match(input,33,FOLLOW_33_in_ruleTextfieldDefinition2822); 

                    newLeafNode(lv_type_0_0, grammarAccess.getTextfieldDefinitionAccess().getTypeTextfieldKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextfieldDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_0_0, "Textfield");
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleTextfieldDefinition2847); 

                	newLeafNode(otherlv_1, grammarAccess.getTextfieldDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1287:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1288:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1288:1: (lv_name_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1289:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextfieldDefinition2864); 

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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleTextfieldDefinition2881); 

                	newLeafNode(otherlv_3, grammarAccess.getTextfieldDefinitionAccess().getColonKeyword_3());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1309:1: (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1309:3: otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleTextfieldDefinition2894); 

                        	newLeafNode(otherlv_4, grammarAccess.getTextfieldDefinitionAccess().getTextKeyword_4_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1313:1: ( (lv_text_5_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1314:1: (lv_text_5_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1314:1: (lv_text_5_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1315:3: lv_text_5_0= RULE_STRING
                    {
                    lv_text_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextfieldDefinition2911); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1339:1: entryRuleButtonDefinition returns [EObject current=null] : iv_ruleButtonDefinition= ruleButtonDefinition EOF ;
    public final EObject entryRuleButtonDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1340:2: (iv_ruleButtonDefinition= ruleButtonDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1341:2: iv_ruleButtonDefinition= ruleButtonDefinition EOF
            {
             newCompositeNode(grammarAccess.getButtonDefinitionRule()); 
            pushFollow(FOLLOW_ruleButtonDefinition_in_entryRuleButtonDefinition2954);
            iv_ruleButtonDefinition=ruleButtonDefinition();

            state._fsp--;

             current =iv_ruleButtonDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonDefinition2964); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1348:1: ruleButtonDefinition returns [EObject current=null] : ( ( (lv_type_0_0= 'Button' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? (otherlv_6= 'interaction=' ( (lv_interaction_7_0= ruleInteraction ) ) )? ) ;
    public final EObject ruleButtonDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_text_5_0=null;
        Token otherlv_6=null;
        EObject lv_interaction_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1351:28: ( ( ( (lv_type_0_0= 'Button' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? (otherlv_6= 'interaction=' ( (lv_interaction_7_0= ruleInteraction ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1352:1: ( ( (lv_type_0_0= 'Button' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? (otherlv_6= 'interaction=' ( (lv_interaction_7_0= ruleInteraction ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1352:1: ( ( (lv_type_0_0= 'Button' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? (otherlv_6= 'interaction=' ( (lv_interaction_7_0= ruleInteraction ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1352:2: ( (lv_type_0_0= 'Button' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? (otherlv_6= 'interaction=' ( (lv_interaction_7_0= ruleInteraction ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1352:2: ( (lv_type_0_0= 'Button' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1353:1: (lv_type_0_0= 'Button' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1353:1: (lv_type_0_0= 'Button' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1354:3: lv_type_0_0= 'Button'
            {
            lv_type_0_0=(Token)match(input,34,FOLLOW_34_in_ruleButtonDefinition3007); 

                    newLeafNode(lv_type_0_0, grammarAccess.getButtonDefinitionAccess().getTypeButtonKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getButtonDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_0_0, "Button");
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleButtonDefinition3032); 

                	newLeafNode(otherlv_1, grammarAccess.getButtonDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1371:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1372:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1372:1: (lv_name_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1373:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleButtonDefinition3049); 

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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleButtonDefinition3066); 

                	newLeafNode(otherlv_3, grammarAccess.getButtonDefinitionAccess().getColonKeyword_3());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1393:1: (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1393:3: otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleButtonDefinition3079); 

                        	newLeafNode(otherlv_4, grammarAccess.getButtonDefinitionAccess().getTextKeyword_4_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1397:1: ( (lv_text_5_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1398:1: (lv_text_5_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1398:1: (lv_text_5_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1399:3: lv_text_5_0= RULE_STRING
                    {
                    lv_text_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleButtonDefinition3096); 

                    			newLeafNode(lv_text_5_0, grammarAccess.getButtonDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getButtonDefinitionRule());
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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1415:4: (otherlv_6= 'interaction=' ( (lv_interaction_7_0= ruleInteraction ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1415:6: otherlv_6= 'interaction=' ( (lv_interaction_7_0= ruleInteraction ) )
                    {
                    otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleButtonDefinition3116); 

                        	newLeafNode(otherlv_6, grammarAccess.getButtonDefinitionAccess().getInteractionKeyword_5_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1419:1: ( (lv_interaction_7_0= ruleInteraction ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1420:1: (lv_interaction_7_0= ruleInteraction )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1420:1: (lv_interaction_7_0= ruleInteraction )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1421:3: lv_interaction_7_0= ruleInteraction
                    {
                     
                    	        newCompositeNode(grammarAccess.getButtonDefinitionAccess().getInteractionInteractionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInteraction_in_ruleButtonDefinition3137);
                    lv_interaction_7_0=ruleInteraction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getButtonDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"interaction",
                            		lv_interaction_7_0, 
                            		"Interaction");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleButtonDefinition"


    // $ANTLR start "entryRuleInteraction"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1445:1: entryRuleInteraction returns [EObject current=null] : iv_ruleInteraction= ruleInteraction EOF ;
    public final EObject entryRuleInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteraction = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1446:2: (iv_ruleInteraction= ruleInteraction EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1447:2: iv_ruleInteraction= ruleInteraction EOF
            {
             newCompositeNode(grammarAccess.getInteractionRule()); 
            pushFollow(FOLLOW_ruleInteraction_in_entryRuleInteraction3175);
            iv_ruleInteraction=ruleInteraction();

            state._fsp--;

             current =iv_ruleInteraction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteraction3185); 

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
    // $ANTLR end "entryRuleInteraction"


    // $ANTLR start "ruleInteraction"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1454:1: ruleInteraction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ' type=' ruleInteractiontype otherlv_3= ' with actions:' ( (lv_actions_4_0= ruleUIAction ) )* ) ;
    public final EObject ruleInteraction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_actions_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1457:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ' type=' ruleInteractiontype otherlv_3= ' with actions:' ( (lv_actions_4_0= ruleUIAction ) )* ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1458:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ' type=' ruleInteractiontype otherlv_3= ' with actions:' ( (lv_actions_4_0= ruleUIAction ) )* )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1458:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ' type=' ruleInteractiontype otherlv_3= ' with actions:' ( (lv_actions_4_0= ruleUIAction ) )* )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1458:2: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ' type=' ruleInteractiontype otherlv_3= ' with actions:' ( (lv_actions_4_0= ruleUIAction ) )*
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1458:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1459:1: (lv_name_0_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1459:1: (lv_name_0_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1460:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInteraction3227); 

            			newLeafNode(lv_name_0_0, grammarAccess.getInteractionAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInteractionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleInteraction3244); 

                	newLeafNode(otherlv_1, grammarAccess.getInteractionAccess().getTypeKeyword_1());
                
             
                    newCompositeNode(grammarAccess.getInteractionAccess().getInteractiontypeParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleInteractiontype_in_ruleInteraction3260);
            ruleInteractiontype();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleInteraction3271); 

                	newLeafNode(otherlv_3, grammarAccess.getInteractionAccess().getWithActionsKeyword_3());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1492:1: ( (lv_actions_4_0= ruleUIAction ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==39) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1493:1: (lv_actions_4_0= ruleUIAction )
            	    {
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1493:1: (lv_actions_4_0= ruleUIAction )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1494:3: lv_actions_4_0= ruleUIAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInteractionAccess().getActionsUIActionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUIAction_in_ruleInteraction3292);
            	    lv_actions_4_0=ruleUIAction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInteractionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actions",
            	            		lv_actions_4_0, 
            	            		"UIAction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


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
    // $ANTLR end "ruleInteraction"


    // $ANTLR start "entryRuleLabelDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1518:1: entryRuleLabelDefinition returns [EObject current=null] : iv_ruleLabelDefinition= ruleLabelDefinition EOF ;
    public final EObject entryRuleLabelDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1519:2: (iv_ruleLabelDefinition= ruleLabelDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1520:2: iv_ruleLabelDefinition= ruleLabelDefinition EOF
            {
             newCompositeNode(grammarAccess.getLabelDefinitionRule()); 
            pushFollow(FOLLOW_ruleLabelDefinition_in_entryRuleLabelDefinition3329);
            iv_ruleLabelDefinition=ruleLabelDefinition();

            state._fsp--;

             current =iv_ruleLabelDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelDefinition3339); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1527:1: ruleLabelDefinition returns [EObject current=null] : ( ( (lv_type_0_0= 'Label' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleLabelDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_text_5_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1530:28: ( ( ( (lv_type_0_0= 'Label' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1531:1: ( ( (lv_type_0_0= 'Label' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1531:1: ( ( (lv_type_0_0= 'Label' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1531:2: ( (lv_type_0_0= 'Label' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1531:2: ( (lv_type_0_0= 'Label' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1532:1: (lv_type_0_0= 'Label' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1532:1: (lv_type_0_0= 'Label' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1533:3: lv_type_0_0= 'Label'
            {
            lv_type_0_0=(Token)match(input,38,FOLLOW_38_in_ruleLabelDefinition3382); 

                    newLeafNode(lv_type_0_0, grammarAccess.getLabelDefinitionAccess().getTypeLabelKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_0_0, "Label");
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleLabelDefinition3407); 

                	newLeafNode(otherlv_1, grammarAccess.getLabelDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1550:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1551:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1551:1: (lv_name_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1552:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabelDefinition3424); 

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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleLabelDefinition3441); 

                	newLeafNode(otherlv_3, grammarAccess.getLabelDefinitionAccess().getColonKeyword_3());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1572:1: (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1572:3: otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleLabelDefinition3454); 

                        	newLeafNode(otherlv_4, grammarAccess.getLabelDefinitionAccess().getTextKeyword_4_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1576:1: ( (lv_text_5_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1577:1: (lv_text_5_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1577:1: (lv_text_5_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1578:3: lv_text_5_0= RULE_STRING
                    {
                    lv_text_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabelDefinition3471); 

                    			newLeafNode(lv_text_5_0, grammarAccess.getLabelDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelDefinitionRule());
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
    // $ANTLR end "ruleLabelDefinition"


    // $ANTLR start "entryRuleUIAction"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1602:1: entryRuleUIAction returns [EObject current=null] : iv_ruleUIAction= ruleUIAction EOF ;
    public final EObject entryRuleUIAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIAction = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1603:2: (iv_ruleUIAction= ruleUIAction EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1604:2: iv_ruleUIAction= ruleUIAction EOF
            {
             newCompositeNode(grammarAccess.getUIActionRule()); 
            pushFollow(FOLLOW_ruleUIAction_in_entryRuleUIAction3514);
            iv_ruleUIAction=ruleUIAction();

            state._fsp--;

             current =iv_ruleUIAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIAction3524); 

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
    // $ANTLR end "entryRuleUIAction"


    // $ANTLR start "ruleUIAction"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1611:1: ruleUIAction returns [EObject current=null] : (otherlv_0= 'type=' ( (lv_type_1_0= 'UiAction' ) ) otherlv_2= 'element=' ( (lv_uiElementName_3_0= RULE_STRING ) ) otherlv_4= ':' ( (lv_properties_5_0= ruleProperty ) )* ) ;
    public final EObject ruleUIAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_2=null;
        Token lv_uiElementName_3_0=null;
        Token otherlv_4=null;
        EObject lv_properties_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1614:28: ( (otherlv_0= 'type=' ( (lv_type_1_0= 'UiAction' ) ) otherlv_2= 'element=' ( (lv_uiElementName_3_0= RULE_STRING ) ) otherlv_4= ':' ( (lv_properties_5_0= ruleProperty ) )* ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1615:1: (otherlv_0= 'type=' ( (lv_type_1_0= 'UiAction' ) ) otherlv_2= 'element=' ( (lv_uiElementName_3_0= RULE_STRING ) ) otherlv_4= ':' ( (lv_properties_5_0= ruleProperty ) )* )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1615:1: (otherlv_0= 'type=' ( (lv_type_1_0= 'UiAction' ) ) otherlv_2= 'element=' ( (lv_uiElementName_3_0= RULE_STRING ) ) otherlv_4= ':' ( (lv_properties_5_0= ruleProperty ) )* )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1615:3: otherlv_0= 'type=' ( (lv_type_1_0= 'UiAction' ) ) otherlv_2= 'element=' ( (lv_uiElementName_3_0= RULE_STRING ) ) otherlv_4= ':' ( (lv_properties_5_0= ruleProperty ) )*
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleUIAction3561); 

                	newLeafNode(otherlv_0, grammarAccess.getUIActionAccess().getTypeKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1619:1: ( (lv_type_1_0= 'UiAction' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1620:1: (lv_type_1_0= 'UiAction' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1620:1: (lv_type_1_0= 'UiAction' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1621:3: lv_type_1_0= 'UiAction'
            {
            lv_type_1_0=(Token)match(input,40,FOLLOW_40_in_ruleUIAction3579); 

                    newLeafNode(lv_type_1_0, grammarAccess.getUIActionAccess().getTypeUiActionKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUIActionRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_1_0, "UiAction");
            	    

            }


            }

            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleUIAction3604); 

                	newLeafNode(otherlv_2, grammarAccess.getUIActionAccess().getElementKeyword_2());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1638:1: ( (lv_uiElementName_3_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1639:1: (lv_uiElementName_3_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1639:1: (lv_uiElementName_3_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1640:3: lv_uiElementName_3_0= RULE_STRING
            {
            lv_uiElementName_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUIAction3621); 

            			newLeafNode(lv_uiElementName_3_0, grammarAccess.getUIActionAccess().getUiElementNameSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUIActionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"uiElementName",
                    		lv_uiElementName_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleUIAction3638); 

                	newLeafNode(otherlv_4, grammarAccess.getUIActionAccess().getColonKeyword_4());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1660:1: ( (lv_properties_5_0= ruleProperty ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==43) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1661:1: (lv_properties_5_0= ruleProperty )
            	    {
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1661:1: (lv_properties_5_0= ruleProperty )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1662:3: lv_properties_5_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUIActionAccess().getPropertiesPropertyParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleUIAction3659);
            	    lv_properties_5_0=ruleProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUIActionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_5_0, 
            	            		"Property");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


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
    // $ANTLR end "ruleUIAction"


    // $ANTLR start "entryRuleProperty"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1686:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1687:2: (iv_ruleProperty= ruleProperty EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1688:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty3696);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty3706); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1695:1: ruleProperty returns [EObject current=null] : this_CommonProperty_0= ruleCommonProperty ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_CommonProperty_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1698:28: (this_CommonProperty_0= ruleCommonProperty )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1700:5: this_CommonProperty_0= ruleCommonProperty
            {
             
                    newCompositeNode(grammarAccess.getPropertyAccess().getCommonPropertyParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleCommonProperty_in_ruleProperty3752);
            this_CommonProperty_0=ruleCommonProperty();

            state._fsp--;

             
                    current = this_CommonProperty_0; 
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleCommonProperty"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1716:1: entryRuleCommonProperty returns [EObject current=null] : iv_ruleCommonProperty= ruleCommonProperty EOF ;
    public final EObject entryRuleCommonProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonProperty = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1717:2: (iv_ruleCommonProperty= ruleCommonProperty EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1718:2: iv_ruleCommonProperty= ruleCommonProperty EOF
            {
             newCompositeNode(grammarAccess.getCommonPropertyRule()); 
            pushFollow(FOLLOW_ruleCommonProperty_in_entryRuleCommonProperty3786);
            iv_ruleCommonProperty=ruleCommonProperty();

            state._fsp--;

             current =iv_ruleCommonProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonProperty3796); 

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
    // $ANTLR end "entryRuleCommonProperty"


    // $ANTLR start "ruleCommonProperty"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1725:1: ruleCommonProperty returns [EObject current=null] : ( ( (lv_name_0_0= ruleCommonPropertyType ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleCommonProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1728:28: ( ( ( (lv_name_0_0= ruleCommonPropertyType ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1729:1: ( ( (lv_name_0_0= ruleCommonPropertyType ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1729:1: ( ( (lv_name_0_0= ruleCommonPropertyType ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1729:2: ( (lv_name_0_0= ruleCommonPropertyType ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1729:2: ( (lv_name_0_0= ruleCommonPropertyType ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1730:1: (lv_name_0_0= ruleCommonPropertyType )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1730:1: (lv_name_0_0= ruleCommonPropertyType )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1731:3: lv_name_0_0= ruleCommonPropertyType
            {
             
            	        newCompositeNode(grammarAccess.getCommonPropertyAccess().getNameCommonPropertyTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCommonPropertyType_in_ruleCommonProperty3842);
            lv_name_0_0=ruleCommonPropertyType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCommonPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"CommonPropertyType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleCommonProperty3854); 

                	newLeafNode(otherlv_1, grammarAccess.getCommonPropertyAccess().getEqualsSignKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1751:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1752:1: (lv_value_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1752:1: (lv_value_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1753:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCommonProperty3871); 

            			newLeafNode(lv_value_2_0, grammarAccess.getCommonPropertyAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCommonPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
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
    // $ANTLR end "ruleCommonProperty"


    // $ANTLR start "entryRuleCommonPropertyType"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1777:1: entryRuleCommonPropertyType returns [String current=null] : iv_ruleCommonPropertyType= ruleCommonPropertyType EOF ;
    public final String entryRuleCommonPropertyType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommonPropertyType = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1778:2: (iv_ruleCommonPropertyType= ruleCommonPropertyType EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1779:2: iv_ruleCommonPropertyType= ruleCommonPropertyType EOF
            {
             newCompositeNode(grammarAccess.getCommonPropertyTypeRule()); 
            pushFollow(FOLLOW_ruleCommonPropertyType_in_entryRuleCommonPropertyType3913);
            iv_ruleCommonPropertyType=ruleCommonPropertyType();

            state._fsp--;

             current =iv_ruleCommonPropertyType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonPropertyType3924); 

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
    // $ANTLR end "entryRuleCommonPropertyType"


    // $ANTLR start "ruleCommonPropertyType"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1786:1: ruleCommonPropertyType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Text' ;
    public final AntlrDatatypeRuleToken ruleCommonPropertyType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1789:28: (kw= 'Text' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1791:2: kw= 'Text'
            {
            kw=(Token)match(input,43,FOLLOW_43_in_ruleCommonPropertyType3961); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCommonPropertyTypeAccess().getTextKeyword()); 
                

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
    // $ANTLR end "ruleCommonPropertyType"


    // $ANTLR start "entryRuleInteractiontype"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1804:1: entryRuleInteractiontype returns [String current=null] : iv_ruleInteractiontype= ruleInteractiontype EOF ;
    public final String entryRuleInteractiontype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteractiontype = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1805:2: (iv_ruleInteractiontype= ruleInteractiontype EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1806:2: iv_ruleInteractiontype= ruleInteractiontype EOF
            {
             newCompositeNode(grammarAccess.getInteractiontypeRule()); 
            pushFollow(FOLLOW_ruleInteractiontype_in_entryRuleInteractiontype4001);
            iv_ruleInteractiontype=ruleInteractiontype();

            state._fsp--;

             current =iv_ruleInteractiontype.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractiontype4012); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1813:1: ruleInteractiontype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'CLICK' ;
    public final AntlrDatatypeRuleToken ruleInteractiontype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1816:28: (kw= 'CLICK' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1818:2: kw= 'CLICK'
            {
            kw=(Token)match(input,44,FOLLOW_44_in_ruleInteractiontype4049); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getInteractiontypeAccess().getCLICKKeyword()); 
                

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
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleUIDescription197 = new BitSet(new long[]{0x000000000020E812L});
    public static final BitSet FOLLOW_ruleUsedDescriptions_in_ruleUIDescription218 = new BitSet(new long[]{0x000000000020E812L});
    public static final BitSet FOLLOW_ruleinputType_in_ruleUIDescription295 = new BitSet(new long[]{0x000000000020C812L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleUIDescription372 = new BitSet(new long[]{0x000000000020C812L});
    public static final BitSet FOLLOW_ruleAreaAssignment_in_ruleUIDescription394 = new BitSet(new long[]{0x000000000020C812L});
    public static final BitSet FOLLOW_ruleinputType_in_entryRuleinputType477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinputType487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleinputType524 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleinputType541 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleinputType558 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleinputType575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsedDescriptions_in_entryRuleUsedDescriptions616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsedDescriptions626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleUsedDescriptions663 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUIDescriptionImport_in_ruleUsedDescriptions684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAreaCount_in_entryRuleAreaCount720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAreaCount730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleAreaCount767 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAreaCount784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleDefinition872 = new BitSet(new long[]{0x00000047C9000000L});
    public static final BitSet FOLLOW_ruleComponentDefinition_in_ruleDefinition893 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDefinition905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition941 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleTypeDefinition988 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_ruleTYPE_in_ruleTypeDefinition1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTYPE_in_entryRuleTYPE1046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTYPE1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleTYPE1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleTYPE1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIDescriptionImport_in_entryRuleUIDescriptionImport1154 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIDescriptionImport1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUIDescriptionImport1206 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleUIDescriptionImport1224 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUIDescriptionImport1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAreaAssignment_in_entryRuleAreaAssignment1284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAreaAssignment1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAreaAssignment1332 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAreaAssignment1349 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAreaAssignment1366 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAreaAssignment1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAreaAssignment1413 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAreaAssignment1430 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAreaAssignment1442 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAreaAssignment1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDefinition_in_entryRuleComponentDefinition1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentDefinition1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelDefinition_in_ruleComponentDefinition1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonDefinition_in_ruleComponentDefinition1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfieldDefinition_in_ruleComponentDefinition1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreeDefinition_in_ruleComponentDefinition1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableDefinition_in_ruleComponentDefinition1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadioboxDefinition_in_ruleComponentDefinition1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckboxDefinition_in_ruleComponentDefinition1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiSelectionDefinition_in_ruleComponentDefinition1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiSelectionDefinition_in_entryRuleMultiSelectionDefinition1782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiSelectionDefinition1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleMultiSelectionDefinition1835 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMultiSelectionDefinition1860 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMultiSelectionDefinition1877 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleMultiSelectionDefinition1895 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMultiSelectionDefinition1912 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleMultiSelectionDefinition1930 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMultiSelectionDefinition1947 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleMultiSelectionDefinition1965 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMultiSelectionDefinition1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckboxDefinition_in_entryRuleCheckboxDefinition2029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckboxDefinition2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleCheckboxDefinition2082 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCheckboxDefinition2107 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCheckboxDefinition2124 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCheckboxDefinition2141 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleCheckboxDefinition2154 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCheckboxDefinition2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadioboxDefinition_in_entryRuleRadioboxDefinition2214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRadioboxDefinition2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleRadioboxDefinition2267 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRadioboxDefinition2292 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRadioboxDefinition2309 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleRadioboxDefinition2326 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleRadioboxDefinition2339 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRadioboxDefinition2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableDefinition_in_entryRuleTableDefinition2399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableDefinition2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleTableDefinition2452 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTableDefinition2477 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTableDefinition2494 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTableDefinition2511 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleTableDefinition2524 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTableDefinition2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreeDefinition_in_entryRuleTreeDefinition2584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTreeDefinition2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleTreeDefinition2637 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTreeDefinition2662 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTreeDefinition2679 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTreeDefinition2696 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleTreeDefinition2709 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTreeDefinition2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfieldDefinition_in_entryRuleTextfieldDefinition2769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextfieldDefinition2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleTextfieldDefinition2822 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTextfieldDefinition2847 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextfieldDefinition2864 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTextfieldDefinition2881 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleTextfieldDefinition2894 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextfieldDefinition2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonDefinition_in_entryRuleButtonDefinition2954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonDefinition2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleButtonDefinition3007 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleButtonDefinition3032 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleButtonDefinition3049 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleButtonDefinition3066 = new BitSet(new long[]{0x0000000820000002L});
    public static final BitSet FOLLOW_29_in_ruleButtonDefinition3079 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleButtonDefinition3096 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleButtonDefinition3116 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInteraction_in_ruleButtonDefinition3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteraction_in_entryRuleInteraction3175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteraction3185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInteraction3227 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleInteraction3244 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleInteractiontype_in_ruleInteraction3260 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleInteraction3271 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleUIAction_in_ruleInteraction3292 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleLabelDefinition_in_entryRuleLabelDefinition3329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelDefinition3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleLabelDefinition3382 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleLabelDefinition3407 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabelDefinition3424 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleLabelDefinition3441 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleLabelDefinition3454 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabelDefinition3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIAction_in_entryRuleUIAction3514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIAction3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleUIAction3561 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleUIAction3579 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleUIAction3604 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUIAction3621 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleUIAction3638 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleUIAction3659 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty3696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty3706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperty_in_ruleProperty3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperty_in_entryRuleCommonProperty3786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonProperty3796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonPropertyType_in_ruleCommonProperty3842 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleCommonProperty3854 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCommonProperty3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonPropertyType_in_entryRuleCommonPropertyType3913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonPropertyType3924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleCommonPropertyType3961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractiontype_in_entryRuleInteractiontype4001 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractiontype4012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleInteractiontype4049 = new BitSet(new long[]{0x0000000000000002L});

}
