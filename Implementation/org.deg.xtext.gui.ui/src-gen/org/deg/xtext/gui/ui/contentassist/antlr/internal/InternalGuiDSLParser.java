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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INPUT_DESCRIPTION", "RULE_WS", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'WINDOW'", "'INNERCOMPLEX'", "'Click'", "'ChangeText'", "':'", "';'", "'from:'", "'from: '", "'get properties from:'", "'use: '", "'as:'", "'type: '", "'->'", "'propertyKey='", "'text='", "'interactiontype='", "'as'", "'Structure'", "'Button'", "'Label'", "'Multiselection'"
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


    // $ANTLR start "entryRuleStructure"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:88:1: entryRuleStructure : ruleStructure EOF ;
    public final void entryRuleStructure() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:89:1: ( ruleStructure EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:90:1: ruleStructure EOF
            {
             before(grammarAccess.getStructureRule()); 
            pushFollow(FOLLOW_ruleStructure_in_entryRuleStructure121);
            ruleStructure();

            state._fsp--;

             after(grammarAccess.getStructureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructure128); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:97:1: ruleStructure : ( ( rule__Structure__Group__0 ) ) ;
    public final void ruleStructure() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:101:2: ( ( ( rule__Structure__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:102:1: ( ( rule__Structure__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:102:1: ( ( rule__Structure__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:103:1: ( rule__Structure__Group__0 )
            {
             before(grammarAccess.getStructureAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:104:1: ( rule__Structure__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:104:2: rule__Structure__Group__0
            {
            pushFollow(FOLLOW_rule__Structure__Group__0_in_ruleStructure154);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:116:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:117:1: ( ruleElement EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:118:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement181);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement188); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:125:1: ruleElement : ( ( rule__Element__IdAssignment ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:129:2: ( ( ( rule__Element__IdAssignment ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:130:1: ( ( rule__Element__IdAssignment ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:130:1: ( ( rule__Element__IdAssignment ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:131:1: ( rule__Element__IdAssignment )
            {
             before(grammarAccess.getElementAccess().getIdAssignment()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:132:1: ( rule__Element__IdAssignment )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:132:2: rule__Element__IdAssignment
            {
            pushFollow(FOLLOW_rule__Element__IdAssignment_in_ruleElement214);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:144:1: entryRuleRefinement : ruleRefinement EOF ;
    public final void entryRuleRefinement() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:145:1: ( ruleRefinement EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:146:1: ruleRefinement EOF
            {
             before(grammarAccess.getRefinementRule()); 
            pushFollow(FOLLOW_ruleRefinement_in_entryRuleRefinement241);
            ruleRefinement();

            state._fsp--;

             after(grammarAccess.getRefinementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefinement248); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:153:1: ruleRefinement : ( ( rule__Refinement__Group__0 ) ) ;
    public final void ruleRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:157:2: ( ( ( rule__Refinement__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:158:1: ( ( rule__Refinement__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:158:1: ( ( rule__Refinement__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:159:1: ( rule__Refinement__Group__0 )
            {
             before(grammarAccess.getRefinementAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:160:1: ( rule__Refinement__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:160:2: rule__Refinement__Group__0
            {
            pushFollow(FOLLOW_rule__Refinement__Group__0_in_ruleRefinement274);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:172:1: entryRuleComponentRefinement : ruleComponentRefinement EOF ;
    public final void entryRuleComponentRefinement() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:173:1: ( ruleComponentRefinement EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:174:1: ruleComponentRefinement EOF
            {
             before(grammarAccess.getComponentRefinementRule()); 
            pushFollow(FOLLOW_ruleComponentRefinement_in_entryRuleComponentRefinement301);
            ruleComponentRefinement();

            state._fsp--;

             after(grammarAccess.getComponentRefinementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentRefinement308); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:181:1: ruleComponentRefinement : ( ( rule__ComponentRefinement__Alternatives ) ) ;
    public final void ruleComponentRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:185:2: ( ( ( rule__ComponentRefinement__Alternatives ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:186:1: ( ( rule__ComponentRefinement__Alternatives ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:186:1: ( ( rule__ComponentRefinement__Alternatives ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:187:1: ( rule__ComponentRefinement__Alternatives )
            {
             before(grammarAccess.getComponentRefinementAccess().getAlternatives()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:188:1: ( rule__ComponentRefinement__Alternatives )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:188:2: rule__ComponentRefinement__Alternatives
            {
            pushFollow(FOLLOW_rule__ComponentRefinement__Alternatives_in_ruleComponentRefinement334);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:200:1: entryRuleButtonRefinement : ruleButtonRefinement EOF ;
    public final void entryRuleButtonRefinement() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:201:1: ( ruleButtonRefinement EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:202:1: ruleButtonRefinement EOF
            {
             before(grammarAccess.getButtonRefinementRule()); 
            pushFollow(FOLLOW_ruleButtonRefinement_in_entryRuleButtonRefinement361);
            ruleButtonRefinement();

            state._fsp--;

             after(grammarAccess.getButtonRefinementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonRefinement368); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:209:1: ruleButtonRefinement : ( ( rule__ButtonRefinement__Group__0 ) ) ;
    public final void ruleButtonRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:213:2: ( ( ( rule__ButtonRefinement__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:214:1: ( ( rule__ButtonRefinement__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:214:1: ( ( rule__ButtonRefinement__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:215:1: ( rule__ButtonRefinement__Group__0 )
            {
             before(grammarAccess.getButtonRefinementAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:216:1: ( rule__ButtonRefinement__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:216:2: rule__ButtonRefinement__Group__0
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__Group__0_in_ruleButtonRefinement394);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:228:1: entryRuleLabelRefinement : ruleLabelRefinement EOF ;
    public final void entryRuleLabelRefinement() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:229:1: ( ruleLabelRefinement EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:230:1: ruleLabelRefinement EOF
            {
             before(grammarAccess.getLabelRefinementRule()); 
            pushFollow(FOLLOW_ruleLabelRefinement_in_entryRuleLabelRefinement421);
            ruleLabelRefinement();

            state._fsp--;

             after(grammarAccess.getLabelRefinementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelRefinement428); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:237:1: ruleLabelRefinement : ( ( rule__LabelRefinement__Group__0 ) ) ;
    public final void ruleLabelRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:241:2: ( ( ( rule__LabelRefinement__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:242:1: ( ( rule__LabelRefinement__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:242:1: ( ( rule__LabelRefinement__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:243:1: ( rule__LabelRefinement__Group__0 )
            {
             before(grammarAccess.getLabelRefinementAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:244:1: ( rule__LabelRefinement__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:244:2: rule__LabelRefinement__Group__0
            {
            pushFollow(FOLLOW_rule__LabelRefinement__Group__0_in_ruleLabelRefinement454);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:256:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:257:1: ( ruleProperty EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:258:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty481);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty488); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:265:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:269:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:270:1: ( ( rule__Property__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:270:1: ( ( rule__Property__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:271:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:272:1: ( rule__Property__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:272:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty514);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:284:1: entryRuleUsedDescriptions : ruleUsedDescriptions EOF ;
    public final void entryRuleUsedDescriptions() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:285:1: ( ruleUsedDescriptions EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:286:1: ruleUsedDescriptions EOF
            {
             before(grammarAccess.getUsedDescriptionsRule()); 
            pushFollow(FOLLOW_ruleUsedDescriptions_in_entryRuleUsedDescriptions541);
            ruleUsedDescriptions();

            state._fsp--;

             after(grammarAccess.getUsedDescriptionsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsedDescriptions548); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:293:1: ruleUsedDescriptions : ( ( rule__UsedDescriptions__Group__0 ) ) ;
    public final void ruleUsedDescriptions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:297:2: ( ( ( rule__UsedDescriptions__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:298:1: ( ( rule__UsedDescriptions__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:298:1: ( ( rule__UsedDescriptions__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:299:1: ( rule__UsedDescriptions__Group__0 )
            {
             before(grammarAccess.getUsedDescriptionsAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:300:1: ( rule__UsedDescriptions__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:300:2: rule__UsedDescriptions__Group__0
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__Group__0_in_ruleUsedDescriptions574);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:312:1: entryRuleDescriptionType : ruleDescriptionType EOF ;
    public final void entryRuleDescriptionType() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:313:1: ( ruleDescriptionType EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:314:1: ruleDescriptionType EOF
            {
             before(grammarAccess.getDescriptionTypeRule()); 
            pushFollow(FOLLOW_ruleDescriptionType_in_entryRuleDescriptionType601);
            ruleDescriptionType();

            state._fsp--;

             after(grammarAccess.getDescriptionTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescriptionType608); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:321:1: ruleDescriptionType : ( ( rule__DescriptionType__Alternatives ) ) ;
    public final void ruleDescriptionType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:325:2: ( ( ( rule__DescriptionType__Alternatives ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:326:1: ( ( rule__DescriptionType__Alternatives ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:326:1: ( ( rule__DescriptionType__Alternatives ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:327:1: ( rule__DescriptionType__Alternatives )
            {
             before(grammarAccess.getDescriptionTypeAccess().getAlternatives()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:328:1: ( rule__DescriptionType__Alternatives )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:328:2: rule__DescriptionType__Alternatives
            {
            pushFollow(FOLLOW_rule__DescriptionType__Alternatives_in_ruleDescriptionType634);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:340:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:341:1: ( ruleDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:342:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition661);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition668); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:349:1: ruleDefinition : ( ( rule__Definition__Group__0 ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:353:2: ( ( ( rule__Definition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:354:1: ( ( rule__Definition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:354:1: ( ( rule__Definition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:355:1: ( rule__Definition__Group__0 )
            {
             before(grammarAccess.getDefinitionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:356:1: ( rule__Definition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:356:2: rule__Definition__Group__0
            {
            pushFollow(FOLLOW_rule__Definition__Group__0_in_ruleDefinition694);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:368:1: entryRuleTypeDefinition : ruleTypeDefinition EOF ;
    public final void entryRuleTypeDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:369:1: ( ruleTypeDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:370:1: ruleTypeDefinition EOF
            {
             before(grammarAccess.getTypeDefinitionRule()); 
            pushFollow(FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition721);
            ruleTypeDefinition();

            state._fsp--;

             after(grammarAccess.getTypeDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinition728); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:377:1: ruleTypeDefinition : ( ( rule__TypeDefinition__Group__0 ) ) ;
    public final void ruleTypeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:381:2: ( ( ( rule__TypeDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:382:1: ( ( rule__TypeDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:382:1: ( ( rule__TypeDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:383:1: ( rule__TypeDefinition__Group__0 )
            {
             before(grammarAccess.getTypeDefinitionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:384:1: ( rule__TypeDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:384:2: rule__TypeDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Group__0_in_ruleTypeDefinition754);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:396:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:397:1: ( ruleType EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:398:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType781);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType788); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:405:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:409:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:410:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:410:1: ( ( rule__Type__Alternatives ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:411:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:412:1: ( rule__Type__Alternatives )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:412:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType814);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:424:1: entryRuleUIDescriptionImport : ruleUIDescriptionImport EOF ;
    public final void entryRuleUIDescriptionImport() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:425:1: ( ruleUIDescriptionImport EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:426:1: ruleUIDescriptionImport EOF
            {
             before(grammarAccess.getUIDescriptionImportRule()); 
            pushFollow(FOLLOW_ruleUIDescriptionImport_in_entryRuleUIDescriptionImport841);
            ruleUIDescriptionImport();

            state._fsp--;

             after(grammarAccess.getUIDescriptionImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIDescriptionImport848); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:433:1: ruleUIDescriptionImport : ( ( rule__UIDescriptionImport__DescriptionNameAssignment ) ) ;
    public final void ruleUIDescriptionImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:437:2: ( ( ( rule__UIDescriptionImport__DescriptionNameAssignment ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:438:1: ( ( rule__UIDescriptionImport__DescriptionNameAssignment ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:438:1: ( ( rule__UIDescriptionImport__DescriptionNameAssignment ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:439:1: ( rule__UIDescriptionImport__DescriptionNameAssignment )
            {
             before(grammarAccess.getUIDescriptionImportAccess().getDescriptionNameAssignment()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:440:1: ( rule__UIDescriptionImport__DescriptionNameAssignment )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:440:2: rule__UIDescriptionImport__DescriptionNameAssignment
            {
            pushFollow(FOLLOW_rule__UIDescriptionImport__DescriptionNameAssignment_in_ruleUIDescriptionImport874);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:452:1: entryRuleComplexComponent : ruleComplexComponent EOF ;
    public final void entryRuleComplexComponent() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:453:1: ( ruleComplexComponent EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:454:1: ruleComplexComponent EOF
            {
             before(grammarAccess.getComplexComponentRule()); 
            pushFollow(FOLLOW_ruleComplexComponent_in_entryRuleComplexComponent901);
            ruleComplexComponent();

            state._fsp--;

             after(grammarAccess.getComplexComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexComponent908); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:461:1: ruleComplexComponent : ( ruleMultiselection ) ;
    public final void ruleComplexComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:465:2: ( ( ruleMultiselection ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:466:1: ( ruleMultiselection )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:466:1: ( ruleMultiselection )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:467:1: ruleMultiselection
            {
             before(grammarAccess.getComplexComponentAccess().getMultiselectionParserRuleCall()); 
            pushFollow(FOLLOW_ruleMultiselection_in_ruleComplexComponent934);
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


    // $ANTLR start "entryRuleMultiselection"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:480:1: entryRuleMultiselection : ruleMultiselection EOF ;
    public final void entryRuleMultiselection() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:481:1: ( ruleMultiselection EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:482:1: ruleMultiselection EOF
            {
             before(grammarAccess.getMultiselectionRule()); 
            pushFollow(FOLLOW_ruleMultiselection_in_entryRuleMultiselection960);
            ruleMultiselection();

            state._fsp--;

             after(grammarAccess.getMultiselectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiselection967); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:489:1: ruleMultiselection : ( ( rule__Multiselection__Group__0 ) ) ;
    public final void ruleMultiselection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:493:2: ( ( ( rule__Multiselection__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:494:1: ( ( rule__Multiselection__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:494:1: ( ( rule__Multiselection__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:495:1: ( rule__Multiselection__Group__0 )
            {
             before(grammarAccess.getMultiselectionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:496:1: ( rule__Multiselection__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:496:2: rule__Multiselection__Group__0
            {
            pushFollow(FOLLOW_rule__Multiselection__Group__0_in_ruleMultiselection993);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:508:1: entryRuleComponentDefinition : ruleComponentDefinition EOF ;
    public final void entryRuleComponentDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:509:1: ( ruleComponentDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:510:1: ruleComponentDefinition EOF
            {
             before(grammarAccess.getComponentDefinitionRule()); 
            pushFollow(FOLLOW_ruleComponentDefinition_in_entryRuleComponentDefinition1020);
            ruleComponentDefinition();

            state._fsp--;

             after(grammarAccess.getComponentDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentDefinition1027); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:517:1: ruleComponentDefinition : ( ( rule__ComponentDefinition__Alternatives ) ) ;
    public final void ruleComponentDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:521:2: ( ( ( rule__ComponentDefinition__Alternatives ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:522:1: ( ( rule__ComponentDefinition__Alternatives ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:522:1: ( ( rule__ComponentDefinition__Alternatives ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:523:1: ( rule__ComponentDefinition__Alternatives )
            {
             before(grammarAccess.getComponentDefinitionAccess().getAlternatives()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:524:1: ( rule__ComponentDefinition__Alternatives )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:524:2: rule__ComponentDefinition__Alternatives
            {
            pushFollow(FOLLOW_rule__ComponentDefinition__Alternatives_in_ruleComponentDefinition1053);
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


    // $ANTLR start "entryRuleButtonDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:536:1: entryRuleButtonDefinition : ruleButtonDefinition EOF ;
    public final void entryRuleButtonDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:537:1: ( ruleButtonDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:538:1: ruleButtonDefinition EOF
            {
             before(grammarAccess.getButtonDefinitionRule()); 
            pushFollow(FOLLOW_ruleButtonDefinition_in_entryRuleButtonDefinition1080);
            ruleButtonDefinition();

            state._fsp--;

             after(grammarAccess.getButtonDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonDefinition1087); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:545:1: ruleButtonDefinition : ( ( rule__ButtonDefinition__Group__0 ) ) ;
    public final void ruleButtonDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:549:2: ( ( ( rule__ButtonDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:550:1: ( ( rule__ButtonDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:550:1: ( ( rule__ButtonDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:551:1: ( rule__ButtonDefinition__Group__0 )
            {
             before(grammarAccess.getButtonDefinitionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:552:1: ( rule__ButtonDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:552:2: rule__ButtonDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__0_in_ruleButtonDefinition1113);
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


    // $ANTLR start "entryRuleProperties"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:564:1: entryRuleProperties : ruleProperties EOF ;
    public final void entryRuleProperties() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:565:1: ( ruleProperties EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:566:1: ruleProperties EOF
            {
             before(grammarAccess.getPropertiesRule()); 
            pushFollow(FOLLOW_ruleProperties_in_entryRuleProperties1140);
            ruleProperties();

            state._fsp--;

             after(grammarAccess.getPropertiesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperties1147); 

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
    // $ANTLR end "entryRuleProperties"


    // $ANTLR start "ruleProperties"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:573:1: ruleProperties : ( ( rule__Properties__Group__0 ) ) ;
    public final void ruleProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:577:2: ( ( ( rule__Properties__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:578:1: ( ( rule__Properties__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:578:1: ( ( rule__Properties__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:579:1: ( rule__Properties__Group__0 )
            {
             before(grammarAccess.getPropertiesAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:580:1: ( rule__Properties__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:580:2: rule__Properties__Group__0
            {
            pushFollow(FOLLOW_rule__Properties__Group__0_in_ruleProperties1173);
            rule__Properties__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertiesAccess().getGroup()); 

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
    // $ANTLR end "ruleProperties"


    // $ANTLR start "entryRuleLabelDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:592:1: entryRuleLabelDefinition : ruleLabelDefinition EOF ;
    public final void entryRuleLabelDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:593:1: ( ruleLabelDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:594:1: ruleLabelDefinition EOF
            {
             before(grammarAccess.getLabelDefinitionRule()); 
            pushFollow(FOLLOW_ruleLabelDefinition_in_entryRuleLabelDefinition1200);
            ruleLabelDefinition();

            state._fsp--;

             after(grammarAccess.getLabelDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelDefinition1207); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:601:1: ruleLabelDefinition : ( ( rule__LabelDefinition__Group__0 ) ) ;
    public final void ruleLabelDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:605:2: ( ( ( rule__LabelDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:606:1: ( ( rule__LabelDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:606:1: ( ( rule__LabelDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:607:1: ( rule__LabelDefinition__Group__0 )
            {
             before(grammarAccess.getLabelDefinitionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:608:1: ( rule__LabelDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:608:2: rule__LabelDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__0_in_ruleLabelDefinition1233);
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


    // $ANTLR start "entryRuleInteractiontype"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:620:1: entryRuleInteractiontype : ruleInteractiontype EOF ;
    public final void entryRuleInteractiontype() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:621:1: ( ruleInteractiontype EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:622:1: ruleInteractiontype EOF
            {
             before(grammarAccess.getInteractiontypeRule()); 
            pushFollow(FOLLOW_ruleInteractiontype_in_entryRuleInteractiontype1260);
            ruleInteractiontype();

            state._fsp--;

             after(grammarAccess.getInteractiontypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractiontype1267); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:629:1: ruleInteractiontype : ( ( rule__Interactiontype__Alternatives ) ) ;
    public final void ruleInteractiontype() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:633:2: ( ( ( rule__Interactiontype__Alternatives ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:634:1: ( ( rule__Interactiontype__Alternatives ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:634:1: ( ( rule__Interactiontype__Alternatives ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:635:1: ( rule__Interactiontype__Alternatives )
            {
             before(grammarAccess.getInteractiontypeAccess().getAlternatives()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:636:1: ( rule__Interactiontype__Alternatives )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:636:2: rule__Interactiontype__Alternatives
            {
            pushFollow(FOLLOW_rule__Interactiontype__Alternatives_in_ruleInteractiontype1293);
            rule__Interactiontype__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInteractiontypeAccess().getAlternatives()); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:648:1: rule__ComponentRefinement__Alternatives : ( ( ruleLabelRefinement ) | ( ruleButtonRefinement ) );
    public final void rule__ComponentRefinement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:652:1: ( ( ruleLabelRefinement ) | ( ruleButtonRefinement ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==31) ) {
                alt1=1;
            }
            else if ( (LA1_0==30) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:653:1: ( ruleLabelRefinement )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:653:1: ( ruleLabelRefinement )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:654:1: ruleLabelRefinement
                    {
                     before(grammarAccess.getComponentRefinementAccess().getLabelRefinementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLabelRefinement_in_rule__ComponentRefinement__Alternatives1329);
                    ruleLabelRefinement();

                    state._fsp--;

                     after(grammarAccess.getComponentRefinementAccess().getLabelRefinementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:659:6: ( ruleButtonRefinement )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:659:6: ( ruleButtonRefinement )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:660:1: ruleButtonRefinement
                    {
                     before(grammarAccess.getComponentRefinementAccess().getButtonRefinementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleButtonRefinement_in_rule__ComponentRefinement__Alternatives1346);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:670:1: rule__DescriptionType__Alternatives : ( ( ruleUIDescriptionImport ) | ( ruleComplexComponent ) );
    public final void rule__DescriptionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:674:1: ( ( ruleUIDescriptionImport ) | ( ruleComplexComponent ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==32) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:675:1: ( ruleUIDescriptionImport )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:675:1: ( ruleUIDescriptionImport )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:676:1: ruleUIDescriptionImport
                    {
                     before(grammarAccess.getDescriptionTypeAccess().getUIDescriptionImportParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleUIDescriptionImport_in_rule__DescriptionType__Alternatives1378);
                    ruleUIDescriptionImport();

                    state._fsp--;

                     after(grammarAccess.getDescriptionTypeAccess().getUIDescriptionImportParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:681:6: ( ruleComplexComponent )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:681:6: ( ruleComplexComponent )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:682:1: ruleComplexComponent
                    {
                     before(grammarAccess.getDescriptionTypeAccess().getComplexComponentParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleComplexComponent_in_rule__DescriptionType__Alternatives1395);
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


    // $ANTLR start "rule__Type__Alternatives"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:692:1: rule__Type__Alternatives : ( ( 'WINDOW' ) | ( 'INNERCOMPLEX' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:696:1: ( ( 'WINDOW' ) | ( 'INNERCOMPLEX' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:697:1: ( 'WINDOW' )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:697:1: ( 'WINDOW' )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:698:1: 'WINDOW'
                    {
                     before(grammarAccess.getTypeAccess().getWINDOWKeyword_0()); 
                    match(input,12,FOLLOW_12_in_rule__Type__Alternatives1428); 
                     after(grammarAccess.getTypeAccess().getWINDOWKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:705:6: ( 'INNERCOMPLEX' )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:705:6: ( 'INNERCOMPLEX' )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:706:1: 'INNERCOMPLEX'
                    {
                     before(grammarAccess.getTypeAccess().getINNERCOMPLEXKeyword_1()); 
                    match(input,13,FOLLOW_13_in_rule__Type__Alternatives1448); 
                     after(grammarAccess.getTypeAccess().getINNERCOMPLEXKeyword_1()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__ComponentDefinition__Alternatives"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:718:1: rule__ComponentDefinition__Alternatives : ( ( ruleLabelDefinition ) | ( ruleButtonDefinition ) );
    public final void rule__ComponentDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:722:1: ( ( ruleLabelDefinition ) | ( ruleButtonDefinition ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==31) ) {
                alt4=1;
            }
            else if ( (LA4_0==30) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:723:1: ( ruleLabelDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:723:1: ( ruleLabelDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:724:1: ruleLabelDefinition
                    {
                     before(grammarAccess.getComponentDefinitionAccess().getLabelDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLabelDefinition_in_rule__ComponentDefinition__Alternatives1482);
                    ruleLabelDefinition();

                    state._fsp--;

                     after(grammarAccess.getComponentDefinitionAccess().getLabelDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:729:6: ( ruleButtonDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:729:6: ( ruleButtonDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:730:1: ruleButtonDefinition
                    {
                     before(grammarAccess.getComponentDefinitionAccess().getButtonDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleButtonDefinition_in_rule__ComponentDefinition__Alternatives1499);
                    ruleButtonDefinition();

                    state._fsp--;

                     after(grammarAccess.getComponentDefinitionAccess().getButtonDefinitionParserRuleCall_1()); 

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


    // $ANTLR start "rule__Interactiontype__Alternatives"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:740:1: rule__Interactiontype__Alternatives : ( ( 'Click' ) | ( 'ChangeText' ) );
    public final void rule__Interactiontype__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:744:1: ( ( 'Click' ) | ( 'ChangeText' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:745:1: ( 'Click' )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:745:1: ( 'Click' )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:746:1: 'Click'
                    {
                     before(grammarAccess.getInteractiontypeAccess().getClickKeyword_0()); 
                    match(input,14,FOLLOW_14_in_rule__Interactiontype__Alternatives1532); 
                     after(grammarAccess.getInteractiontypeAccess().getClickKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:753:6: ( 'ChangeText' )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:753:6: ( 'ChangeText' )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:754:1: 'ChangeText'
                    {
                     before(grammarAccess.getInteractiontypeAccess().getChangeTextKeyword_1()); 
                    match(input,15,FOLLOW_15_in_rule__Interactiontype__Alternatives1552); 
                     after(grammarAccess.getInteractiontypeAccess().getChangeTextKeyword_1()); 

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
    // $ANTLR end "rule__Interactiontype__Alternatives"


    // $ANTLR start "rule__UIDescription__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:768:1: rule__UIDescription__Group__0 : rule__UIDescription__Group__0__Impl rule__UIDescription__Group__1 ;
    public final void rule__UIDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:772:1: ( rule__UIDescription__Group__0__Impl rule__UIDescription__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:773:2: rule__UIDescription__Group__0__Impl rule__UIDescription__Group__1
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__0__Impl_in_rule__UIDescription__Group__01584);
            rule__UIDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIDescription__Group__1_in_rule__UIDescription__Group__01587);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:780:1: rule__UIDescription__Group__0__Impl : ( ( rule__UIDescription__TypeDefinitionAssignment_0 ) ) ;
    public final void rule__UIDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:784:1: ( ( ( rule__UIDescription__TypeDefinitionAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:785:1: ( ( rule__UIDescription__TypeDefinitionAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:785:1: ( ( rule__UIDescription__TypeDefinitionAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:786:1: ( rule__UIDescription__TypeDefinitionAssignment_0 )
            {
             before(grammarAccess.getUIDescriptionAccess().getTypeDefinitionAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:787:1: ( rule__UIDescription__TypeDefinitionAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:787:2: rule__UIDescription__TypeDefinitionAssignment_0
            {
            pushFollow(FOLLOW_rule__UIDescription__TypeDefinitionAssignment_0_in_rule__UIDescription__Group__0__Impl1614);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:797:1: rule__UIDescription__Group__1 : rule__UIDescription__Group__1__Impl rule__UIDescription__Group__2 ;
    public final void rule__UIDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:801:1: ( rule__UIDescription__Group__1__Impl rule__UIDescription__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:802:2: rule__UIDescription__Group__1__Impl rule__UIDescription__Group__2
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__1__Impl_in_rule__UIDescription__Group__11644);
            rule__UIDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIDescription__Group__2_in_rule__UIDescription__Group__11647);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:809:1: rule__UIDescription__Group__1__Impl : ( ( rule__UIDescription__PropertyAssignment_1 )? ) ;
    public final void rule__UIDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:813:1: ( ( ( rule__UIDescription__PropertyAssignment_1 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:814:1: ( ( rule__UIDescription__PropertyAssignment_1 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:814:1: ( ( rule__UIDescription__PropertyAssignment_1 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:815:1: ( rule__UIDescription__PropertyAssignment_1 )?
            {
             before(grammarAccess.getUIDescriptionAccess().getPropertyAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:816:1: ( rule__UIDescription__PropertyAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:816:2: rule__UIDescription__PropertyAssignment_1
                    {
                    pushFollow(FOLLOW_rule__UIDescription__PropertyAssignment_1_in_rule__UIDescription__Group__1__Impl1674);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:826:1: rule__UIDescription__Group__2 : rule__UIDescription__Group__2__Impl rule__UIDescription__Group__3 ;
    public final void rule__UIDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:830:1: ( rule__UIDescription__Group__2__Impl rule__UIDescription__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:831:2: rule__UIDescription__Group__2__Impl rule__UIDescription__Group__3
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__2__Impl_in_rule__UIDescription__Group__21705);
            rule__UIDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIDescription__Group__3_in_rule__UIDescription__Group__21708);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:838:1: rule__UIDescription__Group__2__Impl : ( ( rule__UIDescription__UsedDescriptionsAssignment_2 )* ) ;
    public final void rule__UIDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:842:1: ( ( ( rule__UIDescription__UsedDescriptionsAssignment_2 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:843:1: ( ( rule__UIDescription__UsedDescriptionsAssignment_2 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:843:1: ( ( rule__UIDescription__UsedDescriptionsAssignment_2 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:844:1: ( rule__UIDescription__UsedDescriptionsAssignment_2 )*
            {
             before(grammarAccess.getUIDescriptionAccess().getUsedDescriptionsAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:845:1: ( rule__UIDescription__UsedDescriptionsAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:845:2: rule__UIDescription__UsedDescriptionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__UIDescription__UsedDescriptionsAssignment_2_in_rule__UIDescription__Group__2__Impl1735);
            	    rule__UIDescription__UsedDescriptionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getUIDescriptionAccess().getUsedDescriptionsAssignment_2()); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:855:1: rule__UIDescription__Group__3 : rule__UIDescription__Group__3__Impl rule__UIDescription__Group__4 ;
    public final void rule__UIDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:859:1: ( rule__UIDescription__Group__3__Impl rule__UIDescription__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:860:2: rule__UIDescription__Group__3__Impl rule__UIDescription__Group__4
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__3__Impl_in_rule__UIDescription__Group__31766);
            rule__UIDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIDescription__Group__4_in_rule__UIDescription__Group__31769);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:867:1: rule__UIDescription__Group__3__Impl : ( ( rule__UIDescription__RefinementsAssignment_3 )* ) ;
    public final void rule__UIDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:871:1: ( ( ( rule__UIDescription__RefinementsAssignment_3 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:872:1: ( ( rule__UIDescription__RefinementsAssignment_3 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:872:1: ( ( rule__UIDescription__RefinementsAssignment_3 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:873:1: ( rule__UIDescription__RefinementsAssignment_3 )*
            {
             before(grammarAccess.getUIDescriptionAccess().getRefinementsAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:874:1: ( rule__UIDescription__RefinementsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==31) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==19) ) {
                        alt8=1;
                    }


                }
                else if ( (LA8_0==30) ) {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2==18) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:874:2: rule__UIDescription__RefinementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__UIDescription__RefinementsAssignment_3_in_rule__UIDescription__Group__3__Impl1796);
            	    rule__UIDescription__RefinementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getUIDescriptionAccess().getRefinementsAssignment_3()); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:884:1: rule__UIDescription__Group__4 : rule__UIDescription__Group__4__Impl rule__UIDescription__Group__5 ;
    public final void rule__UIDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:888:1: ( rule__UIDescription__Group__4__Impl rule__UIDescription__Group__5 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:889:2: rule__UIDescription__Group__4__Impl rule__UIDescription__Group__5
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__4__Impl_in_rule__UIDescription__Group__41827);
            rule__UIDescription__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIDescription__Group__5_in_rule__UIDescription__Group__41830);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:896:1: rule__UIDescription__Group__4__Impl : ( ( rule__UIDescription__DefinitionsAssignment_4 )* ) ;
    public final void rule__UIDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:900:1: ( ( ( rule__UIDescription__DefinitionsAssignment_4 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:901:1: ( ( rule__UIDescription__DefinitionsAssignment_4 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:901:1: ( ( rule__UIDescription__DefinitionsAssignment_4 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:902:1: ( rule__UIDescription__DefinitionsAssignment_4 )*
            {
             before(grammarAccess.getUIDescriptionAccess().getDefinitionsAssignment_4()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:903:1: ( rule__UIDescription__DefinitionsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=30 && LA9_0<=31)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:903:2: rule__UIDescription__DefinitionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__UIDescription__DefinitionsAssignment_4_in_rule__UIDescription__Group__4__Impl1857);
            	    rule__UIDescription__DefinitionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getUIDescriptionAccess().getDefinitionsAssignment_4()); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:913:1: rule__UIDescription__Group__5 : rule__UIDescription__Group__5__Impl ;
    public final void rule__UIDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:917:1: ( rule__UIDescription__Group__5__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:918:2: rule__UIDescription__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__5__Impl_in_rule__UIDescription__Group__51888);
            rule__UIDescription__Group__5__Impl();

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:924:1: rule__UIDescription__Group__5__Impl : ( ( rule__UIDescription__StructureAssignment_5 ) ) ;
    public final void rule__UIDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:928:1: ( ( ( rule__UIDescription__StructureAssignment_5 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:929:1: ( ( rule__UIDescription__StructureAssignment_5 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:929:1: ( ( rule__UIDescription__StructureAssignment_5 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:930:1: ( rule__UIDescription__StructureAssignment_5 )
            {
             before(grammarAccess.getUIDescriptionAccess().getStructureAssignment_5()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:931:1: ( rule__UIDescription__StructureAssignment_5 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:931:2: rule__UIDescription__StructureAssignment_5
            {
            pushFollow(FOLLOW_rule__UIDescription__StructureAssignment_5_in_rule__UIDescription__Group__5__Impl1915);
            rule__UIDescription__StructureAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getUIDescriptionAccess().getStructureAssignment_5()); 

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


    // $ANTLR start "rule__Structure__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:953:1: rule__Structure__Group__0 : rule__Structure__Group__0__Impl rule__Structure__Group__1 ;
    public final void rule__Structure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:957:1: ( rule__Structure__Group__0__Impl rule__Structure__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:958:2: rule__Structure__Group__0__Impl rule__Structure__Group__1
            {
            pushFollow(FOLLOW_rule__Structure__Group__0__Impl_in_rule__Structure__Group__01957);
            rule__Structure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Structure__Group__1_in_rule__Structure__Group__01960);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:965:1: rule__Structure__Group__0__Impl : ( ( rule__Structure__NameAssignment_0 ) ) ;
    public final void rule__Structure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:969:1: ( ( ( rule__Structure__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:970:1: ( ( rule__Structure__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:970:1: ( ( rule__Structure__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:971:1: ( rule__Structure__NameAssignment_0 )
            {
             before(grammarAccess.getStructureAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:972:1: ( rule__Structure__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:972:2: rule__Structure__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Structure__NameAssignment_0_in_rule__Structure__Group__0__Impl1987);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:982:1: rule__Structure__Group__1 : rule__Structure__Group__1__Impl rule__Structure__Group__2 ;
    public final void rule__Structure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:986:1: ( rule__Structure__Group__1__Impl rule__Structure__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:987:2: rule__Structure__Group__1__Impl rule__Structure__Group__2
            {
            pushFollow(FOLLOW_rule__Structure__Group__1__Impl_in_rule__Structure__Group__12017);
            rule__Structure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Structure__Group__2_in_rule__Structure__Group__12020);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:994:1: rule__Structure__Group__1__Impl : ( ':' ) ;
    public final void rule__Structure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:998:1: ( ( ':' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:999:1: ( ':' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:999:1: ( ':' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1000:1: ':'
            {
             before(grammarAccess.getStructureAccess().getColonKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__Structure__Group__1__Impl2048); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1013:1: rule__Structure__Group__2 : rule__Structure__Group__2__Impl ;
    public final void rule__Structure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1017:1: ( rule__Structure__Group__2__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1018:2: rule__Structure__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Structure__Group__2__Impl_in_rule__Structure__Group__22079);
            rule__Structure__Group__2__Impl();

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1024:1: rule__Structure__Group__2__Impl : ( ( rule__Structure__OrderedElementsAssignment_2 )* ) ;
    public final void rule__Structure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1028:1: ( ( ( rule__Structure__OrderedElementsAssignment_2 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1029:1: ( ( rule__Structure__OrderedElementsAssignment_2 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1029:1: ( ( rule__Structure__OrderedElementsAssignment_2 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1030:1: ( rule__Structure__OrderedElementsAssignment_2 )*
            {
             before(grammarAccess.getStructureAccess().getOrderedElementsAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1031:1: ( rule__Structure__OrderedElementsAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_STRING) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1031:2: rule__Structure__OrderedElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Structure__OrderedElementsAssignment_2_in_rule__Structure__Group__2__Impl2106);
            	    rule__Structure__OrderedElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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


    // $ANTLR start "rule__Refinement__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1047:1: rule__Refinement__Group__0 : rule__Refinement__Group__0__Impl rule__Refinement__Group__1 ;
    public final void rule__Refinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1051:1: ( rule__Refinement__Group__0__Impl rule__Refinement__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1052:2: rule__Refinement__Group__0__Impl rule__Refinement__Group__1
            {
            pushFollow(FOLLOW_rule__Refinement__Group__0__Impl_in_rule__Refinement__Group__02143);
            rule__Refinement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Refinement__Group__1_in_rule__Refinement__Group__02146);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1059:1: rule__Refinement__Group__0__Impl : ( ( rule__Refinement__ConcreteRefinementAssignment_0 ) ) ;
    public final void rule__Refinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1063:1: ( ( ( rule__Refinement__ConcreteRefinementAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1064:1: ( ( rule__Refinement__ConcreteRefinementAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1064:1: ( ( rule__Refinement__ConcreteRefinementAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1065:1: ( rule__Refinement__ConcreteRefinementAssignment_0 )
            {
             before(grammarAccess.getRefinementAccess().getConcreteRefinementAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1066:1: ( rule__Refinement__ConcreteRefinementAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1066:2: rule__Refinement__ConcreteRefinementAssignment_0
            {
            pushFollow(FOLLOW_rule__Refinement__ConcreteRefinementAssignment_0_in_rule__Refinement__Group__0__Impl2173);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1076:1: rule__Refinement__Group__1 : rule__Refinement__Group__1__Impl ;
    public final void rule__Refinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1080:1: ( rule__Refinement__Group__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1081:2: rule__Refinement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Refinement__Group__1__Impl_in_rule__Refinement__Group__12203);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1087:1: rule__Refinement__Group__1__Impl : ( ';' ) ;
    public final void rule__Refinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1091:1: ( ( ';' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1092:1: ( ';' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1092:1: ( ';' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1093:1: ';'
            {
             before(grammarAccess.getRefinementAccess().getSemicolonKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Refinement__Group__1__Impl2231); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1110:1: rule__ButtonRefinement__Group__0 : rule__ButtonRefinement__Group__0__Impl rule__ButtonRefinement__Group__1 ;
    public final void rule__ButtonRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1114:1: ( rule__ButtonRefinement__Group__0__Impl rule__ButtonRefinement__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1115:2: rule__ButtonRefinement__Group__0__Impl rule__ButtonRefinement__Group__1
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__Group__0__Impl_in_rule__ButtonRefinement__Group__02266);
            rule__ButtonRefinement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonRefinement__Group__1_in_rule__ButtonRefinement__Group__02269);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1122:1: rule__ButtonRefinement__Group__0__Impl : ( ( rule__ButtonRefinement__NameAssignment_0 ) ) ;
    public final void rule__ButtonRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1126:1: ( ( ( rule__ButtonRefinement__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1127:1: ( ( rule__ButtonRefinement__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1127:1: ( ( rule__ButtonRefinement__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1128:1: ( rule__ButtonRefinement__NameAssignment_0 )
            {
             before(grammarAccess.getButtonRefinementAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1129:1: ( rule__ButtonRefinement__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1129:2: rule__ButtonRefinement__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__NameAssignment_0_in_rule__ButtonRefinement__Group__0__Impl2296);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1139:1: rule__ButtonRefinement__Group__1 : rule__ButtonRefinement__Group__1__Impl rule__ButtonRefinement__Group__2 ;
    public final void rule__ButtonRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1143:1: ( rule__ButtonRefinement__Group__1__Impl rule__ButtonRefinement__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1144:2: rule__ButtonRefinement__Group__1__Impl rule__ButtonRefinement__Group__2
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__Group__1__Impl_in_rule__ButtonRefinement__Group__12326);
            rule__ButtonRefinement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonRefinement__Group__2_in_rule__ButtonRefinement__Group__12329);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1151:1: rule__ButtonRefinement__Group__1__Impl : ( 'from:' ) ;
    public final void rule__ButtonRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1155:1: ( ( 'from:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1156:1: ( 'from:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1156:1: ( 'from:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1157:1: 'from:'
            {
             before(grammarAccess.getButtonRefinementAccess().getFromKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__ButtonRefinement__Group__1__Impl2357); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1170:1: rule__ButtonRefinement__Group__2 : rule__ButtonRefinement__Group__2__Impl rule__ButtonRefinement__Group__3 ;
    public final void rule__ButtonRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1174:1: ( rule__ButtonRefinement__Group__2__Impl rule__ButtonRefinement__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1175:2: rule__ButtonRefinement__Group__2__Impl rule__ButtonRefinement__Group__3
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__Group__2__Impl_in_rule__ButtonRefinement__Group__22388);
            rule__ButtonRefinement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonRefinement__Group__3_in_rule__ButtonRefinement__Group__22391);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1182:1: rule__ButtonRefinement__Group__2__Impl : ( ( rule__ButtonRefinement__IdAssignment_2 ) ) ;
    public final void rule__ButtonRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1186:1: ( ( ( rule__ButtonRefinement__IdAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1187:1: ( ( rule__ButtonRefinement__IdAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1187:1: ( ( rule__ButtonRefinement__IdAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1188:1: ( rule__ButtonRefinement__IdAssignment_2 )
            {
             before(grammarAccess.getButtonRefinementAccess().getIdAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1189:1: ( rule__ButtonRefinement__IdAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1189:2: rule__ButtonRefinement__IdAssignment_2
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__IdAssignment_2_in_rule__ButtonRefinement__Group__2__Impl2418);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1199:1: rule__ButtonRefinement__Group__3 : rule__ButtonRefinement__Group__3__Impl ;
    public final void rule__ButtonRefinement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1203:1: ( rule__ButtonRefinement__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1204:2: rule__ButtonRefinement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__Group__3__Impl_in_rule__ButtonRefinement__Group__32448);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1210:1: rule__ButtonRefinement__Group__3__Impl : ( ( rule__ButtonRefinement__PropertiesAssignment_3 )? ) ;
    public final void rule__ButtonRefinement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1214:1: ( ( ( rule__ButtonRefinement__PropertiesAssignment_3 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1215:1: ( ( rule__ButtonRefinement__PropertiesAssignment_3 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1215:1: ( ( rule__ButtonRefinement__PropertiesAssignment_3 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1216:1: ( rule__ButtonRefinement__PropertiesAssignment_3 )?
            {
             before(grammarAccess.getButtonRefinementAccess().getPropertiesAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1217:1: ( rule__ButtonRefinement__PropertiesAssignment_3 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1217:2: rule__ButtonRefinement__PropertiesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__ButtonRefinement__PropertiesAssignment_3_in_rule__ButtonRefinement__Group__3__Impl2475);
                    rule__ButtonRefinement__PropertiesAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getButtonRefinementAccess().getPropertiesAssignment_3()); 

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


    // $ANTLR start "rule__LabelRefinement__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1235:1: rule__LabelRefinement__Group__0 : rule__LabelRefinement__Group__0__Impl rule__LabelRefinement__Group__1 ;
    public final void rule__LabelRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1239:1: ( rule__LabelRefinement__Group__0__Impl rule__LabelRefinement__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1240:2: rule__LabelRefinement__Group__0__Impl rule__LabelRefinement__Group__1
            {
            pushFollow(FOLLOW_rule__LabelRefinement__Group__0__Impl_in_rule__LabelRefinement__Group__02514);
            rule__LabelRefinement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelRefinement__Group__1_in_rule__LabelRefinement__Group__02517);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1247:1: rule__LabelRefinement__Group__0__Impl : ( ( rule__LabelRefinement__NameAssignment_0 ) ) ;
    public final void rule__LabelRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1251:1: ( ( ( rule__LabelRefinement__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1252:1: ( ( rule__LabelRefinement__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1252:1: ( ( rule__LabelRefinement__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1253:1: ( rule__LabelRefinement__NameAssignment_0 )
            {
             before(grammarAccess.getLabelRefinementAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1254:1: ( rule__LabelRefinement__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1254:2: rule__LabelRefinement__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__LabelRefinement__NameAssignment_0_in_rule__LabelRefinement__Group__0__Impl2544);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1264:1: rule__LabelRefinement__Group__1 : rule__LabelRefinement__Group__1__Impl rule__LabelRefinement__Group__2 ;
    public final void rule__LabelRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1268:1: ( rule__LabelRefinement__Group__1__Impl rule__LabelRefinement__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1269:2: rule__LabelRefinement__Group__1__Impl rule__LabelRefinement__Group__2
            {
            pushFollow(FOLLOW_rule__LabelRefinement__Group__1__Impl_in_rule__LabelRefinement__Group__12574);
            rule__LabelRefinement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelRefinement__Group__2_in_rule__LabelRefinement__Group__12577);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1276:1: rule__LabelRefinement__Group__1__Impl : ( 'from: ' ) ;
    public final void rule__LabelRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1280:1: ( ( 'from: ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1281:1: ( 'from: ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1281:1: ( 'from: ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1282:1: 'from: '
            {
             before(grammarAccess.getLabelRefinementAccess().getFromKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__LabelRefinement__Group__1__Impl2605); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1295:1: rule__LabelRefinement__Group__2 : rule__LabelRefinement__Group__2__Impl rule__LabelRefinement__Group__3 ;
    public final void rule__LabelRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1299:1: ( rule__LabelRefinement__Group__2__Impl rule__LabelRefinement__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1300:2: rule__LabelRefinement__Group__2__Impl rule__LabelRefinement__Group__3
            {
            pushFollow(FOLLOW_rule__LabelRefinement__Group__2__Impl_in_rule__LabelRefinement__Group__22636);
            rule__LabelRefinement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelRefinement__Group__3_in_rule__LabelRefinement__Group__22639);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1307:1: rule__LabelRefinement__Group__2__Impl : ( ( rule__LabelRefinement__IdAssignment_2 ) ) ;
    public final void rule__LabelRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1311:1: ( ( ( rule__LabelRefinement__IdAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1312:1: ( ( rule__LabelRefinement__IdAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1312:1: ( ( rule__LabelRefinement__IdAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1313:1: ( rule__LabelRefinement__IdAssignment_2 )
            {
             before(grammarAccess.getLabelRefinementAccess().getIdAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1314:1: ( rule__LabelRefinement__IdAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1314:2: rule__LabelRefinement__IdAssignment_2
            {
            pushFollow(FOLLOW_rule__LabelRefinement__IdAssignment_2_in_rule__LabelRefinement__Group__2__Impl2666);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1324:1: rule__LabelRefinement__Group__3 : rule__LabelRefinement__Group__3__Impl ;
    public final void rule__LabelRefinement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1328:1: ( rule__LabelRefinement__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1329:2: rule__LabelRefinement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__LabelRefinement__Group__3__Impl_in_rule__LabelRefinement__Group__32696);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1335:1: rule__LabelRefinement__Group__3__Impl : ( ( rule__LabelRefinement__PropertiesAssignment_3 )? ) ;
    public final void rule__LabelRefinement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1339:1: ( ( ( rule__LabelRefinement__PropertiesAssignment_3 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1340:1: ( ( rule__LabelRefinement__PropertiesAssignment_3 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1340:1: ( ( rule__LabelRefinement__PropertiesAssignment_3 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1341:1: ( rule__LabelRefinement__PropertiesAssignment_3 )?
            {
             before(grammarAccess.getLabelRefinementAccess().getPropertiesAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1342:1: ( rule__LabelRefinement__PropertiesAssignment_3 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1342:2: rule__LabelRefinement__PropertiesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__LabelRefinement__PropertiesAssignment_3_in_rule__LabelRefinement__Group__3__Impl2723);
                    rule__LabelRefinement__PropertiesAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLabelRefinementAccess().getPropertiesAssignment_3()); 

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


    // $ANTLR start "rule__Property__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1360:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1364:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1365:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__02762);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__02765);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1372:1: rule__Property__Group__0__Impl : ( 'get properties from:' ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1376:1: ( ( 'get properties from:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1377:1: ( 'get properties from:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1377:1: ( 'get properties from:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1378:1: 'get properties from:'
            {
             before(grammarAccess.getPropertyAccess().getGetPropertiesFromKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Property__Group__0__Impl2793); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1391:1: rule__Property__Group__1 : rule__Property__Group__1__Impl ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1395:1: ( rule__Property__Group__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1396:2: rule__Property__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__12824);
            rule__Property__Group__1__Impl();

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1402:1: rule__Property__Group__1__Impl : ( ( rule__Property__PropertiesFileAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1406:1: ( ( ( rule__Property__PropertiesFileAssignment_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1407:1: ( ( rule__Property__PropertiesFileAssignment_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1407:1: ( ( rule__Property__PropertiesFileAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1408:1: ( rule__Property__PropertiesFileAssignment_1 )
            {
             before(grammarAccess.getPropertyAccess().getPropertiesFileAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1409:1: ( rule__Property__PropertiesFileAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1409:2: rule__Property__PropertiesFileAssignment_1
            {
            pushFollow(FOLLOW_rule__Property__PropertiesFileAssignment_1_in_rule__Property__Group__1__Impl2851);
            rule__Property__PropertiesFileAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getPropertiesFileAssignment_1()); 

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


    // $ANTLR start "rule__UsedDescriptions__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1423:1: rule__UsedDescriptions__Group__0 : rule__UsedDescriptions__Group__0__Impl rule__UsedDescriptions__Group__1 ;
    public final void rule__UsedDescriptions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1427:1: ( rule__UsedDescriptions__Group__0__Impl rule__UsedDescriptions__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1428:2: rule__UsedDescriptions__Group__0__Impl rule__UsedDescriptions__Group__1
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__Group__0__Impl_in_rule__UsedDescriptions__Group__02885);
            rule__UsedDescriptions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsedDescriptions__Group__1_in_rule__UsedDescriptions__Group__02888);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1435:1: rule__UsedDescriptions__Group__0__Impl : ( 'use: ' ) ;
    public final void rule__UsedDescriptions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1439:1: ( ( 'use: ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1440:1: ( 'use: ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1440:1: ( 'use: ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1441:1: 'use: '
            {
             before(grammarAccess.getUsedDescriptionsAccess().getUseKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__UsedDescriptions__Group__0__Impl2916); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1454:1: rule__UsedDescriptions__Group__1 : rule__UsedDescriptions__Group__1__Impl rule__UsedDescriptions__Group__2 ;
    public final void rule__UsedDescriptions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1458:1: ( rule__UsedDescriptions__Group__1__Impl rule__UsedDescriptions__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1459:2: rule__UsedDescriptions__Group__1__Impl rule__UsedDescriptions__Group__2
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__Group__1__Impl_in_rule__UsedDescriptions__Group__12947);
            rule__UsedDescriptions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsedDescriptions__Group__2_in_rule__UsedDescriptions__Group__12950);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1466:1: rule__UsedDescriptions__Group__1__Impl : ( ( rule__UsedDescriptions__DescriptionAssignment_1 ) ) ;
    public final void rule__UsedDescriptions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1470:1: ( ( ( rule__UsedDescriptions__DescriptionAssignment_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1471:1: ( ( rule__UsedDescriptions__DescriptionAssignment_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1471:1: ( ( rule__UsedDescriptions__DescriptionAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1472:1: ( rule__UsedDescriptions__DescriptionAssignment_1 )
            {
             before(grammarAccess.getUsedDescriptionsAccess().getDescriptionAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1473:1: ( rule__UsedDescriptions__DescriptionAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1473:2: rule__UsedDescriptions__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__DescriptionAssignment_1_in_rule__UsedDescriptions__Group__1__Impl2977);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1483:1: rule__UsedDescriptions__Group__2 : rule__UsedDescriptions__Group__2__Impl ;
    public final void rule__UsedDescriptions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1487:1: ( rule__UsedDescriptions__Group__2__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1488:2: rule__UsedDescriptions__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__Group__2__Impl_in_rule__UsedDescriptions__Group__23007);
            rule__UsedDescriptions__Group__2__Impl();

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1494:1: rule__UsedDescriptions__Group__2__Impl : ( ( rule__UsedDescriptions__Group_2__0 )? ) ;
    public final void rule__UsedDescriptions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1498:1: ( ( ( rule__UsedDescriptions__Group_2__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1499:1: ( ( rule__UsedDescriptions__Group_2__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1499:1: ( ( rule__UsedDescriptions__Group_2__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1500:1: ( rule__UsedDescriptions__Group_2__0 )?
            {
             before(grammarAccess.getUsedDescriptionsAccess().getGroup_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1501:1: ( rule__UsedDescriptions__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1501:2: rule__UsedDescriptions__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__UsedDescriptions__Group_2__0_in_rule__UsedDescriptions__Group__2__Impl3034);
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


    // $ANTLR start "rule__UsedDescriptions__Group_2__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1517:1: rule__UsedDescriptions__Group_2__0 : rule__UsedDescriptions__Group_2__0__Impl rule__UsedDescriptions__Group_2__1 ;
    public final void rule__UsedDescriptions__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1521:1: ( rule__UsedDescriptions__Group_2__0__Impl rule__UsedDescriptions__Group_2__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1522:2: rule__UsedDescriptions__Group_2__0__Impl rule__UsedDescriptions__Group_2__1
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__Group_2__0__Impl_in_rule__UsedDescriptions__Group_2__03071);
            rule__UsedDescriptions__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsedDescriptions__Group_2__1_in_rule__UsedDescriptions__Group_2__03074);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1529:1: rule__UsedDescriptions__Group_2__0__Impl : ( 'as:' ) ;
    public final void rule__UsedDescriptions__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1533:1: ( ( 'as:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1534:1: ( 'as:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1534:1: ( 'as:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1535:1: 'as:'
            {
             before(grammarAccess.getUsedDescriptionsAccess().getAsKeyword_2_0()); 
            match(input,22,FOLLOW_22_in_rule__UsedDescriptions__Group_2__0__Impl3102); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1548:1: rule__UsedDescriptions__Group_2__1 : rule__UsedDescriptions__Group_2__1__Impl ;
    public final void rule__UsedDescriptions__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1552:1: ( rule__UsedDescriptions__Group_2__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1553:2: rule__UsedDescriptions__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__Group_2__1__Impl_in_rule__UsedDescriptions__Group_2__13133);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1559:1: rule__UsedDescriptions__Group_2__1__Impl : ( ( rule__UsedDescriptions__IdAssignment_2_1 ) ) ;
    public final void rule__UsedDescriptions__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1563:1: ( ( ( rule__UsedDescriptions__IdAssignment_2_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1564:1: ( ( rule__UsedDescriptions__IdAssignment_2_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1564:1: ( ( rule__UsedDescriptions__IdAssignment_2_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1565:1: ( rule__UsedDescriptions__IdAssignment_2_1 )
            {
             before(grammarAccess.getUsedDescriptionsAccess().getIdAssignment_2_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1566:1: ( rule__UsedDescriptions__IdAssignment_2_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1566:2: rule__UsedDescriptions__IdAssignment_2_1
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__IdAssignment_2_1_in_rule__UsedDescriptions__Group_2__1__Impl3160);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1580:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1584:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1585:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__03194);
            rule__Definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__03197);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1592:1: rule__Definition__Group__0__Impl : ( ( rule__Definition__ConcreteDefitionAssignment_0 ) ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1596:1: ( ( ( rule__Definition__ConcreteDefitionAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1597:1: ( ( rule__Definition__ConcreteDefitionAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1597:1: ( ( rule__Definition__ConcreteDefitionAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1598:1: ( rule__Definition__ConcreteDefitionAssignment_0 )
            {
             before(grammarAccess.getDefinitionAccess().getConcreteDefitionAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1599:1: ( rule__Definition__ConcreteDefitionAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1599:2: rule__Definition__ConcreteDefitionAssignment_0
            {
            pushFollow(FOLLOW_rule__Definition__ConcreteDefitionAssignment_0_in_rule__Definition__Group__0__Impl3224);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1609:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1613:1: ( rule__Definition__Group__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1614:2: rule__Definition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__13254);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1620:1: rule__Definition__Group__1__Impl : ( ';' ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1624:1: ( ( ';' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1625:1: ( ';' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1625:1: ( ';' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1626:1: ';'
            {
             before(grammarAccess.getDefinitionAccess().getSemicolonKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Definition__Group__1__Impl3282); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1643:1: rule__TypeDefinition__Group__0 : rule__TypeDefinition__Group__0__Impl rule__TypeDefinition__Group__1 ;
    public final void rule__TypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1647:1: ( rule__TypeDefinition__Group__0__Impl rule__TypeDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1648:2: rule__TypeDefinition__Group__0__Impl rule__TypeDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Group__0__Impl_in_rule__TypeDefinition__Group__03317);
            rule__TypeDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDefinition__Group__1_in_rule__TypeDefinition__Group__03320);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1655:1: rule__TypeDefinition__Group__0__Impl : ( 'type: ' ) ;
    public final void rule__TypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1659:1: ( ( 'type: ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1660:1: ( 'type: ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1660:1: ( 'type: ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1661:1: 'type: '
            {
             before(grammarAccess.getTypeDefinitionAccess().getTypeKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__TypeDefinition__Group__0__Impl3348); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1674:1: rule__TypeDefinition__Group__1 : rule__TypeDefinition__Group__1__Impl ;
    public final void rule__TypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1678:1: ( rule__TypeDefinition__Group__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1679:2: rule__TypeDefinition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Group__1__Impl_in_rule__TypeDefinition__Group__13379);
            rule__TypeDefinition__Group__1__Impl();

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1685:1: rule__TypeDefinition__Group__1__Impl : ( ( rule__TypeDefinition__TypeAssignment_1 ) ) ;
    public final void rule__TypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1689:1: ( ( ( rule__TypeDefinition__TypeAssignment_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1690:1: ( ( rule__TypeDefinition__TypeAssignment_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1690:1: ( ( rule__TypeDefinition__TypeAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1691:1: ( rule__TypeDefinition__TypeAssignment_1 )
            {
             before(grammarAccess.getTypeDefinitionAccess().getTypeAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1692:1: ( rule__TypeDefinition__TypeAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1692:2: rule__TypeDefinition__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__TypeDefinition__TypeAssignment_1_in_rule__TypeDefinition__Group__1__Impl3406);
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


    // $ANTLR start "rule__Multiselection__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1706:1: rule__Multiselection__Group__0 : rule__Multiselection__Group__0__Impl rule__Multiselection__Group__1 ;
    public final void rule__Multiselection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1710:1: ( rule__Multiselection__Group__0__Impl rule__Multiselection__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1711:2: rule__Multiselection__Group__0__Impl rule__Multiselection__Group__1
            {
            pushFollow(FOLLOW_rule__Multiselection__Group__0__Impl_in_rule__Multiselection__Group__03440);
            rule__Multiselection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiselection__Group__1_in_rule__Multiselection__Group__03443);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1718:1: rule__Multiselection__Group__0__Impl : ( ( rule__Multiselection__DescriptionNameAssignment_0 ) ) ;
    public final void rule__Multiselection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1722:1: ( ( ( rule__Multiselection__DescriptionNameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1723:1: ( ( rule__Multiselection__DescriptionNameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1723:1: ( ( rule__Multiselection__DescriptionNameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1724:1: ( rule__Multiselection__DescriptionNameAssignment_0 )
            {
             before(grammarAccess.getMultiselectionAccess().getDescriptionNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1725:1: ( rule__Multiselection__DescriptionNameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1725:2: rule__Multiselection__DescriptionNameAssignment_0
            {
            pushFollow(FOLLOW_rule__Multiselection__DescriptionNameAssignment_0_in_rule__Multiselection__Group__0__Impl3470);
            rule__Multiselection__DescriptionNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiselectionAccess().getDescriptionNameAssignment_0()); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1735:1: rule__Multiselection__Group__1 : rule__Multiselection__Group__1__Impl ;
    public final void rule__Multiselection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1739:1: ( rule__Multiselection__Group__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1740:2: rule__Multiselection__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiselection__Group__1__Impl_in_rule__Multiselection__Group__13500);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1746:1: rule__Multiselection__Group__1__Impl : ( ( rule__Multiselection__InputTypeAssignment_1 )? ) ;
    public final void rule__Multiselection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1750:1: ( ( ( rule__Multiselection__InputTypeAssignment_1 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1751:1: ( ( rule__Multiselection__InputTypeAssignment_1 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1751:1: ( ( rule__Multiselection__InputTypeAssignment_1 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1752:1: ( rule__Multiselection__InputTypeAssignment_1 )?
            {
             before(grammarAccess.getMultiselectionAccess().getInputTypeAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1753:1: ( rule__Multiselection__InputTypeAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INPUT_DESCRIPTION) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1753:2: rule__Multiselection__InputTypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Multiselection__InputTypeAssignment_1_in_rule__Multiselection__Group__1__Impl3527);
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


    // $ANTLR start "rule__ButtonDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1767:1: rule__ButtonDefinition__Group__0 : rule__ButtonDefinition__Group__0__Impl rule__ButtonDefinition__Group__1 ;
    public final void rule__ButtonDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1771:1: ( rule__ButtonDefinition__Group__0__Impl rule__ButtonDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1772:2: rule__ButtonDefinition__Group__0__Impl rule__ButtonDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__0__Impl_in_rule__ButtonDefinition__Group__03562);
            rule__ButtonDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonDefinition__Group__1_in_rule__ButtonDefinition__Group__03565);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1779:1: rule__ButtonDefinition__Group__0__Impl : ( ( rule__ButtonDefinition__NameAssignment_0 ) ) ;
    public final void rule__ButtonDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1783:1: ( ( ( rule__ButtonDefinition__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1784:1: ( ( rule__ButtonDefinition__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1784:1: ( ( rule__ButtonDefinition__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1785:1: ( rule__ButtonDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getButtonDefinitionAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1786:1: ( rule__ButtonDefinition__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1786:2: rule__ButtonDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__NameAssignment_0_in_rule__ButtonDefinition__Group__0__Impl3592);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1796:1: rule__ButtonDefinition__Group__1 : rule__ButtonDefinition__Group__1__Impl rule__ButtonDefinition__Group__2 ;
    public final void rule__ButtonDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1800:1: ( rule__ButtonDefinition__Group__1__Impl rule__ButtonDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1801:2: rule__ButtonDefinition__Group__1__Impl rule__ButtonDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__1__Impl_in_rule__ButtonDefinition__Group__13622);
            rule__ButtonDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonDefinition__Group__2_in_rule__ButtonDefinition__Group__13625);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1808:1: rule__ButtonDefinition__Group__1__Impl : ( 'as:' ) ;
    public final void rule__ButtonDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1812:1: ( ( 'as:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1813:1: ( 'as:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1813:1: ( 'as:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1814:1: 'as:'
            {
             before(grammarAccess.getButtonDefinitionAccess().getAsKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__ButtonDefinition__Group__1__Impl3653); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1827:1: rule__ButtonDefinition__Group__2 : rule__ButtonDefinition__Group__2__Impl rule__ButtonDefinition__Group__3 ;
    public final void rule__ButtonDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1831:1: ( rule__ButtonDefinition__Group__2__Impl rule__ButtonDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1832:2: rule__ButtonDefinition__Group__2__Impl rule__ButtonDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__2__Impl_in_rule__ButtonDefinition__Group__23684);
            rule__ButtonDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonDefinition__Group__3_in_rule__ButtonDefinition__Group__23687);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1839:1: rule__ButtonDefinition__Group__2__Impl : ( ( rule__ButtonDefinition__IdAssignment_2 ) ) ;
    public final void rule__ButtonDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1843:1: ( ( ( rule__ButtonDefinition__IdAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1844:1: ( ( rule__ButtonDefinition__IdAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1844:1: ( ( rule__ButtonDefinition__IdAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1845:1: ( rule__ButtonDefinition__IdAssignment_2 )
            {
             before(grammarAccess.getButtonDefinitionAccess().getIdAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1846:1: ( rule__ButtonDefinition__IdAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1846:2: rule__ButtonDefinition__IdAssignment_2
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__IdAssignment_2_in_rule__ButtonDefinition__Group__2__Impl3714);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1856:1: rule__ButtonDefinition__Group__3 : rule__ButtonDefinition__Group__3__Impl ;
    public final void rule__ButtonDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1860:1: ( rule__ButtonDefinition__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1861:2: rule__ButtonDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__3__Impl_in_rule__ButtonDefinition__Group__33744);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1867:1: rule__ButtonDefinition__Group__3__Impl : ( ( rule__ButtonDefinition__PropertiesAssignment_3 )? ) ;
    public final void rule__ButtonDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1871:1: ( ( ( rule__ButtonDefinition__PropertiesAssignment_3 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1872:1: ( ( rule__ButtonDefinition__PropertiesAssignment_3 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1872:1: ( ( rule__ButtonDefinition__PropertiesAssignment_3 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1873:1: ( rule__ButtonDefinition__PropertiesAssignment_3 )?
            {
             before(grammarAccess.getButtonDefinitionAccess().getPropertiesAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1874:1: ( rule__ButtonDefinition__PropertiesAssignment_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1874:2: rule__ButtonDefinition__PropertiesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__ButtonDefinition__PropertiesAssignment_3_in_rule__ButtonDefinition__Group__3__Impl3771);
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


    // $ANTLR start "rule__Properties__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1892:1: rule__Properties__Group__0 : rule__Properties__Group__0__Impl rule__Properties__Group__1 ;
    public final void rule__Properties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1896:1: ( rule__Properties__Group__0__Impl rule__Properties__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1897:2: rule__Properties__Group__0__Impl rule__Properties__Group__1
            {
            pushFollow(FOLLOW_rule__Properties__Group__0__Impl_in_rule__Properties__Group__03810);
            rule__Properties__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Properties__Group__1_in_rule__Properties__Group__03813);
            rule__Properties__Group__1();

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
    // $ANTLR end "rule__Properties__Group__0"


    // $ANTLR start "rule__Properties__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1904:1: rule__Properties__Group__0__Impl : ( '->' ) ;
    public final void rule__Properties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1908:1: ( ( '->' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1909:1: ( '->' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1909:1: ( '->' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1910:1: '->'
            {
             before(grammarAccess.getPropertiesAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Properties__Group__0__Impl3841); 
             after(grammarAccess.getPropertiesAccess().getHyphenMinusGreaterThanSignKeyword_0()); 

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
    // $ANTLR end "rule__Properties__Group__0__Impl"


    // $ANTLR start "rule__Properties__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1923:1: rule__Properties__Group__1 : rule__Properties__Group__1__Impl rule__Properties__Group__2 ;
    public final void rule__Properties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1927:1: ( rule__Properties__Group__1__Impl rule__Properties__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1928:2: rule__Properties__Group__1__Impl rule__Properties__Group__2
            {
            pushFollow(FOLLOW_rule__Properties__Group__1__Impl_in_rule__Properties__Group__13872);
            rule__Properties__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Properties__Group__2_in_rule__Properties__Group__13875);
            rule__Properties__Group__2();

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
    // $ANTLR end "rule__Properties__Group__1"


    // $ANTLR start "rule__Properties__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1935:1: rule__Properties__Group__1__Impl : ( ( rule__Properties__Group_1__0 )? ) ;
    public final void rule__Properties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1939:1: ( ( ( rule__Properties__Group_1__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1940:1: ( ( rule__Properties__Group_1__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1940:1: ( ( rule__Properties__Group_1__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1941:1: ( rule__Properties__Group_1__0 )?
            {
             before(grammarAccess.getPropertiesAccess().getGroup_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1942:1: ( rule__Properties__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1942:2: rule__Properties__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Properties__Group_1__0_in_rule__Properties__Group__1__Impl3902);
                    rule__Properties__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertiesAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Properties__Group__1__Impl"


    // $ANTLR start "rule__Properties__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1952:1: rule__Properties__Group__2 : rule__Properties__Group__2__Impl rule__Properties__Group__3 ;
    public final void rule__Properties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1956:1: ( rule__Properties__Group__2__Impl rule__Properties__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1957:2: rule__Properties__Group__2__Impl rule__Properties__Group__3
            {
            pushFollow(FOLLOW_rule__Properties__Group__2__Impl_in_rule__Properties__Group__23933);
            rule__Properties__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Properties__Group__3_in_rule__Properties__Group__23936);
            rule__Properties__Group__3();

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
    // $ANTLR end "rule__Properties__Group__2"


    // $ANTLR start "rule__Properties__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1964:1: rule__Properties__Group__2__Impl : ( ( rule__Properties__Group_2__0 )? ) ;
    public final void rule__Properties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1968:1: ( ( ( rule__Properties__Group_2__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1969:1: ( ( rule__Properties__Group_2__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1969:1: ( ( rule__Properties__Group_2__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1970:1: ( rule__Properties__Group_2__0 )?
            {
             before(grammarAccess.getPropertiesAccess().getGroup_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1971:1: ( rule__Properties__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1971:2: rule__Properties__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Properties__Group_2__0_in_rule__Properties__Group__2__Impl3963);
                    rule__Properties__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertiesAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Properties__Group__2__Impl"


    // $ANTLR start "rule__Properties__Group__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1981:1: rule__Properties__Group__3 : rule__Properties__Group__3__Impl ;
    public final void rule__Properties__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1985:1: ( rule__Properties__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1986:2: rule__Properties__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Properties__Group__3__Impl_in_rule__Properties__Group__33994);
            rule__Properties__Group__3__Impl();

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
    // $ANTLR end "rule__Properties__Group__3"


    // $ANTLR start "rule__Properties__Group__3__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1992:1: rule__Properties__Group__3__Impl : ( ( rule__Properties__Group_3__0 )? ) ;
    public final void rule__Properties__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1996:1: ( ( ( rule__Properties__Group_3__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1997:1: ( ( rule__Properties__Group_3__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1997:1: ( ( rule__Properties__Group_3__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1998:1: ( rule__Properties__Group_3__0 )?
            {
             before(grammarAccess.getPropertiesAccess().getGroup_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1999:1: ( rule__Properties__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1999:2: rule__Properties__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Properties__Group_3__0_in_rule__Properties__Group__3__Impl4021);
                    rule__Properties__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertiesAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Properties__Group__3__Impl"


    // $ANTLR start "rule__Properties__Group_1__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2017:1: rule__Properties__Group_1__0 : rule__Properties__Group_1__0__Impl rule__Properties__Group_1__1 ;
    public final void rule__Properties__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2021:1: ( rule__Properties__Group_1__0__Impl rule__Properties__Group_1__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2022:2: rule__Properties__Group_1__0__Impl rule__Properties__Group_1__1
            {
            pushFollow(FOLLOW_rule__Properties__Group_1__0__Impl_in_rule__Properties__Group_1__04060);
            rule__Properties__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Properties__Group_1__1_in_rule__Properties__Group_1__04063);
            rule__Properties__Group_1__1();

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
    // $ANTLR end "rule__Properties__Group_1__0"


    // $ANTLR start "rule__Properties__Group_1__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2029:1: rule__Properties__Group_1__0__Impl : ( 'propertyKey=' ) ;
    public final void rule__Properties__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2033:1: ( ( 'propertyKey=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2034:1: ( 'propertyKey=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2034:1: ( 'propertyKey=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2035:1: 'propertyKey='
            {
             before(grammarAccess.getPropertiesAccess().getPropertyKeyKeyword_1_0()); 
            match(input,25,FOLLOW_25_in_rule__Properties__Group_1__0__Impl4091); 
             after(grammarAccess.getPropertiesAccess().getPropertyKeyKeyword_1_0()); 

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
    // $ANTLR end "rule__Properties__Group_1__0__Impl"


    // $ANTLR start "rule__Properties__Group_1__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2048:1: rule__Properties__Group_1__1 : rule__Properties__Group_1__1__Impl ;
    public final void rule__Properties__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2052:1: ( rule__Properties__Group_1__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2053:2: rule__Properties__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Properties__Group_1__1__Impl_in_rule__Properties__Group_1__14122);
            rule__Properties__Group_1__1__Impl();

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
    // $ANTLR end "rule__Properties__Group_1__1"


    // $ANTLR start "rule__Properties__Group_1__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2059:1: rule__Properties__Group_1__1__Impl : ( ( rule__Properties__PropertyKeyAssignment_1_1 ) ) ;
    public final void rule__Properties__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2063:1: ( ( ( rule__Properties__PropertyKeyAssignment_1_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2064:1: ( ( rule__Properties__PropertyKeyAssignment_1_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2064:1: ( ( rule__Properties__PropertyKeyAssignment_1_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2065:1: ( rule__Properties__PropertyKeyAssignment_1_1 )
            {
             before(grammarAccess.getPropertiesAccess().getPropertyKeyAssignment_1_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2066:1: ( rule__Properties__PropertyKeyAssignment_1_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2066:2: rule__Properties__PropertyKeyAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Properties__PropertyKeyAssignment_1_1_in_rule__Properties__Group_1__1__Impl4149);
            rule__Properties__PropertyKeyAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertiesAccess().getPropertyKeyAssignment_1_1()); 

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
    // $ANTLR end "rule__Properties__Group_1__1__Impl"


    // $ANTLR start "rule__Properties__Group_2__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2080:1: rule__Properties__Group_2__0 : rule__Properties__Group_2__0__Impl rule__Properties__Group_2__1 ;
    public final void rule__Properties__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2084:1: ( rule__Properties__Group_2__0__Impl rule__Properties__Group_2__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2085:2: rule__Properties__Group_2__0__Impl rule__Properties__Group_2__1
            {
            pushFollow(FOLLOW_rule__Properties__Group_2__0__Impl_in_rule__Properties__Group_2__04183);
            rule__Properties__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Properties__Group_2__1_in_rule__Properties__Group_2__04186);
            rule__Properties__Group_2__1();

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
    // $ANTLR end "rule__Properties__Group_2__0"


    // $ANTLR start "rule__Properties__Group_2__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2092:1: rule__Properties__Group_2__0__Impl : ( 'text=' ) ;
    public final void rule__Properties__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2096:1: ( ( 'text=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2097:1: ( 'text=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2097:1: ( 'text=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2098:1: 'text='
            {
             before(grammarAccess.getPropertiesAccess().getTextKeyword_2_0()); 
            match(input,26,FOLLOW_26_in_rule__Properties__Group_2__0__Impl4214); 
             after(grammarAccess.getPropertiesAccess().getTextKeyword_2_0()); 

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
    // $ANTLR end "rule__Properties__Group_2__0__Impl"


    // $ANTLR start "rule__Properties__Group_2__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2111:1: rule__Properties__Group_2__1 : rule__Properties__Group_2__1__Impl ;
    public final void rule__Properties__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2115:1: ( rule__Properties__Group_2__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2116:2: rule__Properties__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Properties__Group_2__1__Impl_in_rule__Properties__Group_2__14245);
            rule__Properties__Group_2__1__Impl();

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
    // $ANTLR end "rule__Properties__Group_2__1"


    // $ANTLR start "rule__Properties__Group_2__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2122:1: rule__Properties__Group_2__1__Impl : ( ( rule__Properties__TextAssignment_2_1 ) ) ;
    public final void rule__Properties__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2126:1: ( ( ( rule__Properties__TextAssignment_2_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2127:1: ( ( rule__Properties__TextAssignment_2_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2127:1: ( ( rule__Properties__TextAssignment_2_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2128:1: ( rule__Properties__TextAssignment_2_1 )
            {
             before(grammarAccess.getPropertiesAccess().getTextAssignment_2_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2129:1: ( rule__Properties__TextAssignment_2_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2129:2: rule__Properties__TextAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Properties__TextAssignment_2_1_in_rule__Properties__Group_2__1__Impl4272);
            rule__Properties__TextAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertiesAccess().getTextAssignment_2_1()); 

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
    // $ANTLR end "rule__Properties__Group_2__1__Impl"


    // $ANTLR start "rule__Properties__Group_3__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2143:1: rule__Properties__Group_3__0 : rule__Properties__Group_3__0__Impl rule__Properties__Group_3__1 ;
    public final void rule__Properties__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2147:1: ( rule__Properties__Group_3__0__Impl rule__Properties__Group_3__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2148:2: rule__Properties__Group_3__0__Impl rule__Properties__Group_3__1
            {
            pushFollow(FOLLOW_rule__Properties__Group_3__0__Impl_in_rule__Properties__Group_3__04306);
            rule__Properties__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Properties__Group_3__1_in_rule__Properties__Group_3__04309);
            rule__Properties__Group_3__1();

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
    // $ANTLR end "rule__Properties__Group_3__0"


    // $ANTLR start "rule__Properties__Group_3__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2155:1: rule__Properties__Group_3__0__Impl : ( 'interactiontype=' ) ;
    public final void rule__Properties__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2159:1: ( ( 'interactiontype=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2160:1: ( 'interactiontype=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2160:1: ( 'interactiontype=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2161:1: 'interactiontype='
            {
             before(grammarAccess.getPropertiesAccess().getInteractiontypeKeyword_3_0()); 
            match(input,27,FOLLOW_27_in_rule__Properties__Group_3__0__Impl4337); 
             after(grammarAccess.getPropertiesAccess().getInteractiontypeKeyword_3_0()); 

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
    // $ANTLR end "rule__Properties__Group_3__0__Impl"


    // $ANTLR start "rule__Properties__Group_3__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2174:1: rule__Properties__Group_3__1 : rule__Properties__Group_3__1__Impl ;
    public final void rule__Properties__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2178:1: ( rule__Properties__Group_3__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2179:2: rule__Properties__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Properties__Group_3__1__Impl_in_rule__Properties__Group_3__14368);
            rule__Properties__Group_3__1__Impl();

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
    // $ANTLR end "rule__Properties__Group_3__1"


    // $ANTLR start "rule__Properties__Group_3__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2185:1: rule__Properties__Group_3__1__Impl : ( ( ( rule__Properties__InteractiontypeAssignment_3_1 ) ) ( ( rule__Properties__InteractiontypeAssignment_3_1 )* ) ) ;
    public final void rule__Properties__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2189:1: ( ( ( ( rule__Properties__InteractiontypeAssignment_3_1 ) ) ( ( rule__Properties__InteractiontypeAssignment_3_1 )* ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2190:1: ( ( ( rule__Properties__InteractiontypeAssignment_3_1 ) ) ( ( rule__Properties__InteractiontypeAssignment_3_1 )* ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2190:1: ( ( ( rule__Properties__InteractiontypeAssignment_3_1 ) ) ( ( rule__Properties__InteractiontypeAssignment_3_1 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2191:1: ( ( rule__Properties__InteractiontypeAssignment_3_1 ) ) ( ( rule__Properties__InteractiontypeAssignment_3_1 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2191:1: ( ( rule__Properties__InteractiontypeAssignment_3_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2192:1: ( rule__Properties__InteractiontypeAssignment_3_1 )
            {
             before(grammarAccess.getPropertiesAccess().getInteractiontypeAssignment_3_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2193:1: ( rule__Properties__InteractiontypeAssignment_3_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2193:2: rule__Properties__InteractiontypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Properties__InteractiontypeAssignment_3_1_in_rule__Properties__Group_3__1__Impl4397);
            rule__Properties__InteractiontypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertiesAccess().getInteractiontypeAssignment_3_1()); 

            }

            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2196:1: ( ( rule__Properties__InteractiontypeAssignment_3_1 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2197:1: ( rule__Properties__InteractiontypeAssignment_3_1 )*
            {
             before(grammarAccess.getPropertiesAccess().getInteractiontypeAssignment_3_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2198:1: ( rule__Properties__InteractiontypeAssignment_3_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=14 && LA19_0<=15)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2198:2: rule__Properties__InteractiontypeAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__Properties__InteractiontypeAssignment_3_1_in_rule__Properties__Group_3__1__Impl4409);
            	    rule__Properties__InteractiontypeAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getPropertiesAccess().getInteractiontypeAssignment_3_1()); 

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
    // $ANTLR end "rule__Properties__Group_3__1__Impl"


    // $ANTLR start "rule__LabelDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2213:1: rule__LabelDefinition__Group__0 : rule__LabelDefinition__Group__0__Impl rule__LabelDefinition__Group__1 ;
    public final void rule__LabelDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2217:1: ( rule__LabelDefinition__Group__0__Impl rule__LabelDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2218:2: rule__LabelDefinition__Group__0__Impl rule__LabelDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__0__Impl_in_rule__LabelDefinition__Group__04446);
            rule__LabelDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelDefinition__Group__1_in_rule__LabelDefinition__Group__04449);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2225:1: rule__LabelDefinition__Group__0__Impl : ( ( rule__LabelDefinition__NameAssignment_0 ) ) ;
    public final void rule__LabelDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2229:1: ( ( ( rule__LabelDefinition__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2230:1: ( ( rule__LabelDefinition__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2230:1: ( ( rule__LabelDefinition__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2231:1: ( rule__LabelDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getLabelDefinitionAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2232:1: ( rule__LabelDefinition__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2232:2: rule__LabelDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__LabelDefinition__NameAssignment_0_in_rule__LabelDefinition__Group__0__Impl4476);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2242:1: rule__LabelDefinition__Group__1 : rule__LabelDefinition__Group__1__Impl rule__LabelDefinition__Group__2 ;
    public final void rule__LabelDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2246:1: ( rule__LabelDefinition__Group__1__Impl rule__LabelDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2247:2: rule__LabelDefinition__Group__1__Impl rule__LabelDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__1__Impl_in_rule__LabelDefinition__Group__14506);
            rule__LabelDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelDefinition__Group__2_in_rule__LabelDefinition__Group__14509);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2254:1: rule__LabelDefinition__Group__1__Impl : ( 'as' ) ;
    public final void rule__LabelDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2258:1: ( ( 'as' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2259:1: ( 'as' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2259:1: ( 'as' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2260:1: 'as'
            {
             before(grammarAccess.getLabelDefinitionAccess().getAsKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__LabelDefinition__Group__1__Impl4537); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2273:1: rule__LabelDefinition__Group__2 : rule__LabelDefinition__Group__2__Impl rule__LabelDefinition__Group__3 ;
    public final void rule__LabelDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2277:1: ( rule__LabelDefinition__Group__2__Impl rule__LabelDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2278:2: rule__LabelDefinition__Group__2__Impl rule__LabelDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__2__Impl_in_rule__LabelDefinition__Group__24568);
            rule__LabelDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelDefinition__Group__3_in_rule__LabelDefinition__Group__24571);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2285:1: rule__LabelDefinition__Group__2__Impl : ( ( rule__LabelDefinition__IdAssignment_2 ) ) ;
    public final void rule__LabelDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2289:1: ( ( ( rule__LabelDefinition__IdAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2290:1: ( ( rule__LabelDefinition__IdAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2290:1: ( ( rule__LabelDefinition__IdAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2291:1: ( rule__LabelDefinition__IdAssignment_2 )
            {
             before(grammarAccess.getLabelDefinitionAccess().getIdAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2292:1: ( rule__LabelDefinition__IdAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2292:2: rule__LabelDefinition__IdAssignment_2
            {
            pushFollow(FOLLOW_rule__LabelDefinition__IdAssignment_2_in_rule__LabelDefinition__Group__2__Impl4598);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2302:1: rule__LabelDefinition__Group__3 : rule__LabelDefinition__Group__3__Impl ;
    public final void rule__LabelDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2306:1: ( rule__LabelDefinition__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2307:2: rule__LabelDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__3__Impl_in_rule__LabelDefinition__Group__34628);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2313:1: rule__LabelDefinition__Group__3__Impl : ( ( rule__LabelDefinition__PropertiesAssignment_3 )? ) ;
    public final void rule__LabelDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2317:1: ( ( ( rule__LabelDefinition__PropertiesAssignment_3 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2318:1: ( ( rule__LabelDefinition__PropertiesAssignment_3 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2318:1: ( ( rule__LabelDefinition__PropertiesAssignment_3 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2319:1: ( rule__LabelDefinition__PropertiesAssignment_3 )?
            {
             before(grammarAccess.getLabelDefinitionAccess().getPropertiesAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2320:1: ( rule__LabelDefinition__PropertiesAssignment_3 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2320:2: rule__LabelDefinition__PropertiesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__LabelDefinition__PropertiesAssignment_3_in_rule__LabelDefinition__Group__3__Impl4655);
                    rule__LabelDefinition__PropertiesAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLabelDefinitionAccess().getPropertiesAssignment_3()); 

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


    // $ANTLR start "rule__UIDescription__TypeDefinitionAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2339:1: rule__UIDescription__TypeDefinitionAssignment_0 : ( ruleTypeDefinition ) ;
    public final void rule__UIDescription__TypeDefinitionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2343:1: ( ( ruleTypeDefinition ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2344:1: ( ruleTypeDefinition )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2344:1: ( ruleTypeDefinition )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2345:1: ruleTypeDefinition
            {
             before(grammarAccess.getUIDescriptionAccess().getTypeDefinitionTypeDefinitionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTypeDefinition_in_rule__UIDescription__TypeDefinitionAssignment_04699);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2354:1: rule__UIDescription__PropertyAssignment_1 : ( ruleProperty ) ;
    public final void rule__UIDescription__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2358:1: ( ( ruleProperty ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2359:1: ( ruleProperty )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2359:1: ( ruleProperty )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2360:1: ruleProperty
            {
             before(grammarAccess.getUIDescriptionAccess().getPropertyPropertyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__UIDescription__PropertyAssignment_14730);
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


    // $ANTLR start "rule__UIDescription__UsedDescriptionsAssignment_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2369:1: rule__UIDescription__UsedDescriptionsAssignment_2 : ( ruleUsedDescriptions ) ;
    public final void rule__UIDescription__UsedDescriptionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2373:1: ( ( ruleUsedDescriptions ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2374:1: ( ruleUsedDescriptions )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2374:1: ( ruleUsedDescriptions )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2375:1: ruleUsedDescriptions
            {
             before(grammarAccess.getUIDescriptionAccess().getUsedDescriptionsUsedDescriptionsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleUsedDescriptions_in_rule__UIDescription__UsedDescriptionsAssignment_24761);
            ruleUsedDescriptions();

            state._fsp--;

             after(grammarAccess.getUIDescriptionAccess().getUsedDescriptionsUsedDescriptionsParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__UIDescription__UsedDescriptionsAssignment_2"


    // $ANTLR start "rule__UIDescription__RefinementsAssignment_3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2384:1: rule__UIDescription__RefinementsAssignment_3 : ( ruleRefinement ) ;
    public final void rule__UIDescription__RefinementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2388:1: ( ( ruleRefinement ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2389:1: ( ruleRefinement )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2389:1: ( ruleRefinement )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2390:1: ruleRefinement
            {
             before(grammarAccess.getUIDescriptionAccess().getRefinementsRefinementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRefinement_in_rule__UIDescription__RefinementsAssignment_34792);
            ruleRefinement();

            state._fsp--;

             after(grammarAccess.getUIDescriptionAccess().getRefinementsRefinementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__UIDescription__RefinementsAssignment_3"


    // $ANTLR start "rule__UIDescription__DefinitionsAssignment_4"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2399:1: rule__UIDescription__DefinitionsAssignment_4 : ( ruleDefinition ) ;
    public final void rule__UIDescription__DefinitionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2403:1: ( ( ruleDefinition ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2404:1: ( ruleDefinition )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2404:1: ( ruleDefinition )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2405:1: ruleDefinition
            {
             before(grammarAccess.getUIDescriptionAccess().getDefinitionsDefinitionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleDefinition_in_rule__UIDescription__DefinitionsAssignment_44823);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getUIDescriptionAccess().getDefinitionsDefinitionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__UIDescription__DefinitionsAssignment_4"


    // $ANTLR start "rule__UIDescription__StructureAssignment_5"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2414:1: rule__UIDescription__StructureAssignment_5 : ( ruleStructure ) ;
    public final void rule__UIDescription__StructureAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2418:1: ( ( ruleStructure ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2419:1: ( ruleStructure )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2419:1: ( ruleStructure )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2420:1: ruleStructure
            {
             before(grammarAccess.getUIDescriptionAccess().getStructureStructureParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleStructure_in_rule__UIDescription__StructureAssignment_54854);
            ruleStructure();

            state._fsp--;

             after(grammarAccess.getUIDescriptionAccess().getStructureStructureParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__UIDescription__StructureAssignment_5"


    // $ANTLR start "rule__Structure__NameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2429:1: rule__Structure__NameAssignment_0 : ( ( 'Structure' ) ) ;
    public final void rule__Structure__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2433:1: ( ( ( 'Structure' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2434:1: ( ( 'Structure' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2434:1: ( ( 'Structure' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2435:1: ( 'Structure' )
            {
             before(grammarAccess.getStructureAccess().getNameStructureKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2436:1: ( 'Structure' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2437:1: 'Structure'
            {
             before(grammarAccess.getStructureAccess().getNameStructureKeyword_0_0()); 
            match(input,29,FOLLOW_29_in_rule__Structure__NameAssignment_04890); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2452:1: rule__Structure__OrderedElementsAssignment_2 : ( ruleElement ) ;
    public final void rule__Structure__OrderedElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2456:1: ( ( ruleElement ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2457:1: ( ruleElement )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2457:1: ( ruleElement )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2458:1: ruleElement
            {
             before(grammarAccess.getStructureAccess().getOrderedElementsElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleElement_in_rule__Structure__OrderedElementsAssignment_24929);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2467:1: rule__Element__IdAssignment : ( RULE_STRING ) ;
    public final void rule__Element__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2471:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2472:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2472:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2473:1: RULE_STRING
            {
             before(grammarAccess.getElementAccess().getIdSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Element__IdAssignment4960); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2482:1: rule__Refinement__ConcreteRefinementAssignment_0 : ( ruleComponentRefinement ) ;
    public final void rule__Refinement__ConcreteRefinementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2486:1: ( ( ruleComponentRefinement ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2487:1: ( ruleComponentRefinement )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2487:1: ( ruleComponentRefinement )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2488:1: ruleComponentRefinement
            {
             before(grammarAccess.getRefinementAccess().getConcreteRefinementComponentRefinementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleComponentRefinement_in_rule__Refinement__ConcreteRefinementAssignment_04991);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2497:1: rule__ButtonRefinement__NameAssignment_0 : ( ( 'Button' ) ) ;
    public final void rule__ButtonRefinement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2501:1: ( ( ( 'Button' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2502:1: ( ( 'Button' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2502:1: ( ( 'Button' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2503:1: ( 'Button' )
            {
             before(grammarAccess.getButtonRefinementAccess().getNameButtonKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2504:1: ( 'Button' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2505:1: 'Button'
            {
             before(grammarAccess.getButtonRefinementAccess().getNameButtonKeyword_0_0()); 
            match(input,30,FOLLOW_30_in_rule__ButtonRefinement__NameAssignment_05027); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2520:1: rule__ButtonRefinement__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ButtonRefinement__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2524:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2525:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2525:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2526:1: RULE_STRING
            {
             before(grammarAccess.getButtonRefinementAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ButtonRefinement__IdAssignment_25066); 
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


    // $ANTLR start "rule__ButtonRefinement__PropertiesAssignment_3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2535:1: rule__ButtonRefinement__PropertiesAssignment_3 : ( ruleProperties ) ;
    public final void rule__ButtonRefinement__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2539:1: ( ( ruleProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2540:1: ( ruleProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2540:1: ( ruleProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2541:1: ruleProperties
            {
             before(grammarAccess.getButtonRefinementAccess().getPropertiesPropertiesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleProperties_in_rule__ButtonRefinement__PropertiesAssignment_35097);
            ruleProperties();

            state._fsp--;

             after(grammarAccess.getButtonRefinementAccess().getPropertiesPropertiesParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ButtonRefinement__PropertiesAssignment_3"


    // $ANTLR start "rule__LabelRefinement__NameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2550:1: rule__LabelRefinement__NameAssignment_0 : ( ( 'Label' ) ) ;
    public final void rule__LabelRefinement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2554:1: ( ( ( 'Label' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2555:1: ( ( 'Label' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2555:1: ( ( 'Label' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2556:1: ( 'Label' )
            {
             before(grammarAccess.getLabelRefinementAccess().getNameLabelKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2557:1: ( 'Label' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2558:1: 'Label'
            {
             before(grammarAccess.getLabelRefinementAccess().getNameLabelKeyword_0_0()); 
            match(input,31,FOLLOW_31_in_rule__LabelRefinement__NameAssignment_05133); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2573:1: rule__LabelRefinement__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LabelRefinement__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2577:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2578:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2578:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2579:1: RULE_STRING
            {
             before(grammarAccess.getLabelRefinementAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LabelRefinement__IdAssignment_25172); 
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


    // $ANTLR start "rule__LabelRefinement__PropertiesAssignment_3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2588:1: rule__LabelRefinement__PropertiesAssignment_3 : ( ruleProperties ) ;
    public final void rule__LabelRefinement__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2592:1: ( ( ruleProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2593:1: ( ruleProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2593:1: ( ruleProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2594:1: ruleProperties
            {
             before(grammarAccess.getLabelRefinementAccess().getPropertiesPropertiesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleProperties_in_rule__LabelRefinement__PropertiesAssignment_35203);
            ruleProperties();

            state._fsp--;

             after(grammarAccess.getLabelRefinementAccess().getPropertiesPropertiesParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__LabelRefinement__PropertiesAssignment_3"


    // $ANTLR start "rule__Property__PropertiesFileAssignment_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2603:1: rule__Property__PropertiesFileAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Property__PropertiesFileAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2607:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2608:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2608:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2609:1: RULE_STRING
            {
             before(grammarAccess.getPropertyAccess().getPropertiesFileSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Property__PropertiesFileAssignment_15234); 
             after(grammarAccess.getPropertyAccess().getPropertiesFileSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Property__PropertiesFileAssignment_1"


    // $ANTLR start "rule__UsedDescriptions__DescriptionAssignment_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2618:1: rule__UsedDescriptions__DescriptionAssignment_1 : ( ruleDescriptionType ) ;
    public final void rule__UsedDescriptions__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2622:1: ( ( ruleDescriptionType ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2623:1: ( ruleDescriptionType )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2623:1: ( ruleDescriptionType )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2624:1: ruleDescriptionType
            {
             before(grammarAccess.getUsedDescriptionsAccess().getDescriptionDescriptionTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDescriptionType_in_rule__UsedDescriptions__DescriptionAssignment_15265);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2633:1: rule__UsedDescriptions__IdAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__UsedDescriptions__IdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2637:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2638:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2638:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2639:1: RULE_STRING
            {
             before(grammarAccess.getUsedDescriptionsAccess().getIdSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UsedDescriptions__IdAssignment_2_15296); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2648:1: rule__Definition__ConcreteDefitionAssignment_0 : ( ruleComponentDefinition ) ;
    public final void rule__Definition__ConcreteDefitionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2652:1: ( ( ruleComponentDefinition ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2653:1: ( ruleComponentDefinition )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2653:1: ( ruleComponentDefinition )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2654:1: ruleComponentDefinition
            {
             before(grammarAccess.getDefinitionAccess().getConcreteDefitionComponentDefinitionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleComponentDefinition_in_rule__Definition__ConcreteDefitionAssignment_05327);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2663:1: rule__TypeDefinition__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__TypeDefinition__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2667:1: ( ( ruleType ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2668:1: ( ruleType )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2668:1: ( ruleType )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2669:1: ruleType
            {
             before(grammarAccess.getTypeDefinitionAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__TypeDefinition__TypeAssignment_15358);
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


    // $ANTLR start "rule__UIDescriptionImport__DescriptionNameAssignment"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2678:1: rule__UIDescriptionImport__DescriptionNameAssignment : ( RULE_STRING ) ;
    public final void rule__UIDescriptionImport__DescriptionNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2682:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2683:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2683:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2684:1: RULE_STRING
            {
             before(grammarAccess.getUIDescriptionImportAccess().getDescriptionNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UIDescriptionImport__DescriptionNameAssignment5389); 
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


    // $ANTLR start "rule__Multiselection__DescriptionNameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2693:1: rule__Multiselection__DescriptionNameAssignment_0 : ( ( 'Multiselection' ) ) ;
    public final void rule__Multiselection__DescriptionNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2697:1: ( ( ( 'Multiselection' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2698:1: ( ( 'Multiselection' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2698:1: ( ( 'Multiselection' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2699:1: ( 'Multiselection' )
            {
             before(grammarAccess.getMultiselectionAccess().getDescriptionNameMultiselectionKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2700:1: ( 'Multiselection' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2701:1: 'Multiselection'
            {
             before(grammarAccess.getMultiselectionAccess().getDescriptionNameMultiselectionKeyword_0_0()); 
            match(input,32,FOLLOW_32_in_rule__Multiselection__DescriptionNameAssignment_05425); 
             after(grammarAccess.getMultiselectionAccess().getDescriptionNameMultiselectionKeyword_0_0()); 

            }

             after(grammarAccess.getMultiselectionAccess().getDescriptionNameMultiselectionKeyword_0_0()); 

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
    // $ANTLR end "rule__Multiselection__DescriptionNameAssignment_0"


    // $ANTLR start "rule__Multiselection__InputTypeAssignment_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2716:1: rule__Multiselection__InputTypeAssignment_1 : ( RULE_INPUT_DESCRIPTION ) ;
    public final void rule__Multiselection__InputTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2720:1: ( ( RULE_INPUT_DESCRIPTION ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2721:1: ( RULE_INPUT_DESCRIPTION )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2721:1: ( RULE_INPUT_DESCRIPTION )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2722:1: RULE_INPUT_DESCRIPTION
            {
             before(grammarAccess.getMultiselectionAccess().getInputTypeINPUT_DESCRIPTIONTerminalRuleCall_1_0()); 
            match(input,RULE_INPUT_DESCRIPTION,FOLLOW_RULE_INPUT_DESCRIPTION_in_rule__Multiselection__InputTypeAssignment_15464); 
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


    // $ANTLR start "rule__ButtonDefinition__NameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2731:1: rule__ButtonDefinition__NameAssignment_0 : ( ( 'Button' ) ) ;
    public final void rule__ButtonDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2735:1: ( ( ( 'Button' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2736:1: ( ( 'Button' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2736:1: ( ( 'Button' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2737:1: ( 'Button' )
            {
             before(grammarAccess.getButtonDefinitionAccess().getNameButtonKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2738:1: ( 'Button' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2739:1: 'Button'
            {
             before(grammarAccess.getButtonDefinitionAccess().getNameButtonKeyword_0_0()); 
            match(input,30,FOLLOW_30_in_rule__ButtonDefinition__NameAssignment_05500); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2754:1: rule__ButtonDefinition__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ButtonDefinition__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2758:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2759:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2759:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2760:1: RULE_STRING
            {
             before(grammarAccess.getButtonDefinitionAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ButtonDefinition__IdAssignment_25539); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2769:1: rule__ButtonDefinition__PropertiesAssignment_3 : ( ruleProperties ) ;
    public final void rule__ButtonDefinition__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2773:1: ( ( ruleProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2774:1: ( ruleProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2774:1: ( ruleProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2775:1: ruleProperties
            {
             before(grammarAccess.getButtonDefinitionAccess().getPropertiesPropertiesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleProperties_in_rule__ButtonDefinition__PropertiesAssignment_35570);
            ruleProperties();

            state._fsp--;

             after(grammarAccess.getButtonDefinitionAccess().getPropertiesPropertiesParserRuleCall_3_0()); 

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


    // $ANTLR start "rule__Properties__PropertyKeyAssignment_1_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2784:1: rule__Properties__PropertyKeyAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Properties__PropertyKeyAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2788:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2789:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2789:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2790:1: RULE_STRING
            {
             before(grammarAccess.getPropertiesAccess().getPropertyKeySTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Properties__PropertyKeyAssignment_1_15601); 
             after(grammarAccess.getPropertiesAccess().getPropertyKeySTRINGTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Properties__PropertyKeyAssignment_1_1"


    // $ANTLR start "rule__Properties__TextAssignment_2_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2799:1: rule__Properties__TextAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Properties__TextAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2803:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2804:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2804:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2805:1: RULE_STRING
            {
             before(grammarAccess.getPropertiesAccess().getTextSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Properties__TextAssignment_2_15632); 
             after(grammarAccess.getPropertiesAccess().getTextSTRINGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Properties__TextAssignment_2_1"


    // $ANTLR start "rule__Properties__InteractiontypeAssignment_3_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2814:1: rule__Properties__InteractiontypeAssignment_3_1 : ( ruleInteractiontype ) ;
    public final void rule__Properties__InteractiontypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2818:1: ( ( ruleInteractiontype ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2819:1: ( ruleInteractiontype )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2819:1: ( ruleInteractiontype )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2820:1: ruleInteractiontype
            {
             before(grammarAccess.getPropertiesAccess().getInteractiontypeInteractiontypeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleInteractiontype_in_rule__Properties__InteractiontypeAssignment_3_15663);
            ruleInteractiontype();

            state._fsp--;

             after(grammarAccess.getPropertiesAccess().getInteractiontypeInteractiontypeParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Properties__InteractiontypeAssignment_3_1"


    // $ANTLR start "rule__LabelDefinition__NameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2829:1: rule__LabelDefinition__NameAssignment_0 : ( ( 'Label' ) ) ;
    public final void rule__LabelDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2833:1: ( ( ( 'Label' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2834:1: ( ( 'Label' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2834:1: ( ( 'Label' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2835:1: ( 'Label' )
            {
             before(grammarAccess.getLabelDefinitionAccess().getNameLabelKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2836:1: ( 'Label' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2837:1: 'Label'
            {
             before(grammarAccess.getLabelDefinitionAccess().getNameLabelKeyword_0_0()); 
            match(input,31,FOLLOW_31_in_rule__LabelDefinition__NameAssignment_05699); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2852:1: rule__LabelDefinition__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LabelDefinition__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2856:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2857:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2857:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2858:1: RULE_STRING
            {
             before(grammarAccess.getLabelDefinitionAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LabelDefinition__IdAssignment_25738); 
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


    // $ANTLR start "rule__LabelDefinition__PropertiesAssignment_3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2867:1: rule__LabelDefinition__PropertiesAssignment_3 : ( ruleProperties ) ;
    public final void rule__LabelDefinition__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2871:1: ( ( ruleProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2872:1: ( ruleProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2872:1: ( ruleProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2873:1: ruleProperties
            {
             before(grammarAccess.getLabelDefinitionAccess().getPropertiesPropertiesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleProperties_in_rule__LabelDefinition__PropertiesAssignment_35769);
            ruleProperties();

            state._fsp--;

             after(grammarAccess.getLabelDefinitionAccess().getPropertiesPropertiesParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__LabelDefinition__PropertiesAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleUIDescription_in_entryRuleUIDescription61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIDescription68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__0_in_ruleUIDescription94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructure_in_entryRuleStructure121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructure128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__Group__0_in_ruleStructure154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__IdAssignment_in_ruleElement214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefinement_in_entryRuleRefinement241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefinement248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refinement__Group__0_in_ruleRefinement274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentRefinement_in_entryRuleComponentRefinement301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentRefinement308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentRefinement__Alternatives_in_ruleComponentRefinement334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonRefinement_in_entryRuleButtonRefinement361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonRefinement368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__0_in_ruleButtonRefinement394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelRefinement_in_entryRuleLabelRefinement421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelRefinement428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__0_in_ruleLabelRefinement454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsedDescriptions_in_entryRuleUsedDescriptions541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsedDescriptions548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group__0_in_ruleUsedDescriptions574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescriptionType_in_entryRuleDescriptionType601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescriptionType608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DescriptionType__Alternatives_in_ruleDescriptionType634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0_in_ruleDefinition694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__0_in_ruleTypeDefinition754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIDescriptionImport_in_entryRuleUIDescriptionImport841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIDescriptionImport848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescriptionImport__DescriptionNameAssignment_in_ruleUIDescriptionImport874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexComponent_in_entryRuleComplexComponent901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexComponent908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiselection_in_ruleComplexComponent934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiselection_in_entryRuleMultiselection960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiselection967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiselection__Group__0_in_ruleMultiselection993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDefinition_in_entryRuleComponentDefinition1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentDefinition1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentDefinition__Alternatives_in_ruleComponentDefinition1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonDefinition_in_entryRuleButtonDefinition1080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonDefinition1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__0_in_ruleButtonDefinition1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperties_in_entryRuleProperties1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperties1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__Group__0_in_ruleProperties1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelDefinition_in_entryRuleLabelDefinition1200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelDefinition1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__0_in_ruleLabelDefinition1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractiontype_in_entryRuleInteractiontype1260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractiontype1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interactiontype__Alternatives_in_ruleInteractiontype1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelRefinement_in_rule__ComponentRefinement__Alternatives1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonRefinement_in_rule__ComponentRefinement__Alternatives1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIDescriptionImport_in_rule__DescriptionType__Alternatives1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexComponent_in_rule__DescriptionType__Alternatives1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Type__Alternatives1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Type__Alternatives1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelDefinition_in_rule__ComponentDefinition__Alternatives1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonDefinition_in_rule__ComponentDefinition__Alternatives1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Interactiontype__Alternatives1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Interactiontype__Alternatives1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__0__Impl_in_rule__UIDescription__Group__01584 = new BitSet(new long[]{0x00000000E0300000L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__1_in_rule__UIDescription__Group__01587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__TypeDefinitionAssignment_0_in_rule__UIDescription__Group__0__Impl1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__1__Impl_in_rule__UIDescription__Group__11644 = new BitSet(new long[]{0x00000000E0300000L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__2_in_rule__UIDescription__Group__11647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__PropertyAssignment_1_in_rule__UIDescription__Group__1__Impl1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__2__Impl_in_rule__UIDescription__Group__21705 = new BitSet(new long[]{0x00000000E0300000L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__3_in_rule__UIDescription__Group__21708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__UsedDescriptionsAssignment_2_in_rule__UIDescription__Group__2__Impl1735 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__3__Impl_in_rule__UIDescription__Group__31766 = new BitSet(new long[]{0x00000000E0300000L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__4_in_rule__UIDescription__Group__31769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__RefinementsAssignment_3_in_rule__UIDescription__Group__3__Impl1796 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__4__Impl_in_rule__UIDescription__Group__41827 = new BitSet(new long[]{0x00000000E0300000L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__5_in_rule__UIDescription__Group__41830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__DefinitionsAssignment_4_in_rule__UIDescription__Group__4__Impl1857 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__5__Impl_in_rule__UIDescription__Group__51888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__StructureAssignment_5_in_rule__UIDescription__Group__5__Impl1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__Group__0__Impl_in_rule__Structure__Group__01957 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Structure__Group__1_in_rule__Structure__Group__01960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__NameAssignment_0_in_rule__Structure__Group__0__Impl1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__Group__1__Impl_in_rule__Structure__Group__12017 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Structure__Group__2_in_rule__Structure__Group__12020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Structure__Group__1__Impl2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__Group__2__Impl_in_rule__Structure__Group__22079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__OrderedElementsAssignment_2_in_rule__Structure__Group__2__Impl2106 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Refinement__Group__0__Impl_in_rule__Refinement__Group__02143 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Refinement__Group__1_in_rule__Refinement__Group__02146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refinement__ConcreteRefinementAssignment_0_in_rule__Refinement__Group__0__Impl2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refinement__Group__1__Impl_in_rule__Refinement__Group__12203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Refinement__Group__1__Impl2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__0__Impl_in_rule__ButtonRefinement__Group__02266 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__1_in_rule__ButtonRefinement__Group__02269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__NameAssignment_0_in_rule__ButtonRefinement__Group__0__Impl2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__1__Impl_in_rule__ButtonRefinement__Group__12326 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__2_in_rule__ButtonRefinement__Group__12329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ButtonRefinement__Group__1__Impl2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__2__Impl_in_rule__ButtonRefinement__Group__22388 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__3_in_rule__ButtonRefinement__Group__22391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__IdAssignment_2_in_rule__ButtonRefinement__Group__2__Impl2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__3__Impl_in_rule__ButtonRefinement__Group__32448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__PropertiesAssignment_3_in_rule__ButtonRefinement__Group__3__Impl2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__0__Impl_in_rule__LabelRefinement__Group__02514 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__1_in_rule__LabelRefinement__Group__02517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__NameAssignment_0_in_rule__LabelRefinement__Group__0__Impl2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__1__Impl_in_rule__LabelRefinement__Group__12574 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__2_in_rule__LabelRefinement__Group__12577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__LabelRefinement__Group__1__Impl2605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__2__Impl_in_rule__LabelRefinement__Group__22636 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__3_in_rule__LabelRefinement__Group__22639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__IdAssignment_2_in_rule__LabelRefinement__Group__2__Impl2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__3__Impl_in_rule__LabelRefinement__Group__32696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__PropertiesAssignment_3_in_rule__LabelRefinement__Group__3__Impl2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__02762 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__02765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Property__Group__0__Impl2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__12824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__PropertiesFileAssignment_1_in_rule__Property__Group__1__Impl2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group__0__Impl_in_rule__UsedDescriptions__Group__02885 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group__1_in_rule__UsedDescriptions__Group__02888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__UsedDescriptions__Group__0__Impl2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group__1__Impl_in_rule__UsedDescriptions__Group__12947 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group__2_in_rule__UsedDescriptions__Group__12950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__DescriptionAssignment_1_in_rule__UsedDescriptions__Group__1__Impl2977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group__2__Impl_in_rule__UsedDescriptions__Group__23007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group_2__0_in_rule__UsedDescriptions__Group__2__Impl3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group_2__0__Impl_in_rule__UsedDescriptions__Group_2__03071 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group_2__1_in_rule__UsedDescriptions__Group_2__03074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__UsedDescriptions__Group_2__0__Impl3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group_2__1__Impl_in_rule__UsedDescriptions__Group_2__13133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__IdAssignment_2_1_in_rule__UsedDescriptions__Group_2__1__Impl3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__03194 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__03197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__ConcreteDefitionAssignment_0_in_rule__Definition__Group__0__Impl3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__13254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Definition__Group__1__Impl3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__0__Impl_in_rule__TypeDefinition__Group__03317 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__1_in_rule__TypeDefinition__Group__03320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TypeDefinition__Group__0__Impl3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__1__Impl_in_rule__TypeDefinition__Group__13379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__TypeAssignment_1_in_rule__TypeDefinition__Group__1__Impl3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiselection__Group__0__Impl_in_rule__Multiselection__Group__03440 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Multiselection__Group__1_in_rule__Multiselection__Group__03443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiselection__DescriptionNameAssignment_0_in_rule__Multiselection__Group__0__Impl3470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiselection__Group__1__Impl_in_rule__Multiselection__Group__13500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiselection__InputTypeAssignment_1_in_rule__Multiselection__Group__1__Impl3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__0__Impl_in_rule__ButtonDefinition__Group__03562 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__1_in_rule__ButtonDefinition__Group__03565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__NameAssignment_0_in_rule__ButtonDefinition__Group__0__Impl3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__1__Impl_in_rule__ButtonDefinition__Group__13622 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__2_in_rule__ButtonDefinition__Group__13625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ButtonDefinition__Group__1__Impl3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__2__Impl_in_rule__ButtonDefinition__Group__23684 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__3_in_rule__ButtonDefinition__Group__23687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__IdAssignment_2_in_rule__ButtonDefinition__Group__2__Impl3714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__3__Impl_in_rule__ButtonDefinition__Group__33744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__PropertiesAssignment_3_in_rule__ButtonDefinition__Group__3__Impl3771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__Group__0__Impl_in_rule__Properties__Group__03810 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_rule__Properties__Group__1_in_rule__Properties__Group__03813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Properties__Group__0__Impl3841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__Group__1__Impl_in_rule__Properties__Group__13872 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_rule__Properties__Group__2_in_rule__Properties__Group__13875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__Group_1__0_in_rule__Properties__Group__1__Impl3902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__Group__2__Impl_in_rule__Properties__Group__23933 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_rule__Properties__Group__3_in_rule__Properties__Group__23936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__Group_2__0_in_rule__Properties__Group__2__Impl3963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__Group__3__Impl_in_rule__Properties__Group__33994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__Group_3__0_in_rule__Properties__Group__3__Impl4021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__Group_1__0__Impl_in_rule__Properties__Group_1__04060 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Properties__Group_1__1_in_rule__Properties__Group_1__04063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Properties__Group_1__0__Impl4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__Group_1__1__Impl_in_rule__Properties__Group_1__14122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__PropertyKeyAssignment_1_1_in_rule__Properties__Group_1__1__Impl4149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__Group_2__0__Impl_in_rule__Properties__Group_2__04183 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Properties__Group_2__1_in_rule__Properties__Group_2__04186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Properties__Group_2__0__Impl4214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__Group_2__1__Impl_in_rule__Properties__Group_2__14245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__TextAssignment_2_1_in_rule__Properties__Group_2__1__Impl4272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__Group_3__0__Impl_in_rule__Properties__Group_3__04306 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Properties__Group_3__1_in_rule__Properties__Group_3__04309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Properties__Group_3__0__Impl4337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__Group_3__1__Impl_in_rule__Properties__Group_3__14368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__InteractiontypeAssignment_3_1_in_rule__Properties__Group_3__1__Impl4397 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_rule__Properties__InteractiontypeAssignment_3_1_in_rule__Properties__Group_3__1__Impl4409 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__0__Impl_in_rule__LabelDefinition__Group__04446 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__1_in_rule__LabelDefinition__Group__04449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__NameAssignment_0_in_rule__LabelDefinition__Group__0__Impl4476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__1__Impl_in_rule__LabelDefinition__Group__14506 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__2_in_rule__LabelDefinition__Group__14509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__LabelDefinition__Group__1__Impl4537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__2__Impl_in_rule__LabelDefinition__Group__24568 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__3_in_rule__LabelDefinition__Group__24571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__IdAssignment_2_in_rule__LabelDefinition__Group__2__Impl4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__3__Impl_in_rule__LabelDefinition__Group__34628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__PropertiesAssignment_3_in_rule__LabelDefinition__Group__3__Impl4655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_rule__UIDescription__TypeDefinitionAssignment_04699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__UIDescription__PropertyAssignment_14730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsedDescriptions_in_rule__UIDescription__UsedDescriptionsAssignment_24761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefinement_in_rule__UIDescription__RefinementsAssignment_34792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_rule__UIDescription__DefinitionsAssignment_44823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructure_in_rule__UIDescription__StructureAssignment_54854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Structure__NameAssignment_04890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Structure__OrderedElementsAssignment_24929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Element__IdAssignment4960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentRefinement_in_rule__Refinement__ConcreteRefinementAssignment_04991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ButtonRefinement__NameAssignment_05027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ButtonRefinement__IdAssignment_25066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperties_in_rule__ButtonRefinement__PropertiesAssignment_35097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__LabelRefinement__NameAssignment_05133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__LabelRefinement__IdAssignment_25172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperties_in_rule__LabelRefinement__PropertiesAssignment_35203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Property__PropertiesFileAssignment_15234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescriptionType_in_rule__UsedDescriptions__DescriptionAssignment_15265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__UsedDescriptions__IdAssignment_2_15296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDefinition_in_rule__Definition__ConcreteDefitionAssignment_05327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__TypeDefinition__TypeAssignment_15358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__UIDescriptionImport__DescriptionNameAssignment5389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Multiselection__DescriptionNameAssignment_05425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INPUT_DESCRIPTION_in_rule__Multiselection__InputTypeAssignment_15464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ButtonDefinition__NameAssignment_05500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ButtonDefinition__IdAssignment_25539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperties_in_rule__ButtonDefinition__PropertiesAssignment_35570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Properties__PropertyKeyAssignment_1_15601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Properties__TextAssignment_2_15632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractiontype_in_rule__Properties__InteractiontypeAssignment_3_15663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__LabelDefinition__NameAssignment_05699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__LabelDefinition__IdAssignment_25738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperties_in_rule__LabelDefinition__PropertiesAssignment_35769 = new BitSet(new long[]{0x0000000000000002L});

}