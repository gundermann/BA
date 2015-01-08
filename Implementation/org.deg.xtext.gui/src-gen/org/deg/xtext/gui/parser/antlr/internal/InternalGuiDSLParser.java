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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INPUT_DESCRIPTION", "RULE_WS", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'Structure'", "':'", "';'", "'Button'", "'from:'", "'Label'", "'from: '", "'get properties from:'", "'use: '", "'as:'", "'type: '", "'WINDOW'", "'INNERCOMPLEX'", "'Multiselection'", "'->'", "'propertyKey='", "'text='", "'interactiontype='", "'as'", "'Click'", "'ChangeText'"
    };
    public static final int RULE_ID=7;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int RULE_INPUT_DESCRIPTION=5;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=8;
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

                if ( (LA3_0==17) ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1==18) ) {
                        alt3=1;
                    }


                }
                else if ( (LA3_0==15) ) {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2==16) ) {
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

                if ( (LA4_0==15||LA4_0==17) ) {
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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:205:1: ruleStructure returns [EObject current=null] : ( ( (lv_name_0_0= 'Structure' ) ) otherlv_1= ':' ( (lv_orderedElements_2_0= ruleElement ) )* ) ;
    public final EObject ruleStructure() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_orderedElements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:208:28: ( ( ( (lv_name_0_0= 'Structure' ) ) otherlv_1= ':' ( (lv_orderedElements_2_0= ruleElement ) )* ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:209:1: ( ( (lv_name_0_0= 'Structure' ) ) otherlv_1= ':' ( (lv_orderedElements_2_0= ruleElement ) )* )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:209:1: ( ( (lv_name_0_0= 'Structure' ) ) otherlv_1= ':' ( (lv_orderedElements_2_0= ruleElement ) )* )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:209:2: ( (lv_name_0_0= 'Structure' ) ) otherlv_1= ':' ( (lv_orderedElements_2_0= ruleElement ) )*
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:209:2: ( (lv_name_0_0= 'Structure' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:210:1: (lv_name_0_0= 'Structure' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:210:1: (lv_name_0_0= 'Structure' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:211:3: lv_name_0_0= 'Structure'
            {
            lv_name_0_0=(Token)match(input,12,FOLLOW_12_in_ruleStructure329); 

                    newLeafNode(lv_name_0_0, grammarAccess.getStructureAccess().getNameStructureKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStructureRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Structure");
            	    

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleStructure354); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:254:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:255:2: (iv_ruleElement= ruleElement EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:256:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement412);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement422); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:263:1: ruleElement returns [EObject current=null] : ( (lv_id_0_0= RULE_STRING ) ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:266:28: ( ( (lv_id_0_0= RULE_STRING ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:267:1: ( (lv_id_0_0= RULE_STRING ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:267:1: ( (lv_id_0_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:268:1: (lv_id_0_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:268:1: (lv_id_0_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:269:3: lv_id_0_0= RULE_STRING
            {
            lv_id_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleElement463); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:293:1: entryRuleRefinement returns [EObject current=null] : iv_ruleRefinement= ruleRefinement EOF ;
    public final EObject entryRuleRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefinement = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:294:2: (iv_ruleRefinement= ruleRefinement EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:295:2: iv_ruleRefinement= ruleRefinement EOF
            {
             newCompositeNode(grammarAccess.getRefinementRule()); 
            pushFollow(FOLLOW_ruleRefinement_in_entryRuleRefinement503);
            iv_ruleRefinement=ruleRefinement();

            state._fsp--;

             current =iv_ruleRefinement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefinement513); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:302:1: ruleRefinement returns [EObject current=null] : ( ( (lv_concreteRefinement_0_0= ruleComponentRefinement ) ) otherlv_1= ';' ) ;
    public final EObject ruleRefinement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_concreteRefinement_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:305:28: ( ( ( (lv_concreteRefinement_0_0= ruleComponentRefinement ) ) otherlv_1= ';' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:306:1: ( ( (lv_concreteRefinement_0_0= ruleComponentRefinement ) ) otherlv_1= ';' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:306:1: ( ( (lv_concreteRefinement_0_0= ruleComponentRefinement ) ) otherlv_1= ';' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:306:2: ( (lv_concreteRefinement_0_0= ruleComponentRefinement ) ) otherlv_1= ';'
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:306:2: ( (lv_concreteRefinement_0_0= ruleComponentRefinement ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:307:1: (lv_concreteRefinement_0_0= ruleComponentRefinement )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:307:1: (lv_concreteRefinement_0_0= ruleComponentRefinement )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:308:3: lv_concreteRefinement_0_0= ruleComponentRefinement
            {
             
            	        newCompositeNode(grammarAccess.getRefinementAccess().getConcreteRefinementComponentRefinementParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleComponentRefinement_in_ruleRefinement559);
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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleRefinement571); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:336:1: entryRuleComponentRefinement returns [EObject current=null] : iv_ruleComponentRefinement= ruleComponentRefinement EOF ;
    public final EObject entryRuleComponentRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentRefinement = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:337:2: (iv_ruleComponentRefinement= ruleComponentRefinement EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:338:2: iv_ruleComponentRefinement= ruleComponentRefinement EOF
            {
             newCompositeNode(grammarAccess.getComponentRefinementRule()); 
            pushFollow(FOLLOW_ruleComponentRefinement_in_entryRuleComponentRefinement607);
            iv_ruleComponentRefinement=ruleComponentRefinement();

            state._fsp--;

             current =iv_ruleComponentRefinement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentRefinement617); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:345:1: ruleComponentRefinement returns [EObject current=null] : (this_LabelRefinement_0= ruleLabelRefinement | this_ButtonRefinement_1= ruleButtonRefinement ) ;
    public final EObject ruleComponentRefinement() throws RecognitionException {
        EObject current = null;

        EObject this_LabelRefinement_0 = null;

        EObject this_ButtonRefinement_1 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:348:28: ( (this_LabelRefinement_0= ruleLabelRefinement | this_ButtonRefinement_1= ruleButtonRefinement ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:349:1: (this_LabelRefinement_0= ruleLabelRefinement | this_ButtonRefinement_1= ruleButtonRefinement )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:349:1: (this_LabelRefinement_0= ruleLabelRefinement | this_ButtonRefinement_1= ruleButtonRefinement )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:350:5: this_LabelRefinement_0= ruleLabelRefinement
                    {
                     
                            newCompositeNode(grammarAccess.getComponentRefinementAccess().getLabelRefinementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLabelRefinement_in_ruleComponentRefinement664);
                    this_LabelRefinement_0=ruleLabelRefinement();

                    state._fsp--;

                     
                            current = this_LabelRefinement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:360:5: this_ButtonRefinement_1= ruleButtonRefinement
                    {
                     
                            newCompositeNode(grammarAccess.getComponentRefinementAccess().getButtonRefinementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleButtonRefinement_in_ruleComponentRefinement691);
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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:376:1: entryRuleButtonRefinement returns [EObject current=null] : iv_ruleButtonRefinement= ruleButtonRefinement EOF ;
    public final EObject entryRuleButtonRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonRefinement = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:377:2: (iv_ruleButtonRefinement= ruleButtonRefinement EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:378:2: iv_ruleButtonRefinement= ruleButtonRefinement EOF
            {
             newCompositeNode(grammarAccess.getButtonRefinementRule()); 
            pushFollow(FOLLOW_ruleButtonRefinement_in_entryRuleButtonRefinement726);
            iv_ruleButtonRefinement=ruleButtonRefinement();

            state._fsp--;

             current =iv_ruleButtonRefinement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonRefinement736); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:385:1: ruleButtonRefinement returns [EObject current=null] : ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'from:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? ) ;
    public final EObject ruleButtonRefinement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:388:28: ( ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'from:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:389:1: ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'from:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:389:1: ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'from:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:389:2: ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'from:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:389:2: ( (lv_name_0_0= 'Button' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:390:1: (lv_name_0_0= 'Button' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:390:1: (lv_name_0_0= 'Button' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:391:3: lv_name_0_0= 'Button'
            {
            lv_name_0_0=(Token)match(input,15,FOLLOW_15_in_ruleButtonRefinement779); 

                    newLeafNode(lv_name_0_0, grammarAccess.getButtonRefinementAccess().getNameButtonKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getButtonRefinementRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Button");
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleButtonRefinement804); 

                	newLeafNode(otherlv_1, grammarAccess.getButtonRefinementAccess().getFromKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:408:1: ( (lv_id_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:409:1: (lv_id_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:409:1: (lv_id_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:410:3: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleButtonRefinement821); 

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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:426:2: ( (lv_properties_3_0= ruleProperties ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:427:1: (lv_properties_3_0= ruleProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:427:1: (lv_properties_3_0= ruleProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:428:3: lv_properties_3_0= ruleProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getButtonRefinementAccess().getPropertiesPropertiesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProperties_in_ruleButtonRefinement847);
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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:452:1: entryRuleLabelRefinement returns [EObject current=null] : iv_ruleLabelRefinement= ruleLabelRefinement EOF ;
    public final EObject entryRuleLabelRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelRefinement = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:453:2: (iv_ruleLabelRefinement= ruleLabelRefinement EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:454:2: iv_ruleLabelRefinement= ruleLabelRefinement EOF
            {
             newCompositeNode(grammarAccess.getLabelRefinementRule()); 
            pushFollow(FOLLOW_ruleLabelRefinement_in_entryRuleLabelRefinement884);
            iv_ruleLabelRefinement=ruleLabelRefinement();

            state._fsp--;

             current =iv_ruleLabelRefinement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelRefinement894); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:461:1: ruleLabelRefinement returns [EObject current=null] : ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'from: ' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? ) ;
    public final EObject ruleLabelRefinement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:464:28: ( ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'from: ' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:465:1: ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'from: ' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:465:1: ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'from: ' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:465:2: ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'from: ' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:465:2: ( (lv_name_0_0= 'Label' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:466:1: (lv_name_0_0= 'Label' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:466:1: (lv_name_0_0= 'Label' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:467:3: lv_name_0_0= 'Label'
            {
            lv_name_0_0=(Token)match(input,17,FOLLOW_17_in_ruleLabelRefinement937); 

                    newLeafNode(lv_name_0_0, grammarAccess.getLabelRefinementAccess().getNameLabelKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelRefinementRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Label");
            	    

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleLabelRefinement962); 

                	newLeafNode(otherlv_1, grammarAccess.getLabelRefinementAccess().getFromKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:484:1: ( (lv_id_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:485:1: (lv_id_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:485:1: (lv_id_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:486:3: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabelRefinement979); 

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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:502:2: ( (lv_properties_3_0= ruleProperties ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:503:1: (lv_properties_3_0= ruleProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:503:1: (lv_properties_3_0= ruleProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:504:3: lv_properties_3_0= ruleProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getLabelRefinementAccess().getPropertiesPropertiesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProperties_in_ruleLabelRefinement1005);
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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:528:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:529:2: (iv_ruleProperty= ruleProperty EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:530:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1042);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1052); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:537:1: ruleProperty returns [EObject current=null] : (otherlv_0= 'get properties from:' ( (lv_propertiesFile_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_propertiesFile_1_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:540:28: ( (otherlv_0= 'get properties from:' ( (lv_propertiesFile_1_0= RULE_STRING ) ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:541:1: (otherlv_0= 'get properties from:' ( (lv_propertiesFile_1_0= RULE_STRING ) ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:541:1: (otherlv_0= 'get properties from:' ( (lv_propertiesFile_1_0= RULE_STRING ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:541:3: otherlv_0= 'get properties from:' ( (lv_propertiesFile_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleProperty1089); 

                	newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getGetPropertiesFromKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:545:1: ( (lv_propertiesFile_1_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:546:1: (lv_propertiesFile_1_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:546:1: (lv_propertiesFile_1_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:547:3: lv_propertiesFile_1_0= RULE_STRING
            {
            lv_propertiesFile_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProperty1106); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:571:1: entryRuleUsedDescriptions returns [EObject current=null] : iv_ruleUsedDescriptions= ruleUsedDescriptions EOF ;
    public final EObject entryRuleUsedDescriptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsedDescriptions = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:572:2: (iv_ruleUsedDescriptions= ruleUsedDescriptions EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:573:2: iv_ruleUsedDescriptions= ruleUsedDescriptions EOF
            {
             newCompositeNode(grammarAccess.getUsedDescriptionsRule()); 
            pushFollow(FOLLOW_ruleUsedDescriptions_in_entryRuleUsedDescriptions1147);
            iv_ruleUsedDescriptions=ruleUsedDescriptions();

            state._fsp--;

             current =iv_ruleUsedDescriptions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsedDescriptions1157); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:580:1: ruleUsedDescriptions returns [EObject current=null] : (otherlv_0= 'use: ' ( (lv_description_1_0= ruleDescriptionType ) ) (otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleUsedDescriptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;
        EObject lv_description_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:583:28: ( (otherlv_0= 'use: ' ( (lv_description_1_0= ruleDescriptionType ) ) (otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:584:1: (otherlv_0= 'use: ' ( (lv_description_1_0= ruleDescriptionType ) ) (otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:584:1: (otherlv_0= 'use: ' ( (lv_description_1_0= ruleDescriptionType ) ) (otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:584:3: otherlv_0= 'use: ' ( (lv_description_1_0= ruleDescriptionType ) ) (otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleUsedDescriptions1194); 

                	newLeafNode(otherlv_0, grammarAccess.getUsedDescriptionsAccess().getUseKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:588:1: ( (lv_description_1_0= ruleDescriptionType ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:589:1: (lv_description_1_0= ruleDescriptionType )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:589:1: (lv_description_1_0= ruleDescriptionType )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:590:3: lv_description_1_0= ruleDescriptionType
            {
             
            	        newCompositeNode(grammarAccess.getUsedDescriptionsAccess().getDescriptionDescriptionTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDescriptionType_in_ruleUsedDescriptions1215);
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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:606:2: (otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:606:4: otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleUsedDescriptions1228); 

                        	newLeafNode(otherlv_2, grammarAccess.getUsedDescriptionsAccess().getAsKeyword_2_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:610:1: ( (lv_id_3_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:611:1: (lv_id_3_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:611:1: (lv_id_3_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:612:3: lv_id_3_0= RULE_STRING
                    {
                    lv_id_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUsedDescriptions1245); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:636:1: entryRuleDescriptionType returns [EObject current=null] : iv_ruleDescriptionType= ruleDescriptionType EOF ;
    public final EObject entryRuleDescriptionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescriptionType = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:637:2: (iv_ruleDescriptionType= ruleDescriptionType EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:638:2: iv_ruleDescriptionType= ruleDescriptionType EOF
            {
             newCompositeNode(grammarAccess.getDescriptionTypeRule()); 
            pushFollow(FOLLOW_ruleDescriptionType_in_entryRuleDescriptionType1288);
            iv_ruleDescriptionType=ruleDescriptionType();

            state._fsp--;

             current =iv_ruleDescriptionType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescriptionType1298); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:645:1: ruleDescriptionType returns [EObject current=null] : (this_UIDescriptionImport_0= ruleUIDescriptionImport | this_ComplexComponent_1= ruleComplexComponent ) ;
    public final EObject ruleDescriptionType() throws RecognitionException {
        EObject current = null;

        EObject this_UIDescriptionImport_0 = null;

        EObject this_ComplexComponent_1 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:648:28: ( (this_UIDescriptionImport_0= ruleUIDescriptionImport | this_ComplexComponent_1= ruleComplexComponent ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:649:1: (this_UIDescriptionImport_0= ruleUIDescriptionImport | this_ComplexComponent_1= ruleComplexComponent )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:649:1: (this_UIDescriptionImport_0= ruleUIDescriptionImport | this_ComplexComponent_1= ruleComplexComponent )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==25) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:650:5: this_UIDescriptionImport_0= ruleUIDescriptionImport
                    {
                     
                            newCompositeNode(grammarAccess.getDescriptionTypeAccess().getUIDescriptionImportParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUIDescriptionImport_in_ruleDescriptionType1345);
                    this_UIDescriptionImport_0=ruleUIDescriptionImport();

                    state._fsp--;

                     
                            current = this_UIDescriptionImport_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:660:5: this_ComplexComponent_1= ruleComplexComponent
                    {
                     
                            newCompositeNode(grammarAccess.getDescriptionTypeAccess().getComplexComponentParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleComplexComponent_in_ruleDescriptionType1372);
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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:676:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:677:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:678:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition1407);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition1417); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:685:1: ruleDefinition returns [EObject current=null] : ( ( (lv_concreteDefition_0_0= ruleComponentDefinition ) ) otherlv_1= ';' ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_concreteDefition_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:688:28: ( ( ( (lv_concreteDefition_0_0= ruleComponentDefinition ) ) otherlv_1= ';' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:689:1: ( ( (lv_concreteDefition_0_0= ruleComponentDefinition ) ) otherlv_1= ';' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:689:1: ( ( (lv_concreteDefition_0_0= ruleComponentDefinition ) ) otherlv_1= ';' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:689:2: ( (lv_concreteDefition_0_0= ruleComponentDefinition ) ) otherlv_1= ';'
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:689:2: ( (lv_concreteDefition_0_0= ruleComponentDefinition ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:690:1: (lv_concreteDefition_0_0= ruleComponentDefinition )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:690:1: (lv_concreteDefition_0_0= ruleComponentDefinition )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:691:3: lv_concreteDefition_0_0= ruleComponentDefinition
            {
             
            	        newCompositeNode(grammarAccess.getDefinitionAccess().getConcreteDefitionComponentDefinitionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleComponentDefinition_in_ruleDefinition1463);
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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleDefinition1475); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:719:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:720:2: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:721:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
            {
             newCompositeNode(grammarAccess.getTypeDefinitionRule()); 
            pushFollow(FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition1511);
            iv_ruleTypeDefinition=ruleTypeDefinition();

            state._fsp--;

             current =iv_ruleTypeDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinition1521); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:728:1: ruleTypeDefinition returns [EObject current=null] : (otherlv_0= 'type: ' ( (lv_type_1_0= ruleType ) ) ) ;
    public final EObject ruleTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:731:28: ( (otherlv_0= 'type: ' ( (lv_type_1_0= ruleType ) ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:732:1: (otherlv_0= 'type: ' ( (lv_type_1_0= ruleType ) ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:732:1: (otherlv_0= 'type: ' ( (lv_type_1_0= ruleType ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:732:3: otherlv_0= 'type: ' ( (lv_type_1_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleTypeDefinition1558); 

                	newLeafNode(otherlv_0, grammarAccess.getTypeDefinitionAccess().getTypeKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:736:1: ( (lv_type_1_0= ruleType ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:737:1: (lv_type_1_0= ruleType )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:737:1: (lv_type_1_0= ruleType )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:738:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleTypeDefinition1579);
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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:762:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:763:2: (iv_ruleType= ruleType EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:764:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1616);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1627); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:771:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'WINDOW' | kw= 'INNERCOMPLEX' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:774:28: ( (kw= 'WINDOW' | kw= 'INNERCOMPLEX' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:775:1: (kw= 'WINDOW' | kw= 'INNERCOMPLEX' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:775:1: (kw= 'WINDOW' | kw= 'INNERCOMPLEX' )
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
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:776:2: kw= 'WINDOW'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleType1665); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getWINDOWKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:783:2: kw= 'INNERCOMPLEX'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleType1684); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:796:1: entryRuleUIDescriptionImport returns [EObject current=null] : iv_ruleUIDescriptionImport= ruleUIDescriptionImport EOF ;
    public final EObject entryRuleUIDescriptionImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIDescriptionImport = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:797:2: (iv_ruleUIDescriptionImport= ruleUIDescriptionImport EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:798:2: iv_ruleUIDescriptionImport= ruleUIDescriptionImport EOF
            {
             newCompositeNode(grammarAccess.getUIDescriptionImportRule()); 
            pushFollow(FOLLOW_ruleUIDescriptionImport_in_entryRuleUIDescriptionImport1724);
            iv_ruleUIDescriptionImport=ruleUIDescriptionImport();

            state._fsp--;

             current =iv_ruleUIDescriptionImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIDescriptionImport1734); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:805:1: ruleUIDescriptionImport returns [EObject current=null] : ( (lv_descriptionName_0_0= RULE_STRING ) ) ;
    public final EObject ruleUIDescriptionImport() throws RecognitionException {
        EObject current = null;

        Token lv_descriptionName_0_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:808:28: ( ( (lv_descriptionName_0_0= RULE_STRING ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:809:1: ( (lv_descriptionName_0_0= RULE_STRING ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:809:1: ( (lv_descriptionName_0_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:810:1: (lv_descriptionName_0_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:810:1: (lv_descriptionName_0_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:811:3: lv_descriptionName_0_0= RULE_STRING
            {
            lv_descriptionName_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUIDescriptionImport1775); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:835:1: entryRuleComplexComponent returns [EObject current=null] : iv_ruleComplexComponent= ruleComplexComponent EOF ;
    public final EObject entryRuleComplexComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexComponent = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:836:2: (iv_ruleComplexComponent= ruleComplexComponent EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:837:2: iv_ruleComplexComponent= ruleComplexComponent EOF
            {
             newCompositeNode(grammarAccess.getComplexComponentRule()); 
            pushFollow(FOLLOW_ruleComplexComponent_in_entryRuleComplexComponent1815);
            iv_ruleComplexComponent=ruleComplexComponent();

            state._fsp--;

             current =iv_ruleComplexComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexComponent1825); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:844:1: ruleComplexComponent returns [EObject current=null] : this_Multiselection_0= ruleMultiselection ;
    public final EObject ruleComplexComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Multiselection_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:847:28: (this_Multiselection_0= ruleMultiselection )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:849:5: this_Multiselection_0= ruleMultiselection
            {
             
                    newCompositeNode(grammarAccess.getComplexComponentAccess().getMultiselectionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleMultiselection_in_ruleComplexComponent1871);
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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:865:1: entryRuleMultiselection returns [EObject current=null] : iv_ruleMultiselection= ruleMultiselection EOF ;
    public final EObject entryRuleMultiselection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiselection = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:866:2: (iv_ruleMultiselection= ruleMultiselection EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:867:2: iv_ruleMultiselection= ruleMultiselection EOF
            {
             newCompositeNode(grammarAccess.getMultiselectionRule()); 
            pushFollow(FOLLOW_ruleMultiselection_in_entryRuleMultiselection1905);
            iv_ruleMultiselection=ruleMultiselection();

            state._fsp--;

             current =iv_ruleMultiselection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiselection1915); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:874:1: ruleMultiselection returns [EObject current=null] : ( ( (lv_descriptionName_0_0= 'Multiselection' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? ) ;
    public final EObject ruleMultiselection() throws RecognitionException {
        EObject current = null;

        Token lv_descriptionName_0_0=null;
        Token lv_inputType_1_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:877:28: ( ( ( (lv_descriptionName_0_0= 'Multiselection' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:878:1: ( ( (lv_descriptionName_0_0= 'Multiselection' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:878:1: ( ( (lv_descriptionName_0_0= 'Multiselection' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:878:2: ( (lv_descriptionName_0_0= 'Multiselection' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:878:2: ( (lv_descriptionName_0_0= 'Multiselection' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:879:1: (lv_descriptionName_0_0= 'Multiselection' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:879:1: (lv_descriptionName_0_0= 'Multiselection' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:880:3: lv_descriptionName_0_0= 'Multiselection'
            {
            lv_descriptionName_0_0=(Token)match(input,25,FOLLOW_25_in_ruleMultiselection1958); 

                    newLeafNode(lv_descriptionName_0_0, grammarAccess.getMultiselectionAccess().getDescriptionNameMultiselectionKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMultiselectionRule());
            	        }
                   		setWithLastConsumed(current, "descriptionName", lv_descriptionName_0_0, "Multiselection");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:893:2: ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INPUT_DESCRIPTION) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:894:1: (lv_inputType_1_0= RULE_INPUT_DESCRIPTION )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:894:1: (lv_inputType_1_0= RULE_INPUT_DESCRIPTION )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:895:3: lv_inputType_1_0= RULE_INPUT_DESCRIPTION
                    {
                    lv_inputType_1_0=(Token)match(input,RULE_INPUT_DESCRIPTION,FOLLOW_RULE_INPUT_DESCRIPTION_in_ruleMultiselection1988); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:919:1: entryRuleComponentDefinition returns [EObject current=null] : iv_ruleComponentDefinition= ruleComponentDefinition EOF ;
    public final EObject entryRuleComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:920:2: (iv_ruleComponentDefinition= ruleComponentDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:921:2: iv_ruleComponentDefinition= ruleComponentDefinition EOF
            {
             newCompositeNode(grammarAccess.getComponentDefinitionRule()); 
            pushFollow(FOLLOW_ruleComponentDefinition_in_entryRuleComponentDefinition2030);
            iv_ruleComponentDefinition=ruleComponentDefinition();

            state._fsp--;

             current =iv_ruleComponentDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentDefinition2040); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:928:1: ruleComponentDefinition returns [EObject current=null] : (this_LabelDefinition_0= ruleLabelDefinition | this_ButtonDefinition_1= ruleButtonDefinition ) ;
    public final EObject ruleComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_LabelDefinition_0 = null;

        EObject this_ButtonDefinition_1 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:931:28: ( (this_LabelDefinition_0= ruleLabelDefinition | this_ButtonDefinition_1= ruleButtonDefinition ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:932:1: (this_LabelDefinition_0= ruleLabelDefinition | this_ButtonDefinition_1= ruleButtonDefinition )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:932:1: (this_LabelDefinition_0= ruleLabelDefinition | this_ButtonDefinition_1= ruleButtonDefinition )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            else if ( (LA13_0==15) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:933:5: this_LabelDefinition_0= ruleLabelDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getLabelDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLabelDefinition_in_ruleComponentDefinition2087);
                    this_LabelDefinition_0=ruleLabelDefinition();

                    state._fsp--;

                     
                            current = this_LabelDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:943:5: this_ButtonDefinition_1= ruleButtonDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getButtonDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleButtonDefinition_in_ruleComponentDefinition2114);
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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:959:1: entryRuleButtonDefinition returns [EObject current=null] : iv_ruleButtonDefinition= ruleButtonDefinition EOF ;
    public final EObject entryRuleButtonDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:960:2: (iv_ruleButtonDefinition= ruleButtonDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:961:2: iv_ruleButtonDefinition= ruleButtonDefinition EOF
            {
             newCompositeNode(grammarAccess.getButtonDefinitionRule()); 
            pushFollow(FOLLOW_ruleButtonDefinition_in_entryRuleButtonDefinition2149);
            iv_ruleButtonDefinition=ruleButtonDefinition();

            state._fsp--;

             current =iv_ruleButtonDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonDefinition2159); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:968:1: ruleButtonDefinition returns [EObject current=null] : ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? ) ;
    public final EObject ruleButtonDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:971:28: ( ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:972:1: ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:972:1: ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:972:2: ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:972:2: ( (lv_name_0_0= 'Button' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:973:1: (lv_name_0_0= 'Button' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:973:1: (lv_name_0_0= 'Button' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:974:3: lv_name_0_0= 'Button'
            {
            lv_name_0_0=(Token)match(input,15,FOLLOW_15_in_ruleButtonDefinition2202); 

                    newLeafNode(lv_name_0_0, grammarAccess.getButtonDefinitionAccess().getNameButtonKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getButtonDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Button");
            	    

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleButtonDefinition2227); 

                	newLeafNode(otherlv_1, grammarAccess.getButtonDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:991:1: ( (lv_id_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:992:1: (lv_id_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:992:1: (lv_id_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:993:3: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleButtonDefinition2244); 

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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1009:2: ( (lv_properties_3_0= ruleProperties ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1010:1: (lv_properties_3_0= ruleProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1010:1: (lv_properties_3_0= ruleProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1011:3: lv_properties_3_0= ruleProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getButtonDefinitionAccess().getPropertiesPropertiesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProperties_in_ruleButtonDefinition2270);
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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1035:1: entryRuleProperties returns [EObject current=null] : iv_ruleProperties= ruleProperties EOF ;
    public final EObject entryRuleProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperties = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1036:2: (iv_ruleProperties= ruleProperties EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1037:2: iv_ruleProperties= ruleProperties EOF
            {
             newCompositeNode(grammarAccess.getPropertiesRule()); 
            pushFollow(FOLLOW_ruleProperties_in_entryRuleProperties2307);
            iv_ruleProperties=ruleProperties();

            state._fsp--;

             current =iv_ruleProperties; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperties2317); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1044:1: ruleProperties returns [EObject current=null] : (otherlv_0= '->' (otherlv_1= 'propertyKey=' ( (lv_propertyKey_2_0= RULE_STRING ) ) )? (otherlv_3= 'text=' ( (lv_text_4_0= RULE_STRING ) ) )? (otherlv_5= 'interactiontype=' ( (lv_interactiontype_6_0= ruleInteractiontype ) )+ )? ) ;
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
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1047:28: ( (otherlv_0= '->' (otherlv_1= 'propertyKey=' ( (lv_propertyKey_2_0= RULE_STRING ) ) )? (otherlv_3= 'text=' ( (lv_text_4_0= RULE_STRING ) ) )? (otherlv_5= 'interactiontype=' ( (lv_interactiontype_6_0= ruleInteractiontype ) )+ )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1048:1: (otherlv_0= '->' (otherlv_1= 'propertyKey=' ( (lv_propertyKey_2_0= RULE_STRING ) ) )? (otherlv_3= 'text=' ( (lv_text_4_0= RULE_STRING ) ) )? (otherlv_5= 'interactiontype=' ( (lv_interactiontype_6_0= ruleInteractiontype ) )+ )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1048:1: (otherlv_0= '->' (otherlv_1= 'propertyKey=' ( (lv_propertyKey_2_0= RULE_STRING ) ) )? (otherlv_3= 'text=' ( (lv_text_4_0= RULE_STRING ) ) )? (otherlv_5= 'interactiontype=' ( (lv_interactiontype_6_0= ruleInteractiontype ) )+ )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1048:3: otherlv_0= '->' (otherlv_1= 'propertyKey=' ( (lv_propertyKey_2_0= RULE_STRING ) ) )? (otherlv_3= 'text=' ( (lv_text_4_0= RULE_STRING ) ) )? (otherlv_5= 'interactiontype=' ( (lv_interactiontype_6_0= ruleInteractiontype ) )+ )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleProperties2354); 

                	newLeafNode(otherlv_0, grammarAccess.getPropertiesAccess().getHyphenMinusGreaterThanSignKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1052:1: (otherlv_1= 'propertyKey=' ( (lv_propertyKey_2_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1052:3: otherlv_1= 'propertyKey=' ( (lv_propertyKey_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleProperties2367); 

                        	newLeafNode(otherlv_1, grammarAccess.getPropertiesAccess().getPropertyKeyKeyword_1_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1056:1: ( (lv_propertyKey_2_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1057:1: (lv_propertyKey_2_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1057:1: (lv_propertyKey_2_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1058:3: lv_propertyKey_2_0= RULE_STRING
                    {
                    lv_propertyKey_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProperties2384); 

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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1074:4: (otherlv_3= 'text=' ( (lv_text_4_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1074:6: otherlv_3= 'text=' ( (lv_text_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleProperties2404); 

                        	newLeafNode(otherlv_3, grammarAccess.getPropertiesAccess().getTextKeyword_2_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1078:1: ( (lv_text_4_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1079:1: (lv_text_4_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1079:1: (lv_text_4_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1080:3: lv_text_4_0= RULE_STRING
                    {
                    lv_text_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProperties2421); 

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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1096:4: (otherlv_5= 'interactiontype=' ( (lv_interactiontype_6_0= ruleInteractiontype ) )+ )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1096:6: otherlv_5= 'interactiontype=' ( (lv_interactiontype_6_0= ruleInteractiontype ) )+
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleProperties2441); 

                        	newLeafNode(otherlv_5, grammarAccess.getPropertiesAccess().getInteractiontypeKeyword_3_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1100:1: ( (lv_interactiontype_6_0= ruleInteractiontype ) )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>=31 && LA17_0<=32)) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1101:1: (lv_interactiontype_6_0= ruleInteractiontype )
                    	    {
                    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1101:1: (lv_interactiontype_6_0= ruleInteractiontype )
                    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1102:3: lv_interactiontype_6_0= ruleInteractiontype
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPropertiesAccess().getInteractiontypeInteractiontypeParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInteractiontype_in_ruleProperties2462);
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
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1126:1: entryRuleLabelDefinition returns [EObject current=null] : iv_ruleLabelDefinition= ruleLabelDefinition EOF ;
    public final EObject entryRuleLabelDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1127:2: (iv_ruleLabelDefinition= ruleLabelDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1128:2: iv_ruleLabelDefinition= ruleLabelDefinition EOF
            {
             newCompositeNode(grammarAccess.getLabelDefinitionRule()); 
            pushFollow(FOLLOW_ruleLabelDefinition_in_entryRuleLabelDefinition2501);
            iv_ruleLabelDefinition=ruleLabelDefinition();

            state._fsp--;

             current =iv_ruleLabelDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelDefinition2511); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1135:1: ruleLabelDefinition returns [EObject current=null] : ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'as' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? ) ;
    public final EObject ruleLabelDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1138:28: ( ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'as' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1139:1: ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'as' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1139:1: ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'as' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1139:2: ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'as' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1139:2: ( (lv_name_0_0= 'Label' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1140:1: (lv_name_0_0= 'Label' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1140:1: (lv_name_0_0= 'Label' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1141:3: lv_name_0_0= 'Label'
            {
            lv_name_0_0=(Token)match(input,17,FOLLOW_17_in_ruleLabelDefinition2554); 

                    newLeafNode(lv_name_0_0, grammarAccess.getLabelDefinitionAccess().getNameLabelKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Label");
            	    

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleLabelDefinition2579); 

                	newLeafNode(otherlv_1, grammarAccess.getLabelDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1158:1: ( (lv_id_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1159:1: (lv_id_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1159:1: (lv_id_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1160:3: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabelDefinition2596); 

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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1176:2: ( (lv_properties_3_0= ruleProperties ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1177:1: (lv_properties_3_0= ruleProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1177:1: (lv_properties_3_0= ruleProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1178:3: lv_properties_3_0= ruleProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getLabelDefinitionAccess().getPropertiesPropertiesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProperties_in_ruleLabelDefinition2622);
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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1202:1: entryRuleInteractiontype returns [String current=null] : iv_ruleInteractiontype= ruleInteractiontype EOF ;
    public final String entryRuleInteractiontype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteractiontype = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1203:2: (iv_ruleInteractiontype= ruleInteractiontype EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1204:2: iv_ruleInteractiontype= ruleInteractiontype EOF
            {
             newCompositeNode(grammarAccess.getInteractiontypeRule()); 
            pushFollow(FOLLOW_ruleInteractiontype_in_entryRuleInteractiontype2660);
            iv_ruleInteractiontype=ruleInteractiontype();

            state._fsp--;

             current =iv_ruleInteractiontype.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractiontype2671); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1211:1: ruleInteractiontype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Click' | kw= 'ChangeText' ) ;
    public final AntlrDatatypeRuleToken ruleInteractiontype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1214:28: ( (kw= 'Click' | kw= 'ChangeText' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1215:1: (kw= 'Click' | kw= 'ChangeText' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1215:1: (kw= 'Click' | kw= 'ChangeText' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            else if ( (LA20_0==32) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1216:2: kw= 'Click'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleInteractiontype2709); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInteractiontypeAccess().getClickKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1223:2: kw= 'ChangeText'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleInteractiontype2728); 

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
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleUIDescription131 = new BitSet(new long[]{0x00000000001A9000L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleUIDescription152 = new BitSet(new long[]{0x00000000001A9000L});
    public static final BitSet FOLLOW_ruleUsedDescriptions_in_ruleUIDescription174 = new BitSet(new long[]{0x00000000001A9000L});
    public static final BitSet FOLLOW_ruleRefinement_in_ruleUIDescription196 = new BitSet(new long[]{0x00000000001A9000L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleUIDescription218 = new BitSet(new long[]{0x00000000001A9000L});
    public static final BitSet FOLLOW_ruleStructure_in_ruleUIDescription240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructure_in_entryRuleStructure276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructure286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleStructure329 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStructure354 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleElement_in_ruleStructure375 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleElement463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefinement_in_entryRuleRefinement503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefinement513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentRefinement_in_ruleRefinement559 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRefinement571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentRefinement_in_entryRuleComponentRefinement607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentRefinement617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelRefinement_in_ruleComponentRefinement664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonRefinement_in_ruleComponentRefinement691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonRefinement_in_entryRuleButtonRefinement726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonRefinement736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleButtonRefinement779 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleButtonRefinement804 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleButtonRefinement821 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleProperties_in_ruleButtonRefinement847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelRefinement_in_entryRuleLabelRefinement884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelRefinement894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleLabelRefinement937 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleLabelRefinement962 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabelRefinement979 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleProperties_in_ruleLabelRefinement1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleProperty1089 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProperty1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsedDescriptions_in_entryRuleUsedDescriptions1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsedDescriptions1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleUsedDescriptions1194 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_ruleDescriptionType_in_ruleUsedDescriptions1215 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleUsedDescriptions1228 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUsedDescriptions1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescriptionType_in_entryRuleDescriptionType1288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescriptionType1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIDescriptionImport_in_ruleDescriptionType1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexComponent_in_ruleDescriptionType1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition1407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDefinition_in_ruleDefinition1463 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDefinition1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition1511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleTypeDefinition1558 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypeDefinition1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleType1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleType1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIDescriptionImport_in_entryRuleUIDescriptionImport1724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIDescriptionImport1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUIDescriptionImport1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexComponent_in_entryRuleComplexComponent1815 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexComponent1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiselection_in_ruleComplexComponent1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiselection_in_entryRuleMultiselection1905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiselection1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleMultiselection1958 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_INPUT_DESCRIPTION_in_ruleMultiselection1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDefinition_in_entryRuleComponentDefinition2030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentDefinition2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelDefinition_in_ruleComponentDefinition2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonDefinition_in_ruleComponentDefinition2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonDefinition_in_entryRuleButtonDefinition2149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonDefinition2159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleButtonDefinition2202 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleButtonDefinition2227 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleButtonDefinition2244 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleProperties_in_ruleButtonDefinition2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperties_in_entryRuleProperties2307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperties2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleProperties2354 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_27_in_ruleProperties2367 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProperties2384 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_28_in_ruleProperties2404 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProperties2421 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleProperties2441 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_ruleInteractiontype_in_ruleProperties2462 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleLabelDefinition_in_entryRuleLabelDefinition2501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelDefinition2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleLabelDefinition2554 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleLabelDefinition2579 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabelDefinition2596 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleProperties_in_ruleLabelDefinition2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractiontype_in_entryRuleInteractiontype2660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractiontype2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleInteractiontype2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleInteractiontype2728 = new BitSet(new long[]{0x0000000000000002L});

}