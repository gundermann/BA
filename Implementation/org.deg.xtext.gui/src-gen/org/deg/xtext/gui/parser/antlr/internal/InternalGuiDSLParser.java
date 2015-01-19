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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INPUT_DESCRIPTION", "RULE_TABNAME", "RULE_BOOLEAN", "RULE_WS", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'type: '", "';'", "'WINDOW'", "'INNERCOMPLEX'", "'get properties from:'", "'get layout from:'", "'use:'", "'as:'", "'Structure'", "':'", "'Table'", "'change:'", "'TabView'", "'Tree'", "'Interchangeable'", "'Textarea'", "'Textfield'", "'Button'", "'Label'", "'Multiselection'", "'Interchangeable Area'", "'IfActivator'", "'IfTextDisplay'", "'IfViewImage'", "'text='", "'editable='", "'->'", "'propertyKey'", "'='", "'layoutKey'", "'interactiontype'"
    };
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_ID=9;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_INPUT_DESCRIPTION=5;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int RULE_INT=10;
    public static final int RULE_TABNAME=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_ML_COMMENT=11;
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
    public static final int RULE_WS=8;

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:76:1: ruleUIDescription returns [EObject current=null] : ( ( (lv_typeDefinition_0_0= ruleTypeDefinition ) ) ( (lv_property_1_0= ruleProperty ) )? ( (lv_layout_2_0= ruleLayout ) )? ( (lv_usedDescriptions_3_0= ruleUsedDescriptions ) )* ( (lv_refinements_4_0= ruleRefinement ) )* ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_structure_6_0= ruleStructure ) ) ) ;
    public final EObject ruleUIDescription() throws RecognitionException {
        EObject current = null;

        EObject lv_typeDefinition_0_0 = null;

        EObject lv_property_1_0 = null;

        EObject lv_layout_2_0 = null;

        EObject lv_usedDescriptions_3_0 = null;

        EObject lv_refinements_4_0 = null;

        EObject lv_definitions_5_0 = null;

        EObject lv_structure_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:79:28: ( ( ( (lv_typeDefinition_0_0= ruleTypeDefinition ) ) ( (lv_property_1_0= ruleProperty ) )? ( (lv_layout_2_0= ruleLayout ) )? ( (lv_usedDescriptions_3_0= ruleUsedDescriptions ) )* ( (lv_refinements_4_0= ruleRefinement ) )* ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_structure_6_0= ruleStructure ) ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:80:1: ( ( (lv_typeDefinition_0_0= ruleTypeDefinition ) ) ( (lv_property_1_0= ruleProperty ) )? ( (lv_layout_2_0= ruleLayout ) )? ( (lv_usedDescriptions_3_0= ruleUsedDescriptions ) )* ( (lv_refinements_4_0= ruleRefinement ) )* ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_structure_6_0= ruleStructure ) ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:80:1: ( ( (lv_typeDefinition_0_0= ruleTypeDefinition ) ) ( (lv_property_1_0= ruleProperty ) )? ( (lv_layout_2_0= ruleLayout ) )? ( (lv_usedDescriptions_3_0= ruleUsedDescriptions ) )* ( (lv_refinements_4_0= ruleRefinement ) )* ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_structure_6_0= ruleStructure ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:80:2: ( (lv_typeDefinition_0_0= ruleTypeDefinition ) ) ( (lv_property_1_0= ruleProperty ) )? ( (lv_layout_2_0= ruleLayout ) )? ( (lv_usedDescriptions_3_0= ruleUsedDescriptions ) )* ( (lv_refinements_4_0= ruleRefinement ) )* ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_structure_6_0= ruleStructure ) )
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

            if ( (LA1_0==18) ) {
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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:116:3: ( (lv_layout_2_0= ruleLayout ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:117:1: (lv_layout_2_0= ruleLayout )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:117:1: (lv_layout_2_0= ruleLayout )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:118:3: lv_layout_2_0= ruleLayout
                    {
                     
                    	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getLayoutLayoutParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLayout_in_ruleUIDescription174);
                    lv_layout_2_0=ruleLayout();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUIDescriptionRule());
                    	        }
                           		set(
                           			current, 
                           			"layout",
                            		lv_layout_2_0, 
                            		"Layout");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:134:3: ( (lv_usedDescriptions_3_0= ruleUsedDescriptions ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:135:1: (lv_usedDescriptions_3_0= ruleUsedDescriptions )
            	    {
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:135:1: (lv_usedDescriptions_3_0= ruleUsedDescriptions )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:136:3: lv_usedDescriptions_3_0= ruleUsedDescriptions
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getUsedDescriptionsUsedDescriptionsParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUsedDescriptions_in_ruleUIDescription196);
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
            	    break loop3;
                }
            } while (true);

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:152:3: ( (lv_refinements_4_0= ruleRefinement ) )*
            loop4:
            do {
                int alt4=2;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:153:1: (lv_refinements_4_0= ruleRefinement )
            	    {
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:153:1: (lv_refinements_4_0= ruleRefinement )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:154:3: lv_refinements_4_0= ruleRefinement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getRefinementsRefinementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRefinement_in_ruleUIDescription218);
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
            	    break loop4;
                }
            } while (true);

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:170:3: ( (lv_definitions_5_0= ruleDefinition ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24||(LA5_0>=26 && LA5_0<=27)||(LA5_0>=29 && LA5_0<=32)||LA5_0==34) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:171:1: (lv_definitions_5_0= ruleDefinition )
            	    {
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:171:1: (lv_definitions_5_0= ruleDefinition )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:172:3: lv_definitions_5_0= ruleDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getDefinitionsDefinitionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDefinition_in_ruleUIDescription240);
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
            	    break loop5;
                }
            } while (true);

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:188:3: ( (lv_structure_6_0= ruleStructure ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:189:1: (lv_structure_6_0= ruleStructure )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:189:1: (lv_structure_6_0= ruleStructure )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:190:3: lv_structure_6_0= ruleStructure
            {
             
            	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getStructureStructureParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleStructure_in_ruleUIDescription262);
            lv_structure_6_0=ruleStructure();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUIDescriptionRule());
            	        }
                   		set(
                   			current, 
                   			"structure",
                    		lv_structure_6_0, 
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


    // $ANTLR start "entryRuleTypeDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:214:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:215:2: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:216:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
            {
             newCompositeNode(grammarAccess.getTypeDefinitionRule()); 
            pushFollow(FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition298);
            iv_ruleTypeDefinition=ruleTypeDefinition();

            state._fsp--;

             current =iv_ruleTypeDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinition308); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:223:1: ruleTypeDefinition returns [EObject current=null] : (otherlv_0= 'type: ' ( (lv_type_1_0= ruleType ) ) otherlv_2= ';' ) ;
    public final EObject ruleTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:226:28: ( (otherlv_0= 'type: ' ( (lv_type_1_0= ruleType ) ) otherlv_2= ';' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:227:1: (otherlv_0= 'type: ' ( (lv_type_1_0= ruleType ) ) otherlv_2= ';' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:227:1: (otherlv_0= 'type: ' ( (lv_type_1_0= ruleType ) ) otherlv_2= ';' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:227:3: otherlv_0= 'type: ' ( (lv_type_1_0= ruleType ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleTypeDefinition345); 

                	newLeafNode(otherlv_0, grammarAccess.getTypeDefinitionAccess().getTypeKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:231:1: ( (lv_type_1_0= ruleType ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:232:1: (lv_type_1_0= ruleType )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:232:1: (lv_type_1_0= ruleType )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:233:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleTypeDefinition366);
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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleTypeDefinition378); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:261:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:262:2: (iv_ruleType= ruleType EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:263:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType414);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType424); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:270:1: ruleType returns [EObject current=null] : ( ( (lv_id_0_1= 'WINDOW' | lv_id_0_2= 'INNERCOMPLEX' ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_1=null;
        Token lv_id_0_2=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:273:28: ( ( ( (lv_id_0_1= 'WINDOW' | lv_id_0_2= 'INNERCOMPLEX' ) ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:274:1: ( ( (lv_id_0_1= 'WINDOW' | lv_id_0_2= 'INNERCOMPLEX' ) ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:274:1: ( ( (lv_id_0_1= 'WINDOW' | lv_id_0_2= 'INNERCOMPLEX' ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:275:1: ( (lv_id_0_1= 'WINDOW' | lv_id_0_2= 'INNERCOMPLEX' ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:275:1: ( (lv_id_0_1= 'WINDOW' | lv_id_0_2= 'INNERCOMPLEX' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:276:1: (lv_id_0_1= 'WINDOW' | lv_id_0_2= 'INNERCOMPLEX' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:276:1: (lv_id_0_1= 'WINDOW' | lv_id_0_2= 'INNERCOMPLEX' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:277:3: lv_id_0_1= 'WINDOW'
                    {
                    lv_id_0_1=(Token)match(input,16,FOLLOW_16_in_ruleType468); 

                            newLeafNode(lv_id_0_1, grammarAccess.getTypeAccess().getIdWINDOWKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRule());
                    	        }
                           		setWithLastConsumed(current, "id", lv_id_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:289:8: lv_id_0_2= 'INNERCOMPLEX'
                    {
                    lv_id_0_2=(Token)match(input,17,FOLLOW_17_in_ruleType497); 

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


    // $ANTLR start "entryRuleProperty"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:312:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:313:2: (iv_ruleProperty= ruleProperty EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:314:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty548);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty558); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:321:1: ruleProperty returns [EObject current=null] : (otherlv_0= 'get properties from:' ( (lv_propertiesFiles_1_0= RULE_STRING ) )+ otherlv_2= ';' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_propertiesFiles_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:324:28: ( (otherlv_0= 'get properties from:' ( (lv_propertiesFiles_1_0= RULE_STRING ) )+ otherlv_2= ';' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:325:1: (otherlv_0= 'get properties from:' ( (lv_propertiesFiles_1_0= RULE_STRING ) )+ otherlv_2= ';' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:325:1: (otherlv_0= 'get properties from:' ( (lv_propertiesFiles_1_0= RULE_STRING ) )+ otherlv_2= ';' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:325:3: otherlv_0= 'get properties from:' ( (lv_propertiesFiles_1_0= RULE_STRING ) )+ otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleProperty595); 

                	newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getGetPropertiesFromKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:329:1: ( (lv_propertiesFiles_1_0= RULE_STRING ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STRING) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:330:1: (lv_propertiesFiles_1_0= RULE_STRING )
            	    {
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:330:1: (lv_propertiesFiles_1_0= RULE_STRING )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:331:3: lv_propertiesFiles_1_0= RULE_STRING
            	    {
            	    lv_propertiesFiles_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProperty612); 

            	    			newLeafNode(lv_propertiesFiles_1_0, grammarAccess.getPropertyAccess().getPropertiesFilesSTRINGTerminalRuleCall_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPropertyRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"propertiesFiles",
            	            		lv_propertiesFiles_1_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleProperty630); 

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


    // $ANTLR start "entryRuleLayout"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:359:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:360:2: (iv_ruleLayout= ruleLayout EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:361:2: iv_ruleLayout= ruleLayout EOF
            {
             newCompositeNode(grammarAccess.getLayoutRule()); 
            pushFollow(FOLLOW_ruleLayout_in_entryRuleLayout666);
            iv_ruleLayout=ruleLayout();

            state._fsp--;

             current =iv_ruleLayout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayout676); 

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
    // $ANTLR end "entryRuleLayout"


    // $ANTLR start "ruleLayout"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:368:1: ruleLayout returns [EObject current=null] : (otherlv_0= 'get layout from:' ( (lv_layoutFiles_1_0= RULE_STRING ) )+ otherlv_2= ';' ) ;
    public final EObject ruleLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_layoutFiles_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:371:28: ( (otherlv_0= 'get layout from:' ( (lv_layoutFiles_1_0= RULE_STRING ) )+ otherlv_2= ';' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:372:1: (otherlv_0= 'get layout from:' ( (lv_layoutFiles_1_0= RULE_STRING ) )+ otherlv_2= ';' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:372:1: (otherlv_0= 'get layout from:' ( (lv_layoutFiles_1_0= RULE_STRING ) )+ otherlv_2= ';' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:372:3: otherlv_0= 'get layout from:' ( (lv_layoutFiles_1_0= RULE_STRING ) )+ otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleLayout713); 

                	newLeafNode(otherlv_0, grammarAccess.getLayoutAccess().getGetLayoutFromKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:376:1: ( (lv_layoutFiles_1_0= RULE_STRING ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_STRING) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:377:1: (lv_layoutFiles_1_0= RULE_STRING )
            	    {
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:377:1: (lv_layoutFiles_1_0= RULE_STRING )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:378:3: lv_layoutFiles_1_0= RULE_STRING
            	    {
            	    lv_layoutFiles_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLayout730); 

            	    			newLeafNode(lv_layoutFiles_1_0, grammarAccess.getLayoutAccess().getLayoutFilesSTRINGTerminalRuleCall_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getLayoutRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"layoutFiles",
            	            		lv_layoutFiles_1_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleLayout748); 

                	newLeafNode(otherlv_2, grammarAccess.getLayoutAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleLayout"


    // $ANTLR start "entryRuleUsedDescriptions"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:406:1: entryRuleUsedDescriptions returns [EObject current=null] : iv_ruleUsedDescriptions= ruleUsedDescriptions EOF ;
    public final EObject entryRuleUsedDescriptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsedDescriptions = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:407:2: (iv_ruleUsedDescriptions= ruleUsedDescriptions EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:408:2: iv_ruleUsedDescriptions= ruleUsedDescriptions EOF
            {
             newCompositeNode(grammarAccess.getUsedDescriptionsRule()); 
            pushFollow(FOLLOW_ruleUsedDescriptions_in_entryRuleUsedDescriptions784);
            iv_ruleUsedDescriptions=ruleUsedDescriptions();

            state._fsp--;

             current =iv_ruleUsedDescriptions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsedDescriptions794); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:415:1: ruleUsedDescriptions returns [EObject current=null] : (otherlv_0= 'use:' ( (lv_description_1_0= ruleDescriptionType ) ) (otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleUsedDescriptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;
        Token otherlv_4=null;
        EObject lv_description_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:418:28: ( (otherlv_0= 'use:' ( (lv_description_1_0= ruleDescriptionType ) ) (otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) )? otherlv_4= ';' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:419:1: (otherlv_0= 'use:' ( (lv_description_1_0= ruleDescriptionType ) ) (otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) )? otherlv_4= ';' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:419:1: (otherlv_0= 'use:' ( (lv_description_1_0= ruleDescriptionType ) ) (otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) )? otherlv_4= ';' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:419:3: otherlv_0= 'use:' ( (lv_description_1_0= ruleDescriptionType ) ) (otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleUsedDescriptions831); 

                	newLeafNode(otherlv_0, grammarAccess.getUsedDescriptionsAccess().getUseKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:423:1: ( (lv_description_1_0= ruleDescriptionType ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:424:1: (lv_description_1_0= ruleDescriptionType )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:424:1: (lv_description_1_0= ruleDescriptionType )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:425:3: lv_description_1_0= ruleDescriptionType
            {
             
            	        newCompositeNode(grammarAccess.getUsedDescriptionsAccess().getDescriptionDescriptionTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDescriptionType_in_ruleUsedDescriptions852);
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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:441:2: (otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:441:4: otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleUsedDescriptions865); 

                        	newLeafNode(otherlv_2, grammarAccess.getUsedDescriptionsAccess().getAsKeyword_2_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:445:1: ( (lv_id_3_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:446:1: (lv_id_3_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:446:1: (lv_id_3_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:447:3: lv_id_3_0= RULE_STRING
                    {
                    lv_id_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUsedDescriptions882); 

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

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleUsedDescriptions901); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:475:1: entryRuleDescriptionType returns [EObject current=null] : iv_ruleDescriptionType= ruleDescriptionType EOF ;
    public final EObject entryRuleDescriptionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescriptionType = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:476:2: (iv_ruleDescriptionType= ruleDescriptionType EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:477:2: iv_ruleDescriptionType= ruleDescriptionType EOF
            {
             newCompositeNode(grammarAccess.getDescriptionTypeRule()); 
            pushFollow(FOLLOW_ruleDescriptionType_in_entryRuleDescriptionType937);
            iv_ruleDescriptionType=ruleDescriptionType();

            state._fsp--;

             current =iv_ruleDescriptionType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescriptionType947); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:484:1: ruleDescriptionType returns [EObject current=null] : (this_UIDescriptionImport_0= ruleUIDescriptionImport | this_ComplexComponent_1= ruleComplexComponent ) ;
    public final EObject ruleDescriptionType() throws RecognitionException {
        EObject current = null;

        EObject this_UIDescriptionImport_0 = null;

        EObject this_ComplexComponent_1 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:487:28: ( (this_UIDescriptionImport_0= ruleUIDescriptionImport | this_ComplexComponent_1= ruleComplexComponent ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:488:1: (this_UIDescriptionImport_0= ruleUIDescriptionImport | this_ComplexComponent_1= ruleComplexComponent )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:488:1: (this_UIDescriptionImport_0= ruleUIDescriptionImport | this_ComplexComponent_1= ruleComplexComponent )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==33) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:489:5: this_UIDescriptionImport_0= ruleUIDescriptionImport
                    {
                     
                            newCompositeNode(grammarAccess.getDescriptionTypeAccess().getUIDescriptionImportParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUIDescriptionImport_in_ruleDescriptionType994);
                    this_UIDescriptionImport_0=ruleUIDescriptionImport();

                    state._fsp--;

                     
                            current = this_UIDescriptionImport_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:499:5: this_ComplexComponent_1= ruleComplexComponent
                    {
                     
                            newCompositeNode(grammarAccess.getDescriptionTypeAccess().getComplexComponentParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleComplexComponent_in_ruleDescriptionType1021);
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


    // $ANTLR start "entryRuleComplexComponent"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:515:1: entryRuleComplexComponent returns [EObject current=null] : iv_ruleComplexComponent= ruleComplexComponent EOF ;
    public final EObject entryRuleComplexComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexComponent = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:516:2: (iv_ruleComplexComponent= ruleComplexComponent EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:517:2: iv_ruleComplexComponent= ruleComplexComponent EOF
            {
             newCompositeNode(grammarAccess.getComplexComponentRule()); 
            pushFollow(FOLLOW_ruleComplexComponent_in_entryRuleComplexComponent1056);
            iv_ruleComplexComponent=ruleComplexComponent();

            state._fsp--;

             current =iv_ruleComplexComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexComponent1066); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:524:1: ruleComplexComponent returns [EObject current=null] : this_Multiselection_0= ruleMultiselection ;
    public final EObject ruleComplexComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Multiselection_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:527:28: (this_Multiselection_0= ruleMultiselection )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:529:5: this_Multiselection_0= ruleMultiselection
            {
             
                    newCompositeNode(grammarAccess.getComplexComponentAccess().getMultiselectionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleMultiselection_in_ruleComplexComponent1112);
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


    // $ANTLR start "entryRuleUIDescriptionImport"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:545:1: entryRuleUIDescriptionImport returns [EObject current=null] : iv_ruleUIDescriptionImport= ruleUIDescriptionImport EOF ;
    public final EObject entryRuleUIDescriptionImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIDescriptionImport = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:546:2: (iv_ruleUIDescriptionImport= ruleUIDescriptionImport EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:547:2: iv_ruleUIDescriptionImport= ruleUIDescriptionImport EOF
            {
             newCompositeNode(grammarAccess.getUIDescriptionImportRule()); 
            pushFollow(FOLLOW_ruleUIDescriptionImport_in_entryRuleUIDescriptionImport1146);
            iv_ruleUIDescriptionImport=ruleUIDescriptionImport();

            state._fsp--;

             current =iv_ruleUIDescriptionImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIDescriptionImport1156); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:554:1: ruleUIDescriptionImport returns [EObject current=null] : ( (lv_descriptionName_0_0= RULE_STRING ) ) ;
    public final EObject ruleUIDescriptionImport() throws RecognitionException {
        EObject current = null;

        Token lv_descriptionName_0_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:557:28: ( ( (lv_descriptionName_0_0= RULE_STRING ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:558:1: ( (lv_descriptionName_0_0= RULE_STRING ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:558:1: ( (lv_descriptionName_0_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:559:1: (lv_descriptionName_0_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:559:1: (lv_descriptionName_0_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:560:3: lv_descriptionName_0_0= RULE_STRING
            {
            lv_descriptionName_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUIDescriptionImport1197); 

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


    // $ANTLR start "entryRuleRefinement"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:584:1: entryRuleRefinement returns [EObject current=null] : iv_ruleRefinement= ruleRefinement EOF ;
    public final EObject entryRuleRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefinement = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:585:2: (iv_ruleRefinement= ruleRefinement EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:586:2: iv_ruleRefinement= ruleRefinement EOF
            {
             newCompositeNode(grammarAccess.getRefinementRule()); 
            pushFollow(FOLLOW_ruleRefinement_in_entryRuleRefinement1237);
            iv_ruleRefinement=ruleRefinement();

            state._fsp--;

             current =iv_ruleRefinement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefinement1247); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:593:1: ruleRefinement returns [EObject current=null] : ( ( (lv_concreteRefinement_0_0= ruleComponentRefinement ) ) otherlv_1= ';' ) ;
    public final EObject ruleRefinement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_concreteRefinement_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:596:28: ( ( ( (lv_concreteRefinement_0_0= ruleComponentRefinement ) ) otherlv_1= ';' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:597:1: ( ( (lv_concreteRefinement_0_0= ruleComponentRefinement ) ) otherlv_1= ';' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:597:1: ( ( (lv_concreteRefinement_0_0= ruleComponentRefinement ) ) otherlv_1= ';' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:597:2: ( (lv_concreteRefinement_0_0= ruleComponentRefinement ) ) otherlv_1= ';'
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:597:2: ( (lv_concreteRefinement_0_0= ruleComponentRefinement ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:598:1: (lv_concreteRefinement_0_0= ruleComponentRefinement )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:598:1: (lv_concreteRefinement_0_0= ruleComponentRefinement )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:599:3: lv_concreteRefinement_0_0= ruleComponentRefinement
            {
             
            	        newCompositeNode(grammarAccess.getRefinementAccess().getConcreteRefinementComponentRefinementParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleComponentRefinement_in_ruleRefinement1293);
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

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleRefinement1305); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:627:1: entryRuleComponentRefinement returns [EObject current=null] : iv_ruleComponentRefinement= ruleComponentRefinement EOF ;
    public final EObject entryRuleComponentRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentRefinement = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:628:2: (iv_ruleComponentRefinement= ruleComponentRefinement EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:629:2: iv_ruleComponentRefinement= ruleComponentRefinement EOF
            {
             newCompositeNode(grammarAccess.getComponentRefinementRule()); 
            pushFollow(FOLLOW_ruleComponentRefinement_in_entryRuleComponentRefinement1341);
            iv_ruleComponentRefinement=ruleComponentRefinement();

            state._fsp--;

             current =iv_ruleComponentRefinement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentRefinement1351); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:636:1: ruleComponentRefinement returns [EObject current=null] : (this_LabelRefinement_0= ruleLabelRefinement | this_ButtonRefinement_1= ruleButtonRefinement | this_TextfieldRefinement_2= ruleTextfieldRefinement | this_TextareaRefinement_3= ruleTextareaRefinement | this_TableRefinement_4= ruleTableRefinement | this_TabViewRefinement_5= ruleTabViewRefinement | this_TreeRefinement_6= ruleTreeRefinement | this_InterchangeableRefinement_7= ruleInterchangeableRefinement ) ;
    public final EObject ruleComponentRefinement() throws RecognitionException {
        EObject current = null;

        EObject this_LabelRefinement_0 = null;

        EObject this_ButtonRefinement_1 = null;

        EObject this_TextfieldRefinement_2 = null;

        EObject this_TextareaRefinement_3 = null;

        EObject this_TableRefinement_4 = null;

        EObject this_TabViewRefinement_5 = null;

        EObject this_TreeRefinement_6 = null;

        EObject this_InterchangeableRefinement_7 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:639:28: ( (this_LabelRefinement_0= ruleLabelRefinement | this_ButtonRefinement_1= ruleButtonRefinement | this_TextfieldRefinement_2= ruleTextfieldRefinement | this_TextareaRefinement_3= ruleTextareaRefinement | this_TableRefinement_4= ruleTableRefinement | this_TabViewRefinement_5= ruleTabViewRefinement | this_TreeRefinement_6= ruleTreeRefinement | this_InterchangeableRefinement_7= ruleInterchangeableRefinement ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:640:1: (this_LabelRefinement_0= ruleLabelRefinement | this_ButtonRefinement_1= ruleButtonRefinement | this_TextfieldRefinement_2= ruleTextfieldRefinement | this_TextareaRefinement_3= ruleTextareaRefinement | this_TableRefinement_4= ruleTableRefinement | this_TabViewRefinement_5= ruleTabViewRefinement | this_TreeRefinement_6= ruleTreeRefinement | this_InterchangeableRefinement_7= ruleInterchangeableRefinement )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:640:1: (this_LabelRefinement_0= ruleLabelRefinement | this_ButtonRefinement_1= ruleButtonRefinement | this_TextfieldRefinement_2= ruleTextfieldRefinement | this_TextareaRefinement_3= ruleTextareaRefinement | this_TableRefinement_4= ruleTableRefinement | this_TabViewRefinement_5= ruleTabViewRefinement | this_TreeRefinement_6= ruleTreeRefinement | this_InterchangeableRefinement_7= ruleInterchangeableRefinement )
            int alt11=8;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt11=1;
                }
                break;
            case 31:
                {
                alt11=2;
                }
                break;
            case 30:
                {
                alt11=3;
                }
                break;
            case 29:
                {
                alt11=4;
                }
                break;
            case 24:
                {
                alt11=5;
                }
                break;
            case 26:
                {
                alt11=6;
                }
                break;
            case 27:
                {
                alt11=7;
                }
                break;
            case 28:
                {
                alt11=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:641:5: this_LabelRefinement_0= ruleLabelRefinement
                    {
                     
                            newCompositeNode(grammarAccess.getComponentRefinementAccess().getLabelRefinementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLabelRefinement_in_ruleComponentRefinement1398);
                    this_LabelRefinement_0=ruleLabelRefinement();

                    state._fsp--;

                     
                            current = this_LabelRefinement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:651:5: this_ButtonRefinement_1= ruleButtonRefinement
                    {
                     
                            newCompositeNode(grammarAccess.getComponentRefinementAccess().getButtonRefinementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleButtonRefinement_in_ruleComponentRefinement1425);
                    this_ButtonRefinement_1=ruleButtonRefinement();

                    state._fsp--;

                     
                            current = this_ButtonRefinement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:661:5: this_TextfieldRefinement_2= ruleTextfieldRefinement
                    {
                     
                            newCompositeNode(grammarAccess.getComponentRefinementAccess().getTextfieldRefinementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTextfieldRefinement_in_ruleComponentRefinement1452);
                    this_TextfieldRefinement_2=ruleTextfieldRefinement();

                    state._fsp--;

                     
                            current = this_TextfieldRefinement_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:671:5: this_TextareaRefinement_3= ruleTextareaRefinement
                    {
                     
                            newCompositeNode(grammarAccess.getComponentRefinementAccess().getTextareaRefinementParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleTextareaRefinement_in_ruleComponentRefinement1479);
                    this_TextareaRefinement_3=ruleTextareaRefinement();

                    state._fsp--;

                     
                            current = this_TextareaRefinement_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:681:5: this_TableRefinement_4= ruleTableRefinement
                    {
                     
                            newCompositeNode(grammarAccess.getComponentRefinementAccess().getTableRefinementParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleTableRefinement_in_ruleComponentRefinement1506);
                    this_TableRefinement_4=ruleTableRefinement();

                    state._fsp--;

                     
                            current = this_TableRefinement_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:691:5: this_TabViewRefinement_5= ruleTabViewRefinement
                    {
                     
                            newCompositeNode(grammarAccess.getComponentRefinementAccess().getTabViewRefinementParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleTabViewRefinement_in_ruleComponentRefinement1533);
                    this_TabViewRefinement_5=ruleTabViewRefinement();

                    state._fsp--;

                     
                            current = this_TabViewRefinement_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:701:5: this_TreeRefinement_6= ruleTreeRefinement
                    {
                     
                            newCompositeNode(grammarAccess.getComponentRefinementAccess().getTreeRefinementParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleTreeRefinement_in_ruleComponentRefinement1560);
                    this_TreeRefinement_6=ruleTreeRefinement();

                    state._fsp--;

                     
                            current = this_TreeRefinement_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:711:5: this_InterchangeableRefinement_7= ruleInterchangeableRefinement
                    {
                     
                            newCompositeNode(grammarAccess.getComponentRefinementAccess().getInterchangeableRefinementParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleInterchangeableRefinement_in_ruleComponentRefinement1587);
                    this_InterchangeableRefinement_7=ruleInterchangeableRefinement();

                    state._fsp--;

                     
                            current = this_InterchangeableRefinement_7; 
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


    // $ANTLR start "entryRuleDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:727:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:728:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:729:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition1622);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition1632); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:736:1: ruleDefinition returns [EObject current=null] : ( ( (lv_concreteDefition_0_0= ruleComponentDefinition ) ) otherlv_1= ';' ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_concreteDefition_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:739:28: ( ( ( (lv_concreteDefition_0_0= ruleComponentDefinition ) ) otherlv_1= ';' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:740:1: ( ( (lv_concreteDefition_0_0= ruleComponentDefinition ) ) otherlv_1= ';' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:740:1: ( ( (lv_concreteDefition_0_0= ruleComponentDefinition ) ) otherlv_1= ';' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:740:2: ( (lv_concreteDefition_0_0= ruleComponentDefinition ) ) otherlv_1= ';'
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:740:2: ( (lv_concreteDefition_0_0= ruleComponentDefinition ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:741:1: (lv_concreteDefition_0_0= ruleComponentDefinition )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:741:1: (lv_concreteDefition_0_0= ruleComponentDefinition )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:742:3: lv_concreteDefition_0_0= ruleComponentDefinition
            {
             
            	        newCompositeNode(grammarAccess.getDefinitionAccess().getConcreteDefitionComponentDefinitionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleComponentDefinition_in_ruleDefinition1678);
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

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleDefinition1690); 

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


    // $ANTLR start "entryRuleComponentDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:770:1: entryRuleComponentDefinition returns [EObject current=null] : iv_ruleComponentDefinition= ruleComponentDefinition EOF ;
    public final EObject entryRuleComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:771:2: (iv_ruleComponentDefinition= ruleComponentDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:772:2: iv_ruleComponentDefinition= ruleComponentDefinition EOF
            {
             newCompositeNode(grammarAccess.getComponentDefinitionRule()); 
            pushFollow(FOLLOW_ruleComponentDefinition_in_entryRuleComponentDefinition1726);
            iv_ruleComponentDefinition=ruleComponentDefinition();

            state._fsp--;

             current =iv_ruleComponentDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentDefinition1736); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:779:1: ruleComponentDefinition returns [EObject current=null] : (this_LabelDefinition_0= ruleLabelDefinition | this_ButtonDefinition_1= ruleButtonDefinition | this_TextfieldDefinition_2= ruleTextfieldDefinition | this_TextareaDefinition_3= ruleTextareaDefinition | this_TreeDefinition_4= ruleTreeDefinition | this_TableDefinition_5= ruleTableDefinition | this_TabViewDefinition_6= ruleTabViewDefinition | this_InterchangeableDefinition_7= ruleInterchangeableDefinition ) ;
    public final EObject ruleComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_LabelDefinition_0 = null;

        EObject this_ButtonDefinition_1 = null;

        EObject this_TextfieldDefinition_2 = null;

        EObject this_TextareaDefinition_3 = null;

        EObject this_TreeDefinition_4 = null;

        EObject this_TableDefinition_5 = null;

        EObject this_TabViewDefinition_6 = null;

        EObject this_InterchangeableDefinition_7 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:782:28: ( (this_LabelDefinition_0= ruleLabelDefinition | this_ButtonDefinition_1= ruleButtonDefinition | this_TextfieldDefinition_2= ruleTextfieldDefinition | this_TextareaDefinition_3= ruleTextareaDefinition | this_TreeDefinition_4= ruleTreeDefinition | this_TableDefinition_5= ruleTableDefinition | this_TabViewDefinition_6= ruleTabViewDefinition | this_InterchangeableDefinition_7= ruleInterchangeableDefinition ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:783:1: (this_LabelDefinition_0= ruleLabelDefinition | this_ButtonDefinition_1= ruleButtonDefinition | this_TextfieldDefinition_2= ruleTextfieldDefinition | this_TextareaDefinition_3= ruleTextareaDefinition | this_TreeDefinition_4= ruleTreeDefinition | this_TableDefinition_5= ruleTableDefinition | this_TabViewDefinition_6= ruleTabViewDefinition | this_InterchangeableDefinition_7= ruleInterchangeableDefinition )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:783:1: (this_LabelDefinition_0= ruleLabelDefinition | this_ButtonDefinition_1= ruleButtonDefinition | this_TextfieldDefinition_2= ruleTextfieldDefinition | this_TextareaDefinition_3= ruleTextareaDefinition | this_TreeDefinition_4= ruleTreeDefinition | this_TableDefinition_5= ruleTableDefinition | this_TabViewDefinition_6= ruleTabViewDefinition | this_InterchangeableDefinition_7= ruleInterchangeableDefinition )
            int alt12=8;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt12=1;
                }
                break;
            case 31:
                {
                alt12=2;
                }
                break;
            case 30:
                {
                alt12=3;
                }
                break;
            case 29:
                {
                alt12=4;
                }
                break;
            case 27:
                {
                alt12=5;
                }
                break;
            case 24:
                {
                alt12=6;
                }
                break;
            case 26:
                {
                alt12=7;
                }
                break;
            case 34:
                {
                alt12=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:784:5: this_LabelDefinition_0= ruleLabelDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getLabelDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLabelDefinition_in_ruleComponentDefinition1783);
                    this_LabelDefinition_0=ruleLabelDefinition();

                    state._fsp--;

                     
                            current = this_LabelDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:794:5: this_ButtonDefinition_1= ruleButtonDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getButtonDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleButtonDefinition_in_ruleComponentDefinition1810);
                    this_ButtonDefinition_1=ruleButtonDefinition();

                    state._fsp--;

                     
                            current = this_ButtonDefinition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:804:5: this_TextfieldDefinition_2= ruleTextfieldDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getTextfieldDefinitionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTextfieldDefinition_in_ruleComponentDefinition1837);
                    this_TextfieldDefinition_2=ruleTextfieldDefinition();

                    state._fsp--;

                     
                            current = this_TextfieldDefinition_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:814:5: this_TextareaDefinition_3= ruleTextareaDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getTextareaDefinitionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleTextareaDefinition_in_ruleComponentDefinition1864);
                    this_TextareaDefinition_3=ruleTextareaDefinition();

                    state._fsp--;

                     
                            current = this_TextareaDefinition_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:824:5: this_TreeDefinition_4= ruleTreeDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getTreeDefinitionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleTreeDefinition_in_ruleComponentDefinition1891);
                    this_TreeDefinition_4=ruleTreeDefinition();

                    state._fsp--;

                     
                            current = this_TreeDefinition_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:834:5: this_TableDefinition_5= ruleTableDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getTableDefinitionParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleTableDefinition_in_ruleComponentDefinition1918);
                    this_TableDefinition_5=ruleTableDefinition();

                    state._fsp--;

                     
                            current = this_TableDefinition_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:844:5: this_TabViewDefinition_6= ruleTabViewDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getTabViewDefinitionParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleTabViewDefinition_in_ruleComponentDefinition1945);
                    this_TabViewDefinition_6=ruleTabViewDefinition();

                    state._fsp--;

                     
                            current = this_TabViewDefinition_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:854:5: this_InterchangeableDefinition_7= ruleInterchangeableDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getInterchangeableDefinitionParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleInterchangeableDefinition_in_ruleComponentDefinition1972);
                    this_InterchangeableDefinition_7=ruleInterchangeableDefinition();

                    state._fsp--;

                     
                            current = this_InterchangeableDefinition_7; 
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


    // $ANTLR start "entryRuleStructure"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:870:1: entryRuleStructure returns [EObject current=null] : iv_ruleStructure= ruleStructure EOF ;
    public final EObject entryRuleStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructure = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:871:2: (iv_ruleStructure= ruleStructure EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:872:2: iv_ruleStructure= ruleStructure EOF
            {
             newCompositeNode(grammarAccess.getStructureRule()); 
            pushFollow(FOLLOW_ruleStructure_in_entryRuleStructure2007);
            iv_ruleStructure=ruleStructure();

            state._fsp--;

             current =iv_ruleStructure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructure2017); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:879:1: ruleStructure returns [EObject current=null] : ( ( (lv_name_0_0= 'Structure' ) ) otherlv_1= ':' ( (lv_orderedElements_2_0= ruleElement ) )* otherlv_3= ';' ) ;
    public final EObject ruleStructure() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_orderedElements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:882:28: ( ( ( (lv_name_0_0= 'Structure' ) ) otherlv_1= ':' ( (lv_orderedElements_2_0= ruleElement ) )* otherlv_3= ';' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:883:1: ( ( (lv_name_0_0= 'Structure' ) ) otherlv_1= ':' ( (lv_orderedElements_2_0= ruleElement ) )* otherlv_3= ';' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:883:1: ( ( (lv_name_0_0= 'Structure' ) ) otherlv_1= ':' ( (lv_orderedElements_2_0= ruleElement ) )* otherlv_3= ';' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:883:2: ( (lv_name_0_0= 'Structure' ) ) otherlv_1= ':' ( (lv_orderedElements_2_0= ruleElement ) )* otherlv_3= ';'
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:883:2: ( (lv_name_0_0= 'Structure' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:884:1: (lv_name_0_0= 'Structure' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:884:1: (lv_name_0_0= 'Structure' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:885:3: lv_name_0_0= 'Structure'
            {
            lv_name_0_0=(Token)match(input,22,FOLLOW_22_in_ruleStructure2060); 

                    newLeafNode(lv_name_0_0, grammarAccess.getStructureAccess().getNameStructureKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStructureRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Structure");
            	    

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleStructure2085); 

                	newLeafNode(otherlv_1, grammarAccess.getStructureAccess().getColonKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:902:1: ( (lv_orderedElements_2_0= ruleElement ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_STRING) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:903:1: (lv_orderedElements_2_0= ruleElement )
            	    {
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:903:1: (lv_orderedElements_2_0= ruleElement )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:904:3: lv_orderedElements_2_0= ruleElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStructureAccess().getOrderedElementsElementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElement_in_ruleStructure2106);
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
            	    break loop13;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleStructure2119); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:932:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:933:2: (iv_ruleElement= ruleElement EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:934:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement2155);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement2165); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:941:1: ruleElement returns [EObject current=null] : ( (lv_id_0_0= RULE_STRING ) ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:944:28: ( ( (lv_id_0_0= RULE_STRING ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:945:1: ( (lv_id_0_0= RULE_STRING ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:945:1: ( (lv_id_0_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:946:1: (lv_id_0_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:946:1: (lv_id_0_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:947:3: lv_id_0_0= RULE_STRING
            {
            lv_id_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleElement2206); 

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


    // $ANTLR start "entryRuleTableRefinement"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:971:1: entryRuleTableRefinement returns [EObject current=null] : iv_ruleTableRefinement= ruleTableRefinement EOF ;
    public final EObject entryRuleTableRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableRefinement = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:972:2: (iv_ruleTableRefinement= ruleTableRefinement EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:973:2: iv_ruleTableRefinement= ruleTableRefinement EOF
            {
             newCompositeNode(grammarAccess.getTableRefinementRule()); 
            pushFollow(FOLLOW_ruleTableRefinement_in_entryRuleTableRefinement2246);
            iv_ruleTableRefinement=ruleTableRefinement();

            state._fsp--;

             current =iv_ruleTableRefinement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableRefinement2256); 

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
    // $ANTLR end "entryRuleTableRefinement"


    // $ANTLR start "ruleTableRefinement"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:980:1: ruleTableRefinement returns [EObject current=null] : ( ( (lv_name_0_0= 'Table' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? otherlv_2= 'change:' ( (lv_id_3_0= RULE_STRING ) ) ( (lv_properties_4_0= ruleCommonProperties ) )? ) ;
    public final EObject ruleTableRefinement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_inputType_1_0=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;
        EObject lv_properties_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:983:28: ( ( ( (lv_name_0_0= 'Table' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? otherlv_2= 'change:' ( (lv_id_3_0= RULE_STRING ) ) ( (lv_properties_4_0= ruleCommonProperties ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:984:1: ( ( (lv_name_0_0= 'Table' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? otherlv_2= 'change:' ( (lv_id_3_0= RULE_STRING ) ) ( (lv_properties_4_0= ruleCommonProperties ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:984:1: ( ( (lv_name_0_0= 'Table' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? otherlv_2= 'change:' ( (lv_id_3_0= RULE_STRING ) ) ( (lv_properties_4_0= ruleCommonProperties ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:984:2: ( (lv_name_0_0= 'Table' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? otherlv_2= 'change:' ( (lv_id_3_0= RULE_STRING ) ) ( (lv_properties_4_0= ruleCommonProperties ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:984:2: ( (lv_name_0_0= 'Table' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:985:1: (lv_name_0_0= 'Table' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:985:1: (lv_name_0_0= 'Table' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:986:3: lv_name_0_0= 'Table'
            {
            lv_name_0_0=(Token)match(input,24,FOLLOW_24_in_ruleTableRefinement2299); 

                    newLeafNode(lv_name_0_0, grammarAccess.getTableRefinementAccess().getNameTableKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTableRefinementRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Table");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:999:2: ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INPUT_DESCRIPTION) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1000:1: (lv_inputType_1_0= RULE_INPUT_DESCRIPTION )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1000:1: (lv_inputType_1_0= RULE_INPUT_DESCRIPTION )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1001:3: lv_inputType_1_0= RULE_INPUT_DESCRIPTION
                    {
                    lv_inputType_1_0=(Token)match(input,RULE_INPUT_DESCRIPTION,FOLLOW_RULE_INPUT_DESCRIPTION_in_ruleTableRefinement2329); 

                    			newLeafNode(lv_inputType_1_0, grammarAccess.getTableRefinementAccess().getInputTypeINPUT_DESCRIPTIONTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTableRefinementRule());
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

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleTableRefinement2347); 

                	newLeafNode(otherlv_2, grammarAccess.getTableRefinementAccess().getChangeKeyword_2());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1021:1: ( (lv_id_3_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1022:1: (lv_id_3_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1022:1: (lv_id_3_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1023:3: lv_id_3_0= RULE_STRING
            {
            lv_id_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTableRefinement2364); 

            			newLeafNode(lv_id_3_0, grammarAccess.getTableRefinementAccess().getIdSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTableRefinementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1039:2: ( (lv_properties_4_0= ruleCommonProperties ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==40) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1040:1: (lv_properties_4_0= ruleCommonProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1040:1: (lv_properties_4_0= ruleCommonProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1041:3: lv_properties_4_0= ruleCommonProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getTableRefinementAccess().getPropertiesCommonPropertiesParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCommonProperties_in_ruleTableRefinement2390);
                    lv_properties_4_0=ruleCommonProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTableRefinementRule());
                    	        }
                           		set(
                           			current, 
                           			"properties",
                            		lv_properties_4_0, 
                            		"CommonProperties");
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
    // $ANTLR end "ruleTableRefinement"


    // $ANTLR start "entryRuleTabViewRefinement"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1065:1: entryRuleTabViewRefinement returns [EObject current=null] : iv_ruleTabViewRefinement= ruleTabViewRefinement EOF ;
    public final EObject entryRuleTabViewRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabViewRefinement = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1066:2: (iv_ruleTabViewRefinement= ruleTabViewRefinement EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1067:2: iv_ruleTabViewRefinement= ruleTabViewRefinement EOF
            {
             newCompositeNode(grammarAccess.getTabViewRefinementRule()); 
            pushFollow(FOLLOW_ruleTabViewRefinement_in_entryRuleTabViewRefinement2427);
            iv_ruleTabViewRefinement=ruleTabViewRefinement();

            state._fsp--;

             current =iv_ruleTabViewRefinement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabViewRefinement2437); 

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
    // $ANTLR end "entryRuleTabViewRefinement"


    // $ANTLR start "ruleTabViewRefinement"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1074:1: ruleTabViewRefinement returns [EObject current=null] : ( ( (lv_name_0_0= 'TabView' ) ) ( (lv_tabs_1_0= ruleTabDefinition ) )? otherlv_2= 'change:' ( (lv_id_3_0= RULE_STRING ) ) ( (lv_properties_4_0= ruleCommonProperties ) )? ) ;
    public final EObject ruleTabViewRefinement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;
        EObject lv_tabs_1_0 = null;

        EObject lv_properties_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1077:28: ( ( ( (lv_name_0_0= 'TabView' ) ) ( (lv_tabs_1_0= ruleTabDefinition ) )? otherlv_2= 'change:' ( (lv_id_3_0= RULE_STRING ) ) ( (lv_properties_4_0= ruleCommonProperties ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1078:1: ( ( (lv_name_0_0= 'TabView' ) ) ( (lv_tabs_1_0= ruleTabDefinition ) )? otherlv_2= 'change:' ( (lv_id_3_0= RULE_STRING ) ) ( (lv_properties_4_0= ruleCommonProperties ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1078:1: ( ( (lv_name_0_0= 'TabView' ) ) ( (lv_tabs_1_0= ruleTabDefinition ) )? otherlv_2= 'change:' ( (lv_id_3_0= RULE_STRING ) ) ( (lv_properties_4_0= ruleCommonProperties ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1078:2: ( (lv_name_0_0= 'TabView' ) ) ( (lv_tabs_1_0= ruleTabDefinition ) )? otherlv_2= 'change:' ( (lv_id_3_0= RULE_STRING ) ) ( (lv_properties_4_0= ruleCommonProperties ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1078:2: ( (lv_name_0_0= 'TabView' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1079:1: (lv_name_0_0= 'TabView' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1079:1: (lv_name_0_0= 'TabView' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1080:3: lv_name_0_0= 'TabView'
            {
            lv_name_0_0=(Token)match(input,26,FOLLOW_26_in_ruleTabViewRefinement2480); 

                    newLeafNode(lv_name_0_0, grammarAccess.getTabViewRefinementAccess().getNameTabViewKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTabViewRefinementRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "TabView");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1093:2: ( (lv_tabs_1_0= ruleTabDefinition ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_TABNAME) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1094:1: (lv_tabs_1_0= ruleTabDefinition )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1094:1: (lv_tabs_1_0= ruleTabDefinition )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1095:3: lv_tabs_1_0= ruleTabDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getTabViewRefinementAccess().getTabsTabDefinitionParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTabDefinition_in_ruleTabViewRefinement2514);
                    lv_tabs_1_0=ruleTabDefinition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTabViewRefinementRule());
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

            }

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleTabViewRefinement2527); 

                	newLeafNode(otherlv_2, grammarAccess.getTabViewRefinementAccess().getChangeKeyword_2());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1115:1: ( (lv_id_3_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1116:1: (lv_id_3_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1116:1: (lv_id_3_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1117:3: lv_id_3_0= RULE_STRING
            {
            lv_id_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTabViewRefinement2544); 

            			newLeafNode(lv_id_3_0, grammarAccess.getTabViewRefinementAccess().getIdSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTabViewRefinementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1133:2: ( (lv_properties_4_0= ruleCommonProperties ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==40) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1134:1: (lv_properties_4_0= ruleCommonProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1134:1: (lv_properties_4_0= ruleCommonProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1135:3: lv_properties_4_0= ruleCommonProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getTabViewRefinementAccess().getPropertiesCommonPropertiesParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCommonProperties_in_ruleTabViewRefinement2570);
                    lv_properties_4_0=ruleCommonProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTabViewRefinementRule());
                    	        }
                           		set(
                           			current, 
                           			"properties",
                            		lv_properties_4_0, 
                            		"CommonProperties");
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
    // $ANTLR end "ruleTabViewRefinement"


    // $ANTLR start "entryRuleTreeRefinement"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1159:1: entryRuleTreeRefinement returns [EObject current=null] : iv_ruleTreeRefinement= ruleTreeRefinement EOF ;
    public final EObject entryRuleTreeRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTreeRefinement = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1160:2: (iv_ruleTreeRefinement= ruleTreeRefinement EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1161:2: iv_ruleTreeRefinement= ruleTreeRefinement EOF
            {
             newCompositeNode(grammarAccess.getTreeRefinementRule()); 
            pushFollow(FOLLOW_ruleTreeRefinement_in_entryRuleTreeRefinement2607);
            iv_ruleTreeRefinement=ruleTreeRefinement();

            state._fsp--;

             current =iv_ruleTreeRefinement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTreeRefinement2617); 

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
    // $ANTLR end "entryRuleTreeRefinement"


    // $ANTLR start "ruleTreeRefinement"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1168:1: ruleTreeRefinement returns [EObject current=null] : ( ( (lv_name_0_0= 'Tree' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? otherlv_2= 'change:' ( (lv_id_3_0= RULE_STRING ) ) ( (lv_properties_4_0= ruleCommonProperties ) )? ) ;
    public final EObject ruleTreeRefinement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_inputType_1_0=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;
        EObject lv_properties_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1171:28: ( ( ( (lv_name_0_0= 'Tree' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? otherlv_2= 'change:' ( (lv_id_3_0= RULE_STRING ) ) ( (lv_properties_4_0= ruleCommonProperties ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1172:1: ( ( (lv_name_0_0= 'Tree' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? otherlv_2= 'change:' ( (lv_id_3_0= RULE_STRING ) ) ( (lv_properties_4_0= ruleCommonProperties ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1172:1: ( ( (lv_name_0_0= 'Tree' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? otherlv_2= 'change:' ( (lv_id_3_0= RULE_STRING ) ) ( (lv_properties_4_0= ruleCommonProperties ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1172:2: ( (lv_name_0_0= 'Tree' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? otherlv_2= 'change:' ( (lv_id_3_0= RULE_STRING ) ) ( (lv_properties_4_0= ruleCommonProperties ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1172:2: ( (lv_name_0_0= 'Tree' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1173:1: (lv_name_0_0= 'Tree' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1173:1: (lv_name_0_0= 'Tree' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1174:3: lv_name_0_0= 'Tree'
            {
            lv_name_0_0=(Token)match(input,27,FOLLOW_27_in_ruleTreeRefinement2660); 

                    newLeafNode(lv_name_0_0, grammarAccess.getTreeRefinementAccess().getNameTreeKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTreeRefinementRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Tree");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1187:2: ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INPUT_DESCRIPTION) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1188:1: (lv_inputType_1_0= RULE_INPUT_DESCRIPTION )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1188:1: (lv_inputType_1_0= RULE_INPUT_DESCRIPTION )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1189:3: lv_inputType_1_0= RULE_INPUT_DESCRIPTION
                    {
                    lv_inputType_1_0=(Token)match(input,RULE_INPUT_DESCRIPTION,FOLLOW_RULE_INPUT_DESCRIPTION_in_ruleTreeRefinement2690); 

                    			newLeafNode(lv_inputType_1_0, grammarAccess.getTreeRefinementAccess().getInputTypeINPUT_DESCRIPTIONTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTreeRefinementRule());
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

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleTreeRefinement2708); 

                	newLeafNode(otherlv_2, grammarAccess.getTreeRefinementAccess().getChangeKeyword_2());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1209:1: ( (lv_id_3_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1210:1: (lv_id_3_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1210:1: (lv_id_3_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1211:3: lv_id_3_0= RULE_STRING
            {
            lv_id_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTreeRefinement2725); 

            			newLeafNode(lv_id_3_0, grammarAccess.getTreeRefinementAccess().getIdSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTreeRefinementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1227:2: ( (lv_properties_4_0= ruleCommonProperties ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==40) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1228:1: (lv_properties_4_0= ruleCommonProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1228:1: (lv_properties_4_0= ruleCommonProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1229:3: lv_properties_4_0= ruleCommonProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getTreeRefinementAccess().getPropertiesCommonPropertiesParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCommonProperties_in_ruleTreeRefinement2751);
                    lv_properties_4_0=ruleCommonProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTreeRefinementRule());
                    	        }
                           		set(
                           			current, 
                           			"properties",
                            		lv_properties_4_0, 
                            		"CommonProperties");
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
    // $ANTLR end "ruleTreeRefinement"


    // $ANTLR start "entryRuleInterchangeableRefinement"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1253:1: entryRuleInterchangeableRefinement returns [EObject current=null] : iv_ruleInterchangeableRefinement= ruleInterchangeableRefinement EOF ;
    public final EObject entryRuleInterchangeableRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterchangeableRefinement = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1254:2: (iv_ruleInterchangeableRefinement= ruleInterchangeableRefinement EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1255:2: iv_ruleInterchangeableRefinement= ruleInterchangeableRefinement EOF
            {
             newCompositeNode(grammarAccess.getInterchangeableRefinementRule()); 
            pushFollow(FOLLOW_ruleInterchangeableRefinement_in_entryRuleInterchangeableRefinement2788);
            iv_ruleInterchangeableRefinement=ruleInterchangeableRefinement();

            state._fsp--;

             current =iv_ruleInterchangeableRefinement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterchangeableRefinement2798); 

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
    // $ANTLR end "entryRuleInterchangeableRefinement"


    // $ANTLR start "ruleInterchangeableRefinement"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1262:1: ruleInterchangeableRefinement returns [EObject current=null] : ( ( (lv_name_0_0= 'Interchangeable' ) ) otherlv_1= 'change:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleCommonProperties ) )? ) ;
    public final EObject ruleInterchangeableRefinement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1265:28: ( ( ( (lv_name_0_0= 'Interchangeable' ) ) otherlv_1= 'change:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleCommonProperties ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1266:1: ( ( (lv_name_0_0= 'Interchangeable' ) ) otherlv_1= 'change:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleCommonProperties ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1266:1: ( ( (lv_name_0_0= 'Interchangeable' ) ) otherlv_1= 'change:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleCommonProperties ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1266:2: ( (lv_name_0_0= 'Interchangeable' ) ) otherlv_1= 'change:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleCommonProperties ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1266:2: ( (lv_name_0_0= 'Interchangeable' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1267:1: (lv_name_0_0= 'Interchangeable' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1267:1: (lv_name_0_0= 'Interchangeable' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1268:3: lv_name_0_0= 'Interchangeable'
            {
            lv_name_0_0=(Token)match(input,28,FOLLOW_28_in_ruleInterchangeableRefinement2841); 

                    newLeafNode(lv_name_0_0, grammarAccess.getInterchangeableRefinementAccess().getNameInterchangeableKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInterchangeableRefinementRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Interchangeable");
            	    

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleInterchangeableRefinement2866); 

                	newLeafNode(otherlv_1, grammarAccess.getInterchangeableRefinementAccess().getChangeKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1285:1: ( (lv_id_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1286:1: (lv_id_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1286:1: (lv_id_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1287:3: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInterchangeableRefinement2883); 

            			newLeafNode(lv_id_2_0, grammarAccess.getInterchangeableRefinementAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInterchangeableRefinementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1303:2: ( (lv_properties_3_0= ruleCommonProperties ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==40) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1304:1: (lv_properties_3_0= ruleCommonProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1304:1: (lv_properties_3_0= ruleCommonProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1305:3: lv_properties_3_0= ruleCommonProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getInterchangeableRefinementAccess().getPropertiesCommonPropertiesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCommonProperties_in_ruleInterchangeableRefinement2909);
                    lv_properties_3_0=ruleCommonProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInterchangeableRefinementRule());
                    	        }
                           		set(
                           			current, 
                           			"properties",
                            		lv_properties_3_0, 
                            		"CommonProperties");
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
    // $ANTLR end "ruleInterchangeableRefinement"


    // $ANTLR start "entryRuleTextareaRefinement"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1329:1: entryRuleTextareaRefinement returns [EObject current=null] : iv_ruleTextareaRefinement= ruleTextareaRefinement EOF ;
    public final EObject entryRuleTextareaRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextareaRefinement = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1330:2: (iv_ruleTextareaRefinement= ruleTextareaRefinement EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1331:2: iv_ruleTextareaRefinement= ruleTextareaRefinement EOF
            {
             newCompositeNode(grammarAccess.getTextareaRefinementRule()); 
            pushFollow(FOLLOW_ruleTextareaRefinement_in_entryRuleTextareaRefinement2946);
            iv_ruleTextareaRefinement=ruleTextareaRefinement();

            state._fsp--;

             current =iv_ruleTextareaRefinement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextareaRefinement2956); 

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
    // $ANTLR end "entryRuleTextareaRefinement"


    // $ANTLR start "ruleTextareaRefinement"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1338:1: ruleTextareaRefinement returns [EObject current=null] : ( ( (lv_name_0_0= 'Textarea' ) ) otherlv_1= 'change:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleTextareaProperties ) )? ) ;
    public final EObject ruleTextareaRefinement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1341:28: ( ( ( (lv_name_0_0= 'Textarea' ) ) otherlv_1= 'change:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleTextareaProperties ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1342:1: ( ( (lv_name_0_0= 'Textarea' ) ) otherlv_1= 'change:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleTextareaProperties ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1342:1: ( ( (lv_name_0_0= 'Textarea' ) ) otherlv_1= 'change:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleTextareaProperties ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1342:2: ( (lv_name_0_0= 'Textarea' ) ) otherlv_1= 'change:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleTextareaProperties ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1342:2: ( (lv_name_0_0= 'Textarea' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1343:1: (lv_name_0_0= 'Textarea' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1343:1: (lv_name_0_0= 'Textarea' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1344:3: lv_name_0_0= 'Textarea'
            {
            lv_name_0_0=(Token)match(input,29,FOLLOW_29_in_ruleTextareaRefinement2999); 

                    newLeafNode(lv_name_0_0, grammarAccess.getTextareaRefinementAccess().getNameTextareaKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextareaRefinementRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Textarea");
            	    

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleTextareaRefinement3024); 

                	newLeafNode(otherlv_1, grammarAccess.getTextareaRefinementAccess().getChangeKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1361:1: ( (lv_id_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1362:1: (lv_id_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1362:1: (lv_id_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1363:3: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextareaRefinement3041); 

            			newLeafNode(lv_id_2_0, grammarAccess.getTextareaRefinementAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextareaRefinementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1379:2: ( (lv_properties_3_0= ruleTextareaProperties ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==40) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1380:1: (lv_properties_3_0= ruleTextareaProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1380:1: (lv_properties_3_0= ruleTextareaProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1381:3: lv_properties_3_0= ruleTextareaProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextareaRefinementAccess().getPropertiesTextareaPropertiesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTextareaProperties_in_ruleTextareaRefinement3067);
                    lv_properties_3_0=ruleTextareaProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTextareaRefinementRule());
                    	        }
                           		set(
                           			current, 
                           			"properties",
                            		lv_properties_3_0, 
                            		"TextareaProperties");
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
    // $ANTLR end "ruleTextareaRefinement"


    // $ANTLR start "entryRuleTextfieldRefinement"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1405:1: entryRuleTextfieldRefinement returns [EObject current=null] : iv_ruleTextfieldRefinement= ruleTextfieldRefinement EOF ;
    public final EObject entryRuleTextfieldRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextfieldRefinement = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1406:2: (iv_ruleTextfieldRefinement= ruleTextfieldRefinement EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1407:2: iv_ruleTextfieldRefinement= ruleTextfieldRefinement EOF
            {
             newCompositeNode(grammarAccess.getTextfieldRefinementRule()); 
            pushFollow(FOLLOW_ruleTextfieldRefinement_in_entryRuleTextfieldRefinement3104);
            iv_ruleTextfieldRefinement=ruleTextfieldRefinement();

            state._fsp--;

             current =iv_ruleTextfieldRefinement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextfieldRefinement3114); 

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
    // $ANTLR end "entryRuleTextfieldRefinement"


    // $ANTLR start "ruleTextfieldRefinement"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1414:1: ruleTextfieldRefinement returns [EObject current=null] : ( ( (lv_name_0_0= 'Textfield' ) ) otherlv_1= 'change:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleTextfieldProperties ) )? ) ;
    public final EObject ruleTextfieldRefinement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1417:28: ( ( ( (lv_name_0_0= 'Textfield' ) ) otherlv_1= 'change:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleTextfieldProperties ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1418:1: ( ( (lv_name_0_0= 'Textfield' ) ) otherlv_1= 'change:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleTextfieldProperties ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1418:1: ( ( (lv_name_0_0= 'Textfield' ) ) otherlv_1= 'change:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleTextfieldProperties ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1418:2: ( (lv_name_0_0= 'Textfield' ) ) otherlv_1= 'change:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleTextfieldProperties ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1418:2: ( (lv_name_0_0= 'Textfield' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1419:1: (lv_name_0_0= 'Textfield' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1419:1: (lv_name_0_0= 'Textfield' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1420:3: lv_name_0_0= 'Textfield'
            {
            lv_name_0_0=(Token)match(input,30,FOLLOW_30_in_ruleTextfieldRefinement3157); 

                    newLeafNode(lv_name_0_0, grammarAccess.getTextfieldRefinementAccess().getNameTextfieldKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextfieldRefinementRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Textfield");
            	    

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleTextfieldRefinement3182); 

                	newLeafNode(otherlv_1, grammarAccess.getTextfieldRefinementAccess().getChangeKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1437:1: ( (lv_id_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1438:1: (lv_id_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1438:1: (lv_id_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1439:3: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextfieldRefinement3199); 

            			newLeafNode(lv_id_2_0, grammarAccess.getTextfieldRefinementAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextfieldRefinementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1455:2: ( (lv_properties_3_0= ruleTextfieldProperties ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1456:1: (lv_properties_3_0= ruleTextfieldProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1456:1: (lv_properties_3_0= ruleTextfieldProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1457:3: lv_properties_3_0= ruleTextfieldProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextfieldRefinementAccess().getPropertiesTextfieldPropertiesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTextfieldProperties_in_ruleTextfieldRefinement3225);
                    lv_properties_3_0=ruleTextfieldProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTextfieldRefinementRule());
                    	        }
                           		set(
                           			current, 
                           			"properties",
                            		lv_properties_3_0, 
                            		"TextfieldProperties");
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
    // $ANTLR end "ruleTextfieldRefinement"


    // $ANTLR start "entryRuleButtonRefinement"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1481:1: entryRuleButtonRefinement returns [EObject current=null] : iv_ruleButtonRefinement= ruleButtonRefinement EOF ;
    public final EObject entryRuleButtonRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonRefinement = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1482:2: (iv_ruleButtonRefinement= ruleButtonRefinement EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1483:2: iv_ruleButtonRefinement= ruleButtonRefinement EOF
            {
             newCompositeNode(grammarAccess.getButtonRefinementRule()); 
            pushFollow(FOLLOW_ruleButtonRefinement_in_entryRuleButtonRefinement3262);
            iv_ruleButtonRefinement=ruleButtonRefinement();

            state._fsp--;

             current =iv_ruleButtonRefinement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonRefinement3272); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1490:1: ruleButtonRefinement returns [EObject current=null] : ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'change:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleButtonProperties ) )? ) ;
    public final EObject ruleButtonRefinement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1493:28: ( ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'change:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleButtonProperties ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1494:1: ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'change:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleButtonProperties ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1494:1: ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'change:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleButtonProperties ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1494:2: ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'change:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleButtonProperties ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1494:2: ( (lv_name_0_0= 'Button' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1495:1: (lv_name_0_0= 'Button' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1495:1: (lv_name_0_0= 'Button' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1496:3: lv_name_0_0= 'Button'
            {
            lv_name_0_0=(Token)match(input,31,FOLLOW_31_in_ruleButtonRefinement3315); 

                    newLeafNode(lv_name_0_0, grammarAccess.getButtonRefinementAccess().getNameButtonKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getButtonRefinementRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Button");
            	    

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleButtonRefinement3340); 

                	newLeafNode(otherlv_1, grammarAccess.getButtonRefinementAccess().getChangeKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1513:1: ( (lv_id_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1514:1: (lv_id_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1514:1: (lv_id_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1515:3: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleButtonRefinement3357); 

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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1531:2: ( (lv_properties_3_0= ruleButtonProperties ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==40) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1532:1: (lv_properties_3_0= ruleButtonProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1532:1: (lv_properties_3_0= ruleButtonProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1533:3: lv_properties_3_0= ruleButtonProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getButtonRefinementAccess().getPropertiesButtonPropertiesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleButtonProperties_in_ruleButtonRefinement3383);
                    lv_properties_3_0=ruleButtonProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getButtonRefinementRule());
                    	        }
                           		set(
                           			current, 
                           			"properties",
                            		lv_properties_3_0, 
                            		"ButtonProperties");
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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1557:1: entryRuleLabelRefinement returns [EObject current=null] : iv_ruleLabelRefinement= ruleLabelRefinement EOF ;
    public final EObject entryRuleLabelRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelRefinement = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1558:2: (iv_ruleLabelRefinement= ruleLabelRefinement EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1559:2: iv_ruleLabelRefinement= ruleLabelRefinement EOF
            {
             newCompositeNode(grammarAccess.getLabelRefinementRule()); 
            pushFollow(FOLLOW_ruleLabelRefinement_in_entryRuleLabelRefinement3420);
            iv_ruleLabelRefinement=ruleLabelRefinement();

            state._fsp--;

             current =iv_ruleLabelRefinement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelRefinement3430); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1566:1: ruleLabelRefinement returns [EObject current=null] : ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'change:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleLabelProperties ) )? ) ;
    public final EObject ruleLabelRefinement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1569:28: ( ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'change:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleLabelProperties ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1570:1: ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'change:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleLabelProperties ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1570:1: ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'change:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleLabelProperties ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1570:2: ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'change:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleLabelProperties ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1570:2: ( (lv_name_0_0= 'Label' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1571:1: (lv_name_0_0= 'Label' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1571:1: (lv_name_0_0= 'Label' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1572:3: lv_name_0_0= 'Label'
            {
            lv_name_0_0=(Token)match(input,32,FOLLOW_32_in_ruleLabelRefinement3473); 

                    newLeafNode(lv_name_0_0, grammarAccess.getLabelRefinementAccess().getNameLabelKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelRefinementRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Label");
            	    

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleLabelRefinement3498); 

                	newLeafNode(otherlv_1, grammarAccess.getLabelRefinementAccess().getChangeKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1589:1: ( (lv_id_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1590:1: (lv_id_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1590:1: (lv_id_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1591:3: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabelRefinement3515); 

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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1607:2: ( (lv_properties_3_0= ruleLabelProperties ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1608:1: (lv_properties_3_0= ruleLabelProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1608:1: (lv_properties_3_0= ruleLabelProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1609:3: lv_properties_3_0= ruleLabelProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getLabelRefinementAccess().getPropertiesLabelPropertiesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLabelProperties_in_ruleLabelRefinement3541);
                    lv_properties_3_0=ruleLabelProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLabelRefinementRule());
                    	        }
                           		set(
                           			current, 
                           			"properties",
                            		lv_properties_3_0, 
                            		"LabelProperties");
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


    // $ANTLR start "entryRuleTabViewDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1633:1: entryRuleTabViewDefinition returns [EObject current=null] : iv_ruleTabViewDefinition= ruleTabViewDefinition EOF ;
    public final EObject entryRuleTabViewDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabViewDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1634:2: (iv_ruleTabViewDefinition= ruleTabViewDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1635:2: iv_ruleTabViewDefinition= ruleTabViewDefinition EOF
            {
             newCompositeNode(grammarAccess.getTabViewDefinitionRule()); 
            pushFollow(FOLLOW_ruleTabViewDefinition_in_entryRuleTabViewDefinition3578);
            iv_ruleTabViewDefinition=ruleTabViewDefinition();

            state._fsp--;

             current =iv_ruleTabViewDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabViewDefinition3588); 

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
    // $ANTLR end "entryRuleTabViewDefinition"


    // $ANTLR start "ruleTabViewDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1642:1: ruleTabViewDefinition returns [EObject current=null] : ( ( (lv_name_0_0= 'TabView' ) ) ( (lv_tabs_1_0= ruleTabDefinition ) )* otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) ( (lv_properties_4_0= ruleCommonProperties ) )? ) ;
    public final EObject ruleTabViewDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;
        EObject lv_tabs_1_0 = null;

        EObject lv_properties_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1645:28: ( ( ( (lv_name_0_0= 'TabView' ) ) ( (lv_tabs_1_0= ruleTabDefinition ) )* otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) ( (lv_properties_4_0= ruleCommonProperties ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1646:1: ( ( (lv_name_0_0= 'TabView' ) ) ( (lv_tabs_1_0= ruleTabDefinition ) )* otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) ( (lv_properties_4_0= ruleCommonProperties ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1646:1: ( ( (lv_name_0_0= 'TabView' ) ) ( (lv_tabs_1_0= ruleTabDefinition ) )* otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) ( (lv_properties_4_0= ruleCommonProperties ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1646:2: ( (lv_name_0_0= 'TabView' ) ) ( (lv_tabs_1_0= ruleTabDefinition ) )* otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) ( (lv_properties_4_0= ruleCommonProperties ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1646:2: ( (lv_name_0_0= 'TabView' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1647:1: (lv_name_0_0= 'TabView' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1647:1: (lv_name_0_0= 'TabView' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1648:3: lv_name_0_0= 'TabView'
            {
            lv_name_0_0=(Token)match(input,26,FOLLOW_26_in_ruleTabViewDefinition3631); 

                    newLeafNode(lv_name_0_0, grammarAccess.getTabViewDefinitionAccess().getNameTabViewKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTabViewDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "TabView");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1661:2: ( (lv_tabs_1_0= ruleTabDefinition ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_TABNAME) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1662:1: (lv_tabs_1_0= ruleTabDefinition )
            	    {
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1662:1: (lv_tabs_1_0= ruleTabDefinition )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1663:3: lv_tabs_1_0= ruleTabDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTabViewDefinitionAccess().getTabsTabDefinitionParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTabDefinition_in_ruleTabViewDefinition3665);
            	    lv_tabs_1_0=ruleTabDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTabViewDefinitionRule());
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
            	    break loop25;
                }
            } while (true);

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleTabViewDefinition3678); 

                	newLeafNode(otherlv_2, grammarAccess.getTabViewDefinitionAccess().getAsKeyword_2());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1683:1: ( (lv_id_3_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1684:1: (lv_id_3_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1684:1: (lv_id_3_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1685:3: lv_id_3_0= RULE_STRING
            {
            lv_id_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTabViewDefinition3695); 

            			newLeafNode(lv_id_3_0, grammarAccess.getTabViewDefinitionAccess().getIdSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTabViewDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1701:2: ( (lv_properties_4_0= ruleCommonProperties ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1702:1: (lv_properties_4_0= ruleCommonProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1702:1: (lv_properties_4_0= ruleCommonProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1703:3: lv_properties_4_0= ruleCommonProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getTabViewDefinitionAccess().getPropertiesCommonPropertiesParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCommonProperties_in_ruleTabViewDefinition3721);
                    lv_properties_4_0=ruleCommonProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTabViewDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"properties",
                            		lv_properties_4_0, 
                            		"CommonProperties");
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
    // $ANTLR end "ruleTabViewDefinition"


    // $ANTLR start "entryRuleTabDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1727:1: entryRuleTabDefinition returns [EObject current=null] : iv_ruleTabDefinition= ruleTabDefinition EOF ;
    public final EObject entryRuleTabDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1728:2: (iv_ruleTabDefinition= ruleTabDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1729:2: iv_ruleTabDefinition= ruleTabDefinition EOF
            {
             newCompositeNode(grammarAccess.getTabDefinitionRule()); 
            pushFollow(FOLLOW_ruleTabDefinition_in_entryRuleTabDefinition3758);
            iv_ruleTabDefinition=ruleTabDefinition();

            state._fsp--;

             current =iv_ruleTabDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabDefinition3768); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1736:1: ruleTabDefinition returns [EObject current=null] : ( (lv_name_0_0= RULE_TABNAME ) ) ;
    public final EObject ruleTabDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1739:28: ( ( (lv_name_0_0= RULE_TABNAME ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1740:1: ( (lv_name_0_0= RULE_TABNAME ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1740:1: ( (lv_name_0_0= RULE_TABNAME ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1741:1: (lv_name_0_0= RULE_TABNAME )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1741:1: (lv_name_0_0= RULE_TABNAME )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1742:3: lv_name_0_0= RULE_TABNAME
            {
            lv_name_0_0=(Token)match(input,RULE_TABNAME,FOLLOW_RULE_TABNAME_in_ruleTabDefinition3809); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1766:1: entryRuleMultiselection returns [EObject current=null] : iv_ruleMultiselection= ruleMultiselection EOF ;
    public final EObject entryRuleMultiselection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiselection = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1767:2: (iv_ruleMultiselection= ruleMultiselection EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1768:2: iv_ruleMultiselection= ruleMultiselection EOF
            {
             newCompositeNode(grammarAccess.getMultiselectionRule()); 
            pushFollow(FOLLOW_ruleMultiselection_in_entryRuleMultiselection3849);
            iv_ruleMultiselection=ruleMultiselection();

            state._fsp--;

             current =iv_ruleMultiselection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiselection3859); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1775:1: ruleMultiselection returns [EObject current=null] : ( ( (lv_name_0_0= 'Multiselection' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? ) ;
    public final EObject ruleMultiselection() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_inputType_1_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1778:28: ( ( ( (lv_name_0_0= 'Multiselection' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1779:1: ( ( (lv_name_0_0= 'Multiselection' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1779:1: ( ( (lv_name_0_0= 'Multiselection' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1779:2: ( (lv_name_0_0= 'Multiselection' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1779:2: ( (lv_name_0_0= 'Multiselection' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1780:1: (lv_name_0_0= 'Multiselection' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1780:1: (lv_name_0_0= 'Multiselection' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1781:3: lv_name_0_0= 'Multiselection'
            {
            lv_name_0_0=(Token)match(input,33,FOLLOW_33_in_ruleMultiselection3902); 

                    newLeafNode(lv_name_0_0, grammarAccess.getMultiselectionAccess().getNameMultiselectionKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMultiselectionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Multiselection");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1794:2: ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_INPUT_DESCRIPTION) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1795:1: (lv_inputType_1_0= RULE_INPUT_DESCRIPTION )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1795:1: (lv_inputType_1_0= RULE_INPUT_DESCRIPTION )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1796:3: lv_inputType_1_0= RULE_INPUT_DESCRIPTION
                    {
                    lv_inputType_1_0=(Token)match(input,RULE_INPUT_DESCRIPTION,FOLLOW_RULE_INPUT_DESCRIPTION_in_ruleMultiselection3932); 

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


    // $ANTLR start "entryRuleTextfieldDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1820:1: entryRuleTextfieldDefinition returns [EObject current=null] : iv_ruleTextfieldDefinition= ruleTextfieldDefinition EOF ;
    public final EObject entryRuleTextfieldDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextfieldDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1821:2: (iv_ruleTextfieldDefinition= ruleTextfieldDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1822:2: iv_ruleTextfieldDefinition= ruleTextfieldDefinition EOF
            {
             newCompositeNode(grammarAccess.getTextfieldDefinitionRule()); 
            pushFollow(FOLLOW_ruleTextfieldDefinition_in_entryRuleTextfieldDefinition3974);
            iv_ruleTextfieldDefinition=ruleTextfieldDefinition();

            state._fsp--;

             current =iv_ruleTextfieldDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextfieldDefinition3984); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1829:1: ruleTextfieldDefinition returns [EObject current=null] : ( ( (lv_name_0_0= 'Textfield' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleTextfieldProperties ) )? ) ;
    public final EObject ruleTextfieldDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1832:28: ( ( ( (lv_name_0_0= 'Textfield' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleTextfieldProperties ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1833:1: ( ( (lv_name_0_0= 'Textfield' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleTextfieldProperties ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1833:1: ( ( (lv_name_0_0= 'Textfield' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleTextfieldProperties ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1833:2: ( (lv_name_0_0= 'Textfield' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleTextfieldProperties ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1833:2: ( (lv_name_0_0= 'Textfield' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1834:1: (lv_name_0_0= 'Textfield' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1834:1: (lv_name_0_0= 'Textfield' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1835:3: lv_name_0_0= 'Textfield'
            {
            lv_name_0_0=(Token)match(input,30,FOLLOW_30_in_ruleTextfieldDefinition4027); 

                    newLeafNode(lv_name_0_0, grammarAccess.getTextfieldDefinitionAccess().getNameTextfieldKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextfieldDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Textfield");
            	    

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleTextfieldDefinition4052); 

                	newLeafNode(otherlv_1, grammarAccess.getTextfieldDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1852:1: ( (lv_id_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1853:1: (lv_id_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1853:1: (lv_id_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1854:3: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextfieldDefinition4069); 

            			newLeafNode(lv_id_2_0, grammarAccess.getTextfieldDefinitionAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextfieldDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1870:2: ( (lv_properties_3_0= ruleTextfieldProperties ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1871:1: (lv_properties_3_0= ruleTextfieldProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1871:1: (lv_properties_3_0= ruleTextfieldProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1872:3: lv_properties_3_0= ruleTextfieldProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextfieldDefinitionAccess().getPropertiesTextfieldPropertiesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTextfieldProperties_in_ruleTextfieldDefinition4095);
                    lv_properties_3_0=ruleTextfieldProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTextfieldDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"properties",
                            		lv_properties_3_0, 
                            		"TextfieldProperties");
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
    // $ANTLR end "ruleTextfieldDefinition"


    // $ANTLR start "entryRuleTextareaDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1896:1: entryRuleTextareaDefinition returns [EObject current=null] : iv_ruleTextareaDefinition= ruleTextareaDefinition EOF ;
    public final EObject entryRuleTextareaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextareaDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1897:2: (iv_ruleTextareaDefinition= ruleTextareaDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1898:2: iv_ruleTextareaDefinition= ruleTextareaDefinition EOF
            {
             newCompositeNode(grammarAccess.getTextareaDefinitionRule()); 
            pushFollow(FOLLOW_ruleTextareaDefinition_in_entryRuleTextareaDefinition4132);
            iv_ruleTextareaDefinition=ruleTextareaDefinition();

            state._fsp--;

             current =iv_ruleTextareaDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextareaDefinition4142); 

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
    // $ANTLR end "entryRuleTextareaDefinition"


    // $ANTLR start "ruleTextareaDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1905:1: ruleTextareaDefinition returns [EObject current=null] : ( ( (lv_name_0_0= 'Textarea' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleTextareaProperties ) )? ) ;
    public final EObject ruleTextareaDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1908:28: ( ( ( (lv_name_0_0= 'Textarea' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleTextareaProperties ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1909:1: ( ( (lv_name_0_0= 'Textarea' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleTextareaProperties ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1909:1: ( ( (lv_name_0_0= 'Textarea' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleTextareaProperties ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1909:2: ( (lv_name_0_0= 'Textarea' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleTextareaProperties ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1909:2: ( (lv_name_0_0= 'Textarea' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1910:1: (lv_name_0_0= 'Textarea' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1910:1: (lv_name_0_0= 'Textarea' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1911:3: lv_name_0_0= 'Textarea'
            {
            lv_name_0_0=(Token)match(input,29,FOLLOW_29_in_ruleTextareaDefinition4185); 

                    newLeafNode(lv_name_0_0, grammarAccess.getTextareaDefinitionAccess().getNameTextareaKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextareaDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Textarea");
            	    

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleTextareaDefinition4210); 

                	newLeafNode(otherlv_1, grammarAccess.getTextareaDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1928:1: ( (lv_id_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1929:1: (lv_id_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1929:1: (lv_id_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1930:3: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextareaDefinition4227); 

            			newLeafNode(lv_id_2_0, grammarAccess.getTextareaDefinitionAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextareaDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1946:2: ( (lv_properties_3_0= ruleTextareaProperties ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==40) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1947:1: (lv_properties_3_0= ruleTextareaProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1947:1: (lv_properties_3_0= ruleTextareaProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1948:3: lv_properties_3_0= ruleTextareaProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextareaDefinitionAccess().getPropertiesTextareaPropertiesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTextareaProperties_in_ruleTextareaDefinition4253);
                    lv_properties_3_0=ruleTextareaProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTextareaDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"properties",
                            		lv_properties_3_0, 
                            		"TextareaProperties");
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
    // $ANTLR end "ruleTextareaDefinition"


    // $ANTLR start "entryRuleTreeDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1972:1: entryRuleTreeDefinition returns [EObject current=null] : iv_ruleTreeDefinition= ruleTreeDefinition EOF ;
    public final EObject entryRuleTreeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTreeDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1973:2: (iv_ruleTreeDefinition= ruleTreeDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1974:2: iv_ruleTreeDefinition= ruleTreeDefinition EOF
            {
             newCompositeNode(grammarAccess.getTreeDefinitionRule()); 
            pushFollow(FOLLOW_ruleTreeDefinition_in_entryRuleTreeDefinition4290);
            iv_ruleTreeDefinition=ruleTreeDefinition();

            state._fsp--;

             current =iv_ruleTreeDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTreeDefinition4300); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1981:1: ruleTreeDefinition returns [EObject current=null] : ( ( (lv_name_0_0= 'Tree' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) ( (lv_properties_4_0= ruleCommonProperties ) )? ) ;
    public final EObject ruleTreeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_inputType_1_0=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;
        EObject lv_properties_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1984:28: ( ( ( (lv_name_0_0= 'Tree' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) ( (lv_properties_4_0= ruleCommonProperties ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1985:1: ( ( (lv_name_0_0= 'Tree' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) ( (lv_properties_4_0= ruleCommonProperties ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1985:1: ( ( (lv_name_0_0= 'Tree' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) ( (lv_properties_4_0= ruleCommonProperties ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1985:2: ( (lv_name_0_0= 'Tree' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) ( (lv_properties_4_0= ruleCommonProperties ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1985:2: ( (lv_name_0_0= 'Tree' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1986:1: (lv_name_0_0= 'Tree' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1986:1: (lv_name_0_0= 'Tree' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1987:3: lv_name_0_0= 'Tree'
            {
            lv_name_0_0=(Token)match(input,27,FOLLOW_27_in_ruleTreeDefinition4343); 

                    newLeafNode(lv_name_0_0, grammarAccess.getTreeDefinitionAccess().getNameTreeKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTreeDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Tree");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2000:2: ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_INPUT_DESCRIPTION) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2001:1: (lv_inputType_1_0= RULE_INPUT_DESCRIPTION )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2001:1: (lv_inputType_1_0= RULE_INPUT_DESCRIPTION )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2002:3: lv_inputType_1_0= RULE_INPUT_DESCRIPTION
                    {
                    lv_inputType_1_0=(Token)match(input,RULE_INPUT_DESCRIPTION,FOLLOW_RULE_INPUT_DESCRIPTION_in_ruleTreeDefinition4373); 

                    			newLeafNode(lv_inputType_1_0, grammarAccess.getTreeDefinitionAccess().getInputTypeINPUT_DESCRIPTIONTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTreeDefinitionRule());
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

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleTreeDefinition4391); 

                	newLeafNode(otherlv_2, grammarAccess.getTreeDefinitionAccess().getAsKeyword_2());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2022:1: ( (lv_id_3_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2023:1: (lv_id_3_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2023:1: (lv_id_3_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2024:3: lv_id_3_0= RULE_STRING
            {
            lv_id_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTreeDefinition4408); 

            			newLeafNode(lv_id_3_0, grammarAccess.getTreeDefinitionAccess().getIdSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTreeDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2040:2: ( (lv_properties_4_0= ruleCommonProperties ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==40) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2041:1: (lv_properties_4_0= ruleCommonProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2041:1: (lv_properties_4_0= ruleCommonProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2042:3: lv_properties_4_0= ruleCommonProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getTreeDefinitionAccess().getPropertiesCommonPropertiesParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCommonProperties_in_ruleTreeDefinition4434);
                    lv_properties_4_0=ruleCommonProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTreeDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"properties",
                            		lv_properties_4_0, 
                            		"CommonProperties");
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
    // $ANTLR end "ruleTreeDefinition"


    // $ANTLR start "entryRuleTableDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2066:1: entryRuleTableDefinition returns [EObject current=null] : iv_ruleTableDefinition= ruleTableDefinition EOF ;
    public final EObject entryRuleTableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2067:2: (iv_ruleTableDefinition= ruleTableDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2068:2: iv_ruleTableDefinition= ruleTableDefinition EOF
            {
             newCompositeNode(grammarAccess.getTableDefinitionRule()); 
            pushFollow(FOLLOW_ruleTableDefinition_in_entryRuleTableDefinition4471);
            iv_ruleTableDefinition=ruleTableDefinition();

            state._fsp--;

             current =iv_ruleTableDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableDefinition4481); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2075:1: ruleTableDefinition returns [EObject current=null] : ( ( (lv_name_0_0= 'Table' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) ( (lv_properties_4_0= ruleCommonProperties ) )? ) ;
    public final EObject ruleTableDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_inputType_1_0=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;
        EObject lv_properties_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2078:28: ( ( ( (lv_name_0_0= 'Table' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) ( (lv_properties_4_0= ruleCommonProperties ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2079:1: ( ( (lv_name_0_0= 'Table' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) ( (lv_properties_4_0= ruleCommonProperties ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2079:1: ( ( (lv_name_0_0= 'Table' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) ( (lv_properties_4_0= ruleCommonProperties ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2079:2: ( (lv_name_0_0= 'Table' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) ( (lv_properties_4_0= ruleCommonProperties ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2079:2: ( (lv_name_0_0= 'Table' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2080:1: (lv_name_0_0= 'Table' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2080:1: (lv_name_0_0= 'Table' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2081:3: lv_name_0_0= 'Table'
            {
            lv_name_0_0=(Token)match(input,24,FOLLOW_24_in_ruleTableDefinition4524); 

                    newLeafNode(lv_name_0_0, grammarAccess.getTableDefinitionAccess().getNameTableKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTableDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Table");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2094:2: ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_INPUT_DESCRIPTION) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2095:1: (lv_inputType_1_0= RULE_INPUT_DESCRIPTION )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2095:1: (lv_inputType_1_0= RULE_INPUT_DESCRIPTION )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2096:3: lv_inputType_1_0= RULE_INPUT_DESCRIPTION
                    {
                    lv_inputType_1_0=(Token)match(input,RULE_INPUT_DESCRIPTION,FOLLOW_RULE_INPUT_DESCRIPTION_in_ruleTableDefinition4554); 

                    			newLeafNode(lv_inputType_1_0, grammarAccess.getTableDefinitionAccess().getInputTypeINPUT_DESCRIPTIONTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTableDefinitionRule());
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

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleTableDefinition4572); 

                	newLeafNode(otherlv_2, grammarAccess.getTableDefinitionAccess().getAsKeyword_2());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2116:1: ( (lv_id_3_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2117:1: (lv_id_3_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2117:1: (lv_id_3_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2118:3: lv_id_3_0= RULE_STRING
            {
            lv_id_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTableDefinition4589); 

            			newLeafNode(lv_id_3_0, grammarAccess.getTableDefinitionAccess().getIdSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTableDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2134:2: ( (lv_properties_4_0= ruleCommonProperties ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==40) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2135:1: (lv_properties_4_0= ruleCommonProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2135:1: (lv_properties_4_0= ruleCommonProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2136:3: lv_properties_4_0= ruleCommonProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getTableDefinitionAccess().getPropertiesCommonPropertiesParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCommonProperties_in_ruleTableDefinition4615);
                    lv_properties_4_0=ruleCommonProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTableDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"properties",
                            		lv_properties_4_0, 
                            		"CommonProperties");
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
    // $ANTLR end "ruleTableDefinition"


    // $ANTLR start "entryRuleInterchangeableDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2160:1: entryRuleInterchangeableDefinition returns [EObject current=null] : iv_ruleInterchangeableDefinition= ruleInterchangeableDefinition EOF ;
    public final EObject entryRuleInterchangeableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterchangeableDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2161:2: (iv_ruleInterchangeableDefinition= ruleInterchangeableDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2162:2: iv_ruleInterchangeableDefinition= ruleInterchangeableDefinition EOF
            {
             newCompositeNode(grammarAccess.getInterchangeableDefinitionRule()); 
            pushFollow(FOLLOW_ruleInterchangeableDefinition_in_entryRuleInterchangeableDefinition4652);
            iv_ruleInterchangeableDefinition=ruleInterchangeableDefinition();

            state._fsp--;

             current =iv_ruleInterchangeableDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterchangeableDefinition4662); 

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
    // $ANTLR end "entryRuleInterchangeableDefinition"


    // $ANTLR start "ruleInterchangeableDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2169:1: ruleInterchangeableDefinition returns [EObject current=null] : ( ( (lv_name_0_0= 'Interchangeable Area' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleCommonProperties ) )? ) ;
    public final EObject ruleInterchangeableDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2172:28: ( ( ( (lv_name_0_0= 'Interchangeable Area' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleCommonProperties ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2173:1: ( ( (lv_name_0_0= 'Interchangeable Area' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleCommonProperties ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2173:1: ( ( (lv_name_0_0= 'Interchangeable Area' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleCommonProperties ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2173:2: ( (lv_name_0_0= 'Interchangeable Area' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleCommonProperties ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2173:2: ( (lv_name_0_0= 'Interchangeable Area' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2174:1: (lv_name_0_0= 'Interchangeable Area' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2174:1: (lv_name_0_0= 'Interchangeable Area' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2175:3: lv_name_0_0= 'Interchangeable Area'
            {
            lv_name_0_0=(Token)match(input,34,FOLLOW_34_in_ruleInterchangeableDefinition4705); 

                    newLeafNode(lv_name_0_0, grammarAccess.getInterchangeableDefinitionAccess().getNameInterchangeableAreaKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInterchangeableDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Interchangeable Area");
            	    

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleInterchangeableDefinition4730); 

                	newLeafNode(otherlv_1, grammarAccess.getInterchangeableDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2192:1: ( (lv_id_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2193:1: (lv_id_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2193:1: (lv_id_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2194:3: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInterchangeableDefinition4747); 

            			newLeafNode(lv_id_2_0, grammarAccess.getInterchangeableDefinitionAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInterchangeableDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2210:2: ( (lv_properties_3_0= ruleCommonProperties ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==40) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2211:1: (lv_properties_3_0= ruleCommonProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2211:1: (lv_properties_3_0= ruleCommonProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2212:3: lv_properties_3_0= ruleCommonProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getInterchangeableDefinitionAccess().getPropertiesCommonPropertiesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCommonProperties_in_ruleInterchangeableDefinition4773);
                    lv_properties_3_0=ruleCommonProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInterchangeableDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"properties",
                            		lv_properties_3_0, 
                            		"CommonProperties");
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
    // $ANTLR end "ruleInterchangeableDefinition"


    // $ANTLR start "entryRuleButtonDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2236:1: entryRuleButtonDefinition returns [EObject current=null] : iv_ruleButtonDefinition= ruleButtonDefinition EOF ;
    public final EObject entryRuleButtonDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2237:2: (iv_ruleButtonDefinition= ruleButtonDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2238:2: iv_ruleButtonDefinition= ruleButtonDefinition EOF
            {
             newCompositeNode(grammarAccess.getButtonDefinitionRule()); 
            pushFollow(FOLLOW_ruleButtonDefinition_in_entryRuleButtonDefinition4810);
            iv_ruleButtonDefinition=ruleButtonDefinition();

            state._fsp--;

             current =iv_ruleButtonDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonDefinition4820); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2245:1: ruleButtonDefinition returns [EObject current=null] : ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleButtonProperties ) )? ) ;
    public final EObject ruleButtonDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2248:28: ( ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleButtonProperties ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2249:1: ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleButtonProperties ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2249:1: ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleButtonProperties ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2249:2: ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleButtonProperties ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2249:2: ( (lv_name_0_0= 'Button' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2250:1: (lv_name_0_0= 'Button' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2250:1: (lv_name_0_0= 'Button' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2251:3: lv_name_0_0= 'Button'
            {
            lv_name_0_0=(Token)match(input,31,FOLLOW_31_in_ruleButtonDefinition4863); 

                    newLeafNode(lv_name_0_0, grammarAccess.getButtonDefinitionAccess().getNameButtonKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getButtonDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Button");
            	    

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleButtonDefinition4888); 

                	newLeafNode(otherlv_1, grammarAccess.getButtonDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2268:1: ( (lv_id_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2269:1: (lv_id_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2269:1: (lv_id_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2270:3: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleButtonDefinition4905); 

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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2286:2: ( (lv_properties_3_0= ruleButtonProperties ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==40) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2287:1: (lv_properties_3_0= ruleButtonProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2287:1: (lv_properties_3_0= ruleButtonProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2288:3: lv_properties_3_0= ruleButtonProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getButtonDefinitionAccess().getPropertiesButtonPropertiesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleButtonProperties_in_ruleButtonDefinition4931);
                    lv_properties_3_0=ruleButtonProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getButtonDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"properties",
                            		lv_properties_3_0, 
                            		"ButtonProperties");
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


    // $ANTLR start "entryRuleLabelDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2312:1: entryRuleLabelDefinition returns [EObject current=null] : iv_ruleLabelDefinition= ruleLabelDefinition EOF ;
    public final EObject entryRuleLabelDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2313:2: (iv_ruleLabelDefinition= ruleLabelDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2314:2: iv_ruleLabelDefinition= ruleLabelDefinition EOF
            {
             newCompositeNode(grammarAccess.getLabelDefinitionRule()); 
            pushFollow(FOLLOW_ruleLabelDefinition_in_entryRuleLabelDefinition4968);
            iv_ruleLabelDefinition=ruleLabelDefinition();

            state._fsp--;

             current =iv_ruleLabelDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelDefinition4978); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2321:1: ruleLabelDefinition returns [EObject current=null] : ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleLabelProperties ) )? ) ;
    public final EObject ruleLabelDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2324:28: ( ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleLabelProperties ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2325:1: ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleLabelProperties ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2325:1: ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleLabelProperties ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2325:2: ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleLabelProperties ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2325:2: ( (lv_name_0_0= 'Label' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2326:1: (lv_name_0_0= 'Label' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2326:1: (lv_name_0_0= 'Label' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2327:3: lv_name_0_0= 'Label'
            {
            lv_name_0_0=(Token)match(input,32,FOLLOW_32_in_ruleLabelDefinition5021); 

                    newLeafNode(lv_name_0_0, grammarAccess.getLabelDefinitionAccess().getNameLabelKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Label");
            	    

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleLabelDefinition5046); 

                	newLeafNode(otherlv_1, grammarAccess.getLabelDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2344:1: ( (lv_id_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2345:1: (lv_id_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2345:1: (lv_id_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2346:3: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabelDefinition5063); 

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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2362:2: ( (lv_properties_3_0= ruleLabelProperties ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==40) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2363:1: (lv_properties_3_0= ruleLabelProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2363:1: (lv_properties_3_0= ruleLabelProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2364:3: lv_properties_3_0= ruleLabelProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getLabelDefinitionAccess().getPropertiesLabelPropertiesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLabelProperties_in_ruleLabelDefinition5089);
                    lv_properties_3_0=ruleLabelProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLabelDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"properties",
                            		lv_properties_3_0, 
                            		"LabelProperties");
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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2388:1: entryRuleInteractiontype returns [EObject current=null] : iv_ruleInteractiontype= ruleInteractiontype EOF ;
    public final EObject entryRuleInteractiontype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractiontype = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2389:2: (iv_ruleInteractiontype= ruleInteractiontype EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2390:2: iv_ruleInteractiontype= ruleInteractiontype EOF
            {
             newCompositeNode(grammarAccess.getInteractiontypeRule()); 
            pushFollow(FOLLOW_ruleInteractiontype_in_entryRuleInteractiontype5126);
            iv_ruleInteractiontype=ruleInteractiontype();

            state._fsp--;

             current =iv_ruleInteractiontype; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractiontype5136); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2397:1: ruleInteractiontype returns [EObject current=null] : ( ( (lv_id_0_1= 'IfActivator' | lv_id_0_2= 'IfTextDisplay' | lv_id_0_3= 'IfViewImage' ) ) ) ;
    public final EObject ruleInteractiontype() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_1=null;
        Token lv_id_0_2=null;
        Token lv_id_0_3=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2400:28: ( ( ( (lv_id_0_1= 'IfActivator' | lv_id_0_2= 'IfTextDisplay' | lv_id_0_3= 'IfViewImage' ) ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2401:1: ( ( (lv_id_0_1= 'IfActivator' | lv_id_0_2= 'IfTextDisplay' | lv_id_0_3= 'IfViewImage' ) ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2401:1: ( ( (lv_id_0_1= 'IfActivator' | lv_id_0_2= 'IfTextDisplay' | lv_id_0_3= 'IfViewImage' ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2402:1: ( (lv_id_0_1= 'IfActivator' | lv_id_0_2= 'IfTextDisplay' | lv_id_0_3= 'IfViewImage' ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2402:1: ( (lv_id_0_1= 'IfActivator' | lv_id_0_2= 'IfTextDisplay' | lv_id_0_3= 'IfViewImage' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2403:1: (lv_id_0_1= 'IfActivator' | lv_id_0_2= 'IfTextDisplay' | lv_id_0_3= 'IfViewImage' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2403:1: (lv_id_0_1= 'IfActivator' | lv_id_0_2= 'IfTextDisplay' | lv_id_0_3= 'IfViewImage' )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt37=1;
                }
                break;
            case 36:
                {
                alt37=2;
                }
                break;
            case 37:
                {
                alt37=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2404:3: lv_id_0_1= 'IfActivator'
                    {
                    lv_id_0_1=(Token)match(input,35,FOLLOW_35_in_ruleInteractiontype5180); 

                            newLeafNode(lv_id_0_1, grammarAccess.getInteractiontypeAccess().getIdIfActivatorKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInteractiontypeRule());
                    	        }
                           		setWithLastConsumed(current, "id", lv_id_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2416:8: lv_id_0_2= 'IfTextDisplay'
                    {
                    lv_id_0_2=(Token)match(input,36,FOLLOW_36_in_ruleInteractiontype5209); 

                            newLeafNode(lv_id_0_2, grammarAccess.getInteractiontypeAccess().getIdIfTextDisplayKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInteractiontypeRule());
                    	        }
                           		setWithLastConsumed(current, "id", lv_id_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2428:8: lv_id_0_3= 'IfViewImage'
                    {
                    lv_id_0_3=(Token)match(input,37,FOLLOW_37_in_ruleInteractiontype5238); 

                            newLeafNode(lv_id_0_3, grammarAccess.getInteractiontypeAccess().getIdIfViewImageKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInteractiontypeRule());
                    	        }
                           		setWithLastConsumed(current, "id", lv_id_0_3, null);
                    	    

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


    // $ANTLR start "entryRuleTextareaProperties"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2451:1: entryRuleTextareaProperties returns [EObject current=null] : iv_ruleTextareaProperties= ruleTextareaProperties EOF ;
    public final EObject entryRuleTextareaProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextareaProperties = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2452:2: (iv_ruleTextareaProperties= ruleTextareaProperties EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2453:2: iv_ruleTextareaProperties= ruleTextareaProperties EOF
            {
             newCompositeNode(grammarAccess.getTextareaPropertiesRule()); 
            pushFollow(FOLLOW_ruleTextareaProperties_in_entryRuleTextareaProperties5289);
            iv_ruleTextareaProperties=ruleTextareaProperties();

            state._fsp--;

             current =iv_ruleTextareaProperties; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextareaProperties5299); 

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
    // $ANTLR end "entryRuleTextareaProperties"


    // $ANTLR start "ruleTextareaProperties"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2460:1: ruleTextareaProperties returns [EObject current=null] : ( ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )? (otherlv_3= 'editable=' ( (lv_editable_4_0= RULE_BOOLEAN ) ) )? ) ;
    public final EObject ruleTextareaProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_text_2_0=null;
        Token otherlv_3=null;
        Token lv_editable_4_0=null;
        EObject lv_commonProperties_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2463:28: ( ( ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )? (otherlv_3= 'editable=' ( (lv_editable_4_0= RULE_BOOLEAN ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2464:1: ( ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )? (otherlv_3= 'editable=' ( (lv_editable_4_0= RULE_BOOLEAN ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2464:1: ( ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )? (otherlv_3= 'editable=' ( (lv_editable_4_0= RULE_BOOLEAN ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2464:2: ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )? (otherlv_3= 'editable=' ( (lv_editable_4_0= RULE_BOOLEAN ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2464:2: ( (lv_commonProperties_0_0= ruleCommonProperties ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2465:1: (lv_commonProperties_0_0= ruleCommonProperties )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2465:1: (lv_commonProperties_0_0= ruleCommonProperties )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2466:3: lv_commonProperties_0_0= ruleCommonProperties
            {
             
            	        newCompositeNode(grammarAccess.getTextareaPropertiesAccess().getCommonPropertiesCommonPropertiesParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCommonProperties_in_ruleTextareaProperties5345);
            lv_commonProperties_0_0=ruleCommonProperties();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTextareaPropertiesRule());
            	        }
                   		set(
                   			current, 
                   			"commonProperties",
                    		lv_commonProperties_0_0, 
                    		"CommonProperties");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2482:2: (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==38) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2482:4: otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleTextareaProperties5358); 

                        	newLeafNode(otherlv_1, grammarAccess.getTextareaPropertiesAccess().getTextKeyword_1_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2486:1: ( (lv_text_2_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2487:1: (lv_text_2_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2487:1: (lv_text_2_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2488:3: lv_text_2_0= RULE_STRING
                    {
                    lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextareaProperties5375); 

                    			newLeafNode(lv_text_2_0, grammarAccess.getTextareaPropertiesAccess().getTextSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTextareaPropertiesRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"text",
                            		lv_text_2_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2504:4: (otherlv_3= 'editable=' ( (lv_editable_4_0= RULE_BOOLEAN ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==39) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2504:6: otherlv_3= 'editable=' ( (lv_editable_4_0= RULE_BOOLEAN ) )
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleTextareaProperties5395); 

                        	newLeafNode(otherlv_3, grammarAccess.getTextareaPropertiesAccess().getEditableKeyword_2_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2508:1: ( (lv_editable_4_0= RULE_BOOLEAN ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2509:1: (lv_editable_4_0= RULE_BOOLEAN )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2509:1: (lv_editable_4_0= RULE_BOOLEAN )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2510:3: lv_editable_4_0= RULE_BOOLEAN
                    {
                    lv_editable_4_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleTextareaProperties5412); 

                    			newLeafNode(lv_editable_4_0, grammarAccess.getTextareaPropertiesAccess().getEditableBOOLEANTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTextareaPropertiesRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"editable",
                            		lv_editable_4_0, 
                            		"BOOLEAN");
                    	    

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
    // $ANTLR end "ruleTextareaProperties"


    // $ANTLR start "entryRuleTextfieldProperties"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2534:1: entryRuleTextfieldProperties returns [EObject current=null] : iv_ruleTextfieldProperties= ruleTextfieldProperties EOF ;
    public final EObject entryRuleTextfieldProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextfieldProperties = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2535:2: (iv_ruleTextfieldProperties= ruleTextfieldProperties EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2536:2: iv_ruleTextfieldProperties= ruleTextfieldProperties EOF
            {
             newCompositeNode(grammarAccess.getTextfieldPropertiesRule()); 
            pushFollow(FOLLOW_ruleTextfieldProperties_in_entryRuleTextfieldProperties5455);
            iv_ruleTextfieldProperties=ruleTextfieldProperties();

            state._fsp--;

             current =iv_ruleTextfieldProperties; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextfieldProperties5465); 

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
    // $ANTLR end "entryRuleTextfieldProperties"


    // $ANTLR start "ruleTextfieldProperties"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2543:1: ruleTextfieldProperties returns [EObject current=null] : ( ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )? (otherlv_3= 'editable=' ( (lv_editable_4_0= RULE_BOOLEAN ) ) )? ) ;
    public final EObject ruleTextfieldProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_text_2_0=null;
        Token otherlv_3=null;
        Token lv_editable_4_0=null;
        EObject lv_commonProperties_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2546:28: ( ( ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )? (otherlv_3= 'editable=' ( (lv_editable_4_0= RULE_BOOLEAN ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2547:1: ( ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )? (otherlv_3= 'editable=' ( (lv_editable_4_0= RULE_BOOLEAN ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2547:1: ( ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )? (otherlv_3= 'editable=' ( (lv_editable_4_0= RULE_BOOLEAN ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2547:2: ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )? (otherlv_3= 'editable=' ( (lv_editable_4_0= RULE_BOOLEAN ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2547:2: ( (lv_commonProperties_0_0= ruleCommonProperties ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2548:1: (lv_commonProperties_0_0= ruleCommonProperties )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2548:1: (lv_commonProperties_0_0= ruleCommonProperties )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2549:3: lv_commonProperties_0_0= ruleCommonProperties
            {
             
            	        newCompositeNode(grammarAccess.getTextfieldPropertiesAccess().getCommonPropertiesCommonPropertiesParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCommonProperties_in_ruleTextfieldProperties5511);
            lv_commonProperties_0_0=ruleCommonProperties();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTextfieldPropertiesRule());
            	        }
                   		set(
                   			current, 
                   			"commonProperties",
                    		lv_commonProperties_0_0, 
                    		"CommonProperties");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2565:2: (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==38) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2565:4: otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleTextfieldProperties5524); 

                        	newLeafNode(otherlv_1, grammarAccess.getTextfieldPropertiesAccess().getTextKeyword_1_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2569:1: ( (lv_text_2_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2570:1: (lv_text_2_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2570:1: (lv_text_2_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2571:3: lv_text_2_0= RULE_STRING
                    {
                    lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextfieldProperties5541); 

                    			newLeafNode(lv_text_2_0, grammarAccess.getTextfieldPropertiesAccess().getTextSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTextfieldPropertiesRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"text",
                            		lv_text_2_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2587:4: (otherlv_3= 'editable=' ( (lv_editable_4_0= RULE_BOOLEAN ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==39) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2587:6: otherlv_3= 'editable=' ( (lv_editable_4_0= RULE_BOOLEAN ) )
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleTextfieldProperties5561); 

                        	newLeafNode(otherlv_3, grammarAccess.getTextfieldPropertiesAccess().getEditableKeyword_2_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2591:1: ( (lv_editable_4_0= RULE_BOOLEAN ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2592:1: (lv_editable_4_0= RULE_BOOLEAN )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2592:1: (lv_editable_4_0= RULE_BOOLEAN )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2593:3: lv_editable_4_0= RULE_BOOLEAN
                    {
                    lv_editable_4_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleTextfieldProperties5578); 

                    			newLeafNode(lv_editable_4_0, grammarAccess.getTextfieldPropertiesAccess().getEditableBOOLEANTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTextfieldPropertiesRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"editable",
                            		lv_editable_4_0, 
                            		"BOOLEAN");
                    	    

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
    // $ANTLR end "ruleTextfieldProperties"


    // $ANTLR start "entryRuleLabelProperties"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2617:1: entryRuleLabelProperties returns [EObject current=null] : iv_ruleLabelProperties= ruleLabelProperties EOF ;
    public final EObject entryRuleLabelProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelProperties = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2618:2: (iv_ruleLabelProperties= ruleLabelProperties EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2619:2: iv_ruleLabelProperties= ruleLabelProperties EOF
            {
             newCompositeNode(grammarAccess.getLabelPropertiesRule()); 
            pushFollow(FOLLOW_ruleLabelProperties_in_entryRuleLabelProperties5621);
            iv_ruleLabelProperties=ruleLabelProperties();

            state._fsp--;

             current =iv_ruleLabelProperties; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelProperties5631); 

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
    // $ANTLR end "entryRuleLabelProperties"


    // $ANTLR start "ruleLabelProperties"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2626:1: ruleLabelProperties returns [EObject current=null] : ( ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleLabelProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_text_2_0=null;
        EObject lv_commonProperties_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2629:28: ( ( ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2630:1: ( ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2630:1: ( ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2630:2: ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2630:2: ( (lv_commonProperties_0_0= ruleCommonProperties ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2631:1: (lv_commonProperties_0_0= ruleCommonProperties )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2631:1: (lv_commonProperties_0_0= ruleCommonProperties )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2632:3: lv_commonProperties_0_0= ruleCommonProperties
            {
             
            	        newCompositeNode(grammarAccess.getLabelPropertiesAccess().getCommonPropertiesCommonPropertiesParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCommonProperties_in_ruleLabelProperties5677);
            lv_commonProperties_0_0=ruleCommonProperties();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLabelPropertiesRule());
            	        }
                   		set(
                   			current, 
                   			"commonProperties",
                    		lv_commonProperties_0_0, 
                    		"CommonProperties");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2648:2: (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==38) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2648:4: otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleLabelProperties5690); 

                        	newLeafNode(otherlv_1, grammarAccess.getLabelPropertiesAccess().getTextKeyword_1_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2652:1: ( (lv_text_2_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2653:1: (lv_text_2_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2653:1: (lv_text_2_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2654:3: lv_text_2_0= RULE_STRING
                    {
                    lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabelProperties5707); 

                    			newLeafNode(lv_text_2_0, grammarAccess.getLabelPropertiesAccess().getTextSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelPropertiesRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"text",
                            		lv_text_2_0, 
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
    // $ANTLR end "ruleLabelProperties"


    // $ANTLR start "entryRuleButtonProperties"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2678:1: entryRuleButtonProperties returns [EObject current=null] : iv_ruleButtonProperties= ruleButtonProperties EOF ;
    public final EObject entryRuleButtonProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonProperties = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2679:2: (iv_ruleButtonProperties= ruleButtonProperties EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2680:2: iv_ruleButtonProperties= ruleButtonProperties EOF
            {
             newCompositeNode(grammarAccess.getButtonPropertiesRule()); 
            pushFollow(FOLLOW_ruleButtonProperties_in_entryRuleButtonProperties5750);
            iv_ruleButtonProperties=ruleButtonProperties();

            state._fsp--;

             current =iv_ruleButtonProperties; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonProperties5760); 

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
    // $ANTLR end "entryRuleButtonProperties"


    // $ANTLR start "ruleButtonProperties"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2687:1: ruleButtonProperties returns [EObject current=null] : ( ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleButtonProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_text_2_0=null;
        EObject lv_commonProperties_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2690:28: ( ( ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2691:1: ( ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2691:1: ( ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2691:2: ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2691:2: ( (lv_commonProperties_0_0= ruleCommonProperties ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2692:1: (lv_commonProperties_0_0= ruleCommonProperties )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2692:1: (lv_commonProperties_0_0= ruleCommonProperties )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2693:3: lv_commonProperties_0_0= ruleCommonProperties
            {
             
            	        newCompositeNode(grammarAccess.getButtonPropertiesAccess().getCommonPropertiesCommonPropertiesParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCommonProperties_in_ruleButtonProperties5806);
            lv_commonProperties_0_0=ruleCommonProperties();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getButtonPropertiesRule());
            	        }
                   		set(
                   			current, 
                   			"commonProperties",
                    		lv_commonProperties_0_0, 
                    		"CommonProperties");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2709:2: (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==38) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2709:4: otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleButtonProperties5819); 

                        	newLeafNode(otherlv_1, grammarAccess.getButtonPropertiesAccess().getTextKeyword_1_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2713:1: ( (lv_text_2_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2714:1: (lv_text_2_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2714:1: (lv_text_2_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2715:3: lv_text_2_0= RULE_STRING
                    {
                    lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleButtonProperties5836); 

                    			newLeafNode(lv_text_2_0, grammarAccess.getButtonPropertiesAccess().getTextSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getButtonPropertiesRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"text",
                            		lv_text_2_0, 
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
    // $ANTLR end "ruleButtonProperties"


    // $ANTLR start "entryRuleCommonProperties"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2739:1: entryRuleCommonProperties returns [EObject current=null] : iv_ruleCommonProperties= ruleCommonProperties EOF ;
    public final EObject entryRuleCommonProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonProperties = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2740:2: (iv_ruleCommonProperties= ruleCommonProperties EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2741:2: iv_ruleCommonProperties= ruleCommonProperties EOF
            {
             newCompositeNode(grammarAccess.getCommonPropertiesRule()); 
            pushFollow(FOLLOW_ruleCommonProperties_in_entryRuleCommonProperties5879);
            iv_ruleCommonProperties=ruleCommonProperties();

            state._fsp--;

             current =iv_ruleCommonProperties; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonProperties5889); 

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
    // $ANTLR end "entryRuleCommonProperties"


    // $ANTLR start "ruleCommonProperties"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2748:1: ruleCommonProperties returns [EObject current=null] : (otherlv_0= '->' (otherlv_1= 'propertyKey' otherlv_2= '=' ( (lv_propertyKey_3_0= RULE_STRING ) ) )? (otherlv_4= 'layoutKey' otherlv_5= '=' ( (lv_layoutKey_6_0= RULE_STRING ) ) )? (otherlv_7= 'interactiontype' otherlv_8= '=' ( (lv_interactiontype_9_0= ruleInteractiontype ) )+ )? ) ;
    public final EObject ruleCommonProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_propertyKey_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_layoutKey_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_interactiontype_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2751:28: ( (otherlv_0= '->' (otherlv_1= 'propertyKey' otherlv_2= '=' ( (lv_propertyKey_3_0= RULE_STRING ) ) )? (otherlv_4= 'layoutKey' otherlv_5= '=' ( (lv_layoutKey_6_0= RULE_STRING ) ) )? (otherlv_7= 'interactiontype' otherlv_8= '=' ( (lv_interactiontype_9_0= ruleInteractiontype ) )+ )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2752:1: (otherlv_0= '->' (otherlv_1= 'propertyKey' otherlv_2= '=' ( (lv_propertyKey_3_0= RULE_STRING ) ) )? (otherlv_4= 'layoutKey' otherlv_5= '=' ( (lv_layoutKey_6_0= RULE_STRING ) ) )? (otherlv_7= 'interactiontype' otherlv_8= '=' ( (lv_interactiontype_9_0= ruleInteractiontype ) )+ )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2752:1: (otherlv_0= '->' (otherlv_1= 'propertyKey' otherlv_2= '=' ( (lv_propertyKey_3_0= RULE_STRING ) ) )? (otherlv_4= 'layoutKey' otherlv_5= '=' ( (lv_layoutKey_6_0= RULE_STRING ) ) )? (otherlv_7= 'interactiontype' otherlv_8= '=' ( (lv_interactiontype_9_0= ruleInteractiontype ) )+ )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2752:3: otherlv_0= '->' (otherlv_1= 'propertyKey' otherlv_2= '=' ( (lv_propertyKey_3_0= RULE_STRING ) ) )? (otherlv_4= 'layoutKey' otherlv_5= '=' ( (lv_layoutKey_6_0= RULE_STRING ) ) )? (otherlv_7= 'interactiontype' otherlv_8= '=' ( (lv_interactiontype_9_0= ruleInteractiontype ) )+ )?
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleCommonProperties5926); 

                	newLeafNode(otherlv_0, grammarAccess.getCommonPropertiesAccess().getHyphenMinusGreaterThanSignKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2756:1: (otherlv_1= 'propertyKey' otherlv_2= '=' ( (lv_propertyKey_3_0= RULE_STRING ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==41) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2756:3: otherlv_1= 'propertyKey' otherlv_2= '=' ( (lv_propertyKey_3_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleCommonProperties5939); 

                        	newLeafNode(otherlv_1, grammarAccess.getCommonPropertiesAccess().getPropertyKeyKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleCommonProperties5951); 

                        	newLeafNode(otherlv_2, grammarAccess.getCommonPropertiesAccess().getEqualsSignKeyword_1_1());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2764:1: ( (lv_propertyKey_3_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2765:1: (lv_propertyKey_3_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2765:1: (lv_propertyKey_3_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2766:3: lv_propertyKey_3_0= RULE_STRING
                    {
                    lv_propertyKey_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCommonProperties5968); 

                    			newLeafNode(lv_propertyKey_3_0, grammarAccess.getCommonPropertiesAccess().getPropertyKeySTRINGTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCommonPropertiesRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"propertyKey",
                            		lv_propertyKey_3_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2782:4: (otherlv_4= 'layoutKey' otherlv_5= '=' ( (lv_layoutKey_6_0= RULE_STRING ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==43) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2782:6: otherlv_4= 'layoutKey' otherlv_5= '=' ( (lv_layoutKey_6_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleCommonProperties5988); 

                        	newLeafNode(otherlv_4, grammarAccess.getCommonPropertiesAccess().getLayoutKeyKeyword_2_0());
                        
                    otherlv_5=(Token)match(input,42,FOLLOW_42_in_ruleCommonProperties6000); 

                        	newLeafNode(otherlv_5, grammarAccess.getCommonPropertiesAccess().getEqualsSignKeyword_2_1());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2790:1: ( (lv_layoutKey_6_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2791:1: (lv_layoutKey_6_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2791:1: (lv_layoutKey_6_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2792:3: lv_layoutKey_6_0= RULE_STRING
                    {
                    lv_layoutKey_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCommonProperties6017); 

                    			newLeafNode(lv_layoutKey_6_0, grammarAccess.getCommonPropertiesAccess().getLayoutKeySTRINGTerminalRuleCall_2_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCommonPropertiesRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"layoutKey",
                            		lv_layoutKey_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2808:4: (otherlv_7= 'interactiontype' otherlv_8= '=' ( (lv_interactiontype_9_0= ruleInteractiontype ) )+ )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==44) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2808:6: otherlv_7= 'interactiontype' otherlv_8= '=' ( (lv_interactiontype_9_0= ruleInteractiontype ) )+
                    {
                    otherlv_7=(Token)match(input,44,FOLLOW_44_in_ruleCommonProperties6037); 

                        	newLeafNode(otherlv_7, grammarAccess.getCommonPropertiesAccess().getInteractiontypeKeyword_3_0());
                        
                    otherlv_8=(Token)match(input,42,FOLLOW_42_in_ruleCommonProperties6049); 

                        	newLeafNode(otherlv_8, grammarAccess.getCommonPropertiesAccess().getEqualsSignKeyword_3_1());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2816:1: ( (lv_interactiontype_9_0= ruleInteractiontype ) )+
                    int cnt46=0;
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( ((LA46_0>=35 && LA46_0<=37)) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2817:1: (lv_interactiontype_9_0= ruleInteractiontype )
                    	    {
                    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2817:1: (lv_interactiontype_9_0= ruleInteractiontype )
                    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2818:3: lv_interactiontype_9_0= ruleInteractiontype
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCommonPropertiesAccess().getInteractiontypeInteractiontypeParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInteractiontype_in_ruleCommonProperties6070);
                    	    lv_interactiontype_9_0=ruleInteractiontype();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCommonPropertiesRule());
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
                    	    if ( cnt46 >= 1 ) break loop46;
                                EarlyExitException eee =
                                    new EarlyExitException(46, input);
                                throw eee;
                        }
                        cnt46++;
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
    // $ANTLR end "ruleCommonProperties"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\15\uffff";
    static final String DFA4_eofS =
        "\15\uffff";
    static final String DFA4_minS =
        "\1\26\4\25\2\5\1\6\2\uffff\2\25\1\6";
    static final String DFA4_maxS =
        "\1\42\7\31\2\uffff\3\31";
    static final String DFA4_acceptS =
        "\10\uffff\1\2\1\1\3\uffff";
    static final String DFA4_specialS =
        "\15\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\10\1\uffff\1\6\1\uffff\1\7\1\5\1\11\1\4\1\3\1\2\1\1\1\uffff"+
            "\1\10",
            "\1\10\3\uffff\1\11",
            "\1\10\3\uffff\1\11",
            "\1\10\3\uffff\1\11",
            "\1\10\3\uffff\1\11",
            "\1\12\17\uffff\1\10\3\uffff\1\11",
            "\1\13\17\uffff\1\10\3\uffff\1\11",
            "\1\14\16\uffff\1\10\3\uffff\1\11",
            "",
            "",
            "\1\10\3\uffff\1\11",
            "\1\10\3\uffff\1\11",
            "\1\10\16\uffff\1\10\3\uffff\1\11"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "()* loopback of 152:3: ( (lv_refinements_4_0= ruleRefinement ) )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleUIDescription_in_entryRuleUIDescription75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIDescription85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleUIDescription131 = new BitSet(new long[]{0x00000005FD5C0000L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleUIDescription152 = new BitSet(new long[]{0x00000005FD5C0000L});
    public static final BitSet FOLLOW_ruleLayout_in_ruleUIDescription174 = new BitSet(new long[]{0x00000005FD5C0000L});
    public static final BitSet FOLLOW_ruleUsedDescriptions_in_ruleUIDescription196 = new BitSet(new long[]{0x00000005FD5C0000L});
    public static final BitSet FOLLOW_ruleRefinement_in_ruleUIDescription218 = new BitSet(new long[]{0x00000005FD5C0000L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleUIDescription240 = new BitSet(new long[]{0x00000005FD5C0000L});
    public static final BitSet FOLLOW_ruleStructure_in_ruleUIDescription262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleTypeDefinition345 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypeDefinition366 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTypeDefinition378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleType468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleType497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleProperty595 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProperty612 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleProperty630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayout_in_entryRuleLayout666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayout676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleLayout713 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLayout730 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleLayout748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsedDescriptions_in_entryRuleUsedDescriptions784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsedDescriptions794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleUsedDescriptions831 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_ruleDescriptionType_in_ruleUsedDescriptions852 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_21_in_ruleUsedDescriptions865 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUsedDescriptions882 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleUsedDescriptions901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescriptionType_in_entryRuleDescriptionType937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescriptionType947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIDescriptionImport_in_ruleDescriptionType994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexComponent_in_ruleDescriptionType1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexComponent_in_entryRuleComplexComponent1056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexComponent1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiselection_in_ruleComplexComponent1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIDescriptionImport_in_entryRuleUIDescriptionImport1146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIDescriptionImport1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUIDescriptionImport1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefinement_in_entryRuleRefinement1237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefinement1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentRefinement_in_ruleRefinement1293 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRefinement1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentRefinement_in_entryRuleComponentRefinement1341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentRefinement1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelRefinement_in_ruleComponentRefinement1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonRefinement_in_ruleComponentRefinement1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfieldRefinement_in_ruleComponentRefinement1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextareaRefinement_in_ruleComponentRefinement1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableRefinement_in_ruleComponentRefinement1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabViewRefinement_in_ruleComponentRefinement1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreeRefinement_in_ruleComponentRefinement1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterchangeableRefinement_in_ruleComponentRefinement1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition1622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDefinition_in_ruleDefinition1678 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDefinition1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDefinition_in_entryRuleComponentDefinition1726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentDefinition1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelDefinition_in_ruleComponentDefinition1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonDefinition_in_ruleComponentDefinition1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfieldDefinition_in_ruleComponentDefinition1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextareaDefinition_in_ruleComponentDefinition1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreeDefinition_in_ruleComponentDefinition1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableDefinition_in_ruleComponentDefinition1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabViewDefinition_in_ruleComponentDefinition1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterchangeableDefinition_in_ruleComponentDefinition1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructure_in_entryRuleStructure2007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructure2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleStructure2060 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleStructure2085 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleElement_in_ruleStructure2106 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleStructure2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement2155 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleElement2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableRefinement_in_entryRuleTableRefinement2246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableRefinement2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTableRefinement2299 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_RULE_INPUT_DESCRIPTION_in_ruleTableRefinement2329 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTableRefinement2347 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTableRefinement2364 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_ruleTableRefinement2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabViewRefinement_in_entryRuleTabViewRefinement2427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabViewRefinement2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTabViewRefinement2480 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_ruleTabDefinition_in_ruleTabViewRefinement2514 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTabViewRefinement2527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTabViewRefinement2544 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_ruleTabViewRefinement2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreeRefinement_in_entryRuleTreeRefinement2607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTreeRefinement2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleTreeRefinement2660 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_RULE_INPUT_DESCRIPTION_in_ruleTreeRefinement2690 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTreeRefinement2708 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTreeRefinement2725 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_ruleTreeRefinement2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterchangeableRefinement_in_entryRuleInterchangeableRefinement2788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterchangeableRefinement2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleInterchangeableRefinement2841 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleInterchangeableRefinement2866 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInterchangeableRefinement2883 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_ruleInterchangeableRefinement2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextareaRefinement_in_entryRuleTextareaRefinement2946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextareaRefinement2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleTextareaRefinement2999 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTextareaRefinement3024 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextareaRefinement3041 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleTextareaProperties_in_ruleTextareaRefinement3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfieldRefinement_in_entryRuleTextfieldRefinement3104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextfieldRefinement3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleTextfieldRefinement3157 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTextfieldRefinement3182 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextfieldRefinement3199 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleTextfieldProperties_in_ruleTextfieldRefinement3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonRefinement_in_entryRuleButtonRefinement3262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonRefinement3272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleButtonRefinement3315 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleButtonRefinement3340 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleButtonRefinement3357 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleButtonProperties_in_ruleButtonRefinement3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelRefinement_in_entryRuleLabelRefinement3420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelRefinement3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleLabelRefinement3473 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleLabelRefinement3498 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabelRefinement3515 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleLabelProperties_in_ruleLabelRefinement3541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabViewDefinition_in_entryRuleTabViewDefinition3578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabViewDefinition3588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTabViewDefinition3631 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_ruleTabDefinition_in_ruleTabViewDefinition3665 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_21_in_ruleTabViewDefinition3678 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTabViewDefinition3695 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_ruleTabViewDefinition3721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabDefinition_in_entryRuleTabDefinition3758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabDefinition3768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TABNAME_in_ruleTabDefinition3809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiselection_in_entryRuleMultiselection3849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiselection3859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleMultiselection3902 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_INPUT_DESCRIPTION_in_ruleMultiselection3932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfieldDefinition_in_entryRuleTextfieldDefinition3974 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextfieldDefinition3984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleTextfieldDefinition4027 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTextfieldDefinition4052 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextfieldDefinition4069 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleTextfieldProperties_in_ruleTextfieldDefinition4095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextareaDefinition_in_entryRuleTextareaDefinition4132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextareaDefinition4142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleTextareaDefinition4185 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTextareaDefinition4210 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextareaDefinition4227 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleTextareaProperties_in_ruleTextareaDefinition4253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreeDefinition_in_entryRuleTreeDefinition4290 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTreeDefinition4300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleTreeDefinition4343 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_RULE_INPUT_DESCRIPTION_in_ruleTreeDefinition4373 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTreeDefinition4391 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTreeDefinition4408 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_ruleTreeDefinition4434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableDefinition_in_entryRuleTableDefinition4471 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableDefinition4481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTableDefinition4524 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_RULE_INPUT_DESCRIPTION_in_ruleTableDefinition4554 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTableDefinition4572 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTableDefinition4589 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_ruleTableDefinition4615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterchangeableDefinition_in_entryRuleInterchangeableDefinition4652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterchangeableDefinition4662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleInterchangeableDefinition4705 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleInterchangeableDefinition4730 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInterchangeableDefinition4747 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_ruleInterchangeableDefinition4773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonDefinition_in_entryRuleButtonDefinition4810 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonDefinition4820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleButtonDefinition4863 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleButtonDefinition4888 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleButtonDefinition4905 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleButtonProperties_in_ruleButtonDefinition4931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelDefinition_in_entryRuleLabelDefinition4968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelDefinition4978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleLabelDefinition5021 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleLabelDefinition5046 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabelDefinition5063 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleLabelProperties_in_ruleLabelDefinition5089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractiontype_in_entryRuleInteractiontype5126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractiontype5136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleInteractiontype5180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleInteractiontype5209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleInteractiontype5238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextareaProperties_in_entryRuleTextareaProperties5289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextareaProperties5299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_ruleTextareaProperties5345 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_38_in_ruleTextareaProperties5358 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextareaProperties5375 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleTextareaProperties5395 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleTextareaProperties5412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfieldProperties_in_entryRuleTextfieldProperties5455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextfieldProperties5465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_ruleTextfieldProperties5511 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_38_in_ruleTextfieldProperties5524 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextfieldProperties5541 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleTextfieldProperties5561 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleTextfieldProperties5578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelProperties_in_entryRuleLabelProperties5621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelProperties5631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_ruleLabelProperties5677 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleLabelProperties5690 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabelProperties5707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonProperties_in_entryRuleButtonProperties5750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonProperties5760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_ruleButtonProperties5806 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleButtonProperties5819 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleButtonProperties5836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_entryRuleCommonProperties5879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonProperties5889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleCommonProperties5926 = new BitSet(new long[]{0x00001A0000000002L});
    public static final BitSet FOLLOW_41_in_ruleCommonProperties5939 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleCommonProperties5951 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCommonProperties5968 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_43_in_ruleCommonProperties5988 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleCommonProperties6000 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCommonProperties6017 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleCommonProperties6037 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleCommonProperties6049 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_ruleInteractiontype_in_ruleCommonProperties6070 = new BitSet(new long[]{0x0000003800000002L});

}