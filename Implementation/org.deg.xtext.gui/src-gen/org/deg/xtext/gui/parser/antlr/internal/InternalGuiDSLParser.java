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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_TABNAME", "RULE_INPUT_DESCRIPTION", "RULE_BOOLEAN", "RULE_WS", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'get layout from:'", "';'", "'Structure'", "':'", "'Button'", "'from:'", "'->'", "'Label'", "'get properties from:'", "'use:'", "'as:'", "'type: '", "'WINDOW'", "'INNERCOMPLEX'", "'TabView'", "'Multiselection'", "'Textfield'", "'text='", "'editable='", "'Textarea'", "'Tree'", "'Table'", "'Interchangeable Area'", "'propertyKey'", "'='", "'layoutKey'", "'interactiontype'", "'as'", "'LabelProperty'", "'IfActivator'", "'IfTextDisplay'"
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
    public static final int RULE_INPUT_DESCRIPTION=6;
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
    public static final int RULE_TABNAME=5;
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

            if ( (LA1_0==22) ) {
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

            if ( (LA2_0==14) ) {
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

                if ( (LA3_0==23) ) {
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
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==19) ) {
                        alt4=1;
                    }


                }
                else if ( (LA4_0==18) ) {
                    int LA4_2 = input.LA(2);

                    if ( (LA4_2==19) ) {
                        alt4=1;
                    }


                }


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

                if ( (LA5_0==18||LA5_0==21||LA5_0==28||LA5_0==30||(LA5_0>=33 && LA5_0<=36)) ) {
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


    // $ANTLR start "entryRuleLayout"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:214:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:215:2: (iv_ruleLayout= ruleLayout EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:216:2: iv_ruleLayout= ruleLayout EOF
            {
             newCompositeNode(grammarAccess.getLayoutRule()); 
            pushFollow(FOLLOW_ruleLayout_in_entryRuleLayout298);
            iv_ruleLayout=ruleLayout();

            state._fsp--;

             current =iv_ruleLayout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayout308); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:223:1: ruleLayout returns [EObject current=null] : (otherlv_0= 'get layout from:' ( (lv_layoutFiles_1_0= RULE_STRING ) )+ otherlv_2= ';' ) ;
    public final EObject ruleLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_layoutFiles_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:226:28: ( (otherlv_0= 'get layout from:' ( (lv_layoutFiles_1_0= RULE_STRING ) )+ otherlv_2= ';' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:227:1: (otherlv_0= 'get layout from:' ( (lv_layoutFiles_1_0= RULE_STRING ) )+ otherlv_2= ';' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:227:1: (otherlv_0= 'get layout from:' ( (lv_layoutFiles_1_0= RULE_STRING ) )+ otherlv_2= ';' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:227:3: otherlv_0= 'get layout from:' ( (lv_layoutFiles_1_0= RULE_STRING ) )+ otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleLayout345); 

                	newLeafNode(otherlv_0, grammarAccess.getLayoutAccess().getGetLayoutFromKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:231:1: ( (lv_layoutFiles_1_0= RULE_STRING ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:232:1: (lv_layoutFiles_1_0= RULE_STRING )
            	    {
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:232:1: (lv_layoutFiles_1_0= RULE_STRING )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:233:3: lv_layoutFiles_1_0= RULE_STRING
            	    {
            	    lv_layoutFiles_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLayout362); 

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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleLayout380); 

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


    // $ANTLR start "entryRuleStructure"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:261:1: entryRuleStructure returns [EObject current=null] : iv_ruleStructure= ruleStructure EOF ;
    public final EObject entryRuleStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructure = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:262:2: (iv_ruleStructure= ruleStructure EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:263:2: iv_ruleStructure= ruleStructure EOF
            {
             newCompositeNode(grammarAccess.getStructureRule()); 
            pushFollow(FOLLOW_ruleStructure_in_entryRuleStructure416);
            iv_ruleStructure=ruleStructure();

            state._fsp--;

             current =iv_ruleStructure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructure426); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:270:1: ruleStructure returns [EObject current=null] : ( ( (lv_name_0_0= 'Structure' ) ) otherlv_1= ':' ( (lv_orderedElements_2_0= ruleElement ) )* otherlv_3= ';' ) ;
    public final EObject ruleStructure() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_orderedElements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:273:28: ( ( ( (lv_name_0_0= 'Structure' ) ) otherlv_1= ':' ( (lv_orderedElements_2_0= ruleElement ) )* otherlv_3= ';' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:274:1: ( ( (lv_name_0_0= 'Structure' ) ) otherlv_1= ':' ( (lv_orderedElements_2_0= ruleElement ) )* otherlv_3= ';' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:274:1: ( ( (lv_name_0_0= 'Structure' ) ) otherlv_1= ':' ( (lv_orderedElements_2_0= ruleElement ) )* otherlv_3= ';' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:274:2: ( (lv_name_0_0= 'Structure' ) ) otherlv_1= ':' ( (lv_orderedElements_2_0= ruleElement ) )* otherlv_3= ';'
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:274:2: ( (lv_name_0_0= 'Structure' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:275:1: (lv_name_0_0= 'Structure' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:275:1: (lv_name_0_0= 'Structure' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:276:3: lv_name_0_0= 'Structure'
            {
            lv_name_0_0=(Token)match(input,16,FOLLOW_16_in_ruleStructure469); 

                    newLeafNode(lv_name_0_0, grammarAccess.getStructureAccess().getNameStructureKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStructureRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Structure");
            	    

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleStructure494); 

                	newLeafNode(otherlv_1, grammarAccess.getStructureAccess().getColonKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:293:1: ( (lv_orderedElements_2_0= ruleElement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STRING) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:294:1: (lv_orderedElements_2_0= ruleElement )
            	    {
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:294:1: (lv_orderedElements_2_0= ruleElement )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:295:3: lv_orderedElements_2_0= ruleElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStructureAccess().getOrderedElementsElementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElement_in_ruleStructure515);
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
            	    break loop7;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleStructure528); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:323:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:324:2: (iv_ruleElement= ruleElement EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:325:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement564);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement574); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:332:1: ruleElement returns [EObject current=null] : ( (lv_id_0_0= RULE_STRING ) ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:335:28: ( ( (lv_id_0_0= RULE_STRING ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:336:1: ( (lv_id_0_0= RULE_STRING ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:336:1: ( (lv_id_0_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:337:1: (lv_id_0_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:337:1: (lv_id_0_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:338:3: lv_id_0_0= RULE_STRING
            {
            lv_id_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleElement615); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:362:1: entryRuleRefinement returns [EObject current=null] : iv_ruleRefinement= ruleRefinement EOF ;
    public final EObject entryRuleRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefinement = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:363:2: (iv_ruleRefinement= ruleRefinement EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:364:2: iv_ruleRefinement= ruleRefinement EOF
            {
             newCompositeNode(grammarAccess.getRefinementRule()); 
            pushFollow(FOLLOW_ruleRefinement_in_entryRuleRefinement655);
            iv_ruleRefinement=ruleRefinement();

            state._fsp--;

             current =iv_ruleRefinement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefinement665); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:371:1: ruleRefinement returns [EObject current=null] : ( ( (lv_concreteRefinement_0_0= ruleComponentRefinement ) ) otherlv_1= ';' ) ;
    public final EObject ruleRefinement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_concreteRefinement_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:374:28: ( ( ( (lv_concreteRefinement_0_0= ruleComponentRefinement ) ) otherlv_1= ';' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:375:1: ( ( (lv_concreteRefinement_0_0= ruleComponentRefinement ) ) otherlv_1= ';' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:375:1: ( ( (lv_concreteRefinement_0_0= ruleComponentRefinement ) ) otherlv_1= ';' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:375:2: ( (lv_concreteRefinement_0_0= ruleComponentRefinement ) ) otherlv_1= ';'
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:375:2: ( (lv_concreteRefinement_0_0= ruleComponentRefinement ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:376:1: (lv_concreteRefinement_0_0= ruleComponentRefinement )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:376:1: (lv_concreteRefinement_0_0= ruleComponentRefinement )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:377:3: lv_concreteRefinement_0_0= ruleComponentRefinement
            {
             
            	        newCompositeNode(grammarAccess.getRefinementAccess().getConcreteRefinementComponentRefinementParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleComponentRefinement_in_ruleRefinement711);
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

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleRefinement723); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:405:1: entryRuleComponentRefinement returns [EObject current=null] : iv_ruleComponentRefinement= ruleComponentRefinement EOF ;
    public final EObject entryRuleComponentRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentRefinement = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:406:2: (iv_ruleComponentRefinement= ruleComponentRefinement EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:407:2: iv_ruleComponentRefinement= ruleComponentRefinement EOF
            {
             newCompositeNode(grammarAccess.getComponentRefinementRule()); 
            pushFollow(FOLLOW_ruleComponentRefinement_in_entryRuleComponentRefinement759);
            iv_ruleComponentRefinement=ruleComponentRefinement();

            state._fsp--;

             current =iv_ruleComponentRefinement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentRefinement769); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:414:1: ruleComponentRefinement returns [EObject current=null] : (this_LabelRefinement_0= ruleLabelRefinement | this_ButtonRefinement_1= ruleButtonRefinement ) ;
    public final EObject ruleComponentRefinement() throws RecognitionException {
        EObject current = null;

        EObject this_LabelRefinement_0 = null;

        EObject this_ButtonRefinement_1 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:417:28: ( (this_LabelRefinement_0= ruleLabelRefinement | this_ButtonRefinement_1= ruleButtonRefinement ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:418:1: (this_LabelRefinement_0= ruleLabelRefinement | this_ButtonRefinement_1= ruleButtonRefinement )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:418:1: (this_LabelRefinement_0= ruleLabelRefinement | this_ButtonRefinement_1= ruleButtonRefinement )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==18) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:419:5: this_LabelRefinement_0= ruleLabelRefinement
                    {
                     
                            newCompositeNode(grammarAccess.getComponentRefinementAccess().getLabelRefinementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLabelRefinement_in_ruleComponentRefinement816);
                    this_LabelRefinement_0=ruleLabelRefinement();

                    state._fsp--;

                     
                            current = this_LabelRefinement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:429:5: this_ButtonRefinement_1= ruleButtonRefinement
                    {
                     
                            newCompositeNode(grammarAccess.getComponentRefinementAccess().getButtonRefinementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleButtonRefinement_in_ruleComponentRefinement843);
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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:445:1: entryRuleButtonRefinement returns [EObject current=null] : iv_ruleButtonRefinement= ruleButtonRefinement EOF ;
    public final EObject entryRuleButtonRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonRefinement = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:446:2: (iv_ruleButtonRefinement= ruleButtonRefinement EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:447:2: iv_ruleButtonRefinement= ruleButtonRefinement EOF
            {
             newCompositeNode(grammarAccess.getButtonRefinementRule()); 
            pushFollow(FOLLOW_ruleButtonRefinement_in_entryRuleButtonRefinement878);
            iv_ruleButtonRefinement=ruleButtonRefinement();

            state._fsp--;

             current =iv_ruleButtonRefinement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonRefinement888); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:454:1: ruleButtonRefinement returns [EObject current=null] : ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'from:' ( (lv_id_2_0= RULE_STRING ) ) (otherlv_3= '->' ( (lv_properties_4_0= ruleButtonProperties ) ) )? ) ;
    public final EObject ruleButtonRefinement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        EObject lv_properties_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:457:28: ( ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'from:' ( (lv_id_2_0= RULE_STRING ) ) (otherlv_3= '->' ( (lv_properties_4_0= ruleButtonProperties ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:458:1: ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'from:' ( (lv_id_2_0= RULE_STRING ) ) (otherlv_3= '->' ( (lv_properties_4_0= ruleButtonProperties ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:458:1: ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'from:' ( (lv_id_2_0= RULE_STRING ) ) (otherlv_3= '->' ( (lv_properties_4_0= ruleButtonProperties ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:458:2: ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'from:' ( (lv_id_2_0= RULE_STRING ) ) (otherlv_3= '->' ( (lv_properties_4_0= ruleButtonProperties ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:458:2: ( (lv_name_0_0= 'Button' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:459:1: (lv_name_0_0= 'Button' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:459:1: (lv_name_0_0= 'Button' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:460:3: lv_name_0_0= 'Button'
            {
            lv_name_0_0=(Token)match(input,18,FOLLOW_18_in_ruleButtonRefinement931); 

                    newLeafNode(lv_name_0_0, grammarAccess.getButtonRefinementAccess().getNameButtonKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getButtonRefinementRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Button");
            	    

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleButtonRefinement956); 

                	newLeafNode(otherlv_1, grammarAccess.getButtonRefinementAccess().getFromKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:477:1: ( (lv_id_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:478:1: (lv_id_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:478:1: (lv_id_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:479:3: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleButtonRefinement973); 

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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:495:2: (otherlv_3= '->' ( (lv_properties_4_0= ruleButtonProperties ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:495:4: otherlv_3= '->' ( (lv_properties_4_0= ruleButtonProperties ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleButtonRefinement991); 

                        	newLeafNode(otherlv_3, grammarAccess.getButtonRefinementAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:499:1: ( (lv_properties_4_0= ruleButtonProperties ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:500:1: (lv_properties_4_0= ruleButtonProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:500:1: (lv_properties_4_0= ruleButtonProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:501:3: lv_properties_4_0= ruleButtonProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getButtonRefinementAccess().getPropertiesButtonPropertiesParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleButtonProperties_in_ruleButtonRefinement1012);
                    lv_properties_4_0=ruleButtonProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getButtonRefinementRule());
                    	        }
                           		set(
                           			current, 
                           			"properties",
                            		lv_properties_4_0, 
                            		"ButtonProperties");
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
    // $ANTLR end "ruleButtonRefinement"


    // $ANTLR start "entryRuleLabelRefinement"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:525:1: entryRuleLabelRefinement returns [EObject current=null] : iv_ruleLabelRefinement= ruleLabelRefinement EOF ;
    public final EObject entryRuleLabelRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelRefinement = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:526:2: (iv_ruleLabelRefinement= ruleLabelRefinement EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:527:2: iv_ruleLabelRefinement= ruleLabelRefinement EOF
            {
             newCompositeNode(grammarAccess.getLabelRefinementRule()); 
            pushFollow(FOLLOW_ruleLabelRefinement_in_entryRuleLabelRefinement1050);
            iv_ruleLabelRefinement=ruleLabelRefinement();

            state._fsp--;

             current =iv_ruleLabelRefinement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelRefinement1060); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:534:1: ruleLabelRefinement returns [EObject current=null] : ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'from:' ( (lv_id_2_0= RULE_STRING ) ) (otherlv_3= '->' ( (lv_properties_4_0= ruleLabelProperties ) ) )? ) ;
    public final EObject ruleLabelRefinement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        EObject lv_properties_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:537:28: ( ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'from:' ( (lv_id_2_0= RULE_STRING ) ) (otherlv_3= '->' ( (lv_properties_4_0= ruleLabelProperties ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:538:1: ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'from:' ( (lv_id_2_0= RULE_STRING ) ) (otherlv_3= '->' ( (lv_properties_4_0= ruleLabelProperties ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:538:1: ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'from:' ( (lv_id_2_0= RULE_STRING ) ) (otherlv_3= '->' ( (lv_properties_4_0= ruleLabelProperties ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:538:2: ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'from:' ( (lv_id_2_0= RULE_STRING ) ) (otherlv_3= '->' ( (lv_properties_4_0= ruleLabelProperties ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:538:2: ( (lv_name_0_0= 'Label' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:539:1: (lv_name_0_0= 'Label' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:539:1: (lv_name_0_0= 'Label' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:540:3: lv_name_0_0= 'Label'
            {
            lv_name_0_0=(Token)match(input,21,FOLLOW_21_in_ruleLabelRefinement1103); 

                    newLeafNode(lv_name_0_0, grammarAccess.getLabelRefinementAccess().getNameLabelKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelRefinementRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Label");
            	    

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleLabelRefinement1128); 

                	newLeafNode(otherlv_1, grammarAccess.getLabelRefinementAccess().getFromKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:557:1: ( (lv_id_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:558:1: (lv_id_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:558:1: (lv_id_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:559:3: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabelRefinement1145); 

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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:575:2: (otherlv_3= '->' ( (lv_properties_4_0= ruleLabelProperties ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:575:4: otherlv_3= '->' ( (lv_properties_4_0= ruleLabelProperties ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleLabelRefinement1163); 

                        	newLeafNode(otherlv_3, grammarAccess.getLabelRefinementAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:579:1: ( (lv_properties_4_0= ruleLabelProperties ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:580:1: (lv_properties_4_0= ruleLabelProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:580:1: (lv_properties_4_0= ruleLabelProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:581:3: lv_properties_4_0= ruleLabelProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getLabelRefinementAccess().getPropertiesLabelPropertiesParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLabelProperties_in_ruleLabelRefinement1184);
                    lv_properties_4_0=ruleLabelProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLabelRefinementRule());
                    	        }
                           		set(
                           			current, 
                           			"properties",
                            		lv_properties_4_0, 
                            		"LabelProperties");
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
    // $ANTLR end "ruleLabelRefinement"


    // $ANTLR start "entryRuleProperty"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:605:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:606:2: (iv_ruleProperty= ruleProperty EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:607:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1222);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1232); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:614:1: ruleProperty returns [EObject current=null] : (otherlv_0= 'get properties from:' ( (lv_propertiesFiles_1_0= RULE_STRING ) )+ otherlv_2= ';' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_propertiesFiles_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:617:28: ( (otherlv_0= 'get properties from:' ( (lv_propertiesFiles_1_0= RULE_STRING ) )+ otherlv_2= ';' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:618:1: (otherlv_0= 'get properties from:' ( (lv_propertiesFiles_1_0= RULE_STRING ) )+ otherlv_2= ';' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:618:1: (otherlv_0= 'get properties from:' ( (lv_propertiesFiles_1_0= RULE_STRING ) )+ otherlv_2= ';' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:618:3: otherlv_0= 'get properties from:' ( (lv_propertiesFiles_1_0= RULE_STRING ) )+ otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleProperty1269); 

                	newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getGetPropertiesFromKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:622:1: ( (lv_propertiesFiles_1_0= RULE_STRING ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:623:1: (lv_propertiesFiles_1_0= RULE_STRING )
            	    {
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:623:1: (lv_propertiesFiles_1_0= RULE_STRING )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:624:3: lv_propertiesFiles_1_0= RULE_STRING
            	    {
            	    lv_propertiesFiles_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProperty1286); 

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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleProperty1304); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:652:1: entryRuleUsedDescriptions returns [EObject current=null] : iv_ruleUsedDescriptions= ruleUsedDescriptions EOF ;
    public final EObject entryRuleUsedDescriptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsedDescriptions = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:653:2: (iv_ruleUsedDescriptions= ruleUsedDescriptions EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:654:2: iv_ruleUsedDescriptions= ruleUsedDescriptions EOF
            {
             newCompositeNode(grammarAccess.getUsedDescriptionsRule()); 
            pushFollow(FOLLOW_ruleUsedDescriptions_in_entryRuleUsedDescriptions1340);
            iv_ruleUsedDescriptions=ruleUsedDescriptions();

            state._fsp--;

             current =iv_ruleUsedDescriptions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsedDescriptions1350); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:661:1: ruleUsedDescriptions returns [EObject current=null] : (otherlv_0= 'use:' ( (lv_description_1_0= ruleDescriptionType ) ) (otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleUsedDescriptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;
        Token otherlv_4=null;
        EObject lv_description_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:664:28: ( (otherlv_0= 'use:' ( (lv_description_1_0= ruleDescriptionType ) ) (otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) )? otherlv_4= ';' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:665:1: (otherlv_0= 'use:' ( (lv_description_1_0= ruleDescriptionType ) ) (otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) )? otherlv_4= ';' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:665:1: (otherlv_0= 'use:' ( (lv_description_1_0= ruleDescriptionType ) ) (otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) )? otherlv_4= ';' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:665:3: otherlv_0= 'use:' ( (lv_description_1_0= ruleDescriptionType ) ) (otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleUsedDescriptions1387); 

                	newLeafNode(otherlv_0, grammarAccess.getUsedDescriptionsAccess().getUseKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:669:1: ( (lv_description_1_0= ruleDescriptionType ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:670:1: (lv_description_1_0= ruleDescriptionType )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:670:1: (lv_description_1_0= ruleDescriptionType )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:671:3: lv_description_1_0= ruleDescriptionType
            {
             
            	        newCompositeNode(grammarAccess.getUsedDescriptionsAccess().getDescriptionDescriptionTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDescriptionType_in_ruleUsedDescriptions1408);
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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:687:2: (otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:687:4: otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleUsedDescriptions1421); 

                        	newLeafNode(otherlv_2, grammarAccess.getUsedDescriptionsAccess().getAsKeyword_2_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:691:1: ( (lv_id_3_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:692:1: (lv_id_3_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:692:1: (lv_id_3_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:693:3: lv_id_3_0= RULE_STRING
                    {
                    lv_id_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUsedDescriptions1438); 

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

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleUsedDescriptions1457); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:721:1: entryRuleDescriptionType returns [EObject current=null] : iv_ruleDescriptionType= ruleDescriptionType EOF ;
    public final EObject entryRuleDescriptionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescriptionType = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:722:2: (iv_ruleDescriptionType= ruleDescriptionType EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:723:2: iv_ruleDescriptionType= ruleDescriptionType EOF
            {
             newCompositeNode(grammarAccess.getDescriptionTypeRule()); 
            pushFollow(FOLLOW_ruleDescriptionType_in_entryRuleDescriptionType1493);
            iv_ruleDescriptionType=ruleDescriptionType();

            state._fsp--;

             current =iv_ruleDescriptionType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescriptionType1503); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:730:1: ruleDescriptionType returns [EObject current=null] : (this_UIDescriptionImport_0= ruleUIDescriptionImport | this_ComplexComponent_1= ruleComplexComponent ) ;
    public final EObject ruleDescriptionType() throws RecognitionException {
        EObject current = null;

        EObject this_UIDescriptionImport_0 = null;

        EObject this_ComplexComponent_1 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:733:28: ( (this_UIDescriptionImport_0= ruleUIDescriptionImport | this_ComplexComponent_1= ruleComplexComponent ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:734:1: (this_UIDescriptionImport_0= ruleUIDescriptionImport | this_ComplexComponent_1= ruleComplexComponent )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:734:1: (this_UIDescriptionImport_0= ruleUIDescriptionImport | this_ComplexComponent_1= ruleComplexComponent )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==29) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:735:5: this_UIDescriptionImport_0= ruleUIDescriptionImport
                    {
                     
                            newCompositeNode(grammarAccess.getDescriptionTypeAccess().getUIDescriptionImportParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUIDescriptionImport_in_ruleDescriptionType1550);
                    this_UIDescriptionImport_0=ruleUIDescriptionImport();

                    state._fsp--;

                     
                            current = this_UIDescriptionImport_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:745:5: this_ComplexComponent_1= ruleComplexComponent
                    {
                     
                            newCompositeNode(grammarAccess.getDescriptionTypeAccess().getComplexComponentParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleComplexComponent_in_ruleDescriptionType1577);
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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:761:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:762:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:763:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition1612);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition1622); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:770:1: ruleDefinition returns [EObject current=null] : ( ( (lv_concreteDefition_0_0= ruleComponentDefinition ) ) otherlv_1= ';' ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_concreteDefition_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:773:28: ( ( ( (lv_concreteDefition_0_0= ruleComponentDefinition ) ) otherlv_1= ';' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:774:1: ( ( (lv_concreteDefition_0_0= ruleComponentDefinition ) ) otherlv_1= ';' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:774:1: ( ( (lv_concreteDefition_0_0= ruleComponentDefinition ) ) otherlv_1= ';' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:774:2: ( (lv_concreteDefition_0_0= ruleComponentDefinition ) ) otherlv_1= ';'
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:774:2: ( (lv_concreteDefition_0_0= ruleComponentDefinition ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:775:1: (lv_concreteDefition_0_0= ruleComponentDefinition )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:775:1: (lv_concreteDefition_0_0= ruleComponentDefinition )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:776:3: lv_concreteDefition_0_0= ruleComponentDefinition
            {
             
            	        newCompositeNode(grammarAccess.getDefinitionAccess().getConcreteDefitionComponentDefinitionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleComponentDefinition_in_ruleDefinition1668);
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

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleDefinition1680); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:804:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:805:2: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:806:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
            {
             newCompositeNode(grammarAccess.getTypeDefinitionRule()); 
            pushFollow(FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition1716);
            iv_ruleTypeDefinition=ruleTypeDefinition();

            state._fsp--;

             current =iv_ruleTypeDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinition1726); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:813:1: ruleTypeDefinition returns [EObject current=null] : (otherlv_0= 'type: ' ( (lv_type_1_0= ruleType ) ) otherlv_2= ';' ) ;
    public final EObject ruleTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:816:28: ( (otherlv_0= 'type: ' ( (lv_type_1_0= ruleType ) ) otherlv_2= ';' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:817:1: (otherlv_0= 'type: ' ( (lv_type_1_0= ruleType ) ) otherlv_2= ';' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:817:1: (otherlv_0= 'type: ' ( (lv_type_1_0= ruleType ) ) otherlv_2= ';' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:817:3: otherlv_0= 'type: ' ( (lv_type_1_0= ruleType ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleTypeDefinition1763); 

                	newLeafNode(otherlv_0, grammarAccess.getTypeDefinitionAccess().getTypeKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:821:1: ( (lv_type_1_0= ruleType ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:822:1: (lv_type_1_0= ruleType )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:822:1: (lv_type_1_0= ruleType )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:823:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleTypeDefinition1784);
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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleTypeDefinition1796); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:851:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:852:2: (iv_ruleType= ruleType EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:853:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1832);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1842); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:860:1: ruleType returns [EObject current=null] : ( ( (lv_id_0_1= 'WINDOW' | lv_id_0_2= 'INNERCOMPLEX' ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_1=null;
        Token lv_id_0_2=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:863:28: ( ( ( (lv_id_0_1= 'WINDOW' | lv_id_0_2= 'INNERCOMPLEX' ) ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:864:1: ( ( (lv_id_0_1= 'WINDOW' | lv_id_0_2= 'INNERCOMPLEX' ) ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:864:1: ( ( (lv_id_0_1= 'WINDOW' | lv_id_0_2= 'INNERCOMPLEX' ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:865:1: ( (lv_id_0_1= 'WINDOW' | lv_id_0_2= 'INNERCOMPLEX' ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:865:1: ( (lv_id_0_1= 'WINDOW' | lv_id_0_2= 'INNERCOMPLEX' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:866:1: (lv_id_0_1= 'WINDOW' | lv_id_0_2= 'INNERCOMPLEX' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:866:1: (lv_id_0_1= 'WINDOW' | lv_id_0_2= 'INNERCOMPLEX' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            else if ( (LA14_0==27) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:867:3: lv_id_0_1= 'WINDOW'
                    {
                    lv_id_0_1=(Token)match(input,26,FOLLOW_26_in_ruleType1886); 

                            newLeafNode(lv_id_0_1, grammarAccess.getTypeAccess().getIdWINDOWKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRule());
                    	        }
                           		setWithLastConsumed(current, "id", lv_id_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:879:8: lv_id_0_2= 'INNERCOMPLEX'
                    {
                    lv_id_0_2=(Token)match(input,27,FOLLOW_27_in_ruleType1915); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:902:1: entryRuleUIDescriptionImport returns [EObject current=null] : iv_ruleUIDescriptionImport= ruleUIDescriptionImport EOF ;
    public final EObject entryRuleUIDescriptionImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIDescriptionImport = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:903:2: (iv_ruleUIDescriptionImport= ruleUIDescriptionImport EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:904:2: iv_ruleUIDescriptionImport= ruleUIDescriptionImport EOF
            {
             newCompositeNode(grammarAccess.getUIDescriptionImportRule()); 
            pushFollow(FOLLOW_ruleUIDescriptionImport_in_entryRuleUIDescriptionImport1966);
            iv_ruleUIDescriptionImport=ruleUIDescriptionImport();

            state._fsp--;

             current =iv_ruleUIDescriptionImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIDescriptionImport1976); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:911:1: ruleUIDescriptionImport returns [EObject current=null] : ( (lv_descriptionName_0_0= RULE_STRING ) ) ;
    public final EObject ruleUIDescriptionImport() throws RecognitionException {
        EObject current = null;

        Token lv_descriptionName_0_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:914:28: ( ( (lv_descriptionName_0_0= RULE_STRING ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:915:1: ( (lv_descriptionName_0_0= RULE_STRING ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:915:1: ( (lv_descriptionName_0_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:916:1: (lv_descriptionName_0_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:916:1: (lv_descriptionName_0_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:917:3: lv_descriptionName_0_0= RULE_STRING
            {
            lv_descriptionName_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUIDescriptionImport2017); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:941:1: entryRuleComplexComponent returns [EObject current=null] : iv_ruleComplexComponent= ruleComplexComponent EOF ;
    public final EObject entryRuleComplexComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexComponent = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:942:2: (iv_ruleComplexComponent= ruleComplexComponent EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:943:2: iv_ruleComplexComponent= ruleComplexComponent EOF
            {
             newCompositeNode(grammarAccess.getComplexComponentRule()); 
            pushFollow(FOLLOW_ruleComplexComponent_in_entryRuleComplexComponent2057);
            iv_ruleComplexComponent=ruleComplexComponent();

            state._fsp--;

             current =iv_ruleComplexComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexComponent2067); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:950:1: ruleComplexComponent returns [EObject current=null] : this_Multiselection_0= ruleMultiselection ;
    public final EObject ruleComplexComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Multiselection_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:953:28: (this_Multiselection_0= ruleMultiselection )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:955:5: this_Multiselection_0= ruleMultiselection
            {
             
                    newCompositeNode(grammarAccess.getComplexComponentAccess().getMultiselectionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleMultiselection_in_ruleComplexComponent2113);
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


    // $ANTLR start "entryRuleTabViewDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:971:1: entryRuleTabViewDefinition returns [EObject current=null] : iv_ruleTabViewDefinition= ruleTabViewDefinition EOF ;
    public final EObject entryRuleTabViewDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabViewDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:972:2: (iv_ruleTabViewDefinition= ruleTabViewDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:973:2: iv_ruleTabViewDefinition= ruleTabViewDefinition EOF
            {
             newCompositeNode(grammarAccess.getTabViewDefinitionRule()); 
            pushFollow(FOLLOW_ruleTabViewDefinition_in_entryRuleTabViewDefinition2147);
            iv_ruleTabViewDefinition=ruleTabViewDefinition();

            state._fsp--;

             current =iv_ruleTabViewDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabViewDefinition2157); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:980:1: ruleTabViewDefinition returns [EObject current=null] : ( ( (lv_name_0_0= 'TabView' ) ) ( (lv_tabs_1_0= ruleTabDefinition ) )* otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) (otherlv_4= '->' ( (lv_properties_5_0= ruleCommonProperties ) ) )? ) ;
    public final EObject ruleTabViewDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;
        Token otherlv_4=null;
        EObject lv_tabs_1_0 = null;

        EObject lv_properties_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:983:28: ( ( ( (lv_name_0_0= 'TabView' ) ) ( (lv_tabs_1_0= ruleTabDefinition ) )* otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) (otherlv_4= '->' ( (lv_properties_5_0= ruleCommonProperties ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:984:1: ( ( (lv_name_0_0= 'TabView' ) ) ( (lv_tabs_1_0= ruleTabDefinition ) )* otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) (otherlv_4= '->' ( (lv_properties_5_0= ruleCommonProperties ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:984:1: ( ( (lv_name_0_0= 'TabView' ) ) ( (lv_tabs_1_0= ruleTabDefinition ) )* otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) (otherlv_4= '->' ( (lv_properties_5_0= ruleCommonProperties ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:984:2: ( (lv_name_0_0= 'TabView' ) ) ( (lv_tabs_1_0= ruleTabDefinition ) )* otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) (otherlv_4= '->' ( (lv_properties_5_0= ruleCommonProperties ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:984:2: ( (lv_name_0_0= 'TabView' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:985:1: (lv_name_0_0= 'TabView' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:985:1: (lv_name_0_0= 'TabView' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:986:3: lv_name_0_0= 'TabView'
            {
            lv_name_0_0=(Token)match(input,28,FOLLOW_28_in_ruleTabViewDefinition2200); 

                    newLeafNode(lv_name_0_0, grammarAccess.getTabViewDefinitionAccess().getNameTabViewKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTabViewDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "TabView");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:999:2: ( (lv_tabs_1_0= ruleTabDefinition ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_TABNAME) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1000:1: (lv_tabs_1_0= ruleTabDefinition )
            	    {
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1000:1: (lv_tabs_1_0= ruleTabDefinition )
            	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1001:3: lv_tabs_1_0= ruleTabDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTabViewDefinitionAccess().getTabsTabDefinitionParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTabDefinition_in_ruleTabViewDefinition2234);
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
            	    break loop15;
                }
            } while (true);

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleTabViewDefinition2247); 

                	newLeafNode(otherlv_2, grammarAccess.getTabViewDefinitionAccess().getAsKeyword_2());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1021:1: ( (lv_id_3_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1022:1: (lv_id_3_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1022:1: (lv_id_3_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1023:3: lv_id_3_0= RULE_STRING
            {
            lv_id_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTabViewDefinition2264); 

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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1039:2: (otherlv_4= '->' ( (lv_properties_5_0= ruleCommonProperties ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1039:4: otherlv_4= '->' ( (lv_properties_5_0= ruleCommonProperties ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleTabViewDefinition2282); 

                        	newLeafNode(otherlv_4, grammarAccess.getTabViewDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1043:1: ( (lv_properties_5_0= ruleCommonProperties ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1044:1: (lv_properties_5_0= ruleCommonProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1044:1: (lv_properties_5_0= ruleCommonProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1045:3: lv_properties_5_0= ruleCommonProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getTabViewDefinitionAccess().getPropertiesCommonPropertiesParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCommonProperties_in_ruleTabViewDefinition2303);
                    lv_properties_5_0=ruleCommonProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTabViewDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"properties",
                            		lv_properties_5_0, 
                            		"CommonProperties");
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
    // $ANTLR end "ruleTabViewDefinition"


    // $ANTLR start "entryRuleTabDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1069:1: entryRuleTabDefinition returns [EObject current=null] : iv_ruleTabDefinition= ruleTabDefinition EOF ;
    public final EObject entryRuleTabDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1070:2: (iv_ruleTabDefinition= ruleTabDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1071:2: iv_ruleTabDefinition= ruleTabDefinition EOF
            {
             newCompositeNode(grammarAccess.getTabDefinitionRule()); 
            pushFollow(FOLLOW_ruleTabDefinition_in_entryRuleTabDefinition2341);
            iv_ruleTabDefinition=ruleTabDefinition();

            state._fsp--;

             current =iv_ruleTabDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabDefinition2351); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1078:1: ruleTabDefinition returns [EObject current=null] : ( (lv_name_0_0= RULE_TABNAME ) ) ;
    public final EObject ruleTabDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1081:28: ( ( (lv_name_0_0= RULE_TABNAME ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1082:1: ( (lv_name_0_0= RULE_TABNAME ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1082:1: ( (lv_name_0_0= RULE_TABNAME ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1083:1: (lv_name_0_0= RULE_TABNAME )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1083:1: (lv_name_0_0= RULE_TABNAME )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1084:3: lv_name_0_0= RULE_TABNAME
            {
            lv_name_0_0=(Token)match(input,RULE_TABNAME,FOLLOW_RULE_TABNAME_in_ruleTabDefinition2392); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1108:1: entryRuleMultiselection returns [EObject current=null] : iv_ruleMultiselection= ruleMultiselection EOF ;
    public final EObject entryRuleMultiselection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiselection = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1109:2: (iv_ruleMultiselection= ruleMultiselection EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1110:2: iv_ruleMultiselection= ruleMultiselection EOF
            {
             newCompositeNode(grammarAccess.getMultiselectionRule()); 
            pushFollow(FOLLOW_ruleMultiselection_in_entryRuleMultiselection2432);
            iv_ruleMultiselection=ruleMultiselection();

            state._fsp--;

             current =iv_ruleMultiselection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiselection2442); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1117:1: ruleMultiselection returns [EObject current=null] : ( ( (lv_name_0_0= 'Multiselection' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? ) ;
    public final EObject ruleMultiselection() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_inputType_1_0=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1120:28: ( ( ( (lv_name_0_0= 'Multiselection' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1121:1: ( ( (lv_name_0_0= 'Multiselection' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1121:1: ( ( (lv_name_0_0= 'Multiselection' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1121:2: ( (lv_name_0_0= 'Multiselection' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1121:2: ( (lv_name_0_0= 'Multiselection' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1122:1: (lv_name_0_0= 'Multiselection' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1122:1: (lv_name_0_0= 'Multiselection' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1123:3: lv_name_0_0= 'Multiselection'
            {
            lv_name_0_0=(Token)match(input,29,FOLLOW_29_in_ruleMultiselection2485); 

                    newLeafNode(lv_name_0_0, grammarAccess.getMultiselectionAccess().getNameMultiselectionKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMultiselectionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Multiselection");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1136:2: ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INPUT_DESCRIPTION) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1137:1: (lv_inputType_1_0= RULE_INPUT_DESCRIPTION )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1137:1: (lv_inputType_1_0= RULE_INPUT_DESCRIPTION )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1138:3: lv_inputType_1_0= RULE_INPUT_DESCRIPTION
                    {
                    lv_inputType_1_0=(Token)match(input,RULE_INPUT_DESCRIPTION,FOLLOW_RULE_INPUT_DESCRIPTION_in_ruleMultiselection2515); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1162:1: entryRuleComponentDefinition returns [EObject current=null] : iv_ruleComponentDefinition= ruleComponentDefinition EOF ;
    public final EObject entryRuleComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1163:2: (iv_ruleComponentDefinition= ruleComponentDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1164:2: iv_ruleComponentDefinition= ruleComponentDefinition EOF
            {
             newCompositeNode(grammarAccess.getComponentDefinitionRule()); 
            pushFollow(FOLLOW_ruleComponentDefinition_in_entryRuleComponentDefinition2557);
            iv_ruleComponentDefinition=ruleComponentDefinition();

            state._fsp--;

             current =iv_ruleComponentDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentDefinition2567); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1171:1: ruleComponentDefinition returns [EObject current=null] : (this_LabelDefinition_0= ruleLabelDefinition | this_ButtonDefinition_1= ruleButtonDefinition | this_TextfieldDefinition_2= ruleTextfieldDefinition | this_TextareaDefinition_3= ruleTextareaDefinition | this_TreeDefinition_4= ruleTreeDefinition | this_TableDefinition_5= ruleTableDefinition | this_TabViewDefinition_6= ruleTabViewDefinition | this_InterchangeableDefinition_7= ruleInterchangeableDefinition ) ;
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
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1174:28: ( (this_LabelDefinition_0= ruleLabelDefinition | this_ButtonDefinition_1= ruleButtonDefinition | this_TextfieldDefinition_2= ruleTextfieldDefinition | this_TextareaDefinition_3= ruleTextareaDefinition | this_TreeDefinition_4= ruleTreeDefinition | this_TableDefinition_5= ruleTableDefinition | this_TabViewDefinition_6= ruleTabViewDefinition | this_InterchangeableDefinition_7= ruleInterchangeableDefinition ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1175:1: (this_LabelDefinition_0= ruleLabelDefinition | this_ButtonDefinition_1= ruleButtonDefinition | this_TextfieldDefinition_2= ruleTextfieldDefinition | this_TextareaDefinition_3= ruleTextareaDefinition | this_TreeDefinition_4= ruleTreeDefinition | this_TableDefinition_5= ruleTableDefinition | this_TabViewDefinition_6= ruleTabViewDefinition | this_InterchangeableDefinition_7= ruleInterchangeableDefinition )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1175:1: (this_LabelDefinition_0= ruleLabelDefinition | this_ButtonDefinition_1= ruleButtonDefinition | this_TextfieldDefinition_2= ruleTextfieldDefinition | this_TextareaDefinition_3= ruleTextareaDefinition | this_TreeDefinition_4= ruleTreeDefinition | this_TableDefinition_5= ruleTableDefinition | this_TabViewDefinition_6= ruleTabViewDefinition | this_InterchangeableDefinition_7= ruleInterchangeableDefinition )
            int alt18=8;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt18=1;
                }
                break;
            case 18:
                {
                alt18=2;
                }
                break;
            case 30:
                {
                alt18=3;
                }
                break;
            case 33:
                {
                alt18=4;
                }
                break;
            case 34:
                {
                alt18=5;
                }
                break;
            case 35:
                {
                alt18=6;
                }
                break;
            case 28:
                {
                alt18=7;
                }
                break;
            case 36:
                {
                alt18=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1176:5: this_LabelDefinition_0= ruleLabelDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getLabelDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLabelDefinition_in_ruleComponentDefinition2614);
                    this_LabelDefinition_0=ruleLabelDefinition();

                    state._fsp--;

                     
                            current = this_LabelDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1186:5: this_ButtonDefinition_1= ruleButtonDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getButtonDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleButtonDefinition_in_ruleComponentDefinition2641);
                    this_ButtonDefinition_1=ruleButtonDefinition();

                    state._fsp--;

                     
                            current = this_ButtonDefinition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1196:5: this_TextfieldDefinition_2= ruleTextfieldDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getTextfieldDefinitionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTextfieldDefinition_in_ruleComponentDefinition2668);
                    this_TextfieldDefinition_2=ruleTextfieldDefinition();

                    state._fsp--;

                     
                            current = this_TextfieldDefinition_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1206:5: this_TextareaDefinition_3= ruleTextareaDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getTextareaDefinitionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleTextareaDefinition_in_ruleComponentDefinition2695);
                    this_TextareaDefinition_3=ruleTextareaDefinition();

                    state._fsp--;

                     
                            current = this_TextareaDefinition_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1216:5: this_TreeDefinition_4= ruleTreeDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getTreeDefinitionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleTreeDefinition_in_ruleComponentDefinition2722);
                    this_TreeDefinition_4=ruleTreeDefinition();

                    state._fsp--;

                     
                            current = this_TreeDefinition_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1226:5: this_TableDefinition_5= ruleTableDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getTableDefinitionParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleTableDefinition_in_ruleComponentDefinition2749);
                    this_TableDefinition_5=ruleTableDefinition();

                    state._fsp--;

                     
                            current = this_TableDefinition_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1236:5: this_TabViewDefinition_6= ruleTabViewDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getTabViewDefinitionParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleTabViewDefinition_in_ruleComponentDefinition2776);
                    this_TabViewDefinition_6=ruleTabViewDefinition();

                    state._fsp--;

                     
                            current = this_TabViewDefinition_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1246:5: this_InterchangeableDefinition_7= ruleInterchangeableDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getComponentDefinitionAccess().getInterchangeableDefinitionParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleInterchangeableDefinition_in_ruleComponentDefinition2803);
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


    // $ANTLR start "entryRuleTextfieldDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1262:1: entryRuleTextfieldDefinition returns [EObject current=null] : iv_ruleTextfieldDefinition= ruleTextfieldDefinition EOF ;
    public final EObject entryRuleTextfieldDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextfieldDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1263:2: (iv_ruleTextfieldDefinition= ruleTextfieldDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1264:2: iv_ruleTextfieldDefinition= ruleTextfieldDefinition EOF
            {
             newCompositeNode(grammarAccess.getTextfieldDefinitionRule()); 
            pushFollow(FOLLOW_ruleTextfieldDefinition_in_entryRuleTextfieldDefinition2838);
            iv_ruleTextfieldDefinition=ruleTextfieldDefinition();

            state._fsp--;

             current =iv_ruleTextfieldDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextfieldDefinition2848); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1271:1: ruleTextfieldDefinition returns [EObject current=null] : ( ( (lv_name_0_0= 'Textfield' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) (otherlv_3= '->' ( (lv_properties_4_0= ruleTextfieldProperties ) ) )? ) ;
    public final EObject ruleTextfieldDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        EObject lv_properties_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1274:28: ( ( ( (lv_name_0_0= 'Textfield' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) (otherlv_3= '->' ( (lv_properties_4_0= ruleTextfieldProperties ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1275:1: ( ( (lv_name_0_0= 'Textfield' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) (otherlv_3= '->' ( (lv_properties_4_0= ruleTextfieldProperties ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1275:1: ( ( (lv_name_0_0= 'Textfield' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) (otherlv_3= '->' ( (lv_properties_4_0= ruleTextfieldProperties ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1275:2: ( (lv_name_0_0= 'Textfield' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) (otherlv_3= '->' ( (lv_properties_4_0= ruleTextfieldProperties ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1275:2: ( (lv_name_0_0= 'Textfield' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1276:1: (lv_name_0_0= 'Textfield' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1276:1: (lv_name_0_0= 'Textfield' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1277:3: lv_name_0_0= 'Textfield'
            {
            lv_name_0_0=(Token)match(input,30,FOLLOW_30_in_ruleTextfieldDefinition2891); 

                    newLeafNode(lv_name_0_0, grammarAccess.getTextfieldDefinitionAccess().getNameTextfieldKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextfieldDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Textfield");
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleTextfieldDefinition2916); 

                	newLeafNode(otherlv_1, grammarAccess.getTextfieldDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1294:1: ( (lv_id_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1295:1: (lv_id_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1295:1: (lv_id_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1296:3: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextfieldDefinition2933); 

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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1312:2: (otherlv_3= '->' ( (lv_properties_4_0= ruleTextfieldProperties ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1312:4: otherlv_3= '->' ( (lv_properties_4_0= ruleTextfieldProperties ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleTextfieldDefinition2951); 

                        	newLeafNode(otherlv_3, grammarAccess.getTextfieldDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1316:1: ( (lv_properties_4_0= ruleTextfieldProperties ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1317:1: (lv_properties_4_0= ruleTextfieldProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1317:1: (lv_properties_4_0= ruleTextfieldProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1318:3: lv_properties_4_0= ruleTextfieldProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextfieldDefinitionAccess().getPropertiesTextfieldPropertiesParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTextfieldProperties_in_ruleTextfieldDefinition2972);
                    lv_properties_4_0=ruleTextfieldProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTextfieldDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"properties",
                            		lv_properties_4_0, 
                            		"TextfieldProperties");
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
    // $ANTLR end "ruleTextfieldDefinition"


    // $ANTLR start "entryRuleTextfieldProperties"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1342:1: entryRuleTextfieldProperties returns [EObject current=null] : iv_ruleTextfieldProperties= ruleTextfieldProperties EOF ;
    public final EObject entryRuleTextfieldProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextfieldProperties = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1343:2: (iv_ruleTextfieldProperties= ruleTextfieldProperties EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1344:2: iv_ruleTextfieldProperties= ruleTextfieldProperties EOF
            {
             newCompositeNode(grammarAccess.getTextfieldPropertiesRule()); 
            pushFollow(FOLLOW_ruleTextfieldProperties_in_entryRuleTextfieldProperties3010);
            iv_ruleTextfieldProperties=ruleTextfieldProperties();

            state._fsp--;

             current =iv_ruleTextfieldProperties; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextfieldProperties3020); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1351:1: ruleTextfieldProperties returns [EObject current=null] : ( ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )? (otherlv_3= 'editable=' ( (lv_editable_4_0= RULE_BOOLEAN ) ) )? ) ;
    public final EObject ruleTextfieldProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_text_2_0=null;
        Token otherlv_3=null;
        Token lv_editable_4_0=null;
        EObject lv_commonProperties_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1354:28: ( ( ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )? (otherlv_3= 'editable=' ( (lv_editable_4_0= RULE_BOOLEAN ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1355:1: ( ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )? (otherlv_3= 'editable=' ( (lv_editable_4_0= RULE_BOOLEAN ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1355:1: ( ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )? (otherlv_3= 'editable=' ( (lv_editable_4_0= RULE_BOOLEAN ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1355:2: ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )? (otherlv_3= 'editable=' ( (lv_editable_4_0= RULE_BOOLEAN ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1355:2: ( (lv_commonProperties_0_0= ruleCommonProperties ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1356:1: (lv_commonProperties_0_0= ruleCommonProperties )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1356:1: (lv_commonProperties_0_0= ruleCommonProperties )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1357:3: lv_commonProperties_0_0= ruleCommonProperties
            {
             
            	        newCompositeNode(grammarAccess.getTextfieldPropertiesAccess().getCommonPropertiesCommonPropertiesParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCommonProperties_in_ruleTextfieldProperties3066);
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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1373:2: (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1373:4: otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleTextfieldProperties3079); 

                        	newLeafNode(otherlv_1, grammarAccess.getTextfieldPropertiesAccess().getTextKeyword_1_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1377:1: ( (lv_text_2_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1378:1: (lv_text_2_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1378:1: (lv_text_2_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1379:3: lv_text_2_0= RULE_STRING
                    {
                    lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextfieldProperties3096); 

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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1395:4: (otherlv_3= 'editable=' ( (lv_editable_4_0= RULE_BOOLEAN ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1395:6: otherlv_3= 'editable=' ( (lv_editable_4_0= RULE_BOOLEAN ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleTextfieldProperties3116); 

                        	newLeafNode(otherlv_3, grammarAccess.getTextfieldPropertiesAccess().getEditableKeyword_2_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1399:1: ( (lv_editable_4_0= RULE_BOOLEAN ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1400:1: (lv_editable_4_0= RULE_BOOLEAN )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1400:1: (lv_editable_4_0= RULE_BOOLEAN )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1401:3: lv_editable_4_0= RULE_BOOLEAN
                    {
                    lv_editable_4_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleTextfieldProperties3133); 

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


    // $ANTLR start "entryRuleTextareaDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1425:1: entryRuleTextareaDefinition returns [EObject current=null] : iv_ruleTextareaDefinition= ruleTextareaDefinition EOF ;
    public final EObject entryRuleTextareaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextareaDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1426:2: (iv_ruleTextareaDefinition= ruleTextareaDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1427:2: iv_ruleTextareaDefinition= ruleTextareaDefinition EOF
            {
             newCompositeNode(grammarAccess.getTextareaDefinitionRule()); 
            pushFollow(FOLLOW_ruleTextareaDefinition_in_entryRuleTextareaDefinition3176);
            iv_ruleTextareaDefinition=ruleTextareaDefinition();

            state._fsp--;

             current =iv_ruleTextareaDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextareaDefinition3186); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1434:1: ruleTextareaDefinition returns [EObject current=null] : ( ( (lv_name_0_0= 'Textarea' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) (otherlv_3= '->' ( (lv_properties_4_0= ruleTextareaProperties ) ) )? ) ;
    public final EObject ruleTextareaDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        EObject lv_properties_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1437:28: ( ( ( (lv_name_0_0= 'Textarea' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) (otherlv_3= '->' ( (lv_properties_4_0= ruleTextareaProperties ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1438:1: ( ( (lv_name_0_0= 'Textarea' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) (otherlv_3= '->' ( (lv_properties_4_0= ruleTextareaProperties ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1438:1: ( ( (lv_name_0_0= 'Textarea' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) (otherlv_3= '->' ( (lv_properties_4_0= ruleTextareaProperties ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1438:2: ( (lv_name_0_0= 'Textarea' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) (otherlv_3= '->' ( (lv_properties_4_0= ruleTextareaProperties ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1438:2: ( (lv_name_0_0= 'Textarea' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1439:1: (lv_name_0_0= 'Textarea' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1439:1: (lv_name_0_0= 'Textarea' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1440:3: lv_name_0_0= 'Textarea'
            {
            lv_name_0_0=(Token)match(input,33,FOLLOW_33_in_ruleTextareaDefinition3229); 

                    newLeafNode(lv_name_0_0, grammarAccess.getTextareaDefinitionAccess().getNameTextareaKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextareaDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Textarea");
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleTextareaDefinition3254); 

                	newLeafNode(otherlv_1, grammarAccess.getTextareaDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1457:1: ( (lv_id_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1458:1: (lv_id_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1458:1: (lv_id_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1459:3: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextareaDefinition3271); 

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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1475:2: (otherlv_3= '->' ( (lv_properties_4_0= ruleTextareaProperties ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==20) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1475:4: otherlv_3= '->' ( (lv_properties_4_0= ruleTextareaProperties ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleTextareaDefinition3289); 

                        	newLeafNode(otherlv_3, grammarAccess.getTextareaDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1479:1: ( (lv_properties_4_0= ruleTextareaProperties ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1480:1: (lv_properties_4_0= ruleTextareaProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1480:1: (lv_properties_4_0= ruleTextareaProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1481:3: lv_properties_4_0= ruleTextareaProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextareaDefinitionAccess().getPropertiesTextareaPropertiesParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTextareaProperties_in_ruleTextareaDefinition3310);
                    lv_properties_4_0=ruleTextareaProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTextareaDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"properties",
                            		lv_properties_4_0, 
                            		"TextareaProperties");
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
    // $ANTLR end "ruleTextareaDefinition"


    // $ANTLR start "entryRuleTextareaProperties"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1505:1: entryRuleTextareaProperties returns [EObject current=null] : iv_ruleTextareaProperties= ruleTextareaProperties EOF ;
    public final EObject entryRuleTextareaProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextareaProperties = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1506:2: (iv_ruleTextareaProperties= ruleTextareaProperties EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1507:2: iv_ruleTextareaProperties= ruleTextareaProperties EOF
            {
             newCompositeNode(grammarAccess.getTextareaPropertiesRule()); 
            pushFollow(FOLLOW_ruleTextareaProperties_in_entryRuleTextareaProperties3348);
            iv_ruleTextareaProperties=ruleTextareaProperties();

            state._fsp--;

             current =iv_ruleTextareaProperties; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextareaProperties3358); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1514:1: ruleTextareaProperties returns [EObject current=null] : ( ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )? (otherlv_3= 'editable=' ( (lv_editable_4_0= RULE_BOOLEAN ) ) )? ) ;
    public final EObject ruleTextareaProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_text_2_0=null;
        Token otherlv_3=null;
        Token lv_editable_4_0=null;
        EObject lv_commonProperties_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1517:28: ( ( ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )? (otherlv_3= 'editable=' ( (lv_editable_4_0= RULE_BOOLEAN ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1518:1: ( ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )? (otherlv_3= 'editable=' ( (lv_editable_4_0= RULE_BOOLEAN ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1518:1: ( ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )? (otherlv_3= 'editable=' ( (lv_editable_4_0= RULE_BOOLEAN ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1518:2: ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )? (otherlv_3= 'editable=' ( (lv_editable_4_0= RULE_BOOLEAN ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1518:2: ( (lv_commonProperties_0_0= ruleCommonProperties ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1519:1: (lv_commonProperties_0_0= ruleCommonProperties )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1519:1: (lv_commonProperties_0_0= ruleCommonProperties )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1520:3: lv_commonProperties_0_0= ruleCommonProperties
            {
             
            	        newCompositeNode(grammarAccess.getTextareaPropertiesAccess().getCommonPropertiesCommonPropertiesParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCommonProperties_in_ruleTextareaProperties3404);
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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1536:2: (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1536:4: otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleTextareaProperties3417); 

                        	newLeafNode(otherlv_1, grammarAccess.getTextareaPropertiesAccess().getTextKeyword_1_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1540:1: ( (lv_text_2_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1541:1: (lv_text_2_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1541:1: (lv_text_2_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1542:3: lv_text_2_0= RULE_STRING
                    {
                    lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextareaProperties3434); 

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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1558:4: (otherlv_3= 'editable=' ( (lv_editable_4_0= RULE_BOOLEAN ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1558:6: otherlv_3= 'editable=' ( (lv_editable_4_0= RULE_BOOLEAN ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleTextareaProperties3454); 

                        	newLeafNode(otherlv_3, grammarAccess.getTextareaPropertiesAccess().getEditableKeyword_2_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1562:1: ( (lv_editable_4_0= RULE_BOOLEAN ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1563:1: (lv_editable_4_0= RULE_BOOLEAN )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1563:1: (lv_editable_4_0= RULE_BOOLEAN )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1564:3: lv_editable_4_0= RULE_BOOLEAN
                    {
                    lv_editable_4_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleTextareaProperties3471); 

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


    // $ANTLR start "entryRuleTreeDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1588:1: entryRuleTreeDefinition returns [EObject current=null] : iv_ruleTreeDefinition= ruleTreeDefinition EOF ;
    public final EObject entryRuleTreeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTreeDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1589:2: (iv_ruleTreeDefinition= ruleTreeDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1590:2: iv_ruleTreeDefinition= ruleTreeDefinition EOF
            {
             newCompositeNode(grammarAccess.getTreeDefinitionRule()); 
            pushFollow(FOLLOW_ruleTreeDefinition_in_entryRuleTreeDefinition3514);
            iv_ruleTreeDefinition=ruleTreeDefinition();

            state._fsp--;

             current =iv_ruleTreeDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTreeDefinition3524); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1597:1: ruleTreeDefinition returns [EObject current=null] : ( ( (lv_name_0_0= 'Tree' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) ) otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) (otherlv_4= '->' ( (lv_properties_5_0= ruleCommonProperties ) ) )? ) ;
    public final EObject ruleTreeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_inputType_1_0=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;
        Token otherlv_4=null;
        EObject lv_properties_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1600:28: ( ( ( (lv_name_0_0= 'Tree' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) ) otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) (otherlv_4= '->' ( (lv_properties_5_0= ruleCommonProperties ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1601:1: ( ( (lv_name_0_0= 'Tree' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) ) otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) (otherlv_4= '->' ( (lv_properties_5_0= ruleCommonProperties ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1601:1: ( ( (lv_name_0_0= 'Tree' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) ) otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) (otherlv_4= '->' ( (lv_properties_5_0= ruleCommonProperties ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1601:2: ( (lv_name_0_0= 'Tree' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) ) otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) (otherlv_4= '->' ( (lv_properties_5_0= ruleCommonProperties ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1601:2: ( (lv_name_0_0= 'Tree' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1602:1: (lv_name_0_0= 'Tree' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1602:1: (lv_name_0_0= 'Tree' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1603:3: lv_name_0_0= 'Tree'
            {
            lv_name_0_0=(Token)match(input,34,FOLLOW_34_in_ruleTreeDefinition3567); 

                    newLeafNode(lv_name_0_0, grammarAccess.getTreeDefinitionAccess().getNameTreeKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTreeDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Tree");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1616:2: ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1617:1: (lv_inputType_1_0= RULE_INPUT_DESCRIPTION )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1617:1: (lv_inputType_1_0= RULE_INPUT_DESCRIPTION )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1618:3: lv_inputType_1_0= RULE_INPUT_DESCRIPTION
            {
            lv_inputType_1_0=(Token)match(input,RULE_INPUT_DESCRIPTION,FOLLOW_RULE_INPUT_DESCRIPTION_in_ruleTreeDefinition3597); 

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

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleTreeDefinition3614); 

                	newLeafNode(otherlv_2, grammarAccess.getTreeDefinitionAccess().getAsKeyword_2());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1638:1: ( (lv_id_3_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1639:1: (lv_id_3_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1639:1: (lv_id_3_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1640:3: lv_id_3_0= RULE_STRING
            {
            lv_id_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTreeDefinition3631); 

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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1656:2: (otherlv_4= '->' ( (lv_properties_5_0= ruleCommonProperties ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==20) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1656:4: otherlv_4= '->' ( (lv_properties_5_0= ruleCommonProperties ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleTreeDefinition3649); 

                        	newLeafNode(otherlv_4, grammarAccess.getTreeDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1660:1: ( (lv_properties_5_0= ruleCommonProperties ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1661:1: (lv_properties_5_0= ruleCommonProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1661:1: (lv_properties_5_0= ruleCommonProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1662:3: lv_properties_5_0= ruleCommonProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getTreeDefinitionAccess().getPropertiesCommonPropertiesParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCommonProperties_in_ruleTreeDefinition3670);
                    lv_properties_5_0=ruleCommonProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTreeDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"properties",
                            		lv_properties_5_0, 
                            		"CommonProperties");
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
    // $ANTLR end "ruleTreeDefinition"


    // $ANTLR start "entryRuleTableDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1686:1: entryRuleTableDefinition returns [EObject current=null] : iv_ruleTableDefinition= ruleTableDefinition EOF ;
    public final EObject entryRuleTableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1687:2: (iv_ruleTableDefinition= ruleTableDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1688:2: iv_ruleTableDefinition= ruleTableDefinition EOF
            {
             newCompositeNode(grammarAccess.getTableDefinitionRule()); 
            pushFollow(FOLLOW_ruleTableDefinition_in_entryRuleTableDefinition3708);
            iv_ruleTableDefinition=ruleTableDefinition();

            state._fsp--;

             current =iv_ruleTableDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableDefinition3718); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1695:1: ruleTableDefinition returns [EObject current=null] : ( ( (lv_name_0_0= 'Table' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) ) otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) (otherlv_4= '->' ( (lv_properties_5_0= ruleCommonProperties ) ) )? ) ;
    public final EObject ruleTableDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_inputType_1_0=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;
        Token otherlv_4=null;
        EObject lv_properties_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1698:28: ( ( ( (lv_name_0_0= 'Table' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) ) otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) (otherlv_4= '->' ( (lv_properties_5_0= ruleCommonProperties ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1699:1: ( ( (lv_name_0_0= 'Table' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) ) otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) (otherlv_4= '->' ( (lv_properties_5_0= ruleCommonProperties ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1699:1: ( ( (lv_name_0_0= 'Table' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) ) otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) (otherlv_4= '->' ( (lv_properties_5_0= ruleCommonProperties ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1699:2: ( (lv_name_0_0= 'Table' ) ) ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) ) otherlv_2= 'as:' ( (lv_id_3_0= RULE_STRING ) ) (otherlv_4= '->' ( (lv_properties_5_0= ruleCommonProperties ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1699:2: ( (lv_name_0_0= 'Table' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1700:1: (lv_name_0_0= 'Table' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1700:1: (lv_name_0_0= 'Table' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1701:3: lv_name_0_0= 'Table'
            {
            lv_name_0_0=(Token)match(input,35,FOLLOW_35_in_ruleTableDefinition3761); 

                    newLeafNode(lv_name_0_0, grammarAccess.getTableDefinitionAccess().getNameTableKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTableDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Table");
            	    

            }


            }

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1714:2: ( (lv_inputType_1_0= RULE_INPUT_DESCRIPTION ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1715:1: (lv_inputType_1_0= RULE_INPUT_DESCRIPTION )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1715:1: (lv_inputType_1_0= RULE_INPUT_DESCRIPTION )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1716:3: lv_inputType_1_0= RULE_INPUT_DESCRIPTION
            {
            lv_inputType_1_0=(Token)match(input,RULE_INPUT_DESCRIPTION,FOLLOW_RULE_INPUT_DESCRIPTION_in_ruleTableDefinition3791); 

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

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleTableDefinition3808); 

                	newLeafNode(otherlv_2, grammarAccess.getTableDefinitionAccess().getAsKeyword_2());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1736:1: ( (lv_id_3_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1737:1: (lv_id_3_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1737:1: (lv_id_3_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1738:3: lv_id_3_0= RULE_STRING
            {
            lv_id_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTableDefinition3825); 

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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1754:2: (otherlv_4= '->' ( (lv_properties_5_0= ruleCommonProperties ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==20) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1754:4: otherlv_4= '->' ( (lv_properties_5_0= ruleCommonProperties ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleTableDefinition3843); 

                        	newLeafNode(otherlv_4, grammarAccess.getTableDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1758:1: ( (lv_properties_5_0= ruleCommonProperties ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1759:1: (lv_properties_5_0= ruleCommonProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1759:1: (lv_properties_5_0= ruleCommonProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1760:3: lv_properties_5_0= ruleCommonProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getTableDefinitionAccess().getPropertiesCommonPropertiesParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCommonProperties_in_ruleTableDefinition3864);
                    lv_properties_5_0=ruleCommonProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTableDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"properties",
                            		lv_properties_5_0, 
                            		"CommonProperties");
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
    // $ANTLR end "ruleTableDefinition"


    // $ANTLR start "entryRuleInterchangeableDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1784:1: entryRuleInterchangeableDefinition returns [EObject current=null] : iv_ruleInterchangeableDefinition= ruleInterchangeableDefinition EOF ;
    public final EObject entryRuleInterchangeableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterchangeableDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1785:2: (iv_ruleInterchangeableDefinition= ruleInterchangeableDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1786:2: iv_ruleInterchangeableDefinition= ruleInterchangeableDefinition EOF
            {
             newCompositeNode(grammarAccess.getInterchangeableDefinitionRule()); 
            pushFollow(FOLLOW_ruleInterchangeableDefinition_in_entryRuleInterchangeableDefinition3902);
            iv_ruleInterchangeableDefinition=ruleInterchangeableDefinition();

            state._fsp--;

             current =iv_ruleInterchangeableDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterchangeableDefinition3912); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1793:1: ruleInterchangeableDefinition returns [EObject current=null] : ( ( (lv_name_0_0= 'Interchangeable Area' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) (otherlv_3= '->' ( (lv_properties_4_0= ruleCommonProperties ) ) )? ) ;
    public final EObject ruleInterchangeableDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        EObject lv_properties_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1796:28: ( ( ( (lv_name_0_0= 'Interchangeable Area' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) (otherlv_3= '->' ( (lv_properties_4_0= ruleCommonProperties ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1797:1: ( ( (lv_name_0_0= 'Interchangeable Area' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) (otherlv_3= '->' ( (lv_properties_4_0= ruleCommonProperties ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1797:1: ( ( (lv_name_0_0= 'Interchangeable Area' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) (otherlv_3= '->' ( (lv_properties_4_0= ruleCommonProperties ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1797:2: ( (lv_name_0_0= 'Interchangeable Area' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) (otherlv_3= '->' ( (lv_properties_4_0= ruleCommonProperties ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1797:2: ( (lv_name_0_0= 'Interchangeable Area' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1798:1: (lv_name_0_0= 'Interchangeable Area' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1798:1: (lv_name_0_0= 'Interchangeable Area' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1799:3: lv_name_0_0= 'Interchangeable Area'
            {
            lv_name_0_0=(Token)match(input,36,FOLLOW_36_in_ruleInterchangeableDefinition3955); 

                    newLeafNode(lv_name_0_0, grammarAccess.getInterchangeableDefinitionAccess().getNameInterchangeableAreaKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInterchangeableDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Interchangeable Area");
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleInterchangeableDefinition3980); 

                	newLeafNode(otherlv_1, grammarAccess.getInterchangeableDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1816:1: ( (lv_id_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1817:1: (lv_id_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1817:1: (lv_id_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1818:3: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInterchangeableDefinition3997); 

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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1834:2: (otherlv_3= '->' ( (lv_properties_4_0= ruleCommonProperties ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==20) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1834:4: otherlv_3= '->' ( (lv_properties_4_0= ruleCommonProperties ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleInterchangeableDefinition4015); 

                        	newLeafNode(otherlv_3, grammarAccess.getInterchangeableDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1838:1: ( (lv_properties_4_0= ruleCommonProperties ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1839:1: (lv_properties_4_0= ruleCommonProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1839:1: (lv_properties_4_0= ruleCommonProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1840:3: lv_properties_4_0= ruleCommonProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getInterchangeableDefinitionAccess().getPropertiesCommonPropertiesParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCommonProperties_in_ruleInterchangeableDefinition4036);
                    lv_properties_4_0=ruleCommonProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInterchangeableDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"properties",
                            		lv_properties_4_0, 
                            		"CommonProperties");
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
    // $ANTLR end "ruleInterchangeableDefinition"


    // $ANTLR start "entryRuleButtonDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1864:1: entryRuleButtonDefinition returns [EObject current=null] : iv_ruleButtonDefinition= ruleButtonDefinition EOF ;
    public final EObject entryRuleButtonDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1865:2: (iv_ruleButtonDefinition= ruleButtonDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1866:2: iv_ruleButtonDefinition= ruleButtonDefinition EOF
            {
             newCompositeNode(grammarAccess.getButtonDefinitionRule()); 
            pushFollow(FOLLOW_ruleButtonDefinition_in_entryRuleButtonDefinition4074);
            iv_ruleButtonDefinition=ruleButtonDefinition();

            state._fsp--;

             current =iv_ruleButtonDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonDefinition4084); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1873:1: ruleButtonDefinition returns [EObject current=null] : ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleButtonProperties ) )? ) ;
    public final EObject ruleButtonDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1876:28: ( ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleButtonProperties ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1877:1: ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleButtonProperties ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1877:1: ( ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleButtonProperties ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1877:2: ( (lv_name_0_0= 'Button' ) ) otherlv_1= 'as:' ( (lv_id_2_0= RULE_STRING ) ) ( (lv_properties_3_0= ruleButtonProperties ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1877:2: ( (lv_name_0_0= 'Button' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1878:1: (lv_name_0_0= 'Button' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1878:1: (lv_name_0_0= 'Button' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1879:3: lv_name_0_0= 'Button'
            {
            lv_name_0_0=(Token)match(input,18,FOLLOW_18_in_ruleButtonDefinition4127); 

                    newLeafNode(lv_name_0_0, grammarAccess.getButtonDefinitionAccess().getNameButtonKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getButtonDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Button");
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleButtonDefinition4152); 

                	newLeafNode(otherlv_1, grammarAccess.getButtonDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1896:1: ( (lv_id_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1897:1: (lv_id_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1897:1: (lv_id_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1898:3: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleButtonDefinition4169); 

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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1914:2: ( (lv_properties_3_0= ruleButtonProperties ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==20) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1915:1: (lv_properties_3_0= ruleButtonProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1915:1: (lv_properties_3_0= ruleButtonProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1916:3: lv_properties_3_0= ruleButtonProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getButtonDefinitionAccess().getPropertiesButtonPropertiesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleButtonProperties_in_ruleButtonDefinition4195);
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


    // $ANTLR start "entryRuleButtonProperties"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1940:1: entryRuleButtonProperties returns [EObject current=null] : iv_ruleButtonProperties= ruleButtonProperties EOF ;
    public final EObject entryRuleButtonProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonProperties = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1941:2: (iv_ruleButtonProperties= ruleButtonProperties EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1942:2: iv_ruleButtonProperties= ruleButtonProperties EOF
            {
             newCompositeNode(grammarAccess.getButtonPropertiesRule()); 
            pushFollow(FOLLOW_ruleButtonProperties_in_entryRuleButtonProperties4232);
            iv_ruleButtonProperties=ruleButtonProperties();

            state._fsp--;

             current =iv_ruleButtonProperties; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonProperties4242); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1949:1: ruleButtonProperties returns [EObject current=null] : ( ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleButtonProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_text_2_0=null;
        EObject lv_commonProperties_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1952:28: ( ( ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1953:1: ( ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1953:1: ( ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1953:2: ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1953:2: ( (lv_commonProperties_0_0= ruleCommonProperties ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1954:1: (lv_commonProperties_0_0= ruleCommonProperties )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1954:1: (lv_commonProperties_0_0= ruleCommonProperties )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1955:3: lv_commonProperties_0_0= ruleCommonProperties
            {
             
            	        newCompositeNode(grammarAccess.getButtonPropertiesAccess().getCommonPropertiesCommonPropertiesParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCommonProperties_in_ruleButtonProperties4288);
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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1971:2: (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==31) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1971:4: otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleButtonProperties4301); 

                        	newLeafNode(otherlv_1, grammarAccess.getButtonPropertiesAccess().getTextKeyword_1_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1975:1: ( (lv_text_2_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1976:1: (lv_text_2_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1976:1: (lv_text_2_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:1977:3: lv_text_2_0= RULE_STRING
                    {
                    lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleButtonProperties4318); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2001:1: entryRuleCommonProperties returns [EObject current=null] : iv_ruleCommonProperties= ruleCommonProperties EOF ;
    public final EObject entryRuleCommonProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonProperties = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2002:2: (iv_ruleCommonProperties= ruleCommonProperties EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2003:2: iv_ruleCommonProperties= ruleCommonProperties EOF
            {
             newCompositeNode(grammarAccess.getCommonPropertiesRule()); 
            pushFollow(FOLLOW_ruleCommonProperties_in_entryRuleCommonProperties4361);
            iv_ruleCommonProperties=ruleCommonProperties();

            state._fsp--;

             current =iv_ruleCommonProperties; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonProperties4371); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2010:1: ruleCommonProperties returns [EObject current=null] : (otherlv_0= '->' ( ( (lv_name_1_0= 'propertyKey' ) ) otherlv_2= '=' ( (lv_propertyKey_3_0= RULE_STRING ) ) )? ( ( (lv_name_4_0= 'layoutKey' ) ) otherlv_5= '=' ( (lv_layoutKey_6_0= RULE_STRING ) ) )? ( ( (lv_name_7_0= 'interactiontype' ) ) otherlv_8= '=' ( (lv_interactiontype_9_0= ruleInteractiontype ) )+ )? ) ;
    public final EObject ruleCommonProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_propertyKey_3_0=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_layoutKey_6_0=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        EObject lv_interactiontype_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2013:28: ( (otherlv_0= '->' ( ( (lv_name_1_0= 'propertyKey' ) ) otherlv_2= '=' ( (lv_propertyKey_3_0= RULE_STRING ) ) )? ( ( (lv_name_4_0= 'layoutKey' ) ) otherlv_5= '=' ( (lv_layoutKey_6_0= RULE_STRING ) ) )? ( ( (lv_name_7_0= 'interactiontype' ) ) otherlv_8= '=' ( (lv_interactiontype_9_0= ruleInteractiontype ) )+ )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2014:1: (otherlv_0= '->' ( ( (lv_name_1_0= 'propertyKey' ) ) otherlv_2= '=' ( (lv_propertyKey_3_0= RULE_STRING ) ) )? ( ( (lv_name_4_0= 'layoutKey' ) ) otherlv_5= '=' ( (lv_layoutKey_6_0= RULE_STRING ) ) )? ( ( (lv_name_7_0= 'interactiontype' ) ) otherlv_8= '=' ( (lv_interactiontype_9_0= ruleInteractiontype ) )+ )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2014:1: (otherlv_0= '->' ( ( (lv_name_1_0= 'propertyKey' ) ) otherlv_2= '=' ( (lv_propertyKey_3_0= RULE_STRING ) ) )? ( ( (lv_name_4_0= 'layoutKey' ) ) otherlv_5= '=' ( (lv_layoutKey_6_0= RULE_STRING ) ) )? ( ( (lv_name_7_0= 'interactiontype' ) ) otherlv_8= '=' ( (lv_interactiontype_9_0= ruleInteractiontype ) )+ )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2014:3: otherlv_0= '->' ( ( (lv_name_1_0= 'propertyKey' ) ) otherlv_2= '=' ( (lv_propertyKey_3_0= RULE_STRING ) ) )? ( ( (lv_name_4_0= 'layoutKey' ) ) otherlv_5= '=' ( (lv_layoutKey_6_0= RULE_STRING ) ) )? ( ( (lv_name_7_0= 'interactiontype' ) ) otherlv_8= '=' ( (lv_interactiontype_9_0= ruleInteractiontype ) )+ )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleCommonProperties4408); 

                	newLeafNode(otherlv_0, grammarAccess.getCommonPropertiesAccess().getHyphenMinusGreaterThanSignKeyword_0());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2018:1: ( ( (lv_name_1_0= 'propertyKey' ) ) otherlv_2= '=' ( (lv_propertyKey_3_0= RULE_STRING ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==37) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2018:2: ( (lv_name_1_0= 'propertyKey' ) ) otherlv_2= '=' ( (lv_propertyKey_3_0= RULE_STRING ) )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2018:2: ( (lv_name_1_0= 'propertyKey' ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2019:1: (lv_name_1_0= 'propertyKey' )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2019:1: (lv_name_1_0= 'propertyKey' )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2020:3: lv_name_1_0= 'propertyKey'
                    {
                    lv_name_1_0=(Token)match(input,37,FOLLOW_37_in_ruleCommonProperties4427); 

                            newLeafNode(lv_name_1_0, grammarAccess.getCommonPropertiesAccess().getNamePropertyKeyKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCommonPropertiesRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_1_0, "propertyKey");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleCommonProperties4452); 

                        	newLeafNode(otherlv_2, grammarAccess.getCommonPropertiesAccess().getEqualsSignKeyword_1_1());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2037:1: ( (lv_propertyKey_3_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2038:1: (lv_propertyKey_3_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2038:1: (lv_propertyKey_3_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2039:3: lv_propertyKey_3_0= RULE_STRING
                    {
                    lv_propertyKey_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCommonProperties4469); 

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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2055:4: ( ( (lv_name_4_0= 'layoutKey' ) ) otherlv_5= '=' ( (lv_layoutKey_6_0= RULE_STRING ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==39) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2055:5: ( (lv_name_4_0= 'layoutKey' ) ) otherlv_5= '=' ( (lv_layoutKey_6_0= RULE_STRING ) )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2055:5: ( (lv_name_4_0= 'layoutKey' ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2056:1: (lv_name_4_0= 'layoutKey' )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2056:1: (lv_name_4_0= 'layoutKey' )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2057:3: lv_name_4_0= 'layoutKey'
                    {
                    lv_name_4_0=(Token)match(input,39,FOLLOW_39_in_ruleCommonProperties4495); 

                            newLeafNode(lv_name_4_0, grammarAccess.getCommonPropertiesAccess().getNameLayoutKeyKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCommonPropertiesRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_4_0, "layoutKey");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,38,FOLLOW_38_in_ruleCommonProperties4520); 

                        	newLeafNode(otherlv_5, grammarAccess.getCommonPropertiesAccess().getEqualsSignKeyword_2_1());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2074:1: ( (lv_layoutKey_6_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2075:1: (lv_layoutKey_6_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2075:1: (lv_layoutKey_6_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2076:3: lv_layoutKey_6_0= RULE_STRING
                    {
                    lv_layoutKey_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCommonProperties4537); 

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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2092:4: ( ( (lv_name_7_0= 'interactiontype' ) ) otherlv_8= '=' ( (lv_interactiontype_9_0= ruleInteractiontype ) )+ )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==40) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2092:5: ( (lv_name_7_0= 'interactiontype' ) ) otherlv_8= '=' ( (lv_interactiontype_9_0= ruleInteractiontype ) )+
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2092:5: ( (lv_name_7_0= 'interactiontype' ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2093:1: (lv_name_7_0= 'interactiontype' )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2093:1: (lv_name_7_0= 'interactiontype' )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2094:3: lv_name_7_0= 'interactiontype'
                    {
                    lv_name_7_0=(Token)match(input,40,FOLLOW_40_in_ruleCommonProperties4563); 

                            newLeafNode(lv_name_7_0, grammarAccess.getCommonPropertiesAccess().getNameInteractiontypeKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCommonPropertiesRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_7_0, "interactiontype");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,38,FOLLOW_38_in_ruleCommonProperties4588); 

                        	newLeafNode(otherlv_8, grammarAccess.getCommonPropertiesAccess().getEqualsSignKeyword_3_1());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2111:1: ( (lv_interactiontype_9_0= ruleInteractiontype ) )+
                    int cnt32=0;
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( ((LA32_0>=43 && LA32_0<=44)) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2112:1: (lv_interactiontype_9_0= ruleInteractiontype )
                    	    {
                    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2112:1: (lv_interactiontype_9_0= ruleInteractiontype )
                    	    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2113:3: lv_interactiontype_9_0= ruleInteractiontype
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCommonPropertiesAccess().getInteractiontypeInteractiontypeParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInteractiontype_in_ruleCommonProperties4609);
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
                    	    if ( cnt32 >= 1 ) break loop32;
                                EarlyExitException eee =
                                    new EarlyExitException(32, input);
                                throw eee;
                        }
                        cnt32++;
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


    // $ANTLR start "entryRuleLabelDefinition"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2137:1: entryRuleLabelDefinition returns [EObject current=null] : iv_ruleLabelDefinition= ruleLabelDefinition EOF ;
    public final EObject entryRuleLabelDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelDefinition = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2138:2: (iv_ruleLabelDefinition= ruleLabelDefinition EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2139:2: iv_ruleLabelDefinition= ruleLabelDefinition EOF
            {
             newCompositeNode(grammarAccess.getLabelDefinitionRule()); 
            pushFollow(FOLLOW_ruleLabelDefinition_in_entryRuleLabelDefinition4648);
            iv_ruleLabelDefinition=ruleLabelDefinition();

            state._fsp--;

             current =iv_ruleLabelDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelDefinition4658); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2146:1: ruleLabelDefinition returns [EObject current=null] : ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'as' ( (lv_id_2_0= RULE_STRING ) ) (otherlv_3= '->' ( (lv_properties_4_0= ruleLabelProperties ) ) )? ) ;
    public final EObject ruleLabelDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        EObject lv_properties_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2149:28: ( ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'as' ( (lv_id_2_0= RULE_STRING ) ) (otherlv_3= '->' ( (lv_properties_4_0= ruleLabelProperties ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2150:1: ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'as' ( (lv_id_2_0= RULE_STRING ) ) (otherlv_3= '->' ( (lv_properties_4_0= ruleLabelProperties ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2150:1: ( ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'as' ( (lv_id_2_0= RULE_STRING ) ) (otherlv_3= '->' ( (lv_properties_4_0= ruleLabelProperties ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2150:2: ( (lv_name_0_0= 'Label' ) ) otherlv_1= 'as' ( (lv_id_2_0= RULE_STRING ) ) (otherlv_3= '->' ( (lv_properties_4_0= ruleLabelProperties ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2150:2: ( (lv_name_0_0= 'Label' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2151:1: (lv_name_0_0= 'Label' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2151:1: (lv_name_0_0= 'Label' )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2152:3: lv_name_0_0= 'Label'
            {
            lv_name_0_0=(Token)match(input,21,FOLLOW_21_in_ruleLabelDefinition4701); 

                    newLeafNode(lv_name_0_0, grammarAccess.getLabelDefinitionAccess().getNameLabelKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelDefinitionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Label");
            	    

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleLabelDefinition4726); 

                	newLeafNode(otherlv_1, grammarAccess.getLabelDefinitionAccess().getAsKeyword_1());
                
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2169:1: ( (lv_id_2_0= RULE_STRING ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2170:1: (lv_id_2_0= RULE_STRING )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2170:1: (lv_id_2_0= RULE_STRING )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2171:3: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabelDefinition4743); 

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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2187:2: (otherlv_3= '->' ( (lv_properties_4_0= ruleLabelProperties ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==20) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2187:4: otherlv_3= '->' ( (lv_properties_4_0= ruleLabelProperties ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleLabelDefinition4761); 

                        	newLeafNode(otherlv_3, grammarAccess.getLabelDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2191:1: ( (lv_properties_4_0= ruleLabelProperties ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2192:1: (lv_properties_4_0= ruleLabelProperties )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2192:1: (lv_properties_4_0= ruleLabelProperties )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2193:3: lv_properties_4_0= ruleLabelProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getLabelDefinitionAccess().getPropertiesLabelPropertiesParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLabelProperties_in_ruleLabelDefinition4782);
                    lv_properties_4_0=ruleLabelProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLabelDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"properties",
                            		lv_properties_4_0, 
                            		"LabelProperties");
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
    // $ANTLR end "ruleLabelDefinition"


    // $ANTLR start "entryRuleLabelProperties"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2217:1: entryRuleLabelProperties returns [EObject current=null] : iv_ruleLabelProperties= ruleLabelProperties EOF ;
    public final EObject entryRuleLabelProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelProperties = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2218:2: (iv_ruleLabelProperties= ruleLabelProperties EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2219:2: iv_ruleLabelProperties= ruleLabelProperties EOF
            {
             newCompositeNode(grammarAccess.getLabelPropertiesRule()); 
            pushFollow(FOLLOW_ruleLabelProperties_in_entryRuleLabelProperties4820);
            iv_ruleLabelProperties=ruleLabelProperties();

            state._fsp--;

             current =iv_ruleLabelProperties; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelProperties4830); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2226:1: ruleLabelProperties returns [EObject current=null] : ( ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) ( (lv_name_3_0= 'LabelProperty' ) ) )? ) ;
    public final EObject ruleLabelProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_text_2_0=null;
        Token lv_name_3_0=null;
        EObject lv_commonProperties_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2229:28: ( ( ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) ( (lv_name_3_0= 'LabelProperty' ) ) )? ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2230:1: ( ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) ( (lv_name_3_0= 'LabelProperty' ) ) )? )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2230:1: ( ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) ( (lv_name_3_0= 'LabelProperty' ) ) )? )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2230:2: ( (lv_commonProperties_0_0= ruleCommonProperties ) ) (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) ( (lv_name_3_0= 'LabelProperty' ) ) )?
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2230:2: ( (lv_commonProperties_0_0= ruleCommonProperties ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2231:1: (lv_commonProperties_0_0= ruleCommonProperties )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2231:1: (lv_commonProperties_0_0= ruleCommonProperties )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2232:3: lv_commonProperties_0_0= ruleCommonProperties
            {
             
            	        newCompositeNode(grammarAccess.getLabelPropertiesAccess().getCommonPropertiesCommonPropertiesParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCommonProperties_in_ruleLabelProperties4876);
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

            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2248:2: (otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) ( (lv_name_3_0= 'LabelProperty' ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==31) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2248:4: otherlv_1= 'text=' ( (lv_text_2_0= RULE_STRING ) ) ( (lv_name_3_0= 'LabelProperty' ) )
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleLabelProperties4889); 

                        	newLeafNode(otherlv_1, grammarAccess.getLabelPropertiesAccess().getTextKeyword_1_0());
                        
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2252:1: ( (lv_text_2_0= RULE_STRING ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2253:1: (lv_text_2_0= RULE_STRING )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2253:1: (lv_text_2_0= RULE_STRING )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2254:3: lv_text_2_0= RULE_STRING
                    {
                    lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabelProperties4906); 

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

                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2270:2: ( (lv_name_3_0= 'LabelProperty' ) )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2271:1: (lv_name_3_0= 'LabelProperty' )
                    {
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2271:1: (lv_name_3_0= 'LabelProperty' )
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2272:3: lv_name_3_0= 'LabelProperty'
                    {
                    lv_name_3_0=(Token)match(input,42,FOLLOW_42_in_ruleLabelProperties4929); 

                            newLeafNode(lv_name_3_0, grammarAccess.getLabelPropertiesAccess().getNameLabelPropertyKeyword_1_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelPropertiesRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_3_0, "LabelProperty");
                    	    

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


    // $ANTLR start "entryRuleInteractiontype"
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2293:1: entryRuleInteractiontype returns [EObject current=null] : iv_ruleInteractiontype= ruleInteractiontype EOF ;
    public final EObject entryRuleInteractiontype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractiontype = null;


        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2294:2: (iv_ruleInteractiontype= ruleInteractiontype EOF )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2295:2: iv_ruleInteractiontype= ruleInteractiontype EOF
            {
             newCompositeNode(grammarAccess.getInteractiontypeRule()); 
            pushFollow(FOLLOW_ruleInteractiontype_in_entryRuleInteractiontype4980);
            iv_ruleInteractiontype=ruleInteractiontype();

            state._fsp--;

             current =iv_ruleInteractiontype; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractiontype4990); 

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
    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2302:1: ruleInteractiontype returns [EObject current=null] : ( ( (lv_id_0_1= 'IfActivator' | lv_id_0_2= 'IfTextDisplay' ) ) ) ;
    public final EObject ruleInteractiontype() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_1=null;
        Token lv_id_0_2=null;

         enterRule(); 
            
        try {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2305:28: ( ( ( (lv_id_0_1= 'IfActivator' | lv_id_0_2= 'IfTextDisplay' ) ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2306:1: ( ( (lv_id_0_1= 'IfActivator' | lv_id_0_2= 'IfTextDisplay' ) ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2306:1: ( ( (lv_id_0_1= 'IfActivator' | lv_id_0_2= 'IfTextDisplay' ) ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2307:1: ( (lv_id_0_1= 'IfActivator' | lv_id_0_2= 'IfTextDisplay' ) )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2307:1: ( (lv_id_0_1= 'IfActivator' | lv_id_0_2= 'IfTextDisplay' ) )
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2308:1: (lv_id_0_1= 'IfActivator' | lv_id_0_2= 'IfTextDisplay' )
            {
            // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2308:1: (lv_id_0_1= 'IfActivator' | lv_id_0_2= 'IfTextDisplay' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==43) ) {
                alt36=1;
            }
            else if ( (LA36_0==44) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2309:3: lv_id_0_1= 'IfActivator'
                    {
                    lv_id_0_1=(Token)match(input,43,FOLLOW_43_in_ruleInteractiontype5034); 

                            newLeafNode(lv_id_0_1, grammarAccess.getInteractiontypeAccess().getIdIfActivatorKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInteractiontypeRule());
                    	        }
                           		setWithLastConsumed(current, "id", lv_id_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui/src-gen/org/deg/xtext/gui/parser/antlr/internal/InternalGuiDSL.g:2321:8: lv_id_0_2= 'IfTextDisplay'
                    {
                    lv_id_0_2=(Token)match(input,44,FOLLOW_44_in_ruleInteractiontype5063); 

                            newLeafNode(lv_id_0_2, grammarAccess.getInteractiontypeAccess().getIdIfTextDisplayKeyword_0_1());
                        

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
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleUIDescription131 = new BitSet(new long[]{0x0000001E50E54000L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleUIDescription152 = new BitSet(new long[]{0x0000001E50E54000L});
    public static final BitSet FOLLOW_ruleLayout_in_ruleUIDescription174 = new BitSet(new long[]{0x0000001E50E54000L});
    public static final BitSet FOLLOW_ruleUsedDescriptions_in_ruleUIDescription196 = new BitSet(new long[]{0x0000001E50E54000L});
    public static final BitSet FOLLOW_ruleRefinement_in_ruleUIDescription218 = new BitSet(new long[]{0x0000001E50E54000L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleUIDescription240 = new BitSet(new long[]{0x0000001E50E54000L});
    public static final BitSet FOLLOW_ruleStructure_in_ruleUIDescription262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayout_in_entryRuleLayout298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayout308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleLayout345 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLayout362 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleLayout380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructure_in_entryRuleStructure416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructure426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleStructure469 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleStructure494 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleElement_in_ruleStructure515 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleStructure528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleElement615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefinement_in_entryRuleRefinement655 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefinement665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentRefinement_in_ruleRefinement711 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRefinement723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentRefinement_in_entryRuleComponentRefinement759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentRefinement769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelRefinement_in_ruleComponentRefinement816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonRefinement_in_ruleComponentRefinement843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonRefinement_in_entryRuleButtonRefinement878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonRefinement888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleButtonRefinement931 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleButtonRefinement956 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleButtonRefinement973 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleButtonRefinement991 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleButtonProperties_in_ruleButtonRefinement1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelRefinement_in_entryRuleLabelRefinement1050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelRefinement1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleLabelRefinement1103 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleLabelRefinement1128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabelRefinement1145 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleLabelRefinement1163 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleLabelProperties_in_ruleLabelRefinement1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleProperty1269 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProperty1286 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleProperty1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsedDescriptions_in_entryRuleUsedDescriptions1340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsedDescriptions1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleUsedDescriptions1387 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleDescriptionType_in_ruleUsedDescriptions1408 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_24_in_ruleUsedDescriptions1421 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUsedDescriptions1438 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleUsedDescriptions1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescriptionType_in_entryRuleDescriptionType1493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescriptionType1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIDescriptionImport_in_ruleDescriptionType1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexComponent_in_ruleDescriptionType1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition1612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDefinition_in_ruleDefinition1668 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDefinition1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition1716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTypeDefinition1763 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypeDefinition1784 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTypeDefinition1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1832 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleType1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleType1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIDescriptionImport_in_entryRuleUIDescriptionImport1966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIDescriptionImport1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUIDescriptionImport2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexComponent_in_entryRuleComplexComponent2057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexComponent2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiselection_in_ruleComplexComponent2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabViewDefinition_in_entryRuleTabViewDefinition2147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabViewDefinition2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleTabViewDefinition2200 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_ruleTabDefinition_in_ruleTabViewDefinition2234 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleTabViewDefinition2247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTabViewDefinition2264 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleTabViewDefinition2282 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_ruleTabViewDefinition2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabDefinition_in_entryRuleTabDefinition2341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabDefinition2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TABNAME_in_ruleTabDefinition2392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiselection_in_entryRuleMultiselection2432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiselection2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleMultiselection2485 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_INPUT_DESCRIPTION_in_ruleMultiselection2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDefinition_in_entryRuleComponentDefinition2557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentDefinition2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelDefinition_in_ruleComponentDefinition2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonDefinition_in_ruleComponentDefinition2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfieldDefinition_in_ruleComponentDefinition2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextareaDefinition_in_ruleComponentDefinition2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreeDefinition_in_ruleComponentDefinition2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableDefinition_in_ruleComponentDefinition2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabViewDefinition_in_ruleComponentDefinition2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterchangeableDefinition_in_ruleComponentDefinition2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfieldDefinition_in_entryRuleTextfieldDefinition2838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextfieldDefinition2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleTextfieldDefinition2891 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleTextfieldDefinition2916 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextfieldDefinition2933 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleTextfieldDefinition2951 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleTextfieldProperties_in_ruleTextfieldDefinition2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfieldProperties_in_entryRuleTextfieldProperties3010 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextfieldProperties3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_ruleTextfieldProperties3066 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_31_in_ruleTextfieldProperties3079 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextfieldProperties3096 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleTextfieldProperties3116 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleTextfieldProperties3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextareaDefinition_in_entryRuleTextareaDefinition3176 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextareaDefinition3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleTextareaDefinition3229 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleTextareaDefinition3254 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextareaDefinition3271 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleTextareaDefinition3289 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleTextareaProperties_in_ruleTextareaDefinition3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextareaProperties_in_entryRuleTextareaProperties3348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextareaProperties3358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_ruleTextareaProperties3404 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_31_in_ruleTextareaProperties3417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextareaProperties3434 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleTextareaProperties3454 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleTextareaProperties3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreeDefinition_in_entryRuleTreeDefinition3514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTreeDefinition3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleTreeDefinition3567 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INPUT_DESCRIPTION_in_ruleTreeDefinition3597 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleTreeDefinition3614 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTreeDefinition3631 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleTreeDefinition3649 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_ruleTreeDefinition3670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableDefinition_in_entryRuleTableDefinition3708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableDefinition3718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleTableDefinition3761 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INPUT_DESCRIPTION_in_ruleTableDefinition3791 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleTableDefinition3808 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTableDefinition3825 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleTableDefinition3843 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_ruleTableDefinition3864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterchangeableDefinition_in_entryRuleInterchangeableDefinition3902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterchangeableDefinition3912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleInterchangeableDefinition3955 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleInterchangeableDefinition3980 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInterchangeableDefinition3997 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleInterchangeableDefinition4015 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_ruleInterchangeableDefinition4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonDefinition_in_entryRuleButtonDefinition4074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonDefinition4084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleButtonDefinition4127 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleButtonDefinition4152 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleButtonDefinition4169 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleButtonProperties_in_ruleButtonDefinition4195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonProperties_in_entryRuleButtonProperties4232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonProperties4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_ruleButtonProperties4288 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleButtonProperties4301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleButtonProperties4318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_entryRuleCommonProperties4361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonProperties4371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCommonProperties4408 = new BitSet(new long[]{0x000001A000000002L});
    public static final BitSet FOLLOW_37_in_ruleCommonProperties4427 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleCommonProperties4452 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCommonProperties4469 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_39_in_ruleCommonProperties4495 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleCommonProperties4520 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCommonProperties4537 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleCommonProperties4563 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleCommonProperties4588 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleInteractiontype_in_ruleCommonProperties4609 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_ruleLabelDefinition_in_entryRuleLabelDefinition4648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelDefinition4658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleLabelDefinition4701 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleLabelDefinition4726 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabelDefinition4743 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleLabelDefinition4761 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleLabelProperties_in_ruleLabelDefinition4782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelProperties_in_entryRuleLabelProperties4820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelProperties4830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_ruleLabelProperties4876 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleLabelProperties4889 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabelProperties4906 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleLabelProperties4929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractiontype_in_entryRuleInteractiontype4980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractiontype4990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleInteractiontype5034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleInteractiontype5063 = new BitSet(new long[]{0x0000000000000002L});

}