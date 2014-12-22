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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_TYPE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Text'", "'CLICK'", "'inputType='", "' as '", "'use: '", "'Area count: '", "'DEF '", "'END DEF'", "'type: '", "' As: '", "'Area:'", "'<-'", "'->'", "'selectableValues='", "'selectedValues='", "':'", "'text='", "'interaction='", "' type='", "' with actions:'", "'type='", "'element='", "'='", "'MultiSelection'", "'Checkbox'", "'Radiobox'", "'Table'", "'Tree'", "'Textfield'", "'Button'", "'Label'", "'UiAction'"
    };
    public static final int RULE_ID=7;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
    public static final int RULE_TYPE=6;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;

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


    // $ANTLR start "entryRuleUIDescriptionImport"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:228:1: entryRuleUIDescriptionImport : ruleUIDescriptionImport EOF ;
    public final void entryRuleUIDescriptionImport() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:229:1: ( ruleUIDescriptionImport EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:230:1: ruleUIDescriptionImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionImportRule()); 
            }
            pushFollow(FOLLOW_ruleUIDescriptionImport_in_entryRuleUIDescriptionImport421);
            ruleUIDescriptionImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDescriptionImportRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIDescriptionImport428); if (state.failed) return ;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:237:1: ruleUIDescriptionImport : ( ( rule__UIDescriptionImport__Group__0 ) ) ;
    public final void ruleUIDescriptionImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:241:2: ( ( ( rule__UIDescriptionImport__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:242:1: ( ( rule__UIDescriptionImport__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:242:1: ( ( rule__UIDescriptionImport__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:243:1: ( rule__UIDescriptionImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionImportAccess().getGroup()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:244:1: ( rule__UIDescriptionImport__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:244:2: rule__UIDescriptionImport__Group__0
            {
            pushFollow(FOLLOW_rule__UIDescriptionImport__Group__0_in_ruleUIDescriptionImport454);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:256:1: entryRuleAreaAssignment : ruleAreaAssignment EOF ;
    public final void entryRuleAreaAssignment() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:257:1: ( ruleAreaAssignment EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:258:1: ruleAreaAssignment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAreaAssignment_in_entryRuleAreaAssignment481);
            ruleAreaAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAreaAssignment488); if (state.failed) return ;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:265:1: ruleAreaAssignment : ( ( rule__AreaAssignment__Alternatives ) ) ;
    public final void ruleAreaAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:269:2: ( ( ( rule__AreaAssignment__Alternatives ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:270:1: ( ( rule__AreaAssignment__Alternatives ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:270:1: ( ( rule__AreaAssignment__Alternatives ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:271:1: ( rule__AreaAssignment__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAssignmentAccess().getAlternatives()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:272:1: ( rule__AreaAssignment__Alternatives )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:272:2: rule__AreaAssignment__Alternatives
            {
            pushFollow(FOLLOW_rule__AreaAssignment__Alternatives_in_ruleAreaAssignment514);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:284:1: entryRuleComponentDefinition : ruleComponentDefinition EOF ;
    public final void entryRuleComponentDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:285:1: ( ruleComponentDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:286:1: ruleComponentDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleComponentDefinition_in_entryRuleComponentDefinition541);
            ruleComponentDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentDefinition548); if (state.failed) return ;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:293:1: ruleComponentDefinition : ( ( rule__ComponentDefinition__Alternatives ) ) ;
    public final void ruleComponentDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:297:2: ( ( ( rule__ComponentDefinition__Alternatives ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:298:1: ( ( rule__ComponentDefinition__Alternatives ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:298:1: ( ( rule__ComponentDefinition__Alternatives ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:299:1: ( rule__ComponentDefinition__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentDefinitionAccess().getAlternatives()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:300:1: ( rule__ComponentDefinition__Alternatives )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:300:2: rule__ComponentDefinition__Alternatives
            {
            pushFollow(FOLLOW_rule__ComponentDefinition__Alternatives_in_ruleComponentDefinition574);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:312:1: entryRuleMultiSelectionDefinition : ruleMultiSelectionDefinition EOF ;
    public final void entryRuleMultiSelectionDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:313:1: ( ruleMultiSelectionDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:314:1: ruleMultiSelectionDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiSelectionDefinition_in_entryRuleMultiSelectionDefinition601);
            ruleMultiSelectionDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiSelectionDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiSelectionDefinition608); if (state.failed) return ;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:321:1: ruleMultiSelectionDefinition : ( ( rule__MultiSelectionDefinition__Group__0 ) ) ;
    public final void ruleMultiSelectionDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:325:2: ( ( ( rule__MultiSelectionDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:326:1: ( ( rule__MultiSelectionDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:326:1: ( ( rule__MultiSelectionDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:327:1: ( rule__MultiSelectionDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getGroup()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:328:1: ( rule__MultiSelectionDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:328:2: rule__MultiSelectionDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group__0_in_ruleMultiSelectionDefinition634);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:340:1: entryRuleCheckboxDefinition : ruleCheckboxDefinition EOF ;
    public final void entryRuleCheckboxDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:341:1: ( ruleCheckboxDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:342:1: ruleCheckboxDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckboxDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleCheckboxDefinition_in_entryRuleCheckboxDefinition661);
            ruleCheckboxDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCheckboxDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckboxDefinition668); if (state.failed) return ;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:349:1: ruleCheckboxDefinition : ( ( rule__CheckboxDefinition__Group__0 ) ) ;
    public final void ruleCheckboxDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:353:2: ( ( ( rule__CheckboxDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:354:1: ( ( rule__CheckboxDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:354:1: ( ( rule__CheckboxDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:355:1: ( rule__CheckboxDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckboxDefinitionAccess().getGroup()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:356:1: ( rule__CheckboxDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:356:2: rule__CheckboxDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__CheckboxDefinition__Group__0_in_ruleCheckboxDefinition694);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:368:1: entryRuleRadioboxDefinition : ruleRadioboxDefinition EOF ;
    public final void entryRuleRadioboxDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:369:1: ( ruleRadioboxDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:370:1: ruleRadioboxDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRadioboxDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleRadioboxDefinition_in_entryRuleRadioboxDefinition721);
            ruleRadioboxDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRadioboxDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRadioboxDefinition728); if (state.failed) return ;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:377:1: ruleRadioboxDefinition : ( ( rule__RadioboxDefinition__Group__0 ) ) ;
    public final void ruleRadioboxDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:381:2: ( ( ( rule__RadioboxDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:382:1: ( ( rule__RadioboxDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:382:1: ( ( rule__RadioboxDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:383:1: ( rule__RadioboxDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRadioboxDefinitionAccess().getGroup()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:384:1: ( rule__RadioboxDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:384:2: rule__RadioboxDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__RadioboxDefinition__Group__0_in_ruleRadioboxDefinition754);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:396:1: entryRuleTableDefinition : ruleTableDefinition EOF ;
    public final void entryRuleTableDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:397:1: ( ruleTableDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:398:1: ruleTableDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleTableDefinition_in_entryRuleTableDefinition781);
            ruleTableDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableDefinition788); if (state.failed) return ;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:405:1: ruleTableDefinition : ( ( rule__TableDefinition__Group__0 ) ) ;
    public final void ruleTableDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:409:2: ( ( ( rule__TableDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:410:1: ( ( rule__TableDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:410:1: ( ( rule__TableDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:411:1: ( rule__TableDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableDefinitionAccess().getGroup()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:412:1: ( rule__TableDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:412:2: rule__TableDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group__0_in_ruleTableDefinition814);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:424:1: entryRuleTreeDefinition : ruleTreeDefinition EOF ;
    public final void entryRuleTreeDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:425:1: ( ruleTreeDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:426:1: ruleTreeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTreeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleTreeDefinition_in_entryRuleTreeDefinition841);
            ruleTreeDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTreeDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTreeDefinition848); if (state.failed) return ;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:433:1: ruleTreeDefinition : ( ( rule__TreeDefinition__Group__0 ) ) ;
    public final void ruleTreeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:437:2: ( ( ( rule__TreeDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:438:1: ( ( rule__TreeDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:438:1: ( ( rule__TreeDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:439:1: ( rule__TreeDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTreeDefinitionAccess().getGroup()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:440:1: ( rule__TreeDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:440:2: rule__TreeDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group__0_in_ruleTreeDefinition874);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:452:1: entryRuleTextfieldDefinition : ruleTextfieldDefinition EOF ;
    public final void entryRuleTextfieldDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:453:1: ( ruleTextfieldDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:454:1: ruleTextfieldDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextfieldDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleTextfieldDefinition_in_entryRuleTextfieldDefinition901);
            ruleTextfieldDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextfieldDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextfieldDefinition908); if (state.failed) return ;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:461:1: ruleTextfieldDefinition : ( ( rule__TextfieldDefinition__Group__0 ) ) ;
    public final void ruleTextfieldDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:465:2: ( ( ( rule__TextfieldDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:466:1: ( ( rule__TextfieldDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:466:1: ( ( rule__TextfieldDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:467:1: ( rule__TextfieldDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextfieldDefinitionAccess().getGroup()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:468:1: ( rule__TextfieldDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:468:2: rule__TextfieldDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__0_in_ruleTextfieldDefinition934);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:480:1: entryRuleButtonDefinition : ruleButtonDefinition EOF ;
    public final void entryRuleButtonDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:481:1: ( ruleButtonDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:482:1: ruleButtonDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleButtonDefinition_in_entryRuleButtonDefinition961);
            ruleButtonDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonDefinition968); if (state.failed) return ;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:489:1: ruleButtonDefinition : ( ( rule__ButtonDefinition__Group__0 ) ) ;
    public final void ruleButtonDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:493:2: ( ( ( rule__ButtonDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:494:1: ( ( rule__ButtonDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:494:1: ( ( rule__ButtonDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:495:1: ( rule__ButtonDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonDefinitionAccess().getGroup()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:496:1: ( rule__ButtonDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:496:2: rule__ButtonDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__0_in_ruleButtonDefinition994);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:508:1: entryRuleInteraction : ruleInteraction EOF ;
    public final void entryRuleInteraction() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:509:1: ( ruleInteraction EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:510:1: ruleInteraction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInteractionRule()); 
            }
            pushFollow(FOLLOW_ruleInteraction_in_entryRuleInteraction1021);
            ruleInteraction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInteractionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteraction1028); if (state.failed) return ;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:517:1: ruleInteraction : ( ( rule__Interaction__Group__0 ) ) ;
    public final void ruleInteraction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:521:2: ( ( ( rule__Interaction__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:522:1: ( ( rule__Interaction__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:522:1: ( ( rule__Interaction__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:523:1: ( rule__Interaction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInteractionAccess().getGroup()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:524:1: ( rule__Interaction__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:524:2: rule__Interaction__Group__0
            {
            pushFollow(FOLLOW_rule__Interaction__Group__0_in_ruleInteraction1054);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:536:1: entryRuleLabelDefinition : ruleLabelDefinition EOF ;
    public final void entryRuleLabelDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:537:1: ( ruleLabelDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:538:1: ruleLabelDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleLabelDefinition_in_entryRuleLabelDefinition1081);
            ruleLabelDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabelDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelDefinition1088); if (state.failed) return ;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:545:1: ruleLabelDefinition : ( ( rule__LabelDefinition__Group__0 ) ) ;
    public final void ruleLabelDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:549:2: ( ( ( rule__LabelDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:550:1: ( ( rule__LabelDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:550:1: ( ( rule__LabelDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:551:1: ( rule__LabelDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelDefinitionAccess().getGroup()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:552:1: ( rule__LabelDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:552:2: rule__LabelDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__0_in_ruleLabelDefinition1114);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:564:1: entryRuleUIAction : ruleUIAction EOF ;
    public final void entryRuleUIAction() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:565:1: ( ruleUIAction EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:566:1: ruleUIAction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIActionRule()); 
            }
            pushFollow(FOLLOW_ruleUIAction_in_entryRuleUIAction1141);
            ruleUIAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIActionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIAction1148); if (state.failed) return ;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:573:1: ruleUIAction : ( ( rule__UIAction__Group__0 ) ) ;
    public final void ruleUIAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:577:2: ( ( ( rule__UIAction__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:578:1: ( ( rule__UIAction__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:578:1: ( ( rule__UIAction__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:579:1: ( rule__UIAction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIActionAccess().getGroup()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:580:1: ( rule__UIAction__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:580:2: rule__UIAction__Group__0
            {
            pushFollow(FOLLOW_rule__UIAction__Group__0_in_ruleUIAction1174);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:592:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:593:1: ( ruleProperty EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:594:1: ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1201);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1208); if (state.failed) return ;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:601:1: ruleProperty : ( ruleCommonProperty ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:605:2: ( ( ruleCommonProperty ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:606:1: ( ruleCommonProperty )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:606:1: ( ruleCommonProperty )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:607:1: ruleCommonProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getCommonPropertyParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleCommonProperty_in_ruleProperty1234);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:620:1: entryRuleCommonProperty : ruleCommonProperty EOF ;
    public final void entryRuleCommonProperty() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:621:1: ( ruleCommonProperty EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:622:1: ruleCommonProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommonPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleCommonProperty_in_entryRuleCommonProperty1260);
            ruleCommonProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommonPropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonProperty1267); if (state.failed) return ;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:629:1: ruleCommonProperty : ( ( rule__CommonProperty__Group__0 ) ) ;
    public final void ruleCommonProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:633:2: ( ( ( rule__CommonProperty__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:634:1: ( ( rule__CommonProperty__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:634:1: ( ( rule__CommonProperty__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:635:1: ( rule__CommonProperty__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommonPropertyAccess().getGroup()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:636:1: ( rule__CommonProperty__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:636:2: rule__CommonProperty__Group__0
            {
            pushFollow(FOLLOW_rule__CommonProperty__Group__0_in_ruleCommonProperty1293);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:648:1: entryRuleCommonPropertyType : ruleCommonPropertyType EOF ;
    public final void entryRuleCommonPropertyType() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:649:1: ( ruleCommonPropertyType EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:650:1: ruleCommonPropertyType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommonPropertyTypeRule()); 
            }
            pushFollow(FOLLOW_ruleCommonPropertyType_in_entryRuleCommonPropertyType1320);
            ruleCommonPropertyType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommonPropertyTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonPropertyType1327); if (state.failed) return ;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:657:1: ruleCommonPropertyType : ( 'Text' ) ;
    public final void ruleCommonPropertyType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:661:2: ( ( 'Text' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:662:1: ( 'Text' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:662:1: ( 'Text' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:663:1: 'Text'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommonPropertyTypeAccess().getTextKeyword()); 
            }
            match(input,12,FOLLOW_12_in_ruleCommonPropertyType1354); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:678:1: entryRuleInteractiontype : ruleInteractiontype EOF ;
    public final void entryRuleInteractiontype() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:679:1: ( ruleInteractiontype EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:680:1: ruleInteractiontype EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInteractiontypeRule()); 
            }
            pushFollow(FOLLOW_ruleInteractiontype_in_entryRuleInteractiontype1382);
            ruleInteractiontype();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInteractiontypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractiontype1389); if (state.failed) return ;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:687:1: ruleInteractiontype : ( 'CLICK' ) ;
    public final void ruleInteractiontype() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:691:2: ( ( 'CLICK' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:692:1: ( 'CLICK' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:692:1: ( 'CLICK' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:693:1: 'CLICK'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInteractiontypeAccess().getCLICKKeyword()); 
            }
            match(input,13,FOLLOW_13_in_ruleInteractiontype1416); if (state.failed) return ;
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


    // $ANTLR start "rule__AreaAssignment__Alternatives"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:708:1: rule__AreaAssignment__Alternatives : ( ( ( rule__AreaAssignment__Group_0__0 ) ) | ( ( rule__AreaAssignment__Group_1__0 ) ) );
    public final void rule__AreaAssignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:712:1: ( ( ( rule__AreaAssignment__Group_0__0 ) ) | ( ( rule__AreaAssignment__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==22) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_STRING) ) {
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
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:713:1: ( ( rule__AreaAssignment__Group_0__0 ) )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:713:1: ( ( rule__AreaAssignment__Group_0__0 ) )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:714:1: ( rule__AreaAssignment__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAreaAssignmentAccess().getGroup_0()); 
                    }
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:715:1: ( rule__AreaAssignment__Group_0__0 )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:715:2: rule__AreaAssignment__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__AreaAssignment__Group_0__0_in_rule__AreaAssignment__Alternatives1453);
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
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:719:6: ( ( rule__AreaAssignment__Group_1__0 ) )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:719:6: ( ( rule__AreaAssignment__Group_1__0 ) )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:720:1: ( rule__AreaAssignment__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAreaAssignmentAccess().getGroup_1()); 
                    }
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:721:1: ( rule__AreaAssignment__Group_1__0 )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:721:2: rule__AreaAssignment__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AreaAssignment__Group_1__0_in_rule__AreaAssignment__Alternatives1471);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:730:1: rule__ComponentDefinition__Alternatives : ( ( ruleLabelDefinition ) | ( ruleButtonDefinition ) | ( ruleTextfieldDefinition ) | ( ruleTreeDefinition ) | ( ruleTableDefinition ) | ( ruleRadioboxDefinition ) | ( ruleCheckboxDefinition ) | ( ruleMultiSelectionDefinition ) );
    public final void rule__ComponentDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:734:1: ( ( ruleLabelDefinition ) | ( ruleButtonDefinition ) | ( ruleTextfieldDefinition ) | ( ruleTreeDefinition ) | ( ruleTableDefinition ) | ( ruleRadioboxDefinition ) | ( ruleCheckboxDefinition ) | ( ruleMultiSelectionDefinition ) )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt2=1;
                }
                break;
            case 41:
                {
                alt2=2;
                }
                break;
            case 40:
                {
                alt2=3;
                }
                break;
            case 39:
                {
                alt2=4;
                }
                break;
            case 38:
                {
                alt2=5;
                }
                break;
            case 37:
                {
                alt2=6;
                }
                break;
            case 36:
                {
                alt2=7;
                }
                break;
            case 35:
                {
                alt2=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:735:1: ( ruleLabelDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:735:1: ( ruleLabelDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:736:1: ruleLabelDefinition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentDefinitionAccess().getLabelDefinitionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleLabelDefinition_in_rule__ComponentDefinition__Alternatives1504);
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
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:741:6: ( ruleButtonDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:741:6: ( ruleButtonDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:742:1: ruleButtonDefinition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentDefinitionAccess().getButtonDefinitionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleButtonDefinition_in_rule__ComponentDefinition__Alternatives1521);
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
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:747:6: ( ruleTextfieldDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:747:6: ( ruleTextfieldDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:748:1: ruleTextfieldDefinition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentDefinitionAccess().getTextfieldDefinitionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleTextfieldDefinition_in_rule__ComponentDefinition__Alternatives1538);
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
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:753:6: ( ruleTreeDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:753:6: ( ruleTreeDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:754:1: ruleTreeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentDefinitionAccess().getTreeDefinitionParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleTreeDefinition_in_rule__ComponentDefinition__Alternatives1555);
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
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:759:6: ( ruleTableDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:759:6: ( ruleTableDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:760:1: ruleTableDefinition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentDefinitionAccess().getTableDefinitionParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleTableDefinition_in_rule__ComponentDefinition__Alternatives1572);
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
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:765:6: ( ruleRadioboxDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:765:6: ( ruleRadioboxDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:766:1: ruleRadioboxDefinition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentDefinitionAccess().getRadioboxDefinitionParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleRadioboxDefinition_in_rule__ComponentDefinition__Alternatives1589);
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
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:771:6: ( ruleCheckboxDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:771:6: ( ruleCheckboxDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:772:1: ruleCheckboxDefinition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentDefinitionAccess().getCheckboxDefinitionParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_ruleCheckboxDefinition_in_rule__ComponentDefinition__Alternatives1606);
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
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:777:6: ( ruleMultiSelectionDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:777:6: ( ruleMultiSelectionDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:778:1: ruleMultiSelectionDefinition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentDefinitionAccess().getMultiSelectionDefinitionParserRuleCall_7()); 
                    }
                    pushFollow(FOLLOW_ruleMultiSelectionDefinition_in_rule__ComponentDefinition__Alternatives1623);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:790:1: rule__UIDescription__Group_0__0 : rule__UIDescription__Group_0__0__Impl rule__UIDescription__Group_0__1 ;
    public final void rule__UIDescription__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:794:1: ( rule__UIDescription__Group_0__0__Impl rule__UIDescription__Group_0__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:795:2: rule__UIDescription__Group_0__0__Impl rule__UIDescription__Group_0__1
            {
            pushFollow(FOLLOW_rule__UIDescription__Group_0__0__Impl_in_rule__UIDescription__Group_0__01653);
            rule__UIDescription__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIDescription__Group_0__1_in_rule__UIDescription__Group_0__01656);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:802:1: rule__UIDescription__Group_0__0__Impl : ( ( rule__UIDescription__AreaCountAssignment_0_0 ) ) ;
    public final void rule__UIDescription__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:806:1: ( ( ( rule__UIDescription__AreaCountAssignment_0_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:807:1: ( ( rule__UIDescription__AreaCountAssignment_0_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:807:1: ( ( rule__UIDescription__AreaCountAssignment_0_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:808:1: ( rule__UIDescription__AreaCountAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getAreaCountAssignment_0_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:809:1: ( rule__UIDescription__AreaCountAssignment_0_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:809:2: rule__UIDescription__AreaCountAssignment_0_0
            {
            pushFollow(FOLLOW_rule__UIDescription__AreaCountAssignment_0_0_in_rule__UIDescription__Group_0__0__Impl1683);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:819:1: rule__UIDescription__Group_0__1 : rule__UIDescription__Group_0__1__Impl rule__UIDescription__Group_0__2 ;
    public final void rule__UIDescription__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:823:1: ( rule__UIDescription__Group_0__1__Impl rule__UIDescription__Group_0__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:824:2: rule__UIDescription__Group_0__1__Impl rule__UIDescription__Group_0__2
            {
            pushFollow(FOLLOW_rule__UIDescription__Group_0__1__Impl_in_rule__UIDescription__Group_0__11713);
            rule__UIDescription__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIDescription__Group_0__2_in_rule__UIDescription__Group_0__11716);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:831:1: rule__UIDescription__Group_0__1__Impl : ( ( rule__UIDescription__TypeDefinitionAssignment_0_1 ) ) ;
    public final void rule__UIDescription__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:835:1: ( ( ( rule__UIDescription__TypeDefinitionAssignment_0_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:836:1: ( ( rule__UIDescription__TypeDefinitionAssignment_0_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:836:1: ( ( rule__UIDescription__TypeDefinitionAssignment_0_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:837:1: ( rule__UIDescription__TypeDefinitionAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getTypeDefinitionAssignment_0_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:838:1: ( rule__UIDescription__TypeDefinitionAssignment_0_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:838:2: rule__UIDescription__TypeDefinitionAssignment_0_1
            {
            pushFollow(FOLLOW_rule__UIDescription__TypeDefinitionAssignment_0_1_in_rule__UIDescription__Group_0__1__Impl1743);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:848:1: rule__UIDescription__Group_0__2 : rule__UIDescription__Group_0__2__Impl ;
    public final void rule__UIDescription__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:852:1: ( rule__UIDescription__Group_0__2__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:853:2: rule__UIDescription__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__UIDescription__Group_0__2__Impl_in_rule__UIDescription__Group_0__21773);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:859:1: rule__UIDescription__Group_0__2__Impl : ( ( rule__UIDescription__UsedDescriptionsAssignment_0_2 )* ) ;
    public final void rule__UIDescription__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:863:1: ( ( ( rule__UIDescription__UsedDescriptionsAssignment_0_2 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:864:1: ( ( rule__UIDescription__UsedDescriptionsAssignment_0_2 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:864:1: ( ( rule__UIDescription__UsedDescriptionsAssignment_0_2 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:865:1: ( rule__UIDescription__UsedDescriptionsAssignment_0_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getUsedDescriptionsAssignment_0_2()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:866:1: ( rule__UIDescription__UsedDescriptionsAssignment_0_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:866:2: rule__UIDescription__UsedDescriptionsAssignment_0_2
            	    {
            	    pushFollow(FOLLOW_rule__UIDescription__UsedDescriptionsAssignment_0_2_in_rule__UIDescription__Group_0__2__Impl1800);
            	    rule__UIDescription__UsedDescriptionsAssignment_0_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:882:1: rule__UIDescription__Group_2__0 : rule__UIDescription__Group_2__0__Impl rule__UIDescription__Group_2__1 ;
    public final void rule__UIDescription__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:886:1: ( rule__UIDescription__Group_2__0__Impl rule__UIDescription__Group_2__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:887:2: rule__UIDescription__Group_2__0__Impl rule__UIDescription__Group_2__1
            {
            pushFollow(FOLLOW_rule__UIDescription__Group_2__0__Impl_in_rule__UIDescription__Group_2__01837);
            rule__UIDescription__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIDescription__Group_2__1_in_rule__UIDescription__Group_2__01840);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:894:1: rule__UIDescription__Group_2__0__Impl : ( ( rule__UIDescription__DefinitionsAssignment_2_0 )* ) ;
    public final void rule__UIDescription__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:898:1: ( ( ( rule__UIDescription__DefinitionsAssignment_2_0 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:899:1: ( ( rule__UIDescription__DefinitionsAssignment_2_0 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:899:1: ( ( rule__UIDescription__DefinitionsAssignment_2_0 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:900:1: ( rule__UIDescription__DefinitionsAssignment_2_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getDefinitionsAssignment_2_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:901:1: ( rule__UIDescription__DefinitionsAssignment_2_0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:901:2: rule__UIDescription__DefinitionsAssignment_2_0
            	    {
            	    pushFollow(FOLLOW_rule__UIDescription__DefinitionsAssignment_2_0_in_rule__UIDescription__Group_2__0__Impl1867);
            	    rule__UIDescription__DefinitionsAssignment_2_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:911:1: rule__UIDescription__Group_2__1 : rule__UIDescription__Group_2__1__Impl ;
    public final void rule__UIDescription__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:915:1: ( rule__UIDescription__Group_2__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:916:2: rule__UIDescription__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__UIDescription__Group_2__1__Impl_in_rule__UIDescription__Group_2__11898);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:922:1: rule__UIDescription__Group_2__1__Impl : ( ( rule__UIDescription__AreasAssignment_2_1 )* ) ;
    public final void rule__UIDescription__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:926:1: ( ( ( rule__UIDescription__AreasAssignment_2_1 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:927:1: ( ( rule__UIDescription__AreasAssignment_2_1 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:927:1: ( ( rule__UIDescription__AreasAssignment_2_1 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:928:1: ( rule__UIDescription__AreasAssignment_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getAreasAssignment_2_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:929:1: ( rule__UIDescription__AreasAssignment_2_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }
                else if ( (LA5_0==RULE_STRING) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:929:2: rule__UIDescription__AreasAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__UIDescription__AreasAssignment_2_1_in_rule__UIDescription__Group_2__1__Impl1925);
            	    rule__UIDescription__AreasAssignment_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:943:1: rule__InputType__Group__0 : rule__InputType__Group__0__Impl rule__InputType__Group__1 ;
    public final void rule__InputType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:947:1: ( rule__InputType__Group__0__Impl rule__InputType__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:948:2: rule__InputType__Group__0__Impl rule__InputType__Group__1
            {
            pushFollow(FOLLOW_rule__InputType__Group__0__Impl_in_rule__InputType__Group__01960);
            rule__InputType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__InputType__Group__1_in_rule__InputType__Group__01963);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:955:1: rule__InputType__Group__0__Impl : ( 'inputType=' ) ;
    public final void rule__InputType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:959:1: ( ( 'inputType=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:960:1: ( 'inputType=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:960:1: ( 'inputType=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:961:1: 'inputType='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputTypeAccess().getInputTypeKeyword_0()); 
            }
            match(input,14,FOLLOW_14_in_rule__InputType__Group__0__Impl1991); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:974:1: rule__InputType__Group__1 : rule__InputType__Group__1__Impl rule__InputType__Group__2 ;
    public final void rule__InputType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:978:1: ( rule__InputType__Group__1__Impl rule__InputType__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:979:2: rule__InputType__Group__1__Impl rule__InputType__Group__2
            {
            pushFollow(FOLLOW_rule__InputType__Group__1__Impl_in_rule__InputType__Group__12022);
            rule__InputType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__InputType__Group__2_in_rule__InputType__Group__12025);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:986:1: rule__InputType__Group__1__Impl : ( ( rule__InputType__TypeAssignment_1 ) ) ;
    public final void rule__InputType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:990:1: ( ( ( rule__InputType__TypeAssignment_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:991:1: ( ( rule__InputType__TypeAssignment_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:991:1: ( ( rule__InputType__TypeAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:992:1: ( rule__InputType__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputTypeAccess().getTypeAssignment_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:993:1: ( rule__InputType__TypeAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:993:2: rule__InputType__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__InputType__TypeAssignment_1_in_rule__InputType__Group__1__Impl2052);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1003:1: rule__InputType__Group__2 : rule__InputType__Group__2__Impl rule__InputType__Group__3 ;
    public final void rule__InputType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1007:1: ( rule__InputType__Group__2__Impl rule__InputType__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1008:2: rule__InputType__Group__2__Impl rule__InputType__Group__3
            {
            pushFollow(FOLLOW_rule__InputType__Group__2__Impl_in_rule__InputType__Group__22082);
            rule__InputType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__InputType__Group__3_in_rule__InputType__Group__22085);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1015:1: rule__InputType__Group__2__Impl : ( ' as ' ) ;
    public final void rule__InputType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1019:1: ( ( ' as ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1020:1: ( ' as ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1020:1: ( ' as ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1021:1: ' as '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputTypeAccess().getAsKeyword_2()); 
            }
            match(input,15,FOLLOW_15_in_rule__InputType__Group__2__Impl2113); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1034:1: rule__InputType__Group__3 : rule__InputType__Group__3__Impl ;
    public final void rule__InputType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1038:1: ( rule__InputType__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1039:2: rule__InputType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__InputType__Group__3__Impl_in_rule__InputType__Group__32144);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1045:1: rule__InputType__Group__3__Impl : ( ( rule__InputType__NameAssignment_3 ) ) ;
    public final void rule__InputType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1049:1: ( ( ( rule__InputType__NameAssignment_3 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1050:1: ( ( rule__InputType__NameAssignment_3 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1050:1: ( ( rule__InputType__NameAssignment_3 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1051:1: ( rule__InputType__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputTypeAccess().getNameAssignment_3()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1052:1: ( rule__InputType__NameAssignment_3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1052:2: rule__InputType__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__InputType__NameAssignment_3_in_rule__InputType__Group__3__Impl2171);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1070:1: rule__UsedDescriptions__Group__0 : rule__UsedDescriptions__Group__0__Impl rule__UsedDescriptions__Group__1 ;
    public final void rule__UsedDescriptions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1074:1: ( rule__UsedDescriptions__Group__0__Impl rule__UsedDescriptions__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1075:2: rule__UsedDescriptions__Group__0__Impl rule__UsedDescriptions__Group__1
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__Group__0__Impl_in_rule__UsedDescriptions__Group__02209);
            rule__UsedDescriptions__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UsedDescriptions__Group__1_in_rule__UsedDescriptions__Group__02212);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1082:1: rule__UsedDescriptions__Group__0__Impl : ( 'use: ' ) ;
    public final void rule__UsedDescriptions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1086:1: ( ( 'use: ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1087:1: ( 'use: ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1087:1: ( 'use: ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1088:1: 'use: '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUsedDescriptionsAccess().getUseKeyword_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__UsedDescriptions__Group__0__Impl2240); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1101:1: rule__UsedDescriptions__Group__1 : rule__UsedDescriptions__Group__1__Impl ;
    public final void rule__UsedDescriptions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1105:1: ( rule__UsedDescriptions__Group__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1106:2: rule__UsedDescriptions__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__Group__1__Impl_in_rule__UsedDescriptions__Group__12271);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1112:1: rule__UsedDescriptions__Group__1__Impl : ( ( rule__UsedDescriptions__DescriptionAssignment_1 ) ) ;
    public final void rule__UsedDescriptions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1116:1: ( ( ( rule__UsedDescriptions__DescriptionAssignment_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1117:1: ( ( rule__UsedDescriptions__DescriptionAssignment_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1117:1: ( ( rule__UsedDescriptions__DescriptionAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1118:1: ( rule__UsedDescriptions__DescriptionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUsedDescriptionsAccess().getDescriptionAssignment_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1119:1: ( rule__UsedDescriptions__DescriptionAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1119:2: rule__UsedDescriptions__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_rule__UsedDescriptions__DescriptionAssignment_1_in_rule__UsedDescriptions__Group__1__Impl2298);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1133:1: rule__AreaCount__Group__0 : rule__AreaCount__Group__0__Impl rule__AreaCount__Group__1 ;
    public final void rule__AreaCount__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1137:1: ( rule__AreaCount__Group__0__Impl rule__AreaCount__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1138:2: rule__AreaCount__Group__0__Impl rule__AreaCount__Group__1
            {
            pushFollow(FOLLOW_rule__AreaCount__Group__0__Impl_in_rule__AreaCount__Group__02332);
            rule__AreaCount__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AreaCount__Group__1_in_rule__AreaCount__Group__02335);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1145:1: rule__AreaCount__Group__0__Impl : ( 'Area count: ' ) ;
    public final void rule__AreaCount__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1149:1: ( ( 'Area count: ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1150:1: ( 'Area count: ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1150:1: ( 'Area count: ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1151:1: 'Area count: '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaCountAccess().getAreaCountKeyword_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__AreaCount__Group__0__Impl2363); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1164:1: rule__AreaCount__Group__1 : rule__AreaCount__Group__1__Impl ;
    public final void rule__AreaCount__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1168:1: ( rule__AreaCount__Group__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1169:2: rule__AreaCount__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AreaCount__Group__1__Impl_in_rule__AreaCount__Group__12394);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1175:1: rule__AreaCount__Group__1__Impl : ( ( rule__AreaCount__AreaCountAssignment_1 ) ) ;
    public final void rule__AreaCount__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1179:1: ( ( ( rule__AreaCount__AreaCountAssignment_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1180:1: ( ( rule__AreaCount__AreaCountAssignment_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1180:1: ( ( rule__AreaCount__AreaCountAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1181:1: ( rule__AreaCount__AreaCountAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaCountAccess().getAreaCountAssignment_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1182:1: ( rule__AreaCount__AreaCountAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1182:2: rule__AreaCount__AreaCountAssignment_1
            {
            pushFollow(FOLLOW_rule__AreaCount__AreaCountAssignment_1_in_rule__AreaCount__Group__1__Impl2421);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1196:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1200:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1201:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__02455);
            rule__Definition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__02458);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1208:1: rule__Definition__Group__0__Impl : ( 'DEF ' ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1212:1: ( ( 'DEF ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1213:1: ( 'DEF ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1213:1: ( 'DEF ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1214:1: 'DEF '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getDEFKeyword_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__Definition__Group__0__Impl2486); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1227:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl rule__Definition__Group__2 ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1231:1: ( rule__Definition__Group__1__Impl rule__Definition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1232:2: rule__Definition__Group__1__Impl rule__Definition__Group__2
            {
            pushFollow(FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__12517);
            rule__Definition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__12520);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1239:1: rule__Definition__Group__1__Impl : ( ( rule__Definition__ConcreteDefitionAssignment_1 ) ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1243:1: ( ( ( rule__Definition__ConcreteDefitionAssignment_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1244:1: ( ( rule__Definition__ConcreteDefitionAssignment_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1244:1: ( ( rule__Definition__ConcreteDefitionAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1245:1: ( rule__Definition__ConcreteDefitionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getConcreteDefitionAssignment_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1246:1: ( rule__Definition__ConcreteDefitionAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1246:2: rule__Definition__ConcreteDefitionAssignment_1
            {
            pushFollow(FOLLOW_rule__Definition__ConcreteDefitionAssignment_1_in_rule__Definition__Group__1__Impl2547);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1256:1: rule__Definition__Group__2 : rule__Definition__Group__2__Impl ;
    public final void rule__Definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1260:1: ( rule__Definition__Group__2__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1261:2: rule__Definition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__22577);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1267:1: rule__Definition__Group__2__Impl : ( 'END DEF' ) ;
    public final void rule__Definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1271:1: ( ( 'END DEF' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1272:1: ( 'END DEF' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1272:1: ( 'END DEF' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1273:1: 'END DEF'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getENDDEFKeyword_2()); 
            }
            match(input,19,FOLLOW_19_in_rule__Definition__Group__2__Impl2605); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1292:1: rule__TypeDefinition__Group__0 : rule__TypeDefinition__Group__0__Impl rule__TypeDefinition__Group__1 ;
    public final void rule__TypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1296:1: ( rule__TypeDefinition__Group__0__Impl rule__TypeDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1297:2: rule__TypeDefinition__Group__0__Impl rule__TypeDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Group__0__Impl_in_rule__TypeDefinition__Group__02642);
            rule__TypeDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TypeDefinition__Group__1_in_rule__TypeDefinition__Group__02645);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1304:1: rule__TypeDefinition__Group__0__Impl : ( 'type: ' ) ;
    public final void rule__TypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1308:1: ( ( 'type: ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1309:1: ( 'type: ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1309:1: ( 'type: ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1310:1: 'type: '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDefinitionAccess().getTypeKeyword_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__TypeDefinition__Group__0__Impl2673); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1323:1: rule__TypeDefinition__Group__1 : rule__TypeDefinition__Group__1__Impl ;
    public final void rule__TypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1327:1: ( rule__TypeDefinition__Group__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1328:2: rule__TypeDefinition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Group__1__Impl_in_rule__TypeDefinition__Group__12704);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1334:1: rule__TypeDefinition__Group__1__Impl : ( ( rule__TypeDefinition__TypeAssignment_1 ) ) ;
    public final void rule__TypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1338:1: ( ( ( rule__TypeDefinition__TypeAssignment_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1339:1: ( ( rule__TypeDefinition__TypeAssignment_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1339:1: ( ( rule__TypeDefinition__TypeAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1340:1: ( rule__TypeDefinition__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDefinitionAccess().getTypeAssignment_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1341:1: ( rule__TypeDefinition__TypeAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1341:2: rule__TypeDefinition__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__TypeDefinition__TypeAssignment_1_in_rule__TypeDefinition__Group__1__Impl2731);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1355:1: rule__UIDescriptionImport__Group__0 : rule__UIDescriptionImport__Group__0__Impl rule__UIDescriptionImport__Group__1 ;
    public final void rule__UIDescriptionImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1359:1: ( rule__UIDescriptionImport__Group__0__Impl rule__UIDescriptionImport__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1360:2: rule__UIDescriptionImport__Group__0__Impl rule__UIDescriptionImport__Group__1
            {
            pushFollow(FOLLOW_rule__UIDescriptionImport__Group__0__Impl_in_rule__UIDescriptionImport__Group__02765);
            rule__UIDescriptionImport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIDescriptionImport__Group__1_in_rule__UIDescriptionImport__Group__02768);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1367:1: rule__UIDescriptionImport__Group__0__Impl : ( ( rule__UIDescriptionImport__DescriptionNameAssignment_0 ) ) ;
    public final void rule__UIDescriptionImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1371:1: ( ( ( rule__UIDescriptionImport__DescriptionNameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1372:1: ( ( rule__UIDescriptionImport__DescriptionNameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1372:1: ( ( rule__UIDescriptionImport__DescriptionNameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1373:1: ( rule__UIDescriptionImport__DescriptionNameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionImportAccess().getDescriptionNameAssignment_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1374:1: ( rule__UIDescriptionImport__DescriptionNameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1374:2: rule__UIDescriptionImport__DescriptionNameAssignment_0
            {
            pushFollow(FOLLOW_rule__UIDescriptionImport__DescriptionNameAssignment_0_in_rule__UIDescriptionImport__Group__0__Impl2795);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1384:1: rule__UIDescriptionImport__Group__1 : rule__UIDescriptionImport__Group__1__Impl ;
    public final void rule__UIDescriptionImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1388:1: ( rule__UIDescriptionImport__Group__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1389:2: rule__UIDescriptionImport__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UIDescriptionImport__Group__1__Impl_in_rule__UIDescriptionImport__Group__12825);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1395:1: rule__UIDescriptionImport__Group__1__Impl : ( ( rule__UIDescriptionImport__Group_1__0 )? ) ;
    public final void rule__UIDescriptionImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1399:1: ( ( ( rule__UIDescriptionImport__Group_1__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1400:1: ( ( rule__UIDescriptionImport__Group_1__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1400:1: ( ( rule__UIDescriptionImport__Group_1__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1401:1: ( rule__UIDescriptionImport__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionImportAccess().getGroup_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1402:1: ( rule__UIDescriptionImport__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1402:2: rule__UIDescriptionImport__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__UIDescriptionImport__Group_1__0_in_rule__UIDescriptionImport__Group__1__Impl2852);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1416:1: rule__UIDescriptionImport__Group_1__0 : rule__UIDescriptionImport__Group_1__0__Impl rule__UIDescriptionImport__Group_1__1 ;
    public final void rule__UIDescriptionImport__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1420:1: ( rule__UIDescriptionImport__Group_1__0__Impl rule__UIDescriptionImport__Group_1__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1421:2: rule__UIDescriptionImport__Group_1__0__Impl rule__UIDescriptionImport__Group_1__1
            {
            pushFollow(FOLLOW_rule__UIDescriptionImport__Group_1__0__Impl_in_rule__UIDescriptionImport__Group_1__02887);
            rule__UIDescriptionImport__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIDescriptionImport__Group_1__1_in_rule__UIDescriptionImport__Group_1__02890);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1428:1: rule__UIDescriptionImport__Group_1__0__Impl : ( ' As: ' ) ;
    public final void rule__UIDescriptionImport__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1432:1: ( ( ' As: ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1433:1: ( ' As: ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1433:1: ( ' As: ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1434:1: ' As: '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionImportAccess().getAsKeyword_1_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__UIDescriptionImport__Group_1__0__Impl2918); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1447:1: rule__UIDescriptionImport__Group_1__1 : rule__UIDescriptionImport__Group_1__1__Impl ;
    public final void rule__UIDescriptionImport__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1451:1: ( rule__UIDescriptionImport__Group_1__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1452:2: rule__UIDescriptionImport__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__UIDescriptionImport__Group_1__1__Impl_in_rule__UIDescriptionImport__Group_1__12949);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1458:1: rule__UIDescriptionImport__Group_1__1__Impl : ( ( rule__UIDescriptionImport__LocalNameAssignment_1_1 ) ) ;
    public final void rule__UIDescriptionImport__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1462:1: ( ( ( rule__UIDescriptionImport__LocalNameAssignment_1_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1463:1: ( ( rule__UIDescriptionImport__LocalNameAssignment_1_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1463:1: ( ( rule__UIDescriptionImport__LocalNameAssignment_1_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1464:1: ( rule__UIDescriptionImport__LocalNameAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionImportAccess().getLocalNameAssignment_1_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1465:1: ( rule__UIDescriptionImport__LocalNameAssignment_1_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1465:2: rule__UIDescriptionImport__LocalNameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__UIDescriptionImport__LocalNameAssignment_1_1_in_rule__UIDescriptionImport__Group_1__1__Impl2976);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1479:1: rule__AreaAssignment__Group_0__0 : rule__AreaAssignment__Group_0__0__Impl rule__AreaAssignment__Group_0__1 ;
    public final void rule__AreaAssignment__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1483:1: ( rule__AreaAssignment__Group_0__0__Impl rule__AreaAssignment__Group_0__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1484:2: rule__AreaAssignment__Group_0__0__Impl rule__AreaAssignment__Group_0__1
            {
            pushFollow(FOLLOW_rule__AreaAssignment__Group_0__0__Impl_in_rule__AreaAssignment__Group_0__03010);
            rule__AreaAssignment__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AreaAssignment__Group_0__1_in_rule__AreaAssignment__Group_0__03013);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1491:1: rule__AreaAssignment__Group_0__0__Impl : ( 'Area:' ) ;
    public final void rule__AreaAssignment__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1495:1: ( ( 'Area:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1496:1: ( 'Area:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1496:1: ( 'Area:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1497:1: 'Area:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAssignmentAccess().getAreaKeyword_0_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__AreaAssignment__Group_0__0__Impl3041); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1510:1: rule__AreaAssignment__Group_0__1 : rule__AreaAssignment__Group_0__1__Impl rule__AreaAssignment__Group_0__2 ;
    public final void rule__AreaAssignment__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1514:1: ( rule__AreaAssignment__Group_0__1__Impl rule__AreaAssignment__Group_0__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1515:2: rule__AreaAssignment__Group_0__1__Impl rule__AreaAssignment__Group_0__2
            {
            pushFollow(FOLLOW_rule__AreaAssignment__Group_0__1__Impl_in_rule__AreaAssignment__Group_0__13072);
            rule__AreaAssignment__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AreaAssignment__Group_0__2_in_rule__AreaAssignment__Group_0__13075);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1522:1: rule__AreaAssignment__Group_0__1__Impl : ( ( rule__AreaAssignment__AreaAssignment_0_1 ) ) ;
    public final void rule__AreaAssignment__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1526:1: ( ( ( rule__AreaAssignment__AreaAssignment_0_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1527:1: ( ( rule__AreaAssignment__AreaAssignment_0_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1527:1: ( ( rule__AreaAssignment__AreaAssignment_0_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1528:1: ( rule__AreaAssignment__AreaAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAssignmentAccess().getAreaAssignment_0_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1529:1: ( rule__AreaAssignment__AreaAssignment_0_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1529:2: rule__AreaAssignment__AreaAssignment_0_1
            {
            pushFollow(FOLLOW_rule__AreaAssignment__AreaAssignment_0_1_in_rule__AreaAssignment__Group_0__1__Impl3102);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1539:1: rule__AreaAssignment__Group_0__2 : rule__AreaAssignment__Group_0__2__Impl rule__AreaAssignment__Group_0__3 ;
    public final void rule__AreaAssignment__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1543:1: ( rule__AreaAssignment__Group_0__2__Impl rule__AreaAssignment__Group_0__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1544:2: rule__AreaAssignment__Group_0__2__Impl rule__AreaAssignment__Group_0__3
            {
            pushFollow(FOLLOW_rule__AreaAssignment__Group_0__2__Impl_in_rule__AreaAssignment__Group_0__23132);
            rule__AreaAssignment__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AreaAssignment__Group_0__3_in_rule__AreaAssignment__Group_0__23135);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1551:1: rule__AreaAssignment__Group_0__2__Impl : ( '<-' ) ;
    public final void rule__AreaAssignment__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1555:1: ( ( '<-' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1556:1: ( '<-' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1556:1: ( '<-' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1557:1: '<-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAssignmentAccess().getLessThanSignHyphenMinusKeyword_0_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__AreaAssignment__Group_0__2__Impl3163); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1570:1: rule__AreaAssignment__Group_0__3 : rule__AreaAssignment__Group_0__3__Impl ;
    public final void rule__AreaAssignment__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1574:1: ( rule__AreaAssignment__Group_0__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1575:2: rule__AreaAssignment__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__AreaAssignment__Group_0__3__Impl_in_rule__AreaAssignment__Group_0__33194);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1581:1: rule__AreaAssignment__Group_0__3__Impl : ( ( rule__AreaAssignment__ElementAssignment_0_3 ) ) ;
    public final void rule__AreaAssignment__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1585:1: ( ( ( rule__AreaAssignment__ElementAssignment_0_3 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1586:1: ( ( rule__AreaAssignment__ElementAssignment_0_3 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1586:1: ( ( rule__AreaAssignment__ElementAssignment_0_3 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1587:1: ( rule__AreaAssignment__ElementAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAssignmentAccess().getElementAssignment_0_3()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1588:1: ( rule__AreaAssignment__ElementAssignment_0_3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1588:2: rule__AreaAssignment__ElementAssignment_0_3
            {
            pushFollow(FOLLOW_rule__AreaAssignment__ElementAssignment_0_3_in_rule__AreaAssignment__Group_0__3__Impl3221);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1606:1: rule__AreaAssignment__Group_1__0 : rule__AreaAssignment__Group_1__0__Impl rule__AreaAssignment__Group_1__1 ;
    public final void rule__AreaAssignment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1610:1: ( rule__AreaAssignment__Group_1__0__Impl rule__AreaAssignment__Group_1__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1611:2: rule__AreaAssignment__Group_1__0__Impl rule__AreaAssignment__Group_1__1
            {
            pushFollow(FOLLOW_rule__AreaAssignment__Group_1__0__Impl_in_rule__AreaAssignment__Group_1__03259);
            rule__AreaAssignment__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AreaAssignment__Group_1__1_in_rule__AreaAssignment__Group_1__03262);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1618:1: rule__AreaAssignment__Group_1__0__Impl : ( ( rule__AreaAssignment__ElementAssignment_1_0 ) ) ;
    public final void rule__AreaAssignment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1622:1: ( ( ( rule__AreaAssignment__ElementAssignment_1_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1623:1: ( ( rule__AreaAssignment__ElementAssignment_1_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1623:1: ( ( rule__AreaAssignment__ElementAssignment_1_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1624:1: ( rule__AreaAssignment__ElementAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAssignmentAccess().getElementAssignment_1_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1625:1: ( rule__AreaAssignment__ElementAssignment_1_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1625:2: rule__AreaAssignment__ElementAssignment_1_0
            {
            pushFollow(FOLLOW_rule__AreaAssignment__ElementAssignment_1_0_in_rule__AreaAssignment__Group_1__0__Impl3289);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1635:1: rule__AreaAssignment__Group_1__1 : rule__AreaAssignment__Group_1__1__Impl rule__AreaAssignment__Group_1__2 ;
    public final void rule__AreaAssignment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1639:1: ( rule__AreaAssignment__Group_1__1__Impl rule__AreaAssignment__Group_1__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1640:2: rule__AreaAssignment__Group_1__1__Impl rule__AreaAssignment__Group_1__2
            {
            pushFollow(FOLLOW_rule__AreaAssignment__Group_1__1__Impl_in_rule__AreaAssignment__Group_1__13319);
            rule__AreaAssignment__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AreaAssignment__Group_1__2_in_rule__AreaAssignment__Group_1__13322);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1647:1: rule__AreaAssignment__Group_1__1__Impl : ( '->' ) ;
    public final void rule__AreaAssignment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1651:1: ( ( '->' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1652:1: ( '->' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1652:1: ( '->' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1653:1: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAssignmentAccess().getHyphenMinusGreaterThanSignKeyword_1_1()); 
            }
            match(input,24,FOLLOW_24_in_rule__AreaAssignment__Group_1__1__Impl3350); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1666:1: rule__AreaAssignment__Group_1__2 : rule__AreaAssignment__Group_1__2__Impl rule__AreaAssignment__Group_1__3 ;
    public final void rule__AreaAssignment__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1670:1: ( rule__AreaAssignment__Group_1__2__Impl rule__AreaAssignment__Group_1__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1671:2: rule__AreaAssignment__Group_1__2__Impl rule__AreaAssignment__Group_1__3
            {
            pushFollow(FOLLOW_rule__AreaAssignment__Group_1__2__Impl_in_rule__AreaAssignment__Group_1__23381);
            rule__AreaAssignment__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AreaAssignment__Group_1__3_in_rule__AreaAssignment__Group_1__23384);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1678:1: rule__AreaAssignment__Group_1__2__Impl : ( 'Area:' ) ;
    public final void rule__AreaAssignment__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1682:1: ( ( 'Area:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1683:1: ( 'Area:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1683:1: ( 'Area:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1684:1: 'Area:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAssignmentAccess().getAreaKeyword_1_2()); 
            }
            match(input,22,FOLLOW_22_in_rule__AreaAssignment__Group_1__2__Impl3412); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1697:1: rule__AreaAssignment__Group_1__3 : rule__AreaAssignment__Group_1__3__Impl ;
    public final void rule__AreaAssignment__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1701:1: ( rule__AreaAssignment__Group_1__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1702:2: rule__AreaAssignment__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__AreaAssignment__Group_1__3__Impl_in_rule__AreaAssignment__Group_1__33443);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1708:1: rule__AreaAssignment__Group_1__3__Impl : ( ( rule__AreaAssignment__AreaAssignment_1_3 ) ) ;
    public final void rule__AreaAssignment__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1712:1: ( ( ( rule__AreaAssignment__AreaAssignment_1_3 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1713:1: ( ( rule__AreaAssignment__AreaAssignment_1_3 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1713:1: ( ( rule__AreaAssignment__AreaAssignment_1_3 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1714:1: ( rule__AreaAssignment__AreaAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAssignmentAccess().getAreaAssignment_1_3()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1715:1: ( rule__AreaAssignment__AreaAssignment_1_3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1715:2: rule__AreaAssignment__AreaAssignment_1_3
            {
            pushFollow(FOLLOW_rule__AreaAssignment__AreaAssignment_1_3_in_rule__AreaAssignment__Group_1__3__Impl3470);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1733:1: rule__MultiSelectionDefinition__Group__0 : rule__MultiSelectionDefinition__Group__0__Impl rule__MultiSelectionDefinition__Group__1 ;
    public final void rule__MultiSelectionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1737:1: ( rule__MultiSelectionDefinition__Group__0__Impl rule__MultiSelectionDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1738:2: rule__MultiSelectionDefinition__Group__0__Impl rule__MultiSelectionDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group__0__Impl_in_rule__MultiSelectionDefinition__Group__03508);
            rule__MultiSelectionDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group__1_in_rule__MultiSelectionDefinition__Group__03511);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1745:1: rule__MultiSelectionDefinition__Group__0__Impl : ( ( rule__MultiSelectionDefinition__TypeAssignment_0 ) ) ;
    public final void rule__MultiSelectionDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1749:1: ( ( ( rule__MultiSelectionDefinition__TypeAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1750:1: ( ( rule__MultiSelectionDefinition__TypeAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1750:1: ( ( rule__MultiSelectionDefinition__TypeAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1751:1: ( rule__MultiSelectionDefinition__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getTypeAssignment_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1752:1: ( rule__MultiSelectionDefinition__TypeAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1752:2: rule__MultiSelectionDefinition__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__TypeAssignment_0_in_rule__MultiSelectionDefinition__Group__0__Impl3538);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1762:1: rule__MultiSelectionDefinition__Group__1 : rule__MultiSelectionDefinition__Group__1__Impl rule__MultiSelectionDefinition__Group__2 ;
    public final void rule__MultiSelectionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1766:1: ( rule__MultiSelectionDefinition__Group__1__Impl rule__MultiSelectionDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1767:2: rule__MultiSelectionDefinition__Group__1__Impl rule__MultiSelectionDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group__1__Impl_in_rule__MultiSelectionDefinition__Group__13568);
            rule__MultiSelectionDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group__2_in_rule__MultiSelectionDefinition__Group__13571);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1774:1: rule__MultiSelectionDefinition__Group__1__Impl : ( ' as ' ) ;
    public final void rule__MultiSelectionDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1778:1: ( ( ' as ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1779:1: ( ' as ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1779:1: ( ' as ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1780:1: ' as '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getAsKeyword_1()); 
            }
            match(input,15,FOLLOW_15_in_rule__MultiSelectionDefinition__Group__1__Impl3599); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1793:1: rule__MultiSelectionDefinition__Group__2 : rule__MultiSelectionDefinition__Group__2__Impl rule__MultiSelectionDefinition__Group__3 ;
    public final void rule__MultiSelectionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1797:1: ( rule__MultiSelectionDefinition__Group__2__Impl rule__MultiSelectionDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1798:2: rule__MultiSelectionDefinition__Group__2__Impl rule__MultiSelectionDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group__2__Impl_in_rule__MultiSelectionDefinition__Group__23630);
            rule__MultiSelectionDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group__3_in_rule__MultiSelectionDefinition__Group__23633);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1805:1: rule__MultiSelectionDefinition__Group__2__Impl : ( ( rule__MultiSelectionDefinition__NameAssignment_2 ) ) ;
    public final void rule__MultiSelectionDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1809:1: ( ( ( rule__MultiSelectionDefinition__NameAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1810:1: ( ( rule__MultiSelectionDefinition__NameAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1810:1: ( ( rule__MultiSelectionDefinition__NameAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1811:1: ( rule__MultiSelectionDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getNameAssignment_2()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1812:1: ( rule__MultiSelectionDefinition__NameAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1812:2: rule__MultiSelectionDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__NameAssignment_2_in_rule__MultiSelectionDefinition__Group__2__Impl3660);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1822:1: rule__MultiSelectionDefinition__Group__3 : rule__MultiSelectionDefinition__Group__3__Impl ;
    public final void rule__MultiSelectionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1826:1: ( rule__MultiSelectionDefinition__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1827:2: rule__MultiSelectionDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group__3__Impl_in_rule__MultiSelectionDefinition__Group__33690);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1833:1: rule__MultiSelectionDefinition__Group__3__Impl : ( ( rule__MultiSelectionDefinition__Group_3__0 )? ) ;
    public final void rule__MultiSelectionDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1837:1: ( ( ( rule__MultiSelectionDefinition__Group_3__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1838:1: ( ( rule__MultiSelectionDefinition__Group_3__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1838:1: ( ( rule__MultiSelectionDefinition__Group_3__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1839:1: ( rule__MultiSelectionDefinition__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getGroup_3()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1840:1: ( rule__MultiSelectionDefinition__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1840:2: rule__MultiSelectionDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group_3__0_in_rule__MultiSelectionDefinition__Group__3__Impl3717);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1858:1: rule__MultiSelectionDefinition__Group_3__0 : rule__MultiSelectionDefinition__Group_3__0__Impl rule__MultiSelectionDefinition__Group_3__1 ;
    public final void rule__MultiSelectionDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1862:1: ( rule__MultiSelectionDefinition__Group_3__0__Impl rule__MultiSelectionDefinition__Group_3__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1863:2: rule__MultiSelectionDefinition__Group_3__0__Impl rule__MultiSelectionDefinition__Group_3__1
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group_3__0__Impl_in_rule__MultiSelectionDefinition__Group_3__03756);
            rule__MultiSelectionDefinition__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group_3__1_in_rule__MultiSelectionDefinition__Group_3__03759);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1870:1: rule__MultiSelectionDefinition__Group_3__0__Impl : ( 'inputType=' ) ;
    public final void rule__MultiSelectionDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1874:1: ( ( 'inputType=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1875:1: ( 'inputType=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1875:1: ( 'inputType=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1876:1: 'inputType='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getInputTypeKeyword_3_0()); 
            }
            match(input,14,FOLLOW_14_in_rule__MultiSelectionDefinition__Group_3__0__Impl3787); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1889:1: rule__MultiSelectionDefinition__Group_3__1 : rule__MultiSelectionDefinition__Group_3__1__Impl rule__MultiSelectionDefinition__Group_3__2 ;
    public final void rule__MultiSelectionDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1893:1: ( rule__MultiSelectionDefinition__Group_3__1__Impl rule__MultiSelectionDefinition__Group_3__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1894:2: rule__MultiSelectionDefinition__Group_3__1__Impl rule__MultiSelectionDefinition__Group_3__2
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group_3__1__Impl_in_rule__MultiSelectionDefinition__Group_3__13818);
            rule__MultiSelectionDefinition__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group_3__2_in_rule__MultiSelectionDefinition__Group_3__13821);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1901:1: rule__MultiSelectionDefinition__Group_3__1__Impl : ( ( rule__MultiSelectionDefinition__InputTypeAssignment_3_1 ) ) ;
    public final void rule__MultiSelectionDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1905:1: ( ( ( rule__MultiSelectionDefinition__InputTypeAssignment_3_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1906:1: ( ( rule__MultiSelectionDefinition__InputTypeAssignment_3_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1906:1: ( ( rule__MultiSelectionDefinition__InputTypeAssignment_3_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1907:1: ( rule__MultiSelectionDefinition__InputTypeAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getInputTypeAssignment_3_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1908:1: ( rule__MultiSelectionDefinition__InputTypeAssignment_3_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1908:2: rule__MultiSelectionDefinition__InputTypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__InputTypeAssignment_3_1_in_rule__MultiSelectionDefinition__Group_3__1__Impl3848);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1918:1: rule__MultiSelectionDefinition__Group_3__2 : rule__MultiSelectionDefinition__Group_3__2__Impl ;
    public final void rule__MultiSelectionDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1922:1: ( rule__MultiSelectionDefinition__Group_3__2__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1923:2: rule__MultiSelectionDefinition__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group_3__2__Impl_in_rule__MultiSelectionDefinition__Group_3__23878);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1929:1: rule__MultiSelectionDefinition__Group_3__2__Impl : ( ( rule__MultiSelectionDefinition__Group_3_2__0 )? ) ;
    public final void rule__MultiSelectionDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1933:1: ( ( ( rule__MultiSelectionDefinition__Group_3_2__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1934:1: ( ( rule__MultiSelectionDefinition__Group_3_2__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1934:1: ( ( rule__MultiSelectionDefinition__Group_3_2__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1935:1: ( rule__MultiSelectionDefinition__Group_3_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getGroup_3_2()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1936:1: ( rule__MultiSelectionDefinition__Group_3_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1936:2: rule__MultiSelectionDefinition__Group_3_2__0
                    {
                    pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group_3_2__0_in_rule__MultiSelectionDefinition__Group_3__2__Impl3905);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1952:1: rule__MultiSelectionDefinition__Group_3_2__0 : rule__MultiSelectionDefinition__Group_3_2__0__Impl rule__MultiSelectionDefinition__Group_3_2__1 ;
    public final void rule__MultiSelectionDefinition__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1956:1: ( rule__MultiSelectionDefinition__Group_3_2__0__Impl rule__MultiSelectionDefinition__Group_3_2__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1957:2: rule__MultiSelectionDefinition__Group_3_2__0__Impl rule__MultiSelectionDefinition__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group_3_2__0__Impl_in_rule__MultiSelectionDefinition__Group_3_2__03942);
            rule__MultiSelectionDefinition__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group_3_2__1_in_rule__MultiSelectionDefinition__Group_3_2__03945);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1964:1: rule__MultiSelectionDefinition__Group_3_2__0__Impl : ( 'selectableValues=' ) ;
    public final void rule__MultiSelectionDefinition__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1968:1: ( ( 'selectableValues=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1969:1: ( 'selectableValues=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1969:1: ( 'selectableValues=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1970:1: 'selectableValues='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getSelectableValuesKeyword_3_2_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__MultiSelectionDefinition__Group_3_2__0__Impl3973); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1983:1: rule__MultiSelectionDefinition__Group_3_2__1 : rule__MultiSelectionDefinition__Group_3_2__1__Impl rule__MultiSelectionDefinition__Group_3_2__2 ;
    public final void rule__MultiSelectionDefinition__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1987:1: ( rule__MultiSelectionDefinition__Group_3_2__1__Impl rule__MultiSelectionDefinition__Group_3_2__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1988:2: rule__MultiSelectionDefinition__Group_3_2__1__Impl rule__MultiSelectionDefinition__Group_3_2__2
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group_3_2__1__Impl_in_rule__MultiSelectionDefinition__Group_3_2__14004);
            rule__MultiSelectionDefinition__Group_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group_3_2__2_in_rule__MultiSelectionDefinition__Group_3_2__14007);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1995:1: rule__MultiSelectionDefinition__Group_3_2__1__Impl : ( ( rule__MultiSelectionDefinition__SelectableValuesLocationAssignment_3_2_1 ) ) ;
    public final void rule__MultiSelectionDefinition__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1999:1: ( ( ( rule__MultiSelectionDefinition__SelectableValuesLocationAssignment_3_2_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2000:1: ( ( rule__MultiSelectionDefinition__SelectableValuesLocationAssignment_3_2_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2000:1: ( ( rule__MultiSelectionDefinition__SelectableValuesLocationAssignment_3_2_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2001:1: ( rule__MultiSelectionDefinition__SelectableValuesLocationAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getSelectableValuesLocationAssignment_3_2_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2002:1: ( rule__MultiSelectionDefinition__SelectableValuesLocationAssignment_3_2_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2002:2: rule__MultiSelectionDefinition__SelectableValuesLocationAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__SelectableValuesLocationAssignment_3_2_1_in_rule__MultiSelectionDefinition__Group_3_2__1__Impl4034);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2012:1: rule__MultiSelectionDefinition__Group_3_2__2 : rule__MultiSelectionDefinition__Group_3_2__2__Impl ;
    public final void rule__MultiSelectionDefinition__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2016:1: ( rule__MultiSelectionDefinition__Group_3_2__2__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2017:2: rule__MultiSelectionDefinition__Group_3_2__2__Impl
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group_3_2__2__Impl_in_rule__MultiSelectionDefinition__Group_3_2__24064);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2023:1: rule__MultiSelectionDefinition__Group_3_2__2__Impl : ( ( rule__MultiSelectionDefinition__Group_3_2_2__0 )? ) ;
    public final void rule__MultiSelectionDefinition__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2027:1: ( ( ( rule__MultiSelectionDefinition__Group_3_2_2__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2028:1: ( ( rule__MultiSelectionDefinition__Group_3_2_2__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2028:1: ( ( rule__MultiSelectionDefinition__Group_3_2_2__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2029:1: ( rule__MultiSelectionDefinition__Group_3_2_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getGroup_3_2_2()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2030:1: ( rule__MultiSelectionDefinition__Group_3_2_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2030:2: rule__MultiSelectionDefinition__Group_3_2_2__0
                    {
                    pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group_3_2_2__0_in_rule__MultiSelectionDefinition__Group_3_2__2__Impl4091);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2046:1: rule__MultiSelectionDefinition__Group_3_2_2__0 : rule__MultiSelectionDefinition__Group_3_2_2__0__Impl rule__MultiSelectionDefinition__Group_3_2_2__1 ;
    public final void rule__MultiSelectionDefinition__Group_3_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2050:1: ( rule__MultiSelectionDefinition__Group_3_2_2__0__Impl rule__MultiSelectionDefinition__Group_3_2_2__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2051:2: rule__MultiSelectionDefinition__Group_3_2_2__0__Impl rule__MultiSelectionDefinition__Group_3_2_2__1
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group_3_2_2__0__Impl_in_rule__MultiSelectionDefinition__Group_3_2_2__04128);
            rule__MultiSelectionDefinition__Group_3_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group_3_2_2__1_in_rule__MultiSelectionDefinition__Group_3_2_2__04131);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2058:1: rule__MultiSelectionDefinition__Group_3_2_2__0__Impl : ( 'selectedValues=' ) ;
    public final void rule__MultiSelectionDefinition__Group_3_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2062:1: ( ( 'selectedValues=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2063:1: ( 'selectedValues=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2063:1: ( 'selectedValues=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2064:1: 'selectedValues='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getSelectedValuesKeyword_3_2_2_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__MultiSelectionDefinition__Group_3_2_2__0__Impl4159); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2077:1: rule__MultiSelectionDefinition__Group_3_2_2__1 : rule__MultiSelectionDefinition__Group_3_2_2__1__Impl ;
    public final void rule__MultiSelectionDefinition__Group_3_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2081:1: ( rule__MultiSelectionDefinition__Group_3_2_2__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2082:2: rule__MultiSelectionDefinition__Group_3_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__Group_3_2_2__1__Impl_in_rule__MultiSelectionDefinition__Group_3_2_2__14190);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2088:1: rule__MultiSelectionDefinition__Group_3_2_2__1__Impl : ( ( rule__MultiSelectionDefinition__SelectedValuesLocationAssignment_3_2_2_1 ) ) ;
    public final void rule__MultiSelectionDefinition__Group_3_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2092:1: ( ( ( rule__MultiSelectionDefinition__SelectedValuesLocationAssignment_3_2_2_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2093:1: ( ( rule__MultiSelectionDefinition__SelectedValuesLocationAssignment_3_2_2_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2093:1: ( ( rule__MultiSelectionDefinition__SelectedValuesLocationAssignment_3_2_2_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2094:1: ( rule__MultiSelectionDefinition__SelectedValuesLocationAssignment_3_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getSelectedValuesLocationAssignment_3_2_2_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2095:1: ( rule__MultiSelectionDefinition__SelectedValuesLocationAssignment_3_2_2_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2095:2: rule__MultiSelectionDefinition__SelectedValuesLocationAssignment_3_2_2_1
            {
            pushFollow(FOLLOW_rule__MultiSelectionDefinition__SelectedValuesLocationAssignment_3_2_2_1_in_rule__MultiSelectionDefinition__Group_3_2_2__1__Impl4217);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2109:1: rule__CheckboxDefinition__Group__0 : rule__CheckboxDefinition__Group__0__Impl rule__CheckboxDefinition__Group__1 ;
    public final void rule__CheckboxDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2113:1: ( rule__CheckboxDefinition__Group__0__Impl rule__CheckboxDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2114:2: rule__CheckboxDefinition__Group__0__Impl rule__CheckboxDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__CheckboxDefinition__Group__0__Impl_in_rule__CheckboxDefinition__Group__04251);
            rule__CheckboxDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CheckboxDefinition__Group__1_in_rule__CheckboxDefinition__Group__04254);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2121:1: rule__CheckboxDefinition__Group__0__Impl : ( ( rule__CheckboxDefinition__TypeAssignment_0 ) ) ;
    public final void rule__CheckboxDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2125:1: ( ( ( rule__CheckboxDefinition__TypeAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2126:1: ( ( rule__CheckboxDefinition__TypeAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2126:1: ( ( rule__CheckboxDefinition__TypeAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2127:1: ( rule__CheckboxDefinition__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckboxDefinitionAccess().getTypeAssignment_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2128:1: ( rule__CheckboxDefinition__TypeAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2128:2: rule__CheckboxDefinition__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__CheckboxDefinition__TypeAssignment_0_in_rule__CheckboxDefinition__Group__0__Impl4281);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2138:1: rule__CheckboxDefinition__Group__1 : rule__CheckboxDefinition__Group__1__Impl rule__CheckboxDefinition__Group__2 ;
    public final void rule__CheckboxDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2142:1: ( rule__CheckboxDefinition__Group__1__Impl rule__CheckboxDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2143:2: rule__CheckboxDefinition__Group__1__Impl rule__CheckboxDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__CheckboxDefinition__Group__1__Impl_in_rule__CheckboxDefinition__Group__14311);
            rule__CheckboxDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CheckboxDefinition__Group__2_in_rule__CheckboxDefinition__Group__14314);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2150:1: rule__CheckboxDefinition__Group__1__Impl : ( ' as ' ) ;
    public final void rule__CheckboxDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2154:1: ( ( ' as ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2155:1: ( ' as ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2155:1: ( ' as ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2156:1: ' as '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckboxDefinitionAccess().getAsKeyword_1()); 
            }
            match(input,15,FOLLOW_15_in_rule__CheckboxDefinition__Group__1__Impl4342); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2169:1: rule__CheckboxDefinition__Group__2 : rule__CheckboxDefinition__Group__2__Impl rule__CheckboxDefinition__Group__3 ;
    public final void rule__CheckboxDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2173:1: ( rule__CheckboxDefinition__Group__2__Impl rule__CheckboxDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2174:2: rule__CheckboxDefinition__Group__2__Impl rule__CheckboxDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__CheckboxDefinition__Group__2__Impl_in_rule__CheckboxDefinition__Group__24373);
            rule__CheckboxDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CheckboxDefinition__Group__3_in_rule__CheckboxDefinition__Group__24376);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2181:1: rule__CheckboxDefinition__Group__2__Impl : ( ( rule__CheckboxDefinition__NameAssignment_2 ) ) ;
    public final void rule__CheckboxDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2185:1: ( ( ( rule__CheckboxDefinition__NameAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2186:1: ( ( rule__CheckboxDefinition__NameAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2186:1: ( ( rule__CheckboxDefinition__NameAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2187:1: ( rule__CheckboxDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckboxDefinitionAccess().getNameAssignment_2()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2188:1: ( rule__CheckboxDefinition__NameAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2188:2: rule__CheckboxDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__CheckboxDefinition__NameAssignment_2_in_rule__CheckboxDefinition__Group__2__Impl4403);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2198:1: rule__CheckboxDefinition__Group__3 : rule__CheckboxDefinition__Group__3__Impl rule__CheckboxDefinition__Group__4 ;
    public final void rule__CheckboxDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2202:1: ( rule__CheckboxDefinition__Group__3__Impl rule__CheckboxDefinition__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2203:2: rule__CheckboxDefinition__Group__3__Impl rule__CheckboxDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__CheckboxDefinition__Group__3__Impl_in_rule__CheckboxDefinition__Group__34433);
            rule__CheckboxDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CheckboxDefinition__Group__4_in_rule__CheckboxDefinition__Group__34436);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2210:1: rule__CheckboxDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__CheckboxDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2214:1: ( ( ':' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2215:1: ( ':' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2215:1: ( ':' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2216:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckboxDefinitionAccess().getColonKeyword_3()); 
            }
            match(input,27,FOLLOW_27_in_rule__CheckboxDefinition__Group__3__Impl4464); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2229:1: rule__CheckboxDefinition__Group__4 : rule__CheckboxDefinition__Group__4__Impl ;
    public final void rule__CheckboxDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2233:1: ( rule__CheckboxDefinition__Group__4__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2234:2: rule__CheckboxDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CheckboxDefinition__Group__4__Impl_in_rule__CheckboxDefinition__Group__44495);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2240:1: rule__CheckboxDefinition__Group__4__Impl : ( ( rule__CheckboxDefinition__Group_4__0 )? ) ;
    public final void rule__CheckboxDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2244:1: ( ( ( rule__CheckboxDefinition__Group_4__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2245:1: ( ( rule__CheckboxDefinition__Group_4__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2245:1: ( ( rule__CheckboxDefinition__Group_4__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2246:1: ( rule__CheckboxDefinition__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckboxDefinitionAccess().getGroup_4()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2247:1: ( rule__CheckboxDefinition__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2247:2: rule__CheckboxDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__CheckboxDefinition__Group_4__0_in_rule__CheckboxDefinition__Group__4__Impl4522);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2267:1: rule__CheckboxDefinition__Group_4__0 : rule__CheckboxDefinition__Group_4__0__Impl rule__CheckboxDefinition__Group_4__1 ;
    public final void rule__CheckboxDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2271:1: ( rule__CheckboxDefinition__Group_4__0__Impl rule__CheckboxDefinition__Group_4__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2272:2: rule__CheckboxDefinition__Group_4__0__Impl rule__CheckboxDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__CheckboxDefinition__Group_4__0__Impl_in_rule__CheckboxDefinition__Group_4__04563);
            rule__CheckboxDefinition__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CheckboxDefinition__Group_4__1_in_rule__CheckboxDefinition__Group_4__04566);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2279:1: rule__CheckboxDefinition__Group_4__0__Impl : ( 'text=' ) ;
    public final void rule__CheckboxDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2283:1: ( ( 'text=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2284:1: ( 'text=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2284:1: ( 'text=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2285:1: 'text='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckboxDefinitionAccess().getTextKeyword_4_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__CheckboxDefinition__Group_4__0__Impl4594); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2298:1: rule__CheckboxDefinition__Group_4__1 : rule__CheckboxDefinition__Group_4__1__Impl ;
    public final void rule__CheckboxDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2302:1: ( rule__CheckboxDefinition__Group_4__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2303:2: rule__CheckboxDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__CheckboxDefinition__Group_4__1__Impl_in_rule__CheckboxDefinition__Group_4__14625);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2309:1: rule__CheckboxDefinition__Group_4__1__Impl : ( ( rule__CheckboxDefinition__TextAssignment_4_1 ) ) ;
    public final void rule__CheckboxDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2313:1: ( ( ( rule__CheckboxDefinition__TextAssignment_4_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2314:1: ( ( rule__CheckboxDefinition__TextAssignment_4_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2314:1: ( ( rule__CheckboxDefinition__TextAssignment_4_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2315:1: ( rule__CheckboxDefinition__TextAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckboxDefinitionAccess().getTextAssignment_4_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2316:1: ( rule__CheckboxDefinition__TextAssignment_4_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2316:2: rule__CheckboxDefinition__TextAssignment_4_1
            {
            pushFollow(FOLLOW_rule__CheckboxDefinition__TextAssignment_4_1_in_rule__CheckboxDefinition__Group_4__1__Impl4652);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2330:1: rule__RadioboxDefinition__Group__0 : rule__RadioboxDefinition__Group__0__Impl rule__RadioboxDefinition__Group__1 ;
    public final void rule__RadioboxDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2334:1: ( rule__RadioboxDefinition__Group__0__Impl rule__RadioboxDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2335:2: rule__RadioboxDefinition__Group__0__Impl rule__RadioboxDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__RadioboxDefinition__Group__0__Impl_in_rule__RadioboxDefinition__Group__04686);
            rule__RadioboxDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RadioboxDefinition__Group__1_in_rule__RadioboxDefinition__Group__04689);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2342:1: rule__RadioboxDefinition__Group__0__Impl : ( ( rule__RadioboxDefinition__TypeAssignment_0 ) ) ;
    public final void rule__RadioboxDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2346:1: ( ( ( rule__RadioboxDefinition__TypeAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2347:1: ( ( rule__RadioboxDefinition__TypeAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2347:1: ( ( rule__RadioboxDefinition__TypeAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2348:1: ( rule__RadioboxDefinition__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRadioboxDefinitionAccess().getTypeAssignment_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2349:1: ( rule__RadioboxDefinition__TypeAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2349:2: rule__RadioboxDefinition__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__RadioboxDefinition__TypeAssignment_0_in_rule__RadioboxDefinition__Group__0__Impl4716);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2359:1: rule__RadioboxDefinition__Group__1 : rule__RadioboxDefinition__Group__1__Impl rule__RadioboxDefinition__Group__2 ;
    public final void rule__RadioboxDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2363:1: ( rule__RadioboxDefinition__Group__1__Impl rule__RadioboxDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2364:2: rule__RadioboxDefinition__Group__1__Impl rule__RadioboxDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__RadioboxDefinition__Group__1__Impl_in_rule__RadioboxDefinition__Group__14746);
            rule__RadioboxDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RadioboxDefinition__Group__2_in_rule__RadioboxDefinition__Group__14749);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2371:1: rule__RadioboxDefinition__Group__1__Impl : ( ' as ' ) ;
    public final void rule__RadioboxDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2375:1: ( ( ' as ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2376:1: ( ' as ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2376:1: ( ' as ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2377:1: ' as '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRadioboxDefinitionAccess().getAsKeyword_1()); 
            }
            match(input,15,FOLLOW_15_in_rule__RadioboxDefinition__Group__1__Impl4777); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2390:1: rule__RadioboxDefinition__Group__2 : rule__RadioboxDefinition__Group__2__Impl rule__RadioboxDefinition__Group__3 ;
    public final void rule__RadioboxDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2394:1: ( rule__RadioboxDefinition__Group__2__Impl rule__RadioboxDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2395:2: rule__RadioboxDefinition__Group__2__Impl rule__RadioboxDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__RadioboxDefinition__Group__2__Impl_in_rule__RadioboxDefinition__Group__24808);
            rule__RadioboxDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RadioboxDefinition__Group__3_in_rule__RadioboxDefinition__Group__24811);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2402:1: rule__RadioboxDefinition__Group__2__Impl : ( ( rule__RadioboxDefinition__NameAssignment_2 ) ) ;
    public final void rule__RadioboxDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2406:1: ( ( ( rule__RadioboxDefinition__NameAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2407:1: ( ( rule__RadioboxDefinition__NameAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2407:1: ( ( rule__RadioboxDefinition__NameAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2408:1: ( rule__RadioboxDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRadioboxDefinitionAccess().getNameAssignment_2()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2409:1: ( rule__RadioboxDefinition__NameAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2409:2: rule__RadioboxDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__RadioboxDefinition__NameAssignment_2_in_rule__RadioboxDefinition__Group__2__Impl4838);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2419:1: rule__RadioboxDefinition__Group__3 : rule__RadioboxDefinition__Group__3__Impl rule__RadioboxDefinition__Group__4 ;
    public final void rule__RadioboxDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2423:1: ( rule__RadioboxDefinition__Group__3__Impl rule__RadioboxDefinition__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2424:2: rule__RadioboxDefinition__Group__3__Impl rule__RadioboxDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__RadioboxDefinition__Group__3__Impl_in_rule__RadioboxDefinition__Group__34868);
            rule__RadioboxDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RadioboxDefinition__Group__4_in_rule__RadioboxDefinition__Group__34871);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2431:1: rule__RadioboxDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__RadioboxDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2435:1: ( ( ':' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2436:1: ( ':' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2436:1: ( ':' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2437:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRadioboxDefinitionAccess().getColonKeyword_3()); 
            }
            match(input,27,FOLLOW_27_in_rule__RadioboxDefinition__Group__3__Impl4899); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2450:1: rule__RadioboxDefinition__Group__4 : rule__RadioboxDefinition__Group__4__Impl ;
    public final void rule__RadioboxDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2454:1: ( rule__RadioboxDefinition__Group__4__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2455:2: rule__RadioboxDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__RadioboxDefinition__Group__4__Impl_in_rule__RadioboxDefinition__Group__44930);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2461:1: rule__RadioboxDefinition__Group__4__Impl : ( ( rule__RadioboxDefinition__Group_4__0 )? ) ;
    public final void rule__RadioboxDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2465:1: ( ( ( rule__RadioboxDefinition__Group_4__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2466:1: ( ( rule__RadioboxDefinition__Group_4__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2466:1: ( ( rule__RadioboxDefinition__Group_4__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2467:1: ( rule__RadioboxDefinition__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRadioboxDefinitionAccess().getGroup_4()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2468:1: ( rule__RadioboxDefinition__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2468:2: rule__RadioboxDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__RadioboxDefinition__Group_4__0_in_rule__RadioboxDefinition__Group__4__Impl4957);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2488:1: rule__RadioboxDefinition__Group_4__0 : rule__RadioboxDefinition__Group_4__0__Impl rule__RadioboxDefinition__Group_4__1 ;
    public final void rule__RadioboxDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2492:1: ( rule__RadioboxDefinition__Group_4__0__Impl rule__RadioboxDefinition__Group_4__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2493:2: rule__RadioboxDefinition__Group_4__0__Impl rule__RadioboxDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__RadioboxDefinition__Group_4__0__Impl_in_rule__RadioboxDefinition__Group_4__04998);
            rule__RadioboxDefinition__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RadioboxDefinition__Group_4__1_in_rule__RadioboxDefinition__Group_4__05001);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2500:1: rule__RadioboxDefinition__Group_4__0__Impl : ( 'text=' ) ;
    public final void rule__RadioboxDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2504:1: ( ( 'text=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2505:1: ( 'text=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2505:1: ( 'text=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2506:1: 'text='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRadioboxDefinitionAccess().getTextKeyword_4_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__RadioboxDefinition__Group_4__0__Impl5029); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2519:1: rule__RadioboxDefinition__Group_4__1 : rule__RadioboxDefinition__Group_4__1__Impl ;
    public final void rule__RadioboxDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2523:1: ( rule__RadioboxDefinition__Group_4__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2524:2: rule__RadioboxDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__RadioboxDefinition__Group_4__1__Impl_in_rule__RadioboxDefinition__Group_4__15060);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2530:1: rule__RadioboxDefinition__Group_4__1__Impl : ( ( rule__RadioboxDefinition__TextAssignment_4_1 ) ) ;
    public final void rule__RadioboxDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2534:1: ( ( ( rule__RadioboxDefinition__TextAssignment_4_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2535:1: ( ( rule__RadioboxDefinition__TextAssignment_4_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2535:1: ( ( rule__RadioboxDefinition__TextAssignment_4_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2536:1: ( rule__RadioboxDefinition__TextAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRadioboxDefinitionAccess().getTextAssignment_4_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2537:1: ( rule__RadioboxDefinition__TextAssignment_4_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2537:2: rule__RadioboxDefinition__TextAssignment_4_1
            {
            pushFollow(FOLLOW_rule__RadioboxDefinition__TextAssignment_4_1_in_rule__RadioboxDefinition__Group_4__1__Impl5087);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2551:1: rule__TableDefinition__Group__0 : rule__TableDefinition__Group__0__Impl rule__TableDefinition__Group__1 ;
    public final void rule__TableDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2555:1: ( rule__TableDefinition__Group__0__Impl rule__TableDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2556:2: rule__TableDefinition__Group__0__Impl rule__TableDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group__0__Impl_in_rule__TableDefinition__Group__05121);
            rule__TableDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TableDefinition__Group__1_in_rule__TableDefinition__Group__05124);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2563:1: rule__TableDefinition__Group__0__Impl : ( ( rule__TableDefinition__TypeAssignment_0 ) ) ;
    public final void rule__TableDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2567:1: ( ( ( rule__TableDefinition__TypeAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2568:1: ( ( rule__TableDefinition__TypeAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2568:1: ( ( rule__TableDefinition__TypeAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2569:1: ( rule__TableDefinition__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableDefinitionAccess().getTypeAssignment_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2570:1: ( rule__TableDefinition__TypeAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2570:2: rule__TableDefinition__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__TableDefinition__TypeAssignment_0_in_rule__TableDefinition__Group__0__Impl5151);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2580:1: rule__TableDefinition__Group__1 : rule__TableDefinition__Group__1__Impl rule__TableDefinition__Group__2 ;
    public final void rule__TableDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2584:1: ( rule__TableDefinition__Group__1__Impl rule__TableDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2585:2: rule__TableDefinition__Group__1__Impl rule__TableDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group__1__Impl_in_rule__TableDefinition__Group__15181);
            rule__TableDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TableDefinition__Group__2_in_rule__TableDefinition__Group__15184);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2592:1: rule__TableDefinition__Group__1__Impl : ( ' as ' ) ;
    public final void rule__TableDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2596:1: ( ( ' as ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2597:1: ( ' as ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2597:1: ( ' as ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2598:1: ' as '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableDefinitionAccess().getAsKeyword_1()); 
            }
            match(input,15,FOLLOW_15_in_rule__TableDefinition__Group__1__Impl5212); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2611:1: rule__TableDefinition__Group__2 : rule__TableDefinition__Group__2__Impl rule__TableDefinition__Group__3 ;
    public final void rule__TableDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2615:1: ( rule__TableDefinition__Group__2__Impl rule__TableDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2616:2: rule__TableDefinition__Group__2__Impl rule__TableDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group__2__Impl_in_rule__TableDefinition__Group__25243);
            rule__TableDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TableDefinition__Group__3_in_rule__TableDefinition__Group__25246);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2623:1: rule__TableDefinition__Group__2__Impl : ( ( rule__TableDefinition__NameAssignment_2 ) ) ;
    public final void rule__TableDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2627:1: ( ( ( rule__TableDefinition__NameAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2628:1: ( ( rule__TableDefinition__NameAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2628:1: ( ( rule__TableDefinition__NameAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2629:1: ( rule__TableDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableDefinitionAccess().getNameAssignment_2()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2630:1: ( rule__TableDefinition__NameAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2630:2: rule__TableDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__TableDefinition__NameAssignment_2_in_rule__TableDefinition__Group__2__Impl5273);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2640:1: rule__TableDefinition__Group__3 : rule__TableDefinition__Group__3__Impl rule__TableDefinition__Group__4 ;
    public final void rule__TableDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2644:1: ( rule__TableDefinition__Group__3__Impl rule__TableDefinition__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2645:2: rule__TableDefinition__Group__3__Impl rule__TableDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group__3__Impl_in_rule__TableDefinition__Group__35303);
            rule__TableDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TableDefinition__Group__4_in_rule__TableDefinition__Group__35306);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2652:1: rule__TableDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__TableDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2656:1: ( ( ':' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2657:1: ( ':' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2657:1: ( ':' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2658:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableDefinitionAccess().getColonKeyword_3()); 
            }
            match(input,27,FOLLOW_27_in_rule__TableDefinition__Group__3__Impl5334); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2671:1: rule__TableDefinition__Group__4 : rule__TableDefinition__Group__4__Impl ;
    public final void rule__TableDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2675:1: ( rule__TableDefinition__Group__4__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2676:2: rule__TableDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group__4__Impl_in_rule__TableDefinition__Group__45365);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2682:1: rule__TableDefinition__Group__4__Impl : ( ( rule__TableDefinition__Group_4__0 )? ) ;
    public final void rule__TableDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2686:1: ( ( ( rule__TableDefinition__Group_4__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2687:1: ( ( rule__TableDefinition__Group_4__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2687:1: ( ( rule__TableDefinition__Group_4__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2688:1: ( rule__TableDefinition__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableDefinitionAccess().getGroup_4()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2689:1: ( rule__TableDefinition__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2689:2: rule__TableDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__TableDefinition__Group_4__0_in_rule__TableDefinition__Group__4__Impl5392);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2709:1: rule__TableDefinition__Group_4__0 : rule__TableDefinition__Group_4__0__Impl rule__TableDefinition__Group_4__1 ;
    public final void rule__TableDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2713:1: ( rule__TableDefinition__Group_4__0__Impl rule__TableDefinition__Group_4__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2714:2: rule__TableDefinition__Group_4__0__Impl rule__TableDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group_4__0__Impl_in_rule__TableDefinition__Group_4__05433);
            rule__TableDefinition__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TableDefinition__Group_4__1_in_rule__TableDefinition__Group_4__05436);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2721:1: rule__TableDefinition__Group_4__0__Impl : ( 'text=' ) ;
    public final void rule__TableDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2725:1: ( ( 'text=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2726:1: ( 'text=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2726:1: ( 'text=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2727:1: 'text='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableDefinitionAccess().getTextKeyword_4_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__TableDefinition__Group_4__0__Impl5464); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2740:1: rule__TableDefinition__Group_4__1 : rule__TableDefinition__Group_4__1__Impl ;
    public final void rule__TableDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2744:1: ( rule__TableDefinition__Group_4__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2745:2: rule__TableDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group_4__1__Impl_in_rule__TableDefinition__Group_4__15495);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2751:1: rule__TableDefinition__Group_4__1__Impl : ( ( rule__TableDefinition__TextAssignment_4_1 ) ) ;
    public final void rule__TableDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2755:1: ( ( ( rule__TableDefinition__TextAssignment_4_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2756:1: ( ( rule__TableDefinition__TextAssignment_4_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2756:1: ( ( rule__TableDefinition__TextAssignment_4_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2757:1: ( rule__TableDefinition__TextAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableDefinitionAccess().getTextAssignment_4_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2758:1: ( rule__TableDefinition__TextAssignment_4_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2758:2: rule__TableDefinition__TextAssignment_4_1
            {
            pushFollow(FOLLOW_rule__TableDefinition__TextAssignment_4_1_in_rule__TableDefinition__Group_4__1__Impl5522);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2772:1: rule__TreeDefinition__Group__0 : rule__TreeDefinition__Group__0__Impl rule__TreeDefinition__Group__1 ;
    public final void rule__TreeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2776:1: ( rule__TreeDefinition__Group__0__Impl rule__TreeDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2777:2: rule__TreeDefinition__Group__0__Impl rule__TreeDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group__0__Impl_in_rule__TreeDefinition__Group__05556);
            rule__TreeDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TreeDefinition__Group__1_in_rule__TreeDefinition__Group__05559);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2784:1: rule__TreeDefinition__Group__0__Impl : ( ( rule__TreeDefinition__TypeAssignment_0 ) ) ;
    public final void rule__TreeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2788:1: ( ( ( rule__TreeDefinition__TypeAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2789:1: ( ( rule__TreeDefinition__TypeAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2789:1: ( ( rule__TreeDefinition__TypeAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2790:1: ( rule__TreeDefinition__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTreeDefinitionAccess().getTypeAssignment_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2791:1: ( rule__TreeDefinition__TypeAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2791:2: rule__TreeDefinition__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__TreeDefinition__TypeAssignment_0_in_rule__TreeDefinition__Group__0__Impl5586);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2801:1: rule__TreeDefinition__Group__1 : rule__TreeDefinition__Group__1__Impl rule__TreeDefinition__Group__2 ;
    public final void rule__TreeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2805:1: ( rule__TreeDefinition__Group__1__Impl rule__TreeDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2806:2: rule__TreeDefinition__Group__1__Impl rule__TreeDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group__1__Impl_in_rule__TreeDefinition__Group__15616);
            rule__TreeDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TreeDefinition__Group__2_in_rule__TreeDefinition__Group__15619);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2813:1: rule__TreeDefinition__Group__1__Impl : ( ' as ' ) ;
    public final void rule__TreeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2817:1: ( ( ' as ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2818:1: ( ' as ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2818:1: ( ' as ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2819:1: ' as '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTreeDefinitionAccess().getAsKeyword_1()); 
            }
            match(input,15,FOLLOW_15_in_rule__TreeDefinition__Group__1__Impl5647); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2832:1: rule__TreeDefinition__Group__2 : rule__TreeDefinition__Group__2__Impl rule__TreeDefinition__Group__3 ;
    public final void rule__TreeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2836:1: ( rule__TreeDefinition__Group__2__Impl rule__TreeDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2837:2: rule__TreeDefinition__Group__2__Impl rule__TreeDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group__2__Impl_in_rule__TreeDefinition__Group__25678);
            rule__TreeDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TreeDefinition__Group__3_in_rule__TreeDefinition__Group__25681);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2844:1: rule__TreeDefinition__Group__2__Impl : ( ( rule__TreeDefinition__NameAssignment_2 ) ) ;
    public final void rule__TreeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2848:1: ( ( ( rule__TreeDefinition__NameAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2849:1: ( ( rule__TreeDefinition__NameAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2849:1: ( ( rule__TreeDefinition__NameAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2850:1: ( rule__TreeDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTreeDefinitionAccess().getNameAssignment_2()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2851:1: ( rule__TreeDefinition__NameAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2851:2: rule__TreeDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__TreeDefinition__NameAssignment_2_in_rule__TreeDefinition__Group__2__Impl5708);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2861:1: rule__TreeDefinition__Group__3 : rule__TreeDefinition__Group__3__Impl rule__TreeDefinition__Group__4 ;
    public final void rule__TreeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2865:1: ( rule__TreeDefinition__Group__3__Impl rule__TreeDefinition__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2866:2: rule__TreeDefinition__Group__3__Impl rule__TreeDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group__3__Impl_in_rule__TreeDefinition__Group__35738);
            rule__TreeDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TreeDefinition__Group__4_in_rule__TreeDefinition__Group__35741);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2873:1: rule__TreeDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__TreeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2877:1: ( ( ':' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2878:1: ( ':' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2878:1: ( ':' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2879:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTreeDefinitionAccess().getColonKeyword_3()); 
            }
            match(input,27,FOLLOW_27_in_rule__TreeDefinition__Group__3__Impl5769); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2892:1: rule__TreeDefinition__Group__4 : rule__TreeDefinition__Group__4__Impl ;
    public final void rule__TreeDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2896:1: ( rule__TreeDefinition__Group__4__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2897:2: rule__TreeDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group__4__Impl_in_rule__TreeDefinition__Group__45800);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2903:1: rule__TreeDefinition__Group__4__Impl : ( ( rule__TreeDefinition__Group_4__0 )? ) ;
    public final void rule__TreeDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2907:1: ( ( ( rule__TreeDefinition__Group_4__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2908:1: ( ( rule__TreeDefinition__Group_4__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2908:1: ( ( rule__TreeDefinition__Group_4__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2909:1: ( rule__TreeDefinition__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTreeDefinitionAccess().getGroup_4()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2910:1: ( rule__TreeDefinition__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2910:2: rule__TreeDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__TreeDefinition__Group_4__0_in_rule__TreeDefinition__Group__4__Impl5827);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2930:1: rule__TreeDefinition__Group_4__0 : rule__TreeDefinition__Group_4__0__Impl rule__TreeDefinition__Group_4__1 ;
    public final void rule__TreeDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2934:1: ( rule__TreeDefinition__Group_4__0__Impl rule__TreeDefinition__Group_4__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2935:2: rule__TreeDefinition__Group_4__0__Impl rule__TreeDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group_4__0__Impl_in_rule__TreeDefinition__Group_4__05868);
            rule__TreeDefinition__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TreeDefinition__Group_4__1_in_rule__TreeDefinition__Group_4__05871);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2942:1: rule__TreeDefinition__Group_4__0__Impl : ( 'text=' ) ;
    public final void rule__TreeDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2946:1: ( ( 'text=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2947:1: ( 'text=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2947:1: ( 'text=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2948:1: 'text='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTreeDefinitionAccess().getTextKeyword_4_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__TreeDefinition__Group_4__0__Impl5899); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2961:1: rule__TreeDefinition__Group_4__1 : rule__TreeDefinition__Group_4__1__Impl ;
    public final void rule__TreeDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2965:1: ( rule__TreeDefinition__Group_4__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2966:2: rule__TreeDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group_4__1__Impl_in_rule__TreeDefinition__Group_4__15930);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2972:1: rule__TreeDefinition__Group_4__1__Impl : ( ( rule__TreeDefinition__TextAssignment_4_1 ) ) ;
    public final void rule__TreeDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2976:1: ( ( ( rule__TreeDefinition__TextAssignment_4_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2977:1: ( ( rule__TreeDefinition__TextAssignment_4_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2977:1: ( ( rule__TreeDefinition__TextAssignment_4_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2978:1: ( rule__TreeDefinition__TextAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTreeDefinitionAccess().getTextAssignment_4_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2979:1: ( rule__TreeDefinition__TextAssignment_4_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2979:2: rule__TreeDefinition__TextAssignment_4_1
            {
            pushFollow(FOLLOW_rule__TreeDefinition__TextAssignment_4_1_in_rule__TreeDefinition__Group_4__1__Impl5957);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2993:1: rule__TextfieldDefinition__Group__0 : rule__TextfieldDefinition__Group__0__Impl rule__TextfieldDefinition__Group__1 ;
    public final void rule__TextfieldDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2997:1: ( rule__TextfieldDefinition__Group__0__Impl rule__TextfieldDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2998:2: rule__TextfieldDefinition__Group__0__Impl rule__TextfieldDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__0__Impl_in_rule__TextfieldDefinition__Group__05991);
            rule__TextfieldDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__1_in_rule__TextfieldDefinition__Group__05994);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3005:1: rule__TextfieldDefinition__Group__0__Impl : ( ( rule__TextfieldDefinition__TypeAssignment_0 ) ) ;
    public final void rule__TextfieldDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3009:1: ( ( ( rule__TextfieldDefinition__TypeAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3010:1: ( ( rule__TextfieldDefinition__TypeAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3010:1: ( ( rule__TextfieldDefinition__TypeAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3011:1: ( rule__TextfieldDefinition__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextfieldDefinitionAccess().getTypeAssignment_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3012:1: ( rule__TextfieldDefinition__TypeAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3012:2: rule__TextfieldDefinition__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__TypeAssignment_0_in_rule__TextfieldDefinition__Group__0__Impl6021);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3022:1: rule__TextfieldDefinition__Group__1 : rule__TextfieldDefinition__Group__1__Impl rule__TextfieldDefinition__Group__2 ;
    public final void rule__TextfieldDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3026:1: ( rule__TextfieldDefinition__Group__1__Impl rule__TextfieldDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3027:2: rule__TextfieldDefinition__Group__1__Impl rule__TextfieldDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__1__Impl_in_rule__TextfieldDefinition__Group__16051);
            rule__TextfieldDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__2_in_rule__TextfieldDefinition__Group__16054);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3034:1: rule__TextfieldDefinition__Group__1__Impl : ( ' as ' ) ;
    public final void rule__TextfieldDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3038:1: ( ( ' as ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3039:1: ( ' as ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3039:1: ( ' as ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3040:1: ' as '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextfieldDefinitionAccess().getAsKeyword_1()); 
            }
            match(input,15,FOLLOW_15_in_rule__TextfieldDefinition__Group__1__Impl6082); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3053:1: rule__TextfieldDefinition__Group__2 : rule__TextfieldDefinition__Group__2__Impl rule__TextfieldDefinition__Group__3 ;
    public final void rule__TextfieldDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3057:1: ( rule__TextfieldDefinition__Group__2__Impl rule__TextfieldDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3058:2: rule__TextfieldDefinition__Group__2__Impl rule__TextfieldDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__2__Impl_in_rule__TextfieldDefinition__Group__26113);
            rule__TextfieldDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__3_in_rule__TextfieldDefinition__Group__26116);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3065:1: rule__TextfieldDefinition__Group__2__Impl : ( ( rule__TextfieldDefinition__NameAssignment_2 ) ) ;
    public final void rule__TextfieldDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3069:1: ( ( ( rule__TextfieldDefinition__NameAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3070:1: ( ( rule__TextfieldDefinition__NameAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3070:1: ( ( rule__TextfieldDefinition__NameAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3071:1: ( rule__TextfieldDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextfieldDefinitionAccess().getNameAssignment_2()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3072:1: ( rule__TextfieldDefinition__NameAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3072:2: rule__TextfieldDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__NameAssignment_2_in_rule__TextfieldDefinition__Group__2__Impl6143);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3082:1: rule__TextfieldDefinition__Group__3 : rule__TextfieldDefinition__Group__3__Impl rule__TextfieldDefinition__Group__4 ;
    public final void rule__TextfieldDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3086:1: ( rule__TextfieldDefinition__Group__3__Impl rule__TextfieldDefinition__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3087:2: rule__TextfieldDefinition__Group__3__Impl rule__TextfieldDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__3__Impl_in_rule__TextfieldDefinition__Group__36173);
            rule__TextfieldDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__4_in_rule__TextfieldDefinition__Group__36176);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3094:1: rule__TextfieldDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__TextfieldDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3098:1: ( ( ':' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3099:1: ( ':' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3099:1: ( ':' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3100:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextfieldDefinitionAccess().getColonKeyword_3()); 
            }
            match(input,27,FOLLOW_27_in_rule__TextfieldDefinition__Group__3__Impl6204); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3113:1: rule__TextfieldDefinition__Group__4 : rule__TextfieldDefinition__Group__4__Impl ;
    public final void rule__TextfieldDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3117:1: ( rule__TextfieldDefinition__Group__4__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3118:2: rule__TextfieldDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__4__Impl_in_rule__TextfieldDefinition__Group__46235);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3124:1: rule__TextfieldDefinition__Group__4__Impl : ( ( rule__TextfieldDefinition__Group_4__0 )? ) ;
    public final void rule__TextfieldDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3128:1: ( ( ( rule__TextfieldDefinition__Group_4__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3129:1: ( ( rule__TextfieldDefinition__Group_4__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3129:1: ( ( rule__TextfieldDefinition__Group_4__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3130:1: ( rule__TextfieldDefinition__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextfieldDefinitionAccess().getGroup_4()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3131:1: ( rule__TextfieldDefinition__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3131:2: rule__TextfieldDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__TextfieldDefinition__Group_4__0_in_rule__TextfieldDefinition__Group__4__Impl6262);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3151:1: rule__TextfieldDefinition__Group_4__0 : rule__TextfieldDefinition__Group_4__0__Impl rule__TextfieldDefinition__Group_4__1 ;
    public final void rule__TextfieldDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3155:1: ( rule__TextfieldDefinition__Group_4__0__Impl rule__TextfieldDefinition__Group_4__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3156:2: rule__TextfieldDefinition__Group_4__0__Impl rule__TextfieldDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group_4__0__Impl_in_rule__TextfieldDefinition__Group_4__06303);
            rule__TextfieldDefinition__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group_4__1_in_rule__TextfieldDefinition__Group_4__06306);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3163:1: rule__TextfieldDefinition__Group_4__0__Impl : ( 'text=' ) ;
    public final void rule__TextfieldDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3167:1: ( ( 'text=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3168:1: ( 'text=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3168:1: ( 'text=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3169:1: 'text='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextfieldDefinitionAccess().getTextKeyword_4_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__TextfieldDefinition__Group_4__0__Impl6334); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3182:1: rule__TextfieldDefinition__Group_4__1 : rule__TextfieldDefinition__Group_4__1__Impl ;
    public final void rule__TextfieldDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3186:1: ( rule__TextfieldDefinition__Group_4__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3187:2: rule__TextfieldDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group_4__1__Impl_in_rule__TextfieldDefinition__Group_4__16365);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3193:1: rule__TextfieldDefinition__Group_4__1__Impl : ( ( rule__TextfieldDefinition__TextAssignment_4_1 ) ) ;
    public final void rule__TextfieldDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3197:1: ( ( ( rule__TextfieldDefinition__TextAssignment_4_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3198:1: ( ( rule__TextfieldDefinition__TextAssignment_4_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3198:1: ( ( rule__TextfieldDefinition__TextAssignment_4_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3199:1: ( rule__TextfieldDefinition__TextAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextfieldDefinitionAccess().getTextAssignment_4_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3200:1: ( rule__TextfieldDefinition__TextAssignment_4_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3200:2: rule__TextfieldDefinition__TextAssignment_4_1
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__TextAssignment_4_1_in_rule__TextfieldDefinition__Group_4__1__Impl6392);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3214:1: rule__ButtonDefinition__Group__0 : rule__ButtonDefinition__Group__0__Impl rule__ButtonDefinition__Group__1 ;
    public final void rule__ButtonDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3218:1: ( rule__ButtonDefinition__Group__0__Impl rule__ButtonDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3219:2: rule__ButtonDefinition__Group__0__Impl rule__ButtonDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__0__Impl_in_rule__ButtonDefinition__Group__06426);
            rule__ButtonDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__1_in_rule__ButtonDefinition__Group__06429);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3226:1: rule__ButtonDefinition__Group__0__Impl : ( ( rule__ButtonDefinition__TypeAssignment_0 ) ) ;
    public final void rule__ButtonDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3230:1: ( ( ( rule__ButtonDefinition__TypeAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3231:1: ( ( rule__ButtonDefinition__TypeAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3231:1: ( ( rule__ButtonDefinition__TypeAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3232:1: ( rule__ButtonDefinition__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonDefinitionAccess().getTypeAssignment_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3233:1: ( rule__ButtonDefinition__TypeAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3233:2: rule__ButtonDefinition__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__TypeAssignment_0_in_rule__ButtonDefinition__Group__0__Impl6456);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3243:1: rule__ButtonDefinition__Group__1 : rule__ButtonDefinition__Group__1__Impl rule__ButtonDefinition__Group__2 ;
    public final void rule__ButtonDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3247:1: ( rule__ButtonDefinition__Group__1__Impl rule__ButtonDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3248:2: rule__ButtonDefinition__Group__1__Impl rule__ButtonDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__1__Impl_in_rule__ButtonDefinition__Group__16486);
            rule__ButtonDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__2_in_rule__ButtonDefinition__Group__16489);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3255:1: rule__ButtonDefinition__Group__1__Impl : ( ' as ' ) ;
    public final void rule__ButtonDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3259:1: ( ( ' as ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3260:1: ( ' as ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3260:1: ( ' as ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3261:1: ' as '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonDefinitionAccess().getAsKeyword_1()); 
            }
            match(input,15,FOLLOW_15_in_rule__ButtonDefinition__Group__1__Impl6517); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3274:1: rule__ButtonDefinition__Group__2 : rule__ButtonDefinition__Group__2__Impl rule__ButtonDefinition__Group__3 ;
    public final void rule__ButtonDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3278:1: ( rule__ButtonDefinition__Group__2__Impl rule__ButtonDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3279:2: rule__ButtonDefinition__Group__2__Impl rule__ButtonDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__2__Impl_in_rule__ButtonDefinition__Group__26548);
            rule__ButtonDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__3_in_rule__ButtonDefinition__Group__26551);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3286:1: rule__ButtonDefinition__Group__2__Impl : ( ( rule__ButtonDefinition__NameAssignment_2 ) ) ;
    public final void rule__ButtonDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3290:1: ( ( ( rule__ButtonDefinition__NameAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3291:1: ( ( rule__ButtonDefinition__NameAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3291:1: ( ( rule__ButtonDefinition__NameAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3292:1: ( rule__ButtonDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonDefinitionAccess().getNameAssignment_2()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3293:1: ( rule__ButtonDefinition__NameAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3293:2: rule__ButtonDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__NameAssignment_2_in_rule__ButtonDefinition__Group__2__Impl6578);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3303:1: rule__ButtonDefinition__Group__3 : rule__ButtonDefinition__Group__3__Impl rule__ButtonDefinition__Group__4 ;
    public final void rule__ButtonDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3307:1: ( rule__ButtonDefinition__Group__3__Impl rule__ButtonDefinition__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3308:2: rule__ButtonDefinition__Group__3__Impl rule__ButtonDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__3__Impl_in_rule__ButtonDefinition__Group__36608);
            rule__ButtonDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__4_in_rule__ButtonDefinition__Group__36611);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3315:1: rule__ButtonDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__ButtonDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3319:1: ( ( ':' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3320:1: ( ':' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3320:1: ( ':' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3321:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonDefinitionAccess().getColonKeyword_3()); 
            }
            match(input,27,FOLLOW_27_in_rule__ButtonDefinition__Group__3__Impl6639); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3334:1: rule__ButtonDefinition__Group__4 : rule__ButtonDefinition__Group__4__Impl rule__ButtonDefinition__Group__5 ;
    public final void rule__ButtonDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3338:1: ( rule__ButtonDefinition__Group__4__Impl rule__ButtonDefinition__Group__5 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3339:2: rule__ButtonDefinition__Group__4__Impl rule__ButtonDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__4__Impl_in_rule__ButtonDefinition__Group__46670);
            rule__ButtonDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__5_in_rule__ButtonDefinition__Group__46673);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3346:1: rule__ButtonDefinition__Group__4__Impl : ( ( rule__ButtonDefinition__Group_4__0 )? ) ;
    public final void rule__ButtonDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3350:1: ( ( ( rule__ButtonDefinition__Group_4__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3351:1: ( ( rule__ButtonDefinition__Group_4__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3351:1: ( ( rule__ButtonDefinition__Group_4__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3352:1: ( rule__ButtonDefinition__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonDefinitionAccess().getGroup_4()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3353:1: ( rule__ButtonDefinition__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3353:2: rule__ButtonDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ButtonDefinition__Group_4__0_in_rule__ButtonDefinition__Group__4__Impl6700);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3363:1: rule__ButtonDefinition__Group__5 : rule__ButtonDefinition__Group__5__Impl ;
    public final void rule__ButtonDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3367:1: ( rule__ButtonDefinition__Group__5__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3368:2: rule__ButtonDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__5__Impl_in_rule__ButtonDefinition__Group__56731);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3374:1: rule__ButtonDefinition__Group__5__Impl : ( ( rule__ButtonDefinition__Group_5__0 )? ) ;
    public final void rule__ButtonDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3378:1: ( ( ( rule__ButtonDefinition__Group_5__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3379:1: ( ( rule__ButtonDefinition__Group_5__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3379:1: ( ( rule__ButtonDefinition__Group_5__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3380:1: ( rule__ButtonDefinition__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonDefinitionAccess().getGroup_5()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3381:1: ( rule__ButtonDefinition__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3381:2: rule__ButtonDefinition__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ButtonDefinition__Group_5__0_in_rule__ButtonDefinition__Group__5__Impl6758);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3403:1: rule__ButtonDefinition__Group_4__0 : rule__ButtonDefinition__Group_4__0__Impl rule__ButtonDefinition__Group_4__1 ;
    public final void rule__ButtonDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3407:1: ( rule__ButtonDefinition__Group_4__0__Impl rule__ButtonDefinition__Group_4__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3408:2: rule__ButtonDefinition__Group_4__0__Impl rule__ButtonDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group_4__0__Impl_in_rule__ButtonDefinition__Group_4__06801);
            rule__ButtonDefinition__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ButtonDefinition__Group_4__1_in_rule__ButtonDefinition__Group_4__06804);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3415:1: rule__ButtonDefinition__Group_4__0__Impl : ( 'text=' ) ;
    public final void rule__ButtonDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3419:1: ( ( 'text=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3420:1: ( 'text=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3420:1: ( 'text=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3421:1: 'text='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonDefinitionAccess().getTextKeyword_4_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__ButtonDefinition__Group_4__0__Impl6832); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3434:1: rule__ButtonDefinition__Group_4__1 : rule__ButtonDefinition__Group_4__1__Impl ;
    public final void rule__ButtonDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3438:1: ( rule__ButtonDefinition__Group_4__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3439:2: rule__ButtonDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group_4__1__Impl_in_rule__ButtonDefinition__Group_4__16863);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3445:1: rule__ButtonDefinition__Group_4__1__Impl : ( ( rule__ButtonDefinition__TextAssignment_4_1 ) ) ;
    public final void rule__ButtonDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3449:1: ( ( ( rule__ButtonDefinition__TextAssignment_4_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3450:1: ( ( rule__ButtonDefinition__TextAssignment_4_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3450:1: ( ( rule__ButtonDefinition__TextAssignment_4_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3451:1: ( rule__ButtonDefinition__TextAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonDefinitionAccess().getTextAssignment_4_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3452:1: ( rule__ButtonDefinition__TextAssignment_4_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3452:2: rule__ButtonDefinition__TextAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__TextAssignment_4_1_in_rule__ButtonDefinition__Group_4__1__Impl6890);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3466:1: rule__ButtonDefinition__Group_5__0 : rule__ButtonDefinition__Group_5__0__Impl rule__ButtonDefinition__Group_5__1 ;
    public final void rule__ButtonDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3470:1: ( rule__ButtonDefinition__Group_5__0__Impl rule__ButtonDefinition__Group_5__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3471:2: rule__ButtonDefinition__Group_5__0__Impl rule__ButtonDefinition__Group_5__1
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group_5__0__Impl_in_rule__ButtonDefinition__Group_5__06924);
            rule__ButtonDefinition__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ButtonDefinition__Group_5__1_in_rule__ButtonDefinition__Group_5__06927);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3478:1: rule__ButtonDefinition__Group_5__0__Impl : ( 'interaction=' ) ;
    public final void rule__ButtonDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3482:1: ( ( 'interaction=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3483:1: ( 'interaction=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3483:1: ( 'interaction=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3484:1: 'interaction='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonDefinitionAccess().getInteractionKeyword_5_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__ButtonDefinition__Group_5__0__Impl6955); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3497:1: rule__ButtonDefinition__Group_5__1 : rule__ButtonDefinition__Group_5__1__Impl ;
    public final void rule__ButtonDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3501:1: ( rule__ButtonDefinition__Group_5__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3502:2: rule__ButtonDefinition__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group_5__1__Impl_in_rule__ButtonDefinition__Group_5__16986);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3508:1: rule__ButtonDefinition__Group_5__1__Impl : ( ( rule__ButtonDefinition__InteractionAssignment_5_1 ) ) ;
    public final void rule__ButtonDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3512:1: ( ( ( rule__ButtonDefinition__InteractionAssignment_5_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3513:1: ( ( rule__ButtonDefinition__InteractionAssignment_5_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3513:1: ( ( rule__ButtonDefinition__InteractionAssignment_5_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3514:1: ( rule__ButtonDefinition__InteractionAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonDefinitionAccess().getInteractionAssignment_5_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3515:1: ( rule__ButtonDefinition__InteractionAssignment_5_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3515:2: rule__ButtonDefinition__InteractionAssignment_5_1
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__InteractionAssignment_5_1_in_rule__ButtonDefinition__Group_5__1__Impl7013);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3529:1: rule__Interaction__Group__0 : rule__Interaction__Group__0__Impl rule__Interaction__Group__1 ;
    public final void rule__Interaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3533:1: ( rule__Interaction__Group__0__Impl rule__Interaction__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3534:2: rule__Interaction__Group__0__Impl rule__Interaction__Group__1
            {
            pushFollow(FOLLOW_rule__Interaction__Group__0__Impl_in_rule__Interaction__Group__07047);
            rule__Interaction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interaction__Group__1_in_rule__Interaction__Group__07050);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3541:1: rule__Interaction__Group__0__Impl : ( ( rule__Interaction__NameAssignment_0 ) ) ;
    public final void rule__Interaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3545:1: ( ( ( rule__Interaction__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3546:1: ( ( rule__Interaction__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3546:1: ( ( rule__Interaction__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3547:1: ( rule__Interaction__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInteractionAccess().getNameAssignment_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3548:1: ( rule__Interaction__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3548:2: rule__Interaction__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Interaction__NameAssignment_0_in_rule__Interaction__Group__0__Impl7077);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3558:1: rule__Interaction__Group__1 : rule__Interaction__Group__1__Impl rule__Interaction__Group__2 ;
    public final void rule__Interaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3562:1: ( rule__Interaction__Group__1__Impl rule__Interaction__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3563:2: rule__Interaction__Group__1__Impl rule__Interaction__Group__2
            {
            pushFollow(FOLLOW_rule__Interaction__Group__1__Impl_in_rule__Interaction__Group__17107);
            rule__Interaction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interaction__Group__2_in_rule__Interaction__Group__17110);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3570:1: rule__Interaction__Group__1__Impl : ( ' type=' ) ;
    public final void rule__Interaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3574:1: ( ( ' type=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3575:1: ( ' type=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3575:1: ( ' type=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3576:1: ' type='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInteractionAccess().getTypeKeyword_1()); 
            }
            match(input,30,FOLLOW_30_in_rule__Interaction__Group__1__Impl7138); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3589:1: rule__Interaction__Group__2 : rule__Interaction__Group__2__Impl rule__Interaction__Group__3 ;
    public final void rule__Interaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3593:1: ( rule__Interaction__Group__2__Impl rule__Interaction__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3594:2: rule__Interaction__Group__2__Impl rule__Interaction__Group__3
            {
            pushFollow(FOLLOW_rule__Interaction__Group__2__Impl_in_rule__Interaction__Group__27169);
            rule__Interaction__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interaction__Group__3_in_rule__Interaction__Group__27172);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3601:1: rule__Interaction__Group__2__Impl : ( ruleInteractiontype ) ;
    public final void rule__Interaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3605:1: ( ( ruleInteractiontype ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3606:1: ( ruleInteractiontype )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3606:1: ( ruleInteractiontype )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3607:1: ruleInteractiontype
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInteractionAccess().getInteractiontypeParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_ruleInteractiontype_in_rule__Interaction__Group__2__Impl7199);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3618:1: rule__Interaction__Group__3 : rule__Interaction__Group__3__Impl rule__Interaction__Group__4 ;
    public final void rule__Interaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3622:1: ( rule__Interaction__Group__3__Impl rule__Interaction__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3623:2: rule__Interaction__Group__3__Impl rule__Interaction__Group__4
            {
            pushFollow(FOLLOW_rule__Interaction__Group__3__Impl_in_rule__Interaction__Group__37228);
            rule__Interaction__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interaction__Group__4_in_rule__Interaction__Group__37231);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3630:1: rule__Interaction__Group__3__Impl : ( ' with actions:' ) ;
    public final void rule__Interaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3634:1: ( ( ' with actions:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3635:1: ( ' with actions:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3635:1: ( ' with actions:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3636:1: ' with actions:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInteractionAccess().getWithActionsKeyword_3()); 
            }
            match(input,31,FOLLOW_31_in_rule__Interaction__Group__3__Impl7259); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3649:1: rule__Interaction__Group__4 : rule__Interaction__Group__4__Impl ;
    public final void rule__Interaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3653:1: ( rule__Interaction__Group__4__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3654:2: rule__Interaction__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Interaction__Group__4__Impl_in_rule__Interaction__Group__47290);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3660:1: rule__Interaction__Group__4__Impl : ( ( rule__Interaction__ActionsAssignment_4 )* ) ;
    public final void rule__Interaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3664:1: ( ( ( rule__Interaction__ActionsAssignment_4 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3665:1: ( ( rule__Interaction__ActionsAssignment_4 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3665:1: ( ( rule__Interaction__ActionsAssignment_4 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3666:1: ( rule__Interaction__ActionsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInteractionAccess().getActionsAssignment_4()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3667:1: ( rule__Interaction__ActionsAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==32) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3667:2: rule__Interaction__ActionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Interaction__ActionsAssignment_4_in_rule__Interaction__Group__4__Impl7317);
            	    rule__Interaction__ActionsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3687:1: rule__LabelDefinition__Group__0 : rule__LabelDefinition__Group__0__Impl rule__LabelDefinition__Group__1 ;
    public final void rule__LabelDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3691:1: ( rule__LabelDefinition__Group__0__Impl rule__LabelDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3692:2: rule__LabelDefinition__Group__0__Impl rule__LabelDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__0__Impl_in_rule__LabelDefinition__Group__07358);
            rule__LabelDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LabelDefinition__Group__1_in_rule__LabelDefinition__Group__07361);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3699:1: rule__LabelDefinition__Group__0__Impl : ( ( rule__LabelDefinition__TypeAssignment_0 ) ) ;
    public final void rule__LabelDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3703:1: ( ( ( rule__LabelDefinition__TypeAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3704:1: ( ( rule__LabelDefinition__TypeAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3704:1: ( ( rule__LabelDefinition__TypeAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3705:1: ( rule__LabelDefinition__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelDefinitionAccess().getTypeAssignment_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3706:1: ( rule__LabelDefinition__TypeAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3706:2: rule__LabelDefinition__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__LabelDefinition__TypeAssignment_0_in_rule__LabelDefinition__Group__0__Impl7388);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3716:1: rule__LabelDefinition__Group__1 : rule__LabelDefinition__Group__1__Impl rule__LabelDefinition__Group__2 ;
    public final void rule__LabelDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3720:1: ( rule__LabelDefinition__Group__1__Impl rule__LabelDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3721:2: rule__LabelDefinition__Group__1__Impl rule__LabelDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__1__Impl_in_rule__LabelDefinition__Group__17418);
            rule__LabelDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LabelDefinition__Group__2_in_rule__LabelDefinition__Group__17421);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3728:1: rule__LabelDefinition__Group__1__Impl : ( ' as ' ) ;
    public final void rule__LabelDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3732:1: ( ( ' as ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3733:1: ( ' as ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3733:1: ( ' as ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3734:1: ' as '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelDefinitionAccess().getAsKeyword_1()); 
            }
            match(input,15,FOLLOW_15_in_rule__LabelDefinition__Group__1__Impl7449); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3747:1: rule__LabelDefinition__Group__2 : rule__LabelDefinition__Group__2__Impl rule__LabelDefinition__Group__3 ;
    public final void rule__LabelDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3751:1: ( rule__LabelDefinition__Group__2__Impl rule__LabelDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3752:2: rule__LabelDefinition__Group__2__Impl rule__LabelDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__2__Impl_in_rule__LabelDefinition__Group__27480);
            rule__LabelDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LabelDefinition__Group__3_in_rule__LabelDefinition__Group__27483);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3759:1: rule__LabelDefinition__Group__2__Impl : ( ( rule__LabelDefinition__NameAssignment_2 ) ) ;
    public final void rule__LabelDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3763:1: ( ( ( rule__LabelDefinition__NameAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3764:1: ( ( rule__LabelDefinition__NameAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3764:1: ( ( rule__LabelDefinition__NameAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3765:1: ( rule__LabelDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelDefinitionAccess().getNameAssignment_2()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3766:1: ( rule__LabelDefinition__NameAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3766:2: rule__LabelDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__LabelDefinition__NameAssignment_2_in_rule__LabelDefinition__Group__2__Impl7510);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3776:1: rule__LabelDefinition__Group__3 : rule__LabelDefinition__Group__3__Impl rule__LabelDefinition__Group__4 ;
    public final void rule__LabelDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3780:1: ( rule__LabelDefinition__Group__3__Impl rule__LabelDefinition__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3781:2: rule__LabelDefinition__Group__3__Impl rule__LabelDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__3__Impl_in_rule__LabelDefinition__Group__37540);
            rule__LabelDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LabelDefinition__Group__4_in_rule__LabelDefinition__Group__37543);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3788:1: rule__LabelDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__LabelDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3792:1: ( ( ':' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3793:1: ( ':' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3793:1: ( ':' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3794:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelDefinitionAccess().getColonKeyword_3()); 
            }
            match(input,27,FOLLOW_27_in_rule__LabelDefinition__Group__3__Impl7571); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3807:1: rule__LabelDefinition__Group__4 : rule__LabelDefinition__Group__4__Impl ;
    public final void rule__LabelDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3811:1: ( rule__LabelDefinition__Group__4__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3812:2: rule__LabelDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__4__Impl_in_rule__LabelDefinition__Group__47602);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3818:1: rule__LabelDefinition__Group__4__Impl : ( ( rule__LabelDefinition__Group_4__0 )? ) ;
    public final void rule__LabelDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3822:1: ( ( ( rule__LabelDefinition__Group_4__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3823:1: ( ( rule__LabelDefinition__Group_4__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3823:1: ( ( rule__LabelDefinition__Group_4__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3824:1: ( rule__LabelDefinition__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelDefinitionAccess().getGroup_4()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3825:1: ( rule__LabelDefinition__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3825:2: rule__LabelDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__LabelDefinition__Group_4__0_in_rule__LabelDefinition__Group__4__Impl7629);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3845:1: rule__LabelDefinition__Group_4__0 : rule__LabelDefinition__Group_4__0__Impl rule__LabelDefinition__Group_4__1 ;
    public final void rule__LabelDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3849:1: ( rule__LabelDefinition__Group_4__0__Impl rule__LabelDefinition__Group_4__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3850:2: rule__LabelDefinition__Group_4__0__Impl rule__LabelDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group_4__0__Impl_in_rule__LabelDefinition__Group_4__07670);
            rule__LabelDefinition__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LabelDefinition__Group_4__1_in_rule__LabelDefinition__Group_4__07673);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3857:1: rule__LabelDefinition__Group_4__0__Impl : ( 'text=' ) ;
    public final void rule__LabelDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3861:1: ( ( 'text=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3862:1: ( 'text=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3862:1: ( 'text=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3863:1: 'text='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelDefinitionAccess().getTextKeyword_4_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__LabelDefinition__Group_4__0__Impl7701); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3876:1: rule__LabelDefinition__Group_4__1 : rule__LabelDefinition__Group_4__1__Impl ;
    public final void rule__LabelDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3880:1: ( rule__LabelDefinition__Group_4__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3881:2: rule__LabelDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group_4__1__Impl_in_rule__LabelDefinition__Group_4__17732);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3887:1: rule__LabelDefinition__Group_4__1__Impl : ( ( rule__LabelDefinition__TextAssignment_4_1 ) ) ;
    public final void rule__LabelDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3891:1: ( ( ( rule__LabelDefinition__TextAssignment_4_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3892:1: ( ( rule__LabelDefinition__TextAssignment_4_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3892:1: ( ( rule__LabelDefinition__TextAssignment_4_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3893:1: ( rule__LabelDefinition__TextAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelDefinitionAccess().getTextAssignment_4_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3894:1: ( rule__LabelDefinition__TextAssignment_4_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3894:2: rule__LabelDefinition__TextAssignment_4_1
            {
            pushFollow(FOLLOW_rule__LabelDefinition__TextAssignment_4_1_in_rule__LabelDefinition__Group_4__1__Impl7759);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3908:1: rule__UIAction__Group__0 : rule__UIAction__Group__0__Impl rule__UIAction__Group__1 ;
    public final void rule__UIAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3912:1: ( rule__UIAction__Group__0__Impl rule__UIAction__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3913:2: rule__UIAction__Group__0__Impl rule__UIAction__Group__1
            {
            pushFollow(FOLLOW_rule__UIAction__Group__0__Impl_in_rule__UIAction__Group__07793);
            rule__UIAction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIAction__Group__1_in_rule__UIAction__Group__07796);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3920:1: rule__UIAction__Group__0__Impl : ( 'type=' ) ;
    public final void rule__UIAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3924:1: ( ( 'type=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3925:1: ( 'type=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3925:1: ( 'type=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3926:1: 'type='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIActionAccess().getTypeKeyword_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__UIAction__Group__0__Impl7824); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3939:1: rule__UIAction__Group__1 : rule__UIAction__Group__1__Impl rule__UIAction__Group__2 ;
    public final void rule__UIAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3943:1: ( rule__UIAction__Group__1__Impl rule__UIAction__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3944:2: rule__UIAction__Group__1__Impl rule__UIAction__Group__2
            {
            pushFollow(FOLLOW_rule__UIAction__Group__1__Impl_in_rule__UIAction__Group__17855);
            rule__UIAction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIAction__Group__2_in_rule__UIAction__Group__17858);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3951:1: rule__UIAction__Group__1__Impl : ( ( rule__UIAction__TypeAssignment_1 ) ) ;
    public final void rule__UIAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3955:1: ( ( ( rule__UIAction__TypeAssignment_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3956:1: ( ( rule__UIAction__TypeAssignment_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3956:1: ( ( rule__UIAction__TypeAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3957:1: ( rule__UIAction__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIActionAccess().getTypeAssignment_1()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3958:1: ( rule__UIAction__TypeAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3958:2: rule__UIAction__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__UIAction__TypeAssignment_1_in_rule__UIAction__Group__1__Impl7885);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3968:1: rule__UIAction__Group__2 : rule__UIAction__Group__2__Impl rule__UIAction__Group__3 ;
    public final void rule__UIAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3972:1: ( rule__UIAction__Group__2__Impl rule__UIAction__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3973:2: rule__UIAction__Group__2__Impl rule__UIAction__Group__3
            {
            pushFollow(FOLLOW_rule__UIAction__Group__2__Impl_in_rule__UIAction__Group__27915);
            rule__UIAction__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIAction__Group__3_in_rule__UIAction__Group__27918);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3980:1: rule__UIAction__Group__2__Impl : ( 'element=' ) ;
    public final void rule__UIAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3984:1: ( ( 'element=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3985:1: ( 'element=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3985:1: ( 'element=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3986:1: 'element='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIActionAccess().getElementKeyword_2()); 
            }
            match(input,33,FOLLOW_33_in_rule__UIAction__Group__2__Impl7946); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3999:1: rule__UIAction__Group__3 : rule__UIAction__Group__3__Impl rule__UIAction__Group__4 ;
    public final void rule__UIAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4003:1: ( rule__UIAction__Group__3__Impl rule__UIAction__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4004:2: rule__UIAction__Group__3__Impl rule__UIAction__Group__4
            {
            pushFollow(FOLLOW_rule__UIAction__Group__3__Impl_in_rule__UIAction__Group__37977);
            rule__UIAction__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIAction__Group__4_in_rule__UIAction__Group__37980);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4011:1: rule__UIAction__Group__3__Impl : ( ( rule__UIAction__UiElementNameAssignment_3 ) ) ;
    public final void rule__UIAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4015:1: ( ( ( rule__UIAction__UiElementNameAssignment_3 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4016:1: ( ( rule__UIAction__UiElementNameAssignment_3 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4016:1: ( ( rule__UIAction__UiElementNameAssignment_3 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4017:1: ( rule__UIAction__UiElementNameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIActionAccess().getUiElementNameAssignment_3()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4018:1: ( rule__UIAction__UiElementNameAssignment_3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4018:2: rule__UIAction__UiElementNameAssignment_3
            {
            pushFollow(FOLLOW_rule__UIAction__UiElementNameAssignment_3_in_rule__UIAction__Group__3__Impl8007);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4028:1: rule__UIAction__Group__4 : rule__UIAction__Group__4__Impl rule__UIAction__Group__5 ;
    public final void rule__UIAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4032:1: ( rule__UIAction__Group__4__Impl rule__UIAction__Group__5 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4033:2: rule__UIAction__Group__4__Impl rule__UIAction__Group__5
            {
            pushFollow(FOLLOW_rule__UIAction__Group__4__Impl_in_rule__UIAction__Group__48037);
            rule__UIAction__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIAction__Group__5_in_rule__UIAction__Group__48040);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4040:1: rule__UIAction__Group__4__Impl : ( ':' ) ;
    public final void rule__UIAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4044:1: ( ( ':' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4045:1: ( ':' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4045:1: ( ':' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4046:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIActionAccess().getColonKeyword_4()); 
            }
            match(input,27,FOLLOW_27_in_rule__UIAction__Group__4__Impl8068); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4059:1: rule__UIAction__Group__5 : rule__UIAction__Group__5__Impl ;
    public final void rule__UIAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4063:1: ( rule__UIAction__Group__5__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4064:2: rule__UIAction__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__UIAction__Group__5__Impl_in_rule__UIAction__Group__58099);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4070:1: rule__UIAction__Group__5__Impl : ( ( rule__UIAction__PropertiesAssignment_5 )* ) ;
    public final void rule__UIAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4074:1: ( ( ( rule__UIAction__PropertiesAssignment_5 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4075:1: ( ( rule__UIAction__PropertiesAssignment_5 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4075:1: ( ( rule__UIAction__PropertiesAssignment_5 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4076:1: ( rule__UIAction__PropertiesAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIActionAccess().getPropertiesAssignment_5()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4077:1: ( rule__UIAction__PropertiesAssignment_5 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==12) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4077:2: rule__UIAction__PropertiesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__UIAction__PropertiesAssignment_5_in_rule__UIAction__Group__5__Impl8126);
            	    rule__UIAction__PropertiesAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4099:1: rule__CommonProperty__Group__0 : rule__CommonProperty__Group__0__Impl rule__CommonProperty__Group__1 ;
    public final void rule__CommonProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4103:1: ( rule__CommonProperty__Group__0__Impl rule__CommonProperty__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4104:2: rule__CommonProperty__Group__0__Impl rule__CommonProperty__Group__1
            {
            pushFollow(FOLLOW_rule__CommonProperty__Group__0__Impl_in_rule__CommonProperty__Group__08169);
            rule__CommonProperty__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommonProperty__Group__1_in_rule__CommonProperty__Group__08172);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4111:1: rule__CommonProperty__Group__0__Impl : ( ( rule__CommonProperty__NameAssignment_0 ) ) ;
    public final void rule__CommonProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4115:1: ( ( ( rule__CommonProperty__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4116:1: ( ( rule__CommonProperty__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4116:1: ( ( rule__CommonProperty__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4117:1: ( rule__CommonProperty__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommonPropertyAccess().getNameAssignment_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4118:1: ( rule__CommonProperty__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4118:2: rule__CommonProperty__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__CommonProperty__NameAssignment_0_in_rule__CommonProperty__Group__0__Impl8199);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4128:1: rule__CommonProperty__Group__1 : rule__CommonProperty__Group__1__Impl rule__CommonProperty__Group__2 ;
    public final void rule__CommonProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4132:1: ( rule__CommonProperty__Group__1__Impl rule__CommonProperty__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4133:2: rule__CommonProperty__Group__1__Impl rule__CommonProperty__Group__2
            {
            pushFollow(FOLLOW_rule__CommonProperty__Group__1__Impl_in_rule__CommonProperty__Group__18229);
            rule__CommonProperty__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommonProperty__Group__2_in_rule__CommonProperty__Group__18232);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4140:1: rule__CommonProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__CommonProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4144:1: ( ( '=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4145:1: ( '=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4145:1: ( '=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4146:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommonPropertyAccess().getEqualsSignKeyword_1()); 
            }
            match(input,34,FOLLOW_34_in_rule__CommonProperty__Group__1__Impl8260); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4159:1: rule__CommonProperty__Group__2 : rule__CommonProperty__Group__2__Impl ;
    public final void rule__CommonProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4163:1: ( rule__CommonProperty__Group__2__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4164:2: rule__CommonProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CommonProperty__Group__2__Impl_in_rule__CommonProperty__Group__28291);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4170:1: rule__CommonProperty__Group__2__Impl : ( ( rule__CommonProperty__ValueAssignment_2 ) ) ;
    public final void rule__CommonProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4174:1: ( ( ( rule__CommonProperty__ValueAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4175:1: ( ( rule__CommonProperty__ValueAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4175:1: ( ( rule__CommonProperty__ValueAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4176:1: ( rule__CommonProperty__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommonPropertyAccess().getValueAssignment_2()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4177:1: ( rule__CommonProperty__ValueAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4177:2: rule__CommonProperty__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__CommonProperty__ValueAssignment_2_in_rule__CommonProperty__Group__2__Impl8318);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4194:1: rule__UIDescription__UnorderedGroup : rule__UIDescription__UnorderedGroup__0 {...}?;
    public final void rule__UIDescription__UnorderedGroup() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getUIDescriptionAccess().getUnorderedGroup());
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4199:1: ( rule__UIDescription__UnorderedGroup__0 {...}?)
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4200:2: rule__UIDescription__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_rule__UIDescription__UnorderedGroup__0_in_rule__UIDescription__UnorderedGroup8355);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4211:1: rule__UIDescription__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__UIDescription__Group_0__0 ) ) ) ) | ({...}? => ( ( ( ( rule__UIDescription__InputTypesAssignment_1 ) ) ( ( ( rule__UIDescription__InputTypesAssignment_1 )=> rule__UIDescription__InputTypesAssignment_1 )* ) ) ) ) | ({...}? => ( ( ( rule__UIDescription__Group_2__0 ) ) ) ) ) ;
    public final void rule__UIDescription__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4216:1: ( ( ({...}? => ( ( ( rule__UIDescription__Group_0__0 ) ) ) ) | ({...}? => ( ( ( ( rule__UIDescription__InputTypesAssignment_1 ) ) ( ( ( rule__UIDescription__InputTypesAssignment_1 )=> rule__UIDescription__InputTypesAssignment_1 )* ) ) ) ) | ({...}? => ( ( ( rule__UIDescription__Group_2__0 ) ) ) ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4217:3: ( ({...}? => ( ( ( rule__UIDescription__Group_0__0 ) ) ) ) | ({...}? => ( ( ( ( rule__UIDescription__InputTypesAssignment_1 ) ) ( ( ( rule__UIDescription__InputTypesAssignment_1 )=> rule__UIDescription__InputTypesAssignment_1 )* ) ) ) ) | ({...}? => ( ( ( rule__UIDescription__Group_2__0 ) ) ) ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4217:3: ( ({...}? => ( ( ( rule__UIDescription__Group_0__0 ) ) ) ) | ({...}? => ( ( ( ( rule__UIDescription__InputTypesAssignment_1 ) ) ( ( ( rule__UIDescription__InputTypesAssignment_1 )=> rule__UIDescription__InputTypesAssignment_1 )* ) ) ) ) | ({...}? => ( ( ( rule__UIDescription__Group_2__0 ) ) ) ) )
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( LA21_0 ==17 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 0) ) ) {
                int LA21_1 = input.LA(2);

                if ( getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 0) ) {
                    alt21=1;
                }
                else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2) ) {
                    alt21=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else if ( LA21_0 ==14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2) ) ) {
                int LA21_2 = input.LA(2);

                if ( getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 1) ) {
                    alt21=2;
                }
                else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2) ) {
                    alt21=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;
                }
            }
            else if ( (LA21_0==EOF||LA21_0==RULE_STRING||LA21_0==18||LA21_0==22) && getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2) ) {
                alt21=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4219:4: ({...}? => ( ( ( rule__UIDescription__Group_0__0 ) ) ) )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4219:4: ({...}? => ( ( ( rule__UIDescription__Group_0__0 ) ) ) )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4220:5: {...}? => ( ( ( rule__UIDescription__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__UIDescription__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 0)");
                    }
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4220:108: ( ( ( rule__UIDescription__Group_0__0 ) ) )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4221:6: ( ( rule__UIDescription__Group_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 0);
                    selected = true;
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4227:6: ( ( rule__UIDescription__Group_0__0 ) )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4229:7: ( rule__UIDescription__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUIDescriptionAccess().getGroup_0()); 
                    }
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4230:7: ( rule__UIDescription__Group_0__0 )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4230:8: rule__UIDescription__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__UIDescription__Group_0__0_in_rule__UIDescription__UnorderedGroup__Impl8444);
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
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4236:4: ({...}? => ( ( ( ( rule__UIDescription__InputTypesAssignment_1 ) ) ( ( ( rule__UIDescription__InputTypesAssignment_1 )=> rule__UIDescription__InputTypesAssignment_1 )* ) ) ) )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4236:4: ({...}? => ( ( ( ( rule__UIDescription__InputTypesAssignment_1 ) ) ( ( ( rule__UIDescription__InputTypesAssignment_1 )=> rule__UIDescription__InputTypesAssignment_1 )* ) ) ) )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4237:5: {...}? => ( ( ( ( rule__UIDescription__InputTypesAssignment_1 ) ) ( ( ( rule__UIDescription__InputTypesAssignment_1 )=> rule__UIDescription__InputTypesAssignment_1 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__UIDescription__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 1)");
                    }
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4237:108: ( ( ( ( rule__UIDescription__InputTypesAssignment_1 ) ) ( ( ( rule__UIDescription__InputTypesAssignment_1 )=> rule__UIDescription__InputTypesAssignment_1 )* ) ) )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4238:6: ( ( ( rule__UIDescription__InputTypesAssignment_1 ) ) ( ( ( rule__UIDescription__InputTypesAssignment_1 )=> rule__UIDescription__InputTypesAssignment_1 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 1);
                    selected = true;
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4244:6: ( ( ( rule__UIDescription__InputTypesAssignment_1 ) ) ( ( ( rule__UIDescription__InputTypesAssignment_1 )=> rule__UIDescription__InputTypesAssignment_1 )* ) )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4245:6: ( ( rule__UIDescription__InputTypesAssignment_1 ) ) ( ( ( rule__UIDescription__InputTypesAssignment_1 )=> rule__UIDescription__InputTypesAssignment_1 )* )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4245:6: ( ( rule__UIDescription__InputTypesAssignment_1 ) )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4246:7: ( rule__UIDescription__InputTypesAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUIDescriptionAccess().getInputTypesAssignment_1()); 
                    }
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4247:7: ( rule__UIDescription__InputTypesAssignment_1 )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4247:8: rule__UIDescription__InputTypesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__UIDescription__InputTypesAssignment_1_in_rule__UIDescription__UnorderedGroup__Impl8536);
                    rule__UIDescription__InputTypesAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUIDescriptionAccess().getInputTypesAssignment_1()); 
                    }

                    }

                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4250:6: ( ( ( rule__UIDescription__InputTypesAssignment_1 )=> rule__UIDescription__InputTypesAssignment_1 )* )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4251:7: ( ( rule__UIDescription__InputTypesAssignment_1 )=> rule__UIDescription__InputTypesAssignment_1 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUIDescriptionAccess().getInputTypesAssignment_1()); 
                    }
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4252:7: ( ( rule__UIDescription__InputTypesAssignment_1 )=> rule__UIDescription__InputTypesAssignment_1 )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==14) ) {
                            int LA20_2 = input.LA(2);

                            if ( (LA20_2==RULE_STRING) ) {
                                int LA20_3 = input.LA(3);

                                if ( (LA20_3==15) ) {
                                    int LA20_4 = input.LA(4);

                                    if ( (LA20_4==RULE_STRING) ) {
                                        int LA20_5 = input.LA(5);

                                        if ( (synpred1_InternalGuiDSL()) ) {
                                            alt20=1;
                                        }


                                    }


                                }


                            }


                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4252:8: ( rule__UIDescription__InputTypesAssignment_1 )=> rule__UIDescription__InputTypesAssignment_1
                    	    {
                    	    pushFollow(FOLLOW_rule__UIDescription__InputTypesAssignment_1_in_rule__UIDescription__UnorderedGroup__Impl8580);
                    	    rule__UIDescription__InputTypesAssignment_1();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
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
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4258:4: ({...}? => ( ( ( rule__UIDescription__Group_2__0 ) ) ) )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4258:4: ({...}? => ( ( ( rule__UIDescription__Group_2__0 ) ) ) )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4259:5: {...}? => ( ( ( rule__UIDescription__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__UIDescription__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2)");
                    }
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4259:108: ( ( ( rule__UIDescription__Group_2__0 ) ) )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4260:6: ( ( rule__UIDescription__Group_2__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2);
                    selected = true;
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4266:6: ( ( rule__UIDescription__Group_2__0 ) )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4268:7: ( rule__UIDescription__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUIDescriptionAccess().getGroup_2()); 
                    }
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4269:7: ( rule__UIDescription__Group_2__0 )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4269:8: rule__UIDescription__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__UIDescription__Group_2__0_in_rule__UIDescription__UnorderedGroup__Impl8678);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4284:1: rule__UIDescription__UnorderedGroup__0 : rule__UIDescription__UnorderedGroup__Impl ( rule__UIDescription__UnorderedGroup__1 )? ;
    public final void rule__UIDescription__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4288:1: ( rule__UIDescription__UnorderedGroup__Impl ( rule__UIDescription__UnorderedGroup__1 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4289:2: rule__UIDescription__UnorderedGroup__Impl ( rule__UIDescription__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_rule__UIDescription__UnorderedGroup__Impl_in_rule__UIDescription__UnorderedGroup__08737);
            rule__UIDescription__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4290:2: ( rule__UIDescription__UnorderedGroup__1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( LA22_0 ==17 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 0) ) ) {
                alt22=1;
            }
            else if ( LA22_0 ==14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2) ) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_STRING||LA22_0==18||LA22_0==22) && getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2) ) {
                alt22=1;
            }
            else if ( (LA22_0==EOF) ) {
                int LA22_4 = input.LA(2);

                if ( getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4290:2: rule__UIDescription__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_rule__UIDescription__UnorderedGroup__1_in_rule__UIDescription__UnorderedGroup__08740);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4297:1: rule__UIDescription__UnorderedGroup__1 : rule__UIDescription__UnorderedGroup__Impl ( rule__UIDescription__UnorderedGroup__2 )? ;
    public final void rule__UIDescription__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4301:1: ( rule__UIDescription__UnorderedGroup__Impl ( rule__UIDescription__UnorderedGroup__2 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4302:2: rule__UIDescription__UnorderedGroup__Impl ( rule__UIDescription__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_rule__UIDescription__UnorderedGroup__Impl_in_rule__UIDescription__UnorderedGroup__18765);
            rule__UIDescription__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4303:2: ( rule__UIDescription__UnorderedGroup__2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( LA23_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 0) ) {
                alt23=1;
            }
            else if ( LA23_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 1) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_STRING||LA23_0==18||LA23_0==22) && getUnorderedGroupHelper().canSelect(grammarAccess.getUIDescriptionAccess().getUnorderedGroup(), 2) ) {
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
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4303:2: rule__UIDescription__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_rule__UIDescription__UnorderedGroup__2_in_rule__UIDescription__UnorderedGroup__18768);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4310:1: rule__UIDescription__UnorderedGroup__2 : rule__UIDescription__UnorderedGroup__Impl ;
    public final void rule__UIDescription__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4314:1: ( rule__UIDescription__UnorderedGroup__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4315:2: rule__UIDescription__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_rule__UIDescription__UnorderedGroup__Impl_in_rule__UIDescription__UnorderedGroup__28793);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4328:1: rule__UIDescription__AreaCountAssignment_0_0 : ( ruleAreaCount ) ;
    public final void rule__UIDescription__AreaCountAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4332:1: ( ( ruleAreaCount ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4333:1: ( ruleAreaCount )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4333:1: ( ruleAreaCount )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4334:1: ruleAreaCount
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getAreaCountAreaCountParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleAreaCount_in_rule__UIDescription__AreaCountAssignment_0_08827);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4343:1: rule__UIDescription__TypeDefinitionAssignment_0_1 : ( ruleTypeDefinition ) ;
    public final void rule__UIDescription__TypeDefinitionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4347:1: ( ( ruleTypeDefinition ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4348:1: ( ruleTypeDefinition )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4348:1: ( ruleTypeDefinition )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4349:1: ruleTypeDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getTypeDefinitionTypeDefinitionParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleTypeDefinition_in_rule__UIDescription__TypeDefinitionAssignment_0_18858);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4358:1: rule__UIDescription__UsedDescriptionsAssignment_0_2 : ( ruleUsedDescriptions ) ;
    public final void rule__UIDescription__UsedDescriptionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4362:1: ( ( ruleUsedDescriptions ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4363:1: ( ruleUsedDescriptions )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4363:1: ( ruleUsedDescriptions )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4364:1: ruleUsedDescriptions
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getUsedDescriptionsUsedDescriptionsParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleUsedDescriptions_in_rule__UIDescription__UsedDescriptionsAssignment_0_28889);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4373:1: rule__UIDescription__InputTypesAssignment_1 : ( ruleinputType ) ;
    public final void rule__UIDescription__InputTypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4377:1: ( ( ruleinputType ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4378:1: ( ruleinputType )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4378:1: ( ruleinputType )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4379:1: ruleinputType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getInputTypesInputTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleinputType_in_rule__UIDescription__InputTypesAssignment_18920);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4388:1: rule__UIDescription__DefinitionsAssignment_2_0 : ( ruleDefinition ) ;
    public final void rule__UIDescription__DefinitionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4392:1: ( ( ruleDefinition ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4393:1: ( ruleDefinition )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4393:1: ( ruleDefinition )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4394:1: ruleDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getDefinitionsDefinitionParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleDefinition_in_rule__UIDescription__DefinitionsAssignment_2_08951);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4403:1: rule__UIDescription__AreasAssignment_2_1 : ( ruleAreaAssignment ) ;
    public final void rule__UIDescription__AreasAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4407:1: ( ( ruleAreaAssignment ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4408:1: ( ruleAreaAssignment )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4408:1: ( ruleAreaAssignment )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4409:1: ruleAreaAssignment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getAreasAreaAssignmentParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleAreaAssignment_in_rule__UIDescription__AreasAssignment_2_18982);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4418:1: rule__InputType__TypeAssignment_1 : ( RULE_STRING ) ;
    public final void rule__InputType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4422:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4423:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4423:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4424:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputTypeAccess().getTypeSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__InputType__TypeAssignment_19013); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4433:1: rule__InputType__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__InputType__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4437:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4438:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4438:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4439:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputTypeAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__InputType__NameAssignment_39044); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4448:1: rule__UsedDescriptions__DescriptionAssignment_1 : ( ruleUIDescriptionImport ) ;
    public final void rule__UsedDescriptions__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4452:1: ( ( ruleUIDescriptionImport ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4453:1: ( ruleUIDescriptionImport )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4453:1: ( ruleUIDescriptionImport )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4454:1: ruleUIDescriptionImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUsedDescriptionsAccess().getDescriptionUIDescriptionImportParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleUIDescriptionImport_in_rule__UsedDescriptions__DescriptionAssignment_19075);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4463:1: rule__AreaCount__AreaCountAssignment_1 : ( RULE_INT ) ;
    public final void rule__AreaCount__AreaCountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4467:1: ( ( RULE_INT ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4468:1: ( RULE_INT )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4468:1: ( RULE_INT )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4469:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaCountAccess().getAreaCountINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AreaCount__AreaCountAssignment_19106); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4478:1: rule__Definition__ConcreteDefitionAssignment_1 : ( ruleComponentDefinition ) ;
    public final void rule__Definition__ConcreteDefitionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4482:1: ( ( ruleComponentDefinition ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4483:1: ( ruleComponentDefinition )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4483:1: ( ruleComponentDefinition )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4484:1: ruleComponentDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getConcreteDefitionComponentDefinitionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleComponentDefinition_in_rule__Definition__ConcreteDefitionAssignment_19137);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4493:1: rule__TypeDefinition__TypeAssignment_1 : ( RULE_TYPE ) ;
    public final void rule__TypeDefinition__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4497:1: ( ( RULE_TYPE ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4498:1: ( RULE_TYPE )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4498:1: ( RULE_TYPE )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4499:1: RULE_TYPE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDefinitionAccess().getTypeTYPETerminalRuleCall_1_0()); 
            }
            match(input,RULE_TYPE,FOLLOW_RULE_TYPE_in_rule__TypeDefinition__TypeAssignment_19168); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDefinitionAccess().getTypeTYPETerminalRuleCall_1_0()); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4508:1: rule__UIDescriptionImport__DescriptionNameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__UIDescriptionImport__DescriptionNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4512:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4513:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4513:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4514:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionImportAccess().getDescriptionNameSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UIDescriptionImport__DescriptionNameAssignment_09199); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4523:1: rule__UIDescriptionImport__LocalNameAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__UIDescriptionImport__LocalNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4527:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4528:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4528:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4529:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionImportAccess().getLocalNameSTRINGTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UIDescriptionImport__LocalNameAssignment_1_19230); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4538:1: rule__AreaAssignment__AreaAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__AreaAssignment__AreaAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4542:1: ( ( RULE_INT ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4543:1: ( RULE_INT )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4543:1: ( RULE_INT )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4544:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAssignmentAccess().getAreaINTTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AreaAssignment__AreaAssignment_0_19261); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4553:1: rule__AreaAssignment__ElementAssignment_0_3 : ( RULE_STRING ) ;
    public final void rule__AreaAssignment__ElementAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4557:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4558:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4558:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4559:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAssignmentAccess().getElementSTRINGTerminalRuleCall_0_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AreaAssignment__ElementAssignment_0_39292); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4568:1: rule__AreaAssignment__ElementAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__AreaAssignment__ElementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4572:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4573:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4573:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4574:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAssignmentAccess().getElementSTRINGTerminalRuleCall_1_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AreaAssignment__ElementAssignment_1_09323); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4583:1: rule__AreaAssignment__AreaAssignment_1_3 : ( RULE_INT ) ;
    public final void rule__AreaAssignment__AreaAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4587:1: ( ( RULE_INT ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4588:1: ( RULE_INT )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4588:1: ( RULE_INT )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4589:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAssignmentAccess().getAreaINTTerminalRuleCall_1_3_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AreaAssignment__AreaAssignment_1_39354); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4598:1: rule__MultiSelectionDefinition__TypeAssignment_0 : ( ( 'MultiSelection' ) ) ;
    public final void rule__MultiSelectionDefinition__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4602:1: ( ( ( 'MultiSelection' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4603:1: ( ( 'MultiSelection' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4603:1: ( ( 'MultiSelection' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4604:1: ( 'MultiSelection' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getTypeMultiSelectionKeyword_0_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4605:1: ( 'MultiSelection' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4606:1: 'MultiSelection'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getTypeMultiSelectionKeyword_0_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__MultiSelectionDefinition__TypeAssignment_09390); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4621:1: rule__MultiSelectionDefinition__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MultiSelectionDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4625:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4626:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4626:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4627:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MultiSelectionDefinition__NameAssignment_29429); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4636:1: rule__MultiSelectionDefinition__InputTypeAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__MultiSelectionDefinition__InputTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4640:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4641:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4641:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4642:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getInputTypeSTRINGTerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MultiSelectionDefinition__InputTypeAssignment_3_19460); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4651:1: rule__MultiSelectionDefinition__SelectableValuesLocationAssignment_3_2_1 : ( RULE_STRING ) ;
    public final void rule__MultiSelectionDefinition__SelectableValuesLocationAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4655:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4656:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4656:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4657:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getSelectableValuesLocationSTRINGTerminalRuleCall_3_2_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MultiSelectionDefinition__SelectableValuesLocationAssignment_3_2_19491); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4666:1: rule__MultiSelectionDefinition__SelectedValuesLocationAssignment_3_2_2_1 : ( RULE_STRING ) ;
    public final void rule__MultiSelectionDefinition__SelectedValuesLocationAssignment_3_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4670:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4671:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4671:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4672:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiSelectionDefinitionAccess().getSelectedValuesLocationSTRINGTerminalRuleCall_3_2_2_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MultiSelectionDefinition__SelectedValuesLocationAssignment_3_2_2_19522); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4681:1: rule__CheckboxDefinition__TypeAssignment_0 : ( ( 'Checkbox' ) ) ;
    public final void rule__CheckboxDefinition__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4685:1: ( ( ( 'Checkbox' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4686:1: ( ( 'Checkbox' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4686:1: ( ( 'Checkbox' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4687:1: ( 'Checkbox' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckboxDefinitionAccess().getTypeCheckboxKeyword_0_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4688:1: ( 'Checkbox' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4689:1: 'Checkbox'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckboxDefinitionAccess().getTypeCheckboxKeyword_0_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__CheckboxDefinition__TypeAssignment_09558); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4704:1: rule__CheckboxDefinition__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__CheckboxDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4708:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4709:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4709:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4710:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckboxDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CheckboxDefinition__NameAssignment_29597); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4719:1: rule__CheckboxDefinition__TextAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__CheckboxDefinition__TextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4723:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4724:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4724:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4725:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckboxDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CheckboxDefinition__TextAssignment_4_19628); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4734:1: rule__RadioboxDefinition__TypeAssignment_0 : ( ( 'Radiobox' ) ) ;
    public final void rule__RadioboxDefinition__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4738:1: ( ( ( 'Radiobox' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4739:1: ( ( 'Radiobox' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4739:1: ( ( 'Radiobox' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4740:1: ( 'Radiobox' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRadioboxDefinitionAccess().getTypeRadioboxKeyword_0_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4741:1: ( 'Radiobox' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4742:1: 'Radiobox'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRadioboxDefinitionAccess().getTypeRadioboxKeyword_0_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__RadioboxDefinition__TypeAssignment_09664); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4757:1: rule__RadioboxDefinition__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__RadioboxDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4761:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4762:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4762:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4763:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRadioboxDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RadioboxDefinition__NameAssignment_29703); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4772:1: rule__RadioboxDefinition__TextAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__RadioboxDefinition__TextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4776:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4777:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4777:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4778:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRadioboxDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RadioboxDefinition__TextAssignment_4_19734); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4787:1: rule__TableDefinition__TypeAssignment_0 : ( ( 'Table' ) ) ;
    public final void rule__TableDefinition__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4791:1: ( ( ( 'Table' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4792:1: ( ( 'Table' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4792:1: ( ( 'Table' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4793:1: ( 'Table' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableDefinitionAccess().getTypeTableKeyword_0_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4794:1: ( 'Table' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4795:1: 'Table'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableDefinitionAccess().getTypeTableKeyword_0_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__TableDefinition__TypeAssignment_09770); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4810:1: rule__TableDefinition__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TableDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4814:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4815:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4815:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4816:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TableDefinition__NameAssignment_29809); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4825:1: rule__TableDefinition__TextAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__TableDefinition__TextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4829:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4830:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4830:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4831:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TableDefinition__TextAssignment_4_19840); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4840:1: rule__TreeDefinition__TypeAssignment_0 : ( ( 'Tree' ) ) ;
    public final void rule__TreeDefinition__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4844:1: ( ( ( 'Tree' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4845:1: ( ( 'Tree' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4845:1: ( ( 'Tree' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4846:1: ( 'Tree' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTreeDefinitionAccess().getTypeTreeKeyword_0_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4847:1: ( 'Tree' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4848:1: 'Tree'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTreeDefinitionAccess().getTypeTreeKeyword_0_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__TreeDefinition__TypeAssignment_09876); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4863:1: rule__TreeDefinition__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TreeDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4867:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4868:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4868:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4869:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTreeDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TreeDefinition__NameAssignment_29915); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4878:1: rule__TreeDefinition__TextAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__TreeDefinition__TextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4882:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4883:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4883:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4884:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTreeDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TreeDefinition__TextAssignment_4_19946); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4893:1: rule__TextfieldDefinition__TypeAssignment_0 : ( ( 'Textfield' ) ) ;
    public final void rule__TextfieldDefinition__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4897:1: ( ( ( 'Textfield' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4898:1: ( ( 'Textfield' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4898:1: ( ( 'Textfield' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4899:1: ( 'Textfield' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextfieldDefinitionAccess().getTypeTextfieldKeyword_0_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4900:1: ( 'Textfield' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4901:1: 'Textfield'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextfieldDefinitionAccess().getTypeTextfieldKeyword_0_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__TextfieldDefinition__TypeAssignment_09982); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4916:1: rule__TextfieldDefinition__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TextfieldDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4920:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4921:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4921:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4922:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextfieldDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TextfieldDefinition__NameAssignment_210021); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4931:1: rule__TextfieldDefinition__TextAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__TextfieldDefinition__TextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4935:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4936:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4936:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4937:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextfieldDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TextfieldDefinition__TextAssignment_4_110052); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4946:1: rule__ButtonDefinition__TypeAssignment_0 : ( ( 'Button' ) ) ;
    public final void rule__ButtonDefinition__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4950:1: ( ( ( 'Button' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4951:1: ( ( 'Button' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4951:1: ( ( 'Button' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4952:1: ( 'Button' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonDefinitionAccess().getTypeButtonKeyword_0_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4953:1: ( 'Button' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4954:1: 'Button'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonDefinitionAccess().getTypeButtonKeyword_0_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__ButtonDefinition__TypeAssignment_010088); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4969:1: rule__ButtonDefinition__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ButtonDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4973:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4974:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4974:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4975:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ButtonDefinition__NameAssignment_210127); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4984:1: rule__ButtonDefinition__TextAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__ButtonDefinition__TextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4988:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4989:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4989:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4990:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ButtonDefinition__TextAssignment_4_110158); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4999:1: rule__ButtonDefinition__InteractionAssignment_5_1 : ( ruleInteraction ) ;
    public final void rule__ButtonDefinition__InteractionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5003:1: ( ( ruleInteraction ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5004:1: ( ruleInteraction )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5004:1: ( ruleInteraction )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5005:1: ruleInteraction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonDefinitionAccess().getInteractionInteractionParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleInteraction_in_rule__ButtonDefinition__InteractionAssignment_5_110189);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5014:1: rule__Interaction__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Interaction__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5018:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5019:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5019:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5020:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInteractionAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Interaction__NameAssignment_010220); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5029:1: rule__Interaction__ActionsAssignment_4 : ( ruleUIAction ) ;
    public final void rule__Interaction__ActionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5033:1: ( ( ruleUIAction ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5034:1: ( ruleUIAction )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5034:1: ( ruleUIAction )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5035:1: ruleUIAction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInteractionAccess().getActionsUIActionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleUIAction_in_rule__Interaction__ActionsAssignment_410251);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5044:1: rule__LabelDefinition__TypeAssignment_0 : ( ( 'Label' ) ) ;
    public final void rule__LabelDefinition__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5048:1: ( ( ( 'Label' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5049:1: ( ( 'Label' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5049:1: ( ( 'Label' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5050:1: ( 'Label' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelDefinitionAccess().getTypeLabelKeyword_0_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5051:1: ( 'Label' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5052:1: 'Label'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelDefinitionAccess().getTypeLabelKeyword_0_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__LabelDefinition__TypeAssignment_010287); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5067:1: rule__LabelDefinition__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LabelDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5071:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5072:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5072:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5073:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LabelDefinition__NameAssignment_210326); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5082:1: rule__LabelDefinition__TextAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__LabelDefinition__TextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5086:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5087:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5087:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5088:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelDefinitionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LabelDefinition__TextAssignment_4_110357); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5097:1: rule__UIAction__TypeAssignment_1 : ( ( 'UiAction' ) ) ;
    public final void rule__UIAction__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5101:1: ( ( ( 'UiAction' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5102:1: ( ( 'UiAction' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5102:1: ( ( 'UiAction' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5103:1: ( 'UiAction' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIActionAccess().getTypeUiActionKeyword_1_0()); 
            }
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5104:1: ( 'UiAction' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5105:1: 'UiAction'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIActionAccess().getTypeUiActionKeyword_1_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__UIAction__TypeAssignment_110393); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5120:1: rule__UIAction__UiElementNameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__UIAction__UiElementNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5124:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5125:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5125:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5126:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIActionAccess().getUiElementNameSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UIAction__UiElementNameAssignment_310432); if (state.failed) return ;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5135:1: rule__UIAction__PropertiesAssignment_5 : ( ruleProperty ) ;
    public final void rule__UIAction__PropertiesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5139:1: ( ( ruleProperty ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5140:1: ( ruleProperty )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5140:1: ( ruleProperty )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5141:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIActionAccess().getPropertiesPropertyParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_rule__UIAction__PropertiesAssignment_510463);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5150:1: rule__CommonProperty__NameAssignment_0 : ( ruleCommonPropertyType ) ;
    public final void rule__CommonProperty__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5154:1: ( ( ruleCommonPropertyType ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5155:1: ( ruleCommonPropertyType )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5155:1: ( ruleCommonPropertyType )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5156:1: ruleCommonPropertyType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommonPropertyAccess().getNameCommonPropertyTypeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleCommonPropertyType_in_rule__CommonProperty__NameAssignment_010494);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5165:1: rule__CommonProperty__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__CommonProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5169:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5170:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5170:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5171:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommonPropertyAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CommonProperty__ValueAssignment_210525); if (state.failed) return ;
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
        // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4252:8: ( rule__UIDescription__InputTypesAssignment_1 )
        // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4252:9: rule__UIDescription__InputTypesAssignment_1
        {
        pushFollow(FOLLOW_rule__UIDescription__InputTypesAssignment_1_in_synpred1_InternalGuiDSL8577);
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
    public static final BitSet FOLLOW_ruleUIDescriptionImport_in_entryRuleUIDescriptionImport421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIDescriptionImport428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescriptionImport__Group__0_in_ruleUIDescriptionImport454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAreaAssignment_in_entryRuleAreaAssignment481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAreaAssignment488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Alternatives_in_ruleAreaAssignment514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDefinition_in_entryRuleComponentDefinition541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentDefinition548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentDefinition__Alternatives_in_ruleComponentDefinition574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiSelectionDefinition_in_entryRuleMultiSelectionDefinition601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiSelectionDefinition608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group__0_in_ruleMultiSelectionDefinition634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckboxDefinition_in_entryRuleCheckboxDefinition661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckboxDefinition668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group__0_in_ruleCheckboxDefinition694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadioboxDefinition_in_entryRuleRadioboxDefinition721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRadioboxDefinition728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group__0_in_ruleRadioboxDefinition754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableDefinition_in_entryRuleTableDefinition781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableDefinition788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__0_in_ruleTableDefinition814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreeDefinition_in_entryRuleTreeDefinition841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTreeDefinition848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__0_in_ruleTreeDefinition874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfieldDefinition_in_entryRuleTextfieldDefinition901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextfieldDefinition908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__0_in_ruleTextfieldDefinition934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonDefinition_in_entryRuleButtonDefinition961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonDefinition968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__0_in_ruleButtonDefinition994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteraction_in_entryRuleInteraction1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteraction1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interaction__Group__0_in_ruleInteraction1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelDefinition_in_entryRuleLabelDefinition1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelDefinition1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__0_in_ruleLabelDefinition1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIAction_in_entryRuleUIAction1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIAction1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIAction__Group__0_in_ruleUIAction1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperty_in_ruleProperty1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperty_in_entryRuleCommonProperty1260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonProperty1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperty__Group__0_in_ruleCommonProperty1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonPropertyType_in_entryRuleCommonPropertyType1320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonPropertyType1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleCommonPropertyType1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractiontype_in_entryRuleInteractiontype1382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractiontype1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleInteractiontype1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_0__0_in_rule__AreaAssignment__Alternatives1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_1__0_in_rule__AreaAssignment__Alternatives1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelDefinition_in_rule__ComponentDefinition__Alternatives1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonDefinition_in_rule__ComponentDefinition__Alternatives1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfieldDefinition_in_rule__ComponentDefinition__Alternatives1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreeDefinition_in_rule__ComponentDefinition__Alternatives1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableDefinition_in_rule__ComponentDefinition__Alternatives1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadioboxDefinition_in_rule__ComponentDefinition__Alternatives1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckboxDefinition_in_rule__ComponentDefinition__Alternatives1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiSelectionDefinition_in_rule__ComponentDefinition__Alternatives1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group_0__0__Impl_in_rule__UIDescription__Group_0__01653 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__UIDescription__Group_0__1_in_rule__UIDescription__Group_0__01656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__AreaCountAssignment_0_0_in_rule__UIDescription__Group_0__0__Impl1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group_0__1__Impl_in_rule__UIDescription__Group_0__11713 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__UIDescription__Group_0__2_in_rule__UIDescription__Group_0__11716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__TypeDefinitionAssignment_0_1_in_rule__UIDescription__Group_0__1__Impl1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group_0__2__Impl_in_rule__UIDescription__Group_0__21773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__UsedDescriptionsAssignment_0_2_in_rule__UIDescription__Group_0__2__Impl1800 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group_2__0__Impl_in_rule__UIDescription__Group_2__01837 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__UIDescription__Group_2__1_in_rule__UIDescription__Group_2__01840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__DefinitionsAssignment_2_0_in_rule__UIDescription__Group_2__0__Impl1867 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group_2__1__Impl_in_rule__UIDescription__Group_2__11898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__AreasAssignment_2_1_in_rule__UIDescription__Group_2__1__Impl1925 = new BitSet(new long[]{0x0000000000400012L});
    public static final BitSet FOLLOW_rule__InputType__Group__0__Impl_in_rule__InputType__Group__01960 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InputType__Group__1_in_rule__InputType__Group__01963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__InputType__Group__0__Impl1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputType__Group__1__Impl_in_rule__InputType__Group__12022 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__InputType__Group__2_in_rule__InputType__Group__12025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputType__TypeAssignment_1_in_rule__InputType__Group__1__Impl2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputType__Group__2__Impl_in_rule__InputType__Group__22082 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InputType__Group__3_in_rule__InputType__Group__22085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__InputType__Group__2__Impl2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputType__Group__3__Impl_in_rule__InputType__Group__32144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputType__NameAssignment_3_in_rule__InputType__Group__3__Impl2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group__0__Impl_in_rule__UsedDescriptions__Group__02209 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group__1_in_rule__UsedDescriptions__Group__02212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__UsedDescriptions__Group__0__Impl2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__Group__1__Impl_in_rule__UsedDescriptions__Group__12271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescriptions__DescriptionAssignment_1_in_rule__UsedDescriptions__Group__1__Impl2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaCount__Group__0__Impl_in_rule__AreaCount__Group__02332 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AreaCount__Group__1_in_rule__AreaCount__Group__02335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__AreaCount__Group__0__Impl2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaCount__Group__1__Impl_in_rule__AreaCount__Group__12394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaCount__AreaCountAssignment_1_in_rule__AreaCount__Group__1__Impl2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__02455 = new BitSet(new long[]{0x000007F800000000L});
    public static final BitSet FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__02458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Definition__Group__0__Impl2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__12517 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__12520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__ConcreteDefitionAssignment_1_in_rule__Definition__Group__1__Impl2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__22577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Definition__Group__2__Impl2605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__0__Impl_in_rule__TypeDefinition__Group__02642 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__1_in_rule__TypeDefinition__Group__02645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__TypeDefinition__Group__0__Impl2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__1__Impl_in_rule__TypeDefinition__Group__12704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__TypeAssignment_1_in_rule__TypeDefinition__Group__1__Impl2731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescriptionImport__Group__0__Impl_in_rule__UIDescriptionImport__Group__02765 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__UIDescriptionImport__Group__1_in_rule__UIDescriptionImport__Group__02768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescriptionImport__DescriptionNameAssignment_0_in_rule__UIDescriptionImport__Group__0__Impl2795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescriptionImport__Group__1__Impl_in_rule__UIDescriptionImport__Group__12825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescriptionImport__Group_1__0_in_rule__UIDescriptionImport__Group__1__Impl2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescriptionImport__Group_1__0__Impl_in_rule__UIDescriptionImport__Group_1__02887 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UIDescriptionImport__Group_1__1_in_rule__UIDescriptionImport__Group_1__02890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__UIDescriptionImport__Group_1__0__Impl2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescriptionImport__Group_1__1__Impl_in_rule__UIDescriptionImport__Group_1__12949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescriptionImport__LocalNameAssignment_1_1_in_rule__UIDescriptionImport__Group_1__1__Impl2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_0__0__Impl_in_rule__AreaAssignment__Group_0__03010 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_0__1_in_rule__AreaAssignment__Group_0__03013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__AreaAssignment__Group_0__0__Impl3041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_0__1__Impl_in_rule__AreaAssignment__Group_0__13072 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_0__2_in_rule__AreaAssignment__Group_0__13075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__AreaAssignment_0_1_in_rule__AreaAssignment__Group_0__1__Impl3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_0__2__Impl_in_rule__AreaAssignment__Group_0__23132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_0__3_in_rule__AreaAssignment__Group_0__23135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__AreaAssignment__Group_0__2__Impl3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_0__3__Impl_in_rule__AreaAssignment__Group_0__33194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__ElementAssignment_0_3_in_rule__AreaAssignment__Group_0__3__Impl3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_1__0__Impl_in_rule__AreaAssignment__Group_1__03259 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_1__1_in_rule__AreaAssignment__Group_1__03262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__ElementAssignment_1_0_in_rule__AreaAssignment__Group_1__0__Impl3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_1__1__Impl_in_rule__AreaAssignment__Group_1__13319 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_1__2_in_rule__AreaAssignment__Group_1__13322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__AreaAssignment__Group_1__1__Impl3350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_1__2__Impl_in_rule__AreaAssignment__Group_1__23381 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_1__3_in_rule__AreaAssignment__Group_1__23384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__AreaAssignment__Group_1__2__Impl3412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__Group_1__3__Impl_in_rule__AreaAssignment__Group_1__33443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AreaAssignment__AreaAssignment_1_3_in_rule__AreaAssignment__Group_1__3__Impl3470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group__0__Impl_in_rule__MultiSelectionDefinition__Group__03508 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group__1_in_rule__MultiSelectionDefinition__Group__03511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__TypeAssignment_0_in_rule__MultiSelectionDefinition__Group__0__Impl3538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group__1__Impl_in_rule__MultiSelectionDefinition__Group__13568 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group__2_in_rule__MultiSelectionDefinition__Group__13571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__MultiSelectionDefinition__Group__1__Impl3599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group__2__Impl_in_rule__MultiSelectionDefinition__Group__23630 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group__3_in_rule__MultiSelectionDefinition__Group__23633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__NameAssignment_2_in_rule__MultiSelectionDefinition__Group__2__Impl3660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group__3__Impl_in_rule__MultiSelectionDefinition__Group__33690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group_3__0_in_rule__MultiSelectionDefinition__Group__3__Impl3717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group_3__0__Impl_in_rule__MultiSelectionDefinition__Group_3__03756 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group_3__1_in_rule__MultiSelectionDefinition__Group_3__03759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MultiSelectionDefinition__Group_3__0__Impl3787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group_3__1__Impl_in_rule__MultiSelectionDefinition__Group_3__13818 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group_3__2_in_rule__MultiSelectionDefinition__Group_3__13821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__InputTypeAssignment_3_1_in_rule__MultiSelectionDefinition__Group_3__1__Impl3848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group_3__2__Impl_in_rule__MultiSelectionDefinition__Group_3__23878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group_3_2__0_in_rule__MultiSelectionDefinition__Group_3__2__Impl3905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group_3_2__0__Impl_in_rule__MultiSelectionDefinition__Group_3_2__03942 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group_3_2__1_in_rule__MultiSelectionDefinition__Group_3_2__03945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MultiSelectionDefinition__Group_3_2__0__Impl3973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group_3_2__1__Impl_in_rule__MultiSelectionDefinition__Group_3_2__14004 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group_3_2__2_in_rule__MultiSelectionDefinition__Group_3_2__14007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__SelectableValuesLocationAssignment_3_2_1_in_rule__MultiSelectionDefinition__Group_3_2__1__Impl4034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group_3_2__2__Impl_in_rule__MultiSelectionDefinition__Group_3_2__24064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group_3_2_2__0_in_rule__MultiSelectionDefinition__Group_3_2__2__Impl4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group_3_2_2__0__Impl_in_rule__MultiSelectionDefinition__Group_3_2_2__04128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group_3_2_2__1_in_rule__MultiSelectionDefinition__Group_3_2_2__04131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MultiSelectionDefinition__Group_3_2_2__0__Impl4159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__Group_3_2_2__1__Impl_in_rule__MultiSelectionDefinition__Group_3_2_2__14190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiSelectionDefinition__SelectedValuesLocationAssignment_3_2_2_1_in_rule__MultiSelectionDefinition__Group_3_2_2__1__Impl4217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group__0__Impl_in_rule__CheckboxDefinition__Group__04251 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group__1_in_rule__CheckboxDefinition__Group__04254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__TypeAssignment_0_in_rule__CheckboxDefinition__Group__0__Impl4281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group__1__Impl_in_rule__CheckboxDefinition__Group__14311 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group__2_in_rule__CheckboxDefinition__Group__14314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CheckboxDefinition__Group__1__Impl4342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group__2__Impl_in_rule__CheckboxDefinition__Group__24373 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group__3_in_rule__CheckboxDefinition__Group__24376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__NameAssignment_2_in_rule__CheckboxDefinition__Group__2__Impl4403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group__3__Impl_in_rule__CheckboxDefinition__Group__34433 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group__4_in_rule__CheckboxDefinition__Group__34436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CheckboxDefinition__Group__3__Impl4464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group__4__Impl_in_rule__CheckboxDefinition__Group__44495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group_4__0_in_rule__CheckboxDefinition__Group__4__Impl4522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group_4__0__Impl_in_rule__CheckboxDefinition__Group_4__04563 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group_4__1_in_rule__CheckboxDefinition__Group_4__04566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CheckboxDefinition__Group_4__0__Impl4594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__Group_4__1__Impl_in_rule__CheckboxDefinition__Group_4__14625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckboxDefinition__TextAssignment_4_1_in_rule__CheckboxDefinition__Group_4__1__Impl4652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group__0__Impl_in_rule__RadioboxDefinition__Group__04686 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group__1_in_rule__RadioboxDefinition__Group__04689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__TypeAssignment_0_in_rule__RadioboxDefinition__Group__0__Impl4716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group__1__Impl_in_rule__RadioboxDefinition__Group__14746 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group__2_in_rule__RadioboxDefinition__Group__14749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RadioboxDefinition__Group__1__Impl4777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group__2__Impl_in_rule__RadioboxDefinition__Group__24808 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group__3_in_rule__RadioboxDefinition__Group__24811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__NameAssignment_2_in_rule__RadioboxDefinition__Group__2__Impl4838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group__3__Impl_in_rule__RadioboxDefinition__Group__34868 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group__4_in_rule__RadioboxDefinition__Group__34871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__RadioboxDefinition__Group__3__Impl4899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group__4__Impl_in_rule__RadioboxDefinition__Group__44930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group_4__0_in_rule__RadioboxDefinition__Group__4__Impl4957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group_4__0__Impl_in_rule__RadioboxDefinition__Group_4__04998 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group_4__1_in_rule__RadioboxDefinition__Group_4__05001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__RadioboxDefinition__Group_4__0__Impl5029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__Group_4__1__Impl_in_rule__RadioboxDefinition__Group_4__15060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioboxDefinition__TextAssignment_4_1_in_rule__RadioboxDefinition__Group_4__1__Impl5087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__0__Impl_in_rule__TableDefinition__Group__05121 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__1_in_rule__TableDefinition__Group__05124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__TypeAssignment_0_in_rule__TableDefinition__Group__0__Impl5151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__1__Impl_in_rule__TableDefinition__Group__15181 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__2_in_rule__TableDefinition__Group__15184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__TableDefinition__Group__1__Impl5212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__2__Impl_in_rule__TableDefinition__Group__25243 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__3_in_rule__TableDefinition__Group__25246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__NameAssignment_2_in_rule__TableDefinition__Group__2__Impl5273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__3__Impl_in_rule__TableDefinition__Group__35303 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__4_in_rule__TableDefinition__Group__35306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TableDefinition__Group__3__Impl5334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__4__Impl_in_rule__TableDefinition__Group__45365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group_4__0_in_rule__TableDefinition__Group__4__Impl5392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group_4__0__Impl_in_rule__TableDefinition__Group_4__05433 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group_4__1_in_rule__TableDefinition__Group_4__05436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TableDefinition__Group_4__0__Impl5464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group_4__1__Impl_in_rule__TableDefinition__Group_4__15495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__TextAssignment_4_1_in_rule__TableDefinition__Group_4__1__Impl5522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__0__Impl_in_rule__TreeDefinition__Group__05556 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__1_in_rule__TreeDefinition__Group__05559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__TypeAssignment_0_in_rule__TreeDefinition__Group__0__Impl5586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__1__Impl_in_rule__TreeDefinition__Group__15616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__2_in_rule__TreeDefinition__Group__15619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__TreeDefinition__Group__1__Impl5647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__2__Impl_in_rule__TreeDefinition__Group__25678 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__3_in_rule__TreeDefinition__Group__25681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__NameAssignment_2_in_rule__TreeDefinition__Group__2__Impl5708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__3__Impl_in_rule__TreeDefinition__Group__35738 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__4_in_rule__TreeDefinition__Group__35741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TreeDefinition__Group__3__Impl5769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__4__Impl_in_rule__TreeDefinition__Group__45800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group_4__0_in_rule__TreeDefinition__Group__4__Impl5827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group_4__0__Impl_in_rule__TreeDefinition__Group_4__05868 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group_4__1_in_rule__TreeDefinition__Group_4__05871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TreeDefinition__Group_4__0__Impl5899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group_4__1__Impl_in_rule__TreeDefinition__Group_4__15930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__TextAssignment_4_1_in_rule__TreeDefinition__Group_4__1__Impl5957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__0__Impl_in_rule__TextfieldDefinition__Group__05991 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__1_in_rule__TextfieldDefinition__Group__05994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__TypeAssignment_0_in_rule__TextfieldDefinition__Group__0__Impl6021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__1__Impl_in_rule__TextfieldDefinition__Group__16051 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__2_in_rule__TextfieldDefinition__Group__16054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__TextfieldDefinition__Group__1__Impl6082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__2__Impl_in_rule__TextfieldDefinition__Group__26113 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__3_in_rule__TextfieldDefinition__Group__26116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__NameAssignment_2_in_rule__TextfieldDefinition__Group__2__Impl6143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__3__Impl_in_rule__TextfieldDefinition__Group__36173 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__4_in_rule__TextfieldDefinition__Group__36176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TextfieldDefinition__Group__3__Impl6204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__4__Impl_in_rule__TextfieldDefinition__Group__46235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group_4__0_in_rule__TextfieldDefinition__Group__4__Impl6262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group_4__0__Impl_in_rule__TextfieldDefinition__Group_4__06303 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group_4__1_in_rule__TextfieldDefinition__Group_4__06306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TextfieldDefinition__Group_4__0__Impl6334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group_4__1__Impl_in_rule__TextfieldDefinition__Group_4__16365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__TextAssignment_4_1_in_rule__TextfieldDefinition__Group_4__1__Impl6392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__0__Impl_in_rule__ButtonDefinition__Group__06426 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__1_in_rule__ButtonDefinition__Group__06429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__TypeAssignment_0_in_rule__ButtonDefinition__Group__0__Impl6456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__1__Impl_in_rule__ButtonDefinition__Group__16486 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__2_in_rule__ButtonDefinition__Group__16489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ButtonDefinition__Group__1__Impl6517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__2__Impl_in_rule__ButtonDefinition__Group__26548 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__3_in_rule__ButtonDefinition__Group__26551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__NameAssignment_2_in_rule__ButtonDefinition__Group__2__Impl6578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__3__Impl_in_rule__ButtonDefinition__Group__36608 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__4_in_rule__ButtonDefinition__Group__36611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ButtonDefinition__Group__3__Impl6639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__4__Impl_in_rule__ButtonDefinition__Group__46670 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__5_in_rule__ButtonDefinition__Group__46673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group_4__0_in_rule__ButtonDefinition__Group__4__Impl6700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__5__Impl_in_rule__ButtonDefinition__Group__56731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group_5__0_in_rule__ButtonDefinition__Group__5__Impl6758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group_4__0__Impl_in_rule__ButtonDefinition__Group_4__06801 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group_4__1_in_rule__ButtonDefinition__Group_4__06804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ButtonDefinition__Group_4__0__Impl6832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group_4__1__Impl_in_rule__ButtonDefinition__Group_4__16863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__TextAssignment_4_1_in_rule__ButtonDefinition__Group_4__1__Impl6890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group_5__0__Impl_in_rule__ButtonDefinition__Group_5__06924 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group_5__1_in_rule__ButtonDefinition__Group_5__06927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ButtonDefinition__Group_5__0__Impl6955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group_5__1__Impl_in_rule__ButtonDefinition__Group_5__16986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__InteractionAssignment_5_1_in_rule__ButtonDefinition__Group_5__1__Impl7013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interaction__Group__0__Impl_in_rule__Interaction__Group__07047 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Interaction__Group__1_in_rule__Interaction__Group__07050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interaction__NameAssignment_0_in_rule__Interaction__Group__0__Impl7077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interaction__Group__1__Impl_in_rule__Interaction__Group__17107 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Interaction__Group__2_in_rule__Interaction__Group__17110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Interaction__Group__1__Impl7138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interaction__Group__2__Impl_in_rule__Interaction__Group__27169 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Interaction__Group__3_in_rule__Interaction__Group__27172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractiontype_in_rule__Interaction__Group__2__Impl7199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interaction__Group__3__Impl_in_rule__Interaction__Group__37228 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Interaction__Group__4_in_rule__Interaction__Group__37231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Interaction__Group__3__Impl7259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interaction__Group__4__Impl_in_rule__Interaction__Group__47290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interaction__ActionsAssignment_4_in_rule__Interaction__Group__4__Impl7317 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__0__Impl_in_rule__LabelDefinition__Group__07358 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__1_in_rule__LabelDefinition__Group__07361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__TypeAssignment_0_in_rule__LabelDefinition__Group__0__Impl7388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__1__Impl_in_rule__LabelDefinition__Group__17418 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__2_in_rule__LabelDefinition__Group__17421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__LabelDefinition__Group__1__Impl7449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__2__Impl_in_rule__LabelDefinition__Group__27480 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__3_in_rule__LabelDefinition__Group__27483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__NameAssignment_2_in_rule__LabelDefinition__Group__2__Impl7510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__3__Impl_in_rule__LabelDefinition__Group__37540 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__4_in_rule__LabelDefinition__Group__37543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__LabelDefinition__Group__3__Impl7571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__4__Impl_in_rule__LabelDefinition__Group__47602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group_4__0_in_rule__LabelDefinition__Group__4__Impl7629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group_4__0__Impl_in_rule__LabelDefinition__Group_4__07670 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group_4__1_in_rule__LabelDefinition__Group_4__07673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__LabelDefinition__Group_4__0__Impl7701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group_4__1__Impl_in_rule__LabelDefinition__Group_4__17732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__TextAssignment_4_1_in_rule__LabelDefinition__Group_4__1__Impl7759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIAction__Group__0__Impl_in_rule__UIAction__Group__07793 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__UIAction__Group__1_in_rule__UIAction__Group__07796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__UIAction__Group__0__Impl7824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIAction__Group__1__Impl_in_rule__UIAction__Group__17855 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__UIAction__Group__2_in_rule__UIAction__Group__17858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIAction__TypeAssignment_1_in_rule__UIAction__Group__1__Impl7885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIAction__Group__2__Impl_in_rule__UIAction__Group__27915 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UIAction__Group__3_in_rule__UIAction__Group__27918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__UIAction__Group__2__Impl7946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIAction__Group__3__Impl_in_rule__UIAction__Group__37977 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__UIAction__Group__4_in_rule__UIAction__Group__37980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIAction__UiElementNameAssignment_3_in_rule__UIAction__Group__3__Impl8007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIAction__Group__4__Impl_in_rule__UIAction__Group__48037 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__UIAction__Group__5_in_rule__UIAction__Group__48040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__UIAction__Group__4__Impl8068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIAction__Group__5__Impl_in_rule__UIAction__Group__58099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIAction__PropertiesAssignment_5_in_rule__UIAction__Group__5__Impl8126 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__CommonProperty__Group__0__Impl_in_rule__CommonProperty__Group__08169 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__CommonProperty__Group__1_in_rule__CommonProperty__Group__08172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperty__NameAssignment_0_in_rule__CommonProperty__Group__0__Impl8199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperty__Group__1__Impl_in_rule__CommonProperty__Group__18229 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CommonProperty__Group__2_in_rule__CommonProperty__Group__18232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__CommonProperty__Group__1__Impl8260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperty__Group__2__Impl_in_rule__CommonProperty__Group__28291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperty__ValueAssignment_2_in_rule__CommonProperty__Group__2__Impl8318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__UnorderedGroup__0_in_rule__UIDescription__UnorderedGroup8355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group_0__0_in_rule__UIDescription__UnorderedGroup__Impl8444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__InputTypesAssignment_1_in_rule__UIDescription__UnorderedGroup__Impl8536 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__UIDescription__InputTypesAssignment_1_in_rule__UIDescription__UnorderedGroup__Impl8580 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group_2__0_in_rule__UIDescription__UnorderedGroup__Impl8678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__UnorderedGroup__Impl_in_rule__UIDescription__UnorderedGroup__08737 = new BitSet(new long[]{0x0000000000064002L});
    public static final BitSet FOLLOW_rule__UIDescription__UnorderedGroup__1_in_rule__UIDescription__UnorderedGroup__08740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__UnorderedGroup__Impl_in_rule__UIDescription__UnorderedGroup__18765 = new BitSet(new long[]{0x0000000000064002L});
    public static final BitSet FOLLOW_rule__UIDescription__UnorderedGroup__2_in_rule__UIDescription__UnorderedGroup__18768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__UnorderedGroup__Impl_in_rule__UIDescription__UnorderedGroup__28793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAreaCount_in_rule__UIDescription__AreaCountAssignment_0_08827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_rule__UIDescription__TypeDefinitionAssignment_0_18858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsedDescriptions_in_rule__UIDescription__UsedDescriptionsAssignment_0_28889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinputType_in_rule__UIDescription__InputTypesAssignment_18920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_rule__UIDescription__DefinitionsAssignment_2_08951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAreaAssignment_in_rule__UIDescription__AreasAssignment_2_18982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__InputType__TypeAssignment_19013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__InputType__NameAssignment_39044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIDescriptionImport_in_rule__UsedDescriptions__DescriptionAssignment_19075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AreaCount__AreaCountAssignment_19106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDefinition_in_rule__Definition__ConcreteDefitionAssignment_19137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TYPE_in_rule__TypeDefinition__TypeAssignment_19168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__UIDescriptionImport__DescriptionNameAssignment_09199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__UIDescriptionImport__LocalNameAssignment_1_19230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AreaAssignment__AreaAssignment_0_19261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AreaAssignment__ElementAssignment_0_39292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AreaAssignment__ElementAssignment_1_09323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AreaAssignment__AreaAssignment_1_39354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__MultiSelectionDefinition__TypeAssignment_09390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MultiSelectionDefinition__NameAssignment_29429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MultiSelectionDefinition__InputTypeAssignment_3_19460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MultiSelectionDefinition__SelectableValuesLocationAssignment_3_2_19491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MultiSelectionDefinition__SelectedValuesLocationAssignment_3_2_2_19522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__CheckboxDefinition__TypeAssignment_09558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CheckboxDefinition__NameAssignment_29597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CheckboxDefinition__TextAssignment_4_19628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__RadioboxDefinition__TypeAssignment_09664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RadioboxDefinition__NameAssignment_29703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RadioboxDefinition__TextAssignment_4_19734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__TableDefinition__TypeAssignment_09770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TableDefinition__NameAssignment_29809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TableDefinition__TextAssignment_4_19840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__TreeDefinition__TypeAssignment_09876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TreeDefinition__NameAssignment_29915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TreeDefinition__TextAssignment_4_19946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__TextfieldDefinition__TypeAssignment_09982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TextfieldDefinition__NameAssignment_210021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TextfieldDefinition__TextAssignment_4_110052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ButtonDefinition__TypeAssignment_010088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ButtonDefinition__NameAssignment_210127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ButtonDefinition__TextAssignment_4_110158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteraction_in_rule__ButtonDefinition__InteractionAssignment_5_110189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Interaction__NameAssignment_010220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIAction_in_rule__Interaction__ActionsAssignment_410251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__LabelDefinition__TypeAssignment_010287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__LabelDefinition__NameAssignment_210326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__LabelDefinition__TextAssignment_4_110357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__UIAction__TypeAssignment_110393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__UIAction__UiElementNameAssignment_310432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__UIAction__PropertiesAssignment_510463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonPropertyType_in_rule__CommonProperty__NameAssignment_010494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CommonProperty__ValueAssignment_210525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__InputTypesAssignment_1_in_synpred1_InternalGuiDSL8577 = new BitSet(new long[]{0x0000000000000002L});

}
