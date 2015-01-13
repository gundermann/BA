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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_TABNAME", "RULE_INPUT_DESCRIPTION", "RULE_WS", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'WINDOW'", "'INNERCOMPLEX'", "'Click'", "'ChangeText'", "':'", "';'", "'from:'", "'get properties from:'", "'use:'", "'as:'", "'type: '", "'->'", "'propertyKey='", "'text='", "'interactiontype='", "'as'", "'Structure'", "'Button'", "'Label'", "'TabView'", "'Multiselection'"
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:405:1: ruleType : ( ( rule__Type__IdAssignment ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:409:2: ( ( ( rule__Type__IdAssignment ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:410:1: ( ( rule__Type__IdAssignment ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:410:1: ( ( rule__Type__IdAssignment ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:411:1: ( rule__Type__IdAssignment )
            {
             before(grammarAccess.getTypeAccess().getIdAssignment()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:412:1: ( rule__Type__IdAssignment )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:412:2: rule__Type__IdAssignment
            {
            pushFollow(FOLLOW_rule__Type__IdAssignment_in_ruleType814);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:461:1: ruleComplexComponent : ( ( rule__ComplexComponent__Alternatives ) ) ;
    public final void ruleComplexComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:465:2: ( ( ( rule__ComplexComponent__Alternatives ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:466:1: ( ( rule__ComplexComponent__Alternatives ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:466:1: ( ( rule__ComplexComponent__Alternatives ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:467:1: ( rule__ComplexComponent__Alternatives )
            {
             before(grammarAccess.getComplexComponentAccess().getAlternatives()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:468:1: ( rule__ComplexComponent__Alternatives )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:468:2: rule__ComplexComponent__Alternatives
            {
            pushFollow(FOLLOW_rule__ComplexComponent__Alternatives_in_ruleComplexComponent934);
            rule__ComplexComponent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComplexComponentAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleTabView"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:480:1: entryRuleTabView : ruleTabView EOF ;
    public final void entryRuleTabView() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:481:1: ( ruleTabView EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:482:1: ruleTabView EOF
            {
             before(grammarAccess.getTabViewRule()); 
            pushFollow(FOLLOW_ruleTabView_in_entryRuleTabView961);
            ruleTabView();

            state._fsp--;

             after(grammarAccess.getTabViewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabView968); 

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
    // $ANTLR end "entryRuleTabView"


    // $ANTLR start "ruleTabView"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:489:1: ruleTabView : ( ( rule__TabView__Group__0 ) ) ;
    public final void ruleTabView() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:493:2: ( ( ( rule__TabView__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:494:1: ( ( rule__TabView__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:494:1: ( ( rule__TabView__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:495:1: ( rule__TabView__Group__0 )
            {
             before(grammarAccess.getTabViewAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:496:1: ( rule__TabView__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:496:2: rule__TabView__Group__0
            {
            pushFollow(FOLLOW_rule__TabView__Group__0_in_ruleTabView994);
            rule__TabView__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTabViewAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTabView"


    // $ANTLR start "entryRuleTabDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:508:1: entryRuleTabDefinition : ruleTabDefinition EOF ;
    public final void entryRuleTabDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:509:1: ( ruleTabDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:510:1: ruleTabDefinition EOF
            {
             before(grammarAccess.getTabDefinitionRule()); 
            pushFollow(FOLLOW_ruleTabDefinition_in_entryRuleTabDefinition1021);
            ruleTabDefinition();

            state._fsp--;

             after(grammarAccess.getTabDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabDefinition1028); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:517:1: ruleTabDefinition : ( ( rule__TabDefinition__NameAssignment ) ) ;
    public final void ruleTabDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:521:2: ( ( ( rule__TabDefinition__NameAssignment ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:522:1: ( ( rule__TabDefinition__NameAssignment ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:522:1: ( ( rule__TabDefinition__NameAssignment ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:523:1: ( rule__TabDefinition__NameAssignment )
            {
             before(grammarAccess.getTabDefinitionAccess().getNameAssignment()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:524:1: ( rule__TabDefinition__NameAssignment )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:524:2: rule__TabDefinition__NameAssignment
            {
            pushFollow(FOLLOW_rule__TabDefinition__NameAssignment_in_ruleTabDefinition1054);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:536:1: entryRuleMultiselection : ruleMultiselection EOF ;
    public final void entryRuleMultiselection() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:537:1: ( ruleMultiselection EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:538:1: ruleMultiselection EOF
            {
             before(grammarAccess.getMultiselectionRule()); 
            pushFollow(FOLLOW_ruleMultiselection_in_entryRuleMultiselection1081);
            ruleMultiselection();

            state._fsp--;

             after(grammarAccess.getMultiselectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiselection1088); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:545:1: ruleMultiselection : ( ( rule__Multiselection__Group__0 ) ) ;
    public final void ruleMultiselection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:549:2: ( ( ( rule__Multiselection__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:550:1: ( ( rule__Multiselection__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:550:1: ( ( rule__Multiselection__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:551:1: ( rule__Multiselection__Group__0 )
            {
             before(grammarAccess.getMultiselectionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:552:1: ( rule__Multiselection__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:552:2: rule__Multiselection__Group__0
            {
            pushFollow(FOLLOW_rule__Multiselection__Group__0_in_ruleMultiselection1114);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:564:1: entryRuleComponentDefinition : ruleComponentDefinition EOF ;
    public final void entryRuleComponentDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:565:1: ( ruleComponentDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:566:1: ruleComponentDefinition EOF
            {
             before(grammarAccess.getComponentDefinitionRule()); 
            pushFollow(FOLLOW_ruleComponentDefinition_in_entryRuleComponentDefinition1141);
            ruleComponentDefinition();

            state._fsp--;

             after(grammarAccess.getComponentDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentDefinition1148); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:573:1: ruleComponentDefinition : ( ( rule__ComponentDefinition__Alternatives ) ) ;
    public final void ruleComponentDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:577:2: ( ( ( rule__ComponentDefinition__Alternatives ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:578:1: ( ( rule__ComponentDefinition__Alternatives ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:578:1: ( ( rule__ComponentDefinition__Alternatives ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:579:1: ( rule__ComponentDefinition__Alternatives )
            {
             before(grammarAccess.getComponentDefinitionAccess().getAlternatives()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:580:1: ( rule__ComponentDefinition__Alternatives )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:580:2: rule__ComponentDefinition__Alternatives
            {
            pushFollow(FOLLOW_rule__ComponentDefinition__Alternatives_in_ruleComponentDefinition1174);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:592:1: entryRuleButtonDefinition : ruleButtonDefinition EOF ;
    public final void entryRuleButtonDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:593:1: ( ruleButtonDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:594:1: ruleButtonDefinition EOF
            {
             before(grammarAccess.getButtonDefinitionRule()); 
            pushFollow(FOLLOW_ruleButtonDefinition_in_entryRuleButtonDefinition1201);
            ruleButtonDefinition();

            state._fsp--;

             after(grammarAccess.getButtonDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonDefinition1208); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:601:1: ruleButtonDefinition : ( ( rule__ButtonDefinition__Group__0 ) ) ;
    public final void ruleButtonDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:605:2: ( ( ( rule__ButtonDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:606:1: ( ( rule__ButtonDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:606:1: ( ( rule__ButtonDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:607:1: ( rule__ButtonDefinition__Group__0 )
            {
             before(grammarAccess.getButtonDefinitionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:608:1: ( rule__ButtonDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:608:2: rule__ButtonDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__0_in_ruleButtonDefinition1234);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:620:1: entryRuleProperties : ruleProperties EOF ;
    public final void entryRuleProperties() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:621:1: ( ruleProperties EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:622:1: ruleProperties EOF
            {
             before(grammarAccess.getPropertiesRule()); 
            pushFollow(FOLLOW_ruleProperties_in_entryRuleProperties1261);
            ruleProperties();

            state._fsp--;

             after(grammarAccess.getPropertiesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperties1268); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:629:1: ruleProperties : ( ( rule__Properties__Group__0 ) ) ;
    public final void ruleProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:633:2: ( ( ( rule__Properties__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:634:1: ( ( rule__Properties__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:634:1: ( ( rule__Properties__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:635:1: ( rule__Properties__Group__0 )
            {
             before(grammarAccess.getPropertiesAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:636:1: ( rule__Properties__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:636:2: rule__Properties__Group__0
            {
            pushFollow(FOLLOW_rule__Properties__Group__0_in_ruleProperties1294);
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


    // $ANTLR start "entryRulePropertiesDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:648:1: entryRulePropertiesDefinition : rulePropertiesDefinition EOF ;
    public final void entryRulePropertiesDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:649:1: ( rulePropertiesDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:650:1: rulePropertiesDefinition EOF
            {
             before(grammarAccess.getPropertiesDefinitionRule()); 
            pushFollow(FOLLOW_rulePropertiesDefinition_in_entryRulePropertiesDefinition1321);
            rulePropertiesDefinition();

            state._fsp--;

             after(grammarAccess.getPropertiesDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertiesDefinition1328); 

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
    // $ANTLR end "entryRulePropertiesDefinition"


    // $ANTLR start "rulePropertiesDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:657:1: rulePropertiesDefinition : ( ( rule__PropertiesDefinition__Alternatives ) ) ;
    public final void rulePropertiesDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:661:2: ( ( ( rule__PropertiesDefinition__Alternatives ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:662:1: ( ( rule__PropertiesDefinition__Alternatives ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:662:1: ( ( rule__PropertiesDefinition__Alternatives ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:663:1: ( rule__PropertiesDefinition__Alternatives )
            {
             before(grammarAccess.getPropertiesDefinitionAccess().getAlternatives()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:664:1: ( rule__PropertiesDefinition__Alternatives )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:664:2: rule__PropertiesDefinition__Alternatives
            {
            pushFollow(FOLLOW_rule__PropertiesDefinition__Alternatives_in_rulePropertiesDefinition1354);
            rule__PropertiesDefinition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertiesDefinitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertiesDefinition"


    // $ANTLR start "entryRuleLabelDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:676:1: entryRuleLabelDefinition : ruleLabelDefinition EOF ;
    public final void entryRuleLabelDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:677:1: ( ruleLabelDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:678:1: ruleLabelDefinition EOF
            {
             before(grammarAccess.getLabelDefinitionRule()); 
            pushFollow(FOLLOW_ruleLabelDefinition_in_entryRuleLabelDefinition1381);
            ruleLabelDefinition();

            state._fsp--;

             after(grammarAccess.getLabelDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelDefinition1388); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:685:1: ruleLabelDefinition : ( ( rule__LabelDefinition__Group__0 ) ) ;
    public final void ruleLabelDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:689:2: ( ( ( rule__LabelDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:690:1: ( ( rule__LabelDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:690:1: ( ( rule__LabelDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:691:1: ( rule__LabelDefinition__Group__0 )
            {
             before(grammarAccess.getLabelDefinitionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:692:1: ( rule__LabelDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:692:2: rule__LabelDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__0_in_ruleLabelDefinition1414);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:704:1: entryRuleInteractiontype : ruleInteractiontype EOF ;
    public final void entryRuleInteractiontype() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:705:1: ( ruleInteractiontype EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:706:1: ruleInteractiontype EOF
            {
             before(grammarAccess.getInteractiontypeRule()); 
            pushFollow(FOLLOW_ruleInteractiontype_in_entryRuleInteractiontype1441);
            ruleInteractiontype();

            state._fsp--;

             after(grammarAccess.getInteractiontypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractiontype1448); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:713:1: ruleInteractiontype : ( ( rule__Interactiontype__IdAssignment ) ) ;
    public final void ruleInteractiontype() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:717:2: ( ( ( rule__Interactiontype__IdAssignment ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:718:1: ( ( rule__Interactiontype__IdAssignment ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:718:1: ( ( rule__Interactiontype__IdAssignment ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:719:1: ( rule__Interactiontype__IdAssignment )
            {
             before(grammarAccess.getInteractiontypeAccess().getIdAssignment()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:720:1: ( rule__Interactiontype__IdAssignment )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:720:2: rule__Interactiontype__IdAssignment
            {
            pushFollow(FOLLOW_rule__Interactiontype__IdAssignment_in_ruleInteractiontype1474);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:732:1: rule__ComponentRefinement__Alternatives : ( ( ruleLabelRefinement ) | ( ruleButtonRefinement ) );
    public final void rule__ComponentRefinement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:736:1: ( ( ruleLabelRefinement ) | ( ruleButtonRefinement ) )
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
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:737:1: ( ruleLabelRefinement )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:737:1: ( ruleLabelRefinement )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:738:1: ruleLabelRefinement
                    {
                     before(grammarAccess.getComponentRefinementAccess().getLabelRefinementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLabelRefinement_in_rule__ComponentRefinement__Alternatives1510);
                    ruleLabelRefinement();

                    state._fsp--;

                     after(grammarAccess.getComponentRefinementAccess().getLabelRefinementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:743:6: ( ruleButtonRefinement )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:743:6: ( ruleButtonRefinement )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:744:1: ruleButtonRefinement
                    {
                     before(grammarAccess.getComponentRefinementAccess().getButtonRefinementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleButtonRefinement_in_rule__ComponentRefinement__Alternatives1527);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:754:1: rule__DescriptionType__Alternatives : ( ( ruleUIDescriptionImport ) | ( ruleComplexComponent ) );
    public final void rule__DescriptionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:758:1: ( ( ruleUIDescriptionImport ) | ( ruleComplexComponent ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=32 && LA2_0<=33)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:759:1: ( ruleUIDescriptionImport )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:759:1: ( ruleUIDescriptionImport )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:760:1: ruleUIDescriptionImport
                    {
                     before(grammarAccess.getDescriptionTypeAccess().getUIDescriptionImportParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleUIDescriptionImport_in_rule__DescriptionType__Alternatives1559);
                    ruleUIDescriptionImport();

                    state._fsp--;

                     after(grammarAccess.getDescriptionTypeAccess().getUIDescriptionImportParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:765:6: ( ruleComplexComponent )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:765:6: ( ruleComplexComponent )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:766:1: ruleComplexComponent
                    {
                     before(grammarAccess.getDescriptionTypeAccess().getComplexComponentParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleComplexComponent_in_rule__DescriptionType__Alternatives1576);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:776:1: rule__Type__IdAlternatives_0 : ( ( 'WINDOW' ) | ( 'INNERCOMPLEX' ) );
    public final void rule__Type__IdAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:780:1: ( ( 'WINDOW' ) | ( 'INNERCOMPLEX' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:781:1: ( 'WINDOW' )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:781:1: ( 'WINDOW' )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:782:1: 'WINDOW'
                    {
                     before(grammarAccess.getTypeAccess().getIdWINDOWKeyword_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__Type__IdAlternatives_01609); 
                     after(grammarAccess.getTypeAccess().getIdWINDOWKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:789:6: ( 'INNERCOMPLEX' )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:789:6: ( 'INNERCOMPLEX' )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:790:1: 'INNERCOMPLEX'
                    {
                     before(grammarAccess.getTypeAccess().getIdINNERCOMPLEXKeyword_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__Type__IdAlternatives_01629); 
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


    // $ANTLR start "rule__ComplexComponent__Alternatives"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:802:1: rule__ComplexComponent__Alternatives : ( ( ruleMultiselection ) | ( ruleTabView ) );
    public final void rule__ComplexComponent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:806:1: ( ( ruleMultiselection ) | ( ruleTabView ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==33) ) {
                alt4=1;
            }
            else if ( (LA4_0==32) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:807:1: ( ruleMultiselection )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:807:1: ( ruleMultiselection )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:808:1: ruleMultiselection
                    {
                     before(grammarAccess.getComplexComponentAccess().getMultiselectionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMultiselection_in_rule__ComplexComponent__Alternatives1663);
                    ruleMultiselection();

                    state._fsp--;

                     after(grammarAccess.getComplexComponentAccess().getMultiselectionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:813:6: ( ruleTabView )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:813:6: ( ruleTabView )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:814:1: ruleTabView
                    {
                     before(grammarAccess.getComplexComponentAccess().getTabViewParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTabView_in_rule__ComplexComponent__Alternatives1680);
                    ruleTabView();

                    state._fsp--;

                     after(grammarAccess.getComplexComponentAccess().getTabViewParserRuleCall_1()); 

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
    // $ANTLR end "rule__ComplexComponent__Alternatives"


    // $ANTLR start "rule__ComponentDefinition__Alternatives"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:824:1: rule__ComponentDefinition__Alternatives : ( ( ruleLabelDefinition ) | ( ruleButtonDefinition ) );
    public final void rule__ComponentDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:828:1: ( ( ruleLabelDefinition ) | ( ruleButtonDefinition ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==31) ) {
                alt5=1;
            }
            else if ( (LA5_0==30) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:829:1: ( ruleLabelDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:829:1: ( ruleLabelDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:830:1: ruleLabelDefinition
                    {
                     before(grammarAccess.getComponentDefinitionAccess().getLabelDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLabelDefinition_in_rule__ComponentDefinition__Alternatives1712);
                    ruleLabelDefinition();

                    state._fsp--;

                     after(grammarAccess.getComponentDefinitionAccess().getLabelDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:835:6: ( ruleButtonDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:835:6: ( ruleButtonDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:836:1: ruleButtonDefinition
                    {
                     before(grammarAccess.getComponentDefinitionAccess().getButtonDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleButtonDefinition_in_rule__ComponentDefinition__Alternatives1729);
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


    // $ANTLR start "rule__PropertiesDefinition__Alternatives"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:846:1: rule__PropertiesDefinition__Alternatives : ( ( ( rule__PropertiesDefinition__Group_0__0 ) ) | ( ( rule__PropertiesDefinition__Group_1__0 ) ) | ( ( rule__PropertiesDefinition__Group_2__0 ) ) );
    public final void rule__PropertiesDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:850:1: ( ( ( rule__PropertiesDefinition__Group_0__0 ) ) | ( ( rule__PropertiesDefinition__Group_1__0 ) ) | ( ( rule__PropertiesDefinition__Group_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt6=1;
                }
                break;
            case 26:
                {
                alt6=2;
                }
                break;
            case 27:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:851:1: ( ( rule__PropertiesDefinition__Group_0__0 ) )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:851:1: ( ( rule__PropertiesDefinition__Group_0__0 ) )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:852:1: ( rule__PropertiesDefinition__Group_0__0 )
                    {
                     before(grammarAccess.getPropertiesDefinitionAccess().getGroup_0()); 
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:853:1: ( rule__PropertiesDefinition__Group_0__0 )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:853:2: rule__PropertiesDefinition__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__PropertiesDefinition__Group_0__0_in_rule__PropertiesDefinition__Alternatives1761);
                    rule__PropertiesDefinition__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertiesDefinitionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:857:6: ( ( rule__PropertiesDefinition__Group_1__0 ) )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:857:6: ( ( rule__PropertiesDefinition__Group_1__0 ) )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:858:1: ( rule__PropertiesDefinition__Group_1__0 )
                    {
                     before(grammarAccess.getPropertiesDefinitionAccess().getGroup_1()); 
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:859:1: ( rule__PropertiesDefinition__Group_1__0 )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:859:2: rule__PropertiesDefinition__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PropertiesDefinition__Group_1__0_in_rule__PropertiesDefinition__Alternatives1779);
                    rule__PropertiesDefinition__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertiesDefinitionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:863:6: ( ( rule__PropertiesDefinition__Group_2__0 ) )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:863:6: ( ( rule__PropertiesDefinition__Group_2__0 ) )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:864:1: ( rule__PropertiesDefinition__Group_2__0 )
                    {
                     before(grammarAccess.getPropertiesDefinitionAccess().getGroup_2()); 
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:865:1: ( rule__PropertiesDefinition__Group_2__0 )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:865:2: rule__PropertiesDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__PropertiesDefinition__Group_2__0_in_rule__PropertiesDefinition__Alternatives1797);
                    rule__PropertiesDefinition__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertiesDefinitionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__PropertiesDefinition__Alternatives"


    // $ANTLR start "rule__Interactiontype__IdAlternatives_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:874:1: rule__Interactiontype__IdAlternatives_0 : ( ( 'Click' ) | ( 'ChangeText' ) );
    public final void rule__Interactiontype__IdAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:878:1: ( ( 'Click' ) | ( 'ChangeText' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:879:1: ( 'Click' )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:879:1: ( 'Click' )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:880:1: 'Click'
                    {
                     before(grammarAccess.getInteractiontypeAccess().getIdClickKeyword_0_0()); 
                    match(input,15,FOLLOW_15_in_rule__Interactiontype__IdAlternatives_01831); 
                     after(grammarAccess.getInteractiontypeAccess().getIdClickKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:887:6: ( 'ChangeText' )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:887:6: ( 'ChangeText' )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:888:1: 'ChangeText'
                    {
                     before(grammarAccess.getInteractiontypeAccess().getIdChangeTextKeyword_0_1()); 
                    match(input,16,FOLLOW_16_in_rule__Interactiontype__IdAlternatives_01851); 
                     after(grammarAccess.getInteractiontypeAccess().getIdChangeTextKeyword_0_1()); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:902:1: rule__UIDescription__Group__0 : rule__UIDescription__Group__0__Impl rule__UIDescription__Group__1 ;
    public final void rule__UIDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:906:1: ( rule__UIDescription__Group__0__Impl rule__UIDescription__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:907:2: rule__UIDescription__Group__0__Impl rule__UIDescription__Group__1
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__0__Impl_in_rule__UIDescription__Group__01883);
            rule__UIDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIDescription__Group__1_in_rule__UIDescription__Group__01886);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:914:1: rule__UIDescription__Group__0__Impl : ( ( rule__UIDescription__TypeDefinitionAssignment_0 ) ) ;
    public final void rule__UIDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:918:1: ( ( ( rule__UIDescription__TypeDefinitionAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:919:1: ( ( rule__UIDescription__TypeDefinitionAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:919:1: ( ( rule__UIDescription__TypeDefinitionAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:920:1: ( rule__UIDescription__TypeDefinitionAssignment_0 )
            {
             before(grammarAccess.getUIDescriptionAccess().getTypeDefinitionAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:921:1: ( rule__UIDescription__TypeDefinitionAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:921:2: rule__UIDescription__TypeDefinitionAssignment_0
            {
            pushFollow(FOLLOW_rule__UIDescription__TypeDefinitionAssignment_0_in_rule__UIDescription__Group__0__Impl1913);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:931:1: rule__UIDescription__Group__1 : rule__UIDescription__Group__1__Impl rule__UIDescription__Group__2 ;
    public final void rule__UIDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:935:1: ( rule__UIDescription__Group__1__Impl rule__UIDescription__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:936:2: rule__UIDescription__Group__1__Impl rule__UIDescription__Group__2
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__1__Impl_in_rule__UIDescription__Group__11943);
            rule__UIDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIDescription__Group__2_in_rule__UIDescription__Group__11946);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:943:1: rule__UIDescription__Group__1__Impl : ( ( rule__UIDescription__PropertyAssignment_1 )? ) ;
    public final void rule__UIDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:947:1: ( ( ( rule__UIDescription__PropertyAssignment_1 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:948:1: ( ( rule__UIDescription__PropertyAssignment_1 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:948:1: ( ( rule__UIDescription__PropertyAssignment_1 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:949:1: ( rule__UIDescription__PropertyAssignment_1 )?
            {
             before(grammarAccess.getUIDescriptionAccess().getPropertyAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:950:1: ( rule__UIDescription__PropertyAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:950:2: rule__UIDescription__PropertyAssignment_1
                    {
                    pushFollow(FOLLOW_rule__UIDescription__PropertyAssignment_1_in_rule__UIDescription__Group__1__Impl1973);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:960:1: rule__UIDescription__Group__2 : rule__UIDescription__Group__2__Impl rule__UIDescription__Group__3 ;
    public final void rule__UIDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:964:1: ( rule__UIDescription__Group__2__Impl rule__UIDescription__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:965:2: rule__UIDescription__Group__2__Impl rule__UIDescription__Group__3
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__2__Impl_in_rule__UIDescription__Group__22004);
            rule__UIDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIDescription__Group__3_in_rule__UIDescription__Group__22007);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:972:1: rule__UIDescription__Group__2__Impl : ( ( rule__UIDescription__UsedDescriptionsAssignment_2 )* ) ;
    public final void rule__UIDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:976:1: ( ( ( rule__UIDescription__UsedDescriptionsAssignment_2 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:977:1: ( ( rule__UIDescription__UsedDescriptionsAssignment_2 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:977:1: ( ( rule__UIDescription__UsedDescriptionsAssignment_2 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:978:1: ( rule__UIDescription__UsedDescriptionsAssignment_2 )*
            {
             before(grammarAccess.getUIDescriptionAccess().getUsedDescriptionsAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:979:1: ( rule__UIDescription__UsedDescriptionsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:979:2: rule__UIDescription__UsedDescriptionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__UIDescription__UsedDescriptionsAssignment_2_in_rule__UIDescription__Group__2__Impl2034);
            	    rule__UIDescription__UsedDescriptionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:989:1: rule__UIDescription__Group__3 : rule__UIDescription__Group__3__Impl rule__UIDescription__Group__4 ;
    public final void rule__UIDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:993:1: ( rule__UIDescription__Group__3__Impl rule__UIDescription__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:994:2: rule__UIDescription__Group__3__Impl rule__UIDescription__Group__4
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__3__Impl_in_rule__UIDescription__Group__32065);
            rule__UIDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIDescription__Group__4_in_rule__UIDescription__Group__32068);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1001:1: rule__UIDescription__Group__3__Impl : ( ( rule__UIDescription__RefinementsAssignment_3 )* ) ;
    public final void rule__UIDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1005:1: ( ( ( rule__UIDescription__RefinementsAssignment_3 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1006:1: ( ( rule__UIDescription__RefinementsAssignment_3 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1006:1: ( ( rule__UIDescription__RefinementsAssignment_3 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1007:1: ( rule__UIDescription__RefinementsAssignment_3 )*
            {
             before(grammarAccess.getUIDescriptionAccess().getRefinementsAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1008:1: ( rule__UIDescription__RefinementsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==31) ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==19) ) {
                        alt10=1;
                    }


                }
                else if ( (LA10_0==30) ) {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==19) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1008:2: rule__UIDescription__RefinementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__UIDescription__RefinementsAssignment_3_in_rule__UIDescription__Group__3__Impl2095);
            	    rule__UIDescription__RefinementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1018:1: rule__UIDescription__Group__4 : rule__UIDescription__Group__4__Impl rule__UIDescription__Group__5 ;
    public final void rule__UIDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1022:1: ( rule__UIDescription__Group__4__Impl rule__UIDescription__Group__5 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1023:2: rule__UIDescription__Group__4__Impl rule__UIDescription__Group__5
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__4__Impl_in_rule__UIDescription__Group__42126);
            rule__UIDescription__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIDescription__Group__5_in_rule__UIDescription__Group__42129);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1030:1: rule__UIDescription__Group__4__Impl : ( ( rule__UIDescription__DefinitionsAssignment_4 )* ) ;
    public final void rule__UIDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1034:1: ( ( ( rule__UIDescription__DefinitionsAssignment_4 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1035:1: ( ( rule__UIDescription__DefinitionsAssignment_4 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1035:1: ( ( rule__UIDescription__DefinitionsAssignment_4 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1036:1: ( rule__UIDescription__DefinitionsAssignment_4 )*
            {
             before(grammarAccess.getUIDescriptionAccess().getDefinitionsAssignment_4()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1037:1: ( rule__UIDescription__DefinitionsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=30 && LA11_0<=31)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1037:2: rule__UIDescription__DefinitionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__UIDescription__DefinitionsAssignment_4_in_rule__UIDescription__Group__4__Impl2156);
            	    rule__UIDescription__DefinitionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1047:1: rule__UIDescription__Group__5 : rule__UIDescription__Group__5__Impl ;
    public final void rule__UIDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1051:1: ( rule__UIDescription__Group__5__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1052:2: rule__UIDescription__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__5__Impl_in_rule__UIDescription__Group__52187);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1058:1: rule__UIDescription__Group__5__Impl : ( ( rule__UIDescription__StructureAssignment_5 ) ) ;
    public final void rule__UIDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1062:1: ( ( ( rule__UIDescription__StructureAssignment_5 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1063:1: ( ( rule__UIDescription__StructureAssignment_5 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1063:1: ( ( rule__UIDescription__StructureAssignment_5 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1064:1: ( rule__UIDescription__StructureAssignment_5 )
            {
             before(grammarAccess.getUIDescriptionAccess().getStructureAssignment_5()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1065:1: ( rule__UIDescription__StructureAssignment_5 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1065:2: rule__UIDescription__StructureAssignment_5
            {
            pushFollow(FOLLOW_rule__UIDescription__StructureAssignment_5_in_rule__UIDescription__Group__5__Impl2214);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1087:1: rule__Structure__Group__0 : rule__Structure__Group__0__Impl rule__Structure__Group__1 ;
    public final void rule__Structure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1091:1: ( rule__Structure__Group__0__Impl rule__Structure__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1092:2: rule__Structure__Group__0__Impl rule__Structure__Group__1
            {
            pushFollow(FOLLOW_rule__Structure__Group__0__Impl_in_rule__Structure__Group__02256);
            rule__Structure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Structure__Group__1_in_rule__Structure__Group__02259);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1099:1: rule__Structure__Group__0__Impl : ( ( rule__Structure__NameAssignment_0 ) ) ;
    public final void rule__Structure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1103:1: ( ( ( rule__Structure__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1104:1: ( ( rule__Structure__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1104:1: ( ( rule__Structure__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1105:1: ( rule__Structure__NameAssignment_0 )
            {
             before(grammarAccess.getStructureAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1106:1: ( rule__Structure__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1106:2: rule__Structure__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Structure__NameAssignment_0_in_rule__Structure__Group__0__Impl2286);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1116:1: rule__Structure__Group__1 : rule__Structure__Group__1__Impl rule__Structure__Group__2 ;
    public final void rule__Structure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1120:1: ( rule__Structure__Group__1__Impl rule__Structure__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1121:2: rule__Structure__Group__1__Impl rule__Structure__Group__2
            {
            pushFollow(FOLLOW_rule__Structure__Group__1__Impl_in_rule__Structure__Group__12316);
            rule__Structure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Structure__Group__2_in_rule__Structure__Group__12319);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1128:1: rule__Structure__Group__1__Impl : ( ':' ) ;
    public final void rule__Structure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1132:1: ( ( ':' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1133:1: ( ':' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1133:1: ( ':' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1134:1: ':'
            {
             before(grammarAccess.getStructureAccess().getColonKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Structure__Group__1__Impl2347); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1147:1: rule__Structure__Group__2 : rule__Structure__Group__2__Impl rule__Structure__Group__3 ;
    public final void rule__Structure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1151:1: ( rule__Structure__Group__2__Impl rule__Structure__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1152:2: rule__Structure__Group__2__Impl rule__Structure__Group__3
            {
            pushFollow(FOLLOW_rule__Structure__Group__2__Impl_in_rule__Structure__Group__22378);
            rule__Structure__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Structure__Group__3_in_rule__Structure__Group__22381);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1159:1: rule__Structure__Group__2__Impl : ( ( rule__Structure__OrderedElementsAssignment_2 )* ) ;
    public final void rule__Structure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1163:1: ( ( ( rule__Structure__OrderedElementsAssignment_2 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1164:1: ( ( rule__Structure__OrderedElementsAssignment_2 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1164:1: ( ( rule__Structure__OrderedElementsAssignment_2 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1165:1: ( rule__Structure__OrderedElementsAssignment_2 )*
            {
             before(grammarAccess.getStructureAccess().getOrderedElementsAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1166:1: ( rule__Structure__OrderedElementsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_STRING) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1166:2: rule__Structure__OrderedElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Structure__OrderedElementsAssignment_2_in_rule__Structure__Group__2__Impl2408);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1176:1: rule__Structure__Group__3 : rule__Structure__Group__3__Impl ;
    public final void rule__Structure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1180:1: ( rule__Structure__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1181:2: rule__Structure__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Structure__Group__3__Impl_in_rule__Structure__Group__32439);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1187:1: rule__Structure__Group__3__Impl : ( ';' ) ;
    public final void rule__Structure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1191:1: ( ( ';' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1192:1: ( ';' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1192:1: ( ';' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1193:1: ';'
            {
             before(grammarAccess.getStructureAccess().getSemicolonKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__Structure__Group__3__Impl2467); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1214:1: rule__Refinement__Group__0 : rule__Refinement__Group__0__Impl rule__Refinement__Group__1 ;
    public final void rule__Refinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1218:1: ( rule__Refinement__Group__0__Impl rule__Refinement__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1219:2: rule__Refinement__Group__0__Impl rule__Refinement__Group__1
            {
            pushFollow(FOLLOW_rule__Refinement__Group__0__Impl_in_rule__Refinement__Group__02506);
            rule__Refinement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Refinement__Group__1_in_rule__Refinement__Group__02509);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1226:1: rule__Refinement__Group__0__Impl : ( ( rule__Refinement__ConcreteRefinementAssignment_0 ) ) ;
    public final void rule__Refinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1230:1: ( ( ( rule__Refinement__ConcreteRefinementAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1231:1: ( ( rule__Refinement__ConcreteRefinementAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1231:1: ( ( rule__Refinement__ConcreteRefinementAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1232:1: ( rule__Refinement__ConcreteRefinementAssignment_0 )
            {
             before(grammarAccess.getRefinementAccess().getConcreteRefinementAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1233:1: ( rule__Refinement__ConcreteRefinementAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1233:2: rule__Refinement__ConcreteRefinementAssignment_0
            {
            pushFollow(FOLLOW_rule__Refinement__ConcreteRefinementAssignment_0_in_rule__Refinement__Group__0__Impl2536);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1243:1: rule__Refinement__Group__1 : rule__Refinement__Group__1__Impl ;
    public final void rule__Refinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1247:1: ( rule__Refinement__Group__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1248:2: rule__Refinement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Refinement__Group__1__Impl_in_rule__Refinement__Group__12566);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1254:1: rule__Refinement__Group__1__Impl : ( ';' ) ;
    public final void rule__Refinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1258:1: ( ( ';' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1259:1: ( ';' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1259:1: ( ';' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1260:1: ';'
            {
             before(grammarAccess.getRefinementAccess().getSemicolonKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Refinement__Group__1__Impl2594); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1277:1: rule__ButtonRefinement__Group__0 : rule__ButtonRefinement__Group__0__Impl rule__ButtonRefinement__Group__1 ;
    public final void rule__ButtonRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1281:1: ( rule__ButtonRefinement__Group__0__Impl rule__ButtonRefinement__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1282:2: rule__ButtonRefinement__Group__0__Impl rule__ButtonRefinement__Group__1
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__Group__0__Impl_in_rule__ButtonRefinement__Group__02629);
            rule__ButtonRefinement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonRefinement__Group__1_in_rule__ButtonRefinement__Group__02632);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1289:1: rule__ButtonRefinement__Group__0__Impl : ( ( rule__ButtonRefinement__NameAssignment_0 ) ) ;
    public final void rule__ButtonRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1293:1: ( ( ( rule__ButtonRefinement__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1294:1: ( ( rule__ButtonRefinement__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1294:1: ( ( rule__ButtonRefinement__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1295:1: ( rule__ButtonRefinement__NameAssignment_0 )
            {
             before(grammarAccess.getButtonRefinementAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1296:1: ( rule__ButtonRefinement__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1296:2: rule__ButtonRefinement__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__NameAssignment_0_in_rule__ButtonRefinement__Group__0__Impl2659);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1306:1: rule__ButtonRefinement__Group__1 : rule__ButtonRefinement__Group__1__Impl rule__ButtonRefinement__Group__2 ;
    public final void rule__ButtonRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1310:1: ( rule__ButtonRefinement__Group__1__Impl rule__ButtonRefinement__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1311:2: rule__ButtonRefinement__Group__1__Impl rule__ButtonRefinement__Group__2
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__Group__1__Impl_in_rule__ButtonRefinement__Group__12689);
            rule__ButtonRefinement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonRefinement__Group__2_in_rule__ButtonRefinement__Group__12692);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1318:1: rule__ButtonRefinement__Group__1__Impl : ( 'from:' ) ;
    public final void rule__ButtonRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1322:1: ( ( 'from:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1323:1: ( 'from:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1323:1: ( 'from:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1324:1: 'from:'
            {
             before(grammarAccess.getButtonRefinementAccess().getFromKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__ButtonRefinement__Group__1__Impl2720); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1337:1: rule__ButtonRefinement__Group__2 : rule__ButtonRefinement__Group__2__Impl rule__ButtonRefinement__Group__3 ;
    public final void rule__ButtonRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1341:1: ( rule__ButtonRefinement__Group__2__Impl rule__ButtonRefinement__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1342:2: rule__ButtonRefinement__Group__2__Impl rule__ButtonRefinement__Group__3
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__Group__2__Impl_in_rule__ButtonRefinement__Group__22751);
            rule__ButtonRefinement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonRefinement__Group__3_in_rule__ButtonRefinement__Group__22754);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1349:1: rule__ButtonRefinement__Group__2__Impl : ( ( rule__ButtonRefinement__IdAssignment_2 ) ) ;
    public final void rule__ButtonRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1353:1: ( ( ( rule__ButtonRefinement__IdAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1354:1: ( ( rule__ButtonRefinement__IdAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1354:1: ( ( rule__ButtonRefinement__IdAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1355:1: ( rule__ButtonRefinement__IdAssignment_2 )
            {
             before(grammarAccess.getButtonRefinementAccess().getIdAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1356:1: ( rule__ButtonRefinement__IdAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1356:2: rule__ButtonRefinement__IdAssignment_2
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__IdAssignment_2_in_rule__ButtonRefinement__Group__2__Impl2781);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1366:1: rule__ButtonRefinement__Group__3 : rule__ButtonRefinement__Group__3__Impl ;
    public final void rule__ButtonRefinement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1370:1: ( rule__ButtonRefinement__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1371:2: rule__ButtonRefinement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__Group__3__Impl_in_rule__ButtonRefinement__Group__32811);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1377:1: rule__ButtonRefinement__Group__3__Impl : ( ( rule__ButtonRefinement__PropertiesAssignment_3 )? ) ;
    public final void rule__ButtonRefinement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1381:1: ( ( ( rule__ButtonRefinement__PropertiesAssignment_3 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1382:1: ( ( rule__ButtonRefinement__PropertiesAssignment_3 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1382:1: ( ( rule__ButtonRefinement__PropertiesAssignment_3 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1383:1: ( rule__ButtonRefinement__PropertiesAssignment_3 )?
            {
             before(grammarAccess.getButtonRefinementAccess().getPropertiesAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1384:1: ( rule__ButtonRefinement__PropertiesAssignment_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1384:2: rule__ButtonRefinement__PropertiesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__ButtonRefinement__PropertiesAssignment_3_in_rule__ButtonRefinement__Group__3__Impl2838);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1402:1: rule__LabelRefinement__Group__0 : rule__LabelRefinement__Group__0__Impl rule__LabelRefinement__Group__1 ;
    public final void rule__LabelRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1406:1: ( rule__LabelRefinement__Group__0__Impl rule__LabelRefinement__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1407:2: rule__LabelRefinement__Group__0__Impl rule__LabelRefinement__Group__1
            {
            pushFollow(FOLLOW_rule__LabelRefinement__Group__0__Impl_in_rule__LabelRefinement__Group__02877);
            rule__LabelRefinement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelRefinement__Group__1_in_rule__LabelRefinement__Group__02880);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1414:1: rule__LabelRefinement__Group__0__Impl : ( ( rule__LabelRefinement__NameAssignment_0 ) ) ;
    public final void rule__LabelRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1418:1: ( ( ( rule__LabelRefinement__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1419:1: ( ( rule__LabelRefinement__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1419:1: ( ( rule__LabelRefinement__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1420:1: ( rule__LabelRefinement__NameAssignment_0 )
            {
             before(grammarAccess.getLabelRefinementAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1421:1: ( rule__LabelRefinement__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1421:2: rule__LabelRefinement__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__LabelRefinement__NameAssignment_0_in_rule__LabelRefinement__Group__0__Impl2907);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1431:1: rule__LabelRefinement__Group__1 : rule__LabelRefinement__Group__1__Impl rule__LabelRefinement__Group__2 ;
    public final void rule__LabelRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1435:1: ( rule__LabelRefinement__Group__1__Impl rule__LabelRefinement__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1436:2: rule__LabelRefinement__Group__1__Impl rule__LabelRefinement__Group__2
            {
            pushFollow(FOLLOW_rule__LabelRefinement__Group__1__Impl_in_rule__LabelRefinement__Group__12937);
            rule__LabelRefinement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelRefinement__Group__2_in_rule__LabelRefinement__Group__12940);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1443:1: rule__LabelRefinement__Group__1__Impl : ( 'from:' ) ;
    public final void rule__LabelRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1447:1: ( ( 'from:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1448:1: ( 'from:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1448:1: ( 'from:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1449:1: 'from:'
            {
             before(grammarAccess.getLabelRefinementAccess().getFromKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__LabelRefinement__Group__1__Impl2968); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1462:1: rule__LabelRefinement__Group__2 : rule__LabelRefinement__Group__2__Impl rule__LabelRefinement__Group__3 ;
    public final void rule__LabelRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1466:1: ( rule__LabelRefinement__Group__2__Impl rule__LabelRefinement__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1467:2: rule__LabelRefinement__Group__2__Impl rule__LabelRefinement__Group__3
            {
            pushFollow(FOLLOW_rule__LabelRefinement__Group__2__Impl_in_rule__LabelRefinement__Group__22999);
            rule__LabelRefinement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelRefinement__Group__3_in_rule__LabelRefinement__Group__23002);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1474:1: rule__LabelRefinement__Group__2__Impl : ( ( rule__LabelRefinement__IdAssignment_2 ) ) ;
    public final void rule__LabelRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1478:1: ( ( ( rule__LabelRefinement__IdAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1479:1: ( ( rule__LabelRefinement__IdAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1479:1: ( ( rule__LabelRefinement__IdAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1480:1: ( rule__LabelRefinement__IdAssignment_2 )
            {
             before(grammarAccess.getLabelRefinementAccess().getIdAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1481:1: ( rule__LabelRefinement__IdAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1481:2: rule__LabelRefinement__IdAssignment_2
            {
            pushFollow(FOLLOW_rule__LabelRefinement__IdAssignment_2_in_rule__LabelRefinement__Group__2__Impl3029);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1491:1: rule__LabelRefinement__Group__3 : rule__LabelRefinement__Group__3__Impl ;
    public final void rule__LabelRefinement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1495:1: ( rule__LabelRefinement__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1496:2: rule__LabelRefinement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__LabelRefinement__Group__3__Impl_in_rule__LabelRefinement__Group__33059);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1502:1: rule__LabelRefinement__Group__3__Impl : ( ( rule__LabelRefinement__PropertiesAssignment_3 )? ) ;
    public final void rule__LabelRefinement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1506:1: ( ( ( rule__LabelRefinement__PropertiesAssignment_3 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1507:1: ( ( rule__LabelRefinement__PropertiesAssignment_3 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1507:1: ( ( rule__LabelRefinement__PropertiesAssignment_3 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1508:1: ( rule__LabelRefinement__PropertiesAssignment_3 )?
            {
             before(grammarAccess.getLabelRefinementAccess().getPropertiesAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1509:1: ( rule__LabelRefinement__PropertiesAssignment_3 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1509:2: rule__LabelRefinement__PropertiesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__LabelRefinement__PropertiesAssignment_3_in_rule__LabelRefinement__Group__3__Impl3086);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1527:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1531:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1532:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__03125);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__03128);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1539:1: rule__Property__Group__0__Impl : ( 'get properties from:' ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1543:1: ( ( 'get properties from:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1544:1: ( 'get properties from:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1544:1: ( 'get properties from:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1545:1: 'get properties from:'
            {
             before(grammarAccess.getPropertyAccess().getGetPropertiesFromKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Property__Group__0__Impl3156); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1558:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1562:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1563:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__13187);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__13190);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1570:1: rule__Property__Group__1__Impl : ( ( rule__Property__PropertiesFileAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1574:1: ( ( ( rule__Property__PropertiesFileAssignment_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1575:1: ( ( rule__Property__PropertiesFileAssignment_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1575:1: ( ( rule__Property__PropertiesFileAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1576:1: ( rule__Property__PropertiesFileAssignment_1 )
            {
             before(grammarAccess.getPropertyAccess().getPropertiesFileAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1577:1: ( rule__Property__PropertiesFileAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1577:2: rule__Property__PropertiesFileAssignment_1
            {
            pushFollow(FOLLOW_rule__Property__PropertiesFileAssignment_1_in_rule__Property__Group__1__Impl3217);
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


    // $ANTLR start "rule__Property__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1587:1: rule__Property__Group__2 : rule__Property__Group__2__Impl ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1591:1: ( rule__Property__Group__2__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1592:2: rule__Property__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__23247);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1598:1: rule__Property__Group__2__Impl : ( ';' ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1602:1: ( ( ';' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1603:1: ( ';' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1603:1: ( ';' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1604:1: ';'
            {
             before(grammarAccess.getPropertyAccess().getSemicolonKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Property__Group__2__Impl3275); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1623:1: rule__UsedDescriptions__Group__0 : rule__UsedDescriptions__Group__0__Impl rule__UsedDescriptions__Group__1 ;
    public final void rule__UsedDescriptions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1627:1: ( rule__UsedDescriptions__Group__0__Impl rule__UsedDescriptions__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1628:2: rule__UsedDescriptions__Group__0__Impl rule__UsedDescriptions__Group__1
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__Group__0__Impl_in_rule__UsedDescriptions__Group__03312);
            rule__UsedDescriptions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsedDescriptions__Group__1_in_rule__UsedDescriptions__Group__03315);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1635:1: rule__UsedDescriptions__Group__0__Impl : ( 'use:' ) ;
    public final void rule__UsedDescriptions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1639:1: ( ( 'use:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1640:1: ( 'use:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1640:1: ( 'use:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1641:1: 'use:'
            {
             before(grammarAccess.getUsedDescriptionsAccess().getUseKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__UsedDescriptions__Group__0__Impl3343); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1654:1: rule__UsedDescriptions__Group__1 : rule__UsedDescriptions__Group__1__Impl rule__UsedDescriptions__Group__2 ;
    public final void rule__UsedDescriptions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1658:1: ( rule__UsedDescriptions__Group__1__Impl rule__UsedDescriptions__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1659:2: rule__UsedDescriptions__Group__1__Impl rule__UsedDescriptions__Group__2
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__Group__1__Impl_in_rule__UsedDescriptions__Group__13374);
            rule__UsedDescriptions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsedDescriptions__Group__2_in_rule__UsedDescriptions__Group__13377);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1666:1: rule__UsedDescriptions__Group__1__Impl : ( ( rule__UsedDescriptions__DescriptionAssignment_1 ) ) ;
    public final void rule__UsedDescriptions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1670:1: ( ( ( rule__UsedDescriptions__DescriptionAssignment_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1671:1: ( ( rule__UsedDescriptions__DescriptionAssignment_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1671:1: ( ( rule__UsedDescriptions__DescriptionAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1672:1: ( rule__UsedDescriptions__DescriptionAssignment_1 )
            {
             before(grammarAccess.getUsedDescriptionsAccess().getDescriptionAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1673:1: ( rule__UsedDescriptions__DescriptionAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1673:2: rule__UsedDescriptions__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__DescriptionAssignment_1_in_rule__UsedDescriptions__Group__1__Impl3404);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1683:1: rule__UsedDescriptions__Group__2 : rule__UsedDescriptions__Group__2__Impl rule__UsedDescriptions__Group__3 ;
    public final void rule__UsedDescriptions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1687:1: ( rule__UsedDescriptions__Group__2__Impl rule__UsedDescriptions__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1688:2: rule__UsedDescriptions__Group__2__Impl rule__UsedDescriptions__Group__3
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__Group__2__Impl_in_rule__UsedDescriptions__Group__23434);
            rule__UsedDescriptions__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsedDescriptions__Group__3_in_rule__UsedDescriptions__Group__23437);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1695:1: rule__UsedDescriptions__Group__2__Impl : ( ( rule__UsedDescriptions__Group_2__0 )? ) ;
    public final void rule__UsedDescriptions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1699:1: ( ( ( rule__UsedDescriptions__Group_2__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1700:1: ( ( rule__UsedDescriptions__Group_2__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1700:1: ( ( rule__UsedDescriptions__Group_2__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1701:1: ( rule__UsedDescriptions__Group_2__0 )?
            {
             before(grammarAccess.getUsedDescriptionsAccess().getGroup_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1702:1: ( rule__UsedDescriptions__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1702:2: rule__UsedDescriptions__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__UsedDescriptions__Group_2__0_in_rule__UsedDescriptions__Group__2__Impl3464);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1712:1: rule__UsedDescriptions__Group__3 : rule__UsedDescriptions__Group__3__Impl ;
    public final void rule__UsedDescriptions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1716:1: ( rule__UsedDescriptions__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1717:2: rule__UsedDescriptions__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__Group__3__Impl_in_rule__UsedDescriptions__Group__33495);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1723:1: rule__UsedDescriptions__Group__3__Impl : ( ';' ) ;
    public final void rule__UsedDescriptions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1727:1: ( ( ';' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1728:1: ( ';' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1728:1: ( ';' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1729:1: ';'
            {
             before(grammarAccess.getUsedDescriptionsAccess().getSemicolonKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__UsedDescriptions__Group__3__Impl3523); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1750:1: rule__UsedDescriptions__Group_2__0 : rule__UsedDescriptions__Group_2__0__Impl rule__UsedDescriptions__Group_2__1 ;
    public final void rule__UsedDescriptions__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1754:1: ( rule__UsedDescriptions__Group_2__0__Impl rule__UsedDescriptions__Group_2__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1755:2: rule__UsedDescriptions__Group_2__0__Impl rule__UsedDescriptions__Group_2__1
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__Group_2__0__Impl_in_rule__UsedDescriptions__Group_2__03562);
            rule__UsedDescriptions__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsedDescriptions__Group_2__1_in_rule__UsedDescriptions__Group_2__03565);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1762:1: rule__UsedDescriptions__Group_2__0__Impl : ( 'as:' ) ;
    public final void rule__UsedDescriptions__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1766:1: ( ( 'as:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1767:1: ( 'as:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1767:1: ( 'as:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1768:1: 'as:'
            {
             before(grammarAccess.getUsedDescriptionsAccess().getAsKeyword_2_0()); 
            match(input,22,FOLLOW_22_in_rule__UsedDescriptions__Group_2__0__Impl3593); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1781:1: rule__UsedDescriptions__Group_2__1 : rule__UsedDescriptions__Group_2__1__Impl ;
    public final void rule__UsedDescriptions__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1785:1: ( rule__UsedDescriptions__Group_2__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1786:2: rule__UsedDescriptions__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__Group_2__1__Impl_in_rule__UsedDescriptions__Group_2__13624);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1792:1: rule__UsedDescriptions__Group_2__1__Impl : ( ( rule__UsedDescriptions__IdAssignment_2_1 ) ) ;
    public final void rule__UsedDescriptions__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1796:1: ( ( ( rule__UsedDescriptions__IdAssignment_2_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1797:1: ( ( rule__UsedDescriptions__IdAssignment_2_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1797:1: ( ( rule__UsedDescriptions__IdAssignment_2_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1798:1: ( rule__UsedDescriptions__IdAssignment_2_1 )
            {
             before(grammarAccess.getUsedDescriptionsAccess().getIdAssignment_2_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1799:1: ( rule__UsedDescriptions__IdAssignment_2_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1799:2: rule__UsedDescriptions__IdAssignment_2_1
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__IdAssignment_2_1_in_rule__UsedDescriptions__Group_2__1__Impl3651);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1813:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1817:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1818:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__03685);
            rule__Definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__03688);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1825:1: rule__Definition__Group__0__Impl : ( ( rule__Definition__ConcreteDefitionAssignment_0 ) ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1829:1: ( ( ( rule__Definition__ConcreteDefitionAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1830:1: ( ( rule__Definition__ConcreteDefitionAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1830:1: ( ( rule__Definition__ConcreteDefitionAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1831:1: ( rule__Definition__ConcreteDefitionAssignment_0 )
            {
             before(grammarAccess.getDefinitionAccess().getConcreteDefitionAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1832:1: ( rule__Definition__ConcreteDefitionAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1832:2: rule__Definition__ConcreteDefitionAssignment_0
            {
            pushFollow(FOLLOW_rule__Definition__ConcreteDefitionAssignment_0_in_rule__Definition__Group__0__Impl3715);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1842:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1846:1: ( rule__Definition__Group__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1847:2: rule__Definition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__13745);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1853:1: rule__Definition__Group__1__Impl : ( ';' ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1857:1: ( ( ';' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1858:1: ( ';' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1858:1: ( ';' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1859:1: ';'
            {
             before(grammarAccess.getDefinitionAccess().getSemicolonKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Definition__Group__1__Impl3773); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1876:1: rule__TypeDefinition__Group__0 : rule__TypeDefinition__Group__0__Impl rule__TypeDefinition__Group__1 ;
    public final void rule__TypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1880:1: ( rule__TypeDefinition__Group__0__Impl rule__TypeDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1881:2: rule__TypeDefinition__Group__0__Impl rule__TypeDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Group__0__Impl_in_rule__TypeDefinition__Group__03808);
            rule__TypeDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDefinition__Group__1_in_rule__TypeDefinition__Group__03811);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1888:1: rule__TypeDefinition__Group__0__Impl : ( 'type: ' ) ;
    public final void rule__TypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1892:1: ( ( 'type: ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1893:1: ( 'type: ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1893:1: ( 'type: ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1894:1: 'type: '
            {
             before(grammarAccess.getTypeDefinitionAccess().getTypeKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__TypeDefinition__Group__0__Impl3839); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1907:1: rule__TypeDefinition__Group__1 : rule__TypeDefinition__Group__1__Impl rule__TypeDefinition__Group__2 ;
    public final void rule__TypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1911:1: ( rule__TypeDefinition__Group__1__Impl rule__TypeDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1912:2: rule__TypeDefinition__Group__1__Impl rule__TypeDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Group__1__Impl_in_rule__TypeDefinition__Group__13870);
            rule__TypeDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDefinition__Group__2_in_rule__TypeDefinition__Group__13873);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1919:1: rule__TypeDefinition__Group__1__Impl : ( ( rule__TypeDefinition__TypeAssignment_1 ) ) ;
    public final void rule__TypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1923:1: ( ( ( rule__TypeDefinition__TypeAssignment_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1924:1: ( ( rule__TypeDefinition__TypeAssignment_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1924:1: ( ( rule__TypeDefinition__TypeAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1925:1: ( rule__TypeDefinition__TypeAssignment_1 )
            {
             before(grammarAccess.getTypeDefinitionAccess().getTypeAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1926:1: ( rule__TypeDefinition__TypeAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1926:2: rule__TypeDefinition__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__TypeDefinition__TypeAssignment_1_in_rule__TypeDefinition__Group__1__Impl3900);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1936:1: rule__TypeDefinition__Group__2 : rule__TypeDefinition__Group__2__Impl ;
    public final void rule__TypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1940:1: ( rule__TypeDefinition__Group__2__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1941:2: rule__TypeDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Group__2__Impl_in_rule__TypeDefinition__Group__23930);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1947:1: rule__TypeDefinition__Group__2__Impl : ( ';' ) ;
    public final void rule__TypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1951:1: ( ( ';' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1952:1: ( ';' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1952:1: ( ';' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1953:1: ';'
            {
             before(grammarAccess.getTypeDefinitionAccess().getSemicolonKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__TypeDefinition__Group__2__Impl3958); 
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


    // $ANTLR start "rule__TabView__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1972:1: rule__TabView__Group__0 : rule__TabView__Group__0__Impl rule__TabView__Group__1 ;
    public final void rule__TabView__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1976:1: ( rule__TabView__Group__0__Impl rule__TabView__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1977:2: rule__TabView__Group__0__Impl rule__TabView__Group__1
            {
            pushFollow(FOLLOW_rule__TabView__Group__0__Impl_in_rule__TabView__Group__03995);
            rule__TabView__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TabView__Group__1_in_rule__TabView__Group__03998);
            rule__TabView__Group__1();

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
    // $ANTLR end "rule__TabView__Group__0"


    // $ANTLR start "rule__TabView__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1984:1: rule__TabView__Group__0__Impl : ( ( rule__TabView__NameAssignment_0 ) ) ;
    public final void rule__TabView__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1988:1: ( ( ( rule__TabView__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1989:1: ( ( rule__TabView__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1989:1: ( ( rule__TabView__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1990:1: ( rule__TabView__NameAssignment_0 )
            {
             before(grammarAccess.getTabViewAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1991:1: ( rule__TabView__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1991:2: rule__TabView__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__TabView__NameAssignment_0_in_rule__TabView__Group__0__Impl4025);
            rule__TabView__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTabViewAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabView__Group__0__Impl"


    // $ANTLR start "rule__TabView__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2001:1: rule__TabView__Group__1 : rule__TabView__Group__1__Impl ;
    public final void rule__TabView__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2005:1: ( rule__TabView__Group__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2006:2: rule__TabView__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TabView__Group__1__Impl_in_rule__TabView__Group__14055);
            rule__TabView__Group__1__Impl();

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
    // $ANTLR end "rule__TabView__Group__1"


    // $ANTLR start "rule__TabView__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2012:1: rule__TabView__Group__1__Impl : ( ( rule__TabView__TabsAssignment_1 )* ) ;
    public final void rule__TabView__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2016:1: ( ( ( rule__TabView__TabsAssignment_1 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2017:1: ( ( rule__TabView__TabsAssignment_1 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2017:1: ( ( rule__TabView__TabsAssignment_1 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2018:1: ( rule__TabView__TabsAssignment_1 )*
            {
             before(grammarAccess.getTabViewAccess().getTabsAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2019:1: ( rule__TabView__TabsAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_TABNAME) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2019:2: rule__TabView__TabsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__TabView__TabsAssignment_1_in_rule__TabView__Group__1__Impl4082);
            	    rule__TabView__TabsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getTabViewAccess().getTabsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabView__Group__1__Impl"


    // $ANTLR start "rule__Multiselection__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2033:1: rule__Multiselection__Group__0 : rule__Multiselection__Group__0__Impl rule__Multiselection__Group__1 ;
    public final void rule__Multiselection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2037:1: ( rule__Multiselection__Group__0__Impl rule__Multiselection__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2038:2: rule__Multiselection__Group__0__Impl rule__Multiselection__Group__1
            {
            pushFollow(FOLLOW_rule__Multiselection__Group__0__Impl_in_rule__Multiselection__Group__04117);
            rule__Multiselection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiselection__Group__1_in_rule__Multiselection__Group__04120);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2045:1: rule__Multiselection__Group__0__Impl : ( ( rule__Multiselection__NameAssignment_0 ) ) ;
    public final void rule__Multiselection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2049:1: ( ( ( rule__Multiselection__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2050:1: ( ( rule__Multiselection__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2050:1: ( ( rule__Multiselection__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2051:1: ( rule__Multiselection__NameAssignment_0 )
            {
             before(grammarAccess.getMultiselectionAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2052:1: ( rule__Multiselection__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2052:2: rule__Multiselection__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Multiselection__NameAssignment_0_in_rule__Multiselection__Group__0__Impl4147);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2062:1: rule__Multiselection__Group__1 : rule__Multiselection__Group__1__Impl ;
    public final void rule__Multiselection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2066:1: ( rule__Multiselection__Group__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2067:2: rule__Multiselection__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiselection__Group__1__Impl_in_rule__Multiselection__Group__14177);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2073:1: rule__Multiselection__Group__1__Impl : ( ( rule__Multiselection__InputTypeAssignment_1 )? ) ;
    public final void rule__Multiselection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2077:1: ( ( ( rule__Multiselection__InputTypeAssignment_1 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2078:1: ( ( rule__Multiselection__InputTypeAssignment_1 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2078:1: ( ( rule__Multiselection__InputTypeAssignment_1 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2079:1: ( rule__Multiselection__InputTypeAssignment_1 )?
            {
             before(grammarAccess.getMultiselectionAccess().getInputTypeAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2080:1: ( rule__Multiselection__InputTypeAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INPUT_DESCRIPTION) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2080:2: rule__Multiselection__InputTypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Multiselection__InputTypeAssignment_1_in_rule__Multiselection__Group__1__Impl4204);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2094:1: rule__ButtonDefinition__Group__0 : rule__ButtonDefinition__Group__0__Impl rule__ButtonDefinition__Group__1 ;
    public final void rule__ButtonDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2098:1: ( rule__ButtonDefinition__Group__0__Impl rule__ButtonDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2099:2: rule__ButtonDefinition__Group__0__Impl rule__ButtonDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__0__Impl_in_rule__ButtonDefinition__Group__04239);
            rule__ButtonDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonDefinition__Group__1_in_rule__ButtonDefinition__Group__04242);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2106:1: rule__ButtonDefinition__Group__0__Impl : ( ( rule__ButtonDefinition__NameAssignment_0 ) ) ;
    public final void rule__ButtonDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2110:1: ( ( ( rule__ButtonDefinition__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2111:1: ( ( rule__ButtonDefinition__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2111:1: ( ( rule__ButtonDefinition__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2112:1: ( rule__ButtonDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getButtonDefinitionAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2113:1: ( rule__ButtonDefinition__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2113:2: rule__ButtonDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__NameAssignment_0_in_rule__ButtonDefinition__Group__0__Impl4269);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2123:1: rule__ButtonDefinition__Group__1 : rule__ButtonDefinition__Group__1__Impl rule__ButtonDefinition__Group__2 ;
    public final void rule__ButtonDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2127:1: ( rule__ButtonDefinition__Group__1__Impl rule__ButtonDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2128:2: rule__ButtonDefinition__Group__1__Impl rule__ButtonDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__1__Impl_in_rule__ButtonDefinition__Group__14299);
            rule__ButtonDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonDefinition__Group__2_in_rule__ButtonDefinition__Group__14302);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2135:1: rule__ButtonDefinition__Group__1__Impl : ( 'as:' ) ;
    public final void rule__ButtonDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2139:1: ( ( 'as:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2140:1: ( 'as:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2140:1: ( 'as:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2141:1: 'as:'
            {
             before(grammarAccess.getButtonDefinitionAccess().getAsKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__ButtonDefinition__Group__1__Impl4330); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2154:1: rule__ButtonDefinition__Group__2 : rule__ButtonDefinition__Group__2__Impl rule__ButtonDefinition__Group__3 ;
    public final void rule__ButtonDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2158:1: ( rule__ButtonDefinition__Group__2__Impl rule__ButtonDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2159:2: rule__ButtonDefinition__Group__2__Impl rule__ButtonDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__2__Impl_in_rule__ButtonDefinition__Group__24361);
            rule__ButtonDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonDefinition__Group__3_in_rule__ButtonDefinition__Group__24364);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2166:1: rule__ButtonDefinition__Group__2__Impl : ( ( rule__ButtonDefinition__IdAssignment_2 ) ) ;
    public final void rule__ButtonDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2170:1: ( ( ( rule__ButtonDefinition__IdAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2171:1: ( ( rule__ButtonDefinition__IdAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2171:1: ( ( rule__ButtonDefinition__IdAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2172:1: ( rule__ButtonDefinition__IdAssignment_2 )
            {
             before(grammarAccess.getButtonDefinitionAccess().getIdAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2173:1: ( rule__ButtonDefinition__IdAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2173:2: rule__ButtonDefinition__IdAssignment_2
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__IdAssignment_2_in_rule__ButtonDefinition__Group__2__Impl4391);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2183:1: rule__ButtonDefinition__Group__3 : rule__ButtonDefinition__Group__3__Impl ;
    public final void rule__ButtonDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2187:1: ( rule__ButtonDefinition__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2188:2: rule__ButtonDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__3__Impl_in_rule__ButtonDefinition__Group__34421);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2194:1: rule__ButtonDefinition__Group__3__Impl : ( ( rule__ButtonDefinition__PropertiesAssignment_3 )? ) ;
    public final void rule__ButtonDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2198:1: ( ( ( rule__ButtonDefinition__PropertiesAssignment_3 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2199:1: ( ( rule__ButtonDefinition__PropertiesAssignment_3 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2199:1: ( ( rule__ButtonDefinition__PropertiesAssignment_3 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2200:1: ( rule__ButtonDefinition__PropertiesAssignment_3 )?
            {
             before(grammarAccess.getButtonDefinitionAccess().getPropertiesAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2201:1: ( rule__ButtonDefinition__PropertiesAssignment_3 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2201:2: rule__ButtonDefinition__PropertiesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__ButtonDefinition__PropertiesAssignment_3_in_rule__ButtonDefinition__Group__3__Impl4448);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2219:1: rule__Properties__Group__0 : rule__Properties__Group__0__Impl rule__Properties__Group__1 ;
    public final void rule__Properties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2223:1: ( rule__Properties__Group__0__Impl rule__Properties__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2224:2: rule__Properties__Group__0__Impl rule__Properties__Group__1
            {
            pushFollow(FOLLOW_rule__Properties__Group__0__Impl_in_rule__Properties__Group__04487);
            rule__Properties__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Properties__Group__1_in_rule__Properties__Group__04490);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2231:1: rule__Properties__Group__0__Impl : ( '->' ) ;
    public final void rule__Properties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2235:1: ( ( '->' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2236:1: ( '->' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2236:1: ( '->' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2237:1: '->'
            {
             before(grammarAccess.getPropertiesAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Properties__Group__0__Impl4518); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2250:1: rule__Properties__Group__1 : rule__Properties__Group__1__Impl ;
    public final void rule__Properties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2254:1: ( rule__Properties__Group__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2255:2: rule__Properties__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Properties__Group__1__Impl_in_rule__Properties__Group__14549);
            rule__Properties__Group__1__Impl();

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2261:1: rule__Properties__Group__1__Impl : ( ( ( rule__Properties__PropertiesDefinitionsAssignment_1 ) ) ( ( rule__Properties__PropertiesDefinitionsAssignment_1 )* ) ) ;
    public final void rule__Properties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2265:1: ( ( ( ( rule__Properties__PropertiesDefinitionsAssignment_1 ) ) ( ( rule__Properties__PropertiesDefinitionsAssignment_1 )* ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2266:1: ( ( ( rule__Properties__PropertiesDefinitionsAssignment_1 ) ) ( ( rule__Properties__PropertiesDefinitionsAssignment_1 )* ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2266:1: ( ( ( rule__Properties__PropertiesDefinitionsAssignment_1 ) ) ( ( rule__Properties__PropertiesDefinitionsAssignment_1 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2267:1: ( ( rule__Properties__PropertiesDefinitionsAssignment_1 ) ) ( ( rule__Properties__PropertiesDefinitionsAssignment_1 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2267:1: ( ( rule__Properties__PropertiesDefinitionsAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2268:1: ( rule__Properties__PropertiesDefinitionsAssignment_1 )
            {
             before(grammarAccess.getPropertiesAccess().getPropertiesDefinitionsAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2269:1: ( rule__Properties__PropertiesDefinitionsAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2269:2: rule__Properties__PropertiesDefinitionsAssignment_1
            {
            pushFollow(FOLLOW_rule__Properties__PropertiesDefinitionsAssignment_1_in_rule__Properties__Group__1__Impl4578);
            rule__Properties__PropertiesDefinitionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertiesAccess().getPropertiesDefinitionsAssignment_1()); 

            }

            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2272:1: ( ( rule__Properties__PropertiesDefinitionsAssignment_1 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2273:1: ( rule__Properties__PropertiesDefinitionsAssignment_1 )*
            {
             before(grammarAccess.getPropertiesAccess().getPropertiesDefinitionsAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2274:1: ( rule__Properties__PropertiesDefinitionsAssignment_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=25 && LA19_0<=27)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2274:2: rule__Properties__PropertiesDefinitionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Properties__PropertiesDefinitionsAssignment_1_in_rule__Properties__Group__1__Impl4590);
            	    rule__Properties__PropertiesDefinitionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getPropertiesAccess().getPropertiesDefinitionsAssignment_1()); 

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
    // $ANTLR end "rule__Properties__Group__1__Impl"


    // $ANTLR start "rule__PropertiesDefinition__Group_0__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2289:1: rule__PropertiesDefinition__Group_0__0 : rule__PropertiesDefinition__Group_0__0__Impl rule__PropertiesDefinition__Group_0__1 ;
    public final void rule__PropertiesDefinition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2293:1: ( rule__PropertiesDefinition__Group_0__0__Impl rule__PropertiesDefinition__Group_0__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2294:2: rule__PropertiesDefinition__Group_0__0__Impl rule__PropertiesDefinition__Group_0__1
            {
            pushFollow(FOLLOW_rule__PropertiesDefinition__Group_0__0__Impl_in_rule__PropertiesDefinition__Group_0__04627);
            rule__PropertiesDefinition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertiesDefinition__Group_0__1_in_rule__PropertiesDefinition__Group_0__04630);
            rule__PropertiesDefinition__Group_0__1();

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
    // $ANTLR end "rule__PropertiesDefinition__Group_0__0"


    // $ANTLR start "rule__PropertiesDefinition__Group_0__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2301:1: rule__PropertiesDefinition__Group_0__0__Impl : ( 'propertyKey=' ) ;
    public final void rule__PropertiesDefinition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2305:1: ( ( 'propertyKey=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2306:1: ( 'propertyKey=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2306:1: ( 'propertyKey=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2307:1: 'propertyKey='
            {
             before(grammarAccess.getPropertiesDefinitionAccess().getPropertyKeyKeyword_0_0()); 
            match(input,25,FOLLOW_25_in_rule__PropertiesDefinition__Group_0__0__Impl4658); 
             after(grammarAccess.getPropertiesDefinitionAccess().getPropertyKeyKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertiesDefinition__Group_0__0__Impl"


    // $ANTLR start "rule__PropertiesDefinition__Group_0__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2320:1: rule__PropertiesDefinition__Group_0__1 : rule__PropertiesDefinition__Group_0__1__Impl ;
    public final void rule__PropertiesDefinition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2324:1: ( rule__PropertiesDefinition__Group_0__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2325:2: rule__PropertiesDefinition__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertiesDefinition__Group_0__1__Impl_in_rule__PropertiesDefinition__Group_0__14689);
            rule__PropertiesDefinition__Group_0__1__Impl();

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
    // $ANTLR end "rule__PropertiesDefinition__Group_0__1"


    // $ANTLR start "rule__PropertiesDefinition__Group_0__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2331:1: rule__PropertiesDefinition__Group_0__1__Impl : ( ( rule__PropertiesDefinition__PropertyKeyAssignment_0_1 ) ) ;
    public final void rule__PropertiesDefinition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2335:1: ( ( ( rule__PropertiesDefinition__PropertyKeyAssignment_0_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2336:1: ( ( rule__PropertiesDefinition__PropertyKeyAssignment_0_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2336:1: ( ( rule__PropertiesDefinition__PropertyKeyAssignment_0_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2337:1: ( rule__PropertiesDefinition__PropertyKeyAssignment_0_1 )
            {
             before(grammarAccess.getPropertiesDefinitionAccess().getPropertyKeyAssignment_0_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2338:1: ( rule__PropertiesDefinition__PropertyKeyAssignment_0_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2338:2: rule__PropertiesDefinition__PropertyKeyAssignment_0_1
            {
            pushFollow(FOLLOW_rule__PropertiesDefinition__PropertyKeyAssignment_0_1_in_rule__PropertiesDefinition__Group_0__1__Impl4716);
            rule__PropertiesDefinition__PropertyKeyAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertiesDefinitionAccess().getPropertyKeyAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertiesDefinition__Group_0__1__Impl"


    // $ANTLR start "rule__PropertiesDefinition__Group_1__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2352:1: rule__PropertiesDefinition__Group_1__0 : rule__PropertiesDefinition__Group_1__0__Impl rule__PropertiesDefinition__Group_1__1 ;
    public final void rule__PropertiesDefinition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2356:1: ( rule__PropertiesDefinition__Group_1__0__Impl rule__PropertiesDefinition__Group_1__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2357:2: rule__PropertiesDefinition__Group_1__0__Impl rule__PropertiesDefinition__Group_1__1
            {
            pushFollow(FOLLOW_rule__PropertiesDefinition__Group_1__0__Impl_in_rule__PropertiesDefinition__Group_1__04750);
            rule__PropertiesDefinition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertiesDefinition__Group_1__1_in_rule__PropertiesDefinition__Group_1__04753);
            rule__PropertiesDefinition__Group_1__1();

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
    // $ANTLR end "rule__PropertiesDefinition__Group_1__0"


    // $ANTLR start "rule__PropertiesDefinition__Group_1__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2364:1: rule__PropertiesDefinition__Group_1__0__Impl : ( 'text=' ) ;
    public final void rule__PropertiesDefinition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2368:1: ( ( 'text=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2369:1: ( 'text=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2369:1: ( 'text=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2370:1: 'text='
            {
             before(grammarAccess.getPropertiesDefinitionAccess().getTextKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__PropertiesDefinition__Group_1__0__Impl4781); 
             after(grammarAccess.getPropertiesDefinitionAccess().getTextKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertiesDefinition__Group_1__0__Impl"


    // $ANTLR start "rule__PropertiesDefinition__Group_1__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2383:1: rule__PropertiesDefinition__Group_1__1 : rule__PropertiesDefinition__Group_1__1__Impl ;
    public final void rule__PropertiesDefinition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2387:1: ( rule__PropertiesDefinition__Group_1__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2388:2: rule__PropertiesDefinition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertiesDefinition__Group_1__1__Impl_in_rule__PropertiesDefinition__Group_1__14812);
            rule__PropertiesDefinition__Group_1__1__Impl();

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
    // $ANTLR end "rule__PropertiesDefinition__Group_1__1"


    // $ANTLR start "rule__PropertiesDefinition__Group_1__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2394:1: rule__PropertiesDefinition__Group_1__1__Impl : ( ( rule__PropertiesDefinition__TextAssignment_1_1 ) ) ;
    public final void rule__PropertiesDefinition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2398:1: ( ( ( rule__PropertiesDefinition__TextAssignment_1_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2399:1: ( ( rule__PropertiesDefinition__TextAssignment_1_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2399:1: ( ( rule__PropertiesDefinition__TextAssignment_1_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2400:1: ( rule__PropertiesDefinition__TextAssignment_1_1 )
            {
             before(grammarAccess.getPropertiesDefinitionAccess().getTextAssignment_1_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2401:1: ( rule__PropertiesDefinition__TextAssignment_1_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2401:2: rule__PropertiesDefinition__TextAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PropertiesDefinition__TextAssignment_1_1_in_rule__PropertiesDefinition__Group_1__1__Impl4839);
            rule__PropertiesDefinition__TextAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertiesDefinitionAccess().getTextAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertiesDefinition__Group_1__1__Impl"


    // $ANTLR start "rule__PropertiesDefinition__Group_2__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2415:1: rule__PropertiesDefinition__Group_2__0 : rule__PropertiesDefinition__Group_2__0__Impl rule__PropertiesDefinition__Group_2__1 ;
    public final void rule__PropertiesDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2419:1: ( rule__PropertiesDefinition__Group_2__0__Impl rule__PropertiesDefinition__Group_2__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2420:2: rule__PropertiesDefinition__Group_2__0__Impl rule__PropertiesDefinition__Group_2__1
            {
            pushFollow(FOLLOW_rule__PropertiesDefinition__Group_2__0__Impl_in_rule__PropertiesDefinition__Group_2__04873);
            rule__PropertiesDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertiesDefinition__Group_2__1_in_rule__PropertiesDefinition__Group_2__04876);
            rule__PropertiesDefinition__Group_2__1();

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
    // $ANTLR end "rule__PropertiesDefinition__Group_2__0"


    // $ANTLR start "rule__PropertiesDefinition__Group_2__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2427:1: rule__PropertiesDefinition__Group_2__0__Impl : ( 'interactiontype=' ) ;
    public final void rule__PropertiesDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2431:1: ( ( 'interactiontype=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2432:1: ( 'interactiontype=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2432:1: ( 'interactiontype=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2433:1: 'interactiontype='
            {
             before(grammarAccess.getPropertiesDefinitionAccess().getInteractiontypeKeyword_2_0()); 
            match(input,27,FOLLOW_27_in_rule__PropertiesDefinition__Group_2__0__Impl4904); 
             after(grammarAccess.getPropertiesDefinitionAccess().getInteractiontypeKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertiesDefinition__Group_2__0__Impl"


    // $ANTLR start "rule__PropertiesDefinition__Group_2__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2446:1: rule__PropertiesDefinition__Group_2__1 : rule__PropertiesDefinition__Group_2__1__Impl ;
    public final void rule__PropertiesDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2450:1: ( rule__PropertiesDefinition__Group_2__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2451:2: rule__PropertiesDefinition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertiesDefinition__Group_2__1__Impl_in_rule__PropertiesDefinition__Group_2__14935);
            rule__PropertiesDefinition__Group_2__1__Impl();

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
    // $ANTLR end "rule__PropertiesDefinition__Group_2__1"


    // $ANTLR start "rule__PropertiesDefinition__Group_2__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2457:1: rule__PropertiesDefinition__Group_2__1__Impl : ( ( ( rule__PropertiesDefinition__InteractiontypeAssignment_2_1 ) ) ( ( rule__PropertiesDefinition__InteractiontypeAssignment_2_1 )* ) ) ;
    public final void rule__PropertiesDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2461:1: ( ( ( ( rule__PropertiesDefinition__InteractiontypeAssignment_2_1 ) ) ( ( rule__PropertiesDefinition__InteractiontypeAssignment_2_1 )* ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2462:1: ( ( ( rule__PropertiesDefinition__InteractiontypeAssignment_2_1 ) ) ( ( rule__PropertiesDefinition__InteractiontypeAssignment_2_1 )* ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2462:1: ( ( ( rule__PropertiesDefinition__InteractiontypeAssignment_2_1 ) ) ( ( rule__PropertiesDefinition__InteractiontypeAssignment_2_1 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2463:1: ( ( rule__PropertiesDefinition__InteractiontypeAssignment_2_1 ) ) ( ( rule__PropertiesDefinition__InteractiontypeAssignment_2_1 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2463:1: ( ( rule__PropertiesDefinition__InteractiontypeAssignment_2_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2464:1: ( rule__PropertiesDefinition__InteractiontypeAssignment_2_1 )
            {
             before(grammarAccess.getPropertiesDefinitionAccess().getInteractiontypeAssignment_2_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2465:1: ( rule__PropertiesDefinition__InteractiontypeAssignment_2_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2465:2: rule__PropertiesDefinition__InteractiontypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__PropertiesDefinition__InteractiontypeAssignment_2_1_in_rule__PropertiesDefinition__Group_2__1__Impl4964);
            rule__PropertiesDefinition__InteractiontypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertiesDefinitionAccess().getInteractiontypeAssignment_2_1()); 

            }

            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2468:1: ( ( rule__PropertiesDefinition__InteractiontypeAssignment_2_1 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2469:1: ( rule__PropertiesDefinition__InteractiontypeAssignment_2_1 )*
            {
             before(grammarAccess.getPropertiesDefinitionAccess().getInteractiontypeAssignment_2_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2470:1: ( rule__PropertiesDefinition__InteractiontypeAssignment_2_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=15 && LA20_0<=16)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2470:2: rule__PropertiesDefinition__InteractiontypeAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__PropertiesDefinition__InteractiontypeAssignment_2_1_in_rule__PropertiesDefinition__Group_2__1__Impl4976);
            	    rule__PropertiesDefinition__InteractiontypeAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getPropertiesDefinitionAccess().getInteractiontypeAssignment_2_1()); 

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
    // $ANTLR end "rule__PropertiesDefinition__Group_2__1__Impl"


    // $ANTLR start "rule__LabelDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2485:1: rule__LabelDefinition__Group__0 : rule__LabelDefinition__Group__0__Impl rule__LabelDefinition__Group__1 ;
    public final void rule__LabelDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2489:1: ( rule__LabelDefinition__Group__0__Impl rule__LabelDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2490:2: rule__LabelDefinition__Group__0__Impl rule__LabelDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__0__Impl_in_rule__LabelDefinition__Group__05013);
            rule__LabelDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelDefinition__Group__1_in_rule__LabelDefinition__Group__05016);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2497:1: rule__LabelDefinition__Group__0__Impl : ( ( rule__LabelDefinition__NameAssignment_0 ) ) ;
    public final void rule__LabelDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2501:1: ( ( ( rule__LabelDefinition__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2502:1: ( ( rule__LabelDefinition__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2502:1: ( ( rule__LabelDefinition__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2503:1: ( rule__LabelDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getLabelDefinitionAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2504:1: ( rule__LabelDefinition__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2504:2: rule__LabelDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__LabelDefinition__NameAssignment_0_in_rule__LabelDefinition__Group__0__Impl5043);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2514:1: rule__LabelDefinition__Group__1 : rule__LabelDefinition__Group__1__Impl rule__LabelDefinition__Group__2 ;
    public final void rule__LabelDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2518:1: ( rule__LabelDefinition__Group__1__Impl rule__LabelDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2519:2: rule__LabelDefinition__Group__1__Impl rule__LabelDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__1__Impl_in_rule__LabelDefinition__Group__15073);
            rule__LabelDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelDefinition__Group__2_in_rule__LabelDefinition__Group__15076);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2526:1: rule__LabelDefinition__Group__1__Impl : ( 'as' ) ;
    public final void rule__LabelDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2530:1: ( ( 'as' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2531:1: ( 'as' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2531:1: ( 'as' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2532:1: 'as'
            {
             before(grammarAccess.getLabelDefinitionAccess().getAsKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__LabelDefinition__Group__1__Impl5104); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2545:1: rule__LabelDefinition__Group__2 : rule__LabelDefinition__Group__2__Impl rule__LabelDefinition__Group__3 ;
    public final void rule__LabelDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2549:1: ( rule__LabelDefinition__Group__2__Impl rule__LabelDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2550:2: rule__LabelDefinition__Group__2__Impl rule__LabelDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__2__Impl_in_rule__LabelDefinition__Group__25135);
            rule__LabelDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelDefinition__Group__3_in_rule__LabelDefinition__Group__25138);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2557:1: rule__LabelDefinition__Group__2__Impl : ( ( rule__LabelDefinition__IdAssignment_2 ) ) ;
    public final void rule__LabelDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2561:1: ( ( ( rule__LabelDefinition__IdAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2562:1: ( ( rule__LabelDefinition__IdAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2562:1: ( ( rule__LabelDefinition__IdAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2563:1: ( rule__LabelDefinition__IdAssignment_2 )
            {
             before(grammarAccess.getLabelDefinitionAccess().getIdAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2564:1: ( rule__LabelDefinition__IdAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2564:2: rule__LabelDefinition__IdAssignment_2
            {
            pushFollow(FOLLOW_rule__LabelDefinition__IdAssignment_2_in_rule__LabelDefinition__Group__2__Impl5165);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2574:1: rule__LabelDefinition__Group__3 : rule__LabelDefinition__Group__3__Impl ;
    public final void rule__LabelDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2578:1: ( rule__LabelDefinition__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2579:2: rule__LabelDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__3__Impl_in_rule__LabelDefinition__Group__35195);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2585:1: rule__LabelDefinition__Group__3__Impl : ( ( rule__LabelDefinition__PropertiesAssignment_3 )? ) ;
    public final void rule__LabelDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2589:1: ( ( ( rule__LabelDefinition__PropertiesAssignment_3 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2590:1: ( ( rule__LabelDefinition__PropertiesAssignment_3 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2590:1: ( ( rule__LabelDefinition__PropertiesAssignment_3 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2591:1: ( rule__LabelDefinition__PropertiesAssignment_3 )?
            {
             before(grammarAccess.getLabelDefinitionAccess().getPropertiesAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2592:1: ( rule__LabelDefinition__PropertiesAssignment_3 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2592:2: rule__LabelDefinition__PropertiesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__LabelDefinition__PropertiesAssignment_3_in_rule__LabelDefinition__Group__3__Impl5222);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2611:1: rule__UIDescription__TypeDefinitionAssignment_0 : ( ruleTypeDefinition ) ;
    public final void rule__UIDescription__TypeDefinitionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2615:1: ( ( ruleTypeDefinition ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2616:1: ( ruleTypeDefinition )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2616:1: ( ruleTypeDefinition )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2617:1: ruleTypeDefinition
            {
             before(grammarAccess.getUIDescriptionAccess().getTypeDefinitionTypeDefinitionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTypeDefinition_in_rule__UIDescription__TypeDefinitionAssignment_05266);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2626:1: rule__UIDescription__PropertyAssignment_1 : ( ruleProperty ) ;
    public final void rule__UIDescription__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2630:1: ( ( ruleProperty ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2631:1: ( ruleProperty )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2631:1: ( ruleProperty )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2632:1: ruleProperty
            {
             before(grammarAccess.getUIDescriptionAccess().getPropertyPropertyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__UIDescription__PropertyAssignment_15297);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2641:1: rule__UIDescription__UsedDescriptionsAssignment_2 : ( ruleUsedDescriptions ) ;
    public final void rule__UIDescription__UsedDescriptionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2645:1: ( ( ruleUsedDescriptions ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2646:1: ( ruleUsedDescriptions )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2646:1: ( ruleUsedDescriptions )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2647:1: ruleUsedDescriptions
            {
             before(grammarAccess.getUIDescriptionAccess().getUsedDescriptionsUsedDescriptionsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleUsedDescriptions_in_rule__UIDescription__UsedDescriptionsAssignment_25328);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2656:1: rule__UIDescription__RefinementsAssignment_3 : ( ruleRefinement ) ;
    public final void rule__UIDescription__RefinementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2660:1: ( ( ruleRefinement ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2661:1: ( ruleRefinement )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2661:1: ( ruleRefinement )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2662:1: ruleRefinement
            {
             before(grammarAccess.getUIDescriptionAccess().getRefinementsRefinementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRefinement_in_rule__UIDescription__RefinementsAssignment_35359);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2671:1: rule__UIDescription__DefinitionsAssignment_4 : ( ruleDefinition ) ;
    public final void rule__UIDescription__DefinitionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2675:1: ( ( ruleDefinition ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2676:1: ( ruleDefinition )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2676:1: ( ruleDefinition )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2677:1: ruleDefinition
            {
             before(grammarAccess.getUIDescriptionAccess().getDefinitionsDefinitionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleDefinition_in_rule__UIDescription__DefinitionsAssignment_45390);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2686:1: rule__UIDescription__StructureAssignment_5 : ( ruleStructure ) ;
    public final void rule__UIDescription__StructureAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2690:1: ( ( ruleStructure ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2691:1: ( ruleStructure )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2691:1: ( ruleStructure )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2692:1: ruleStructure
            {
             before(grammarAccess.getUIDescriptionAccess().getStructureStructureParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleStructure_in_rule__UIDescription__StructureAssignment_55421);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2701:1: rule__Structure__NameAssignment_0 : ( ( 'Structure' ) ) ;
    public final void rule__Structure__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2705:1: ( ( ( 'Structure' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2706:1: ( ( 'Structure' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2706:1: ( ( 'Structure' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2707:1: ( 'Structure' )
            {
             before(grammarAccess.getStructureAccess().getNameStructureKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2708:1: ( 'Structure' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2709:1: 'Structure'
            {
             before(grammarAccess.getStructureAccess().getNameStructureKeyword_0_0()); 
            match(input,29,FOLLOW_29_in_rule__Structure__NameAssignment_05457); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2724:1: rule__Structure__OrderedElementsAssignment_2 : ( ruleElement ) ;
    public final void rule__Structure__OrderedElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2728:1: ( ( ruleElement ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2729:1: ( ruleElement )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2729:1: ( ruleElement )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2730:1: ruleElement
            {
             before(grammarAccess.getStructureAccess().getOrderedElementsElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleElement_in_rule__Structure__OrderedElementsAssignment_25496);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2739:1: rule__Element__IdAssignment : ( RULE_STRING ) ;
    public final void rule__Element__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2743:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2744:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2744:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2745:1: RULE_STRING
            {
             before(grammarAccess.getElementAccess().getIdSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Element__IdAssignment5527); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2754:1: rule__Refinement__ConcreteRefinementAssignment_0 : ( ruleComponentRefinement ) ;
    public final void rule__Refinement__ConcreteRefinementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2758:1: ( ( ruleComponentRefinement ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2759:1: ( ruleComponentRefinement )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2759:1: ( ruleComponentRefinement )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2760:1: ruleComponentRefinement
            {
             before(grammarAccess.getRefinementAccess().getConcreteRefinementComponentRefinementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleComponentRefinement_in_rule__Refinement__ConcreteRefinementAssignment_05558);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2769:1: rule__ButtonRefinement__NameAssignment_0 : ( ( 'Button' ) ) ;
    public final void rule__ButtonRefinement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2773:1: ( ( ( 'Button' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2774:1: ( ( 'Button' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2774:1: ( ( 'Button' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2775:1: ( 'Button' )
            {
             before(grammarAccess.getButtonRefinementAccess().getNameButtonKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2776:1: ( 'Button' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2777:1: 'Button'
            {
             before(grammarAccess.getButtonRefinementAccess().getNameButtonKeyword_0_0()); 
            match(input,30,FOLLOW_30_in_rule__ButtonRefinement__NameAssignment_05594); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2792:1: rule__ButtonRefinement__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ButtonRefinement__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2796:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2797:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2797:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2798:1: RULE_STRING
            {
             before(grammarAccess.getButtonRefinementAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ButtonRefinement__IdAssignment_25633); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2807:1: rule__ButtonRefinement__PropertiesAssignment_3 : ( ruleProperties ) ;
    public final void rule__ButtonRefinement__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2811:1: ( ( ruleProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2812:1: ( ruleProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2812:1: ( ruleProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2813:1: ruleProperties
            {
             before(grammarAccess.getButtonRefinementAccess().getPropertiesPropertiesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleProperties_in_rule__ButtonRefinement__PropertiesAssignment_35664);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2822:1: rule__LabelRefinement__NameAssignment_0 : ( ( 'Label' ) ) ;
    public final void rule__LabelRefinement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2826:1: ( ( ( 'Label' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2827:1: ( ( 'Label' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2827:1: ( ( 'Label' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2828:1: ( 'Label' )
            {
             before(grammarAccess.getLabelRefinementAccess().getNameLabelKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2829:1: ( 'Label' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2830:1: 'Label'
            {
             before(grammarAccess.getLabelRefinementAccess().getNameLabelKeyword_0_0()); 
            match(input,31,FOLLOW_31_in_rule__LabelRefinement__NameAssignment_05700); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2845:1: rule__LabelRefinement__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LabelRefinement__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2849:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2850:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2850:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2851:1: RULE_STRING
            {
             before(grammarAccess.getLabelRefinementAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LabelRefinement__IdAssignment_25739); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2860:1: rule__LabelRefinement__PropertiesAssignment_3 : ( ruleProperties ) ;
    public final void rule__LabelRefinement__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2864:1: ( ( ruleProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2865:1: ( ruleProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2865:1: ( ruleProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2866:1: ruleProperties
            {
             before(grammarAccess.getLabelRefinementAccess().getPropertiesPropertiesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleProperties_in_rule__LabelRefinement__PropertiesAssignment_35770);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2875:1: rule__Property__PropertiesFileAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Property__PropertiesFileAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2879:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2880:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2880:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2881:1: RULE_STRING
            {
             before(grammarAccess.getPropertyAccess().getPropertiesFileSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Property__PropertiesFileAssignment_15801); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2890:1: rule__UsedDescriptions__DescriptionAssignment_1 : ( ruleDescriptionType ) ;
    public final void rule__UsedDescriptions__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2894:1: ( ( ruleDescriptionType ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2895:1: ( ruleDescriptionType )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2895:1: ( ruleDescriptionType )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2896:1: ruleDescriptionType
            {
             before(grammarAccess.getUsedDescriptionsAccess().getDescriptionDescriptionTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDescriptionType_in_rule__UsedDescriptions__DescriptionAssignment_15832);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2905:1: rule__UsedDescriptions__IdAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__UsedDescriptions__IdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2909:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2910:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2910:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2911:1: RULE_STRING
            {
             before(grammarAccess.getUsedDescriptionsAccess().getIdSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UsedDescriptions__IdAssignment_2_15863); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2920:1: rule__Definition__ConcreteDefitionAssignment_0 : ( ruleComponentDefinition ) ;
    public final void rule__Definition__ConcreteDefitionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2924:1: ( ( ruleComponentDefinition ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2925:1: ( ruleComponentDefinition )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2925:1: ( ruleComponentDefinition )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2926:1: ruleComponentDefinition
            {
             before(grammarAccess.getDefinitionAccess().getConcreteDefitionComponentDefinitionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleComponentDefinition_in_rule__Definition__ConcreteDefitionAssignment_05894);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2935:1: rule__TypeDefinition__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__TypeDefinition__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2939:1: ( ( ruleType ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2940:1: ( ruleType )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2940:1: ( ruleType )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2941:1: ruleType
            {
             before(grammarAccess.getTypeDefinitionAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__TypeDefinition__TypeAssignment_15925);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2950:1: rule__Type__IdAssignment : ( ( rule__Type__IdAlternatives_0 ) ) ;
    public final void rule__Type__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2954:1: ( ( ( rule__Type__IdAlternatives_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2955:1: ( ( rule__Type__IdAlternatives_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2955:1: ( ( rule__Type__IdAlternatives_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2956:1: ( rule__Type__IdAlternatives_0 )
            {
             before(grammarAccess.getTypeAccess().getIdAlternatives_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2957:1: ( rule__Type__IdAlternatives_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2957:2: rule__Type__IdAlternatives_0
            {
            pushFollow(FOLLOW_rule__Type__IdAlternatives_0_in_rule__Type__IdAssignment5956);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2966:1: rule__UIDescriptionImport__DescriptionNameAssignment : ( RULE_STRING ) ;
    public final void rule__UIDescriptionImport__DescriptionNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2970:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2971:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2971:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2972:1: RULE_STRING
            {
             before(grammarAccess.getUIDescriptionImportAccess().getDescriptionNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UIDescriptionImport__DescriptionNameAssignment5989); 
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


    // $ANTLR start "rule__TabView__NameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2981:1: rule__TabView__NameAssignment_0 : ( ( 'TabView' ) ) ;
    public final void rule__TabView__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2985:1: ( ( ( 'TabView' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2986:1: ( ( 'TabView' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2986:1: ( ( 'TabView' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2987:1: ( 'TabView' )
            {
             before(grammarAccess.getTabViewAccess().getNameTabViewKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2988:1: ( 'TabView' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2989:1: 'TabView'
            {
             before(grammarAccess.getTabViewAccess().getNameTabViewKeyword_0_0()); 
            match(input,32,FOLLOW_32_in_rule__TabView__NameAssignment_06025); 
             after(grammarAccess.getTabViewAccess().getNameTabViewKeyword_0_0()); 

            }

             after(grammarAccess.getTabViewAccess().getNameTabViewKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabView__NameAssignment_0"


    // $ANTLR start "rule__TabView__TabsAssignment_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3004:1: rule__TabView__TabsAssignment_1 : ( ruleTabDefinition ) ;
    public final void rule__TabView__TabsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3008:1: ( ( ruleTabDefinition ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3009:1: ( ruleTabDefinition )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3009:1: ( ruleTabDefinition )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3010:1: ruleTabDefinition
            {
             before(grammarAccess.getTabViewAccess().getTabsTabDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTabDefinition_in_rule__TabView__TabsAssignment_16064);
            ruleTabDefinition();

            state._fsp--;

             after(grammarAccess.getTabViewAccess().getTabsTabDefinitionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabView__TabsAssignment_1"


    // $ANTLR start "rule__TabDefinition__NameAssignment"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3019:1: rule__TabDefinition__NameAssignment : ( RULE_TABNAME ) ;
    public final void rule__TabDefinition__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3023:1: ( ( RULE_TABNAME ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3024:1: ( RULE_TABNAME )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3024:1: ( RULE_TABNAME )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3025:1: RULE_TABNAME
            {
             before(grammarAccess.getTabDefinitionAccess().getNameTABNAMETerminalRuleCall_0()); 
            match(input,RULE_TABNAME,FOLLOW_RULE_TABNAME_in_rule__TabDefinition__NameAssignment6095); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3034:1: rule__Multiselection__NameAssignment_0 : ( ( 'Multiselection' ) ) ;
    public final void rule__Multiselection__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3038:1: ( ( ( 'Multiselection' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3039:1: ( ( 'Multiselection' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3039:1: ( ( 'Multiselection' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3040:1: ( 'Multiselection' )
            {
             before(grammarAccess.getMultiselectionAccess().getNameMultiselectionKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3041:1: ( 'Multiselection' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3042:1: 'Multiselection'
            {
             before(grammarAccess.getMultiselectionAccess().getNameMultiselectionKeyword_0_0()); 
            match(input,33,FOLLOW_33_in_rule__Multiselection__NameAssignment_06131); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3057:1: rule__Multiselection__InputTypeAssignment_1 : ( RULE_INPUT_DESCRIPTION ) ;
    public final void rule__Multiselection__InputTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3061:1: ( ( RULE_INPUT_DESCRIPTION ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3062:1: ( RULE_INPUT_DESCRIPTION )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3062:1: ( RULE_INPUT_DESCRIPTION )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3063:1: RULE_INPUT_DESCRIPTION
            {
             before(grammarAccess.getMultiselectionAccess().getInputTypeINPUT_DESCRIPTIONTerminalRuleCall_1_0()); 
            match(input,RULE_INPUT_DESCRIPTION,FOLLOW_RULE_INPUT_DESCRIPTION_in_rule__Multiselection__InputTypeAssignment_16170); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3072:1: rule__ButtonDefinition__NameAssignment_0 : ( ( 'Button' ) ) ;
    public final void rule__ButtonDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3076:1: ( ( ( 'Button' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3077:1: ( ( 'Button' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3077:1: ( ( 'Button' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3078:1: ( 'Button' )
            {
             before(grammarAccess.getButtonDefinitionAccess().getNameButtonKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3079:1: ( 'Button' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3080:1: 'Button'
            {
             before(grammarAccess.getButtonDefinitionAccess().getNameButtonKeyword_0_0()); 
            match(input,30,FOLLOW_30_in_rule__ButtonDefinition__NameAssignment_06206); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3095:1: rule__ButtonDefinition__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ButtonDefinition__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3099:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3100:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3100:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3101:1: RULE_STRING
            {
             before(grammarAccess.getButtonDefinitionAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ButtonDefinition__IdAssignment_26245); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3110:1: rule__ButtonDefinition__PropertiesAssignment_3 : ( ruleProperties ) ;
    public final void rule__ButtonDefinition__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3114:1: ( ( ruleProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3115:1: ( ruleProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3115:1: ( ruleProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3116:1: ruleProperties
            {
             before(grammarAccess.getButtonDefinitionAccess().getPropertiesPropertiesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleProperties_in_rule__ButtonDefinition__PropertiesAssignment_36276);
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


    // $ANTLR start "rule__Properties__PropertiesDefinitionsAssignment_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3125:1: rule__Properties__PropertiesDefinitionsAssignment_1 : ( rulePropertiesDefinition ) ;
    public final void rule__Properties__PropertiesDefinitionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3129:1: ( ( rulePropertiesDefinition ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3130:1: ( rulePropertiesDefinition )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3130:1: ( rulePropertiesDefinition )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3131:1: rulePropertiesDefinition
            {
             before(grammarAccess.getPropertiesAccess().getPropertiesDefinitionsPropertiesDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePropertiesDefinition_in_rule__Properties__PropertiesDefinitionsAssignment_16307);
            rulePropertiesDefinition();

            state._fsp--;

             after(grammarAccess.getPropertiesAccess().getPropertiesDefinitionsPropertiesDefinitionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__PropertiesDefinitionsAssignment_1"


    // $ANTLR start "rule__PropertiesDefinition__PropertyKeyAssignment_0_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3140:1: rule__PropertiesDefinition__PropertyKeyAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__PropertiesDefinition__PropertyKeyAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3144:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3145:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3145:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3146:1: RULE_STRING
            {
             before(grammarAccess.getPropertiesDefinitionAccess().getPropertyKeySTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PropertiesDefinition__PropertyKeyAssignment_0_16338); 
             after(grammarAccess.getPropertiesDefinitionAccess().getPropertyKeySTRINGTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertiesDefinition__PropertyKeyAssignment_0_1"


    // $ANTLR start "rule__PropertiesDefinition__TextAssignment_1_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3155:1: rule__PropertiesDefinition__TextAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__PropertiesDefinition__TextAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3159:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3160:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3160:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3161:1: RULE_STRING
            {
             before(grammarAccess.getPropertiesDefinitionAccess().getTextSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PropertiesDefinition__TextAssignment_1_16369); 
             after(grammarAccess.getPropertiesDefinitionAccess().getTextSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertiesDefinition__TextAssignment_1_1"


    // $ANTLR start "rule__PropertiesDefinition__InteractiontypeAssignment_2_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3170:1: rule__PropertiesDefinition__InteractiontypeAssignment_2_1 : ( ruleInteractiontype ) ;
    public final void rule__PropertiesDefinition__InteractiontypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3174:1: ( ( ruleInteractiontype ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3175:1: ( ruleInteractiontype )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3175:1: ( ruleInteractiontype )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3176:1: ruleInteractiontype
            {
             before(grammarAccess.getPropertiesDefinitionAccess().getInteractiontypeInteractiontypeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleInteractiontype_in_rule__PropertiesDefinition__InteractiontypeAssignment_2_16400);
            ruleInteractiontype();

            state._fsp--;

             after(grammarAccess.getPropertiesDefinitionAccess().getInteractiontypeInteractiontypeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertiesDefinition__InteractiontypeAssignment_2_1"


    // $ANTLR start "rule__LabelDefinition__NameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3185:1: rule__LabelDefinition__NameAssignment_0 : ( ( 'Label' ) ) ;
    public final void rule__LabelDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3189:1: ( ( ( 'Label' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3190:1: ( ( 'Label' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3190:1: ( ( 'Label' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3191:1: ( 'Label' )
            {
             before(grammarAccess.getLabelDefinitionAccess().getNameLabelKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3192:1: ( 'Label' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3193:1: 'Label'
            {
             before(grammarAccess.getLabelDefinitionAccess().getNameLabelKeyword_0_0()); 
            match(input,31,FOLLOW_31_in_rule__LabelDefinition__NameAssignment_06436); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3208:1: rule__LabelDefinition__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LabelDefinition__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3212:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3213:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3213:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3214:1: RULE_STRING
            {
             before(grammarAccess.getLabelDefinitionAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LabelDefinition__IdAssignment_26475); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3223:1: rule__LabelDefinition__PropertiesAssignment_3 : ( ruleProperties ) ;
    public final void rule__LabelDefinition__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3227:1: ( ( ruleProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3228:1: ( ruleProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3228:1: ( ruleProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3229:1: ruleProperties
            {
             before(grammarAccess.getLabelDefinitionAccess().getPropertiesPropertiesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleProperties_in_rule__LabelDefinition__PropertiesAssignment_36506);
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


    // $ANTLR start "rule__Interactiontype__IdAssignment"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3238:1: rule__Interactiontype__IdAssignment : ( ( rule__Interactiontype__IdAlternatives_0 ) ) ;
    public final void rule__Interactiontype__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3242:1: ( ( ( rule__Interactiontype__IdAlternatives_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3243:1: ( ( rule__Interactiontype__IdAlternatives_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3243:1: ( ( rule__Interactiontype__IdAlternatives_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3244:1: ( rule__Interactiontype__IdAlternatives_0 )
            {
             before(grammarAccess.getInteractiontypeAccess().getIdAlternatives_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3245:1: ( rule__Interactiontype__IdAlternatives_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3245:2: rule__Interactiontype__IdAlternatives_0
            {
            pushFollow(FOLLOW_rule__Interactiontype__IdAlternatives_0_in_rule__Interactiontype__IdAssignment6537);
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
    public static final BitSet FOLLOW_rule__Type__IdAssignment_in_ruleType814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIDescriptionImport_in_entryRuleUIDescriptionImport841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIDescriptionImport848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescriptionImport__DescriptionNameAssignment_in_ruleUIDescriptionImport874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexComponent_in_entryRuleComplexComponent901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexComponent908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexComponent__Alternatives_in_ruleComplexComponent934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabView_in_entryRuleTabView961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabView968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabView__Group__0_in_ruleTabView994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabDefinition_in_entryRuleTabDefinition1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabDefinition1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabDefinition__NameAssignment_in_ruleTabDefinition1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiselection_in_entryRuleMultiselection1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiselection1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiselection__Group__0_in_ruleMultiselection1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDefinition_in_entryRuleComponentDefinition1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentDefinition1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentDefinition__Alternatives_in_ruleComponentDefinition1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonDefinition_in_entryRuleButtonDefinition1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonDefinition1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__0_in_ruleButtonDefinition1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperties_in_entryRuleProperties1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperties1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__Group__0_in_ruleProperties1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertiesDefinition_in_entryRulePropertiesDefinition1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertiesDefinition1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertiesDefinition__Alternatives_in_rulePropertiesDefinition1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelDefinition_in_entryRuleLabelDefinition1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelDefinition1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__0_in_ruleLabelDefinition1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractiontype_in_entryRuleInteractiontype1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractiontype1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interactiontype__IdAssignment_in_ruleInteractiontype1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelRefinement_in_rule__ComponentRefinement__Alternatives1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonRefinement_in_rule__ComponentRefinement__Alternatives1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIDescriptionImport_in_rule__DescriptionType__Alternatives1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexComponent_in_rule__DescriptionType__Alternatives1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Type__IdAlternatives_01609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Type__IdAlternatives_01629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiselection_in_rule__ComplexComponent__Alternatives1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabView_in_rule__ComplexComponent__Alternatives1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelDefinition_in_rule__ComponentDefinition__Alternatives1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonDefinition_in_rule__ComponentDefinition__Alternatives1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertiesDefinition__Group_0__0_in_rule__PropertiesDefinition__Alternatives1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertiesDefinition__Group_1__0_in_rule__PropertiesDefinition__Alternatives1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertiesDefinition__Group_2__0_in_rule__PropertiesDefinition__Alternatives1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Interactiontype__IdAlternatives_01831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Interactiontype__IdAlternatives_01851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__0__Impl_in_rule__UIDescription__Group__01883 = new BitSet(new long[]{0x00000000E0300000L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__1_in_rule__UIDescription__Group__01886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__TypeDefinitionAssignment_0_in_rule__UIDescription__Group__0__Impl1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__1__Impl_in_rule__UIDescription__Group__11943 = new BitSet(new long[]{0x00000000E0300000L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__2_in_rule__UIDescription__Group__11946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__PropertyAssignment_1_in_rule__UIDescription__Group__1__Impl1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__2__Impl_in_rule__UIDescription__Group__22004 = new BitSet(new long[]{0x00000000E0300000L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__3_in_rule__UIDescription__Group__22007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__UsedDescriptionsAssignment_2_in_rule__UIDescription__Group__2__Impl2034 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__3__Impl_in_rule__UIDescription__Group__32065 = new BitSet(new long[]{0x00000000E0300000L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__4_in_rule__UIDescription__Group__32068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__RefinementsAssignment_3_in_rule__UIDescription__Group__3__Impl2095 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__4__Impl_in_rule__UIDescription__Group__42126 = new BitSet(new long[]{0x00000000E0300000L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__5_in_rule__UIDescription__Group__42129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__DefinitionsAssignment_4_in_rule__UIDescription__Group__4__Impl2156 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__5__Impl_in_rule__UIDescription__Group__52187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__StructureAssignment_5_in_rule__UIDescription__Group__5__Impl2214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__Group__0__Impl_in_rule__Structure__Group__02256 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Structure__Group__1_in_rule__Structure__Group__02259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__NameAssignment_0_in_rule__Structure__Group__0__Impl2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__Group__1__Impl_in_rule__Structure__Group__12316 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rule__Structure__Group__2_in_rule__Structure__Group__12319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Structure__Group__1__Impl2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__Group__2__Impl_in_rule__Structure__Group__22378 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rule__Structure__Group__3_in_rule__Structure__Group__22381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__OrderedElementsAssignment_2_in_rule__Structure__Group__2__Impl2408 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Structure__Group__3__Impl_in_rule__Structure__Group__32439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Structure__Group__3__Impl2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refinement__Group__0__Impl_in_rule__Refinement__Group__02506 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Refinement__Group__1_in_rule__Refinement__Group__02509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refinement__ConcreteRefinementAssignment_0_in_rule__Refinement__Group__0__Impl2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refinement__Group__1__Impl_in_rule__Refinement__Group__12566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Refinement__Group__1__Impl2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__0__Impl_in_rule__ButtonRefinement__Group__02629 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__1_in_rule__ButtonRefinement__Group__02632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__NameAssignment_0_in_rule__ButtonRefinement__Group__0__Impl2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__1__Impl_in_rule__ButtonRefinement__Group__12689 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__2_in_rule__ButtonRefinement__Group__12692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ButtonRefinement__Group__1__Impl2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__2__Impl_in_rule__ButtonRefinement__Group__22751 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__3_in_rule__ButtonRefinement__Group__22754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__IdAssignment_2_in_rule__ButtonRefinement__Group__2__Impl2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__3__Impl_in_rule__ButtonRefinement__Group__32811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__PropertiesAssignment_3_in_rule__ButtonRefinement__Group__3__Impl2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__0__Impl_in_rule__LabelRefinement__Group__02877 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__1_in_rule__LabelRefinement__Group__02880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__NameAssignment_0_in_rule__LabelRefinement__Group__0__Impl2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__1__Impl_in_rule__LabelRefinement__Group__12937 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__2_in_rule__LabelRefinement__Group__12940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__LabelRefinement__Group__1__Impl2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__2__Impl_in_rule__LabelRefinement__Group__22999 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__3_in_rule__LabelRefinement__Group__23002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__IdAssignment_2_in_rule__LabelRefinement__Group__2__Impl3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__3__Impl_in_rule__LabelRefinement__Group__33059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__PropertiesAssignment_3_in_rule__LabelRefinement__Group__3__Impl3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__03125 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__03128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Property__Group__0__Impl3156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__13187 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__13190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__PropertiesFileAssignment_1_in_rule__Property__Group__1__Impl3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__23247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Property__Group__2__Impl3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group__0__Impl_in_rule__UsedDescriptions__Group__03312 = new BitSet(new long[]{0x0000000300000010L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group__1_in_rule__UsedDescriptions__Group__03315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__UsedDescriptions__Group__0__Impl3343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group__1__Impl_in_rule__UsedDescriptions__Group__13374 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group__2_in_rule__UsedDescriptions__Group__13377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__DescriptionAssignment_1_in_rule__UsedDescriptions__Group__1__Impl3404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group__2__Impl_in_rule__UsedDescriptions__Group__23434 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group__3_in_rule__UsedDescriptions__Group__23437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group_2__0_in_rule__UsedDescriptions__Group__2__Impl3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group__3__Impl_in_rule__UsedDescriptions__Group__33495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__UsedDescriptions__Group__3__Impl3523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group_2__0__Impl_in_rule__UsedDescriptions__Group_2__03562 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group_2__1_in_rule__UsedDescriptions__Group_2__03565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__UsedDescriptions__Group_2__0__Impl3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group_2__1__Impl_in_rule__UsedDescriptions__Group_2__13624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__IdAssignment_2_1_in_rule__UsedDescriptions__Group_2__1__Impl3651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__03685 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__03688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__ConcreteDefitionAssignment_0_in_rule__Definition__Group__0__Impl3715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__13745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Definition__Group__1__Impl3773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__0__Impl_in_rule__TypeDefinition__Group__03808 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__1_in_rule__TypeDefinition__Group__03811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TypeDefinition__Group__0__Impl3839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__1__Impl_in_rule__TypeDefinition__Group__13870 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__2_in_rule__TypeDefinition__Group__13873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__TypeAssignment_1_in_rule__TypeDefinition__Group__1__Impl3900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__2__Impl_in_rule__TypeDefinition__Group__23930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__TypeDefinition__Group__2__Impl3958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabView__Group__0__Impl_in_rule__TabView__Group__03995 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TabView__Group__1_in_rule__TabView__Group__03998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabView__NameAssignment_0_in_rule__TabView__Group__0__Impl4025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabView__Group__1__Impl_in_rule__TabView__Group__14055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabView__TabsAssignment_1_in_rule__TabView__Group__1__Impl4082 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Multiselection__Group__0__Impl_in_rule__Multiselection__Group__04117 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Multiselection__Group__1_in_rule__Multiselection__Group__04120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiselection__NameAssignment_0_in_rule__Multiselection__Group__0__Impl4147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiselection__Group__1__Impl_in_rule__Multiselection__Group__14177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiselection__InputTypeAssignment_1_in_rule__Multiselection__Group__1__Impl4204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__0__Impl_in_rule__ButtonDefinition__Group__04239 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__1_in_rule__ButtonDefinition__Group__04242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__NameAssignment_0_in_rule__ButtonDefinition__Group__0__Impl4269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__1__Impl_in_rule__ButtonDefinition__Group__14299 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__2_in_rule__ButtonDefinition__Group__14302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ButtonDefinition__Group__1__Impl4330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__2__Impl_in_rule__ButtonDefinition__Group__24361 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__3_in_rule__ButtonDefinition__Group__24364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__IdAssignment_2_in_rule__ButtonDefinition__Group__2__Impl4391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__3__Impl_in_rule__ButtonDefinition__Group__34421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__PropertiesAssignment_3_in_rule__ButtonDefinition__Group__3__Impl4448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__Group__0__Impl_in_rule__Properties__Group__04487 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_rule__Properties__Group__1_in_rule__Properties__Group__04490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Properties__Group__0__Impl4518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__Group__1__Impl_in_rule__Properties__Group__14549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__PropertiesDefinitionsAssignment_1_in_rule__Properties__Group__1__Impl4578 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_rule__Properties__PropertiesDefinitionsAssignment_1_in_rule__Properties__Group__1__Impl4590 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_rule__PropertiesDefinition__Group_0__0__Impl_in_rule__PropertiesDefinition__Group_0__04627 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PropertiesDefinition__Group_0__1_in_rule__PropertiesDefinition__Group_0__04630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PropertiesDefinition__Group_0__0__Impl4658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertiesDefinition__Group_0__1__Impl_in_rule__PropertiesDefinition__Group_0__14689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertiesDefinition__PropertyKeyAssignment_0_1_in_rule__PropertiesDefinition__Group_0__1__Impl4716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertiesDefinition__Group_1__0__Impl_in_rule__PropertiesDefinition__Group_1__04750 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PropertiesDefinition__Group_1__1_in_rule__PropertiesDefinition__Group_1__04753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PropertiesDefinition__Group_1__0__Impl4781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertiesDefinition__Group_1__1__Impl_in_rule__PropertiesDefinition__Group_1__14812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertiesDefinition__TextAssignment_1_1_in_rule__PropertiesDefinition__Group_1__1__Impl4839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertiesDefinition__Group_2__0__Impl_in_rule__PropertiesDefinition__Group_2__04873 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__PropertiesDefinition__Group_2__1_in_rule__PropertiesDefinition__Group_2__04876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__PropertiesDefinition__Group_2__0__Impl4904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertiesDefinition__Group_2__1__Impl_in_rule__PropertiesDefinition__Group_2__14935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertiesDefinition__InteractiontypeAssignment_2_1_in_rule__PropertiesDefinition__Group_2__1__Impl4964 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_rule__PropertiesDefinition__InteractiontypeAssignment_2_1_in_rule__PropertiesDefinition__Group_2__1__Impl4976 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__0__Impl_in_rule__LabelDefinition__Group__05013 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__1_in_rule__LabelDefinition__Group__05016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__NameAssignment_0_in_rule__LabelDefinition__Group__0__Impl5043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__1__Impl_in_rule__LabelDefinition__Group__15073 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__2_in_rule__LabelDefinition__Group__15076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__LabelDefinition__Group__1__Impl5104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__2__Impl_in_rule__LabelDefinition__Group__25135 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__3_in_rule__LabelDefinition__Group__25138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__IdAssignment_2_in_rule__LabelDefinition__Group__2__Impl5165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__3__Impl_in_rule__LabelDefinition__Group__35195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__PropertiesAssignment_3_in_rule__LabelDefinition__Group__3__Impl5222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_rule__UIDescription__TypeDefinitionAssignment_05266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__UIDescription__PropertyAssignment_15297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsedDescriptions_in_rule__UIDescription__UsedDescriptionsAssignment_25328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefinement_in_rule__UIDescription__RefinementsAssignment_35359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_rule__UIDescription__DefinitionsAssignment_45390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructure_in_rule__UIDescription__StructureAssignment_55421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Structure__NameAssignment_05457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Structure__OrderedElementsAssignment_25496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Element__IdAssignment5527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentRefinement_in_rule__Refinement__ConcreteRefinementAssignment_05558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ButtonRefinement__NameAssignment_05594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ButtonRefinement__IdAssignment_25633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperties_in_rule__ButtonRefinement__PropertiesAssignment_35664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__LabelRefinement__NameAssignment_05700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__LabelRefinement__IdAssignment_25739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperties_in_rule__LabelRefinement__PropertiesAssignment_35770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Property__PropertiesFileAssignment_15801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescriptionType_in_rule__UsedDescriptions__DescriptionAssignment_15832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__UsedDescriptions__IdAssignment_2_15863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDefinition_in_rule__Definition__ConcreteDefitionAssignment_05894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__TypeDefinition__TypeAssignment_15925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__IdAlternatives_0_in_rule__Type__IdAssignment5956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__UIDescriptionImport__DescriptionNameAssignment5989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TabView__NameAssignment_06025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabDefinition_in_rule__TabView__TabsAssignment_16064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TABNAME_in_rule__TabDefinition__NameAssignment6095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Multiselection__NameAssignment_06131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INPUT_DESCRIPTION_in_rule__Multiselection__InputTypeAssignment_16170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ButtonDefinition__NameAssignment_06206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ButtonDefinition__IdAssignment_26245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperties_in_rule__ButtonDefinition__PropertiesAssignment_36276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertiesDefinition_in_rule__Properties__PropertiesDefinitionsAssignment_16307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PropertiesDefinition__PropertyKeyAssignment_0_16338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PropertiesDefinition__TextAssignment_1_16369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractiontype_in_rule__PropertiesDefinition__InteractiontypeAssignment_2_16400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__LabelDefinition__NameAssignment_06436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__LabelDefinition__IdAssignment_26475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperties_in_rule__LabelDefinition__PropertiesAssignment_36506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interactiontype__IdAlternatives_0_in_rule__Interactiontype__IdAssignment6537 = new BitSet(new long[]{0x0000000000000002L});

}