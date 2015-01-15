package org.deg.xtext.gui.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.deg.xtext.gui.services.GuiDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGuiDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_TABNAME", "RULE_INPUT_DESCRIPTION", "RULE_BOOLEAN", "RULE_WS", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'WINDOW'", "'INNERCOMPLEX'", "'IfActivator'", "'IfTextDisplay'", "'get layout from:'", "';'", "':'", "'from:'", "'->'", "'get properties from:'", "'use:'", "'as:'", "'type: '", "'text='", "'editable='", "'='", "'as'", "'Structure'", "'Button'", "'Label'", "'TabView'", "'Multiselection'", "'Textfield'", "'Textarea'", "'Tree'", "'Table'", "'Interchangeable Area'", "'propertyKey'", "'layoutKey'", "'interactiontype'", "'LabelProperty'"
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
    public String getGrammarFileName() { return "../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g"; }


     
     	private GuiDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(GuiDSLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleUIDescription"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:60:1: entryRuleUIDescription : ruleUIDescription EOF ;
    public final void entryRuleUIDescription() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:61:1: ( ruleUIDescription EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:62:1: ruleUIDescription EOF
            {
             before(grammarAccess.getUIDescriptionRule()); 
            pushFollow(FOLLOW_ruleUIDescription_in_entryRuleUIDescription61);
            ruleUIDescription();

            state._fsp--;

             after(grammarAccess.getUIDescriptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIDescription68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUIDescription"


    // $ANTLR start "ruleUIDescription"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:69:1: ruleUIDescription : ( ( rule__UIDescription__Group__0 ) ) ;
    public final void ruleUIDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:73:2: ( ( ( rule__UIDescription__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:74:1: ( ( rule__UIDescription__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:74:1: ( ( rule__UIDescription__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:75:1: ( rule__UIDescription__Group__0 )
            {
             before(grammarAccess.getUIDescriptionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:76:1: ( rule__UIDescription__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:76:2: rule__UIDescription__Group__0
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__0_in_ruleUIDescription94);
            rule__UIDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUIDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUIDescription"


    // $ANTLR start "entryRuleLayout"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:88:1: entryRuleLayout : ruleLayout EOF ;
    public final void entryRuleLayout() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:89:1: ( ruleLayout EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:90:1: ruleLayout EOF
            {
             before(grammarAccess.getLayoutRule()); 
            pushFollow(FOLLOW_ruleLayout_in_entryRuleLayout121);
            ruleLayout();

            state._fsp--;

             after(grammarAccess.getLayoutRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayout128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLayout"


    // $ANTLR start "ruleLayout"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:97:1: ruleLayout : ( ( rule__Layout__Group__0 ) ) ;
    public final void ruleLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:101:2: ( ( ( rule__Layout__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:102:1: ( ( rule__Layout__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:102:1: ( ( rule__Layout__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:103:1: ( rule__Layout__Group__0 )
            {
             before(grammarAccess.getLayoutAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:104:1: ( rule__Layout__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:104:2: rule__Layout__Group__0
            {
            pushFollow(FOLLOW_rule__Layout__Group__0_in_ruleLayout154);
            rule__Layout__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLayoutAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayout"


    // $ANTLR start "entryRuleStructure"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:116:1: entryRuleStructure : ruleStructure EOF ;
    public final void entryRuleStructure() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:117:1: ( ruleStructure EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:118:1: ruleStructure EOF
            {
             before(grammarAccess.getStructureRule()); 
            pushFollow(FOLLOW_ruleStructure_in_entryRuleStructure181);
            ruleStructure();

            state._fsp--;

             after(grammarAccess.getStructureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructure188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStructure"


    // $ANTLR start "ruleStructure"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:125:1: ruleStructure : ( ( rule__Structure__Group__0 ) ) ;
    public final void ruleStructure() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:129:2: ( ( ( rule__Structure__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:130:1: ( ( rule__Structure__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:130:1: ( ( rule__Structure__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:131:1: ( rule__Structure__Group__0 )
            {
             before(grammarAccess.getStructureAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:132:1: ( rule__Structure__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:132:2: rule__Structure__Group__0
            {
            pushFollow(FOLLOW_rule__Structure__Group__0_in_ruleStructure214);
            rule__Structure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStructureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStructure"


    // $ANTLR start "entryRuleElement"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:144:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:145:1: ( ruleElement EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:146:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement241);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:153:1: ruleElement : ( ( rule__Element__IdAssignment ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:157:2: ( ( ( rule__Element__IdAssignment ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:158:1: ( ( rule__Element__IdAssignment ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:158:1: ( ( rule__Element__IdAssignment ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:159:1: ( rule__Element__IdAssignment )
            {
             before(grammarAccess.getElementAccess().getIdAssignment()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:160:1: ( rule__Element__IdAssignment )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:160:2: rule__Element__IdAssignment
            {
            pushFollow(FOLLOW_rule__Element__IdAssignment_in_ruleElement274);
            rule__Element__IdAssignment();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getIdAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleRefinement"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:172:1: entryRuleRefinement : ruleRefinement EOF ;
    public final void entryRuleRefinement() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:173:1: ( ruleRefinement EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:174:1: ruleRefinement EOF
            {
             before(grammarAccess.getRefinementRule()); 
            pushFollow(FOLLOW_ruleRefinement_in_entryRuleRefinement301);
            ruleRefinement();

            state._fsp--;

             after(grammarAccess.getRefinementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefinement308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRefinement"


    // $ANTLR start "ruleRefinement"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:181:1: ruleRefinement : ( ( rule__Refinement__Group__0 ) ) ;
    public final void ruleRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:185:2: ( ( ( rule__Refinement__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:186:1: ( ( rule__Refinement__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:186:1: ( ( rule__Refinement__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:187:1: ( rule__Refinement__Group__0 )
            {
             before(grammarAccess.getRefinementAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:188:1: ( rule__Refinement__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:188:2: rule__Refinement__Group__0
            {
            pushFollow(FOLLOW_rule__Refinement__Group__0_in_ruleRefinement334);
            rule__Refinement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRefinementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRefinement"


    // $ANTLR start "entryRuleComponentRefinement"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:200:1: entryRuleComponentRefinement : ruleComponentRefinement EOF ;
    public final void entryRuleComponentRefinement() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:201:1: ( ruleComponentRefinement EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:202:1: ruleComponentRefinement EOF
            {
             before(grammarAccess.getComponentRefinementRule()); 
            pushFollow(FOLLOW_ruleComponentRefinement_in_entryRuleComponentRefinement361);
            ruleComponentRefinement();

            state._fsp--;

             after(grammarAccess.getComponentRefinementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentRefinement368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponentRefinement"


    // $ANTLR start "ruleComponentRefinement"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:209:1: ruleComponentRefinement : ( ( rule__ComponentRefinement__Alternatives ) ) ;
    public final void ruleComponentRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:213:2: ( ( ( rule__ComponentRefinement__Alternatives ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:214:1: ( ( rule__ComponentRefinement__Alternatives ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:214:1: ( ( rule__ComponentRefinement__Alternatives ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:215:1: ( rule__ComponentRefinement__Alternatives )
            {
             before(grammarAccess.getComponentRefinementAccess().getAlternatives()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:216:1: ( rule__ComponentRefinement__Alternatives )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:216:2: rule__ComponentRefinement__Alternatives
            {
            pushFollow(FOLLOW_rule__ComponentRefinement__Alternatives_in_ruleComponentRefinement394);
            rule__ComponentRefinement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComponentRefinementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentRefinement"


    // $ANTLR start "entryRuleButtonRefinement"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:228:1: entryRuleButtonRefinement : ruleButtonRefinement EOF ;
    public final void entryRuleButtonRefinement() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:229:1: ( ruleButtonRefinement EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:230:1: ruleButtonRefinement EOF
            {
             before(grammarAccess.getButtonRefinementRule()); 
            pushFollow(FOLLOW_ruleButtonRefinement_in_entryRuleButtonRefinement421);
            ruleButtonRefinement();

            state._fsp--;

             after(grammarAccess.getButtonRefinementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonRefinement428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleButtonRefinement"


    // $ANTLR start "ruleButtonRefinement"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:237:1: ruleButtonRefinement : ( ( rule__ButtonRefinement__Group__0 ) ) ;
    public final void ruleButtonRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:241:2: ( ( ( rule__ButtonRefinement__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:242:1: ( ( rule__ButtonRefinement__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:242:1: ( ( rule__ButtonRefinement__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:243:1: ( rule__ButtonRefinement__Group__0 )
            {
             before(grammarAccess.getButtonRefinementAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:244:1: ( rule__ButtonRefinement__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:244:2: rule__ButtonRefinement__Group__0
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__Group__0_in_ruleButtonRefinement454);
            rule__ButtonRefinement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getButtonRefinementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleButtonRefinement"


    // $ANTLR start "entryRuleLabelRefinement"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:256:1: entryRuleLabelRefinement : ruleLabelRefinement EOF ;
    public final void entryRuleLabelRefinement() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:257:1: ( ruleLabelRefinement EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:258:1: ruleLabelRefinement EOF
            {
             before(grammarAccess.getLabelRefinementRule()); 
            pushFollow(FOLLOW_ruleLabelRefinement_in_entryRuleLabelRefinement481);
            ruleLabelRefinement();

            state._fsp--;

             after(grammarAccess.getLabelRefinementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelRefinement488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLabelRefinement"


    // $ANTLR start "ruleLabelRefinement"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:265:1: ruleLabelRefinement : ( ( rule__LabelRefinement__Group__0 ) ) ;
    public final void ruleLabelRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:269:2: ( ( ( rule__LabelRefinement__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:270:1: ( ( rule__LabelRefinement__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:270:1: ( ( rule__LabelRefinement__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:271:1: ( rule__LabelRefinement__Group__0 )
            {
             before(grammarAccess.getLabelRefinementAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:272:1: ( rule__LabelRefinement__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:272:2: rule__LabelRefinement__Group__0
            {
            pushFollow(FOLLOW_rule__LabelRefinement__Group__0_in_ruleLabelRefinement514);
            rule__LabelRefinement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLabelRefinementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLabelRefinement"


    // $ANTLR start "entryRuleProperty"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:284:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:285:1: ( ruleProperty EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:286:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty541);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:293:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:297:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:298:1: ( ( rule__Property__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:298:1: ( ( rule__Property__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:299:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:300:1: ( rule__Property__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:300:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty574);
            rule__Property__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleUsedDescriptions"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:312:1: entryRuleUsedDescriptions : ruleUsedDescriptions EOF ;
    public final void entryRuleUsedDescriptions() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:313:1: ( ruleUsedDescriptions EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:314:1: ruleUsedDescriptions EOF
            {
             before(grammarAccess.getUsedDescriptionsRule()); 
            pushFollow(FOLLOW_ruleUsedDescriptions_in_entryRuleUsedDescriptions601);
            ruleUsedDescriptions();

            state._fsp--;

             after(grammarAccess.getUsedDescriptionsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsedDescriptions608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUsedDescriptions"


    // $ANTLR start "ruleUsedDescriptions"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:321:1: ruleUsedDescriptions : ( ( rule__UsedDescriptions__Group__0 ) ) ;
    public final void ruleUsedDescriptions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:325:2: ( ( ( rule__UsedDescriptions__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:326:1: ( ( rule__UsedDescriptions__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:326:1: ( ( rule__UsedDescriptions__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:327:1: ( rule__UsedDescriptions__Group__0 )
            {
             before(grammarAccess.getUsedDescriptionsAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:328:1: ( rule__UsedDescriptions__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:328:2: rule__UsedDescriptions__Group__0
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__Group__0_in_ruleUsedDescriptions634);
            rule__UsedDescriptions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUsedDescriptionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUsedDescriptions"


    // $ANTLR start "entryRuleDescriptionType"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:340:1: entryRuleDescriptionType : ruleDescriptionType EOF ;
    public final void entryRuleDescriptionType() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:341:1: ( ruleDescriptionType EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:342:1: ruleDescriptionType EOF
            {
             before(grammarAccess.getDescriptionTypeRule()); 
            pushFollow(FOLLOW_ruleDescriptionType_in_entryRuleDescriptionType661);
            ruleDescriptionType();

            state._fsp--;

             after(grammarAccess.getDescriptionTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescriptionType668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDescriptionType"


    // $ANTLR start "ruleDescriptionType"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:349:1: ruleDescriptionType : ( ( rule__DescriptionType__Alternatives ) ) ;
    public final void ruleDescriptionType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:353:2: ( ( ( rule__DescriptionType__Alternatives ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:354:1: ( ( rule__DescriptionType__Alternatives ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:354:1: ( ( rule__DescriptionType__Alternatives ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:355:1: ( rule__DescriptionType__Alternatives )
            {
             before(grammarAccess.getDescriptionTypeAccess().getAlternatives()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:356:1: ( rule__DescriptionType__Alternatives )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:356:2: rule__DescriptionType__Alternatives
            {
            pushFollow(FOLLOW_rule__DescriptionType__Alternatives_in_ruleDescriptionType694);
            rule__DescriptionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDescriptionType"


    // $ANTLR start "entryRuleDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:368:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:369:1: ( ruleDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:370:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition721);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:377:1: ruleDefinition : ( ( rule__Definition__Group__0 ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:381:2: ( ( ( rule__Definition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:382:1: ( ( rule__Definition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:382:1: ( ( rule__Definition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:383:1: ( rule__Definition__Group__0 )
            {
             before(grammarAccess.getDefinitionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:384:1: ( rule__Definition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:384:2: rule__Definition__Group__0
            {
            pushFollow(FOLLOW_rule__Definition__Group__0_in_ruleDefinition754);
            rule__Definition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleTypeDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:396:1: entryRuleTypeDefinition : ruleTypeDefinition EOF ;
    public final void entryRuleTypeDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:397:1: ( ruleTypeDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:398:1: ruleTypeDefinition EOF
            {
             before(grammarAccess.getTypeDefinitionRule()); 
            pushFollow(FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition781);
            ruleTypeDefinition();

            state._fsp--;

             after(grammarAccess.getTypeDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinition788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeDefinition"


    // $ANTLR start "ruleTypeDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:405:1: ruleTypeDefinition : ( ( rule__TypeDefinition__Group__0 ) ) ;
    public final void ruleTypeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:409:2: ( ( ( rule__TypeDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:410:1: ( ( rule__TypeDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:410:1: ( ( rule__TypeDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:411:1: ( rule__TypeDefinition__Group__0 )
            {
             before(grammarAccess.getTypeDefinitionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:412:1: ( rule__TypeDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:412:2: rule__TypeDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Group__0_in_ruleTypeDefinition814);
            rule__TypeDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeDefinition"


    // $ANTLR start "entryRuleType"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:424:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:425:1: ( ruleType EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:426:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType841);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:433:1: ruleType : ( ( rule__Type__IdAssignment ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:437:2: ( ( ( rule__Type__IdAssignment ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:438:1: ( ( rule__Type__IdAssignment ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:438:1: ( ( rule__Type__IdAssignment ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:439:1: ( rule__Type__IdAssignment )
            {
             before(grammarAccess.getTypeAccess().getIdAssignment()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:440:1: ( rule__Type__IdAssignment )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:440:2: rule__Type__IdAssignment
            {
            pushFollow(FOLLOW_rule__Type__IdAssignment_in_ruleType874);
            rule__Type__IdAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getIdAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleUIDescriptionImport"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:452:1: entryRuleUIDescriptionImport : ruleUIDescriptionImport EOF ;
    public final void entryRuleUIDescriptionImport() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:453:1: ( ruleUIDescriptionImport EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:454:1: ruleUIDescriptionImport EOF
            {
             before(grammarAccess.getUIDescriptionImportRule()); 
            pushFollow(FOLLOW_ruleUIDescriptionImport_in_entryRuleUIDescriptionImport901);
            ruleUIDescriptionImport();

            state._fsp--;

             after(grammarAccess.getUIDescriptionImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIDescriptionImport908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUIDescriptionImport"


    // $ANTLR start "ruleUIDescriptionImport"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:461:1: ruleUIDescriptionImport : ( ( rule__UIDescriptionImport__DescriptionNameAssignment ) ) ;
    public final void ruleUIDescriptionImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:465:2: ( ( ( rule__UIDescriptionImport__DescriptionNameAssignment ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:466:1: ( ( rule__UIDescriptionImport__DescriptionNameAssignment ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:466:1: ( ( rule__UIDescriptionImport__DescriptionNameAssignment ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:467:1: ( rule__UIDescriptionImport__DescriptionNameAssignment )
            {
             before(grammarAccess.getUIDescriptionImportAccess().getDescriptionNameAssignment()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:468:1: ( rule__UIDescriptionImport__DescriptionNameAssignment )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:468:2: rule__UIDescriptionImport__DescriptionNameAssignment
            {
            pushFollow(FOLLOW_rule__UIDescriptionImport__DescriptionNameAssignment_in_ruleUIDescriptionImport934);
            rule__UIDescriptionImport__DescriptionNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getUIDescriptionImportAccess().getDescriptionNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUIDescriptionImport"


    // $ANTLR start "entryRuleComplexComponent"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:480:1: entryRuleComplexComponent : ruleComplexComponent EOF ;
    public final void entryRuleComplexComponent() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:481:1: ( ruleComplexComponent EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:482:1: ruleComplexComponent EOF
            {
             before(grammarAccess.getComplexComponentRule()); 
            pushFollow(FOLLOW_ruleComplexComponent_in_entryRuleComplexComponent961);
            ruleComplexComponent();

            state._fsp--;

             after(grammarAccess.getComplexComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexComponent968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComplexComponent"


    // $ANTLR start "ruleComplexComponent"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:489:1: ruleComplexComponent : ( ruleMultiselection ) ;
    public final void ruleComplexComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:493:2: ( ( ruleMultiselection ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:494:1: ( ruleMultiselection )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:494:1: ( ruleMultiselection )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:495:1: ruleMultiselection
            {
             before(grammarAccess.getComplexComponentAccess().getMultiselectionParserRuleCall()); 
            pushFollow(FOLLOW_ruleMultiselection_in_ruleComplexComponent994);
            ruleMultiselection();

            state._fsp--;

             after(grammarAccess.getComplexComponentAccess().getMultiselectionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexComponent"


    // $ANTLR start "entryRuleTabViewDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:508:1: entryRuleTabViewDefinition : ruleTabViewDefinition EOF ;
    public final void entryRuleTabViewDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:509:1: ( ruleTabViewDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:510:1: ruleTabViewDefinition EOF
            {
             before(grammarAccess.getTabViewDefinitionRule()); 
            pushFollow(FOLLOW_ruleTabViewDefinition_in_entryRuleTabViewDefinition1020);
            ruleTabViewDefinition();

            state._fsp--;

             after(grammarAccess.getTabViewDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabViewDefinition1027); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTabViewDefinition"


    // $ANTLR start "ruleTabViewDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:517:1: ruleTabViewDefinition : ( ( rule__TabViewDefinition__Group__0 ) ) ;
    public final void ruleTabViewDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:521:2: ( ( ( rule__TabViewDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:522:1: ( ( rule__TabViewDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:522:1: ( ( rule__TabViewDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:523:1: ( rule__TabViewDefinition__Group__0 )
            {
             before(grammarAccess.getTabViewDefinitionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:524:1: ( rule__TabViewDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:524:2: rule__TabViewDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__TabViewDefinition__Group__0_in_ruleTabViewDefinition1053);
            rule__TabViewDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTabViewDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTabViewDefinition"


    // $ANTLR start "entryRuleTabDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:536:1: entryRuleTabDefinition : ruleTabDefinition EOF ;
    public final void entryRuleTabDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:537:1: ( ruleTabDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:538:1: ruleTabDefinition EOF
            {
             before(grammarAccess.getTabDefinitionRule()); 
            pushFollow(FOLLOW_ruleTabDefinition_in_entryRuleTabDefinition1080);
            ruleTabDefinition();

            state._fsp--;

             after(grammarAccess.getTabDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabDefinition1087); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTabDefinition"


    // $ANTLR start "ruleTabDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:545:1: ruleTabDefinition : ( ( rule__TabDefinition__NameAssignment ) ) ;
    public final void ruleTabDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:549:2: ( ( ( rule__TabDefinition__NameAssignment ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:550:1: ( ( rule__TabDefinition__NameAssignment ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:550:1: ( ( rule__TabDefinition__NameAssignment ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:551:1: ( rule__TabDefinition__NameAssignment )
            {
             before(grammarAccess.getTabDefinitionAccess().getNameAssignment()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:552:1: ( rule__TabDefinition__NameAssignment )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:552:2: rule__TabDefinition__NameAssignment
            {
            pushFollow(FOLLOW_rule__TabDefinition__NameAssignment_in_ruleTabDefinition1113);
            rule__TabDefinition__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTabDefinitionAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTabDefinition"


    // $ANTLR start "entryRuleMultiselection"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:564:1: entryRuleMultiselection : ruleMultiselection EOF ;
    public final void entryRuleMultiselection() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:565:1: ( ruleMultiselection EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:566:1: ruleMultiselection EOF
            {
             before(grammarAccess.getMultiselectionRule()); 
            pushFollow(FOLLOW_ruleMultiselection_in_entryRuleMultiselection1140);
            ruleMultiselection();

            state._fsp--;

             after(grammarAccess.getMultiselectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiselection1147); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiselection"


    // $ANTLR start "ruleMultiselection"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:573:1: ruleMultiselection : ( ( rule__Multiselection__Group__0 ) ) ;
    public final void ruleMultiselection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:577:2: ( ( ( rule__Multiselection__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:578:1: ( ( rule__Multiselection__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:578:1: ( ( rule__Multiselection__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:579:1: ( rule__Multiselection__Group__0 )
            {
             before(grammarAccess.getMultiselectionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:580:1: ( rule__Multiselection__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:580:2: rule__Multiselection__Group__0
            {
            pushFollow(FOLLOW_rule__Multiselection__Group__0_in_ruleMultiselection1173);
            rule__Multiselection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiselectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiselection"


    // $ANTLR start "entryRuleComponentDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:592:1: entryRuleComponentDefinition : ruleComponentDefinition EOF ;
    public final void entryRuleComponentDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:593:1: ( ruleComponentDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:594:1: ruleComponentDefinition EOF
            {
             before(grammarAccess.getComponentDefinitionRule()); 
            pushFollow(FOLLOW_ruleComponentDefinition_in_entryRuleComponentDefinition1200);
            ruleComponentDefinition();

            state._fsp--;

             after(grammarAccess.getComponentDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentDefinition1207); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponentDefinition"


    // $ANTLR start "ruleComponentDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:601:1: ruleComponentDefinition : ( ( rule__ComponentDefinition__Alternatives ) ) ;
    public final void ruleComponentDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:605:2: ( ( ( rule__ComponentDefinition__Alternatives ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:606:1: ( ( rule__ComponentDefinition__Alternatives ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:606:1: ( ( rule__ComponentDefinition__Alternatives ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:607:1: ( rule__ComponentDefinition__Alternatives )
            {
             before(grammarAccess.getComponentDefinitionAccess().getAlternatives()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:608:1: ( rule__ComponentDefinition__Alternatives )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:608:2: rule__ComponentDefinition__Alternatives
            {
            pushFollow(FOLLOW_rule__ComponentDefinition__Alternatives_in_ruleComponentDefinition1233);
            rule__ComponentDefinition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComponentDefinitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentDefinition"


    // $ANTLR start "entryRuleTextfieldDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:620:1: entryRuleTextfieldDefinition : ruleTextfieldDefinition EOF ;
    public final void entryRuleTextfieldDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:621:1: ( ruleTextfieldDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:622:1: ruleTextfieldDefinition EOF
            {
             before(grammarAccess.getTextfieldDefinitionRule()); 
            pushFollow(FOLLOW_ruleTextfieldDefinition_in_entryRuleTextfieldDefinition1260);
            ruleTextfieldDefinition();

            state._fsp--;

             after(grammarAccess.getTextfieldDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextfieldDefinition1267); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextfieldDefinition"


    // $ANTLR start "ruleTextfieldDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:629:1: ruleTextfieldDefinition : ( ( rule__TextfieldDefinition__Group__0 ) ) ;
    public final void ruleTextfieldDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:633:2: ( ( ( rule__TextfieldDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:634:1: ( ( rule__TextfieldDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:634:1: ( ( rule__TextfieldDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:635:1: ( rule__TextfieldDefinition__Group__0 )
            {
             before(grammarAccess.getTextfieldDefinitionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:636:1: ( rule__TextfieldDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:636:2: rule__TextfieldDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__0_in_ruleTextfieldDefinition1293);
            rule__TextfieldDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextfieldDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextfieldDefinition"


    // $ANTLR start "entryRuleTextfieldProperties"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:648:1: entryRuleTextfieldProperties : ruleTextfieldProperties EOF ;
    public final void entryRuleTextfieldProperties() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:649:1: ( ruleTextfieldProperties EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:650:1: ruleTextfieldProperties EOF
            {
             before(grammarAccess.getTextfieldPropertiesRule()); 
            pushFollow(FOLLOW_ruleTextfieldProperties_in_entryRuleTextfieldProperties1320);
            ruleTextfieldProperties();

            state._fsp--;

             after(grammarAccess.getTextfieldPropertiesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextfieldProperties1327); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextfieldProperties"


    // $ANTLR start "ruleTextfieldProperties"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:657:1: ruleTextfieldProperties : ( ( rule__TextfieldProperties__Group__0 ) ) ;
    public final void ruleTextfieldProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:661:2: ( ( ( rule__TextfieldProperties__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:662:1: ( ( rule__TextfieldProperties__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:662:1: ( ( rule__TextfieldProperties__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:663:1: ( rule__TextfieldProperties__Group__0 )
            {
             before(grammarAccess.getTextfieldPropertiesAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:664:1: ( rule__TextfieldProperties__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:664:2: rule__TextfieldProperties__Group__0
            {
            pushFollow(FOLLOW_rule__TextfieldProperties__Group__0_in_ruleTextfieldProperties1353);
            rule__TextfieldProperties__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextfieldPropertiesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextfieldProperties"


    // $ANTLR start "entryRuleTextareaDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:676:1: entryRuleTextareaDefinition : ruleTextareaDefinition EOF ;
    public final void entryRuleTextareaDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:677:1: ( ruleTextareaDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:678:1: ruleTextareaDefinition EOF
            {
             before(grammarAccess.getTextareaDefinitionRule()); 
            pushFollow(FOLLOW_ruleTextareaDefinition_in_entryRuleTextareaDefinition1380);
            ruleTextareaDefinition();

            state._fsp--;

             after(grammarAccess.getTextareaDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextareaDefinition1387); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextareaDefinition"


    // $ANTLR start "ruleTextareaDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:685:1: ruleTextareaDefinition : ( ( rule__TextareaDefinition__Group__0 ) ) ;
    public final void ruleTextareaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:689:2: ( ( ( rule__TextareaDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:690:1: ( ( rule__TextareaDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:690:1: ( ( rule__TextareaDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:691:1: ( rule__TextareaDefinition__Group__0 )
            {
             before(grammarAccess.getTextareaDefinitionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:692:1: ( rule__TextareaDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:692:2: rule__TextareaDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__TextareaDefinition__Group__0_in_ruleTextareaDefinition1413);
            rule__TextareaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextareaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextareaDefinition"


    // $ANTLR start "entryRuleTextareaProperties"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:704:1: entryRuleTextareaProperties : ruleTextareaProperties EOF ;
    public final void entryRuleTextareaProperties() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:705:1: ( ruleTextareaProperties EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:706:1: ruleTextareaProperties EOF
            {
             before(grammarAccess.getTextareaPropertiesRule()); 
            pushFollow(FOLLOW_ruleTextareaProperties_in_entryRuleTextareaProperties1440);
            ruleTextareaProperties();

            state._fsp--;

             after(grammarAccess.getTextareaPropertiesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextareaProperties1447); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextareaProperties"


    // $ANTLR start "ruleTextareaProperties"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:713:1: ruleTextareaProperties : ( ( rule__TextareaProperties__Group__0 ) ) ;
    public final void ruleTextareaProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:717:2: ( ( ( rule__TextareaProperties__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:718:1: ( ( rule__TextareaProperties__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:718:1: ( ( rule__TextareaProperties__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:719:1: ( rule__TextareaProperties__Group__0 )
            {
             before(grammarAccess.getTextareaPropertiesAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:720:1: ( rule__TextareaProperties__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:720:2: rule__TextareaProperties__Group__0
            {
            pushFollow(FOLLOW_rule__TextareaProperties__Group__0_in_ruleTextareaProperties1473);
            rule__TextareaProperties__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextareaPropertiesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextareaProperties"


    // $ANTLR start "entryRuleTreeDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:732:1: entryRuleTreeDefinition : ruleTreeDefinition EOF ;
    public final void entryRuleTreeDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:733:1: ( ruleTreeDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:734:1: ruleTreeDefinition EOF
            {
             before(grammarAccess.getTreeDefinitionRule()); 
            pushFollow(FOLLOW_ruleTreeDefinition_in_entryRuleTreeDefinition1500);
            ruleTreeDefinition();

            state._fsp--;

             after(grammarAccess.getTreeDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTreeDefinition1507); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTreeDefinition"


    // $ANTLR start "ruleTreeDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:741:1: ruleTreeDefinition : ( ( rule__TreeDefinition__Group__0 ) ) ;
    public final void ruleTreeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:745:2: ( ( ( rule__TreeDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:746:1: ( ( rule__TreeDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:746:1: ( ( rule__TreeDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:747:1: ( rule__TreeDefinition__Group__0 )
            {
             before(grammarAccess.getTreeDefinitionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:748:1: ( rule__TreeDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:748:2: rule__TreeDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group__0_in_ruleTreeDefinition1533);
            rule__TreeDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTreeDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTreeDefinition"


    // $ANTLR start "entryRuleTableDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:760:1: entryRuleTableDefinition : ruleTableDefinition EOF ;
    public final void entryRuleTableDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:761:1: ( ruleTableDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:762:1: ruleTableDefinition EOF
            {
             before(grammarAccess.getTableDefinitionRule()); 
            pushFollow(FOLLOW_ruleTableDefinition_in_entryRuleTableDefinition1560);
            ruleTableDefinition();

            state._fsp--;

             after(grammarAccess.getTableDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableDefinition1567); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTableDefinition"


    // $ANTLR start "ruleTableDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:769:1: ruleTableDefinition : ( ( rule__TableDefinition__Group__0 ) ) ;
    public final void ruleTableDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:773:2: ( ( ( rule__TableDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:774:1: ( ( rule__TableDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:774:1: ( ( rule__TableDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:775:1: ( rule__TableDefinition__Group__0 )
            {
             before(grammarAccess.getTableDefinitionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:776:1: ( rule__TableDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:776:2: rule__TableDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group__0_in_ruleTableDefinition1593);
            rule__TableDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTableDefinition"


    // $ANTLR start "entryRuleInterchangeableDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:788:1: entryRuleInterchangeableDefinition : ruleInterchangeableDefinition EOF ;
    public final void entryRuleInterchangeableDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:789:1: ( ruleInterchangeableDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:790:1: ruleInterchangeableDefinition EOF
            {
             before(grammarAccess.getInterchangeableDefinitionRule()); 
            pushFollow(FOLLOW_ruleInterchangeableDefinition_in_entryRuleInterchangeableDefinition1620);
            ruleInterchangeableDefinition();

            state._fsp--;

             after(grammarAccess.getInterchangeableDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterchangeableDefinition1627); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterchangeableDefinition"


    // $ANTLR start "ruleInterchangeableDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:797:1: ruleInterchangeableDefinition : ( ( rule__InterchangeableDefinition__Group__0 ) ) ;
    public final void ruleInterchangeableDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:801:2: ( ( ( rule__InterchangeableDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:802:1: ( ( rule__InterchangeableDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:802:1: ( ( rule__InterchangeableDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:803:1: ( rule__InterchangeableDefinition__Group__0 )
            {
             before(grammarAccess.getInterchangeableDefinitionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:804:1: ( rule__InterchangeableDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:804:2: rule__InterchangeableDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__InterchangeableDefinition__Group__0_in_ruleInterchangeableDefinition1653);
            rule__InterchangeableDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterchangeableDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterchangeableDefinition"


    // $ANTLR start "entryRuleButtonDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:816:1: entryRuleButtonDefinition : ruleButtonDefinition EOF ;
    public final void entryRuleButtonDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:817:1: ( ruleButtonDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:818:1: ruleButtonDefinition EOF
            {
             before(grammarAccess.getButtonDefinitionRule()); 
            pushFollow(FOLLOW_ruleButtonDefinition_in_entryRuleButtonDefinition1680);
            ruleButtonDefinition();

            state._fsp--;

             after(grammarAccess.getButtonDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonDefinition1687); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleButtonDefinition"


    // $ANTLR start "ruleButtonDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:825:1: ruleButtonDefinition : ( ( rule__ButtonDefinition__Group__0 ) ) ;
    public final void ruleButtonDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:829:2: ( ( ( rule__ButtonDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:830:1: ( ( rule__ButtonDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:830:1: ( ( rule__ButtonDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:831:1: ( rule__ButtonDefinition__Group__0 )
            {
             before(grammarAccess.getButtonDefinitionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:832:1: ( rule__ButtonDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:832:2: rule__ButtonDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__0_in_ruleButtonDefinition1713);
            rule__ButtonDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getButtonDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleButtonDefinition"


    // $ANTLR start "entryRuleButtonProperties"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:844:1: entryRuleButtonProperties : ruleButtonProperties EOF ;
    public final void entryRuleButtonProperties() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:845:1: ( ruleButtonProperties EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:846:1: ruleButtonProperties EOF
            {
             before(grammarAccess.getButtonPropertiesRule()); 
            pushFollow(FOLLOW_ruleButtonProperties_in_entryRuleButtonProperties1740);
            ruleButtonProperties();

            state._fsp--;

             after(grammarAccess.getButtonPropertiesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonProperties1747); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleButtonProperties"


    // $ANTLR start "ruleButtonProperties"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:853:1: ruleButtonProperties : ( ( rule__ButtonProperties__Group__0 ) ) ;
    public final void ruleButtonProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:857:2: ( ( ( rule__ButtonProperties__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:858:1: ( ( rule__ButtonProperties__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:858:1: ( ( rule__ButtonProperties__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:859:1: ( rule__ButtonProperties__Group__0 )
            {
             before(grammarAccess.getButtonPropertiesAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:860:1: ( rule__ButtonProperties__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:860:2: rule__ButtonProperties__Group__0
            {
            pushFollow(FOLLOW_rule__ButtonProperties__Group__0_in_ruleButtonProperties1773);
            rule__ButtonProperties__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getButtonPropertiesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleButtonProperties"


    // $ANTLR start "entryRuleCommonProperties"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:872:1: entryRuleCommonProperties : ruleCommonProperties EOF ;
    public final void entryRuleCommonProperties() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:873:1: ( ruleCommonProperties EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:874:1: ruleCommonProperties EOF
            {
             before(grammarAccess.getCommonPropertiesRule()); 
            pushFollow(FOLLOW_ruleCommonProperties_in_entryRuleCommonProperties1800);
            ruleCommonProperties();

            state._fsp--;

             after(grammarAccess.getCommonPropertiesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonProperties1807); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommonProperties"


    // $ANTLR start "ruleCommonProperties"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:881:1: ruleCommonProperties : ( ( rule__CommonProperties__Group__0 ) ) ;
    public final void ruleCommonProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:885:2: ( ( ( rule__CommonProperties__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:886:1: ( ( rule__CommonProperties__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:886:1: ( ( rule__CommonProperties__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:887:1: ( rule__CommonProperties__Group__0 )
            {
             before(grammarAccess.getCommonPropertiesAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:888:1: ( rule__CommonProperties__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:888:2: rule__CommonProperties__Group__0
            {
            pushFollow(FOLLOW_rule__CommonProperties__Group__0_in_ruleCommonProperties1833);
            rule__CommonProperties__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommonPropertiesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommonProperties"


    // $ANTLR start "entryRuleLabelDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:900:1: entryRuleLabelDefinition : ruleLabelDefinition EOF ;
    public final void entryRuleLabelDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:901:1: ( ruleLabelDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:902:1: ruleLabelDefinition EOF
            {
             before(grammarAccess.getLabelDefinitionRule()); 
            pushFollow(FOLLOW_ruleLabelDefinition_in_entryRuleLabelDefinition1860);
            ruleLabelDefinition();

            state._fsp--;

             after(grammarAccess.getLabelDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelDefinition1867); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLabelDefinition"


    // $ANTLR start "ruleLabelDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:909:1: ruleLabelDefinition : ( ( rule__LabelDefinition__Group__0 ) ) ;
    public final void ruleLabelDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:913:2: ( ( ( rule__LabelDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:914:1: ( ( rule__LabelDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:914:1: ( ( rule__LabelDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:915:1: ( rule__LabelDefinition__Group__0 )
            {
             before(grammarAccess.getLabelDefinitionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:916:1: ( rule__LabelDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:916:2: rule__LabelDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__0_in_ruleLabelDefinition1893);
            rule__LabelDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLabelDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLabelDefinition"


    // $ANTLR start "entryRuleLabelProperties"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:928:1: entryRuleLabelProperties : ruleLabelProperties EOF ;
    public final void entryRuleLabelProperties() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:929:1: ( ruleLabelProperties EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:930:1: ruleLabelProperties EOF
            {
             before(grammarAccess.getLabelPropertiesRule()); 
            pushFollow(FOLLOW_ruleLabelProperties_in_entryRuleLabelProperties1920);
            ruleLabelProperties();

            state._fsp--;

             after(grammarAccess.getLabelPropertiesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelProperties1927); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLabelProperties"


    // $ANTLR start "ruleLabelProperties"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:937:1: ruleLabelProperties : ( ( rule__LabelProperties__Group__0 ) ) ;
    public final void ruleLabelProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:941:2: ( ( ( rule__LabelProperties__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:942:1: ( ( rule__LabelProperties__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:942:1: ( ( rule__LabelProperties__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:943:1: ( rule__LabelProperties__Group__0 )
            {
             before(grammarAccess.getLabelPropertiesAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:944:1: ( rule__LabelProperties__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:944:2: rule__LabelProperties__Group__0
            {
            pushFollow(FOLLOW_rule__LabelProperties__Group__0_in_ruleLabelProperties1953);
            rule__LabelProperties__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLabelPropertiesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLabelProperties"


    // $ANTLR start "entryRuleInteractiontype"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:956:1: entryRuleInteractiontype : ruleInteractiontype EOF ;
    public final void entryRuleInteractiontype() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:957:1: ( ruleInteractiontype EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:958:1: ruleInteractiontype EOF
            {
             before(grammarAccess.getInteractiontypeRule()); 
            pushFollow(FOLLOW_ruleInteractiontype_in_entryRuleInteractiontype1980);
            ruleInteractiontype();

            state._fsp--;

             after(grammarAccess.getInteractiontypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractiontype1987); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInteractiontype"


    // $ANTLR start "ruleInteractiontype"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:965:1: ruleInteractiontype : ( ( rule__Interactiontype__IdAssignment ) ) ;
    public final void ruleInteractiontype() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:969:2: ( ( ( rule__Interactiontype__IdAssignment ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:970:1: ( ( rule__Interactiontype__IdAssignment ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:970:1: ( ( rule__Interactiontype__IdAssignment ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:971:1: ( rule__Interactiontype__IdAssignment )
            {
             before(grammarAccess.getInteractiontypeAccess().getIdAssignment()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:972:1: ( rule__Interactiontype__IdAssignment )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:972:2: rule__Interactiontype__IdAssignment
            {
            pushFollow(FOLLOW_rule__Interactiontype__IdAssignment_in_ruleInteractiontype2013);
            rule__Interactiontype__IdAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInteractiontypeAccess().getIdAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInteractiontype"


    // $ANTLR start "rule__ComponentRefinement__Alternatives"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:984:1: rule__ComponentRefinement__Alternatives : ( ( ruleLabelRefinement ) | ( ruleButtonRefinement ) );
    public final void rule__ComponentRefinement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:988:1: ( ( ruleLabelRefinement ) | ( ruleButtonRefinement ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==33) ) {
                alt1=1;
            }
            else if ( (LA1_0==32) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:989:1: ( ruleLabelRefinement )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:989:1: ( ruleLabelRefinement )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:990:1: ruleLabelRefinement
                    {
                     before(grammarAccess.getComponentRefinementAccess().getLabelRefinementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLabelRefinement_in_rule__ComponentRefinement__Alternatives2049);
                    ruleLabelRefinement();

                    state._fsp--;

                     after(grammarAccess.getComponentRefinementAccess().getLabelRefinementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:995:6: ( ruleButtonRefinement )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:995:6: ( ruleButtonRefinement )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:996:1: ruleButtonRefinement
                    {
                     before(grammarAccess.getComponentRefinementAccess().getButtonRefinementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleButtonRefinement_in_rule__ComponentRefinement__Alternatives2066);
                    ruleButtonRefinement();

                    state._fsp--;

                     after(grammarAccess.getComponentRefinementAccess().getButtonRefinementParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentRefinement__Alternatives"


    // $ANTLR start "rule__DescriptionType__Alternatives"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1006:1: rule__DescriptionType__Alternatives : ( ( ruleUIDescriptionImport ) | ( ruleComplexComponent ) );
    public final void rule__DescriptionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1010:1: ( ( ruleUIDescriptionImport ) | ( ruleComplexComponent ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==35) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1011:1: ( ruleUIDescriptionImport )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1011:1: ( ruleUIDescriptionImport )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1012:1: ruleUIDescriptionImport
                    {
                     before(grammarAccess.getDescriptionTypeAccess().getUIDescriptionImportParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleUIDescriptionImport_in_rule__DescriptionType__Alternatives2098);
                    ruleUIDescriptionImport();

                    state._fsp--;

                     after(grammarAccess.getDescriptionTypeAccess().getUIDescriptionImportParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1017:6: ( ruleComplexComponent )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1017:6: ( ruleComplexComponent )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1018:1: ruleComplexComponent
                    {
                     before(grammarAccess.getDescriptionTypeAccess().getComplexComponentParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleComplexComponent_in_rule__DescriptionType__Alternatives2115);
                    ruleComplexComponent();

                    state._fsp--;

                     after(grammarAccess.getDescriptionTypeAccess().getComplexComponentParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionType__Alternatives"


    // $ANTLR start "rule__Type__IdAlternatives_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1028:1: rule__Type__IdAlternatives_0 : ( ( 'WINDOW' ) | ( 'INNERCOMPLEX' ) );
    public final void rule__Type__IdAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1032:1: ( ( 'WINDOW' ) | ( 'INNERCOMPLEX' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1033:1: ( 'WINDOW' )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1033:1: ( 'WINDOW' )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1034:1: 'WINDOW'
                    {
                     before(grammarAccess.getTypeAccess().getIdWINDOWKeyword_0_0()); 
                    match(input,14,FOLLOW_14_in_rule__Type__IdAlternatives_02148); 
                     after(grammarAccess.getTypeAccess().getIdWINDOWKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1041:6: ( 'INNERCOMPLEX' )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1041:6: ( 'INNERCOMPLEX' )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1042:1: 'INNERCOMPLEX'
                    {
                     before(grammarAccess.getTypeAccess().getIdINNERCOMPLEXKeyword_0_1()); 
                    match(input,15,FOLLOW_15_in_rule__Type__IdAlternatives_02168); 
                     after(grammarAccess.getTypeAccess().getIdINNERCOMPLEXKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__IdAlternatives_0"


    // $ANTLR start "rule__ComponentDefinition__Alternatives"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1054:1: rule__ComponentDefinition__Alternatives : ( ( ruleLabelDefinition ) | ( ruleButtonDefinition ) | ( ruleTextfieldDefinition ) | ( ruleTextareaDefinition ) | ( ruleTreeDefinition ) | ( ruleTableDefinition ) | ( ruleTabViewDefinition ) | ( ruleInterchangeableDefinition ) );
    public final void rule__ComponentDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1058:1: ( ( ruleLabelDefinition ) | ( ruleButtonDefinition ) | ( ruleTextfieldDefinition ) | ( ruleTextareaDefinition ) | ( ruleTreeDefinition ) | ( ruleTableDefinition ) | ( ruleTabViewDefinition ) | ( ruleInterchangeableDefinition ) )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt4=1;
                }
                break;
            case 32:
                {
                alt4=2;
                }
                break;
            case 36:
                {
                alt4=3;
                }
                break;
            case 37:
                {
                alt4=4;
                }
                break;
            case 38:
                {
                alt4=5;
                }
                break;
            case 39:
                {
                alt4=6;
                }
                break;
            case 34:
                {
                alt4=7;
                }
                break;
            case 40:
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1059:1: ( ruleLabelDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1059:1: ( ruleLabelDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1060:1: ruleLabelDefinition
                    {
                     before(grammarAccess.getComponentDefinitionAccess().getLabelDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLabelDefinition_in_rule__ComponentDefinition__Alternatives2202);
                    ruleLabelDefinition();

                    state._fsp--;

                     after(grammarAccess.getComponentDefinitionAccess().getLabelDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1065:6: ( ruleButtonDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1065:6: ( ruleButtonDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1066:1: ruleButtonDefinition
                    {
                     before(grammarAccess.getComponentDefinitionAccess().getButtonDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleButtonDefinition_in_rule__ComponentDefinition__Alternatives2219);
                    ruleButtonDefinition();

                    state._fsp--;

                     after(grammarAccess.getComponentDefinitionAccess().getButtonDefinitionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1071:6: ( ruleTextfieldDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1071:6: ( ruleTextfieldDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1072:1: ruleTextfieldDefinition
                    {
                     before(grammarAccess.getComponentDefinitionAccess().getTextfieldDefinitionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleTextfieldDefinition_in_rule__ComponentDefinition__Alternatives2236);
                    ruleTextfieldDefinition();

                    state._fsp--;

                     after(grammarAccess.getComponentDefinitionAccess().getTextfieldDefinitionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1077:6: ( ruleTextareaDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1077:6: ( ruleTextareaDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1078:1: ruleTextareaDefinition
                    {
                     before(grammarAccess.getComponentDefinitionAccess().getTextareaDefinitionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleTextareaDefinition_in_rule__ComponentDefinition__Alternatives2253);
                    ruleTextareaDefinition();

                    state._fsp--;

                     after(grammarAccess.getComponentDefinitionAccess().getTextareaDefinitionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1083:6: ( ruleTreeDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1083:6: ( ruleTreeDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1084:1: ruleTreeDefinition
                    {
                     before(grammarAccess.getComponentDefinitionAccess().getTreeDefinitionParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleTreeDefinition_in_rule__ComponentDefinition__Alternatives2270);
                    ruleTreeDefinition();

                    state._fsp--;

                     after(grammarAccess.getComponentDefinitionAccess().getTreeDefinitionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1089:6: ( ruleTableDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1089:6: ( ruleTableDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1090:1: ruleTableDefinition
                    {
                     before(grammarAccess.getComponentDefinitionAccess().getTableDefinitionParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleTableDefinition_in_rule__ComponentDefinition__Alternatives2287);
                    ruleTableDefinition();

                    state._fsp--;

                     after(grammarAccess.getComponentDefinitionAccess().getTableDefinitionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1095:6: ( ruleTabViewDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1095:6: ( ruleTabViewDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1096:1: ruleTabViewDefinition
                    {
                     before(grammarAccess.getComponentDefinitionAccess().getTabViewDefinitionParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleTabViewDefinition_in_rule__ComponentDefinition__Alternatives2304);
                    ruleTabViewDefinition();

                    state._fsp--;

                     after(grammarAccess.getComponentDefinitionAccess().getTabViewDefinitionParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1101:6: ( ruleInterchangeableDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1101:6: ( ruleInterchangeableDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1102:1: ruleInterchangeableDefinition
                    {
                     before(grammarAccess.getComponentDefinitionAccess().getInterchangeableDefinitionParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleInterchangeableDefinition_in_rule__ComponentDefinition__Alternatives2321);
                    ruleInterchangeableDefinition();

                    state._fsp--;

                     after(grammarAccess.getComponentDefinitionAccess().getInterchangeableDefinitionParserRuleCall_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefinition__Alternatives"


    // $ANTLR start "rule__Interactiontype__IdAlternatives_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1112:1: rule__Interactiontype__IdAlternatives_0 : ( ( 'IfActivator' ) | ( 'IfTextDisplay' ) );
    public final void rule__Interactiontype__IdAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1116:1: ( ( 'IfActivator' ) | ( 'IfTextDisplay' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1117:1: ( 'IfActivator' )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1117:1: ( 'IfActivator' )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1118:1: 'IfActivator'
                    {
                     before(grammarAccess.getInteractiontypeAccess().getIdIfActivatorKeyword_0_0()); 
                    match(input,16,FOLLOW_16_in_rule__Interactiontype__IdAlternatives_02354); 
                     after(grammarAccess.getInteractiontypeAccess().getIdIfActivatorKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1125:6: ( 'IfTextDisplay' )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1125:6: ( 'IfTextDisplay' )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1126:1: 'IfTextDisplay'
                    {
                     before(grammarAccess.getInteractiontypeAccess().getIdIfTextDisplayKeyword_0_1()); 
                    match(input,17,FOLLOW_17_in_rule__Interactiontype__IdAlternatives_02374); 
                     after(grammarAccess.getInteractiontypeAccess().getIdIfTextDisplayKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interactiontype__IdAlternatives_0"


    // $ANTLR start "rule__UIDescription__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1140:1: rule__UIDescription__Group__0 : rule__UIDescription__Group__0__Impl rule__UIDescription__Group__1 ;
    public final void rule__UIDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1144:1: ( rule__UIDescription__Group__0__Impl rule__UIDescription__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1145:2: rule__UIDescription__Group__0__Impl rule__UIDescription__Group__1
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__0__Impl_in_rule__UIDescription__Group__02406);
            rule__UIDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIDescription__Group__1_in_rule__UIDescription__Group__02409);
            rule__UIDescription__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__Group__0"


    // $ANTLR start "rule__UIDescription__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1152:1: rule__UIDescription__Group__0__Impl : ( ( rule__UIDescription__TypeDefinitionAssignment_0 ) ) ;
    public final void rule__UIDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1156:1: ( ( ( rule__UIDescription__TypeDefinitionAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1157:1: ( ( rule__UIDescription__TypeDefinitionAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1157:1: ( ( rule__UIDescription__TypeDefinitionAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1158:1: ( rule__UIDescription__TypeDefinitionAssignment_0 )
            {
             before(grammarAccess.getUIDescriptionAccess().getTypeDefinitionAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1159:1: ( rule__UIDescription__TypeDefinitionAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1159:2: rule__UIDescription__TypeDefinitionAssignment_0
            {
            pushFollow(FOLLOW_rule__UIDescription__TypeDefinitionAssignment_0_in_rule__UIDescription__Group__0__Impl2436);
            rule__UIDescription__TypeDefinitionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUIDescriptionAccess().getTypeDefinitionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__Group__0__Impl"


    // $ANTLR start "rule__UIDescription__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1169:1: rule__UIDescription__Group__1 : rule__UIDescription__Group__1__Impl rule__UIDescription__Group__2 ;
    public final void rule__UIDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1173:1: ( rule__UIDescription__Group__1__Impl rule__UIDescription__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1174:2: rule__UIDescription__Group__1__Impl rule__UIDescription__Group__2
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__1__Impl_in_rule__UIDescription__Group__12466);
            rule__UIDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIDescription__Group__2_in_rule__UIDescription__Group__12469);
            rule__UIDescription__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__Group__1"


    // $ANTLR start "rule__UIDescription__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1181:1: rule__UIDescription__Group__1__Impl : ( ( rule__UIDescription__PropertyAssignment_1 )? ) ;
    public final void rule__UIDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1185:1: ( ( ( rule__UIDescription__PropertyAssignment_1 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1186:1: ( ( rule__UIDescription__PropertyAssignment_1 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1186:1: ( ( rule__UIDescription__PropertyAssignment_1 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1187:1: ( rule__UIDescription__PropertyAssignment_1 )?
            {
             before(grammarAccess.getUIDescriptionAccess().getPropertyAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1188:1: ( rule__UIDescription__PropertyAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1188:2: rule__UIDescription__PropertyAssignment_1
                    {
                    pushFollow(FOLLOW_rule__UIDescription__PropertyAssignment_1_in_rule__UIDescription__Group__1__Impl2496);
                    rule__UIDescription__PropertyAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUIDescriptionAccess().getPropertyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__Group__1__Impl"


    // $ANTLR start "rule__UIDescription__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1198:1: rule__UIDescription__Group__2 : rule__UIDescription__Group__2__Impl rule__UIDescription__Group__3 ;
    public final void rule__UIDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1202:1: ( rule__UIDescription__Group__2__Impl rule__UIDescription__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1203:2: rule__UIDescription__Group__2__Impl rule__UIDescription__Group__3
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__2__Impl_in_rule__UIDescription__Group__22527);
            rule__UIDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIDescription__Group__3_in_rule__UIDescription__Group__22530);
            rule__UIDescription__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__Group__2"


    // $ANTLR start "rule__UIDescription__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1210:1: rule__UIDescription__Group__2__Impl : ( ( rule__UIDescription__LayoutAssignment_2 )? ) ;
    public final void rule__UIDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1214:1: ( ( ( rule__UIDescription__LayoutAssignment_2 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1215:1: ( ( rule__UIDescription__LayoutAssignment_2 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1215:1: ( ( rule__UIDescription__LayoutAssignment_2 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1216:1: ( rule__UIDescription__LayoutAssignment_2 )?
            {
             before(grammarAccess.getUIDescriptionAccess().getLayoutAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1217:1: ( rule__UIDescription__LayoutAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1217:2: rule__UIDescription__LayoutAssignment_2
                    {
                    pushFollow(FOLLOW_rule__UIDescription__LayoutAssignment_2_in_rule__UIDescription__Group__2__Impl2557);
                    rule__UIDescription__LayoutAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUIDescriptionAccess().getLayoutAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__Group__2__Impl"


    // $ANTLR start "rule__UIDescription__Group__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1227:1: rule__UIDescription__Group__3 : rule__UIDescription__Group__3__Impl rule__UIDescription__Group__4 ;
    public final void rule__UIDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1231:1: ( rule__UIDescription__Group__3__Impl rule__UIDescription__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1232:2: rule__UIDescription__Group__3__Impl rule__UIDescription__Group__4
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__3__Impl_in_rule__UIDescription__Group__32588);
            rule__UIDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIDescription__Group__4_in_rule__UIDescription__Group__32591);
            rule__UIDescription__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__Group__3"


    // $ANTLR start "rule__UIDescription__Group__3__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1239:1: rule__UIDescription__Group__3__Impl : ( ( rule__UIDescription__UsedDescriptionsAssignment_3 )* ) ;
    public final void rule__UIDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1243:1: ( ( ( rule__UIDescription__UsedDescriptionsAssignment_3 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1244:1: ( ( rule__UIDescription__UsedDescriptionsAssignment_3 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1244:1: ( ( rule__UIDescription__UsedDescriptionsAssignment_3 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1245:1: ( rule__UIDescription__UsedDescriptionsAssignment_3 )*
            {
             before(grammarAccess.getUIDescriptionAccess().getUsedDescriptionsAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1246:1: ( rule__UIDescription__UsedDescriptionsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1246:2: rule__UIDescription__UsedDescriptionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__UIDescription__UsedDescriptionsAssignment_3_in_rule__UIDescription__Group__3__Impl2618);
            	    rule__UIDescription__UsedDescriptionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getUIDescriptionAccess().getUsedDescriptionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__Group__3__Impl"


    // $ANTLR start "rule__UIDescription__Group__4"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1256:1: rule__UIDescription__Group__4 : rule__UIDescription__Group__4__Impl rule__UIDescription__Group__5 ;
    public final void rule__UIDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1260:1: ( rule__UIDescription__Group__4__Impl rule__UIDescription__Group__5 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1261:2: rule__UIDescription__Group__4__Impl rule__UIDescription__Group__5
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__4__Impl_in_rule__UIDescription__Group__42649);
            rule__UIDescription__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIDescription__Group__5_in_rule__UIDescription__Group__42652);
            rule__UIDescription__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__Group__4"


    // $ANTLR start "rule__UIDescription__Group__4__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1268:1: rule__UIDescription__Group__4__Impl : ( ( rule__UIDescription__RefinementsAssignment_4 )* ) ;
    public final void rule__UIDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1272:1: ( ( ( rule__UIDescription__RefinementsAssignment_4 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1273:1: ( ( rule__UIDescription__RefinementsAssignment_4 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1273:1: ( ( rule__UIDescription__RefinementsAssignment_4 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1274:1: ( rule__UIDescription__RefinementsAssignment_4 )*
            {
             before(grammarAccess.getUIDescriptionAccess().getRefinementsAssignment_4()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1275:1: ( rule__UIDescription__RefinementsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==33) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==21) ) {
                        alt9=1;
                    }


                }
                else if ( (LA9_0==32) ) {
                    int LA9_2 = input.LA(2);

                    if ( (LA9_2==21) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1275:2: rule__UIDescription__RefinementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__UIDescription__RefinementsAssignment_4_in_rule__UIDescription__Group__4__Impl2679);
            	    rule__UIDescription__RefinementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getUIDescriptionAccess().getRefinementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__Group__4__Impl"


    // $ANTLR start "rule__UIDescription__Group__5"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1285:1: rule__UIDescription__Group__5 : rule__UIDescription__Group__5__Impl rule__UIDescription__Group__6 ;
    public final void rule__UIDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1289:1: ( rule__UIDescription__Group__5__Impl rule__UIDescription__Group__6 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1290:2: rule__UIDescription__Group__5__Impl rule__UIDescription__Group__6
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__5__Impl_in_rule__UIDescription__Group__52710);
            rule__UIDescription__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIDescription__Group__6_in_rule__UIDescription__Group__52713);
            rule__UIDescription__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__Group__5"


    // $ANTLR start "rule__UIDescription__Group__5__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1297:1: rule__UIDescription__Group__5__Impl : ( ( rule__UIDescription__DefinitionsAssignment_5 )* ) ;
    public final void rule__UIDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1301:1: ( ( ( rule__UIDescription__DefinitionsAssignment_5 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1302:1: ( ( rule__UIDescription__DefinitionsAssignment_5 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1302:1: ( ( rule__UIDescription__DefinitionsAssignment_5 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1303:1: ( rule__UIDescription__DefinitionsAssignment_5 )*
            {
             before(grammarAccess.getUIDescriptionAccess().getDefinitionsAssignment_5()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1304:1: ( rule__UIDescription__DefinitionsAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=32 && LA10_0<=34)||(LA10_0>=36 && LA10_0<=40)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1304:2: rule__UIDescription__DefinitionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__UIDescription__DefinitionsAssignment_5_in_rule__UIDescription__Group__5__Impl2740);
            	    rule__UIDescription__DefinitionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getUIDescriptionAccess().getDefinitionsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__Group__5__Impl"


    // $ANTLR start "rule__UIDescription__Group__6"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1314:1: rule__UIDescription__Group__6 : rule__UIDescription__Group__6__Impl ;
    public final void rule__UIDescription__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1318:1: ( rule__UIDescription__Group__6__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1319:2: rule__UIDescription__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__6__Impl_in_rule__UIDescription__Group__62771);
            rule__UIDescription__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__Group__6"


    // $ANTLR start "rule__UIDescription__Group__6__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1325:1: rule__UIDescription__Group__6__Impl : ( ( rule__UIDescription__StructureAssignment_6 ) ) ;
    public final void rule__UIDescription__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1329:1: ( ( ( rule__UIDescription__StructureAssignment_6 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1330:1: ( ( rule__UIDescription__StructureAssignment_6 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1330:1: ( ( rule__UIDescription__StructureAssignment_6 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1331:1: ( rule__UIDescription__StructureAssignment_6 )
            {
             before(grammarAccess.getUIDescriptionAccess().getStructureAssignment_6()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1332:1: ( rule__UIDescription__StructureAssignment_6 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1332:2: rule__UIDescription__StructureAssignment_6
            {
            pushFollow(FOLLOW_rule__UIDescription__StructureAssignment_6_in_rule__UIDescription__Group__6__Impl2798);
            rule__UIDescription__StructureAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getUIDescriptionAccess().getStructureAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__Group__6__Impl"


    // $ANTLR start "rule__Layout__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1356:1: rule__Layout__Group__0 : rule__Layout__Group__0__Impl rule__Layout__Group__1 ;
    public final void rule__Layout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1360:1: ( rule__Layout__Group__0__Impl rule__Layout__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1361:2: rule__Layout__Group__0__Impl rule__Layout__Group__1
            {
            pushFollow(FOLLOW_rule__Layout__Group__0__Impl_in_rule__Layout__Group__02842);
            rule__Layout__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Layout__Group__1_in_rule__Layout__Group__02845);
            rule__Layout__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__0"


    // $ANTLR start "rule__Layout__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1368:1: rule__Layout__Group__0__Impl : ( 'get layout from:' ) ;
    public final void rule__Layout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1372:1: ( ( 'get layout from:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1373:1: ( 'get layout from:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1373:1: ( 'get layout from:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1374:1: 'get layout from:'
            {
             before(grammarAccess.getLayoutAccess().getGetLayoutFromKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Layout__Group__0__Impl2873); 
             after(grammarAccess.getLayoutAccess().getGetLayoutFromKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__0__Impl"


    // $ANTLR start "rule__Layout__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1387:1: rule__Layout__Group__1 : rule__Layout__Group__1__Impl rule__Layout__Group__2 ;
    public final void rule__Layout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1391:1: ( rule__Layout__Group__1__Impl rule__Layout__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1392:2: rule__Layout__Group__1__Impl rule__Layout__Group__2
            {
            pushFollow(FOLLOW_rule__Layout__Group__1__Impl_in_rule__Layout__Group__12904);
            rule__Layout__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Layout__Group__2_in_rule__Layout__Group__12907);
            rule__Layout__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__1"


    // $ANTLR start "rule__Layout__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1399:1: rule__Layout__Group__1__Impl : ( ( ( rule__Layout__LayoutFilesAssignment_1 ) ) ( ( rule__Layout__LayoutFilesAssignment_1 )* ) ) ;
    public final void rule__Layout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1403:1: ( ( ( ( rule__Layout__LayoutFilesAssignment_1 ) ) ( ( rule__Layout__LayoutFilesAssignment_1 )* ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1404:1: ( ( ( rule__Layout__LayoutFilesAssignment_1 ) ) ( ( rule__Layout__LayoutFilesAssignment_1 )* ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1404:1: ( ( ( rule__Layout__LayoutFilesAssignment_1 ) ) ( ( rule__Layout__LayoutFilesAssignment_1 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1405:1: ( ( rule__Layout__LayoutFilesAssignment_1 ) ) ( ( rule__Layout__LayoutFilesAssignment_1 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1405:1: ( ( rule__Layout__LayoutFilesAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1406:1: ( rule__Layout__LayoutFilesAssignment_1 )
            {
             before(grammarAccess.getLayoutAccess().getLayoutFilesAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1407:1: ( rule__Layout__LayoutFilesAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1407:2: rule__Layout__LayoutFilesAssignment_1
            {
            pushFollow(FOLLOW_rule__Layout__LayoutFilesAssignment_1_in_rule__Layout__Group__1__Impl2936);
            rule__Layout__LayoutFilesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLayoutAccess().getLayoutFilesAssignment_1()); 

            }

            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1410:1: ( ( rule__Layout__LayoutFilesAssignment_1 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1411:1: ( rule__Layout__LayoutFilesAssignment_1 )*
            {
             before(grammarAccess.getLayoutAccess().getLayoutFilesAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1412:1: ( rule__Layout__LayoutFilesAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1412:2: rule__Layout__LayoutFilesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Layout__LayoutFilesAssignment_1_in_rule__Layout__Group__1__Impl2948);
            	    rule__Layout__LayoutFilesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getLayoutAccess().getLayoutFilesAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__1__Impl"


    // $ANTLR start "rule__Layout__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1423:1: rule__Layout__Group__2 : rule__Layout__Group__2__Impl ;
    public final void rule__Layout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1427:1: ( rule__Layout__Group__2__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1428:2: rule__Layout__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Layout__Group__2__Impl_in_rule__Layout__Group__22981);
            rule__Layout__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__2"


    // $ANTLR start "rule__Layout__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1434:1: rule__Layout__Group__2__Impl : ( ';' ) ;
    public final void rule__Layout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1438:1: ( ( ';' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1439:1: ( ';' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1439:1: ( ';' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1440:1: ';'
            {
             before(grammarAccess.getLayoutAccess().getSemicolonKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__Layout__Group__2__Impl3009); 
             after(grammarAccess.getLayoutAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__2__Impl"


    // $ANTLR start "rule__Structure__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1459:1: rule__Structure__Group__0 : rule__Structure__Group__0__Impl rule__Structure__Group__1 ;
    public final void rule__Structure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1463:1: ( rule__Structure__Group__0__Impl rule__Structure__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1464:2: rule__Structure__Group__0__Impl rule__Structure__Group__1
            {
            pushFollow(FOLLOW_rule__Structure__Group__0__Impl_in_rule__Structure__Group__03046);
            rule__Structure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Structure__Group__1_in_rule__Structure__Group__03049);
            rule__Structure__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structure__Group__0"


    // $ANTLR start "rule__Structure__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1471:1: rule__Structure__Group__0__Impl : ( ( rule__Structure__NameAssignment_0 ) ) ;
    public final void rule__Structure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1475:1: ( ( ( rule__Structure__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1476:1: ( ( rule__Structure__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1476:1: ( ( rule__Structure__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1477:1: ( rule__Structure__NameAssignment_0 )
            {
             before(grammarAccess.getStructureAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1478:1: ( rule__Structure__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1478:2: rule__Structure__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Structure__NameAssignment_0_in_rule__Structure__Group__0__Impl3076);
            rule__Structure__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStructureAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structure__Group__0__Impl"


    // $ANTLR start "rule__Structure__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1488:1: rule__Structure__Group__1 : rule__Structure__Group__1__Impl rule__Structure__Group__2 ;
    public final void rule__Structure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1492:1: ( rule__Structure__Group__1__Impl rule__Structure__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1493:2: rule__Structure__Group__1__Impl rule__Structure__Group__2
            {
            pushFollow(FOLLOW_rule__Structure__Group__1__Impl_in_rule__Structure__Group__13106);
            rule__Structure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Structure__Group__2_in_rule__Structure__Group__13109);
            rule__Structure__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structure__Group__1"


    // $ANTLR start "rule__Structure__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1500:1: rule__Structure__Group__1__Impl : ( ':' ) ;
    public final void rule__Structure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1504:1: ( ( ':' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1505:1: ( ':' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1505:1: ( ':' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1506:1: ':'
            {
             before(grammarAccess.getStructureAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Structure__Group__1__Impl3137); 
             after(grammarAccess.getStructureAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structure__Group__1__Impl"


    // $ANTLR start "rule__Structure__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1519:1: rule__Structure__Group__2 : rule__Structure__Group__2__Impl rule__Structure__Group__3 ;
    public final void rule__Structure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1523:1: ( rule__Structure__Group__2__Impl rule__Structure__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1524:2: rule__Structure__Group__2__Impl rule__Structure__Group__3
            {
            pushFollow(FOLLOW_rule__Structure__Group__2__Impl_in_rule__Structure__Group__23168);
            rule__Structure__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Structure__Group__3_in_rule__Structure__Group__23171);
            rule__Structure__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structure__Group__2"


    // $ANTLR start "rule__Structure__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1531:1: rule__Structure__Group__2__Impl : ( ( rule__Structure__OrderedElementsAssignment_2 )* ) ;
    public final void rule__Structure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1535:1: ( ( ( rule__Structure__OrderedElementsAssignment_2 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1536:1: ( ( rule__Structure__OrderedElementsAssignment_2 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1536:1: ( ( rule__Structure__OrderedElementsAssignment_2 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1537:1: ( rule__Structure__OrderedElementsAssignment_2 )*
            {
             before(grammarAccess.getStructureAccess().getOrderedElementsAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1538:1: ( rule__Structure__OrderedElementsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_STRING) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1538:2: rule__Structure__OrderedElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Structure__OrderedElementsAssignment_2_in_rule__Structure__Group__2__Impl3198);
            	    rule__Structure__OrderedElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getStructureAccess().getOrderedElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structure__Group__2__Impl"


    // $ANTLR start "rule__Structure__Group__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1548:1: rule__Structure__Group__3 : rule__Structure__Group__3__Impl ;
    public final void rule__Structure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1552:1: ( rule__Structure__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1553:2: rule__Structure__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Structure__Group__3__Impl_in_rule__Structure__Group__33229);
            rule__Structure__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structure__Group__3"


    // $ANTLR start "rule__Structure__Group__3__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1559:1: rule__Structure__Group__3__Impl : ( ';' ) ;
    public final void rule__Structure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1563:1: ( ( ';' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1564:1: ( ';' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1564:1: ( ';' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1565:1: ';'
            {
             before(grammarAccess.getStructureAccess().getSemicolonKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__Structure__Group__3__Impl3257); 
             after(grammarAccess.getStructureAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structure__Group__3__Impl"


    // $ANTLR start "rule__Refinement__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1586:1: rule__Refinement__Group__0 : rule__Refinement__Group__0__Impl rule__Refinement__Group__1 ;
    public final void rule__Refinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1590:1: ( rule__Refinement__Group__0__Impl rule__Refinement__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1591:2: rule__Refinement__Group__0__Impl rule__Refinement__Group__1
            {
            pushFollow(FOLLOW_rule__Refinement__Group__0__Impl_in_rule__Refinement__Group__03296);
            rule__Refinement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Refinement__Group__1_in_rule__Refinement__Group__03299);
            rule__Refinement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refinement__Group__0"


    // $ANTLR start "rule__Refinement__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1598:1: rule__Refinement__Group__0__Impl : ( ( rule__Refinement__ConcreteRefinementAssignment_0 ) ) ;
    public final void rule__Refinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1602:1: ( ( ( rule__Refinement__ConcreteRefinementAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1603:1: ( ( rule__Refinement__ConcreteRefinementAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1603:1: ( ( rule__Refinement__ConcreteRefinementAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1604:1: ( rule__Refinement__ConcreteRefinementAssignment_0 )
            {
             before(grammarAccess.getRefinementAccess().getConcreteRefinementAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1605:1: ( rule__Refinement__ConcreteRefinementAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1605:2: rule__Refinement__ConcreteRefinementAssignment_0
            {
            pushFollow(FOLLOW_rule__Refinement__ConcreteRefinementAssignment_0_in_rule__Refinement__Group__0__Impl3326);
            rule__Refinement__ConcreteRefinementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRefinementAccess().getConcreteRefinementAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refinement__Group__0__Impl"


    // $ANTLR start "rule__Refinement__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1615:1: rule__Refinement__Group__1 : rule__Refinement__Group__1__Impl ;
    public final void rule__Refinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1619:1: ( rule__Refinement__Group__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1620:2: rule__Refinement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Refinement__Group__1__Impl_in_rule__Refinement__Group__13356);
            rule__Refinement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refinement__Group__1"


    // $ANTLR start "rule__Refinement__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1626:1: rule__Refinement__Group__1__Impl : ( ';' ) ;
    public final void rule__Refinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1630:1: ( ( ';' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1631:1: ( ';' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1631:1: ( ';' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1632:1: ';'
            {
             before(grammarAccess.getRefinementAccess().getSemicolonKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__Refinement__Group__1__Impl3384); 
             after(grammarAccess.getRefinementAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refinement__Group__1__Impl"


    // $ANTLR start "rule__ButtonRefinement__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1649:1: rule__ButtonRefinement__Group__0 : rule__ButtonRefinement__Group__0__Impl rule__ButtonRefinement__Group__1 ;
    public final void rule__ButtonRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1653:1: ( rule__ButtonRefinement__Group__0__Impl rule__ButtonRefinement__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1654:2: rule__ButtonRefinement__Group__0__Impl rule__ButtonRefinement__Group__1
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__Group__0__Impl_in_rule__ButtonRefinement__Group__03419);
            rule__ButtonRefinement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonRefinement__Group__1_in_rule__ButtonRefinement__Group__03422);
            rule__ButtonRefinement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonRefinement__Group__0"


    // $ANTLR start "rule__ButtonRefinement__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1661:1: rule__ButtonRefinement__Group__0__Impl : ( ( rule__ButtonRefinement__NameAssignment_0 ) ) ;
    public final void rule__ButtonRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1665:1: ( ( ( rule__ButtonRefinement__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1666:1: ( ( rule__ButtonRefinement__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1666:1: ( ( rule__ButtonRefinement__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1667:1: ( rule__ButtonRefinement__NameAssignment_0 )
            {
             before(grammarAccess.getButtonRefinementAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1668:1: ( rule__ButtonRefinement__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1668:2: rule__ButtonRefinement__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__NameAssignment_0_in_rule__ButtonRefinement__Group__0__Impl3449);
            rule__ButtonRefinement__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getButtonRefinementAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonRefinement__Group__0__Impl"


    // $ANTLR start "rule__ButtonRefinement__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1678:1: rule__ButtonRefinement__Group__1 : rule__ButtonRefinement__Group__1__Impl rule__ButtonRefinement__Group__2 ;
    public final void rule__ButtonRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1682:1: ( rule__ButtonRefinement__Group__1__Impl rule__ButtonRefinement__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1683:2: rule__ButtonRefinement__Group__1__Impl rule__ButtonRefinement__Group__2
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__Group__1__Impl_in_rule__ButtonRefinement__Group__13479);
            rule__ButtonRefinement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonRefinement__Group__2_in_rule__ButtonRefinement__Group__13482);
            rule__ButtonRefinement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonRefinement__Group__1"


    // $ANTLR start "rule__ButtonRefinement__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1690:1: rule__ButtonRefinement__Group__1__Impl : ( 'from:' ) ;
    public final void rule__ButtonRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1694:1: ( ( 'from:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1695:1: ( 'from:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1695:1: ( 'from:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1696:1: 'from:'
            {
             before(grammarAccess.getButtonRefinementAccess().getFromKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__ButtonRefinement__Group__1__Impl3510); 
             after(grammarAccess.getButtonRefinementAccess().getFromKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonRefinement__Group__1__Impl"


    // $ANTLR start "rule__ButtonRefinement__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1709:1: rule__ButtonRefinement__Group__2 : rule__ButtonRefinement__Group__2__Impl rule__ButtonRefinement__Group__3 ;
    public final void rule__ButtonRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1713:1: ( rule__ButtonRefinement__Group__2__Impl rule__ButtonRefinement__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1714:2: rule__ButtonRefinement__Group__2__Impl rule__ButtonRefinement__Group__3
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__Group__2__Impl_in_rule__ButtonRefinement__Group__23541);
            rule__ButtonRefinement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonRefinement__Group__3_in_rule__ButtonRefinement__Group__23544);
            rule__ButtonRefinement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonRefinement__Group__2"


    // $ANTLR start "rule__ButtonRefinement__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1721:1: rule__ButtonRefinement__Group__2__Impl : ( ( rule__ButtonRefinement__IdAssignment_2 ) ) ;
    public final void rule__ButtonRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1725:1: ( ( ( rule__ButtonRefinement__IdAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1726:1: ( ( rule__ButtonRefinement__IdAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1726:1: ( ( rule__ButtonRefinement__IdAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1727:1: ( rule__ButtonRefinement__IdAssignment_2 )
            {
             before(grammarAccess.getButtonRefinementAccess().getIdAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1728:1: ( rule__ButtonRefinement__IdAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1728:2: rule__ButtonRefinement__IdAssignment_2
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__IdAssignment_2_in_rule__ButtonRefinement__Group__2__Impl3571);
            rule__ButtonRefinement__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getButtonRefinementAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonRefinement__Group__2__Impl"


    // $ANTLR start "rule__ButtonRefinement__Group__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1738:1: rule__ButtonRefinement__Group__3 : rule__ButtonRefinement__Group__3__Impl ;
    public final void rule__ButtonRefinement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1742:1: ( rule__ButtonRefinement__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1743:2: rule__ButtonRefinement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__Group__3__Impl_in_rule__ButtonRefinement__Group__33601);
            rule__ButtonRefinement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonRefinement__Group__3"


    // $ANTLR start "rule__ButtonRefinement__Group__3__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1749:1: rule__ButtonRefinement__Group__3__Impl : ( ( rule__ButtonRefinement__Group_3__0 )? ) ;
    public final void rule__ButtonRefinement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1753:1: ( ( ( rule__ButtonRefinement__Group_3__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1754:1: ( ( rule__ButtonRefinement__Group_3__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1754:1: ( ( rule__ButtonRefinement__Group_3__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1755:1: ( rule__ButtonRefinement__Group_3__0 )?
            {
             before(grammarAccess.getButtonRefinementAccess().getGroup_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1756:1: ( rule__ButtonRefinement__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1756:2: rule__ButtonRefinement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ButtonRefinement__Group_3__0_in_rule__ButtonRefinement__Group__3__Impl3628);
                    rule__ButtonRefinement__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getButtonRefinementAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonRefinement__Group__3__Impl"


    // $ANTLR start "rule__ButtonRefinement__Group_3__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1774:1: rule__ButtonRefinement__Group_3__0 : rule__ButtonRefinement__Group_3__0__Impl rule__ButtonRefinement__Group_3__1 ;
    public final void rule__ButtonRefinement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1778:1: ( rule__ButtonRefinement__Group_3__0__Impl rule__ButtonRefinement__Group_3__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1779:2: rule__ButtonRefinement__Group_3__0__Impl rule__ButtonRefinement__Group_3__1
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__Group_3__0__Impl_in_rule__ButtonRefinement__Group_3__03667);
            rule__ButtonRefinement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonRefinement__Group_3__1_in_rule__ButtonRefinement__Group_3__03670);
            rule__ButtonRefinement__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonRefinement__Group_3__0"


    // $ANTLR start "rule__ButtonRefinement__Group_3__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1786:1: rule__ButtonRefinement__Group_3__0__Impl : ( '->' ) ;
    public final void rule__ButtonRefinement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1790:1: ( ( '->' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1791:1: ( '->' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1791:1: ( '->' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1792:1: '->'
            {
             before(grammarAccess.getButtonRefinementAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__ButtonRefinement__Group_3__0__Impl3698); 
             after(grammarAccess.getButtonRefinementAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonRefinement__Group_3__0__Impl"


    // $ANTLR start "rule__ButtonRefinement__Group_3__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1805:1: rule__ButtonRefinement__Group_3__1 : rule__ButtonRefinement__Group_3__1__Impl ;
    public final void rule__ButtonRefinement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1809:1: ( rule__ButtonRefinement__Group_3__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1810:2: rule__ButtonRefinement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__Group_3__1__Impl_in_rule__ButtonRefinement__Group_3__13729);
            rule__ButtonRefinement__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonRefinement__Group_3__1"


    // $ANTLR start "rule__ButtonRefinement__Group_3__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1816:1: rule__ButtonRefinement__Group_3__1__Impl : ( ( rule__ButtonRefinement__PropertiesAssignment_3_1 ) ) ;
    public final void rule__ButtonRefinement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1820:1: ( ( ( rule__ButtonRefinement__PropertiesAssignment_3_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1821:1: ( ( rule__ButtonRefinement__PropertiesAssignment_3_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1821:1: ( ( rule__ButtonRefinement__PropertiesAssignment_3_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1822:1: ( rule__ButtonRefinement__PropertiesAssignment_3_1 )
            {
             before(grammarAccess.getButtonRefinementAccess().getPropertiesAssignment_3_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1823:1: ( rule__ButtonRefinement__PropertiesAssignment_3_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1823:2: rule__ButtonRefinement__PropertiesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__PropertiesAssignment_3_1_in_rule__ButtonRefinement__Group_3__1__Impl3756);
            rule__ButtonRefinement__PropertiesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getButtonRefinementAccess().getPropertiesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonRefinement__Group_3__1__Impl"


    // $ANTLR start "rule__LabelRefinement__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1837:1: rule__LabelRefinement__Group__0 : rule__LabelRefinement__Group__0__Impl rule__LabelRefinement__Group__1 ;
    public final void rule__LabelRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1841:1: ( rule__LabelRefinement__Group__0__Impl rule__LabelRefinement__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1842:2: rule__LabelRefinement__Group__0__Impl rule__LabelRefinement__Group__1
            {
            pushFollow(FOLLOW_rule__LabelRefinement__Group__0__Impl_in_rule__LabelRefinement__Group__03790);
            rule__LabelRefinement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelRefinement__Group__1_in_rule__LabelRefinement__Group__03793);
            rule__LabelRefinement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelRefinement__Group__0"


    // $ANTLR start "rule__LabelRefinement__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1849:1: rule__LabelRefinement__Group__0__Impl : ( ( rule__LabelRefinement__NameAssignment_0 ) ) ;
    public final void rule__LabelRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1853:1: ( ( ( rule__LabelRefinement__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1854:1: ( ( rule__LabelRefinement__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1854:1: ( ( rule__LabelRefinement__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1855:1: ( rule__LabelRefinement__NameAssignment_0 )
            {
             before(grammarAccess.getLabelRefinementAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1856:1: ( rule__LabelRefinement__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1856:2: rule__LabelRefinement__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__LabelRefinement__NameAssignment_0_in_rule__LabelRefinement__Group__0__Impl3820);
            rule__LabelRefinement__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLabelRefinementAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelRefinement__Group__0__Impl"


    // $ANTLR start "rule__LabelRefinement__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1866:1: rule__LabelRefinement__Group__1 : rule__LabelRefinement__Group__1__Impl rule__LabelRefinement__Group__2 ;
    public final void rule__LabelRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1870:1: ( rule__LabelRefinement__Group__1__Impl rule__LabelRefinement__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1871:2: rule__LabelRefinement__Group__1__Impl rule__LabelRefinement__Group__2
            {
            pushFollow(FOLLOW_rule__LabelRefinement__Group__1__Impl_in_rule__LabelRefinement__Group__13850);
            rule__LabelRefinement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelRefinement__Group__2_in_rule__LabelRefinement__Group__13853);
            rule__LabelRefinement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelRefinement__Group__1"


    // $ANTLR start "rule__LabelRefinement__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1878:1: rule__LabelRefinement__Group__1__Impl : ( 'from:' ) ;
    public final void rule__LabelRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1882:1: ( ( 'from:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1883:1: ( 'from:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1883:1: ( 'from:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1884:1: 'from:'
            {
             before(grammarAccess.getLabelRefinementAccess().getFromKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__LabelRefinement__Group__1__Impl3881); 
             after(grammarAccess.getLabelRefinementAccess().getFromKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelRefinement__Group__1__Impl"


    // $ANTLR start "rule__LabelRefinement__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1897:1: rule__LabelRefinement__Group__2 : rule__LabelRefinement__Group__2__Impl rule__LabelRefinement__Group__3 ;
    public final void rule__LabelRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1901:1: ( rule__LabelRefinement__Group__2__Impl rule__LabelRefinement__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1902:2: rule__LabelRefinement__Group__2__Impl rule__LabelRefinement__Group__3
            {
            pushFollow(FOLLOW_rule__LabelRefinement__Group__2__Impl_in_rule__LabelRefinement__Group__23912);
            rule__LabelRefinement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelRefinement__Group__3_in_rule__LabelRefinement__Group__23915);
            rule__LabelRefinement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelRefinement__Group__2"


    // $ANTLR start "rule__LabelRefinement__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1909:1: rule__LabelRefinement__Group__2__Impl : ( ( rule__LabelRefinement__IdAssignment_2 ) ) ;
    public final void rule__LabelRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1913:1: ( ( ( rule__LabelRefinement__IdAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1914:1: ( ( rule__LabelRefinement__IdAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1914:1: ( ( rule__LabelRefinement__IdAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1915:1: ( rule__LabelRefinement__IdAssignment_2 )
            {
             before(grammarAccess.getLabelRefinementAccess().getIdAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1916:1: ( rule__LabelRefinement__IdAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1916:2: rule__LabelRefinement__IdAssignment_2
            {
            pushFollow(FOLLOW_rule__LabelRefinement__IdAssignment_2_in_rule__LabelRefinement__Group__2__Impl3942);
            rule__LabelRefinement__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLabelRefinementAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelRefinement__Group__2__Impl"


    // $ANTLR start "rule__LabelRefinement__Group__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1926:1: rule__LabelRefinement__Group__3 : rule__LabelRefinement__Group__3__Impl ;
    public final void rule__LabelRefinement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1930:1: ( rule__LabelRefinement__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1931:2: rule__LabelRefinement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__LabelRefinement__Group__3__Impl_in_rule__LabelRefinement__Group__33972);
            rule__LabelRefinement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelRefinement__Group__3"


    // $ANTLR start "rule__LabelRefinement__Group__3__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1937:1: rule__LabelRefinement__Group__3__Impl : ( ( rule__LabelRefinement__Group_3__0 )? ) ;
    public final void rule__LabelRefinement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1941:1: ( ( ( rule__LabelRefinement__Group_3__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1942:1: ( ( rule__LabelRefinement__Group_3__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1942:1: ( ( rule__LabelRefinement__Group_3__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1943:1: ( rule__LabelRefinement__Group_3__0 )?
            {
             before(grammarAccess.getLabelRefinementAccess().getGroup_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1944:1: ( rule__LabelRefinement__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1944:2: rule__LabelRefinement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__LabelRefinement__Group_3__0_in_rule__LabelRefinement__Group__3__Impl3999);
                    rule__LabelRefinement__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLabelRefinementAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelRefinement__Group__3__Impl"


    // $ANTLR start "rule__LabelRefinement__Group_3__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1962:1: rule__LabelRefinement__Group_3__0 : rule__LabelRefinement__Group_3__0__Impl rule__LabelRefinement__Group_3__1 ;
    public final void rule__LabelRefinement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1966:1: ( rule__LabelRefinement__Group_3__0__Impl rule__LabelRefinement__Group_3__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1967:2: rule__LabelRefinement__Group_3__0__Impl rule__LabelRefinement__Group_3__1
            {
            pushFollow(FOLLOW_rule__LabelRefinement__Group_3__0__Impl_in_rule__LabelRefinement__Group_3__04038);
            rule__LabelRefinement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelRefinement__Group_3__1_in_rule__LabelRefinement__Group_3__04041);
            rule__LabelRefinement__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelRefinement__Group_3__0"


    // $ANTLR start "rule__LabelRefinement__Group_3__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1974:1: rule__LabelRefinement__Group_3__0__Impl : ( '->' ) ;
    public final void rule__LabelRefinement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1978:1: ( ( '->' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1979:1: ( '->' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1979:1: ( '->' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1980:1: '->'
            {
             before(grammarAccess.getLabelRefinementAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__LabelRefinement__Group_3__0__Impl4069); 
             after(grammarAccess.getLabelRefinementAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelRefinement__Group_3__0__Impl"


    // $ANTLR start "rule__LabelRefinement__Group_3__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1993:1: rule__LabelRefinement__Group_3__1 : rule__LabelRefinement__Group_3__1__Impl ;
    public final void rule__LabelRefinement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1997:1: ( rule__LabelRefinement__Group_3__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1998:2: rule__LabelRefinement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__LabelRefinement__Group_3__1__Impl_in_rule__LabelRefinement__Group_3__14100);
            rule__LabelRefinement__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelRefinement__Group_3__1"


    // $ANTLR start "rule__LabelRefinement__Group_3__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2004:1: rule__LabelRefinement__Group_3__1__Impl : ( ( rule__LabelRefinement__PropertiesAssignment_3_1 ) ) ;
    public final void rule__LabelRefinement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2008:1: ( ( ( rule__LabelRefinement__PropertiesAssignment_3_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2009:1: ( ( rule__LabelRefinement__PropertiesAssignment_3_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2009:1: ( ( rule__LabelRefinement__PropertiesAssignment_3_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2010:1: ( rule__LabelRefinement__PropertiesAssignment_3_1 )
            {
             before(grammarAccess.getLabelRefinementAccess().getPropertiesAssignment_3_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2011:1: ( rule__LabelRefinement__PropertiesAssignment_3_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2011:2: rule__LabelRefinement__PropertiesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__LabelRefinement__PropertiesAssignment_3_1_in_rule__LabelRefinement__Group_3__1__Impl4127);
            rule__LabelRefinement__PropertiesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLabelRefinementAccess().getPropertiesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelRefinement__Group_3__1__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2025:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2029:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2030:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__04161);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__04164);
            rule__Property__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2037:1: rule__Property__Group__0__Impl : ( 'get properties from:' ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2041:1: ( ( 'get properties from:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2042:1: ( 'get properties from:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2042:1: ( 'get properties from:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2043:1: 'get properties from:'
            {
             before(grammarAccess.getPropertyAccess().getGetPropertiesFromKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Property__Group__0__Impl4192); 
             after(grammarAccess.getPropertyAccess().getGetPropertiesFromKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2056:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2060:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2061:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__14223);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__14226);
            rule__Property__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2068:1: rule__Property__Group__1__Impl : ( ( ( rule__Property__PropertiesFilesAssignment_1 ) ) ( ( rule__Property__PropertiesFilesAssignment_1 )* ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2072:1: ( ( ( ( rule__Property__PropertiesFilesAssignment_1 ) ) ( ( rule__Property__PropertiesFilesAssignment_1 )* ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2073:1: ( ( ( rule__Property__PropertiesFilesAssignment_1 ) ) ( ( rule__Property__PropertiesFilesAssignment_1 )* ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2073:1: ( ( ( rule__Property__PropertiesFilesAssignment_1 ) ) ( ( rule__Property__PropertiesFilesAssignment_1 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2074:1: ( ( rule__Property__PropertiesFilesAssignment_1 ) ) ( ( rule__Property__PropertiesFilesAssignment_1 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2074:1: ( ( rule__Property__PropertiesFilesAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2075:1: ( rule__Property__PropertiesFilesAssignment_1 )
            {
             before(grammarAccess.getPropertyAccess().getPropertiesFilesAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2076:1: ( rule__Property__PropertiesFilesAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2076:2: rule__Property__PropertiesFilesAssignment_1
            {
            pushFollow(FOLLOW_rule__Property__PropertiesFilesAssignment_1_in_rule__Property__Group__1__Impl4255);
            rule__Property__PropertiesFilesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getPropertiesFilesAssignment_1()); 

            }

            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2079:1: ( ( rule__Property__PropertiesFilesAssignment_1 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2080:1: ( rule__Property__PropertiesFilesAssignment_1 )*
            {
             before(grammarAccess.getPropertyAccess().getPropertiesFilesAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2081:1: ( rule__Property__PropertiesFilesAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_STRING) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2081:2: rule__Property__PropertiesFilesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Property__PropertiesFilesAssignment_1_in_rule__Property__Group__1__Impl4267);
            	    rule__Property__PropertiesFilesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getPropertyAccess().getPropertiesFilesAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2092:1: rule__Property__Group__2 : rule__Property__Group__2__Impl ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2096:1: ( rule__Property__Group__2__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2097:2: rule__Property__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__24300);
            rule__Property__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2103:1: rule__Property__Group__2__Impl : ( ';' ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2107:1: ( ( ';' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2108:1: ( ';' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2108:1: ( ';' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2109:1: ';'
            {
             before(grammarAccess.getPropertyAccess().getSemicolonKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__Property__Group__2__Impl4328); 
             after(grammarAccess.getPropertyAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__UsedDescriptions__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2128:1: rule__UsedDescriptions__Group__0 : rule__UsedDescriptions__Group__0__Impl rule__UsedDescriptions__Group__1 ;
    public final void rule__UsedDescriptions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2132:1: ( rule__UsedDescriptions__Group__0__Impl rule__UsedDescriptions__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2133:2: rule__UsedDescriptions__Group__0__Impl rule__UsedDescriptions__Group__1
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__Group__0__Impl_in_rule__UsedDescriptions__Group__04365);
            rule__UsedDescriptions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsedDescriptions__Group__1_in_rule__UsedDescriptions__Group__04368);
            rule__UsedDescriptions__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedDescriptions__Group__0"


    // $ANTLR start "rule__UsedDescriptions__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2140:1: rule__UsedDescriptions__Group__0__Impl : ( 'use:' ) ;
    public final void rule__UsedDescriptions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2144:1: ( ( 'use:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2145:1: ( 'use:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2145:1: ( 'use:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2146:1: 'use:'
            {
             before(grammarAccess.getUsedDescriptionsAccess().getUseKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__UsedDescriptions__Group__0__Impl4396); 
             after(grammarAccess.getUsedDescriptionsAccess().getUseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedDescriptions__Group__0__Impl"


    // $ANTLR start "rule__UsedDescriptions__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2159:1: rule__UsedDescriptions__Group__1 : rule__UsedDescriptions__Group__1__Impl rule__UsedDescriptions__Group__2 ;
    public final void rule__UsedDescriptions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2163:1: ( rule__UsedDescriptions__Group__1__Impl rule__UsedDescriptions__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2164:2: rule__UsedDescriptions__Group__1__Impl rule__UsedDescriptions__Group__2
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__Group__1__Impl_in_rule__UsedDescriptions__Group__14427);
            rule__UsedDescriptions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsedDescriptions__Group__2_in_rule__UsedDescriptions__Group__14430);
            rule__UsedDescriptions__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedDescriptions__Group__1"


    // $ANTLR start "rule__UsedDescriptions__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2171:1: rule__UsedDescriptions__Group__1__Impl : ( ( rule__UsedDescriptions__DescriptionAssignment_1 ) ) ;
    public final void rule__UsedDescriptions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2175:1: ( ( ( rule__UsedDescriptions__DescriptionAssignment_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2176:1: ( ( rule__UsedDescriptions__DescriptionAssignment_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2176:1: ( ( rule__UsedDescriptions__DescriptionAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2177:1: ( rule__UsedDescriptions__DescriptionAssignment_1 )
            {
             before(grammarAccess.getUsedDescriptionsAccess().getDescriptionAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2178:1: ( rule__UsedDescriptions__DescriptionAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2178:2: rule__UsedDescriptions__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__DescriptionAssignment_1_in_rule__UsedDescriptions__Group__1__Impl4457);
            rule__UsedDescriptions__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUsedDescriptionsAccess().getDescriptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedDescriptions__Group__1__Impl"


    // $ANTLR start "rule__UsedDescriptions__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2188:1: rule__UsedDescriptions__Group__2 : rule__UsedDescriptions__Group__2__Impl rule__UsedDescriptions__Group__3 ;
    public final void rule__UsedDescriptions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2192:1: ( rule__UsedDescriptions__Group__2__Impl rule__UsedDescriptions__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2193:2: rule__UsedDescriptions__Group__2__Impl rule__UsedDescriptions__Group__3
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__Group__2__Impl_in_rule__UsedDescriptions__Group__24487);
            rule__UsedDescriptions__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsedDescriptions__Group__3_in_rule__UsedDescriptions__Group__24490);
            rule__UsedDescriptions__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedDescriptions__Group__2"


    // $ANTLR start "rule__UsedDescriptions__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2200:1: rule__UsedDescriptions__Group__2__Impl : ( ( rule__UsedDescriptions__Group_2__0 )? ) ;
    public final void rule__UsedDescriptions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2204:1: ( ( ( rule__UsedDescriptions__Group_2__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2205:1: ( ( rule__UsedDescriptions__Group_2__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2205:1: ( ( rule__UsedDescriptions__Group_2__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2206:1: ( rule__UsedDescriptions__Group_2__0 )?
            {
             before(grammarAccess.getUsedDescriptionsAccess().getGroup_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2207:1: ( rule__UsedDescriptions__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2207:2: rule__UsedDescriptions__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__UsedDescriptions__Group_2__0_in_rule__UsedDescriptions__Group__2__Impl4517);
                    rule__UsedDescriptions__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUsedDescriptionsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedDescriptions__Group__2__Impl"


    // $ANTLR start "rule__UsedDescriptions__Group__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2217:1: rule__UsedDescriptions__Group__3 : rule__UsedDescriptions__Group__3__Impl ;
    public final void rule__UsedDescriptions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2221:1: ( rule__UsedDescriptions__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2222:2: rule__UsedDescriptions__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__Group__3__Impl_in_rule__UsedDescriptions__Group__34548);
            rule__UsedDescriptions__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedDescriptions__Group__3"


    // $ANTLR start "rule__UsedDescriptions__Group__3__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2228:1: rule__UsedDescriptions__Group__3__Impl : ( ';' ) ;
    public final void rule__UsedDescriptions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2232:1: ( ( ';' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2233:1: ( ';' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2233:1: ( ';' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2234:1: ';'
            {
             before(grammarAccess.getUsedDescriptionsAccess().getSemicolonKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__UsedDescriptions__Group__3__Impl4576); 
             after(grammarAccess.getUsedDescriptionsAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedDescriptions__Group__3__Impl"


    // $ANTLR start "rule__UsedDescriptions__Group_2__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2255:1: rule__UsedDescriptions__Group_2__0 : rule__UsedDescriptions__Group_2__0__Impl rule__UsedDescriptions__Group_2__1 ;
    public final void rule__UsedDescriptions__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2259:1: ( rule__UsedDescriptions__Group_2__0__Impl rule__UsedDescriptions__Group_2__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2260:2: rule__UsedDescriptions__Group_2__0__Impl rule__UsedDescriptions__Group_2__1
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__Group_2__0__Impl_in_rule__UsedDescriptions__Group_2__04615);
            rule__UsedDescriptions__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsedDescriptions__Group_2__1_in_rule__UsedDescriptions__Group_2__04618);
            rule__UsedDescriptions__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedDescriptions__Group_2__0"


    // $ANTLR start "rule__UsedDescriptions__Group_2__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2267:1: rule__UsedDescriptions__Group_2__0__Impl : ( 'as:' ) ;
    public final void rule__UsedDescriptions__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2271:1: ( ( 'as:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2272:1: ( 'as:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2272:1: ( 'as:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2273:1: 'as:'
            {
             before(grammarAccess.getUsedDescriptionsAccess().getAsKeyword_2_0()); 
            match(input,25,FOLLOW_25_in_rule__UsedDescriptions__Group_2__0__Impl4646); 
             after(grammarAccess.getUsedDescriptionsAccess().getAsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedDescriptions__Group_2__0__Impl"


    // $ANTLR start "rule__UsedDescriptions__Group_2__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2286:1: rule__UsedDescriptions__Group_2__1 : rule__UsedDescriptions__Group_2__1__Impl ;
    public final void rule__UsedDescriptions__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2290:1: ( rule__UsedDescriptions__Group_2__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2291:2: rule__UsedDescriptions__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__Group_2__1__Impl_in_rule__UsedDescriptions__Group_2__14677);
            rule__UsedDescriptions__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedDescriptions__Group_2__1"


    // $ANTLR start "rule__UsedDescriptions__Group_2__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2297:1: rule__UsedDescriptions__Group_2__1__Impl : ( ( rule__UsedDescriptions__IdAssignment_2_1 ) ) ;
    public final void rule__UsedDescriptions__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2301:1: ( ( ( rule__UsedDescriptions__IdAssignment_2_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2302:1: ( ( rule__UsedDescriptions__IdAssignment_2_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2302:1: ( ( rule__UsedDescriptions__IdAssignment_2_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2303:1: ( rule__UsedDescriptions__IdAssignment_2_1 )
            {
             before(grammarAccess.getUsedDescriptionsAccess().getIdAssignment_2_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2304:1: ( rule__UsedDescriptions__IdAssignment_2_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2304:2: rule__UsedDescriptions__IdAssignment_2_1
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__IdAssignment_2_1_in_rule__UsedDescriptions__Group_2__1__Impl4704);
            rule__UsedDescriptions__IdAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUsedDescriptionsAccess().getIdAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedDescriptions__Group_2__1__Impl"


    // $ANTLR start "rule__Definition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2318:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2322:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2323:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__04738);
            rule__Definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__04741);
            rule__Definition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__0"


    // $ANTLR start "rule__Definition__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2330:1: rule__Definition__Group__0__Impl : ( ( rule__Definition__ConcreteDefitionAssignment_0 ) ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2334:1: ( ( ( rule__Definition__ConcreteDefitionAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2335:1: ( ( rule__Definition__ConcreteDefitionAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2335:1: ( ( rule__Definition__ConcreteDefitionAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2336:1: ( rule__Definition__ConcreteDefitionAssignment_0 )
            {
             before(grammarAccess.getDefinitionAccess().getConcreteDefitionAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2337:1: ( rule__Definition__ConcreteDefitionAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2337:2: rule__Definition__ConcreteDefitionAssignment_0
            {
            pushFollow(FOLLOW_rule__Definition__ConcreteDefitionAssignment_0_in_rule__Definition__Group__0__Impl4768);
            rule__Definition__ConcreteDefitionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getConcreteDefitionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__0__Impl"


    // $ANTLR start "rule__Definition__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2347:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2351:1: ( rule__Definition__Group__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2352:2: rule__Definition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__14798);
            rule__Definition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__1"


    // $ANTLR start "rule__Definition__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2358:1: rule__Definition__Group__1__Impl : ( ';' ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2362:1: ( ( ';' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2363:1: ( ';' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2363:1: ( ';' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2364:1: ';'
            {
             before(grammarAccess.getDefinitionAccess().getSemicolonKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__Definition__Group__1__Impl4826); 
             after(grammarAccess.getDefinitionAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__1__Impl"


    // $ANTLR start "rule__TypeDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2381:1: rule__TypeDefinition__Group__0 : rule__TypeDefinition__Group__0__Impl rule__TypeDefinition__Group__1 ;
    public final void rule__TypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2385:1: ( rule__TypeDefinition__Group__0__Impl rule__TypeDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2386:2: rule__TypeDefinition__Group__0__Impl rule__TypeDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Group__0__Impl_in_rule__TypeDefinition__Group__04861);
            rule__TypeDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDefinition__Group__1_in_rule__TypeDefinition__Group__04864);
            rule__TypeDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDefinition__Group__0"


    // $ANTLR start "rule__TypeDefinition__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2393:1: rule__TypeDefinition__Group__0__Impl : ( 'type: ' ) ;
    public final void rule__TypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2397:1: ( ( 'type: ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2398:1: ( 'type: ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2398:1: ( 'type: ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2399:1: 'type: '
            {
             before(grammarAccess.getTypeDefinitionAccess().getTypeKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__TypeDefinition__Group__0__Impl4892); 
             after(grammarAccess.getTypeDefinitionAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDefinition__Group__0__Impl"


    // $ANTLR start "rule__TypeDefinition__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2412:1: rule__TypeDefinition__Group__1 : rule__TypeDefinition__Group__1__Impl rule__TypeDefinition__Group__2 ;
    public final void rule__TypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2416:1: ( rule__TypeDefinition__Group__1__Impl rule__TypeDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2417:2: rule__TypeDefinition__Group__1__Impl rule__TypeDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Group__1__Impl_in_rule__TypeDefinition__Group__14923);
            rule__TypeDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDefinition__Group__2_in_rule__TypeDefinition__Group__14926);
            rule__TypeDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDefinition__Group__1"


    // $ANTLR start "rule__TypeDefinition__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2424:1: rule__TypeDefinition__Group__1__Impl : ( ( rule__TypeDefinition__TypeAssignment_1 ) ) ;
    public final void rule__TypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2428:1: ( ( ( rule__TypeDefinition__TypeAssignment_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2429:1: ( ( rule__TypeDefinition__TypeAssignment_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2429:1: ( ( rule__TypeDefinition__TypeAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2430:1: ( rule__TypeDefinition__TypeAssignment_1 )
            {
             before(grammarAccess.getTypeDefinitionAccess().getTypeAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2431:1: ( rule__TypeDefinition__TypeAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2431:2: rule__TypeDefinition__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__TypeDefinition__TypeAssignment_1_in_rule__TypeDefinition__Group__1__Impl4953);
            rule__TypeDefinition__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeDefinitionAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDefinition__Group__1__Impl"


    // $ANTLR start "rule__TypeDefinition__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2441:1: rule__TypeDefinition__Group__2 : rule__TypeDefinition__Group__2__Impl ;
    public final void rule__TypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2445:1: ( rule__TypeDefinition__Group__2__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2446:2: rule__TypeDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Group__2__Impl_in_rule__TypeDefinition__Group__24983);
            rule__TypeDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDefinition__Group__2"


    // $ANTLR start "rule__TypeDefinition__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2452:1: rule__TypeDefinition__Group__2__Impl : ( ';' ) ;
    public final void rule__TypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2456:1: ( ( ';' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2457:1: ( ';' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2457:1: ( ';' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2458:1: ';'
            {
             before(grammarAccess.getTypeDefinitionAccess().getSemicolonKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__TypeDefinition__Group__2__Impl5011); 
             after(grammarAccess.getTypeDefinitionAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDefinition__Group__2__Impl"


    // $ANTLR start "rule__TabViewDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2477:1: rule__TabViewDefinition__Group__0 : rule__TabViewDefinition__Group__0__Impl rule__TabViewDefinition__Group__1 ;
    public final void rule__TabViewDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2481:1: ( rule__TabViewDefinition__Group__0__Impl rule__TabViewDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2482:2: rule__TabViewDefinition__Group__0__Impl rule__TabViewDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__TabViewDefinition__Group__0__Impl_in_rule__TabViewDefinition__Group__05048);
            rule__TabViewDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TabViewDefinition__Group__1_in_rule__TabViewDefinition__Group__05051);
            rule__TabViewDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabViewDefinition__Group__0"


    // $ANTLR start "rule__TabViewDefinition__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2489:1: rule__TabViewDefinition__Group__0__Impl : ( ( rule__TabViewDefinition__NameAssignment_0 ) ) ;
    public final void rule__TabViewDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2493:1: ( ( ( rule__TabViewDefinition__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2494:1: ( ( rule__TabViewDefinition__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2494:1: ( ( rule__TabViewDefinition__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2495:1: ( rule__TabViewDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getTabViewDefinitionAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2496:1: ( rule__TabViewDefinition__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2496:2: rule__TabViewDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__TabViewDefinition__NameAssignment_0_in_rule__TabViewDefinition__Group__0__Impl5078);
            rule__TabViewDefinition__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTabViewDefinitionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabViewDefinition__Group__0__Impl"


    // $ANTLR start "rule__TabViewDefinition__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2506:1: rule__TabViewDefinition__Group__1 : rule__TabViewDefinition__Group__1__Impl rule__TabViewDefinition__Group__2 ;
    public final void rule__TabViewDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2510:1: ( rule__TabViewDefinition__Group__1__Impl rule__TabViewDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2511:2: rule__TabViewDefinition__Group__1__Impl rule__TabViewDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__TabViewDefinition__Group__1__Impl_in_rule__TabViewDefinition__Group__15108);
            rule__TabViewDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TabViewDefinition__Group__2_in_rule__TabViewDefinition__Group__15111);
            rule__TabViewDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabViewDefinition__Group__1"


    // $ANTLR start "rule__TabViewDefinition__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2518:1: rule__TabViewDefinition__Group__1__Impl : ( ( rule__TabViewDefinition__TabsAssignment_1 )* ) ;
    public final void rule__TabViewDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2522:1: ( ( ( rule__TabViewDefinition__TabsAssignment_1 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2523:1: ( ( rule__TabViewDefinition__TabsAssignment_1 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2523:1: ( ( rule__TabViewDefinition__TabsAssignment_1 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2524:1: ( rule__TabViewDefinition__TabsAssignment_1 )*
            {
             before(grammarAccess.getTabViewDefinitionAccess().getTabsAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2525:1: ( rule__TabViewDefinition__TabsAssignment_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_TABNAME) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2525:2: rule__TabViewDefinition__TabsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__TabViewDefinition__TabsAssignment_1_in_rule__TabViewDefinition__Group__1__Impl5138);
            	    rule__TabViewDefinition__TabsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getTabViewDefinitionAccess().getTabsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabViewDefinition__Group__1__Impl"


    // $ANTLR start "rule__TabViewDefinition__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2535:1: rule__TabViewDefinition__Group__2 : rule__TabViewDefinition__Group__2__Impl rule__TabViewDefinition__Group__3 ;
    public final void rule__TabViewDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2539:1: ( rule__TabViewDefinition__Group__2__Impl rule__TabViewDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2540:2: rule__TabViewDefinition__Group__2__Impl rule__TabViewDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__TabViewDefinition__Group__2__Impl_in_rule__TabViewDefinition__Group__25169);
            rule__TabViewDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TabViewDefinition__Group__3_in_rule__TabViewDefinition__Group__25172);
            rule__TabViewDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabViewDefinition__Group__2"


    // $ANTLR start "rule__TabViewDefinition__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2547:1: rule__TabViewDefinition__Group__2__Impl : ( 'as:' ) ;
    public final void rule__TabViewDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2551:1: ( ( 'as:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2552:1: ( 'as:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2552:1: ( 'as:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2553:1: 'as:'
            {
             before(grammarAccess.getTabViewDefinitionAccess().getAsKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__TabViewDefinition__Group__2__Impl5200); 
             after(grammarAccess.getTabViewDefinitionAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabViewDefinition__Group__2__Impl"


    // $ANTLR start "rule__TabViewDefinition__Group__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2566:1: rule__TabViewDefinition__Group__3 : rule__TabViewDefinition__Group__3__Impl rule__TabViewDefinition__Group__4 ;
    public final void rule__TabViewDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2570:1: ( rule__TabViewDefinition__Group__3__Impl rule__TabViewDefinition__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2571:2: rule__TabViewDefinition__Group__3__Impl rule__TabViewDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__TabViewDefinition__Group__3__Impl_in_rule__TabViewDefinition__Group__35231);
            rule__TabViewDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TabViewDefinition__Group__4_in_rule__TabViewDefinition__Group__35234);
            rule__TabViewDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabViewDefinition__Group__3"


    // $ANTLR start "rule__TabViewDefinition__Group__3__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2578:1: rule__TabViewDefinition__Group__3__Impl : ( ( rule__TabViewDefinition__IdAssignment_3 ) ) ;
    public final void rule__TabViewDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2582:1: ( ( ( rule__TabViewDefinition__IdAssignment_3 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2583:1: ( ( rule__TabViewDefinition__IdAssignment_3 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2583:1: ( ( rule__TabViewDefinition__IdAssignment_3 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2584:1: ( rule__TabViewDefinition__IdAssignment_3 )
            {
             before(grammarAccess.getTabViewDefinitionAccess().getIdAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2585:1: ( rule__TabViewDefinition__IdAssignment_3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2585:2: rule__TabViewDefinition__IdAssignment_3
            {
            pushFollow(FOLLOW_rule__TabViewDefinition__IdAssignment_3_in_rule__TabViewDefinition__Group__3__Impl5261);
            rule__TabViewDefinition__IdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTabViewDefinitionAccess().getIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabViewDefinition__Group__3__Impl"


    // $ANTLR start "rule__TabViewDefinition__Group__4"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2595:1: rule__TabViewDefinition__Group__4 : rule__TabViewDefinition__Group__4__Impl ;
    public final void rule__TabViewDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2599:1: ( rule__TabViewDefinition__Group__4__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2600:2: rule__TabViewDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TabViewDefinition__Group__4__Impl_in_rule__TabViewDefinition__Group__45291);
            rule__TabViewDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabViewDefinition__Group__4"


    // $ANTLR start "rule__TabViewDefinition__Group__4__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2606:1: rule__TabViewDefinition__Group__4__Impl : ( ( rule__TabViewDefinition__Group_4__0 )? ) ;
    public final void rule__TabViewDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2610:1: ( ( ( rule__TabViewDefinition__Group_4__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2611:1: ( ( rule__TabViewDefinition__Group_4__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2611:1: ( ( rule__TabViewDefinition__Group_4__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2612:1: ( rule__TabViewDefinition__Group_4__0 )?
            {
             before(grammarAccess.getTabViewDefinitionAccess().getGroup_4()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2613:1: ( rule__TabViewDefinition__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2613:2: rule__TabViewDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__TabViewDefinition__Group_4__0_in_rule__TabViewDefinition__Group__4__Impl5318);
                    rule__TabViewDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTabViewDefinitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabViewDefinition__Group__4__Impl"


    // $ANTLR start "rule__TabViewDefinition__Group_4__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2633:1: rule__TabViewDefinition__Group_4__0 : rule__TabViewDefinition__Group_4__0__Impl rule__TabViewDefinition__Group_4__1 ;
    public final void rule__TabViewDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2637:1: ( rule__TabViewDefinition__Group_4__0__Impl rule__TabViewDefinition__Group_4__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2638:2: rule__TabViewDefinition__Group_4__0__Impl rule__TabViewDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__TabViewDefinition__Group_4__0__Impl_in_rule__TabViewDefinition__Group_4__05359);
            rule__TabViewDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TabViewDefinition__Group_4__1_in_rule__TabViewDefinition__Group_4__05362);
            rule__TabViewDefinition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabViewDefinition__Group_4__0"


    // $ANTLR start "rule__TabViewDefinition__Group_4__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2645:1: rule__TabViewDefinition__Group_4__0__Impl : ( '->' ) ;
    public final void rule__TabViewDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2649:1: ( ( '->' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2650:1: ( '->' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2650:1: ( '->' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2651:1: '->'
            {
             before(grammarAccess.getTabViewDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); 
            match(input,22,FOLLOW_22_in_rule__TabViewDefinition__Group_4__0__Impl5390); 
             after(grammarAccess.getTabViewDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabViewDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__TabViewDefinition__Group_4__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2664:1: rule__TabViewDefinition__Group_4__1 : rule__TabViewDefinition__Group_4__1__Impl ;
    public final void rule__TabViewDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2668:1: ( rule__TabViewDefinition__Group_4__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2669:2: rule__TabViewDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__TabViewDefinition__Group_4__1__Impl_in_rule__TabViewDefinition__Group_4__15421);
            rule__TabViewDefinition__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabViewDefinition__Group_4__1"


    // $ANTLR start "rule__TabViewDefinition__Group_4__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2675:1: rule__TabViewDefinition__Group_4__1__Impl : ( ( rule__TabViewDefinition__PropertiesAssignment_4_1 ) ) ;
    public final void rule__TabViewDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2679:1: ( ( ( rule__TabViewDefinition__PropertiesAssignment_4_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2680:1: ( ( rule__TabViewDefinition__PropertiesAssignment_4_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2680:1: ( ( rule__TabViewDefinition__PropertiesAssignment_4_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2681:1: ( rule__TabViewDefinition__PropertiesAssignment_4_1 )
            {
             before(grammarAccess.getTabViewDefinitionAccess().getPropertiesAssignment_4_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2682:1: ( rule__TabViewDefinition__PropertiesAssignment_4_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2682:2: rule__TabViewDefinition__PropertiesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__TabViewDefinition__PropertiesAssignment_4_1_in_rule__TabViewDefinition__Group_4__1__Impl5448);
            rule__TabViewDefinition__PropertiesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTabViewDefinitionAccess().getPropertiesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabViewDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__Multiselection__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2696:1: rule__Multiselection__Group__0 : rule__Multiselection__Group__0__Impl rule__Multiselection__Group__1 ;
    public final void rule__Multiselection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2700:1: ( rule__Multiselection__Group__0__Impl rule__Multiselection__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2701:2: rule__Multiselection__Group__0__Impl rule__Multiselection__Group__1
            {
            pushFollow(FOLLOW_rule__Multiselection__Group__0__Impl_in_rule__Multiselection__Group__05482);
            rule__Multiselection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiselection__Group__1_in_rule__Multiselection__Group__05485);
            rule__Multiselection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiselection__Group__0"


    // $ANTLR start "rule__Multiselection__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2708:1: rule__Multiselection__Group__0__Impl : ( ( rule__Multiselection__NameAssignment_0 ) ) ;
    public final void rule__Multiselection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2712:1: ( ( ( rule__Multiselection__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2713:1: ( ( rule__Multiselection__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2713:1: ( ( rule__Multiselection__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2714:1: ( rule__Multiselection__NameAssignment_0 )
            {
             before(grammarAccess.getMultiselectionAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2715:1: ( rule__Multiselection__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2715:2: rule__Multiselection__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Multiselection__NameAssignment_0_in_rule__Multiselection__Group__0__Impl5512);
            rule__Multiselection__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiselectionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiselection__Group__0__Impl"


    // $ANTLR start "rule__Multiselection__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2725:1: rule__Multiselection__Group__1 : rule__Multiselection__Group__1__Impl ;
    public final void rule__Multiselection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2729:1: ( rule__Multiselection__Group__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2730:2: rule__Multiselection__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiselection__Group__1__Impl_in_rule__Multiselection__Group__15542);
            rule__Multiselection__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiselection__Group__1"


    // $ANTLR start "rule__Multiselection__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2736:1: rule__Multiselection__Group__1__Impl : ( ( rule__Multiselection__InputTypeAssignment_1 )? ) ;
    public final void rule__Multiselection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2740:1: ( ( ( rule__Multiselection__InputTypeAssignment_1 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2741:1: ( ( rule__Multiselection__InputTypeAssignment_1 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2741:1: ( ( rule__Multiselection__InputTypeAssignment_1 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2742:1: ( rule__Multiselection__InputTypeAssignment_1 )?
            {
             before(grammarAccess.getMultiselectionAccess().getInputTypeAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2743:1: ( rule__Multiselection__InputTypeAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INPUT_DESCRIPTION) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2743:2: rule__Multiselection__InputTypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Multiselection__InputTypeAssignment_1_in_rule__Multiselection__Group__1__Impl5569);
                    rule__Multiselection__InputTypeAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiselectionAccess().getInputTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiselection__Group__1__Impl"


    // $ANTLR start "rule__TextfieldDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2757:1: rule__TextfieldDefinition__Group__0 : rule__TextfieldDefinition__Group__0__Impl rule__TextfieldDefinition__Group__1 ;
    public final void rule__TextfieldDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2761:1: ( rule__TextfieldDefinition__Group__0__Impl rule__TextfieldDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2762:2: rule__TextfieldDefinition__Group__0__Impl rule__TextfieldDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__0__Impl_in_rule__TextfieldDefinition__Group__05604);
            rule__TextfieldDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__1_in_rule__TextfieldDefinition__Group__05607);
            rule__TextfieldDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldDefinition__Group__0"


    // $ANTLR start "rule__TextfieldDefinition__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2769:1: rule__TextfieldDefinition__Group__0__Impl : ( ( rule__TextfieldDefinition__NameAssignment_0 ) ) ;
    public final void rule__TextfieldDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2773:1: ( ( ( rule__TextfieldDefinition__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2774:1: ( ( rule__TextfieldDefinition__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2774:1: ( ( rule__TextfieldDefinition__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2775:1: ( rule__TextfieldDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getTextfieldDefinitionAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2776:1: ( rule__TextfieldDefinition__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2776:2: rule__TextfieldDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__NameAssignment_0_in_rule__TextfieldDefinition__Group__0__Impl5634);
            rule__TextfieldDefinition__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTextfieldDefinitionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldDefinition__Group__0__Impl"


    // $ANTLR start "rule__TextfieldDefinition__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2786:1: rule__TextfieldDefinition__Group__1 : rule__TextfieldDefinition__Group__1__Impl rule__TextfieldDefinition__Group__2 ;
    public final void rule__TextfieldDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2790:1: ( rule__TextfieldDefinition__Group__1__Impl rule__TextfieldDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2791:2: rule__TextfieldDefinition__Group__1__Impl rule__TextfieldDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__1__Impl_in_rule__TextfieldDefinition__Group__15664);
            rule__TextfieldDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__2_in_rule__TextfieldDefinition__Group__15667);
            rule__TextfieldDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldDefinition__Group__1"


    // $ANTLR start "rule__TextfieldDefinition__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2798:1: rule__TextfieldDefinition__Group__1__Impl : ( 'as:' ) ;
    public final void rule__TextfieldDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2802:1: ( ( 'as:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2803:1: ( 'as:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2803:1: ( 'as:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2804:1: 'as:'
            {
             before(grammarAccess.getTextfieldDefinitionAccess().getAsKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__TextfieldDefinition__Group__1__Impl5695); 
             after(grammarAccess.getTextfieldDefinitionAccess().getAsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldDefinition__Group__1__Impl"


    // $ANTLR start "rule__TextfieldDefinition__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2817:1: rule__TextfieldDefinition__Group__2 : rule__TextfieldDefinition__Group__2__Impl rule__TextfieldDefinition__Group__3 ;
    public final void rule__TextfieldDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2821:1: ( rule__TextfieldDefinition__Group__2__Impl rule__TextfieldDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2822:2: rule__TextfieldDefinition__Group__2__Impl rule__TextfieldDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__2__Impl_in_rule__TextfieldDefinition__Group__25726);
            rule__TextfieldDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__3_in_rule__TextfieldDefinition__Group__25729);
            rule__TextfieldDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldDefinition__Group__2"


    // $ANTLR start "rule__TextfieldDefinition__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2829:1: rule__TextfieldDefinition__Group__2__Impl : ( ( rule__TextfieldDefinition__IdAssignment_2 ) ) ;
    public final void rule__TextfieldDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2833:1: ( ( ( rule__TextfieldDefinition__IdAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2834:1: ( ( rule__TextfieldDefinition__IdAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2834:1: ( ( rule__TextfieldDefinition__IdAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2835:1: ( rule__TextfieldDefinition__IdAssignment_2 )
            {
             before(grammarAccess.getTextfieldDefinitionAccess().getIdAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2836:1: ( rule__TextfieldDefinition__IdAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2836:2: rule__TextfieldDefinition__IdAssignment_2
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__IdAssignment_2_in_rule__TextfieldDefinition__Group__2__Impl5756);
            rule__TextfieldDefinition__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTextfieldDefinitionAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldDefinition__Group__2__Impl"


    // $ANTLR start "rule__TextfieldDefinition__Group__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2846:1: rule__TextfieldDefinition__Group__3 : rule__TextfieldDefinition__Group__3__Impl ;
    public final void rule__TextfieldDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2850:1: ( rule__TextfieldDefinition__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2851:2: rule__TextfieldDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__3__Impl_in_rule__TextfieldDefinition__Group__35786);
            rule__TextfieldDefinition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldDefinition__Group__3"


    // $ANTLR start "rule__TextfieldDefinition__Group__3__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2857:1: rule__TextfieldDefinition__Group__3__Impl : ( ( rule__TextfieldDefinition__Group_3__0 )? ) ;
    public final void rule__TextfieldDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2861:1: ( ( ( rule__TextfieldDefinition__Group_3__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2862:1: ( ( rule__TextfieldDefinition__Group_3__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2862:1: ( ( rule__TextfieldDefinition__Group_3__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2863:1: ( rule__TextfieldDefinition__Group_3__0 )?
            {
             before(grammarAccess.getTextfieldDefinitionAccess().getGroup_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2864:1: ( rule__TextfieldDefinition__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==22) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2864:2: rule__TextfieldDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__TextfieldDefinition__Group_3__0_in_rule__TextfieldDefinition__Group__3__Impl5813);
                    rule__TextfieldDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextfieldDefinitionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldDefinition__Group__3__Impl"


    // $ANTLR start "rule__TextfieldDefinition__Group_3__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2882:1: rule__TextfieldDefinition__Group_3__0 : rule__TextfieldDefinition__Group_3__0__Impl rule__TextfieldDefinition__Group_3__1 ;
    public final void rule__TextfieldDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2886:1: ( rule__TextfieldDefinition__Group_3__0__Impl rule__TextfieldDefinition__Group_3__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2887:2: rule__TextfieldDefinition__Group_3__0__Impl rule__TextfieldDefinition__Group_3__1
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group_3__0__Impl_in_rule__TextfieldDefinition__Group_3__05852);
            rule__TextfieldDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextfieldDefinition__Group_3__1_in_rule__TextfieldDefinition__Group_3__05855);
            rule__TextfieldDefinition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldDefinition__Group_3__0"


    // $ANTLR start "rule__TextfieldDefinition__Group_3__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2894:1: rule__TextfieldDefinition__Group_3__0__Impl : ( '->' ) ;
    public final void rule__TextfieldDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2898:1: ( ( '->' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2899:1: ( '->' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2899:1: ( '->' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2900:1: '->'
            {
             before(grammarAccess.getTextfieldDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__TextfieldDefinition__Group_3__0__Impl5883); 
             after(grammarAccess.getTextfieldDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__TextfieldDefinition__Group_3__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2913:1: rule__TextfieldDefinition__Group_3__1 : rule__TextfieldDefinition__Group_3__1__Impl ;
    public final void rule__TextfieldDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2917:1: ( rule__TextfieldDefinition__Group_3__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2918:2: rule__TextfieldDefinition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group_3__1__Impl_in_rule__TextfieldDefinition__Group_3__15914);
            rule__TextfieldDefinition__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldDefinition__Group_3__1"


    // $ANTLR start "rule__TextfieldDefinition__Group_3__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2924:1: rule__TextfieldDefinition__Group_3__1__Impl : ( ( rule__TextfieldDefinition__PropertiesAssignment_3_1 ) ) ;
    public final void rule__TextfieldDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2928:1: ( ( ( rule__TextfieldDefinition__PropertiesAssignment_3_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2929:1: ( ( rule__TextfieldDefinition__PropertiesAssignment_3_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2929:1: ( ( rule__TextfieldDefinition__PropertiesAssignment_3_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2930:1: ( rule__TextfieldDefinition__PropertiesAssignment_3_1 )
            {
             before(grammarAccess.getTextfieldDefinitionAccess().getPropertiesAssignment_3_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2931:1: ( rule__TextfieldDefinition__PropertiesAssignment_3_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2931:2: rule__TextfieldDefinition__PropertiesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__PropertiesAssignment_3_1_in_rule__TextfieldDefinition__Group_3__1__Impl5941);
            rule__TextfieldDefinition__PropertiesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTextfieldDefinitionAccess().getPropertiesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__TextfieldProperties__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2945:1: rule__TextfieldProperties__Group__0 : rule__TextfieldProperties__Group__0__Impl rule__TextfieldProperties__Group__1 ;
    public final void rule__TextfieldProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2949:1: ( rule__TextfieldProperties__Group__0__Impl rule__TextfieldProperties__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2950:2: rule__TextfieldProperties__Group__0__Impl rule__TextfieldProperties__Group__1
            {
            pushFollow(FOLLOW_rule__TextfieldProperties__Group__0__Impl_in_rule__TextfieldProperties__Group__05975);
            rule__TextfieldProperties__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextfieldProperties__Group__1_in_rule__TextfieldProperties__Group__05978);
            rule__TextfieldProperties__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldProperties__Group__0"


    // $ANTLR start "rule__TextfieldProperties__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2957:1: rule__TextfieldProperties__Group__0__Impl : ( ( rule__TextfieldProperties__CommonPropertiesAssignment_0 ) ) ;
    public final void rule__TextfieldProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2961:1: ( ( ( rule__TextfieldProperties__CommonPropertiesAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2962:1: ( ( rule__TextfieldProperties__CommonPropertiesAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2962:1: ( ( rule__TextfieldProperties__CommonPropertiesAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2963:1: ( rule__TextfieldProperties__CommonPropertiesAssignment_0 )
            {
             before(grammarAccess.getTextfieldPropertiesAccess().getCommonPropertiesAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2964:1: ( rule__TextfieldProperties__CommonPropertiesAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2964:2: rule__TextfieldProperties__CommonPropertiesAssignment_0
            {
            pushFollow(FOLLOW_rule__TextfieldProperties__CommonPropertiesAssignment_0_in_rule__TextfieldProperties__Group__0__Impl6005);
            rule__TextfieldProperties__CommonPropertiesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTextfieldPropertiesAccess().getCommonPropertiesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldProperties__Group__0__Impl"


    // $ANTLR start "rule__TextfieldProperties__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2974:1: rule__TextfieldProperties__Group__1 : rule__TextfieldProperties__Group__1__Impl rule__TextfieldProperties__Group__2 ;
    public final void rule__TextfieldProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2978:1: ( rule__TextfieldProperties__Group__1__Impl rule__TextfieldProperties__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2979:2: rule__TextfieldProperties__Group__1__Impl rule__TextfieldProperties__Group__2
            {
            pushFollow(FOLLOW_rule__TextfieldProperties__Group__1__Impl_in_rule__TextfieldProperties__Group__16035);
            rule__TextfieldProperties__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextfieldProperties__Group__2_in_rule__TextfieldProperties__Group__16038);
            rule__TextfieldProperties__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldProperties__Group__1"


    // $ANTLR start "rule__TextfieldProperties__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2986:1: rule__TextfieldProperties__Group__1__Impl : ( ( rule__TextfieldProperties__Group_1__0 )? ) ;
    public final void rule__TextfieldProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2990:1: ( ( ( rule__TextfieldProperties__Group_1__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2991:1: ( ( rule__TextfieldProperties__Group_1__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2991:1: ( ( rule__TextfieldProperties__Group_1__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2992:1: ( rule__TextfieldProperties__Group_1__0 )?
            {
             before(grammarAccess.getTextfieldPropertiesAccess().getGroup_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2993:1: ( rule__TextfieldProperties__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2993:2: rule__TextfieldProperties__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TextfieldProperties__Group_1__0_in_rule__TextfieldProperties__Group__1__Impl6065);
                    rule__TextfieldProperties__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextfieldPropertiesAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldProperties__Group__1__Impl"


    // $ANTLR start "rule__TextfieldProperties__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3003:1: rule__TextfieldProperties__Group__2 : rule__TextfieldProperties__Group__2__Impl ;
    public final void rule__TextfieldProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3007:1: ( rule__TextfieldProperties__Group__2__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3008:2: rule__TextfieldProperties__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TextfieldProperties__Group__2__Impl_in_rule__TextfieldProperties__Group__26096);
            rule__TextfieldProperties__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldProperties__Group__2"


    // $ANTLR start "rule__TextfieldProperties__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3014:1: rule__TextfieldProperties__Group__2__Impl : ( ( rule__TextfieldProperties__Group_2__0 )? ) ;
    public final void rule__TextfieldProperties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3018:1: ( ( ( rule__TextfieldProperties__Group_2__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3019:1: ( ( rule__TextfieldProperties__Group_2__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3019:1: ( ( rule__TextfieldProperties__Group_2__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3020:1: ( rule__TextfieldProperties__Group_2__0 )?
            {
             before(grammarAccess.getTextfieldPropertiesAccess().getGroup_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3021:1: ( rule__TextfieldProperties__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3021:2: rule__TextfieldProperties__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TextfieldProperties__Group_2__0_in_rule__TextfieldProperties__Group__2__Impl6123);
                    rule__TextfieldProperties__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextfieldPropertiesAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldProperties__Group__2__Impl"


    // $ANTLR start "rule__TextfieldProperties__Group_1__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3037:1: rule__TextfieldProperties__Group_1__0 : rule__TextfieldProperties__Group_1__0__Impl rule__TextfieldProperties__Group_1__1 ;
    public final void rule__TextfieldProperties__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3041:1: ( rule__TextfieldProperties__Group_1__0__Impl rule__TextfieldProperties__Group_1__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3042:2: rule__TextfieldProperties__Group_1__0__Impl rule__TextfieldProperties__Group_1__1
            {
            pushFollow(FOLLOW_rule__TextfieldProperties__Group_1__0__Impl_in_rule__TextfieldProperties__Group_1__06160);
            rule__TextfieldProperties__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextfieldProperties__Group_1__1_in_rule__TextfieldProperties__Group_1__06163);
            rule__TextfieldProperties__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldProperties__Group_1__0"


    // $ANTLR start "rule__TextfieldProperties__Group_1__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3049:1: rule__TextfieldProperties__Group_1__0__Impl : ( 'text=' ) ;
    public final void rule__TextfieldProperties__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3053:1: ( ( 'text=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3054:1: ( 'text=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3054:1: ( 'text=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3055:1: 'text='
            {
             before(grammarAccess.getTextfieldPropertiesAccess().getTextKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__TextfieldProperties__Group_1__0__Impl6191); 
             after(grammarAccess.getTextfieldPropertiesAccess().getTextKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldProperties__Group_1__0__Impl"


    // $ANTLR start "rule__TextfieldProperties__Group_1__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3068:1: rule__TextfieldProperties__Group_1__1 : rule__TextfieldProperties__Group_1__1__Impl ;
    public final void rule__TextfieldProperties__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3072:1: ( rule__TextfieldProperties__Group_1__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3073:2: rule__TextfieldProperties__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TextfieldProperties__Group_1__1__Impl_in_rule__TextfieldProperties__Group_1__16222);
            rule__TextfieldProperties__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldProperties__Group_1__1"


    // $ANTLR start "rule__TextfieldProperties__Group_1__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3079:1: rule__TextfieldProperties__Group_1__1__Impl : ( ( rule__TextfieldProperties__TextAssignment_1_1 ) ) ;
    public final void rule__TextfieldProperties__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3083:1: ( ( ( rule__TextfieldProperties__TextAssignment_1_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3084:1: ( ( rule__TextfieldProperties__TextAssignment_1_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3084:1: ( ( rule__TextfieldProperties__TextAssignment_1_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3085:1: ( rule__TextfieldProperties__TextAssignment_1_1 )
            {
             before(grammarAccess.getTextfieldPropertiesAccess().getTextAssignment_1_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3086:1: ( rule__TextfieldProperties__TextAssignment_1_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3086:2: rule__TextfieldProperties__TextAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TextfieldProperties__TextAssignment_1_1_in_rule__TextfieldProperties__Group_1__1__Impl6249);
            rule__TextfieldProperties__TextAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTextfieldPropertiesAccess().getTextAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldProperties__Group_1__1__Impl"


    // $ANTLR start "rule__TextfieldProperties__Group_2__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3100:1: rule__TextfieldProperties__Group_2__0 : rule__TextfieldProperties__Group_2__0__Impl rule__TextfieldProperties__Group_2__1 ;
    public final void rule__TextfieldProperties__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3104:1: ( rule__TextfieldProperties__Group_2__0__Impl rule__TextfieldProperties__Group_2__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3105:2: rule__TextfieldProperties__Group_2__0__Impl rule__TextfieldProperties__Group_2__1
            {
            pushFollow(FOLLOW_rule__TextfieldProperties__Group_2__0__Impl_in_rule__TextfieldProperties__Group_2__06283);
            rule__TextfieldProperties__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextfieldProperties__Group_2__1_in_rule__TextfieldProperties__Group_2__06286);
            rule__TextfieldProperties__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldProperties__Group_2__0"


    // $ANTLR start "rule__TextfieldProperties__Group_2__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3112:1: rule__TextfieldProperties__Group_2__0__Impl : ( 'editable=' ) ;
    public final void rule__TextfieldProperties__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3116:1: ( ( 'editable=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3117:1: ( 'editable=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3117:1: ( 'editable=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3118:1: 'editable='
            {
             before(grammarAccess.getTextfieldPropertiesAccess().getEditableKeyword_2_0()); 
            match(input,28,FOLLOW_28_in_rule__TextfieldProperties__Group_2__0__Impl6314); 
             after(grammarAccess.getTextfieldPropertiesAccess().getEditableKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldProperties__Group_2__0__Impl"


    // $ANTLR start "rule__TextfieldProperties__Group_2__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3131:1: rule__TextfieldProperties__Group_2__1 : rule__TextfieldProperties__Group_2__1__Impl ;
    public final void rule__TextfieldProperties__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3135:1: ( rule__TextfieldProperties__Group_2__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3136:2: rule__TextfieldProperties__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TextfieldProperties__Group_2__1__Impl_in_rule__TextfieldProperties__Group_2__16345);
            rule__TextfieldProperties__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldProperties__Group_2__1"


    // $ANTLR start "rule__TextfieldProperties__Group_2__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3142:1: rule__TextfieldProperties__Group_2__1__Impl : ( ( rule__TextfieldProperties__EditableAssignment_2_1 ) ) ;
    public final void rule__TextfieldProperties__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3146:1: ( ( ( rule__TextfieldProperties__EditableAssignment_2_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3147:1: ( ( rule__TextfieldProperties__EditableAssignment_2_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3147:1: ( ( rule__TextfieldProperties__EditableAssignment_2_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3148:1: ( rule__TextfieldProperties__EditableAssignment_2_1 )
            {
             before(grammarAccess.getTextfieldPropertiesAccess().getEditableAssignment_2_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3149:1: ( rule__TextfieldProperties__EditableAssignment_2_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3149:2: rule__TextfieldProperties__EditableAssignment_2_1
            {
            pushFollow(FOLLOW_rule__TextfieldProperties__EditableAssignment_2_1_in_rule__TextfieldProperties__Group_2__1__Impl6372);
            rule__TextfieldProperties__EditableAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTextfieldPropertiesAccess().getEditableAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldProperties__Group_2__1__Impl"


    // $ANTLR start "rule__TextareaDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3163:1: rule__TextareaDefinition__Group__0 : rule__TextareaDefinition__Group__0__Impl rule__TextareaDefinition__Group__1 ;
    public final void rule__TextareaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3167:1: ( rule__TextareaDefinition__Group__0__Impl rule__TextareaDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3168:2: rule__TextareaDefinition__Group__0__Impl rule__TextareaDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__TextareaDefinition__Group__0__Impl_in_rule__TextareaDefinition__Group__06406);
            rule__TextareaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextareaDefinition__Group__1_in_rule__TextareaDefinition__Group__06409);
            rule__TextareaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaDefinition__Group__0"


    // $ANTLR start "rule__TextareaDefinition__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3175:1: rule__TextareaDefinition__Group__0__Impl : ( ( rule__TextareaDefinition__NameAssignment_0 ) ) ;
    public final void rule__TextareaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3179:1: ( ( ( rule__TextareaDefinition__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3180:1: ( ( rule__TextareaDefinition__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3180:1: ( ( rule__TextareaDefinition__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3181:1: ( rule__TextareaDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getTextareaDefinitionAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3182:1: ( rule__TextareaDefinition__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3182:2: rule__TextareaDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__TextareaDefinition__NameAssignment_0_in_rule__TextareaDefinition__Group__0__Impl6436);
            rule__TextareaDefinition__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTextareaDefinitionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaDefinition__Group__0__Impl"


    // $ANTLR start "rule__TextareaDefinition__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3192:1: rule__TextareaDefinition__Group__1 : rule__TextareaDefinition__Group__1__Impl rule__TextareaDefinition__Group__2 ;
    public final void rule__TextareaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3196:1: ( rule__TextareaDefinition__Group__1__Impl rule__TextareaDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3197:2: rule__TextareaDefinition__Group__1__Impl rule__TextareaDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__TextareaDefinition__Group__1__Impl_in_rule__TextareaDefinition__Group__16466);
            rule__TextareaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextareaDefinition__Group__2_in_rule__TextareaDefinition__Group__16469);
            rule__TextareaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaDefinition__Group__1"


    // $ANTLR start "rule__TextareaDefinition__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3204:1: rule__TextareaDefinition__Group__1__Impl : ( 'as:' ) ;
    public final void rule__TextareaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3208:1: ( ( 'as:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3209:1: ( 'as:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3209:1: ( 'as:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3210:1: 'as:'
            {
             before(grammarAccess.getTextareaDefinitionAccess().getAsKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__TextareaDefinition__Group__1__Impl6497); 
             after(grammarAccess.getTextareaDefinitionAccess().getAsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaDefinition__Group__1__Impl"


    // $ANTLR start "rule__TextareaDefinition__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3223:1: rule__TextareaDefinition__Group__2 : rule__TextareaDefinition__Group__2__Impl rule__TextareaDefinition__Group__3 ;
    public final void rule__TextareaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3227:1: ( rule__TextareaDefinition__Group__2__Impl rule__TextareaDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3228:2: rule__TextareaDefinition__Group__2__Impl rule__TextareaDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__TextareaDefinition__Group__2__Impl_in_rule__TextareaDefinition__Group__26528);
            rule__TextareaDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextareaDefinition__Group__3_in_rule__TextareaDefinition__Group__26531);
            rule__TextareaDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaDefinition__Group__2"


    // $ANTLR start "rule__TextareaDefinition__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3235:1: rule__TextareaDefinition__Group__2__Impl : ( ( rule__TextareaDefinition__IdAssignment_2 ) ) ;
    public final void rule__TextareaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3239:1: ( ( ( rule__TextareaDefinition__IdAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3240:1: ( ( rule__TextareaDefinition__IdAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3240:1: ( ( rule__TextareaDefinition__IdAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3241:1: ( rule__TextareaDefinition__IdAssignment_2 )
            {
             before(grammarAccess.getTextareaDefinitionAccess().getIdAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3242:1: ( rule__TextareaDefinition__IdAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3242:2: rule__TextareaDefinition__IdAssignment_2
            {
            pushFollow(FOLLOW_rule__TextareaDefinition__IdAssignment_2_in_rule__TextareaDefinition__Group__2__Impl6558);
            rule__TextareaDefinition__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTextareaDefinitionAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaDefinition__Group__2__Impl"


    // $ANTLR start "rule__TextareaDefinition__Group__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3252:1: rule__TextareaDefinition__Group__3 : rule__TextareaDefinition__Group__3__Impl ;
    public final void rule__TextareaDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3256:1: ( rule__TextareaDefinition__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3257:2: rule__TextareaDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TextareaDefinition__Group__3__Impl_in_rule__TextareaDefinition__Group__36588);
            rule__TextareaDefinition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaDefinition__Group__3"


    // $ANTLR start "rule__TextareaDefinition__Group__3__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3263:1: rule__TextareaDefinition__Group__3__Impl : ( ( rule__TextareaDefinition__Group_3__0 )? ) ;
    public final void rule__TextareaDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3267:1: ( ( ( rule__TextareaDefinition__Group_3__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3268:1: ( ( rule__TextareaDefinition__Group_3__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3268:1: ( ( rule__TextareaDefinition__Group_3__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3269:1: ( rule__TextareaDefinition__Group_3__0 )?
            {
             before(grammarAccess.getTextareaDefinitionAccess().getGroup_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3270:1: ( rule__TextareaDefinition__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==22) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3270:2: rule__TextareaDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__TextareaDefinition__Group_3__0_in_rule__TextareaDefinition__Group__3__Impl6615);
                    rule__TextareaDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextareaDefinitionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaDefinition__Group__3__Impl"


    // $ANTLR start "rule__TextareaDefinition__Group_3__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3288:1: rule__TextareaDefinition__Group_3__0 : rule__TextareaDefinition__Group_3__0__Impl rule__TextareaDefinition__Group_3__1 ;
    public final void rule__TextareaDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3292:1: ( rule__TextareaDefinition__Group_3__0__Impl rule__TextareaDefinition__Group_3__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3293:2: rule__TextareaDefinition__Group_3__0__Impl rule__TextareaDefinition__Group_3__1
            {
            pushFollow(FOLLOW_rule__TextareaDefinition__Group_3__0__Impl_in_rule__TextareaDefinition__Group_3__06654);
            rule__TextareaDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextareaDefinition__Group_3__1_in_rule__TextareaDefinition__Group_3__06657);
            rule__TextareaDefinition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaDefinition__Group_3__0"


    // $ANTLR start "rule__TextareaDefinition__Group_3__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3300:1: rule__TextareaDefinition__Group_3__0__Impl : ( '->' ) ;
    public final void rule__TextareaDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3304:1: ( ( '->' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3305:1: ( '->' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3305:1: ( '->' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3306:1: '->'
            {
             before(grammarAccess.getTextareaDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__TextareaDefinition__Group_3__0__Impl6685); 
             after(grammarAccess.getTextareaDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__TextareaDefinition__Group_3__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3319:1: rule__TextareaDefinition__Group_3__1 : rule__TextareaDefinition__Group_3__1__Impl ;
    public final void rule__TextareaDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3323:1: ( rule__TextareaDefinition__Group_3__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3324:2: rule__TextareaDefinition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__TextareaDefinition__Group_3__1__Impl_in_rule__TextareaDefinition__Group_3__16716);
            rule__TextareaDefinition__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaDefinition__Group_3__1"


    // $ANTLR start "rule__TextareaDefinition__Group_3__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3330:1: rule__TextareaDefinition__Group_3__1__Impl : ( ( rule__TextareaDefinition__PropertiesAssignment_3_1 ) ) ;
    public final void rule__TextareaDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3334:1: ( ( ( rule__TextareaDefinition__PropertiesAssignment_3_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3335:1: ( ( rule__TextareaDefinition__PropertiesAssignment_3_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3335:1: ( ( rule__TextareaDefinition__PropertiesAssignment_3_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3336:1: ( rule__TextareaDefinition__PropertiesAssignment_3_1 )
            {
             before(grammarAccess.getTextareaDefinitionAccess().getPropertiesAssignment_3_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3337:1: ( rule__TextareaDefinition__PropertiesAssignment_3_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3337:2: rule__TextareaDefinition__PropertiesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__TextareaDefinition__PropertiesAssignment_3_1_in_rule__TextareaDefinition__Group_3__1__Impl6743);
            rule__TextareaDefinition__PropertiesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTextareaDefinitionAccess().getPropertiesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__TextareaProperties__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3351:1: rule__TextareaProperties__Group__0 : rule__TextareaProperties__Group__0__Impl rule__TextareaProperties__Group__1 ;
    public final void rule__TextareaProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3355:1: ( rule__TextareaProperties__Group__0__Impl rule__TextareaProperties__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3356:2: rule__TextareaProperties__Group__0__Impl rule__TextareaProperties__Group__1
            {
            pushFollow(FOLLOW_rule__TextareaProperties__Group__0__Impl_in_rule__TextareaProperties__Group__06777);
            rule__TextareaProperties__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextareaProperties__Group__1_in_rule__TextareaProperties__Group__06780);
            rule__TextareaProperties__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaProperties__Group__0"


    // $ANTLR start "rule__TextareaProperties__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3363:1: rule__TextareaProperties__Group__0__Impl : ( ( rule__TextareaProperties__CommonPropertiesAssignment_0 ) ) ;
    public final void rule__TextareaProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3367:1: ( ( ( rule__TextareaProperties__CommonPropertiesAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3368:1: ( ( rule__TextareaProperties__CommonPropertiesAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3368:1: ( ( rule__TextareaProperties__CommonPropertiesAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3369:1: ( rule__TextareaProperties__CommonPropertiesAssignment_0 )
            {
             before(grammarAccess.getTextareaPropertiesAccess().getCommonPropertiesAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3370:1: ( rule__TextareaProperties__CommonPropertiesAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3370:2: rule__TextareaProperties__CommonPropertiesAssignment_0
            {
            pushFollow(FOLLOW_rule__TextareaProperties__CommonPropertiesAssignment_0_in_rule__TextareaProperties__Group__0__Impl6807);
            rule__TextareaProperties__CommonPropertiesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTextareaPropertiesAccess().getCommonPropertiesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaProperties__Group__0__Impl"


    // $ANTLR start "rule__TextareaProperties__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3380:1: rule__TextareaProperties__Group__1 : rule__TextareaProperties__Group__1__Impl rule__TextareaProperties__Group__2 ;
    public final void rule__TextareaProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3384:1: ( rule__TextareaProperties__Group__1__Impl rule__TextareaProperties__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3385:2: rule__TextareaProperties__Group__1__Impl rule__TextareaProperties__Group__2
            {
            pushFollow(FOLLOW_rule__TextareaProperties__Group__1__Impl_in_rule__TextareaProperties__Group__16837);
            rule__TextareaProperties__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextareaProperties__Group__2_in_rule__TextareaProperties__Group__16840);
            rule__TextareaProperties__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaProperties__Group__1"


    // $ANTLR start "rule__TextareaProperties__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3392:1: rule__TextareaProperties__Group__1__Impl : ( ( rule__TextareaProperties__Group_1__0 )? ) ;
    public final void rule__TextareaProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3396:1: ( ( ( rule__TextareaProperties__Group_1__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3397:1: ( ( rule__TextareaProperties__Group_1__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3397:1: ( ( rule__TextareaProperties__Group_1__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3398:1: ( rule__TextareaProperties__Group_1__0 )?
            {
             before(grammarAccess.getTextareaPropertiesAccess().getGroup_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3399:1: ( rule__TextareaProperties__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==27) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3399:2: rule__TextareaProperties__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TextareaProperties__Group_1__0_in_rule__TextareaProperties__Group__1__Impl6867);
                    rule__TextareaProperties__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextareaPropertiesAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaProperties__Group__1__Impl"


    // $ANTLR start "rule__TextareaProperties__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3409:1: rule__TextareaProperties__Group__2 : rule__TextareaProperties__Group__2__Impl ;
    public final void rule__TextareaProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3413:1: ( rule__TextareaProperties__Group__2__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3414:2: rule__TextareaProperties__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TextareaProperties__Group__2__Impl_in_rule__TextareaProperties__Group__26898);
            rule__TextareaProperties__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaProperties__Group__2"


    // $ANTLR start "rule__TextareaProperties__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3420:1: rule__TextareaProperties__Group__2__Impl : ( ( rule__TextareaProperties__Group_2__0 )? ) ;
    public final void rule__TextareaProperties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3424:1: ( ( ( rule__TextareaProperties__Group_2__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3425:1: ( ( rule__TextareaProperties__Group_2__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3425:1: ( ( rule__TextareaProperties__Group_2__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3426:1: ( rule__TextareaProperties__Group_2__0 )?
            {
             before(grammarAccess.getTextareaPropertiesAccess().getGroup_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3427:1: ( rule__TextareaProperties__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3427:2: rule__TextareaProperties__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TextareaProperties__Group_2__0_in_rule__TextareaProperties__Group__2__Impl6925);
                    rule__TextareaProperties__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextareaPropertiesAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaProperties__Group__2__Impl"


    // $ANTLR start "rule__TextareaProperties__Group_1__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3443:1: rule__TextareaProperties__Group_1__0 : rule__TextareaProperties__Group_1__0__Impl rule__TextareaProperties__Group_1__1 ;
    public final void rule__TextareaProperties__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3447:1: ( rule__TextareaProperties__Group_1__0__Impl rule__TextareaProperties__Group_1__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3448:2: rule__TextareaProperties__Group_1__0__Impl rule__TextareaProperties__Group_1__1
            {
            pushFollow(FOLLOW_rule__TextareaProperties__Group_1__0__Impl_in_rule__TextareaProperties__Group_1__06962);
            rule__TextareaProperties__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextareaProperties__Group_1__1_in_rule__TextareaProperties__Group_1__06965);
            rule__TextareaProperties__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaProperties__Group_1__0"


    // $ANTLR start "rule__TextareaProperties__Group_1__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3455:1: rule__TextareaProperties__Group_1__0__Impl : ( 'text=' ) ;
    public final void rule__TextareaProperties__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3459:1: ( ( 'text=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3460:1: ( 'text=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3460:1: ( 'text=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3461:1: 'text='
            {
             before(grammarAccess.getTextareaPropertiesAccess().getTextKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__TextareaProperties__Group_1__0__Impl6993); 
             after(grammarAccess.getTextareaPropertiesAccess().getTextKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaProperties__Group_1__0__Impl"


    // $ANTLR start "rule__TextareaProperties__Group_1__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3474:1: rule__TextareaProperties__Group_1__1 : rule__TextareaProperties__Group_1__1__Impl ;
    public final void rule__TextareaProperties__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3478:1: ( rule__TextareaProperties__Group_1__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3479:2: rule__TextareaProperties__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TextareaProperties__Group_1__1__Impl_in_rule__TextareaProperties__Group_1__17024);
            rule__TextareaProperties__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaProperties__Group_1__1"


    // $ANTLR start "rule__TextareaProperties__Group_1__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3485:1: rule__TextareaProperties__Group_1__1__Impl : ( ( rule__TextareaProperties__TextAssignment_1_1 ) ) ;
    public final void rule__TextareaProperties__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3489:1: ( ( ( rule__TextareaProperties__TextAssignment_1_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3490:1: ( ( rule__TextareaProperties__TextAssignment_1_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3490:1: ( ( rule__TextareaProperties__TextAssignment_1_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3491:1: ( rule__TextareaProperties__TextAssignment_1_1 )
            {
             before(grammarAccess.getTextareaPropertiesAccess().getTextAssignment_1_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3492:1: ( rule__TextareaProperties__TextAssignment_1_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3492:2: rule__TextareaProperties__TextAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TextareaProperties__TextAssignment_1_1_in_rule__TextareaProperties__Group_1__1__Impl7051);
            rule__TextareaProperties__TextAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTextareaPropertiesAccess().getTextAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaProperties__Group_1__1__Impl"


    // $ANTLR start "rule__TextareaProperties__Group_2__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3506:1: rule__TextareaProperties__Group_2__0 : rule__TextareaProperties__Group_2__0__Impl rule__TextareaProperties__Group_2__1 ;
    public final void rule__TextareaProperties__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3510:1: ( rule__TextareaProperties__Group_2__0__Impl rule__TextareaProperties__Group_2__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3511:2: rule__TextareaProperties__Group_2__0__Impl rule__TextareaProperties__Group_2__1
            {
            pushFollow(FOLLOW_rule__TextareaProperties__Group_2__0__Impl_in_rule__TextareaProperties__Group_2__07085);
            rule__TextareaProperties__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextareaProperties__Group_2__1_in_rule__TextareaProperties__Group_2__07088);
            rule__TextareaProperties__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaProperties__Group_2__0"


    // $ANTLR start "rule__TextareaProperties__Group_2__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3518:1: rule__TextareaProperties__Group_2__0__Impl : ( 'editable=' ) ;
    public final void rule__TextareaProperties__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3522:1: ( ( 'editable=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3523:1: ( 'editable=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3523:1: ( 'editable=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3524:1: 'editable='
            {
             before(grammarAccess.getTextareaPropertiesAccess().getEditableKeyword_2_0()); 
            match(input,28,FOLLOW_28_in_rule__TextareaProperties__Group_2__0__Impl7116); 
             after(grammarAccess.getTextareaPropertiesAccess().getEditableKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaProperties__Group_2__0__Impl"


    // $ANTLR start "rule__TextareaProperties__Group_2__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3537:1: rule__TextareaProperties__Group_2__1 : rule__TextareaProperties__Group_2__1__Impl ;
    public final void rule__TextareaProperties__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3541:1: ( rule__TextareaProperties__Group_2__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3542:2: rule__TextareaProperties__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TextareaProperties__Group_2__1__Impl_in_rule__TextareaProperties__Group_2__17147);
            rule__TextareaProperties__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaProperties__Group_2__1"


    // $ANTLR start "rule__TextareaProperties__Group_2__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3548:1: rule__TextareaProperties__Group_2__1__Impl : ( ( rule__TextareaProperties__EditableAssignment_2_1 ) ) ;
    public final void rule__TextareaProperties__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3552:1: ( ( ( rule__TextareaProperties__EditableAssignment_2_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3553:1: ( ( rule__TextareaProperties__EditableAssignment_2_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3553:1: ( ( rule__TextareaProperties__EditableAssignment_2_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3554:1: ( rule__TextareaProperties__EditableAssignment_2_1 )
            {
             before(grammarAccess.getTextareaPropertiesAccess().getEditableAssignment_2_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3555:1: ( rule__TextareaProperties__EditableAssignment_2_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3555:2: rule__TextareaProperties__EditableAssignment_2_1
            {
            pushFollow(FOLLOW_rule__TextareaProperties__EditableAssignment_2_1_in_rule__TextareaProperties__Group_2__1__Impl7174);
            rule__TextareaProperties__EditableAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTextareaPropertiesAccess().getEditableAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaProperties__Group_2__1__Impl"


    // $ANTLR start "rule__TreeDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3569:1: rule__TreeDefinition__Group__0 : rule__TreeDefinition__Group__0__Impl rule__TreeDefinition__Group__1 ;
    public final void rule__TreeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3573:1: ( rule__TreeDefinition__Group__0__Impl rule__TreeDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3574:2: rule__TreeDefinition__Group__0__Impl rule__TreeDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group__0__Impl_in_rule__TreeDefinition__Group__07208);
            rule__TreeDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TreeDefinition__Group__1_in_rule__TreeDefinition__Group__07211);
            rule__TreeDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeDefinition__Group__0"


    // $ANTLR start "rule__TreeDefinition__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3581:1: rule__TreeDefinition__Group__0__Impl : ( ( rule__TreeDefinition__NameAssignment_0 ) ) ;
    public final void rule__TreeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3585:1: ( ( ( rule__TreeDefinition__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3586:1: ( ( rule__TreeDefinition__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3586:1: ( ( rule__TreeDefinition__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3587:1: ( rule__TreeDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getTreeDefinitionAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3588:1: ( rule__TreeDefinition__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3588:2: rule__TreeDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__TreeDefinition__NameAssignment_0_in_rule__TreeDefinition__Group__0__Impl7238);
            rule__TreeDefinition__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTreeDefinitionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeDefinition__Group__0__Impl"


    // $ANTLR start "rule__TreeDefinition__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3598:1: rule__TreeDefinition__Group__1 : rule__TreeDefinition__Group__1__Impl rule__TreeDefinition__Group__2 ;
    public final void rule__TreeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3602:1: ( rule__TreeDefinition__Group__1__Impl rule__TreeDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3603:2: rule__TreeDefinition__Group__1__Impl rule__TreeDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group__1__Impl_in_rule__TreeDefinition__Group__17268);
            rule__TreeDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TreeDefinition__Group__2_in_rule__TreeDefinition__Group__17271);
            rule__TreeDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeDefinition__Group__1"


    // $ANTLR start "rule__TreeDefinition__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3610:1: rule__TreeDefinition__Group__1__Impl : ( ( rule__TreeDefinition__InputTypeAssignment_1 ) ) ;
    public final void rule__TreeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3614:1: ( ( ( rule__TreeDefinition__InputTypeAssignment_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3615:1: ( ( rule__TreeDefinition__InputTypeAssignment_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3615:1: ( ( rule__TreeDefinition__InputTypeAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3616:1: ( rule__TreeDefinition__InputTypeAssignment_1 )
            {
             before(grammarAccess.getTreeDefinitionAccess().getInputTypeAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3617:1: ( rule__TreeDefinition__InputTypeAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3617:2: rule__TreeDefinition__InputTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__TreeDefinition__InputTypeAssignment_1_in_rule__TreeDefinition__Group__1__Impl7298);
            rule__TreeDefinition__InputTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTreeDefinitionAccess().getInputTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeDefinition__Group__1__Impl"


    // $ANTLR start "rule__TreeDefinition__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3627:1: rule__TreeDefinition__Group__2 : rule__TreeDefinition__Group__2__Impl rule__TreeDefinition__Group__3 ;
    public final void rule__TreeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3631:1: ( rule__TreeDefinition__Group__2__Impl rule__TreeDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3632:2: rule__TreeDefinition__Group__2__Impl rule__TreeDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group__2__Impl_in_rule__TreeDefinition__Group__27328);
            rule__TreeDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TreeDefinition__Group__3_in_rule__TreeDefinition__Group__27331);
            rule__TreeDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeDefinition__Group__2"


    // $ANTLR start "rule__TreeDefinition__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3639:1: rule__TreeDefinition__Group__2__Impl : ( 'as:' ) ;
    public final void rule__TreeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3643:1: ( ( 'as:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3644:1: ( 'as:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3644:1: ( 'as:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3645:1: 'as:'
            {
             before(grammarAccess.getTreeDefinitionAccess().getAsKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__TreeDefinition__Group__2__Impl7359); 
             after(grammarAccess.getTreeDefinitionAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeDefinition__Group__2__Impl"


    // $ANTLR start "rule__TreeDefinition__Group__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3658:1: rule__TreeDefinition__Group__3 : rule__TreeDefinition__Group__3__Impl rule__TreeDefinition__Group__4 ;
    public final void rule__TreeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3662:1: ( rule__TreeDefinition__Group__3__Impl rule__TreeDefinition__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3663:2: rule__TreeDefinition__Group__3__Impl rule__TreeDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group__3__Impl_in_rule__TreeDefinition__Group__37390);
            rule__TreeDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TreeDefinition__Group__4_in_rule__TreeDefinition__Group__37393);
            rule__TreeDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeDefinition__Group__3"


    // $ANTLR start "rule__TreeDefinition__Group__3__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3670:1: rule__TreeDefinition__Group__3__Impl : ( ( rule__TreeDefinition__IdAssignment_3 ) ) ;
    public final void rule__TreeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3674:1: ( ( ( rule__TreeDefinition__IdAssignment_3 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3675:1: ( ( rule__TreeDefinition__IdAssignment_3 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3675:1: ( ( rule__TreeDefinition__IdAssignment_3 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3676:1: ( rule__TreeDefinition__IdAssignment_3 )
            {
             before(grammarAccess.getTreeDefinitionAccess().getIdAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3677:1: ( rule__TreeDefinition__IdAssignment_3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3677:2: rule__TreeDefinition__IdAssignment_3
            {
            pushFollow(FOLLOW_rule__TreeDefinition__IdAssignment_3_in_rule__TreeDefinition__Group__3__Impl7420);
            rule__TreeDefinition__IdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTreeDefinitionAccess().getIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeDefinition__Group__3__Impl"


    // $ANTLR start "rule__TreeDefinition__Group__4"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3687:1: rule__TreeDefinition__Group__4 : rule__TreeDefinition__Group__4__Impl ;
    public final void rule__TreeDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3691:1: ( rule__TreeDefinition__Group__4__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3692:2: rule__TreeDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group__4__Impl_in_rule__TreeDefinition__Group__47450);
            rule__TreeDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeDefinition__Group__4"


    // $ANTLR start "rule__TreeDefinition__Group__4__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3698:1: rule__TreeDefinition__Group__4__Impl : ( ( rule__TreeDefinition__Group_4__0 )? ) ;
    public final void rule__TreeDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3702:1: ( ( ( rule__TreeDefinition__Group_4__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3703:1: ( ( rule__TreeDefinition__Group_4__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3703:1: ( ( rule__TreeDefinition__Group_4__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3704:1: ( rule__TreeDefinition__Group_4__0 )?
            {
             before(grammarAccess.getTreeDefinitionAccess().getGroup_4()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3705:1: ( rule__TreeDefinition__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==22) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3705:2: rule__TreeDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__TreeDefinition__Group_4__0_in_rule__TreeDefinition__Group__4__Impl7477);
                    rule__TreeDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTreeDefinitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeDefinition__Group__4__Impl"


    // $ANTLR start "rule__TreeDefinition__Group_4__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3725:1: rule__TreeDefinition__Group_4__0 : rule__TreeDefinition__Group_4__0__Impl rule__TreeDefinition__Group_4__1 ;
    public final void rule__TreeDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3729:1: ( rule__TreeDefinition__Group_4__0__Impl rule__TreeDefinition__Group_4__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3730:2: rule__TreeDefinition__Group_4__0__Impl rule__TreeDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group_4__0__Impl_in_rule__TreeDefinition__Group_4__07518);
            rule__TreeDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TreeDefinition__Group_4__1_in_rule__TreeDefinition__Group_4__07521);
            rule__TreeDefinition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeDefinition__Group_4__0"


    // $ANTLR start "rule__TreeDefinition__Group_4__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3737:1: rule__TreeDefinition__Group_4__0__Impl : ( '->' ) ;
    public final void rule__TreeDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3741:1: ( ( '->' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3742:1: ( '->' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3742:1: ( '->' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3743:1: '->'
            {
             before(grammarAccess.getTreeDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); 
            match(input,22,FOLLOW_22_in_rule__TreeDefinition__Group_4__0__Impl7549); 
             after(grammarAccess.getTreeDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__TreeDefinition__Group_4__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3756:1: rule__TreeDefinition__Group_4__1 : rule__TreeDefinition__Group_4__1__Impl ;
    public final void rule__TreeDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3760:1: ( rule__TreeDefinition__Group_4__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3761:2: rule__TreeDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group_4__1__Impl_in_rule__TreeDefinition__Group_4__17580);
            rule__TreeDefinition__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeDefinition__Group_4__1"


    // $ANTLR start "rule__TreeDefinition__Group_4__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3767:1: rule__TreeDefinition__Group_4__1__Impl : ( ( rule__TreeDefinition__PropertiesAssignment_4_1 ) ) ;
    public final void rule__TreeDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3771:1: ( ( ( rule__TreeDefinition__PropertiesAssignment_4_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3772:1: ( ( rule__TreeDefinition__PropertiesAssignment_4_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3772:1: ( ( rule__TreeDefinition__PropertiesAssignment_4_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3773:1: ( rule__TreeDefinition__PropertiesAssignment_4_1 )
            {
             before(grammarAccess.getTreeDefinitionAccess().getPropertiesAssignment_4_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3774:1: ( rule__TreeDefinition__PropertiesAssignment_4_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3774:2: rule__TreeDefinition__PropertiesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__TreeDefinition__PropertiesAssignment_4_1_in_rule__TreeDefinition__Group_4__1__Impl7607);
            rule__TreeDefinition__PropertiesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTreeDefinitionAccess().getPropertiesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__TableDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3788:1: rule__TableDefinition__Group__0 : rule__TableDefinition__Group__0__Impl rule__TableDefinition__Group__1 ;
    public final void rule__TableDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3792:1: ( rule__TableDefinition__Group__0__Impl rule__TableDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3793:2: rule__TableDefinition__Group__0__Impl rule__TableDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group__0__Impl_in_rule__TableDefinition__Group__07641);
            rule__TableDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableDefinition__Group__1_in_rule__TableDefinition__Group__07644);
            rule__TableDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDefinition__Group__0"


    // $ANTLR start "rule__TableDefinition__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3800:1: rule__TableDefinition__Group__0__Impl : ( ( rule__TableDefinition__NameAssignment_0 ) ) ;
    public final void rule__TableDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3804:1: ( ( ( rule__TableDefinition__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3805:1: ( ( rule__TableDefinition__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3805:1: ( ( rule__TableDefinition__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3806:1: ( rule__TableDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getTableDefinitionAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3807:1: ( rule__TableDefinition__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3807:2: rule__TableDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__TableDefinition__NameAssignment_0_in_rule__TableDefinition__Group__0__Impl7671);
            rule__TableDefinition__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTableDefinitionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDefinition__Group__0__Impl"


    // $ANTLR start "rule__TableDefinition__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3817:1: rule__TableDefinition__Group__1 : rule__TableDefinition__Group__1__Impl rule__TableDefinition__Group__2 ;
    public final void rule__TableDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3821:1: ( rule__TableDefinition__Group__1__Impl rule__TableDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3822:2: rule__TableDefinition__Group__1__Impl rule__TableDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group__1__Impl_in_rule__TableDefinition__Group__17701);
            rule__TableDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableDefinition__Group__2_in_rule__TableDefinition__Group__17704);
            rule__TableDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDefinition__Group__1"


    // $ANTLR start "rule__TableDefinition__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3829:1: rule__TableDefinition__Group__1__Impl : ( ( rule__TableDefinition__InputTypeAssignment_1 ) ) ;
    public final void rule__TableDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3833:1: ( ( ( rule__TableDefinition__InputTypeAssignment_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3834:1: ( ( rule__TableDefinition__InputTypeAssignment_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3834:1: ( ( rule__TableDefinition__InputTypeAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3835:1: ( rule__TableDefinition__InputTypeAssignment_1 )
            {
             before(grammarAccess.getTableDefinitionAccess().getInputTypeAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3836:1: ( rule__TableDefinition__InputTypeAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3836:2: rule__TableDefinition__InputTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__TableDefinition__InputTypeAssignment_1_in_rule__TableDefinition__Group__1__Impl7731);
            rule__TableDefinition__InputTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTableDefinitionAccess().getInputTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDefinition__Group__1__Impl"


    // $ANTLR start "rule__TableDefinition__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3846:1: rule__TableDefinition__Group__2 : rule__TableDefinition__Group__2__Impl rule__TableDefinition__Group__3 ;
    public final void rule__TableDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3850:1: ( rule__TableDefinition__Group__2__Impl rule__TableDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3851:2: rule__TableDefinition__Group__2__Impl rule__TableDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group__2__Impl_in_rule__TableDefinition__Group__27761);
            rule__TableDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableDefinition__Group__3_in_rule__TableDefinition__Group__27764);
            rule__TableDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDefinition__Group__2"


    // $ANTLR start "rule__TableDefinition__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3858:1: rule__TableDefinition__Group__2__Impl : ( 'as:' ) ;
    public final void rule__TableDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3862:1: ( ( 'as:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3863:1: ( 'as:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3863:1: ( 'as:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3864:1: 'as:'
            {
             before(grammarAccess.getTableDefinitionAccess().getAsKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__TableDefinition__Group__2__Impl7792); 
             after(grammarAccess.getTableDefinitionAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDefinition__Group__2__Impl"


    // $ANTLR start "rule__TableDefinition__Group__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3877:1: rule__TableDefinition__Group__3 : rule__TableDefinition__Group__3__Impl rule__TableDefinition__Group__4 ;
    public final void rule__TableDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3881:1: ( rule__TableDefinition__Group__3__Impl rule__TableDefinition__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3882:2: rule__TableDefinition__Group__3__Impl rule__TableDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group__3__Impl_in_rule__TableDefinition__Group__37823);
            rule__TableDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableDefinition__Group__4_in_rule__TableDefinition__Group__37826);
            rule__TableDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDefinition__Group__3"


    // $ANTLR start "rule__TableDefinition__Group__3__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3889:1: rule__TableDefinition__Group__3__Impl : ( ( rule__TableDefinition__IdAssignment_3 ) ) ;
    public final void rule__TableDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3893:1: ( ( ( rule__TableDefinition__IdAssignment_3 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3894:1: ( ( rule__TableDefinition__IdAssignment_3 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3894:1: ( ( rule__TableDefinition__IdAssignment_3 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3895:1: ( rule__TableDefinition__IdAssignment_3 )
            {
             before(grammarAccess.getTableDefinitionAccess().getIdAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3896:1: ( rule__TableDefinition__IdAssignment_3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3896:2: rule__TableDefinition__IdAssignment_3
            {
            pushFollow(FOLLOW_rule__TableDefinition__IdAssignment_3_in_rule__TableDefinition__Group__3__Impl7853);
            rule__TableDefinition__IdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTableDefinitionAccess().getIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDefinition__Group__3__Impl"


    // $ANTLR start "rule__TableDefinition__Group__4"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3906:1: rule__TableDefinition__Group__4 : rule__TableDefinition__Group__4__Impl ;
    public final void rule__TableDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3910:1: ( rule__TableDefinition__Group__4__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3911:2: rule__TableDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group__4__Impl_in_rule__TableDefinition__Group__47883);
            rule__TableDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDefinition__Group__4"


    // $ANTLR start "rule__TableDefinition__Group__4__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3917:1: rule__TableDefinition__Group__4__Impl : ( ( rule__TableDefinition__Group_4__0 )? ) ;
    public final void rule__TableDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3921:1: ( ( ( rule__TableDefinition__Group_4__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3922:1: ( ( rule__TableDefinition__Group_4__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3922:1: ( ( rule__TableDefinition__Group_4__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3923:1: ( rule__TableDefinition__Group_4__0 )?
            {
             before(grammarAccess.getTableDefinitionAccess().getGroup_4()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3924:1: ( rule__TableDefinition__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==22) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3924:2: rule__TableDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__TableDefinition__Group_4__0_in_rule__TableDefinition__Group__4__Impl7910);
                    rule__TableDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableDefinitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDefinition__Group__4__Impl"


    // $ANTLR start "rule__TableDefinition__Group_4__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3944:1: rule__TableDefinition__Group_4__0 : rule__TableDefinition__Group_4__0__Impl rule__TableDefinition__Group_4__1 ;
    public final void rule__TableDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3948:1: ( rule__TableDefinition__Group_4__0__Impl rule__TableDefinition__Group_4__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3949:2: rule__TableDefinition__Group_4__0__Impl rule__TableDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group_4__0__Impl_in_rule__TableDefinition__Group_4__07951);
            rule__TableDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableDefinition__Group_4__1_in_rule__TableDefinition__Group_4__07954);
            rule__TableDefinition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDefinition__Group_4__0"


    // $ANTLR start "rule__TableDefinition__Group_4__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3956:1: rule__TableDefinition__Group_4__0__Impl : ( '->' ) ;
    public final void rule__TableDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3960:1: ( ( '->' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3961:1: ( '->' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3961:1: ( '->' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3962:1: '->'
            {
             before(grammarAccess.getTableDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); 
            match(input,22,FOLLOW_22_in_rule__TableDefinition__Group_4__0__Impl7982); 
             after(grammarAccess.getTableDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__TableDefinition__Group_4__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3975:1: rule__TableDefinition__Group_4__1 : rule__TableDefinition__Group_4__1__Impl ;
    public final void rule__TableDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3979:1: ( rule__TableDefinition__Group_4__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3980:2: rule__TableDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group_4__1__Impl_in_rule__TableDefinition__Group_4__18013);
            rule__TableDefinition__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDefinition__Group_4__1"


    // $ANTLR start "rule__TableDefinition__Group_4__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3986:1: rule__TableDefinition__Group_4__1__Impl : ( ( rule__TableDefinition__PropertiesAssignment_4_1 ) ) ;
    public final void rule__TableDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3990:1: ( ( ( rule__TableDefinition__PropertiesAssignment_4_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3991:1: ( ( rule__TableDefinition__PropertiesAssignment_4_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3991:1: ( ( rule__TableDefinition__PropertiesAssignment_4_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3992:1: ( rule__TableDefinition__PropertiesAssignment_4_1 )
            {
             before(grammarAccess.getTableDefinitionAccess().getPropertiesAssignment_4_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3993:1: ( rule__TableDefinition__PropertiesAssignment_4_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3993:2: rule__TableDefinition__PropertiesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__TableDefinition__PropertiesAssignment_4_1_in_rule__TableDefinition__Group_4__1__Impl8040);
            rule__TableDefinition__PropertiesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTableDefinitionAccess().getPropertiesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__InterchangeableDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4007:1: rule__InterchangeableDefinition__Group__0 : rule__InterchangeableDefinition__Group__0__Impl rule__InterchangeableDefinition__Group__1 ;
    public final void rule__InterchangeableDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4011:1: ( rule__InterchangeableDefinition__Group__0__Impl rule__InterchangeableDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4012:2: rule__InterchangeableDefinition__Group__0__Impl rule__InterchangeableDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__InterchangeableDefinition__Group__0__Impl_in_rule__InterchangeableDefinition__Group__08074);
            rule__InterchangeableDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterchangeableDefinition__Group__1_in_rule__InterchangeableDefinition__Group__08077);
            rule__InterchangeableDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterchangeableDefinition__Group__0"


    // $ANTLR start "rule__InterchangeableDefinition__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4019:1: rule__InterchangeableDefinition__Group__0__Impl : ( ( rule__InterchangeableDefinition__NameAssignment_0 ) ) ;
    public final void rule__InterchangeableDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4023:1: ( ( ( rule__InterchangeableDefinition__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4024:1: ( ( rule__InterchangeableDefinition__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4024:1: ( ( rule__InterchangeableDefinition__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4025:1: ( rule__InterchangeableDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getInterchangeableDefinitionAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4026:1: ( rule__InterchangeableDefinition__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4026:2: rule__InterchangeableDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__InterchangeableDefinition__NameAssignment_0_in_rule__InterchangeableDefinition__Group__0__Impl8104);
            rule__InterchangeableDefinition__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInterchangeableDefinitionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterchangeableDefinition__Group__0__Impl"


    // $ANTLR start "rule__InterchangeableDefinition__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4036:1: rule__InterchangeableDefinition__Group__1 : rule__InterchangeableDefinition__Group__1__Impl rule__InterchangeableDefinition__Group__2 ;
    public final void rule__InterchangeableDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4040:1: ( rule__InterchangeableDefinition__Group__1__Impl rule__InterchangeableDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4041:2: rule__InterchangeableDefinition__Group__1__Impl rule__InterchangeableDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__InterchangeableDefinition__Group__1__Impl_in_rule__InterchangeableDefinition__Group__18134);
            rule__InterchangeableDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterchangeableDefinition__Group__2_in_rule__InterchangeableDefinition__Group__18137);
            rule__InterchangeableDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterchangeableDefinition__Group__1"


    // $ANTLR start "rule__InterchangeableDefinition__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4048:1: rule__InterchangeableDefinition__Group__1__Impl : ( 'as:' ) ;
    public final void rule__InterchangeableDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4052:1: ( ( 'as:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4053:1: ( 'as:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4053:1: ( 'as:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4054:1: 'as:'
            {
             before(grammarAccess.getInterchangeableDefinitionAccess().getAsKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__InterchangeableDefinition__Group__1__Impl8165); 
             after(grammarAccess.getInterchangeableDefinitionAccess().getAsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterchangeableDefinition__Group__1__Impl"


    // $ANTLR start "rule__InterchangeableDefinition__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4067:1: rule__InterchangeableDefinition__Group__2 : rule__InterchangeableDefinition__Group__2__Impl rule__InterchangeableDefinition__Group__3 ;
    public final void rule__InterchangeableDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4071:1: ( rule__InterchangeableDefinition__Group__2__Impl rule__InterchangeableDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4072:2: rule__InterchangeableDefinition__Group__2__Impl rule__InterchangeableDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__InterchangeableDefinition__Group__2__Impl_in_rule__InterchangeableDefinition__Group__28196);
            rule__InterchangeableDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterchangeableDefinition__Group__3_in_rule__InterchangeableDefinition__Group__28199);
            rule__InterchangeableDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterchangeableDefinition__Group__2"


    // $ANTLR start "rule__InterchangeableDefinition__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4079:1: rule__InterchangeableDefinition__Group__2__Impl : ( ( rule__InterchangeableDefinition__IdAssignment_2 ) ) ;
    public final void rule__InterchangeableDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4083:1: ( ( ( rule__InterchangeableDefinition__IdAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4084:1: ( ( rule__InterchangeableDefinition__IdAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4084:1: ( ( rule__InterchangeableDefinition__IdAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4085:1: ( rule__InterchangeableDefinition__IdAssignment_2 )
            {
             before(grammarAccess.getInterchangeableDefinitionAccess().getIdAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4086:1: ( rule__InterchangeableDefinition__IdAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4086:2: rule__InterchangeableDefinition__IdAssignment_2
            {
            pushFollow(FOLLOW_rule__InterchangeableDefinition__IdAssignment_2_in_rule__InterchangeableDefinition__Group__2__Impl8226);
            rule__InterchangeableDefinition__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInterchangeableDefinitionAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterchangeableDefinition__Group__2__Impl"


    // $ANTLR start "rule__InterchangeableDefinition__Group__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4096:1: rule__InterchangeableDefinition__Group__3 : rule__InterchangeableDefinition__Group__3__Impl ;
    public final void rule__InterchangeableDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4100:1: ( rule__InterchangeableDefinition__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4101:2: rule__InterchangeableDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__InterchangeableDefinition__Group__3__Impl_in_rule__InterchangeableDefinition__Group__38256);
            rule__InterchangeableDefinition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterchangeableDefinition__Group__3"


    // $ANTLR start "rule__InterchangeableDefinition__Group__3__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4107:1: rule__InterchangeableDefinition__Group__3__Impl : ( ( rule__InterchangeableDefinition__Group_3__0 )? ) ;
    public final void rule__InterchangeableDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4111:1: ( ( ( rule__InterchangeableDefinition__Group_3__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4112:1: ( ( rule__InterchangeableDefinition__Group_3__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4112:1: ( ( rule__InterchangeableDefinition__Group_3__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4113:1: ( rule__InterchangeableDefinition__Group_3__0 )?
            {
             before(grammarAccess.getInterchangeableDefinitionAccess().getGroup_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4114:1: ( rule__InterchangeableDefinition__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==22) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4114:2: rule__InterchangeableDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__InterchangeableDefinition__Group_3__0_in_rule__InterchangeableDefinition__Group__3__Impl8283);
                    rule__InterchangeableDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterchangeableDefinitionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterchangeableDefinition__Group__3__Impl"


    // $ANTLR start "rule__InterchangeableDefinition__Group_3__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4132:1: rule__InterchangeableDefinition__Group_3__0 : rule__InterchangeableDefinition__Group_3__0__Impl rule__InterchangeableDefinition__Group_3__1 ;
    public final void rule__InterchangeableDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4136:1: ( rule__InterchangeableDefinition__Group_3__0__Impl rule__InterchangeableDefinition__Group_3__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4137:2: rule__InterchangeableDefinition__Group_3__0__Impl rule__InterchangeableDefinition__Group_3__1
            {
            pushFollow(FOLLOW_rule__InterchangeableDefinition__Group_3__0__Impl_in_rule__InterchangeableDefinition__Group_3__08322);
            rule__InterchangeableDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterchangeableDefinition__Group_3__1_in_rule__InterchangeableDefinition__Group_3__08325);
            rule__InterchangeableDefinition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterchangeableDefinition__Group_3__0"


    // $ANTLR start "rule__InterchangeableDefinition__Group_3__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4144:1: rule__InterchangeableDefinition__Group_3__0__Impl : ( '->' ) ;
    public final void rule__InterchangeableDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4148:1: ( ( '->' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4149:1: ( '->' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4149:1: ( '->' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4150:1: '->'
            {
             before(grammarAccess.getInterchangeableDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__InterchangeableDefinition__Group_3__0__Impl8353); 
             after(grammarAccess.getInterchangeableDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterchangeableDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__InterchangeableDefinition__Group_3__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4163:1: rule__InterchangeableDefinition__Group_3__1 : rule__InterchangeableDefinition__Group_3__1__Impl ;
    public final void rule__InterchangeableDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4167:1: ( rule__InterchangeableDefinition__Group_3__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4168:2: rule__InterchangeableDefinition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__InterchangeableDefinition__Group_3__1__Impl_in_rule__InterchangeableDefinition__Group_3__18384);
            rule__InterchangeableDefinition__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterchangeableDefinition__Group_3__1"


    // $ANTLR start "rule__InterchangeableDefinition__Group_3__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4174:1: rule__InterchangeableDefinition__Group_3__1__Impl : ( ( rule__InterchangeableDefinition__PropertiesAssignment_3_1 ) ) ;
    public final void rule__InterchangeableDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4178:1: ( ( ( rule__InterchangeableDefinition__PropertiesAssignment_3_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4179:1: ( ( rule__InterchangeableDefinition__PropertiesAssignment_3_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4179:1: ( ( rule__InterchangeableDefinition__PropertiesAssignment_3_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4180:1: ( rule__InterchangeableDefinition__PropertiesAssignment_3_1 )
            {
             before(grammarAccess.getInterchangeableDefinitionAccess().getPropertiesAssignment_3_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4181:1: ( rule__InterchangeableDefinition__PropertiesAssignment_3_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4181:2: rule__InterchangeableDefinition__PropertiesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__InterchangeableDefinition__PropertiesAssignment_3_1_in_rule__InterchangeableDefinition__Group_3__1__Impl8411);
            rule__InterchangeableDefinition__PropertiesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInterchangeableDefinitionAccess().getPropertiesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterchangeableDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__ButtonDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4195:1: rule__ButtonDefinition__Group__0 : rule__ButtonDefinition__Group__0__Impl rule__ButtonDefinition__Group__1 ;
    public final void rule__ButtonDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4199:1: ( rule__ButtonDefinition__Group__0__Impl rule__ButtonDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4200:2: rule__ButtonDefinition__Group__0__Impl rule__ButtonDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__0__Impl_in_rule__ButtonDefinition__Group__08445);
            rule__ButtonDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonDefinition__Group__1_in_rule__ButtonDefinition__Group__08448);
            rule__ButtonDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonDefinition__Group__0"


    // $ANTLR start "rule__ButtonDefinition__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4207:1: rule__ButtonDefinition__Group__0__Impl : ( ( rule__ButtonDefinition__NameAssignment_0 ) ) ;
    public final void rule__ButtonDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4211:1: ( ( ( rule__ButtonDefinition__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4212:1: ( ( rule__ButtonDefinition__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4212:1: ( ( rule__ButtonDefinition__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4213:1: ( rule__ButtonDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getButtonDefinitionAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4214:1: ( rule__ButtonDefinition__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4214:2: rule__ButtonDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__NameAssignment_0_in_rule__ButtonDefinition__Group__0__Impl8475);
            rule__ButtonDefinition__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getButtonDefinitionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonDefinition__Group__0__Impl"


    // $ANTLR start "rule__ButtonDefinition__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4224:1: rule__ButtonDefinition__Group__1 : rule__ButtonDefinition__Group__1__Impl rule__ButtonDefinition__Group__2 ;
    public final void rule__ButtonDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4228:1: ( rule__ButtonDefinition__Group__1__Impl rule__ButtonDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4229:2: rule__ButtonDefinition__Group__1__Impl rule__ButtonDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__1__Impl_in_rule__ButtonDefinition__Group__18505);
            rule__ButtonDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonDefinition__Group__2_in_rule__ButtonDefinition__Group__18508);
            rule__ButtonDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonDefinition__Group__1"


    // $ANTLR start "rule__ButtonDefinition__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4236:1: rule__ButtonDefinition__Group__1__Impl : ( 'as:' ) ;
    public final void rule__ButtonDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4240:1: ( ( 'as:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4241:1: ( 'as:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4241:1: ( 'as:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4242:1: 'as:'
            {
             before(grammarAccess.getButtonDefinitionAccess().getAsKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__ButtonDefinition__Group__1__Impl8536); 
             after(grammarAccess.getButtonDefinitionAccess().getAsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonDefinition__Group__1__Impl"


    // $ANTLR start "rule__ButtonDefinition__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4255:1: rule__ButtonDefinition__Group__2 : rule__ButtonDefinition__Group__2__Impl rule__ButtonDefinition__Group__3 ;
    public final void rule__ButtonDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4259:1: ( rule__ButtonDefinition__Group__2__Impl rule__ButtonDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4260:2: rule__ButtonDefinition__Group__2__Impl rule__ButtonDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__2__Impl_in_rule__ButtonDefinition__Group__28567);
            rule__ButtonDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonDefinition__Group__3_in_rule__ButtonDefinition__Group__28570);
            rule__ButtonDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonDefinition__Group__2"


    // $ANTLR start "rule__ButtonDefinition__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4267:1: rule__ButtonDefinition__Group__2__Impl : ( ( rule__ButtonDefinition__IdAssignment_2 ) ) ;
    public final void rule__ButtonDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4271:1: ( ( ( rule__ButtonDefinition__IdAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4272:1: ( ( rule__ButtonDefinition__IdAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4272:1: ( ( rule__ButtonDefinition__IdAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4273:1: ( rule__ButtonDefinition__IdAssignment_2 )
            {
             before(grammarAccess.getButtonDefinitionAccess().getIdAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4274:1: ( rule__ButtonDefinition__IdAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4274:2: rule__ButtonDefinition__IdAssignment_2
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__IdAssignment_2_in_rule__ButtonDefinition__Group__2__Impl8597);
            rule__ButtonDefinition__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getButtonDefinitionAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonDefinition__Group__2__Impl"


    // $ANTLR start "rule__ButtonDefinition__Group__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4284:1: rule__ButtonDefinition__Group__3 : rule__ButtonDefinition__Group__3__Impl ;
    public final void rule__ButtonDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4288:1: ( rule__ButtonDefinition__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4289:2: rule__ButtonDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__3__Impl_in_rule__ButtonDefinition__Group__38627);
            rule__ButtonDefinition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonDefinition__Group__3"


    // $ANTLR start "rule__ButtonDefinition__Group__3__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4295:1: rule__ButtonDefinition__Group__3__Impl : ( ( rule__ButtonDefinition__PropertiesAssignment_3 )? ) ;
    public final void rule__ButtonDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4299:1: ( ( ( rule__ButtonDefinition__PropertiesAssignment_3 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4300:1: ( ( rule__ButtonDefinition__PropertiesAssignment_3 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4300:1: ( ( rule__ButtonDefinition__PropertiesAssignment_3 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4301:1: ( rule__ButtonDefinition__PropertiesAssignment_3 )?
            {
             before(grammarAccess.getButtonDefinitionAccess().getPropertiesAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4302:1: ( rule__ButtonDefinition__PropertiesAssignment_3 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==22) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4302:2: rule__ButtonDefinition__PropertiesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__ButtonDefinition__PropertiesAssignment_3_in_rule__ButtonDefinition__Group__3__Impl8654);
                    rule__ButtonDefinition__PropertiesAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getButtonDefinitionAccess().getPropertiesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonDefinition__Group__3__Impl"


    // $ANTLR start "rule__ButtonProperties__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4320:1: rule__ButtonProperties__Group__0 : rule__ButtonProperties__Group__0__Impl rule__ButtonProperties__Group__1 ;
    public final void rule__ButtonProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4324:1: ( rule__ButtonProperties__Group__0__Impl rule__ButtonProperties__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4325:2: rule__ButtonProperties__Group__0__Impl rule__ButtonProperties__Group__1
            {
            pushFollow(FOLLOW_rule__ButtonProperties__Group__0__Impl_in_rule__ButtonProperties__Group__08693);
            rule__ButtonProperties__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonProperties__Group__1_in_rule__ButtonProperties__Group__08696);
            rule__ButtonProperties__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonProperties__Group__0"


    // $ANTLR start "rule__ButtonProperties__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4332:1: rule__ButtonProperties__Group__0__Impl : ( ( rule__ButtonProperties__CommonPropertiesAssignment_0 ) ) ;
    public final void rule__ButtonProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4336:1: ( ( ( rule__ButtonProperties__CommonPropertiesAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4337:1: ( ( rule__ButtonProperties__CommonPropertiesAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4337:1: ( ( rule__ButtonProperties__CommonPropertiesAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4338:1: ( rule__ButtonProperties__CommonPropertiesAssignment_0 )
            {
             before(grammarAccess.getButtonPropertiesAccess().getCommonPropertiesAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4339:1: ( rule__ButtonProperties__CommonPropertiesAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4339:2: rule__ButtonProperties__CommonPropertiesAssignment_0
            {
            pushFollow(FOLLOW_rule__ButtonProperties__CommonPropertiesAssignment_0_in_rule__ButtonProperties__Group__0__Impl8723);
            rule__ButtonProperties__CommonPropertiesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getButtonPropertiesAccess().getCommonPropertiesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonProperties__Group__0__Impl"


    // $ANTLR start "rule__ButtonProperties__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4349:1: rule__ButtonProperties__Group__1 : rule__ButtonProperties__Group__1__Impl ;
    public final void rule__ButtonProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4353:1: ( rule__ButtonProperties__Group__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4354:2: rule__ButtonProperties__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ButtonProperties__Group__1__Impl_in_rule__ButtonProperties__Group__18753);
            rule__ButtonProperties__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonProperties__Group__1"


    // $ANTLR start "rule__ButtonProperties__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4360:1: rule__ButtonProperties__Group__1__Impl : ( ( rule__ButtonProperties__Group_1__0 )? ) ;
    public final void rule__ButtonProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4364:1: ( ( ( rule__ButtonProperties__Group_1__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4365:1: ( ( rule__ButtonProperties__Group_1__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4365:1: ( ( rule__ButtonProperties__Group_1__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4366:1: ( rule__ButtonProperties__Group_1__0 )?
            {
             before(grammarAccess.getButtonPropertiesAccess().getGroup_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4367:1: ( rule__ButtonProperties__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==27) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4367:2: rule__ButtonProperties__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ButtonProperties__Group_1__0_in_rule__ButtonProperties__Group__1__Impl8780);
                    rule__ButtonProperties__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getButtonPropertiesAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonProperties__Group__1__Impl"


    // $ANTLR start "rule__ButtonProperties__Group_1__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4381:1: rule__ButtonProperties__Group_1__0 : rule__ButtonProperties__Group_1__0__Impl rule__ButtonProperties__Group_1__1 ;
    public final void rule__ButtonProperties__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4385:1: ( rule__ButtonProperties__Group_1__0__Impl rule__ButtonProperties__Group_1__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4386:2: rule__ButtonProperties__Group_1__0__Impl rule__ButtonProperties__Group_1__1
            {
            pushFollow(FOLLOW_rule__ButtonProperties__Group_1__0__Impl_in_rule__ButtonProperties__Group_1__08815);
            rule__ButtonProperties__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonProperties__Group_1__1_in_rule__ButtonProperties__Group_1__08818);
            rule__ButtonProperties__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonProperties__Group_1__0"


    // $ANTLR start "rule__ButtonProperties__Group_1__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4393:1: rule__ButtonProperties__Group_1__0__Impl : ( 'text=' ) ;
    public final void rule__ButtonProperties__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4397:1: ( ( 'text=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4398:1: ( 'text=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4398:1: ( 'text=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4399:1: 'text='
            {
             before(grammarAccess.getButtonPropertiesAccess().getTextKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__ButtonProperties__Group_1__0__Impl8846); 
             after(grammarAccess.getButtonPropertiesAccess().getTextKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonProperties__Group_1__0__Impl"


    // $ANTLR start "rule__ButtonProperties__Group_1__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4412:1: rule__ButtonProperties__Group_1__1 : rule__ButtonProperties__Group_1__1__Impl ;
    public final void rule__ButtonProperties__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4416:1: ( rule__ButtonProperties__Group_1__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4417:2: rule__ButtonProperties__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ButtonProperties__Group_1__1__Impl_in_rule__ButtonProperties__Group_1__18877);
            rule__ButtonProperties__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonProperties__Group_1__1"


    // $ANTLR start "rule__ButtonProperties__Group_1__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4423:1: rule__ButtonProperties__Group_1__1__Impl : ( ( rule__ButtonProperties__TextAssignment_1_1 ) ) ;
    public final void rule__ButtonProperties__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4427:1: ( ( ( rule__ButtonProperties__TextAssignment_1_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4428:1: ( ( rule__ButtonProperties__TextAssignment_1_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4428:1: ( ( rule__ButtonProperties__TextAssignment_1_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4429:1: ( rule__ButtonProperties__TextAssignment_1_1 )
            {
             before(grammarAccess.getButtonPropertiesAccess().getTextAssignment_1_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4430:1: ( rule__ButtonProperties__TextAssignment_1_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4430:2: rule__ButtonProperties__TextAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ButtonProperties__TextAssignment_1_1_in_rule__ButtonProperties__Group_1__1__Impl8904);
            rule__ButtonProperties__TextAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getButtonPropertiesAccess().getTextAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonProperties__Group_1__1__Impl"


    // $ANTLR start "rule__CommonProperties__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4444:1: rule__CommonProperties__Group__0 : rule__CommonProperties__Group__0__Impl rule__CommonProperties__Group__1 ;
    public final void rule__CommonProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4448:1: ( rule__CommonProperties__Group__0__Impl rule__CommonProperties__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4449:2: rule__CommonProperties__Group__0__Impl rule__CommonProperties__Group__1
            {
            pushFollow(FOLLOW_rule__CommonProperties__Group__0__Impl_in_rule__CommonProperties__Group__08938);
            rule__CommonProperties__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommonProperties__Group__1_in_rule__CommonProperties__Group__08941);
            rule__CommonProperties__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonProperties__Group__0"


    // $ANTLR start "rule__CommonProperties__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4456:1: rule__CommonProperties__Group__0__Impl : ( '->' ) ;
    public final void rule__CommonProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4460:1: ( ( '->' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4461:1: ( '->' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4461:1: ( '->' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4462:1: '->'
            {
             before(grammarAccess.getCommonPropertiesAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__CommonProperties__Group__0__Impl8969); 
             after(grammarAccess.getCommonPropertiesAccess().getHyphenMinusGreaterThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonProperties__Group__0__Impl"


    // $ANTLR start "rule__CommonProperties__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4475:1: rule__CommonProperties__Group__1 : rule__CommonProperties__Group__1__Impl rule__CommonProperties__Group__2 ;
    public final void rule__CommonProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4479:1: ( rule__CommonProperties__Group__1__Impl rule__CommonProperties__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4480:2: rule__CommonProperties__Group__1__Impl rule__CommonProperties__Group__2
            {
            pushFollow(FOLLOW_rule__CommonProperties__Group__1__Impl_in_rule__CommonProperties__Group__19000);
            rule__CommonProperties__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommonProperties__Group__2_in_rule__CommonProperties__Group__19003);
            rule__CommonProperties__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonProperties__Group__1"


    // $ANTLR start "rule__CommonProperties__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4487:1: rule__CommonProperties__Group__1__Impl : ( ( rule__CommonProperties__Group_1__0 )? ) ;
    public final void rule__CommonProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4491:1: ( ( ( rule__CommonProperties__Group_1__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4492:1: ( ( rule__CommonProperties__Group_1__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4492:1: ( ( rule__CommonProperties__Group_1__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4493:1: ( rule__CommonProperties__Group_1__0 )?
            {
             before(grammarAccess.getCommonPropertiesAccess().getGroup_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4494:1: ( rule__CommonProperties__Group_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==41) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4494:2: rule__CommonProperties__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CommonProperties__Group_1__0_in_rule__CommonProperties__Group__1__Impl9030);
                    rule__CommonProperties__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommonPropertiesAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonProperties__Group__1__Impl"


    // $ANTLR start "rule__CommonProperties__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4504:1: rule__CommonProperties__Group__2 : rule__CommonProperties__Group__2__Impl rule__CommonProperties__Group__3 ;
    public final void rule__CommonProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4508:1: ( rule__CommonProperties__Group__2__Impl rule__CommonProperties__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4509:2: rule__CommonProperties__Group__2__Impl rule__CommonProperties__Group__3
            {
            pushFollow(FOLLOW_rule__CommonProperties__Group__2__Impl_in_rule__CommonProperties__Group__29061);
            rule__CommonProperties__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommonProperties__Group__3_in_rule__CommonProperties__Group__29064);
            rule__CommonProperties__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonProperties__Group__2"


    // $ANTLR start "rule__CommonProperties__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4516:1: rule__CommonProperties__Group__2__Impl : ( ( rule__CommonProperties__Group_2__0 )? ) ;
    public final void rule__CommonProperties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4520:1: ( ( ( rule__CommonProperties__Group_2__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4521:1: ( ( rule__CommonProperties__Group_2__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4521:1: ( ( rule__CommonProperties__Group_2__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4522:1: ( rule__CommonProperties__Group_2__0 )?
            {
             before(grammarAccess.getCommonPropertiesAccess().getGroup_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4523:1: ( rule__CommonProperties__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==42) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4523:2: rule__CommonProperties__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__CommonProperties__Group_2__0_in_rule__CommonProperties__Group__2__Impl9091);
                    rule__CommonProperties__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommonPropertiesAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonProperties__Group__2__Impl"


    // $ANTLR start "rule__CommonProperties__Group__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4533:1: rule__CommonProperties__Group__3 : rule__CommonProperties__Group__3__Impl ;
    public final void rule__CommonProperties__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4537:1: ( rule__CommonProperties__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4538:2: rule__CommonProperties__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CommonProperties__Group__3__Impl_in_rule__CommonProperties__Group__39122);
            rule__CommonProperties__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonProperties__Group__3"


    // $ANTLR start "rule__CommonProperties__Group__3__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4544:1: rule__CommonProperties__Group__3__Impl : ( ( rule__CommonProperties__Group_3__0 )? ) ;
    public final void rule__CommonProperties__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4548:1: ( ( ( rule__CommonProperties__Group_3__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4549:1: ( ( rule__CommonProperties__Group_3__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4549:1: ( ( rule__CommonProperties__Group_3__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4550:1: ( rule__CommonProperties__Group_3__0 )?
            {
             before(grammarAccess.getCommonPropertiesAccess().getGroup_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4551:1: ( rule__CommonProperties__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==43) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4551:2: rule__CommonProperties__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__CommonProperties__Group_3__0_in_rule__CommonProperties__Group__3__Impl9149);
                    rule__CommonProperties__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommonPropertiesAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonProperties__Group__3__Impl"


    // $ANTLR start "rule__CommonProperties__Group_1__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4569:1: rule__CommonProperties__Group_1__0 : rule__CommonProperties__Group_1__0__Impl rule__CommonProperties__Group_1__1 ;
    public final void rule__CommonProperties__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4573:1: ( rule__CommonProperties__Group_1__0__Impl rule__CommonProperties__Group_1__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4574:2: rule__CommonProperties__Group_1__0__Impl rule__CommonProperties__Group_1__1
            {
            pushFollow(FOLLOW_rule__CommonProperties__Group_1__0__Impl_in_rule__CommonProperties__Group_1__09188);
            rule__CommonProperties__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommonProperties__Group_1__1_in_rule__CommonProperties__Group_1__09191);
            rule__CommonProperties__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonProperties__Group_1__0"


    // $ANTLR start "rule__CommonProperties__Group_1__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4581:1: rule__CommonProperties__Group_1__0__Impl : ( ( rule__CommonProperties__NameAssignment_1_0 ) ) ;
    public final void rule__CommonProperties__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4585:1: ( ( ( rule__CommonProperties__NameAssignment_1_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4586:1: ( ( rule__CommonProperties__NameAssignment_1_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4586:1: ( ( rule__CommonProperties__NameAssignment_1_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4587:1: ( rule__CommonProperties__NameAssignment_1_0 )
            {
             before(grammarAccess.getCommonPropertiesAccess().getNameAssignment_1_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4588:1: ( rule__CommonProperties__NameAssignment_1_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4588:2: rule__CommonProperties__NameAssignment_1_0
            {
            pushFollow(FOLLOW_rule__CommonProperties__NameAssignment_1_0_in_rule__CommonProperties__Group_1__0__Impl9218);
            rule__CommonProperties__NameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCommonPropertiesAccess().getNameAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonProperties__Group_1__0__Impl"


    // $ANTLR start "rule__CommonProperties__Group_1__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4598:1: rule__CommonProperties__Group_1__1 : rule__CommonProperties__Group_1__1__Impl rule__CommonProperties__Group_1__2 ;
    public final void rule__CommonProperties__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4602:1: ( rule__CommonProperties__Group_1__1__Impl rule__CommonProperties__Group_1__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4603:2: rule__CommonProperties__Group_1__1__Impl rule__CommonProperties__Group_1__2
            {
            pushFollow(FOLLOW_rule__CommonProperties__Group_1__1__Impl_in_rule__CommonProperties__Group_1__19248);
            rule__CommonProperties__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommonProperties__Group_1__2_in_rule__CommonProperties__Group_1__19251);
            rule__CommonProperties__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonProperties__Group_1__1"


    // $ANTLR start "rule__CommonProperties__Group_1__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4610:1: rule__CommonProperties__Group_1__1__Impl : ( '=' ) ;
    public final void rule__CommonProperties__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4614:1: ( ( '=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4615:1: ( '=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4615:1: ( '=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4616:1: '='
            {
             before(grammarAccess.getCommonPropertiesAccess().getEqualsSignKeyword_1_1()); 
            match(input,29,FOLLOW_29_in_rule__CommonProperties__Group_1__1__Impl9279); 
             after(grammarAccess.getCommonPropertiesAccess().getEqualsSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonProperties__Group_1__1__Impl"


    // $ANTLR start "rule__CommonProperties__Group_1__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4629:1: rule__CommonProperties__Group_1__2 : rule__CommonProperties__Group_1__2__Impl ;
    public final void rule__CommonProperties__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4633:1: ( rule__CommonProperties__Group_1__2__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4634:2: rule__CommonProperties__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__CommonProperties__Group_1__2__Impl_in_rule__CommonProperties__Group_1__29310);
            rule__CommonProperties__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonProperties__Group_1__2"


    // $ANTLR start "rule__CommonProperties__Group_1__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4640:1: rule__CommonProperties__Group_1__2__Impl : ( ( rule__CommonProperties__PropertyKeyAssignment_1_2 ) ) ;
    public final void rule__CommonProperties__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4644:1: ( ( ( rule__CommonProperties__PropertyKeyAssignment_1_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4645:1: ( ( rule__CommonProperties__PropertyKeyAssignment_1_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4645:1: ( ( rule__CommonProperties__PropertyKeyAssignment_1_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4646:1: ( rule__CommonProperties__PropertyKeyAssignment_1_2 )
            {
             before(grammarAccess.getCommonPropertiesAccess().getPropertyKeyAssignment_1_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4647:1: ( rule__CommonProperties__PropertyKeyAssignment_1_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4647:2: rule__CommonProperties__PropertyKeyAssignment_1_2
            {
            pushFollow(FOLLOW_rule__CommonProperties__PropertyKeyAssignment_1_2_in_rule__CommonProperties__Group_1__2__Impl9337);
            rule__CommonProperties__PropertyKeyAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getCommonPropertiesAccess().getPropertyKeyAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonProperties__Group_1__2__Impl"


    // $ANTLR start "rule__CommonProperties__Group_2__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4663:1: rule__CommonProperties__Group_2__0 : rule__CommonProperties__Group_2__0__Impl rule__CommonProperties__Group_2__1 ;
    public final void rule__CommonProperties__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4667:1: ( rule__CommonProperties__Group_2__0__Impl rule__CommonProperties__Group_2__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4668:2: rule__CommonProperties__Group_2__0__Impl rule__CommonProperties__Group_2__1
            {
            pushFollow(FOLLOW_rule__CommonProperties__Group_2__0__Impl_in_rule__CommonProperties__Group_2__09373);
            rule__CommonProperties__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommonProperties__Group_2__1_in_rule__CommonProperties__Group_2__09376);
            rule__CommonProperties__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonProperties__Group_2__0"


    // $ANTLR start "rule__CommonProperties__Group_2__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4675:1: rule__CommonProperties__Group_2__0__Impl : ( ( rule__CommonProperties__NameAssignment_2_0 ) ) ;
    public final void rule__CommonProperties__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4679:1: ( ( ( rule__CommonProperties__NameAssignment_2_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4680:1: ( ( rule__CommonProperties__NameAssignment_2_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4680:1: ( ( rule__CommonProperties__NameAssignment_2_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4681:1: ( rule__CommonProperties__NameAssignment_2_0 )
            {
             before(grammarAccess.getCommonPropertiesAccess().getNameAssignment_2_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4682:1: ( rule__CommonProperties__NameAssignment_2_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4682:2: rule__CommonProperties__NameAssignment_2_0
            {
            pushFollow(FOLLOW_rule__CommonProperties__NameAssignment_2_0_in_rule__CommonProperties__Group_2__0__Impl9403);
            rule__CommonProperties__NameAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getCommonPropertiesAccess().getNameAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonProperties__Group_2__0__Impl"


    // $ANTLR start "rule__CommonProperties__Group_2__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4692:1: rule__CommonProperties__Group_2__1 : rule__CommonProperties__Group_2__1__Impl rule__CommonProperties__Group_2__2 ;
    public final void rule__CommonProperties__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4696:1: ( rule__CommonProperties__Group_2__1__Impl rule__CommonProperties__Group_2__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4697:2: rule__CommonProperties__Group_2__1__Impl rule__CommonProperties__Group_2__2
            {
            pushFollow(FOLLOW_rule__CommonProperties__Group_2__1__Impl_in_rule__CommonProperties__Group_2__19433);
            rule__CommonProperties__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommonProperties__Group_2__2_in_rule__CommonProperties__Group_2__19436);
            rule__CommonProperties__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonProperties__Group_2__1"


    // $ANTLR start "rule__CommonProperties__Group_2__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4704:1: rule__CommonProperties__Group_2__1__Impl : ( '=' ) ;
    public final void rule__CommonProperties__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4708:1: ( ( '=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4709:1: ( '=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4709:1: ( '=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4710:1: '='
            {
             before(grammarAccess.getCommonPropertiesAccess().getEqualsSignKeyword_2_1()); 
            match(input,29,FOLLOW_29_in_rule__CommonProperties__Group_2__1__Impl9464); 
             after(grammarAccess.getCommonPropertiesAccess().getEqualsSignKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonProperties__Group_2__1__Impl"


    // $ANTLR start "rule__CommonProperties__Group_2__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4723:1: rule__CommonProperties__Group_2__2 : rule__CommonProperties__Group_2__2__Impl ;
    public final void rule__CommonProperties__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4727:1: ( rule__CommonProperties__Group_2__2__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4728:2: rule__CommonProperties__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__CommonProperties__Group_2__2__Impl_in_rule__CommonProperties__Group_2__29495);
            rule__CommonProperties__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonProperties__Group_2__2"


    // $ANTLR start "rule__CommonProperties__Group_2__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4734:1: rule__CommonProperties__Group_2__2__Impl : ( ( rule__CommonProperties__LayoutKeyAssignment_2_2 ) ) ;
    public final void rule__CommonProperties__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4738:1: ( ( ( rule__CommonProperties__LayoutKeyAssignment_2_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4739:1: ( ( rule__CommonProperties__LayoutKeyAssignment_2_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4739:1: ( ( rule__CommonProperties__LayoutKeyAssignment_2_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4740:1: ( rule__CommonProperties__LayoutKeyAssignment_2_2 )
            {
             before(grammarAccess.getCommonPropertiesAccess().getLayoutKeyAssignment_2_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4741:1: ( rule__CommonProperties__LayoutKeyAssignment_2_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4741:2: rule__CommonProperties__LayoutKeyAssignment_2_2
            {
            pushFollow(FOLLOW_rule__CommonProperties__LayoutKeyAssignment_2_2_in_rule__CommonProperties__Group_2__2__Impl9522);
            rule__CommonProperties__LayoutKeyAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getCommonPropertiesAccess().getLayoutKeyAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonProperties__Group_2__2__Impl"


    // $ANTLR start "rule__CommonProperties__Group_3__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4757:1: rule__CommonProperties__Group_3__0 : rule__CommonProperties__Group_3__0__Impl rule__CommonProperties__Group_3__1 ;
    public final void rule__CommonProperties__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4761:1: ( rule__CommonProperties__Group_3__0__Impl rule__CommonProperties__Group_3__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4762:2: rule__CommonProperties__Group_3__0__Impl rule__CommonProperties__Group_3__1
            {
            pushFollow(FOLLOW_rule__CommonProperties__Group_3__0__Impl_in_rule__CommonProperties__Group_3__09558);
            rule__CommonProperties__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommonProperties__Group_3__1_in_rule__CommonProperties__Group_3__09561);
            rule__CommonProperties__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonProperties__Group_3__0"


    // $ANTLR start "rule__CommonProperties__Group_3__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4769:1: rule__CommonProperties__Group_3__0__Impl : ( ( rule__CommonProperties__NameAssignment_3_0 ) ) ;
    public final void rule__CommonProperties__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4773:1: ( ( ( rule__CommonProperties__NameAssignment_3_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4774:1: ( ( rule__CommonProperties__NameAssignment_3_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4774:1: ( ( rule__CommonProperties__NameAssignment_3_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4775:1: ( rule__CommonProperties__NameAssignment_3_0 )
            {
             before(grammarAccess.getCommonPropertiesAccess().getNameAssignment_3_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4776:1: ( rule__CommonProperties__NameAssignment_3_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4776:2: rule__CommonProperties__NameAssignment_3_0
            {
            pushFollow(FOLLOW_rule__CommonProperties__NameAssignment_3_0_in_rule__CommonProperties__Group_3__0__Impl9588);
            rule__CommonProperties__NameAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getCommonPropertiesAccess().getNameAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonProperties__Group_3__0__Impl"


    // $ANTLR start "rule__CommonProperties__Group_3__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4786:1: rule__CommonProperties__Group_3__1 : rule__CommonProperties__Group_3__1__Impl rule__CommonProperties__Group_3__2 ;
    public final void rule__CommonProperties__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4790:1: ( rule__CommonProperties__Group_3__1__Impl rule__CommonProperties__Group_3__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4791:2: rule__CommonProperties__Group_3__1__Impl rule__CommonProperties__Group_3__2
            {
            pushFollow(FOLLOW_rule__CommonProperties__Group_3__1__Impl_in_rule__CommonProperties__Group_3__19618);
            rule__CommonProperties__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommonProperties__Group_3__2_in_rule__CommonProperties__Group_3__19621);
            rule__CommonProperties__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonProperties__Group_3__1"


    // $ANTLR start "rule__CommonProperties__Group_3__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4798:1: rule__CommonProperties__Group_3__1__Impl : ( '=' ) ;
    public final void rule__CommonProperties__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4802:1: ( ( '=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4803:1: ( '=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4803:1: ( '=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4804:1: '='
            {
             before(grammarAccess.getCommonPropertiesAccess().getEqualsSignKeyword_3_1()); 
            match(input,29,FOLLOW_29_in_rule__CommonProperties__Group_3__1__Impl9649); 
             after(grammarAccess.getCommonPropertiesAccess().getEqualsSignKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonProperties__Group_3__1__Impl"


    // $ANTLR start "rule__CommonProperties__Group_3__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4817:1: rule__CommonProperties__Group_3__2 : rule__CommonProperties__Group_3__2__Impl ;
    public final void rule__CommonProperties__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4821:1: ( rule__CommonProperties__Group_3__2__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4822:2: rule__CommonProperties__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__CommonProperties__Group_3__2__Impl_in_rule__CommonProperties__Group_3__29680);
            rule__CommonProperties__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonProperties__Group_3__2"


    // $ANTLR start "rule__CommonProperties__Group_3__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4828:1: rule__CommonProperties__Group_3__2__Impl : ( ( ( rule__CommonProperties__InteractiontypeAssignment_3_2 ) ) ( ( rule__CommonProperties__InteractiontypeAssignment_3_2 )* ) ) ;
    public final void rule__CommonProperties__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4832:1: ( ( ( ( rule__CommonProperties__InteractiontypeAssignment_3_2 ) ) ( ( rule__CommonProperties__InteractiontypeAssignment_3_2 )* ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4833:1: ( ( ( rule__CommonProperties__InteractiontypeAssignment_3_2 ) ) ( ( rule__CommonProperties__InteractiontypeAssignment_3_2 )* ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4833:1: ( ( ( rule__CommonProperties__InteractiontypeAssignment_3_2 ) ) ( ( rule__CommonProperties__InteractiontypeAssignment_3_2 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4834:1: ( ( rule__CommonProperties__InteractiontypeAssignment_3_2 ) ) ( ( rule__CommonProperties__InteractiontypeAssignment_3_2 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4834:1: ( ( rule__CommonProperties__InteractiontypeAssignment_3_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4835:1: ( rule__CommonProperties__InteractiontypeAssignment_3_2 )
            {
             before(grammarAccess.getCommonPropertiesAccess().getInteractiontypeAssignment_3_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4836:1: ( rule__CommonProperties__InteractiontypeAssignment_3_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4836:2: rule__CommonProperties__InteractiontypeAssignment_3_2
            {
            pushFollow(FOLLOW_rule__CommonProperties__InteractiontypeAssignment_3_2_in_rule__CommonProperties__Group_3__2__Impl9709);
            rule__CommonProperties__InteractiontypeAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getCommonPropertiesAccess().getInteractiontypeAssignment_3_2()); 

            }

            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4839:1: ( ( rule__CommonProperties__InteractiontypeAssignment_3_2 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4840:1: ( rule__CommonProperties__InteractiontypeAssignment_3_2 )*
            {
             before(grammarAccess.getCommonPropertiesAccess().getInteractiontypeAssignment_3_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4841:1: ( rule__CommonProperties__InteractiontypeAssignment_3_2 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=16 && LA34_0<=17)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4841:2: rule__CommonProperties__InteractiontypeAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_rule__CommonProperties__InteractiontypeAssignment_3_2_in_rule__CommonProperties__Group_3__2__Impl9721);
            	    rule__CommonProperties__InteractiontypeAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getCommonPropertiesAccess().getInteractiontypeAssignment_3_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonProperties__Group_3__2__Impl"


    // $ANTLR start "rule__LabelDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4858:1: rule__LabelDefinition__Group__0 : rule__LabelDefinition__Group__0__Impl rule__LabelDefinition__Group__1 ;
    public final void rule__LabelDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4862:1: ( rule__LabelDefinition__Group__0__Impl rule__LabelDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4863:2: rule__LabelDefinition__Group__0__Impl rule__LabelDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__0__Impl_in_rule__LabelDefinition__Group__09760);
            rule__LabelDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelDefinition__Group__1_in_rule__LabelDefinition__Group__09763);
            rule__LabelDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelDefinition__Group__0"


    // $ANTLR start "rule__LabelDefinition__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4870:1: rule__LabelDefinition__Group__0__Impl : ( ( rule__LabelDefinition__NameAssignment_0 ) ) ;
    public final void rule__LabelDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4874:1: ( ( ( rule__LabelDefinition__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4875:1: ( ( rule__LabelDefinition__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4875:1: ( ( rule__LabelDefinition__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4876:1: ( rule__LabelDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getLabelDefinitionAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4877:1: ( rule__LabelDefinition__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4877:2: rule__LabelDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__LabelDefinition__NameAssignment_0_in_rule__LabelDefinition__Group__0__Impl9790);
            rule__LabelDefinition__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLabelDefinitionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelDefinition__Group__0__Impl"


    // $ANTLR start "rule__LabelDefinition__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4887:1: rule__LabelDefinition__Group__1 : rule__LabelDefinition__Group__1__Impl rule__LabelDefinition__Group__2 ;
    public final void rule__LabelDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4891:1: ( rule__LabelDefinition__Group__1__Impl rule__LabelDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4892:2: rule__LabelDefinition__Group__1__Impl rule__LabelDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__1__Impl_in_rule__LabelDefinition__Group__19820);
            rule__LabelDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelDefinition__Group__2_in_rule__LabelDefinition__Group__19823);
            rule__LabelDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelDefinition__Group__1"


    // $ANTLR start "rule__LabelDefinition__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4899:1: rule__LabelDefinition__Group__1__Impl : ( 'as' ) ;
    public final void rule__LabelDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4903:1: ( ( 'as' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4904:1: ( 'as' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4904:1: ( 'as' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4905:1: 'as'
            {
             before(grammarAccess.getLabelDefinitionAccess().getAsKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__LabelDefinition__Group__1__Impl9851); 
             after(grammarAccess.getLabelDefinitionAccess().getAsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelDefinition__Group__1__Impl"


    // $ANTLR start "rule__LabelDefinition__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4918:1: rule__LabelDefinition__Group__2 : rule__LabelDefinition__Group__2__Impl rule__LabelDefinition__Group__3 ;
    public final void rule__LabelDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4922:1: ( rule__LabelDefinition__Group__2__Impl rule__LabelDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4923:2: rule__LabelDefinition__Group__2__Impl rule__LabelDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__2__Impl_in_rule__LabelDefinition__Group__29882);
            rule__LabelDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelDefinition__Group__3_in_rule__LabelDefinition__Group__29885);
            rule__LabelDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelDefinition__Group__2"


    // $ANTLR start "rule__LabelDefinition__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4930:1: rule__LabelDefinition__Group__2__Impl : ( ( rule__LabelDefinition__IdAssignment_2 ) ) ;
    public final void rule__LabelDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4934:1: ( ( ( rule__LabelDefinition__IdAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4935:1: ( ( rule__LabelDefinition__IdAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4935:1: ( ( rule__LabelDefinition__IdAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4936:1: ( rule__LabelDefinition__IdAssignment_2 )
            {
             before(grammarAccess.getLabelDefinitionAccess().getIdAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4937:1: ( rule__LabelDefinition__IdAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4937:2: rule__LabelDefinition__IdAssignment_2
            {
            pushFollow(FOLLOW_rule__LabelDefinition__IdAssignment_2_in_rule__LabelDefinition__Group__2__Impl9912);
            rule__LabelDefinition__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLabelDefinitionAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelDefinition__Group__2__Impl"


    // $ANTLR start "rule__LabelDefinition__Group__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4947:1: rule__LabelDefinition__Group__3 : rule__LabelDefinition__Group__3__Impl ;
    public final void rule__LabelDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4951:1: ( rule__LabelDefinition__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4952:2: rule__LabelDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__3__Impl_in_rule__LabelDefinition__Group__39942);
            rule__LabelDefinition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelDefinition__Group__3"


    // $ANTLR start "rule__LabelDefinition__Group__3__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4958:1: rule__LabelDefinition__Group__3__Impl : ( ( rule__LabelDefinition__Group_3__0 )? ) ;
    public final void rule__LabelDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4962:1: ( ( ( rule__LabelDefinition__Group_3__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4963:1: ( ( rule__LabelDefinition__Group_3__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4963:1: ( ( rule__LabelDefinition__Group_3__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4964:1: ( rule__LabelDefinition__Group_3__0 )?
            {
             before(grammarAccess.getLabelDefinitionAccess().getGroup_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4965:1: ( rule__LabelDefinition__Group_3__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==22) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4965:2: rule__LabelDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__LabelDefinition__Group_3__0_in_rule__LabelDefinition__Group__3__Impl9969);
                    rule__LabelDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLabelDefinitionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelDefinition__Group__3__Impl"


    // $ANTLR start "rule__LabelDefinition__Group_3__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4983:1: rule__LabelDefinition__Group_3__0 : rule__LabelDefinition__Group_3__0__Impl rule__LabelDefinition__Group_3__1 ;
    public final void rule__LabelDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4987:1: ( rule__LabelDefinition__Group_3__0__Impl rule__LabelDefinition__Group_3__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4988:2: rule__LabelDefinition__Group_3__0__Impl rule__LabelDefinition__Group_3__1
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group_3__0__Impl_in_rule__LabelDefinition__Group_3__010008);
            rule__LabelDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelDefinition__Group_3__1_in_rule__LabelDefinition__Group_3__010011);
            rule__LabelDefinition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelDefinition__Group_3__0"


    // $ANTLR start "rule__LabelDefinition__Group_3__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4995:1: rule__LabelDefinition__Group_3__0__Impl : ( '->' ) ;
    public final void rule__LabelDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4999:1: ( ( '->' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5000:1: ( '->' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5000:1: ( '->' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5001:1: '->'
            {
             before(grammarAccess.getLabelDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__LabelDefinition__Group_3__0__Impl10039); 
             after(grammarAccess.getLabelDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__LabelDefinition__Group_3__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5014:1: rule__LabelDefinition__Group_3__1 : rule__LabelDefinition__Group_3__1__Impl ;
    public final void rule__LabelDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5018:1: ( rule__LabelDefinition__Group_3__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5019:2: rule__LabelDefinition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group_3__1__Impl_in_rule__LabelDefinition__Group_3__110070);
            rule__LabelDefinition__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelDefinition__Group_3__1"


    // $ANTLR start "rule__LabelDefinition__Group_3__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5025:1: rule__LabelDefinition__Group_3__1__Impl : ( ( rule__LabelDefinition__PropertiesAssignment_3_1 ) ) ;
    public final void rule__LabelDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5029:1: ( ( ( rule__LabelDefinition__PropertiesAssignment_3_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5030:1: ( ( rule__LabelDefinition__PropertiesAssignment_3_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5030:1: ( ( rule__LabelDefinition__PropertiesAssignment_3_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5031:1: ( rule__LabelDefinition__PropertiesAssignment_3_1 )
            {
             before(grammarAccess.getLabelDefinitionAccess().getPropertiesAssignment_3_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5032:1: ( rule__LabelDefinition__PropertiesAssignment_3_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5032:2: rule__LabelDefinition__PropertiesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__LabelDefinition__PropertiesAssignment_3_1_in_rule__LabelDefinition__Group_3__1__Impl10097);
            rule__LabelDefinition__PropertiesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLabelDefinitionAccess().getPropertiesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__LabelProperties__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5046:1: rule__LabelProperties__Group__0 : rule__LabelProperties__Group__0__Impl rule__LabelProperties__Group__1 ;
    public final void rule__LabelProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5050:1: ( rule__LabelProperties__Group__0__Impl rule__LabelProperties__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5051:2: rule__LabelProperties__Group__0__Impl rule__LabelProperties__Group__1
            {
            pushFollow(FOLLOW_rule__LabelProperties__Group__0__Impl_in_rule__LabelProperties__Group__010131);
            rule__LabelProperties__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelProperties__Group__1_in_rule__LabelProperties__Group__010134);
            rule__LabelProperties__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelProperties__Group__0"


    // $ANTLR start "rule__LabelProperties__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5058:1: rule__LabelProperties__Group__0__Impl : ( ( rule__LabelProperties__CommonPropertiesAssignment_0 ) ) ;
    public final void rule__LabelProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5062:1: ( ( ( rule__LabelProperties__CommonPropertiesAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5063:1: ( ( rule__LabelProperties__CommonPropertiesAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5063:1: ( ( rule__LabelProperties__CommonPropertiesAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5064:1: ( rule__LabelProperties__CommonPropertiesAssignment_0 )
            {
             before(grammarAccess.getLabelPropertiesAccess().getCommonPropertiesAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5065:1: ( rule__LabelProperties__CommonPropertiesAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5065:2: rule__LabelProperties__CommonPropertiesAssignment_0
            {
            pushFollow(FOLLOW_rule__LabelProperties__CommonPropertiesAssignment_0_in_rule__LabelProperties__Group__0__Impl10161);
            rule__LabelProperties__CommonPropertiesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLabelPropertiesAccess().getCommonPropertiesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelProperties__Group__0__Impl"


    // $ANTLR start "rule__LabelProperties__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5075:1: rule__LabelProperties__Group__1 : rule__LabelProperties__Group__1__Impl ;
    public final void rule__LabelProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5079:1: ( rule__LabelProperties__Group__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5080:2: rule__LabelProperties__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LabelProperties__Group__1__Impl_in_rule__LabelProperties__Group__110191);
            rule__LabelProperties__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelProperties__Group__1"


    // $ANTLR start "rule__LabelProperties__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5086:1: rule__LabelProperties__Group__1__Impl : ( ( rule__LabelProperties__Group_1__0 )? ) ;
    public final void rule__LabelProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5090:1: ( ( ( rule__LabelProperties__Group_1__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5091:1: ( ( rule__LabelProperties__Group_1__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5091:1: ( ( rule__LabelProperties__Group_1__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5092:1: ( rule__LabelProperties__Group_1__0 )?
            {
             before(grammarAccess.getLabelPropertiesAccess().getGroup_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5093:1: ( rule__LabelProperties__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==27) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5093:2: rule__LabelProperties__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__LabelProperties__Group_1__0_in_rule__LabelProperties__Group__1__Impl10218);
                    rule__LabelProperties__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLabelPropertiesAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelProperties__Group__1__Impl"


    // $ANTLR start "rule__LabelProperties__Group_1__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5107:1: rule__LabelProperties__Group_1__0 : rule__LabelProperties__Group_1__0__Impl rule__LabelProperties__Group_1__1 ;
    public final void rule__LabelProperties__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5111:1: ( rule__LabelProperties__Group_1__0__Impl rule__LabelProperties__Group_1__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5112:2: rule__LabelProperties__Group_1__0__Impl rule__LabelProperties__Group_1__1
            {
            pushFollow(FOLLOW_rule__LabelProperties__Group_1__0__Impl_in_rule__LabelProperties__Group_1__010253);
            rule__LabelProperties__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelProperties__Group_1__1_in_rule__LabelProperties__Group_1__010256);
            rule__LabelProperties__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelProperties__Group_1__0"


    // $ANTLR start "rule__LabelProperties__Group_1__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5119:1: rule__LabelProperties__Group_1__0__Impl : ( 'text=' ) ;
    public final void rule__LabelProperties__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5123:1: ( ( 'text=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5124:1: ( 'text=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5124:1: ( 'text=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5125:1: 'text='
            {
             before(grammarAccess.getLabelPropertiesAccess().getTextKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__LabelProperties__Group_1__0__Impl10284); 
             after(grammarAccess.getLabelPropertiesAccess().getTextKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelProperties__Group_1__0__Impl"


    // $ANTLR start "rule__LabelProperties__Group_1__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5138:1: rule__LabelProperties__Group_1__1 : rule__LabelProperties__Group_1__1__Impl rule__LabelProperties__Group_1__2 ;
    public final void rule__LabelProperties__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5142:1: ( rule__LabelProperties__Group_1__1__Impl rule__LabelProperties__Group_1__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5143:2: rule__LabelProperties__Group_1__1__Impl rule__LabelProperties__Group_1__2
            {
            pushFollow(FOLLOW_rule__LabelProperties__Group_1__1__Impl_in_rule__LabelProperties__Group_1__110315);
            rule__LabelProperties__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelProperties__Group_1__2_in_rule__LabelProperties__Group_1__110318);
            rule__LabelProperties__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelProperties__Group_1__1"


    // $ANTLR start "rule__LabelProperties__Group_1__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5150:1: rule__LabelProperties__Group_1__1__Impl : ( ( rule__LabelProperties__TextAssignment_1_1 ) ) ;
    public final void rule__LabelProperties__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5154:1: ( ( ( rule__LabelProperties__TextAssignment_1_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5155:1: ( ( rule__LabelProperties__TextAssignment_1_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5155:1: ( ( rule__LabelProperties__TextAssignment_1_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5156:1: ( rule__LabelProperties__TextAssignment_1_1 )
            {
             before(grammarAccess.getLabelPropertiesAccess().getTextAssignment_1_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5157:1: ( rule__LabelProperties__TextAssignment_1_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5157:2: rule__LabelProperties__TextAssignment_1_1
            {
            pushFollow(FOLLOW_rule__LabelProperties__TextAssignment_1_1_in_rule__LabelProperties__Group_1__1__Impl10345);
            rule__LabelProperties__TextAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLabelPropertiesAccess().getTextAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelProperties__Group_1__1__Impl"


    // $ANTLR start "rule__LabelProperties__Group_1__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5167:1: rule__LabelProperties__Group_1__2 : rule__LabelProperties__Group_1__2__Impl ;
    public final void rule__LabelProperties__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5171:1: ( rule__LabelProperties__Group_1__2__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5172:2: rule__LabelProperties__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__LabelProperties__Group_1__2__Impl_in_rule__LabelProperties__Group_1__210375);
            rule__LabelProperties__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelProperties__Group_1__2"


    // $ANTLR start "rule__LabelProperties__Group_1__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5178:1: rule__LabelProperties__Group_1__2__Impl : ( ( rule__LabelProperties__NameAssignment_1_2 ) ) ;
    public final void rule__LabelProperties__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5182:1: ( ( ( rule__LabelProperties__NameAssignment_1_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5183:1: ( ( rule__LabelProperties__NameAssignment_1_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5183:1: ( ( rule__LabelProperties__NameAssignment_1_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5184:1: ( rule__LabelProperties__NameAssignment_1_2 )
            {
             before(grammarAccess.getLabelPropertiesAccess().getNameAssignment_1_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5185:1: ( rule__LabelProperties__NameAssignment_1_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5185:2: rule__LabelProperties__NameAssignment_1_2
            {
            pushFollow(FOLLOW_rule__LabelProperties__NameAssignment_1_2_in_rule__LabelProperties__Group_1__2__Impl10402);
            rule__LabelProperties__NameAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getLabelPropertiesAccess().getNameAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelProperties__Group_1__2__Impl"


    // $ANTLR start "rule__UIDescription__TypeDefinitionAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5202:1: rule__UIDescription__TypeDefinitionAssignment_0 : ( ruleTypeDefinition ) ;
    public final void rule__UIDescription__TypeDefinitionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5206:1: ( ( ruleTypeDefinition ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5207:1: ( ruleTypeDefinition )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5207:1: ( ruleTypeDefinition )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5208:1: ruleTypeDefinition
            {
             before(grammarAccess.getUIDescriptionAccess().getTypeDefinitionTypeDefinitionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTypeDefinition_in_rule__UIDescription__TypeDefinitionAssignment_010443);
            ruleTypeDefinition();

            state._fsp--;

             after(grammarAccess.getUIDescriptionAccess().getTypeDefinitionTypeDefinitionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__TypeDefinitionAssignment_0"


    // $ANTLR start "rule__UIDescription__PropertyAssignment_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5217:1: rule__UIDescription__PropertyAssignment_1 : ( ruleProperty ) ;
    public final void rule__UIDescription__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5221:1: ( ( ruleProperty ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5222:1: ( ruleProperty )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5222:1: ( ruleProperty )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5223:1: ruleProperty
            {
             before(grammarAccess.getUIDescriptionAccess().getPropertyPropertyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__UIDescription__PropertyAssignment_110474);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getUIDescriptionAccess().getPropertyPropertyParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__PropertyAssignment_1"


    // $ANTLR start "rule__UIDescription__LayoutAssignment_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5232:1: rule__UIDescription__LayoutAssignment_2 : ( ruleLayout ) ;
    public final void rule__UIDescription__LayoutAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5236:1: ( ( ruleLayout ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5237:1: ( ruleLayout )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5237:1: ( ruleLayout )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5238:1: ruleLayout
            {
             before(grammarAccess.getUIDescriptionAccess().getLayoutLayoutParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLayout_in_rule__UIDescription__LayoutAssignment_210505);
            ruleLayout();

            state._fsp--;

             after(grammarAccess.getUIDescriptionAccess().getLayoutLayoutParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__LayoutAssignment_2"


    // $ANTLR start "rule__UIDescription__UsedDescriptionsAssignment_3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5247:1: rule__UIDescription__UsedDescriptionsAssignment_3 : ( ruleUsedDescriptions ) ;
    public final void rule__UIDescription__UsedDescriptionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5251:1: ( ( ruleUsedDescriptions ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5252:1: ( ruleUsedDescriptions )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5252:1: ( ruleUsedDescriptions )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5253:1: ruleUsedDescriptions
            {
             before(grammarAccess.getUIDescriptionAccess().getUsedDescriptionsUsedDescriptionsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleUsedDescriptions_in_rule__UIDescription__UsedDescriptionsAssignment_310536);
            ruleUsedDescriptions();

            state._fsp--;

             after(grammarAccess.getUIDescriptionAccess().getUsedDescriptionsUsedDescriptionsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__UsedDescriptionsAssignment_3"


    // $ANTLR start "rule__UIDescription__RefinementsAssignment_4"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5262:1: rule__UIDescription__RefinementsAssignment_4 : ( ruleRefinement ) ;
    public final void rule__UIDescription__RefinementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5266:1: ( ( ruleRefinement ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5267:1: ( ruleRefinement )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5267:1: ( ruleRefinement )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5268:1: ruleRefinement
            {
             before(grammarAccess.getUIDescriptionAccess().getRefinementsRefinementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleRefinement_in_rule__UIDescription__RefinementsAssignment_410567);
            ruleRefinement();

            state._fsp--;

             after(grammarAccess.getUIDescriptionAccess().getRefinementsRefinementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__RefinementsAssignment_4"


    // $ANTLR start "rule__UIDescription__DefinitionsAssignment_5"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5277:1: rule__UIDescription__DefinitionsAssignment_5 : ( ruleDefinition ) ;
    public final void rule__UIDescription__DefinitionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5281:1: ( ( ruleDefinition ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5282:1: ( ruleDefinition )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5282:1: ( ruleDefinition )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5283:1: ruleDefinition
            {
             before(grammarAccess.getUIDescriptionAccess().getDefinitionsDefinitionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleDefinition_in_rule__UIDescription__DefinitionsAssignment_510598);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getUIDescriptionAccess().getDefinitionsDefinitionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__DefinitionsAssignment_5"


    // $ANTLR start "rule__UIDescription__StructureAssignment_6"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5292:1: rule__UIDescription__StructureAssignment_6 : ( ruleStructure ) ;
    public final void rule__UIDescription__StructureAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5296:1: ( ( ruleStructure ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5297:1: ( ruleStructure )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5297:1: ( ruleStructure )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5298:1: ruleStructure
            {
             before(grammarAccess.getUIDescriptionAccess().getStructureStructureParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleStructure_in_rule__UIDescription__StructureAssignment_610629);
            ruleStructure();

            state._fsp--;

             after(grammarAccess.getUIDescriptionAccess().getStructureStructureParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__StructureAssignment_6"


    // $ANTLR start "rule__Layout__LayoutFilesAssignment_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5307:1: rule__Layout__LayoutFilesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Layout__LayoutFilesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5311:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5312:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5312:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5313:1: RULE_STRING
            {
             before(grammarAccess.getLayoutAccess().getLayoutFilesSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Layout__LayoutFilesAssignment_110660); 
             after(grammarAccess.getLayoutAccess().getLayoutFilesSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__LayoutFilesAssignment_1"


    // $ANTLR start "rule__Structure__NameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5322:1: rule__Structure__NameAssignment_0 : ( ( 'Structure' ) ) ;
    public final void rule__Structure__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5326:1: ( ( ( 'Structure' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5327:1: ( ( 'Structure' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5327:1: ( ( 'Structure' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5328:1: ( 'Structure' )
            {
             before(grammarAccess.getStructureAccess().getNameStructureKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5329:1: ( 'Structure' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5330:1: 'Structure'
            {
             before(grammarAccess.getStructureAccess().getNameStructureKeyword_0_0()); 
            match(input,31,FOLLOW_31_in_rule__Structure__NameAssignment_010696); 
             after(grammarAccess.getStructureAccess().getNameStructureKeyword_0_0()); 

            }

             after(grammarAccess.getStructureAccess().getNameStructureKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structure__NameAssignment_0"


    // $ANTLR start "rule__Structure__OrderedElementsAssignment_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5345:1: rule__Structure__OrderedElementsAssignment_2 : ( ruleElement ) ;
    public final void rule__Structure__OrderedElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5349:1: ( ( ruleElement ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5350:1: ( ruleElement )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5350:1: ( ruleElement )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5351:1: ruleElement
            {
             before(grammarAccess.getStructureAccess().getOrderedElementsElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleElement_in_rule__Structure__OrderedElementsAssignment_210735);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getStructureAccess().getOrderedElementsElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structure__OrderedElementsAssignment_2"


    // $ANTLR start "rule__Element__IdAssignment"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5360:1: rule__Element__IdAssignment : ( RULE_STRING ) ;
    public final void rule__Element__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5364:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5365:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5365:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5366:1: RULE_STRING
            {
             before(grammarAccess.getElementAccess().getIdSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Element__IdAssignment10766); 
             after(grammarAccess.getElementAccess().getIdSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__IdAssignment"


    // $ANTLR start "rule__Refinement__ConcreteRefinementAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5375:1: rule__Refinement__ConcreteRefinementAssignment_0 : ( ruleComponentRefinement ) ;
    public final void rule__Refinement__ConcreteRefinementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5379:1: ( ( ruleComponentRefinement ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5380:1: ( ruleComponentRefinement )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5380:1: ( ruleComponentRefinement )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5381:1: ruleComponentRefinement
            {
             before(grammarAccess.getRefinementAccess().getConcreteRefinementComponentRefinementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleComponentRefinement_in_rule__Refinement__ConcreteRefinementAssignment_010797);
            ruleComponentRefinement();

            state._fsp--;

             after(grammarAccess.getRefinementAccess().getConcreteRefinementComponentRefinementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refinement__ConcreteRefinementAssignment_0"


    // $ANTLR start "rule__ButtonRefinement__NameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5390:1: rule__ButtonRefinement__NameAssignment_0 : ( ( 'Button' ) ) ;
    public final void rule__ButtonRefinement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5394:1: ( ( ( 'Button' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5395:1: ( ( 'Button' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5395:1: ( ( 'Button' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5396:1: ( 'Button' )
            {
             before(grammarAccess.getButtonRefinementAccess().getNameButtonKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5397:1: ( 'Button' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5398:1: 'Button'
            {
             before(grammarAccess.getButtonRefinementAccess().getNameButtonKeyword_0_0()); 
            match(input,32,FOLLOW_32_in_rule__ButtonRefinement__NameAssignment_010833); 
             after(grammarAccess.getButtonRefinementAccess().getNameButtonKeyword_0_0()); 

            }

             after(grammarAccess.getButtonRefinementAccess().getNameButtonKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonRefinement__NameAssignment_0"


    // $ANTLR start "rule__ButtonRefinement__IdAssignment_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5413:1: rule__ButtonRefinement__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ButtonRefinement__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5417:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5418:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5418:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5419:1: RULE_STRING
            {
             before(grammarAccess.getButtonRefinementAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ButtonRefinement__IdAssignment_210872); 
             after(grammarAccess.getButtonRefinementAccess().getIdSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonRefinement__IdAssignment_2"


    // $ANTLR start "rule__ButtonRefinement__PropertiesAssignment_3_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5428:1: rule__ButtonRefinement__PropertiesAssignment_3_1 : ( ruleButtonProperties ) ;
    public final void rule__ButtonRefinement__PropertiesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5432:1: ( ( ruleButtonProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5433:1: ( ruleButtonProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5433:1: ( ruleButtonProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5434:1: ruleButtonProperties
            {
             before(grammarAccess.getButtonRefinementAccess().getPropertiesButtonPropertiesParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleButtonProperties_in_rule__ButtonRefinement__PropertiesAssignment_3_110903);
            ruleButtonProperties();

            state._fsp--;

             after(grammarAccess.getButtonRefinementAccess().getPropertiesButtonPropertiesParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonRefinement__PropertiesAssignment_3_1"


    // $ANTLR start "rule__LabelRefinement__NameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5443:1: rule__LabelRefinement__NameAssignment_0 : ( ( 'Label' ) ) ;
    public final void rule__LabelRefinement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5447:1: ( ( ( 'Label' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5448:1: ( ( 'Label' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5448:1: ( ( 'Label' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5449:1: ( 'Label' )
            {
             before(grammarAccess.getLabelRefinementAccess().getNameLabelKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5450:1: ( 'Label' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5451:1: 'Label'
            {
             before(grammarAccess.getLabelRefinementAccess().getNameLabelKeyword_0_0()); 
            match(input,33,FOLLOW_33_in_rule__LabelRefinement__NameAssignment_010939); 
             after(grammarAccess.getLabelRefinementAccess().getNameLabelKeyword_0_0()); 

            }

             after(grammarAccess.getLabelRefinementAccess().getNameLabelKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelRefinement__NameAssignment_0"


    // $ANTLR start "rule__LabelRefinement__IdAssignment_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5466:1: rule__LabelRefinement__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LabelRefinement__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5470:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5471:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5471:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5472:1: RULE_STRING
            {
             before(grammarAccess.getLabelRefinementAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LabelRefinement__IdAssignment_210978); 
             after(grammarAccess.getLabelRefinementAccess().getIdSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelRefinement__IdAssignment_2"


    // $ANTLR start "rule__LabelRefinement__PropertiesAssignment_3_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5481:1: rule__LabelRefinement__PropertiesAssignment_3_1 : ( ruleLabelProperties ) ;
    public final void rule__LabelRefinement__PropertiesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5485:1: ( ( ruleLabelProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5486:1: ( ruleLabelProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5486:1: ( ruleLabelProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5487:1: ruleLabelProperties
            {
             before(grammarAccess.getLabelRefinementAccess().getPropertiesLabelPropertiesParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleLabelProperties_in_rule__LabelRefinement__PropertiesAssignment_3_111009);
            ruleLabelProperties();

            state._fsp--;

             after(grammarAccess.getLabelRefinementAccess().getPropertiesLabelPropertiesParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelRefinement__PropertiesAssignment_3_1"


    // $ANTLR start "rule__Property__PropertiesFilesAssignment_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5496:1: rule__Property__PropertiesFilesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Property__PropertiesFilesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5500:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5501:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5501:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5502:1: RULE_STRING
            {
             before(grammarAccess.getPropertyAccess().getPropertiesFilesSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Property__PropertiesFilesAssignment_111040); 
             after(grammarAccess.getPropertyAccess().getPropertiesFilesSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__PropertiesFilesAssignment_1"


    // $ANTLR start "rule__UsedDescriptions__DescriptionAssignment_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5511:1: rule__UsedDescriptions__DescriptionAssignment_1 : ( ruleDescriptionType ) ;
    public final void rule__UsedDescriptions__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5515:1: ( ( ruleDescriptionType ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5516:1: ( ruleDescriptionType )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5516:1: ( ruleDescriptionType )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5517:1: ruleDescriptionType
            {
             before(grammarAccess.getUsedDescriptionsAccess().getDescriptionDescriptionTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDescriptionType_in_rule__UsedDescriptions__DescriptionAssignment_111071);
            ruleDescriptionType();

            state._fsp--;

             after(grammarAccess.getUsedDescriptionsAccess().getDescriptionDescriptionTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedDescriptions__DescriptionAssignment_1"


    // $ANTLR start "rule__UsedDescriptions__IdAssignment_2_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5526:1: rule__UsedDescriptions__IdAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__UsedDescriptions__IdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5530:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5531:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5531:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5532:1: RULE_STRING
            {
             before(grammarAccess.getUsedDescriptionsAccess().getIdSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UsedDescriptions__IdAssignment_2_111102); 
             after(grammarAccess.getUsedDescriptionsAccess().getIdSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedDescriptions__IdAssignment_2_1"


    // $ANTLR start "rule__Definition__ConcreteDefitionAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5541:1: rule__Definition__ConcreteDefitionAssignment_0 : ( ruleComponentDefinition ) ;
    public final void rule__Definition__ConcreteDefitionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5545:1: ( ( ruleComponentDefinition ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5546:1: ( ruleComponentDefinition )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5546:1: ( ruleComponentDefinition )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5547:1: ruleComponentDefinition
            {
             before(grammarAccess.getDefinitionAccess().getConcreteDefitionComponentDefinitionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleComponentDefinition_in_rule__Definition__ConcreteDefitionAssignment_011133);
            ruleComponentDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getConcreteDefitionComponentDefinitionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__ConcreteDefitionAssignment_0"


    // $ANTLR start "rule__TypeDefinition__TypeAssignment_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5556:1: rule__TypeDefinition__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__TypeDefinition__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5560:1: ( ( ruleType ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5561:1: ( ruleType )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5561:1: ( ruleType )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5562:1: ruleType
            {
             before(grammarAccess.getTypeDefinitionAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__TypeDefinition__TypeAssignment_111164);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeDefinitionAccess().getTypeTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDefinition__TypeAssignment_1"


    // $ANTLR start "rule__Type__IdAssignment"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5571:1: rule__Type__IdAssignment : ( ( rule__Type__IdAlternatives_0 ) ) ;
    public final void rule__Type__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5575:1: ( ( ( rule__Type__IdAlternatives_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5576:1: ( ( rule__Type__IdAlternatives_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5576:1: ( ( rule__Type__IdAlternatives_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5577:1: ( rule__Type__IdAlternatives_0 )
            {
             before(grammarAccess.getTypeAccess().getIdAlternatives_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5578:1: ( rule__Type__IdAlternatives_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5578:2: rule__Type__IdAlternatives_0
            {
            pushFollow(FOLLOW_rule__Type__IdAlternatives_0_in_rule__Type__IdAssignment11195);
            rule__Type__IdAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getIdAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__IdAssignment"


    // $ANTLR start "rule__UIDescriptionImport__DescriptionNameAssignment"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5587:1: rule__UIDescriptionImport__DescriptionNameAssignment : ( RULE_STRING ) ;
    public final void rule__UIDescriptionImport__DescriptionNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5591:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5592:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5592:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5593:1: RULE_STRING
            {
             before(grammarAccess.getUIDescriptionImportAccess().getDescriptionNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UIDescriptionImport__DescriptionNameAssignment11228); 
             after(grammarAccess.getUIDescriptionImportAccess().getDescriptionNameSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescriptionImport__DescriptionNameAssignment"


    // $ANTLR start "rule__TabViewDefinition__NameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5602:1: rule__TabViewDefinition__NameAssignment_0 : ( ( 'TabView' ) ) ;
    public final void rule__TabViewDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5606:1: ( ( ( 'TabView' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5607:1: ( ( 'TabView' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5607:1: ( ( 'TabView' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5608:1: ( 'TabView' )
            {
             before(grammarAccess.getTabViewDefinitionAccess().getNameTabViewKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5609:1: ( 'TabView' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5610:1: 'TabView'
            {
             before(grammarAccess.getTabViewDefinitionAccess().getNameTabViewKeyword_0_0()); 
            match(input,34,FOLLOW_34_in_rule__TabViewDefinition__NameAssignment_011264); 
             after(grammarAccess.getTabViewDefinitionAccess().getNameTabViewKeyword_0_0()); 

            }

             after(grammarAccess.getTabViewDefinitionAccess().getNameTabViewKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabViewDefinition__NameAssignment_0"


    // $ANTLR start "rule__TabViewDefinition__TabsAssignment_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5625:1: rule__TabViewDefinition__TabsAssignment_1 : ( ruleTabDefinition ) ;
    public final void rule__TabViewDefinition__TabsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5629:1: ( ( ruleTabDefinition ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5630:1: ( ruleTabDefinition )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5630:1: ( ruleTabDefinition )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5631:1: ruleTabDefinition
            {
             before(grammarAccess.getTabViewDefinitionAccess().getTabsTabDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTabDefinition_in_rule__TabViewDefinition__TabsAssignment_111303);
            ruleTabDefinition();

            state._fsp--;

             after(grammarAccess.getTabViewDefinitionAccess().getTabsTabDefinitionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabViewDefinition__TabsAssignment_1"


    // $ANTLR start "rule__TabViewDefinition__IdAssignment_3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5640:1: rule__TabViewDefinition__IdAssignment_3 : ( RULE_STRING ) ;
    public final void rule__TabViewDefinition__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5644:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5645:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5645:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5646:1: RULE_STRING
            {
             before(grammarAccess.getTabViewDefinitionAccess().getIdSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TabViewDefinition__IdAssignment_311334); 
             after(grammarAccess.getTabViewDefinitionAccess().getIdSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabViewDefinition__IdAssignment_3"


    // $ANTLR start "rule__TabViewDefinition__PropertiesAssignment_4_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5655:1: rule__TabViewDefinition__PropertiesAssignment_4_1 : ( ruleCommonProperties ) ;
    public final void rule__TabViewDefinition__PropertiesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5659:1: ( ( ruleCommonProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5660:1: ( ruleCommonProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5660:1: ( ruleCommonProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5661:1: ruleCommonProperties
            {
             before(grammarAccess.getTabViewDefinitionAccess().getPropertiesCommonPropertiesParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleCommonProperties_in_rule__TabViewDefinition__PropertiesAssignment_4_111365);
            ruleCommonProperties();

            state._fsp--;

             after(grammarAccess.getTabViewDefinitionAccess().getPropertiesCommonPropertiesParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabViewDefinition__PropertiesAssignment_4_1"


    // $ANTLR start "rule__TabDefinition__NameAssignment"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5670:1: rule__TabDefinition__NameAssignment : ( RULE_TABNAME ) ;
    public final void rule__TabDefinition__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5674:1: ( ( RULE_TABNAME ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5675:1: ( RULE_TABNAME )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5675:1: ( RULE_TABNAME )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5676:1: RULE_TABNAME
            {
             before(grammarAccess.getTabDefinitionAccess().getNameTABNAMETerminalRuleCall_0()); 
            match(input,RULE_TABNAME,FOLLOW_RULE_TABNAME_in_rule__TabDefinition__NameAssignment11396); 
             after(grammarAccess.getTabDefinitionAccess().getNameTABNAMETerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabDefinition__NameAssignment"


    // $ANTLR start "rule__Multiselection__NameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5685:1: rule__Multiselection__NameAssignment_0 : ( ( 'Multiselection' ) ) ;
    public final void rule__Multiselection__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5689:1: ( ( ( 'Multiselection' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5690:1: ( ( 'Multiselection' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5690:1: ( ( 'Multiselection' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5691:1: ( 'Multiselection' )
            {
             before(grammarAccess.getMultiselectionAccess().getNameMultiselectionKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5692:1: ( 'Multiselection' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5693:1: 'Multiselection'
            {
             before(grammarAccess.getMultiselectionAccess().getNameMultiselectionKeyword_0_0()); 
            match(input,35,FOLLOW_35_in_rule__Multiselection__NameAssignment_011432); 
             after(grammarAccess.getMultiselectionAccess().getNameMultiselectionKeyword_0_0()); 

            }

             after(grammarAccess.getMultiselectionAccess().getNameMultiselectionKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiselection__NameAssignment_0"


    // $ANTLR start "rule__Multiselection__InputTypeAssignment_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5708:1: rule__Multiselection__InputTypeAssignment_1 : ( RULE_INPUT_DESCRIPTION ) ;
    public final void rule__Multiselection__InputTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5712:1: ( ( RULE_INPUT_DESCRIPTION ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5713:1: ( RULE_INPUT_DESCRIPTION )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5713:1: ( RULE_INPUT_DESCRIPTION )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5714:1: RULE_INPUT_DESCRIPTION
            {
             before(grammarAccess.getMultiselectionAccess().getInputTypeINPUT_DESCRIPTIONTerminalRuleCall_1_0()); 
            match(input,RULE_INPUT_DESCRIPTION,FOLLOW_RULE_INPUT_DESCRIPTION_in_rule__Multiselection__InputTypeAssignment_111471); 
             after(grammarAccess.getMultiselectionAccess().getInputTypeINPUT_DESCRIPTIONTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiselection__InputTypeAssignment_1"


    // $ANTLR start "rule__TextfieldDefinition__NameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5723:1: rule__TextfieldDefinition__NameAssignment_0 : ( ( 'Textfield' ) ) ;
    public final void rule__TextfieldDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5727:1: ( ( ( 'Textfield' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5728:1: ( ( 'Textfield' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5728:1: ( ( 'Textfield' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5729:1: ( 'Textfield' )
            {
             before(grammarAccess.getTextfieldDefinitionAccess().getNameTextfieldKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5730:1: ( 'Textfield' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5731:1: 'Textfield'
            {
             before(grammarAccess.getTextfieldDefinitionAccess().getNameTextfieldKeyword_0_0()); 
            match(input,36,FOLLOW_36_in_rule__TextfieldDefinition__NameAssignment_011507); 
             after(grammarAccess.getTextfieldDefinitionAccess().getNameTextfieldKeyword_0_0()); 

            }

             after(grammarAccess.getTextfieldDefinitionAccess().getNameTextfieldKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldDefinition__NameAssignment_0"


    // $ANTLR start "rule__TextfieldDefinition__IdAssignment_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5746:1: rule__TextfieldDefinition__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TextfieldDefinition__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5750:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5751:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5751:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5752:1: RULE_STRING
            {
             before(grammarAccess.getTextfieldDefinitionAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TextfieldDefinition__IdAssignment_211546); 
             after(grammarAccess.getTextfieldDefinitionAccess().getIdSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldDefinition__IdAssignment_2"


    // $ANTLR start "rule__TextfieldDefinition__PropertiesAssignment_3_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5761:1: rule__TextfieldDefinition__PropertiesAssignment_3_1 : ( ruleTextfieldProperties ) ;
    public final void rule__TextfieldDefinition__PropertiesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5765:1: ( ( ruleTextfieldProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5766:1: ( ruleTextfieldProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5766:1: ( ruleTextfieldProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5767:1: ruleTextfieldProperties
            {
             before(grammarAccess.getTextfieldDefinitionAccess().getPropertiesTextfieldPropertiesParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleTextfieldProperties_in_rule__TextfieldDefinition__PropertiesAssignment_3_111577);
            ruleTextfieldProperties();

            state._fsp--;

             after(grammarAccess.getTextfieldDefinitionAccess().getPropertiesTextfieldPropertiesParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldDefinition__PropertiesAssignment_3_1"


    // $ANTLR start "rule__TextfieldProperties__CommonPropertiesAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5776:1: rule__TextfieldProperties__CommonPropertiesAssignment_0 : ( ruleCommonProperties ) ;
    public final void rule__TextfieldProperties__CommonPropertiesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5780:1: ( ( ruleCommonProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5781:1: ( ruleCommonProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5781:1: ( ruleCommonProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5782:1: ruleCommonProperties
            {
             before(grammarAccess.getTextfieldPropertiesAccess().getCommonPropertiesCommonPropertiesParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCommonProperties_in_rule__TextfieldProperties__CommonPropertiesAssignment_011608);
            ruleCommonProperties();

            state._fsp--;

             after(grammarAccess.getTextfieldPropertiesAccess().getCommonPropertiesCommonPropertiesParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldProperties__CommonPropertiesAssignment_0"


    // $ANTLR start "rule__TextfieldProperties__TextAssignment_1_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5791:1: rule__TextfieldProperties__TextAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__TextfieldProperties__TextAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5795:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5796:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5796:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5797:1: RULE_STRING
            {
             before(grammarAccess.getTextfieldPropertiesAccess().getTextSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TextfieldProperties__TextAssignment_1_111639); 
             after(grammarAccess.getTextfieldPropertiesAccess().getTextSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldProperties__TextAssignment_1_1"


    // $ANTLR start "rule__TextfieldProperties__EditableAssignment_2_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5806:1: rule__TextfieldProperties__EditableAssignment_2_1 : ( RULE_BOOLEAN ) ;
    public final void rule__TextfieldProperties__EditableAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5810:1: ( ( RULE_BOOLEAN ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5811:1: ( RULE_BOOLEAN )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5811:1: ( RULE_BOOLEAN )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5812:1: RULE_BOOLEAN
            {
             before(grammarAccess.getTextfieldPropertiesAccess().getEditableBOOLEANTerminalRuleCall_2_1_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__TextfieldProperties__EditableAssignment_2_111670); 
             after(grammarAccess.getTextfieldPropertiesAccess().getEditableBOOLEANTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldProperties__EditableAssignment_2_1"


    // $ANTLR start "rule__TextareaDefinition__NameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5821:1: rule__TextareaDefinition__NameAssignment_0 : ( ( 'Textarea' ) ) ;
    public final void rule__TextareaDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5825:1: ( ( ( 'Textarea' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5826:1: ( ( 'Textarea' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5826:1: ( ( 'Textarea' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5827:1: ( 'Textarea' )
            {
             before(grammarAccess.getTextareaDefinitionAccess().getNameTextareaKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5828:1: ( 'Textarea' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5829:1: 'Textarea'
            {
             before(grammarAccess.getTextareaDefinitionAccess().getNameTextareaKeyword_0_0()); 
            match(input,37,FOLLOW_37_in_rule__TextareaDefinition__NameAssignment_011706); 
             after(grammarAccess.getTextareaDefinitionAccess().getNameTextareaKeyword_0_0()); 

            }

             after(grammarAccess.getTextareaDefinitionAccess().getNameTextareaKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaDefinition__NameAssignment_0"


    // $ANTLR start "rule__TextareaDefinition__IdAssignment_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5844:1: rule__TextareaDefinition__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TextareaDefinition__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5848:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5849:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5849:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5850:1: RULE_STRING
            {
             before(grammarAccess.getTextareaDefinitionAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TextareaDefinition__IdAssignment_211745); 
             after(grammarAccess.getTextareaDefinitionAccess().getIdSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaDefinition__IdAssignment_2"


    // $ANTLR start "rule__TextareaDefinition__PropertiesAssignment_3_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5859:1: rule__TextareaDefinition__PropertiesAssignment_3_1 : ( ruleTextareaProperties ) ;
    public final void rule__TextareaDefinition__PropertiesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5863:1: ( ( ruleTextareaProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5864:1: ( ruleTextareaProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5864:1: ( ruleTextareaProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5865:1: ruleTextareaProperties
            {
             before(grammarAccess.getTextareaDefinitionAccess().getPropertiesTextareaPropertiesParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleTextareaProperties_in_rule__TextareaDefinition__PropertiesAssignment_3_111776);
            ruleTextareaProperties();

            state._fsp--;

             after(grammarAccess.getTextareaDefinitionAccess().getPropertiesTextareaPropertiesParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaDefinition__PropertiesAssignment_3_1"


    // $ANTLR start "rule__TextareaProperties__CommonPropertiesAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5874:1: rule__TextareaProperties__CommonPropertiesAssignment_0 : ( ruleCommonProperties ) ;
    public final void rule__TextareaProperties__CommonPropertiesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5878:1: ( ( ruleCommonProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5879:1: ( ruleCommonProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5879:1: ( ruleCommonProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5880:1: ruleCommonProperties
            {
             before(grammarAccess.getTextareaPropertiesAccess().getCommonPropertiesCommonPropertiesParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCommonProperties_in_rule__TextareaProperties__CommonPropertiesAssignment_011807);
            ruleCommonProperties();

            state._fsp--;

             after(grammarAccess.getTextareaPropertiesAccess().getCommonPropertiesCommonPropertiesParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaProperties__CommonPropertiesAssignment_0"


    // $ANTLR start "rule__TextareaProperties__TextAssignment_1_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5889:1: rule__TextareaProperties__TextAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__TextareaProperties__TextAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5893:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5894:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5894:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5895:1: RULE_STRING
            {
             before(grammarAccess.getTextareaPropertiesAccess().getTextSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TextareaProperties__TextAssignment_1_111838); 
             after(grammarAccess.getTextareaPropertiesAccess().getTextSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaProperties__TextAssignment_1_1"


    // $ANTLR start "rule__TextareaProperties__EditableAssignment_2_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5904:1: rule__TextareaProperties__EditableAssignment_2_1 : ( RULE_BOOLEAN ) ;
    public final void rule__TextareaProperties__EditableAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5908:1: ( ( RULE_BOOLEAN ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5909:1: ( RULE_BOOLEAN )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5909:1: ( RULE_BOOLEAN )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5910:1: RULE_BOOLEAN
            {
             before(grammarAccess.getTextareaPropertiesAccess().getEditableBOOLEANTerminalRuleCall_2_1_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__TextareaProperties__EditableAssignment_2_111869); 
             after(grammarAccess.getTextareaPropertiesAccess().getEditableBOOLEANTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaProperties__EditableAssignment_2_1"


    // $ANTLR start "rule__TreeDefinition__NameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5919:1: rule__TreeDefinition__NameAssignment_0 : ( ( 'Tree' ) ) ;
    public final void rule__TreeDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5923:1: ( ( ( 'Tree' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5924:1: ( ( 'Tree' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5924:1: ( ( 'Tree' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5925:1: ( 'Tree' )
            {
             before(grammarAccess.getTreeDefinitionAccess().getNameTreeKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5926:1: ( 'Tree' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5927:1: 'Tree'
            {
             before(grammarAccess.getTreeDefinitionAccess().getNameTreeKeyword_0_0()); 
            match(input,38,FOLLOW_38_in_rule__TreeDefinition__NameAssignment_011905); 
             after(grammarAccess.getTreeDefinitionAccess().getNameTreeKeyword_0_0()); 

            }

             after(grammarAccess.getTreeDefinitionAccess().getNameTreeKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeDefinition__NameAssignment_0"


    // $ANTLR start "rule__TreeDefinition__InputTypeAssignment_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5942:1: rule__TreeDefinition__InputTypeAssignment_1 : ( RULE_INPUT_DESCRIPTION ) ;
    public final void rule__TreeDefinition__InputTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5946:1: ( ( RULE_INPUT_DESCRIPTION ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5947:1: ( RULE_INPUT_DESCRIPTION )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5947:1: ( RULE_INPUT_DESCRIPTION )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5948:1: RULE_INPUT_DESCRIPTION
            {
             before(grammarAccess.getTreeDefinitionAccess().getInputTypeINPUT_DESCRIPTIONTerminalRuleCall_1_0()); 
            match(input,RULE_INPUT_DESCRIPTION,FOLLOW_RULE_INPUT_DESCRIPTION_in_rule__TreeDefinition__InputTypeAssignment_111944); 
             after(grammarAccess.getTreeDefinitionAccess().getInputTypeINPUT_DESCRIPTIONTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeDefinition__InputTypeAssignment_1"


    // $ANTLR start "rule__TreeDefinition__IdAssignment_3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5957:1: rule__TreeDefinition__IdAssignment_3 : ( RULE_STRING ) ;
    public final void rule__TreeDefinition__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5961:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5962:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5962:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5963:1: RULE_STRING
            {
             before(grammarAccess.getTreeDefinitionAccess().getIdSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TreeDefinition__IdAssignment_311975); 
             after(grammarAccess.getTreeDefinitionAccess().getIdSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeDefinition__IdAssignment_3"


    // $ANTLR start "rule__TreeDefinition__PropertiesAssignment_4_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5972:1: rule__TreeDefinition__PropertiesAssignment_4_1 : ( ruleCommonProperties ) ;
    public final void rule__TreeDefinition__PropertiesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5976:1: ( ( ruleCommonProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5977:1: ( ruleCommonProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5977:1: ( ruleCommonProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5978:1: ruleCommonProperties
            {
             before(grammarAccess.getTreeDefinitionAccess().getPropertiesCommonPropertiesParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleCommonProperties_in_rule__TreeDefinition__PropertiesAssignment_4_112006);
            ruleCommonProperties();

            state._fsp--;

             after(grammarAccess.getTreeDefinitionAccess().getPropertiesCommonPropertiesParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeDefinition__PropertiesAssignment_4_1"


    // $ANTLR start "rule__TableDefinition__NameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5987:1: rule__TableDefinition__NameAssignment_0 : ( ( 'Table' ) ) ;
    public final void rule__TableDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5991:1: ( ( ( 'Table' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5992:1: ( ( 'Table' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5992:1: ( ( 'Table' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5993:1: ( 'Table' )
            {
             before(grammarAccess.getTableDefinitionAccess().getNameTableKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5994:1: ( 'Table' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5995:1: 'Table'
            {
             before(grammarAccess.getTableDefinitionAccess().getNameTableKeyword_0_0()); 
            match(input,39,FOLLOW_39_in_rule__TableDefinition__NameAssignment_012042); 
             after(grammarAccess.getTableDefinitionAccess().getNameTableKeyword_0_0()); 

            }

             after(grammarAccess.getTableDefinitionAccess().getNameTableKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDefinition__NameAssignment_0"


    // $ANTLR start "rule__TableDefinition__InputTypeAssignment_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6010:1: rule__TableDefinition__InputTypeAssignment_1 : ( RULE_INPUT_DESCRIPTION ) ;
    public final void rule__TableDefinition__InputTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6014:1: ( ( RULE_INPUT_DESCRIPTION ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6015:1: ( RULE_INPUT_DESCRIPTION )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6015:1: ( RULE_INPUT_DESCRIPTION )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6016:1: RULE_INPUT_DESCRIPTION
            {
             before(grammarAccess.getTableDefinitionAccess().getInputTypeINPUT_DESCRIPTIONTerminalRuleCall_1_0()); 
            match(input,RULE_INPUT_DESCRIPTION,FOLLOW_RULE_INPUT_DESCRIPTION_in_rule__TableDefinition__InputTypeAssignment_112081); 
             after(grammarAccess.getTableDefinitionAccess().getInputTypeINPUT_DESCRIPTIONTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDefinition__InputTypeAssignment_1"


    // $ANTLR start "rule__TableDefinition__IdAssignment_3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6025:1: rule__TableDefinition__IdAssignment_3 : ( RULE_STRING ) ;
    public final void rule__TableDefinition__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6029:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6030:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6030:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6031:1: RULE_STRING
            {
             before(grammarAccess.getTableDefinitionAccess().getIdSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TableDefinition__IdAssignment_312112); 
             after(grammarAccess.getTableDefinitionAccess().getIdSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDefinition__IdAssignment_3"


    // $ANTLR start "rule__TableDefinition__PropertiesAssignment_4_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6040:1: rule__TableDefinition__PropertiesAssignment_4_1 : ( ruleCommonProperties ) ;
    public final void rule__TableDefinition__PropertiesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6044:1: ( ( ruleCommonProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6045:1: ( ruleCommonProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6045:1: ( ruleCommonProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6046:1: ruleCommonProperties
            {
             before(grammarAccess.getTableDefinitionAccess().getPropertiesCommonPropertiesParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleCommonProperties_in_rule__TableDefinition__PropertiesAssignment_4_112143);
            ruleCommonProperties();

            state._fsp--;

             after(grammarAccess.getTableDefinitionAccess().getPropertiesCommonPropertiesParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDefinition__PropertiesAssignment_4_1"


    // $ANTLR start "rule__InterchangeableDefinition__NameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6055:1: rule__InterchangeableDefinition__NameAssignment_0 : ( ( 'Interchangeable Area' ) ) ;
    public final void rule__InterchangeableDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6059:1: ( ( ( 'Interchangeable Area' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6060:1: ( ( 'Interchangeable Area' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6060:1: ( ( 'Interchangeable Area' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6061:1: ( 'Interchangeable Area' )
            {
             before(grammarAccess.getInterchangeableDefinitionAccess().getNameInterchangeableAreaKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6062:1: ( 'Interchangeable Area' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6063:1: 'Interchangeable Area'
            {
             before(grammarAccess.getInterchangeableDefinitionAccess().getNameInterchangeableAreaKeyword_0_0()); 
            match(input,40,FOLLOW_40_in_rule__InterchangeableDefinition__NameAssignment_012179); 
             after(grammarAccess.getInterchangeableDefinitionAccess().getNameInterchangeableAreaKeyword_0_0()); 

            }

             after(grammarAccess.getInterchangeableDefinitionAccess().getNameInterchangeableAreaKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterchangeableDefinition__NameAssignment_0"


    // $ANTLR start "rule__InterchangeableDefinition__IdAssignment_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6078:1: rule__InterchangeableDefinition__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__InterchangeableDefinition__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6082:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6083:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6083:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6084:1: RULE_STRING
            {
             before(grammarAccess.getInterchangeableDefinitionAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__InterchangeableDefinition__IdAssignment_212218); 
             after(grammarAccess.getInterchangeableDefinitionAccess().getIdSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterchangeableDefinition__IdAssignment_2"


    // $ANTLR start "rule__InterchangeableDefinition__PropertiesAssignment_3_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6093:1: rule__InterchangeableDefinition__PropertiesAssignment_3_1 : ( ruleCommonProperties ) ;
    public final void rule__InterchangeableDefinition__PropertiesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6097:1: ( ( ruleCommonProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6098:1: ( ruleCommonProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6098:1: ( ruleCommonProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6099:1: ruleCommonProperties
            {
             before(grammarAccess.getInterchangeableDefinitionAccess().getPropertiesCommonPropertiesParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleCommonProperties_in_rule__InterchangeableDefinition__PropertiesAssignment_3_112249);
            ruleCommonProperties();

            state._fsp--;

             after(grammarAccess.getInterchangeableDefinitionAccess().getPropertiesCommonPropertiesParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterchangeableDefinition__PropertiesAssignment_3_1"


    // $ANTLR start "rule__ButtonDefinition__NameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6108:1: rule__ButtonDefinition__NameAssignment_0 : ( ( 'Button' ) ) ;
    public final void rule__ButtonDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6112:1: ( ( ( 'Button' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6113:1: ( ( 'Button' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6113:1: ( ( 'Button' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6114:1: ( 'Button' )
            {
             before(grammarAccess.getButtonDefinitionAccess().getNameButtonKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6115:1: ( 'Button' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6116:1: 'Button'
            {
             before(grammarAccess.getButtonDefinitionAccess().getNameButtonKeyword_0_0()); 
            match(input,32,FOLLOW_32_in_rule__ButtonDefinition__NameAssignment_012285); 
             after(grammarAccess.getButtonDefinitionAccess().getNameButtonKeyword_0_0()); 

            }

             after(grammarAccess.getButtonDefinitionAccess().getNameButtonKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonDefinition__NameAssignment_0"


    // $ANTLR start "rule__ButtonDefinition__IdAssignment_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6131:1: rule__ButtonDefinition__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ButtonDefinition__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6135:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6136:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6136:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6137:1: RULE_STRING
            {
             before(grammarAccess.getButtonDefinitionAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ButtonDefinition__IdAssignment_212324); 
             after(grammarAccess.getButtonDefinitionAccess().getIdSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonDefinition__IdAssignment_2"


    // $ANTLR start "rule__ButtonDefinition__PropertiesAssignment_3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6146:1: rule__ButtonDefinition__PropertiesAssignment_3 : ( ruleButtonProperties ) ;
    public final void rule__ButtonDefinition__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6150:1: ( ( ruleButtonProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6151:1: ( ruleButtonProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6151:1: ( ruleButtonProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6152:1: ruleButtonProperties
            {
             before(grammarAccess.getButtonDefinitionAccess().getPropertiesButtonPropertiesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleButtonProperties_in_rule__ButtonDefinition__PropertiesAssignment_312355);
            ruleButtonProperties();

            state._fsp--;

             after(grammarAccess.getButtonDefinitionAccess().getPropertiesButtonPropertiesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonDefinition__PropertiesAssignment_3"


    // $ANTLR start "rule__ButtonProperties__CommonPropertiesAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6161:1: rule__ButtonProperties__CommonPropertiesAssignment_0 : ( ruleCommonProperties ) ;
    public final void rule__ButtonProperties__CommonPropertiesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6165:1: ( ( ruleCommonProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6166:1: ( ruleCommonProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6166:1: ( ruleCommonProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6167:1: ruleCommonProperties
            {
             before(grammarAccess.getButtonPropertiesAccess().getCommonPropertiesCommonPropertiesParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCommonProperties_in_rule__ButtonProperties__CommonPropertiesAssignment_012386);
            ruleCommonProperties();

            state._fsp--;

             after(grammarAccess.getButtonPropertiesAccess().getCommonPropertiesCommonPropertiesParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonProperties__CommonPropertiesAssignment_0"


    // $ANTLR start "rule__ButtonProperties__TextAssignment_1_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6176:1: rule__ButtonProperties__TextAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__ButtonProperties__TextAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6180:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6181:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6181:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6182:1: RULE_STRING
            {
             before(grammarAccess.getButtonPropertiesAccess().getTextSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ButtonProperties__TextAssignment_1_112417); 
             after(grammarAccess.getButtonPropertiesAccess().getTextSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonProperties__TextAssignment_1_1"


    // $ANTLR start "rule__CommonProperties__NameAssignment_1_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6191:1: rule__CommonProperties__NameAssignment_1_0 : ( ( 'propertyKey' ) ) ;
    public final void rule__CommonProperties__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6195:1: ( ( ( 'propertyKey' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6196:1: ( ( 'propertyKey' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6196:1: ( ( 'propertyKey' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6197:1: ( 'propertyKey' )
            {
             before(grammarAccess.getCommonPropertiesAccess().getNamePropertyKeyKeyword_1_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6198:1: ( 'propertyKey' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6199:1: 'propertyKey'
            {
             before(grammarAccess.getCommonPropertiesAccess().getNamePropertyKeyKeyword_1_0_0()); 
            match(input,41,FOLLOW_41_in_rule__CommonProperties__NameAssignment_1_012453); 
             after(grammarAccess.getCommonPropertiesAccess().getNamePropertyKeyKeyword_1_0_0()); 

            }

             after(grammarAccess.getCommonPropertiesAccess().getNamePropertyKeyKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonProperties__NameAssignment_1_0"


    // $ANTLR start "rule__CommonProperties__PropertyKeyAssignment_1_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6214:1: rule__CommonProperties__PropertyKeyAssignment_1_2 : ( RULE_STRING ) ;
    public final void rule__CommonProperties__PropertyKeyAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6218:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6219:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6219:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6220:1: RULE_STRING
            {
             before(grammarAccess.getCommonPropertiesAccess().getPropertyKeySTRINGTerminalRuleCall_1_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CommonProperties__PropertyKeyAssignment_1_212492); 
             after(grammarAccess.getCommonPropertiesAccess().getPropertyKeySTRINGTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonProperties__PropertyKeyAssignment_1_2"


    // $ANTLR start "rule__CommonProperties__NameAssignment_2_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6229:1: rule__CommonProperties__NameAssignment_2_0 : ( ( 'layoutKey' ) ) ;
    public final void rule__CommonProperties__NameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6233:1: ( ( ( 'layoutKey' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6234:1: ( ( 'layoutKey' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6234:1: ( ( 'layoutKey' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6235:1: ( 'layoutKey' )
            {
             before(grammarAccess.getCommonPropertiesAccess().getNameLayoutKeyKeyword_2_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6236:1: ( 'layoutKey' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6237:1: 'layoutKey'
            {
             before(grammarAccess.getCommonPropertiesAccess().getNameLayoutKeyKeyword_2_0_0()); 
            match(input,42,FOLLOW_42_in_rule__CommonProperties__NameAssignment_2_012528); 
             after(grammarAccess.getCommonPropertiesAccess().getNameLayoutKeyKeyword_2_0_0()); 

            }

             after(grammarAccess.getCommonPropertiesAccess().getNameLayoutKeyKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonProperties__NameAssignment_2_0"


    // $ANTLR start "rule__CommonProperties__LayoutKeyAssignment_2_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6252:1: rule__CommonProperties__LayoutKeyAssignment_2_2 : ( RULE_STRING ) ;
    public final void rule__CommonProperties__LayoutKeyAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6256:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6257:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6257:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6258:1: RULE_STRING
            {
             before(grammarAccess.getCommonPropertiesAccess().getLayoutKeySTRINGTerminalRuleCall_2_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CommonProperties__LayoutKeyAssignment_2_212567); 
             after(grammarAccess.getCommonPropertiesAccess().getLayoutKeySTRINGTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonProperties__LayoutKeyAssignment_2_2"


    // $ANTLR start "rule__CommonProperties__NameAssignment_3_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6267:1: rule__CommonProperties__NameAssignment_3_0 : ( ( 'interactiontype' ) ) ;
    public final void rule__CommonProperties__NameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6271:1: ( ( ( 'interactiontype' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6272:1: ( ( 'interactiontype' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6272:1: ( ( 'interactiontype' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6273:1: ( 'interactiontype' )
            {
             before(grammarAccess.getCommonPropertiesAccess().getNameInteractiontypeKeyword_3_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6274:1: ( 'interactiontype' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6275:1: 'interactiontype'
            {
             before(grammarAccess.getCommonPropertiesAccess().getNameInteractiontypeKeyword_3_0_0()); 
            match(input,43,FOLLOW_43_in_rule__CommonProperties__NameAssignment_3_012603); 
             after(grammarAccess.getCommonPropertiesAccess().getNameInteractiontypeKeyword_3_0_0()); 

            }

             after(grammarAccess.getCommonPropertiesAccess().getNameInteractiontypeKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonProperties__NameAssignment_3_0"


    // $ANTLR start "rule__CommonProperties__InteractiontypeAssignment_3_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6290:1: rule__CommonProperties__InteractiontypeAssignment_3_2 : ( ruleInteractiontype ) ;
    public final void rule__CommonProperties__InteractiontypeAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6294:1: ( ( ruleInteractiontype ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6295:1: ( ruleInteractiontype )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6295:1: ( ruleInteractiontype )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6296:1: ruleInteractiontype
            {
             before(grammarAccess.getCommonPropertiesAccess().getInteractiontypeInteractiontypeParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleInteractiontype_in_rule__CommonProperties__InteractiontypeAssignment_3_212642);
            ruleInteractiontype();

            state._fsp--;

             after(grammarAccess.getCommonPropertiesAccess().getInteractiontypeInteractiontypeParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonProperties__InteractiontypeAssignment_3_2"


    // $ANTLR start "rule__LabelDefinition__NameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6305:1: rule__LabelDefinition__NameAssignment_0 : ( ( 'Label' ) ) ;
    public final void rule__LabelDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6309:1: ( ( ( 'Label' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6310:1: ( ( 'Label' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6310:1: ( ( 'Label' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6311:1: ( 'Label' )
            {
             before(grammarAccess.getLabelDefinitionAccess().getNameLabelKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6312:1: ( 'Label' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6313:1: 'Label'
            {
             before(grammarAccess.getLabelDefinitionAccess().getNameLabelKeyword_0_0()); 
            match(input,33,FOLLOW_33_in_rule__LabelDefinition__NameAssignment_012678); 
             after(grammarAccess.getLabelDefinitionAccess().getNameLabelKeyword_0_0()); 

            }

             after(grammarAccess.getLabelDefinitionAccess().getNameLabelKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelDefinition__NameAssignment_0"


    // $ANTLR start "rule__LabelDefinition__IdAssignment_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6328:1: rule__LabelDefinition__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LabelDefinition__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6332:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6333:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6333:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6334:1: RULE_STRING
            {
             before(grammarAccess.getLabelDefinitionAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LabelDefinition__IdAssignment_212717); 
             after(grammarAccess.getLabelDefinitionAccess().getIdSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelDefinition__IdAssignment_2"


    // $ANTLR start "rule__LabelDefinition__PropertiesAssignment_3_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6343:1: rule__LabelDefinition__PropertiesAssignment_3_1 : ( ruleLabelProperties ) ;
    public final void rule__LabelDefinition__PropertiesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6347:1: ( ( ruleLabelProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6348:1: ( ruleLabelProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6348:1: ( ruleLabelProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6349:1: ruleLabelProperties
            {
             before(grammarAccess.getLabelDefinitionAccess().getPropertiesLabelPropertiesParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleLabelProperties_in_rule__LabelDefinition__PropertiesAssignment_3_112748);
            ruleLabelProperties();

            state._fsp--;

             after(grammarAccess.getLabelDefinitionAccess().getPropertiesLabelPropertiesParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelDefinition__PropertiesAssignment_3_1"


    // $ANTLR start "rule__LabelProperties__CommonPropertiesAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6358:1: rule__LabelProperties__CommonPropertiesAssignment_0 : ( ruleCommonProperties ) ;
    public final void rule__LabelProperties__CommonPropertiesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6362:1: ( ( ruleCommonProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6363:1: ( ruleCommonProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6363:1: ( ruleCommonProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6364:1: ruleCommonProperties
            {
             before(grammarAccess.getLabelPropertiesAccess().getCommonPropertiesCommonPropertiesParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCommonProperties_in_rule__LabelProperties__CommonPropertiesAssignment_012779);
            ruleCommonProperties();

            state._fsp--;

             after(grammarAccess.getLabelPropertiesAccess().getCommonPropertiesCommonPropertiesParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelProperties__CommonPropertiesAssignment_0"


    // $ANTLR start "rule__LabelProperties__TextAssignment_1_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6373:1: rule__LabelProperties__TextAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__LabelProperties__TextAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6377:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6378:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6378:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6379:1: RULE_STRING
            {
             before(grammarAccess.getLabelPropertiesAccess().getTextSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LabelProperties__TextAssignment_1_112810); 
             after(grammarAccess.getLabelPropertiesAccess().getTextSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelProperties__TextAssignment_1_1"


    // $ANTLR start "rule__LabelProperties__NameAssignment_1_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6388:1: rule__LabelProperties__NameAssignment_1_2 : ( ( 'LabelProperty' ) ) ;
    public final void rule__LabelProperties__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6392:1: ( ( ( 'LabelProperty' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6393:1: ( ( 'LabelProperty' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6393:1: ( ( 'LabelProperty' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6394:1: ( 'LabelProperty' )
            {
             before(grammarAccess.getLabelPropertiesAccess().getNameLabelPropertyKeyword_1_2_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6395:1: ( 'LabelProperty' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6396:1: 'LabelProperty'
            {
             before(grammarAccess.getLabelPropertiesAccess().getNameLabelPropertyKeyword_1_2_0()); 
            match(input,44,FOLLOW_44_in_rule__LabelProperties__NameAssignment_1_212846); 
             after(grammarAccess.getLabelPropertiesAccess().getNameLabelPropertyKeyword_1_2_0()); 

            }

             after(grammarAccess.getLabelPropertiesAccess().getNameLabelPropertyKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelProperties__NameAssignment_1_2"


    // $ANTLR start "rule__Interactiontype__IdAssignment"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6411:1: rule__Interactiontype__IdAssignment : ( ( rule__Interactiontype__IdAlternatives_0 ) ) ;
    public final void rule__Interactiontype__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6415:1: ( ( ( rule__Interactiontype__IdAlternatives_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6416:1: ( ( rule__Interactiontype__IdAlternatives_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6416:1: ( ( rule__Interactiontype__IdAlternatives_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6417:1: ( rule__Interactiontype__IdAlternatives_0 )
            {
             before(grammarAccess.getInteractiontypeAccess().getIdAlternatives_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6418:1: ( rule__Interactiontype__IdAlternatives_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6418:2: rule__Interactiontype__IdAlternatives_0
            {
            pushFollow(FOLLOW_rule__Interactiontype__IdAlternatives_0_in_rule__Interactiontype__IdAssignment12885);
            rule__Interactiontype__IdAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getInteractiontypeAccess().getIdAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interactiontype__IdAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleUIDescription_in_entryRuleUIDescription61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIDescription68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__0_in_ruleUIDescription94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayout_in_entryRuleLayout121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayout128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layout__Group__0_in_ruleLayout154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructure_in_entryRuleStructure181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructure188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__Group__0_in_ruleStructure214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__IdAssignment_in_ruleElement274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefinement_in_entryRuleRefinement301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefinement308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refinement__Group__0_in_ruleRefinement334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentRefinement_in_entryRuleComponentRefinement361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentRefinement368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentRefinement__Alternatives_in_ruleComponentRefinement394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonRefinement_in_entryRuleButtonRefinement421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonRefinement428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__0_in_ruleButtonRefinement454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelRefinement_in_entryRuleLabelRefinement481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelRefinement488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__0_in_ruleLabelRefinement514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsedDescriptions_in_entryRuleUsedDescriptions601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsedDescriptions608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group__0_in_ruleUsedDescriptions634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescriptionType_in_entryRuleDescriptionType661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescriptionType668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DescriptionType__Alternatives_in_ruleDescriptionType694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0_in_ruleDefinition754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__0_in_ruleTypeDefinition814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__IdAssignment_in_ruleType874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIDescriptionImport_in_entryRuleUIDescriptionImport901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIDescriptionImport908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescriptionImport__DescriptionNameAssignment_in_ruleUIDescriptionImport934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexComponent_in_entryRuleComplexComponent961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexComponent968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiselection_in_ruleComplexComponent994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabViewDefinition_in_entryRuleTabViewDefinition1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabViewDefinition1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabViewDefinition__Group__0_in_ruleTabViewDefinition1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabDefinition_in_entryRuleTabDefinition1080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabDefinition1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabDefinition__NameAssignment_in_ruleTabDefinition1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiselection_in_entryRuleMultiselection1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiselection1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiselection__Group__0_in_ruleMultiselection1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDefinition_in_entryRuleComponentDefinition1200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentDefinition1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentDefinition__Alternatives_in_ruleComponentDefinition1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfieldDefinition_in_entryRuleTextfieldDefinition1260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextfieldDefinition1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__0_in_ruleTextfieldDefinition1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfieldProperties_in_entryRuleTextfieldProperties1320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextfieldProperties1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldProperties__Group__0_in_ruleTextfieldProperties1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextareaDefinition_in_entryRuleTextareaDefinition1380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextareaDefinition1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaDefinition__Group__0_in_ruleTextareaDefinition1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextareaProperties_in_entryRuleTextareaProperties1440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextareaProperties1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaProperties__Group__0_in_ruleTextareaProperties1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreeDefinition_in_entryRuleTreeDefinition1500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTreeDefinition1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__0_in_ruleTreeDefinition1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableDefinition_in_entryRuleTableDefinition1560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableDefinition1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__0_in_ruleTableDefinition1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterchangeableDefinition_in_entryRuleInterchangeableDefinition1620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterchangeableDefinition1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterchangeableDefinition__Group__0_in_ruleInterchangeableDefinition1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonDefinition_in_entryRuleButtonDefinition1680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonDefinition1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__0_in_ruleButtonDefinition1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonProperties_in_entryRuleButtonProperties1740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonProperties1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonProperties__Group__0_in_ruleButtonProperties1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_entryRuleCommonProperties1800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonProperties1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group__0_in_ruleCommonProperties1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelDefinition_in_entryRuleLabelDefinition1860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelDefinition1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__0_in_ruleLabelDefinition1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelProperties_in_entryRuleLabelProperties1920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelProperties1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelProperties__Group__0_in_ruleLabelProperties1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractiontype_in_entryRuleInteractiontype1980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractiontype1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interactiontype__IdAssignment_in_ruleInteractiontype2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelRefinement_in_rule__ComponentRefinement__Alternatives2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonRefinement_in_rule__ComponentRefinement__Alternatives2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIDescriptionImport_in_rule__DescriptionType__Alternatives2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexComponent_in_rule__DescriptionType__Alternatives2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Type__IdAlternatives_02148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Type__IdAlternatives_02168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelDefinition_in_rule__ComponentDefinition__Alternatives2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonDefinition_in_rule__ComponentDefinition__Alternatives2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfieldDefinition_in_rule__ComponentDefinition__Alternatives2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextareaDefinition_in_rule__ComponentDefinition__Alternatives2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreeDefinition_in_rule__ComponentDefinition__Alternatives2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableDefinition_in_rule__ComponentDefinition__Alternatives2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabViewDefinition_in_rule__ComponentDefinition__Alternatives2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterchangeableDefinition_in_rule__ComponentDefinition__Alternatives2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Interactiontype__IdAlternatives_02354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Interactiontype__IdAlternatives_02374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__0__Impl_in_rule__UIDescription__Group__02406 = new BitSet(new long[]{0x000001F781840000L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__1_in_rule__UIDescription__Group__02409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__TypeDefinitionAssignment_0_in_rule__UIDescription__Group__0__Impl2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__1__Impl_in_rule__UIDescription__Group__12466 = new BitSet(new long[]{0x000001F781840000L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__2_in_rule__UIDescription__Group__12469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__PropertyAssignment_1_in_rule__UIDescription__Group__1__Impl2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__2__Impl_in_rule__UIDescription__Group__22527 = new BitSet(new long[]{0x000001F781840000L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__3_in_rule__UIDescription__Group__22530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__LayoutAssignment_2_in_rule__UIDescription__Group__2__Impl2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__3__Impl_in_rule__UIDescription__Group__32588 = new BitSet(new long[]{0x000001F781840000L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__4_in_rule__UIDescription__Group__32591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__UsedDescriptionsAssignment_3_in_rule__UIDescription__Group__3__Impl2618 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__4__Impl_in_rule__UIDescription__Group__42649 = new BitSet(new long[]{0x000001F781840000L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__5_in_rule__UIDescription__Group__42652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__RefinementsAssignment_4_in_rule__UIDescription__Group__4__Impl2679 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__5__Impl_in_rule__UIDescription__Group__52710 = new BitSet(new long[]{0x000001F781840000L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__6_in_rule__UIDescription__Group__52713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__DefinitionsAssignment_5_in_rule__UIDescription__Group__5__Impl2740 = new BitSet(new long[]{0x000001F700000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__6__Impl_in_rule__UIDescription__Group__62771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__StructureAssignment_6_in_rule__UIDescription__Group__6__Impl2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layout__Group__0__Impl_in_rule__Layout__Group__02842 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Layout__Group__1_in_rule__Layout__Group__02845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Layout__Group__0__Impl2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layout__Group__1__Impl_in_rule__Layout__Group__12904 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Layout__Group__2_in_rule__Layout__Group__12907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layout__LayoutFilesAssignment_1_in_rule__Layout__Group__1__Impl2936 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Layout__LayoutFilesAssignment_1_in_rule__Layout__Group__1__Impl2948 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Layout__Group__2__Impl_in_rule__Layout__Group__22981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Layout__Group__2__Impl3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__Group__0__Impl_in_rule__Structure__Group__03046 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Structure__Group__1_in_rule__Structure__Group__03049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__NameAssignment_0_in_rule__Structure__Group__0__Impl3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__Group__1__Impl_in_rule__Structure__Group__13106 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Structure__Group__2_in_rule__Structure__Group__13109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Structure__Group__1__Impl3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__Group__2__Impl_in_rule__Structure__Group__23168 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Structure__Group__3_in_rule__Structure__Group__23171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__OrderedElementsAssignment_2_in_rule__Structure__Group__2__Impl3198 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Structure__Group__3__Impl_in_rule__Structure__Group__33229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Structure__Group__3__Impl3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refinement__Group__0__Impl_in_rule__Refinement__Group__03296 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Refinement__Group__1_in_rule__Refinement__Group__03299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refinement__ConcreteRefinementAssignment_0_in_rule__Refinement__Group__0__Impl3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refinement__Group__1__Impl_in_rule__Refinement__Group__13356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Refinement__Group__1__Impl3384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__0__Impl_in_rule__ButtonRefinement__Group__03419 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__1_in_rule__ButtonRefinement__Group__03422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__NameAssignment_0_in_rule__ButtonRefinement__Group__0__Impl3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__1__Impl_in_rule__ButtonRefinement__Group__13479 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__2_in_rule__ButtonRefinement__Group__13482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ButtonRefinement__Group__1__Impl3510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__2__Impl_in_rule__ButtonRefinement__Group__23541 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__3_in_rule__ButtonRefinement__Group__23544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__IdAssignment_2_in_rule__ButtonRefinement__Group__2__Impl3571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__3__Impl_in_rule__ButtonRefinement__Group__33601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group_3__0_in_rule__ButtonRefinement__Group__3__Impl3628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group_3__0__Impl_in_rule__ButtonRefinement__Group_3__03667 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group_3__1_in_rule__ButtonRefinement__Group_3__03670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ButtonRefinement__Group_3__0__Impl3698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group_3__1__Impl_in_rule__ButtonRefinement__Group_3__13729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__PropertiesAssignment_3_1_in_rule__ButtonRefinement__Group_3__1__Impl3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__0__Impl_in_rule__LabelRefinement__Group__03790 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__1_in_rule__LabelRefinement__Group__03793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__NameAssignment_0_in_rule__LabelRefinement__Group__0__Impl3820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__1__Impl_in_rule__LabelRefinement__Group__13850 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__2_in_rule__LabelRefinement__Group__13853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__LabelRefinement__Group__1__Impl3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__2__Impl_in_rule__LabelRefinement__Group__23912 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__3_in_rule__LabelRefinement__Group__23915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__IdAssignment_2_in_rule__LabelRefinement__Group__2__Impl3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__3__Impl_in_rule__LabelRefinement__Group__33972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group_3__0_in_rule__LabelRefinement__Group__3__Impl3999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group_3__0__Impl_in_rule__LabelRefinement__Group_3__04038 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group_3__1_in_rule__LabelRefinement__Group_3__04041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__LabelRefinement__Group_3__0__Impl4069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group_3__1__Impl_in_rule__LabelRefinement__Group_3__14100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__PropertiesAssignment_3_1_in_rule__LabelRefinement__Group_3__1__Impl4127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__04161 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__04164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Property__Group__0__Impl4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__14223 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__14226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__PropertiesFilesAssignment_1_in_rule__Property__Group__1__Impl4255 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Property__PropertiesFilesAssignment_1_in_rule__Property__Group__1__Impl4267 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__24300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Property__Group__2__Impl4328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group__0__Impl_in_rule__UsedDescriptions__Group__04365 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group__1_in_rule__UsedDescriptions__Group__04368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__UsedDescriptions__Group__0__Impl4396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group__1__Impl_in_rule__UsedDescriptions__Group__14427 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group__2_in_rule__UsedDescriptions__Group__14430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__DescriptionAssignment_1_in_rule__UsedDescriptions__Group__1__Impl4457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group__2__Impl_in_rule__UsedDescriptions__Group__24487 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group__3_in_rule__UsedDescriptions__Group__24490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group_2__0_in_rule__UsedDescriptions__Group__2__Impl4517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group__3__Impl_in_rule__UsedDescriptions__Group__34548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__UsedDescriptions__Group__3__Impl4576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group_2__0__Impl_in_rule__UsedDescriptions__Group_2__04615 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group_2__1_in_rule__UsedDescriptions__Group_2__04618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__UsedDescriptions__Group_2__0__Impl4646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group_2__1__Impl_in_rule__UsedDescriptions__Group_2__14677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__IdAssignment_2_1_in_rule__UsedDescriptions__Group_2__1__Impl4704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__04738 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__04741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__ConcreteDefitionAssignment_0_in_rule__Definition__Group__0__Impl4768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__14798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Definition__Group__1__Impl4826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__0__Impl_in_rule__TypeDefinition__Group__04861 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__1_in_rule__TypeDefinition__Group__04864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TypeDefinition__Group__0__Impl4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__1__Impl_in_rule__TypeDefinition__Group__14923 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__2_in_rule__TypeDefinition__Group__14926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__TypeAssignment_1_in_rule__TypeDefinition__Group__1__Impl4953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__2__Impl_in_rule__TypeDefinition__Group__24983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__TypeDefinition__Group__2__Impl5011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabViewDefinition__Group__0__Impl_in_rule__TabViewDefinition__Group__05048 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_rule__TabViewDefinition__Group__1_in_rule__TabViewDefinition__Group__05051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabViewDefinition__NameAssignment_0_in_rule__TabViewDefinition__Group__0__Impl5078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabViewDefinition__Group__1__Impl_in_rule__TabViewDefinition__Group__15108 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_rule__TabViewDefinition__Group__2_in_rule__TabViewDefinition__Group__15111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabViewDefinition__TabsAssignment_1_in_rule__TabViewDefinition__Group__1__Impl5138 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__TabViewDefinition__Group__2__Impl_in_rule__TabViewDefinition__Group__25169 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TabViewDefinition__Group__3_in_rule__TabViewDefinition__Group__25172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TabViewDefinition__Group__2__Impl5200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabViewDefinition__Group__3__Impl_in_rule__TabViewDefinition__Group__35231 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__TabViewDefinition__Group__4_in_rule__TabViewDefinition__Group__35234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabViewDefinition__IdAssignment_3_in_rule__TabViewDefinition__Group__3__Impl5261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabViewDefinition__Group__4__Impl_in_rule__TabViewDefinition__Group__45291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabViewDefinition__Group_4__0_in_rule__TabViewDefinition__Group__4__Impl5318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabViewDefinition__Group_4__0__Impl_in_rule__TabViewDefinition__Group_4__05359 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__TabViewDefinition__Group_4__1_in_rule__TabViewDefinition__Group_4__05362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TabViewDefinition__Group_4__0__Impl5390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabViewDefinition__Group_4__1__Impl_in_rule__TabViewDefinition__Group_4__15421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabViewDefinition__PropertiesAssignment_4_1_in_rule__TabViewDefinition__Group_4__1__Impl5448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiselection__Group__0__Impl_in_rule__Multiselection__Group__05482 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Multiselection__Group__1_in_rule__Multiselection__Group__05485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiselection__NameAssignment_0_in_rule__Multiselection__Group__0__Impl5512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiselection__Group__1__Impl_in_rule__Multiselection__Group__15542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiselection__InputTypeAssignment_1_in_rule__Multiselection__Group__1__Impl5569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__0__Impl_in_rule__TextfieldDefinition__Group__05604 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__1_in_rule__TextfieldDefinition__Group__05607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__NameAssignment_0_in_rule__TextfieldDefinition__Group__0__Impl5634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__1__Impl_in_rule__TextfieldDefinition__Group__15664 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__2_in_rule__TextfieldDefinition__Group__15667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TextfieldDefinition__Group__1__Impl5695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__2__Impl_in_rule__TextfieldDefinition__Group__25726 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__3_in_rule__TextfieldDefinition__Group__25729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__IdAssignment_2_in_rule__TextfieldDefinition__Group__2__Impl5756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__3__Impl_in_rule__TextfieldDefinition__Group__35786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group_3__0_in_rule__TextfieldDefinition__Group__3__Impl5813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group_3__0__Impl_in_rule__TextfieldDefinition__Group_3__05852 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group_3__1_in_rule__TextfieldDefinition__Group_3__05855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TextfieldDefinition__Group_3__0__Impl5883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group_3__1__Impl_in_rule__TextfieldDefinition__Group_3__15914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__PropertiesAssignment_3_1_in_rule__TextfieldDefinition__Group_3__1__Impl5941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldProperties__Group__0__Impl_in_rule__TextfieldProperties__Group__05975 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__TextfieldProperties__Group__1_in_rule__TextfieldProperties__Group__05978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldProperties__CommonPropertiesAssignment_0_in_rule__TextfieldProperties__Group__0__Impl6005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldProperties__Group__1__Impl_in_rule__TextfieldProperties__Group__16035 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__TextfieldProperties__Group__2_in_rule__TextfieldProperties__Group__16038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldProperties__Group_1__0_in_rule__TextfieldProperties__Group__1__Impl6065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldProperties__Group__2__Impl_in_rule__TextfieldProperties__Group__26096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldProperties__Group_2__0_in_rule__TextfieldProperties__Group__2__Impl6123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldProperties__Group_1__0__Impl_in_rule__TextfieldProperties__Group_1__06160 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TextfieldProperties__Group_1__1_in_rule__TextfieldProperties__Group_1__06163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TextfieldProperties__Group_1__0__Impl6191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldProperties__Group_1__1__Impl_in_rule__TextfieldProperties__Group_1__16222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldProperties__TextAssignment_1_1_in_rule__TextfieldProperties__Group_1__1__Impl6249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldProperties__Group_2__0__Impl_in_rule__TextfieldProperties__Group_2__06283 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__TextfieldProperties__Group_2__1_in_rule__TextfieldProperties__Group_2__06286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TextfieldProperties__Group_2__0__Impl6314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldProperties__Group_2__1__Impl_in_rule__TextfieldProperties__Group_2__16345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldProperties__EditableAssignment_2_1_in_rule__TextfieldProperties__Group_2__1__Impl6372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaDefinition__Group__0__Impl_in_rule__TextareaDefinition__Group__06406 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__TextareaDefinition__Group__1_in_rule__TextareaDefinition__Group__06409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaDefinition__NameAssignment_0_in_rule__TextareaDefinition__Group__0__Impl6436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaDefinition__Group__1__Impl_in_rule__TextareaDefinition__Group__16466 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TextareaDefinition__Group__2_in_rule__TextareaDefinition__Group__16469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TextareaDefinition__Group__1__Impl6497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaDefinition__Group__2__Impl_in_rule__TextareaDefinition__Group__26528 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__TextareaDefinition__Group__3_in_rule__TextareaDefinition__Group__26531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaDefinition__IdAssignment_2_in_rule__TextareaDefinition__Group__2__Impl6558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaDefinition__Group__3__Impl_in_rule__TextareaDefinition__Group__36588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaDefinition__Group_3__0_in_rule__TextareaDefinition__Group__3__Impl6615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaDefinition__Group_3__0__Impl_in_rule__TextareaDefinition__Group_3__06654 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__TextareaDefinition__Group_3__1_in_rule__TextareaDefinition__Group_3__06657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TextareaDefinition__Group_3__0__Impl6685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaDefinition__Group_3__1__Impl_in_rule__TextareaDefinition__Group_3__16716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaDefinition__PropertiesAssignment_3_1_in_rule__TextareaDefinition__Group_3__1__Impl6743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaProperties__Group__0__Impl_in_rule__TextareaProperties__Group__06777 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__TextareaProperties__Group__1_in_rule__TextareaProperties__Group__06780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaProperties__CommonPropertiesAssignment_0_in_rule__TextareaProperties__Group__0__Impl6807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaProperties__Group__1__Impl_in_rule__TextareaProperties__Group__16837 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__TextareaProperties__Group__2_in_rule__TextareaProperties__Group__16840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaProperties__Group_1__0_in_rule__TextareaProperties__Group__1__Impl6867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaProperties__Group__2__Impl_in_rule__TextareaProperties__Group__26898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaProperties__Group_2__0_in_rule__TextareaProperties__Group__2__Impl6925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaProperties__Group_1__0__Impl_in_rule__TextareaProperties__Group_1__06962 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TextareaProperties__Group_1__1_in_rule__TextareaProperties__Group_1__06965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TextareaProperties__Group_1__0__Impl6993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaProperties__Group_1__1__Impl_in_rule__TextareaProperties__Group_1__17024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaProperties__TextAssignment_1_1_in_rule__TextareaProperties__Group_1__1__Impl7051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaProperties__Group_2__0__Impl_in_rule__TextareaProperties__Group_2__07085 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__TextareaProperties__Group_2__1_in_rule__TextareaProperties__Group_2__07088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TextareaProperties__Group_2__0__Impl7116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaProperties__Group_2__1__Impl_in_rule__TextareaProperties__Group_2__17147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaProperties__EditableAssignment_2_1_in_rule__TextareaProperties__Group_2__1__Impl7174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__0__Impl_in_rule__TreeDefinition__Group__07208 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__1_in_rule__TreeDefinition__Group__07211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__NameAssignment_0_in_rule__TreeDefinition__Group__0__Impl7238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__1__Impl_in_rule__TreeDefinition__Group__17268 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__2_in_rule__TreeDefinition__Group__17271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__InputTypeAssignment_1_in_rule__TreeDefinition__Group__1__Impl7298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__2__Impl_in_rule__TreeDefinition__Group__27328 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__3_in_rule__TreeDefinition__Group__27331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TreeDefinition__Group__2__Impl7359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__3__Impl_in_rule__TreeDefinition__Group__37390 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__4_in_rule__TreeDefinition__Group__37393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__IdAssignment_3_in_rule__TreeDefinition__Group__3__Impl7420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__4__Impl_in_rule__TreeDefinition__Group__47450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group_4__0_in_rule__TreeDefinition__Group__4__Impl7477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group_4__0__Impl_in_rule__TreeDefinition__Group_4__07518 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group_4__1_in_rule__TreeDefinition__Group_4__07521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TreeDefinition__Group_4__0__Impl7549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group_4__1__Impl_in_rule__TreeDefinition__Group_4__17580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__PropertiesAssignment_4_1_in_rule__TreeDefinition__Group_4__1__Impl7607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__0__Impl_in_rule__TableDefinition__Group__07641 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__1_in_rule__TableDefinition__Group__07644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__NameAssignment_0_in_rule__TableDefinition__Group__0__Impl7671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__1__Impl_in_rule__TableDefinition__Group__17701 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__2_in_rule__TableDefinition__Group__17704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__InputTypeAssignment_1_in_rule__TableDefinition__Group__1__Impl7731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__2__Impl_in_rule__TableDefinition__Group__27761 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__3_in_rule__TableDefinition__Group__27764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TableDefinition__Group__2__Impl7792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__3__Impl_in_rule__TableDefinition__Group__37823 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__4_in_rule__TableDefinition__Group__37826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__IdAssignment_3_in_rule__TableDefinition__Group__3__Impl7853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__4__Impl_in_rule__TableDefinition__Group__47883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group_4__0_in_rule__TableDefinition__Group__4__Impl7910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group_4__0__Impl_in_rule__TableDefinition__Group_4__07951 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group_4__1_in_rule__TableDefinition__Group_4__07954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TableDefinition__Group_4__0__Impl7982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group_4__1__Impl_in_rule__TableDefinition__Group_4__18013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__PropertiesAssignment_4_1_in_rule__TableDefinition__Group_4__1__Impl8040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterchangeableDefinition__Group__0__Impl_in_rule__InterchangeableDefinition__Group__08074 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__InterchangeableDefinition__Group__1_in_rule__InterchangeableDefinition__Group__08077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterchangeableDefinition__NameAssignment_0_in_rule__InterchangeableDefinition__Group__0__Impl8104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterchangeableDefinition__Group__1__Impl_in_rule__InterchangeableDefinition__Group__18134 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InterchangeableDefinition__Group__2_in_rule__InterchangeableDefinition__Group__18137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__InterchangeableDefinition__Group__1__Impl8165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterchangeableDefinition__Group__2__Impl_in_rule__InterchangeableDefinition__Group__28196 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__InterchangeableDefinition__Group__3_in_rule__InterchangeableDefinition__Group__28199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterchangeableDefinition__IdAssignment_2_in_rule__InterchangeableDefinition__Group__2__Impl8226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterchangeableDefinition__Group__3__Impl_in_rule__InterchangeableDefinition__Group__38256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterchangeableDefinition__Group_3__0_in_rule__InterchangeableDefinition__Group__3__Impl8283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterchangeableDefinition__Group_3__0__Impl_in_rule__InterchangeableDefinition__Group_3__08322 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__InterchangeableDefinition__Group_3__1_in_rule__InterchangeableDefinition__Group_3__08325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__InterchangeableDefinition__Group_3__0__Impl8353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterchangeableDefinition__Group_3__1__Impl_in_rule__InterchangeableDefinition__Group_3__18384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterchangeableDefinition__PropertiesAssignment_3_1_in_rule__InterchangeableDefinition__Group_3__1__Impl8411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__0__Impl_in_rule__ButtonDefinition__Group__08445 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__1_in_rule__ButtonDefinition__Group__08448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__NameAssignment_0_in_rule__ButtonDefinition__Group__0__Impl8475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__1__Impl_in_rule__ButtonDefinition__Group__18505 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__2_in_rule__ButtonDefinition__Group__18508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ButtonDefinition__Group__1__Impl8536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__2__Impl_in_rule__ButtonDefinition__Group__28567 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__3_in_rule__ButtonDefinition__Group__28570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__IdAssignment_2_in_rule__ButtonDefinition__Group__2__Impl8597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__3__Impl_in_rule__ButtonDefinition__Group__38627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__PropertiesAssignment_3_in_rule__ButtonDefinition__Group__3__Impl8654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonProperties__Group__0__Impl_in_rule__ButtonProperties__Group__08693 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ButtonProperties__Group__1_in_rule__ButtonProperties__Group__08696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonProperties__CommonPropertiesAssignment_0_in_rule__ButtonProperties__Group__0__Impl8723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonProperties__Group__1__Impl_in_rule__ButtonProperties__Group__18753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonProperties__Group_1__0_in_rule__ButtonProperties__Group__1__Impl8780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonProperties__Group_1__0__Impl_in_rule__ButtonProperties__Group_1__08815 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ButtonProperties__Group_1__1_in_rule__ButtonProperties__Group_1__08818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ButtonProperties__Group_1__0__Impl8846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonProperties__Group_1__1__Impl_in_rule__ButtonProperties__Group_1__18877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonProperties__TextAssignment_1_1_in_rule__ButtonProperties__Group_1__1__Impl8904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group__0__Impl_in_rule__CommonProperties__Group__08938 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group__1_in_rule__CommonProperties__Group__08941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CommonProperties__Group__0__Impl8969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group__1__Impl_in_rule__CommonProperties__Group__19000 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group__2_in_rule__CommonProperties__Group__19003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_1__0_in_rule__CommonProperties__Group__1__Impl9030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group__2__Impl_in_rule__CommonProperties__Group__29061 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group__3_in_rule__CommonProperties__Group__29064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_2__0_in_rule__CommonProperties__Group__2__Impl9091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group__3__Impl_in_rule__CommonProperties__Group__39122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_3__0_in_rule__CommonProperties__Group__3__Impl9149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_1__0__Impl_in_rule__CommonProperties__Group_1__09188 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_1__1_in_rule__CommonProperties__Group_1__09191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__NameAssignment_1_0_in_rule__CommonProperties__Group_1__0__Impl9218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_1__1__Impl_in_rule__CommonProperties__Group_1__19248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_1__2_in_rule__CommonProperties__Group_1__19251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CommonProperties__Group_1__1__Impl9279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_1__2__Impl_in_rule__CommonProperties__Group_1__29310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__PropertyKeyAssignment_1_2_in_rule__CommonProperties__Group_1__2__Impl9337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_2__0__Impl_in_rule__CommonProperties__Group_2__09373 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_2__1_in_rule__CommonProperties__Group_2__09376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__NameAssignment_2_0_in_rule__CommonProperties__Group_2__0__Impl9403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_2__1__Impl_in_rule__CommonProperties__Group_2__19433 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_2__2_in_rule__CommonProperties__Group_2__19436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CommonProperties__Group_2__1__Impl9464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_2__2__Impl_in_rule__CommonProperties__Group_2__29495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__LayoutKeyAssignment_2_2_in_rule__CommonProperties__Group_2__2__Impl9522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_3__0__Impl_in_rule__CommonProperties__Group_3__09558 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_3__1_in_rule__CommonProperties__Group_3__09561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__NameAssignment_3_0_in_rule__CommonProperties__Group_3__0__Impl9588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_3__1__Impl_in_rule__CommonProperties__Group_3__19618 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_3__2_in_rule__CommonProperties__Group_3__19621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CommonProperties__Group_3__1__Impl9649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_3__2__Impl_in_rule__CommonProperties__Group_3__29680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__InteractiontypeAssignment_3_2_in_rule__CommonProperties__Group_3__2__Impl9709 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_rule__CommonProperties__InteractiontypeAssignment_3_2_in_rule__CommonProperties__Group_3__2__Impl9721 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__0__Impl_in_rule__LabelDefinition__Group__09760 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__1_in_rule__LabelDefinition__Group__09763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__NameAssignment_0_in_rule__LabelDefinition__Group__0__Impl9790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__1__Impl_in_rule__LabelDefinition__Group__19820 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__2_in_rule__LabelDefinition__Group__19823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__LabelDefinition__Group__1__Impl9851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__2__Impl_in_rule__LabelDefinition__Group__29882 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__3_in_rule__LabelDefinition__Group__29885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__IdAssignment_2_in_rule__LabelDefinition__Group__2__Impl9912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__3__Impl_in_rule__LabelDefinition__Group__39942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group_3__0_in_rule__LabelDefinition__Group__3__Impl9969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group_3__0__Impl_in_rule__LabelDefinition__Group_3__010008 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group_3__1_in_rule__LabelDefinition__Group_3__010011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__LabelDefinition__Group_3__0__Impl10039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group_3__1__Impl_in_rule__LabelDefinition__Group_3__110070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__PropertiesAssignment_3_1_in_rule__LabelDefinition__Group_3__1__Impl10097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelProperties__Group__0__Impl_in_rule__LabelProperties__Group__010131 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__LabelProperties__Group__1_in_rule__LabelProperties__Group__010134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelProperties__CommonPropertiesAssignment_0_in_rule__LabelProperties__Group__0__Impl10161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelProperties__Group__1__Impl_in_rule__LabelProperties__Group__110191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelProperties__Group_1__0_in_rule__LabelProperties__Group__1__Impl10218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelProperties__Group_1__0__Impl_in_rule__LabelProperties__Group_1__010253 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LabelProperties__Group_1__1_in_rule__LabelProperties__Group_1__010256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__LabelProperties__Group_1__0__Impl10284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelProperties__Group_1__1__Impl_in_rule__LabelProperties__Group_1__110315 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__LabelProperties__Group_1__2_in_rule__LabelProperties__Group_1__110318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelProperties__TextAssignment_1_1_in_rule__LabelProperties__Group_1__1__Impl10345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelProperties__Group_1__2__Impl_in_rule__LabelProperties__Group_1__210375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelProperties__NameAssignment_1_2_in_rule__LabelProperties__Group_1__2__Impl10402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_rule__UIDescription__TypeDefinitionAssignment_010443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__UIDescription__PropertyAssignment_110474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayout_in_rule__UIDescription__LayoutAssignment_210505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsedDescriptions_in_rule__UIDescription__UsedDescriptionsAssignment_310536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefinement_in_rule__UIDescription__RefinementsAssignment_410567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_rule__UIDescription__DefinitionsAssignment_510598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructure_in_rule__UIDescription__StructureAssignment_610629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Layout__LayoutFilesAssignment_110660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Structure__NameAssignment_010696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Structure__OrderedElementsAssignment_210735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Element__IdAssignment10766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentRefinement_in_rule__Refinement__ConcreteRefinementAssignment_010797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ButtonRefinement__NameAssignment_010833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ButtonRefinement__IdAssignment_210872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonProperties_in_rule__ButtonRefinement__PropertiesAssignment_3_110903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__LabelRefinement__NameAssignment_010939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__LabelRefinement__IdAssignment_210978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelProperties_in_rule__LabelRefinement__PropertiesAssignment_3_111009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Property__PropertiesFilesAssignment_111040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescriptionType_in_rule__UsedDescriptions__DescriptionAssignment_111071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__UsedDescriptions__IdAssignment_2_111102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDefinition_in_rule__Definition__ConcreteDefitionAssignment_011133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__TypeDefinition__TypeAssignment_111164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__IdAlternatives_0_in_rule__Type__IdAssignment11195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__UIDescriptionImport__DescriptionNameAssignment11228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__TabViewDefinition__NameAssignment_011264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabDefinition_in_rule__TabViewDefinition__TabsAssignment_111303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TabViewDefinition__IdAssignment_311334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_rule__TabViewDefinition__PropertiesAssignment_4_111365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TABNAME_in_rule__TabDefinition__NameAssignment11396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Multiselection__NameAssignment_011432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INPUT_DESCRIPTION_in_rule__Multiselection__InputTypeAssignment_111471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__TextfieldDefinition__NameAssignment_011507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TextfieldDefinition__IdAssignment_211546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfieldProperties_in_rule__TextfieldDefinition__PropertiesAssignment_3_111577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_rule__TextfieldProperties__CommonPropertiesAssignment_011608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TextfieldProperties__TextAssignment_1_111639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__TextfieldProperties__EditableAssignment_2_111670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__TextareaDefinition__NameAssignment_011706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TextareaDefinition__IdAssignment_211745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextareaProperties_in_rule__TextareaDefinition__PropertiesAssignment_3_111776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_rule__TextareaProperties__CommonPropertiesAssignment_011807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TextareaProperties__TextAssignment_1_111838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__TextareaProperties__EditableAssignment_2_111869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__TreeDefinition__NameAssignment_011905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INPUT_DESCRIPTION_in_rule__TreeDefinition__InputTypeAssignment_111944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TreeDefinition__IdAssignment_311975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_rule__TreeDefinition__PropertiesAssignment_4_112006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__TableDefinition__NameAssignment_012042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INPUT_DESCRIPTION_in_rule__TableDefinition__InputTypeAssignment_112081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TableDefinition__IdAssignment_312112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_rule__TableDefinition__PropertiesAssignment_4_112143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__InterchangeableDefinition__NameAssignment_012179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__InterchangeableDefinition__IdAssignment_212218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_rule__InterchangeableDefinition__PropertiesAssignment_3_112249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ButtonDefinition__NameAssignment_012285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ButtonDefinition__IdAssignment_212324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonProperties_in_rule__ButtonDefinition__PropertiesAssignment_312355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_rule__ButtonProperties__CommonPropertiesAssignment_012386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ButtonProperties__TextAssignment_1_112417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__CommonProperties__NameAssignment_1_012453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CommonProperties__PropertyKeyAssignment_1_212492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__CommonProperties__NameAssignment_2_012528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CommonProperties__LayoutKeyAssignment_2_212567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__CommonProperties__NameAssignment_3_012603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractiontype_in_rule__CommonProperties__InteractiontypeAssignment_3_212642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__LabelDefinition__NameAssignment_012678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__LabelDefinition__IdAssignment_212717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelProperties_in_rule__LabelDefinition__PropertiesAssignment_3_112748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_rule__LabelProperties__CommonPropertiesAssignment_012779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__LabelProperties__TextAssignment_1_112810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__LabelProperties__NameAssignment_1_212846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interactiontype__IdAlternatives_0_in_rule__Interactiontype__IdAssignment12885 = new BitSet(new long[]{0x0000000000000002L});

}