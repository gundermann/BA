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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_WS", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'WINDOW'", "'INNERCOMPLEX'", "'Click'", "'ChangeText'", "'REFINE'", "'END REFINE'", "' with name: '", "'get properties from:'", "'use: '", "' as: '", "'Area count: '", "'DEF '", "'END DEF'", "'type: '", "'<'", "'>'", "'Area:'", "'<-'", "'->'", "' as '", "':'", "'text='", "'propertyKey='", "'interactiontype='", "'Button'", "'Label'", "'Multiselection'", "'Checkbox'", "'Radiobox'", "'Table'", "'Tree'", "'Textfield'"
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


    // $ANTLR start "entryRuleRefinement"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:88:1: entryRuleRefinement : ruleRefinement EOF ;
    public final void entryRuleRefinement() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:89:1: ( ruleRefinement EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:90:1: ruleRefinement EOF
            {
             before(grammarAccess.getRefinementRule()); 
            pushFollow(FOLLOW_ruleRefinement_in_entryRuleRefinement121);
            ruleRefinement();

            state._fsp--;

             after(grammarAccess.getRefinementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefinement128); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:97:1: ruleRefinement : ( ( rule__Refinement__Group__0 ) ) ;
    public final void ruleRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:101:2: ( ( ( rule__Refinement__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:102:1: ( ( rule__Refinement__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:102:1: ( ( rule__Refinement__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:103:1: ( rule__Refinement__Group__0 )
            {
             before(grammarAccess.getRefinementAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:104:1: ( rule__Refinement__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:104:2: rule__Refinement__Group__0
            {
            pushFollow(FOLLOW_rule__Refinement__Group__0_in_ruleRefinement154);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:116:1: entryRuleComponentRefinement : ruleComponentRefinement EOF ;
    public final void entryRuleComponentRefinement() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:117:1: ( ruleComponentRefinement EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:118:1: ruleComponentRefinement EOF
            {
             before(grammarAccess.getComponentRefinementRule()); 
            pushFollow(FOLLOW_ruleComponentRefinement_in_entryRuleComponentRefinement181);
            ruleComponentRefinement();

            state._fsp--;

             after(grammarAccess.getComponentRefinementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentRefinement188); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:125:1: ruleComponentRefinement : ( ( rule__ComponentRefinement__Alternatives ) ) ;
    public final void ruleComponentRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:129:2: ( ( ( rule__ComponentRefinement__Alternatives ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:130:1: ( ( rule__ComponentRefinement__Alternatives ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:130:1: ( ( rule__ComponentRefinement__Alternatives ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:131:1: ( rule__ComponentRefinement__Alternatives )
            {
             before(grammarAccess.getComponentRefinementAccess().getAlternatives()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:132:1: ( rule__ComponentRefinement__Alternatives )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:132:2: rule__ComponentRefinement__Alternatives
            {
            pushFollow(FOLLOW_rule__ComponentRefinement__Alternatives_in_ruleComponentRefinement214);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:144:1: entryRuleButtonRefinement : ruleButtonRefinement EOF ;
    public final void entryRuleButtonRefinement() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:145:1: ( ruleButtonRefinement EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:146:1: ruleButtonRefinement EOF
            {
             before(grammarAccess.getButtonRefinementRule()); 
            pushFollow(FOLLOW_ruleButtonRefinement_in_entryRuleButtonRefinement241);
            ruleButtonRefinement();

            state._fsp--;

             after(grammarAccess.getButtonRefinementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonRefinement248); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:153:1: ruleButtonRefinement : ( ( rule__ButtonRefinement__Group__0 ) ) ;
    public final void ruleButtonRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:157:2: ( ( ( rule__ButtonRefinement__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:158:1: ( ( rule__ButtonRefinement__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:158:1: ( ( rule__ButtonRefinement__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:159:1: ( rule__ButtonRefinement__Group__0 )
            {
             before(grammarAccess.getButtonRefinementAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:160:1: ( rule__ButtonRefinement__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:160:2: rule__ButtonRefinement__Group__0
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__Group__0_in_ruleButtonRefinement274);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:172:1: entryRuleLabelRefinement : ruleLabelRefinement EOF ;
    public final void entryRuleLabelRefinement() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:173:1: ( ruleLabelRefinement EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:174:1: ruleLabelRefinement EOF
            {
             before(grammarAccess.getLabelRefinementRule()); 
            pushFollow(FOLLOW_ruleLabelRefinement_in_entryRuleLabelRefinement301);
            ruleLabelRefinement();

            state._fsp--;

             after(grammarAccess.getLabelRefinementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelRefinement308); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:181:1: ruleLabelRefinement : ( ( rule__LabelRefinement__Group__0 ) ) ;
    public final void ruleLabelRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:185:2: ( ( ( rule__LabelRefinement__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:186:1: ( ( rule__LabelRefinement__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:186:1: ( ( rule__LabelRefinement__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:187:1: ( rule__LabelRefinement__Group__0 )
            {
             before(grammarAccess.getLabelRefinementAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:188:1: ( rule__LabelRefinement__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:188:2: rule__LabelRefinement__Group__0
            {
            pushFollow(FOLLOW_rule__LabelRefinement__Group__0_in_ruleLabelRefinement334);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:200:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:201:1: ( ruleProperty EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:202:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty361);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty368); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:209:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:213:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:214:1: ( ( rule__Property__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:214:1: ( ( rule__Property__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:215:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:216:1: ( rule__Property__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:216:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty394);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:228:1: entryRuleUsedDescriptions : ruleUsedDescriptions EOF ;
    public final void entryRuleUsedDescriptions() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:229:1: ( ruleUsedDescriptions EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:230:1: ruleUsedDescriptions EOF
            {
             before(grammarAccess.getUsedDescriptionsRule()); 
            pushFollow(FOLLOW_ruleUsedDescriptions_in_entryRuleUsedDescriptions421);
            ruleUsedDescriptions();

            state._fsp--;

             after(grammarAccess.getUsedDescriptionsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsedDescriptions428); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:237:1: ruleUsedDescriptions : ( ( rule__UsedDescriptions__Group__0 ) ) ;
    public final void ruleUsedDescriptions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:241:2: ( ( ( rule__UsedDescriptions__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:242:1: ( ( rule__UsedDescriptions__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:242:1: ( ( rule__UsedDescriptions__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:243:1: ( rule__UsedDescriptions__Group__0 )
            {
             before(grammarAccess.getUsedDescriptionsAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:244:1: ( rule__UsedDescriptions__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:244:2: rule__UsedDescriptions__Group__0
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__Group__0_in_ruleUsedDescriptions454);
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


    // $ANTLR start "entryRuleAreaCount"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:256:1: entryRuleAreaCount : ruleAreaCount EOF ;
    public final void entryRuleAreaCount() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:257:1: ( ruleAreaCount EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:258:1: ruleAreaCount EOF
            {
             before(grammarAccess.getAreaCountRule()); 
            pushFollow(FOLLOW_ruleAreaCount_in_entryRuleAreaCount481);
            ruleAreaCount();

            state._fsp--;

             after(grammarAccess.getAreaCountRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAreaCount488); 

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
    // $ANTLR end "entryRuleAreaCount"


    // $ANTLR start "ruleAreaCount"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:265:1: ruleAreaCount : ( ( rule__AreaCount__Group__0 ) ) ;
    public final void ruleAreaCount() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:269:2: ( ( ( rule__AreaCount__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:270:1: ( ( rule__AreaCount__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:270:1: ( ( rule__AreaCount__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:271:1: ( rule__AreaCount__Group__0 )
            {
             before(grammarAccess.getAreaCountAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:272:1: ( rule__AreaCount__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:272:2: rule__AreaCount__Group__0
            {
            pushFollow(FOLLOW_rule__AreaCount__Group__0_in_ruleAreaCount514);
            rule__AreaCount__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAreaCountAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAreaCount"


    // $ANTLR start "entryRuleDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:284:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:285:1: ( ruleDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:286:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition541);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition548); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:293:1: ruleDefinition : ( ( rule__Definition__Group__0 ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:297:2: ( ( ( rule__Definition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:298:1: ( ( rule__Definition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:298:1: ( ( rule__Definition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:299:1: ( rule__Definition__Group__0 )
            {
             before(grammarAccess.getDefinitionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:300:1: ( rule__Definition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:300:2: rule__Definition__Group__0
            {
            pushFollow(FOLLOW_rule__Definition__Group__0_in_ruleDefinition574);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:312:1: entryRuleTypeDefinition : ruleTypeDefinition EOF ;
    public final void entryRuleTypeDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:313:1: ( ruleTypeDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:314:1: ruleTypeDefinition EOF
            {
             before(grammarAccess.getTypeDefinitionRule()); 
            pushFollow(FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition601);
            ruleTypeDefinition();

            state._fsp--;

             after(grammarAccess.getTypeDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinition608); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:321:1: ruleTypeDefinition : ( ( rule__TypeDefinition__Group__0 ) ) ;
    public final void ruleTypeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:325:2: ( ( ( rule__TypeDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:326:1: ( ( rule__TypeDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:326:1: ( ( rule__TypeDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:327:1: ( rule__TypeDefinition__Group__0 )
            {
             before(grammarAccess.getTypeDefinitionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:328:1: ( rule__TypeDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:328:2: rule__TypeDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Group__0_in_ruleTypeDefinition634);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:340:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:341:1: ( ruleType EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:342:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType661);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType668); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:349:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:353:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:354:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:354:1: ( ( rule__Type__Alternatives ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:355:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:356:1: ( rule__Type__Alternatives )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:356:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType694);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:368:1: entryRuleUIDescriptionImport : ruleUIDescriptionImport EOF ;
    public final void entryRuleUIDescriptionImport() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:369:1: ( ruleUIDescriptionImport EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:370:1: ruleUIDescriptionImport EOF
            {
             before(grammarAccess.getUIDescriptionImportRule()); 
            pushFollow(FOLLOW_ruleUIDescriptionImport_in_entryRuleUIDescriptionImport721);
            ruleUIDescriptionImport();

            state._fsp--;

             after(grammarAccess.getUIDescriptionImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIDescriptionImport728); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:377:1: ruleUIDescriptionImport : ( ( rule__UIDescriptionImport__DescriptionNameAssignment ) ) ;
    public final void ruleUIDescriptionImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:381:2: ( ( ( rule__UIDescriptionImport__DescriptionNameAssignment ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:382:1: ( ( rule__UIDescriptionImport__DescriptionNameAssignment ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:382:1: ( ( rule__UIDescriptionImport__DescriptionNameAssignment ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:383:1: ( rule__UIDescriptionImport__DescriptionNameAssignment )
            {
             before(grammarAccess.getUIDescriptionImportAccess().getDescriptionNameAssignment()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:384:1: ( rule__UIDescriptionImport__DescriptionNameAssignment )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:384:2: rule__UIDescriptionImport__DescriptionNameAssignment
            {
            pushFollow(FOLLOW_rule__UIDescriptionImport__DescriptionNameAssignment_in_ruleUIDescriptionImport754);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:396:1: entryRuleComplexComponent : ruleComplexComponent EOF ;
    public final void entryRuleComplexComponent() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:397:1: ( ruleComplexComponent EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:398:1: ruleComplexComponent EOF
            {
             before(grammarAccess.getComplexComponentRule()); 
            pushFollow(FOLLOW_ruleComplexComponent_in_entryRuleComplexComponent781);
            ruleComplexComponent();

            state._fsp--;

             after(grammarAccess.getComplexComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexComponent788); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:405:1: ruleComplexComponent : ( ruleMultiselection ) ;
    public final void ruleComplexComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:409:2: ( ( ruleMultiselection ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:410:1: ( ruleMultiselection )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:410:1: ( ruleMultiselection )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:411:1: ruleMultiselection
            {
             before(grammarAccess.getComplexComponentAccess().getMultiselectionParserRuleCall()); 
            pushFollow(FOLLOW_ruleMultiselection_in_ruleComplexComponent814);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:424:1: entryRuleMultiselection : ruleMultiselection EOF ;
    public final void entryRuleMultiselection() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:425:1: ( ruleMultiselection EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:426:1: ruleMultiselection EOF
            {
             before(grammarAccess.getMultiselectionRule()); 
            pushFollow(FOLLOW_ruleMultiselection_in_entryRuleMultiselection840);
            ruleMultiselection();

            state._fsp--;

             after(grammarAccess.getMultiselectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiselection847); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:433:1: ruleMultiselection : ( ( rule__Multiselection__Group__0 ) ) ;
    public final void ruleMultiselection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:437:2: ( ( ( rule__Multiselection__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:438:1: ( ( rule__Multiselection__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:438:1: ( ( rule__Multiselection__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:439:1: ( rule__Multiselection__Group__0 )
            {
             before(grammarAccess.getMultiselectionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:440:1: ( rule__Multiselection__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:440:2: rule__Multiselection__Group__0
            {
            pushFollow(FOLLOW_rule__Multiselection__Group__0_in_ruleMultiselection873);
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


    // $ANTLR start "entryRuleAreaAssignment"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:452:1: entryRuleAreaAssignment : ruleAreaAssignment EOF ;
    public final void entryRuleAreaAssignment() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:453:1: ( ruleAreaAssignment EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:454:1: ruleAreaAssignment EOF
            {
             before(grammarAccess.getAreaAssignmentRule()); 
            pushFollow(FOLLOW_ruleAreaAssignment_in_entryRuleAreaAssignment900);
            ruleAreaAssignment();

            state._fsp--;

             after(grammarAccess.getAreaAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAreaAssignment907); 

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
    // $ANTLR end "entryRuleAreaAssignment"


    // $ANTLR start "ruleAreaAssignment"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:461:1: ruleAreaAssignment : ( ( rule__AreaAssignment__Alternatives ) ) ;
    public final void ruleAreaAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:465:2: ( ( ( rule__AreaAssignment__Alternatives ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:466:1: ( ( rule__AreaAssignment__Alternatives ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:466:1: ( ( rule__AreaAssignment__Alternatives ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:467:1: ( rule__AreaAssignment__Alternatives )
            {
             before(grammarAccess.getAreaAssignmentAccess().getAlternatives()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:468:1: ( rule__AreaAssignment__Alternatives )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:468:2: rule__AreaAssignment__Alternatives
            {
            pushFollow(FOLLOW_rule__AreaAssignment__Alternatives_in_ruleAreaAssignment933);
            rule__AreaAssignment__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAreaAssignmentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAreaAssignment"


    // $ANTLR start "entryRuleComponentDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:480:1: entryRuleComponentDefinition : ruleComponentDefinition EOF ;
    public final void entryRuleComponentDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:481:1: ( ruleComponentDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:482:1: ruleComponentDefinition EOF
            {
             before(grammarAccess.getComponentDefinitionRule()); 
            pushFollow(FOLLOW_ruleComponentDefinition_in_entryRuleComponentDefinition960);
            ruleComponentDefinition();

            state._fsp--;

             after(grammarAccess.getComponentDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentDefinition967); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:489:1: ruleComponentDefinition : ( ( rule__ComponentDefinition__Alternatives ) ) ;
    public final void ruleComponentDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:493:2: ( ( ( rule__ComponentDefinition__Alternatives ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:494:1: ( ( rule__ComponentDefinition__Alternatives ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:494:1: ( ( rule__ComponentDefinition__Alternatives ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:495:1: ( rule__ComponentDefinition__Alternatives )
            {
             before(grammarAccess.getComponentDefinitionAccess().getAlternatives()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:496:1: ( rule__ComponentDefinition__Alternatives )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:496:2: rule__ComponentDefinition__Alternatives
            {
            pushFollow(FOLLOW_rule__ComponentDefinition__Alternatives_in_ruleComponentDefinition993);
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


    // $ANTLR start "entryRuleCheckboxDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:508:1: entryRuleCheckboxDefinition : ruleCheckboxDefinition EOF ;
    public final void entryRuleCheckboxDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:509:1: ( ruleCheckboxDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:510:1: ruleCheckboxDefinition EOF
            {
             before(grammarAccess.getCheckboxDefinitionRule()); 
            pushFollow(FOLLOW_ruleCheckboxDefinition_in_entryRuleCheckboxDefinition1020);
            ruleCheckboxDefinition();

            state._fsp--;

             after(grammarAccess.getCheckboxDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckboxDefinition1027); 

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
    // $ANTLR end "entryRuleCheckboxDefinition"


    // $ANTLR start "ruleCheckboxDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:517:1: ruleCheckboxDefinition : ( ( rule__CheckboxDefinition__Group__0 ) ) ;
    public final void ruleCheckboxDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:521:2: ( ( ( rule__CheckboxDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:522:1: ( ( rule__CheckboxDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:522:1: ( ( rule__CheckboxDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:523:1: ( rule__CheckboxDefinition__Group__0 )
            {
             before(grammarAccess.getCheckboxDefinitionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:524:1: ( rule__CheckboxDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:524:2: rule__CheckboxDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__CheckboxDefinition__Group__0_in_ruleCheckboxDefinition1053);
            rule__CheckboxDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheckboxDefinition"


    // $ANTLR start "entryRuleRadioboxDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:536:1: entryRuleRadioboxDefinition : ruleRadioboxDefinition EOF ;
    public final void entryRuleRadioboxDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:537:1: ( ruleRadioboxDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:538:1: ruleRadioboxDefinition EOF
            {
             before(grammarAccess.getRadioboxDefinitionRule()); 
            pushFollow(FOLLOW_ruleRadioboxDefinition_in_entryRuleRadioboxDefinition1080);
            ruleRadioboxDefinition();

            state._fsp--;

             after(grammarAccess.getRadioboxDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRadioboxDefinition1087); 

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
    // $ANTLR end "entryRuleRadioboxDefinition"


    // $ANTLR start "ruleRadioboxDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:545:1: ruleRadioboxDefinition : ( ( rule__RadioboxDefinition__Group__0 ) ) ;
    public final void ruleRadioboxDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:549:2: ( ( ( rule__RadioboxDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:550:1: ( ( rule__RadioboxDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:550:1: ( ( rule__RadioboxDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:551:1: ( rule__RadioboxDefinition__Group__0 )
            {
             before(grammarAccess.getRadioboxDefinitionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:552:1: ( rule__RadioboxDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:552:2: rule__RadioboxDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__RadioboxDefinition__Group__0_in_ruleRadioboxDefinition1113);
            rule__RadioboxDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRadioboxDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRadioboxDefinition"


    // $ANTLR start "entryRuleTableDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:564:1: entryRuleTableDefinition : ruleTableDefinition EOF ;
    public final void entryRuleTableDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:565:1: ( ruleTableDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:566:1: ruleTableDefinition EOF
            {
             before(grammarAccess.getTableDefinitionRule()); 
            pushFollow(FOLLOW_ruleTableDefinition_in_entryRuleTableDefinition1140);
            ruleTableDefinition();

            state._fsp--;

             after(grammarAccess.getTableDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableDefinition1147); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:573:1: ruleTableDefinition : ( ( rule__TableDefinition__Group__0 ) ) ;
    public final void ruleTableDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:577:2: ( ( ( rule__TableDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:578:1: ( ( rule__TableDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:578:1: ( ( rule__TableDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:579:1: ( rule__TableDefinition__Group__0 )
            {
             before(grammarAccess.getTableDefinitionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:580:1: ( rule__TableDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:580:2: rule__TableDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group__0_in_ruleTableDefinition1173);
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


    // $ANTLR start "entryRuleTreeDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:592:1: entryRuleTreeDefinition : ruleTreeDefinition EOF ;
    public final void entryRuleTreeDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:593:1: ( ruleTreeDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:594:1: ruleTreeDefinition EOF
            {
             before(grammarAccess.getTreeDefinitionRule()); 
            pushFollow(FOLLOW_ruleTreeDefinition_in_entryRuleTreeDefinition1200);
            ruleTreeDefinition();

            state._fsp--;

             after(grammarAccess.getTreeDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTreeDefinition1207); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:601:1: ruleTreeDefinition : ( ( rule__TreeDefinition__Group__0 ) ) ;
    public final void ruleTreeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:605:2: ( ( ( rule__TreeDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:606:1: ( ( rule__TreeDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:606:1: ( ( rule__TreeDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:607:1: ( rule__TreeDefinition__Group__0 )
            {
             before(grammarAccess.getTreeDefinitionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:608:1: ( rule__TreeDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:608:2: rule__TreeDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group__0_in_ruleTreeDefinition1233);
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


    // $ANTLR start "entryRuleButtonDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:648:1: entryRuleButtonDefinition : ruleButtonDefinition EOF ;
    public final void entryRuleButtonDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:649:1: ( ruleButtonDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:650:1: ruleButtonDefinition EOF
            {
             before(grammarAccess.getButtonDefinitionRule()); 
            pushFollow(FOLLOW_ruleButtonDefinition_in_entryRuleButtonDefinition1320);
            ruleButtonDefinition();

            state._fsp--;

             after(grammarAccess.getButtonDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonDefinition1327); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:657:1: ruleButtonDefinition : ( ( rule__ButtonDefinition__Group__0 ) ) ;
    public final void ruleButtonDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:661:2: ( ( ( rule__ButtonDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:662:1: ( ( rule__ButtonDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:662:1: ( ( rule__ButtonDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:663:1: ( rule__ButtonDefinition__Group__0 )
            {
             before(grammarAccess.getButtonDefinitionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:664:1: ( rule__ButtonDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:664:2: rule__ButtonDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__0_in_ruleButtonDefinition1353);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:676:1: entryRuleProperties : ruleProperties EOF ;
    public final void entryRuleProperties() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:677:1: ( ruleProperties EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:678:1: ruleProperties EOF
            {
             before(grammarAccess.getPropertiesRule()); 
            pushFollow(FOLLOW_ruleProperties_in_entryRuleProperties1380);
            ruleProperties();

            state._fsp--;

             after(grammarAccess.getPropertiesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperties1387); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:685:1: ruleProperties : ( ( rule__Properties__Group__0 ) ) ;
    public final void ruleProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:689:2: ( ( ( rule__Properties__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:690:1: ( ( rule__Properties__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:690:1: ( ( rule__Properties__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:691:1: ( rule__Properties__Group__0 )
            {
             before(grammarAccess.getPropertiesAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:692:1: ( rule__Properties__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:692:2: rule__Properties__Group__0
            {
            pushFollow(FOLLOW_rule__Properties__Group__0_in_ruleProperties1413);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:704:1: entryRuleLabelDefinition : ruleLabelDefinition EOF ;
    public final void entryRuleLabelDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:705:1: ( ruleLabelDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:706:1: ruleLabelDefinition EOF
            {
             before(grammarAccess.getLabelDefinitionRule()); 
            pushFollow(FOLLOW_ruleLabelDefinition_in_entryRuleLabelDefinition1440);
            ruleLabelDefinition();

            state._fsp--;

             after(grammarAccess.getLabelDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelDefinition1447); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:713:1: ruleLabelDefinition : ( ( rule__LabelDefinition__Group__0 ) ) ;
    public final void ruleLabelDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:717:2: ( ( ( rule__LabelDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:718:1: ( ( rule__LabelDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:718:1: ( ( rule__LabelDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:719:1: ( rule__LabelDefinition__Group__0 )
            {
             before(grammarAccess.getLabelDefinitionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:720:1: ( rule__LabelDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:720:2: rule__LabelDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__0_in_ruleLabelDefinition1473);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:732:1: entryRuleInteractiontype : ruleInteractiontype EOF ;
    public final void entryRuleInteractiontype() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:733:1: ( ruleInteractiontype EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:734:1: ruleInteractiontype EOF
            {
             before(grammarAccess.getInteractiontypeRule()); 
            pushFollow(FOLLOW_ruleInteractiontype_in_entryRuleInteractiontype1500);
            ruleInteractiontype();

            state._fsp--;

             after(grammarAccess.getInteractiontypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractiontype1507); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:741:1: ruleInteractiontype : ( ( rule__Interactiontype__Alternatives ) ) ;
    public final void ruleInteractiontype() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:745:2: ( ( ( rule__Interactiontype__Alternatives ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:746:1: ( ( rule__Interactiontype__Alternatives ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:746:1: ( ( rule__Interactiontype__Alternatives ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:747:1: ( rule__Interactiontype__Alternatives )
            {
             before(grammarAccess.getInteractiontypeAccess().getAlternatives()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:748:1: ( rule__Interactiontype__Alternatives )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:748:2: rule__Interactiontype__Alternatives
            {
            pushFollow(FOLLOW_rule__Interactiontype__Alternatives_in_ruleInteractiontype1533);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:760:1: rule__ComponentRefinement__Alternatives : ( ( ruleLabelRefinement ) | ( ruleButtonRefinement ) );
    public final void rule__ComponentRefinement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:764:1: ( ( ruleLabelRefinement ) | ( ruleButtonRefinement ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==36) ) {
                alt1=1;
            }
            else if ( (LA1_0==35) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:765:1: ( ruleLabelRefinement )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:765:1: ( ruleLabelRefinement )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:766:1: ruleLabelRefinement
                    {
                     before(grammarAccess.getComponentRefinementAccess().getLabelRefinementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLabelRefinement_in_rule__ComponentRefinement__Alternatives1569);
                    ruleLabelRefinement();

                    state._fsp--;

                     after(grammarAccess.getComponentRefinementAccess().getLabelRefinementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:771:6: ( ruleButtonRefinement )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:771:6: ( ruleButtonRefinement )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:772:1: ruleButtonRefinement
                    {
                     before(grammarAccess.getComponentRefinementAccess().getButtonRefinementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleButtonRefinement_in_rule__ComponentRefinement__Alternatives1586);
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


    // $ANTLR start "rule__UsedDescriptions__DescriptionAlternatives_1_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:782:1: rule__UsedDescriptions__DescriptionAlternatives_1_0 : ( ( ruleUIDescriptionImport ) | ( ruleComplexComponent ) );
    public final void rule__UsedDescriptions__DescriptionAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:786:1: ( ( ruleUIDescriptionImport ) | ( ruleComplexComponent ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==37) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:787:1: ( ruleUIDescriptionImport )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:787:1: ( ruleUIDescriptionImport )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:788:1: ruleUIDescriptionImport
                    {
                     before(grammarAccess.getUsedDescriptionsAccess().getDescriptionUIDescriptionImportParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_ruleUIDescriptionImport_in_rule__UsedDescriptions__DescriptionAlternatives_1_01618);
                    ruleUIDescriptionImport();

                    state._fsp--;

                     after(grammarAccess.getUsedDescriptionsAccess().getDescriptionUIDescriptionImportParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:793:6: ( ruleComplexComponent )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:793:6: ( ruleComplexComponent )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:794:1: ruleComplexComponent
                    {
                     before(grammarAccess.getUsedDescriptionsAccess().getDescriptionComplexComponentParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_ruleComplexComponent_in_rule__UsedDescriptions__DescriptionAlternatives_1_01635);
                    ruleComplexComponent();

                    state._fsp--;

                     after(grammarAccess.getUsedDescriptionsAccess().getDescriptionComplexComponentParserRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__UsedDescriptions__DescriptionAlternatives_1_0"


    // $ANTLR start "rule__Type__Alternatives"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:804:1: rule__Type__Alternatives : ( ( 'WINDOW' ) | ( 'INNERCOMPLEX' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:808:1: ( ( 'WINDOW' ) | ( 'INNERCOMPLEX' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:809:1: ( 'WINDOW' )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:809:1: ( 'WINDOW' )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:810:1: 'WINDOW'
                    {
                     before(grammarAccess.getTypeAccess().getWINDOWKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__Type__Alternatives1668); 
                     after(grammarAccess.getTypeAccess().getWINDOWKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:817:6: ( 'INNERCOMPLEX' )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:817:6: ( 'INNERCOMPLEX' )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:818:1: 'INNERCOMPLEX'
                    {
                     before(grammarAccess.getTypeAccess().getINNERCOMPLEXKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__Type__Alternatives1688); 
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


    // $ANTLR start "rule__AreaAssignment__Alternatives"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:830:1: rule__AreaAssignment__Alternatives : ( ( ( rule__AreaAssignment__Group_0__0 ) ) | ( ( rule__AreaAssignment__Group_1__0 ) ) );
    public final void rule__AreaAssignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:834:1: ( ( ( rule__AreaAssignment__Group_0__0 ) ) | ( ( rule__AreaAssignment__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==27) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:835:1: ( ( rule__AreaAssignment__Group_0__0 ) )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:835:1: ( ( rule__AreaAssignment__Group_0__0 ) )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:836:1: ( rule__AreaAssignment__Group_0__0 )
                    {
                     before(grammarAccess.getAreaAssignmentAccess().getGroup_0()); 
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:837:1: ( rule__AreaAssignment__Group_0__0 )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:837:2: rule__AreaAssignment__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__AreaAssignment__Group_0__0_in_rule__AreaAssignment__Alternatives1722);
                    rule__AreaAssignment__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAreaAssignmentAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:841:6: ( ( rule__AreaAssignment__Group_1__0 ) )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:841:6: ( ( rule__AreaAssignment__Group_1__0 ) )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:842:1: ( rule__AreaAssignment__Group_1__0 )
                    {
                     before(grammarAccess.getAreaAssignmentAccess().getGroup_1()); 
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:843:1: ( rule__AreaAssignment__Group_1__0 )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:843:2: rule__AreaAssignment__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AreaAssignment__Group_1__0_in_rule__AreaAssignment__Alternatives1740);
                    rule__AreaAssignment__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAreaAssignmentAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AreaAssignment__Alternatives"


    // $ANTLR start "rule__ComponentDefinition__Alternatives"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:852:1: rule__ComponentDefinition__Alternatives : ( ( ruleLabelDefinition ) | ( ruleButtonDefinition ) | ( ruleTextfieldDefinition ) | ( ruleTreeDefinition ) | ( ruleTableDefinition ) | ( ruleRadioboxDefinition ) | ( ruleCheckboxDefinition ) );
    public final void rule__ComponentDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:856:1: ( ( ruleLabelDefinition ) | ( ruleButtonDefinition ) | ( ruleTextfieldDefinition ) | ( ruleTreeDefinition ) | ( ruleTableDefinition ) | ( ruleRadioboxDefinition ) | ( ruleCheckboxDefinition ) )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt5=1;
                }
                break;
            case 35:
                {
                alt5=2;
                }
                break;
            case 42:
                {
                alt5=3;
                }
                break;
            case 41:
                {
                alt5=4;
                }
                break;
            case 40:
                {
                alt5=5;
                }
                break;
            case 39:
                {
                alt5=6;
                }
                break;
            case 38:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:857:1: ( ruleLabelDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:857:1: ( ruleLabelDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:858:1: ruleLabelDefinition
                    {
                     before(grammarAccess.getComponentDefinitionAccess().getLabelDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLabelDefinition_in_rule__ComponentDefinition__Alternatives1773);
                    ruleLabelDefinition();

                    state._fsp--;

                     after(grammarAccess.getComponentDefinitionAccess().getLabelDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:863:6: ( ruleButtonDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:863:6: ( ruleButtonDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:864:1: ruleButtonDefinition
                    {
                     before(grammarAccess.getComponentDefinitionAccess().getButtonDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleButtonDefinition_in_rule__ComponentDefinition__Alternatives1790);
                    ruleButtonDefinition();

                    state._fsp--;

                     after(grammarAccess.getComponentDefinitionAccess().getButtonDefinitionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:869:6: ( ruleTextfieldDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:869:6: ( ruleTextfieldDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:870:1: ruleTextfieldDefinition
                    {
                     before(grammarAccess.getComponentDefinitionAccess().getTextfieldDefinitionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleTextfieldDefinition_in_rule__ComponentDefinition__Alternatives1807);
                    ruleTextfieldDefinition();

                    state._fsp--;

                     after(grammarAccess.getComponentDefinitionAccess().getTextfieldDefinitionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:875:6: ( ruleTreeDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:875:6: ( ruleTreeDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:876:1: ruleTreeDefinition
                    {
                     before(grammarAccess.getComponentDefinitionAccess().getTreeDefinitionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleTreeDefinition_in_rule__ComponentDefinition__Alternatives1824);
                    ruleTreeDefinition();

                    state._fsp--;

                     after(grammarAccess.getComponentDefinitionAccess().getTreeDefinitionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:881:6: ( ruleTableDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:881:6: ( ruleTableDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:882:1: ruleTableDefinition
                    {
                     before(grammarAccess.getComponentDefinitionAccess().getTableDefinitionParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleTableDefinition_in_rule__ComponentDefinition__Alternatives1841);
                    ruleTableDefinition();

                    state._fsp--;

                     after(grammarAccess.getComponentDefinitionAccess().getTableDefinitionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:887:6: ( ruleRadioboxDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:887:6: ( ruleRadioboxDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:888:1: ruleRadioboxDefinition
                    {
                     before(grammarAccess.getComponentDefinitionAccess().getRadioboxDefinitionParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleRadioboxDefinition_in_rule__ComponentDefinition__Alternatives1858);
                    ruleRadioboxDefinition();

                    state._fsp--;

                     after(grammarAccess.getComponentDefinitionAccess().getRadioboxDefinitionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:893:6: ( ruleCheckboxDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:893:6: ( ruleCheckboxDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:894:1: ruleCheckboxDefinition
                    {
                     before(grammarAccess.getComponentDefinitionAccess().getCheckboxDefinitionParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleCheckboxDefinition_in_rule__ComponentDefinition__Alternatives1875);
                    ruleCheckboxDefinition();

                    state._fsp--;

                     after(grammarAccess.getComponentDefinitionAccess().getCheckboxDefinitionParserRuleCall_6()); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:904:1: rule__Interactiontype__Alternatives : ( ( 'Click' ) | ( 'ChangeText' ) );
    public final void rule__Interactiontype__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:908:1: ( ( 'Click' ) | ( 'ChangeText' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:909:1: ( 'Click' )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:909:1: ( 'Click' )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:910:1: 'Click'
                    {
                     before(grammarAccess.getInteractiontypeAccess().getClickKeyword_0()); 
                    match(input,13,FOLLOW_13_in_rule__Interactiontype__Alternatives1908); 
                     after(grammarAccess.getInteractiontypeAccess().getClickKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:917:6: ( 'ChangeText' )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:917:6: ( 'ChangeText' )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:918:1: 'ChangeText'
                    {
                     before(grammarAccess.getInteractiontypeAccess().getChangeTextKeyword_1()); 
                    match(input,14,FOLLOW_14_in_rule__Interactiontype__Alternatives1928); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:932:1: rule__UIDescription__Group__0 : rule__UIDescription__Group__0__Impl rule__UIDescription__Group__1 ;
    public final void rule__UIDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:936:1: ( rule__UIDescription__Group__0__Impl rule__UIDescription__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:937:2: rule__UIDescription__Group__0__Impl rule__UIDescription__Group__1
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__0__Impl_in_rule__UIDescription__Group__01960);
            rule__UIDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIDescription__Group__1_in_rule__UIDescription__Group__01963);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:944:1: rule__UIDescription__Group__0__Impl : ( ( rule__UIDescription__AreaCountAssignment_0 ) ) ;
    public final void rule__UIDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:948:1: ( ( ( rule__UIDescription__AreaCountAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:949:1: ( ( rule__UIDescription__AreaCountAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:949:1: ( ( rule__UIDescription__AreaCountAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:950:1: ( rule__UIDescription__AreaCountAssignment_0 )
            {
             before(grammarAccess.getUIDescriptionAccess().getAreaCountAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:951:1: ( rule__UIDescription__AreaCountAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:951:2: rule__UIDescription__AreaCountAssignment_0
            {
            pushFollow(FOLLOW_rule__UIDescription__AreaCountAssignment_0_in_rule__UIDescription__Group__0__Impl1990);
            rule__UIDescription__AreaCountAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUIDescriptionAccess().getAreaCountAssignment_0()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:961:1: rule__UIDescription__Group__1 : rule__UIDescription__Group__1__Impl rule__UIDescription__Group__2 ;
    public final void rule__UIDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:965:1: ( rule__UIDescription__Group__1__Impl rule__UIDescription__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:966:2: rule__UIDescription__Group__1__Impl rule__UIDescription__Group__2
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__1__Impl_in_rule__UIDescription__Group__12020);
            rule__UIDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIDescription__Group__2_in_rule__UIDescription__Group__12023);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:973:1: rule__UIDescription__Group__1__Impl : ( ( rule__UIDescription__TypeDefinitionAssignment_1 ) ) ;
    public final void rule__UIDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:977:1: ( ( ( rule__UIDescription__TypeDefinitionAssignment_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:978:1: ( ( rule__UIDescription__TypeDefinitionAssignment_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:978:1: ( ( rule__UIDescription__TypeDefinitionAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:979:1: ( rule__UIDescription__TypeDefinitionAssignment_1 )
            {
             before(grammarAccess.getUIDescriptionAccess().getTypeDefinitionAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:980:1: ( rule__UIDescription__TypeDefinitionAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:980:2: rule__UIDescription__TypeDefinitionAssignment_1
            {
            pushFollow(FOLLOW_rule__UIDescription__TypeDefinitionAssignment_1_in_rule__UIDescription__Group__1__Impl2050);
            rule__UIDescription__TypeDefinitionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUIDescriptionAccess().getTypeDefinitionAssignment_1()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:990:1: rule__UIDescription__Group__2 : rule__UIDescription__Group__2__Impl rule__UIDescription__Group__3 ;
    public final void rule__UIDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:994:1: ( rule__UIDescription__Group__2__Impl rule__UIDescription__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:995:2: rule__UIDescription__Group__2__Impl rule__UIDescription__Group__3
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__2__Impl_in_rule__UIDescription__Group__22080);
            rule__UIDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIDescription__Group__3_in_rule__UIDescription__Group__22083);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1002:1: rule__UIDescription__Group__2__Impl : ( ( rule__UIDescription__PropertyAssignment_2 )? ) ;
    public final void rule__UIDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1006:1: ( ( ( rule__UIDescription__PropertyAssignment_2 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1007:1: ( ( rule__UIDescription__PropertyAssignment_2 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1007:1: ( ( rule__UIDescription__PropertyAssignment_2 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1008:1: ( rule__UIDescription__PropertyAssignment_2 )?
            {
             before(grammarAccess.getUIDescriptionAccess().getPropertyAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1009:1: ( rule__UIDescription__PropertyAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1009:2: rule__UIDescription__PropertyAssignment_2
                    {
                    pushFollow(FOLLOW_rule__UIDescription__PropertyAssignment_2_in_rule__UIDescription__Group__2__Impl2110);
                    rule__UIDescription__PropertyAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUIDescriptionAccess().getPropertyAssignment_2()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1019:1: rule__UIDescription__Group__3 : rule__UIDescription__Group__3__Impl rule__UIDescription__Group__4 ;
    public final void rule__UIDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1023:1: ( rule__UIDescription__Group__3__Impl rule__UIDescription__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1024:2: rule__UIDescription__Group__3__Impl rule__UIDescription__Group__4
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__3__Impl_in_rule__UIDescription__Group__32141);
            rule__UIDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIDescription__Group__4_in_rule__UIDescription__Group__32144);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1031:1: rule__UIDescription__Group__3__Impl : ( ( rule__UIDescription__UsedDescriptionsAssignment_3 )* ) ;
    public final void rule__UIDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1035:1: ( ( ( rule__UIDescription__UsedDescriptionsAssignment_3 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1036:1: ( ( rule__UIDescription__UsedDescriptionsAssignment_3 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1036:1: ( ( rule__UIDescription__UsedDescriptionsAssignment_3 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1037:1: ( rule__UIDescription__UsedDescriptionsAssignment_3 )*
            {
             before(grammarAccess.getUIDescriptionAccess().getUsedDescriptionsAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1038:1: ( rule__UIDescription__UsedDescriptionsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1038:2: rule__UIDescription__UsedDescriptionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__UIDescription__UsedDescriptionsAssignment_3_in_rule__UIDescription__Group__3__Impl2171);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1048:1: rule__UIDescription__Group__4 : rule__UIDescription__Group__4__Impl rule__UIDescription__Group__5 ;
    public final void rule__UIDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1052:1: ( rule__UIDescription__Group__4__Impl rule__UIDescription__Group__5 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1053:2: rule__UIDescription__Group__4__Impl rule__UIDescription__Group__5
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__4__Impl_in_rule__UIDescription__Group__42202);
            rule__UIDescription__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIDescription__Group__5_in_rule__UIDescription__Group__42205);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1060:1: rule__UIDescription__Group__4__Impl : ( ( rule__UIDescription__RefinementsAssignment_4 )* ) ;
    public final void rule__UIDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1064:1: ( ( ( rule__UIDescription__RefinementsAssignment_4 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1065:1: ( ( rule__UIDescription__RefinementsAssignment_4 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1065:1: ( ( rule__UIDescription__RefinementsAssignment_4 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1066:1: ( rule__UIDescription__RefinementsAssignment_4 )*
            {
             before(grammarAccess.getUIDescriptionAccess().getRefinementsAssignment_4()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1067:1: ( rule__UIDescription__RefinementsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1067:2: rule__UIDescription__RefinementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__UIDescription__RefinementsAssignment_4_in_rule__UIDescription__Group__4__Impl2232);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1077:1: rule__UIDescription__Group__5 : rule__UIDescription__Group__5__Impl rule__UIDescription__Group__6 ;
    public final void rule__UIDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1081:1: ( rule__UIDescription__Group__5__Impl rule__UIDescription__Group__6 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1082:2: rule__UIDescription__Group__5__Impl rule__UIDescription__Group__6
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__5__Impl_in_rule__UIDescription__Group__52263);
            rule__UIDescription__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIDescription__Group__6_in_rule__UIDescription__Group__52266);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1089:1: rule__UIDescription__Group__5__Impl : ( ( rule__UIDescription__DefinitionsAssignment_5 )* ) ;
    public final void rule__UIDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1093:1: ( ( ( rule__UIDescription__DefinitionsAssignment_5 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1094:1: ( ( rule__UIDescription__DefinitionsAssignment_5 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1094:1: ( ( rule__UIDescription__DefinitionsAssignment_5 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1095:1: ( rule__UIDescription__DefinitionsAssignment_5 )*
            {
             before(grammarAccess.getUIDescriptionAccess().getDefinitionsAssignment_5()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1096:1: ( rule__UIDescription__DefinitionsAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1096:2: rule__UIDescription__DefinitionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__UIDescription__DefinitionsAssignment_5_in_rule__UIDescription__Group__5__Impl2293);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1106:1: rule__UIDescription__Group__6 : rule__UIDescription__Group__6__Impl ;
    public final void rule__UIDescription__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1110:1: ( rule__UIDescription__Group__6__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1111:2: rule__UIDescription__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__6__Impl_in_rule__UIDescription__Group__62324);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1117:1: rule__UIDescription__Group__6__Impl : ( ( rule__UIDescription__AreasAssignment_6 )* ) ;
    public final void rule__UIDescription__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1121:1: ( ( ( rule__UIDescription__AreasAssignment_6 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1122:1: ( ( rule__UIDescription__AreasAssignment_6 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1122:1: ( ( rule__UIDescription__AreasAssignment_6 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1123:1: ( rule__UIDescription__AreasAssignment_6 )*
            {
             before(grammarAccess.getUIDescriptionAccess().getAreasAssignment_6()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1124:1: ( rule__UIDescription__AreasAssignment_6 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING||LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1124:2: rule__UIDescription__AreasAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__UIDescription__AreasAssignment_6_in_rule__UIDescription__Group__6__Impl2351);
            	    rule__UIDescription__AreasAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getUIDescriptionAccess().getAreasAssignment_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Refinement__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1148:1: rule__Refinement__Group__0 : rule__Refinement__Group__0__Impl rule__Refinement__Group__1 ;
    public final void rule__Refinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1152:1: ( rule__Refinement__Group__0__Impl rule__Refinement__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1153:2: rule__Refinement__Group__0__Impl rule__Refinement__Group__1
            {
            pushFollow(FOLLOW_rule__Refinement__Group__0__Impl_in_rule__Refinement__Group__02396);
            rule__Refinement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Refinement__Group__1_in_rule__Refinement__Group__02399);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1160:1: rule__Refinement__Group__0__Impl : ( 'REFINE' ) ;
    public final void rule__Refinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1164:1: ( ( 'REFINE' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1165:1: ( 'REFINE' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1165:1: ( 'REFINE' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1166:1: 'REFINE'
            {
             before(grammarAccess.getRefinementAccess().getREFINEKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Refinement__Group__0__Impl2427); 
             after(grammarAccess.getRefinementAccess().getREFINEKeyword_0()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1179:1: rule__Refinement__Group__1 : rule__Refinement__Group__1__Impl rule__Refinement__Group__2 ;
    public final void rule__Refinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1183:1: ( rule__Refinement__Group__1__Impl rule__Refinement__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1184:2: rule__Refinement__Group__1__Impl rule__Refinement__Group__2
            {
            pushFollow(FOLLOW_rule__Refinement__Group__1__Impl_in_rule__Refinement__Group__12458);
            rule__Refinement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Refinement__Group__2_in_rule__Refinement__Group__12461);
            rule__Refinement__Group__2();

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1191:1: rule__Refinement__Group__1__Impl : ( ( rule__Refinement__ConcreteRefinementAssignment_1 ) ) ;
    public final void rule__Refinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1195:1: ( ( ( rule__Refinement__ConcreteRefinementAssignment_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1196:1: ( ( rule__Refinement__ConcreteRefinementAssignment_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1196:1: ( ( rule__Refinement__ConcreteRefinementAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1197:1: ( rule__Refinement__ConcreteRefinementAssignment_1 )
            {
             before(grammarAccess.getRefinementAccess().getConcreteRefinementAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1198:1: ( rule__Refinement__ConcreteRefinementAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1198:2: rule__Refinement__ConcreteRefinementAssignment_1
            {
            pushFollow(FOLLOW_rule__Refinement__ConcreteRefinementAssignment_1_in_rule__Refinement__Group__1__Impl2488);
            rule__Refinement__ConcreteRefinementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRefinementAccess().getConcreteRefinementAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Refinement__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1208:1: rule__Refinement__Group__2 : rule__Refinement__Group__2__Impl ;
    public final void rule__Refinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1212:1: ( rule__Refinement__Group__2__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1213:2: rule__Refinement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Refinement__Group__2__Impl_in_rule__Refinement__Group__22518);
            rule__Refinement__Group__2__Impl();

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
    // $ANTLR end "rule__Refinement__Group__2"


    // $ANTLR start "rule__Refinement__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1219:1: rule__Refinement__Group__2__Impl : ( 'END REFINE' ) ;
    public final void rule__Refinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1223:1: ( ( 'END REFINE' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1224:1: ( 'END REFINE' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1224:1: ( 'END REFINE' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1225:1: 'END REFINE'
            {
             before(grammarAccess.getRefinementAccess().getENDREFINEKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Refinement__Group__2__Impl2546); 
             after(grammarAccess.getRefinementAccess().getENDREFINEKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refinement__Group__2__Impl"


    // $ANTLR start "rule__ButtonRefinement__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1244:1: rule__ButtonRefinement__Group__0 : rule__ButtonRefinement__Group__0__Impl rule__ButtonRefinement__Group__1 ;
    public final void rule__ButtonRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1248:1: ( rule__ButtonRefinement__Group__0__Impl rule__ButtonRefinement__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1249:2: rule__ButtonRefinement__Group__0__Impl rule__ButtonRefinement__Group__1
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__Group__0__Impl_in_rule__ButtonRefinement__Group__02583);
            rule__ButtonRefinement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonRefinement__Group__1_in_rule__ButtonRefinement__Group__02586);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1256:1: rule__ButtonRefinement__Group__0__Impl : ( ( rule__ButtonRefinement__TypeAssignment_0 ) ) ;
    public final void rule__ButtonRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1260:1: ( ( ( rule__ButtonRefinement__TypeAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1261:1: ( ( rule__ButtonRefinement__TypeAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1261:1: ( ( rule__ButtonRefinement__TypeAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1262:1: ( rule__ButtonRefinement__TypeAssignment_0 )
            {
             before(grammarAccess.getButtonRefinementAccess().getTypeAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1263:1: ( rule__ButtonRefinement__TypeAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1263:2: rule__ButtonRefinement__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__TypeAssignment_0_in_rule__ButtonRefinement__Group__0__Impl2613);
            rule__ButtonRefinement__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getButtonRefinementAccess().getTypeAssignment_0()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1273:1: rule__ButtonRefinement__Group__1 : rule__ButtonRefinement__Group__1__Impl rule__ButtonRefinement__Group__2 ;
    public final void rule__ButtonRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1277:1: ( rule__ButtonRefinement__Group__1__Impl rule__ButtonRefinement__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1278:2: rule__ButtonRefinement__Group__1__Impl rule__ButtonRefinement__Group__2
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__Group__1__Impl_in_rule__ButtonRefinement__Group__12643);
            rule__ButtonRefinement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonRefinement__Group__2_in_rule__ButtonRefinement__Group__12646);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1285:1: rule__ButtonRefinement__Group__1__Impl : ( ' with name: ' ) ;
    public final void rule__ButtonRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1289:1: ( ( ' with name: ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1290:1: ( ' with name: ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1290:1: ( ' with name: ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1291:1: ' with name: '
            {
             before(grammarAccess.getButtonRefinementAccess().getWithNameKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__ButtonRefinement__Group__1__Impl2674); 
             after(grammarAccess.getButtonRefinementAccess().getWithNameKeyword_1()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1304:1: rule__ButtonRefinement__Group__2 : rule__ButtonRefinement__Group__2__Impl rule__ButtonRefinement__Group__3 ;
    public final void rule__ButtonRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1308:1: ( rule__ButtonRefinement__Group__2__Impl rule__ButtonRefinement__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1309:2: rule__ButtonRefinement__Group__2__Impl rule__ButtonRefinement__Group__3
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__Group__2__Impl_in_rule__ButtonRefinement__Group__22705);
            rule__ButtonRefinement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonRefinement__Group__3_in_rule__ButtonRefinement__Group__22708);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1316:1: rule__ButtonRefinement__Group__2__Impl : ( ( rule__ButtonRefinement__NameAssignment_2 ) ) ;
    public final void rule__ButtonRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1320:1: ( ( ( rule__ButtonRefinement__NameAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1321:1: ( ( rule__ButtonRefinement__NameAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1321:1: ( ( rule__ButtonRefinement__NameAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1322:1: ( rule__ButtonRefinement__NameAssignment_2 )
            {
             before(grammarAccess.getButtonRefinementAccess().getNameAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1323:1: ( rule__ButtonRefinement__NameAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1323:2: rule__ButtonRefinement__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__NameAssignment_2_in_rule__ButtonRefinement__Group__2__Impl2735);
            rule__ButtonRefinement__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getButtonRefinementAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1333:1: rule__ButtonRefinement__Group__3 : rule__ButtonRefinement__Group__3__Impl ;
    public final void rule__ButtonRefinement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1337:1: ( rule__ButtonRefinement__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1338:2: rule__ButtonRefinement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__Group__3__Impl_in_rule__ButtonRefinement__Group__32765);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1344:1: rule__ButtonRefinement__Group__3__Impl : ( ( rule__ButtonRefinement__PropertiesAssignment_3 )? ) ;
    public final void rule__ButtonRefinement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1348:1: ( ( ( rule__ButtonRefinement__PropertiesAssignment_3 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1349:1: ( ( rule__ButtonRefinement__PropertiesAssignment_3 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1349:1: ( ( rule__ButtonRefinement__PropertiesAssignment_3 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1350:1: ( rule__ButtonRefinement__PropertiesAssignment_3 )?
            {
             before(grammarAccess.getButtonRefinementAccess().getPropertiesAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1351:1: ( rule__ButtonRefinement__PropertiesAssignment_3 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1351:2: rule__ButtonRefinement__PropertiesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__ButtonRefinement__PropertiesAssignment_3_in_rule__ButtonRefinement__Group__3__Impl2792);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1369:1: rule__LabelRefinement__Group__0 : rule__LabelRefinement__Group__0__Impl rule__LabelRefinement__Group__1 ;
    public final void rule__LabelRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1373:1: ( rule__LabelRefinement__Group__0__Impl rule__LabelRefinement__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1374:2: rule__LabelRefinement__Group__0__Impl rule__LabelRefinement__Group__1
            {
            pushFollow(FOLLOW_rule__LabelRefinement__Group__0__Impl_in_rule__LabelRefinement__Group__02831);
            rule__LabelRefinement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelRefinement__Group__1_in_rule__LabelRefinement__Group__02834);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1381:1: rule__LabelRefinement__Group__0__Impl : ( ( rule__LabelRefinement__TypeAssignment_0 ) ) ;
    public final void rule__LabelRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1385:1: ( ( ( rule__LabelRefinement__TypeAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1386:1: ( ( rule__LabelRefinement__TypeAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1386:1: ( ( rule__LabelRefinement__TypeAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1387:1: ( rule__LabelRefinement__TypeAssignment_0 )
            {
             before(grammarAccess.getLabelRefinementAccess().getTypeAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1388:1: ( rule__LabelRefinement__TypeAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1388:2: rule__LabelRefinement__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__LabelRefinement__TypeAssignment_0_in_rule__LabelRefinement__Group__0__Impl2861);
            rule__LabelRefinement__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLabelRefinementAccess().getTypeAssignment_0()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1398:1: rule__LabelRefinement__Group__1 : rule__LabelRefinement__Group__1__Impl rule__LabelRefinement__Group__2 ;
    public final void rule__LabelRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1402:1: ( rule__LabelRefinement__Group__1__Impl rule__LabelRefinement__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1403:2: rule__LabelRefinement__Group__1__Impl rule__LabelRefinement__Group__2
            {
            pushFollow(FOLLOW_rule__LabelRefinement__Group__1__Impl_in_rule__LabelRefinement__Group__12891);
            rule__LabelRefinement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelRefinement__Group__2_in_rule__LabelRefinement__Group__12894);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1410:1: rule__LabelRefinement__Group__1__Impl : ( ' with name: ' ) ;
    public final void rule__LabelRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1414:1: ( ( ' with name: ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1415:1: ( ' with name: ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1415:1: ( ' with name: ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1416:1: ' with name: '
            {
             before(grammarAccess.getLabelRefinementAccess().getWithNameKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__LabelRefinement__Group__1__Impl2922); 
             after(grammarAccess.getLabelRefinementAccess().getWithNameKeyword_1()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1429:1: rule__LabelRefinement__Group__2 : rule__LabelRefinement__Group__2__Impl rule__LabelRefinement__Group__3 ;
    public final void rule__LabelRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1433:1: ( rule__LabelRefinement__Group__2__Impl rule__LabelRefinement__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1434:2: rule__LabelRefinement__Group__2__Impl rule__LabelRefinement__Group__3
            {
            pushFollow(FOLLOW_rule__LabelRefinement__Group__2__Impl_in_rule__LabelRefinement__Group__22953);
            rule__LabelRefinement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelRefinement__Group__3_in_rule__LabelRefinement__Group__22956);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1441:1: rule__LabelRefinement__Group__2__Impl : ( ( rule__LabelRefinement__NameAssignment_2 ) ) ;
    public final void rule__LabelRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1445:1: ( ( ( rule__LabelRefinement__NameAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1446:1: ( ( rule__LabelRefinement__NameAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1446:1: ( ( rule__LabelRefinement__NameAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1447:1: ( rule__LabelRefinement__NameAssignment_2 )
            {
             before(grammarAccess.getLabelRefinementAccess().getNameAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1448:1: ( rule__LabelRefinement__NameAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1448:2: rule__LabelRefinement__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__LabelRefinement__NameAssignment_2_in_rule__LabelRefinement__Group__2__Impl2983);
            rule__LabelRefinement__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLabelRefinementAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1458:1: rule__LabelRefinement__Group__3 : rule__LabelRefinement__Group__3__Impl ;
    public final void rule__LabelRefinement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1462:1: ( rule__LabelRefinement__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1463:2: rule__LabelRefinement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__LabelRefinement__Group__3__Impl_in_rule__LabelRefinement__Group__33013);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1469:1: rule__LabelRefinement__Group__3__Impl : ( ( rule__LabelRefinement__PropertiesAssignment_3 )? ) ;
    public final void rule__LabelRefinement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1473:1: ( ( ( rule__LabelRefinement__PropertiesAssignment_3 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1474:1: ( ( rule__LabelRefinement__PropertiesAssignment_3 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1474:1: ( ( rule__LabelRefinement__PropertiesAssignment_3 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1475:1: ( rule__LabelRefinement__PropertiesAssignment_3 )?
            {
             before(grammarAccess.getLabelRefinementAccess().getPropertiesAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1476:1: ( rule__LabelRefinement__PropertiesAssignment_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1476:2: rule__LabelRefinement__PropertiesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__LabelRefinement__PropertiesAssignment_3_in_rule__LabelRefinement__Group__3__Impl3040);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1494:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1498:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1499:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__03079);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__03082);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1506:1: rule__Property__Group__0__Impl : ( 'get properties from:' ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1510:1: ( ( 'get properties from:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1511:1: ( 'get properties from:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1511:1: ( 'get properties from:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1512:1: 'get properties from:'
            {
             before(grammarAccess.getPropertyAccess().getGetPropertiesFromKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Property__Group__0__Impl3110); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1525:1: rule__Property__Group__1 : rule__Property__Group__1__Impl ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1529:1: ( rule__Property__Group__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1530:2: rule__Property__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__13141);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1536:1: rule__Property__Group__1__Impl : ( ( rule__Property__PropertiesFileAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1540:1: ( ( ( rule__Property__PropertiesFileAssignment_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1541:1: ( ( rule__Property__PropertiesFileAssignment_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1541:1: ( ( rule__Property__PropertiesFileAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1542:1: ( rule__Property__PropertiesFileAssignment_1 )
            {
             before(grammarAccess.getPropertyAccess().getPropertiesFileAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1543:1: ( rule__Property__PropertiesFileAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1543:2: rule__Property__PropertiesFileAssignment_1
            {
            pushFollow(FOLLOW_rule__Property__PropertiesFileAssignment_1_in_rule__Property__Group__1__Impl3168);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1557:1: rule__UsedDescriptions__Group__0 : rule__UsedDescriptions__Group__0__Impl rule__UsedDescriptions__Group__1 ;
    public final void rule__UsedDescriptions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1561:1: ( rule__UsedDescriptions__Group__0__Impl rule__UsedDescriptions__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1562:2: rule__UsedDescriptions__Group__0__Impl rule__UsedDescriptions__Group__1
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__Group__0__Impl_in_rule__UsedDescriptions__Group__03202);
            rule__UsedDescriptions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsedDescriptions__Group__1_in_rule__UsedDescriptions__Group__03205);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1569:1: rule__UsedDescriptions__Group__0__Impl : ( 'use: ' ) ;
    public final void rule__UsedDescriptions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1573:1: ( ( 'use: ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1574:1: ( 'use: ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1574:1: ( 'use: ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1575:1: 'use: '
            {
             before(grammarAccess.getUsedDescriptionsAccess().getUseKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__UsedDescriptions__Group__0__Impl3233); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1588:1: rule__UsedDescriptions__Group__1 : rule__UsedDescriptions__Group__1__Impl rule__UsedDescriptions__Group__2 ;
    public final void rule__UsedDescriptions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1592:1: ( rule__UsedDescriptions__Group__1__Impl rule__UsedDescriptions__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1593:2: rule__UsedDescriptions__Group__1__Impl rule__UsedDescriptions__Group__2
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__Group__1__Impl_in_rule__UsedDescriptions__Group__13264);
            rule__UsedDescriptions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsedDescriptions__Group__2_in_rule__UsedDescriptions__Group__13267);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1600:1: rule__UsedDescriptions__Group__1__Impl : ( ( rule__UsedDescriptions__DescriptionAssignment_1 ) ) ;
    public final void rule__UsedDescriptions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1604:1: ( ( ( rule__UsedDescriptions__DescriptionAssignment_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1605:1: ( ( rule__UsedDescriptions__DescriptionAssignment_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1605:1: ( ( rule__UsedDescriptions__DescriptionAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1606:1: ( rule__UsedDescriptions__DescriptionAssignment_1 )
            {
             before(grammarAccess.getUsedDescriptionsAccess().getDescriptionAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1607:1: ( rule__UsedDescriptions__DescriptionAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1607:2: rule__UsedDescriptions__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__DescriptionAssignment_1_in_rule__UsedDescriptions__Group__1__Impl3294);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1617:1: rule__UsedDescriptions__Group__2 : rule__UsedDescriptions__Group__2__Impl ;
    public final void rule__UsedDescriptions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1621:1: ( rule__UsedDescriptions__Group__2__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1622:2: rule__UsedDescriptions__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__Group__2__Impl_in_rule__UsedDescriptions__Group__23324);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1628:1: rule__UsedDescriptions__Group__2__Impl : ( ( rule__UsedDescriptions__Group_2__0 )? ) ;
    public final void rule__UsedDescriptions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1632:1: ( ( ( rule__UsedDescriptions__Group_2__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1633:1: ( ( rule__UsedDescriptions__Group_2__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1633:1: ( ( rule__UsedDescriptions__Group_2__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1634:1: ( rule__UsedDescriptions__Group_2__0 )?
            {
             before(grammarAccess.getUsedDescriptionsAccess().getGroup_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1635:1: ( rule__UsedDescriptions__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1635:2: rule__UsedDescriptions__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__UsedDescriptions__Group_2__0_in_rule__UsedDescriptions__Group__2__Impl3351);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1651:1: rule__UsedDescriptions__Group_2__0 : rule__UsedDescriptions__Group_2__0__Impl rule__UsedDescriptions__Group_2__1 ;
    public final void rule__UsedDescriptions__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1655:1: ( rule__UsedDescriptions__Group_2__0__Impl rule__UsedDescriptions__Group_2__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1656:2: rule__UsedDescriptions__Group_2__0__Impl rule__UsedDescriptions__Group_2__1
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__Group_2__0__Impl_in_rule__UsedDescriptions__Group_2__03388);
            rule__UsedDescriptions__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsedDescriptions__Group_2__1_in_rule__UsedDescriptions__Group_2__03391);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1663:1: rule__UsedDescriptions__Group_2__0__Impl : ( ' as: ' ) ;
    public final void rule__UsedDescriptions__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1667:1: ( ( ' as: ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1668:1: ( ' as: ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1668:1: ( ' as: ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1669:1: ' as: '
            {
             before(grammarAccess.getUsedDescriptionsAccess().getAsKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__UsedDescriptions__Group_2__0__Impl3419); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1682:1: rule__UsedDescriptions__Group_2__1 : rule__UsedDescriptions__Group_2__1__Impl ;
    public final void rule__UsedDescriptions__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1686:1: ( rule__UsedDescriptions__Group_2__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1687:2: rule__UsedDescriptions__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__Group_2__1__Impl_in_rule__UsedDescriptions__Group_2__13450);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1693:1: rule__UsedDescriptions__Group_2__1__Impl : ( ( rule__UsedDescriptions__LocalNameAssignment_2_1 ) ) ;
    public final void rule__UsedDescriptions__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1697:1: ( ( ( rule__UsedDescriptions__LocalNameAssignment_2_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1698:1: ( ( rule__UsedDescriptions__LocalNameAssignment_2_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1698:1: ( ( rule__UsedDescriptions__LocalNameAssignment_2_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1699:1: ( rule__UsedDescriptions__LocalNameAssignment_2_1 )
            {
             before(grammarAccess.getUsedDescriptionsAccess().getLocalNameAssignment_2_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1700:1: ( rule__UsedDescriptions__LocalNameAssignment_2_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1700:2: rule__UsedDescriptions__LocalNameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__LocalNameAssignment_2_1_in_rule__UsedDescriptions__Group_2__1__Impl3477);
            rule__UsedDescriptions__LocalNameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUsedDescriptionsAccess().getLocalNameAssignment_2_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__AreaCount__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1714:1: rule__AreaCount__Group__0 : rule__AreaCount__Group__0__Impl rule__AreaCount__Group__1 ;
    public final void rule__AreaCount__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1718:1: ( rule__AreaCount__Group__0__Impl rule__AreaCount__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1719:2: rule__AreaCount__Group__0__Impl rule__AreaCount__Group__1
            {
            pushFollow(FOLLOW_rule__AreaCount__Group__0__Impl_in_rule__AreaCount__Group__03511);
            rule__AreaCount__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AreaCount__Group__1_in_rule__AreaCount__Group__03514);
            rule__AreaCount__Group__1();

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
    // $ANTLR end "rule__AreaCount__Group__0"


    // $ANTLR start "rule__AreaCount__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1726:1: rule__AreaCount__Group__0__Impl : ( 'Area count: ' ) ;
    public final void rule__AreaCount__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1730:1: ( ( 'Area count: ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1731:1: ( 'Area count: ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1731:1: ( 'Area count: ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1732:1: 'Area count: '
            {
             before(grammarAccess.getAreaCountAccess().getAreaCountKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__AreaCount__Group__0__Impl3542); 
             after(grammarAccess.getAreaCountAccess().getAreaCountKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaCount__Group__0__Impl"


    // $ANTLR start "rule__AreaCount__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1745:1: rule__AreaCount__Group__1 : rule__AreaCount__Group__1__Impl ;
    public final void rule__AreaCount__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1749:1: ( rule__AreaCount__Group__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1750:2: rule__AreaCount__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AreaCount__Group__1__Impl_in_rule__AreaCount__Group__13573);
            rule__AreaCount__Group__1__Impl();

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
    // $ANTLR end "rule__AreaCount__Group__1"


    // $ANTLR start "rule__AreaCount__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1756:1: rule__AreaCount__Group__1__Impl : ( ( rule__AreaCount__AreaCountAssignment_1 ) ) ;
    public final void rule__AreaCount__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1760:1: ( ( ( rule__AreaCount__AreaCountAssignment_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1761:1: ( ( rule__AreaCount__AreaCountAssignment_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1761:1: ( ( rule__AreaCount__AreaCountAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1762:1: ( rule__AreaCount__AreaCountAssignment_1 )
            {
             before(grammarAccess.getAreaCountAccess().getAreaCountAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1763:1: ( rule__AreaCount__AreaCountAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1763:2: rule__AreaCount__AreaCountAssignment_1
            {
            pushFollow(FOLLOW_rule__AreaCount__AreaCountAssignment_1_in_rule__AreaCount__Group__1__Impl3600);
            rule__AreaCount__AreaCountAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAreaCountAccess().getAreaCountAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaCount__Group__1__Impl"


    // $ANTLR start "rule__Definition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1777:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1781:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1782:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__03634);
            rule__Definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__03637);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1789:1: rule__Definition__Group__0__Impl : ( 'DEF ' ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1793:1: ( ( 'DEF ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1794:1: ( 'DEF ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1794:1: ( 'DEF ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1795:1: 'DEF '
            {
             before(grammarAccess.getDefinitionAccess().getDEFKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Definition__Group__0__Impl3665); 
             after(grammarAccess.getDefinitionAccess().getDEFKeyword_0()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1808:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl rule__Definition__Group__2 ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1812:1: ( rule__Definition__Group__1__Impl rule__Definition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1813:2: rule__Definition__Group__1__Impl rule__Definition__Group__2
            {
            pushFollow(FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__13696);
            rule__Definition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__13699);
            rule__Definition__Group__2();

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1820:1: rule__Definition__Group__1__Impl : ( ( rule__Definition__ConcreteDefitionAssignment_1 ) ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1824:1: ( ( ( rule__Definition__ConcreteDefitionAssignment_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1825:1: ( ( rule__Definition__ConcreteDefitionAssignment_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1825:1: ( ( rule__Definition__ConcreteDefitionAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1826:1: ( rule__Definition__ConcreteDefitionAssignment_1 )
            {
             before(grammarAccess.getDefinitionAccess().getConcreteDefitionAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1827:1: ( rule__Definition__ConcreteDefitionAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1827:2: rule__Definition__ConcreteDefitionAssignment_1
            {
            pushFollow(FOLLOW_rule__Definition__ConcreteDefitionAssignment_1_in_rule__Definition__Group__1__Impl3726);
            rule__Definition__ConcreteDefitionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getConcreteDefitionAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Definition__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1837:1: rule__Definition__Group__2 : rule__Definition__Group__2__Impl ;
    public final void rule__Definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1841:1: ( rule__Definition__Group__2__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1842:2: rule__Definition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__23756);
            rule__Definition__Group__2__Impl();

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
    // $ANTLR end "rule__Definition__Group__2"


    // $ANTLR start "rule__Definition__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1848:1: rule__Definition__Group__2__Impl : ( 'END DEF' ) ;
    public final void rule__Definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1852:1: ( ( 'END DEF' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1853:1: ( 'END DEF' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1853:1: ( 'END DEF' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1854:1: 'END DEF'
            {
             before(grammarAccess.getDefinitionAccess().getENDDEFKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Definition__Group__2__Impl3784); 
             after(grammarAccess.getDefinitionAccess().getENDDEFKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__2__Impl"


    // $ANTLR start "rule__TypeDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1873:1: rule__TypeDefinition__Group__0 : rule__TypeDefinition__Group__0__Impl rule__TypeDefinition__Group__1 ;
    public final void rule__TypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1877:1: ( rule__TypeDefinition__Group__0__Impl rule__TypeDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1878:2: rule__TypeDefinition__Group__0__Impl rule__TypeDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Group__0__Impl_in_rule__TypeDefinition__Group__03821);
            rule__TypeDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDefinition__Group__1_in_rule__TypeDefinition__Group__03824);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1885:1: rule__TypeDefinition__Group__0__Impl : ( 'type: ' ) ;
    public final void rule__TypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1889:1: ( ( 'type: ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1890:1: ( 'type: ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1890:1: ( 'type: ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1891:1: 'type: '
            {
             before(grammarAccess.getTypeDefinitionAccess().getTypeKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__TypeDefinition__Group__0__Impl3852); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1904:1: rule__TypeDefinition__Group__1 : rule__TypeDefinition__Group__1__Impl ;
    public final void rule__TypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1908:1: ( rule__TypeDefinition__Group__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1909:2: rule__TypeDefinition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Group__1__Impl_in_rule__TypeDefinition__Group__13883);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1915:1: rule__TypeDefinition__Group__1__Impl : ( ( rule__TypeDefinition__TypeAssignment_1 ) ) ;
    public final void rule__TypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1919:1: ( ( ( rule__TypeDefinition__TypeAssignment_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1920:1: ( ( rule__TypeDefinition__TypeAssignment_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1920:1: ( ( rule__TypeDefinition__TypeAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1921:1: ( rule__TypeDefinition__TypeAssignment_1 )
            {
             before(grammarAccess.getTypeDefinitionAccess().getTypeAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1922:1: ( rule__TypeDefinition__TypeAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1922:2: rule__TypeDefinition__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__TypeDefinition__TypeAssignment_1_in_rule__TypeDefinition__Group__1__Impl3910);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1936:1: rule__Multiselection__Group__0 : rule__Multiselection__Group__0__Impl rule__Multiselection__Group__1 ;
    public final void rule__Multiselection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1940:1: ( rule__Multiselection__Group__0__Impl rule__Multiselection__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1941:2: rule__Multiselection__Group__0__Impl rule__Multiselection__Group__1
            {
            pushFollow(FOLLOW_rule__Multiselection__Group__0__Impl_in_rule__Multiselection__Group__03944);
            rule__Multiselection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiselection__Group__1_in_rule__Multiselection__Group__03947);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1948:1: rule__Multiselection__Group__0__Impl : ( ( rule__Multiselection__DescriptionNameAssignment_0 ) ) ;
    public final void rule__Multiselection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1952:1: ( ( ( rule__Multiselection__DescriptionNameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1953:1: ( ( rule__Multiselection__DescriptionNameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1953:1: ( ( rule__Multiselection__DescriptionNameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1954:1: ( rule__Multiselection__DescriptionNameAssignment_0 )
            {
             before(grammarAccess.getMultiselectionAccess().getDescriptionNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1955:1: ( rule__Multiselection__DescriptionNameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1955:2: rule__Multiselection__DescriptionNameAssignment_0
            {
            pushFollow(FOLLOW_rule__Multiselection__DescriptionNameAssignment_0_in_rule__Multiselection__Group__0__Impl3974);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1965:1: rule__Multiselection__Group__1 : rule__Multiselection__Group__1__Impl ;
    public final void rule__Multiselection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1969:1: ( rule__Multiselection__Group__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1970:2: rule__Multiselection__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiselection__Group__1__Impl_in_rule__Multiselection__Group__14004);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1976:1: rule__Multiselection__Group__1__Impl : ( ( rule__Multiselection__Group_1__0 )? ) ;
    public final void rule__Multiselection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1980:1: ( ( ( rule__Multiselection__Group_1__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1981:1: ( ( rule__Multiselection__Group_1__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1981:1: ( ( rule__Multiselection__Group_1__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1982:1: ( rule__Multiselection__Group_1__0 )?
            {
             before(grammarAccess.getMultiselectionAccess().getGroup_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1983:1: ( rule__Multiselection__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1983:2: rule__Multiselection__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Multiselection__Group_1__0_in_rule__Multiselection__Group__1__Impl4031);
                    rule__Multiselection__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiselectionAccess().getGroup_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Multiselection__Group_1__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1997:1: rule__Multiselection__Group_1__0 : rule__Multiselection__Group_1__0__Impl rule__Multiselection__Group_1__1 ;
    public final void rule__Multiselection__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2001:1: ( rule__Multiselection__Group_1__0__Impl rule__Multiselection__Group_1__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2002:2: rule__Multiselection__Group_1__0__Impl rule__Multiselection__Group_1__1
            {
            pushFollow(FOLLOW_rule__Multiselection__Group_1__0__Impl_in_rule__Multiselection__Group_1__04066);
            rule__Multiselection__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiselection__Group_1__1_in_rule__Multiselection__Group_1__04069);
            rule__Multiselection__Group_1__1();

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
    // $ANTLR end "rule__Multiselection__Group_1__0"


    // $ANTLR start "rule__Multiselection__Group_1__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2009:1: rule__Multiselection__Group_1__0__Impl : ( '<' ) ;
    public final void rule__Multiselection__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2013:1: ( ( '<' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2014:1: ( '<' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2014:1: ( '<' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2015:1: '<'
            {
             before(grammarAccess.getMultiselectionAccess().getLessThanSignKeyword_1_0()); 
            match(input,25,FOLLOW_25_in_rule__Multiselection__Group_1__0__Impl4097); 
             after(grammarAccess.getMultiselectionAccess().getLessThanSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiselection__Group_1__0__Impl"


    // $ANTLR start "rule__Multiselection__Group_1__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2028:1: rule__Multiselection__Group_1__1 : rule__Multiselection__Group_1__1__Impl rule__Multiselection__Group_1__2 ;
    public final void rule__Multiselection__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2032:1: ( rule__Multiselection__Group_1__1__Impl rule__Multiselection__Group_1__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2033:2: rule__Multiselection__Group_1__1__Impl rule__Multiselection__Group_1__2
            {
            pushFollow(FOLLOW_rule__Multiselection__Group_1__1__Impl_in_rule__Multiselection__Group_1__14128);
            rule__Multiselection__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiselection__Group_1__2_in_rule__Multiselection__Group_1__14131);
            rule__Multiselection__Group_1__2();

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
    // $ANTLR end "rule__Multiselection__Group_1__1"


    // $ANTLR start "rule__Multiselection__Group_1__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2040:1: rule__Multiselection__Group_1__1__Impl : ( ( rule__Multiselection__InputTypeAssignment_1_1 ) ) ;
    public final void rule__Multiselection__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2044:1: ( ( ( rule__Multiselection__InputTypeAssignment_1_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2045:1: ( ( rule__Multiselection__InputTypeAssignment_1_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2045:1: ( ( rule__Multiselection__InputTypeAssignment_1_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2046:1: ( rule__Multiselection__InputTypeAssignment_1_1 )
            {
             before(grammarAccess.getMultiselectionAccess().getInputTypeAssignment_1_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2047:1: ( rule__Multiselection__InputTypeAssignment_1_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2047:2: rule__Multiselection__InputTypeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Multiselection__InputTypeAssignment_1_1_in_rule__Multiselection__Group_1__1__Impl4158);
            rule__Multiselection__InputTypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiselectionAccess().getInputTypeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiselection__Group_1__1__Impl"


    // $ANTLR start "rule__Multiselection__Group_1__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2057:1: rule__Multiselection__Group_1__2 : rule__Multiselection__Group_1__2__Impl ;
    public final void rule__Multiselection__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2061:1: ( rule__Multiselection__Group_1__2__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2062:2: rule__Multiselection__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Multiselection__Group_1__2__Impl_in_rule__Multiselection__Group_1__24188);
            rule__Multiselection__Group_1__2__Impl();

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
    // $ANTLR end "rule__Multiselection__Group_1__2"


    // $ANTLR start "rule__Multiselection__Group_1__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2068:1: rule__Multiselection__Group_1__2__Impl : ( '>' ) ;
    public final void rule__Multiselection__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2072:1: ( ( '>' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2073:1: ( '>' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2073:1: ( '>' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2074:1: '>'
            {
             before(grammarAccess.getMultiselectionAccess().getGreaterThanSignKeyword_1_2()); 
            match(input,26,FOLLOW_26_in_rule__Multiselection__Group_1__2__Impl4216); 
             after(grammarAccess.getMultiselectionAccess().getGreaterThanSignKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiselection__Group_1__2__Impl"


    // $ANTLR start "rule__AreaAssignment__Group_0__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2093:1: rule__AreaAssignment__Group_0__0 : rule__AreaAssignment__Group_0__0__Impl rule__AreaAssignment__Group_0__1 ;
    public final void rule__AreaAssignment__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2097:1: ( rule__AreaAssignment__Group_0__0__Impl rule__AreaAssignment__Group_0__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2098:2: rule__AreaAssignment__Group_0__0__Impl rule__AreaAssignment__Group_0__1
            {
            pushFollow(FOLLOW_rule__AreaAssignment__Group_0__0__Impl_in_rule__AreaAssignment__Group_0__04253);
            rule__AreaAssignment__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AreaAssignment__Group_0__1_in_rule__AreaAssignment__Group_0__04256);
            rule__AreaAssignment__Group_0__1();

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
    // $ANTLR end "rule__AreaAssignment__Group_0__0"


    // $ANTLR start "rule__AreaAssignment__Group_0__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2105:1: rule__AreaAssignment__Group_0__0__Impl : ( 'Area:' ) ;
    public final void rule__AreaAssignment__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2109:1: ( ( 'Area:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2110:1: ( 'Area:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2110:1: ( 'Area:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2111:1: 'Area:'
            {
             before(grammarAccess.getAreaAssignmentAccess().getAreaKeyword_0_0()); 
            match(input,27,FOLLOW_27_in_rule__AreaAssignment__Group_0__0__Impl4284); 
             after(grammarAccess.getAreaAssignmentAccess().getAreaKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaAssignment__Group_0__0__Impl"


    // $ANTLR start "rule__AreaAssignment__Group_0__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2124:1: rule__AreaAssignment__Group_0__1 : rule__AreaAssignment__Group_0__1__Impl rule__AreaAssignment__Group_0__2 ;
    public final void rule__AreaAssignment__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2128:1: ( rule__AreaAssignment__Group_0__1__Impl rule__AreaAssignment__Group_0__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2129:2: rule__AreaAssignment__Group_0__1__Impl rule__AreaAssignment__Group_0__2
            {
            pushFollow(FOLLOW_rule__AreaAssignment__Group_0__1__Impl_in_rule__AreaAssignment__Group_0__14315);
            rule__AreaAssignment__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AreaAssignment__Group_0__2_in_rule__AreaAssignment__Group_0__14318);
            rule__AreaAssignment__Group_0__2();

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
    // $ANTLR end "rule__AreaAssignment__Group_0__1"


    // $ANTLR start "rule__AreaAssignment__Group_0__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2136:1: rule__AreaAssignment__Group_0__1__Impl : ( ( rule__AreaAssignment__AreaAssignment_0_1 ) ) ;
    public final void rule__AreaAssignment__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2140:1: ( ( ( rule__AreaAssignment__AreaAssignment_0_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2141:1: ( ( rule__AreaAssignment__AreaAssignment_0_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2141:1: ( ( rule__AreaAssignment__AreaAssignment_0_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2142:1: ( rule__AreaAssignment__AreaAssignment_0_1 )
            {
             before(grammarAccess.getAreaAssignmentAccess().getAreaAssignment_0_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2143:1: ( rule__AreaAssignment__AreaAssignment_0_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2143:2: rule__AreaAssignment__AreaAssignment_0_1
            {
            pushFollow(FOLLOW_rule__AreaAssignment__AreaAssignment_0_1_in_rule__AreaAssignment__Group_0__1__Impl4345);
            rule__AreaAssignment__AreaAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAreaAssignmentAccess().getAreaAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaAssignment__Group_0__1__Impl"


    // $ANTLR start "rule__AreaAssignment__Group_0__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2153:1: rule__AreaAssignment__Group_0__2 : rule__AreaAssignment__Group_0__2__Impl rule__AreaAssignment__Group_0__3 ;
    public final void rule__AreaAssignment__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2157:1: ( rule__AreaAssignment__Group_0__2__Impl rule__AreaAssignment__Group_0__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2158:2: rule__AreaAssignment__Group_0__2__Impl rule__AreaAssignment__Group_0__3
            {
            pushFollow(FOLLOW_rule__AreaAssignment__Group_0__2__Impl_in_rule__AreaAssignment__Group_0__24375);
            rule__AreaAssignment__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AreaAssignment__Group_0__3_in_rule__AreaAssignment__Group_0__24378);
            rule__AreaAssignment__Group_0__3();

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
    // $ANTLR end "rule__AreaAssignment__Group_0__2"


    // $ANTLR start "rule__AreaAssignment__Group_0__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2165:1: rule__AreaAssignment__Group_0__2__Impl : ( '<-' ) ;
    public final void rule__AreaAssignment__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2169:1: ( ( '<-' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2170:1: ( '<-' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2170:1: ( '<-' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2171:1: '<-'
            {
             before(grammarAccess.getAreaAssignmentAccess().getLessThanSignHyphenMinusKeyword_0_2()); 
            match(input,28,FOLLOW_28_in_rule__AreaAssignment__Group_0__2__Impl4406); 
             after(grammarAccess.getAreaAssignmentAccess().getLessThanSignHyphenMinusKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaAssignment__Group_0__2__Impl"


    // $ANTLR start "rule__AreaAssignment__Group_0__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2184:1: rule__AreaAssignment__Group_0__3 : rule__AreaAssignment__Group_0__3__Impl ;
    public final void rule__AreaAssignment__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2188:1: ( rule__AreaAssignment__Group_0__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2189:2: rule__AreaAssignment__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__AreaAssignment__Group_0__3__Impl_in_rule__AreaAssignment__Group_0__34437);
            rule__AreaAssignment__Group_0__3__Impl();

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
    // $ANTLR end "rule__AreaAssignment__Group_0__3"


    // $ANTLR start "rule__AreaAssignment__Group_0__3__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2195:1: rule__AreaAssignment__Group_0__3__Impl : ( ( ( rule__AreaAssignment__ElementsAssignment_0_3 ) ) ( ( rule__AreaAssignment__ElementsAssignment_0_3 )* ) ) ;
    public final void rule__AreaAssignment__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2199:1: ( ( ( ( rule__AreaAssignment__ElementsAssignment_0_3 ) ) ( ( rule__AreaAssignment__ElementsAssignment_0_3 )* ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2200:1: ( ( ( rule__AreaAssignment__ElementsAssignment_0_3 ) ) ( ( rule__AreaAssignment__ElementsAssignment_0_3 )* ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2200:1: ( ( ( rule__AreaAssignment__ElementsAssignment_0_3 ) ) ( ( rule__AreaAssignment__ElementsAssignment_0_3 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2201:1: ( ( rule__AreaAssignment__ElementsAssignment_0_3 ) ) ( ( rule__AreaAssignment__ElementsAssignment_0_3 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2201:1: ( ( rule__AreaAssignment__ElementsAssignment_0_3 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2202:1: ( rule__AreaAssignment__ElementsAssignment_0_3 )
            {
             before(grammarAccess.getAreaAssignmentAccess().getElementsAssignment_0_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2203:1: ( rule__AreaAssignment__ElementsAssignment_0_3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2203:2: rule__AreaAssignment__ElementsAssignment_0_3
            {
            pushFollow(FOLLOW_rule__AreaAssignment__ElementsAssignment_0_3_in_rule__AreaAssignment__Group_0__3__Impl4466);
            rule__AreaAssignment__ElementsAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getAreaAssignmentAccess().getElementsAssignment_0_3()); 

            }

            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2206:1: ( ( rule__AreaAssignment__ElementsAssignment_0_3 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2207:1: ( rule__AreaAssignment__ElementsAssignment_0_3 )*
            {
             before(grammarAccess.getAreaAssignmentAccess().getElementsAssignment_0_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2208:1: ( rule__AreaAssignment__ElementsAssignment_0_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_STRING) ) {
                    int LA16_2 = input.LA(2);

                    if ( (LA16_2==EOF||LA16_2==27) ) {
                        alt16=1;
                    }
                    else if ( (LA16_2==RULE_STRING) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2208:2: rule__AreaAssignment__ElementsAssignment_0_3
            	    {
            	    pushFollow(FOLLOW_rule__AreaAssignment__ElementsAssignment_0_3_in_rule__AreaAssignment__Group_0__3__Impl4478);
            	    rule__AreaAssignment__ElementsAssignment_0_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getAreaAssignmentAccess().getElementsAssignment_0_3()); 

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
    // $ANTLR end "rule__AreaAssignment__Group_0__3__Impl"


    // $ANTLR start "rule__AreaAssignment__Group_1__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2227:1: rule__AreaAssignment__Group_1__0 : rule__AreaAssignment__Group_1__0__Impl rule__AreaAssignment__Group_1__1 ;
    public final void rule__AreaAssignment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2231:1: ( rule__AreaAssignment__Group_1__0__Impl rule__AreaAssignment__Group_1__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2232:2: rule__AreaAssignment__Group_1__0__Impl rule__AreaAssignment__Group_1__1
            {
            pushFollow(FOLLOW_rule__AreaAssignment__Group_1__0__Impl_in_rule__AreaAssignment__Group_1__04519);
            rule__AreaAssignment__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AreaAssignment__Group_1__1_in_rule__AreaAssignment__Group_1__04522);
            rule__AreaAssignment__Group_1__1();

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
    // $ANTLR end "rule__AreaAssignment__Group_1__0"


    // $ANTLR start "rule__AreaAssignment__Group_1__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2239:1: rule__AreaAssignment__Group_1__0__Impl : ( ( ( rule__AreaAssignment__ElementsAssignment_1_0 ) ) ( ( rule__AreaAssignment__ElementsAssignment_1_0 )* ) ) ;
    public final void rule__AreaAssignment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2243:1: ( ( ( ( rule__AreaAssignment__ElementsAssignment_1_0 ) ) ( ( rule__AreaAssignment__ElementsAssignment_1_0 )* ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2244:1: ( ( ( rule__AreaAssignment__ElementsAssignment_1_0 ) ) ( ( rule__AreaAssignment__ElementsAssignment_1_0 )* ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2244:1: ( ( ( rule__AreaAssignment__ElementsAssignment_1_0 ) ) ( ( rule__AreaAssignment__ElementsAssignment_1_0 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2245:1: ( ( rule__AreaAssignment__ElementsAssignment_1_0 ) ) ( ( rule__AreaAssignment__ElementsAssignment_1_0 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2245:1: ( ( rule__AreaAssignment__ElementsAssignment_1_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2246:1: ( rule__AreaAssignment__ElementsAssignment_1_0 )
            {
             before(grammarAccess.getAreaAssignmentAccess().getElementsAssignment_1_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2247:1: ( rule__AreaAssignment__ElementsAssignment_1_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2247:2: rule__AreaAssignment__ElementsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__AreaAssignment__ElementsAssignment_1_0_in_rule__AreaAssignment__Group_1__0__Impl4551);
            rule__AreaAssignment__ElementsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAreaAssignmentAccess().getElementsAssignment_1_0()); 

            }

            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2250:1: ( ( rule__AreaAssignment__ElementsAssignment_1_0 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2251:1: ( rule__AreaAssignment__ElementsAssignment_1_0 )*
            {
             before(grammarAccess.getAreaAssignmentAccess().getElementsAssignment_1_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2252:1: ( rule__AreaAssignment__ElementsAssignment_1_0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_STRING) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2252:2: rule__AreaAssignment__ElementsAssignment_1_0
            	    {
            	    pushFollow(FOLLOW_rule__AreaAssignment__ElementsAssignment_1_0_in_rule__AreaAssignment__Group_1__0__Impl4563);
            	    rule__AreaAssignment__ElementsAssignment_1_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getAreaAssignmentAccess().getElementsAssignment_1_0()); 

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
    // $ANTLR end "rule__AreaAssignment__Group_1__0__Impl"


    // $ANTLR start "rule__AreaAssignment__Group_1__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2263:1: rule__AreaAssignment__Group_1__1 : rule__AreaAssignment__Group_1__1__Impl rule__AreaAssignment__Group_1__2 ;
    public final void rule__AreaAssignment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2267:1: ( rule__AreaAssignment__Group_1__1__Impl rule__AreaAssignment__Group_1__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2268:2: rule__AreaAssignment__Group_1__1__Impl rule__AreaAssignment__Group_1__2
            {
            pushFollow(FOLLOW_rule__AreaAssignment__Group_1__1__Impl_in_rule__AreaAssignment__Group_1__14596);
            rule__AreaAssignment__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AreaAssignment__Group_1__2_in_rule__AreaAssignment__Group_1__14599);
            rule__AreaAssignment__Group_1__2();

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
    // $ANTLR end "rule__AreaAssignment__Group_1__1"


    // $ANTLR start "rule__AreaAssignment__Group_1__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2275:1: rule__AreaAssignment__Group_1__1__Impl : ( '->' ) ;
    public final void rule__AreaAssignment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2279:1: ( ( '->' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2280:1: ( '->' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2280:1: ( '->' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2281:1: '->'
            {
             before(grammarAccess.getAreaAssignmentAccess().getHyphenMinusGreaterThanSignKeyword_1_1()); 
            match(input,29,FOLLOW_29_in_rule__AreaAssignment__Group_1__1__Impl4627); 
             after(grammarAccess.getAreaAssignmentAccess().getHyphenMinusGreaterThanSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaAssignment__Group_1__1__Impl"


    // $ANTLR start "rule__AreaAssignment__Group_1__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2294:1: rule__AreaAssignment__Group_1__2 : rule__AreaAssignment__Group_1__2__Impl rule__AreaAssignment__Group_1__3 ;
    public final void rule__AreaAssignment__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2298:1: ( rule__AreaAssignment__Group_1__2__Impl rule__AreaAssignment__Group_1__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2299:2: rule__AreaAssignment__Group_1__2__Impl rule__AreaAssignment__Group_1__3
            {
            pushFollow(FOLLOW_rule__AreaAssignment__Group_1__2__Impl_in_rule__AreaAssignment__Group_1__24658);
            rule__AreaAssignment__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AreaAssignment__Group_1__3_in_rule__AreaAssignment__Group_1__24661);
            rule__AreaAssignment__Group_1__3();

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
    // $ANTLR end "rule__AreaAssignment__Group_1__2"


    // $ANTLR start "rule__AreaAssignment__Group_1__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2306:1: rule__AreaAssignment__Group_1__2__Impl : ( 'Area:' ) ;
    public final void rule__AreaAssignment__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2310:1: ( ( 'Area:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2311:1: ( 'Area:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2311:1: ( 'Area:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2312:1: 'Area:'
            {
             before(grammarAccess.getAreaAssignmentAccess().getAreaKeyword_1_2()); 
            match(input,27,FOLLOW_27_in_rule__AreaAssignment__Group_1__2__Impl4689); 
             after(grammarAccess.getAreaAssignmentAccess().getAreaKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaAssignment__Group_1__2__Impl"


    // $ANTLR start "rule__AreaAssignment__Group_1__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2325:1: rule__AreaAssignment__Group_1__3 : rule__AreaAssignment__Group_1__3__Impl ;
    public final void rule__AreaAssignment__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2329:1: ( rule__AreaAssignment__Group_1__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2330:2: rule__AreaAssignment__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__AreaAssignment__Group_1__3__Impl_in_rule__AreaAssignment__Group_1__34720);
            rule__AreaAssignment__Group_1__3__Impl();

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
    // $ANTLR end "rule__AreaAssignment__Group_1__3"


    // $ANTLR start "rule__AreaAssignment__Group_1__3__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2336:1: rule__AreaAssignment__Group_1__3__Impl : ( ( rule__AreaAssignment__AreaAssignment_1_3 ) ) ;
    public final void rule__AreaAssignment__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2340:1: ( ( ( rule__AreaAssignment__AreaAssignment_1_3 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2341:1: ( ( rule__AreaAssignment__AreaAssignment_1_3 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2341:1: ( ( rule__AreaAssignment__AreaAssignment_1_3 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2342:1: ( rule__AreaAssignment__AreaAssignment_1_3 )
            {
             before(grammarAccess.getAreaAssignmentAccess().getAreaAssignment_1_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2343:1: ( rule__AreaAssignment__AreaAssignment_1_3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2343:2: rule__AreaAssignment__AreaAssignment_1_3
            {
            pushFollow(FOLLOW_rule__AreaAssignment__AreaAssignment_1_3_in_rule__AreaAssignment__Group_1__3__Impl4747);
            rule__AreaAssignment__AreaAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getAreaAssignmentAccess().getAreaAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaAssignment__Group_1__3__Impl"


    // $ANTLR start "rule__CheckboxDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2361:1: rule__CheckboxDefinition__Group__0 : rule__CheckboxDefinition__Group__0__Impl rule__CheckboxDefinition__Group__1 ;
    public final void rule__CheckboxDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2365:1: ( rule__CheckboxDefinition__Group__0__Impl rule__CheckboxDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2366:2: rule__CheckboxDefinition__Group__0__Impl rule__CheckboxDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__CheckboxDefinition__Group__0__Impl_in_rule__CheckboxDefinition__Group__04785);
            rule__CheckboxDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckboxDefinition__Group__1_in_rule__CheckboxDefinition__Group__04788);
            rule__CheckboxDefinition__Group__1();

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
    // $ANTLR end "rule__CheckboxDefinition__Group__0"


    // $ANTLR start "rule__CheckboxDefinition__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2373:1: rule__CheckboxDefinition__Group__0__Impl : ( ( rule__CheckboxDefinition__TypeAssignment_0 ) ) ;
    public final void rule__CheckboxDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2377:1: ( ( ( rule__CheckboxDefinition__TypeAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2378:1: ( ( rule__CheckboxDefinition__TypeAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2378:1: ( ( rule__CheckboxDefinition__TypeAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2379:1: ( rule__CheckboxDefinition__TypeAssignment_0 )
            {
             before(grammarAccess.getCheckboxDefinitionAccess().getTypeAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2380:1: ( rule__CheckboxDefinition__TypeAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2380:2: rule__CheckboxDefinition__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__CheckboxDefinition__TypeAssignment_0_in_rule__CheckboxDefinition__Group__0__Impl4815);
            rule__CheckboxDefinition__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxDefinitionAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxDefinition__Group__0__Impl"


    // $ANTLR start "rule__CheckboxDefinition__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2390:1: rule__CheckboxDefinition__Group__1 : rule__CheckboxDefinition__Group__1__Impl rule__CheckboxDefinition__Group__2 ;
    public final void rule__CheckboxDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2394:1: ( rule__CheckboxDefinition__Group__1__Impl rule__CheckboxDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2395:2: rule__CheckboxDefinition__Group__1__Impl rule__CheckboxDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__CheckboxDefinition__Group__1__Impl_in_rule__CheckboxDefinition__Group__14845);
            rule__CheckboxDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckboxDefinition__Group__2_in_rule__CheckboxDefinition__Group__14848);
            rule__CheckboxDefinition__Group__2();

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
    // $ANTLR end "rule__CheckboxDefinition__Group__1"


    // $ANTLR start "rule__CheckboxDefinition__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2402:1: rule__CheckboxDefinition__Group__1__Impl : ( ' as ' ) ;
    public final void rule__CheckboxDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2406:1: ( ( ' as ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2407:1: ( ' as ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2407:1: ( ' as ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2408:1: ' as '
            {
             before(grammarAccess.getCheckboxDefinitionAccess().getAsKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__CheckboxDefinition__Group__1__Impl4876); 
             after(grammarAccess.getCheckboxDefinitionAccess().getAsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxDefinition__Group__1__Impl"


    // $ANTLR start "rule__CheckboxDefinition__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2421:1: rule__CheckboxDefinition__Group__2 : rule__CheckboxDefinition__Group__2__Impl rule__CheckboxDefinition__Group__3 ;
    public final void rule__CheckboxDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2425:1: ( rule__CheckboxDefinition__Group__2__Impl rule__CheckboxDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2426:2: rule__CheckboxDefinition__Group__2__Impl rule__CheckboxDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__CheckboxDefinition__Group__2__Impl_in_rule__CheckboxDefinition__Group__24907);
            rule__CheckboxDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckboxDefinition__Group__3_in_rule__CheckboxDefinition__Group__24910);
            rule__CheckboxDefinition__Group__3();

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
    // $ANTLR end "rule__CheckboxDefinition__Group__2"


    // $ANTLR start "rule__CheckboxDefinition__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2433:1: rule__CheckboxDefinition__Group__2__Impl : ( ( rule__CheckboxDefinition__NameAssignment_2 ) ) ;
    public final void rule__CheckboxDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2437:1: ( ( ( rule__CheckboxDefinition__NameAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2438:1: ( ( rule__CheckboxDefinition__NameAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2438:1: ( ( rule__CheckboxDefinition__NameAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2439:1: ( rule__CheckboxDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getCheckboxDefinitionAccess().getNameAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2440:1: ( rule__CheckboxDefinition__NameAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2440:2: rule__CheckboxDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__CheckboxDefinition__NameAssignment_2_in_rule__CheckboxDefinition__Group__2__Impl4937);
            rule__CheckboxDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxDefinition__Group__2__Impl"


    // $ANTLR start "rule__CheckboxDefinition__Group__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2450:1: rule__CheckboxDefinition__Group__3 : rule__CheckboxDefinition__Group__3__Impl rule__CheckboxDefinition__Group__4 ;
    public final void rule__CheckboxDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2454:1: ( rule__CheckboxDefinition__Group__3__Impl rule__CheckboxDefinition__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2455:2: rule__CheckboxDefinition__Group__3__Impl rule__CheckboxDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__CheckboxDefinition__Group__3__Impl_in_rule__CheckboxDefinition__Group__34967);
            rule__CheckboxDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckboxDefinition__Group__4_in_rule__CheckboxDefinition__Group__34970);
            rule__CheckboxDefinition__Group__4();

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
    // $ANTLR end "rule__CheckboxDefinition__Group__3"


    // $ANTLR start "rule__CheckboxDefinition__Group__3__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2462:1: rule__CheckboxDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__CheckboxDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2466:1: ( ( ':' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2467:1: ( ':' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2467:1: ( ':' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2468:1: ':'
            {
             before(grammarAccess.getCheckboxDefinitionAccess().getColonKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__CheckboxDefinition__Group__3__Impl4998); 
             after(grammarAccess.getCheckboxDefinitionAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxDefinition__Group__3__Impl"


    // $ANTLR start "rule__CheckboxDefinition__Group__4"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2481:1: rule__CheckboxDefinition__Group__4 : rule__CheckboxDefinition__Group__4__Impl ;
    public final void rule__CheckboxDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2485:1: ( rule__CheckboxDefinition__Group__4__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2486:2: rule__CheckboxDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CheckboxDefinition__Group__4__Impl_in_rule__CheckboxDefinition__Group__45029);
            rule__CheckboxDefinition__Group__4__Impl();

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
    // $ANTLR end "rule__CheckboxDefinition__Group__4"


    // $ANTLR start "rule__CheckboxDefinition__Group__4__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2492:1: rule__CheckboxDefinition__Group__4__Impl : ( ( rule__CheckboxDefinition__Group_4__0 )? ) ;
    public final void rule__CheckboxDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2496:1: ( ( ( rule__CheckboxDefinition__Group_4__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2497:1: ( ( rule__CheckboxDefinition__Group_4__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2497:1: ( ( rule__CheckboxDefinition__Group_4__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2498:1: ( rule__CheckboxDefinition__Group_4__0 )?
            {
             before(grammarAccess.getCheckboxDefinitionAccess().getGroup_4()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2499:1: ( rule__CheckboxDefinition__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2499:2: rule__CheckboxDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__CheckboxDefinition__Group_4__0_in_rule__CheckboxDefinition__Group__4__Impl5056);
                    rule__CheckboxDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheckboxDefinitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxDefinition__Group__4__Impl"


    // $ANTLR start "rule__CheckboxDefinition__Group_4__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2519:1: rule__CheckboxDefinition__Group_4__0 : rule__CheckboxDefinition__Group_4__0__Impl rule__CheckboxDefinition__Group_4__1 ;
    public final void rule__CheckboxDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2523:1: ( rule__CheckboxDefinition__Group_4__0__Impl rule__CheckboxDefinition__Group_4__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2524:2: rule__CheckboxDefinition__Group_4__0__Impl rule__CheckboxDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__CheckboxDefinition__Group_4__0__Impl_in_rule__CheckboxDefinition__Group_4__05097);
            rule__CheckboxDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckboxDefinition__Group_4__1_in_rule__CheckboxDefinition__Group_4__05100);
            rule__CheckboxDefinition__Group_4__1();

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
    // $ANTLR end "rule__CheckboxDefinition__Group_4__0"


    // $ANTLR start "rule__CheckboxDefinition__Group_4__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2531:1: rule__CheckboxDefinition__Group_4__0__Impl : ( 'text=' ) ;
    public final void rule__CheckboxDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2535:1: ( ( 'text=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2536:1: ( 'text=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2536:1: ( 'text=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2537:1: 'text='
            {
             before(grammarAccess.getCheckboxDefinitionAccess().getTextKeyword_4_0()); 
            match(input,32,FOLLOW_32_in_rule__CheckboxDefinition__Group_4__0__Impl5128); 
             after(grammarAccess.getCheckboxDefinitionAccess().getTextKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__CheckboxDefinition__Group_4__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2550:1: rule__CheckboxDefinition__Group_4__1 : rule__CheckboxDefinition__Group_4__1__Impl ;
    public final void rule__CheckboxDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2554:1: ( rule__CheckboxDefinition__Group_4__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2555:2: rule__CheckboxDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__CheckboxDefinition__Group_4__1__Impl_in_rule__CheckboxDefinition__Group_4__15159);
            rule__CheckboxDefinition__Group_4__1__Impl();

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
    // $ANTLR end "rule__CheckboxDefinition__Group_4__1"


    // $ANTLR start "rule__CheckboxDefinition__Group_4__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2561:1: rule__CheckboxDefinition__Group_4__1__Impl : ( ( rule__CheckboxDefinition__TextAssignment_4_1 ) ) ;
    public final void rule__CheckboxDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2565:1: ( ( ( rule__CheckboxDefinition__TextAssignment_4_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2566:1: ( ( rule__CheckboxDefinition__TextAssignment_4_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2566:1: ( ( rule__CheckboxDefinition__TextAssignment_4_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2567:1: ( rule__CheckboxDefinition__TextAssignment_4_1 )
            {
             before(grammarAccess.getCheckboxDefinitionAccess().getTextAssignment_4_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2568:1: ( rule__CheckboxDefinition__TextAssignment_4_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2568:2: rule__CheckboxDefinition__TextAssignment_4_1
            {
            pushFollow(FOLLOW_rule__CheckboxDefinition__TextAssignment_4_1_in_rule__CheckboxDefinition__Group_4__1__Impl5186);
            rule__CheckboxDefinition__TextAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxDefinitionAccess().getTextAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__RadioboxDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2582:1: rule__RadioboxDefinition__Group__0 : rule__RadioboxDefinition__Group__0__Impl rule__RadioboxDefinition__Group__1 ;
    public final void rule__RadioboxDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2586:1: ( rule__RadioboxDefinition__Group__0__Impl rule__RadioboxDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2587:2: rule__RadioboxDefinition__Group__0__Impl rule__RadioboxDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__RadioboxDefinition__Group__0__Impl_in_rule__RadioboxDefinition__Group__05220);
            rule__RadioboxDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RadioboxDefinition__Group__1_in_rule__RadioboxDefinition__Group__05223);
            rule__RadioboxDefinition__Group__1();

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
    // $ANTLR end "rule__RadioboxDefinition__Group__0"


    // $ANTLR start "rule__RadioboxDefinition__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2594:1: rule__RadioboxDefinition__Group__0__Impl : ( ( rule__RadioboxDefinition__TypeAssignment_0 ) ) ;
    public final void rule__RadioboxDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2598:1: ( ( ( rule__RadioboxDefinition__TypeAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2599:1: ( ( rule__RadioboxDefinition__TypeAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2599:1: ( ( rule__RadioboxDefinition__TypeAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2600:1: ( rule__RadioboxDefinition__TypeAssignment_0 )
            {
             before(grammarAccess.getRadioboxDefinitionAccess().getTypeAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2601:1: ( rule__RadioboxDefinition__TypeAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2601:2: rule__RadioboxDefinition__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__RadioboxDefinition__TypeAssignment_0_in_rule__RadioboxDefinition__Group__0__Impl5250);
            rule__RadioboxDefinition__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRadioboxDefinitionAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioboxDefinition__Group__0__Impl"


    // $ANTLR start "rule__RadioboxDefinition__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2611:1: rule__RadioboxDefinition__Group__1 : rule__RadioboxDefinition__Group__1__Impl rule__RadioboxDefinition__Group__2 ;
    public final void rule__RadioboxDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2615:1: ( rule__RadioboxDefinition__Group__1__Impl rule__RadioboxDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2616:2: rule__RadioboxDefinition__Group__1__Impl rule__RadioboxDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__RadioboxDefinition__Group__1__Impl_in_rule__RadioboxDefinition__Group__15280);
            rule__RadioboxDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RadioboxDefinition__Group__2_in_rule__RadioboxDefinition__Group__15283);
            rule__RadioboxDefinition__Group__2();

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
    // $ANTLR end "rule__RadioboxDefinition__Group__1"


    // $ANTLR start "rule__RadioboxDefinition__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2623:1: rule__RadioboxDefinition__Group__1__Impl : ( ' as ' ) ;
    public final void rule__RadioboxDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2627:1: ( ( ' as ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2628:1: ( ' as ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2628:1: ( ' as ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2629:1: ' as '
            {
             before(grammarAccess.getRadioboxDefinitionAccess().getAsKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__RadioboxDefinition__Group__1__Impl5311); 
             after(grammarAccess.getRadioboxDefinitionAccess().getAsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioboxDefinition__Group__1__Impl"


    // $ANTLR start "rule__RadioboxDefinition__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2642:1: rule__RadioboxDefinition__Group__2 : rule__RadioboxDefinition__Group__2__Impl rule__RadioboxDefinition__Group__3 ;
    public final void rule__RadioboxDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2646:1: ( rule__RadioboxDefinition__Group__2__Impl rule__RadioboxDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2647:2: rule__RadioboxDefinition__Group__2__Impl rule__RadioboxDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__RadioboxDefinition__Group__2__Impl_in_rule__RadioboxDefinition__Group__25342);
            rule__RadioboxDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RadioboxDefinition__Group__3_in_rule__RadioboxDefinition__Group__25345);
            rule__RadioboxDefinition__Group__3();

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
    // $ANTLR end "rule__RadioboxDefinition__Group__2"


    // $ANTLR start "rule__RadioboxDefinition__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2654:1: rule__RadioboxDefinition__Group__2__Impl : ( ( rule__RadioboxDefinition__NameAssignment_2 ) ) ;
    public final void rule__RadioboxDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2658:1: ( ( ( rule__RadioboxDefinition__NameAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2659:1: ( ( rule__RadioboxDefinition__NameAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2659:1: ( ( rule__RadioboxDefinition__NameAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2660:1: ( rule__RadioboxDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getRadioboxDefinitionAccess().getNameAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2661:1: ( rule__RadioboxDefinition__NameAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2661:2: rule__RadioboxDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__RadioboxDefinition__NameAssignment_2_in_rule__RadioboxDefinition__Group__2__Impl5372);
            rule__RadioboxDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRadioboxDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioboxDefinition__Group__2__Impl"


    // $ANTLR start "rule__RadioboxDefinition__Group__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2671:1: rule__RadioboxDefinition__Group__3 : rule__RadioboxDefinition__Group__3__Impl rule__RadioboxDefinition__Group__4 ;
    public final void rule__RadioboxDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2675:1: ( rule__RadioboxDefinition__Group__3__Impl rule__RadioboxDefinition__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2676:2: rule__RadioboxDefinition__Group__3__Impl rule__RadioboxDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__RadioboxDefinition__Group__3__Impl_in_rule__RadioboxDefinition__Group__35402);
            rule__RadioboxDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RadioboxDefinition__Group__4_in_rule__RadioboxDefinition__Group__35405);
            rule__RadioboxDefinition__Group__4();

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
    // $ANTLR end "rule__RadioboxDefinition__Group__3"


    // $ANTLR start "rule__RadioboxDefinition__Group__3__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2683:1: rule__RadioboxDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__RadioboxDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2687:1: ( ( ':' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2688:1: ( ':' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2688:1: ( ':' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2689:1: ':'
            {
             before(grammarAccess.getRadioboxDefinitionAccess().getColonKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__RadioboxDefinition__Group__3__Impl5433); 
             after(grammarAccess.getRadioboxDefinitionAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioboxDefinition__Group__3__Impl"


    // $ANTLR start "rule__RadioboxDefinition__Group__4"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2702:1: rule__RadioboxDefinition__Group__4 : rule__RadioboxDefinition__Group__4__Impl ;
    public final void rule__RadioboxDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2706:1: ( rule__RadioboxDefinition__Group__4__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2707:2: rule__RadioboxDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__RadioboxDefinition__Group__4__Impl_in_rule__RadioboxDefinition__Group__45464);
            rule__RadioboxDefinition__Group__4__Impl();

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
    // $ANTLR end "rule__RadioboxDefinition__Group__4"


    // $ANTLR start "rule__RadioboxDefinition__Group__4__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2713:1: rule__RadioboxDefinition__Group__4__Impl : ( ( rule__RadioboxDefinition__Group_4__0 )? ) ;
    public final void rule__RadioboxDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2717:1: ( ( ( rule__RadioboxDefinition__Group_4__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2718:1: ( ( rule__RadioboxDefinition__Group_4__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2718:1: ( ( rule__RadioboxDefinition__Group_4__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2719:1: ( rule__RadioboxDefinition__Group_4__0 )?
            {
             before(grammarAccess.getRadioboxDefinitionAccess().getGroup_4()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2720:1: ( rule__RadioboxDefinition__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2720:2: rule__RadioboxDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__RadioboxDefinition__Group_4__0_in_rule__RadioboxDefinition__Group__4__Impl5491);
                    rule__RadioboxDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRadioboxDefinitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioboxDefinition__Group__4__Impl"


    // $ANTLR start "rule__RadioboxDefinition__Group_4__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2740:1: rule__RadioboxDefinition__Group_4__0 : rule__RadioboxDefinition__Group_4__0__Impl rule__RadioboxDefinition__Group_4__1 ;
    public final void rule__RadioboxDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2744:1: ( rule__RadioboxDefinition__Group_4__0__Impl rule__RadioboxDefinition__Group_4__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2745:2: rule__RadioboxDefinition__Group_4__0__Impl rule__RadioboxDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__RadioboxDefinition__Group_4__0__Impl_in_rule__RadioboxDefinition__Group_4__05532);
            rule__RadioboxDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RadioboxDefinition__Group_4__1_in_rule__RadioboxDefinition__Group_4__05535);
            rule__RadioboxDefinition__Group_4__1();

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
    // $ANTLR end "rule__RadioboxDefinition__Group_4__0"


    // $ANTLR start "rule__RadioboxDefinition__Group_4__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2752:1: rule__RadioboxDefinition__Group_4__0__Impl : ( 'text=' ) ;
    public final void rule__RadioboxDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2756:1: ( ( 'text=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2757:1: ( 'text=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2757:1: ( 'text=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2758:1: 'text='
            {
             before(grammarAccess.getRadioboxDefinitionAccess().getTextKeyword_4_0()); 
            match(input,32,FOLLOW_32_in_rule__RadioboxDefinition__Group_4__0__Impl5563); 
             after(grammarAccess.getRadioboxDefinitionAccess().getTextKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioboxDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__RadioboxDefinition__Group_4__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2771:1: rule__RadioboxDefinition__Group_4__1 : rule__RadioboxDefinition__Group_4__1__Impl ;
    public final void rule__RadioboxDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2775:1: ( rule__RadioboxDefinition__Group_4__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2776:2: rule__RadioboxDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__RadioboxDefinition__Group_4__1__Impl_in_rule__RadioboxDefinition__Group_4__15594);
            rule__RadioboxDefinition__Group_4__1__Impl();

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
    // $ANTLR end "rule__RadioboxDefinition__Group_4__1"


    // $ANTLR start "rule__RadioboxDefinition__Group_4__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2782:1: rule__RadioboxDefinition__Group_4__1__Impl : ( ( rule__RadioboxDefinition__TextAssignment_4_1 ) ) ;
    public final void rule__RadioboxDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2786:1: ( ( ( rule__RadioboxDefinition__TextAssignment_4_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2787:1: ( ( rule__RadioboxDefinition__TextAssignment_4_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2787:1: ( ( rule__RadioboxDefinition__TextAssignment_4_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2788:1: ( rule__RadioboxDefinition__TextAssignment_4_1 )
            {
             before(grammarAccess.getRadioboxDefinitionAccess().getTextAssignment_4_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2789:1: ( rule__RadioboxDefinition__TextAssignment_4_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2789:2: rule__RadioboxDefinition__TextAssignment_4_1
            {
            pushFollow(FOLLOW_rule__RadioboxDefinition__TextAssignment_4_1_in_rule__RadioboxDefinition__Group_4__1__Impl5621);
            rule__RadioboxDefinition__TextAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRadioboxDefinitionAccess().getTextAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioboxDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__TableDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2803:1: rule__TableDefinition__Group__0 : rule__TableDefinition__Group__0__Impl rule__TableDefinition__Group__1 ;
    public final void rule__TableDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2807:1: ( rule__TableDefinition__Group__0__Impl rule__TableDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2808:2: rule__TableDefinition__Group__0__Impl rule__TableDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group__0__Impl_in_rule__TableDefinition__Group__05655);
            rule__TableDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableDefinition__Group__1_in_rule__TableDefinition__Group__05658);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2815:1: rule__TableDefinition__Group__0__Impl : ( ( rule__TableDefinition__TypeAssignment_0 ) ) ;
    public final void rule__TableDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2819:1: ( ( ( rule__TableDefinition__TypeAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2820:1: ( ( rule__TableDefinition__TypeAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2820:1: ( ( rule__TableDefinition__TypeAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2821:1: ( rule__TableDefinition__TypeAssignment_0 )
            {
             before(grammarAccess.getTableDefinitionAccess().getTypeAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2822:1: ( rule__TableDefinition__TypeAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2822:2: rule__TableDefinition__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__TableDefinition__TypeAssignment_0_in_rule__TableDefinition__Group__0__Impl5685);
            rule__TableDefinition__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTableDefinitionAccess().getTypeAssignment_0()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2832:1: rule__TableDefinition__Group__1 : rule__TableDefinition__Group__1__Impl rule__TableDefinition__Group__2 ;
    public final void rule__TableDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2836:1: ( rule__TableDefinition__Group__1__Impl rule__TableDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2837:2: rule__TableDefinition__Group__1__Impl rule__TableDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group__1__Impl_in_rule__TableDefinition__Group__15715);
            rule__TableDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableDefinition__Group__2_in_rule__TableDefinition__Group__15718);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2844:1: rule__TableDefinition__Group__1__Impl : ( ' as ' ) ;
    public final void rule__TableDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2848:1: ( ( ' as ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2849:1: ( ' as ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2849:1: ( ' as ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2850:1: ' as '
            {
             before(grammarAccess.getTableDefinitionAccess().getAsKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__TableDefinition__Group__1__Impl5746); 
             after(grammarAccess.getTableDefinitionAccess().getAsKeyword_1()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2863:1: rule__TableDefinition__Group__2 : rule__TableDefinition__Group__2__Impl rule__TableDefinition__Group__3 ;
    public final void rule__TableDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2867:1: ( rule__TableDefinition__Group__2__Impl rule__TableDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2868:2: rule__TableDefinition__Group__2__Impl rule__TableDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group__2__Impl_in_rule__TableDefinition__Group__25777);
            rule__TableDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableDefinition__Group__3_in_rule__TableDefinition__Group__25780);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2875:1: rule__TableDefinition__Group__2__Impl : ( ( rule__TableDefinition__NameAssignment_2 ) ) ;
    public final void rule__TableDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2879:1: ( ( ( rule__TableDefinition__NameAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2880:1: ( ( rule__TableDefinition__NameAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2880:1: ( ( rule__TableDefinition__NameAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2881:1: ( rule__TableDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getTableDefinitionAccess().getNameAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2882:1: ( rule__TableDefinition__NameAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2882:2: rule__TableDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__TableDefinition__NameAssignment_2_in_rule__TableDefinition__Group__2__Impl5807);
            rule__TableDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTableDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2892:1: rule__TableDefinition__Group__3 : rule__TableDefinition__Group__3__Impl rule__TableDefinition__Group__4 ;
    public final void rule__TableDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2896:1: ( rule__TableDefinition__Group__3__Impl rule__TableDefinition__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2897:2: rule__TableDefinition__Group__3__Impl rule__TableDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group__3__Impl_in_rule__TableDefinition__Group__35837);
            rule__TableDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableDefinition__Group__4_in_rule__TableDefinition__Group__35840);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2904:1: rule__TableDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__TableDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2908:1: ( ( ':' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2909:1: ( ':' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2909:1: ( ':' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2910:1: ':'
            {
             before(grammarAccess.getTableDefinitionAccess().getColonKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__TableDefinition__Group__3__Impl5868); 
             after(grammarAccess.getTableDefinitionAccess().getColonKeyword_3()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2923:1: rule__TableDefinition__Group__4 : rule__TableDefinition__Group__4__Impl ;
    public final void rule__TableDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2927:1: ( rule__TableDefinition__Group__4__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2928:2: rule__TableDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group__4__Impl_in_rule__TableDefinition__Group__45899);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2934:1: rule__TableDefinition__Group__4__Impl : ( ( rule__TableDefinition__Group_4__0 )? ) ;
    public final void rule__TableDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2938:1: ( ( ( rule__TableDefinition__Group_4__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2939:1: ( ( rule__TableDefinition__Group_4__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2939:1: ( ( rule__TableDefinition__Group_4__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2940:1: ( rule__TableDefinition__Group_4__0 )?
            {
             before(grammarAccess.getTableDefinitionAccess().getGroup_4()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2941:1: ( rule__TableDefinition__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2941:2: rule__TableDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__TableDefinition__Group_4__0_in_rule__TableDefinition__Group__4__Impl5926);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2961:1: rule__TableDefinition__Group_4__0 : rule__TableDefinition__Group_4__0__Impl rule__TableDefinition__Group_4__1 ;
    public final void rule__TableDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2965:1: ( rule__TableDefinition__Group_4__0__Impl rule__TableDefinition__Group_4__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2966:2: rule__TableDefinition__Group_4__0__Impl rule__TableDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group_4__0__Impl_in_rule__TableDefinition__Group_4__05967);
            rule__TableDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableDefinition__Group_4__1_in_rule__TableDefinition__Group_4__05970);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2973:1: rule__TableDefinition__Group_4__0__Impl : ( 'text=' ) ;
    public final void rule__TableDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2977:1: ( ( 'text=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2978:1: ( 'text=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2978:1: ( 'text=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2979:1: 'text='
            {
             before(grammarAccess.getTableDefinitionAccess().getTextKeyword_4_0()); 
            match(input,32,FOLLOW_32_in_rule__TableDefinition__Group_4__0__Impl5998); 
             after(grammarAccess.getTableDefinitionAccess().getTextKeyword_4_0()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2992:1: rule__TableDefinition__Group_4__1 : rule__TableDefinition__Group_4__1__Impl ;
    public final void rule__TableDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2996:1: ( rule__TableDefinition__Group_4__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2997:2: rule__TableDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group_4__1__Impl_in_rule__TableDefinition__Group_4__16029);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3003:1: rule__TableDefinition__Group_4__1__Impl : ( ( rule__TableDefinition__TextAssignment_4_1 ) ) ;
    public final void rule__TableDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3007:1: ( ( ( rule__TableDefinition__TextAssignment_4_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3008:1: ( ( rule__TableDefinition__TextAssignment_4_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3008:1: ( ( rule__TableDefinition__TextAssignment_4_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3009:1: ( rule__TableDefinition__TextAssignment_4_1 )
            {
             before(grammarAccess.getTableDefinitionAccess().getTextAssignment_4_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3010:1: ( rule__TableDefinition__TextAssignment_4_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3010:2: rule__TableDefinition__TextAssignment_4_1
            {
            pushFollow(FOLLOW_rule__TableDefinition__TextAssignment_4_1_in_rule__TableDefinition__Group_4__1__Impl6056);
            rule__TableDefinition__TextAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTableDefinitionAccess().getTextAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__TreeDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3024:1: rule__TreeDefinition__Group__0 : rule__TreeDefinition__Group__0__Impl rule__TreeDefinition__Group__1 ;
    public final void rule__TreeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3028:1: ( rule__TreeDefinition__Group__0__Impl rule__TreeDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3029:2: rule__TreeDefinition__Group__0__Impl rule__TreeDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group__0__Impl_in_rule__TreeDefinition__Group__06090);
            rule__TreeDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TreeDefinition__Group__1_in_rule__TreeDefinition__Group__06093);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3036:1: rule__TreeDefinition__Group__0__Impl : ( ( rule__TreeDefinition__TypeAssignment_0 ) ) ;
    public final void rule__TreeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3040:1: ( ( ( rule__TreeDefinition__TypeAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3041:1: ( ( rule__TreeDefinition__TypeAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3041:1: ( ( rule__TreeDefinition__TypeAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3042:1: ( rule__TreeDefinition__TypeAssignment_0 )
            {
             before(grammarAccess.getTreeDefinitionAccess().getTypeAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3043:1: ( rule__TreeDefinition__TypeAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3043:2: rule__TreeDefinition__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__TreeDefinition__TypeAssignment_0_in_rule__TreeDefinition__Group__0__Impl6120);
            rule__TreeDefinition__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTreeDefinitionAccess().getTypeAssignment_0()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3053:1: rule__TreeDefinition__Group__1 : rule__TreeDefinition__Group__1__Impl rule__TreeDefinition__Group__2 ;
    public final void rule__TreeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3057:1: ( rule__TreeDefinition__Group__1__Impl rule__TreeDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3058:2: rule__TreeDefinition__Group__1__Impl rule__TreeDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group__1__Impl_in_rule__TreeDefinition__Group__16150);
            rule__TreeDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TreeDefinition__Group__2_in_rule__TreeDefinition__Group__16153);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3065:1: rule__TreeDefinition__Group__1__Impl : ( ' as ' ) ;
    public final void rule__TreeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3069:1: ( ( ' as ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3070:1: ( ' as ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3070:1: ( ' as ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3071:1: ' as '
            {
             before(grammarAccess.getTreeDefinitionAccess().getAsKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__TreeDefinition__Group__1__Impl6181); 
             after(grammarAccess.getTreeDefinitionAccess().getAsKeyword_1()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3084:1: rule__TreeDefinition__Group__2 : rule__TreeDefinition__Group__2__Impl rule__TreeDefinition__Group__3 ;
    public final void rule__TreeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3088:1: ( rule__TreeDefinition__Group__2__Impl rule__TreeDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3089:2: rule__TreeDefinition__Group__2__Impl rule__TreeDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group__2__Impl_in_rule__TreeDefinition__Group__26212);
            rule__TreeDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TreeDefinition__Group__3_in_rule__TreeDefinition__Group__26215);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3096:1: rule__TreeDefinition__Group__2__Impl : ( ( rule__TreeDefinition__NameAssignment_2 ) ) ;
    public final void rule__TreeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3100:1: ( ( ( rule__TreeDefinition__NameAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3101:1: ( ( rule__TreeDefinition__NameAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3101:1: ( ( rule__TreeDefinition__NameAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3102:1: ( rule__TreeDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getTreeDefinitionAccess().getNameAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3103:1: ( rule__TreeDefinition__NameAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3103:2: rule__TreeDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__TreeDefinition__NameAssignment_2_in_rule__TreeDefinition__Group__2__Impl6242);
            rule__TreeDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTreeDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3113:1: rule__TreeDefinition__Group__3 : rule__TreeDefinition__Group__3__Impl rule__TreeDefinition__Group__4 ;
    public final void rule__TreeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3117:1: ( rule__TreeDefinition__Group__3__Impl rule__TreeDefinition__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3118:2: rule__TreeDefinition__Group__3__Impl rule__TreeDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group__3__Impl_in_rule__TreeDefinition__Group__36272);
            rule__TreeDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TreeDefinition__Group__4_in_rule__TreeDefinition__Group__36275);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3125:1: rule__TreeDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__TreeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3129:1: ( ( ':' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3130:1: ( ':' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3130:1: ( ':' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3131:1: ':'
            {
             before(grammarAccess.getTreeDefinitionAccess().getColonKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__TreeDefinition__Group__3__Impl6303); 
             after(grammarAccess.getTreeDefinitionAccess().getColonKeyword_3()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3144:1: rule__TreeDefinition__Group__4 : rule__TreeDefinition__Group__4__Impl ;
    public final void rule__TreeDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3148:1: ( rule__TreeDefinition__Group__4__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3149:2: rule__TreeDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group__4__Impl_in_rule__TreeDefinition__Group__46334);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3155:1: rule__TreeDefinition__Group__4__Impl : ( ( rule__TreeDefinition__Group_4__0 )? ) ;
    public final void rule__TreeDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3159:1: ( ( ( rule__TreeDefinition__Group_4__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3160:1: ( ( rule__TreeDefinition__Group_4__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3160:1: ( ( rule__TreeDefinition__Group_4__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3161:1: ( rule__TreeDefinition__Group_4__0 )?
            {
             before(grammarAccess.getTreeDefinitionAccess().getGroup_4()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3162:1: ( rule__TreeDefinition__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3162:2: rule__TreeDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__TreeDefinition__Group_4__0_in_rule__TreeDefinition__Group__4__Impl6361);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3182:1: rule__TreeDefinition__Group_4__0 : rule__TreeDefinition__Group_4__0__Impl rule__TreeDefinition__Group_4__1 ;
    public final void rule__TreeDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3186:1: ( rule__TreeDefinition__Group_4__0__Impl rule__TreeDefinition__Group_4__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3187:2: rule__TreeDefinition__Group_4__0__Impl rule__TreeDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group_4__0__Impl_in_rule__TreeDefinition__Group_4__06402);
            rule__TreeDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TreeDefinition__Group_4__1_in_rule__TreeDefinition__Group_4__06405);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3194:1: rule__TreeDefinition__Group_4__0__Impl : ( 'text=' ) ;
    public final void rule__TreeDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3198:1: ( ( 'text=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3199:1: ( 'text=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3199:1: ( 'text=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3200:1: 'text='
            {
             before(grammarAccess.getTreeDefinitionAccess().getTextKeyword_4_0()); 
            match(input,32,FOLLOW_32_in_rule__TreeDefinition__Group_4__0__Impl6433); 
             after(grammarAccess.getTreeDefinitionAccess().getTextKeyword_4_0()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3213:1: rule__TreeDefinition__Group_4__1 : rule__TreeDefinition__Group_4__1__Impl ;
    public final void rule__TreeDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3217:1: ( rule__TreeDefinition__Group_4__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3218:2: rule__TreeDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group_4__1__Impl_in_rule__TreeDefinition__Group_4__16464);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3224:1: rule__TreeDefinition__Group_4__1__Impl : ( ( rule__TreeDefinition__TextAssignment_4_1 ) ) ;
    public final void rule__TreeDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3228:1: ( ( ( rule__TreeDefinition__TextAssignment_4_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3229:1: ( ( rule__TreeDefinition__TextAssignment_4_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3229:1: ( ( rule__TreeDefinition__TextAssignment_4_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3230:1: ( rule__TreeDefinition__TextAssignment_4_1 )
            {
             before(grammarAccess.getTreeDefinitionAccess().getTextAssignment_4_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3231:1: ( rule__TreeDefinition__TextAssignment_4_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3231:2: rule__TreeDefinition__TextAssignment_4_1
            {
            pushFollow(FOLLOW_rule__TreeDefinition__TextAssignment_4_1_in_rule__TreeDefinition__Group_4__1__Impl6491);
            rule__TreeDefinition__TextAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTreeDefinitionAccess().getTextAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__TextfieldDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3245:1: rule__TextfieldDefinition__Group__0 : rule__TextfieldDefinition__Group__0__Impl rule__TextfieldDefinition__Group__1 ;
    public final void rule__TextfieldDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3249:1: ( rule__TextfieldDefinition__Group__0__Impl rule__TextfieldDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3250:2: rule__TextfieldDefinition__Group__0__Impl rule__TextfieldDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__0__Impl_in_rule__TextfieldDefinition__Group__06525);
            rule__TextfieldDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__1_in_rule__TextfieldDefinition__Group__06528);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3257:1: rule__TextfieldDefinition__Group__0__Impl : ( ( rule__TextfieldDefinition__TypeAssignment_0 ) ) ;
    public final void rule__TextfieldDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3261:1: ( ( ( rule__TextfieldDefinition__TypeAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3262:1: ( ( rule__TextfieldDefinition__TypeAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3262:1: ( ( rule__TextfieldDefinition__TypeAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3263:1: ( rule__TextfieldDefinition__TypeAssignment_0 )
            {
             before(grammarAccess.getTextfieldDefinitionAccess().getTypeAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3264:1: ( rule__TextfieldDefinition__TypeAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3264:2: rule__TextfieldDefinition__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__TypeAssignment_0_in_rule__TextfieldDefinition__Group__0__Impl6555);
            rule__TextfieldDefinition__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTextfieldDefinitionAccess().getTypeAssignment_0()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3274:1: rule__TextfieldDefinition__Group__1 : rule__TextfieldDefinition__Group__1__Impl rule__TextfieldDefinition__Group__2 ;
    public final void rule__TextfieldDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3278:1: ( rule__TextfieldDefinition__Group__1__Impl rule__TextfieldDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3279:2: rule__TextfieldDefinition__Group__1__Impl rule__TextfieldDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__1__Impl_in_rule__TextfieldDefinition__Group__16585);
            rule__TextfieldDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__2_in_rule__TextfieldDefinition__Group__16588);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3286:1: rule__TextfieldDefinition__Group__1__Impl : ( ' as ' ) ;
    public final void rule__TextfieldDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3290:1: ( ( ' as ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3291:1: ( ' as ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3291:1: ( ' as ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3292:1: ' as '
            {
             before(grammarAccess.getTextfieldDefinitionAccess().getAsKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__TextfieldDefinition__Group__1__Impl6616); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3305:1: rule__TextfieldDefinition__Group__2 : rule__TextfieldDefinition__Group__2__Impl rule__TextfieldDefinition__Group__3 ;
    public final void rule__TextfieldDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3309:1: ( rule__TextfieldDefinition__Group__2__Impl rule__TextfieldDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3310:2: rule__TextfieldDefinition__Group__2__Impl rule__TextfieldDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__2__Impl_in_rule__TextfieldDefinition__Group__26647);
            rule__TextfieldDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__3_in_rule__TextfieldDefinition__Group__26650);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3317:1: rule__TextfieldDefinition__Group__2__Impl : ( ( rule__TextfieldDefinition__NameAssignment_2 ) ) ;
    public final void rule__TextfieldDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3321:1: ( ( ( rule__TextfieldDefinition__NameAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3322:1: ( ( rule__TextfieldDefinition__NameAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3322:1: ( ( rule__TextfieldDefinition__NameAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3323:1: ( rule__TextfieldDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getTextfieldDefinitionAccess().getNameAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3324:1: ( rule__TextfieldDefinition__NameAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3324:2: rule__TextfieldDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__NameAssignment_2_in_rule__TextfieldDefinition__Group__2__Impl6677);
            rule__TextfieldDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTextfieldDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3334:1: rule__TextfieldDefinition__Group__3 : rule__TextfieldDefinition__Group__3__Impl rule__TextfieldDefinition__Group__4 ;
    public final void rule__TextfieldDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3338:1: ( rule__TextfieldDefinition__Group__3__Impl rule__TextfieldDefinition__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3339:2: rule__TextfieldDefinition__Group__3__Impl rule__TextfieldDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__3__Impl_in_rule__TextfieldDefinition__Group__36707);
            rule__TextfieldDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__4_in_rule__TextfieldDefinition__Group__36710);
            rule__TextfieldDefinition__Group__4();

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3346:1: rule__TextfieldDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__TextfieldDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3350:1: ( ( ':' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3351:1: ( ':' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3351:1: ( ':' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3352:1: ':'
            {
             before(grammarAccess.getTextfieldDefinitionAccess().getColonKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__TextfieldDefinition__Group__3__Impl6738); 
             after(grammarAccess.getTextfieldDefinitionAccess().getColonKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__TextfieldDefinition__Group__4"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3365:1: rule__TextfieldDefinition__Group__4 : rule__TextfieldDefinition__Group__4__Impl ;
    public final void rule__TextfieldDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3369:1: ( rule__TextfieldDefinition__Group__4__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3370:2: rule__TextfieldDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__4__Impl_in_rule__TextfieldDefinition__Group__46769);
            rule__TextfieldDefinition__Group__4__Impl();

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
    // $ANTLR end "rule__TextfieldDefinition__Group__4"


    // $ANTLR start "rule__TextfieldDefinition__Group__4__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3376:1: rule__TextfieldDefinition__Group__4__Impl : ( ( rule__TextfieldDefinition__Group_4__0 )? ) ;
    public final void rule__TextfieldDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3380:1: ( ( ( rule__TextfieldDefinition__Group_4__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3381:1: ( ( rule__TextfieldDefinition__Group_4__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3381:1: ( ( rule__TextfieldDefinition__Group_4__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3382:1: ( rule__TextfieldDefinition__Group_4__0 )?
            {
             before(grammarAccess.getTextfieldDefinitionAccess().getGroup_4()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3383:1: ( rule__TextfieldDefinition__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3383:2: rule__TextfieldDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__TextfieldDefinition__Group_4__0_in_rule__TextfieldDefinition__Group__4__Impl6796);
                    rule__TextfieldDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextfieldDefinitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldDefinition__Group__4__Impl"


    // $ANTLR start "rule__TextfieldDefinition__Group_4__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3403:1: rule__TextfieldDefinition__Group_4__0 : rule__TextfieldDefinition__Group_4__0__Impl rule__TextfieldDefinition__Group_4__1 ;
    public final void rule__TextfieldDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3407:1: ( rule__TextfieldDefinition__Group_4__0__Impl rule__TextfieldDefinition__Group_4__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3408:2: rule__TextfieldDefinition__Group_4__0__Impl rule__TextfieldDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group_4__0__Impl_in_rule__TextfieldDefinition__Group_4__06837);
            rule__TextfieldDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextfieldDefinition__Group_4__1_in_rule__TextfieldDefinition__Group_4__06840);
            rule__TextfieldDefinition__Group_4__1();

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
    // $ANTLR end "rule__TextfieldDefinition__Group_4__0"


    // $ANTLR start "rule__TextfieldDefinition__Group_4__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3415:1: rule__TextfieldDefinition__Group_4__0__Impl : ( 'text=' ) ;
    public final void rule__TextfieldDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3419:1: ( ( 'text=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3420:1: ( 'text=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3420:1: ( 'text=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3421:1: 'text='
            {
             before(grammarAccess.getTextfieldDefinitionAccess().getTextKeyword_4_0()); 
            match(input,32,FOLLOW_32_in_rule__TextfieldDefinition__Group_4__0__Impl6868); 
             after(grammarAccess.getTextfieldDefinitionAccess().getTextKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__TextfieldDefinition__Group_4__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3434:1: rule__TextfieldDefinition__Group_4__1 : rule__TextfieldDefinition__Group_4__1__Impl ;
    public final void rule__TextfieldDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3438:1: ( rule__TextfieldDefinition__Group_4__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3439:2: rule__TextfieldDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group_4__1__Impl_in_rule__TextfieldDefinition__Group_4__16899);
            rule__TextfieldDefinition__Group_4__1__Impl();

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
    // $ANTLR end "rule__TextfieldDefinition__Group_4__1"


    // $ANTLR start "rule__TextfieldDefinition__Group_4__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3445:1: rule__TextfieldDefinition__Group_4__1__Impl : ( ( rule__TextfieldDefinition__TextAssignment_4_1 ) ) ;
    public final void rule__TextfieldDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3449:1: ( ( ( rule__TextfieldDefinition__TextAssignment_4_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3450:1: ( ( rule__TextfieldDefinition__TextAssignment_4_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3450:1: ( ( rule__TextfieldDefinition__TextAssignment_4_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3451:1: ( rule__TextfieldDefinition__TextAssignment_4_1 )
            {
             before(grammarAccess.getTextfieldDefinitionAccess().getTextAssignment_4_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3452:1: ( rule__TextfieldDefinition__TextAssignment_4_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3452:2: rule__TextfieldDefinition__TextAssignment_4_1
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__TextAssignment_4_1_in_rule__TextfieldDefinition__Group_4__1__Impl6926);
            rule__TextfieldDefinition__TextAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTextfieldDefinitionAccess().getTextAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__ButtonDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3466:1: rule__ButtonDefinition__Group__0 : rule__ButtonDefinition__Group__0__Impl rule__ButtonDefinition__Group__1 ;
    public final void rule__ButtonDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3470:1: ( rule__ButtonDefinition__Group__0__Impl rule__ButtonDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3471:2: rule__ButtonDefinition__Group__0__Impl rule__ButtonDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__0__Impl_in_rule__ButtonDefinition__Group__06960);
            rule__ButtonDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonDefinition__Group__1_in_rule__ButtonDefinition__Group__06963);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3478:1: rule__ButtonDefinition__Group__0__Impl : ( ( rule__ButtonDefinition__TypeAssignment_0 ) ) ;
    public final void rule__ButtonDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3482:1: ( ( ( rule__ButtonDefinition__TypeAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3483:1: ( ( rule__ButtonDefinition__TypeAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3483:1: ( ( rule__ButtonDefinition__TypeAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3484:1: ( rule__ButtonDefinition__TypeAssignment_0 )
            {
             before(grammarAccess.getButtonDefinitionAccess().getTypeAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3485:1: ( rule__ButtonDefinition__TypeAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3485:2: rule__ButtonDefinition__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__TypeAssignment_0_in_rule__ButtonDefinition__Group__0__Impl6990);
            rule__ButtonDefinition__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getButtonDefinitionAccess().getTypeAssignment_0()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3495:1: rule__ButtonDefinition__Group__1 : rule__ButtonDefinition__Group__1__Impl rule__ButtonDefinition__Group__2 ;
    public final void rule__ButtonDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3499:1: ( rule__ButtonDefinition__Group__1__Impl rule__ButtonDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3500:2: rule__ButtonDefinition__Group__1__Impl rule__ButtonDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__1__Impl_in_rule__ButtonDefinition__Group__17020);
            rule__ButtonDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonDefinition__Group__2_in_rule__ButtonDefinition__Group__17023);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3507:1: rule__ButtonDefinition__Group__1__Impl : ( ' as ' ) ;
    public final void rule__ButtonDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3511:1: ( ( ' as ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3512:1: ( ' as ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3512:1: ( ' as ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3513:1: ' as '
            {
             before(grammarAccess.getButtonDefinitionAccess().getAsKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__ButtonDefinition__Group__1__Impl7051); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3526:1: rule__ButtonDefinition__Group__2 : rule__ButtonDefinition__Group__2__Impl rule__ButtonDefinition__Group__3 ;
    public final void rule__ButtonDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3530:1: ( rule__ButtonDefinition__Group__2__Impl rule__ButtonDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3531:2: rule__ButtonDefinition__Group__2__Impl rule__ButtonDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__2__Impl_in_rule__ButtonDefinition__Group__27082);
            rule__ButtonDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonDefinition__Group__3_in_rule__ButtonDefinition__Group__27085);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3538:1: rule__ButtonDefinition__Group__2__Impl : ( ( rule__ButtonDefinition__NameAssignment_2 ) ) ;
    public final void rule__ButtonDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3542:1: ( ( ( rule__ButtonDefinition__NameAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3543:1: ( ( rule__ButtonDefinition__NameAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3543:1: ( ( rule__ButtonDefinition__NameAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3544:1: ( rule__ButtonDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getButtonDefinitionAccess().getNameAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3545:1: ( rule__ButtonDefinition__NameAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3545:2: rule__ButtonDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__NameAssignment_2_in_rule__ButtonDefinition__Group__2__Impl7112);
            rule__ButtonDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getButtonDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3555:1: rule__ButtonDefinition__Group__3 : rule__ButtonDefinition__Group__3__Impl ;
    public final void rule__ButtonDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3559:1: ( rule__ButtonDefinition__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3560:2: rule__ButtonDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__3__Impl_in_rule__ButtonDefinition__Group__37142);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3566:1: rule__ButtonDefinition__Group__3__Impl : ( ( rule__ButtonDefinition__PropertiesAssignment_3 )? ) ;
    public final void rule__ButtonDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3570:1: ( ( ( rule__ButtonDefinition__PropertiesAssignment_3 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3571:1: ( ( rule__ButtonDefinition__PropertiesAssignment_3 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3571:1: ( ( rule__ButtonDefinition__PropertiesAssignment_3 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3572:1: ( rule__ButtonDefinition__PropertiesAssignment_3 )?
            {
             before(grammarAccess.getButtonDefinitionAccess().getPropertiesAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3573:1: ( rule__ButtonDefinition__PropertiesAssignment_3 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3573:2: rule__ButtonDefinition__PropertiesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__ButtonDefinition__PropertiesAssignment_3_in_rule__ButtonDefinition__Group__3__Impl7169);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3591:1: rule__Properties__Group__0 : rule__Properties__Group__0__Impl rule__Properties__Group__1 ;
    public final void rule__Properties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3595:1: ( rule__Properties__Group__0__Impl rule__Properties__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3596:2: rule__Properties__Group__0__Impl rule__Properties__Group__1
            {
            pushFollow(FOLLOW_rule__Properties__Group__0__Impl_in_rule__Properties__Group__07208);
            rule__Properties__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Properties__Group__1_in_rule__Properties__Group__07211);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3603:1: rule__Properties__Group__0__Impl : ( ':' ) ;
    public final void rule__Properties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3607:1: ( ( ':' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3608:1: ( ':' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3608:1: ( ':' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3609:1: ':'
            {
             before(grammarAccess.getPropertiesAccess().getColonKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Properties__Group__0__Impl7239); 
             after(grammarAccess.getPropertiesAccess().getColonKeyword_0()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3622:1: rule__Properties__Group__1 : rule__Properties__Group__1__Impl rule__Properties__Group__2 ;
    public final void rule__Properties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3626:1: ( rule__Properties__Group__1__Impl rule__Properties__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3627:2: rule__Properties__Group__1__Impl rule__Properties__Group__2
            {
            pushFollow(FOLLOW_rule__Properties__Group__1__Impl_in_rule__Properties__Group__17270);
            rule__Properties__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Properties__Group__2_in_rule__Properties__Group__17273);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3634:1: rule__Properties__Group__1__Impl : ( ( rule__Properties__Group_1__0 )? ) ;
    public final void rule__Properties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3638:1: ( ( ( rule__Properties__Group_1__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3639:1: ( ( rule__Properties__Group_1__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3639:1: ( ( rule__Properties__Group_1__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3640:1: ( rule__Properties__Group_1__0 )?
            {
             before(grammarAccess.getPropertiesAccess().getGroup_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3641:1: ( rule__Properties__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3641:2: rule__Properties__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Properties__Group_1__0_in_rule__Properties__Group__1__Impl7300);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3651:1: rule__Properties__Group__2 : rule__Properties__Group__2__Impl rule__Properties__Group__3 ;
    public final void rule__Properties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3655:1: ( rule__Properties__Group__2__Impl rule__Properties__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3656:2: rule__Properties__Group__2__Impl rule__Properties__Group__3
            {
            pushFollow(FOLLOW_rule__Properties__Group__2__Impl_in_rule__Properties__Group__27331);
            rule__Properties__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Properties__Group__3_in_rule__Properties__Group__27334);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3663:1: rule__Properties__Group__2__Impl : ( ( rule__Properties__Group_2__0 )? ) ;
    public final void rule__Properties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3667:1: ( ( ( rule__Properties__Group_2__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3668:1: ( ( rule__Properties__Group_2__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3668:1: ( ( rule__Properties__Group_2__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3669:1: ( rule__Properties__Group_2__0 )?
            {
             before(grammarAccess.getPropertiesAccess().getGroup_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3670:1: ( rule__Properties__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==32) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3670:2: rule__Properties__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Properties__Group_2__0_in_rule__Properties__Group__2__Impl7361);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3680:1: rule__Properties__Group__3 : rule__Properties__Group__3__Impl ;
    public final void rule__Properties__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3684:1: ( rule__Properties__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3685:2: rule__Properties__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Properties__Group__3__Impl_in_rule__Properties__Group__37392);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3691:1: rule__Properties__Group__3__Impl : ( ( rule__Properties__Group_3__0 )? ) ;
    public final void rule__Properties__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3695:1: ( ( ( rule__Properties__Group_3__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3696:1: ( ( rule__Properties__Group_3__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3696:1: ( ( rule__Properties__Group_3__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3697:1: ( rule__Properties__Group_3__0 )?
            {
             before(grammarAccess.getPropertiesAccess().getGroup_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3698:1: ( rule__Properties__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==34) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3698:2: rule__Properties__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Properties__Group_3__0_in_rule__Properties__Group__3__Impl7419);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3716:1: rule__Properties__Group_1__0 : rule__Properties__Group_1__0__Impl rule__Properties__Group_1__1 ;
    public final void rule__Properties__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3720:1: ( rule__Properties__Group_1__0__Impl rule__Properties__Group_1__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3721:2: rule__Properties__Group_1__0__Impl rule__Properties__Group_1__1
            {
            pushFollow(FOLLOW_rule__Properties__Group_1__0__Impl_in_rule__Properties__Group_1__07458);
            rule__Properties__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Properties__Group_1__1_in_rule__Properties__Group_1__07461);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3728:1: rule__Properties__Group_1__0__Impl : ( 'propertyKey=' ) ;
    public final void rule__Properties__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3732:1: ( ( 'propertyKey=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3733:1: ( 'propertyKey=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3733:1: ( 'propertyKey=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3734:1: 'propertyKey='
            {
             before(grammarAccess.getPropertiesAccess().getPropertyKeyKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__Properties__Group_1__0__Impl7489); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3747:1: rule__Properties__Group_1__1 : rule__Properties__Group_1__1__Impl ;
    public final void rule__Properties__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3751:1: ( rule__Properties__Group_1__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3752:2: rule__Properties__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Properties__Group_1__1__Impl_in_rule__Properties__Group_1__17520);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3758:1: rule__Properties__Group_1__1__Impl : ( ( rule__Properties__PropertyKeyAssignment_1_1 ) ) ;
    public final void rule__Properties__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3762:1: ( ( ( rule__Properties__PropertyKeyAssignment_1_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3763:1: ( ( rule__Properties__PropertyKeyAssignment_1_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3763:1: ( ( rule__Properties__PropertyKeyAssignment_1_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3764:1: ( rule__Properties__PropertyKeyAssignment_1_1 )
            {
             before(grammarAccess.getPropertiesAccess().getPropertyKeyAssignment_1_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3765:1: ( rule__Properties__PropertyKeyAssignment_1_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3765:2: rule__Properties__PropertyKeyAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Properties__PropertyKeyAssignment_1_1_in_rule__Properties__Group_1__1__Impl7547);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3779:1: rule__Properties__Group_2__0 : rule__Properties__Group_2__0__Impl rule__Properties__Group_2__1 ;
    public final void rule__Properties__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3783:1: ( rule__Properties__Group_2__0__Impl rule__Properties__Group_2__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3784:2: rule__Properties__Group_2__0__Impl rule__Properties__Group_2__1
            {
            pushFollow(FOLLOW_rule__Properties__Group_2__0__Impl_in_rule__Properties__Group_2__07581);
            rule__Properties__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Properties__Group_2__1_in_rule__Properties__Group_2__07584);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3791:1: rule__Properties__Group_2__0__Impl : ( 'text=' ) ;
    public final void rule__Properties__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3795:1: ( ( 'text=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3796:1: ( 'text=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3796:1: ( 'text=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3797:1: 'text='
            {
             before(grammarAccess.getPropertiesAccess().getTextKeyword_2_0()); 
            match(input,32,FOLLOW_32_in_rule__Properties__Group_2__0__Impl7612); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3810:1: rule__Properties__Group_2__1 : rule__Properties__Group_2__1__Impl ;
    public final void rule__Properties__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3814:1: ( rule__Properties__Group_2__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3815:2: rule__Properties__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Properties__Group_2__1__Impl_in_rule__Properties__Group_2__17643);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3821:1: rule__Properties__Group_2__1__Impl : ( ( rule__Properties__TextAssignment_2_1 ) ) ;
    public final void rule__Properties__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3825:1: ( ( ( rule__Properties__TextAssignment_2_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3826:1: ( ( rule__Properties__TextAssignment_2_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3826:1: ( ( rule__Properties__TextAssignment_2_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3827:1: ( rule__Properties__TextAssignment_2_1 )
            {
             before(grammarAccess.getPropertiesAccess().getTextAssignment_2_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3828:1: ( rule__Properties__TextAssignment_2_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3828:2: rule__Properties__TextAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Properties__TextAssignment_2_1_in_rule__Properties__Group_2__1__Impl7670);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3842:1: rule__Properties__Group_3__0 : rule__Properties__Group_3__0__Impl rule__Properties__Group_3__1 ;
    public final void rule__Properties__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3846:1: ( rule__Properties__Group_3__0__Impl rule__Properties__Group_3__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3847:2: rule__Properties__Group_3__0__Impl rule__Properties__Group_3__1
            {
            pushFollow(FOLLOW_rule__Properties__Group_3__0__Impl_in_rule__Properties__Group_3__07704);
            rule__Properties__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Properties__Group_3__1_in_rule__Properties__Group_3__07707);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3854:1: rule__Properties__Group_3__0__Impl : ( 'interactiontype=' ) ;
    public final void rule__Properties__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3858:1: ( ( 'interactiontype=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3859:1: ( 'interactiontype=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3859:1: ( 'interactiontype=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3860:1: 'interactiontype='
            {
             before(grammarAccess.getPropertiesAccess().getInteractiontypeKeyword_3_0()); 
            match(input,34,FOLLOW_34_in_rule__Properties__Group_3__0__Impl7735); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3873:1: rule__Properties__Group_3__1 : rule__Properties__Group_3__1__Impl ;
    public final void rule__Properties__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3877:1: ( rule__Properties__Group_3__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3878:2: rule__Properties__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Properties__Group_3__1__Impl_in_rule__Properties__Group_3__17766);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3884:1: rule__Properties__Group_3__1__Impl : ( ( ( rule__Properties__InteractiontypeAssignment_3_1 ) ) ( ( rule__Properties__InteractiontypeAssignment_3_1 )* ) ) ;
    public final void rule__Properties__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3888:1: ( ( ( ( rule__Properties__InteractiontypeAssignment_3_1 ) ) ( ( rule__Properties__InteractiontypeAssignment_3_1 )* ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3889:1: ( ( ( rule__Properties__InteractiontypeAssignment_3_1 ) ) ( ( rule__Properties__InteractiontypeAssignment_3_1 )* ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3889:1: ( ( ( rule__Properties__InteractiontypeAssignment_3_1 ) ) ( ( rule__Properties__InteractiontypeAssignment_3_1 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3890:1: ( ( rule__Properties__InteractiontypeAssignment_3_1 ) ) ( ( rule__Properties__InteractiontypeAssignment_3_1 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3890:1: ( ( rule__Properties__InteractiontypeAssignment_3_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3891:1: ( rule__Properties__InteractiontypeAssignment_3_1 )
            {
             before(grammarAccess.getPropertiesAccess().getInteractiontypeAssignment_3_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3892:1: ( rule__Properties__InteractiontypeAssignment_3_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3892:2: rule__Properties__InteractiontypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Properties__InteractiontypeAssignment_3_1_in_rule__Properties__Group_3__1__Impl7795);
            rule__Properties__InteractiontypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertiesAccess().getInteractiontypeAssignment_3_1()); 

            }

            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3895:1: ( ( rule__Properties__InteractiontypeAssignment_3_1 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3896:1: ( rule__Properties__InteractiontypeAssignment_3_1 )*
            {
             before(grammarAccess.getPropertiesAccess().getInteractiontypeAssignment_3_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3897:1: ( rule__Properties__InteractiontypeAssignment_3_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=13 && LA27_0<=14)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3897:2: rule__Properties__InteractiontypeAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__Properties__InteractiontypeAssignment_3_1_in_rule__Properties__Group_3__1__Impl7807);
            	    rule__Properties__InteractiontypeAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3912:1: rule__LabelDefinition__Group__0 : rule__LabelDefinition__Group__0__Impl rule__LabelDefinition__Group__1 ;
    public final void rule__LabelDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3916:1: ( rule__LabelDefinition__Group__0__Impl rule__LabelDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3917:2: rule__LabelDefinition__Group__0__Impl rule__LabelDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__0__Impl_in_rule__LabelDefinition__Group__07844);
            rule__LabelDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelDefinition__Group__1_in_rule__LabelDefinition__Group__07847);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3924:1: rule__LabelDefinition__Group__0__Impl : ( ( rule__LabelDefinition__TypeAssignment_0 ) ) ;
    public final void rule__LabelDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3928:1: ( ( ( rule__LabelDefinition__TypeAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3929:1: ( ( rule__LabelDefinition__TypeAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3929:1: ( ( rule__LabelDefinition__TypeAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3930:1: ( rule__LabelDefinition__TypeAssignment_0 )
            {
             before(grammarAccess.getLabelDefinitionAccess().getTypeAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3931:1: ( rule__LabelDefinition__TypeAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3931:2: rule__LabelDefinition__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__LabelDefinition__TypeAssignment_0_in_rule__LabelDefinition__Group__0__Impl7874);
            rule__LabelDefinition__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLabelDefinitionAccess().getTypeAssignment_0()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3941:1: rule__LabelDefinition__Group__1 : rule__LabelDefinition__Group__1__Impl rule__LabelDefinition__Group__2 ;
    public final void rule__LabelDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3945:1: ( rule__LabelDefinition__Group__1__Impl rule__LabelDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3946:2: rule__LabelDefinition__Group__1__Impl rule__LabelDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__1__Impl_in_rule__LabelDefinition__Group__17904);
            rule__LabelDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelDefinition__Group__2_in_rule__LabelDefinition__Group__17907);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3953:1: rule__LabelDefinition__Group__1__Impl : ( ' as ' ) ;
    public final void rule__LabelDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3957:1: ( ( ' as ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3958:1: ( ' as ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3958:1: ( ' as ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3959:1: ' as '
            {
             before(grammarAccess.getLabelDefinitionAccess().getAsKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__LabelDefinition__Group__1__Impl7935); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3972:1: rule__LabelDefinition__Group__2 : rule__LabelDefinition__Group__2__Impl rule__LabelDefinition__Group__3 ;
    public final void rule__LabelDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3976:1: ( rule__LabelDefinition__Group__2__Impl rule__LabelDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3977:2: rule__LabelDefinition__Group__2__Impl rule__LabelDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__2__Impl_in_rule__LabelDefinition__Group__27966);
            rule__LabelDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelDefinition__Group__3_in_rule__LabelDefinition__Group__27969);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3984:1: rule__LabelDefinition__Group__2__Impl : ( ( rule__LabelDefinition__NameAssignment_2 ) ) ;
    public final void rule__LabelDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3988:1: ( ( ( rule__LabelDefinition__NameAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3989:1: ( ( rule__LabelDefinition__NameAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3989:1: ( ( rule__LabelDefinition__NameAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3990:1: ( rule__LabelDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getLabelDefinitionAccess().getNameAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3991:1: ( rule__LabelDefinition__NameAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3991:2: rule__LabelDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__LabelDefinition__NameAssignment_2_in_rule__LabelDefinition__Group__2__Impl7996);
            rule__LabelDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLabelDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4001:1: rule__LabelDefinition__Group__3 : rule__LabelDefinition__Group__3__Impl ;
    public final void rule__LabelDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4005:1: ( rule__LabelDefinition__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4006:2: rule__LabelDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__3__Impl_in_rule__LabelDefinition__Group__38026);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4012:1: rule__LabelDefinition__Group__3__Impl : ( ( rule__LabelDefinition__PropertiesAssignment_3 )? ) ;
    public final void rule__LabelDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4016:1: ( ( ( rule__LabelDefinition__PropertiesAssignment_3 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4017:1: ( ( rule__LabelDefinition__PropertiesAssignment_3 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4017:1: ( ( rule__LabelDefinition__PropertiesAssignment_3 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4018:1: ( rule__LabelDefinition__PropertiesAssignment_3 )?
            {
             before(grammarAccess.getLabelDefinitionAccess().getPropertiesAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4019:1: ( rule__LabelDefinition__PropertiesAssignment_3 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4019:2: rule__LabelDefinition__PropertiesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__LabelDefinition__PropertiesAssignment_3_in_rule__LabelDefinition__Group__3__Impl8053);
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


    // $ANTLR start "rule__UIDescription__AreaCountAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4038:1: rule__UIDescription__AreaCountAssignment_0 : ( ruleAreaCount ) ;
    public final void rule__UIDescription__AreaCountAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4042:1: ( ( ruleAreaCount ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4043:1: ( ruleAreaCount )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4043:1: ( ruleAreaCount )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4044:1: ruleAreaCount
            {
             before(grammarAccess.getUIDescriptionAccess().getAreaCountAreaCountParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAreaCount_in_rule__UIDescription__AreaCountAssignment_08097);
            ruleAreaCount();

            state._fsp--;

             after(grammarAccess.getUIDescriptionAccess().getAreaCountAreaCountParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__AreaCountAssignment_0"


    // $ANTLR start "rule__UIDescription__TypeDefinitionAssignment_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4053:1: rule__UIDescription__TypeDefinitionAssignment_1 : ( ruleTypeDefinition ) ;
    public final void rule__UIDescription__TypeDefinitionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4057:1: ( ( ruleTypeDefinition ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4058:1: ( ruleTypeDefinition )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4058:1: ( ruleTypeDefinition )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4059:1: ruleTypeDefinition
            {
             before(grammarAccess.getUIDescriptionAccess().getTypeDefinitionTypeDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeDefinition_in_rule__UIDescription__TypeDefinitionAssignment_18128);
            ruleTypeDefinition();

            state._fsp--;

             after(grammarAccess.getUIDescriptionAccess().getTypeDefinitionTypeDefinitionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__TypeDefinitionAssignment_1"


    // $ANTLR start "rule__UIDescription__PropertyAssignment_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4068:1: rule__UIDescription__PropertyAssignment_2 : ( ruleProperty ) ;
    public final void rule__UIDescription__PropertyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4072:1: ( ( ruleProperty ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4073:1: ( ruleProperty )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4073:1: ( ruleProperty )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4074:1: ruleProperty
            {
             before(grammarAccess.getUIDescriptionAccess().getPropertyPropertyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__UIDescription__PropertyAssignment_28159);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getUIDescriptionAccess().getPropertyPropertyParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__PropertyAssignment_2"


    // $ANTLR start "rule__UIDescription__UsedDescriptionsAssignment_3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4083:1: rule__UIDescription__UsedDescriptionsAssignment_3 : ( ruleUsedDescriptions ) ;
    public final void rule__UIDescription__UsedDescriptionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4087:1: ( ( ruleUsedDescriptions ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4088:1: ( ruleUsedDescriptions )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4088:1: ( ruleUsedDescriptions )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4089:1: ruleUsedDescriptions
            {
             before(grammarAccess.getUIDescriptionAccess().getUsedDescriptionsUsedDescriptionsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleUsedDescriptions_in_rule__UIDescription__UsedDescriptionsAssignment_38190);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4098:1: rule__UIDescription__RefinementsAssignment_4 : ( ruleRefinement ) ;
    public final void rule__UIDescription__RefinementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4102:1: ( ( ruleRefinement ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4103:1: ( ruleRefinement )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4103:1: ( ruleRefinement )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4104:1: ruleRefinement
            {
             before(grammarAccess.getUIDescriptionAccess().getRefinementsRefinementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleRefinement_in_rule__UIDescription__RefinementsAssignment_48221);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4113:1: rule__UIDescription__DefinitionsAssignment_5 : ( ruleDefinition ) ;
    public final void rule__UIDescription__DefinitionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4117:1: ( ( ruleDefinition ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4118:1: ( ruleDefinition )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4118:1: ( ruleDefinition )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4119:1: ruleDefinition
            {
             before(grammarAccess.getUIDescriptionAccess().getDefinitionsDefinitionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleDefinition_in_rule__UIDescription__DefinitionsAssignment_58252);
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


    // $ANTLR start "rule__UIDescription__AreasAssignment_6"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4128:1: rule__UIDescription__AreasAssignment_6 : ( ruleAreaAssignment ) ;
    public final void rule__UIDescription__AreasAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4132:1: ( ( ruleAreaAssignment ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4133:1: ( ruleAreaAssignment )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4133:1: ( ruleAreaAssignment )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4134:1: ruleAreaAssignment
            {
             before(grammarAccess.getUIDescriptionAccess().getAreasAreaAssignmentParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleAreaAssignment_in_rule__UIDescription__AreasAssignment_68283);
            ruleAreaAssignment();

            state._fsp--;

             after(grammarAccess.getUIDescriptionAccess().getAreasAreaAssignmentParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__AreasAssignment_6"


    // $ANTLR start "rule__Refinement__ConcreteRefinementAssignment_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4143:1: rule__Refinement__ConcreteRefinementAssignment_1 : ( ruleComponentRefinement ) ;
    public final void rule__Refinement__ConcreteRefinementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4147:1: ( ( ruleComponentRefinement ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4148:1: ( ruleComponentRefinement )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4148:1: ( ruleComponentRefinement )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4149:1: ruleComponentRefinement
            {
             before(grammarAccess.getRefinementAccess().getConcreteRefinementComponentRefinementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleComponentRefinement_in_rule__Refinement__ConcreteRefinementAssignment_18314);
            ruleComponentRefinement();

            state._fsp--;

             after(grammarAccess.getRefinementAccess().getConcreteRefinementComponentRefinementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refinement__ConcreteRefinementAssignment_1"


    // $ANTLR start "rule__ButtonRefinement__TypeAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4158:1: rule__ButtonRefinement__TypeAssignment_0 : ( ( 'Button' ) ) ;
    public final void rule__ButtonRefinement__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4162:1: ( ( ( 'Button' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4163:1: ( ( 'Button' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4163:1: ( ( 'Button' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4164:1: ( 'Button' )
            {
             before(grammarAccess.getButtonRefinementAccess().getTypeButtonKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4165:1: ( 'Button' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4166:1: 'Button'
            {
             before(grammarAccess.getButtonRefinementAccess().getTypeButtonKeyword_0_0()); 
            match(input,35,FOLLOW_35_in_rule__ButtonRefinement__TypeAssignment_08350); 
             after(grammarAccess.getButtonRefinementAccess().getTypeButtonKeyword_0_0()); 

            }

             after(grammarAccess.getButtonRefinementAccess().getTypeButtonKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonRefinement__TypeAssignment_0"


    // $ANTLR start "rule__ButtonRefinement__NameAssignment_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4181:1: rule__ButtonRefinement__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ButtonRefinement__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4185:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4186:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4186:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4187:1: RULE_STRING
            {
             before(grammarAccess.getButtonRefinementAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ButtonRefinement__NameAssignment_28389); 
             after(grammarAccess.getButtonRefinementAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonRefinement__NameAssignment_2"


    // $ANTLR start "rule__ButtonRefinement__PropertiesAssignment_3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4196:1: rule__ButtonRefinement__PropertiesAssignment_3 : ( ruleProperties ) ;
    public final void rule__ButtonRefinement__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4200:1: ( ( ruleProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4201:1: ( ruleProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4201:1: ( ruleProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4202:1: ruleProperties
            {
             before(grammarAccess.getButtonRefinementAccess().getPropertiesPropertiesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleProperties_in_rule__ButtonRefinement__PropertiesAssignment_38420);
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


    // $ANTLR start "rule__LabelRefinement__TypeAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4211:1: rule__LabelRefinement__TypeAssignment_0 : ( ( 'Label' ) ) ;
    public final void rule__LabelRefinement__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4215:1: ( ( ( 'Label' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4216:1: ( ( 'Label' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4216:1: ( ( 'Label' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4217:1: ( 'Label' )
            {
             before(grammarAccess.getLabelRefinementAccess().getTypeLabelKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4218:1: ( 'Label' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4219:1: 'Label'
            {
             before(grammarAccess.getLabelRefinementAccess().getTypeLabelKeyword_0_0()); 
            match(input,36,FOLLOW_36_in_rule__LabelRefinement__TypeAssignment_08456); 
             after(grammarAccess.getLabelRefinementAccess().getTypeLabelKeyword_0_0()); 

            }

             after(grammarAccess.getLabelRefinementAccess().getTypeLabelKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelRefinement__TypeAssignment_0"


    // $ANTLR start "rule__LabelRefinement__NameAssignment_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4234:1: rule__LabelRefinement__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LabelRefinement__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4238:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4239:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4239:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4240:1: RULE_STRING
            {
             before(grammarAccess.getLabelRefinementAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LabelRefinement__NameAssignment_28495); 
             after(grammarAccess.getLabelRefinementAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelRefinement__NameAssignment_2"


    // $ANTLR start "rule__LabelRefinement__PropertiesAssignment_3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4249:1: rule__LabelRefinement__PropertiesAssignment_3 : ( ruleProperties ) ;
    public final void rule__LabelRefinement__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4253:1: ( ( ruleProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4254:1: ( ruleProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4254:1: ( ruleProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4255:1: ruleProperties
            {
             before(grammarAccess.getLabelRefinementAccess().getPropertiesPropertiesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleProperties_in_rule__LabelRefinement__PropertiesAssignment_38526);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4264:1: rule__Property__PropertiesFileAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Property__PropertiesFileAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4268:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4269:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4269:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4270:1: RULE_STRING
            {
             before(grammarAccess.getPropertyAccess().getPropertiesFileSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Property__PropertiesFileAssignment_18557); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4279:1: rule__UsedDescriptions__DescriptionAssignment_1 : ( ( rule__UsedDescriptions__DescriptionAlternatives_1_0 ) ) ;
    public final void rule__UsedDescriptions__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4283:1: ( ( ( rule__UsedDescriptions__DescriptionAlternatives_1_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4284:1: ( ( rule__UsedDescriptions__DescriptionAlternatives_1_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4284:1: ( ( rule__UsedDescriptions__DescriptionAlternatives_1_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4285:1: ( rule__UsedDescriptions__DescriptionAlternatives_1_0 )
            {
             before(grammarAccess.getUsedDescriptionsAccess().getDescriptionAlternatives_1_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4286:1: ( rule__UsedDescriptions__DescriptionAlternatives_1_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4286:2: rule__UsedDescriptions__DescriptionAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__DescriptionAlternatives_1_0_in_rule__UsedDescriptions__DescriptionAssignment_18588);
            rule__UsedDescriptions__DescriptionAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getUsedDescriptionsAccess().getDescriptionAlternatives_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__UsedDescriptions__LocalNameAssignment_2_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4295:1: rule__UsedDescriptions__LocalNameAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__UsedDescriptions__LocalNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4299:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4300:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4300:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4301:1: RULE_STRING
            {
             before(grammarAccess.getUsedDescriptionsAccess().getLocalNameSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UsedDescriptions__LocalNameAssignment_2_18621); 
             after(grammarAccess.getUsedDescriptionsAccess().getLocalNameSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedDescriptions__LocalNameAssignment_2_1"


    // $ANTLR start "rule__AreaCount__AreaCountAssignment_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4310:1: rule__AreaCount__AreaCountAssignment_1 : ( RULE_INT ) ;
    public final void rule__AreaCount__AreaCountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4314:1: ( ( RULE_INT ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4315:1: ( RULE_INT )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4315:1: ( RULE_INT )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4316:1: RULE_INT
            {
             before(grammarAccess.getAreaCountAccess().getAreaCountINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AreaCount__AreaCountAssignment_18652); 
             after(grammarAccess.getAreaCountAccess().getAreaCountINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaCount__AreaCountAssignment_1"


    // $ANTLR start "rule__Definition__ConcreteDefitionAssignment_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4325:1: rule__Definition__ConcreteDefitionAssignment_1 : ( ruleComponentDefinition ) ;
    public final void rule__Definition__ConcreteDefitionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4329:1: ( ( ruleComponentDefinition ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4330:1: ( ruleComponentDefinition )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4330:1: ( ruleComponentDefinition )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4331:1: ruleComponentDefinition
            {
             before(grammarAccess.getDefinitionAccess().getConcreteDefitionComponentDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleComponentDefinition_in_rule__Definition__ConcreteDefitionAssignment_18683);
            ruleComponentDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getConcreteDefitionComponentDefinitionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__ConcreteDefitionAssignment_1"


    // $ANTLR start "rule__TypeDefinition__TypeAssignment_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4340:1: rule__TypeDefinition__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__TypeDefinition__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4344:1: ( ( ruleType ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4345:1: ( ruleType )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4345:1: ( ruleType )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4346:1: ruleType
            {
             before(grammarAccess.getTypeDefinitionAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__TypeDefinition__TypeAssignment_18714);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4355:1: rule__UIDescriptionImport__DescriptionNameAssignment : ( RULE_STRING ) ;
    public final void rule__UIDescriptionImport__DescriptionNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4359:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4360:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4360:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4361:1: RULE_STRING
            {
             before(grammarAccess.getUIDescriptionImportAccess().getDescriptionNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UIDescriptionImport__DescriptionNameAssignment8745); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4370:1: rule__Multiselection__DescriptionNameAssignment_0 : ( ( 'Multiselection' ) ) ;
    public final void rule__Multiselection__DescriptionNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4374:1: ( ( ( 'Multiselection' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4375:1: ( ( 'Multiselection' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4375:1: ( ( 'Multiselection' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4376:1: ( 'Multiselection' )
            {
             before(grammarAccess.getMultiselectionAccess().getDescriptionNameMultiselectionKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4377:1: ( 'Multiselection' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4378:1: 'Multiselection'
            {
             before(grammarAccess.getMultiselectionAccess().getDescriptionNameMultiselectionKeyword_0_0()); 
            match(input,37,FOLLOW_37_in_rule__Multiselection__DescriptionNameAssignment_08781); 
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


    // $ANTLR start "rule__Multiselection__InputTypeAssignment_1_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4393:1: rule__Multiselection__InputTypeAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Multiselection__InputTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4397:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4398:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4398:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4399:1: RULE_STRING
            {
             before(grammarAccess.getMultiselectionAccess().getInputTypeSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Multiselection__InputTypeAssignment_1_18820); 
             after(grammarAccess.getMultiselectionAccess().getInputTypeSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiselection__InputTypeAssignment_1_1"


    // $ANTLR start "rule__AreaAssignment__AreaAssignment_0_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4408:1: rule__AreaAssignment__AreaAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__AreaAssignment__AreaAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4412:1: ( ( RULE_INT ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4413:1: ( RULE_INT )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4413:1: ( RULE_INT )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4414:1: RULE_INT
            {
             before(grammarAccess.getAreaAssignmentAccess().getAreaINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AreaAssignment__AreaAssignment_0_18851); 
             after(grammarAccess.getAreaAssignmentAccess().getAreaINTTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaAssignment__AreaAssignment_0_1"


    // $ANTLR start "rule__AreaAssignment__ElementsAssignment_0_3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4423:1: rule__AreaAssignment__ElementsAssignment_0_3 : ( RULE_STRING ) ;
    public final void rule__AreaAssignment__ElementsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4427:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4428:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4428:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4429:1: RULE_STRING
            {
             before(grammarAccess.getAreaAssignmentAccess().getElementsSTRINGTerminalRuleCall_0_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AreaAssignment__ElementsAssignment_0_38882); 
             after(grammarAccess.getAreaAssignmentAccess().getElementsSTRINGTerminalRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaAssignment__ElementsAssignment_0_3"


    // $ANTLR start "rule__AreaAssignment__ElementsAssignment_1_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4438:1: rule__AreaAssignment__ElementsAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__AreaAssignment__ElementsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4442:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4443:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4443:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4444:1: RULE_STRING
            {
             before(grammarAccess.getAreaAssignmentAccess().getElementsSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AreaAssignment__ElementsAssignment_1_08913); 
             after(grammarAccess.getAreaAssignmentAccess().getElementsSTRINGTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaAssignment__ElementsAssignment_1_0"


    // $ANTLR start "rule__AreaAssignment__AreaAssignment_1_3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4453:1: rule__AreaAssignment__AreaAssignment_1_3 : ( RULE_INT ) ;
    public final void rule__AreaAssignment__AreaAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4457:1: ( ( RULE_INT ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4458:1: ( RULE_INT )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4458:1: ( RULE_INT )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4459:1: RULE_INT
            {
             before(grammarAccess.getAreaAssignmentAccess().getAreaINTTerminalRuleCall_1_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AreaAssignment__AreaAssignment_1_38944); 
             after(grammarAccess.getAreaAssignmentAccess().getAreaINTTerminalRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaAssignment__AreaAssignment_1_3"


    // $ANTLR start "rule__CheckboxDefinition__TypeAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4468:1: rule__CheckboxDefinition__TypeAssignment_0 : ( ( 'Checkbox' ) ) ;
    public final void rule__CheckboxDefinition__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4472:1: ( ( ( 'Checkbox' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4473:1: ( ( 'Checkbox' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4473:1: ( ( 'Checkbox' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4474:1: ( 'Checkbox' )
            {
             before(grammarAccess.getCheckboxDefinitionAccess().getTypeCheckboxKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4475:1: ( 'Checkbox' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4476:1: 'Checkbox'
            {
             before(grammarAccess.getCheckboxDefinitionAccess().getTypeCheckboxKeyword_0_0()); 
            match(input,38,FOLLOW_38_in_rule__CheckboxDefinition__TypeAssignment_08980); 
             after(grammarAccess.getCheckboxDefinitionAccess().getTypeCheckboxKeyword_0_0()); 

            }

             after(grammarAccess.getCheckboxDefinitionAccess().getTypeCheckboxKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxDefinition__TypeAssignment_0"


    // $ANTLR start "rule__CheckboxDefinition__NameAssignment_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4491:1: rule__CheckboxDefinition__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__CheckboxDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4495:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4496:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4496:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4497:1: RULE_STRING
            {
             before(grammarAccess.getCheckboxDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CheckboxDefinition__NameAssignment_29019); 
             after(grammarAccess.getCheckboxDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxDefinition__NameAssignment_2"


    // $ANTLR start "rule__CheckboxDefinition__TextAssignment_4_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4506:1: rule__CheckboxDefinition__TextAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__CheckboxDefinition__TextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4510:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4511:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4511:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4512:1: RULE_STRING
            {
             before(grammarAccess.getCheckboxDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CheckboxDefinition__TextAssignment_4_19050); 
             after(grammarAccess.getCheckboxDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxDefinition__TextAssignment_4_1"


    // $ANTLR start "rule__RadioboxDefinition__TypeAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4521:1: rule__RadioboxDefinition__TypeAssignment_0 : ( ( 'Radiobox' ) ) ;
    public final void rule__RadioboxDefinition__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4525:1: ( ( ( 'Radiobox' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4526:1: ( ( 'Radiobox' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4526:1: ( ( 'Radiobox' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4527:1: ( 'Radiobox' )
            {
             before(grammarAccess.getRadioboxDefinitionAccess().getTypeRadioboxKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4528:1: ( 'Radiobox' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4529:1: 'Radiobox'
            {
             before(grammarAccess.getRadioboxDefinitionAccess().getTypeRadioboxKeyword_0_0()); 
            match(input,39,FOLLOW_39_in_rule__RadioboxDefinition__TypeAssignment_09086); 
             after(grammarAccess.getRadioboxDefinitionAccess().getTypeRadioboxKeyword_0_0()); 

            }

             after(grammarAccess.getRadioboxDefinitionAccess().getTypeRadioboxKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioboxDefinition__TypeAssignment_0"


    // $ANTLR start "rule__RadioboxDefinition__NameAssignment_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4544:1: rule__RadioboxDefinition__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__RadioboxDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4548:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4549:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4549:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4550:1: RULE_STRING
            {
             before(grammarAccess.getRadioboxDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RadioboxDefinition__NameAssignment_29125); 
             after(grammarAccess.getRadioboxDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioboxDefinition__NameAssignment_2"


    // $ANTLR start "rule__RadioboxDefinition__TextAssignment_4_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4559:1: rule__RadioboxDefinition__TextAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__RadioboxDefinition__TextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4563:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4564:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4564:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4565:1: RULE_STRING
            {
             before(grammarAccess.getRadioboxDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RadioboxDefinition__TextAssignment_4_19156); 
             after(grammarAccess.getRadioboxDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioboxDefinition__TextAssignment_4_1"


    // $ANTLR start "rule__TableDefinition__TypeAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4574:1: rule__TableDefinition__TypeAssignment_0 : ( ( 'Table' ) ) ;
    public final void rule__TableDefinition__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4578:1: ( ( ( 'Table' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4579:1: ( ( 'Table' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4579:1: ( ( 'Table' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4580:1: ( 'Table' )
            {
             before(grammarAccess.getTableDefinitionAccess().getTypeTableKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4581:1: ( 'Table' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4582:1: 'Table'
            {
             before(grammarAccess.getTableDefinitionAccess().getTypeTableKeyword_0_0()); 
            match(input,40,FOLLOW_40_in_rule__TableDefinition__TypeAssignment_09192); 
             after(grammarAccess.getTableDefinitionAccess().getTypeTableKeyword_0_0()); 

            }

             after(grammarAccess.getTableDefinitionAccess().getTypeTableKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDefinition__TypeAssignment_0"


    // $ANTLR start "rule__TableDefinition__NameAssignment_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4597:1: rule__TableDefinition__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TableDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4601:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4602:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4602:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4603:1: RULE_STRING
            {
             before(grammarAccess.getTableDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TableDefinition__NameAssignment_29231); 
             after(grammarAccess.getTableDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDefinition__NameAssignment_2"


    // $ANTLR start "rule__TableDefinition__TextAssignment_4_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4612:1: rule__TableDefinition__TextAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__TableDefinition__TextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4616:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4617:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4617:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4618:1: RULE_STRING
            {
             before(grammarAccess.getTableDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TableDefinition__TextAssignment_4_19262); 
             after(grammarAccess.getTableDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDefinition__TextAssignment_4_1"


    // $ANTLR start "rule__TreeDefinition__TypeAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4627:1: rule__TreeDefinition__TypeAssignment_0 : ( ( 'Tree' ) ) ;
    public final void rule__TreeDefinition__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4631:1: ( ( ( 'Tree' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4632:1: ( ( 'Tree' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4632:1: ( ( 'Tree' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4633:1: ( 'Tree' )
            {
             before(grammarAccess.getTreeDefinitionAccess().getTypeTreeKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4634:1: ( 'Tree' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4635:1: 'Tree'
            {
             before(grammarAccess.getTreeDefinitionAccess().getTypeTreeKeyword_0_0()); 
            match(input,41,FOLLOW_41_in_rule__TreeDefinition__TypeAssignment_09298); 
             after(grammarAccess.getTreeDefinitionAccess().getTypeTreeKeyword_0_0()); 

            }

             after(grammarAccess.getTreeDefinitionAccess().getTypeTreeKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeDefinition__TypeAssignment_0"


    // $ANTLR start "rule__TreeDefinition__NameAssignment_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4650:1: rule__TreeDefinition__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TreeDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4654:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4655:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4655:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4656:1: RULE_STRING
            {
             before(grammarAccess.getTreeDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TreeDefinition__NameAssignment_29337); 
             after(grammarAccess.getTreeDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeDefinition__NameAssignment_2"


    // $ANTLR start "rule__TreeDefinition__TextAssignment_4_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4665:1: rule__TreeDefinition__TextAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__TreeDefinition__TextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4669:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4670:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4670:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4671:1: RULE_STRING
            {
             before(grammarAccess.getTreeDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TreeDefinition__TextAssignment_4_19368); 
             after(grammarAccess.getTreeDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeDefinition__TextAssignment_4_1"


    // $ANTLR start "rule__TextfieldDefinition__TypeAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4680:1: rule__TextfieldDefinition__TypeAssignment_0 : ( ( 'Textfield' ) ) ;
    public final void rule__TextfieldDefinition__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4684:1: ( ( ( 'Textfield' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4685:1: ( ( 'Textfield' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4685:1: ( ( 'Textfield' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4686:1: ( 'Textfield' )
            {
             before(grammarAccess.getTextfieldDefinitionAccess().getTypeTextfieldKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4687:1: ( 'Textfield' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4688:1: 'Textfield'
            {
             before(grammarAccess.getTextfieldDefinitionAccess().getTypeTextfieldKeyword_0_0()); 
            match(input,42,FOLLOW_42_in_rule__TextfieldDefinition__TypeAssignment_09404); 
             after(grammarAccess.getTextfieldDefinitionAccess().getTypeTextfieldKeyword_0_0()); 

            }

             after(grammarAccess.getTextfieldDefinitionAccess().getTypeTextfieldKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldDefinition__TypeAssignment_0"


    // $ANTLR start "rule__TextfieldDefinition__NameAssignment_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4703:1: rule__TextfieldDefinition__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TextfieldDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4707:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4708:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4708:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4709:1: RULE_STRING
            {
             before(grammarAccess.getTextfieldDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TextfieldDefinition__NameAssignment_29443); 
             after(grammarAccess.getTextfieldDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldDefinition__NameAssignment_2"


    // $ANTLR start "rule__TextfieldDefinition__TextAssignment_4_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4718:1: rule__TextfieldDefinition__TextAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__TextfieldDefinition__TextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4722:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4723:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4723:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4724:1: RULE_STRING
            {
             before(grammarAccess.getTextfieldDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TextfieldDefinition__TextAssignment_4_19474); 
             after(grammarAccess.getTextfieldDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldDefinition__TextAssignment_4_1"


    // $ANTLR start "rule__ButtonDefinition__TypeAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4733:1: rule__ButtonDefinition__TypeAssignment_0 : ( ( 'Button' ) ) ;
    public final void rule__ButtonDefinition__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4737:1: ( ( ( 'Button' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4738:1: ( ( 'Button' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4738:1: ( ( 'Button' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4739:1: ( 'Button' )
            {
             before(grammarAccess.getButtonDefinitionAccess().getTypeButtonKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4740:1: ( 'Button' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4741:1: 'Button'
            {
             before(grammarAccess.getButtonDefinitionAccess().getTypeButtonKeyword_0_0()); 
            match(input,35,FOLLOW_35_in_rule__ButtonDefinition__TypeAssignment_09510); 
             after(grammarAccess.getButtonDefinitionAccess().getTypeButtonKeyword_0_0()); 

            }

             after(grammarAccess.getButtonDefinitionAccess().getTypeButtonKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonDefinition__TypeAssignment_0"


    // $ANTLR start "rule__ButtonDefinition__NameAssignment_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4756:1: rule__ButtonDefinition__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ButtonDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4760:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4761:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4761:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4762:1: RULE_STRING
            {
             before(grammarAccess.getButtonDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ButtonDefinition__NameAssignment_29549); 
             after(grammarAccess.getButtonDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonDefinition__NameAssignment_2"


    // $ANTLR start "rule__ButtonDefinition__PropertiesAssignment_3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4771:1: rule__ButtonDefinition__PropertiesAssignment_3 : ( ruleProperties ) ;
    public final void rule__ButtonDefinition__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4775:1: ( ( ruleProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4776:1: ( ruleProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4776:1: ( ruleProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4777:1: ruleProperties
            {
             before(grammarAccess.getButtonDefinitionAccess().getPropertiesPropertiesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleProperties_in_rule__ButtonDefinition__PropertiesAssignment_39580);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4786:1: rule__Properties__PropertyKeyAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Properties__PropertyKeyAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4790:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4791:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4791:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4792:1: RULE_STRING
            {
             before(grammarAccess.getPropertiesAccess().getPropertyKeySTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Properties__PropertyKeyAssignment_1_19611); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4801:1: rule__Properties__TextAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Properties__TextAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4805:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4806:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4806:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4807:1: RULE_STRING
            {
             before(grammarAccess.getPropertiesAccess().getTextSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Properties__TextAssignment_2_19642); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4816:1: rule__Properties__InteractiontypeAssignment_3_1 : ( ruleInteractiontype ) ;
    public final void rule__Properties__InteractiontypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4820:1: ( ( ruleInteractiontype ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4821:1: ( ruleInteractiontype )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4821:1: ( ruleInteractiontype )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4822:1: ruleInteractiontype
            {
             before(grammarAccess.getPropertiesAccess().getInteractiontypeInteractiontypeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleInteractiontype_in_rule__Properties__InteractiontypeAssignment_3_19673);
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


    // $ANTLR start "rule__LabelDefinition__TypeAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4831:1: rule__LabelDefinition__TypeAssignment_0 : ( ( 'Label' ) ) ;
    public final void rule__LabelDefinition__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4835:1: ( ( ( 'Label' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4836:1: ( ( 'Label' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4836:1: ( ( 'Label' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4837:1: ( 'Label' )
            {
             before(grammarAccess.getLabelDefinitionAccess().getTypeLabelKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4838:1: ( 'Label' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4839:1: 'Label'
            {
             before(grammarAccess.getLabelDefinitionAccess().getTypeLabelKeyword_0_0()); 
            match(input,36,FOLLOW_36_in_rule__LabelDefinition__TypeAssignment_09709); 
             after(grammarAccess.getLabelDefinitionAccess().getTypeLabelKeyword_0_0()); 

            }

             after(grammarAccess.getLabelDefinitionAccess().getTypeLabelKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelDefinition__TypeAssignment_0"


    // $ANTLR start "rule__LabelDefinition__NameAssignment_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4854:1: rule__LabelDefinition__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LabelDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4858:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4859:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4859:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4860:1: RULE_STRING
            {
             before(grammarAccess.getLabelDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LabelDefinition__NameAssignment_29748); 
             after(grammarAccess.getLabelDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelDefinition__NameAssignment_2"


    // $ANTLR start "rule__LabelDefinition__PropertiesAssignment_3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4869:1: rule__LabelDefinition__PropertiesAssignment_3 : ( ruleProperties ) ;
    public final void rule__LabelDefinition__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4873:1: ( ( ruleProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4874:1: ( ruleProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4874:1: ( ruleProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4875:1: ruleProperties
            {
             before(grammarAccess.getLabelDefinitionAccess().getPropertiesPropertiesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleProperties_in_rule__LabelDefinition__PropertiesAssignment_39779);
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
    public static final BitSet FOLLOW_ruleRefinement_in_entryRuleRefinement121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefinement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refinement__Group__0_in_ruleRefinement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentRefinement_in_entryRuleComponentRefinement181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentRefinement188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentRefinement__Alternatives_in_ruleComponentRefinement214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonRefinement_in_entryRuleButtonRefinement241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonRefinement248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__0_in_ruleButtonRefinement274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelRefinement_in_entryRuleLabelRefinement301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelRefinement308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__0_in_ruleLabelRefinement334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsedDescriptions_in_entryRuleUsedDescriptions421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsedDescriptions428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group__0_in_ruleUsedDescriptions454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAreaCount_in_entryRuleAreaCount481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAreaCount488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaCount__Group__0_in_ruleAreaCount514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0_in_ruleDefinition574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__0_in_ruleTypeDefinition634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIDescriptionImport_in_entryRuleUIDescriptionImport721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIDescriptionImport728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescriptionImport__DescriptionNameAssignment_in_ruleUIDescriptionImport754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexComponent_in_entryRuleComplexComponent781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexComponent788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiselection_in_ruleComplexComponent814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiselection_in_entryRuleMultiselection840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiselection847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiselection__Group__0_in_ruleMultiselection873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAreaAssignment_in_entryRuleAreaAssignment900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAreaAssignment907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Alternatives_in_ruleAreaAssignment933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDefinition_in_entryRuleComponentDefinition960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentDefinition967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentDefinition__Alternatives_in_ruleComponentDefinition993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckboxDefinition_in_entryRuleCheckboxDefinition1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckboxDefinition1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group__0_in_ruleCheckboxDefinition1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadioboxDefinition_in_entryRuleRadioboxDefinition1080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRadioboxDefinition1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group__0_in_ruleRadioboxDefinition1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableDefinition_in_entryRuleTableDefinition1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableDefinition1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__0_in_ruleTableDefinition1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreeDefinition_in_entryRuleTreeDefinition1200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTreeDefinition1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__0_in_ruleTreeDefinition1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfieldDefinition_in_entryRuleTextfieldDefinition1260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextfieldDefinition1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__0_in_ruleTextfieldDefinition1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonDefinition_in_entryRuleButtonDefinition1320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonDefinition1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__0_in_ruleButtonDefinition1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperties_in_entryRuleProperties1380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperties1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__Group__0_in_ruleProperties1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelDefinition_in_entryRuleLabelDefinition1440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelDefinition1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__0_in_ruleLabelDefinition1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractiontype_in_entryRuleInteractiontype1500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractiontype1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interactiontype__Alternatives_in_ruleInteractiontype1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelRefinement_in_rule__ComponentRefinement__Alternatives1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonRefinement_in_rule__ComponentRefinement__Alternatives1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIDescriptionImport_in_rule__UsedDescriptions__DescriptionAlternatives_1_01618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexComponent_in_rule__UsedDescriptions__DescriptionAlternatives_1_01635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Type__Alternatives1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Type__Alternatives1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_0__0_in_rule__AreaAssignment__Alternatives1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_1__0_in_rule__AreaAssignment__Alternatives1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelDefinition_in_rule__ComponentDefinition__Alternatives1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonDefinition_in_rule__ComponentDefinition__Alternatives1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfieldDefinition_in_rule__ComponentDefinition__Alternatives1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreeDefinition_in_rule__ComponentDefinition__Alternatives1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableDefinition_in_rule__ComponentDefinition__Alternatives1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadioboxDefinition_in_rule__ComponentDefinition__Alternatives1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckboxDefinition_in_rule__ComponentDefinition__Alternatives1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Interactiontype__Alternatives1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Interactiontype__Alternatives1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__0__Impl_in_rule__UIDescription__Group__01960 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__1_in_rule__UIDescription__Group__01963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__AreaCountAssignment_0_in_rule__UIDescription__Group__0__Impl1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__1__Impl_in_rule__UIDescription__Group__12020 = new BitSet(new long[]{0x00000000084C8010L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__2_in_rule__UIDescription__Group__12023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__TypeDefinitionAssignment_1_in_rule__UIDescription__Group__1__Impl2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__2__Impl_in_rule__UIDescription__Group__22080 = new BitSet(new long[]{0x00000000084C8010L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__3_in_rule__UIDescription__Group__22083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__PropertyAssignment_2_in_rule__UIDescription__Group__2__Impl2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__3__Impl_in_rule__UIDescription__Group__32141 = new BitSet(new long[]{0x00000000084C8010L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__4_in_rule__UIDescription__Group__32144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__UsedDescriptionsAssignment_3_in_rule__UIDescription__Group__3__Impl2171 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__4__Impl_in_rule__UIDescription__Group__42202 = new BitSet(new long[]{0x00000000084C8010L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__5_in_rule__UIDescription__Group__42205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__RefinementsAssignment_4_in_rule__UIDescription__Group__4__Impl2232 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__5__Impl_in_rule__UIDescription__Group__52263 = new BitSet(new long[]{0x00000000084C8010L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__6_in_rule__UIDescription__Group__52266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__DefinitionsAssignment_5_in_rule__UIDescription__Group__5__Impl2293 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__6__Impl_in_rule__UIDescription__Group__62324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__AreasAssignment_6_in_rule__UIDescription__Group__6__Impl2351 = new BitSet(new long[]{0x0000000008000012L});
    public static final BitSet FOLLOW_rule__Refinement__Group__0__Impl_in_rule__Refinement__Group__02396 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_rule__Refinement__Group__1_in_rule__Refinement__Group__02399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Refinement__Group__0__Impl2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refinement__Group__1__Impl_in_rule__Refinement__Group__12458 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Refinement__Group__2_in_rule__Refinement__Group__12461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refinement__ConcreteRefinementAssignment_1_in_rule__Refinement__Group__1__Impl2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refinement__Group__2__Impl_in_rule__Refinement__Group__22518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Refinement__Group__2__Impl2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__0__Impl_in_rule__ButtonRefinement__Group__02583 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__1_in_rule__ButtonRefinement__Group__02586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__TypeAssignment_0_in_rule__ButtonRefinement__Group__0__Impl2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__1__Impl_in_rule__ButtonRefinement__Group__12643 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__2_in_rule__ButtonRefinement__Group__12646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ButtonRefinement__Group__1__Impl2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__2__Impl_in_rule__ButtonRefinement__Group__22705 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__3_in_rule__ButtonRefinement__Group__22708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__NameAssignment_2_in_rule__ButtonRefinement__Group__2__Impl2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__3__Impl_in_rule__ButtonRefinement__Group__32765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__PropertiesAssignment_3_in_rule__ButtonRefinement__Group__3__Impl2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__0__Impl_in_rule__LabelRefinement__Group__02831 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__1_in_rule__LabelRefinement__Group__02834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__TypeAssignment_0_in_rule__LabelRefinement__Group__0__Impl2861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__1__Impl_in_rule__LabelRefinement__Group__12891 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__2_in_rule__LabelRefinement__Group__12894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__LabelRefinement__Group__1__Impl2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__2__Impl_in_rule__LabelRefinement__Group__22953 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__3_in_rule__LabelRefinement__Group__22956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__NameAssignment_2_in_rule__LabelRefinement__Group__2__Impl2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__3__Impl_in_rule__LabelRefinement__Group__33013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__PropertiesAssignment_3_in_rule__LabelRefinement__Group__3__Impl3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__03079 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__03082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Property__Group__0__Impl3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__13141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__PropertiesFileAssignment_1_in_rule__Property__Group__1__Impl3168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group__0__Impl_in_rule__UsedDescriptions__Group__03202 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group__1_in_rule__UsedDescriptions__Group__03205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__UsedDescriptions__Group__0__Impl3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group__1__Impl_in_rule__UsedDescriptions__Group__13264 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group__2_in_rule__UsedDescriptions__Group__13267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__DescriptionAssignment_1_in_rule__UsedDescriptions__Group__1__Impl3294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group__2__Impl_in_rule__UsedDescriptions__Group__23324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group_2__0_in_rule__UsedDescriptions__Group__2__Impl3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group_2__0__Impl_in_rule__UsedDescriptions__Group_2__03388 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group_2__1_in_rule__UsedDescriptions__Group_2__03391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__UsedDescriptions__Group_2__0__Impl3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group_2__1__Impl_in_rule__UsedDescriptions__Group_2__13450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__LocalNameAssignment_2_1_in_rule__UsedDescriptions__Group_2__1__Impl3477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaCount__Group__0__Impl_in_rule__AreaCount__Group__03511 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AreaCount__Group__1_in_rule__AreaCount__Group__03514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__AreaCount__Group__0__Impl3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaCount__Group__1__Impl_in_rule__AreaCount__Group__13573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaCount__AreaCountAssignment_1_in_rule__AreaCount__Group__1__Impl3600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__03634 = new BitSet(new long[]{0x000007D800000000L});
    public static final BitSet FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__03637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Definition__Group__0__Impl3665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__13696 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__13699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__ConcreteDefitionAssignment_1_in_rule__Definition__Group__1__Impl3726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__23756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Definition__Group__2__Impl3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__0__Impl_in_rule__TypeDefinition__Group__03821 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__1_in_rule__TypeDefinition__Group__03824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TypeDefinition__Group__0__Impl3852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__1__Impl_in_rule__TypeDefinition__Group__13883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__TypeAssignment_1_in_rule__TypeDefinition__Group__1__Impl3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiselection__Group__0__Impl_in_rule__Multiselection__Group__03944 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Multiselection__Group__1_in_rule__Multiselection__Group__03947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiselection__DescriptionNameAssignment_0_in_rule__Multiselection__Group__0__Impl3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiselection__Group__1__Impl_in_rule__Multiselection__Group__14004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiselection__Group_1__0_in_rule__Multiselection__Group__1__Impl4031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiselection__Group_1__0__Impl_in_rule__Multiselection__Group_1__04066 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Multiselection__Group_1__1_in_rule__Multiselection__Group_1__04069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Multiselection__Group_1__0__Impl4097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiselection__Group_1__1__Impl_in_rule__Multiselection__Group_1__14128 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Multiselection__Group_1__2_in_rule__Multiselection__Group_1__14131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiselection__InputTypeAssignment_1_1_in_rule__Multiselection__Group_1__1__Impl4158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiselection__Group_1__2__Impl_in_rule__Multiselection__Group_1__24188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Multiselection__Group_1__2__Impl4216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_0__0__Impl_in_rule__AreaAssignment__Group_0__04253 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_0__1_in_rule__AreaAssignment__Group_0__04256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__AreaAssignment__Group_0__0__Impl4284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_0__1__Impl_in_rule__AreaAssignment__Group_0__14315 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_0__2_in_rule__AreaAssignment__Group_0__14318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__AreaAssignment_0_1_in_rule__AreaAssignment__Group_0__1__Impl4345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_0__2__Impl_in_rule__AreaAssignment__Group_0__24375 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_0__3_in_rule__AreaAssignment__Group_0__24378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__AreaAssignment__Group_0__2__Impl4406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_0__3__Impl_in_rule__AreaAssignment__Group_0__34437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__ElementsAssignment_0_3_in_rule__AreaAssignment__Group_0__3__Impl4466 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__AreaAssignment__ElementsAssignment_0_3_in_rule__AreaAssignment__Group_0__3__Impl4478 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_1__0__Impl_in_rule__AreaAssignment__Group_1__04519 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_1__1_in_rule__AreaAssignment__Group_1__04522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__ElementsAssignment_1_0_in_rule__AreaAssignment__Group_1__0__Impl4551 = new BitSet(new long[]{0x0000000008000012L});
    public static final BitSet FOLLOW_rule__AreaAssignment__ElementsAssignment_1_0_in_rule__AreaAssignment__Group_1__0__Impl4563 = new BitSet(new long[]{0x0000000008000012L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_1__1__Impl_in_rule__AreaAssignment__Group_1__14596 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_1__2_in_rule__AreaAssignment__Group_1__14599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__AreaAssignment__Group_1__1__Impl4627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_1__2__Impl_in_rule__AreaAssignment__Group_1__24658 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_1__3_in_rule__AreaAssignment__Group_1__24661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__AreaAssignment__Group_1__2__Impl4689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_1__3__Impl_in_rule__AreaAssignment__Group_1__34720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__AreaAssignment_1_3_in_rule__AreaAssignment__Group_1__3__Impl4747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group__0__Impl_in_rule__CheckboxDefinition__Group__04785 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group__1_in_rule__CheckboxDefinition__Group__04788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__TypeAssignment_0_in_rule__CheckboxDefinition__Group__0__Impl4815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group__1__Impl_in_rule__CheckboxDefinition__Group__14845 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group__2_in_rule__CheckboxDefinition__Group__14848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__CheckboxDefinition__Group__1__Impl4876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group__2__Impl_in_rule__CheckboxDefinition__Group__24907 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group__3_in_rule__CheckboxDefinition__Group__24910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__NameAssignment_2_in_rule__CheckboxDefinition__Group__2__Impl4937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group__3__Impl_in_rule__CheckboxDefinition__Group__34967 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group__4_in_rule__CheckboxDefinition__Group__34970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__CheckboxDefinition__Group__3__Impl4998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group__4__Impl_in_rule__CheckboxDefinition__Group__45029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group_4__0_in_rule__CheckboxDefinition__Group__4__Impl5056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group_4__0__Impl_in_rule__CheckboxDefinition__Group_4__05097 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group_4__1_in_rule__CheckboxDefinition__Group_4__05100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__CheckboxDefinition__Group_4__0__Impl5128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group_4__1__Impl_in_rule__CheckboxDefinition__Group_4__15159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__TextAssignment_4_1_in_rule__CheckboxDefinition__Group_4__1__Impl5186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group__0__Impl_in_rule__RadioboxDefinition__Group__05220 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group__1_in_rule__RadioboxDefinition__Group__05223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__TypeAssignment_0_in_rule__RadioboxDefinition__Group__0__Impl5250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group__1__Impl_in_rule__RadioboxDefinition__Group__15280 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group__2_in_rule__RadioboxDefinition__Group__15283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__RadioboxDefinition__Group__1__Impl5311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group__2__Impl_in_rule__RadioboxDefinition__Group__25342 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group__3_in_rule__RadioboxDefinition__Group__25345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__NameAssignment_2_in_rule__RadioboxDefinition__Group__2__Impl5372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group__3__Impl_in_rule__RadioboxDefinition__Group__35402 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group__4_in_rule__RadioboxDefinition__Group__35405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__RadioboxDefinition__Group__3__Impl5433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group__4__Impl_in_rule__RadioboxDefinition__Group__45464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group_4__0_in_rule__RadioboxDefinition__Group__4__Impl5491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group_4__0__Impl_in_rule__RadioboxDefinition__Group_4__05532 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group_4__1_in_rule__RadioboxDefinition__Group_4__05535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__RadioboxDefinition__Group_4__0__Impl5563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group_4__1__Impl_in_rule__RadioboxDefinition__Group_4__15594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__TextAssignment_4_1_in_rule__RadioboxDefinition__Group_4__1__Impl5621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__0__Impl_in_rule__TableDefinition__Group__05655 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__1_in_rule__TableDefinition__Group__05658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__TypeAssignment_0_in_rule__TableDefinition__Group__0__Impl5685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__1__Impl_in_rule__TableDefinition__Group__15715 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__2_in_rule__TableDefinition__Group__15718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__TableDefinition__Group__1__Impl5746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__2__Impl_in_rule__TableDefinition__Group__25777 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__3_in_rule__TableDefinition__Group__25780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__NameAssignment_2_in_rule__TableDefinition__Group__2__Impl5807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__3__Impl_in_rule__TableDefinition__Group__35837 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__4_in_rule__TableDefinition__Group__35840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TableDefinition__Group__3__Impl5868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__4__Impl_in_rule__TableDefinition__Group__45899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group_4__0_in_rule__TableDefinition__Group__4__Impl5926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group_4__0__Impl_in_rule__TableDefinition__Group_4__05967 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group_4__1_in_rule__TableDefinition__Group_4__05970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TableDefinition__Group_4__0__Impl5998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group_4__1__Impl_in_rule__TableDefinition__Group_4__16029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__TextAssignment_4_1_in_rule__TableDefinition__Group_4__1__Impl6056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__0__Impl_in_rule__TreeDefinition__Group__06090 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__1_in_rule__TreeDefinition__Group__06093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__TypeAssignment_0_in_rule__TreeDefinition__Group__0__Impl6120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__1__Impl_in_rule__TreeDefinition__Group__16150 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__2_in_rule__TreeDefinition__Group__16153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__TreeDefinition__Group__1__Impl6181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__2__Impl_in_rule__TreeDefinition__Group__26212 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__3_in_rule__TreeDefinition__Group__26215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__NameAssignment_2_in_rule__TreeDefinition__Group__2__Impl6242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__3__Impl_in_rule__TreeDefinition__Group__36272 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__4_in_rule__TreeDefinition__Group__36275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TreeDefinition__Group__3__Impl6303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__4__Impl_in_rule__TreeDefinition__Group__46334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group_4__0_in_rule__TreeDefinition__Group__4__Impl6361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group_4__0__Impl_in_rule__TreeDefinition__Group_4__06402 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group_4__1_in_rule__TreeDefinition__Group_4__06405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TreeDefinition__Group_4__0__Impl6433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group_4__1__Impl_in_rule__TreeDefinition__Group_4__16464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__TextAssignment_4_1_in_rule__TreeDefinition__Group_4__1__Impl6491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__0__Impl_in_rule__TextfieldDefinition__Group__06525 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__1_in_rule__TextfieldDefinition__Group__06528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__TypeAssignment_0_in_rule__TextfieldDefinition__Group__0__Impl6555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__1__Impl_in_rule__TextfieldDefinition__Group__16585 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__2_in_rule__TextfieldDefinition__Group__16588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__TextfieldDefinition__Group__1__Impl6616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__2__Impl_in_rule__TextfieldDefinition__Group__26647 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__3_in_rule__TextfieldDefinition__Group__26650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__NameAssignment_2_in_rule__TextfieldDefinition__Group__2__Impl6677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__3__Impl_in_rule__TextfieldDefinition__Group__36707 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__4_in_rule__TextfieldDefinition__Group__36710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TextfieldDefinition__Group__3__Impl6738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__4__Impl_in_rule__TextfieldDefinition__Group__46769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group_4__0_in_rule__TextfieldDefinition__Group__4__Impl6796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group_4__0__Impl_in_rule__TextfieldDefinition__Group_4__06837 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group_4__1_in_rule__TextfieldDefinition__Group_4__06840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TextfieldDefinition__Group_4__0__Impl6868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group_4__1__Impl_in_rule__TextfieldDefinition__Group_4__16899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__TextAssignment_4_1_in_rule__TextfieldDefinition__Group_4__1__Impl6926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__0__Impl_in_rule__ButtonDefinition__Group__06960 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__1_in_rule__ButtonDefinition__Group__06963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__TypeAssignment_0_in_rule__ButtonDefinition__Group__0__Impl6990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__1__Impl_in_rule__ButtonDefinition__Group__17020 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__2_in_rule__ButtonDefinition__Group__17023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ButtonDefinition__Group__1__Impl7051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__2__Impl_in_rule__ButtonDefinition__Group__27082 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__3_in_rule__ButtonDefinition__Group__27085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__NameAssignment_2_in_rule__ButtonDefinition__Group__2__Impl7112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__3__Impl_in_rule__ButtonDefinition__Group__37142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__PropertiesAssignment_3_in_rule__ButtonDefinition__Group__3__Impl7169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__Group__0__Impl_in_rule__Properties__Group__07208 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_rule__Properties__Group__1_in_rule__Properties__Group__07211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Properties__Group__0__Impl7239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__Group__1__Impl_in_rule__Properties__Group__17270 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_rule__Properties__Group__2_in_rule__Properties__Group__17273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__Group_1__0_in_rule__Properties__Group__1__Impl7300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__Group__2__Impl_in_rule__Properties__Group__27331 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_rule__Properties__Group__3_in_rule__Properties__Group__27334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__Group_2__0_in_rule__Properties__Group__2__Impl7361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__Group__3__Impl_in_rule__Properties__Group__37392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__Group_3__0_in_rule__Properties__Group__3__Impl7419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__Group_1__0__Impl_in_rule__Properties__Group_1__07458 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Properties__Group_1__1_in_rule__Properties__Group_1__07461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Properties__Group_1__0__Impl7489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__Group_1__1__Impl_in_rule__Properties__Group_1__17520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__PropertyKeyAssignment_1_1_in_rule__Properties__Group_1__1__Impl7547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__Group_2__0__Impl_in_rule__Properties__Group_2__07581 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Properties__Group_2__1_in_rule__Properties__Group_2__07584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Properties__Group_2__0__Impl7612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__Group_2__1__Impl_in_rule__Properties__Group_2__17643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__TextAssignment_2_1_in_rule__Properties__Group_2__1__Impl7670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__Group_3__0__Impl_in_rule__Properties__Group_3__07704 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Properties__Group_3__1_in_rule__Properties__Group_3__07707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Properties__Group_3__0__Impl7735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__Group_3__1__Impl_in_rule__Properties__Group_3__17766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__InteractiontypeAssignment_3_1_in_rule__Properties__Group_3__1__Impl7795 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_rule__Properties__InteractiontypeAssignment_3_1_in_rule__Properties__Group_3__1__Impl7807 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__0__Impl_in_rule__LabelDefinition__Group__07844 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__1_in_rule__LabelDefinition__Group__07847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__TypeAssignment_0_in_rule__LabelDefinition__Group__0__Impl7874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__1__Impl_in_rule__LabelDefinition__Group__17904 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__2_in_rule__LabelDefinition__Group__17907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__LabelDefinition__Group__1__Impl7935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__2__Impl_in_rule__LabelDefinition__Group__27966 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__3_in_rule__LabelDefinition__Group__27969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__NameAssignment_2_in_rule__LabelDefinition__Group__2__Impl7996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__3__Impl_in_rule__LabelDefinition__Group__38026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__PropertiesAssignment_3_in_rule__LabelDefinition__Group__3__Impl8053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAreaCount_in_rule__UIDescription__AreaCountAssignment_08097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_rule__UIDescription__TypeDefinitionAssignment_18128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__UIDescription__PropertyAssignment_28159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsedDescriptions_in_rule__UIDescription__UsedDescriptionsAssignment_38190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefinement_in_rule__UIDescription__RefinementsAssignment_48221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_rule__UIDescription__DefinitionsAssignment_58252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAreaAssignment_in_rule__UIDescription__AreasAssignment_68283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentRefinement_in_rule__Refinement__ConcreteRefinementAssignment_18314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ButtonRefinement__TypeAssignment_08350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ButtonRefinement__NameAssignment_28389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperties_in_rule__ButtonRefinement__PropertiesAssignment_38420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__LabelRefinement__TypeAssignment_08456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__LabelRefinement__NameAssignment_28495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperties_in_rule__LabelRefinement__PropertiesAssignment_38526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Property__PropertiesFileAssignment_18557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__DescriptionAlternatives_1_0_in_rule__UsedDescriptions__DescriptionAssignment_18588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__UsedDescriptions__LocalNameAssignment_2_18621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AreaCount__AreaCountAssignment_18652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDefinition_in_rule__Definition__ConcreteDefitionAssignment_18683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__TypeDefinition__TypeAssignment_18714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__UIDescriptionImport__DescriptionNameAssignment8745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Multiselection__DescriptionNameAssignment_08781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Multiselection__InputTypeAssignment_1_18820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AreaAssignment__AreaAssignment_0_18851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AreaAssignment__ElementsAssignment_0_38882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AreaAssignment__ElementsAssignment_1_08913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AreaAssignment__AreaAssignment_1_38944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__CheckboxDefinition__TypeAssignment_08980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CheckboxDefinition__NameAssignment_29019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CheckboxDefinition__TextAssignment_4_19050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__RadioboxDefinition__TypeAssignment_09086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RadioboxDefinition__NameAssignment_29125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RadioboxDefinition__TextAssignment_4_19156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__TableDefinition__TypeAssignment_09192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TableDefinition__NameAssignment_29231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TableDefinition__TextAssignment_4_19262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__TreeDefinition__TypeAssignment_09298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TreeDefinition__NameAssignment_29337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TreeDefinition__TextAssignment_4_19368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__TextfieldDefinition__TypeAssignment_09404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TextfieldDefinition__NameAssignment_29443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TextfieldDefinition__TextAssignment_4_19474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ButtonDefinition__TypeAssignment_09510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ButtonDefinition__NameAssignment_29549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperties_in_rule__ButtonDefinition__PropertiesAssignment_39580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Properties__PropertyKeyAssignment_1_19611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Properties__TextAssignment_2_19642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractiontype_in_rule__Properties__InteractiontypeAssignment_3_19673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__LabelDefinition__TypeAssignment_09709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__LabelDefinition__NameAssignment_29748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperties_in_rule__LabelDefinition__PropertiesAssignment_39779 = new BitSet(new long[]{0x0000000000000002L});

}