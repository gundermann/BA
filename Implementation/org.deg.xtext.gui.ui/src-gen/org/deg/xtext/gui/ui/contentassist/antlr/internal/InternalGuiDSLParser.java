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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGuiDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Text'", "'CLICK'", "'WINDOW'", "'INNERCOMPLEX'", "'inputType='", "' as '", "'use: '", "'Area count: '", "'DEF '", "'END DEF'", "'type: '", "' As: '", "'Area:'", "'<-'", "'->'", "'selectableValues='", "'selectedValues='", "':'", "'text='", "'interaction='", "' type='", "' with actions:'", "'type='", "'element='", "'='", "'MultiSelection'", "'Checkbox'", "'Radiobox'", "'Table'", "'Tree'", "'Textfield'", "'Button'", "'Label'", "'UiAction'"
    };
    public static final int RULE_ID=6;
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
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
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
    public static final int RULE_WS=9;

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
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionRule()); 
            }
            pushFollow(FOLLOW_ruleUIDescription_in_entryRuleUIDescription61);
            ruleUIDescription();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDescriptionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIDescription68); if (state.failed) return ;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:69:1: ruleUIDescription : ( ( rule__UIDescription__UnorderedGroup ) ) ;
    public final void ruleUIDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:73:2: ( ( ( rule__UIDescription__UnorderedGroup ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:74:1: ( ( rule__UIDescription__UnorderedGroup ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:74:1: ( ( rule__UIDescription__UnorderedGroup ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:75:1: ( rule__UIDescription__UnorderedGroup )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getUnorderedGroup()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:76:1: ( rule__UIDescription__UnorderedGroup )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:76:2: rule__UIDescription__UnorderedGroup
            {
            pushFollow(FOLLOW_rule__UIDescription__UnorderedGroup_in_ruleUIDescription94);
            rule__UIDescription__UnorderedGroup();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDescriptionAccess().getUnorderedGroup()); 
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
    // $ANTLR end "ruleUIDescription"


    // $ANTLR start "entryRuleinputType"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:88:1: entryRuleinputType : ruleinputType EOF ;
    public final void entryRuleinputType() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:89:1: ( ruleinputType EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:90:1: ruleinputType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputTypeRule()); 
            }
            pushFollow(FOLLOW_ruleinputType_in_entryRuleinputType121);
            ruleinputType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleinputType128); if (state.failed) return ;

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
    // $ANTLR end "entryRuleinputType"


    // $ANTLR start "ruleinputType"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:97:1: ruleinputType : ( ( rule__InputType__Group__0 ) ) ;
    public final void ruleinputType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:101:2: ( ( ( rule__InputType__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:102:1: ( ( rule__InputType__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:102:1: ( ( rule__InputType__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:103:1: ( rule__InputType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputTypeAccess().getGroup()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:104:1: ( rule__InputType__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:104:2: rule__InputType__Group__0
            {
            pushFollow(FOLLOW_rule__InputType__Group__0_in_ruleinputType154);
            rule__InputType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputTypeAccess().getGroup()); 
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
    // $ANTLR end "ruleinputType"


    // $ANTLR start "entryRuleUsedDescriptions"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:116:1: entryRuleUsedDescriptions : ruleUsedDescriptions EOF ;
    public final void entryRuleUsedDescriptions() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:117:1: ( ruleUsedDescriptions EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:118:1: ruleUsedDescriptions EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUsedDescriptionsRule()); 
            }
            pushFollow(FOLLOW_ruleUsedDescriptions_in_entryRuleUsedDescriptions181);
            ruleUsedDescriptions();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUsedDescriptionsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsedDescriptions188); if (state.failed) return ;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:125:1: ruleUsedDescriptions : ( ( rule__UsedDescriptions__Group__0 ) ) ;
    public final void ruleUsedDescriptions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:129:2: ( ( ( rule__UsedDescriptions__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:130:1: ( ( rule__UsedDescriptions__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:130:1: ( ( rule__UsedDescriptions__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:131:1: ( rule__UsedDescriptions__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUsedDescriptionsAccess().getGroup()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:132:1: ( rule__UsedDescriptions__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:132:2: rule__UsedDescriptions__Group__0
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__Group__0_in_ruleUsedDescriptions214);
            rule__UsedDescriptions__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUsedDescriptionsAccess().getGroup()); 
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
    // $ANTLR end "ruleUsedDescriptions"


    // $ANTLR start "entryRuleAreaCount"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:144:1: entryRuleAreaCount : ruleAreaCount EOF ;
    public final void entryRuleAreaCount() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:145:1: ( ruleAreaCount EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:146:1: ruleAreaCount EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaCountRule()); 
            }
            pushFollow(FOLLOW_ruleAreaCount_in_entryRuleAreaCount241);
            ruleAreaCount();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaCountRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAreaCount248); if (state.failed) return ;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:153:1: ruleAreaCount : ( ( rule__AreaCount__Group__0 ) ) ;
    public final void ruleAreaCount() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:157:2: ( ( ( rule__AreaCount__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:158:1: ( ( rule__AreaCount__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:158:1: ( ( rule__AreaCount__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:159:1: ( rule__AreaCount__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaCountAccess().getGroup()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:160:1: ( rule__AreaCount__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:160:2: rule__AreaCount__Group__0
            {
            pushFollow(FOLLOW_rule__AreaCount__Group__0_in_ruleAreaCount274);
            rule__AreaCount__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaCountAccess().getGroup()); 
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
    // $ANTLR end "ruleAreaCount"


    // $ANTLR start "entryRuleDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:172:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:173:1: ( ruleDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:174:1: ruleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition301);
            ruleDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition308); if (state.failed) return ;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:181:1: ruleDefinition : ( ( rule__Definition__Group__0 ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:185:2: ( ( ( rule__Definition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:186:1: ( ( rule__Definition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:186:1: ( ( rule__Definition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:187:1: ( rule__Definition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getGroup()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:188:1: ( rule__Definition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:188:2: rule__Definition__Group__0
            {
            pushFollow(FOLLOW_rule__Definition__Group__0_in_ruleDefinition334);
            rule__Definition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getGroup()); 
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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleTypeDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:200:1: entryRuleTypeDefinition : ruleTypeDefinition EOF ;
    public final void entryRuleTypeDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:201:1: ( ruleTypeDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:202:1: ruleTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition361);
            ruleTypeDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinition368); if (state.failed) return ;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:209:1: ruleTypeDefinition : ( ( rule__TypeDefinition__Group__0 ) ) ;
    public final void ruleTypeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:213:2: ( ( ( rule__TypeDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:214:1: ( ( rule__TypeDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:214:1: ( ( rule__TypeDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:215:1: ( rule__TypeDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDefinitionAccess().getGroup()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:216:1: ( rule__TypeDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:216:2: rule__TypeDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Group__0_in_ruleTypeDefinition394);
            rule__TypeDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDefinitionAccess().getGroup()); 
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
    // $ANTLR end "ruleTypeDefinition"


    // $ANTLR start "entryRuleTYPE"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:228:1: entryRuleTYPE : ruleTYPE EOF ;
    public final void entryRuleTYPE() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:229:1: ( ruleTYPE EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:230:1: ruleTYPE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTYPERule()); 
            }
            pushFollow(FOLLOW_ruleTYPE_in_entryRuleTYPE421);
            ruleTYPE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTYPERule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTYPE428); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTYPE"


    // $ANTLR start "ruleTYPE"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:237:1: ruleTYPE : ( ( rule__TYPE__Alternatives ) ) ;
    public final void ruleTYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:241:2: ( ( ( rule__TYPE__Alternatives ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:242:1: ( ( rule__TYPE__Alternatives ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:242:1: ( ( rule__TYPE__Alternatives ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:243:1: ( rule__TYPE__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTYPEAccess().getAlternatives()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:244:1: ( rule__TYPE__Alternatives )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:244:2: rule__TYPE__Alternatives
            {
            pushFollow(FOLLOW_rule__TYPE__Alternatives_in_ruleTYPE454);
            rule__TYPE__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTYPEAccess().getAlternatives()); 
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
    // $ANTLR end "ruleTYPE"


    // $ANTLR start "entryRuleUIDescriptionImport"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:256:1: entryRuleUIDescriptionImport : ruleUIDescriptionImport EOF ;
    public final void entryRuleUIDescriptionImport() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:257:1: ( ruleUIDescriptionImport EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:258:1: ruleUIDescriptionImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionImportRule()); 
            }
            pushFollow(FOLLOW_ruleUIDescriptionImport_in_entryRuleUIDescriptionImport481);
            ruleUIDescriptionImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDescriptionImportRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIDescriptionImport488); if (state.failed) return ;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:265:1: ruleUIDescriptionImport : ( ( rule__UIDescriptionImport__Group__0 ) ) ;
    public final void ruleUIDescriptionImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:269:2: ( ( ( rule__UIDescriptionImport__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:270:1: ( ( rule__UIDescriptionImport__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:270:1: ( ( rule__UIDescriptionImport__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:271:1: ( rule__UIDescriptionImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionImportAccess().getGroup()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:272:1: ( rule__UIDescriptionImport__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:272:2: rule__UIDescriptionImport__Group__0
            {
            pushFollow(FOLLOW_rule__UIDescriptionImport__Group__0_in_ruleUIDescriptionImport514);
            rule__UIDescriptionImport__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDescriptionImportAccess().getGroup()); 
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
    // $ANTLR end "ruleUIDescriptionImport"


    // $ANTLR start "entryRuleAreaAssignment"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:284:1: entryRuleAreaAssignment : ruleAreaAssignment EOF ;
    public final void entryRuleAreaAssignment() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:285:1: ( ruleAreaAssignment EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:286:1: ruleAreaAssignment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAreaAssignment_in_entryRuleAreaAssignment541);
            ruleAreaAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAreaAssignment548); if (state.failed) return ;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:293:1: ruleAreaAssignment : ( ( rule__AreaAssignment__Alternatives ) ) ;
    public final void ruleAreaAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:297:2: ( ( ( rule__AreaAssignment__Alternatives ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:298:1: ( ( rule__AreaAssignment__Alternatives ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:298:1: ( ( rule__AreaAssignment__Alternatives ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:299:1: ( rule__AreaAssignment__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAssignmentAccess().getAlternatives()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:300:1: ( rule__AreaAssignment__Alternatives )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:300:2: rule__AreaAssignment__Alternatives
            {
            pushFollow(FOLLOW_rule__AreaAssignment__Alternatives_in_ruleAreaAssignment574);
            rule__AreaAssignment__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAssignmentAccess().getAlternatives()); 
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
    // $ANTLR end "ruleAreaAssignment"


    // $ANTLR start "entryRuleComponentDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:312:1: entryRuleComponentDefinition : ruleComponentDefinition EOF ;
    public final void entryRuleComponentDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:313:1: ( ruleComponentDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:314:1: ruleComponentDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleComponentDefinition_in_entryRuleComponentDefinition601);
            ruleComponentDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentDefinition608); if (state.failed) return ;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:321:1: ruleComponentDefinition : ( ( rule__ComponentDefinition__Alternatives ) ) ;
    public final void ruleComponentDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:325:2: ( ( ( rule__ComponentDefinition__Alternatives ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:326:1: ( ( rule__ComponentDefinition__Alternatives ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:326:1: ( ( rule__ComponentDefinition__Alternatives ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:327:1: ( rule__ComponentDefinition__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentDefinitionAccess().getAlternatives()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:328:1: ( rule__ComponentDefinition__Alternatives )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:328:2: rule__ComponentDefinition__Alternatives
            {
            pushFollow(FOLLOW_rule__ComponentDefinition__Alternatives_in_ruleComponentDefinition634);
            rule__ComponentDefinition__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentDefinitionAccess().getAlternatives()); 
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
    // $ANTLR end "ruleComponentDefinition"


    // $ANTLR start "entryRuleMultiSelectionDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:340:1: entryRuleMultiSelectionDefinition : ruleMultiSelectionDefinition EOF ;
    public final void entryRuleMultiSelectionDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:341:1: ( ruleMultiSelectionDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:342:1: ruleMultiSelectionDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiSelectionDefinition_in_entryRuleMultiSelectionDefinition661);
            ruleMultiSelectionDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiSelectionDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiSelectionDefinition668); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMultiSelectionDefinition"


    // $ANTLR start "ruleMultiSelectionDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:349:1: ruleMultiSelectionDefinition : ( ( rule__MultiSelectionDefinition__Group__0 ) ) ;
    public final void ruleMultiSelectionDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:353:2: ( ( ( rule__MultiSelectionDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:354:1: ( ( rule__MultiSelectionDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:354:1: ( ( rule__MultiSelectionDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:355:1: ( rule__MultiSelectionDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getGroup()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:356:1: ( rule__MultiSelectionDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:356:2: rule__MultiSelectionDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group__0_in_ruleMultiSelectionDefinition694);
            rule__MultiSelectionDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiSelectionDefinitionAccess().getGroup()); 
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
    // $ANTLR end "ruleMultiSelectionDefinition"


    // $ANTLR start "entryRuleCheckboxDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:368:1: entryRuleCheckboxDefinition : ruleCheckboxDefinition EOF ;
    public final void entryRuleCheckboxDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:369:1: ( ruleCheckboxDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:370:1: ruleCheckboxDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckboxDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleCheckboxDefinition_in_entryRuleCheckboxDefinition721);
            ruleCheckboxDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCheckboxDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckboxDefinition728); if (state.failed) return ;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:377:1: ruleCheckboxDefinition : ( ( rule__CheckboxDefinition__Group__0 ) ) ;
    public final void ruleCheckboxDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:381:2: ( ( ( rule__CheckboxDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:382:1: ( ( rule__CheckboxDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:382:1: ( ( rule__CheckboxDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:383:1: ( rule__CheckboxDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckboxDefinitionAccess().getGroup()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:384:1: ( rule__CheckboxDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:384:2: rule__CheckboxDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__CheckboxDefinition__Group__0_in_ruleCheckboxDefinition754);
            rule__CheckboxDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCheckboxDefinitionAccess().getGroup()); 
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
    // $ANTLR end "ruleCheckboxDefinition"


    // $ANTLR start "entryRuleRadioboxDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:396:1: entryRuleRadioboxDefinition : ruleRadioboxDefinition EOF ;
    public final void entryRuleRadioboxDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:397:1: ( ruleRadioboxDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:398:1: ruleRadioboxDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRadioboxDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleRadioboxDefinition_in_entryRuleRadioboxDefinition781);
            ruleRadioboxDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRadioboxDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRadioboxDefinition788); if (state.failed) return ;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:405:1: ruleRadioboxDefinition : ( ( rule__RadioboxDefinition__Group__0 ) ) ;
    public final void ruleRadioboxDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:409:2: ( ( ( rule__RadioboxDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:410:1: ( ( rule__RadioboxDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:410:1: ( ( rule__RadioboxDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:411:1: ( rule__RadioboxDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRadioboxDefinitionAccess().getGroup()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:412:1: ( rule__RadioboxDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:412:2: rule__RadioboxDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__RadioboxDefinition__Group__0_in_ruleRadioboxDefinition814);
            rule__RadioboxDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRadioboxDefinitionAccess().getGroup()); 
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
    // $ANTLR end "ruleRadioboxDefinition"


    // $ANTLR start "entryRuleTableDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:424:1: entryRuleTableDefinition : ruleTableDefinition EOF ;
    public final void entryRuleTableDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:425:1: ( ruleTableDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:426:1: ruleTableDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleTableDefinition_in_entryRuleTableDefinition841);
            ruleTableDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableDefinition848); if (state.failed) return ;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:433:1: ruleTableDefinition : ( ( rule__TableDefinition__Group__0 ) ) ;
    public final void ruleTableDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:437:2: ( ( ( rule__TableDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:438:1: ( ( rule__TableDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:438:1: ( ( rule__TableDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:439:1: ( rule__TableDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableDefinitionAccess().getGroup()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:440:1: ( rule__TableDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:440:2: rule__TableDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group__0_in_ruleTableDefinition874);
            rule__TableDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableDefinitionAccess().getGroup()); 
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
    // $ANTLR end "ruleTableDefinition"


    // $ANTLR start "entryRuleTreeDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:452:1: entryRuleTreeDefinition : ruleTreeDefinition EOF ;
    public final void entryRuleTreeDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:453:1: ( ruleTreeDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:454:1: ruleTreeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTreeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleTreeDefinition_in_entryRuleTreeDefinition901);
            ruleTreeDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTreeDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTreeDefinition908); if (state.failed) return ;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:461:1: ruleTreeDefinition : ( ( rule__TreeDefinition__Group__0 ) ) ;
    public final void ruleTreeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:465:2: ( ( ( rule__TreeDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:466:1: ( ( rule__TreeDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:466:1: ( ( rule__TreeDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:467:1: ( rule__TreeDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTreeDefinitionAccess().getGroup()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:468:1: ( rule__TreeDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:468:2: rule__TreeDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group__0_in_ruleTreeDefinition934);
            rule__TreeDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTreeDefinitionAccess().getGroup()); 
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
    // $ANTLR end "ruleTreeDefinition"


    // $ANTLR start "entryRuleTextfieldDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:480:1: entryRuleTextfieldDefinition : ruleTextfieldDefinition EOF ;
    public final void entryRuleTextfieldDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:481:1: ( ruleTextfieldDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:482:1: ruleTextfieldDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextfieldDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleTextfieldDefinition_in_entryRuleTextfieldDefinition961);
            ruleTextfieldDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextfieldDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextfieldDefinition968); if (state.failed) return ;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:489:1: ruleTextfieldDefinition : ( ( rule__TextfieldDefinition__Group__0 ) ) ;
    public final void ruleTextfieldDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:493:2: ( ( ( rule__TextfieldDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:494:1: ( ( rule__TextfieldDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:494:1: ( ( rule__TextfieldDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:495:1: ( rule__TextfieldDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextfieldDefinitionAccess().getGroup()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:496:1: ( rule__TextfieldDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:496:2: rule__TextfieldDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__0_in_ruleTextfieldDefinition994);
            rule__TextfieldDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextfieldDefinitionAccess().getGroup()); 
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
    // $ANTLR end "ruleTextfieldDefinition"


    // $ANTLR start "entryRuleButtonDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:508:1: entryRuleButtonDefinition : ruleButtonDefinition EOF ;
    public final void entryRuleButtonDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:509:1: ( ruleButtonDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:510:1: ruleButtonDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleButtonDefinition_in_entryRuleButtonDefinition1021);
            ruleButtonDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonDefinition1028); if (state.failed) return ;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:517:1: ruleButtonDefinition : ( ( rule__ButtonDefinition__Group__0 ) ) ;
    public final void ruleButtonDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:521:2: ( ( ( rule__ButtonDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:522:1: ( ( rule__ButtonDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:522:1: ( ( rule__ButtonDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:523:1: ( rule__ButtonDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonDefinitionAccess().getGroup()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:524:1: ( rule__ButtonDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:524:2: rule__ButtonDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__0_in_ruleButtonDefinition1054);
            rule__ButtonDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonDefinitionAccess().getGroup()); 
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
    // $ANTLR end "ruleButtonDefinition"


    // $ANTLR start "entryRuleInteraction"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:536:1: entryRuleInteraction : ruleInteraction EOF ;
    public final void entryRuleInteraction() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:537:1: ( ruleInteraction EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:538:1: ruleInteraction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInteractionRule()); 
            }
            pushFollow(FOLLOW_ruleInteraction_in_entryRuleInteraction1081);
            ruleInteraction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInteractionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteraction1088); if (state.failed) return ;

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
    // $ANTLR end "entryRuleInteraction"


    // $ANTLR start "ruleInteraction"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:545:1: ruleInteraction : ( ( rule__Interaction__Group__0 ) ) ;
    public final void ruleInteraction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:549:2: ( ( ( rule__Interaction__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:550:1: ( ( rule__Interaction__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:550:1: ( ( rule__Interaction__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:551:1: ( rule__Interaction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInteractionAccess().getGroup()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:552:1: ( rule__Interaction__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:552:2: rule__Interaction__Group__0
            {
            pushFollow(FOLLOW_rule__Interaction__Group__0_in_ruleInteraction1114);
            rule__Interaction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInteractionAccess().getGroup()); 
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
    // $ANTLR end "ruleInteraction"


    // $ANTLR start "entryRuleLabelDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:564:1: entryRuleLabelDefinition : ruleLabelDefinition EOF ;
    public final void entryRuleLabelDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:565:1: ( ruleLabelDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:566:1: ruleLabelDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleLabelDefinition_in_entryRuleLabelDefinition1141);
            ruleLabelDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabelDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelDefinition1148); if (state.failed) return ;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:573:1: ruleLabelDefinition : ( ( rule__LabelDefinition__Group__0 ) ) ;
    public final void ruleLabelDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:577:2: ( ( ( rule__LabelDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:578:1: ( ( rule__LabelDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:578:1: ( ( rule__LabelDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:579:1: ( rule__LabelDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelDefinitionAccess().getGroup()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:580:1: ( rule__LabelDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:580:2: rule__LabelDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__0_in_ruleLabelDefinition1174);
            rule__LabelDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabelDefinitionAccess().getGroup()); 
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
    // $ANTLR end "ruleLabelDefinition"


    // $ANTLR start "entryRuleUIAction"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:592:1: entryRuleUIAction : ruleUIAction EOF ;
    public final void entryRuleUIAction() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:593:1: ( ruleUIAction EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:594:1: ruleUIAction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIActionRule()); 
            }
            pushFollow(FOLLOW_ruleUIAction_in_entryRuleUIAction1201);
            ruleUIAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIActionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIAction1208); if (state.failed) return ;

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
    // $ANTLR end "entryRuleUIAction"


    // $ANTLR start "ruleUIAction"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:601:1: ruleUIAction : ( ( rule__UIAction__Group__0 ) ) ;
    public final void ruleUIAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:605:2: ( ( ( rule__UIAction__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:606:1: ( ( rule__UIAction__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:606:1: ( ( rule__UIAction__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:607:1: ( rule__UIAction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIActionAccess().getGroup()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:608:1: ( rule__UIAction__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:608:2: rule__UIAction__Group__0
            {
            pushFollow(FOLLOW_rule__UIAction__Group__0_in_ruleUIAction1234);
            rule__UIAction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIActionAccess().getGroup()); 
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
    // $ANTLR end "ruleUIAction"


    // $ANTLR start "entryRuleProperty"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:620:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:621:1: ( ruleProperty EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:622:1: ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1261);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1268); if (state.failed) return ;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:629:1: ruleProperty : ( ruleCommonProperty ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:633:2: ( ( ruleCommonProperty ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:634:1: ( ruleCommonProperty )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:634:1: ( ruleCommonProperty )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:635:1: ruleCommonProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getCommonPropertyParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleCommonProperty_in_ruleProperty1294);
            ruleCommonProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getCommonPropertyParserRuleCall()); 
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleCommonProperty"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:648:1: entryRuleCommonProperty : ruleCommonProperty EOF ;
    public final void entryRuleCommonProperty() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:649:1: ( ruleCommonProperty EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:650:1: ruleCommonProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommonPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleCommonProperty_in_entryRuleCommonProperty1320);
            ruleCommonProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommonPropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonProperty1327); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCommonProperty"


    // $ANTLR start "ruleCommonProperty"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:657:1: ruleCommonProperty : ( ( rule__CommonProperty__Group__0 ) ) ;
    public final void ruleCommonProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:661:2: ( ( ( rule__CommonProperty__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:662:1: ( ( rule__CommonProperty__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:662:1: ( ( rule__CommonProperty__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:663:1: ( rule__CommonProperty__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommonPropertyAccess().getGroup()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:664:1: ( rule__CommonProperty__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:664:2: rule__CommonProperty__Group__0
            {
            pushFollow(FOLLOW_rule__CommonProperty__Group__0_in_ruleCommonProperty1353);
            rule__CommonProperty__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommonPropertyAccess().getGroup()); 
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
    // $ANTLR end "ruleCommonProperty"


    // $ANTLR start "entryRuleCommonPropertyType"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:676:1: entryRuleCommonPropertyType : ruleCommonPropertyType EOF ;
    public final void entryRuleCommonPropertyType() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:677:1: ( ruleCommonPropertyType EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:678:1: ruleCommonPropertyType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommonPropertyTypeRule()); 
            }
            pushFollow(FOLLOW_ruleCommonPropertyType_in_entryRuleCommonPropertyType1380);
            ruleCommonPropertyType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommonPropertyTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonPropertyType1387); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCommonPropertyType"


    // $ANTLR start "ruleCommonPropertyType"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:685:1: ruleCommonPropertyType : ( 'Text' ) ;
    public final void ruleCommonPropertyType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:689:2: ( ( 'Text' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:690:1: ( 'Text' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:690:1: ( 'Text' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:691:1: 'Text'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommonPropertyTypeAccess().getTextKeyword()); 
            }
            match(input,11,FOLLOW_11_in_ruleCommonPropertyType1414); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommonPropertyTypeAccess().getTextKeyword()); 
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
    // $ANTLR end "ruleCommonPropertyType"


    // $ANTLR start "entryRuleInteractiontype"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:706:1: entryRuleInteractiontype : ruleInteractiontype EOF ;
    public final void entryRuleInteractiontype() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:707:1: ( ruleInteractiontype EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:708:1: ruleInteractiontype EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInteractiontypeRule()); 
            }
            pushFollow(FOLLOW_ruleInteractiontype_in_entryRuleInteractiontype1442);
            ruleInteractiontype();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInteractiontypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractiontype1449); if (state.failed) return ;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:715:1: ruleInteractiontype : ( 'CLICK' ) ;
    public final void ruleInteractiontype() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:719:2: ( ( 'CLICK' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:720:1: ( 'CLICK' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:720:1: ( 'CLICK' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:721:1: 'CLICK'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInteractiontypeAccess().getCLICKKeyword()); 
            }
            match(input,12,FOLLOW_12_in_ruleInteractiontype1476); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInteractiontypeAccess().getCLICKKeyword()); 
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
    // $ANTLR end "ruleInteractiontype"


    // $ANTLR start "rule__TYPE__Alternatives"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:736:1: rule__TYPE__Alternatives : ( ( 'WINDOW' ) | ( 'INNERCOMPLEX' ) );
    public final void rule__TYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:740:1: ( ( 'WINDOW' ) | ( 'INNERCOMPLEX' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            else if ( (LA1_0==14) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:741:1: ( 'WINDOW' )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:741:1: ( 'WINDOW' )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:742:1: 'WINDOW'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTYPEAccess().getWINDOWKeyword_0()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__TYPE__Alternatives1514); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTYPEAccess().getWINDOWKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:749:6: ( 'INNERCOMPLEX' )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:749:6: ( 'INNERCOMPLEX' )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:750:1: 'INNERCOMPLEX'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTYPEAccess().getINNERCOMPLEXKeyword_1()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__TYPE__Alternatives1534); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTYPEAccess().getINNERCOMPLEXKeyword_1()); 
                    }

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
    // $ANTLR end "rule__TYPE__Alternatives"


    // $ANTLR start "rule__AreaAssignment__Alternatives"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:762:1: rule__AreaAssignment__Alternatives : ( ( ( rule__AreaAssignment__Group_0__0 ) ) | ( ( rule__AreaAssignment__Group_1__0 ) ) );
    public final void rule__AreaAssignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:766:1: ( ( ( rule__AreaAssignment__Group_0__0 ) ) | ( ( rule__AreaAssignment__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==23) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_STRING) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:767:1: ( ( rule__AreaAssignment__Group_0__0 ) )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:767:1: ( ( rule__AreaAssignment__Group_0__0 ) )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:768:1: ( rule__AreaAssignment__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAreaAssignmentAccess().getGroup_0()); 
                    }
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:769:1: ( rule__AreaAssignment__Group_0__0 )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:769:2: rule__AreaAssignment__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__AreaAssignment__Group_0__0_in_rule__AreaAssignment__Alternatives1568);
                    rule__AreaAssignment__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAreaAssignmentAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:773:6: ( ( rule__AreaAssignment__Group_1__0 ) )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:773:6: ( ( rule__AreaAssignment__Group_1__0 ) )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:774:1: ( rule__AreaAssignment__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAreaAssignmentAccess().getGroup_1()); 
                    }
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:775:1: ( rule__AreaAssignment__Group_1__0 )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:775:2: rule__AreaAssignment__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AreaAssignment__Group_1__0_in_rule__AreaAssignment__Alternatives1586);
                    rule__AreaAssignment__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAreaAssignmentAccess().getGroup_1()); 
                    }

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:784:1: rule__ComponentDefinition__Alternatives : ( ( ruleLabelDefinition ) | ( ruleButtonDefinition ) | ( ruleTextfieldDefinition ) | ( ruleTreeDefinition ) | ( ruleTableDefinition ) | ( ruleRadioboxDefinition ) | ( ruleCheckboxDefinition ) | ( ruleMultiSelectionDefinition ) );
    public final void rule__ComponentDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:788:1: ( ( ruleLabelDefinition ) | ( ruleButtonDefinition ) | ( ruleTextfieldDefinition ) | ( ruleTreeDefinition ) | ( ruleTableDefinition ) | ( ruleRadioboxDefinition ) | ( ruleCheckboxDefinition ) | ( ruleMultiSelectionDefinition ) )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt3=1;
                }
                break;
            case 42:
                {
                alt3=2;
                }
                break;
            case 41:
                {
                alt3=3;
                }
                break;
            case 40:
                {
                alt3=4;
                }
                break;
            case 39:
                {
                alt3=5;
                }
                break;
            case 38:
                {
                alt3=6;
                }
                break;
            case 37:
                {
                alt3=7;
                }
                break;
            case 36:
                {
                alt3=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:789:1: ( ruleLabelDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:789:1: ( ruleLabelDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:790:1: ruleLabelDefinition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentDefinitionAccess().getLabelDefinitionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleLabelDefinition_in_rule__ComponentDefinition__Alternatives1619);
                    ruleLabelDefinition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComponentDefinitionAccess().getLabelDefinitionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:795:6: ( ruleButtonDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:795:6: ( ruleButtonDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:796:1: ruleButtonDefinition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentDefinitionAccess().getButtonDefinitionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleButtonDefinition_in_rule__ComponentDefinition__Alternatives1636);
                    ruleButtonDefinition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComponentDefinitionAccess().getButtonDefinitionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:801:6: ( ruleTextfieldDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:801:6: ( ruleTextfieldDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:802:1: ruleTextfieldDefinition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentDefinitionAccess().getTextfieldDefinitionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleTextfieldDefinition_in_rule__ComponentDefinition__Alternatives1653);
                    ruleTextfieldDefinition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComponentDefinitionAccess().getTextfieldDefinitionParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:807:6: ( ruleTreeDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:807:6: ( ruleTreeDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:808:1: ruleTreeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentDefinitionAccess().getTreeDefinitionParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleTreeDefinition_in_rule__ComponentDefinition__Alternatives1670);
                    ruleTreeDefinition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComponentDefinitionAccess().getTreeDefinitionParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:813:6: ( ruleTableDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:813:6: ( ruleTableDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:814:1: ruleTableDefinition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentDefinitionAccess().getTableDefinitionParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleTableDefinition_in_rule__ComponentDefinition__Alternatives1687);
                    ruleTableDefinition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComponentDefinitionAccess().getTableDefinitionParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:819:6: ( ruleRadioboxDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:819:6: ( ruleRadioboxDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:820:1: ruleRadioboxDefinition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentDefinitionAccess().getRadioboxDefinitionParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleRadioboxDefinition_in_rule__ComponentDefinition__Alternatives1704);
                    ruleRadioboxDefinition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComponentDefinitionAccess().getRadioboxDefinitionParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:825:6: ( ruleCheckboxDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:825:6: ( ruleCheckboxDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:826:1: ruleCheckboxDefinition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentDefinitionAccess().getCheckboxDefinitionParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_ruleCheckboxDefinition_in_rule__ComponentDefinition__Alternatives1721);
                    ruleCheckboxDefinition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComponentDefinitionAccess().getCheckboxDefinitionParserRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:831:6: ( ruleMultiSelectionDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:831:6: ( ruleMultiSelectionDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:832:1: ruleMultiSelectionDefinition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentDefinitionAccess().getMultiSelectionDefinitionParserRuleCall_7()); 
                    }
                    pushFollow(FOLLOW_ruleMultiSelectionDefinition_in_rule__ComponentDefinition__Alternatives1738);
                    ruleMultiSelectionDefinition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComponentDefinitionAccess().getMultiSelectionDefinitionParserRuleCall_7()); 
                    }

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


    // $ANTLR start "rule__UIDescription__Group_0__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:844:1: rule__UIDescription__Group_0__0 : rule__UIDescription__Group_0__0__Impl rule__UIDescription__Group_0__1 ;
    public final void rule__UIDescription__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:848:1: ( rule__UIDescription__Group_0__0__Impl rule__UIDescription__Group_0__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:849:2: rule__UIDescription__Group_0__0__Impl rule__UIDescription__Group_0__1
            {
            pushFollow(FOLLOW_rule__UIDescription__Group_0__0__Impl_in_rule__UIDescription__Group_0__01768);
            rule__UIDescription__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIDescription__Group_0__1_in_rule__UIDescription__Group_0__01771);
            rule__UIDescription__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__Group_0__0"


    // $ANTLR start "rule__UIDescription__Group_0__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:856:1: rule__UIDescription__Group_0__0__Impl : ( ( rule__UIDescription__AreaCountAssignment_0_0 ) ) ;
    public final void rule__UIDescription__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:860:1: ( ( ( rule__UIDescription__AreaCountAssignment_0_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:861:1: ( ( rule__UIDescription__AreaCountAssignment_0_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:861:1: ( ( rule__UIDescription__AreaCountAssignment_0_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:862:1: ( rule__UIDescription__AreaCountAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getAreaCountAssignment_0_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:863:1: ( rule__UIDescription__AreaCountAssignment_0_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:863:2: rule__UIDescription__AreaCountAssignment_0_0
            {
            pushFollow(FOLLOW_rule__UIDescription__AreaCountAssignment_0_0_in_rule__UIDescription__Group_0__0__Impl1798);
            rule__UIDescription__AreaCountAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDescriptionAccess().getAreaCountAssignment_0_0()); 
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
    // $ANTLR end "rule__UIDescription__Group_0__0__Impl"


    // $ANTLR start "rule__UIDescription__Group_0__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:873:1: rule__UIDescription__Group_0__1 : rule__UIDescription__Group_0__1__Impl rule__UIDescription__Group_0__2 ;
    public final void rule__UIDescription__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:877:1: ( rule__UIDescription__Group_0__1__Impl rule__UIDescription__Group_0__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:878:2: rule__UIDescription__Group_0__1__Impl rule__UIDescription__Group_0__2
            {
            pushFollow(FOLLOW_rule__UIDescription__Group_0__1__Impl_in_rule__UIDescription__Group_0__11828);
            rule__UIDescription__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIDescription__Group_0__2_in_rule__UIDescription__Group_0__11831);
            rule__UIDescription__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__Group_0__1"


    // $ANTLR start "rule__UIDescription__Group_0__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:885:1: rule__UIDescription__Group_0__1__Impl : ( ( rule__UIDescription__TypeDefinitionAssignment_0_1 ) ) ;
    public final void rule__UIDescription__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:889:1: ( ( ( rule__UIDescription__TypeDefinitionAssignment_0_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:890:1: ( ( rule__UIDescription__TypeDefinitionAssignment_0_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:890:1: ( ( rule__UIDescription__TypeDefinitionAssignment_0_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:891:1: ( rule__UIDescription__TypeDefinitionAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getTypeDefinitionAssignment_0_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:892:1: ( rule__UIDescription__TypeDefinitionAssignment_0_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:892:2: rule__UIDescription__TypeDefinitionAssignment_0_1
            {
            pushFollow(FOLLOW_rule__UIDescription__TypeDefinitionAssignment_0_1_in_rule__UIDescription__Group_0__1__Impl1858);
            rule__UIDescription__TypeDefinitionAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDescriptionAccess().getTypeDefinitionAssignment_0_1()); 
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
    // $ANTLR end "rule__UIDescription__Group_0__1__Impl"


    // $ANTLR start "rule__UIDescription__Group_0__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:902:1: rule__UIDescription__Group_0__2 : rule__UIDescription__Group_0__2__Impl ;
    public final void rule__UIDescription__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:906:1: ( rule__UIDescription__Group_0__2__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:907:2: rule__UIDescription__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__UIDescription__Group_0__2__Impl_in_rule__UIDescription__Group_0__21888);
            rule__UIDescription__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__Group_0__2"


    // $ANTLR start "rule__UIDescription__Group_0__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:913:1: rule__UIDescription__Group_0__2__Impl : ( ( rule__UIDescription__UsedDescriptionsAssignment_0_2 )* ) ;
    public final void rule__UIDescription__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:917:1: ( ( ( rule__UIDescription__UsedDescriptionsAssignment_0_2 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:918:1: ( ( rule__UIDescription__UsedDescriptionsAssignment_0_2 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:918:1: ( ( rule__UIDescription__UsedDescriptionsAssignment_0_2 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:919:1: ( rule__UIDescription__UsedDescriptionsAssignment_0_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getUsedDescriptionsAssignment_0_2()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:920:1: ( rule__UIDescription__UsedDescriptionsAssignment_0_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:920:2: rule__UIDescription__UsedDescriptionsAssignment_0_2
            	    {
            	    pushFollow(FOLLOW_rule__UIDescription__UsedDescriptionsAssignment_0_2_in_rule__UIDescription__Group_0__2__Impl1915);
            	    rule__UIDescription__UsedDescriptionsAssignment_0_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDescriptionAccess().getUsedDescriptionsAssignment_0_2()); 
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
    // $ANTLR end "rule__UIDescription__Group_0__2__Impl"


    // $ANTLR start "rule__UIDescription__Group_2__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:936:1: rule__UIDescription__Group_2__0 : rule__UIDescription__Group_2__0__Impl rule__UIDescription__Group_2__1 ;
    public final void rule__UIDescription__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:940:1: ( rule__UIDescription__Group_2__0__Impl rule__UIDescription__Group_2__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:941:2: rule__UIDescription__Group_2__0__Impl rule__UIDescription__Group_2__1
            {
            pushFollow(FOLLOW_rule__UIDescription__Group_2__0__Impl_in_rule__UIDescription__Group_2__01952);
            rule__UIDescription__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIDescription__Group_2__1_in_rule__UIDescription__Group_2__01955);
            rule__UIDescription__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__Group_2__0"


    // $ANTLR start "rule__UIDescription__Group_2__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:948:1: rule__UIDescription__Group_2__0__Impl : ( ( rule__UIDescription__DefinitionsAssignment_2_0 )* ) ;
    public final void rule__UIDescription__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:952:1: ( ( ( rule__UIDescription__DefinitionsAssignment_2_0 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:953:1: ( ( rule__UIDescription__DefinitionsAssignment_2_0 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:953:1: ( ( rule__UIDescription__DefinitionsAssignment_2_0 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:954:1: ( rule__UIDescription__DefinitionsAssignment_2_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getDefinitionsAssignment_2_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:955:1: ( rule__UIDescription__DefinitionsAssignment_2_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:955:2: rule__UIDescription__DefinitionsAssignment_2_0
            	    {
            	    pushFollow(FOLLOW_rule__UIDescription__DefinitionsAssignment_2_0_in_rule__UIDescription__Group_2__0__Impl1982);
            	    rule__UIDescription__DefinitionsAssignment_2_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDescriptionAccess().getDefinitionsAssignment_2_0()); 
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
    // $ANTLR end "rule__UIDescription__Group_2__0__Impl"


    // $ANTLR start "rule__UIDescription__Group_2__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:965:1: rule__UIDescription__Group_2__1 : rule__UIDescription__Group_2__1__Impl ;
    public final void rule__UIDescription__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:969:1: ( rule__UIDescription__Group_2__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:970:2: rule__UIDescription__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__UIDescription__Group_2__1__Impl_in_rule__UIDescription__Group_2__12013);
            rule__UIDescription__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__Group_2__1"


    // $ANTLR start "rule__UIDescription__Group_2__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:976:1: rule__UIDescription__Group_2__1__Impl : ( ( rule__UIDescription__AreasAssignment_2_1 )* ) ;
    public final void rule__UIDescription__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:980:1: ( ( ( rule__UIDescription__AreasAssignment_2_1 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:981:1: ( ( rule__UIDescription__AreasAssignment_2_1 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:981:1: ( ( rule__UIDescription__AreasAssignment_2_1 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:982:1: ( rule__UIDescription__AreasAssignment_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getAreasAssignment_2_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:983:1: ( rule__UIDescription__AreasAssignment_2_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }
                else if ( (LA6_0==RULE_STRING) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:983:2: rule__UIDescription__AreasAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__UIDescription__AreasAssignment_2_1_in_rule__UIDescription__Group_2__1__Impl2040);
            	    rule__UIDescription__AreasAssignment_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDescriptionAccess().getAreasAssignment_2_1()); 
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
    // $ANTLR end "rule__UIDescription__Group_2__1__Impl"


    // $ANTLR start "rule__InputType__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:997:1: rule__InputType__Group__0 : rule__InputType__Group__0__Impl rule__InputType__Group__1 ;
    public final void rule__InputType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1001:1: ( rule__InputType__Group__0__Impl rule__InputType__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1002:2: rule__InputType__Group__0__Impl rule__InputType__Group__1
            {
            pushFollow(FOLLOW_rule__InputType__Group__0__Impl_in_rule__InputType__Group__02075);
            rule__InputType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__InputType__Group__1_in_rule__InputType__Group__02078);
            rule__InputType__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputType__Group__0"


    // $ANTLR start "rule__InputType__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1009:1: rule__InputType__Group__0__Impl : ( 'inputType=' ) ;
    public final void rule__InputType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1013:1: ( ( 'inputType=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1014:1: ( 'inputType=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1014:1: ( 'inputType=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1015:1: 'inputType='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputTypeAccess().getInputTypeKeyword_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__InputType__Group__0__Impl2106); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputTypeAccess().getInputTypeKeyword_0()); 
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
    // $ANTLR end "rule__InputType__Group__0__Impl"


    // $ANTLR start "rule__InputType__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1028:1: rule__InputType__Group__1 : rule__InputType__Group__1__Impl rule__InputType__Group__2 ;
    public final void rule__InputType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1032:1: ( rule__InputType__Group__1__Impl rule__InputType__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1033:2: rule__InputType__Group__1__Impl rule__InputType__Group__2
            {
            pushFollow(FOLLOW_rule__InputType__Group__1__Impl_in_rule__InputType__Group__12137);
            rule__InputType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__InputType__Group__2_in_rule__InputType__Group__12140);
            rule__InputType__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputType__Group__1"


    // $ANTLR start "rule__InputType__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1040:1: rule__InputType__Group__1__Impl : ( ( rule__InputType__TypeAssignment_1 ) ) ;
    public final void rule__InputType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1044:1: ( ( ( rule__InputType__TypeAssignment_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1045:1: ( ( rule__InputType__TypeAssignment_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1045:1: ( ( rule__InputType__TypeAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1046:1: ( rule__InputType__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputTypeAccess().getTypeAssignment_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1047:1: ( rule__InputType__TypeAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1047:2: rule__InputType__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__InputType__TypeAssignment_1_in_rule__InputType__Group__1__Impl2167);
            rule__InputType__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputTypeAccess().getTypeAssignment_1()); 
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
    // $ANTLR end "rule__InputType__Group__1__Impl"


    // $ANTLR start "rule__InputType__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1057:1: rule__InputType__Group__2 : rule__InputType__Group__2__Impl rule__InputType__Group__3 ;
    public final void rule__InputType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1061:1: ( rule__InputType__Group__2__Impl rule__InputType__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1062:2: rule__InputType__Group__2__Impl rule__InputType__Group__3
            {
            pushFollow(FOLLOW_rule__InputType__Group__2__Impl_in_rule__InputType__Group__22197);
            rule__InputType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__InputType__Group__3_in_rule__InputType__Group__22200);
            rule__InputType__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputType__Group__2"


    // $ANTLR start "rule__InputType__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1069:1: rule__InputType__Group__2__Impl : ( ' as ' ) ;
    public final void rule__InputType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1073:1: ( ( ' as ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1074:1: ( ' as ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1074:1: ( ' as ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1075:1: ' as '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputTypeAccess().getAsKeyword_2()); 
            }
            match(input,16,FOLLOW_16_in_rule__InputType__Group__2__Impl2228); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputTypeAccess().getAsKeyword_2()); 
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
    // $ANTLR end "rule__InputType__Group__2__Impl"


    // $ANTLR start "rule__InputType__Group__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1088:1: rule__InputType__Group__3 : rule__InputType__Group__3__Impl ;
    public final void rule__InputType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1092:1: ( rule__InputType__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1093:2: rule__InputType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__InputType__Group__3__Impl_in_rule__InputType__Group__32259);
            rule__InputType__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputType__Group__3"


    // $ANTLR start "rule__InputType__Group__3__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1099:1: rule__InputType__Group__3__Impl : ( ( rule__InputType__NameAssignment_3 ) ) ;
    public final void rule__InputType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1103:1: ( ( ( rule__InputType__NameAssignment_3 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1104:1: ( ( rule__InputType__NameAssignment_3 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1104:1: ( ( rule__InputType__NameAssignment_3 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1105:1: ( rule__InputType__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputTypeAccess().getNameAssignment_3()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1106:1: ( rule__InputType__NameAssignment_3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1106:2: rule__InputType__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__InputType__NameAssignment_3_in_rule__InputType__Group__3__Impl2286);
            rule__InputType__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputTypeAccess().getNameAssignment_3()); 
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
    // $ANTLR end "rule__InputType__Group__3__Impl"


    // $ANTLR start "rule__UsedDescriptions__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1124:1: rule__UsedDescriptions__Group__0 : rule__UsedDescriptions__Group__0__Impl rule__UsedDescriptions__Group__1 ;
    public final void rule__UsedDescriptions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1128:1: ( rule__UsedDescriptions__Group__0__Impl rule__UsedDescriptions__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1129:2: rule__UsedDescriptions__Group__0__Impl rule__UsedDescriptions__Group__1
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__Group__0__Impl_in_rule__UsedDescriptions__Group__02324);
            rule__UsedDescriptions__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UsedDescriptions__Group__1_in_rule__UsedDescriptions__Group__02327);
            rule__UsedDescriptions__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1136:1: rule__UsedDescriptions__Group__0__Impl : ( 'use: ' ) ;
    public final void rule__UsedDescriptions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1140:1: ( ( 'use: ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1141:1: ( 'use: ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1141:1: ( 'use: ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1142:1: 'use: '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUsedDescriptionsAccess().getUseKeyword_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__UsedDescriptions__Group__0__Impl2355); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUsedDescriptionsAccess().getUseKeyword_0()); 
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
    // $ANTLR end "rule__UsedDescriptions__Group__0__Impl"


    // $ANTLR start "rule__UsedDescriptions__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1155:1: rule__UsedDescriptions__Group__1 : rule__UsedDescriptions__Group__1__Impl ;
    public final void rule__UsedDescriptions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1159:1: ( rule__UsedDescriptions__Group__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1160:2: rule__UsedDescriptions__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__Group__1__Impl_in_rule__UsedDescriptions__Group__12386);
            rule__UsedDescriptions__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1166:1: rule__UsedDescriptions__Group__1__Impl : ( ( rule__UsedDescriptions__DescriptionAssignment_1 ) ) ;
    public final void rule__UsedDescriptions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1170:1: ( ( ( rule__UsedDescriptions__DescriptionAssignment_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1171:1: ( ( rule__UsedDescriptions__DescriptionAssignment_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1171:1: ( ( rule__UsedDescriptions__DescriptionAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1172:1: ( rule__UsedDescriptions__DescriptionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUsedDescriptionsAccess().getDescriptionAssignment_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1173:1: ( rule__UsedDescriptions__DescriptionAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1173:2: rule__UsedDescriptions__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__DescriptionAssignment_1_in_rule__UsedDescriptions__Group__1__Impl2413);
            rule__UsedDescriptions__DescriptionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUsedDescriptionsAccess().getDescriptionAssignment_1()); 
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
    // $ANTLR end "rule__UsedDescriptions__Group__1__Impl"


    // $ANTLR start "rule__AreaCount__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1187:1: rule__AreaCount__Group__0 : rule__AreaCount__Group__0__Impl rule__AreaCount__Group__1 ;
    public final void rule__AreaCount__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1191:1: ( rule__AreaCount__Group__0__Impl rule__AreaCount__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1192:2: rule__AreaCount__Group__0__Impl rule__AreaCount__Group__1
            {
            pushFollow(FOLLOW_rule__AreaCount__Group__0__Impl_in_rule__AreaCount__Group__02447);
            rule__AreaCount__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AreaCount__Group__1_in_rule__AreaCount__Group__02450);
            rule__AreaCount__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1199:1: rule__AreaCount__Group__0__Impl : ( 'Area count: ' ) ;
    public final void rule__AreaCount__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1203:1: ( ( 'Area count: ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1204:1: ( 'Area count: ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1204:1: ( 'Area count: ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1205:1: 'Area count: '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaCountAccess().getAreaCountKeyword_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__AreaCount__Group__0__Impl2478); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaCountAccess().getAreaCountKeyword_0()); 
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
    // $ANTLR end "rule__AreaCount__Group__0__Impl"


    // $ANTLR start "rule__AreaCount__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1218:1: rule__AreaCount__Group__1 : rule__AreaCount__Group__1__Impl ;
    public final void rule__AreaCount__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1222:1: ( rule__AreaCount__Group__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1223:2: rule__AreaCount__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AreaCount__Group__1__Impl_in_rule__AreaCount__Group__12509);
            rule__AreaCount__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1229:1: rule__AreaCount__Group__1__Impl : ( ( rule__AreaCount__AreaCountAssignment_1 ) ) ;
    public final void rule__AreaCount__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1233:1: ( ( ( rule__AreaCount__AreaCountAssignment_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1234:1: ( ( rule__AreaCount__AreaCountAssignment_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1234:1: ( ( rule__AreaCount__AreaCountAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1235:1: ( rule__AreaCount__AreaCountAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaCountAccess().getAreaCountAssignment_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1236:1: ( rule__AreaCount__AreaCountAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1236:2: rule__AreaCount__AreaCountAssignment_1
            {
            pushFollow(FOLLOW_rule__AreaCount__AreaCountAssignment_1_in_rule__AreaCount__Group__1__Impl2536);
            rule__AreaCount__AreaCountAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaCountAccess().getAreaCountAssignment_1()); 
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
    // $ANTLR end "rule__AreaCount__Group__1__Impl"


    // $ANTLR start "rule__Definition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1250:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1254:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1255:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__02570);
            rule__Definition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__02573);
            rule__Definition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1262:1: rule__Definition__Group__0__Impl : ( 'DEF ' ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1266:1: ( ( 'DEF ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1267:1: ( 'DEF ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1267:1: ( 'DEF ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1268:1: 'DEF '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getDEFKeyword_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__Definition__Group__0__Impl2601); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getDEFKeyword_0()); 
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
    // $ANTLR end "rule__Definition__Group__0__Impl"


    // $ANTLR start "rule__Definition__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1281:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl rule__Definition__Group__2 ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1285:1: ( rule__Definition__Group__1__Impl rule__Definition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1286:2: rule__Definition__Group__1__Impl rule__Definition__Group__2
            {
            pushFollow(FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__12632);
            rule__Definition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__12635);
            rule__Definition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1293:1: rule__Definition__Group__1__Impl : ( ( rule__Definition__ConcreteDefitionAssignment_1 ) ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1297:1: ( ( ( rule__Definition__ConcreteDefitionAssignment_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1298:1: ( ( rule__Definition__ConcreteDefitionAssignment_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1298:1: ( ( rule__Definition__ConcreteDefitionAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1299:1: ( rule__Definition__ConcreteDefitionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getConcreteDefitionAssignment_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1300:1: ( rule__Definition__ConcreteDefitionAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1300:2: rule__Definition__ConcreteDefitionAssignment_1
            {
            pushFollow(FOLLOW_rule__Definition__ConcreteDefitionAssignment_1_in_rule__Definition__Group__1__Impl2662);
            rule__Definition__ConcreteDefitionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getConcreteDefitionAssignment_1()); 
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
    // $ANTLR end "rule__Definition__Group__1__Impl"


    // $ANTLR start "rule__Definition__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1310:1: rule__Definition__Group__2 : rule__Definition__Group__2__Impl ;
    public final void rule__Definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1314:1: ( rule__Definition__Group__2__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1315:2: rule__Definition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__22692);
            rule__Definition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1321:1: rule__Definition__Group__2__Impl : ( 'END DEF' ) ;
    public final void rule__Definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1325:1: ( ( 'END DEF' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1326:1: ( 'END DEF' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1326:1: ( 'END DEF' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1327:1: 'END DEF'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getENDDEFKeyword_2()); 
            }
            match(input,20,FOLLOW_20_in_rule__Definition__Group__2__Impl2720); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getENDDEFKeyword_2()); 
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
    // $ANTLR end "rule__Definition__Group__2__Impl"


    // $ANTLR start "rule__TypeDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1346:1: rule__TypeDefinition__Group__0 : rule__TypeDefinition__Group__0__Impl rule__TypeDefinition__Group__1 ;
    public final void rule__TypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1350:1: ( rule__TypeDefinition__Group__0__Impl rule__TypeDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1351:2: rule__TypeDefinition__Group__0__Impl rule__TypeDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Group__0__Impl_in_rule__TypeDefinition__Group__02757);
            rule__TypeDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TypeDefinition__Group__1_in_rule__TypeDefinition__Group__02760);
            rule__TypeDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1358:1: rule__TypeDefinition__Group__0__Impl : ( 'type: ' ) ;
    public final void rule__TypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1362:1: ( ( 'type: ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1363:1: ( 'type: ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1363:1: ( 'type: ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1364:1: 'type: '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDefinitionAccess().getTypeKeyword_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__TypeDefinition__Group__0__Impl2788); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDefinitionAccess().getTypeKeyword_0()); 
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
    // $ANTLR end "rule__TypeDefinition__Group__0__Impl"


    // $ANTLR start "rule__TypeDefinition__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1377:1: rule__TypeDefinition__Group__1 : rule__TypeDefinition__Group__1__Impl ;
    public final void rule__TypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1381:1: ( rule__TypeDefinition__Group__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1382:2: rule__TypeDefinition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Group__1__Impl_in_rule__TypeDefinition__Group__12819);
            rule__TypeDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1388:1: rule__TypeDefinition__Group__1__Impl : ( ( rule__TypeDefinition__TypeAssignment_1 ) ) ;
    public final void rule__TypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1392:1: ( ( ( rule__TypeDefinition__TypeAssignment_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1393:1: ( ( rule__TypeDefinition__TypeAssignment_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1393:1: ( ( rule__TypeDefinition__TypeAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1394:1: ( rule__TypeDefinition__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDefinitionAccess().getTypeAssignment_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1395:1: ( rule__TypeDefinition__TypeAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1395:2: rule__TypeDefinition__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__TypeDefinition__TypeAssignment_1_in_rule__TypeDefinition__Group__1__Impl2846);
            rule__TypeDefinition__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDefinitionAccess().getTypeAssignment_1()); 
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
    // $ANTLR end "rule__TypeDefinition__Group__1__Impl"


    // $ANTLR start "rule__UIDescriptionImport__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1409:1: rule__UIDescriptionImport__Group__0 : rule__UIDescriptionImport__Group__0__Impl rule__UIDescriptionImport__Group__1 ;
    public final void rule__UIDescriptionImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1413:1: ( rule__UIDescriptionImport__Group__0__Impl rule__UIDescriptionImport__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1414:2: rule__UIDescriptionImport__Group__0__Impl rule__UIDescriptionImport__Group__1
            {
            pushFollow(FOLLOW_rule__UIDescriptionImport__Group__0__Impl_in_rule__UIDescriptionImport__Group__02880);
            rule__UIDescriptionImport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIDescriptionImport__Group__1_in_rule__UIDescriptionImport__Group__02883);
            rule__UIDescriptionImport__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescriptionImport__Group__0"


    // $ANTLR start "rule__UIDescriptionImport__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1421:1: rule__UIDescriptionImport__Group__0__Impl : ( ( rule__UIDescriptionImport__DescriptionNameAssignment_0 ) ) ;
    public final void rule__UIDescriptionImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1425:1: ( ( ( rule__UIDescriptionImport__DescriptionNameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1426:1: ( ( rule__UIDescriptionImport__DescriptionNameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1426:1: ( ( rule__UIDescriptionImport__DescriptionNameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1427:1: ( rule__UIDescriptionImport__DescriptionNameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionImportAccess().getDescriptionNameAssignment_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1428:1: ( rule__UIDescriptionImport__DescriptionNameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1428:2: rule__UIDescriptionImport__DescriptionNameAssignment_0
            {
            pushFollow(FOLLOW_rule__UIDescriptionImport__DescriptionNameAssignment_0_in_rule__UIDescriptionImport__Group__0__Impl2910);
            rule__UIDescriptionImport__DescriptionNameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDescriptionImportAccess().getDescriptionNameAssignment_0()); 
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
    // $ANTLR end "rule__UIDescriptionImport__Group__0__Impl"


    // $ANTLR start "rule__UIDescriptionImport__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1438:1: rule__UIDescriptionImport__Group__1 : rule__UIDescriptionImport__Group__1__Impl ;
    public final void rule__UIDescriptionImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1442:1: ( rule__UIDescriptionImport__Group__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1443:2: rule__UIDescriptionImport__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UIDescriptionImport__Group__1__Impl_in_rule__UIDescriptionImport__Group__12940);
            rule__UIDescriptionImport__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescriptionImport__Group__1"


    // $ANTLR start "rule__UIDescriptionImport__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1449:1: rule__UIDescriptionImport__Group__1__Impl : ( ( rule__UIDescriptionImport__Group_1__0 )? ) ;
    public final void rule__UIDescriptionImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1453:1: ( ( ( rule__UIDescriptionImport__Group_1__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1454:1: ( ( rule__UIDescriptionImport__Group_1__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1454:1: ( ( rule__UIDescriptionImport__Group_1__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1455:1: ( rule__UIDescriptionImport__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionImportAccess().getGroup_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1456:1: ( rule__UIDescriptionImport__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1456:2: rule__UIDescriptionImport__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__UIDescriptionImport__Group_1__0_in_rule__UIDescriptionImport__Group__1__Impl2967);
                    rule__UIDescriptionImport__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDescriptionImportAccess().getGroup_1()); 
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
    // $ANTLR end "rule__UIDescriptionImport__Group__1__Impl"


    // $ANTLR start "rule__UIDescriptionImport__Group_1__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1470:1: rule__UIDescriptionImport__Group_1__0 : rule__UIDescriptionImport__Group_1__0__Impl rule__UIDescriptionImport__Group_1__1 ;
    public final void rule__UIDescriptionImport__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1474:1: ( rule__UIDescriptionImport__Group_1__0__Impl rule__UIDescriptionImport__Group_1__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1475:2: rule__UIDescriptionImport__Group_1__0__Impl rule__UIDescriptionImport__Group_1__1
            {
            pushFollow(FOLLOW_rule__UIDescriptionImport__Group_1__0__Impl_in_rule__UIDescriptionImport__Group_1__03002);
            rule__UIDescriptionImport__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIDescriptionImport__Group_1__1_in_rule__UIDescriptionImport__Group_1__03005);
            rule__UIDescriptionImport__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescriptionImport__Group_1__0"


    // $ANTLR start "rule__UIDescriptionImport__Group_1__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1482:1: rule__UIDescriptionImport__Group_1__0__Impl : ( ' As: ' ) ;
    public final void rule__UIDescriptionImport__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1486:1: ( ( ' As: ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1487:1: ( ' As: ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1487:1: ( ' As: ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1488:1: ' As: '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionImportAccess().getAsKeyword_1_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__UIDescriptionImport__Group_1__0__Impl3033); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDescriptionImportAccess().getAsKeyword_1_0()); 
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
    // $ANTLR end "rule__UIDescriptionImport__Group_1__0__Impl"


    // $ANTLR start "rule__UIDescriptionImport__Group_1__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1501:1: rule__UIDescriptionImport__Group_1__1 : rule__UIDescriptionImport__Group_1__1__Impl ;
    public final void rule__UIDescriptionImport__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1505:1: ( rule__UIDescriptionImport__Group_1__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1506:2: rule__UIDescriptionImport__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__UIDescriptionImport__Group_1__1__Impl_in_rule__UIDescriptionImport__Group_1__13064);
            rule__UIDescriptionImport__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescriptionImport__Group_1__1"


    // $ANTLR start "rule__UIDescriptionImport__Group_1__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1512:1: rule__UIDescriptionImport__Group_1__1__Impl : ( ( rule__UIDescriptionImport__LocalNameAssignment_1_1 ) ) ;
    public final void rule__UIDescriptionImport__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1516:1: ( ( ( rule__UIDescriptionImport__LocalNameAssignment_1_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1517:1: ( ( rule__UIDescriptionImport__LocalNameAssignment_1_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1517:1: ( ( rule__UIDescriptionImport__LocalNameAssignment_1_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1518:1: ( rule__UIDescriptionImport__LocalNameAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionImportAccess().getLocalNameAssignment_1_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1519:1: ( rule__UIDescriptionImport__LocalNameAssignment_1_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1519:2: rule__UIDescriptionImport__LocalNameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__UIDescriptionImport__LocalNameAssignment_1_1_in_rule__UIDescriptionImport__Group_1__1__Impl3091);
            rule__UIDescriptionImport__LocalNameAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDescriptionImportAccess().getLocalNameAssignment_1_1()); 
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
    // $ANTLR end "rule__UIDescriptionImport__Group_1__1__Impl"


    // $ANTLR start "rule__AreaAssignment__Group_0__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1533:1: rule__AreaAssignment__Group_0__0 : rule__AreaAssignment__Group_0__0__Impl rule__AreaAssignment__Group_0__1 ;
    public final void rule__AreaAssignment__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1537:1: ( rule__AreaAssignment__Group_0__0__Impl rule__AreaAssignment__Group_0__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1538:2: rule__AreaAssignment__Group_0__0__Impl rule__AreaAssignment__Group_0__1
            {
            pushFollow(FOLLOW_rule__AreaAssignment__Group_0__0__Impl_in_rule__AreaAssignment__Group_0__03125);
            rule__AreaAssignment__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AreaAssignment__Group_0__1_in_rule__AreaAssignment__Group_0__03128);
            rule__AreaAssignment__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1545:1: rule__AreaAssignment__Group_0__0__Impl : ( 'Area:' ) ;
    public final void rule__AreaAssignment__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1549:1: ( ( 'Area:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1550:1: ( 'Area:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1550:1: ( 'Area:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1551:1: 'Area:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAssignmentAccess().getAreaKeyword_0_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__AreaAssignment__Group_0__0__Impl3156); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAssignmentAccess().getAreaKeyword_0_0()); 
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
    // $ANTLR end "rule__AreaAssignment__Group_0__0__Impl"


    // $ANTLR start "rule__AreaAssignment__Group_0__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1564:1: rule__AreaAssignment__Group_0__1 : rule__AreaAssignment__Group_0__1__Impl rule__AreaAssignment__Group_0__2 ;
    public final void rule__AreaAssignment__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1568:1: ( rule__AreaAssignment__Group_0__1__Impl rule__AreaAssignment__Group_0__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1569:2: rule__AreaAssignment__Group_0__1__Impl rule__AreaAssignment__Group_0__2
            {
            pushFollow(FOLLOW_rule__AreaAssignment__Group_0__1__Impl_in_rule__AreaAssignment__Group_0__13187);
            rule__AreaAssignment__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AreaAssignment__Group_0__2_in_rule__AreaAssignment__Group_0__13190);
            rule__AreaAssignment__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1576:1: rule__AreaAssignment__Group_0__1__Impl : ( ( rule__AreaAssignment__AreaAssignment_0_1 ) ) ;
    public final void rule__AreaAssignment__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1580:1: ( ( ( rule__AreaAssignment__AreaAssignment_0_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1581:1: ( ( rule__AreaAssignment__AreaAssignment_0_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1581:1: ( ( rule__AreaAssignment__AreaAssignment_0_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1582:1: ( rule__AreaAssignment__AreaAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAssignmentAccess().getAreaAssignment_0_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1583:1: ( rule__AreaAssignment__AreaAssignment_0_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1583:2: rule__AreaAssignment__AreaAssignment_0_1
            {
            pushFollow(FOLLOW_rule__AreaAssignment__AreaAssignment_0_1_in_rule__AreaAssignment__Group_0__1__Impl3217);
            rule__AreaAssignment__AreaAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAssignmentAccess().getAreaAssignment_0_1()); 
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
    // $ANTLR end "rule__AreaAssignment__Group_0__1__Impl"


    // $ANTLR start "rule__AreaAssignment__Group_0__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1593:1: rule__AreaAssignment__Group_0__2 : rule__AreaAssignment__Group_0__2__Impl rule__AreaAssignment__Group_0__3 ;
    public final void rule__AreaAssignment__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1597:1: ( rule__AreaAssignment__Group_0__2__Impl rule__AreaAssignment__Group_0__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1598:2: rule__AreaAssignment__Group_0__2__Impl rule__AreaAssignment__Group_0__3
            {
            pushFollow(FOLLOW_rule__AreaAssignment__Group_0__2__Impl_in_rule__AreaAssignment__Group_0__23247);
            rule__AreaAssignment__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AreaAssignment__Group_0__3_in_rule__AreaAssignment__Group_0__23250);
            rule__AreaAssignment__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1605:1: rule__AreaAssignment__Group_0__2__Impl : ( '<-' ) ;
    public final void rule__AreaAssignment__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1609:1: ( ( '<-' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1610:1: ( '<-' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1610:1: ( '<-' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1611:1: '<-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAssignmentAccess().getLessThanSignHyphenMinusKeyword_0_2()); 
            }
            match(input,24,FOLLOW_24_in_rule__AreaAssignment__Group_0__2__Impl3278); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAssignmentAccess().getLessThanSignHyphenMinusKeyword_0_2()); 
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
    // $ANTLR end "rule__AreaAssignment__Group_0__2__Impl"


    // $ANTLR start "rule__AreaAssignment__Group_0__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1624:1: rule__AreaAssignment__Group_0__3 : rule__AreaAssignment__Group_0__3__Impl ;
    public final void rule__AreaAssignment__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1628:1: ( rule__AreaAssignment__Group_0__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1629:2: rule__AreaAssignment__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__AreaAssignment__Group_0__3__Impl_in_rule__AreaAssignment__Group_0__33309);
            rule__AreaAssignment__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1635:1: rule__AreaAssignment__Group_0__3__Impl : ( ( rule__AreaAssignment__ElementAssignment_0_3 ) ) ;
    public final void rule__AreaAssignment__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1639:1: ( ( ( rule__AreaAssignment__ElementAssignment_0_3 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1640:1: ( ( rule__AreaAssignment__ElementAssignment_0_3 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1640:1: ( ( rule__AreaAssignment__ElementAssignment_0_3 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1641:1: ( rule__AreaAssignment__ElementAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAssignmentAccess().getElementAssignment_0_3()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1642:1: ( rule__AreaAssignment__ElementAssignment_0_3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1642:2: rule__AreaAssignment__ElementAssignment_0_3
            {
            pushFollow(FOLLOW_rule__AreaAssignment__ElementAssignment_0_3_in_rule__AreaAssignment__Group_0__3__Impl3336);
            rule__AreaAssignment__ElementAssignment_0_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAssignmentAccess().getElementAssignment_0_3()); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1660:1: rule__AreaAssignment__Group_1__0 : rule__AreaAssignment__Group_1__0__Impl rule__AreaAssignment__Group_1__1 ;
    public final void rule__AreaAssignment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1664:1: ( rule__AreaAssignment__Group_1__0__Impl rule__AreaAssignment__Group_1__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1665:2: rule__AreaAssignment__Group_1__0__Impl rule__AreaAssignment__Group_1__1
            {
            pushFollow(FOLLOW_rule__AreaAssignment__Group_1__0__Impl_in_rule__AreaAssignment__Group_1__03374);
            rule__AreaAssignment__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AreaAssignment__Group_1__1_in_rule__AreaAssignment__Group_1__03377);
            rule__AreaAssignment__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1672:1: rule__AreaAssignment__Group_1__0__Impl : ( ( rule__AreaAssignment__ElementAssignment_1_0 ) ) ;
    public final void rule__AreaAssignment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1676:1: ( ( ( rule__AreaAssignment__ElementAssignment_1_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1677:1: ( ( rule__AreaAssignment__ElementAssignment_1_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1677:1: ( ( rule__AreaAssignment__ElementAssignment_1_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1678:1: ( rule__AreaAssignment__ElementAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAssignmentAccess().getElementAssignment_1_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1679:1: ( rule__AreaAssignment__ElementAssignment_1_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1679:2: rule__AreaAssignment__ElementAssignment_1_0
            {
            pushFollow(FOLLOW_rule__AreaAssignment__ElementAssignment_1_0_in_rule__AreaAssignment__Group_1__0__Impl3404);
            rule__AreaAssignment__ElementAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAssignmentAccess().getElementAssignment_1_0()); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1689:1: rule__AreaAssignment__Group_1__1 : rule__AreaAssignment__Group_1__1__Impl rule__AreaAssignment__Group_1__2 ;
    public final void rule__AreaAssignment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1693:1: ( rule__AreaAssignment__Group_1__1__Impl rule__AreaAssignment__Group_1__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1694:2: rule__AreaAssignment__Group_1__1__Impl rule__AreaAssignment__Group_1__2
            {
            pushFollow(FOLLOW_rule__AreaAssignment__Group_1__1__Impl_in_rule__AreaAssignment__Group_1__13434);
            rule__AreaAssignment__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AreaAssignment__Group_1__2_in_rule__AreaAssignment__Group_1__13437);
            rule__AreaAssignment__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1701:1: rule__AreaAssignment__Group_1__1__Impl : ( '->' ) ;
    public final void rule__AreaAssignment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1705:1: ( ( '->' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1706:1: ( '->' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1706:1: ( '->' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1707:1: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAssignmentAccess().getHyphenMinusGreaterThanSignKeyword_1_1()); 
            }
            match(input,25,FOLLOW_25_in_rule__AreaAssignment__Group_1__1__Impl3465); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAssignmentAccess().getHyphenMinusGreaterThanSignKeyword_1_1()); 
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
    // $ANTLR end "rule__AreaAssignment__Group_1__1__Impl"


    // $ANTLR start "rule__AreaAssignment__Group_1__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1720:1: rule__AreaAssignment__Group_1__2 : rule__AreaAssignment__Group_1__2__Impl rule__AreaAssignment__Group_1__3 ;
    public final void rule__AreaAssignment__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1724:1: ( rule__AreaAssignment__Group_1__2__Impl rule__AreaAssignment__Group_1__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1725:2: rule__AreaAssignment__Group_1__2__Impl rule__AreaAssignment__Group_1__3
            {
            pushFollow(FOLLOW_rule__AreaAssignment__Group_1__2__Impl_in_rule__AreaAssignment__Group_1__23496);
            rule__AreaAssignment__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AreaAssignment__Group_1__3_in_rule__AreaAssignment__Group_1__23499);
            rule__AreaAssignment__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1732:1: rule__AreaAssignment__Group_1__2__Impl : ( 'Area:' ) ;
    public final void rule__AreaAssignment__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1736:1: ( ( 'Area:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1737:1: ( 'Area:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1737:1: ( 'Area:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1738:1: 'Area:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAssignmentAccess().getAreaKeyword_1_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__AreaAssignment__Group_1__2__Impl3527); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAssignmentAccess().getAreaKeyword_1_2()); 
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
    // $ANTLR end "rule__AreaAssignment__Group_1__2__Impl"


    // $ANTLR start "rule__AreaAssignment__Group_1__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1751:1: rule__AreaAssignment__Group_1__3 : rule__AreaAssignment__Group_1__3__Impl ;
    public final void rule__AreaAssignment__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1755:1: ( rule__AreaAssignment__Group_1__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1756:2: rule__AreaAssignment__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__AreaAssignment__Group_1__3__Impl_in_rule__AreaAssignment__Group_1__33558);
            rule__AreaAssignment__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1762:1: rule__AreaAssignment__Group_1__3__Impl : ( ( rule__AreaAssignment__AreaAssignment_1_3 ) ) ;
    public final void rule__AreaAssignment__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1766:1: ( ( ( rule__AreaAssignment__AreaAssignment_1_3 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1767:1: ( ( rule__AreaAssignment__AreaAssignment_1_3 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1767:1: ( ( rule__AreaAssignment__AreaAssignment_1_3 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1768:1: ( rule__AreaAssignment__AreaAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAssignmentAccess().getAreaAssignment_1_3()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1769:1: ( rule__AreaAssignment__AreaAssignment_1_3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1769:2: rule__AreaAssignment__AreaAssignment_1_3
            {
            pushFollow(FOLLOW_rule__AreaAssignment__AreaAssignment_1_3_in_rule__AreaAssignment__Group_1__3__Impl3585);
            rule__AreaAssignment__AreaAssignment_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAssignmentAccess().getAreaAssignment_1_3()); 
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
    // $ANTLR end "rule__AreaAssignment__Group_1__3__Impl"


    // $ANTLR start "rule__MultiSelectionDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1787:1: rule__MultiSelectionDefinition__Group__0 : rule__MultiSelectionDefinition__Group__0__Impl rule__MultiSelectionDefinition__Group__1 ;
    public final void rule__MultiSelectionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1791:1: ( rule__MultiSelectionDefinition__Group__0__Impl rule__MultiSelectionDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1792:2: rule__MultiSelectionDefinition__Group__0__Impl rule__MultiSelectionDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group__0__Impl_in_rule__MultiSelectionDefinition__Group__03623);
            rule__MultiSelectionDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group__1_in_rule__MultiSelectionDefinition__Group__03626);
            rule__MultiSelectionDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiSelectionDefinition__Group__0"


    // $ANTLR start "rule__MultiSelectionDefinition__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1799:1: rule__MultiSelectionDefinition__Group__0__Impl : ( ( rule__MultiSelectionDefinition__TypeAssignment_0 ) ) ;
    public final void rule__MultiSelectionDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1803:1: ( ( ( rule__MultiSelectionDefinition__TypeAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1804:1: ( ( rule__MultiSelectionDefinition__TypeAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1804:1: ( ( rule__MultiSelectionDefinition__TypeAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1805:1: ( rule__MultiSelectionDefinition__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getTypeAssignment_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1806:1: ( rule__MultiSelectionDefinition__TypeAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1806:2: rule__MultiSelectionDefinition__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__TypeAssignment_0_in_rule__MultiSelectionDefinition__Group__0__Impl3653);
            rule__MultiSelectionDefinition__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiSelectionDefinitionAccess().getTypeAssignment_0()); 
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
    // $ANTLR end "rule__MultiSelectionDefinition__Group__0__Impl"


    // $ANTLR start "rule__MultiSelectionDefinition__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1816:1: rule__MultiSelectionDefinition__Group__1 : rule__MultiSelectionDefinition__Group__1__Impl rule__MultiSelectionDefinition__Group__2 ;
    public final void rule__MultiSelectionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1820:1: ( rule__MultiSelectionDefinition__Group__1__Impl rule__MultiSelectionDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1821:2: rule__MultiSelectionDefinition__Group__1__Impl rule__MultiSelectionDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group__1__Impl_in_rule__MultiSelectionDefinition__Group__13683);
            rule__MultiSelectionDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group__2_in_rule__MultiSelectionDefinition__Group__13686);
            rule__MultiSelectionDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiSelectionDefinition__Group__1"


    // $ANTLR start "rule__MultiSelectionDefinition__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1828:1: rule__MultiSelectionDefinition__Group__1__Impl : ( ' as ' ) ;
    public final void rule__MultiSelectionDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1832:1: ( ( ' as ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1833:1: ( ' as ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1833:1: ( ' as ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1834:1: ' as '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getAsKeyword_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__MultiSelectionDefinition__Group__1__Impl3714); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiSelectionDefinitionAccess().getAsKeyword_1()); 
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
    // $ANTLR end "rule__MultiSelectionDefinition__Group__1__Impl"


    // $ANTLR start "rule__MultiSelectionDefinition__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1847:1: rule__MultiSelectionDefinition__Group__2 : rule__MultiSelectionDefinition__Group__2__Impl rule__MultiSelectionDefinition__Group__3 ;
    public final void rule__MultiSelectionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1851:1: ( rule__MultiSelectionDefinition__Group__2__Impl rule__MultiSelectionDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1852:2: rule__MultiSelectionDefinition__Group__2__Impl rule__MultiSelectionDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group__2__Impl_in_rule__MultiSelectionDefinition__Group__23745);
            rule__MultiSelectionDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group__3_in_rule__MultiSelectionDefinition__Group__23748);
            rule__MultiSelectionDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiSelectionDefinition__Group__2"


    // $ANTLR start "rule__MultiSelectionDefinition__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1859:1: rule__MultiSelectionDefinition__Group__2__Impl : ( ( rule__MultiSelectionDefinition__NameAssignment_2 ) ) ;
    public final void rule__MultiSelectionDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1863:1: ( ( ( rule__MultiSelectionDefinition__NameAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1864:1: ( ( rule__MultiSelectionDefinition__NameAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1864:1: ( ( rule__MultiSelectionDefinition__NameAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1865:1: ( rule__MultiSelectionDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getNameAssignment_2()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1866:1: ( rule__MultiSelectionDefinition__NameAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1866:2: rule__MultiSelectionDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__NameAssignment_2_in_rule__MultiSelectionDefinition__Group__2__Impl3775);
            rule__MultiSelectionDefinition__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiSelectionDefinitionAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__MultiSelectionDefinition__Group__2__Impl"


    // $ANTLR start "rule__MultiSelectionDefinition__Group__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1876:1: rule__MultiSelectionDefinition__Group__3 : rule__MultiSelectionDefinition__Group__3__Impl ;
    public final void rule__MultiSelectionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1880:1: ( rule__MultiSelectionDefinition__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1881:2: rule__MultiSelectionDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group__3__Impl_in_rule__MultiSelectionDefinition__Group__33805);
            rule__MultiSelectionDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiSelectionDefinition__Group__3"


    // $ANTLR start "rule__MultiSelectionDefinition__Group__3__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1887:1: rule__MultiSelectionDefinition__Group__3__Impl : ( ( rule__MultiSelectionDefinition__Group_3__0 )? ) ;
    public final void rule__MultiSelectionDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1891:1: ( ( ( rule__MultiSelectionDefinition__Group_3__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1892:1: ( ( rule__MultiSelectionDefinition__Group_3__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1892:1: ( ( rule__MultiSelectionDefinition__Group_3__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1893:1: ( rule__MultiSelectionDefinition__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getGroup_3()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1894:1: ( rule__MultiSelectionDefinition__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1894:2: rule__MultiSelectionDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group_3__0_in_rule__MultiSelectionDefinition__Group__3__Impl3832);
                    rule__MultiSelectionDefinition__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiSelectionDefinitionAccess().getGroup_3()); 
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
    // $ANTLR end "rule__MultiSelectionDefinition__Group__3__Impl"


    // $ANTLR start "rule__MultiSelectionDefinition__Group_3__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1912:1: rule__MultiSelectionDefinition__Group_3__0 : rule__MultiSelectionDefinition__Group_3__0__Impl rule__MultiSelectionDefinition__Group_3__1 ;
    public final void rule__MultiSelectionDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1916:1: ( rule__MultiSelectionDefinition__Group_3__0__Impl rule__MultiSelectionDefinition__Group_3__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1917:2: rule__MultiSelectionDefinition__Group_3__0__Impl rule__MultiSelectionDefinition__Group_3__1
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group_3__0__Impl_in_rule__MultiSelectionDefinition__Group_3__03871);
            rule__MultiSelectionDefinition__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group_3__1_in_rule__MultiSelectionDefinition__Group_3__03874);
            rule__MultiSelectionDefinition__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiSelectionDefinition__Group_3__0"


    // $ANTLR start "rule__MultiSelectionDefinition__Group_3__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1924:1: rule__MultiSelectionDefinition__Group_3__0__Impl : ( 'inputType=' ) ;
    public final void rule__MultiSelectionDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1928:1: ( ( 'inputType=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1929:1: ( 'inputType=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1929:1: ( 'inputType=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1930:1: 'inputType='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getInputTypeKeyword_3_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__MultiSelectionDefinition__Group_3__0__Impl3902); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiSelectionDefinitionAccess().getInputTypeKeyword_3_0()); 
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
    // $ANTLR end "rule__MultiSelectionDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__MultiSelectionDefinition__Group_3__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1943:1: rule__MultiSelectionDefinition__Group_3__1 : rule__MultiSelectionDefinition__Group_3__1__Impl rule__MultiSelectionDefinition__Group_3__2 ;
    public final void rule__MultiSelectionDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1947:1: ( rule__MultiSelectionDefinition__Group_3__1__Impl rule__MultiSelectionDefinition__Group_3__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1948:2: rule__MultiSelectionDefinition__Group_3__1__Impl rule__MultiSelectionDefinition__Group_3__2
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group_3__1__Impl_in_rule__MultiSelectionDefinition__Group_3__13933);
            rule__MultiSelectionDefinition__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group_3__2_in_rule__MultiSelectionDefinition__Group_3__13936);
            rule__MultiSelectionDefinition__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiSelectionDefinition__Group_3__1"


    // $ANTLR start "rule__MultiSelectionDefinition__Group_3__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1955:1: rule__MultiSelectionDefinition__Group_3__1__Impl : ( ( rule__MultiSelectionDefinition__InputTypeAssignment_3_1 ) ) ;
    public final void rule__MultiSelectionDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1959:1: ( ( ( rule__MultiSelectionDefinition__InputTypeAssignment_3_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1960:1: ( ( rule__MultiSelectionDefinition__InputTypeAssignment_3_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1960:1: ( ( rule__MultiSelectionDefinition__InputTypeAssignment_3_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1961:1: ( rule__MultiSelectionDefinition__InputTypeAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getInputTypeAssignment_3_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1962:1: ( rule__MultiSelectionDefinition__InputTypeAssignment_3_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1962:2: rule__MultiSelectionDefinition__InputTypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__InputTypeAssignment_3_1_in_rule__MultiSelectionDefinition__Group_3__1__Impl3963);
            rule__MultiSelectionDefinition__InputTypeAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiSelectionDefinitionAccess().getInputTypeAssignment_3_1()); 
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
    // $ANTLR end "rule__MultiSelectionDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__MultiSelectionDefinition__Group_3__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1972:1: rule__MultiSelectionDefinition__Group_3__2 : rule__MultiSelectionDefinition__Group_3__2__Impl ;
    public final void rule__MultiSelectionDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1976:1: ( rule__MultiSelectionDefinition__Group_3__2__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1977:2: rule__MultiSelectionDefinition__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group_3__2__Impl_in_rule__MultiSelectionDefinition__Group_3__23993);
            rule__MultiSelectionDefinition__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiSelectionDefinition__Group_3__2"


    // $ANTLR start "rule__MultiSelectionDefinition__Group_3__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1983:1: rule__MultiSelectionDefinition__Group_3__2__Impl : ( ( rule__MultiSelectionDefinition__Group_3_2__0 )? ) ;
    public final void rule__MultiSelectionDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1987:1: ( ( ( rule__MultiSelectionDefinition__Group_3_2__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1988:1: ( ( rule__MultiSelectionDefinition__Group_3_2__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1988:1: ( ( rule__MultiSelectionDefinition__Group_3_2__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1989:1: ( rule__MultiSelectionDefinition__Group_3_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getGroup_3_2()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1990:1: ( rule__MultiSelectionDefinition__Group_3_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1990:2: rule__MultiSelectionDefinition__Group_3_2__0
                    {
                    pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group_3_2__0_in_rule__MultiSelectionDefinition__Group_3__2__Impl4020);
                    rule__MultiSelectionDefinition__Group_3_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiSelectionDefinitionAccess().getGroup_3_2()); 
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
    // $ANTLR end "rule__MultiSelectionDefinition__Group_3__2__Impl"


    // $ANTLR start "rule__MultiSelectionDefinition__Group_3_2__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2006:1: rule__MultiSelectionDefinition__Group_3_2__0 : rule__MultiSelectionDefinition__Group_3_2__0__Impl rule__MultiSelectionDefinition__Group_3_2__1 ;
    public final void rule__MultiSelectionDefinition__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2010:1: ( rule__MultiSelectionDefinition__Group_3_2__0__Impl rule__MultiSelectionDefinition__Group_3_2__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2011:2: rule__MultiSelectionDefinition__Group_3_2__0__Impl rule__MultiSelectionDefinition__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group_3_2__0__Impl_in_rule__MultiSelectionDefinition__Group_3_2__04057);
            rule__MultiSelectionDefinition__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group_3_2__1_in_rule__MultiSelectionDefinition__Group_3_2__04060);
            rule__MultiSelectionDefinition__Group_3_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiSelectionDefinition__Group_3_2__0"


    // $ANTLR start "rule__MultiSelectionDefinition__Group_3_2__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2018:1: rule__MultiSelectionDefinition__Group_3_2__0__Impl : ( 'selectableValues=' ) ;
    public final void rule__MultiSelectionDefinition__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2022:1: ( ( 'selectableValues=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2023:1: ( 'selectableValues=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2023:1: ( 'selectableValues=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2024:1: 'selectableValues='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getSelectableValuesKeyword_3_2_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__MultiSelectionDefinition__Group_3_2__0__Impl4088); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiSelectionDefinitionAccess().getSelectableValuesKeyword_3_2_0()); 
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
    // $ANTLR end "rule__MultiSelectionDefinition__Group_3_2__0__Impl"


    // $ANTLR start "rule__MultiSelectionDefinition__Group_3_2__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2037:1: rule__MultiSelectionDefinition__Group_3_2__1 : rule__MultiSelectionDefinition__Group_3_2__1__Impl rule__MultiSelectionDefinition__Group_3_2__2 ;
    public final void rule__MultiSelectionDefinition__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2041:1: ( rule__MultiSelectionDefinition__Group_3_2__1__Impl rule__MultiSelectionDefinition__Group_3_2__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2042:2: rule__MultiSelectionDefinition__Group_3_2__1__Impl rule__MultiSelectionDefinition__Group_3_2__2
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group_3_2__1__Impl_in_rule__MultiSelectionDefinition__Group_3_2__14119);
            rule__MultiSelectionDefinition__Group_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group_3_2__2_in_rule__MultiSelectionDefinition__Group_3_2__14122);
            rule__MultiSelectionDefinition__Group_3_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiSelectionDefinition__Group_3_2__1"


    // $ANTLR start "rule__MultiSelectionDefinition__Group_3_2__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2049:1: rule__MultiSelectionDefinition__Group_3_2__1__Impl : ( ( rule__MultiSelectionDefinition__SelectableValuesLocationAssignment_3_2_1 ) ) ;
    public final void rule__MultiSelectionDefinition__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2053:1: ( ( ( rule__MultiSelectionDefinition__SelectableValuesLocationAssignment_3_2_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2054:1: ( ( rule__MultiSelectionDefinition__SelectableValuesLocationAssignment_3_2_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2054:1: ( ( rule__MultiSelectionDefinition__SelectableValuesLocationAssignment_3_2_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2055:1: ( rule__MultiSelectionDefinition__SelectableValuesLocationAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getSelectableValuesLocationAssignment_3_2_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2056:1: ( rule__MultiSelectionDefinition__SelectableValuesLocationAssignment_3_2_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2056:2: rule__MultiSelectionDefinition__SelectableValuesLocationAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__SelectableValuesLocationAssignment_3_2_1_in_rule__MultiSelectionDefinition__Group_3_2__1__Impl4149);
            rule__MultiSelectionDefinition__SelectableValuesLocationAssignment_3_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiSelectionDefinitionAccess().getSelectableValuesLocationAssignment_3_2_1()); 
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
    // $ANTLR end "rule__MultiSelectionDefinition__Group_3_2__1__Impl"


    // $ANTLR start "rule__MultiSelectionDefinition__Group_3_2__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2066:1: rule__MultiSelectionDefinition__Group_3_2__2 : rule__MultiSelectionDefinition__Group_3_2__2__Impl ;
    public final void rule__MultiSelectionDefinition__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2070:1: ( rule__MultiSelectionDefinition__Group_3_2__2__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2071:2: rule__MultiSelectionDefinition__Group_3_2__2__Impl
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group_3_2__2__Impl_in_rule__MultiSelectionDefinition__Group_3_2__24179);
            rule__MultiSelectionDefinition__Group_3_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiSelectionDefinition__Group_3_2__2"


    // $ANTLR start "rule__MultiSelectionDefinition__Group_3_2__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2077:1: rule__MultiSelectionDefinition__Group_3_2__2__Impl : ( ( rule__MultiSelectionDefinition__Group_3_2_2__0 )? ) ;
    public final void rule__MultiSelectionDefinition__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2081:1: ( ( ( rule__MultiSelectionDefinition__Group_3_2_2__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2082:1: ( ( rule__MultiSelectionDefinition__Group_3_2_2__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2082:1: ( ( rule__MultiSelectionDefinition__Group_3_2_2__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2083:1: ( rule__MultiSelectionDefinition__Group_3_2_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getGroup_3_2_2()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2084:1: ( rule__MultiSelectionDefinition__Group_3_2_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2084:2: rule__MultiSelectionDefinition__Group_3_2_2__0
                    {
                    pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group_3_2_2__0_in_rule__MultiSelectionDefinition__Group_3_2__2__Impl4206);
                    rule__MultiSelectionDefinition__Group_3_2_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiSelectionDefinitionAccess().getGroup_3_2_2()); 
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
    // $ANTLR end "rule__MultiSelectionDefinition__Group_3_2__2__Impl"


    // $ANTLR start "rule__MultiSelectionDefinition__Group_3_2_2__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2100:1: rule__MultiSelectionDefinition__Group_3_2_2__0 : rule__MultiSelectionDefinition__Group_3_2_2__0__Impl rule__MultiSelectionDefinition__Group_3_2_2__1 ;
    public final void rule__MultiSelectionDefinition__Group_3_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2104:1: ( rule__MultiSelectionDefinition__Group_3_2_2__0__Impl rule__MultiSelectionDefinition__Group_3_2_2__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2105:2: rule__MultiSelectionDefinition__Group_3_2_2__0__Impl rule__MultiSelectionDefinition__Group_3_2_2__1
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group_3_2_2__0__Impl_in_rule__MultiSelectionDefinition__Group_3_2_2__04243);
            rule__MultiSelectionDefinition__Group_3_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group_3_2_2__1_in_rule__MultiSelectionDefinition__Group_3_2_2__04246);
            rule__MultiSelectionDefinition__Group_3_2_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiSelectionDefinition__Group_3_2_2__0"


    // $ANTLR start "rule__MultiSelectionDefinition__Group_3_2_2__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2112:1: rule__MultiSelectionDefinition__Group_3_2_2__0__Impl : ( 'selectedValues=' ) ;
    public final void rule__MultiSelectionDefinition__Group_3_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2116:1: ( ( 'selectedValues=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2117:1: ( 'selectedValues=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2117:1: ( 'selectedValues=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2118:1: 'selectedValues='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getSelectedValuesKeyword_3_2_2_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__MultiSelectionDefinition__Group_3_2_2__0__Impl4274); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiSelectionDefinitionAccess().getSelectedValuesKeyword_3_2_2_0()); 
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
    // $ANTLR end "rule__MultiSelectionDefinition__Group_3_2_2__0__Impl"


    // $ANTLR start "rule__MultiSelectionDefinition__Group_3_2_2__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2131:1: rule__MultiSelectionDefinition__Group_3_2_2__1 : rule__MultiSelectionDefinition__Group_3_2_2__1__Impl ;
    public final void rule__MultiSelectionDefinition__Group_3_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2135:1: ( rule__MultiSelectionDefinition__Group_3_2_2__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2136:2: rule__MultiSelectionDefinition__Group_3_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group_3_2_2__1__Impl_in_rule__MultiSelectionDefinition__Group_3_2_2__14305);
            rule__MultiSelectionDefinition__Group_3_2_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiSelectionDefinition__Group_3_2_2__1"


    // $ANTLR start "rule__MultiSelectionDefinition__Group_3_2_2__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2142:1: rule__MultiSelectionDefinition__Group_3_2_2__1__Impl : ( ( rule__MultiSelectionDefinition__SelectedValuesLocationAssignment_3_2_2_1 ) ) ;
    public final void rule__MultiSelectionDefinition__Group_3_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2146:1: ( ( ( rule__MultiSelectionDefinition__SelectedValuesLocationAssignment_3_2_2_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2147:1: ( ( rule__MultiSelectionDefinition__SelectedValuesLocationAssignment_3_2_2_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2147:1: ( ( rule__MultiSelectionDefinition__SelectedValuesLocationAssignment_3_2_2_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2148:1: ( rule__MultiSelectionDefinition__SelectedValuesLocationAssignment_3_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getSelectedValuesLocationAssignment_3_2_2_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2149:1: ( rule__MultiSelectionDefinition__SelectedValuesLocationAssignment_3_2_2_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2149:2: rule__MultiSelectionDefinition__SelectedValuesLocationAssignment_3_2_2_1
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__SelectedValuesLocationAssignment_3_2_2_1_in_rule__MultiSelectionDefinition__Group_3_2_2__1__Impl4332);
            rule__MultiSelectionDefinition__SelectedValuesLocationAssignment_3_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiSelectionDefinitionAccess().getSelectedValuesLocationAssignment_3_2_2_1()); 
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
    // $ANTLR end "rule__MultiSelectionDefinition__Group_3_2_2__1__Impl"


    // $ANTLR start "rule__CheckboxDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2163:1: rule__CheckboxDefinition__Group__0 : rule__CheckboxDefinition__Group__0__Impl rule__CheckboxDefinition__Group__1 ;
    public final void rule__CheckboxDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2167:1: ( rule__CheckboxDefinition__Group__0__Impl rule__CheckboxDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2168:2: rule__CheckboxDefinition__Group__0__Impl rule__CheckboxDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__CheckboxDefinition__Group__0__Impl_in_rule__CheckboxDefinition__Group__04366);
            rule__CheckboxDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CheckboxDefinition__Group__1_in_rule__CheckboxDefinition__Group__04369);
            rule__CheckboxDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2175:1: rule__CheckboxDefinition__Group__0__Impl : ( ( rule__CheckboxDefinition__TypeAssignment_0 ) ) ;
    public final void rule__CheckboxDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2179:1: ( ( ( rule__CheckboxDefinition__TypeAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2180:1: ( ( rule__CheckboxDefinition__TypeAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2180:1: ( ( rule__CheckboxDefinition__TypeAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2181:1: ( rule__CheckboxDefinition__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckboxDefinitionAccess().getTypeAssignment_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2182:1: ( rule__CheckboxDefinition__TypeAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2182:2: rule__CheckboxDefinition__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__CheckboxDefinition__TypeAssignment_0_in_rule__CheckboxDefinition__Group__0__Impl4396);
            rule__CheckboxDefinition__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCheckboxDefinitionAccess().getTypeAssignment_0()); 
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
    // $ANTLR end "rule__CheckboxDefinition__Group__0__Impl"


    // $ANTLR start "rule__CheckboxDefinition__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2192:1: rule__CheckboxDefinition__Group__1 : rule__CheckboxDefinition__Group__1__Impl rule__CheckboxDefinition__Group__2 ;
    public final void rule__CheckboxDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2196:1: ( rule__CheckboxDefinition__Group__1__Impl rule__CheckboxDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2197:2: rule__CheckboxDefinition__Group__1__Impl rule__CheckboxDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__CheckboxDefinition__Group__1__Impl_in_rule__CheckboxDefinition__Group__14426);
            rule__CheckboxDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CheckboxDefinition__Group__2_in_rule__CheckboxDefinition__Group__14429);
            rule__CheckboxDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2204:1: rule__CheckboxDefinition__Group__1__Impl : ( ' as ' ) ;
    public final void rule__CheckboxDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2208:1: ( ( ' as ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2209:1: ( ' as ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2209:1: ( ' as ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2210:1: ' as '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckboxDefinitionAccess().getAsKeyword_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__CheckboxDefinition__Group__1__Impl4457); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCheckboxDefinitionAccess().getAsKeyword_1()); 
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
    // $ANTLR end "rule__CheckboxDefinition__Group__1__Impl"


    // $ANTLR start "rule__CheckboxDefinition__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2223:1: rule__CheckboxDefinition__Group__2 : rule__CheckboxDefinition__Group__2__Impl rule__CheckboxDefinition__Group__3 ;
    public final void rule__CheckboxDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2227:1: ( rule__CheckboxDefinition__Group__2__Impl rule__CheckboxDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2228:2: rule__CheckboxDefinition__Group__2__Impl rule__CheckboxDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__CheckboxDefinition__Group__2__Impl_in_rule__CheckboxDefinition__Group__24488);
            rule__CheckboxDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CheckboxDefinition__Group__3_in_rule__CheckboxDefinition__Group__24491);
            rule__CheckboxDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2235:1: rule__CheckboxDefinition__Group__2__Impl : ( ( rule__CheckboxDefinition__NameAssignment_2 ) ) ;
    public final void rule__CheckboxDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2239:1: ( ( ( rule__CheckboxDefinition__NameAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2240:1: ( ( rule__CheckboxDefinition__NameAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2240:1: ( ( rule__CheckboxDefinition__NameAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2241:1: ( rule__CheckboxDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckboxDefinitionAccess().getNameAssignment_2()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2242:1: ( rule__CheckboxDefinition__NameAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2242:2: rule__CheckboxDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__CheckboxDefinition__NameAssignment_2_in_rule__CheckboxDefinition__Group__2__Impl4518);
            rule__CheckboxDefinition__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCheckboxDefinitionAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__CheckboxDefinition__Group__2__Impl"


    // $ANTLR start "rule__CheckboxDefinition__Group__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2252:1: rule__CheckboxDefinition__Group__3 : rule__CheckboxDefinition__Group__3__Impl rule__CheckboxDefinition__Group__4 ;
    public final void rule__CheckboxDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2256:1: ( rule__CheckboxDefinition__Group__3__Impl rule__CheckboxDefinition__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2257:2: rule__CheckboxDefinition__Group__3__Impl rule__CheckboxDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__CheckboxDefinition__Group__3__Impl_in_rule__CheckboxDefinition__Group__34548);
            rule__CheckboxDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CheckboxDefinition__Group__4_in_rule__CheckboxDefinition__Group__34551);
            rule__CheckboxDefinition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2264:1: rule__CheckboxDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__CheckboxDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2268:1: ( ( ':' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2269:1: ( ':' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2269:1: ( ':' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2270:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckboxDefinitionAccess().getColonKeyword_3()); 
            }
            match(input,28,FOLLOW_28_in_rule__CheckboxDefinition__Group__3__Impl4579); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCheckboxDefinitionAccess().getColonKeyword_3()); 
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
    // $ANTLR end "rule__CheckboxDefinition__Group__3__Impl"


    // $ANTLR start "rule__CheckboxDefinition__Group__4"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2283:1: rule__CheckboxDefinition__Group__4 : rule__CheckboxDefinition__Group__4__Impl ;
    public final void rule__CheckboxDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2287:1: ( rule__CheckboxDefinition__Group__4__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2288:2: rule__CheckboxDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CheckboxDefinition__Group__4__Impl_in_rule__CheckboxDefinition__Group__44610);
            rule__CheckboxDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2294:1: rule__CheckboxDefinition__Group__4__Impl : ( ( rule__CheckboxDefinition__Group_4__0 )? ) ;
    public final void rule__CheckboxDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2298:1: ( ( ( rule__CheckboxDefinition__Group_4__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2299:1: ( ( rule__CheckboxDefinition__Group_4__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2299:1: ( ( rule__CheckboxDefinition__Group_4__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2300:1: ( rule__CheckboxDefinition__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckboxDefinitionAccess().getGroup_4()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2301:1: ( rule__CheckboxDefinition__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2301:2: rule__CheckboxDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__CheckboxDefinition__Group_4__0_in_rule__CheckboxDefinition__Group__4__Impl4637);
                    rule__CheckboxDefinition__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCheckboxDefinitionAccess().getGroup_4()); 
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
    // $ANTLR end "rule__CheckboxDefinition__Group__4__Impl"


    // $ANTLR start "rule__CheckboxDefinition__Group_4__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2321:1: rule__CheckboxDefinition__Group_4__0 : rule__CheckboxDefinition__Group_4__0__Impl rule__CheckboxDefinition__Group_4__1 ;
    public final void rule__CheckboxDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2325:1: ( rule__CheckboxDefinition__Group_4__0__Impl rule__CheckboxDefinition__Group_4__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2326:2: rule__CheckboxDefinition__Group_4__0__Impl rule__CheckboxDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__CheckboxDefinition__Group_4__0__Impl_in_rule__CheckboxDefinition__Group_4__04678);
            rule__CheckboxDefinition__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CheckboxDefinition__Group_4__1_in_rule__CheckboxDefinition__Group_4__04681);
            rule__CheckboxDefinition__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2333:1: rule__CheckboxDefinition__Group_4__0__Impl : ( 'text=' ) ;
    public final void rule__CheckboxDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2337:1: ( ( 'text=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2338:1: ( 'text=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2338:1: ( 'text=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2339:1: 'text='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckboxDefinitionAccess().getTextKeyword_4_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__CheckboxDefinition__Group_4__0__Impl4709); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCheckboxDefinitionAccess().getTextKeyword_4_0()); 
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
    // $ANTLR end "rule__CheckboxDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__CheckboxDefinition__Group_4__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2352:1: rule__CheckboxDefinition__Group_4__1 : rule__CheckboxDefinition__Group_4__1__Impl ;
    public final void rule__CheckboxDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2356:1: ( rule__CheckboxDefinition__Group_4__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2357:2: rule__CheckboxDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__CheckboxDefinition__Group_4__1__Impl_in_rule__CheckboxDefinition__Group_4__14740);
            rule__CheckboxDefinition__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2363:1: rule__CheckboxDefinition__Group_4__1__Impl : ( ( rule__CheckboxDefinition__TextAssignment_4_1 ) ) ;
    public final void rule__CheckboxDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2367:1: ( ( ( rule__CheckboxDefinition__TextAssignment_4_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2368:1: ( ( rule__CheckboxDefinition__TextAssignment_4_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2368:1: ( ( rule__CheckboxDefinition__TextAssignment_4_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2369:1: ( rule__CheckboxDefinition__TextAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckboxDefinitionAccess().getTextAssignment_4_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2370:1: ( rule__CheckboxDefinition__TextAssignment_4_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2370:2: rule__CheckboxDefinition__TextAssignment_4_1
            {
            pushFollow(FOLLOW_rule__CheckboxDefinition__TextAssignment_4_1_in_rule__CheckboxDefinition__Group_4__1__Impl4767);
            rule__CheckboxDefinition__TextAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCheckboxDefinitionAccess().getTextAssignment_4_1()); 
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
    // $ANTLR end "rule__CheckboxDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__RadioboxDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2384:1: rule__RadioboxDefinition__Group__0 : rule__RadioboxDefinition__Group__0__Impl rule__RadioboxDefinition__Group__1 ;
    public final void rule__RadioboxDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2388:1: ( rule__RadioboxDefinition__Group__0__Impl rule__RadioboxDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2389:2: rule__RadioboxDefinition__Group__0__Impl rule__RadioboxDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__RadioboxDefinition__Group__0__Impl_in_rule__RadioboxDefinition__Group__04801);
            rule__RadioboxDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RadioboxDefinition__Group__1_in_rule__RadioboxDefinition__Group__04804);
            rule__RadioboxDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2396:1: rule__RadioboxDefinition__Group__0__Impl : ( ( rule__RadioboxDefinition__TypeAssignment_0 ) ) ;
    public final void rule__RadioboxDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2400:1: ( ( ( rule__RadioboxDefinition__TypeAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2401:1: ( ( rule__RadioboxDefinition__TypeAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2401:1: ( ( rule__RadioboxDefinition__TypeAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2402:1: ( rule__RadioboxDefinition__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRadioboxDefinitionAccess().getTypeAssignment_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2403:1: ( rule__RadioboxDefinition__TypeAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2403:2: rule__RadioboxDefinition__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__RadioboxDefinition__TypeAssignment_0_in_rule__RadioboxDefinition__Group__0__Impl4831);
            rule__RadioboxDefinition__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRadioboxDefinitionAccess().getTypeAssignment_0()); 
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
    // $ANTLR end "rule__RadioboxDefinition__Group__0__Impl"


    // $ANTLR start "rule__RadioboxDefinition__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2413:1: rule__RadioboxDefinition__Group__1 : rule__RadioboxDefinition__Group__1__Impl rule__RadioboxDefinition__Group__2 ;
    public final void rule__RadioboxDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2417:1: ( rule__RadioboxDefinition__Group__1__Impl rule__RadioboxDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2418:2: rule__RadioboxDefinition__Group__1__Impl rule__RadioboxDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__RadioboxDefinition__Group__1__Impl_in_rule__RadioboxDefinition__Group__14861);
            rule__RadioboxDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RadioboxDefinition__Group__2_in_rule__RadioboxDefinition__Group__14864);
            rule__RadioboxDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2425:1: rule__RadioboxDefinition__Group__1__Impl : ( ' as ' ) ;
    public final void rule__RadioboxDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2429:1: ( ( ' as ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2430:1: ( ' as ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2430:1: ( ' as ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2431:1: ' as '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRadioboxDefinitionAccess().getAsKeyword_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__RadioboxDefinition__Group__1__Impl4892); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRadioboxDefinitionAccess().getAsKeyword_1()); 
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
    // $ANTLR end "rule__RadioboxDefinition__Group__1__Impl"


    // $ANTLR start "rule__RadioboxDefinition__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2444:1: rule__RadioboxDefinition__Group__2 : rule__RadioboxDefinition__Group__2__Impl rule__RadioboxDefinition__Group__3 ;
    public final void rule__RadioboxDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2448:1: ( rule__RadioboxDefinition__Group__2__Impl rule__RadioboxDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2449:2: rule__RadioboxDefinition__Group__2__Impl rule__RadioboxDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__RadioboxDefinition__Group__2__Impl_in_rule__RadioboxDefinition__Group__24923);
            rule__RadioboxDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RadioboxDefinition__Group__3_in_rule__RadioboxDefinition__Group__24926);
            rule__RadioboxDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2456:1: rule__RadioboxDefinition__Group__2__Impl : ( ( rule__RadioboxDefinition__NameAssignment_2 ) ) ;
    public final void rule__RadioboxDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2460:1: ( ( ( rule__RadioboxDefinition__NameAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2461:1: ( ( rule__RadioboxDefinition__NameAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2461:1: ( ( rule__RadioboxDefinition__NameAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2462:1: ( rule__RadioboxDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRadioboxDefinitionAccess().getNameAssignment_2()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2463:1: ( rule__RadioboxDefinition__NameAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2463:2: rule__RadioboxDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__RadioboxDefinition__NameAssignment_2_in_rule__RadioboxDefinition__Group__2__Impl4953);
            rule__RadioboxDefinition__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRadioboxDefinitionAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__RadioboxDefinition__Group__2__Impl"


    // $ANTLR start "rule__RadioboxDefinition__Group__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2473:1: rule__RadioboxDefinition__Group__3 : rule__RadioboxDefinition__Group__3__Impl rule__RadioboxDefinition__Group__4 ;
    public final void rule__RadioboxDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2477:1: ( rule__RadioboxDefinition__Group__3__Impl rule__RadioboxDefinition__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2478:2: rule__RadioboxDefinition__Group__3__Impl rule__RadioboxDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__RadioboxDefinition__Group__3__Impl_in_rule__RadioboxDefinition__Group__34983);
            rule__RadioboxDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RadioboxDefinition__Group__4_in_rule__RadioboxDefinition__Group__34986);
            rule__RadioboxDefinition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2485:1: rule__RadioboxDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__RadioboxDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2489:1: ( ( ':' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2490:1: ( ':' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2490:1: ( ':' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2491:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRadioboxDefinitionAccess().getColonKeyword_3()); 
            }
            match(input,28,FOLLOW_28_in_rule__RadioboxDefinition__Group__3__Impl5014); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRadioboxDefinitionAccess().getColonKeyword_3()); 
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
    // $ANTLR end "rule__RadioboxDefinition__Group__3__Impl"


    // $ANTLR start "rule__RadioboxDefinition__Group__4"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2504:1: rule__RadioboxDefinition__Group__4 : rule__RadioboxDefinition__Group__4__Impl ;
    public final void rule__RadioboxDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2508:1: ( rule__RadioboxDefinition__Group__4__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2509:2: rule__RadioboxDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__RadioboxDefinition__Group__4__Impl_in_rule__RadioboxDefinition__Group__45045);
            rule__RadioboxDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2515:1: rule__RadioboxDefinition__Group__4__Impl : ( ( rule__RadioboxDefinition__Group_4__0 )? ) ;
    public final void rule__RadioboxDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2519:1: ( ( ( rule__RadioboxDefinition__Group_4__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2520:1: ( ( rule__RadioboxDefinition__Group_4__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2520:1: ( ( rule__RadioboxDefinition__Group_4__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2521:1: ( rule__RadioboxDefinition__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRadioboxDefinitionAccess().getGroup_4()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2522:1: ( rule__RadioboxDefinition__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2522:2: rule__RadioboxDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__RadioboxDefinition__Group_4__0_in_rule__RadioboxDefinition__Group__4__Impl5072);
                    rule__RadioboxDefinition__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRadioboxDefinitionAccess().getGroup_4()); 
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
    // $ANTLR end "rule__RadioboxDefinition__Group__4__Impl"


    // $ANTLR start "rule__RadioboxDefinition__Group_4__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2542:1: rule__RadioboxDefinition__Group_4__0 : rule__RadioboxDefinition__Group_4__0__Impl rule__RadioboxDefinition__Group_4__1 ;
    public final void rule__RadioboxDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2546:1: ( rule__RadioboxDefinition__Group_4__0__Impl rule__RadioboxDefinition__Group_4__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2547:2: rule__RadioboxDefinition__Group_4__0__Impl rule__RadioboxDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__RadioboxDefinition__Group_4__0__Impl_in_rule__RadioboxDefinition__Group_4__05113);
            rule__RadioboxDefinition__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RadioboxDefinition__Group_4__1_in_rule__RadioboxDefinition__Group_4__05116);
            rule__RadioboxDefinition__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2554:1: rule__RadioboxDefinition__Group_4__0__Impl : ( 'text=' ) ;
    public final void rule__RadioboxDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2558:1: ( ( 'text=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2559:1: ( 'text=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2559:1: ( 'text=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2560:1: 'text='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRadioboxDefinitionAccess().getTextKeyword_4_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__RadioboxDefinition__Group_4__0__Impl5144); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRadioboxDefinitionAccess().getTextKeyword_4_0()); 
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
    // $ANTLR end "rule__RadioboxDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__RadioboxDefinition__Group_4__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2573:1: rule__RadioboxDefinition__Group_4__1 : rule__RadioboxDefinition__Group_4__1__Impl ;
    public final void rule__RadioboxDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2577:1: ( rule__RadioboxDefinition__Group_4__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2578:2: rule__RadioboxDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__RadioboxDefinition__Group_4__1__Impl_in_rule__RadioboxDefinition__Group_4__15175);
            rule__RadioboxDefinition__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2584:1: rule__RadioboxDefinition__Group_4__1__Impl : ( ( rule__RadioboxDefinition__TextAssignment_4_1 ) ) ;
    public final void rule__RadioboxDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2588:1: ( ( ( rule__RadioboxDefinition__TextAssignment_4_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2589:1: ( ( rule__RadioboxDefinition__TextAssignment_4_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2589:1: ( ( rule__RadioboxDefinition__TextAssignment_4_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2590:1: ( rule__RadioboxDefinition__TextAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRadioboxDefinitionAccess().getTextAssignment_4_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2591:1: ( rule__RadioboxDefinition__TextAssignment_4_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2591:2: rule__RadioboxDefinition__TextAssignment_4_1
            {
            pushFollow(FOLLOW_rule__RadioboxDefinition__TextAssignment_4_1_in_rule__RadioboxDefinition__Group_4__1__Impl5202);
            rule__RadioboxDefinition__TextAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRadioboxDefinitionAccess().getTextAssignment_4_1()); 
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
    // $ANTLR end "rule__RadioboxDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__TableDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2605:1: rule__TableDefinition__Group__0 : rule__TableDefinition__Group__0__Impl rule__TableDefinition__Group__1 ;
    public final void rule__TableDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2609:1: ( rule__TableDefinition__Group__0__Impl rule__TableDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2610:2: rule__TableDefinition__Group__0__Impl rule__TableDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group__0__Impl_in_rule__TableDefinition__Group__05236);
            rule__TableDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TableDefinition__Group__1_in_rule__TableDefinition__Group__05239);
            rule__TableDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2617:1: rule__TableDefinition__Group__0__Impl : ( ( rule__TableDefinition__TypeAssignment_0 ) ) ;
    public final void rule__TableDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2621:1: ( ( ( rule__TableDefinition__TypeAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2622:1: ( ( rule__TableDefinition__TypeAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2622:1: ( ( rule__TableDefinition__TypeAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2623:1: ( rule__TableDefinition__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableDefinitionAccess().getTypeAssignment_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2624:1: ( rule__TableDefinition__TypeAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2624:2: rule__TableDefinition__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__TableDefinition__TypeAssignment_0_in_rule__TableDefinition__Group__0__Impl5266);
            rule__TableDefinition__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableDefinitionAccess().getTypeAssignment_0()); 
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
    // $ANTLR end "rule__TableDefinition__Group__0__Impl"


    // $ANTLR start "rule__TableDefinition__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2634:1: rule__TableDefinition__Group__1 : rule__TableDefinition__Group__1__Impl rule__TableDefinition__Group__2 ;
    public final void rule__TableDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2638:1: ( rule__TableDefinition__Group__1__Impl rule__TableDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2639:2: rule__TableDefinition__Group__1__Impl rule__TableDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group__1__Impl_in_rule__TableDefinition__Group__15296);
            rule__TableDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TableDefinition__Group__2_in_rule__TableDefinition__Group__15299);
            rule__TableDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2646:1: rule__TableDefinition__Group__1__Impl : ( ' as ' ) ;
    public final void rule__TableDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2650:1: ( ( ' as ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2651:1: ( ' as ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2651:1: ( ' as ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2652:1: ' as '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableDefinitionAccess().getAsKeyword_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__TableDefinition__Group__1__Impl5327); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableDefinitionAccess().getAsKeyword_1()); 
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
    // $ANTLR end "rule__TableDefinition__Group__1__Impl"


    // $ANTLR start "rule__TableDefinition__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2665:1: rule__TableDefinition__Group__2 : rule__TableDefinition__Group__2__Impl rule__TableDefinition__Group__3 ;
    public final void rule__TableDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2669:1: ( rule__TableDefinition__Group__2__Impl rule__TableDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2670:2: rule__TableDefinition__Group__2__Impl rule__TableDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group__2__Impl_in_rule__TableDefinition__Group__25358);
            rule__TableDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TableDefinition__Group__3_in_rule__TableDefinition__Group__25361);
            rule__TableDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2677:1: rule__TableDefinition__Group__2__Impl : ( ( rule__TableDefinition__NameAssignment_2 ) ) ;
    public final void rule__TableDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2681:1: ( ( ( rule__TableDefinition__NameAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2682:1: ( ( rule__TableDefinition__NameAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2682:1: ( ( rule__TableDefinition__NameAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2683:1: ( rule__TableDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableDefinitionAccess().getNameAssignment_2()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2684:1: ( rule__TableDefinition__NameAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2684:2: rule__TableDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__TableDefinition__NameAssignment_2_in_rule__TableDefinition__Group__2__Impl5388);
            rule__TableDefinition__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableDefinitionAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__TableDefinition__Group__2__Impl"


    // $ANTLR start "rule__TableDefinition__Group__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2694:1: rule__TableDefinition__Group__3 : rule__TableDefinition__Group__3__Impl rule__TableDefinition__Group__4 ;
    public final void rule__TableDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2698:1: ( rule__TableDefinition__Group__3__Impl rule__TableDefinition__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2699:2: rule__TableDefinition__Group__3__Impl rule__TableDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group__3__Impl_in_rule__TableDefinition__Group__35418);
            rule__TableDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TableDefinition__Group__4_in_rule__TableDefinition__Group__35421);
            rule__TableDefinition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2706:1: rule__TableDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__TableDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2710:1: ( ( ':' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2711:1: ( ':' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2711:1: ( ':' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2712:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableDefinitionAccess().getColonKeyword_3()); 
            }
            match(input,28,FOLLOW_28_in_rule__TableDefinition__Group__3__Impl5449); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableDefinitionAccess().getColonKeyword_3()); 
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
    // $ANTLR end "rule__TableDefinition__Group__3__Impl"


    // $ANTLR start "rule__TableDefinition__Group__4"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2725:1: rule__TableDefinition__Group__4 : rule__TableDefinition__Group__4__Impl ;
    public final void rule__TableDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2729:1: ( rule__TableDefinition__Group__4__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2730:2: rule__TableDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group__4__Impl_in_rule__TableDefinition__Group__45480);
            rule__TableDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2736:1: rule__TableDefinition__Group__4__Impl : ( ( rule__TableDefinition__Group_4__0 )? ) ;
    public final void rule__TableDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2740:1: ( ( ( rule__TableDefinition__Group_4__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2741:1: ( ( rule__TableDefinition__Group_4__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2741:1: ( ( rule__TableDefinition__Group_4__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2742:1: ( rule__TableDefinition__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableDefinitionAccess().getGroup_4()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2743:1: ( rule__TableDefinition__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2743:2: rule__TableDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__TableDefinition__Group_4__0_in_rule__TableDefinition__Group__4__Impl5507);
                    rule__TableDefinition__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableDefinitionAccess().getGroup_4()); 
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
    // $ANTLR end "rule__TableDefinition__Group__4__Impl"


    // $ANTLR start "rule__TableDefinition__Group_4__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2763:1: rule__TableDefinition__Group_4__0 : rule__TableDefinition__Group_4__0__Impl rule__TableDefinition__Group_4__1 ;
    public final void rule__TableDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2767:1: ( rule__TableDefinition__Group_4__0__Impl rule__TableDefinition__Group_4__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2768:2: rule__TableDefinition__Group_4__0__Impl rule__TableDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group_4__0__Impl_in_rule__TableDefinition__Group_4__05548);
            rule__TableDefinition__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TableDefinition__Group_4__1_in_rule__TableDefinition__Group_4__05551);
            rule__TableDefinition__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2775:1: rule__TableDefinition__Group_4__0__Impl : ( 'text=' ) ;
    public final void rule__TableDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2779:1: ( ( 'text=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2780:1: ( 'text=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2780:1: ( 'text=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2781:1: 'text='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableDefinitionAccess().getTextKeyword_4_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__TableDefinition__Group_4__0__Impl5579); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableDefinitionAccess().getTextKeyword_4_0()); 
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
    // $ANTLR end "rule__TableDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__TableDefinition__Group_4__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2794:1: rule__TableDefinition__Group_4__1 : rule__TableDefinition__Group_4__1__Impl ;
    public final void rule__TableDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2798:1: ( rule__TableDefinition__Group_4__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2799:2: rule__TableDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group_4__1__Impl_in_rule__TableDefinition__Group_4__15610);
            rule__TableDefinition__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2805:1: rule__TableDefinition__Group_4__1__Impl : ( ( rule__TableDefinition__TextAssignment_4_1 ) ) ;
    public final void rule__TableDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2809:1: ( ( ( rule__TableDefinition__TextAssignment_4_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2810:1: ( ( rule__TableDefinition__TextAssignment_4_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2810:1: ( ( rule__TableDefinition__TextAssignment_4_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2811:1: ( rule__TableDefinition__TextAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableDefinitionAccess().getTextAssignment_4_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2812:1: ( rule__TableDefinition__TextAssignment_4_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2812:2: rule__TableDefinition__TextAssignment_4_1
            {
            pushFollow(FOLLOW_rule__TableDefinition__TextAssignment_4_1_in_rule__TableDefinition__Group_4__1__Impl5637);
            rule__TableDefinition__TextAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableDefinitionAccess().getTextAssignment_4_1()); 
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
    // $ANTLR end "rule__TableDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__TreeDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2826:1: rule__TreeDefinition__Group__0 : rule__TreeDefinition__Group__0__Impl rule__TreeDefinition__Group__1 ;
    public final void rule__TreeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2830:1: ( rule__TreeDefinition__Group__0__Impl rule__TreeDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2831:2: rule__TreeDefinition__Group__0__Impl rule__TreeDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group__0__Impl_in_rule__TreeDefinition__Group__05671);
            rule__TreeDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TreeDefinition__Group__1_in_rule__TreeDefinition__Group__05674);
            rule__TreeDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2838:1: rule__TreeDefinition__Group__0__Impl : ( ( rule__TreeDefinition__TypeAssignment_0 ) ) ;
    public final void rule__TreeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2842:1: ( ( ( rule__TreeDefinition__TypeAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2843:1: ( ( rule__TreeDefinition__TypeAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2843:1: ( ( rule__TreeDefinition__TypeAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2844:1: ( rule__TreeDefinition__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTreeDefinitionAccess().getTypeAssignment_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2845:1: ( rule__TreeDefinition__TypeAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2845:2: rule__TreeDefinition__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__TreeDefinition__TypeAssignment_0_in_rule__TreeDefinition__Group__0__Impl5701);
            rule__TreeDefinition__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTreeDefinitionAccess().getTypeAssignment_0()); 
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
    // $ANTLR end "rule__TreeDefinition__Group__0__Impl"


    // $ANTLR start "rule__TreeDefinition__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2855:1: rule__TreeDefinition__Group__1 : rule__TreeDefinition__Group__1__Impl rule__TreeDefinition__Group__2 ;
    public final void rule__TreeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2859:1: ( rule__TreeDefinition__Group__1__Impl rule__TreeDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2860:2: rule__TreeDefinition__Group__1__Impl rule__TreeDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group__1__Impl_in_rule__TreeDefinition__Group__15731);
            rule__TreeDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TreeDefinition__Group__2_in_rule__TreeDefinition__Group__15734);
            rule__TreeDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2867:1: rule__TreeDefinition__Group__1__Impl : ( ' as ' ) ;
    public final void rule__TreeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2871:1: ( ( ' as ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2872:1: ( ' as ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2872:1: ( ' as ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2873:1: ' as '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTreeDefinitionAccess().getAsKeyword_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__TreeDefinition__Group__1__Impl5762); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTreeDefinitionAccess().getAsKeyword_1()); 
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
    // $ANTLR end "rule__TreeDefinition__Group__1__Impl"


    // $ANTLR start "rule__TreeDefinition__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2886:1: rule__TreeDefinition__Group__2 : rule__TreeDefinition__Group__2__Impl rule__TreeDefinition__Group__3 ;
    public final void rule__TreeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2890:1: ( rule__TreeDefinition__Group__2__Impl rule__TreeDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2891:2: rule__TreeDefinition__Group__2__Impl rule__TreeDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group__2__Impl_in_rule__TreeDefinition__Group__25793);
            rule__TreeDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TreeDefinition__Group__3_in_rule__TreeDefinition__Group__25796);
            rule__TreeDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2898:1: rule__TreeDefinition__Group__2__Impl : ( ( rule__TreeDefinition__NameAssignment_2 ) ) ;
    public final void rule__TreeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2902:1: ( ( ( rule__TreeDefinition__NameAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2903:1: ( ( rule__TreeDefinition__NameAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2903:1: ( ( rule__TreeDefinition__NameAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2904:1: ( rule__TreeDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTreeDefinitionAccess().getNameAssignment_2()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2905:1: ( rule__TreeDefinition__NameAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2905:2: rule__TreeDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__TreeDefinition__NameAssignment_2_in_rule__TreeDefinition__Group__2__Impl5823);
            rule__TreeDefinition__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTreeDefinitionAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__TreeDefinition__Group__2__Impl"


    // $ANTLR start "rule__TreeDefinition__Group__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2915:1: rule__TreeDefinition__Group__3 : rule__TreeDefinition__Group__3__Impl rule__TreeDefinition__Group__4 ;
    public final void rule__TreeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2919:1: ( rule__TreeDefinition__Group__3__Impl rule__TreeDefinition__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2920:2: rule__TreeDefinition__Group__3__Impl rule__TreeDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group__3__Impl_in_rule__TreeDefinition__Group__35853);
            rule__TreeDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TreeDefinition__Group__4_in_rule__TreeDefinition__Group__35856);
            rule__TreeDefinition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2927:1: rule__TreeDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__TreeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2931:1: ( ( ':' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2932:1: ( ':' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2932:1: ( ':' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2933:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTreeDefinitionAccess().getColonKeyword_3()); 
            }
            match(input,28,FOLLOW_28_in_rule__TreeDefinition__Group__3__Impl5884); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTreeDefinitionAccess().getColonKeyword_3()); 
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
    // $ANTLR end "rule__TreeDefinition__Group__3__Impl"


    // $ANTLR start "rule__TreeDefinition__Group__4"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2946:1: rule__TreeDefinition__Group__4 : rule__TreeDefinition__Group__4__Impl ;
    public final void rule__TreeDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2950:1: ( rule__TreeDefinition__Group__4__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2951:2: rule__TreeDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group__4__Impl_in_rule__TreeDefinition__Group__45915);
            rule__TreeDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2957:1: rule__TreeDefinition__Group__4__Impl : ( ( rule__TreeDefinition__Group_4__0 )? ) ;
    public final void rule__TreeDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2961:1: ( ( ( rule__TreeDefinition__Group_4__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2962:1: ( ( rule__TreeDefinition__Group_4__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2962:1: ( ( rule__TreeDefinition__Group_4__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2963:1: ( rule__TreeDefinition__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTreeDefinitionAccess().getGroup_4()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2964:1: ( rule__TreeDefinition__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2964:2: rule__TreeDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__TreeDefinition__Group_4__0_in_rule__TreeDefinition__Group__4__Impl5942);
                    rule__TreeDefinition__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTreeDefinitionAccess().getGroup_4()); 
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
    // $ANTLR end "rule__TreeDefinition__Group__4__Impl"


    // $ANTLR start "rule__TreeDefinition__Group_4__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2984:1: rule__TreeDefinition__Group_4__0 : rule__TreeDefinition__Group_4__0__Impl rule__TreeDefinition__Group_4__1 ;
    public final void rule__TreeDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2988:1: ( rule__TreeDefinition__Group_4__0__Impl rule__TreeDefinition__Group_4__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2989:2: rule__TreeDefinition__Group_4__0__Impl rule__TreeDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group_4__0__Impl_in_rule__TreeDefinition__Group_4__05983);
            rule__TreeDefinition__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TreeDefinition__Group_4__1_in_rule__TreeDefinition__Group_4__05986);
            rule__TreeDefinition__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2996:1: rule__TreeDefinition__Group_4__0__Impl : ( 'text=' ) ;
    public final void rule__TreeDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3000:1: ( ( 'text=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3001:1: ( 'text=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3001:1: ( 'text=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3002:1: 'text='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTreeDefinitionAccess().getTextKeyword_4_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__TreeDefinition__Group_4__0__Impl6014); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTreeDefinitionAccess().getTextKeyword_4_0()); 
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
    // $ANTLR end "rule__TreeDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__TreeDefinition__Group_4__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3015:1: rule__TreeDefinition__Group_4__1 : rule__TreeDefinition__Group_4__1__Impl ;
    public final void rule__TreeDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3019:1: ( rule__TreeDefinition__Group_4__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3020:2: rule__TreeDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group_4__1__Impl_in_rule__TreeDefinition__Group_4__16045);
            rule__TreeDefinition__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3026:1: rule__TreeDefinition__Group_4__1__Impl : ( ( rule__TreeDefinition__TextAssignment_4_1 ) ) ;
    public final void rule__TreeDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3030:1: ( ( ( rule__TreeDefinition__TextAssignment_4_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3031:1: ( ( rule__TreeDefinition__TextAssignment_4_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3031:1: ( ( rule__TreeDefinition__TextAssignment_4_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3032:1: ( rule__TreeDefinition__TextAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTreeDefinitionAccess().getTextAssignment_4_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3033:1: ( rule__TreeDefinition__TextAssignment_4_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3033:2: rule__TreeDefinition__TextAssignment_4_1
            {
            pushFollow(FOLLOW_rule__TreeDefinition__TextAssignment_4_1_in_rule__TreeDefinition__Group_4__1__Impl6072);
            rule__TreeDefinition__TextAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTreeDefinitionAccess().getTextAssignment_4_1()); 
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
    // $ANTLR end "rule__TreeDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__TextfieldDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3047:1: rule__TextfieldDefinition__Group__0 : rule__TextfieldDefinition__Group__0__Impl rule__TextfieldDefinition__Group__1 ;
    public final void rule__TextfieldDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3051:1: ( rule__TextfieldDefinition__Group__0__Impl rule__TextfieldDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3052:2: rule__TextfieldDefinition__Group__0__Impl rule__TextfieldDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__0__Impl_in_rule__TextfieldDefinition__Group__06106);
            rule__TextfieldDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__1_in_rule__TextfieldDefinition__Group__06109);
            rule__TextfieldDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3059:1: rule__TextfieldDefinition__Group__0__Impl : ( ( rule__TextfieldDefinition__TypeAssignment_0 ) ) ;
    public final void rule__TextfieldDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3063:1: ( ( ( rule__TextfieldDefinition__TypeAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3064:1: ( ( rule__TextfieldDefinition__TypeAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3064:1: ( ( rule__TextfieldDefinition__TypeAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3065:1: ( rule__TextfieldDefinition__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextfieldDefinitionAccess().getTypeAssignment_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3066:1: ( rule__TextfieldDefinition__TypeAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3066:2: rule__TextfieldDefinition__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__TypeAssignment_0_in_rule__TextfieldDefinition__Group__0__Impl6136);
            rule__TextfieldDefinition__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextfieldDefinitionAccess().getTypeAssignment_0()); 
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
    // $ANTLR end "rule__TextfieldDefinition__Group__0__Impl"


    // $ANTLR start "rule__TextfieldDefinition__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3076:1: rule__TextfieldDefinition__Group__1 : rule__TextfieldDefinition__Group__1__Impl rule__TextfieldDefinition__Group__2 ;
    public final void rule__TextfieldDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3080:1: ( rule__TextfieldDefinition__Group__1__Impl rule__TextfieldDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3081:2: rule__TextfieldDefinition__Group__1__Impl rule__TextfieldDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__1__Impl_in_rule__TextfieldDefinition__Group__16166);
            rule__TextfieldDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__2_in_rule__TextfieldDefinition__Group__16169);
            rule__TextfieldDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3088:1: rule__TextfieldDefinition__Group__1__Impl : ( ' as ' ) ;
    public final void rule__TextfieldDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3092:1: ( ( ' as ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3093:1: ( ' as ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3093:1: ( ' as ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3094:1: ' as '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextfieldDefinitionAccess().getAsKeyword_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__TextfieldDefinition__Group__1__Impl6197); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextfieldDefinitionAccess().getAsKeyword_1()); 
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
    // $ANTLR end "rule__TextfieldDefinition__Group__1__Impl"


    // $ANTLR start "rule__TextfieldDefinition__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3107:1: rule__TextfieldDefinition__Group__2 : rule__TextfieldDefinition__Group__2__Impl rule__TextfieldDefinition__Group__3 ;
    public final void rule__TextfieldDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3111:1: ( rule__TextfieldDefinition__Group__2__Impl rule__TextfieldDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3112:2: rule__TextfieldDefinition__Group__2__Impl rule__TextfieldDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__2__Impl_in_rule__TextfieldDefinition__Group__26228);
            rule__TextfieldDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__3_in_rule__TextfieldDefinition__Group__26231);
            rule__TextfieldDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3119:1: rule__TextfieldDefinition__Group__2__Impl : ( ( rule__TextfieldDefinition__NameAssignment_2 ) ) ;
    public final void rule__TextfieldDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3123:1: ( ( ( rule__TextfieldDefinition__NameAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3124:1: ( ( rule__TextfieldDefinition__NameAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3124:1: ( ( rule__TextfieldDefinition__NameAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3125:1: ( rule__TextfieldDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextfieldDefinitionAccess().getNameAssignment_2()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3126:1: ( rule__TextfieldDefinition__NameAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3126:2: rule__TextfieldDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__NameAssignment_2_in_rule__TextfieldDefinition__Group__2__Impl6258);
            rule__TextfieldDefinition__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextfieldDefinitionAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__TextfieldDefinition__Group__2__Impl"


    // $ANTLR start "rule__TextfieldDefinition__Group__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3136:1: rule__TextfieldDefinition__Group__3 : rule__TextfieldDefinition__Group__3__Impl rule__TextfieldDefinition__Group__4 ;
    public final void rule__TextfieldDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3140:1: ( rule__TextfieldDefinition__Group__3__Impl rule__TextfieldDefinition__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3141:2: rule__TextfieldDefinition__Group__3__Impl rule__TextfieldDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__3__Impl_in_rule__TextfieldDefinition__Group__36288);
            rule__TextfieldDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__4_in_rule__TextfieldDefinition__Group__36291);
            rule__TextfieldDefinition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3148:1: rule__TextfieldDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__TextfieldDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3152:1: ( ( ':' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3153:1: ( ':' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3153:1: ( ':' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3154:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextfieldDefinitionAccess().getColonKeyword_3()); 
            }
            match(input,28,FOLLOW_28_in_rule__TextfieldDefinition__Group__3__Impl6319); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextfieldDefinitionAccess().getColonKeyword_3()); 
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
    // $ANTLR end "rule__TextfieldDefinition__Group__3__Impl"


    // $ANTLR start "rule__TextfieldDefinition__Group__4"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3167:1: rule__TextfieldDefinition__Group__4 : rule__TextfieldDefinition__Group__4__Impl ;
    public final void rule__TextfieldDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3171:1: ( rule__TextfieldDefinition__Group__4__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3172:2: rule__TextfieldDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__4__Impl_in_rule__TextfieldDefinition__Group__46350);
            rule__TextfieldDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3178:1: rule__TextfieldDefinition__Group__4__Impl : ( ( rule__TextfieldDefinition__Group_4__0 )? ) ;
    public final void rule__TextfieldDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3182:1: ( ( ( rule__TextfieldDefinition__Group_4__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3183:1: ( ( rule__TextfieldDefinition__Group_4__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3183:1: ( ( rule__TextfieldDefinition__Group_4__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3184:1: ( rule__TextfieldDefinition__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextfieldDefinitionAccess().getGroup_4()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3185:1: ( rule__TextfieldDefinition__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3185:2: rule__TextfieldDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__TextfieldDefinition__Group_4__0_in_rule__TextfieldDefinition__Group__4__Impl6377);
                    rule__TextfieldDefinition__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextfieldDefinitionAccess().getGroup_4()); 
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
    // $ANTLR end "rule__TextfieldDefinition__Group__4__Impl"


    // $ANTLR start "rule__TextfieldDefinition__Group_4__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3205:1: rule__TextfieldDefinition__Group_4__0 : rule__TextfieldDefinition__Group_4__0__Impl rule__TextfieldDefinition__Group_4__1 ;
    public final void rule__TextfieldDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3209:1: ( rule__TextfieldDefinition__Group_4__0__Impl rule__TextfieldDefinition__Group_4__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3210:2: rule__TextfieldDefinition__Group_4__0__Impl rule__TextfieldDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group_4__0__Impl_in_rule__TextfieldDefinition__Group_4__06418);
            rule__TextfieldDefinition__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group_4__1_in_rule__TextfieldDefinition__Group_4__06421);
            rule__TextfieldDefinition__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3217:1: rule__TextfieldDefinition__Group_4__0__Impl : ( 'text=' ) ;
    public final void rule__TextfieldDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3221:1: ( ( 'text=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3222:1: ( 'text=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3222:1: ( 'text=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3223:1: 'text='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextfieldDefinitionAccess().getTextKeyword_4_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__TextfieldDefinition__Group_4__0__Impl6449); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextfieldDefinitionAccess().getTextKeyword_4_0()); 
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
    // $ANTLR end "rule__TextfieldDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__TextfieldDefinition__Group_4__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3236:1: rule__TextfieldDefinition__Group_4__1 : rule__TextfieldDefinition__Group_4__1__Impl ;
    public final void rule__TextfieldDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3240:1: ( rule__TextfieldDefinition__Group_4__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3241:2: rule__TextfieldDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group_4__1__Impl_in_rule__TextfieldDefinition__Group_4__16480);
            rule__TextfieldDefinition__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3247:1: rule__TextfieldDefinition__Group_4__1__Impl : ( ( rule__TextfieldDefinition__TextAssignment_4_1 ) ) ;
    public final void rule__TextfieldDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3251:1: ( ( ( rule__TextfieldDefinition__TextAssignment_4_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3252:1: ( ( rule__TextfieldDefinition__TextAssignment_4_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3252:1: ( ( rule__TextfieldDefinition__TextAssignment_4_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3253:1: ( rule__TextfieldDefinition__TextAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextfieldDefinitionAccess().getTextAssignment_4_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3254:1: ( rule__TextfieldDefinition__TextAssignment_4_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3254:2: rule__TextfieldDefinition__TextAssignment_4_1
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__TextAssignment_4_1_in_rule__TextfieldDefinition__Group_4__1__Impl6507);
            rule__TextfieldDefinition__TextAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextfieldDefinitionAccess().getTextAssignment_4_1()); 
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
    // $ANTLR end "rule__TextfieldDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__ButtonDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3268:1: rule__ButtonDefinition__Group__0 : rule__ButtonDefinition__Group__0__Impl rule__ButtonDefinition__Group__1 ;
    public final void rule__ButtonDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3272:1: ( rule__ButtonDefinition__Group__0__Impl rule__ButtonDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3273:2: rule__ButtonDefinition__Group__0__Impl rule__ButtonDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__0__Impl_in_rule__ButtonDefinition__Group__06541);
            rule__ButtonDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__1_in_rule__ButtonDefinition__Group__06544);
            rule__ButtonDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3280:1: rule__ButtonDefinition__Group__0__Impl : ( ( rule__ButtonDefinition__TypeAssignment_0 ) ) ;
    public final void rule__ButtonDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3284:1: ( ( ( rule__ButtonDefinition__TypeAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3285:1: ( ( rule__ButtonDefinition__TypeAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3285:1: ( ( rule__ButtonDefinition__TypeAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3286:1: ( rule__ButtonDefinition__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonDefinitionAccess().getTypeAssignment_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3287:1: ( rule__ButtonDefinition__TypeAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3287:2: rule__ButtonDefinition__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__TypeAssignment_0_in_rule__ButtonDefinition__Group__0__Impl6571);
            rule__ButtonDefinition__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonDefinitionAccess().getTypeAssignment_0()); 
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
    // $ANTLR end "rule__ButtonDefinition__Group__0__Impl"


    // $ANTLR start "rule__ButtonDefinition__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3297:1: rule__ButtonDefinition__Group__1 : rule__ButtonDefinition__Group__1__Impl rule__ButtonDefinition__Group__2 ;
    public final void rule__ButtonDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3301:1: ( rule__ButtonDefinition__Group__1__Impl rule__ButtonDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3302:2: rule__ButtonDefinition__Group__1__Impl rule__ButtonDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__1__Impl_in_rule__ButtonDefinition__Group__16601);
            rule__ButtonDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__2_in_rule__ButtonDefinition__Group__16604);
            rule__ButtonDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3309:1: rule__ButtonDefinition__Group__1__Impl : ( ' as ' ) ;
    public final void rule__ButtonDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3313:1: ( ( ' as ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3314:1: ( ' as ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3314:1: ( ' as ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3315:1: ' as '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonDefinitionAccess().getAsKeyword_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__ButtonDefinition__Group__1__Impl6632); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonDefinitionAccess().getAsKeyword_1()); 
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
    // $ANTLR end "rule__ButtonDefinition__Group__1__Impl"


    // $ANTLR start "rule__ButtonDefinition__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3328:1: rule__ButtonDefinition__Group__2 : rule__ButtonDefinition__Group__2__Impl rule__ButtonDefinition__Group__3 ;
    public final void rule__ButtonDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3332:1: ( rule__ButtonDefinition__Group__2__Impl rule__ButtonDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3333:2: rule__ButtonDefinition__Group__2__Impl rule__ButtonDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__2__Impl_in_rule__ButtonDefinition__Group__26663);
            rule__ButtonDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__3_in_rule__ButtonDefinition__Group__26666);
            rule__ButtonDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3340:1: rule__ButtonDefinition__Group__2__Impl : ( ( rule__ButtonDefinition__NameAssignment_2 ) ) ;
    public final void rule__ButtonDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3344:1: ( ( ( rule__ButtonDefinition__NameAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3345:1: ( ( rule__ButtonDefinition__NameAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3345:1: ( ( rule__ButtonDefinition__NameAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3346:1: ( rule__ButtonDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonDefinitionAccess().getNameAssignment_2()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3347:1: ( rule__ButtonDefinition__NameAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3347:2: rule__ButtonDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__NameAssignment_2_in_rule__ButtonDefinition__Group__2__Impl6693);
            rule__ButtonDefinition__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonDefinitionAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__ButtonDefinition__Group__2__Impl"


    // $ANTLR start "rule__ButtonDefinition__Group__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3357:1: rule__ButtonDefinition__Group__3 : rule__ButtonDefinition__Group__3__Impl rule__ButtonDefinition__Group__4 ;
    public final void rule__ButtonDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3361:1: ( rule__ButtonDefinition__Group__3__Impl rule__ButtonDefinition__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3362:2: rule__ButtonDefinition__Group__3__Impl rule__ButtonDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__3__Impl_in_rule__ButtonDefinition__Group__36723);
            rule__ButtonDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__4_in_rule__ButtonDefinition__Group__36726);
            rule__ButtonDefinition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3369:1: rule__ButtonDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__ButtonDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3373:1: ( ( ':' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3374:1: ( ':' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3374:1: ( ':' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3375:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonDefinitionAccess().getColonKeyword_3()); 
            }
            match(input,28,FOLLOW_28_in_rule__ButtonDefinition__Group__3__Impl6754); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonDefinitionAccess().getColonKeyword_3()); 
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
    // $ANTLR end "rule__ButtonDefinition__Group__3__Impl"


    // $ANTLR start "rule__ButtonDefinition__Group__4"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3388:1: rule__ButtonDefinition__Group__4 : rule__ButtonDefinition__Group__4__Impl rule__ButtonDefinition__Group__5 ;
    public final void rule__ButtonDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3392:1: ( rule__ButtonDefinition__Group__4__Impl rule__ButtonDefinition__Group__5 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3393:2: rule__ButtonDefinition__Group__4__Impl rule__ButtonDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__4__Impl_in_rule__ButtonDefinition__Group__46785);
            rule__ButtonDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__5_in_rule__ButtonDefinition__Group__46788);
            rule__ButtonDefinition__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonDefinition__Group__4"


    // $ANTLR start "rule__ButtonDefinition__Group__4__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3400:1: rule__ButtonDefinition__Group__4__Impl : ( ( rule__ButtonDefinition__Group_4__0 )? ) ;
    public final void rule__ButtonDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3404:1: ( ( ( rule__ButtonDefinition__Group_4__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3405:1: ( ( rule__ButtonDefinition__Group_4__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3405:1: ( ( rule__ButtonDefinition__Group_4__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3406:1: ( rule__ButtonDefinition__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonDefinitionAccess().getGroup_4()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3407:1: ( rule__ButtonDefinition__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3407:2: rule__ButtonDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ButtonDefinition__Group_4__0_in_rule__ButtonDefinition__Group__4__Impl6815);
                    rule__ButtonDefinition__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonDefinitionAccess().getGroup_4()); 
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
    // $ANTLR end "rule__ButtonDefinition__Group__4__Impl"


    // $ANTLR start "rule__ButtonDefinition__Group__5"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3417:1: rule__ButtonDefinition__Group__5 : rule__ButtonDefinition__Group__5__Impl ;
    public final void rule__ButtonDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3421:1: ( rule__ButtonDefinition__Group__5__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3422:2: rule__ButtonDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__5__Impl_in_rule__ButtonDefinition__Group__56846);
            rule__ButtonDefinition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonDefinition__Group__5"


    // $ANTLR start "rule__ButtonDefinition__Group__5__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3428:1: rule__ButtonDefinition__Group__5__Impl : ( ( rule__ButtonDefinition__Group_5__0 )? ) ;
    public final void rule__ButtonDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3432:1: ( ( ( rule__ButtonDefinition__Group_5__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3433:1: ( ( rule__ButtonDefinition__Group_5__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3433:1: ( ( rule__ButtonDefinition__Group_5__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3434:1: ( rule__ButtonDefinition__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonDefinitionAccess().getGroup_5()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3435:1: ( rule__ButtonDefinition__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3435:2: rule__ButtonDefinition__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ButtonDefinition__Group_5__0_in_rule__ButtonDefinition__Group__5__Impl6873);
                    rule__ButtonDefinition__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonDefinitionAccess().getGroup_5()); 
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
    // $ANTLR end "rule__ButtonDefinition__Group__5__Impl"


    // $ANTLR start "rule__ButtonDefinition__Group_4__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3457:1: rule__ButtonDefinition__Group_4__0 : rule__ButtonDefinition__Group_4__0__Impl rule__ButtonDefinition__Group_4__1 ;
    public final void rule__ButtonDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3461:1: ( rule__ButtonDefinition__Group_4__0__Impl rule__ButtonDefinition__Group_4__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3462:2: rule__ButtonDefinition__Group_4__0__Impl rule__ButtonDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group_4__0__Impl_in_rule__ButtonDefinition__Group_4__06916);
            rule__ButtonDefinition__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ButtonDefinition__Group_4__1_in_rule__ButtonDefinition__Group_4__06919);
            rule__ButtonDefinition__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonDefinition__Group_4__0"


    // $ANTLR start "rule__ButtonDefinition__Group_4__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3469:1: rule__ButtonDefinition__Group_4__0__Impl : ( 'text=' ) ;
    public final void rule__ButtonDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3473:1: ( ( 'text=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3474:1: ( 'text=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3474:1: ( 'text=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3475:1: 'text='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonDefinitionAccess().getTextKeyword_4_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__ButtonDefinition__Group_4__0__Impl6947); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonDefinitionAccess().getTextKeyword_4_0()); 
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
    // $ANTLR end "rule__ButtonDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__ButtonDefinition__Group_4__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3488:1: rule__ButtonDefinition__Group_4__1 : rule__ButtonDefinition__Group_4__1__Impl ;
    public final void rule__ButtonDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3492:1: ( rule__ButtonDefinition__Group_4__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3493:2: rule__ButtonDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group_4__1__Impl_in_rule__ButtonDefinition__Group_4__16978);
            rule__ButtonDefinition__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonDefinition__Group_4__1"


    // $ANTLR start "rule__ButtonDefinition__Group_4__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3499:1: rule__ButtonDefinition__Group_4__1__Impl : ( ( rule__ButtonDefinition__TextAssignment_4_1 ) ) ;
    public final void rule__ButtonDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3503:1: ( ( ( rule__ButtonDefinition__TextAssignment_4_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3504:1: ( ( rule__ButtonDefinition__TextAssignment_4_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3504:1: ( ( rule__ButtonDefinition__TextAssignment_4_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3505:1: ( rule__ButtonDefinition__TextAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonDefinitionAccess().getTextAssignment_4_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3506:1: ( rule__ButtonDefinition__TextAssignment_4_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3506:2: rule__ButtonDefinition__TextAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__TextAssignment_4_1_in_rule__ButtonDefinition__Group_4__1__Impl7005);
            rule__ButtonDefinition__TextAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonDefinitionAccess().getTextAssignment_4_1()); 
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
    // $ANTLR end "rule__ButtonDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__ButtonDefinition__Group_5__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3520:1: rule__ButtonDefinition__Group_5__0 : rule__ButtonDefinition__Group_5__0__Impl rule__ButtonDefinition__Group_5__1 ;
    public final void rule__ButtonDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3524:1: ( rule__ButtonDefinition__Group_5__0__Impl rule__ButtonDefinition__Group_5__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3525:2: rule__ButtonDefinition__Group_5__0__Impl rule__ButtonDefinition__Group_5__1
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group_5__0__Impl_in_rule__ButtonDefinition__Group_5__07039);
            rule__ButtonDefinition__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ButtonDefinition__Group_5__1_in_rule__ButtonDefinition__Group_5__07042);
            rule__ButtonDefinition__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonDefinition__Group_5__0"


    // $ANTLR start "rule__ButtonDefinition__Group_5__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3532:1: rule__ButtonDefinition__Group_5__0__Impl : ( 'interaction=' ) ;
    public final void rule__ButtonDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3536:1: ( ( 'interaction=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3537:1: ( 'interaction=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3537:1: ( 'interaction=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3538:1: 'interaction='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonDefinitionAccess().getInteractionKeyword_5_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__ButtonDefinition__Group_5__0__Impl7070); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonDefinitionAccess().getInteractionKeyword_5_0()); 
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
    // $ANTLR end "rule__ButtonDefinition__Group_5__0__Impl"


    // $ANTLR start "rule__ButtonDefinition__Group_5__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3551:1: rule__ButtonDefinition__Group_5__1 : rule__ButtonDefinition__Group_5__1__Impl ;
    public final void rule__ButtonDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3555:1: ( rule__ButtonDefinition__Group_5__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3556:2: rule__ButtonDefinition__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group_5__1__Impl_in_rule__ButtonDefinition__Group_5__17101);
            rule__ButtonDefinition__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonDefinition__Group_5__1"


    // $ANTLR start "rule__ButtonDefinition__Group_5__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3562:1: rule__ButtonDefinition__Group_5__1__Impl : ( ( rule__ButtonDefinition__InteractionAssignment_5_1 ) ) ;
    public final void rule__ButtonDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3566:1: ( ( ( rule__ButtonDefinition__InteractionAssignment_5_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3567:1: ( ( rule__ButtonDefinition__InteractionAssignment_5_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3567:1: ( ( rule__ButtonDefinition__InteractionAssignment_5_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3568:1: ( rule__ButtonDefinition__InteractionAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonDefinitionAccess().getInteractionAssignment_5_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3569:1: ( rule__ButtonDefinition__InteractionAssignment_5_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3569:2: rule__ButtonDefinition__InteractionAssignment_5_1
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__InteractionAssignment_5_1_in_rule__ButtonDefinition__Group_5__1__Impl7128);
            rule__ButtonDefinition__InteractionAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonDefinitionAccess().getInteractionAssignment_5_1()); 
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
    // $ANTLR end "rule__ButtonDefinition__Group_5__1__Impl"


    // $ANTLR start "rule__Interaction__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3583:1: rule__Interaction__Group__0 : rule__Interaction__Group__0__Impl rule__Interaction__Group__1 ;
    public final void rule__Interaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3587:1: ( rule__Interaction__Group__0__Impl rule__Interaction__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3588:2: rule__Interaction__Group__0__Impl rule__Interaction__Group__1
            {
            pushFollow(FOLLOW_rule__Interaction__Group__0__Impl_in_rule__Interaction__Group__07162);
            rule__Interaction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interaction__Group__1_in_rule__Interaction__Group__07165);
            rule__Interaction__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__0"


    // $ANTLR start "rule__Interaction__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3595:1: rule__Interaction__Group__0__Impl : ( ( rule__Interaction__NameAssignment_0 ) ) ;
    public final void rule__Interaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3599:1: ( ( ( rule__Interaction__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3600:1: ( ( rule__Interaction__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3600:1: ( ( rule__Interaction__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3601:1: ( rule__Interaction__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInteractionAccess().getNameAssignment_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3602:1: ( rule__Interaction__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3602:2: rule__Interaction__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Interaction__NameAssignment_0_in_rule__Interaction__Group__0__Impl7192);
            rule__Interaction__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInteractionAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__Interaction__Group__0__Impl"


    // $ANTLR start "rule__Interaction__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3612:1: rule__Interaction__Group__1 : rule__Interaction__Group__1__Impl rule__Interaction__Group__2 ;
    public final void rule__Interaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3616:1: ( rule__Interaction__Group__1__Impl rule__Interaction__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3617:2: rule__Interaction__Group__1__Impl rule__Interaction__Group__2
            {
            pushFollow(FOLLOW_rule__Interaction__Group__1__Impl_in_rule__Interaction__Group__17222);
            rule__Interaction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interaction__Group__2_in_rule__Interaction__Group__17225);
            rule__Interaction__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__1"


    // $ANTLR start "rule__Interaction__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3624:1: rule__Interaction__Group__1__Impl : ( ' type=' ) ;
    public final void rule__Interaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3628:1: ( ( ' type=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3629:1: ( ' type=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3629:1: ( ' type=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3630:1: ' type='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInteractionAccess().getTypeKeyword_1()); 
            }
            match(input,31,FOLLOW_31_in_rule__Interaction__Group__1__Impl7253); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInteractionAccess().getTypeKeyword_1()); 
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
    // $ANTLR end "rule__Interaction__Group__1__Impl"


    // $ANTLR start "rule__Interaction__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3643:1: rule__Interaction__Group__2 : rule__Interaction__Group__2__Impl rule__Interaction__Group__3 ;
    public final void rule__Interaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3647:1: ( rule__Interaction__Group__2__Impl rule__Interaction__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3648:2: rule__Interaction__Group__2__Impl rule__Interaction__Group__3
            {
            pushFollow(FOLLOW_rule__Interaction__Group__2__Impl_in_rule__Interaction__Group__27284);
            rule__Interaction__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interaction__Group__3_in_rule__Interaction__Group__27287);
            rule__Interaction__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__2"


    // $ANTLR start "rule__Interaction__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3655:1: rule__Interaction__Group__2__Impl : ( ruleInteractiontype ) ;
    public final void rule__Interaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3659:1: ( ( ruleInteractiontype ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3660:1: ( ruleInteractiontype )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3660:1: ( ruleInteractiontype )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3661:1: ruleInteractiontype
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInteractionAccess().getInteractiontypeParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_ruleInteractiontype_in_rule__Interaction__Group__2__Impl7314);
            ruleInteractiontype();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInteractionAccess().getInteractiontypeParserRuleCall_2()); 
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
    // $ANTLR end "rule__Interaction__Group__2__Impl"


    // $ANTLR start "rule__Interaction__Group__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3672:1: rule__Interaction__Group__3 : rule__Interaction__Group__3__Impl rule__Interaction__Group__4 ;
    public final void rule__Interaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3676:1: ( rule__Interaction__Group__3__Impl rule__Interaction__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3677:2: rule__Interaction__Group__3__Impl rule__Interaction__Group__4
            {
            pushFollow(FOLLOW_rule__Interaction__Group__3__Impl_in_rule__Interaction__Group__37343);
            rule__Interaction__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interaction__Group__4_in_rule__Interaction__Group__37346);
            rule__Interaction__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__3"


    // $ANTLR start "rule__Interaction__Group__3__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3684:1: rule__Interaction__Group__3__Impl : ( ' with actions:' ) ;
    public final void rule__Interaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3688:1: ( ( ' with actions:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3689:1: ( ' with actions:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3689:1: ( ' with actions:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3690:1: ' with actions:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInteractionAccess().getWithActionsKeyword_3()); 
            }
            match(input,32,FOLLOW_32_in_rule__Interaction__Group__3__Impl7374); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInteractionAccess().getWithActionsKeyword_3()); 
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
    // $ANTLR end "rule__Interaction__Group__3__Impl"


    // $ANTLR start "rule__Interaction__Group__4"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3703:1: rule__Interaction__Group__4 : rule__Interaction__Group__4__Impl ;
    public final void rule__Interaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3707:1: ( rule__Interaction__Group__4__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3708:2: rule__Interaction__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Interaction__Group__4__Impl_in_rule__Interaction__Group__47405);
            rule__Interaction__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__4"


    // $ANTLR start "rule__Interaction__Group__4__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3714:1: rule__Interaction__Group__4__Impl : ( ( rule__Interaction__ActionsAssignment_4 )* ) ;
    public final void rule__Interaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3718:1: ( ( ( rule__Interaction__ActionsAssignment_4 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3719:1: ( ( rule__Interaction__ActionsAssignment_4 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3719:1: ( ( rule__Interaction__ActionsAssignment_4 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3720:1: ( rule__Interaction__ActionsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInteractionAccess().getActionsAssignment_4()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3721:1: ( rule__Interaction__ActionsAssignment_4 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==33) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3721:2: rule__Interaction__ActionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Interaction__ActionsAssignment_4_in_rule__Interaction__Group__4__Impl7432);
            	    rule__Interaction__ActionsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInteractionAccess().getActionsAssignment_4()); 
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
    // $ANTLR end "rule__Interaction__Group__4__Impl"


    // $ANTLR start "rule__LabelDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3741:1: rule__LabelDefinition__Group__0 : rule__LabelDefinition__Group__0__Impl rule__LabelDefinition__Group__1 ;
    public final void rule__LabelDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3745:1: ( rule__LabelDefinition__Group__0__Impl rule__LabelDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3746:2: rule__LabelDefinition__Group__0__Impl rule__LabelDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__0__Impl_in_rule__LabelDefinition__Group__07473);
            rule__LabelDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LabelDefinition__Group__1_in_rule__LabelDefinition__Group__07476);
            rule__LabelDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3753:1: rule__LabelDefinition__Group__0__Impl : ( ( rule__LabelDefinition__TypeAssignment_0 ) ) ;
    public final void rule__LabelDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3757:1: ( ( ( rule__LabelDefinition__TypeAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3758:1: ( ( rule__LabelDefinition__TypeAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3758:1: ( ( rule__LabelDefinition__TypeAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3759:1: ( rule__LabelDefinition__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelDefinitionAccess().getTypeAssignment_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3760:1: ( rule__LabelDefinition__TypeAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3760:2: rule__LabelDefinition__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__LabelDefinition__TypeAssignment_0_in_rule__LabelDefinition__Group__0__Impl7503);
            rule__LabelDefinition__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabelDefinitionAccess().getTypeAssignment_0()); 
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
    // $ANTLR end "rule__LabelDefinition__Group__0__Impl"


    // $ANTLR start "rule__LabelDefinition__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3770:1: rule__LabelDefinition__Group__1 : rule__LabelDefinition__Group__1__Impl rule__LabelDefinition__Group__2 ;
    public final void rule__LabelDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3774:1: ( rule__LabelDefinition__Group__1__Impl rule__LabelDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3775:2: rule__LabelDefinition__Group__1__Impl rule__LabelDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__1__Impl_in_rule__LabelDefinition__Group__17533);
            rule__LabelDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LabelDefinition__Group__2_in_rule__LabelDefinition__Group__17536);
            rule__LabelDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3782:1: rule__LabelDefinition__Group__1__Impl : ( ' as ' ) ;
    public final void rule__LabelDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3786:1: ( ( ' as ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3787:1: ( ' as ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3787:1: ( ' as ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3788:1: ' as '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelDefinitionAccess().getAsKeyword_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__LabelDefinition__Group__1__Impl7564); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabelDefinitionAccess().getAsKeyword_1()); 
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
    // $ANTLR end "rule__LabelDefinition__Group__1__Impl"


    // $ANTLR start "rule__LabelDefinition__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3801:1: rule__LabelDefinition__Group__2 : rule__LabelDefinition__Group__2__Impl rule__LabelDefinition__Group__3 ;
    public final void rule__LabelDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3805:1: ( rule__LabelDefinition__Group__2__Impl rule__LabelDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3806:2: rule__LabelDefinition__Group__2__Impl rule__LabelDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__2__Impl_in_rule__LabelDefinition__Group__27595);
            rule__LabelDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LabelDefinition__Group__3_in_rule__LabelDefinition__Group__27598);
            rule__LabelDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3813:1: rule__LabelDefinition__Group__2__Impl : ( ( rule__LabelDefinition__NameAssignment_2 ) ) ;
    public final void rule__LabelDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3817:1: ( ( ( rule__LabelDefinition__NameAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3818:1: ( ( rule__LabelDefinition__NameAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3818:1: ( ( rule__LabelDefinition__NameAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3819:1: ( rule__LabelDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelDefinitionAccess().getNameAssignment_2()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3820:1: ( rule__LabelDefinition__NameAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3820:2: rule__LabelDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__LabelDefinition__NameAssignment_2_in_rule__LabelDefinition__Group__2__Impl7625);
            rule__LabelDefinition__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabelDefinitionAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__LabelDefinition__Group__2__Impl"


    // $ANTLR start "rule__LabelDefinition__Group__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3830:1: rule__LabelDefinition__Group__3 : rule__LabelDefinition__Group__3__Impl rule__LabelDefinition__Group__4 ;
    public final void rule__LabelDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3834:1: ( rule__LabelDefinition__Group__3__Impl rule__LabelDefinition__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3835:2: rule__LabelDefinition__Group__3__Impl rule__LabelDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__3__Impl_in_rule__LabelDefinition__Group__37655);
            rule__LabelDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LabelDefinition__Group__4_in_rule__LabelDefinition__Group__37658);
            rule__LabelDefinition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3842:1: rule__LabelDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__LabelDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3846:1: ( ( ':' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3847:1: ( ':' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3847:1: ( ':' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3848:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelDefinitionAccess().getColonKeyword_3()); 
            }
            match(input,28,FOLLOW_28_in_rule__LabelDefinition__Group__3__Impl7686); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabelDefinitionAccess().getColonKeyword_3()); 
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
    // $ANTLR end "rule__LabelDefinition__Group__3__Impl"


    // $ANTLR start "rule__LabelDefinition__Group__4"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3861:1: rule__LabelDefinition__Group__4 : rule__LabelDefinition__Group__4__Impl ;
    public final void rule__LabelDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3865:1: ( rule__LabelDefinition__Group__4__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3866:2: rule__LabelDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__4__Impl_in_rule__LabelDefinition__Group__47717);
            rule__LabelDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelDefinition__Group__4"


    // $ANTLR start "rule__LabelDefinition__Group__4__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3872:1: rule__LabelDefinition__Group__4__Impl : ( ( rule__LabelDefinition__Group_4__0 )? ) ;
    public final void rule__LabelDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3876:1: ( ( ( rule__LabelDefinition__Group_4__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3877:1: ( ( rule__LabelDefinition__Group_4__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3877:1: ( ( rule__LabelDefinition__Group_4__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3878:1: ( rule__LabelDefinition__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelDefinitionAccess().getGroup_4()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3879:1: ( rule__LabelDefinition__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3879:2: rule__LabelDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__LabelDefinition__Group_4__0_in_rule__LabelDefinition__Group__4__Impl7744);
                    rule__LabelDefinition__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabelDefinitionAccess().getGroup_4()); 
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
    // $ANTLR end "rule__LabelDefinition__Group__4__Impl"


    // $ANTLR start "rule__LabelDefinition__Group_4__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3899:1: rule__LabelDefinition__Group_4__0 : rule__LabelDefinition__Group_4__0__Impl rule__LabelDefinition__Group_4__1 ;
    public final void rule__LabelDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3903:1: ( rule__LabelDefinition__Group_4__0__Impl rule__LabelDefinition__Group_4__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3904:2: rule__LabelDefinition__Group_4__0__Impl rule__LabelDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group_4__0__Impl_in_rule__LabelDefinition__Group_4__07785);
            rule__LabelDefinition__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LabelDefinition__Group_4__1_in_rule__LabelDefinition__Group_4__07788);
            rule__LabelDefinition__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelDefinition__Group_4__0"


    // $ANTLR start "rule__LabelDefinition__Group_4__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3911:1: rule__LabelDefinition__Group_4__0__Impl : ( 'text=' ) ;
    public final void rule__LabelDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3915:1: ( ( 'text=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3916:1: ( 'text=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3916:1: ( 'text=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3917:1: 'text='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelDefinitionAccess().getTextKeyword_4_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__LabelDefinition__Group_4__0__Impl7816); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabelDefinitionAccess().getTextKeyword_4_0()); 
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
    // $ANTLR end "rule__LabelDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__LabelDefinition__Group_4__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3930:1: rule__LabelDefinition__Group_4__1 : rule__LabelDefinition__Group_4__1__Impl ;
    public final void rule__LabelDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3934:1: ( rule__LabelDefinition__Group_4__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3935:2: rule__LabelDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group_4__1__Impl_in_rule__LabelDefinition__Group_4__17847);
            rule__LabelDefinition__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelDefinition__Group_4__1"


    // $ANTLR start "rule__LabelDefinition__Group_4__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3941:1: rule__LabelDefinition__Group_4__1__Impl : ( ( rule__LabelDefinition__TextAssignment_4_1 ) ) ;
    public final void rule__LabelDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3945:1: ( ( ( rule__LabelDefinition__TextAssignment_4_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3946:1: ( ( rule__LabelDefinition__TextAssignment_4_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3946:1: ( ( rule__LabelDefinition__TextAssignment_4_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3947:1: ( rule__LabelDefinition__TextAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelDefinitionAccess().getTextAssignment_4_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3948:1: ( rule__LabelDefinition__TextAssignment_4_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3948:2: rule__LabelDefinition__TextAssignment_4_1
            {
            pushFollow(FOLLOW_rule__LabelDefinition__TextAssignment_4_1_in_rule__LabelDefinition__Group_4__1__Impl7874);
            rule__LabelDefinition__TextAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabelDefinitionAccess().getTextAssignment_4_1()); 
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
    // $ANTLR end "rule__LabelDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__UIAction__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3962:1: rule__UIAction__Group__0 : rule__UIAction__Group__0__Impl rule__UIAction__Group__1 ;
    public final void rule__UIAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3966:1: ( rule__UIAction__Group__0__Impl rule__UIAction__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3967:2: rule__UIAction__Group__0__Impl rule__UIAction__Group__1
            {
            pushFollow(FOLLOW_rule__UIAction__Group__0__Impl_in_rule__UIAction__Group__07908);
            rule__UIAction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIAction__Group__1_in_rule__UIAction__Group__07911);
            rule__UIAction__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIAction__Group__0"


    // $ANTLR start "rule__UIAction__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3974:1: rule__UIAction__Group__0__Impl : ( 'type=' ) ;
    public final void rule__UIAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3978:1: ( ( 'type=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3979:1: ( 'type=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3979:1: ( 'type=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3980:1: 'type='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIActionAccess().getTypeKeyword_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__UIAction__Group__0__Impl7939); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIActionAccess().getTypeKeyword_0()); 
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
    // $ANTLR end "rule__UIAction__Group__0__Impl"


    // $ANTLR start "rule__UIAction__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3993:1: rule__UIAction__Group__1 : rule__UIAction__Group__1__Impl rule__UIAction__Group__2 ;
    public final void rule__UIAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3997:1: ( rule__UIAction__Group__1__Impl rule__UIAction__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3998:2: rule__UIAction__Group__1__Impl rule__UIAction__Group__2
            {
            pushFollow(FOLLOW_rule__UIAction__Group__1__Impl_in_rule__UIAction__Group__17970);
            rule__UIAction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIAction__Group__2_in_rule__UIAction__Group__17973);
            rule__UIAction__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIAction__Group__1"


    // $ANTLR start "rule__UIAction__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4005:1: rule__UIAction__Group__1__Impl : ( ( rule__UIAction__TypeAssignment_1 ) ) ;
    public final void rule__UIAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4009:1: ( ( ( rule__UIAction__TypeAssignment_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4010:1: ( ( rule__UIAction__TypeAssignment_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4010:1: ( ( rule__UIAction__TypeAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4011:1: ( rule__UIAction__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIActionAccess().getTypeAssignment_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4012:1: ( rule__UIAction__TypeAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4012:2: rule__UIAction__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__UIAction__TypeAssignment_1_in_rule__UIAction__Group__1__Impl8000);
            rule__UIAction__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIActionAccess().getTypeAssignment_1()); 
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
    // $ANTLR end "rule__UIAction__Group__1__Impl"


    // $ANTLR start "rule__UIAction__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4022:1: rule__UIAction__Group__2 : rule__UIAction__Group__2__Impl rule__UIAction__Group__3 ;
    public final void rule__UIAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4026:1: ( rule__UIAction__Group__2__Impl rule__UIAction__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4027:2: rule__UIAction__Group__2__Impl rule__UIAction__Group__3
            {
            pushFollow(FOLLOW_rule__UIAction__Group__2__Impl_in_rule__UIAction__Group__28030);
            rule__UIAction__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIAction__Group__3_in_rule__UIAction__Group__28033);
            rule__UIAction__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIAction__Group__2"


    // $ANTLR start "rule__UIAction__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4034:1: rule__UIAction__Group__2__Impl : ( 'element=' ) ;
    public final void rule__UIAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4038:1: ( ( 'element=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4039:1: ( 'element=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4039:1: ( 'element=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4040:1: 'element='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIActionAccess().getElementKeyword_2()); 
            }
            match(input,34,FOLLOW_34_in_rule__UIAction__Group__2__Impl8061); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIActionAccess().getElementKeyword_2()); 
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
    // $ANTLR end "rule__UIAction__Group__2__Impl"


    // $ANTLR start "rule__UIAction__Group__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4053:1: rule__UIAction__Group__3 : rule__UIAction__Group__3__Impl rule__UIAction__Group__4 ;
    public final void rule__UIAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4057:1: ( rule__UIAction__Group__3__Impl rule__UIAction__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4058:2: rule__UIAction__Group__3__Impl rule__UIAction__Group__4
            {
            pushFollow(FOLLOW_rule__UIAction__Group__3__Impl_in_rule__UIAction__Group__38092);
            rule__UIAction__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIAction__Group__4_in_rule__UIAction__Group__38095);
            rule__UIAction__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIAction__Group__3"


    // $ANTLR start "rule__UIAction__Group__3__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4065:1: rule__UIAction__Group__3__Impl : ( ( rule__UIAction__UiElementNameAssignment_3 ) ) ;
    public final void rule__UIAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4069:1: ( ( ( rule__UIAction__UiElementNameAssignment_3 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4070:1: ( ( rule__UIAction__UiElementNameAssignment_3 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4070:1: ( ( rule__UIAction__UiElementNameAssignment_3 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4071:1: ( rule__UIAction__UiElementNameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIActionAccess().getUiElementNameAssignment_3()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4072:1: ( rule__UIAction__UiElementNameAssignment_3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4072:2: rule__UIAction__UiElementNameAssignment_3
            {
            pushFollow(FOLLOW_rule__UIAction__UiElementNameAssignment_3_in_rule__UIAction__Group__3__Impl8122);
            rule__UIAction__UiElementNameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIActionAccess().getUiElementNameAssignment_3()); 
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
    // $ANTLR end "rule__UIAction__Group__3__Impl"


    // $ANTLR start "rule__UIAction__Group__4"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4082:1: rule__UIAction__Group__4 : rule__UIAction__Group__4__Impl rule__UIAction__Group__5 ;
    public final void rule__UIAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4086:1: ( rule__UIAction__Group__4__Impl rule__UIAction__Group__5 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4087:2: rule__UIAction__Group__4__Impl rule__UIAction__Group__5
            {
            pushFollow(FOLLOW_rule__UIAction__Group__4__Impl_in_rule__UIAction__Group__48152);
            rule__UIAction__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIAction__Group__5_in_rule__UIAction__Group__48155);
            rule__UIAction__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIAction__Group__4"


    // $ANTLR start "rule__UIAction__Group__4__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4094:1: rule__UIAction__Group__4__Impl : ( ':' ) ;
    public final void rule__UIAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4098:1: ( ( ':' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4099:1: ( ':' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4099:1: ( ':' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4100:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIActionAccess().getColonKeyword_4()); 
            }
            match(input,28,FOLLOW_28_in_rule__UIAction__Group__4__Impl8183); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIActionAccess().getColonKeyword_4()); 
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
    // $ANTLR end "rule__UIAction__Group__4__Impl"


    // $ANTLR start "rule__UIAction__Group__5"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4113:1: rule__UIAction__Group__5 : rule__UIAction__Group__5__Impl ;
    public final void rule__UIAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4117:1: ( rule__UIAction__Group__5__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4118:2: rule__UIAction__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__UIAction__Group__5__Impl_in_rule__UIAction__Group__58214);
            rule__UIAction__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIAction__Group__5"


    // $ANTLR start "rule__UIAction__Group__5__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4124:1: rule__UIAction__Group__5__Impl : ( ( rule__UIAction__PropertiesAssignment_5 )* ) ;
    public final void rule__UIAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4128:1: ( ( ( rule__UIAction__PropertiesAssignment_5 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4129:1: ( ( rule__UIAction__PropertiesAssignment_5 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4129:1: ( ( rule__UIAction__PropertiesAssignment_5 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4130:1: ( rule__UIAction__PropertiesAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIActionAccess().getPropertiesAssignment_5()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4131:1: ( rule__UIAction__PropertiesAssignment_5 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==11) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4131:2: rule__UIAction__PropertiesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__UIAction__PropertiesAssignment_5_in_rule__UIAction__Group__5__Impl8241);
            	    rule__UIAction__PropertiesAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIActionAccess().getPropertiesAssignment_5()); 
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
    // $ANTLR end "rule__UIAction__Group__5__Impl"


    // $ANTLR start "rule__CommonProperty__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4153:1: rule__CommonProperty__Group__0 : rule__CommonProperty__Group__0__Impl rule__CommonProperty__Group__1 ;
    public final void rule__CommonProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4157:1: ( rule__CommonProperty__Group__0__Impl rule__CommonProperty__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4158:2: rule__CommonProperty__Group__0__Impl rule__CommonProperty__Group__1
            {
            pushFollow(FOLLOW_rule__CommonProperty__Group__0__Impl_in_rule__CommonProperty__Group__08284);
            rule__CommonProperty__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommonProperty__Group__1_in_rule__CommonProperty__Group__08287);
            rule__CommonProperty__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonProperty__Group__0"


    // $ANTLR start "rule__CommonProperty__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4165:1: rule__CommonProperty__Group__0__Impl : ( ( rule__CommonProperty__NameAssignment_0 ) ) ;
    public final void rule__CommonProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4169:1: ( ( ( rule__CommonProperty__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4170:1: ( ( rule__CommonProperty__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4170:1: ( ( rule__CommonProperty__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4171:1: ( rule__CommonProperty__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommonPropertyAccess().getNameAssignment_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4172:1: ( rule__CommonProperty__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4172:2: rule__CommonProperty__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__CommonProperty__NameAssignment_0_in_rule__CommonProperty__Group__0__Impl8314);
            rule__CommonProperty__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommonPropertyAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__CommonProperty__Group__0__Impl"


    // $ANTLR start "rule__CommonProperty__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4182:1: rule__CommonProperty__Group__1 : rule__CommonProperty__Group__1__Impl rule__CommonProperty__Group__2 ;
    public final void rule__CommonProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4186:1: ( rule__CommonProperty__Group__1__Impl rule__CommonProperty__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4187:2: rule__CommonProperty__Group__1__Impl rule__CommonProperty__Group__2
            {
            pushFollow(FOLLOW_rule__CommonProperty__Group__1__Impl_in_rule__CommonProperty__Group__18344);
            rule__CommonProperty__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommonProperty__Group__2_in_rule__CommonProperty__Group__18347);
            rule__CommonProperty__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonProperty__Group__1"


    // $ANTLR start "rule__CommonProperty__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4194:1: rule__CommonProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__CommonProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4198:1: ( ( '=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4199:1: ( '=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4199:1: ( '=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4200:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommonPropertyAccess().getEqualsSignKeyword_1()); 
            }
            match(input,35,FOLLOW_35_in_rule__CommonProperty__Group__1__Impl8375); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommonPropertyAccess().getEqualsSignKeyword_1()); 
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
    // $ANTLR end "rule__CommonProperty__Group__1__Impl"


    // $ANTLR start "rule__CommonProperty__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4213:1: rule__CommonProperty__Group__2 : rule__CommonProperty__Group__2__Impl ;
    public final void rule__CommonProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4217:1: ( rule__CommonProperty__Group__2__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4218:2: rule__CommonProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CommonProperty__Group__2__Impl_in_rule__CommonProperty__Group__28406);
            rule__CommonProperty__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonProperty__Group__2"


    // $ANTLR start "rule__CommonProperty__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4224:1: rule__CommonProperty__Group__2__Impl : ( ( rule__CommonProperty__ValueAssignment_2 ) ) ;
    public final void rule__CommonProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4228:1: ( ( ( rule__CommonProperty__ValueAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4229:1: ( ( rule__CommonProperty__ValueAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4229:1: ( ( rule__CommonProperty__ValueAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4230:1: ( rule__CommonProperty__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommonPropertyAccess().getValueAssignment_2()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4231:1: ( rule__CommonProperty__ValueAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4231:2: rule__CommonProperty__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__CommonProperty__ValueAssignment_2_in_rule__CommonProperty__Group__2__Impl8433);
            rule__CommonProperty__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommonPropertyAccess().getValueAssignment_2()); 
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
    // $ANTLR end "rule__CommonProperty__Group__2__Impl"


    // $ANTLR start "rule__UIDescription__UnorderedGroup"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4248:1: rule__UIDescription__UnorderedGroup : rule__UIDescription__UnorderedGroup__0 {...}?;
    public final void rule__UIDescription__UnorderedGroup() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getUIDescriptionAccess().getUnorderedGroup());
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4253:1: ( rule__UIDescription__UnorderedGroup__0 {...}?)
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4254:2: rule__UIDescription__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_rule__UIDescription__UnorderedGroup__0_in_rule__UIDescription__UnorderedGroup8470);
            rule__UIDescription__UnorderedGroup__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getUIDescriptionAccess().getUnorderedGroup()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__UIDescription__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getUIDescriptionAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getUIDescriptionAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__UnorderedGroup"


    // $ANTLR start "rule__UIDescription__UnorderedGroup__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4265:1: rule__UIDescription__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__UIDescription__Group_0__0 ) ) ) ) | ({...}? => ( ( ( ( rule__UIDescription__InputTypesAssignment_1 ) ) ( ( ( rule__UIDescription__InputTypesAssignment_1 )=> rule__UIDescription__InputTypesAssignment_1 )* ) ) ) ) | ({...}? => ( ( ( rule__UIDescription__Group_2__0 ) ) ) ) ) ;
    public final void rule__UIDescription__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4270:1: ( ( ({...}? => ( ( ( rule__UIDescription__Group_0__0 ) ) ) ) | ({...}? => ( ( ( ( rule__UIDescription__InputTypesAssignment_1 ) ) ( ( ( rule__UIDescription__InputTypesAssignment_1 )=> rule__UIDescription__InputTypesAssignment_1 )* ) ) ) ) | ({...}? => ( ( ( rule__UIDescription__Group_2__0 ) ) ) ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4271:3: ( ({...}? => ( ( ( rule__UIDescription__Group_0__0 ) ) ) ) | ({...}? => ( ( ( ( rule__UIDescription__InputTypesAssignment_1 ) ) ( ( ( rule__UIDescription__InputTypesAssignment_1 )=> rule__UIDescription__InputTypesAssignment_1 )* ) ) ) ) | ({...}? => ( ( ( rule__UIDescription__Group_2__0 ) ) ) ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4271:3: ( ({...}? => ( ( ( rule__UIDescription__Group_0__0 ) ) ) ) | ({...}? => ( ( ( ( rule__UIDescription__InputTypesAssignment_1 ) ) ( ( ( rule__UIDescription__InputTypesAssignment_1 )=> rule__UIDescription__InputTypesAssignment_1 )* ) ) ) ) | ({...}? => ( ( ( rule__UIDescription__Group_2__0 ) ) ) ) )
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( LA22_0 ==18 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 0) ) ) {
                int LA22_1 = input.LA(2);

                if ( getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 0) ) {
                    alt22=1;
                }
                else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2) ) {
                    alt22=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else if ( LA22_0 ==15 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2) ) ) {
                int LA22_2 = input.LA(2);

                if ( getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 1) ) {
                    alt22=2;
                }
                else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2) ) {
                    alt22=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 2, input);

                    throw nvae;
                }
            }
            else if ( (LA22_0==EOF||LA22_0==RULE_STRING||LA22_0==19||LA22_0==23) && getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2) ) {
                alt22=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4273:4: ({...}? => ( ( ( rule__UIDescription__Group_0__0 ) ) ) )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4273:4: ({...}? => ( ( ( rule__UIDescription__Group_0__0 ) ) ) )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4274:5: {...}? => ( ( ( rule__UIDescription__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__UIDescription__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 0)");
                    }
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4274:108: ( ( ( rule__UIDescription__Group_0__0 ) ) )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4275:6: ( ( rule__UIDescription__Group_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 0);
                    selected = true;
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4281:6: ( ( rule__UIDescription__Group_0__0 ) )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4283:7: ( rule__UIDescription__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUIDescriptionAccess().getGroup_0()); 
                    }
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4284:7: ( rule__UIDescription__Group_0__0 )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4284:8: rule__UIDescription__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__UIDescription__Group_0__0_in_rule__UIDescription__UnorderedGroup__Impl8559);
                    rule__UIDescription__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUIDescriptionAccess().getGroup_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4290:4: ({...}? => ( ( ( ( rule__UIDescription__InputTypesAssignment_1 ) ) ( ( ( rule__UIDescription__InputTypesAssignment_1 )=> rule__UIDescription__InputTypesAssignment_1 )* ) ) ) )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4290:4: ({...}? => ( ( ( ( rule__UIDescription__InputTypesAssignment_1 ) ) ( ( ( rule__UIDescription__InputTypesAssignment_1 )=> rule__UIDescription__InputTypesAssignment_1 )* ) ) ) )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4291:5: {...}? => ( ( ( ( rule__UIDescription__InputTypesAssignment_1 ) ) ( ( ( rule__UIDescription__InputTypesAssignment_1 )=> rule__UIDescription__InputTypesAssignment_1 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__UIDescription__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 1)");
                    }
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4291:108: ( ( ( ( rule__UIDescription__InputTypesAssignment_1 ) ) ( ( ( rule__UIDescription__InputTypesAssignment_1 )=> rule__UIDescription__InputTypesAssignment_1 )* ) ) )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4292:6: ( ( ( rule__UIDescription__InputTypesAssignment_1 ) ) ( ( ( rule__UIDescription__InputTypesAssignment_1 )=> rule__UIDescription__InputTypesAssignment_1 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 1);
                    selected = true;
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4298:6: ( ( ( rule__UIDescription__InputTypesAssignment_1 ) ) ( ( ( rule__UIDescription__InputTypesAssignment_1 )=> rule__UIDescription__InputTypesAssignment_1 )* ) )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4299:6: ( ( rule__UIDescription__InputTypesAssignment_1 ) ) ( ( ( rule__UIDescription__InputTypesAssignment_1 )=> rule__UIDescription__InputTypesAssignment_1 )* )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4299:6: ( ( rule__UIDescription__InputTypesAssignment_1 ) )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4300:7: ( rule__UIDescription__InputTypesAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUIDescriptionAccess().getInputTypesAssignment_1()); 
                    }
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4301:7: ( rule__UIDescription__InputTypesAssignment_1 )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4301:8: rule__UIDescription__InputTypesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__UIDescription__InputTypesAssignment_1_in_rule__UIDescription__UnorderedGroup__Impl8651);
                    rule__UIDescription__InputTypesAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUIDescriptionAccess().getInputTypesAssignment_1()); 
                    }

                    }

                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4304:6: ( ( ( rule__UIDescription__InputTypesAssignment_1 )=> rule__UIDescription__InputTypesAssignment_1 )* )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4305:7: ( ( rule__UIDescription__InputTypesAssignment_1 )=> rule__UIDescription__InputTypesAssignment_1 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUIDescriptionAccess().getInputTypesAssignment_1()); 
                    }
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4306:7: ( ( rule__UIDescription__InputTypesAssignment_1 )=> rule__UIDescription__InputTypesAssignment_1 )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==15) ) {
                            int LA21_2 = input.LA(2);

                            if ( (LA21_2==RULE_STRING) ) {
                                int LA21_3 = input.LA(3);

                                if ( (LA21_3==16) ) {
                                    int LA21_4 = input.LA(4);

                                    if ( (LA21_4==RULE_STRING) ) {
                                        int LA21_5 = input.LA(5);

                                        if ( (synpred1_InternalGuiDSL()) ) {
                                            alt21=1;
                                        }


                                    }


                                }


                            }


                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4306:8: ( rule__UIDescription__InputTypesAssignment_1 )=> rule__UIDescription__InputTypesAssignment_1
                    	    {
                    	    pushFollow(FOLLOW_rule__UIDescription__InputTypesAssignment_1_in_rule__UIDescription__UnorderedGroup__Impl8695);
                    	    rule__UIDescription__InputTypesAssignment_1();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUIDescriptionAccess().getInputTypesAssignment_1()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4312:4: ({...}? => ( ( ( rule__UIDescription__Group_2__0 ) ) ) )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4312:4: ({...}? => ( ( ( rule__UIDescription__Group_2__0 ) ) ) )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4313:5: {...}? => ( ( ( rule__UIDescription__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__UIDescription__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2)");
                    }
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4313:108: ( ( ( rule__UIDescription__Group_2__0 ) ) )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4314:6: ( ( rule__UIDescription__Group_2__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2);
                    selected = true;
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4320:6: ( ( rule__UIDescription__Group_2__0 ) )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4322:7: ( rule__UIDescription__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUIDescriptionAccess().getGroup_2()); 
                    }
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4323:7: ( rule__UIDescription__Group_2__0 )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4323:8: rule__UIDescription__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__UIDescription__Group_2__0_in_rule__UIDescription__UnorderedGroup__Impl8793);
                    rule__UIDescription__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUIDescriptionAccess().getGroup_2()); 
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUIDescriptionAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__UnorderedGroup__Impl"


    // $ANTLR start "rule__UIDescription__UnorderedGroup__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4338:1: rule__UIDescription__UnorderedGroup__0 : rule__UIDescription__UnorderedGroup__Impl ( rule__UIDescription__UnorderedGroup__1 )? ;
    public final void rule__UIDescription__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4342:1: ( rule__UIDescription__UnorderedGroup__Impl ( rule__UIDescription__UnorderedGroup__1 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4343:2: rule__UIDescription__UnorderedGroup__Impl ( rule__UIDescription__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_rule__UIDescription__UnorderedGroup__Impl_in_rule__UIDescription__UnorderedGroup__08852);
            rule__UIDescription__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4344:2: ( rule__UIDescription__UnorderedGroup__1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( LA23_0 ==18 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 0) ) ) {
                alt23=1;
            }
            else if ( LA23_0 ==15 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2) ) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_STRING||LA23_0==19||LA23_0==23) && getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2) ) {
                alt23=1;
            }
            else if ( (LA23_0==EOF) ) {
                int LA23_4 = input.LA(2);

                if ( getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4344:2: rule__UIDescription__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_rule__UIDescription__UnorderedGroup__1_in_rule__UIDescription__UnorderedGroup__08855);
                    rule__UIDescription__UnorderedGroup__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__UnorderedGroup__0"


    // $ANTLR start "rule__UIDescription__UnorderedGroup__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4351:1: rule__UIDescription__UnorderedGroup__1 : rule__UIDescription__UnorderedGroup__Impl ( rule__UIDescription__UnorderedGroup__2 )? ;
    public final void rule__UIDescription__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4355:1: ( rule__UIDescription__UnorderedGroup__Impl ( rule__UIDescription__UnorderedGroup__2 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4356:2: rule__UIDescription__UnorderedGroup__Impl ( rule__UIDescription__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_rule__UIDescription__UnorderedGroup__Impl_in_rule__UIDescription__UnorderedGroup__18880);
            rule__UIDescription__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4357:2: ( rule__UIDescription__UnorderedGroup__2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( LA24_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 0) ) {
                alt24=1;
            }
            else if ( LA24_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 1) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_STRING||LA24_0==19||LA24_0==23) && getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2) ) {
                alt24=1;
            }
            else if ( (LA24_0==EOF) ) {
                int LA24_4 = input.LA(2);

                if ( getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4357:2: rule__UIDescription__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_rule__UIDescription__UnorderedGroup__2_in_rule__UIDescription__UnorderedGroup__18883);
                    rule__UIDescription__UnorderedGroup__2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__UnorderedGroup__1"


    // $ANTLR start "rule__UIDescription__UnorderedGroup__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4364:1: rule__UIDescription__UnorderedGroup__2 : rule__UIDescription__UnorderedGroup__Impl ;
    public final void rule__UIDescription__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4368:1: ( rule__UIDescription__UnorderedGroup__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4369:2: rule__UIDescription__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_rule__UIDescription__UnorderedGroup__Impl_in_rule__UIDescription__UnorderedGroup__28908);
            rule__UIDescription__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__UnorderedGroup__2"


    // $ANTLR start "rule__UIDescription__AreaCountAssignment_0_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4382:1: rule__UIDescription__AreaCountAssignment_0_0 : ( ruleAreaCount ) ;
    public final void rule__UIDescription__AreaCountAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4386:1: ( ( ruleAreaCount ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4387:1: ( ruleAreaCount )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4387:1: ( ruleAreaCount )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4388:1: ruleAreaCount
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getAreaCountAreaCountParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleAreaCount_in_rule__UIDescription__AreaCountAssignment_0_08942);
            ruleAreaCount();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDescriptionAccess().getAreaCountAreaCountParserRuleCall_0_0_0()); 
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
    // $ANTLR end "rule__UIDescription__AreaCountAssignment_0_0"


    // $ANTLR start "rule__UIDescription__TypeDefinitionAssignment_0_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4397:1: rule__UIDescription__TypeDefinitionAssignment_0_1 : ( ruleTypeDefinition ) ;
    public final void rule__UIDescription__TypeDefinitionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4401:1: ( ( ruleTypeDefinition ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4402:1: ( ruleTypeDefinition )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4402:1: ( ruleTypeDefinition )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4403:1: ruleTypeDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getTypeDefinitionTypeDefinitionParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleTypeDefinition_in_rule__UIDescription__TypeDefinitionAssignment_0_18973);
            ruleTypeDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDescriptionAccess().getTypeDefinitionTypeDefinitionParserRuleCall_0_1_0()); 
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
    // $ANTLR end "rule__UIDescription__TypeDefinitionAssignment_0_1"


    // $ANTLR start "rule__UIDescription__UsedDescriptionsAssignment_0_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4412:1: rule__UIDescription__UsedDescriptionsAssignment_0_2 : ( ruleUsedDescriptions ) ;
    public final void rule__UIDescription__UsedDescriptionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4416:1: ( ( ruleUsedDescriptions ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4417:1: ( ruleUsedDescriptions )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4417:1: ( ruleUsedDescriptions )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4418:1: ruleUsedDescriptions
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getUsedDescriptionsUsedDescriptionsParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleUsedDescriptions_in_rule__UIDescription__UsedDescriptionsAssignment_0_29004);
            ruleUsedDescriptions();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDescriptionAccess().getUsedDescriptionsUsedDescriptionsParserRuleCall_0_2_0()); 
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
    // $ANTLR end "rule__UIDescription__UsedDescriptionsAssignment_0_2"


    // $ANTLR start "rule__UIDescription__InputTypesAssignment_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4427:1: rule__UIDescription__InputTypesAssignment_1 : ( ruleinputType ) ;
    public final void rule__UIDescription__InputTypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4431:1: ( ( ruleinputType ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4432:1: ( ruleinputType )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4432:1: ( ruleinputType )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4433:1: ruleinputType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getInputTypesInputTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleinputType_in_rule__UIDescription__InputTypesAssignment_19035);
            ruleinputType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDescriptionAccess().getInputTypesInputTypeParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__UIDescription__InputTypesAssignment_1"


    // $ANTLR start "rule__UIDescription__DefinitionsAssignment_2_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4442:1: rule__UIDescription__DefinitionsAssignment_2_0 : ( ruleDefinition ) ;
    public final void rule__UIDescription__DefinitionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4446:1: ( ( ruleDefinition ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4447:1: ( ruleDefinition )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4447:1: ( ruleDefinition )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4448:1: ruleDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getDefinitionsDefinitionParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleDefinition_in_rule__UIDescription__DefinitionsAssignment_2_09066);
            ruleDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDescriptionAccess().getDefinitionsDefinitionParserRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__UIDescription__DefinitionsAssignment_2_0"


    // $ANTLR start "rule__UIDescription__AreasAssignment_2_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4457:1: rule__UIDescription__AreasAssignment_2_1 : ( ruleAreaAssignment ) ;
    public final void rule__UIDescription__AreasAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4461:1: ( ( ruleAreaAssignment ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4462:1: ( ruleAreaAssignment )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4462:1: ( ruleAreaAssignment )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4463:1: ruleAreaAssignment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getAreasAreaAssignmentParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleAreaAssignment_in_rule__UIDescription__AreasAssignment_2_19097);
            ruleAreaAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDescriptionAccess().getAreasAreaAssignmentParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__UIDescription__AreasAssignment_2_1"


    // $ANTLR start "rule__InputType__TypeAssignment_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4472:1: rule__InputType__TypeAssignment_1 : ( RULE_STRING ) ;
    public final void rule__InputType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4476:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4477:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4477:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4478:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputTypeAccess().getTypeSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__InputType__TypeAssignment_19128); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputTypeAccess().getTypeSTRINGTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__InputType__TypeAssignment_1"


    // $ANTLR start "rule__InputType__NameAssignment_3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4487:1: rule__InputType__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__InputType__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4491:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4492:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4492:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4493:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputTypeAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__InputType__NameAssignment_39159); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputTypeAccess().getNameSTRINGTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__InputType__NameAssignment_3"


    // $ANTLR start "rule__UsedDescriptions__DescriptionAssignment_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4502:1: rule__UsedDescriptions__DescriptionAssignment_1 : ( ruleUIDescriptionImport ) ;
    public final void rule__UsedDescriptions__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4506:1: ( ( ruleUIDescriptionImport ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4507:1: ( ruleUIDescriptionImport )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4507:1: ( ruleUIDescriptionImport )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4508:1: ruleUIDescriptionImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUsedDescriptionsAccess().getDescriptionUIDescriptionImportParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleUIDescriptionImport_in_rule__UsedDescriptions__DescriptionAssignment_19190);
            ruleUIDescriptionImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUsedDescriptionsAccess().getDescriptionUIDescriptionImportParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__UsedDescriptions__DescriptionAssignment_1"


    // $ANTLR start "rule__AreaCount__AreaCountAssignment_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4517:1: rule__AreaCount__AreaCountAssignment_1 : ( RULE_INT ) ;
    public final void rule__AreaCount__AreaCountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4521:1: ( ( RULE_INT ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4522:1: ( RULE_INT )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4522:1: ( RULE_INT )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4523:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaCountAccess().getAreaCountINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AreaCount__AreaCountAssignment_19221); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaCountAccess().getAreaCountINTTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__AreaCount__AreaCountAssignment_1"


    // $ANTLR start "rule__Definition__ConcreteDefitionAssignment_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4532:1: rule__Definition__ConcreteDefitionAssignment_1 : ( ruleComponentDefinition ) ;
    public final void rule__Definition__ConcreteDefitionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4536:1: ( ( ruleComponentDefinition ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4537:1: ( ruleComponentDefinition )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4537:1: ( ruleComponentDefinition )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4538:1: ruleComponentDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getConcreteDefitionComponentDefinitionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleComponentDefinition_in_rule__Definition__ConcreteDefitionAssignment_19252);
            ruleComponentDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getConcreteDefitionComponentDefinitionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Definition__ConcreteDefitionAssignment_1"


    // $ANTLR start "rule__TypeDefinition__TypeAssignment_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4547:1: rule__TypeDefinition__TypeAssignment_1 : ( ruleTYPE ) ;
    public final void rule__TypeDefinition__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4551:1: ( ( ruleTYPE ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4552:1: ( ruleTYPE )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4552:1: ( ruleTYPE )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4553:1: ruleTYPE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDefinitionAccess().getTypeTYPEParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleTYPE_in_rule__TypeDefinition__TypeAssignment_19283);
            ruleTYPE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDefinitionAccess().getTypeTYPEParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__TypeDefinition__TypeAssignment_1"


    // $ANTLR start "rule__UIDescriptionImport__DescriptionNameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4562:1: rule__UIDescriptionImport__DescriptionNameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__UIDescriptionImport__DescriptionNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4566:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4567:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4567:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4568:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionImportAccess().getDescriptionNameSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UIDescriptionImport__DescriptionNameAssignment_09314); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDescriptionImportAccess().getDescriptionNameSTRINGTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__UIDescriptionImport__DescriptionNameAssignment_0"


    // $ANTLR start "rule__UIDescriptionImport__LocalNameAssignment_1_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4577:1: rule__UIDescriptionImport__LocalNameAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__UIDescriptionImport__LocalNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4581:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4582:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4582:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4583:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionImportAccess().getLocalNameSTRINGTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UIDescriptionImport__LocalNameAssignment_1_19345); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDescriptionImportAccess().getLocalNameSTRINGTerminalRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__UIDescriptionImport__LocalNameAssignment_1_1"


    // $ANTLR start "rule__AreaAssignment__AreaAssignment_0_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4592:1: rule__AreaAssignment__AreaAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__AreaAssignment__AreaAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4596:1: ( ( RULE_INT ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4597:1: ( RULE_INT )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4597:1: ( RULE_INT )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4598:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAssignmentAccess().getAreaINTTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AreaAssignment__AreaAssignment_0_19376); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAssignmentAccess().getAreaINTTerminalRuleCall_0_1_0()); 
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
    // $ANTLR end "rule__AreaAssignment__AreaAssignment_0_1"


    // $ANTLR start "rule__AreaAssignment__ElementAssignment_0_3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4607:1: rule__AreaAssignment__ElementAssignment_0_3 : ( RULE_STRING ) ;
    public final void rule__AreaAssignment__ElementAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4611:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4612:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4612:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4613:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAssignmentAccess().getElementSTRINGTerminalRuleCall_0_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AreaAssignment__ElementAssignment_0_39407); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAssignmentAccess().getElementSTRINGTerminalRuleCall_0_3_0()); 
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
    // $ANTLR end "rule__AreaAssignment__ElementAssignment_0_3"


    // $ANTLR start "rule__AreaAssignment__ElementAssignment_1_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4622:1: rule__AreaAssignment__ElementAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__AreaAssignment__ElementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4626:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4627:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4627:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4628:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAssignmentAccess().getElementSTRINGTerminalRuleCall_1_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AreaAssignment__ElementAssignment_1_09438); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAssignmentAccess().getElementSTRINGTerminalRuleCall_1_0_0()); 
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
    // $ANTLR end "rule__AreaAssignment__ElementAssignment_1_0"


    // $ANTLR start "rule__AreaAssignment__AreaAssignment_1_3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4637:1: rule__AreaAssignment__AreaAssignment_1_3 : ( RULE_INT ) ;
    public final void rule__AreaAssignment__AreaAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4641:1: ( ( RULE_INT ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4642:1: ( RULE_INT )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4642:1: ( RULE_INT )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4643:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAssignmentAccess().getAreaINTTerminalRuleCall_1_3_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AreaAssignment__AreaAssignment_1_39469); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAssignmentAccess().getAreaINTTerminalRuleCall_1_3_0()); 
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
    // $ANTLR end "rule__AreaAssignment__AreaAssignment_1_3"


    // $ANTLR start "rule__MultiSelectionDefinition__TypeAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4652:1: rule__MultiSelectionDefinition__TypeAssignment_0 : ( ( 'MultiSelection' ) ) ;
    public final void rule__MultiSelectionDefinition__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4656:1: ( ( ( 'MultiSelection' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4657:1: ( ( 'MultiSelection' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4657:1: ( ( 'MultiSelection' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4658:1: ( 'MultiSelection' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getTypeMultiSelectionKeyword_0_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4659:1: ( 'MultiSelection' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4660:1: 'MultiSelection'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getTypeMultiSelectionKeyword_0_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__MultiSelectionDefinition__TypeAssignment_09505); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiSelectionDefinitionAccess().getTypeMultiSelectionKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiSelectionDefinitionAccess().getTypeMultiSelectionKeyword_0_0()); 
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
    // $ANTLR end "rule__MultiSelectionDefinition__TypeAssignment_0"


    // $ANTLR start "rule__MultiSelectionDefinition__NameAssignment_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4675:1: rule__MultiSelectionDefinition__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MultiSelectionDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4679:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4680:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4680:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4681:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MultiSelectionDefinition__NameAssignment_29544); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiSelectionDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__MultiSelectionDefinition__NameAssignment_2"


    // $ANTLR start "rule__MultiSelectionDefinition__InputTypeAssignment_3_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4690:1: rule__MultiSelectionDefinition__InputTypeAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__MultiSelectionDefinition__InputTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4694:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4695:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4695:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4696:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getInputTypeSTRINGTerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MultiSelectionDefinition__InputTypeAssignment_3_19575); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiSelectionDefinitionAccess().getInputTypeSTRINGTerminalRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__MultiSelectionDefinition__InputTypeAssignment_3_1"


    // $ANTLR start "rule__MultiSelectionDefinition__SelectableValuesLocationAssignment_3_2_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4705:1: rule__MultiSelectionDefinition__SelectableValuesLocationAssignment_3_2_1 : ( RULE_STRING ) ;
    public final void rule__MultiSelectionDefinition__SelectableValuesLocationAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4709:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4710:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4710:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4711:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getSelectableValuesLocationSTRINGTerminalRuleCall_3_2_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MultiSelectionDefinition__SelectableValuesLocationAssignment_3_2_19606); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiSelectionDefinitionAccess().getSelectableValuesLocationSTRINGTerminalRuleCall_3_2_1_0()); 
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
    // $ANTLR end "rule__MultiSelectionDefinition__SelectableValuesLocationAssignment_3_2_1"


    // $ANTLR start "rule__MultiSelectionDefinition__SelectedValuesLocationAssignment_3_2_2_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4720:1: rule__MultiSelectionDefinition__SelectedValuesLocationAssignment_3_2_2_1 : ( RULE_STRING ) ;
    public final void rule__MultiSelectionDefinition__SelectedValuesLocationAssignment_3_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4724:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4725:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4725:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4726:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getSelectedValuesLocationSTRINGTerminalRuleCall_3_2_2_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MultiSelectionDefinition__SelectedValuesLocationAssignment_3_2_2_19637); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiSelectionDefinitionAccess().getSelectedValuesLocationSTRINGTerminalRuleCall_3_2_2_1_0()); 
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
    // $ANTLR end "rule__MultiSelectionDefinition__SelectedValuesLocationAssignment_3_2_2_1"


    // $ANTLR start "rule__CheckboxDefinition__TypeAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4735:1: rule__CheckboxDefinition__TypeAssignment_0 : ( ( 'Checkbox' ) ) ;
    public final void rule__CheckboxDefinition__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4739:1: ( ( ( 'Checkbox' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4740:1: ( ( 'Checkbox' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4740:1: ( ( 'Checkbox' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4741:1: ( 'Checkbox' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckboxDefinitionAccess().getTypeCheckboxKeyword_0_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4742:1: ( 'Checkbox' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4743:1: 'Checkbox'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckboxDefinitionAccess().getTypeCheckboxKeyword_0_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__CheckboxDefinition__TypeAssignment_09673); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCheckboxDefinitionAccess().getTypeCheckboxKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCheckboxDefinitionAccess().getTypeCheckboxKeyword_0_0()); 
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
    // $ANTLR end "rule__CheckboxDefinition__TypeAssignment_0"


    // $ANTLR start "rule__CheckboxDefinition__NameAssignment_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4758:1: rule__CheckboxDefinition__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__CheckboxDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4762:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4763:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4763:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4764:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckboxDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CheckboxDefinition__NameAssignment_29712); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCheckboxDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__CheckboxDefinition__NameAssignment_2"


    // $ANTLR start "rule__CheckboxDefinition__TextAssignment_4_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4773:1: rule__CheckboxDefinition__TextAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__CheckboxDefinition__TextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4777:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4778:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4778:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4779:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckboxDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CheckboxDefinition__TextAssignment_4_19743); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCheckboxDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__CheckboxDefinition__TextAssignment_4_1"


    // $ANTLR start "rule__RadioboxDefinition__TypeAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4788:1: rule__RadioboxDefinition__TypeAssignment_0 : ( ( 'Radiobox' ) ) ;
    public final void rule__RadioboxDefinition__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4792:1: ( ( ( 'Radiobox' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4793:1: ( ( 'Radiobox' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4793:1: ( ( 'Radiobox' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4794:1: ( 'Radiobox' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRadioboxDefinitionAccess().getTypeRadioboxKeyword_0_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4795:1: ( 'Radiobox' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4796:1: 'Radiobox'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRadioboxDefinitionAccess().getTypeRadioboxKeyword_0_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__RadioboxDefinition__TypeAssignment_09779); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRadioboxDefinitionAccess().getTypeRadioboxKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRadioboxDefinitionAccess().getTypeRadioboxKeyword_0_0()); 
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
    // $ANTLR end "rule__RadioboxDefinition__TypeAssignment_0"


    // $ANTLR start "rule__RadioboxDefinition__NameAssignment_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4811:1: rule__RadioboxDefinition__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__RadioboxDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4815:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4816:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4816:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4817:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRadioboxDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RadioboxDefinition__NameAssignment_29818); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRadioboxDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__RadioboxDefinition__NameAssignment_2"


    // $ANTLR start "rule__RadioboxDefinition__TextAssignment_4_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4826:1: rule__RadioboxDefinition__TextAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__RadioboxDefinition__TextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4830:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4831:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4831:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4832:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRadioboxDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RadioboxDefinition__TextAssignment_4_19849); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRadioboxDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__RadioboxDefinition__TextAssignment_4_1"


    // $ANTLR start "rule__TableDefinition__TypeAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4841:1: rule__TableDefinition__TypeAssignment_0 : ( ( 'Table' ) ) ;
    public final void rule__TableDefinition__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4845:1: ( ( ( 'Table' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4846:1: ( ( 'Table' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4846:1: ( ( 'Table' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4847:1: ( 'Table' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableDefinitionAccess().getTypeTableKeyword_0_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4848:1: ( 'Table' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4849:1: 'Table'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableDefinitionAccess().getTypeTableKeyword_0_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__TableDefinition__TypeAssignment_09885); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableDefinitionAccess().getTypeTableKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableDefinitionAccess().getTypeTableKeyword_0_0()); 
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
    // $ANTLR end "rule__TableDefinition__TypeAssignment_0"


    // $ANTLR start "rule__TableDefinition__NameAssignment_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4864:1: rule__TableDefinition__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TableDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4868:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4869:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4869:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4870:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TableDefinition__NameAssignment_29924); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__TableDefinition__NameAssignment_2"


    // $ANTLR start "rule__TableDefinition__TextAssignment_4_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4879:1: rule__TableDefinition__TextAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__TableDefinition__TextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4883:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4884:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4884:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4885:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TableDefinition__TextAssignment_4_19955); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__TableDefinition__TextAssignment_4_1"


    // $ANTLR start "rule__TreeDefinition__TypeAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4894:1: rule__TreeDefinition__TypeAssignment_0 : ( ( 'Tree' ) ) ;
    public final void rule__TreeDefinition__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4898:1: ( ( ( 'Tree' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4899:1: ( ( 'Tree' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4899:1: ( ( 'Tree' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4900:1: ( 'Tree' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTreeDefinitionAccess().getTypeTreeKeyword_0_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4901:1: ( 'Tree' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4902:1: 'Tree'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTreeDefinitionAccess().getTypeTreeKeyword_0_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__TreeDefinition__TypeAssignment_09991); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTreeDefinitionAccess().getTypeTreeKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTreeDefinitionAccess().getTypeTreeKeyword_0_0()); 
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
    // $ANTLR end "rule__TreeDefinition__TypeAssignment_0"


    // $ANTLR start "rule__TreeDefinition__NameAssignment_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4917:1: rule__TreeDefinition__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TreeDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4921:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4922:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4922:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4923:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTreeDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TreeDefinition__NameAssignment_210030); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTreeDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__TreeDefinition__NameAssignment_2"


    // $ANTLR start "rule__TreeDefinition__TextAssignment_4_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4932:1: rule__TreeDefinition__TextAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__TreeDefinition__TextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4936:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4937:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4937:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4938:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTreeDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TreeDefinition__TextAssignment_4_110061); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTreeDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__TreeDefinition__TextAssignment_4_1"


    // $ANTLR start "rule__TextfieldDefinition__TypeAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4947:1: rule__TextfieldDefinition__TypeAssignment_0 : ( ( 'Textfield' ) ) ;
    public final void rule__TextfieldDefinition__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4951:1: ( ( ( 'Textfield' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4952:1: ( ( 'Textfield' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4952:1: ( ( 'Textfield' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4953:1: ( 'Textfield' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextfieldDefinitionAccess().getTypeTextfieldKeyword_0_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4954:1: ( 'Textfield' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4955:1: 'Textfield'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextfieldDefinitionAccess().getTypeTextfieldKeyword_0_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__TextfieldDefinition__TypeAssignment_010097); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextfieldDefinitionAccess().getTypeTextfieldKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextfieldDefinitionAccess().getTypeTextfieldKeyword_0_0()); 
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
    // $ANTLR end "rule__TextfieldDefinition__TypeAssignment_0"


    // $ANTLR start "rule__TextfieldDefinition__NameAssignment_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4970:1: rule__TextfieldDefinition__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TextfieldDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4974:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4975:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4975:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4976:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextfieldDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TextfieldDefinition__NameAssignment_210136); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextfieldDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__TextfieldDefinition__NameAssignment_2"


    // $ANTLR start "rule__TextfieldDefinition__TextAssignment_4_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4985:1: rule__TextfieldDefinition__TextAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__TextfieldDefinition__TextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4989:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4990:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4990:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4991:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextfieldDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TextfieldDefinition__TextAssignment_4_110167); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextfieldDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__TextfieldDefinition__TextAssignment_4_1"


    // $ANTLR start "rule__ButtonDefinition__TypeAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5000:1: rule__ButtonDefinition__TypeAssignment_0 : ( ( 'Button' ) ) ;
    public final void rule__ButtonDefinition__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5004:1: ( ( ( 'Button' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5005:1: ( ( 'Button' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5005:1: ( ( 'Button' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5006:1: ( 'Button' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonDefinitionAccess().getTypeButtonKeyword_0_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5007:1: ( 'Button' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5008:1: 'Button'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonDefinitionAccess().getTypeButtonKeyword_0_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__ButtonDefinition__TypeAssignment_010203); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonDefinitionAccess().getTypeButtonKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonDefinitionAccess().getTypeButtonKeyword_0_0()); 
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
    // $ANTLR end "rule__ButtonDefinition__TypeAssignment_0"


    // $ANTLR start "rule__ButtonDefinition__NameAssignment_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5023:1: rule__ButtonDefinition__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ButtonDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5027:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5028:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5028:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5029:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ButtonDefinition__NameAssignment_210242); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__ButtonDefinition__NameAssignment_2"


    // $ANTLR start "rule__ButtonDefinition__TextAssignment_4_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5038:1: rule__ButtonDefinition__TextAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__ButtonDefinition__TextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5042:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5043:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5043:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5044:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ButtonDefinition__TextAssignment_4_110273); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__ButtonDefinition__TextAssignment_4_1"


    // $ANTLR start "rule__ButtonDefinition__InteractionAssignment_5_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5053:1: rule__ButtonDefinition__InteractionAssignment_5_1 : ( ruleInteraction ) ;
    public final void rule__ButtonDefinition__InteractionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5057:1: ( ( ruleInteraction ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5058:1: ( ruleInteraction )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5058:1: ( ruleInteraction )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5059:1: ruleInteraction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonDefinitionAccess().getInteractionInteractionParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleInteraction_in_rule__ButtonDefinition__InteractionAssignment_5_110304);
            ruleInteraction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonDefinitionAccess().getInteractionInteractionParserRuleCall_5_1_0()); 
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
    // $ANTLR end "rule__ButtonDefinition__InteractionAssignment_5_1"


    // $ANTLR start "rule__Interaction__NameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5068:1: rule__Interaction__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Interaction__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5072:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5073:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5073:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5074:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInteractionAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Interaction__NameAssignment_010335); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInteractionAccess().getNameSTRINGTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Interaction__NameAssignment_0"


    // $ANTLR start "rule__Interaction__ActionsAssignment_4"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5083:1: rule__Interaction__ActionsAssignment_4 : ( ruleUIAction ) ;
    public final void rule__Interaction__ActionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5087:1: ( ( ruleUIAction ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5088:1: ( ruleUIAction )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5088:1: ( ruleUIAction )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5089:1: ruleUIAction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInteractionAccess().getActionsUIActionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleUIAction_in_rule__Interaction__ActionsAssignment_410366);
            ruleUIAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInteractionAccess().getActionsUIActionParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Interaction__ActionsAssignment_4"


    // $ANTLR start "rule__LabelDefinition__TypeAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5098:1: rule__LabelDefinition__TypeAssignment_0 : ( ( 'Label' ) ) ;
    public final void rule__LabelDefinition__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5102:1: ( ( ( 'Label' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5103:1: ( ( 'Label' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5103:1: ( ( 'Label' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5104:1: ( 'Label' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelDefinitionAccess().getTypeLabelKeyword_0_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5105:1: ( 'Label' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5106:1: 'Label'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelDefinitionAccess().getTypeLabelKeyword_0_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__LabelDefinition__TypeAssignment_010402); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabelDefinitionAccess().getTypeLabelKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabelDefinitionAccess().getTypeLabelKeyword_0_0()); 
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
    // $ANTLR end "rule__LabelDefinition__TypeAssignment_0"


    // $ANTLR start "rule__LabelDefinition__NameAssignment_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5121:1: rule__LabelDefinition__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LabelDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5125:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5126:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5126:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5127:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LabelDefinition__NameAssignment_210441); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabelDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__LabelDefinition__NameAssignment_2"


    // $ANTLR start "rule__LabelDefinition__TextAssignment_4_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5136:1: rule__LabelDefinition__TextAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__LabelDefinition__TextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5140:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5141:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5141:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5142:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LabelDefinition__TextAssignment_4_110472); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabelDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__LabelDefinition__TextAssignment_4_1"


    // $ANTLR start "rule__UIAction__TypeAssignment_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5151:1: rule__UIAction__TypeAssignment_1 : ( ( 'UiAction' ) ) ;
    public final void rule__UIAction__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5155:1: ( ( ( 'UiAction' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5156:1: ( ( 'UiAction' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5156:1: ( ( 'UiAction' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5157:1: ( 'UiAction' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIActionAccess().getTypeUiActionKeyword_1_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5158:1: ( 'UiAction' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5159:1: 'UiAction'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIActionAccess().getTypeUiActionKeyword_1_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__UIAction__TypeAssignment_110508); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIActionAccess().getTypeUiActionKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIActionAccess().getTypeUiActionKeyword_1_0()); 
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
    // $ANTLR end "rule__UIAction__TypeAssignment_1"


    // $ANTLR start "rule__UIAction__UiElementNameAssignment_3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5174:1: rule__UIAction__UiElementNameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__UIAction__UiElementNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5178:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5179:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5179:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5180:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIActionAccess().getUiElementNameSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UIAction__UiElementNameAssignment_310547); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIActionAccess().getUiElementNameSTRINGTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__UIAction__UiElementNameAssignment_3"


    // $ANTLR start "rule__UIAction__PropertiesAssignment_5"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5189:1: rule__UIAction__PropertiesAssignment_5 : ( ruleProperty ) ;
    public final void rule__UIAction__PropertiesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5193:1: ( ( ruleProperty ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5194:1: ( ruleProperty )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5194:1: ( ruleProperty )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5195:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIActionAccess().getPropertiesPropertyParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_rule__UIAction__PropertiesAssignment_510578);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIActionAccess().getPropertiesPropertyParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__UIAction__PropertiesAssignment_5"


    // $ANTLR start "rule__CommonProperty__NameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5204:1: rule__CommonProperty__NameAssignment_0 : ( ruleCommonPropertyType ) ;
    public final void rule__CommonProperty__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5208:1: ( ( ruleCommonPropertyType ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5209:1: ( ruleCommonPropertyType )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5209:1: ( ruleCommonPropertyType )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5210:1: ruleCommonPropertyType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommonPropertyAccess().getNameCommonPropertyTypeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleCommonPropertyType_in_rule__CommonProperty__NameAssignment_010609);
            ruleCommonPropertyType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommonPropertyAccess().getNameCommonPropertyTypeParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__CommonProperty__NameAssignment_0"


    // $ANTLR start "rule__CommonProperty__ValueAssignment_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5219:1: rule__CommonProperty__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__CommonProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5223:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5224:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5224:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5225:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommonPropertyAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CommonProperty__ValueAssignment_210640); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommonPropertyAccess().getValueSTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__CommonProperty__ValueAssignment_2"

    // $ANTLR start synpred1_InternalGuiDSL
    public final void synpred1_InternalGuiDSL_fragment() throws RecognitionException {   
        // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4306:8: ( rule__UIDescription__InputTypesAssignment_1 )
        // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4306:9: rule__UIDescription__InputTypesAssignment_1
        {
        pushFollow(FOLLOW_rule__UIDescription__InputTypesAssignment_1_in_synpred1_InternalGuiDSL8692);
        rule__UIDescription__InputTypesAssignment_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalGuiDSL

    // Delegated rules

    public final boolean synpred1_InternalGuiDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalGuiDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleUIDescription_in_entryRuleUIDescription61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIDescription68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__UnorderedGroup_in_ruleUIDescription94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinputType_in_entryRuleinputType121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinputType128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputType__Group__0_in_ruleinputType154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsedDescriptions_in_entryRuleUsedDescriptions181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsedDescriptions188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group__0_in_ruleUsedDescriptions214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAreaCount_in_entryRuleAreaCount241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAreaCount248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaCount__Group__0_in_ruleAreaCount274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0_in_ruleDefinition334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__0_in_ruleTypeDefinition394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTYPE_in_entryRuleTYPE421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTYPE428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TYPE__Alternatives_in_ruleTYPE454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIDescriptionImport_in_entryRuleUIDescriptionImport481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIDescriptionImport488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescriptionImport__Group__0_in_ruleUIDescriptionImport514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAreaAssignment_in_entryRuleAreaAssignment541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAreaAssignment548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Alternatives_in_ruleAreaAssignment574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDefinition_in_entryRuleComponentDefinition601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentDefinition608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentDefinition__Alternatives_in_ruleComponentDefinition634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiSelectionDefinition_in_entryRuleMultiSelectionDefinition661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiSelectionDefinition668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group__0_in_ruleMultiSelectionDefinition694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckboxDefinition_in_entryRuleCheckboxDefinition721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckboxDefinition728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group__0_in_ruleCheckboxDefinition754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadioboxDefinition_in_entryRuleRadioboxDefinition781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRadioboxDefinition788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group__0_in_ruleRadioboxDefinition814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableDefinition_in_entryRuleTableDefinition841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableDefinition848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__0_in_ruleTableDefinition874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreeDefinition_in_entryRuleTreeDefinition901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTreeDefinition908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__0_in_ruleTreeDefinition934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfieldDefinition_in_entryRuleTextfieldDefinition961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextfieldDefinition968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__0_in_ruleTextfieldDefinition994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonDefinition_in_entryRuleButtonDefinition1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonDefinition1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__0_in_ruleButtonDefinition1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteraction_in_entryRuleInteraction1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteraction1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interaction__Group__0_in_ruleInteraction1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelDefinition_in_entryRuleLabelDefinition1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelDefinition1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__0_in_ruleLabelDefinition1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIAction_in_entryRuleUIAction1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIAction1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIAction__Group__0_in_ruleUIAction1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperty_in_ruleProperty1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperty_in_entryRuleCommonProperty1320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonProperty1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperty__Group__0_in_ruleCommonProperty1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonPropertyType_in_entryRuleCommonPropertyType1380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonPropertyType1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleCommonPropertyType1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractiontype_in_entryRuleInteractiontype1442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractiontype1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleInteractiontype1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__TYPE__Alternatives1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__TYPE__Alternatives1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_0__0_in_rule__AreaAssignment__Alternatives1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_1__0_in_rule__AreaAssignment__Alternatives1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelDefinition_in_rule__ComponentDefinition__Alternatives1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonDefinition_in_rule__ComponentDefinition__Alternatives1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfieldDefinition_in_rule__ComponentDefinition__Alternatives1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreeDefinition_in_rule__ComponentDefinition__Alternatives1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableDefinition_in_rule__ComponentDefinition__Alternatives1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadioboxDefinition_in_rule__ComponentDefinition__Alternatives1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckboxDefinition_in_rule__ComponentDefinition__Alternatives1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiSelectionDefinition_in_rule__ComponentDefinition__Alternatives1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group_0__0__Impl_in_rule__UIDescription__Group_0__01768 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__UIDescription__Group_0__1_in_rule__UIDescription__Group_0__01771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__AreaCountAssignment_0_0_in_rule__UIDescription__Group_0__0__Impl1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group_0__1__Impl_in_rule__UIDescription__Group_0__11828 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__UIDescription__Group_0__2_in_rule__UIDescription__Group_0__11831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__TypeDefinitionAssignment_0_1_in_rule__UIDescription__Group_0__1__Impl1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group_0__2__Impl_in_rule__UIDescription__Group_0__21888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__UsedDescriptionsAssignment_0_2_in_rule__UIDescription__Group_0__2__Impl1915 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group_2__0__Impl_in_rule__UIDescription__Group_2__01952 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__UIDescription__Group_2__1_in_rule__UIDescription__Group_2__01955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__DefinitionsAssignment_2_0_in_rule__UIDescription__Group_2__0__Impl1982 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group_2__1__Impl_in_rule__UIDescription__Group_2__12013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__AreasAssignment_2_1_in_rule__UIDescription__Group_2__1__Impl2040 = new BitSet(new long[]{0x0000000000800012L});
    public static final BitSet FOLLOW_rule__InputType__Group__0__Impl_in_rule__InputType__Group__02075 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InputType__Group__1_in_rule__InputType__Group__02078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__InputType__Group__0__Impl2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputType__Group__1__Impl_in_rule__InputType__Group__12137 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__InputType__Group__2_in_rule__InputType__Group__12140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputType__TypeAssignment_1_in_rule__InputType__Group__1__Impl2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputType__Group__2__Impl_in_rule__InputType__Group__22197 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InputType__Group__3_in_rule__InputType__Group__22200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__InputType__Group__2__Impl2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputType__Group__3__Impl_in_rule__InputType__Group__32259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputType__NameAssignment_3_in_rule__InputType__Group__3__Impl2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group__0__Impl_in_rule__UsedDescriptions__Group__02324 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group__1_in_rule__UsedDescriptions__Group__02327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__UsedDescriptions__Group__0__Impl2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group__1__Impl_in_rule__UsedDescriptions__Group__12386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__DescriptionAssignment_1_in_rule__UsedDescriptions__Group__1__Impl2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaCount__Group__0__Impl_in_rule__AreaCount__Group__02447 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AreaCount__Group__1_in_rule__AreaCount__Group__02450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__AreaCount__Group__0__Impl2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaCount__Group__1__Impl_in_rule__AreaCount__Group__12509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaCount__AreaCountAssignment_1_in_rule__AreaCount__Group__1__Impl2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__02570 = new BitSet(new long[]{0x00000FF000000000L});
    public static final BitSet FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__02573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Definition__Group__0__Impl2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__12632 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__12635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__ConcreteDefitionAssignment_1_in_rule__Definition__Group__1__Impl2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__22692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Definition__Group__2__Impl2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__0__Impl_in_rule__TypeDefinition__Group__02757 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__1_in_rule__TypeDefinition__Group__02760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__TypeDefinition__Group__0__Impl2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__1__Impl_in_rule__TypeDefinition__Group__12819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__TypeAssignment_1_in_rule__TypeDefinition__Group__1__Impl2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescriptionImport__Group__0__Impl_in_rule__UIDescriptionImport__Group__02880 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__UIDescriptionImport__Group__1_in_rule__UIDescriptionImport__Group__02883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescriptionImport__DescriptionNameAssignment_0_in_rule__UIDescriptionImport__Group__0__Impl2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescriptionImport__Group__1__Impl_in_rule__UIDescriptionImport__Group__12940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescriptionImport__Group_1__0_in_rule__UIDescriptionImport__Group__1__Impl2967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescriptionImport__Group_1__0__Impl_in_rule__UIDescriptionImport__Group_1__03002 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UIDescriptionImport__Group_1__1_in_rule__UIDescriptionImport__Group_1__03005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__UIDescriptionImport__Group_1__0__Impl3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescriptionImport__Group_1__1__Impl_in_rule__UIDescriptionImport__Group_1__13064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescriptionImport__LocalNameAssignment_1_1_in_rule__UIDescriptionImport__Group_1__1__Impl3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_0__0__Impl_in_rule__AreaAssignment__Group_0__03125 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_0__1_in_rule__AreaAssignment__Group_0__03128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__AreaAssignment__Group_0__0__Impl3156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_0__1__Impl_in_rule__AreaAssignment__Group_0__13187 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_0__2_in_rule__AreaAssignment__Group_0__13190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__AreaAssignment_0_1_in_rule__AreaAssignment__Group_0__1__Impl3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_0__2__Impl_in_rule__AreaAssignment__Group_0__23247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_0__3_in_rule__AreaAssignment__Group_0__23250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__AreaAssignment__Group_0__2__Impl3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_0__3__Impl_in_rule__AreaAssignment__Group_0__33309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__ElementAssignment_0_3_in_rule__AreaAssignment__Group_0__3__Impl3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_1__0__Impl_in_rule__AreaAssignment__Group_1__03374 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_1__1_in_rule__AreaAssignment__Group_1__03377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__ElementAssignment_1_0_in_rule__AreaAssignment__Group_1__0__Impl3404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_1__1__Impl_in_rule__AreaAssignment__Group_1__13434 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_1__2_in_rule__AreaAssignment__Group_1__13437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__AreaAssignment__Group_1__1__Impl3465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_1__2__Impl_in_rule__AreaAssignment__Group_1__23496 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_1__3_in_rule__AreaAssignment__Group_1__23499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__AreaAssignment__Group_1__2__Impl3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_1__3__Impl_in_rule__AreaAssignment__Group_1__33558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__AreaAssignment_1_3_in_rule__AreaAssignment__Group_1__3__Impl3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group__0__Impl_in_rule__MultiSelectionDefinition__Group__03623 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group__1_in_rule__MultiSelectionDefinition__Group__03626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__TypeAssignment_0_in_rule__MultiSelectionDefinition__Group__0__Impl3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group__1__Impl_in_rule__MultiSelectionDefinition__Group__13683 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group__2_in_rule__MultiSelectionDefinition__Group__13686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__MultiSelectionDefinition__Group__1__Impl3714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group__2__Impl_in_rule__MultiSelectionDefinition__Group__23745 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group__3_in_rule__MultiSelectionDefinition__Group__23748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__NameAssignment_2_in_rule__MultiSelectionDefinition__Group__2__Impl3775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group__3__Impl_in_rule__MultiSelectionDefinition__Group__33805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group_3__0_in_rule__MultiSelectionDefinition__Group__3__Impl3832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group_3__0__Impl_in_rule__MultiSelectionDefinition__Group_3__03871 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group_3__1_in_rule__MultiSelectionDefinition__Group_3__03874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__MultiSelectionDefinition__Group_3__0__Impl3902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group_3__1__Impl_in_rule__MultiSelectionDefinition__Group_3__13933 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group_3__2_in_rule__MultiSelectionDefinition__Group_3__13936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__InputTypeAssignment_3_1_in_rule__MultiSelectionDefinition__Group_3__1__Impl3963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group_3__2__Impl_in_rule__MultiSelectionDefinition__Group_3__23993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group_3_2__0_in_rule__MultiSelectionDefinition__Group_3__2__Impl4020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group_3_2__0__Impl_in_rule__MultiSelectionDefinition__Group_3_2__04057 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group_3_2__1_in_rule__MultiSelectionDefinition__Group_3_2__04060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MultiSelectionDefinition__Group_3_2__0__Impl4088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group_3_2__1__Impl_in_rule__MultiSelectionDefinition__Group_3_2__14119 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group_3_2__2_in_rule__MultiSelectionDefinition__Group_3_2__14122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__SelectableValuesLocationAssignment_3_2_1_in_rule__MultiSelectionDefinition__Group_3_2__1__Impl4149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group_3_2__2__Impl_in_rule__MultiSelectionDefinition__Group_3_2__24179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group_3_2_2__0_in_rule__MultiSelectionDefinition__Group_3_2__2__Impl4206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group_3_2_2__0__Impl_in_rule__MultiSelectionDefinition__Group_3_2_2__04243 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group_3_2_2__1_in_rule__MultiSelectionDefinition__Group_3_2_2__04246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__MultiSelectionDefinition__Group_3_2_2__0__Impl4274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group_3_2_2__1__Impl_in_rule__MultiSelectionDefinition__Group_3_2_2__14305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__SelectedValuesLocationAssignment_3_2_2_1_in_rule__MultiSelectionDefinition__Group_3_2_2__1__Impl4332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group__0__Impl_in_rule__CheckboxDefinition__Group__04366 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group__1_in_rule__CheckboxDefinition__Group__04369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__TypeAssignment_0_in_rule__CheckboxDefinition__Group__0__Impl4396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group__1__Impl_in_rule__CheckboxDefinition__Group__14426 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group__2_in_rule__CheckboxDefinition__Group__14429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__CheckboxDefinition__Group__1__Impl4457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group__2__Impl_in_rule__CheckboxDefinition__Group__24488 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group__3_in_rule__CheckboxDefinition__Group__24491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__NameAssignment_2_in_rule__CheckboxDefinition__Group__2__Impl4518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group__3__Impl_in_rule__CheckboxDefinition__Group__34548 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group__4_in_rule__CheckboxDefinition__Group__34551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CheckboxDefinition__Group__3__Impl4579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group__4__Impl_in_rule__CheckboxDefinition__Group__44610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group_4__0_in_rule__CheckboxDefinition__Group__4__Impl4637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group_4__0__Impl_in_rule__CheckboxDefinition__Group_4__04678 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group_4__1_in_rule__CheckboxDefinition__Group_4__04681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CheckboxDefinition__Group_4__0__Impl4709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group_4__1__Impl_in_rule__CheckboxDefinition__Group_4__14740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__TextAssignment_4_1_in_rule__CheckboxDefinition__Group_4__1__Impl4767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group__0__Impl_in_rule__RadioboxDefinition__Group__04801 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group__1_in_rule__RadioboxDefinition__Group__04804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__TypeAssignment_0_in_rule__RadioboxDefinition__Group__0__Impl4831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group__1__Impl_in_rule__RadioboxDefinition__Group__14861 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group__2_in_rule__RadioboxDefinition__Group__14864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__RadioboxDefinition__Group__1__Impl4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group__2__Impl_in_rule__RadioboxDefinition__Group__24923 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group__3_in_rule__RadioboxDefinition__Group__24926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__NameAssignment_2_in_rule__RadioboxDefinition__Group__2__Impl4953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group__3__Impl_in_rule__RadioboxDefinition__Group__34983 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group__4_in_rule__RadioboxDefinition__Group__34986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__RadioboxDefinition__Group__3__Impl5014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group__4__Impl_in_rule__RadioboxDefinition__Group__45045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group_4__0_in_rule__RadioboxDefinition__Group__4__Impl5072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group_4__0__Impl_in_rule__RadioboxDefinition__Group_4__05113 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group_4__1_in_rule__RadioboxDefinition__Group_4__05116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__RadioboxDefinition__Group_4__0__Impl5144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group_4__1__Impl_in_rule__RadioboxDefinition__Group_4__15175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__TextAssignment_4_1_in_rule__RadioboxDefinition__Group_4__1__Impl5202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__0__Impl_in_rule__TableDefinition__Group__05236 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__1_in_rule__TableDefinition__Group__05239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__TypeAssignment_0_in_rule__TableDefinition__Group__0__Impl5266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__1__Impl_in_rule__TableDefinition__Group__15296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__2_in_rule__TableDefinition__Group__15299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TableDefinition__Group__1__Impl5327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__2__Impl_in_rule__TableDefinition__Group__25358 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__3_in_rule__TableDefinition__Group__25361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__NameAssignment_2_in_rule__TableDefinition__Group__2__Impl5388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__3__Impl_in_rule__TableDefinition__Group__35418 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__4_in_rule__TableDefinition__Group__35421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TableDefinition__Group__3__Impl5449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__4__Impl_in_rule__TableDefinition__Group__45480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group_4__0_in_rule__TableDefinition__Group__4__Impl5507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group_4__0__Impl_in_rule__TableDefinition__Group_4__05548 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group_4__1_in_rule__TableDefinition__Group_4__05551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TableDefinition__Group_4__0__Impl5579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group_4__1__Impl_in_rule__TableDefinition__Group_4__15610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__TextAssignment_4_1_in_rule__TableDefinition__Group_4__1__Impl5637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__0__Impl_in_rule__TreeDefinition__Group__05671 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__1_in_rule__TreeDefinition__Group__05674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__TypeAssignment_0_in_rule__TreeDefinition__Group__0__Impl5701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__1__Impl_in_rule__TreeDefinition__Group__15731 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__2_in_rule__TreeDefinition__Group__15734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TreeDefinition__Group__1__Impl5762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__2__Impl_in_rule__TreeDefinition__Group__25793 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__3_in_rule__TreeDefinition__Group__25796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__NameAssignment_2_in_rule__TreeDefinition__Group__2__Impl5823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__3__Impl_in_rule__TreeDefinition__Group__35853 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__4_in_rule__TreeDefinition__Group__35856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TreeDefinition__Group__3__Impl5884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__4__Impl_in_rule__TreeDefinition__Group__45915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group_4__0_in_rule__TreeDefinition__Group__4__Impl5942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group_4__0__Impl_in_rule__TreeDefinition__Group_4__05983 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group_4__1_in_rule__TreeDefinition__Group_4__05986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TreeDefinition__Group_4__0__Impl6014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group_4__1__Impl_in_rule__TreeDefinition__Group_4__16045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__TextAssignment_4_1_in_rule__TreeDefinition__Group_4__1__Impl6072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__0__Impl_in_rule__TextfieldDefinition__Group__06106 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__1_in_rule__TextfieldDefinition__Group__06109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__TypeAssignment_0_in_rule__TextfieldDefinition__Group__0__Impl6136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__1__Impl_in_rule__TextfieldDefinition__Group__16166 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__2_in_rule__TextfieldDefinition__Group__16169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TextfieldDefinition__Group__1__Impl6197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__2__Impl_in_rule__TextfieldDefinition__Group__26228 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__3_in_rule__TextfieldDefinition__Group__26231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__NameAssignment_2_in_rule__TextfieldDefinition__Group__2__Impl6258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__3__Impl_in_rule__TextfieldDefinition__Group__36288 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__4_in_rule__TextfieldDefinition__Group__36291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TextfieldDefinition__Group__3__Impl6319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__4__Impl_in_rule__TextfieldDefinition__Group__46350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group_4__0_in_rule__TextfieldDefinition__Group__4__Impl6377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group_4__0__Impl_in_rule__TextfieldDefinition__Group_4__06418 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group_4__1_in_rule__TextfieldDefinition__Group_4__06421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TextfieldDefinition__Group_4__0__Impl6449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group_4__1__Impl_in_rule__TextfieldDefinition__Group_4__16480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__TextAssignment_4_1_in_rule__TextfieldDefinition__Group_4__1__Impl6507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__0__Impl_in_rule__ButtonDefinition__Group__06541 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__1_in_rule__ButtonDefinition__Group__06544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__TypeAssignment_0_in_rule__ButtonDefinition__Group__0__Impl6571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__1__Impl_in_rule__ButtonDefinition__Group__16601 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__2_in_rule__ButtonDefinition__Group__16604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ButtonDefinition__Group__1__Impl6632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__2__Impl_in_rule__ButtonDefinition__Group__26663 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__3_in_rule__ButtonDefinition__Group__26666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__NameAssignment_2_in_rule__ButtonDefinition__Group__2__Impl6693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__3__Impl_in_rule__ButtonDefinition__Group__36723 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__4_in_rule__ButtonDefinition__Group__36726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ButtonDefinition__Group__3__Impl6754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__4__Impl_in_rule__ButtonDefinition__Group__46785 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__5_in_rule__ButtonDefinition__Group__46788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group_4__0_in_rule__ButtonDefinition__Group__4__Impl6815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__5__Impl_in_rule__ButtonDefinition__Group__56846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group_5__0_in_rule__ButtonDefinition__Group__5__Impl6873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group_4__0__Impl_in_rule__ButtonDefinition__Group_4__06916 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group_4__1_in_rule__ButtonDefinition__Group_4__06919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ButtonDefinition__Group_4__0__Impl6947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group_4__1__Impl_in_rule__ButtonDefinition__Group_4__16978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__TextAssignment_4_1_in_rule__ButtonDefinition__Group_4__1__Impl7005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group_5__0__Impl_in_rule__ButtonDefinition__Group_5__07039 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group_5__1_in_rule__ButtonDefinition__Group_5__07042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ButtonDefinition__Group_5__0__Impl7070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group_5__1__Impl_in_rule__ButtonDefinition__Group_5__17101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__InteractionAssignment_5_1_in_rule__ButtonDefinition__Group_5__1__Impl7128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interaction__Group__0__Impl_in_rule__Interaction__Group__07162 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Interaction__Group__1_in_rule__Interaction__Group__07165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interaction__NameAssignment_0_in_rule__Interaction__Group__0__Impl7192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interaction__Group__1__Impl_in_rule__Interaction__Group__17222 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Interaction__Group__2_in_rule__Interaction__Group__17225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Interaction__Group__1__Impl7253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interaction__Group__2__Impl_in_rule__Interaction__Group__27284 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Interaction__Group__3_in_rule__Interaction__Group__27287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractiontype_in_rule__Interaction__Group__2__Impl7314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interaction__Group__3__Impl_in_rule__Interaction__Group__37343 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Interaction__Group__4_in_rule__Interaction__Group__37346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Interaction__Group__3__Impl7374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interaction__Group__4__Impl_in_rule__Interaction__Group__47405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interaction__ActionsAssignment_4_in_rule__Interaction__Group__4__Impl7432 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__0__Impl_in_rule__LabelDefinition__Group__07473 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__1_in_rule__LabelDefinition__Group__07476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__TypeAssignment_0_in_rule__LabelDefinition__Group__0__Impl7503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__1__Impl_in_rule__LabelDefinition__Group__17533 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__2_in_rule__LabelDefinition__Group__17536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__LabelDefinition__Group__1__Impl7564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__2__Impl_in_rule__LabelDefinition__Group__27595 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__3_in_rule__LabelDefinition__Group__27598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__NameAssignment_2_in_rule__LabelDefinition__Group__2__Impl7625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__3__Impl_in_rule__LabelDefinition__Group__37655 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__4_in_rule__LabelDefinition__Group__37658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__LabelDefinition__Group__3__Impl7686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__4__Impl_in_rule__LabelDefinition__Group__47717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group_4__0_in_rule__LabelDefinition__Group__4__Impl7744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group_4__0__Impl_in_rule__LabelDefinition__Group_4__07785 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group_4__1_in_rule__LabelDefinition__Group_4__07788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__LabelDefinition__Group_4__0__Impl7816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group_4__1__Impl_in_rule__LabelDefinition__Group_4__17847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__TextAssignment_4_1_in_rule__LabelDefinition__Group_4__1__Impl7874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIAction__Group__0__Impl_in_rule__UIAction__Group__07908 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__UIAction__Group__1_in_rule__UIAction__Group__07911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__UIAction__Group__0__Impl7939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIAction__Group__1__Impl_in_rule__UIAction__Group__17970 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__UIAction__Group__2_in_rule__UIAction__Group__17973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIAction__TypeAssignment_1_in_rule__UIAction__Group__1__Impl8000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIAction__Group__2__Impl_in_rule__UIAction__Group__28030 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UIAction__Group__3_in_rule__UIAction__Group__28033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__UIAction__Group__2__Impl8061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIAction__Group__3__Impl_in_rule__UIAction__Group__38092 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__UIAction__Group__4_in_rule__UIAction__Group__38095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIAction__UiElementNameAssignment_3_in_rule__UIAction__Group__3__Impl8122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIAction__Group__4__Impl_in_rule__UIAction__Group__48152 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__UIAction__Group__5_in_rule__UIAction__Group__48155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__UIAction__Group__4__Impl8183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIAction__Group__5__Impl_in_rule__UIAction__Group__58214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIAction__PropertiesAssignment_5_in_rule__UIAction__Group__5__Impl8241 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__CommonProperty__Group__0__Impl_in_rule__CommonProperty__Group__08284 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__CommonProperty__Group__1_in_rule__CommonProperty__Group__08287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperty__NameAssignment_0_in_rule__CommonProperty__Group__0__Impl8314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperty__Group__1__Impl_in_rule__CommonProperty__Group__18344 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CommonProperty__Group__2_in_rule__CommonProperty__Group__18347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__CommonProperty__Group__1__Impl8375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperty__Group__2__Impl_in_rule__CommonProperty__Group__28406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperty__ValueAssignment_2_in_rule__CommonProperty__Group__2__Impl8433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__UnorderedGroup__0_in_rule__UIDescription__UnorderedGroup8470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group_0__0_in_rule__UIDescription__UnorderedGroup__Impl8559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__InputTypesAssignment_1_in_rule__UIDescription__UnorderedGroup__Impl8651 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__UIDescription__InputTypesAssignment_1_in_rule__UIDescription__UnorderedGroup__Impl8695 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group_2__0_in_rule__UIDescription__UnorderedGroup__Impl8793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__UnorderedGroup__Impl_in_rule__UIDescription__UnorderedGroup__08852 = new BitSet(new long[]{0x00000000000C8002L});
    public static final BitSet FOLLOW_rule__UIDescription__UnorderedGroup__1_in_rule__UIDescription__UnorderedGroup__08855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__UnorderedGroup__Impl_in_rule__UIDescription__UnorderedGroup__18880 = new BitSet(new long[]{0x00000000000C8002L});
    public static final BitSet FOLLOW_rule__UIDescription__UnorderedGroup__2_in_rule__UIDescription__UnorderedGroup__18883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__UnorderedGroup__Impl_in_rule__UIDescription__UnorderedGroup__28908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAreaCount_in_rule__UIDescription__AreaCountAssignment_0_08942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_rule__UIDescription__TypeDefinitionAssignment_0_18973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsedDescriptions_in_rule__UIDescription__UsedDescriptionsAssignment_0_29004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinputType_in_rule__UIDescription__InputTypesAssignment_19035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_rule__UIDescription__DefinitionsAssignment_2_09066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAreaAssignment_in_rule__UIDescription__AreasAssignment_2_19097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__InputType__TypeAssignment_19128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__InputType__NameAssignment_39159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIDescriptionImport_in_rule__UsedDescriptions__DescriptionAssignment_19190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AreaCount__AreaCountAssignment_19221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDefinition_in_rule__Definition__ConcreteDefitionAssignment_19252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTYPE_in_rule__TypeDefinition__TypeAssignment_19283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__UIDescriptionImport__DescriptionNameAssignment_09314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__UIDescriptionImport__LocalNameAssignment_1_19345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AreaAssignment__AreaAssignment_0_19376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AreaAssignment__ElementAssignment_0_39407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AreaAssignment__ElementAssignment_1_09438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AreaAssignment__AreaAssignment_1_39469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__MultiSelectionDefinition__TypeAssignment_09505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MultiSelectionDefinition__NameAssignment_29544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MultiSelectionDefinition__InputTypeAssignment_3_19575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MultiSelectionDefinition__SelectableValuesLocationAssignment_3_2_19606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MultiSelectionDefinition__SelectedValuesLocationAssignment_3_2_2_19637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__CheckboxDefinition__TypeAssignment_09673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CheckboxDefinition__NameAssignment_29712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CheckboxDefinition__TextAssignment_4_19743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__RadioboxDefinition__TypeAssignment_09779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RadioboxDefinition__NameAssignment_29818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RadioboxDefinition__TextAssignment_4_19849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__TableDefinition__TypeAssignment_09885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TableDefinition__NameAssignment_29924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TableDefinition__TextAssignment_4_19955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__TreeDefinition__TypeAssignment_09991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TreeDefinition__NameAssignment_210030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TreeDefinition__TextAssignment_4_110061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__TextfieldDefinition__TypeAssignment_010097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TextfieldDefinition__NameAssignment_210136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TextfieldDefinition__TextAssignment_4_110167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ButtonDefinition__TypeAssignment_010203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ButtonDefinition__NameAssignment_210242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ButtonDefinition__TextAssignment_4_110273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteraction_in_rule__ButtonDefinition__InteractionAssignment_5_110304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Interaction__NameAssignment_010335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIAction_in_rule__Interaction__ActionsAssignment_410366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__LabelDefinition__TypeAssignment_010402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__LabelDefinition__NameAssignment_210441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__LabelDefinition__TextAssignment_4_110472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__UIAction__TypeAssignment_110508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__UIAction__UiElementNameAssignment_310547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__UIAction__PropertiesAssignment_510578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonPropertyType_in_rule__CommonProperty__NameAssignment_010609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CommonProperty__ValueAssignment_210640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__InputTypesAssignment_1_in_synpred1_InternalGuiDSL8692 = new BitSet(new long[]{0x0000000000000002L});

}
