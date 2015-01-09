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
        EObject lv_type_1_0 = null;


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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:762:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:763:2: (iv_ruleType= ruleType EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:764:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1615);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1625); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:771:1: ruleType returns [EObject current=null] : ( ( (lv_id_0_1= 'WINDOW' | lv_id_0_2= 'INNERCOMPLEX' ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_1=null;
        Token lv_id_0_2=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:774:28: ( ( ( (lv_id_0_1= 'WINDOW' | lv_id_0_2= 'INNERCOMPLEX' ) ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:775:1: ( ( (lv_id_0_1= 'WINDOW' | lv_id_0_2= 'INNERCOMPLEX' ) ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:775:1: ( ( (lv_id_0_1= 'WINDOW' | lv_id_0_2= 'INNERCOMPLEX' ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:776:1: ( (lv_id_0_1= 'WINDOW' | lv_id_0_2= 'INNERCOMPLEX' ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:776:1: ( (lv_id_0_1= 'WINDOW' | lv_id_0_2= 'INNERCOMPLEX' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:777:1: (lv_id_0_1= 'WINDOW' | lv_id_0_2= 'INNERCOMPLEX' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:777:1: (lv_id_0_1= 'WINDOW' | lv_id_0_2= 'INNERCOMPLEX' )
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
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:778:3: lv_id_0_1= 'WINDOW'
                    {
                    lv_id_0_1=(Token)match(input,23,FOLLOW_23_in_ruleType1669); 

                            newLeafNode(lv_id_0_1, grammarAccess.getTypeAccess().getIdWINDOWKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRule());
                    	        }
                           		setWithLastConsumed(current, "id", lv_id_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:790:8: lv_id_0_2= 'INNERCOMPLEX'
                    {
                    lv_id_0_2=(Token)match(input,24,FOLLOW_24_in_ruleType1698); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:813:1: entryRuleUIDescriptionImport returns [EObject current=null] : iv_ruleUIDescriptionImport= ruleUIDescriptionImport EOF ;
    public final EObject entryRuleUIDescriptionImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIDescriptionImport = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:814:2: (iv_ruleUIDescriptionImport= ruleUIDescriptionImport EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:815:2: iv_ruleUIDescriptionImport= ruleUIDescriptionImport EOF
            {
             newCompositeNode(grammarAccess.getUIDescriptionImportRule()); 
            pushFollow(FOLLOW_ruleUIDescriptionImport_in_entryRuleUIDescriptionImport1749);
            iv_ruleUIDescriptionImport=ruleUIDescriptionImport();

            state._fsp--;

             current =iv_ruleUIDescriptionImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIDescriptionImport1759); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:822:1: ruleUIDescriptionImport returns [EObject current=null] : ( (lv_descriptionName_0_0= RULE_STRING ) ) ;
    public final EObject ruleUIDescriptionImport() throws RecognitionException {
        EObject current = null;

        Token lv_descriptionName_0_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:825:28: ( ( (lv_descriptionName_0_0= RULE_STRING ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:826:1: ( (lv_descriptionName_0_0= RULE_STRING ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:826:1: ( (lv_descriptionName_0_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:827:1: (lv_descriptionName_0_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:827:1: (lv_descriptionName_0_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:828:3: lv_descriptionName_0_0= RULE_STRING
            {
            lv_descriptionName_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUIDescriptionImport1800); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:852:1: entryRuleComplexComponent returns [EObject current=null] : iv_ruleComplexComponent= ruleComplexComponent EOF ;
    public final EObject entryRuleComplexComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexComponent = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:853:2: (iv_ruleComplexComponent= ruleComplexComponent EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:854:2: iv_ruleComplexComponent= ruleComplexComponent EOF
            {
             newCompositeNode(grammarAccess.getComplexComponentRule()); 
            pushFollow(FOLLOW_ruleComplexComponent_in_entryRuleComplexComponent1840);
            iv_ruleComplexComponent=ruleComplexComponent();

            state._fsp--;

             current =iv_ruleComplexComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexComponent1850); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:861:1: ruleComplexComponent returns [EObject current=null] : this_Multiselection_0= ruleMultiselection ;
    public final EObject ruleComplexComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Multiselection_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:864:28: (this_Multiselection_0= ruleMultiselection )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:866:5: this_Multiselection_0= ruleMultiselection
            {
             
                    newCompositeNode(grammarAccess.getComplexComponentAccess().getMultiselectionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleMultiselection_in_ruleComplexComponent1896);
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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:882:1: entryRuleMultiselection returns [EObject current=null] : iv_ruleMultiselection= ruleMultiselection EOF ;
    public final EObject entryRuleMultiselection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiselection = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:883:2: (iv_ruleMultiselection= ruleMultiselection EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:884:2: iv_ruleMultiselection= ruleMultiselection EOF
            {
             newCompositeNode(grammarAccess.getMultiselectionRule()); 
            pushFollow(FOLLOW_ruleMultiselection_in_entryRuleMultiselection1930);
            iv_ruleMultiselection=ruleMultiselection();

            state._fsp--;

             current =iv_ruleMultiselection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiselection1940); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:891:1: ruleMultiselection returns [EObject current=null] : ( ( (lv_descriptionName_0_0= 'Multiselection' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? ) ;
    public final EObject ruleMultiselection() throws RecognitionException {
        EObject current = null;

        Token lv_descriptionName_0_0=null;
        Token lv_inputType_1_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:894:28: ( ( ( (lv_descriptionName_0_0= 'Multiselection' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:895:1: ( ( (lv_descriptionName_0_0= 'Multiselection' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:895:1: ( ( (lv_descriptionName_0_0= 'Multiselection' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:895:2: ( (lv_descriptionName_0_0= 'Multiselection' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:895:2: ( (lv_descriptionName_0_0= 'Multiselection' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:896:1: (lv_descriptionName_0_0= 'Multiselection' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:896:1: (lv_descriptionName_0_0= 'Multiselection' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:897:3: lv_descriptionName_0_0= 'Multiselection'
            {
            lv_descriptionName_0_0=(Token)match(input,25,FOLLOW_25_in_ruleMultiselection1983); 

                    newLeafNode(lv_descriptionName_0_0, grammarAccess.getMultiselectionAccess().getDescriptionNameMultiselectionKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMultiselectionRule());
            	        }
                   		setWithLastConsumed(current, "descriptionName", lv_descriptionName_0_0, "Multiselection");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:910:2: ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INPUT_DESCRIPTION) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:911:1: (lv_inputType_1_0= RULE_INPUT_DESCRIPTION )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:911:1: (lv_inputType_1_0= RULE_INPUT_DESCRIPTION )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:912:3: lv_inputType_1_0= RULE_INPUT_DESCRIPTION
                    {
                    lv_inputType_1_0=(Token)match(input,RULE_INPUT_DESCRIPTION,FOLLOW_RULE_INPUT_DESCRIPTION_in_ruleMultiselection2013); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:936:1: entryRuleComponentDefinition returns [EObject current=null] : iv_ruleComponentDefinition= ruleComponentDefinition EOF ;
    public final EObject entryRuleComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:937:2: (iv_ruleComponentDefinition= ruleComponentDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:938:2: iv_ruleComponentDefinition= ruleComponentDefinition EOF
            {
             newCompositeNode(grammarAccess.getComponentDefinitionRule()); 
            pushFollow(FOLLOW_ruleComponentDefinition_in_entryRuleComponentDefinition2055);
            iv_ruleComponentDefinition=ruleComponentDefinition();

            state._fsp--;

             current =iv_ruleComponentDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentDefinition2065); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:945:1: ruleComponentDefinition returns [EObject current=null] : (this_LabelDefinition_0= ruleLabelDefinition | this_ButtonDefinition_1= ruleButtonDefinition ) ;
    public final EObject ruleComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_LabelDefinition_0 = null;

        EObject this_ButtonDefinition_1 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:948:28: ( (this_LabelDefinition_0= ruleLabelDefinition | this_ButtonDefinition_1= ruleButtonDefinition ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:949:1: (this_LabelDefinition_0= ruleLabelDefinition | this_ButtonDefinition_1= ruleButtonDefinition )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:949:1: (this_LabelDefinition_0= ruleLabelDefinition | this_ButtonDefinition_1= ruleButtonDefinition )
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
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:950:5: this_LabelDefinition_0= ruleLabelDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getLabelDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLabelDefinition_in_ruleComponentDefinition2112);
                    this_LabelDefinition_0=ruleLabelDefinition();

                    state._fsp--;

                     
                            current = this_LabelDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:960:5: this_ButtonDefinition_1= ruleButtonDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getButtonDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleButtonDefinition_in_ruleComponentDefinition2139);
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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:976:1: entryRuleButtonDefinition returns [EObject current=null] : iv_ruleButtonDefinition= ruleButtonDefinition EOF ;
    public final EObject entryRuleButtonDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:977:2: (iv_ruleButtonDefinition= ruleButtonDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:978:2: iv_ruleButtonDefinition= ruleButtonDefinition EOF
            {
             newCompositeNode(grammarAccess.getButtonDefinitionRule()); 
            pushFollow(FOLLOW_ruleButtonDefinition_in_entryRuleButtonDefinition2174);
            iv_ruleButtonDefinition=ruleButtonDefinition();

            state._fsp--;

             current =iv_ruleButtonDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonDefinition2184); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:985:1: ruleButtonDefinition returns [EObject current=null] : ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? ) ;
    public final EObject ruleButtonDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:988:28: ( ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:989:1: ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:989:1: ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:989:2: ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:989:2: ( (lv_name_0_0= 'Button' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:990:1: (lv_name_0_0= 'Button' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:990:1: (lv_name_0_0= 'Button' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:991:3: lv_name_0_0= 'Button'
            {
            lv_name_0_0=(Token)match(input,15,FOLLOW_15_in_ruleButtonDefinition2227); 

                    newLeafNode(lv_name_0_0, grammarAccess.getButtonDefinitionAccess().getNameButtonKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getButtonDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Button");
            	    

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleButtonDefinition2252); 

                	newLeafNode(otherlv_1, grammarAccess.getButtonDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1008:1: ( (lv_id_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1009:1: (lv_id_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1009:1: (lv_id_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1010:3: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleButtonDefinition2269); 

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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1026:2: ( (lv_properties_3_0= ruleProperties ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1027:1: (lv_properties_3_0= ruleProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1027:1: (lv_properties_3_0= ruleProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1028:3: lv_properties_3_0= ruleProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getButtonDefinitionAccess().getPropertiesPropertiesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProperties_in_ruleButtonDefinition2295);
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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1052:1: entryRuleProperties returns [EObject current=null] : iv_ruleProperties= ruleProperties EOF ;
    public final EObject entryRuleProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperties = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1053:2: (iv_ruleProperties= ruleProperties EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1054:2: iv_ruleProperties= ruleProperties EOF
            {
             newCompositeNode(grammarAccess.getPropertiesRule()); 
            pushFollow(FOLLOW_ruleProperties_in_entryRuleProperties2332);
            iv_ruleProperties=ruleProperties();

            state._fsp--;

             current =iv_ruleProperties; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperties2342); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1061:1: ruleProperties returns [EObject current=null] : (otherlv_0= '->' ( (lv_propertiesDefinitions_1_0= rulePropertiesDefinition ) )+ ) ;
    public final EObject ruleProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_propertiesDefinitions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1064:28: ( (otherlv_0= '->' ( (lv_propertiesDefinitions_1_0= rulePropertiesDefinition ) )+ ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1065:1: (otherlv_0= '->' ( (lv_propertiesDefinitions_1_0= rulePropertiesDefinition ) )+ )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1065:1: (otherlv_0= '->' ( (lv_propertiesDefinitions_1_0= rulePropertiesDefinition ) )+ )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1065:3: otherlv_0= '->' ( (lv_propertiesDefinitions_1_0= rulePropertiesDefinition ) )+
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleProperties2379); 

                	newLeafNode(otherlv_0, grammarAccess.getPropertiesAccess().getHyphenMinusGreaterThanSignKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1069:1: ( (lv_propertiesDefinitions_1_0= rulePropertiesDefinition ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=27 && LA15_0<=29)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1070:1: (lv_propertiesDefinitions_1_0= rulePropertiesDefinition )
            	    {
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1070:1: (lv_propertiesDefinitions_1_0= rulePropertiesDefinition )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1071:3: lv_propertiesDefinitions_1_0= rulePropertiesDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertiesAccess().getPropertiesDefinitionsPropertiesDefinitionParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePropertiesDefinition_in_ruleProperties2400);
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1095:1: entryRulePropertiesDefinition returns [EObject current=null] : iv_rulePropertiesDefinition= rulePropertiesDefinition EOF ;
    public final EObject entryRulePropertiesDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertiesDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1096:2: (iv_rulePropertiesDefinition= rulePropertiesDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1097:2: iv_rulePropertiesDefinition= rulePropertiesDefinition EOF
            {
             newCompositeNode(grammarAccess.getPropertiesDefinitionRule()); 
            pushFollow(FOLLOW_rulePropertiesDefinition_in_entryRulePropertiesDefinition2437);
            iv_rulePropertiesDefinition=rulePropertiesDefinition();

            state._fsp--;

             current =iv_rulePropertiesDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertiesDefinition2447); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1104:1: rulePropertiesDefinition returns [EObject current=null] : ( (otherlv_0= 'propertyKey=' ( (lv_propertyKey_1_0= RULE_STRING ) ) ) | (otherlv_2= 'text=' ( (lv_text_3_0= RULE_STRING ) ) ) | (otherlv_4= 'interactiontype=' ( (lv_interactiontype_5_0= ruleInteractiontype ) )+ ) ) ;
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
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1107:28: ( ( (otherlv_0= 'propertyKey=' ( (lv_propertyKey_1_0= RULE_STRING ) ) ) | (otherlv_2= 'text=' ( (lv_text_3_0= RULE_STRING ) ) ) | (otherlv_4= 'interactiontype=' ( (lv_interactiontype_5_0= ruleInteractiontype ) )+ ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1108:1: ( (otherlv_0= 'propertyKey=' ( (lv_propertyKey_1_0= RULE_STRING ) ) ) | (otherlv_2= 'text=' ( (lv_text_3_0= RULE_STRING ) ) ) | (otherlv_4= 'interactiontype=' ( (lv_interactiontype_5_0= ruleInteractiontype ) )+ ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1108:1: ( (otherlv_0= 'propertyKey=' ( (lv_propertyKey_1_0= RULE_STRING ) ) ) | (otherlv_2= 'text=' ( (lv_text_3_0= RULE_STRING ) ) ) | (otherlv_4= 'interactiontype=' ( (lv_interactiontype_5_0= ruleInteractiontype ) )+ ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt17=1;
                }
                break;
            case 28:
                {
                alt17=2;
                }
                break;
            case 29:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1108:2: (otherlv_0= 'propertyKey=' ( (lv_propertyKey_1_0= RULE_STRING ) ) )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1108:2: (otherlv_0= 'propertyKey=' ( (lv_propertyKey_1_0= RULE_STRING ) ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1108:4: otherlv_0= 'propertyKey=' ( (lv_propertyKey_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_27_in_rulePropertiesDefinition2485); 

                        	newLeafNode(otherlv_0, grammarAccess.getPropertiesDefinitionAccess().getPropertyKeyKeyword_0_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1112:1: ( (lv_propertyKey_1_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1113:1: (lv_propertyKey_1_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1113:1: (lv_propertyKey_1_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1114:3: lv_propertyKey_1_0= RULE_STRING
                    {
                    lv_propertyKey_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePropertiesDefinition2502); 

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
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1131:6: (otherlv_2= 'text=' ( (lv_text_3_0= RULE_STRING ) ) )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1131:6: (otherlv_2= 'text=' ( (lv_text_3_0= RULE_STRING ) ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1131:8: otherlv_2= 'text=' ( (lv_text_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_rulePropertiesDefinition2527); 

                        	newLeafNode(otherlv_2, grammarAccess.getPropertiesDefinitionAccess().getTextKeyword_1_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1135:1: ( (lv_text_3_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1136:1: (lv_text_3_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1136:1: (lv_text_3_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1137:3: lv_text_3_0= RULE_STRING
                    {
                    lv_text_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePropertiesDefinition2544); 

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
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1154:6: (otherlv_4= 'interactiontype=' ( (lv_interactiontype_5_0= ruleInteractiontype ) )+ )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1154:6: (otherlv_4= 'interactiontype=' ( (lv_interactiontype_5_0= ruleInteractiontype ) )+ )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1154:8: otherlv_4= 'interactiontype=' ( (lv_interactiontype_5_0= ruleInteractiontype ) )+
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_rulePropertiesDefinition2569); 

                        	newLeafNode(otherlv_4, grammarAccess.getPropertiesDefinitionAccess().getInteractiontypeKeyword_2_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1158:1: ( (lv_interactiontype_5_0= ruleInteractiontype ) )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>=31 && LA16_0<=32)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1159:1: (lv_interactiontype_5_0= ruleInteractiontype )
                    	    {
                    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1159:1: (lv_interactiontype_5_0= ruleInteractiontype )
                    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1160:3: lv_interactiontype_5_0= ruleInteractiontype
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPropertiesDefinitionAccess().getInteractiontypeInteractiontypeParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInteractiontype_in_rulePropertiesDefinition2590);
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
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1184:1: entryRuleLabelDefinition returns [EObject current=null] : iv_ruleLabelDefinition= ruleLabelDefinition EOF ;
    public final EObject entryRuleLabelDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1185:2: (iv_ruleLabelDefinition= ruleLabelDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1186:2: iv_ruleLabelDefinition= ruleLabelDefinition EOF
            {
             newCompositeNode(grammarAccess.getLabelDefinitionRule()); 
            pushFollow(FOLLOW_ruleLabelDefinition_in_entryRuleLabelDefinition2628);
            iv_ruleLabelDefinition=ruleLabelDefinition();

            state._fsp--;

             current =iv_ruleLabelDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelDefinition2638); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1193:1: ruleLabelDefinition returns [EObject current=null] : ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'as' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? ) ;
    public final EObject ruleLabelDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1196:28: ( ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'as' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1197:1: ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'as' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1197:1: ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'as' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1197:2: ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'as' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleProperties ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1197:2: ( (lv_name_0_0= 'Label' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1198:1: (lv_name_0_0= 'Label' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1198:1: (lv_name_0_0= 'Label' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1199:3: lv_name_0_0= 'Label'
            {
            lv_name_0_0=(Token)match(input,17,FOLLOW_17_in_ruleLabelDefinition2681); 

                    newLeafNode(lv_name_0_0, grammarAccess.getLabelDefinitionAccess().getNameLabelKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Label");
            	    

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleLabelDefinition2706); 

                	newLeafNode(otherlv_1, grammarAccess.getLabelDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1216:1: ( (lv_id_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1217:1: (lv_id_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1217:1: (lv_id_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1218:3: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabelDefinition2723); 

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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1234:2: ( (lv_properties_3_0= ruleProperties ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1235:1: (lv_properties_3_0= ruleProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1235:1: (lv_properties_3_0= ruleProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1236:3: lv_properties_3_0= ruleProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getLabelDefinitionAccess().getPropertiesPropertiesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProperties_in_ruleLabelDefinition2749);
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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1260:1: entryRuleInteractiontype returns [EObject current=null] : iv_ruleInteractiontype= ruleInteractiontype EOF ;
    public final EObject entryRuleInteractiontype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractiontype = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1261:2: (iv_ruleInteractiontype= ruleInteractiontype EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1262:2: iv_ruleInteractiontype= ruleInteractiontype EOF
            {
             newCompositeNode(grammarAccess.getInteractiontypeRule()); 
            pushFollow(FOLLOW_ruleInteractiontype_in_entryRuleInteractiontype2786);
            iv_ruleInteractiontype=ruleInteractiontype();

            state._fsp--;

             current =iv_ruleInteractiontype; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractiontype2796); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1269:1: ruleInteractiontype returns [EObject current=null] : ( ( (lv_id_0_1= 'Click' | lv_id_0_2= 'ChangeText' ) ) ) ;
    public final EObject ruleInteractiontype() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_1=null;
        Token lv_id_0_2=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1272:28: ( ( ( (lv_id_0_1= 'Click' | lv_id_0_2= 'ChangeText' ) ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1273:1: ( ( (lv_id_0_1= 'Click' | lv_id_0_2= 'ChangeText' ) ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1273:1: ( ( (lv_id_0_1= 'Click' | lv_id_0_2= 'ChangeText' ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1274:1: ( (lv_id_0_1= 'Click' | lv_id_0_2= 'ChangeText' ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1274:1: ( (lv_id_0_1= 'Click' | lv_id_0_2= 'ChangeText' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1275:1: (lv_id_0_1= 'Click' | lv_id_0_2= 'ChangeText' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1275:1: (lv_id_0_1= 'Click' | lv_id_0_2= 'ChangeText' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            else if ( (LA19_0==32) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1276:3: lv_id_0_1= 'Click'
                    {
                    lv_id_0_1=(Token)match(input,31,FOLLOW_31_in_ruleInteractiontype2840); 

                            newLeafNode(lv_id_0_1, grammarAccess.getInteractiontypeAccess().getIdClickKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInteractiontypeRule());
                    	        }
                           		setWithLastConsumed(current, "id", lv_id_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1288:8: lv_id_0_2= 'ChangeText'
                    {
                    lv_id_0_2=(Token)match(input,32,FOLLOW_32_in_ruleInteractiontype2869); 

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
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleType1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleType1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIDescriptionImport_in_entryRuleUIDescriptionImport1749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIDescriptionImport1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUIDescriptionImport1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexComponent_in_entryRuleComplexComponent1840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexComponent1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiselection_in_ruleComplexComponent1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiselection_in_entryRuleMultiselection1930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiselection1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleMultiselection1983 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_INPUT_DESCRIPTION_in_ruleMultiselection2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDefinition_in_entryRuleComponentDefinition2055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentDefinition2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelDefinition_in_ruleComponentDefinition2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonDefinition_in_ruleComponentDefinition2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonDefinition_in_entryRuleButtonDefinition2174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonDefinition2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleButtonDefinition2227 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleButtonDefinition2252 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleButtonDefinition2269 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleProperties_in_ruleButtonDefinition2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperties_in_entryRuleProperties2332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperties2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleProperties2379 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_rulePropertiesDefinition_in_ruleProperties2400 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_rulePropertiesDefinition_in_entryRulePropertiesDefinition2437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertiesDefinition2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulePropertiesDefinition2485 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePropertiesDefinition2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulePropertiesDefinition2527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePropertiesDefinition2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulePropertiesDefinition2569 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_ruleInteractiontype_in_rulePropertiesDefinition2590 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleLabelDefinition_in_entryRuleLabelDefinition2628 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelDefinition2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleLabelDefinition2681 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleLabelDefinition2706 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabelDefinition2723 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleProperties_in_ruleLabelDefinition2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractiontype_in_entryRuleInteractiontype2786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractiontype2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleInteractiontype2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleInteractiontype2869 = new BitSet(new long[]{0x0000000000000002L});

}