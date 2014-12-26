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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_WS", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'REFINE'", "'END REFINE'", "'Button'", "' with name: '", "'Label'", "'get properties from:'", "'use: '", "' as: '", "'Area count: '", "'DEF '", "'END DEF'", "'type: '", "'WINDOW'", "'INNERCOMPLEX'", "'Multiselection'", "'<'", "'>'", "'Area:'", "'<-'", "'->'", "'Checkbox'", "' as '", "':'", "'text='", "'Radiobox'", "'Table'", "'Tree'", "'Textfield'", "'propertyKey='", "'interactiontype='", "'Click'", "'ChangeText'"
    };
    public static final int T__42=42;
    public static final int RULE_ID=7;
    public static final int T__40=40;
    public static final int T__41=41;
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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:76:1: ruleUIDescription returns [EObject current=null] : ( ( (lv_areaCount_0_0= ruleAreaCount ) ) ( (lv_typeDefinition_1_0= ruleTypeDefinition ) ) ( (lv_property_2_0= ruleProperty ) )? ( (lv_usedDescriptions_3_0= ruleUsedDescriptions ) )* ( (lv_refinements_4_0= ruleRefinement ) )* ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* ) ;
    public final EObject ruleUIDescription() throws RecognitionException {
        EObject current = null;

        EObject lv_areaCount_0_0 = null;

        EObject lv_typeDefinition_1_0 = null;

        EObject lv_property_2_0 = null;

        EObject lv_usedDescriptions_3_0 = null;

        EObject lv_refinements_4_0 = null;

        EObject lv_definitions_5_0 = null;

        EObject lv_areas_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:79:28: ( ( ( (lv_areaCount_0_0= ruleAreaCount ) ) ( (lv_typeDefinition_1_0= ruleTypeDefinition ) ) ( (lv_property_2_0= ruleProperty ) )? ( (lv_usedDescriptions_3_0= ruleUsedDescriptions ) )* ( (lv_refinements_4_0= ruleRefinement ) )* ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:80:1: ( ( (lv_areaCount_0_0= ruleAreaCount ) ) ( (lv_typeDefinition_1_0= ruleTypeDefinition ) ) ( (lv_property_2_0= ruleProperty ) )? ( (lv_usedDescriptions_3_0= ruleUsedDescriptions ) )* ( (lv_refinements_4_0= ruleRefinement ) )* ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:80:1: ( ( (lv_areaCount_0_0= ruleAreaCount ) ) ( (lv_typeDefinition_1_0= ruleTypeDefinition ) ) ( (lv_property_2_0= ruleProperty ) )? ( (lv_usedDescriptions_3_0= ruleUsedDescriptions ) )* ( (lv_refinements_4_0= ruleRefinement ) )* ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )* )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:80:2: ( (lv_areaCount_0_0= ruleAreaCount ) ) ( (lv_typeDefinition_1_0= ruleTypeDefinition ) ) ( (lv_property_2_0= ruleProperty ) )? ( (lv_usedDescriptions_3_0= ruleUsedDescriptions ) )* ( (lv_refinements_4_0= ruleRefinement ) )* ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_areas_6_0= ruleAreaAssignment ) )*
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:80:2: ( (lv_areaCount_0_0= ruleAreaCount ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:81:1: (lv_areaCount_0_0= ruleAreaCount )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:81:1: (lv_areaCount_0_0= ruleAreaCount )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:82:3: lv_areaCount_0_0= ruleAreaCount
            {
             
            	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getAreaCountAreaCountParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAreaCount_in_ruleUIDescription131);
            lv_areaCount_0_0=ruleAreaCount();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUIDescriptionRule());
            	        }
                   		set(
                   			current, 
                   			"areaCount",
                    		lv_areaCount_0_0, 
                    		"AreaCount");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:98:2: ( (lv_typeDefinition_1_0= ruleTypeDefinition ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:99:1: (lv_typeDefinition_1_0= ruleTypeDefinition )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:99:1: (lv_typeDefinition_1_0= ruleTypeDefinition )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:100:3: lv_typeDefinition_1_0= ruleTypeDefinition
            {
             
            	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getTypeDefinitionTypeDefinitionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeDefinition_in_ruleUIDescription152);
            lv_typeDefinition_1_0=ruleTypeDefinition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUIDescriptionRule());
            	        }
                   		set(
                   			current, 
                   			"typeDefinition",
                    		lv_typeDefinition_1_0, 
                    		"TypeDefinition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:116:2: ( (lv_property_2_0= ruleProperty ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:117:1: (lv_property_2_0= ruleProperty )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:117:1: (lv_property_2_0= ruleProperty )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:118:3: lv_property_2_0= ruleProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getPropertyPropertyParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProperty_in_ruleUIDescription173);
                    lv_property_2_0=ruleProperty();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUIDescriptionRule());
                    	        }
                           		set(
                           			current, 
                           			"property",
                            		lv_property_2_0, 
                            		"Property");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:134:3: ( (lv_usedDescriptions_3_0= ruleUsedDescriptions ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:135:1: (lv_usedDescriptions_3_0= ruleUsedDescriptions )
            	    {
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:135:1: (lv_usedDescriptions_3_0= ruleUsedDescriptions )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:136:3: lv_usedDescriptions_3_0= ruleUsedDescriptions
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getUsedDescriptionsUsedDescriptionsParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUsedDescriptions_in_ruleUIDescription195);
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
            	    break loop2;
                }
            } while (true);

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:152:3: ( (lv_refinements_4_0= ruleRefinement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:153:1: (lv_refinements_4_0= ruleRefinement )
            	    {
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:153:1: (lv_refinements_4_0= ruleRefinement )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:154:3: lv_refinements_4_0= ruleRefinement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getRefinementsRefinementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRefinement_in_ruleUIDescription217);
            	    lv_refinements_4_0=ruleRefinement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUIDescriptionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"refinements",
            	            		lv_refinements_4_0, 
            	            		"Refinement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:170:3: ( (lv_definitions_5_0= ruleDefinition ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:171:1: (lv_definitions_5_0= ruleDefinition )
            	    {
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:171:1: (lv_definitions_5_0= ruleDefinition )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:172:3: lv_definitions_5_0= ruleDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getDefinitionsDefinitionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDefinition_in_ruleUIDescription239);
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
            	    break loop4;
                }
            } while (true);

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:188:3: ( (lv_areas_6_0= ruleAreaAssignment ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING||LA5_0==28) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:189:1: (lv_areas_6_0= ruleAreaAssignment )
            	    {
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:189:1: (lv_areas_6_0= ruleAreaAssignment )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:190:3: lv_areas_6_0= ruleAreaAssignment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getAreasAreaAssignmentParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAreaAssignment_in_ruleUIDescription261);
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
            	    break loop5;
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
    // $ANTLR end "ruleUIDescription"


    // $ANTLR start "entryRuleRefinement"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:214:1: entryRuleRefinement returns [EObject current=null] : iv_ruleRefinement= ruleRefinement EOF ;
    public final EObject entryRuleRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefinement = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:215:2: (iv_ruleRefinement= ruleRefinement EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:216:2: iv_ruleRefinement= ruleRefinement EOF
            {
             newCompositeNode(grammarAccess.getRefinementRule()); 
            pushFollow(FOLLOW_ruleRefinement_in_entryRuleRefinement298);
            iv_ruleRefinement=ruleRefinement();

            state._fsp--;

             current =iv_ruleRefinement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefinement308); 

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
    // $ANTLR end "entryRuleRefinement"


    // $ANTLR start "ruleRefinement"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:223:1: ruleRefinement returns [EObject current=null] : (otherlv_0= 'REFINE' ( (lv_concreteRefinement_1_0= ruleComponentRefinement ) ) otherlv_2= 'END REFINE' ) ;
    public final EObject ruleRefinement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_concreteRefinement_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:226:28: ( (otherlv_0= 'REFINE' ( (lv_concreteRefinement_1_0= ruleComponentRefinement ) ) otherlv_2= 'END REFINE' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:227:1: (otherlv_0= 'REFINE' ( (lv_concreteRefinement_1_0= ruleComponentRefinement ) ) otherlv_2= 'END REFINE' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:227:1: (otherlv_0= 'REFINE' ( (lv_concreteRefinement_1_0= ruleComponentRefinement ) ) otherlv_2= 'END REFINE' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:227:3: otherlv_0= 'REFINE' ( (lv_concreteRefinement_1_0= ruleComponentRefinement ) ) otherlv_2= 'END REFINE'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleRefinement345); 

                	newLeafNode(otherlv_0, grammarAccess.getRefinementAccess().getREFINEKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:231:1: ( (lv_concreteRefinement_1_0= ruleComponentRefinement ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:232:1: (lv_concreteRefinement_1_0= ruleComponentRefinement )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:232:1: (lv_concreteRefinement_1_0= ruleComponentRefinement )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:233:3: lv_concreteRefinement_1_0= ruleComponentRefinement
            {
             
            	        newCompositeNode(grammarAccess.getRefinementAccess().getConcreteRefinementComponentRefinementParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleComponentRefinement_in_ruleRefinement366);
            lv_concreteRefinement_1_0=ruleComponentRefinement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRefinementRule());
            	        }
                   		set(
                   			current, 
                   			"concreteRefinement",
                    		lv_concreteRefinement_1_0, 
                    		"ComponentRefinement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRefinement378); 

                	newLeafNode(otherlv_2, grammarAccess.getRefinementAccess().getENDREFINEKeyword_2());
                

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
    // $ANTLR end "ruleRefinement"


    // $ANTLR start "entryRuleComponentRefinement"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:261:1: entryRuleComponentRefinement returns [EObject current=null] : iv_ruleComponentRefinement= ruleComponentRefinement EOF ;
    public final EObject entryRuleComponentRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentRefinement = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:262:2: (iv_ruleComponentRefinement= ruleComponentRefinement EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:263:2: iv_ruleComponentRefinement= ruleComponentRefinement EOF
            {
             newCompositeNode(grammarAccess.getComponentRefinementRule()); 
            pushFollow(FOLLOW_ruleComponentRefinement_in_entryRuleComponentRefinement414);
            iv_ruleComponentRefinement=ruleComponentRefinement();

            state._fsp--;

             current =iv_ruleComponentRefinement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentRefinement424); 

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
    // $ANTLR end "entryRuleComponentRefinement"


    // $ANTLR start "ruleComponentRefinement"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:270:1: ruleComponentRefinement returns [EObject current=null] : (this_LabelRefinement_0= ruleLabelRefinement | this_ButtonRefinement_1= ruleButtonRefinement ) ;
    public final EObject ruleComponentRefinement() throws RecognitionException {
        EObject current = null;

        EObject this_LabelRefinement_0 = null;

        EObject this_ButtonRefinement_1 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:273:28: ( (this_LabelRefinement_0= ruleLabelRefinement | this_ButtonRefinement_1= ruleButtonRefinement ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:274:1: (this_LabelRefinement_0= ruleLabelRefinement | this_ButtonRefinement_1= ruleButtonRefinement )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:274:1: (this_LabelRefinement_0= ruleLabelRefinement | this_ButtonRefinement_1= ruleButtonRefinement )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==13) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:275:5: this_LabelRefinement_0= ruleLabelRefinement
                    {
                     
                            newCompositeNode(grammarAccess.getComponentRefinementAccess().getLabelRefinementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLabelRefinement_in_ruleComponentRefinement471);
                    this_LabelRefinement_0=ruleLabelRefinement();

                    state._fsp--;

                     
                            current = this_LabelRefinement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:285:5: this_ButtonRefinement_1= ruleButtonRefinement
                    {
                     
                            newCompositeNode(grammarAccess.getComponentRefinementAccess().getButtonRefinementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleButtonRefinement_in_ruleComponentRefinement498);
                    this_ButtonRefinement_1=ruleButtonRefinement();

                    state._fsp--;

                     
                            current = this_ButtonRefinement_1; 
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
    // $ANTLR end "ruleComponentRefinement"


    // $ANTLR start "entryRuleButtonRefinement"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:301:1: entryRuleButtonRefinement returns [EObject current=null] : iv_ruleButtonRefinement= ruleButtonRefinement EOF ;
    public final EObject entryRuleButtonRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonRefinement = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:302:2: (iv_ruleButtonRefinement= ruleButtonRefinement EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:303:2: iv_ruleButtonRefinement= ruleButtonRefinement EOF
            {
             newCompositeNode(grammarAccess.getButtonRefinementRule()); 
            pushFollow(FOLLOW_ruleButtonRefinement_in_entryRuleButtonRefinement533);
            iv_ruleButtonRefinement=ruleButtonRefinement();

            state._fsp--;

             current =iv_ruleButtonRefinement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonRefinement543); 

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
    // $ANTLR end "entryRuleButtonRefinement"


    // $ANTLR start "ruleButtonRefinement"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:310:1: ruleButtonRefinement returns [EObject current=null] : ( ( (lv_type_0_0= 'Button' ) ) otherlv_1= ' with name: ' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? ) ;
    public final EObject ruleButtonRefinement() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:313:28: ( ( ( (lv_type_0_0= 'Button' ) ) otherlv_1= ' with name: ' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:314:1: ( ( (lv_type_0_0= 'Button' ) ) otherlv_1= ' with name: ' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:314:1: ( ( (lv_type_0_0= 'Button' ) ) otherlv_1= ' with name: ' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:314:2: ( (lv_type_0_0= 'Button' ) ) otherlv_1= ' with name: ' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:314:2: ( (lv_type_0_0= 'Button' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:315:1: (lv_type_0_0= 'Button' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:315:1: (lv_type_0_0= 'Button' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:316:3: lv_type_0_0= 'Button'
            {
            lv_type_0_0=(Token)match(input,13,FOLLOW_13_in_ruleButtonRefinement586); 

                    newLeafNode(lv_type_0_0, grammarAccess.getButtonRefinementAccess().getTypeButtonKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getButtonRefinementRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_0_0, "Button");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleButtonRefinement611); 

                	newLeafNode(otherlv_1, grammarAccess.getButtonRefinementAccess().getWithNameKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:333:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:334:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:334:1: (lv_name_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:335:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleButtonRefinement628); 

            			newLeafNode(lv_name_2_0, grammarAccess.getButtonRefinementAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getButtonRefinementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:351:2: ( (lv_properties_3_0= ruleProperties ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==33) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:352:1: (lv_properties_3_0= ruleProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:352:1: (lv_properties_3_0= ruleProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:353:3: lv_properties_3_0= ruleProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getButtonRefinementAccess().getPropertiesPropertiesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProperties_in_ruleButtonRefinement654);
                    lv_properties_3_0=ruleProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getButtonRefinementRule());
                    	        }
                           		set(
                           			current, 
                           			"properties",
                            		lv_properties_3_0, 
                            		"Properties");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleButtonRefinement"


    // $ANTLR start "entryRuleLabelRefinement"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:377:1: entryRuleLabelRefinement returns [EObject current=null] : iv_ruleLabelRefinement= ruleLabelRefinement EOF ;
    public final EObject entryRuleLabelRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelRefinement = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:378:2: (iv_ruleLabelRefinement= ruleLabelRefinement EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:379:2: iv_ruleLabelRefinement= ruleLabelRefinement EOF
            {
             newCompositeNode(grammarAccess.getLabelRefinementRule()); 
            pushFollow(FOLLOW_ruleLabelRefinement_in_entryRuleLabelRefinement691);
            iv_ruleLabelRefinement=ruleLabelRefinement();

            state._fsp--;

             current =iv_ruleLabelRefinement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelRefinement701); 

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
    // $ANTLR end "entryRuleLabelRefinement"


    // $ANTLR start "ruleLabelRefinement"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:386:1: ruleLabelRefinement returns [EObject current=null] : ( ( (lv_type_0_0= 'Label' ) ) otherlv_1= ' with name: ' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? ) ;
    public final EObject ruleLabelRefinement() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:389:28: ( ( ( (lv_type_0_0= 'Label' ) ) otherlv_1= ' with name: ' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:390:1: ( ( (lv_type_0_0= 'Label' ) ) otherlv_1= ' with name: ' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:390:1: ( ( (lv_type_0_0= 'Label' ) ) otherlv_1= ' with name: ' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:390:2: ( (lv_type_0_0= 'Label' ) ) otherlv_1= ' with name: ' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:390:2: ( (lv_type_0_0= 'Label' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:391:1: (lv_type_0_0= 'Label' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:391:1: (lv_type_0_0= 'Label' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:392:3: lv_type_0_0= 'Label'
            {
            lv_type_0_0=(Token)match(input,15,FOLLOW_15_in_ruleLabelRefinement744); 

                    newLeafNode(lv_type_0_0, grammarAccess.getLabelRefinementAccess().getTypeLabelKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelRefinementRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_0_0, "Label");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleLabelRefinement769); 

                	newLeafNode(otherlv_1, grammarAccess.getLabelRefinementAccess().getWithNameKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:409:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:410:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:410:1: (lv_name_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:411:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabelRefinement786); 

            			newLeafNode(lv_name_2_0, grammarAccess.getLabelRefinementAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelRefinementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:427:2: ( (lv_properties_3_0= ruleProperties ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==33) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:428:1: (lv_properties_3_0= ruleProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:428:1: (lv_properties_3_0= ruleProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:429:3: lv_properties_3_0= ruleProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getLabelRefinementAccess().getPropertiesPropertiesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProperties_in_ruleLabelRefinement812);
                    lv_properties_3_0=ruleProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLabelRefinementRule());
                    	        }
                           		set(
                           			current, 
                           			"properties",
                            		lv_properties_3_0, 
                            		"Properties");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleLabelRefinement"


    // $ANTLR start "entryRuleProperty"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:453:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:454:2: (iv_ruleProperty= ruleProperty EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:455:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty849);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty859); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:462:1: ruleProperty returns [EObject current=null] : (otherlv_0= 'get properties from:' ( (lv_propertiesFile_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_propertiesFile_1_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:465:28: ( (otherlv_0= 'get properties from:' ( (lv_propertiesFile_1_0= RULE_STRING ) ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:466:1: (otherlv_0= 'get properties from:' ( (lv_propertiesFile_1_0= RULE_STRING ) ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:466:1: (otherlv_0= 'get properties from:' ( (lv_propertiesFile_1_0= RULE_STRING ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:466:3: otherlv_0= 'get properties from:' ( (lv_propertiesFile_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleProperty896); 

                	newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getGetPropertiesFromKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:470:1: ( (lv_propertiesFile_1_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:471:1: (lv_propertiesFile_1_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:471:1: (lv_propertiesFile_1_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:472:3: lv_propertiesFile_1_0= RULE_STRING
            {
            lv_propertiesFile_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProperty913); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:496:1: entryRuleUsedDescriptions returns [EObject current=null] : iv_ruleUsedDescriptions= ruleUsedDescriptions EOF ;
    public final EObject entryRuleUsedDescriptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsedDescriptions = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:497:2: (iv_ruleUsedDescriptions= ruleUsedDescriptions EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:498:2: iv_ruleUsedDescriptions= ruleUsedDescriptions EOF
            {
             newCompositeNode(grammarAccess.getUsedDescriptionsRule()); 
            pushFollow(FOLLOW_ruleUsedDescriptions_in_entryRuleUsedDescriptions954);
            iv_ruleUsedDescriptions=ruleUsedDescriptions();

            state._fsp--;

             current =iv_ruleUsedDescriptions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsedDescriptions964); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:505:1: ruleUsedDescriptions returns [EObject current=null] : (otherlv_0= 'use: ' ( ( (lv_description_1_1= ruleUIDescriptionImport | lv_description_1_2= ruleComplexComponent ) ) ) (otherlv_2= ' as: ' ( (lv_localName_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleUsedDescriptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_localName_3_0=null;
        EObject lv_description_1_1 = null;

        EObject lv_description_1_2 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:508:28: ( (otherlv_0= 'use: ' ( ( (lv_description_1_1= ruleUIDescriptionImport | lv_description_1_2= ruleComplexComponent ) ) ) (otherlv_2= ' as: ' ( (lv_localName_3_0= RULE_STRING ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:509:1: (otherlv_0= 'use: ' ( ( (lv_description_1_1= ruleUIDescriptionImport | lv_description_1_2= ruleComplexComponent ) ) ) (otherlv_2= ' as: ' ( (lv_localName_3_0= RULE_STRING ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:509:1: (otherlv_0= 'use: ' ( ( (lv_description_1_1= ruleUIDescriptionImport | lv_description_1_2= ruleComplexComponent ) ) ) (otherlv_2= ' as: ' ( (lv_localName_3_0= RULE_STRING ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:509:3: otherlv_0= 'use: ' ( ( (lv_description_1_1= ruleUIDescriptionImport | lv_description_1_2= ruleComplexComponent ) ) ) (otherlv_2= ' as: ' ( (lv_localName_3_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleUsedDescriptions1001); 

                	newLeafNode(otherlv_0, grammarAccess.getUsedDescriptionsAccess().getUseKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:513:1: ( ( (lv_description_1_1= ruleUIDescriptionImport | lv_description_1_2= ruleComplexComponent ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:514:1: ( (lv_description_1_1= ruleUIDescriptionImport | lv_description_1_2= ruleComplexComponent ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:514:1: ( (lv_description_1_1= ruleUIDescriptionImport | lv_description_1_2= ruleComplexComponent ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:515:1: (lv_description_1_1= ruleUIDescriptionImport | lv_description_1_2= ruleComplexComponent )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:515:1: (lv_description_1_1= ruleUIDescriptionImport | lv_description_1_2= ruleComplexComponent )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:516:3: lv_description_1_1= ruleUIDescriptionImport
                    {
                     
                    	        newCompositeNode(grammarAccess.getUsedDescriptionsAccess().getDescriptionUIDescriptionImportParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUIDescriptionImport_in_ruleUsedDescriptions1024);
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
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:531:8: lv_description_1_2= ruleComplexComponent
                    {
                     
                    	        newCompositeNode(grammarAccess.getUsedDescriptionsAccess().getDescriptionComplexComponentParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleComplexComponent_in_ruleUsedDescriptions1043);
                    lv_description_1_2=ruleComplexComponent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUsedDescriptionsRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_1_2, 
                            		"ComplexComponent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:549:2: (otherlv_2= ' as: ' ( (lv_localName_3_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:549:4: otherlv_2= ' as: ' ( (lv_localName_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleUsedDescriptions1059); 

                        	newLeafNode(otherlv_2, grammarAccess.getUsedDescriptionsAccess().getAsKeyword_2_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:553:1: ( (lv_localName_3_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:554:1: (lv_localName_3_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:554:1: (lv_localName_3_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:555:3: lv_localName_3_0= RULE_STRING
                    {
                    lv_localName_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUsedDescriptions1076); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:579:1: entryRuleAreaCount returns [EObject current=null] : iv_ruleAreaCount= ruleAreaCount EOF ;
    public final EObject entryRuleAreaCount() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAreaCount = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:580:2: (iv_ruleAreaCount= ruleAreaCount EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:581:2: iv_ruleAreaCount= ruleAreaCount EOF
            {
             newCompositeNode(grammarAccess.getAreaCountRule()); 
            pushFollow(FOLLOW_ruleAreaCount_in_entryRuleAreaCount1119);
            iv_ruleAreaCount=ruleAreaCount();

            state._fsp--;

             current =iv_ruleAreaCount; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAreaCount1129); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:588:1: ruleAreaCount returns [EObject current=null] : (otherlv_0= 'Area count: ' ( (lv_areaCount_1_0= RULE_INT ) ) ) ;
    public final EObject ruleAreaCount() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_areaCount_1_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:591:28: ( (otherlv_0= 'Area count: ' ( (lv_areaCount_1_0= RULE_INT ) ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:592:1: (otherlv_0= 'Area count: ' ( (lv_areaCount_1_0= RULE_INT ) ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:592:1: (otherlv_0= 'Area count: ' ( (lv_areaCount_1_0= RULE_INT ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:592:3: otherlv_0= 'Area count: ' ( (lv_areaCount_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleAreaCount1166); 

                	newLeafNode(otherlv_0, grammarAccess.getAreaCountAccess().getAreaCountKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:596:1: ( (lv_areaCount_1_0= RULE_INT ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:597:1: (lv_areaCount_1_0= RULE_INT )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:597:1: (lv_areaCount_1_0= RULE_INT )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:598:3: lv_areaCount_1_0= RULE_INT
            {
            lv_areaCount_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAreaCount1183); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:622:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:623:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:624:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition1224);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition1234); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:631:1: ruleDefinition returns [EObject current=null] : (otherlv_0= 'DEF ' ( (lv_concreteDefition_1_0= ruleComponentDefinition ) ) otherlv_2= 'END DEF' ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_concreteDefition_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:634:28: ( (otherlv_0= 'DEF ' ( (lv_concreteDefition_1_0= ruleComponentDefinition ) ) otherlv_2= 'END DEF' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:635:1: (otherlv_0= 'DEF ' ( (lv_concreteDefition_1_0= ruleComponentDefinition ) ) otherlv_2= 'END DEF' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:635:1: (otherlv_0= 'DEF ' ( (lv_concreteDefition_1_0= ruleComponentDefinition ) ) otherlv_2= 'END DEF' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:635:3: otherlv_0= 'DEF ' ( (lv_concreteDefition_1_0= ruleComponentDefinition ) ) otherlv_2= 'END DEF'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleDefinition1271); 

                	newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getDEFKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:639:1: ( (lv_concreteDefition_1_0= ruleComponentDefinition ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:640:1: (lv_concreteDefition_1_0= ruleComponentDefinition )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:640:1: (lv_concreteDefition_1_0= ruleComponentDefinition )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:641:3: lv_concreteDefition_1_0= ruleComponentDefinition
            {
             
            	        newCompositeNode(grammarAccess.getDefinitionAccess().getConcreteDefitionComponentDefinitionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleComponentDefinition_in_ruleDefinition1292);
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

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleDefinition1304); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:669:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:670:2: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:671:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
            {
             newCompositeNode(grammarAccess.getTypeDefinitionRule()); 
            pushFollow(FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition1340);
            iv_ruleTypeDefinition=ruleTypeDefinition();

            state._fsp--;

             current =iv_ruleTypeDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinition1350); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:678:1: ruleTypeDefinition returns [EObject current=null] : (otherlv_0= 'type: ' ( (lv_type_1_0= ruleType ) ) ) ;
    public final EObject ruleTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:681:28: ( (otherlv_0= 'type: ' ( (lv_type_1_0= ruleType ) ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:682:1: (otherlv_0= 'type: ' ( (lv_type_1_0= ruleType ) ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:682:1: (otherlv_0= 'type: ' ( (lv_type_1_0= ruleType ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:682:3: otherlv_0= 'type: ' ( (lv_type_1_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleTypeDefinition1387); 

                	newLeafNode(otherlv_0, grammarAccess.getTypeDefinitionAccess().getTypeKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:686:1: ( (lv_type_1_0= ruleType ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:687:1: (lv_type_1_0= ruleType )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:687:1: (lv_type_1_0= ruleType )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:688:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleTypeDefinition1408);
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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:712:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:713:2: (iv_ruleType= ruleType EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:714:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1445);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1456); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:721:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'WINDOW' | kw= 'INNERCOMPLEX' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:724:28: ( (kw= 'WINDOW' | kw= 'INNERCOMPLEX' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:725:1: (kw= 'WINDOW' | kw= 'INNERCOMPLEX' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:725:1: (kw= 'WINDOW' | kw= 'INNERCOMPLEX' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            else if ( (LA11_0==24) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:726:2: kw= 'WINDOW'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleType1494); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getWINDOWKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:733:2: kw= 'INNERCOMPLEX'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleType1513); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:746:1: entryRuleUIDescriptionImport returns [EObject current=null] : iv_ruleUIDescriptionImport= ruleUIDescriptionImport EOF ;
    public final EObject entryRuleUIDescriptionImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIDescriptionImport = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:747:2: (iv_ruleUIDescriptionImport= ruleUIDescriptionImport EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:748:2: iv_ruleUIDescriptionImport= ruleUIDescriptionImport EOF
            {
             newCompositeNode(grammarAccess.getUIDescriptionImportRule()); 
            pushFollow(FOLLOW_ruleUIDescriptionImport_in_entryRuleUIDescriptionImport1553);
            iv_ruleUIDescriptionImport=ruleUIDescriptionImport();

            state._fsp--;

             current =iv_ruleUIDescriptionImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIDescriptionImport1563); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:755:1: ruleUIDescriptionImport returns [EObject current=null] : ( (lv_descriptionName_0_0= RULE_STRING ) ) ;
    public final EObject ruleUIDescriptionImport() throws RecognitionException {
        EObject current = null;

        Token lv_descriptionName_0_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:758:28: ( ( (lv_descriptionName_0_0= RULE_STRING ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:759:1: ( (lv_descriptionName_0_0= RULE_STRING ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:759:1: ( (lv_descriptionName_0_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:760:1: (lv_descriptionName_0_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:760:1: (lv_descriptionName_0_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:761:3: lv_descriptionName_0_0= RULE_STRING
            {
            lv_descriptionName_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUIDescriptionImport1604); 

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


    // $ANTLR start "entryRuleComplexComponent"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:785:1: entryRuleComplexComponent returns [EObject current=null] : iv_ruleComplexComponent= ruleComplexComponent EOF ;
    public final EObject entryRuleComplexComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexComponent = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:786:2: (iv_ruleComplexComponent= ruleComplexComponent EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:787:2: iv_ruleComplexComponent= ruleComplexComponent EOF
            {
             newCompositeNode(grammarAccess.getComplexComponentRule()); 
            pushFollow(FOLLOW_ruleComplexComponent_in_entryRuleComplexComponent1644);
            iv_ruleComplexComponent=ruleComplexComponent();

            state._fsp--;

             current =iv_ruleComplexComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexComponent1654); 

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
    // $ANTLR end "entryRuleComplexComponent"


    // $ANTLR start "ruleComplexComponent"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:794:1: ruleComplexComponent returns [EObject current=null] : this_Multiselection_0= ruleMultiselection ;
    public final EObject ruleComplexComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Multiselection_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:797:28: (this_Multiselection_0= ruleMultiselection )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:799:5: this_Multiselection_0= ruleMultiselection
            {
             
                    newCompositeNode(grammarAccess.getComplexComponentAccess().getMultiselectionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleMultiselection_in_ruleComplexComponent1700);
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
    // $ANTLR end "ruleComplexComponent"


    // $ANTLR start "entryRuleMultiselection"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:815:1: entryRuleMultiselection returns [EObject current=null] : iv_ruleMultiselection= ruleMultiselection EOF ;
    public final EObject entryRuleMultiselection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiselection = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:816:2: (iv_ruleMultiselection= ruleMultiselection EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:817:2: iv_ruleMultiselection= ruleMultiselection EOF
            {
             newCompositeNode(grammarAccess.getMultiselectionRule()); 
            pushFollow(FOLLOW_ruleMultiselection_in_entryRuleMultiselection1734);
            iv_ruleMultiselection=ruleMultiselection();

            state._fsp--;

             current =iv_ruleMultiselection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiselection1744); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:824:1: ruleMultiselection returns [EObject current=null] : ( ( (lv_descriptionName_0_0= 'Multiselection' ) ) (otherlv_1= '<' ( (lv_inputType_2_0= RULE_STRING ) ) otherlv_3= '>' )? ) ;
    public final EObject ruleMultiselection() throws RecognitionException {
        EObject current = null;

        Token lv_descriptionName_0_0=null;
        Token otherlv_1=null;
        Token lv_inputType_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:827:28: ( ( ( (lv_descriptionName_0_0= 'Multiselection' ) ) (otherlv_1= '<' ( (lv_inputType_2_0= RULE_STRING ) ) otherlv_3= '>' )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:828:1: ( ( (lv_descriptionName_0_0= 'Multiselection' ) ) (otherlv_1= '<' ( (lv_inputType_2_0= RULE_STRING ) ) otherlv_3= '>' )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:828:1: ( ( (lv_descriptionName_0_0= 'Multiselection' ) ) (otherlv_1= '<' ( (lv_inputType_2_0= RULE_STRING ) ) otherlv_3= '>' )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:828:2: ( (lv_descriptionName_0_0= 'Multiselection' ) ) (otherlv_1= '<' ( (lv_inputType_2_0= RULE_STRING ) ) otherlv_3= '>' )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:828:2: ( (lv_descriptionName_0_0= 'Multiselection' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:829:1: (lv_descriptionName_0_0= 'Multiselection' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:829:1: (lv_descriptionName_0_0= 'Multiselection' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:830:3: lv_descriptionName_0_0= 'Multiselection'
            {
            lv_descriptionName_0_0=(Token)match(input,25,FOLLOW_25_in_ruleMultiselection1787); 

                    newLeafNode(lv_descriptionName_0_0, grammarAccess.getMultiselectionAccess().getDescriptionNameMultiselectionKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMultiselectionRule());
            	        }
                   		setWithLastConsumed(current, "descriptionName", lv_descriptionName_0_0, "Multiselection");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:843:2: (otherlv_1= '<' ( (lv_inputType_2_0= RULE_STRING ) ) otherlv_3= '>' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:843:4: otherlv_1= '<' ( (lv_inputType_2_0= RULE_STRING ) ) otherlv_3= '>'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleMultiselection1813); 

                        	newLeafNode(otherlv_1, grammarAccess.getMultiselectionAccess().getLessThanSignKeyword_1_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:847:1: ( (lv_inputType_2_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:848:1: (lv_inputType_2_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:848:1: (lv_inputType_2_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:849:3: lv_inputType_2_0= RULE_STRING
                    {
                    lv_inputType_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMultiselection1830); 

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

                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleMultiselection1847); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:877:1: entryRuleAreaAssignment returns [EObject current=null] : iv_ruleAreaAssignment= ruleAreaAssignment EOF ;
    public final EObject entryRuleAreaAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAreaAssignment = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:878:2: (iv_ruleAreaAssignment= ruleAreaAssignment EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:879:2: iv_ruleAreaAssignment= ruleAreaAssignment EOF
            {
             newCompositeNode(grammarAccess.getAreaAssignmentRule()); 
            pushFollow(FOLLOW_ruleAreaAssignment_in_entryRuleAreaAssignment1885);
            iv_ruleAreaAssignment=ruleAreaAssignment();

            state._fsp--;

             current =iv_ruleAreaAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAreaAssignment1895); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:886:1: ruleAreaAssignment returns [EObject current=null] : ( (otherlv_0= 'Area:' ( (lv_area_1_0= RULE_INT ) ) otherlv_2= '<-' ( (lv_elements_3_0= RULE_STRING ) )+ ) | ( ( (lv_elements_4_0= RULE_STRING ) )+ otherlv_5= '->' otherlv_6= 'Area:' ( (lv_area_7_0= RULE_INT ) ) ) ) ;
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
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:889:28: ( ( (otherlv_0= 'Area:' ( (lv_area_1_0= RULE_INT ) ) otherlv_2= '<-' ( (lv_elements_3_0= RULE_STRING ) )+ ) | ( ( (lv_elements_4_0= RULE_STRING ) )+ otherlv_5= '->' otherlv_6= 'Area:' ( (lv_area_7_0= RULE_INT ) ) ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:890:1: ( (otherlv_0= 'Area:' ( (lv_area_1_0= RULE_INT ) ) otherlv_2= '<-' ( (lv_elements_3_0= RULE_STRING ) )+ ) | ( ( (lv_elements_4_0= RULE_STRING ) )+ otherlv_5= '->' otherlv_6= 'Area:' ( (lv_area_7_0= RULE_INT ) ) ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:890:1: ( (otherlv_0= 'Area:' ( (lv_area_1_0= RULE_INT ) ) otherlv_2= '<-' ( (lv_elements_3_0= RULE_STRING ) )+ ) | ( ( (lv_elements_4_0= RULE_STRING ) )+ otherlv_5= '->' otherlv_6= 'Area:' ( (lv_area_7_0= RULE_INT ) ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_STRING) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:890:2: (otherlv_0= 'Area:' ( (lv_area_1_0= RULE_INT ) ) otherlv_2= '<-' ( (lv_elements_3_0= RULE_STRING ) )+ )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:890:2: (otherlv_0= 'Area:' ( (lv_area_1_0= RULE_INT ) ) otherlv_2= '<-' ( (lv_elements_3_0= RULE_STRING ) )+ )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:890:4: otherlv_0= 'Area:' ( (lv_area_1_0= RULE_INT ) ) otherlv_2= '<-' ( (lv_elements_3_0= RULE_STRING ) )+
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleAreaAssignment1933); 

                        	newLeafNode(otherlv_0, grammarAccess.getAreaAssignmentAccess().getAreaKeyword_0_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:894:1: ( (lv_area_1_0= RULE_INT ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:895:1: (lv_area_1_0= RULE_INT )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:895:1: (lv_area_1_0= RULE_INT )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:896:3: lv_area_1_0= RULE_INT
                    {
                    lv_area_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAreaAssignment1950); 

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

                    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleAreaAssignment1967); 

                        	newLeafNode(otherlv_2, grammarAccess.getAreaAssignmentAccess().getLessThanSignHyphenMinusKeyword_0_2());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:916:1: ( (lv_elements_3_0= RULE_STRING ) )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_STRING) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:917:1: (lv_elements_3_0= RULE_STRING )
                    	    {
                    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:917:1: (lv_elements_3_0= RULE_STRING )
                    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:918:3: lv_elements_3_0= RULE_STRING
                    	    {
                    	    lv_elements_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAreaAssignment1984); 

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
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:935:6: ( ( (lv_elements_4_0= RULE_STRING ) )+ otherlv_5= '->' otherlv_6= 'Area:' ( (lv_area_7_0= RULE_INT ) ) )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:935:6: ( ( (lv_elements_4_0= RULE_STRING ) )+ otherlv_5= '->' otherlv_6= 'Area:' ( (lv_area_7_0= RULE_INT ) ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:935:7: ( (lv_elements_4_0= RULE_STRING ) )+ otherlv_5= '->' otherlv_6= 'Area:' ( (lv_area_7_0= RULE_INT ) )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:935:7: ( (lv_elements_4_0= RULE_STRING ) )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_STRING) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:936:1: (lv_elements_4_0= RULE_STRING )
                    	    {
                    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:936:1: (lv_elements_4_0= RULE_STRING )
                    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:937:3: lv_elements_4_0= RULE_STRING
                    	    {
                    	    lv_elements_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAreaAssignment2015); 

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
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleAreaAssignment2033); 

                        	newLeafNode(otherlv_5, grammarAccess.getAreaAssignmentAccess().getHyphenMinusGreaterThanSignKeyword_1_1());
                        
                    otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleAreaAssignment2045); 

                        	newLeafNode(otherlv_6, grammarAccess.getAreaAssignmentAccess().getAreaKeyword_1_2());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:961:1: ( (lv_area_7_0= RULE_INT ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:962:1: (lv_area_7_0= RULE_INT )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:962:1: (lv_area_7_0= RULE_INT )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:963:3: lv_area_7_0= RULE_INT
                    {
                    lv_area_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAreaAssignment2062); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:987:1: entryRuleComponentDefinition returns [EObject current=null] : iv_ruleComponentDefinition= ruleComponentDefinition EOF ;
    public final EObject entryRuleComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:988:2: (iv_ruleComponentDefinition= ruleComponentDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:989:2: iv_ruleComponentDefinition= ruleComponentDefinition EOF
            {
             newCompositeNode(grammarAccess.getComponentDefinitionRule()); 
            pushFollow(FOLLOW_ruleComponentDefinition_in_entryRuleComponentDefinition2104);
            iv_ruleComponentDefinition=ruleComponentDefinition();

            state._fsp--;

             current =iv_ruleComponentDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentDefinition2114); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:996:1: ruleComponentDefinition returns [EObject current=null] : (this_LabelDefinition_0= ruleLabelDefinition | this_ButtonDefinition_1= ruleButtonDefinition | this_TextfieldDefinition_2= ruleTextfieldDefinition | this_TreeDefinition_3= ruleTreeDefinition | this_TableDefinition_4= ruleTableDefinition | this_RadioboxDefinition_5= ruleRadioboxDefinition | this_CheckboxDefinition_6= ruleCheckboxDefinition ) ;
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
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:999:28: ( (this_LabelDefinition_0= ruleLabelDefinition | this_ButtonDefinition_1= ruleButtonDefinition | this_TextfieldDefinition_2= ruleTextfieldDefinition | this_TreeDefinition_3= ruleTreeDefinition | this_TableDefinition_4= ruleTableDefinition | this_RadioboxDefinition_5= ruleRadioboxDefinition | this_CheckboxDefinition_6= ruleCheckboxDefinition ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1000:1: (this_LabelDefinition_0= ruleLabelDefinition | this_ButtonDefinition_1= ruleButtonDefinition | this_TextfieldDefinition_2= ruleTextfieldDefinition | this_TreeDefinition_3= ruleTreeDefinition | this_TableDefinition_4= ruleTableDefinition | this_RadioboxDefinition_5= ruleRadioboxDefinition | this_CheckboxDefinition_6= ruleCheckboxDefinition )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1000:1: (this_LabelDefinition_0= ruleLabelDefinition | this_ButtonDefinition_1= ruleButtonDefinition | this_TextfieldDefinition_2= ruleTextfieldDefinition | this_TreeDefinition_3= ruleTreeDefinition | this_TableDefinition_4= ruleTableDefinition | this_RadioboxDefinition_5= ruleRadioboxDefinition | this_CheckboxDefinition_6= ruleCheckboxDefinition )
            int alt16=7;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt16=1;
                }
                break;
            case 13:
                {
                alt16=2;
                }
                break;
            case 38:
                {
                alt16=3;
                }
                break;
            case 37:
                {
                alt16=4;
                }
                break;
            case 36:
                {
                alt16=5;
                }
                break;
            case 35:
                {
                alt16=6;
                }
                break;
            case 31:
                {
                alt16=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1001:5: this_LabelDefinition_0= ruleLabelDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getLabelDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLabelDefinition_in_ruleComponentDefinition2161);
                    this_LabelDefinition_0=ruleLabelDefinition();

                    state._fsp--;

                     
                            current = this_LabelDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1011:5: this_ButtonDefinition_1= ruleButtonDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getButtonDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleButtonDefinition_in_ruleComponentDefinition2188);
                    this_ButtonDefinition_1=ruleButtonDefinition();

                    state._fsp--;

                     
                            current = this_ButtonDefinition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1021:5: this_TextfieldDefinition_2= ruleTextfieldDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getTextfieldDefinitionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTextfieldDefinition_in_ruleComponentDefinition2215);
                    this_TextfieldDefinition_2=ruleTextfieldDefinition();

                    state._fsp--;

                     
                            current = this_TextfieldDefinition_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1031:5: this_TreeDefinition_3= ruleTreeDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getTreeDefinitionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleTreeDefinition_in_ruleComponentDefinition2242);
                    this_TreeDefinition_3=ruleTreeDefinition();

                    state._fsp--;

                     
                            current = this_TreeDefinition_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1041:5: this_TableDefinition_4= ruleTableDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getTableDefinitionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleTableDefinition_in_ruleComponentDefinition2269);
                    this_TableDefinition_4=ruleTableDefinition();

                    state._fsp--;

                     
                            current = this_TableDefinition_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1051:5: this_RadioboxDefinition_5= ruleRadioboxDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getRadioboxDefinitionParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleRadioboxDefinition_in_ruleComponentDefinition2296);
                    this_RadioboxDefinition_5=ruleRadioboxDefinition();

                    state._fsp--;

                     
                            current = this_RadioboxDefinition_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1061:5: this_CheckboxDefinition_6= ruleCheckboxDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getCheckboxDefinitionParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleCheckboxDefinition_in_ruleComponentDefinition2323);
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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1077:1: entryRuleCheckboxDefinition returns [EObject current=null] : iv_ruleCheckboxDefinition= ruleCheckboxDefinition EOF ;
    public final EObject entryRuleCheckboxDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckboxDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1078:2: (iv_ruleCheckboxDefinition= ruleCheckboxDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1079:2: iv_ruleCheckboxDefinition= ruleCheckboxDefinition EOF
            {
             newCompositeNode(grammarAccess.getCheckboxDefinitionRule()); 
            pushFollow(FOLLOW_ruleCheckboxDefinition_in_entryRuleCheckboxDefinition2358);
            iv_ruleCheckboxDefinition=ruleCheckboxDefinition();

            state._fsp--;

             current =iv_ruleCheckboxDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckboxDefinition2368); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1086:1: ruleCheckboxDefinition returns [EObject current=null] : ( ( (lv_type_0_0= 'Checkbox' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? ) ;
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
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1089:28: ( ( ( (lv_type_0_0= 'Checkbox' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1090:1: ( ( (lv_type_0_0= 'Checkbox' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1090:1: ( ( (lv_type_0_0= 'Checkbox' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1090:2: ( (lv_type_0_0= 'Checkbox' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1090:2: ( (lv_type_0_0= 'Checkbox' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1091:1: (lv_type_0_0= 'Checkbox' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1091:1: (lv_type_0_0= 'Checkbox' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1092:3: lv_type_0_0= 'Checkbox'
            {
            lv_type_0_0=(Token)match(input,31,FOLLOW_31_in_ruleCheckboxDefinition2411); 

                    newLeafNode(lv_type_0_0, grammarAccess.getCheckboxDefinitionAccess().getTypeCheckboxKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCheckboxDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_0_0, "Checkbox");
            	    

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleCheckboxDefinition2436); 

                	newLeafNode(otherlv_1, grammarAccess.getCheckboxDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1109:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1110:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1110:1: (lv_name_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1111:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCheckboxDefinition2453); 

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

            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleCheckboxDefinition2470); 

                	newLeafNode(otherlv_3, grammarAccess.getCheckboxDefinitionAccess().getColonKeyword_3());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1131:1: (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1131:3: otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleCheckboxDefinition2483); 

                        	newLeafNode(otherlv_4, grammarAccess.getCheckboxDefinitionAccess().getTextKeyword_4_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1135:1: ( (lv_text_5_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1136:1: (lv_text_5_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1136:1: (lv_text_5_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1137:3: lv_text_5_0= RULE_STRING
                    {
                    lv_text_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCheckboxDefinition2500); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1161:1: entryRuleRadioboxDefinition returns [EObject current=null] : iv_ruleRadioboxDefinition= ruleRadioboxDefinition EOF ;
    public final EObject entryRuleRadioboxDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadioboxDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1162:2: (iv_ruleRadioboxDefinition= ruleRadioboxDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1163:2: iv_ruleRadioboxDefinition= ruleRadioboxDefinition EOF
            {
             newCompositeNode(grammarAccess.getRadioboxDefinitionRule()); 
            pushFollow(FOLLOW_ruleRadioboxDefinition_in_entryRuleRadioboxDefinition2543);
            iv_ruleRadioboxDefinition=ruleRadioboxDefinition();

            state._fsp--;

             current =iv_ruleRadioboxDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRadioboxDefinition2553); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1170:1: ruleRadioboxDefinition returns [EObject current=null] : ( ( (lv_type_0_0= 'Radiobox' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? ) ;
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
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1173:28: ( ( ( (lv_type_0_0= 'Radiobox' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1174:1: ( ( (lv_type_0_0= 'Radiobox' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1174:1: ( ( (lv_type_0_0= 'Radiobox' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1174:2: ( (lv_type_0_0= 'Radiobox' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1174:2: ( (lv_type_0_0= 'Radiobox' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1175:1: (lv_type_0_0= 'Radiobox' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1175:1: (lv_type_0_0= 'Radiobox' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1176:3: lv_type_0_0= 'Radiobox'
            {
            lv_type_0_0=(Token)match(input,35,FOLLOW_35_in_ruleRadioboxDefinition2596); 

                    newLeafNode(lv_type_0_0, grammarAccess.getRadioboxDefinitionAccess().getTypeRadioboxKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRadioboxDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_0_0, "Radiobox");
            	    

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleRadioboxDefinition2621); 

                	newLeafNode(otherlv_1, grammarAccess.getRadioboxDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1193:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1194:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1194:1: (lv_name_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1195:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRadioboxDefinition2638); 

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

            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleRadioboxDefinition2655); 

                	newLeafNode(otherlv_3, grammarAccess.getRadioboxDefinitionAccess().getColonKeyword_3());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1215:1: (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1215:3: otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleRadioboxDefinition2668); 

                        	newLeafNode(otherlv_4, grammarAccess.getRadioboxDefinitionAccess().getTextKeyword_4_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1219:1: ( (lv_text_5_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1220:1: (lv_text_5_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1220:1: (lv_text_5_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1221:3: lv_text_5_0= RULE_STRING
                    {
                    lv_text_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRadioboxDefinition2685); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1245:1: entryRuleTableDefinition returns [EObject current=null] : iv_ruleTableDefinition= ruleTableDefinition EOF ;
    public final EObject entryRuleTableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1246:2: (iv_ruleTableDefinition= ruleTableDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1247:2: iv_ruleTableDefinition= ruleTableDefinition EOF
            {
             newCompositeNode(grammarAccess.getTableDefinitionRule()); 
            pushFollow(FOLLOW_ruleTableDefinition_in_entryRuleTableDefinition2728);
            iv_ruleTableDefinition=ruleTableDefinition();

            state._fsp--;

             current =iv_ruleTableDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableDefinition2738); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1254:1: ruleTableDefinition returns [EObject current=null] : ( ( (lv_type_0_0= 'Table' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? ) ;
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
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1257:28: ( ( ( (lv_type_0_0= 'Table' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1258:1: ( ( (lv_type_0_0= 'Table' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1258:1: ( ( (lv_type_0_0= 'Table' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1258:2: ( (lv_type_0_0= 'Table' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1258:2: ( (lv_type_0_0= 'Table' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1259:1: (lv_type_0_0= 'Table' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1259:1: (lv_type_0_0= 'Table' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1260:3: lv_type_0_0= 'Table'
            {
            lv_type_0_0=(Token)match(input,36,FOLLOW_36_in_ruleTableDefinition2781); 

                    newLeafNode(lv_type_0_0, grammarAccess.getTableDefinitionAccess().getTypeTableKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTableDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_0_0, "Table");
            	    

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleTableDefinition2806); 

                	newLeafNode(otherlv_1, grammarAccess.getTableDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1277:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1278:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1278:1: (lv_name_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1279:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTableDefinition2823); 

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

            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleTableDefinition2840); 

                	newLeafNode(otherlv_3, grammarAccess.getTableDefinitionAccess().getColonKeyword_3());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1299:1: (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1299:3: otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleTableDefinition2853); 

                        	newLeafNode(otherlv_4, grammarAccess.getTableDefinitionAccess().getTextKeyword_4_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1303:1: ( (lv_text_5_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1304:1: (lv_text_5_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1304:1: (lv_text_5_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1305:3: lv_text_5_0= RULE_STRING
                    {
                    lv_text_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTableDefinition2870); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1329:1: entryRuleTreeDefinition returns [EObject current=null] : iv_ruleTreeDefinition= ruleTreeDefinition EOF ;
    public final EObject entryRuleTreeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTreeDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1330:2: (iv_ruleTreeDefinition= ruleTreeDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1331:2: iv_ruleTreeDefinition= ruleTreeDefinition EOF
            {
             newCompositeNode(grammarAccess.getTreeDefinitionRule()); 
            pushFollow(FOLLOW_ruleTreeDefinition_in_entryRuleTreeDefinition2913);
            iv_ruleTreeDefinition=ruleTreeDefinition();

            state._fsp--;

             current =iv_ruleTreeDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTreeDefinition2923); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1338:1: ruleTreeDefinition returns [EObject current=null] : ( ( (lv_type_0_0= 'Tree' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? ) ;
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
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1341:28: ( ( ( (lv_type_0_0= 'Tree' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1342:1: ( ( (lv_type_0_0= 'Tree' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1342:1: ( ( (lv_type_0_0= 'Tree' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1342:2: ( (lv_type_0_0= 'Tree' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1342:2: ( (lv_type_0_0= 'Tree' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1343:1: (lv_type_0_0= 'Tree' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1343:1: (lv_type_0_0= 'Tree' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1344:3: lv_type_0_0= 'Tree'
            {
            lv_type_0_0=(Token)match(input,37,FOLLOW_37_in_ruleTreeDefinition2966); 

                    newLeafNode(lv_type_0_0, grammarAccess.getTreeDefinitionAccess().getTypeTreeKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTreeDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_0_0, "Tree");
            	    

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleTreeDefinition2991); 

                	newLeafNode(otherlv_1, grammarAccess.getTreeDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1361:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1362:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1362:1: (lv_name_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1363:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTreeDefinition3008); 

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

            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleTreeDefinition3025); 

                	newLeafNode(otherlv_3, grammarAccess.getTreeDefinitionAccess().getColonKeyword_3());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1383:1: (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1383:3: otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleTreeDefinition3038); 

                        	newLeafNode(otherlv_4, grammarAccess.getTreeDefinitionAccess().getTextKeyword_4_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1387:1: ( (lv_text_5_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1388:1: (lv_text_5_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1388:1: (lv_text_5_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1389:3: lv_text_5_0= RULE_STRING
                    {
                    lv_text_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTreeDefinition3055); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1413:1: entryRuleTextfieldDefinition returns [EObject current=null] : iv_ruleTextfieldDefinition= ruleTextfieldDefinition EOF ;
    public final EObject entryRuleTextfieldDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextfieldDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1414:2: (iv_ruleTextfieldDefinition= ruleTextfieldDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1415:2: iv_ruleTextfieldDefinition= ruleTextfieldDefinition EOF
            {
             newCompositeNode(grammarAccess.getTextfieldDefinitionRule()); 
            pushFollow(FOLLOW_ruleTextfieldDefinition_in_entryRuleTextfieldDefinition3098);
            iv_ruleTextfieldDefinition=ruleTextfieldDefinition();

            state._fsp--;

             current =iv_ruleTextfieldDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextfieldDefinition3108); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1422:1: ruleTextfieldDefinition returns [EObject current=null] : ( ( (lv_type_0_0= 'Textfield' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? ) ;
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
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1425:28: ( ( ( (lv_type_0_0= 'Textfield' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1426:1: ( ( (lv_type_0_0= 'Textfield' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1426:1: ( ( (lv_type_0_0= 'Textfield' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1426:2: ( (lv_type_0_0= 'Textfield' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1426:2: ( (lv_type_0_0= 'Textfield' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1427:1: (lv_type_0_0= 'Textfield' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1427:1: (lv_type_0_0= 'Textfield' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1428:3: lv_type_0_0= 'Textfield'
            {
            lv_type_0_0=(Token)match(input,38,FOLLOW_38_in_ruleTextfieldDefinition3151); 

                    newLeafNode(lv_type_0_0, grammarAccess.getTextfieldDefinitionAccess().getTypeTextfieldKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextfieldDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_0_0, "Textfield");
            	    

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleTextfieldDefinition3176); 

                	newLeafNode(otherlv_1, grammarAccess.getTextfieldDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1445:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1446:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1446:1: (lv_name_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1447:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextfieldDefinition3193); 

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

            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleTextfieldDefinition3210); 

                	newLeafNode(otherlv_3, grammarAccess.getTextfieldDefinitionAccess().getColonKeyword_3());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1467:1: (otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1467:3: otherlv_4= 'text=' ( (lv_text_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleTextfieldDefinition3223); 

                        	newLeafNode(otherlv_4, grammarAccess.getTextfieldDefinitionAccess().getTextKeyword_4_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1471:1: ( (lv_text_5_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1472:1: (lv_text_5_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1472:1: (lv_text_5_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1473:3: lv_text_5_0= RULE_STRING
                    {
                    lv_text_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextfieldDefinition3240); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1497:1: entryRuleButtonDefinition returns [EObject current=null] : iv_ruleButtonDefinition= ruleButtonDefinition EOF ;
    public final EObject entryRuleButtonDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1498:2: (iv_ruleButtonDefinition= ruleButtonDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1499:2: iv_ruleButtonDefinition= ruleButtonDefinition EOF
            {
             newCompositeNode(grammarAccess.getButtonDefinitionRule()); 
            pushFollow(FOLLOW_ruleButtonDefinition_in_entryRuleButtonDefinition3283);
            iv_ruleButtonDefinition=ruleButtonDefinition();

            state._fsp--;

             current =iv_ruleButtonDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonDefinition3293); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1506:1: ruleButtonDefinition returns [EObject current=null] : ( ( (lv_type_0_0= 'Button' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? ) ;
    public final EObject ruleButtonDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1509:28: ( ( ( (lv_type_0_0= 'Button' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1510:1: ( ( (lv_type_0_0= 'Button' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1510:1: ( ( (lv_type_0_0= 'Button' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1510:2: ( (lv_type_0_0= 'Button' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1510:2: ( (lv_type_0_0= 'Button' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1511:1: (lv_type_0_0= 'Button' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1511:1: (lv_type_0_0= 'Button' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1512:3: lv_type_0_0= 'Button'
            {
            lv_type_0_0=(Token)match(input,13,FOLLOW_13_in_ruleButtonDefinition3336); 

                    newLeafNode(lv_type_0_0, grammarAccess.getButtonDefinitionAccess().getTypeButtonKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getButtonDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_0_0, "Button");
            	    

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleButtonDefinition3361); 

                	newLeafNode(otherlv_1, grammarAccess.getButtonDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1529:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1530:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1530:1: (lv_name_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1531:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleButtonDefinition3378); 

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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1547:2: ( (lv_properties_3_0= ruleProperties ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1548:1: (lv_properties_3_0= ruleProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1548:1: (lv_properties_3_0= ruleProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1549:3: lv_properties_3_0= ruleProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getButtonDefinitionAccess().getPropertiesPropertiesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProperties_in_ruleButtonDefinition3404);
                    lv_properties_3_0=ruleProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getButtonDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"properties",
                            		lv_properties_3_0, 
                            		"Properties");
                    	        afterParserOrEnumRuleCall();
                    	    

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


    // $ANTLR start "entryRuleProperties"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1573:1: entryRuleProperties returns [EObject current=null] : iv_ruleProperties= ruleProperties EOF ;
    public final EObject entryRuleProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperties = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1574:2: (iv_ruleProperties= ruleProperties EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1575:2: iv_ruleProperties= ruleProperties EOF
            {
             newCompositeNode(grammarAccess.getPropertiesRule()); 
            pushFollow(FOLLOW_ruleProperties_in_entryRuleProperties3441);
            iv_ruleProperties=ruleProperties();

            state._fsp--;

             current =iv_ruleProperties; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperties3451); 

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
    // $ANTLR end "entryRuleProperties"


    // $ANTLR start "ruleProperties"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1582:1: ruleProperties returns [EObject current=null] : (otherlv_0= ':' (otherlv_1= 'propertyKey=' ( (lv_propertyKey_2_0= RULE_STRING ) ) )? (otherlv_3= 'text=' ( (lv_text_4_0= RULE_STRING ) ) )? (otherlv_5= 'interactiontype=' ( (lv_interactiontype_6_0= ruleInteractiontype ) )+ )? ) ;
    public final EObject ruleProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_propertyKey_2_0=null;
        Token otherlv_3=null;
        Token lv_text_4_0=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_interactiontype_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1585:28: ( (otherlv_0= ':' (otherlv_1= 'propertyKey=' ( (lv_propertyKey_2_0= RULE_STRING ) ) )? (otherlv_3= 'text=' ( (lv_text_4_0= RULE_STRING ) ) )? (otherlv_5= 'interactiontype=' ( (lv_interactiontype_6_0= ruleInteractiontype ) )+ )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1586:1: (otherlv_0= ':' (otherlv_1= 'propertyKey=' ( (lv_propertyKey_2_0= RULE_STRING ) ) )? (otherlv_3= 'text=' ( (lv_text_4_0= RULE_STRING ) ) )? (otherlv_5= 'interactiontype=' ( (lv_interactiontype_6_0= ruleInteractiontype ) )+ )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1586:1: (otherlv_0= ':' (otherlv_1= 'propertyKey=' ( (lv_propertyKey_2_0= RULE_STRING ) ) )? (otherlv_3= 'text=' ( (lv_text_4_0= RULE_STRING ) ) )? (otherlv_5= 'interactiontype=' ( (lv_interactiontype_6_0= ruleInteractiontype ) )+ )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1586:3: otherlv_0= ':' (otherlv_1= 'propertyKey=' ( (lv_propertyKey_2_0= RULE_STRING ) ) )? (otherlv_3= 'text=' ( (lv_text_4_0= RULE_STRING ) ) )? (otherlv_5= 'interactiontype=' ( (lv_interactiontype_6_0= ruleInteractiontype ) )+ )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleProperties3488); 

                	newLeafNode(otherlv_0, grammarAccess.getPropertiesAccess().getColonKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1590:1: (otherlv_1= 'propertyKey=' ( (lv_propertyKey_2_0= RULE_STRING ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1590:3: otherlv_1= 'propertyKey=' ( (lv_propertyKey_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleProperties3501); 

                        	newLeafNode(otherlv_1, grammarAccess.getPropertiesAccess().getPropertyKeyKeyword_1_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1594:1: ( (lv_propertyKey_2_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1595:1: (lv_propertyKey_2_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1595:1: (lv_propertyKey_2_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1596:3: lv_propertyKey_2_0= RULE_STRING
                    {
                    lv_propertyKey_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProperties3518); 

                    			newLeafNode(lv_propertyKey_2_0, grammarAccess.getPropertiesAccess().getPropertyKeySTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPropertiesRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"propertyKey",
                            		lv_propertyKey_2_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1612:4: (otherlv_3= 'text=' ( (lv_text_4_0= RULE_STRING ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1612:6: otherlv_3= 'text=' ( (lv_text_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleProperties3538); 

                        	newLeafNode(otherlv_3, grammarAccess.getPropertiesAccess().getTextKeyword_2_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1616:1: ( (lv_text_4_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1617:1: (lv_text_4_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1617:1: (lv_text_4_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1618:3: lv_text_4_0= RULE_STRING
                    {
                    lv_text_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProperties3555); 

                    			newLeafNode(lv_text_4_0, grammarAccess.getPropertiesAccess().getTextSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPropertiesRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"text",
                            		lv_text_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1634:4: (otherlv_5= 'interactiontype=' ( (lv_interactiontype_6_0= ruleInteractiontype ) )+ )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1634:6: otherlv_5= 'interactiontype=' ( (lv_interactiontype_6_0= ruleInteractiontype ) )+
                    {
                    otherlv_5=(Token)match(input,40,FOLLOW_40_in_ruleProperties3575); 

                        	newLeafNode(otherlv_5, grammarAccess.getPropertiesAccess().getInteractiontypeKeyword_3_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1638:1: ( (lv_interactiontype_6_0= ruleInteractiontype ) )+
                    int cnt25=0;
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( ((LA25_0>=41 && LA25_0<=42)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1639:1: (lv_interactiontype_6_0= ruleInteractiontype )
                    	    {
                    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1639:1: (lv_interactiontype_6_0= ruleInteractiontype )
                    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1640:3: lv_interactiontype_6_0= ruleInteractiontype
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPropertiesAccess().getInteractiontypeInteractiontypeParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInteractiontype_in_ruleProperties3596);
                    	    lv_interactiontype_6_0=ruleInteractiontype();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPropertiesRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"interactiontype",
                    	            		lv_interactiontype_6_0, 
                    	            		"Interactiontype");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt25 >= 1 ) break loop25;
                                EarlyExitException eee =
                                    new EarlyExitException(25, input);
                                throw eee;
                        }
                        cnt25++;
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
    // $ANTLR end "ruleProperties"


    // $ANTLR start "entryRuleLabelDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1664:1: entryRuleLabelDefinition returns [EObject current=null] : iv_ruleLabelDefinition= ruleLabelDefinition EOF ;
    public final EObject entryRuleLabelDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1665:2: (iv_ruleLabelDefinition= ruleLabelDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1666:2: iv_ruleLabelDefinition= ruleLabelDefinition EOF
            {
             newCompositeNode(grammarAccess.getLabelDefinitionRule()); 
            pushFollow(FOLLOW_ruleLabelDefinition_in_entryRuleLabelDefinition3635);
            iv_ruleLabelDefinition=ruleLabelDefinition();

            state._fsp--;

             current =iv_ruleLabelDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelDefinition3645); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1673:1: ruleLabelDefinition returns [EObject current=null] : ( ( (lv_type_0_0= 'Label' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? ) ;
    public final EObject ruleLabelDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1676:28: ( ( ( (lv_type_0_0= 'Label' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1677:1: ( ( (lv_type_0_0= 'Label' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1677:1: ( ( (lv_type_0_0= 'Label' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1677:2: ( (lv_type_0_0= 'Label' ) ) otherlv_1= ' as ' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1677:2: ( (lv_type_0_0= 'Label' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1678:1: (lv_type_0_0= 'Label' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1678:1: (lv_type_0_0= 'Label' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1679:3: lv_type_0_0= 'Label'
            {
            lv_type_0_0=(Token)match(input,15,FOLLOW_15_in_ruleLabelDefinition3688); 

                    newLeafNode(lv_type_0_0, grammarAccess.getLabelDefinitionAccess().getTypeLabelKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_0_0, "Label");
            	    

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleLabelDefinition3713); 

                	newLeafNode(otherlv_1, grammarAccess.getLabelDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1696:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1697:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1697:1: (lv_name_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1698:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabelDefinition3730); 

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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1714:2: ( (lv_properties_3_0= ruleProperties ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1715:1: (lv_properties_3_0= ruleProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1715:1: (lv_properties_3_0= ruleProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1716:3: lv_properties_3_0= ruleProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getLabelDefinitionAccess().getPropertiesPropertiesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProperties_in_ruleLabelDefinition3756);
                    lv_properties_3_0=ruleProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLabelDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"properties",
                            		lv_properties_3_0, 
                            		"Properties");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1740:1: entryRuleInteractiontype returns [String current=null] : iv_ruleInteractiontype= ruleInteractiontype EOF ;
    public final String entryRuleInteractiontype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteractiontype = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1741:2: (iv_ruleInteractiontype= ruleInteractiontype EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1742:2: iv_ruleInteractiontype= ruleInteractiontype EOF
            {
             newCompositeNode(grammarAccess.getInteractiontypeRule()); 
            pushFollow(FOLLOW_ruleInteractiontype_in_entryRuleInteractiontype3794);
            iv_ruleInteractiontype=ruleInteractiontype();

            state._fsp--;

             current =iv_ruleInteractiontype.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractiontype3805); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1749:1: ruleInteractiontype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Click' | kw= 'ChangeText' ) ;
    public final AntlrDatatypeRuleToken ruleInteractiontype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1752:28: ( (kw= 'Click' | kw= 'ChangeText' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1753:1: (kw= 'Click' | kw= 'ChangeText' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1753:1: (kw= 'Click' | kw= 'ChangeText' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==41) ) {
                alt28=1;
            }
            else if ( (LA28_0==42) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1754:2: kw= 'Click'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleInteractiontype3843); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInteractiontypeAccess().getClickKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1761:2: kw= 'ChangeText'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleInteractiontype3862); 

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
    public static final BitSet FOLLOW_ruleAreaCount_in_ruleUIDescription131 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleUIDescription152 = new BitSet(new long[]{0x0000000010130812L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleUIDescription173 = new BitSet(new long[]{0x0000000010120812L});
    public static final BitSet FOLLOW_ruleUsedDescriptions_in_ruleUIDescription195 = new BitSet(new long[]{0x0000000010120812L});
    public static final BitSet FOLLOW_ruleRefinement_in_ruleUIDescription217 = new BitSet(new long[]{0x0000000010100812L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleUIDescription239 = new BitSet(new long[]{0x0000000010100012L});
    public static final BitSet FOLLOW_ruleAreaAssignment_in_ruleUIDescription261 = new BitSet(new long[]{0x0000000010000012L});
    public static final BitSet FOLLOW_ruleRefinement_in_entryRuleRefinement298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefinement308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleRefinement345 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_ruleComponentRefinement_in_ruleRefinement366 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRefinement378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentRefinement_in_entryRuleComponentRefinement414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentRefinement424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelRefinement_in_ruleComponentRefinement471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonRefinement_in_ruleComponentRefinement498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonRefinement_in_entryRuleButtonRefinement533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonRefinement543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleButtonRefinement586 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleButtonRefinement611 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleButtonRefinement628 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleProperties_in_ruleButtonRefinement654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelRefinement_in_entryRuleLabelRefinement691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelRefinement701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleLabelRefinement744 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLabelRefinement769 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabelRefinement786 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleProperties_in_ruleLabelRefinement812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleProperty896 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProperty913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsedDescriptions_in_entryRuleUsedDescriptions954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsedDescriptions964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleUsedDescriptions1001 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_ruleUIDescriptionImport_in_ruleUsedDescriptions1024 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleComplexComponent_in_ruleUsedDescriptions1043 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleUsedDescriptions1059 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUsedDescriptions1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAreaCount_in_entryRuleAreaCount1119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAreaCount1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAreaCount1166 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAreaCount1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition1224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleDefinition1271 = new BitSet(new long[]{0x000000788000A000L});
    public static final BitSet FOLLOW_ruleComponentDefinition_in_ruleDefinition1292 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDefinition1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition1340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleTypeDefinition1387 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypeDefinition1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleType1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleType1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIDescriptionImport_in_entryRuleUIDescriptionImport1553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIDescriptionImport1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUIDescriptionImport1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexComponent_in_entryRuleComplexComponent1644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexComponent1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiselection_in_ruleComplexComponent1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiselection_in_entryRuleMultiselection1734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiselection1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleMultiselection1787 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleMultiselection1813 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMultiselection1830 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMultiselection1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAreaAssignment_in_entryRuleAreaAssignment1885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAreaAssignment1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleAreaAssignment1933 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAreaAssignment1950 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAreaAssignment1967 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAreaAssignment1984 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAreaAssignment2015 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_30_in_ruleAreaAssignment2033 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAreaAssignment2045 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAreaAssignment2062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDefinition_in_entryRuleComponentDefinition2104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentDefinition2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelDefinition_in_ruleComponentDefinition2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonDefinition_in_ruleComponentDefinition2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfieldDefinition_in_ruleComponentDefinition2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreeDefinition_in_ruleComponentDefinition2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableDefinition_in_ruleComponentDefinition2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadioboxDefinition_in_ruleComponentDefinition2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckboxDefinition_in_ruleComponentDefinition2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckboxDefinition_in_entryRuleCheckboxDefinition2358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckboxDefinition2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleCheckboxDefinition2411 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleCheckboxDefinition2436 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCheckboxDefinition2453 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleCheckboxDefinition2470 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleCheckboxDefinition2483 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCheckboxDefinition2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadioboxDefinition_in_entryRuleRadioboxDefinition2543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRadioboxDefinition2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleRadioboxDefinition2596 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleRadioboxDefinition2621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRadioboxDefinition2638 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleRadioboxDefinition2655 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleRadioboxDefinition2668 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRadioboxDefinition2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableDefinition_in_entryRuleTableDefinition2728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableDefinition2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleTableDefinition2781 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleTableDefinition2806 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTableDefinition2823 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleTableDefinition2840 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleTableDefinition2853 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTableDefinition2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreeDefinition_in_entryRuleTreeDefinition2913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTreeDefinition2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleTreeDefinition2966 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleTreeDefinition2991 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTreeDefinition3008 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleTreeDefinition3025 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleTreeDefinition3038 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTreeDefinition3055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfieldDefinition_in_entryRuleTextfieldDefinition3098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextfieldDefinition3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleTextfieldDefinition3151 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleTextfieldDefinition3176 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextfieldDefinition3193 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleTextfieldDefinition3210 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleTextfieldDefinition3223 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextfieldDefinition3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonDefinition_in_entryRuleButtonDefinition3283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonDefinition3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleButtonDefinition3336 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleButtonDefinition3361 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleButtonDefinition3378 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleProperties_in_ruleButtonDefinition3404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperties_in_entryRuleProperties3441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperties3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleProperties3488 = new BitSet(new long[]{0x0000018400000002L});
    public static final BitSet FOLLOW_39_in_ruleProperties3501 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProperties3518 = new BitSet(new long[]{0x0000010400000002L});
    public static final BitSet FOLLOW_34_in_ruleProperties3538 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProperties3555 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleProperties3575 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleInteractiontype_in_ruleProperties3596 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_ruleLabelDefinition_in_entryRuleLabelDefinition3635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelDefinition3645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleLabelDefinition3688 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleLabelDefinition3713 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabelDefinition3730 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleProperties_in_ruleLabelDefinition3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractiontype_in_entryRuleInteractiontype3794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractiontype3805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleInteractiontype3843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleInteractiontype3862 = new BitSet(new long[]{0x0000000000000002L});

}