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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_TABNAME", "RULE_INPUT_DESCRIPTION", "RULE_WS", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'Structure'", "':'", "';'", "'Button'", "'from:'", "'Label'", "'get properties from:'", "'use:'", "'as:'", "'type: '", "'WINDOW'", "'INNERCOMPLEX'", "'TabView'", "'Multiselection'", "'->'", "'propertyKey='", "'text='", "'interactiontype='", "'as'", "'Click'", "'ChangeText'"
    };
    public static final int RULE_ID=8;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int RULE_INPUT_DESCRIPTION=6;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=11;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=9;
    public static final int RULE_WS=7;
    public static final int RULE_TABNAME=5;

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:76:1: ruleUIDescription returns [EObject current=null] : ( ( (lv_typeDefinition_0_0= ruleTypeDefinition ) ) ( (lv_property_1_0= ruleProperty ) )? ( (lv_usedDescriptions_2_0= ruleUsedDescriptions ) )* ( (lv_refinements_3_0= ruleRefinement ) )* ( (lv_definitions_4_0= ruleDefinition ) )* ( (lv_structure_5_0= ruleStructure ) ) ) ;
    public final EObject ruleUIDescription() throws RecognitionException {
        EObject current = null;

        EObject lv_typeDefinition_0_0 = null;

        EObject lv_property_1_0 = null;

        EObject lv_usedDescriptions_2_0 = null;

        EObject lv_refinements_3_0 = null;

        EObject lv_definitions_4_0 = null;

        EObject lv_structure_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:79:28: ( ( ( (lv_typeDefinition_0_0= ruleTypeDefinition ) ) ( (lv_property_1_0= ruleProperty ) )? ( (lv_usedDescriptions_2_0= ruleUsedDescriptions ) )* ( (lv_refinements_3_0= ruleRefinement ) )* ( (lv_definitions_4_0= ruleDefinition ) )* ( (lv_structure_5_0= ruleStructure ) ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:80:1: ( ( (lv_typeDefinition_0_0= ruleTypeDefinition ) ) ( (lv_property_1_0= ruleProperty ) )? ( (lv_usedDescriptions_2_0= ruleUsedDescriptions ) )* ( (lv_refinements_3_0= ruleRefinement ) )* ( (lv_definitions_4_0= ruleDefinition ) )* ( (lv_structure_5_0= ruleStructure ) ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:80:1: ( ( (lv_typeDefinition_0_0= ruleTypeDefinition ) ) ( (lv_property_1_0= ruleProperty ) )? ( (lv_usedDescriptions_2_0= ruleUsedDescriptions ) )* ( (lv_refinements_3_0= ruleRefinement ) )* ( (lv_definitions_4_0= ruleDefinition ) )* ( (lv_structure_5_0= ruleStructure ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:80:2: ( (lv_typeDefinition_0_0= ruleTypeDefinition ) ) ( (lv_property_1_0= ruleProperty ) )? ( (lv_usedDescriptions_2_0= ruleUsedDescriptions ) )* ( (lv_refinements_3_0= ruleRefinement ) )* ( (lv_definitions_4_0= ruleDefinition ) )* ( (lv_structure_5_0= ruleStructure ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:80:2: ( (lv_typeDefinition_0_0= ruleTypeDefinition ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:81:1: (lv_typeDefinition_0_0= ruleTypeDefinition )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:81:1: (lv_typeDefinition_0_0= ruleTypeDefinition )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:82:3: lv_typeDefinition_0_0= ruleTypeDefinition
            {
             
            	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getTypeDefinitionTypeDefinitionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeDefinition_in_ruleUIDescription131);
            lv_typeDefinition_0_0=ruleTypeDefinition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUIDescriptionRule());
            	        }
                   		set(
                   			current, 
                   			"typeDefinition",
                    		lv_typeDefinition_0_0, 
                    		"TypeDefinition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:98:2: ( (lv_property_1_0= ruleProperty ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:99:1: (lv_property_1_0= ruleProperty )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:99:1: (lv_property_1_0= ruleProperty )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:100:3: lv_property_1_0= ruleProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getPropertyPropertyParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProperty_in_ruleUIDescription152);
                    lv_property_1_0=ruleProperty();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUIDescriptionRule());
                    	        }
                           		set(
                           			current, 
                           			"property",
                            		lv_property_1_0, 
                            		"Property");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:116:3: ( (lv_usedDescriptions_2_0= ruleUsedDescriptions ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:117:1: (lv_usedDescriptions_2_0= ruleUsedDescriptions )
            	    {
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:117:1: (lv_usedDescriptions_2_0= ruleUsedDescriptions )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:118:3: lv_usedDescriptions_2_0= ruleUsedDescriptions
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getUsedDescriptionsUsedDescriptionsParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUsedDescriptions_in_ruleUIDescription174);
            	    lv_usedDescriptions_2_0=ruleUsedDescriptions();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUIDescriptionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"usedDescriptions",
            	            		lv_usedDescriptions_2_0, 
            	            		"UsedDescriptions");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:134:3: ( (lv_refinements_3_0= ruleRefinement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1==17) ) {
                        alt3=1;
                    }


                }
                else if ( (LA3_0==16) ) {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2==17) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:135:1: (lv_refinements_3_0= ruleRefinement )
            	    {
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:135:1: (lv_refinements_3_0= ruleRefinement )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:136:3: lv_refinements_3_0= ruleRefinement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getRefinementsRefinementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRefinement_in_ruleUIDescription196);
            	    lv_refinements_3_0=ruleRefinement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUIDescriptionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"refinements",
            	            		lv_refinements_3_0, 
            	            		"Refinement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:152:3: ( (lv_definitions_4_0= ruleDefinition ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16||LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:153:1: (lv_definitions_4_0= ruleDefinition )
            	    {
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:153:1: (lv_definitions_4_0= ruleDefinition )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:154:3: lv_definitions_4_0= ruleDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getDefinitionsDefinitionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDefinition_in_ruleUIDescription218);
            	    lv_definitions_4_0=ruleDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUIDescriptionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"definitions",
            	            		lv_definitions_4_0, 
            	            		"Definition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:170:3: ( (lv_structure_5_0= ruleStructure ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:171:1: (lv_structure_5_0= ruleStructure )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:171:1: (lv_structure_5_0= ruleStructure )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:172:3: lv_structure_5_0= ruleStructure
            {
             
            	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getStructureStructureParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleStructure_in_ruleUIDescription240);
            lv_structure_5_0=ruleStructure();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUIDescriptionRule());
            	        }
                   		set(
                   			current, 
                   			"structure",
                    		lv_structure_5_0, 
                    		"Structure");
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
    // $ANTLR end "ruleUIDescription"


    // $ANTLR start "entryRuleStructure"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:196:1: entryRuleStructure returns [EObject current=null] : iv_ruleStructure= ruleStructure EOF ;
    public final EObject entryRuleStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructure = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:197:2: (iv_ruleStructure= ruleStructure EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:198:2: iv_ruleStructure= ruleStructure EOF
            {
             newCompositeNode(grammarAccess.getStructureRule()); 
            pushFollow(FOLLOW_ruleStructure_in_entryRuleStructure276);
            iv_ruleStructure=ruleStructure();

            state._fsp--;

             current =iv_ruleStructure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructure286); 

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
    // $ANTLR end "entryRuleStructure"


    // $ANTLR start "ruleStructure"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:205:1: ruleStructure returns [EObject current=null] : ( ( (lv_name_0_0= 'Structure' ) ) otherlv_1= ':' ( (lv_orderedElements_2_0= ruleElement ) )* otherlv_3= ';' ) ;
    public final EObject ruleStructure() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_orderedElements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:208:28: ( ( ( (lv_name_0_0= 'Structure' ) ) otherlv_1= ':' ( (lv_orderedElements_2_0= ruleElement ) )* otherlv_3= ';' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:209:1: ( ( (lv_name_0_0= 'Structure' ) ) otherlv_1= ':' ( (lv_orderedElements_2_0= ruleElement ) )* otherlv_3= ';' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:209:1: ( ( (lv_name_0_0= 'Structure' ) ) otherlv_1= ':' ( (lv_orderedElements_2_0= ruleElement ) )* otherlv_3= ';' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:209:2: ( (lv_name_0_0= 'Structure' ) ) otherlv_1= ':' ( (lv_orderedElements_2_0= ruleElement ) )* otherlv_3= ';'
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:209:2: ( (lv_name_0_0= 'Structure' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:210:1: (lv_name_0_0= 'Structure' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:210:1: (lv_name_0_0= 'Structure' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:211:3: lv_name_0_0= 'Structure'
            {
            lv_name_0_0=(Token)match(input,13,FOLLOW_13_in_ruleStructure329); 

                    newLeafNode(lv_name_0_0, grammarAccess.getStructureAccess().getNameStructureKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStructureRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Structure");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleStructure354); 

                	newLeafNode(otherlv_1, grammarAccess.getStructureAccess().getColonKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:228:1: ( (lv_orderedElements_2_0= ruleElement ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:229:1: (lv_orderedElements_2_0= ruleElement )
            	    {
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:229:1: (lv_orderedElements_2_0= ruleElement )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:230:3: lv_orderedElements_2_0= ruleElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStructureAccess().getOrderedElementsElementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElement_in_ruleStructure375);
            	    lv_orderedElements_2_0=ruleElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStructureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"orderedElements",
            	            		lv_orderedElements_2_0, 
            	            		"Element");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleStructure388); 

                	newLeafNode(otherlv_3, grammarAccess.getStructureAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleStructure"


    // $ANTLR start "entryRuleElement"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:258:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:259:2: (iv_ruleElement= ruleElement EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:260:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement424);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement434); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:267:1: ruleElement returns [EObject current=null] : ( (lv_id_0_0= RULE_STRING ) ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:270:28: ( ( (lv_id_0_0= RULE_STRING ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:271:1: ( (lv_id_0_0= RULE_STRING ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:271:1: ( (lv_id_0_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:272:1: (lv_id_0_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:272:1: (lv_id_0_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:273:3: lv_id_0_0= RULE_STRING
            {
            lv_id_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleElement475); 

            			newLeafNode(lv_id_0_0, grammarAccess.getElementAccess().getIdSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_0_0, 
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleRefinement"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:297:1: entryRuleRefinement returns [EObject current=null] : iv_ruleRefinement= ruleRefinement EOF ;
    public final EObject entryRuleRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefinement = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:298:2: (iv_ruleRefinement= ruleRefinement EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:299:2: iv_ruleRefinement= ruleRefinement EOF
            {
             newCompositeNode(grammarAccess.getRefinementRule()); 
            pushFollow(FOLLOW_ruleRefinement_in_entryRuleRefinement515);
            iv_ruleRefinement=ruleRefinement();

            state._fsp--;

             current =iv_ruleRefinement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefinement525); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:306:1: ruleRefinement returns [EObject current=null] : ( ( (lv_concreteRefinement_0_0= ruleComponentRefinement ) ) otherlv_1= ';' ) ;
    public final EObject ruleRefinement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_concreteRefinement_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:309:28: ( ( ( (lv_concreteRefinement_0_0= ruleComponentRefinement ) ) otherlv_1= ';' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:310:1: ( ( (lv_concreteRefinement_0_0= ruleComponentRefinement ) ) otherlv_1= ';' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:310:1: ( ( (lv_concreteRefinement_0_0= ruleComponentRefinement ) ) otherlv_1= ';' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:310:2: ( (lv_concreteRefinement_0_0= ruleComponentRefinement ) ) otherlv_1= ';'
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:310:2: ( (lv_concreteRefinement_0_0= ruleComponentRefinement ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:311:1: (lv_concreteRefinement_0_0= ruleComponentRefinement )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:311:1: (lv_concreteRefinement_0_0= ruleComponentRefinement )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:312:3: lv_concreteRefinement_0_0= ruleComponentRefinement
            {
             
            	        newCompositeNode(grammarAccess.getRefinementAccess().getConcreteRefinementComponentRefinementParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleComponentRefinement_in_ruleRefinement571);
            lv_concreteRefinement_0_0=ruleComponentRefinement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRefinementRule());
            	        }
                   		set(
                   			current, 
                   			"concreteRefinement",
                    		lv_concreteRefinement_0_0, 
                    		"ComponentRefinement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleRefinement583); 

                	newLeafNode(otherlv_1, grammarAccess.getRefinementAccess().getSemicolonKeyword_1());
                

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:340:1: entryRuleComponentRefinement returns [EObject current=null] : iv_ruleComponentRefinement= ruleComponentRefinement EOF ;
    public final EObject entryRuleComponentRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentRefinement = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:341:2: (iv_ruleComponentRefinement= ruleComponentRefinement EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:342:2: iv_ruleComponentRefinement= ruleComponentRefinement EOF
            {
             newCompositeNode(grammarAccess.getComponentRefinementRule()); 
            pushFollow(FOLLOW_ruleComponentRefinement_in_entryRuleComponentRefinement619);
            iv_ruleComponentRefinement=ruleComponentRefinement();

            state._fsp--;

             current =iv_ruleComponentRefinement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentRefinement629); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:349:1: ruleComponentRefinement returns [EObject current=null] : (this_LabelRefinement_0= ruleLabelRefinement | this_ButtonRefinement_1= ruleButtonRefinement ) ;
    public final EObject ruleComponentRefinement() throws RecognitionException {
        EObject current = null;

        EObject this_LabelRefinement_0 = null;

        EObject this_ButtonRefinement_1 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:352:28: ( (this_LabelRefinement_0= ruleLabelRefinement | this_ButtonRefinement_1= ruleButtonRefinement ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:353:1: (this_LabelRefinement_0= ruleLabelRefinement | this_ButtonRefinement_1= ruleButtonRefinement )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:353:1: (this_LabelRefinement_0= ruleLabelRefinement | this_ButtonRefinement_1= ruleButtonRefinement )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:354:5: this_LabelRefinement_0= ruleLabelRefinement
                    {
                     
                            newCompositeNode(grammarAccess.getComponentRefinementAccess().getLabelRefinementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLabelRefinement_in_ruleComponentRefinement676);
                    this_LabelRefinement_0=ruleLabelRefinement();

                    state._fsp--;

                     
                            current = this_LabelRefinement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:364:5: this_ButtonRefinement_1= ruleButtonRefinement
                    {
                     
                            newCompositeNode(grammarAccess.getComponentRefinementAccess().getButtonRefinementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleButtonRefinement_in_ruleComponentRefinement703);
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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:380:1: entryRuleButtonRefinement returns [EObject current=null] : iv_ruleButtonRefinement= ruleButtonRefinement EOF ;
    public final EObject entryRuleButtonRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonRefinement = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:381:2: (iv_ruleButtonRefinement= ruleButtonRefinement EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:382:2: iv_ruleButtonRefinement= ruleButtonRefinement EOF
            {
             newCompositeNode(grammarAccess.getButtonRefinementRule()); 
            pushFollow(FOLLOW_ruleButtonRefinement_in_entryRuleButtonRefinement738);
            iv_ruleButtonRefinement=ruleButtonRefinement();

            state._fsp--;

             current =iv_ruleButtonRefinement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonRefinement748); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:389:1: ruleButtonRefinement returns [EObject current=null] : ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'from:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? ) ;
    public final EObject ruleButtonRefinement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:392:28: ( ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'from:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:393:1: ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'from:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:393:1: ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'from:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:393:2: ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'from:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:393:2: ( (lv_name_0_0= 'Button' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:394:1: (lv_name_0_0= 'Button' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:394:1: (lv_name_0_0= 'Button' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:395:3: lv_name_0_0= 'Button'
            {
            lv_name_0_0=(Token)match(input,16,FOLLOW_16_in_ruleButtonRefinement791); 

                    newLeafNode(lv_name_0_0, grammarAccess.getButtonRefinementAccess().getNameButtonKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getButtonRefinementRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Button");
            	    

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleButtonRefinement816); 

                	newLeafNode(otherlv_1, grammarAccess.getButtonRefinementAccess().getFromKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:412:1: ( (lv_id_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:413:1: (lv_id_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:413:1: (lv_id_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:414:3: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleButtonRefinement833); 

            			newLeafNode(lv_id_2_0, grammarAccess.getButtonRefinementAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getButtonRefinementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:430:2: ( (lv_properties_3_0= ruleProperties ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:431:1: (lv_properties_3_0= ruleProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:431:1: (lv_properties_3_0= ruleProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:432:3: lv_properties_3_0= ruleProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getButtonRefinementAccess().getPropertiesPropertiesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProperties_in_ruleButtonRefinement859);
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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:456:1: entryRuleLabelRefinement returns [EObject current=null] : iv_ruleLabelRefinement= ruleLabelRefinement EOF ;
    public final EObject entryRuleLabelRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelRefinement = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:457:2: (iv_ruleLabelRefinement= ruleLabelRefinement EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:458:2: iv_ruleLabelRefinement= ruleLabelRefinement EOF
            {
             newCompositeNode(grammarAccess.getLabelRefinementRule()); 
            pushFollow(FOLLOW_ruleLabelRefinement_in_entryRuleLabelRefinement896);
            iv_ruleLabelRefinement=ruleLabelRefinement();

            state._fsp--;

             current =iv_ruleLabelRefinement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelRefinement906); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:465:1: ruleLabelRefinement returns [EObject current=null] : ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'from:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? ) ;
    public final EObject ruleLabelRefinement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:468:28: ( ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'from:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:469:1: ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'from:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:469:1: ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'from:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:469:2: ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'from:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:469:2: ( (lv_name_0_0= 'Label' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:470:1: (lv_name_0_0= 'Label' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:470:1: (lv_name_0_0= 'Label' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:471:3: lv_name_0_0= 'Label'
            {
            lv_name_0_0=(Token)match(input,18,FOLLOW_18_in_ruleLabelRefinement949); 

                    newLeafNode(lv_name_0_0, grammarAccess.getLabelRefinementAccess().getNameLabelKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelRefinementRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Label");
            	    

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleLabelRefinement974); 

                	newLeafNode(otherlv_1, grammarAccess.getLabelRefinementAccess().getFromKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:488:1: ( (lv_id_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:489:1: (lv_id_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:489:1: (lv_id_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:490:3: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabelRefinement991); 

            			newLeafNode(lv_id_2_0, grammarAccess.getLabelRefinementAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelRefinementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:506:2: ( (lv_properties_3_0= ruleProperties ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:507:1: (lv_properties_3_0= ruleProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:507:1: (lv_properties_3_0= ruleProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:508:3: lv_properties_3_0= ruleProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getLabelRefinementAccess().getPropertiesPropertiesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProperties_in_ruleLabelRefinement1017);
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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:532:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:533:2: (iv_ruleProperty= ruleProperty EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:534:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1054);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1064); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:541:1: ruleProperty returns [EObject current=null] : (otherlv_0= 'get properties from:' ( (lv_propertiesFile_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_propertiesFile_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:544:28: ( (otherlv_0= 'get properties from:' ( (lv_propertiesFile_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:545:1: (otherlv_0= 'get properties from:' ( (lv_propertiesFile_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:545:1: (otherlv_0= 'get properties from:' ( (lv_propertiesFile_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:545:3: otherlv_0= 'get properties from:' ( (lv_propertiesFile_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleProperty1101); 

                	newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getGetPropertiesFromKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:549:1: ( (lv_propertiesFile_1_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:550:1: (lv_propertiesFile_1_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:550:1: (lv_propertiesFile_1_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:551:3: lv_propertiesFile_1_0= RULE_STRING
            {
            lv_propertiesFile_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProperty1118); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleProperty1135); 

                	newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getSemicolonKeyword_2());
                

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:579:1: entryRuleUsedDescriptions returns [EObject current=null] : iv_ruleUsedDescriptions= ruleUsedDescriptions EOF ;
    public final EObject entryRuleUsedDescriptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsedDescriptions = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:580:2: (iv_ruleUsedDescriptions= ruleUsedDescriptions EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:581:2: iv_ruleUsedDescriptions= ruleUsedDescriptions EOF
            {
             newCompositeNode(grammarAccess.getUsedDescriptionsRule()); 
            pushFollow(FOLLOW_ruleUsedDescriptions_in_entryRuleUsedDescriptions1171);
            iv_ruleUsedDescriptions=ruleUsedDescriptions();

            state._fsp--;

             current =iv_ruleUsedDescriptions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsedDescriptions1181); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:588:1: ruleUsedDescriptions returns [EObject current=null] : (otherlv_0= 'use:' ( (lv_description_1_0= ruleDescriptionType ) ) (otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleUsedDescriptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;
        Token otherlv_4=null;
        EObject lv_description_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:591:28: ( (otherlv_0= 'use:' ( (lv_description_1_0= ruleDescriptionType ) ) (otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) )? otherlv_4= ';' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:592:1: (otherlv_0= 'use:' ( (lv_description_1_0= ruleDescriptionType ) ) (otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) )? otherlv_4= ';' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:592:1: (otherlv_0= 'use:' ( (lv_description_1_0= ruleDescriptionType ) ) (otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) )? otherlv_4= ';' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:592:3: otherlv_0= 'use:' ( (lv_description_1_0= ruleDescriptionType ) ) (otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleUsedDescriptions1218); 

                	newLeafNode(otherlv_0, grammarAccess.getUsedDescriptionsAccess().getUseKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:596:1: ( (lv_description_1_0= ruleDescriptionType ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:597:1: (lv_description_1_0= ruleDescriptionType )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:597:1: (lv_description_1_0= ruleDescriptionType )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:598:3: lv_description_1_0= ruleDescriptionType
            {
             
            	        newCompositeNode(grammarAccess.getUsedDescriptionsAccess().getDescriptionDescriptionTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDescriptionType_in_ruleUsedDescriptions1239);
            lv_description_1_0=ruleDescriptionType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUsedDescriptionsRule());
            	        }
                   		set(
                   			current, 
                   			"description",
                    		lv_description_1_0, 
                    		"DescriptionType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:614:2: (otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:614:4: otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleUsedDescriptions1252); 

                        	newLeafNode(otherlv_2, grammarAccess.getUsedDescriptionsAccess().getAsKeyword_2_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:618:1: ( (lv_id_3_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:619:1: (lv_id_3_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:619:1: (lv_id_3_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:620:3: lv_id_3_0= RULE_STRING
                    {
                    lv_id_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUsedDescriptions1269); 

                    			newLeafNode(lv_id_3_0, grammarAccess.getUsedDescriptionsAccess().getIdSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUsedDescriptionsRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_3_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleUsedDescriptions1288); 

                	newLeafNode(otherlv_4, grammarAccess.getUsedDescriptionsAccess().getSemicolonKeyword_3());
                

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


    // $ANTLR start "entryRuleDescriptionType"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:648:1: entryRuleDescriptionType returns [EObject current=null] : iv_ruleDescriptionType= ruleDescriptionType EOF ;
    public final EObject entryRuleDescriptionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescriptionType = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:649:2: (iv_ruleDescriptionType= ruleDescriptionType EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:650:2: iv_ruleDescriptionType= ruleDescriptionType EOF
            {
             newCompositeNode(grammarAccess.getDescriptionTypeRule()); 
            pushFollow(FOLLOW_ruleDescriptionType_in_entryRuleDescriptionType1324);
            iv_ruleDescriptionType=ruleDescriptionType();

            state._fsp--;

             current =iv_ruleDescriptionType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescriptionType1334); 

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
    // $ANTLR end "entryRuleDescriptionType"


    // $ANTLR start "ruleDescriptionType"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:657:1: ruleDescriptionType returns [EObject current=null] : (this_UIDescriptionImport_0= ruleUIDescriptionImport | this_ComplexComponent_1= ruleComplexComponent ) ;
    public final EObject ruleDescriptionType() throws RecognitionException {
        EObject current = null;

        EObject this_UIDescriptionImport_0 = null;

        EObject this_ComplexComponent_1 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:660:28: ( (this_UIDescriptionImport_0= ruleUIDescriptionImport | this_ComplexComponent_1= ruleComplexComponent ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:661:1: (this_UIDescriptionImport_0= ruleUIDescriptionImport | this_ComplexComponent_1= ruleComplexComponent )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:661:1: (this_UIDescriptionImport_0= ruleUIDescriptionImport | this_ComplexComponent_1= ruleComplexComponent )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=25 && LA10_0<=26)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:662:5: this_UIDescriptionImport_0= ruleUIDescriptionImport
                    {
                     
                            newCompositeNode(grammarAccess.getDescriptionTypeAccess().getUIDescriptionImportParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUIDescriptionImport_in_ruleDescriptionType1381);
                    this_UIDescriptionImport_0=ruleUIDescriptionImport();

                    state._fsp--;

                     
                            current = this_UIDescriptionImport_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:672:5: this_ComplexComponent_1= ruleComplexComponent
                    {
                     
                            newCompositeNode(grammarAccess.getDescriptionTypeAccess().getComplexComponentParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleComplexComponent_in_ruleDescriptionType1408);
                    this_ComplexComponent_1=ruleComplexComponent();

                    state._fsp--;

                     
                            current = this_ComplexComponent_1; 
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
    // $ANTLR end "ruleDescriptionType"


    // $ANTLR start "entryRuleDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:688:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:689:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:690:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition1443);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition1453); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:697:1: ruleDefinition returns [EObject current=null] : ( ( (lv_concreteDefition_0_0= ruleComponentDefinition ) ) otherlv_1= ';' ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_concreteDefition_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:700:28: ( ( ( (lv_concreteDefition_0_0= ruleComponentDefinition ) ) otherlv_1= ';' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:701:1: ( ( (lv_concreteDefition_0_0= ruleComponentDefinition ) ) otherlv_1= ';' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:701:1: ( ( (lv_concreteDefition_0_0= ruleComponentDefinition ) ) otherlv_1= ';' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:701:2: ( (lv_concreteDefition_0_0= ruleComponentDefinition ) ) otherlv_1= ';'
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:701:2: ( (lv_concreteDefition_0_0= ruleComponentDefinition ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:702:1: (lv_concreteDefition_0_0= ruleComponentDefinition )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:702:1: (lv_concreteDefition_0_0= ruleComponentDefinition )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:703:3: lv_concreteDefition_0_0= ruleComponentDefinition
            {
             
            	        newCompositeNode(grammarAccess.getDefinitionAccess().getConcreteDefitionComponentDefinitionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleComponentDefinition_in_ruleDefinition1499);
            lv_concreteDefition_0_0=ruleComponentDefinition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"concreteDefition",
                    		lv_concreteDefition_0_0, 
                    		"ComponentDefinition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleDefinition1511); 

                	newLeafNode(otherlv_1, grammarAccess.getDefinitionAccess().getSemicolonKeyword_1());
                

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:731:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:732:2: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:733:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
            {
             newCompositeNode(grammarAccess.getTypeDefinitionRule()); 
            pushFollow(FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition1547);
            iv_ruleTypeDefinition=ruleTypeDefinition();

            state._fsp--;

             current =iv_ruleTypeDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinition1557); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:740:1: ruleTypeDefinition returns [EObject current=null] : (otherlv_0= 'type: ' ( (lv_type_1_0= ruleType ) ) otherlv_2= ';' ) ;
    public final EObject ruleTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:743:28: ( (otherlv_0= 'type: ' ( (lv_type_1_0= ruleType ) ) otherlv_2= ';' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:744:1: (otherlv_0= 'type: ' ( (lv_type_1_0= ruleType ) ) otherlv_2= ';' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:744:1: (otherlv_0= 'type: ' ( (lv_type_1_0= ruleType ) ) otherlv_2= ';' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:744:3: otherlv_0= 'type: ' ( (lv_type_1_0= ruleType ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleTypeDefinition1594); 

                	newLeafNode(otherlv_0, grammarAccess.getTypeDefinitionAccess().getTypeKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:748:1: ( (lv_type_1_0= ruleType ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:749:1: (lv_type_1_0= ruleType )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:749:1: (lv_type_1_0= ruleType )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:750:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleTypeDefinition1615);
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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleTypeDefinition1627); 

                	newLeafNode(otherlv_2, grammarAccess.getTypeDefinitionAccess().getSemicolonKeyword_2());
                

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:778:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:779:2: (iv_ruleType= ruleType EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:780:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1663);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1673); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:787:1: ruleType returns [EObject current=null] : ( ( (lv_id_0_1= 'WINDOW' | lv_id_0_2= 'INNERCOMPLEX' ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_1=null;
        Token lv_id_0_2=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:790:28: ( ( ( (lv_id_0_1= 'WINDOW' | lv_id_0_2= 'INNERCOMPLEX' ) ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:791:1: ( ( (lv_id_0_1= 'WINDOW' | lv_id_0_2= 'INNERCOMPLEX' ) ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:791:1: ( ( (lv_id_0_1= 'WINDOW' | lv_id_0_2= 'INNERCOMPLEX' ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:792:1: ( (lv_id_0_1= 'WINDOW' | lv_id_0_2= 'INNERCOMPLEX' ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:792:1: ( (lv_id_0_1= 'WINDOW' | lv_id_0_2= 'INNERCOMPLEX' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:793:1: (lv_id_0_1= 'WINDOW' | lv_id_0_2= 'INNERCOMPLEX' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:793:1: (lv_id_0_1= 'WINDOW' | lv_id_0_2= 'INNERCOMPLEX' )
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
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:794:3: lv_id_0_1= 'WINDOW'
                    {
                    lv_id_0_1=(Token)match(input,23,FOLLOW_23_in_ruleType1717); 

                            newLeafNode(lv_id_0_1, grammarAccess.getTypeAccess().getIdWINDOWKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRule());
                    	        }
                           		setWithLastConsumed(current, "id", lv_id_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:806:8: lv_id_0_2= 'INNERCOMPLEX'
                    {
                    lv_id_0_2=(Token)match(input,24,FOLLOW_24_in_ruleType1746); 

                            newLeafNode(lv_id_0_2, grammarAccess.getTypeAccess().getIdINNERCOMPLEXKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRule());
                    	        }
                           		setWithLastConsumed(current, "id", lv_id_0_2, null);
                    	    

                    }
                    break;

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleUIDescriptionImport"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:829:1: entryRuleUIDescriptionImport returns [EObject current=null] : iv_ruleUIDescriptionImport= ruleUIDescriptionImport EOF ;
    public final EObject entryRuleUIDescriptionImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIDescriptionImport = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:830:2: (iv_ruleUIDescriptionImport= ruleUIDescriptionImport EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:831:2: iv_ruleUIDescriptionImport= ruleUIDescriptionImport EOF
            {
             newCompositeNode(grammarAccess.getUIDescriptionImportRule()); 
            pushFollow(FOLLOW_ruleUIDescriptionImport_in_entryRuleUIDescriptionImport1797);
            iv_ruleUIDescriptionImport=ruleUIDescriptionImport();

            state._fsp--;

             current =iv_ruleUIDescriptionImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIDescriptionImport1807); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:838:1: ruleUIDescriptionImport returns [EObject current=null] : ( (lv_descriptionName_0_0= RULE_STRING ) ) ;
    public final EObject ruleUIDescriptionImport() throws RecognitionException {
        EObject current = null;

        Token lv_descriptionName_0_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:841:28: ( ( (lv_descriptionName_0_0= RULE_STRING ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:842:1: ( (lv_descriptionName_0_0= RULE_STRING ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:842:1: ( (lv_descriptionName_0_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:843:1: (lv_descriptionName_0_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:843:1: (lv_descriptionName_0_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:844:3: lv_descriptionName_0_0= RULE_STRING
            {
            lv_descriptionName_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUIDescriptionImport1848); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:868:1: entryRuleComplexComponent returns [EObject current=null] : iv_ruleComplexComponent= ruleComplexComponent EOF ;
    public final EObject entryRuleComplexComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexComponent = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:869:2: (iv_ruleComplexComponent= ruleComplexComponent EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:870:2: iv_ruleComplexComponent= ruleComplexComponent EOF
            {
             newCompositeNode(grammarAccess.getComplexComponentRule()); 
            pushFollow(FOLLOW_ruleComplexComponent_in_entryRuleComplexComponent1888);
            iv_ruleComplexComponent=ruleComplexComponent();

            state._fsp--;

             current =iv_ruleComplexComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexComponent1898); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:877:1: ruleComplexComponent returns [EObject current=null] : (this_Multiselection_0= ruleMultiselection | this_TabView_1= ruleTabView ) ;
    public final EObject ruleComplexComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Multiselection_0 = null;

        EObject this_TabView_1 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:880:28: ( (this_Multiselection_0= ruleMultiselection | this_TabView_1= ruleTabView ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:881:1: (this_Multiselection_0= ruleMultiselection | this_TabView_1= ruleTabView )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:881:1: (this_Multiselection_0= ruleMultiselection | this_TabView_1= ruleTabView )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            else if ( (LA12_0==25) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:882:5: this_Multiselection_0= ruleMultiselection
                    {
                     
                            newCompositeNode(grammarAccess.getComplexComponentAccess().getMultiselectionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMultiselection_in_ruleComplexComponent1945);
                    this_Multiselection_0=ruleMultiselection();

                    state._fsp--;

                     
                            current = this_Multiselection_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:892:5: this_TabView_1= ruleTabView
                    {
                     
                            newCompositeNode(grammarAccess.getComplexComponentAccess().getTabViewParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTabView_in_ruleComplexComponent1972);
                    this_TabView_1=ruleTabView();

                    state._fsp--;

                     
                            current = this_TabView_1; 
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
    // $ANTLR end "ruleComplexComponent"


    // $ANTLR start "entryRuleTabView"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:908:1: entryRuleTabView returns [EObject current=null] : iv_ruleTabView= ruleTabView EOF ;
    public final EObject entryRuleTabView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabView = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:909:2: (iv_ruleTabView= ruleTabView EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:910:2: iv_ruleTabView= ruleTabView EOF
            {
             newCompositeNode(grammarAccess.getTabViewRule()); 
            pushFollow(FOLLOW_ruleTabView_in_entryRuleTabView2007);
            iv_ruleTabView=ruleTabView();

            state._fsp--;

             current =iv_ruleTabView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabView2017); 

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
    // $ANTLR end "entryRuleTabView"


    // $ANTLR start "ruleTabView"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:917:1: ruleTabView returns [EObject current=null] : ( ( (lv_name_0_0= 'TabView' ) ) ( (lv_tabs_1_0= ruleTabDefinition ) )* ) ;
    public final EObject ruleTabView() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_tabs_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:920:28: ( ( ( (lv_name_0_0= 'TabView' ) ) ( (lv_tabs_1_0= ruleTabDefinition ) )* ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:921:1: ( ( (lv_name_0_0= 'TabView' ) ) ( (lv_tabs_1_0= ruleTabDefinition ) )* )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:921:1: ( ( (lv_name_0_0= 'TabView' ) ) ( (lv_tabs_1_0= ruleTabDefinition ) )* )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:921:2: ( (lv_name_0_0= 'TabView' ) ) ( (lv_tabs_1_0= ruleTabDefinition ) )*
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:921:2: ( (lv_name_0_0= 'TabView' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:922:1: (lv_name_0_0= 'TabView' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:922:1: (lv_name_0_0= 'TabView' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:923:3: lv_name_0_0= 'TabView'
            {
            lv_name_0_0=(Token)match(input,25,FOLLOW_25_in_ruleTabView2060); 

                    newLeafNode(lv_name_0_0, grammarAccess.getTabViewAccess().getNameTabViewKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTabViewRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "TabView");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:936:2: ( (lv_tabs_1_0= ruleTabDefinition ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_TABNAME) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:937:1: (lv_tabs_1_0= ruleTabDefinition )
            	    {
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:937:1: (lv_tabs_1_0= ruleTabDefinition )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:938:3: lv_tabs_1_0= ruleTabDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTabViewAccess().getTabsTabDefinitionParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTabDefinition_in_ruleTabView2094);
            	    lv_tabs_1_0=ruleTabDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTabViewRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tabs",
            	            		lv_tabs_1_0, 
            	            		"TabDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "ruleTabView"


    // $ANTLR start "entryRuleTabDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:962:1: entryRuleTabDefinition returns [EObject current=null] : iv_ruleTabDefinition= ruleTabDefinition EOF ;
    public final EObject entryRuleTabDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:963:2: (iv_ruleTabDefinition= ruleTabDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:964:2: iv_ruleTabDefinition= ruleTabDefinition EOF
            {
             newCompositeNode(grammarAccess.getTabDefinitionRule()); 
            pushFollow(FOLLOW_ruleTabDefinition_in_entryRuleTabDefinition2131);
            iv_ruleTabDefinition=ruleTabDefinition();

            state._fsp--;

             current =iv_ruleTabDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabDefinition2141); 

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
    // $ANTLR end "entryRuleTabDefinition"


    // $ANTLR start "ruleTabDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:971:1: ruleTabDefinition returns [EObject current=null] : ( (lv_name_0_0= RULE_TABNAME ) ) ;
    public final EObject ruleTabDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:974:28: ( ( (lv_name_0_0= RULE_TABNAME ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:975:1: ( (lv_name_0_0= RULE_TABNAME ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:975:1: ( (lv_name_0_0= RULE_TABNAME ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:976:1: (lv_name_0_0= RULE_TABNAME )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:976:1: (lv_name_0_0= RULE_TABNAME )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:977:3: lv_name_0_0= RULE_TABNAME
            {
            lv_name_0_0=(Token)match(input,RULE_TABNAME,FOLLOW_RULE_TABNAME_in_ruleTabDefinition2182); 

            			newLeafNode(lv_name_0_0, grammarAccess.getTabDefinitionAccess().getNameTABNAMETerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTabDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"TABNAME");
            	    

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
    // $ANTLR end "ruleTabDefinition"


    // $ANTLR start "entryRuleMultiselection"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1001:1: entryRuleMultiselection returns [EObject current=null] : iv_ruleMultiselection= ruleMultiselection EOF ;
    public final EObject entryRuleMultiselection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiselection = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1002:2: (iv_ruleMultiselection= ruleMultiselection EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1003:2: iv_ruleMultiselection= ruleMultiselection EOF
            {
             newCompositeNode(grammarAccess.getMultiselectionRule()); 
            pushFollow(FOLLOW_ruleMultiselection_in_entryRuleMultiselection2222);
            iv_ruleMultiselection=ruleMultiselection();

            state._fsp--;

             current =iv_ruleMultiselection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiselection2232); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1010:1: ruleMultiselection returns [EObject current=null] : ( ( (lv_name_0_0= 'Multiselection' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? ) ;
    public final EObject ruleMultiselection() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_inputType_1_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1013:28: ( ( ( (lv_name_0_0= 'Multiselection' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1014:1: ( ( (lv_name_0_0= 'Multiselection' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1014:1: ( ( (lv_name_0_0= 'Multiselection' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1014:2: ( (lv_name_0_0= 'Multiselection' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1014:2: ( (lv_name_0_0= 'Multiselection' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1015:1: (lv_name_0_0= 'Multiselection' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1015:1: (lv_name_0_0= 'Multiselection' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1016:3: lv_name_0_0= 'Multiselection'
            {
            lv_name_0_0=(Token)match(input,26,FOLLOW_26_in_ruleMultiselection2275); 

                    newLeafNode(lv_name_0_0, grammarAccess.getMultiselectionAccess().getNameMultiselectionKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMultiselectionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Multiselection");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1029:2: ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INPUT_DESCRIPTION) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1030:1: (lv_inputType_1_0= RULE_INPUT_DESCRIPTION )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1030:1: (lv_inputType_1_0= RULE_INPUT_DESCRIPTION )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1031:3: lv_inputType_1_0= RULE_INPUT_DESCRIPTION
                    {
                    lv_inputType_1_0=(Token)match(input,RULE_INPUT_DESCRIPTION,FOLLOW_RULE_INPUT_DESCRIPTION_in_ruleMultiselection2305); 

                    			newLeafNode(lv_inputType_1_0, grammarAccess.getMultiselectionAccess().getInputTypeINPUT_DESCRIPTIONTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiselectionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"inputType",
                            		lv_inputType_1_0, 
                            		"INPUT_DESCRIPTION");
                    	    

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
    // $ANTLR end "ruleMultiselection"


    // $ANTLR start "entryRuleComponentDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1055:1: entryRuleComponentDefinition returns [EObject current=null] : iv_ruleComponentDefinition= ruleComponentDefinition EOF ;
    public final EObject entryRuleComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1056:2: (iv_ruleComponentDefinition= ruleComponentDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1057:2: iv_ruleComponentDefinition= ruleComponentDefinition EOF
            {
             newCompositeNode(grammarAccess.getComponentDefinitionRule()); 
            pushFollow(FOLLOW_ruleComponentDefinition_in_entryRuleComponentDefinition2347);
            iv_ruleComponentDefinition=ruleComponentDefinition();

            state._fsp--;

             current =iv_ruleComponentDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentDefinition2357); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1064:1: ruleComponentDefinition returns [EObject current=null] : (this_LabelDefinition_0= ruleLabelDefinition | this_ButtonDefinition_1= ruleButtonDefinition ) ;
    public final EObject ruleComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_LabelDefinition_0 = null;

        EObject this_ButtonDefinition_1 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1067:28: ( (this_LabelDefinition_0= ruleLabelDefinition | this_ButtonDefinition_1= ruleButtonDefinition ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1068:1: (this_LabelDefinition_0= ruleLabelDefinition | this_ButtonDefinition_1= ruleButtonDefinition )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1068:1: (this_LabelDefinition_0= ruleLabelDefinition | this_ButtonDefinition_1= ruleButtonDefinition )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            else if ( (LA15_0==16) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1069:5: this_LabelDefinition_0= ruleLabelDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getLabelDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLabelDefinition_in_ruleComponentDefinition2404);
                    this_LabelDefinition_0=ruleLabelDefinition();

                    state._fsp--;

                     
                            current = this_LabelDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1079:5: this_ButtonDefinition_1= ruleButtonDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getButtonDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleButtonDefinition_in_ruleComponentDefinition2431);
                    this_ButtonDefinition_1=ruleButtonDefinition();

                    state._fsp--;

                     
                            current = this_ButtonDefinition_1; 
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


    // $ANTLR start "entryRuleButtonDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1095:1: entryRuleButtonDefinition returns [EObject current=null] : iv_ruleButtonDefinition= ruleButtonDefinition EOF ;
    public final EObject entryRuleButtonDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1096:2: (iv_ruleButtonDefinition= ruleButtonDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1097:2: iv_ruleButtonDefinition= ruleButtonDefinition EOF
            {
             newCompositeNode(grammarAccess.getButtonDefinitionRule()); 
            pushFollow(FOLLOW_ruleButtonDefinition_in_entryRuleButtonDefinition2466);
            iv_ruleButtonDefinition=ruleButtonDefinition();

            state._fsp--;

             current =iv_ruleButtonDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonDefinition2476); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1104:1: ruleButtonDefinition returns [EObject current=null] : ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? ) ;
    public final EObject ruleButtonDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1107:28: ( ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1108:1: ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1108:1: ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1108:2: ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1108:2: ( (lv_name_0_0= 'Button' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1109:1: (lv_name_0_0= 'Button' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1109:1: (lv_name_0_0= 'Button' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1110:3: lv_name_0_0= 'Button'
            {
            lv_name_0_0=(Token)match(input,16,FOLLOW_16_in_ruleButtonDefinition2519); 

                    newLeafNode(lv_name_0_0, grammarAccess.getButtonDefinitionAccess().getNameButtonKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getButtonDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Button");
            	    

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleButtonDefinition2544); 

                	newLeafNode(otherlv_1, grammarAccess.getButtonDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1127:1: ( (lv_id_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1128:1: (lv_id_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1128:1: (lv_id_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1129:3: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleButtonDefinition2561); 

            			newLeafNode(lv_id_2_0, grammarAccess.getButtonDefinitionAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getButtonDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1145:2: ( (lv_properties_3_0= ruleProperties ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1146:1: (lv_properties_3_0= ruleProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1146:1: (lv_properties_3_0= ruleProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1147:3: lv_properties_3_0= ruleProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getButtonDefinitionAccess().getPropertiesPropertiesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProperties_in_ruleButtonDefinition2587);
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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1171:1: entryRuleProperties returns [EObject current=null] : iv_ruleProperties= ruleProperties EOF ;
    public final EObject entryRuleProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperties = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1172:2: (iv_ruleProperties= ruleProperties EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1173:2: iv_ruleProperties= ruleProperties EOF
            {
             newCompositeNode(grammarAccess.getPropertiesRule()); 
            pushFollow(FOLLOW_ruleProperties_in_entryRuleProperties2624);
            iv_ruleProperties=ruleProperties();

            state._fsp--;

             current =iv_ruleProperties; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperties2634); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1180:1: ruleProperties returns [EObject current=null] : (otherlv_0= '->' ( (lv_propertiesDefinitions_1_0= rulePropertiesDefinition ) )+ ) ;
    public final EObject ruleProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_propertiesDefinitions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1183:28: ( (otherlv_0= '->' ( (lv_propertiesDefinitions_1_0= rulePropertiesDefinition ) )+ ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1184:1: (otherlv_0= '->' ( (lv_propertiesDefinitions_1_0= rulePropertiesDefinition ) )+ )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1184:1: (otherlv_0= '->' ( (lv_propertiesDefinitions_1_0= rulePropertiesDefinition ) )+ )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1184:3: otherlv_0= '->' ( (lv_propertiesDefinitions_1_0= rulePropertiesDefinition ) )+
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleProperties2671); 

                	newLeafNode(otherlv_0, grammarAccess.getPropertiesAccess().getHyphenMinusGreaterThanSignKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1188:1: ( (lv_propertiesDefinitions_1_0= rulePropertiesDefinition ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=28 && LA17_0<=30)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1189:1: (lv_propertiesDefinitions_1_0= rulePropertiesDefinition )
            	    {
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1189:1: (lv_propertiesDefinitions_1_0= rulePropertiesDefinition )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1190:3: lv_propertiesDefinitions_1_0= rulePropertiesDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertiesAccess().getPropertiesDefinitionsPropertiesDefinitionParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePropertiesDefinition_in_ruleProperties2692);
            	    lv_propertiesDefinitions_1_0=rulePropertiesDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPropertiesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"propertiesDefinitions",
            	            		lv_propertiesDefinitions_1_0, 
            	            		"PropertiesDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
    // $ANTLR end "ruleProperties"


    // $ANTLR start "entryRulePropertiesDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1214:1: entryRulePropertiesDefinition returns [EObject current=null] : iv_rulePropertiesDefinition= rulePropertiesDefinition EOF ;
    public final EObject entryRulePropertiesDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertiesDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1215:2: (iv_rulePropertiesDefinition= rulePropertiesDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1216:2: iv_rulePropertiesDefinition= rulePropertiesDefinition EOF
            {
             newCompositeNode(grammarAccess.getPropertiesDefinitionRule()); 
            pushFollow(FOLLOW_rulePropertiesDefinition_in_entryRulePropertiesDefinition2729);
            iv_rulePropertiesDefinition=rulePropertiesDefinition();

            state._fsp--;

             current =iv_rulePropertiesDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertiesDefinition2739); 

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
    // $ANTLR end "entryRulePropertiesDefinition"


    // $ANTLR start "rulePropertiesDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1223:1: rulePropertiesDefinition returns [EObject current=null] : ( (otherlv_0= 'propertyKey=' ( (lv_propertyKey_1_0= RULE_STRING ) ) ) | (otherlv_2= 'text=' ( (lv_text_3_0= RULE_STRING ) ) ) | (otherlv_4= 'interactiontype=' ( (lv_interactiontype_5_0= ruleInteractiontype ) )+ ) ) ;
    public final EObject rulePropertiesDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_propertyKey_1_0=null;
        Token otherlv_2=null;
        Token lv_text_3_0=null;
        Token otherlv_4=null;
        EObject lv_interactiontype_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1226:28: ( ( (otherlv_0= 'propertyKey=' ( (lv_propertyKey_1_0= RULE_STRING ) ) ) | (otherlv_2= 'text=' ( (lv_text_3_0= RULE_STRING ) ) ) | (otherlv_4= 'interactiontype=' ( (lv_interactiontype_5_0= ruleInteractiontype ) )+ ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1227:1: ( (otherlv_0= 'propertyKey=' ( (lv_propertyKey_1_0= RULE_STRING ) ) ) | (otherlv_2= 'text=' ( (lv_text_3_0= RULE_STRING ) ) ) | (otherlv_4= 'interactiontype=' ( (lv_interactiontype_5_0= ruleInteractiontype ) )+ ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1227:1: ( (otherlv_0= 'propertyKey=' ( (lv_propertyKey_1_0= RULE_STRING ) ) ) | (otherlv_2= 'text=' ( (lv_text_3_0= RULE_STRING ) ) ) | (otherlv_4= 'interactiontype=' ( (lv_interactiontype_5_0= ruleInteractiontype ) )+ ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt19=1;
                }
                break;
            case 29:
                {
                alt19=2;
                }
                break;
            case 30:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1227:2: (otherlv_0= 'propertyKey=' ( (lv_propertyKey_1_0= RULE_STRING ) ) )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1227:2: (otherlv_0= 'propertyKey=' ( (lv_propertyKey_1_0= RULE_STRING ) ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1227:4: otherlv_0= 'propertyKey=' ( (lv_propertyKey_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_28_in_rulePropertiesDefinition2777); 

                        	newLeafNode(otherlv_0, grammarAccess.getPropertiesDefinitionAccess().getPropertyKeyKeyword_0_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1231:1: ( (lv_propertyKey_1_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1232:1: (lv_propertyKey_1_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1232:1: (lv_propertyKey_1_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1233:3: lv_propertyKey_1_0= RULE_STRING
                    {
                    lv_propertyKey_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePropertiesDefinition2794); 

                    			newLeafNode(lv_propertyKey_1_0, grammarAccess.getPropertiesDefinitionAccess().getPropertyKeySTRINGTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPropertiesDefinitionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"propertyKey",
                            		lv_propertyKey_1_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1250:6: (otherlv_2= 'text=' ( (lv_text_3_0= RULE_STRING ) ) )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1250:6: (otherlv_2= 'text=' ( (lv_text_3_0= RULE_STRING ) ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1250:8: otherlv_2= 'text=' ( (lv_text_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_29_in_rulePropertiesDefinition2819); 

                        	newLeafNode(otherlv_2, grammarAccess.getPropertiesDefinitionAccess().getTextKeyword_1_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1254:1: ( (lv_text_3_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1255:1: (lv_text_3_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1255:1: (lv_text_3_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1256:3: lv_text_3_0= RULE_STRING
                    {
                    lv_text_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePropertiesDefinition2836); 

                    			newLeafNode(lv_text_3_0, grammarAccess.getPropertiesDefinitionAccess().getTextSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPropertiesDefinitionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"text",
                            		lv_text_3_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1273:6: (otherlv_4= 'interactiontype=' ( (lv_interactiontype_5_0= ruleInteractiontype ) )+ )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1273:6: (otherlv_4= 'interactiontype=' ( (lv_interactiontype_5_0= ruleInteractiontype ) )+ )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1273:8: otherlv_4= 'interactiontype=' ( (lv_interactiontype_5_0= ruleInteractiontype ) )+
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_30_in_rulePropertiesDefinition2861); 

                        	newLeafNode(otherlv_4, grammarAccess.getPropertiesDefinitionAccess().getInteractiontypeKeyword_2_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1277:1: ( (lv_interactiontype_5_0= ruleInteractiontype ) )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0>=32 && LA18_0<=33)) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1278:1: (lv_interactiontype_5_0= ruleInteractiontype )
                    	    {
                    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1278:1: (lv_interactiontype_5_0= ruleInteractiontype )
                    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1279:3: lv_interactiontype_5_0= ruleInteractiontype
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPropertiesDefinitionAccess().getInteractiontypeInteractiontypeParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInteractiontype_in_rulePropertiesDefinition2882);
                    	    lv_interactiontype_5_0=ruleInteractiontype();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPropertiesDefinitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"interactiontype",
                    	            		lv_interactiontype_5_0, 
                    	            		"Interactiontype");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);


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
    // $ANTLR end "rulePropertiesDefinition"


    // $ANTLR start "entryRuleLabelDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1303:1: entryRuleLabelDefinition returns [EObject current=null] : iv_ruleLabelDefinition= ruleLabelDefinition EOF ;
    public final EObject entryRuleLabelDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1304:2: (iv_ruleLabelDefinition= ruleLabelDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1305:2: iv_ruleLabelDefinition= ruleLabelDefinition EOF
            {
             newCompositeNode(grammarAccess.getLabelDefinitionRule()); 
            pushFollow(FOLLOW_ruleLabelDefinition_in_entryRuleLabelDefinition2920);
            iv_ruleLabelDefinition=ruleLabelDefinition();

            state._fsp--;

             current =iv_ruleLabelDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelDefinition2930); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1312:1: ruleLabelDefinition returns [EObject current=null] : ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'as' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? ) ;
    public final EObject ruleLabelDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1315:28: ( ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'as' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1316:1: ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'as' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1316:1: ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'as' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1316:2: ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'as' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1316:2: ( (lv_name_0_0= 'Label' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1317:1: (lv_name_0_0= 'Label' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1317:1: (lv_name_0_0= 'Label' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1318:3: lv_name_0_0= 'Label'
            {
            lv_name_0_0=(Token)match(input,18,FOLLOW_18_in_ruleLabelDefinition2973); 

                    newLeafNode(lv_name_0_0, grammarAccess.getLabelDefinitionAccess().getNameLabelKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Label");
            	    

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleLabelDefinition2998); 

                	newLeafNode(otherlv_1, grammarAccess.getLabelDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1335:1: ( (lv_id_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1336:1: (lv_id_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1336:1: (lv_id_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1337:3: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabelDefinition3015); 

            			newLeafNode(lv_id_2_0, grammarAccess.getLabelDefinitionAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1353:2: ( (lv_properties_3_0= ruleProperties ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1354:1: (lv_properties_3_0= ruleProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1354:1: (lv_properties_3_0= ruleProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1355:3: lv_properties_3_0= ruleProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getLabelDefinitionAccess().getPropertiesPropertiesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProperties_in_ruleLabelDefinition3041);
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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1379:1: entryRuleInteractiontype returns [EObject current=null] : iv_ruleInteractiontype= ruleInteractiontype EOF ;
    public final EObject entryRuleInteractiontype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractiontype = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1380:2: (iv_ruleInteractiontype= ruleInteractiontype EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1381:2: iv_ruleInteractiontype= ruleInteractiontype EOF
            {
             newCompositeNode(grammarAccess.getInteractiontypeRule()); 
            pushFollow(FOLLOW_ruleInteractiontype_in_entryRuleInteractiontype3078);
            iv_ruleInteractiontype=ruleInteractiontype();

            state._fsp--;

             current =iv_ruleInteractiontype; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractiontype3088); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1388:1: ruleInteractiontype returns [EObject current=null] : ( ( (lv_id_0_1= 'Click' | lv_id_0_2= 'ChangeText' ) ) ) ;
    public final EObject ruleInteractiontype() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_1=null;
        Token lv_id_0_2=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1391:28: ( ( ( (lv_id_0_1= 'Click' | lv_id_0_2= 'ChangeText' ) ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1392:1: ( ( (lv_id_0_1= 'Click' | lv_id_0_2= 'ChangeText' ) ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1392:1: ( ( (lv_id_0_1= 'Click' | lv_id_0_2= 'ChangeText' ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1393:1: ( (lv_id_0_1= 'Click' | lv_id_0_2= 'ChangeText' ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1393:1: ( (lv_id_0_1= 'Click' | lv_id_0_2= 'ChangeText' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1394:1: (lv_id_0_1= 'Click' | lv_id_0_2= 'ChangeText' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1394:1: (lv_id_0_1= 'Click' | lv_id_0_2= 'ChangeText' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            else if ( (LA21_0==33) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1395:3: lv_id_0_1= 'Click'
                    {
                    lv_id_0_1=(Token)match(input,32,FOLLOW_32_in_ruleInteractiontype3132); 

                            newLeafNode(lv_id_0_1, grammarAccess.getInteractiontypeAccess().getIdClickKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInteractiontypeRule());
                    	        }
                           		setWithLastConsumed(current, "id", lv_id_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1407:8: lv_id_0_2= 'ChangeText'
                    {
                    lv_id_0_2=(Token)match(input,33,FOLLOW_33_in_ruleInteractiontype3161); 

                            newLeafNode(lv_id_0_2, grammarAccess.getInteractiontypeAccess().getIdChangeTextKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInteractiontypeRule());
                    	        }
                           		setWithLastConsumed(current, "id", lv_id_0_2, null);
                    	    

                    }
                    break;

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
    // $ANTLR end "ruleInteractiontype"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleUIDescription_in_entryRuleUIDescription75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIDescription85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleUIDescription131 = new BitSet(new long[]{0x00000000001D2000L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleUIDescription152 = new BitSet(new long[]{0x00000000001D2000L});
    public static final BitSet FOLLOW_ruleUsedDescriptions_in_ruleUIDescription174 = new BitSet(new long[]{0x00000000001D2000L});
    public static final BitSet FOLLOW_ruleRefinement_in_ruleUIDescription196 = new BitSet(new long[]{0x00000000001D2000L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleUIDescription218 = new BitSet(new long[]{0x00000000001D2000L});
    public static final BitSet FOLLOW_ruleStructure_in_ruleUIDescription240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructure_in_entryRuleStructure276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructure286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleStructure329 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStructure354 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleElement_in_ruleStructure375 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleStructure388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleElement475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefinement_in_entryRuleRefinement515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefinement525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentRefinement_in_ruleRefinement571 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRefinement583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentRefinement_in_entryRuleComponentRefinement619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentRefinement629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelRefinement_in_ruleComponentRefinement676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonRefinement_in_ruleComponentRefinement703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonRefinement_in_entryRuleButtonRefinement738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonRefinement748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleButtonRefinement791 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleButtonRefinement816 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleButtonRefinement833 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleProperties_in_ruleButtonRefinement859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelRefinement_in_entryRuleLabelRefinement896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelRefinement906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleLabelRefinement949 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleLabelRefinement974 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabelRefinement991 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleProperties_in_ruleLabelRefinement1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleProperty1101 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProperty1118 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleProperty1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsedDescriptions_in_entryRuleUsedDescriptions1171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsedDescriptions1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleUsedDescriptions1218 = new BitSet(new long[]{0x0000000006000010L});
    public static final BitSet FOLLOW_ruleDescriptionType_in_ruleUsedDescriptions1239 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_21_in_ruleUsedDescriptions1252 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUsedDescriptions1269 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleUsedDescriptions1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescriptionType_in_entryRuleDescriptionType1324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescriptionType1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIDescriptionImport_in_ruleDescriptionType1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexComponent_in_ruleDescriptionType1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition1443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDefinition_in_ruleDefinition1499 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDefinition1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition1547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleTypeDefinition1594 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypeDefinition1615 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTypeDefinition1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleType1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleType1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIDescriptionImport_in_entryRuleUIDescriptionImport1797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIDescriptionImport1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUIDescriptionImport1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexComponent_in_entryRuleComplexComponent1888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexComponent1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiselection_in_ruleComplexComponent1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabView_in_ruleComplexComponent1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabView_in_entryRuleTabView2007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabView2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTabView2060 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleTabDefinition_in_ruleTabView2094 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleTabDefinition_in_entryRuleTabDefinition2131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabDefinition2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TABNAME_in_ruleTabDefinition2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiselection_in_entryRuleMultiselection2222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiselection2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleMultiselection2275 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_INPUT_DESCRIPTION_in_ruleMultiselection2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDefinition_in_entryRuleComponentDefinition2347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentDefinition2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelDefinition_in_ruleComponentDefinition2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonDefinition_in_ruleComponentDefinition2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonDefinition_in_entryRuleButtonDefinition2466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonDefinition2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleButtonDefinition2519 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleButtonDefinition2544 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleButtonDefinition2561 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleProperties_in_ruleButtonDefinition2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperties_in_entryRuleProperties2624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperties2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleProperties2671 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_rulePropertiesDefinition_in_ruleProperties2692 = new BitSet(new long[]{0x0000000070000002L});
    public static final BitSet FOLLOW_rulePropertiesDefinition_in_entryRulePropertiesDefinition2729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertiesDefinition2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulePropertiesDefinition2777 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePropertiesDefinition2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulePropertiesDefinition2819 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePropertiesDefinition2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePropertiesDefinition2861 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_ruleInteractiontype_in_rulePropertiesDefinition2882 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_ruleLabelDefinition_in_entryRuleLabelDefinition2920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelDefinition2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleLabelDefinition2973 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleLabelDefinition2998 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabelDefinition3015 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleProperties_in_ruleLabelDefinition3041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractiontype_in_entryRuleInteractiontype3078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractiontype3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleInteractiontype3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleInteractiontype3161 = new BitSet(new long[]{0x0000000000000002L});

}