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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INPUT_DESCRIPTION", "RULE_TABNAME", "RULE_BOOLEAN", "RULE_WS", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'WINDOW'", "'INNERCOMPLEX'", "'IfActivator'", "'IfTextDisplay'", "'IfViewImage'", "'type: '", "';'", "'get properties from:'", "'get layout from:'", "'use:'", "'as:'", "':'", "'change:'", "'text='", "'editable='", "'->'", "'propertyKey'", "'='", "'layoutKey'", "'interactiontype'", "'Structure'", "'Table'", "'TabView'", "'Tree'", "'Interchangeable'", "'Textarea'", "'Textfield'", "'Button'", "'Label'", "'Multiselection'"
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


    // $ANTLR start "entryRuleTypeDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:88:1: entryRuleTypeDefinition : ruleTypeDefinition EOF ;
    public final void entryRuleTypeDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:89:1: ( ruleTypeDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:90:1: ruleTypeDefinition EOF
            {
             before(grammarAccess.getTypeDefinitionRule()); 
            pushFollow(FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition121);
            ruleTypeDefinition();

            state._fsp--;

             after(grammarAccess.getTypeDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinition128); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:97:1: ruleTypeDefinition : ( ( rule__TypeDefinition__Group__0 ) ) ;
    public final void ruleTypeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:101:2: ( ( ( rule__TypeDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:102:1: ( ( rule__TypeDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:102:1: ( ( rule__TypeDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:103:1: ( rule__TypeDefinition__Group__0 )
            {
             before(grammarAccess.getTypeDefinitionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:104:1: ( rule__TypeDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:104:2: rule__TypeDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Group__0_in_ruleTypeDefinition154);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:116:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:117:1: ( ruleType EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:118:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType181);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType188); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:125:1: ruleType : ( ( rule__Type__IdAssignment ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:129:2: ( ( ( rule__Type__IdAssignment ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:130:1: ( ( rule__Type__IdAssignment ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:130:1: ( ( rule__Type__IdAssignment ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:131:1: ( rule__Type__IdAssignment )
            {
             before(grammarAccess.getTypeAccess().getIdAssignment()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:132:1: ( rule__Type__IdAssignment )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:132:2: rule__Type__IdAssignment
            {
            pushFollow(FOLLOW_rule__Type__IdAssignment_in_ruleType214);
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


    // $ANTLR start "entryRuleProperty"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:144:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:145:1: ( ruleProperty EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:146:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty241);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty248); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:153:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:157:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:158:1: ( ( rule__Property__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:158:1: ( ( rule__Property__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:159:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:160:1: ( rule__Property__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:160:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty274);
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


    // $ANTLR start "entryRuleLayout"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:172:1: entryRuleLayout : ruleLayout EOF ;
    public final void entryRuleLayout() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:173:1: ( ruleLayout EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:174:1: ruleLayout EOF
            {
             before(grammarAccess.getLayoutRule()); 
            pushFollow(FOLLOW_ruleLayout_in_entryRuleLayout301);
            ruleLayout();

            state._fsp--;

             after(grammarAccess.getLayoutRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayout308); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:181:1: ruleLayout : ( ( rule__Layout__Group__0 ) ) ;
    public final void ruleLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:185:2: ( ( ( rule__Layout__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:186:1: ( ( rule__Layout__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:186:1: ( ( rule__Layout__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:187:1: ( rule__Layout__Group__0 )
            {
             before(grammarAccess.getLayoutAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:188:1: ( rule__Layout__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:188:2: rule__Layout__Group__0
            {
            pushFollow(FOLLOW_rule__Layout__Group__0_in_ruleLayout334);
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


    // $ANTLR start "entryRuleUsedDescription"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:200:1: entryRuleUsedDescription : ruleUsedDescription EOF ;
    public final void entryRuleUsedDescription() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:201:1: ( ruleUsedDescription EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:202:1: ruleUsedDescription EOF
            {
             before(grammarAccess.getUsedDescriptionRule()); 
            pushFollow(FOLLOW_ruleUsedDescription_in_entryRuleUsedDescription361);
            ruleUsedDescription();

            state._fsp--;

             after(grammarAccess.getUsedDescriptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsedDescription368); 

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
    // $ANTLR end "entryRuleUsedDescription"


    // $ANTLR start "ruleUsedDescription"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:209:1: ruleUsedDescription : ( ( rule__UsedDescription__Group__0 ) ) ;
    public final void ruleUsedDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:213:2: ( ( ( rule__UsedDescription__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:214:1: ( ( rule__UsedDescription__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:214:1: ( ( rule__UsedDescription__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:215:1: ( rule__UsedDescription__Group__0 )
            {
             before(grammarAccess.getUsedDescriptionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:216:1: ( rule__UsedDescription__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:216:2: rule__UsedDescription__Group__0
            {
            pushFollow(FOLLOW_rule__UsedDescription__Group__0_in_ruleUsedDescription394);
            rule__UsedDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUsedDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUsedDescription"


    // $ANTLR start "entryRuleDescriptionType"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:228:1: entryRuleDescriptionType : ruleDescriptionType EOF ;
    public final void entryRuleDescriptionType() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:229:1: ( ruleDescriptionType EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:230:1: ruleDescriptionType EOF
            {
             before(grammarAccess.getDescriptionTypeRule()); 
            pushFollow(FOLLOW_ruleDescriptionType_in_entryRuleDescriptionType421);
            ruleDescriptionType();

            state._fsp--;

             after(grammarAccess.getDescriptionTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescriptionType428); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:237:1: ruleDescriptionType : ( ( rule__DescriptionType__Alternatives ) ) ;
    public final void ruleDescriptionType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:241:2: ( ( ( rule__DescriptionType__Alternatives ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:242:1: ( ( rule__DescriptionType__Alternatives ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:242:1: ( ( rule__DescriptionType__Alternatives ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:243:1: ( rule__DescriptionType__Alternatives )
            {
             before(grammarAccess.getDescriptionTypeAccess().getAlternatives()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:244:1: ( rule__DescriptionType__Alternatives )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:244:2: rule__DescriptionType__Alternatives
            {
            pushFollow(FOLLOW_rule__DescriptionType__Alternatives_in_ruleDescriptionType454);
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


    // $ANTLR start "entryRuleComplexComponent"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:256:1: entryRuleComplexComponent : ruleComplexComponent EOF ;
    public final void entryRuleComplexComponent() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:257:1: ( ruleComplexComponent EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:258:1: ruleComplexComponent EOF
            {
             before(grammarAccess.getComplexComponentRule()); 
            pushFollow(FOLLOW_ruleComplexComponent_in_entryRuleComplexComponent481);
            ruleComplexComponent();

            state._fsp--;

             after(grammarAccess.getComplexComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexComponent488); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:265:1: ruleComplexComponent : ( ruleMultiselection ) ;
    public final void ruleComplexComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:269:2: ( ( ruleMultiselection ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:270:1: ( ruleMultiselection )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:270:1: ( ruleMultiselection )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:271:1: ruleMultiselection
            {
             before(grammarAccess.getComplexComponentAccess().getMultiselectionParserRuleCall()); 
            pushFollow(FOLLOW_ruleMultiselection_in_ruleComplexComponent514);
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


    // $ANTLR start "entryRuleUIDescriptionImport"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:284:1: entryRuleUIDescriptionImport : ruleUIDescriptionImport EOF ;
    public final void entryRuleUIDescriptionImport() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:285:1: ( ruleUIDescriptionImport EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:286:1: ruleUIDescriptionImport EOF
            {
             before(grammarAccess.getUIDescriptionImportRule()); 
            pushFollow(FOLLOW_ruleUIDescriptionImport_in_entryRuleUIDescriptionImport540);
            ruleUIDescriptionImport();

            state._fsp--;

             after(grammarAccess.getUIDescriptionImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIDescriptionImport547); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:293:1: ruleUIDescriptionImport : ( ( rule__UIDescriptionImport__DescriptionNameAssignment ) ) ;
    public final void ruleUIDescriptionImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:297:2: ( ( ( rule__UIDescriptionImport__DescriptionNameAssignment ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:298:1: ( ( rule__UIDescriptionImport__DescriptionNameAssignment ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:298:1: ( ( rule__UIDescriptionImport__DescriptionNameAssignment ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:299:1: ( rule__UIDescriptionImport__DescriptionNameAssignment )
            {
             before(grammarAccess.getUIDescriptionImportAccess().getDescriptionNameAssignment()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:300:1: ( rule__UIDescriptionImport__DescriptionNameAssignment )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:300:2: rule__UIDescriptionImport__DescriptionNameAssignment
            {
            pushFollow(FOLLOW_rule__UIDescriptionImport__DescriptionNameAssignment_in_ruleUIDescriptionImport573);
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


    // $ANTLR start "entryRuleRefinement"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:312:1: entryRuleRefinement : ruleRefinement EOF ;
    public final void entryRuleRefinement() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:313:1: ( ruleRefinement EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:314:1: ruleRefinement EOF
            {
             before(grammarAccess.getRefinementRule()); 
            pushFollow(FOLLOW_ruleRefinement_in_entryRuleRefinement600);
            ruleRefinement();

            state._fsp--;

             after(grammarAccess.getRefinementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefinement607); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:321:1: ruleRefinement : ( ( rule__Refinement__Group__0 ) ) ;
    public final void ruleRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:325:2: ( ( ( rule__Refinement__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:326:1: ( ( rule__Refinement__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:326:1: ( ( rule__Refinement__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:327:1: ( rule__Refinement__Group__0 )
            {
             before(grammarAccess.getRefinementAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:328:1: ( rule__Refinement__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:328:2: rule__Refinement__Group__0
            {
            pushFollow(FOLLOW_rule__Refinement__Group__0_in_ruleRefinement633);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:340:1: entryRuleComponentRefinement : ruleComponentRefinement EOF ;
    public final void entryRuleComponentRefinement() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:341:1: ( ruleComponentRefinement EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:342:1: ruleComponentRefinement EOF
            {
             before(grammarAccess.getComponentRefinementRule()); 
            pushFollow(FOLLOW_ruleComponentRefinement_in_entryRuleComponentRefinement660);
            ruleComponentRefinement();

            state._fsp--;

             after(grammarAccess.getComponentRefinementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentRefinement667); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:349:1: ruleComponentRefinement : ( ( rule__ComponentRefinement__Alternatives ) ) ;
    public final void ruleComponentRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:353:2: ( ( ( rule__ComponentRefinement__Alternatives ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:354:1: ( ( rule__ComponentRefinement__Alternatives ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:354:1: ( ( rule__ComponentRefinement__Alternatives ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:355:1: ( rule__ComponentRefinement__Alternatives )
            {
             before(grammarAccess.getComponentRefinementAccess().getAlternatives()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:356:1: ( rule__ComponentRefinement__Alternatives )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:356:2: rule__ComponentRefinement__Alternatives
            {
            pushFollow(FOLLOW_rule__ComponentRefinement__Alternatives_in_ruleComponentRefinement693);
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


    // $ANTLR start "entryRuleDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:368:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:369:1: ( ruleDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:370:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition720);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition727); 

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
            pushFollow(FOLLOW_rule__Definition__Group__0_in_ruleDefinition753);
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


    // $ANTLR start "entryRuleComponentDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:396:1: entryRuleComponentDefinition : ruleComponentDefinition EOF ;
    public final void entryRuleComponentDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:397:1: ( ruleComponentDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:398:1: ruleComponentDefinition EOF
            {
             before(grammarAccess.getComponentDefinitionRule()); 
            pushFollow(FOLLOW_ruleComponentDefinition_in_entryRuleComponentDefinition780);
            ruleComponentDefinition();

            state._fsp--;

             after(grammarAccess.getComponentDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentDefinition787); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:405:1: ruleComponentDefinition : ( ( rule__ComponentDefinition__Alternatives ) ) ;
    public final void ruleComponentDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:409:2: ( ( ( rule__ComponentDefinition__Alternatives ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:410:1: ( ( rule__ComponentDefinition__Alternatives ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:410:1: ( ( rule__ComponentDefinition__Alternatives ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:411:1: ( rule__ComponentDefinition__Alternatives )
            {
             before(grammarAccess.getComponentDefinitionAccess().getAlternatives()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:412:1: ( rule__ComponentDefinition__Alternatives )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:412:2: rule__ComponentDefinition__Alternatives
            {
            pushFollow(FOLLOW_rule__ComponentDefinition__Alternatives_in_ruleComponentDefinition813);
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


    // $ANTLR start "entryRuleStructure"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:424:1: entryRuleStructure : ruleStructure EOF ;
    public final void entryRuleStructure() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:425:1: ( ruleStructure EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:426:1: ruleStructure EOF
            {
             before(grammarAccess.getStructureRule()); 
            pushFollow(FOLLOW_ruleStructure_in_entryRuleStructure840);
            ruleStructure();

            state._fsp--;

             after(grammarAccess.getStructureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructure847); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:433:1: ruleStructure : ( ( rule__Structure__Group__0 ) ) ;
    public final void ruleStructure() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:437:2: ( ( ( rule__Structure__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:438:1: ( ( rule__Structure__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:438:1: ( ( rule__Structure__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:439:1: ( rule__Structure__Group__0 )
            {
             before(grammarAccess.getStructureAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:440:1: ( rule__Structure__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:440:2: rule__Structure__Group__0
            {
            pushFollow(FOLLOW_rule__Structure__Group__0_in_ruleStructure873);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:452:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:453:1: ( ruleElement EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:454:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement900);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement907); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:461:1: ruleElement : ( ( rule__Element__IdAssignment ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:465:2: ( ( ( rule__Element__IdAssignment ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:466:1: ( ( rule__Element__IdAssignment ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:466:1: ( ( rule__Element__IdAssignment ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:467:1: ( rule__Element__IdAssignment )
            {
             before(grammarAccess.getElementAccess().getIdAssignment()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:468:1: ( rule__Element__IdAssignment )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:468:2: rule__Element__IdAssignment
            {
            pushFollow(FOLLOW_rule__Element__IdAssignment_in_ruleElement933);
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


    // $ANTLR start "entryRuleTableRefinement"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:480:1: entryRuleTableRefinement : ruleTableRefinement EOF ;
    public final void entryRuleTableRefinement() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:481:1: ( ruleTableRefinement EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:482:1: ruleTableRefinement EOF
            {
             before(grammarAccess.getTableRefinementRule()); 
            pushFollow(FOLLOW_ruleTableRefinement_in_entryRuleTableRefinement960);
            ruleTableRefinement();

            state._fsp--;

             after(grammarAccess.getTableRefinementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableRefinement967); 

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
    // $ANTLR end "entryRuleTableRefinement"


    // $ANTLR start "ruleTableRefinement"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:489:1: ruleTableRefinement : ( ( rule__TableRefinement__Group__0 ) ) ;
    public final void ruleTableRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:493:2: ( ( ( rule__TableRefinement__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:494:1: ( ( rule__TableRefinement__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:494:1: ( ( rule__TableRefinement__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:495:1: ( rule__TableRefinement__Group__0 )
            {
             before(grammarAccess.getTableRefinementAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:496:1: ( rule__TableRefinement__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:496:2: rule__TableRefinement__Group__0
            {
            pushFollow(FOLLOW_rule__TableRefinement__Group__0_in_ruleTableRefinement993);
            rule__TableRefinement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableRefinementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTableRefinement"


    // $ANTLR start "entryRuleTabViewRefinement"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:508:1: entryRuleTabViewRefinement : ruleTabViewRefinement EOF ;
    public final void entryRuleTabViewRefinement() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:509:1: ( ruleTabViewRefinement EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:510:1: ruleTabViewRefinement EOF
            {
             before(grammarAccess.getTabViewRefinementRule()); 
            pushFollow(FOLLOW_ruleTabViewRefinement_in_entryRuleTabViewRefinement1020);
            ruleTabViewRefinement();

            state._fsp--;

             after(grammarAccess.getTabViewRefinementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabViewRefinement1027); 

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
    // $ANTLR end "entryRuleTabViewRefinement"


    // $ANTLR start "ruleTabViewRefinement"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:517:1: ruleTabViewRefinement : ( ( rule__TabViewRefinement__Group__0 ) ) ;
    public final void ruleTabViewRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:521:2: ( ( ( rule__TabViewRefinement__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:522:1: ( ( rule__TabViewRefinement__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:522:1: ( ( rule__TabViewRefinement__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:523:1: ( rule__TabViewRefinement__Group__0 )
            {
             before(grammarAccess.getTabViewRefinementAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:524:1: ( rule__TabViewRefinement__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:524:2: rule__TabViewRefinement__Group__0
            {
            pushFollow(FOLLOW_rule__TabViewRefinement__Group__0_in_ruleTabViewRefinement1053);
            rule__TabViewRefinement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTabViewRefinementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTabViewRefinement"


    // $ANTLR start "entryRuleTreeRefinement"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:536:1: entryRuleTreeRefinement : ruleTreeRefinement EOF ;
    public final void entryRuleTreeRefinement() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:537:1: ( ruleTreeRefinement EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:538:1: ruleTreeRefinement EOF
            {
             before(grammarAccess.getTreeRefinementRule()); 
            pushFollow(FOLLOW_ruleTreeRefinement_in_entryRuleTreeRefinement1080);
            ruleTreeRefinement();

            state._fsp--;

             after(grammarAccess.getTreeRefinementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTreeRefinement1087); 

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
    // $ANTLR end "entryRuleTreeRefinement"


    // $ANTLR start "ruleTreeRefinement"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:545:1: ruleTreeRefinement : ( ( rule__TreeRefinement__Group__0 ) ) ;
    public final void ruleTreeRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:549:2: ( ( ( rule__TreeRefinement__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:550:1: ( ( rule__TreeRefinement__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:550:1: ( ( rule__TreeRefinement__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:551:1: ( rule__TreeRefinement__Group__0 )
            {
             before(grammarAccess.getTreeRefinementAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:552:1: ( rule__TreeRefinement__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:552:2: rule__TreeRefinement__Group__0
            {
            pushFollow(FOLLOW_rule__TreeRefinement__Group__0_in_ruleTreeRefinement1113);
            rule__TreeRefinement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTreeRefinementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTreeRefinement"


    // $ANTLR start "entryRuleInterchangeableRefinement"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:564:1: entryRuleInterchangeableRefinement : ruleInterchangeableRefinement EOF ;
    public final void entryRuleInterchangeableRefinement() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:565:1: ( ruleInterchangeableRefinement EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:566:1: ruleInterchangeableRefinement EOF
            {
             before(grammarAccess.getInterchangeableRefinementRule()); 
            pushFollow(FOLLOW_ruleInterchangeableRefinement_in_entryRuleInterchangeableRefinement1140);
            ruleInterchangeableRefinement();

            state._fsp--;

             after(grammarAccess.getInterchangeableRefinementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterchangeableRefinement1147); 

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
    // $ANTLR end "entryRuleInterchangeableRefinement"


    // $ANTLR start "ruleInterchangeableRefinement"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:573:1: ruleInterchangeableRefinement : ( ( rule__InterchangeableRefinement__Group__0 ) ) ;
    public final void ruleInterchangeableRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:577:2: ( ( ( rule__InterchangeableRefinement__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:578:1: ( ( rule__InterchangeableRefinement__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:578:1: ( ( rule__InterchangeableRefinement__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:579:1: ( rule__InterchangeableRefinement__Group__0 )
            {
             before(grammarAccess.getInterchangeableRefinementAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:580:1: ( rule__InterchangeableRefinement__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:580:2: rule__InterchangeableRefinement__Group__0
            {
            pushFollow(FOLLOW_rule__InterchangeableRefinement__Group__0_in_ruleInterchangeableRefinement1173);
            rule__InterchangeableRefinement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterchangeableRefinementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterchangeableRefinement"


    // $ANTLR start "entryRuleTextareaRefinement"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:592:1: entryRuleTextareaRefinement : ruleTextareaRefinement EOF ;
    public final void entryRuleTextareaRefinement() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:593:1: ( ruleTextareaRefinement EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:594:1: ruleTextareaRefinement EOF
            {
             before(grammarAccess.getTextareaRefinementRule()); 
            pushFollow(FOLLOW_ruleTextareaRefinement_in_entryRuleTextareaRefinement1200);
            ruleTextareaRefinement();

            state._fsp--;

             after(grammarAccess.getTextareaRefinementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextareaRefinement1207); 

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
    // $ANTLR end "entryRuleTextareaRefinement"


    // $ANTLR start "ruleTextareaRefinement"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:601:1: ruleTextareaRefinement : ( ( rule__TextareaRefinement__Group__0 ) ) ;
    public final void ruleTextareaRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:605:2: ( ( ( rule__TextareaRefinement__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:606:1: ( ( rule__TextareaRefinement__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:606:1: ( ( rule__TextareaRefinement__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:607:1: ( rule__TextareaRefinement__Group__0 )
            {
             before(grammarAccess.getTextareaRefinementAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:608:1: ( rule__TextareaRefinement__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:608:2: rule__TextareaRefinement__Group__0
            {
            pushFollow(FOLLOW_rule__TextareaRefinement__Group__0_in_ruleTextareaRefinement1233);
            rule__TextareaRefinement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextareaRefinementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextareaRefinement"


    // $ANTLR start "entryRuleTextfieldRefinement"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:620:1: entryRuleTextfieldRefinement : ruleTextfieldRefinement EOF ;
    public final void entryRuleTextfieldRefinement() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:621:1: ( ruleTextfieldRefinement EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:622:1: ruleTextfieldRefinement EOF
            {
             before(grammarAccess.getTextfieldRefinementRule()); 
            pushFollow(FOLLOW_ruleTextfieldRefinement_in_entryRuleTextfieldRefinement1260);
            ruleTextfieldRefinement();

            state._fsp--;

             after(grammarAccess.getTextfieldRefinementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextfieldRefinement1267); 

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
    // $ANTLR end "entryRuleTextfieldRefinement"


    // $ANTLR start "ruleTextfieldRefinement"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:629:1: ruleTextfieldRefinement : ( ( rule__TextfieldRefinement__Group__0 ) ) ;
    public final void ruleTextfieldRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:633:2: ( ( ( rule__TextfieldRefinement__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:634:1: ( ( rule__TextfieldRefinement__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:634:1: ( ( rule__TextfieldRefinement__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:635:1: ( rule__TextfieldRefinement__Group__0 )
            {
             before(grammarAccess.getTextfieldRefinementAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:636:1: ( rule__TextfieldRefinement__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:636:2: rule__TextfieldRefinement__Group__0
            {
            pushFollow(FOLLOW_rule__TextfieldRefinement__Group__0_in_ruleTextfieldRefinement1293);
            rule__TextfieldRefinement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextfieldRefinementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextfieldRefinement"


    // $ANTLR start "entryRuleButtonRefinement"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:648:1: entryRuleButtonRefinement : ruleButtonRefinement EOF ;
    public final void entryRuleButtonRefinement() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:649:1: ( ruleButtonRefinement EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:650:1: ruleButtonRefinement EOF
            {
             before(grammarAccess.getButtonRefinementRule()); 
            pushFollow(FOLLOW_ruleButtonRefinement_in_entryRuleButtonRefinement1320);
            ruleButtonRefinement();

            state._fsp--;

             after(grammarAccess.getButtonRefinementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonRefinement1327); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:657:1: ruleButtonRefinement : ( ( rule__ButtonRefinement__Group__0 ) ) ;
    public final void ruleButtonRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:661:2: ( ( ( rule__ButtonRefinement__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:662:1: ( ( rule__ButtonRefinement__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:662:1: ( ( rule__ButtonRefinement__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:663:1: ( rule__ButtonRefinement__Group__0 )
            {
             before(grammarAccess.getButtonRefinementAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:664:1: ( rule__ButtonRefinement__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:664:2: rule__ButtonRefinement__Group__0
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__Group__0_in_ruleButtonRefinement1353);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:676:1: entryRuleLabelRefinement : ruleLabelRefinement EOF ;
    public final void entryRuleLabelRefinement() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:677:1: ( ruleLabelRefinement EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:678:1: ruleLabelRefinement EOF
            {
             before(grammarAccess.getLabelRefinementRule()); 
            pushFollow(FOLLOW_ruleLabelRefinement_in_entryRuleLabelRefinement1380);
            ruleLabelRefinement();

            state._fsp--;

             after(grammarAccess.getLabelRefinementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelRefinement1387); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:685:1: ruleLabelRefinement : ( ( rule__LabelRefinement__Group__0 ) ) ;
    public final void ruleLabelRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:689:2: ( ( ( rule__LabelRefinement__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:690:1: ( ( rule__LabelRefinement__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:690:1: ( ( rule__LabelRefinement__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:691:1: ( rule__LabelRefinement__Group__0 )
            {
             before(grammarAccess.getLabelRefinementAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:692:1: ( rule__LabelRefinement__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:692:2: rule__LabelRefinement__Group__0
            {
            pushFollow(FOLLOW_rule__LabelRefinement__Group__0_in_ruleLabelRefinement1413);
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


    // $ANTLR start "entryRuleTabViewDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:704:1: entryRuleTabViewDefinition : ruleTabViewDefinition EOF ;
    public final void entryRuleTabViewDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:705:1: ( ruleTabViewDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:706:1: ruleTabViewDefinition EOF
            {
             before(grammarAccess.getTabViewDefinitionRule()); 
            pushFollow(FOLLOW_ruleTabViewDefinition_in_entryRuleTabViewDefinition1440);
            ruleTabViewDefinition();

            state._fsp--;

             after(grammarAccess.getTabViewDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabViewDefinition1447); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:713:1: ruleTabViewDefinition : ( ( rule__TabViewDefinition__Group__0 ) ) ;
    public final void ruleTabViewDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:717:2: ( ( ( rule__TabViewDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:718:1: ( ( rule__TabViewDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:718:1: ( ( rule__TabViewDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:719:1: ( rule__TabViewDefinition__Group__0 )
            {
             before(grammarAccess.getTabViewDefinitionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:720:1: ( rule__TabViewDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:720:2: rule__TabViewDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__TabViewDefinition__Group__0_in_ruleTabViewDefinition1473);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:732:1: entryRuleTabDefinition : ruleTabDefinition EOF ;
    public final void entryRuleTabDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:733:1: ( ruleTabDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:734:1: ruleTabDefinition EOF
            {
             before(grammarAccess.getTabDefinitionRule()); 
            pushFollow(FOLLOW_ruleTabDefinition_in_entryRuleTabDefinition1500);
            ruleTabDefinition();

            state._fsp--;

             after(grammarAccess.getTabDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabDefinition1507); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:741:1: ruleTabDefinition : ( ( rule__TabDefinition__NameAssignment ) ) ;
    public final void ruleTabDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:745:2: ( ( ( rule__TabDefinition__NameAssignment ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:746:1: ( ( rule__TabDefinition__NameAssignment ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:746:1: ( ( rule__TabDefinition__NameAssignment ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:747:1: ( rule__TabDefinition__NameAssignment )
            {
             before(grammarAccess.getTabDefinitionAccess().getNameAssignment()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:748:1: ( rule__TabDefinition__NameAssignment )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:748:2: rule__TabDefinition__NameAssignment
            {
            pushFollow(FOLLOW_rule__TabDefinition__NameAssignment_in_ruleTabDefinition1533);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:760:1: entryRuleMultiselection : ruleMultiselection EOF ;
    public final void entryRuleMultiselection() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:761:1: ( ruleMultiselection EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:762:1: ruleMultiselection EOF
            {
             before(grammarAccess.getMultiselectionRule()); 
            pushFollow(FOLLOW_ruleMultiselection_in_entryRuleMultiselection1560);
            ruleMultiselection();

            state._fsp--;

             after(grammarAccess.getMultiselectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiselection1567); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:769:1: ruleMultiselection : ( ( rule__Multiselection__Group__0 ) ) ;
    public final void ruleMultiselection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:773:2: ( ( ( rule__Multiselection__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:774:1: ( ( rule__Multiselection__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:774:1: ( ( rule__Multiselection__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:775:1: ( rule__Multiselection__Group__0 )
            {
             before(grammarAccess.getMultiselectionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:776:1: ( rule__Multiselection__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:776:2: rule__Multiselection__Group__0
            {
            pushFollow(FOLLOW_rule__Multiselection__Group__0_in_ruleMultiselection1593);
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


    // $ANTLR start "entryRuleTextfieldDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:788:1: entryRuleTextfieldDefinition : ruleTextfieldDefinition EOF ;
    public final void entryRuleTextfieldDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:789:1: ( ruleTextfieldDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:790:1: ruleTextfieldDefinition EOF
            {
             before(grammarAccess.getTextfieldDefinitionRule()); 
            pushFollow(FOLLOW_ruleTextfieldDefinition_in_entryRuleTextfieldDefinition1620);
            ruleTextfieldDefinition();

            state._fsp--;

             after(grammarAccess.getTextfieldDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextfieldDefinition1627); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:797:1: ruleTextfieldDefinition : ( ( rule__TextfieldDefinition__Group__0 ) ) ;
    public final void ruleTextfieldDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:801:2: ( ( ( rule__TextfieldDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:802:1: ( ( rule__TextfieldDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:802:1: ( ( rule__TextfieldDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:803:1: ( rule__TextfieldDefinition__Group__0 )
            {
             before(grammarAccess.getTextfieldDefinitionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:804:1: ( rule__TextfieldDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:804:2: rule__TextfieldDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__0_in_ruleTextfieldDefinition1653);
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


    // $ANTLR start "entryRuleTextareaDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:816:1: entryRuleTextareaDefinition : ruleTextareaDefinition EOF ;
    public final void entryRuleTextareaDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:817:1: ( ruleTextareaDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:818:1: ruleTextareaDefinition EOF
            {
             before(grammarAccess.getTextareaDefinitionRule()); 
            pushFollow(FOLLOW_ruleTextareaDefinition_in_entryRuleTextareaDefinition1680);
            ruleTextareaDefinition();

            state._fsp--;

             after(grammarAccess.getTextareaDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextareaDefinition1687); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:825:1: ruleTextareaDefinition : ( ( rule__TextareaDefinition__Group__0 ) ) ;
    public final void ruleTextareaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:829:2: ( ( ( rule__TextareaDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:830:1: ( ( rule__TextareaDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:830:1: ( ( rule__TextareaDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:831:1: ( rule__TextareaDefinition__Group__0 )
            {
             before(grammarAccess.getTextareaDefinitionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:832:1: ( rule__TextareaDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:832:2: rule__TextareaDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__TextareaDefinition__Group__0_in_ruleTextareaDefinition1713);
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


    // $ANTLR start "entryRuleTreeDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:844:1: entryRuleTreeDefinition : ruleTreeDefinition EOF ;
    public final void entryRuleTreeDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:845:1: ( ruleTreeDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:846:1: ruleTreeDefinition EOF
            {
             before(grammarAccess.getTreeDefinitionRule()); 
            pushFollow(FOLLOW_ruleTreeDefinition_in_entryRuleTreeDefinition1740);
            ruleTreeDefinition();

            state._fsp--;

             after(grammarAccess.getTreeDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTreeDefinition1747); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:853:1: ruleTreeDefinition : ( ( rule__TreeDefinition__Group__0 ) ) ;
    public final void ruleTreeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:857:2: ( ( ( rule__TreeDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:858:1: ( ( rule__TreeDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:858:1: ( ( rule__TreeDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:859:1: ( rule__TreeDefinition__Group__0 )
            {
             before(grammarAccess.getTreeDefinitionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:860:1: ( rule__TreeDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:860:2: rule__TreeDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group__0_in_ruleTreeDefinition1773);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:872:1: entryRuleTableDefinition : ruleTableDefinition EOF ;
    public final void entryRuleTableDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:873:1: ( ruleTableDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:874:1: ruleTableDefinition EOF
            {
             before(grammarAccess.getTableDefinitionRule()); 
            pushFollow(FOLLOW_ruleTableDefinition_in_entryRuleTableDefinition1800);
            ruleTableDefinition();

            state._fsp--;

             after(grammarAccess.getTableDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableDefinition1807); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:881:1: ruleTableDefinition : ( ( rule__TableDefinition__Group__0 ) ) ;
    public final void ruleTableDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:885:2: ( ( ( rule__TableDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:886:1: ( ( rule__TableDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:886:1: ( ( rule__TableDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:887:1: ( rule__TableDefinition__Group__0 )
            {
             before(grammarAccess.getTableDefinitionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:888:1: ( rule__TableDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:888:2: rule__TableDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group__0_in_ruleTableDefinition1833);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:900:1: entryRuleInterchangeableDefinition : ruleInterchangeableDefinition EOF ;
    public final void entryRuleInterchangeableDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:901:1: ( ruleInterchangeableDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:902:1: ruleInterchangeableDefinition EOF
            {
             before(grammarAccess.getInterchangeableDefinitionRule()); 
            pushFollow(FOLLOW_ruleInterchangeableDefinition_in_entryRuleInterchangeableDefinition1860);
            ruleInterchangeableDefinition();

            state._fsp--;

             after(grammarAccess.getInterchangeableDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterchangeableDefinition1867); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:909:1: ruleInterchangeableDefinition : ( ( rule__InterchangeableDefinition__Group__0 ) ) ;
    public final void ruleInterchangeableDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:913:2: ( ( ( rule__InterchangeableDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:914:1: ( ( rule__InterchangeableDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:914:1: ( ( rule__InterchangeableDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:915:1: ( rule__InterchangeableDefinition__Group__0 )
            {
             before(grammarAccess.getInterchangeableDefinitionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:916:1: ( rule__InterchangeableDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:916:2: rule__InterchangeableDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__InterchangeableDefinition__Group__0_in_ruleInterchangeableDefinition1893);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:928:1: entryRuleButtonDefinition : ruleButtonDefinition EOF ;
    public final void entryRuleButtonDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:929:1: ( ruleButtonDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:930:1: ruleButtonDefinition EOF
            {
             before(grammarAccess.getButtonDefinitionRule()); 
            pushFollow(FOLLOW_ruleButtonDefinition_in_entryRuleButtonDefinition1920);
            ruleButtonDefinition();

            state._fsp--;

             after(grammarAccess.getButtonDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonDefinition1927); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:937:1: ruleButtonDefinition : ( ( rule__ButtonDefinition__Group__0 ) ) ;
    public final void ruleButtonDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:941:2: ( ( ( rule__ButtonDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:942:1: ( ( rule__ButtonDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:942:1: ( ( rule__ButtonDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:943:1: ( rule__ButtonDefinition__Group__0 )
            {
             before(grammarAccess.getButtonDefinitionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:944:1: ( rule__ButtonDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:944:2: rule__ButtonDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__0_in_ruleButtonDefinition1953);
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


    // $ANTLR start "entryRuleLabelDefinition"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:956:1: entryRuleLabelDefinition : ruleLabelDefinition EOF ;
    public final void entryRuleLabelDefinition() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:957:1: ( ruleLabelDefinition EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:958:1: ruleLabelDefinition EOF
            {
             before(grammarAccess.getLabelDefinitionRule()); 
            pushFollow(FOLLOW_ruleLabelDefinition_in_entryRuleLabelDefinition1980);
            ruleLabelDefinition();

            state._fsp--;

             after(grammarAccess.getLabelDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelDefinition1987); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:965:1: ruleLabelDefinition : ( ( rule__LabelDefinition__Group__0 ) ) ;
    public final void ruleLabelDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:969:2: ( ( ( rule__LabelDefinition__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:970:1: ( ( rule__LabelDefinition__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:970:1: ( ( rule__LabelDefinition__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:971:1: ( rule__LabelDefinition__Group__0 )
            {
             before(grammarAccess.getLabelDefinitionAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:972:1: ( rule__LabelDefinition__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:972:2: rule__LabelDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__0_in_ruleLabelDefinition2013);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:984:1: entryRuleInteractiontype : ruleInteractiontype EOF ;
    public final void entryRuleInteractiontype() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:985:1: ( ruleInteractiontype EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:986:1: ruleInteractiontype EOF
            {
             before(grammarAccess.getInteractiontypeRule()); 
            pushFollow(FOLLOW_ruleInteractiontype_in_entryRuleInteractiontype2040);
            ruleInteractiontype();

            state._fsp--;

             after(grammarAccess.getInteractiontypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractiontype2047); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:993:1: ruleInteractiontype : ( ( rule__Interactiontype__IdAssignment ) ) ;
    public final void ruleInteractiontype() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:997:2: ( ( ( rule__Interactiontype__IdAssignment ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:998:1: ( ( rule__Interactiontype__IdAssignment ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:998:1: ( ( rule__Interactiontype__IdAssignment ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:999:1: ( rule__Interactiontype__IdAssignment )
            {
             before(grammarAccess.getInteractiontypeAccess().getIdAssignment()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1000:1: ( rule__Interactiontype__IdAssignment )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1000:2: rule__Interactiontype__IdAssignment
            {
            pushFollow(FOLLOW_rule__Interactiontype__IdAssignment_in_ruleInteractiontype2073);
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


    // $ANTLR start "entryRuleTextareaProperties"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1012:1: entryRuleTextareaProperties : ruleTextareaProperties EOF ;
    public final void entryRuleTextareaProperties() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1013:1: ( ruleTextareaProperties EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1014:1: ruleTextareaProperties EOF
            {
             before(grammarAccess.getTextareaPropertiesRule()); 
            pushFollow(FOLLOW_ruleTextareaProperties_in_entryRuleTextareaProperties2100);
            ruleTextareaProperties();

            state._fsp--;

             after(grammarAccess.getTextareaPropertiesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextareaProperties2107); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1021:1: ruleTextareaProperties : ( ( rule__TextareaProperties__Group__0 ) ) ;
    public final void ruleTextareaProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1025:2: ( ( ( rule__TextareaProperties__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1026:1: ( ( rule__TextareaProperties__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1026:1: ( ( rule__TextareaProperties__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1027:1: ( rule__TextareaProperties__Group__0 )
            {
             before(grammarAccess.getTextareaPropertiesAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1028:1: ( rule__TextareaProperties__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1028:2: rule__TextareaProperties__Group__0
            {
            pushFollow(FOLLOW_rule__TextareaProperties__Group__0_in_ruleTextareaProperties2133);
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


    // $ANTLR start "entryRuleTextfieldProperties"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1040:1: entryRuleTextfieldProperties : ruleTextfieldProperties EOF ;
    public final void entryRuleTextfieldProperties() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1041:1: ( ruleTextfieldProperties EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1042:1: ruleTextfieldProperties EOF
            {
             before(grammarAccess.getTextfieldPropertiesRule()); 
            pushFollow(FOLLOW_ruleTextfieldProperties_in_entryRuleTextfieldProperties2160);
            ruleTextfieldProperties();

            state._fsp--;

             after(grammarAccess.getTextfieldPropertiesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextfieldProperties2167); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1049:1: ruleTextfieldProperties : ( ( rule__TextfieldProperties__Group__0 ) ) ;
    public final void ruleTextfieldProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1053:2: ( ( ( rule__TextfieldProperties__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1054:1: ( ( rule__TextfieldProperties__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1054:1: ( ( rule__TextfieldProperties__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1055:1: ( rule__TextfieldProperties__Group__0 )
            {
             before(grammarAccess.getTextfieldPropertiesAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1056:1: ( rule__TextfieldProperties__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1056:2: rule__TextfieldProperties__Group__0
            {
            pushFollow(FOLLOW_rule__TextfieldProperties__Group__0_in_ruleTextfieldProperties2193);
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


    // $ANTLR start "entryRuleLabelProperties"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1068:1: entryRuleLabelProperties : ruleLabelProperties EOF ;
    public final void entryRuleLabelProperties() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1069:1: ( ruleLabelProperties EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1070:1: ruleLabelProperties EOF
            {
             before(grammarAccess.getLabelPropertiesRule()); 
            pushFollow(FOLLOW_ruleLabelProperties_in_entryRuleLabelProperties2220);
            ruleLabelProperties();

            state._fsp--;

             after(grammarAccess.getLabelPropertiesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelProperties2227); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1077:1: ruleLabelProperties : ( ( rule__LabelProperties__Group__0 ) ) ;
    public final void ruleLabelProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1081:2: ( ( ( rule__LabelProperties__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1082:1: ( ( rule__LabelProperties__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1082:1: ( ( rule__LabelProperties__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1083:1: ( rule__LabelProperties__Group__0 )
            {
             before(grammarAccess.getLabelPropertiesAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1084:1: ( rule__LabelProperties__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1084:2: rule__LabelProperties__Group__0
            {
            pushFollow(FOLLOW_rule__LabelProperties__Group__0_in_ruleLabelProperties2253);
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


    // $ANTLR start "entryRuleButtonProperties"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1096:1: entryRuleButtonProperties : ruleButtonProperties EOF ;
    public final void entryRuleButtonProperties() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1097:1: ( ruleButtonProperties EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1098:1: ruleButtonProperties EOF
            {
             before(grammarAccess.getButtonPropertiesRule()); 
            pushFollow(FOLLOW_ruleButtonProperties_in_entryRuleButtonProperties2280);
            ruleButtonProperties();

            state._fsp--;

             after(grammarAccess.getButtonPropertiesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonProperties2287); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1105:1: ruleButtonProperties : ( ( rule__ButtonProperties__Group__0 ) ) ;
    public final void ruleButtonProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1109:2: ( ( ( rule__ButtonProperties__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1110:1: ( ( rule__ButtonProperties__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1110:1: ( ( rule__ButtonProperties__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1111:1: ( rule__ButtonProperties__Group__0 )
            {
             before(grammarAccess.getButtonPropertiesAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1112:1: ( rule__ButtonProperties__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1112:2: rule__ButtonProperties__Group__0
            {
            pushFollow(FOLLOW_rule__ButtonProperties__Group__0_in_ruleButtonProperties2313);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1124:1: entryRuleCommonProperties : ruleCommonProperties EOF ;
    public final void entryRuleCommonProperties() throws RecognitionException {
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1125:1: ( ruleCommonProperties EOF )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1126:1: ruleCommonProperties EOF
            {
             before(grammarAccess.getCommonPropertiesRule()); 
            pushFollow(FOLLOW_ruleCommonProperties_in_entryRuleCommonProperties2340);
            ruleCommonProperties();

            state._fsp--;

             after(grammarAccess.getCommonPropertiesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonProperties2347); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1133:1: ruleCommonProperties : ( ( rule__CommonProperties__Group__0 ) ) ;
    public final void ruleCommonProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1137:2: ( ( ( rule__CommonProperties__Group__0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1138:1: ( ( rule__CommonProperties__Group__0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1138:1: ( ( rule__CommonProperties__Group__0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1139:1: ( rule__CommonProperties__Group__0 )
            {
             before(grammarAccess.getCommonPropertiesAccess().getGroup()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1140:1: ( rule__CommonProperties__Group__0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1140:2: rule__CommonProperties__Group__0
            {
            pushFollow(FOLLOW_rule__CommonProperties__Group__0_in_ruleCommonProperties2373);
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


    // $ANTLR start "rule__Type__IdAlternatives_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1152:1: rule__Type__IdAlternatives_0 : ( ( 'WINDOW' ) | ( 'INNERCOMPLEX' ) );
    public final void rule__Type__IdAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1156:1: ( ( 'WINDOW' ) | ( 'INNERCOMPLEX' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1157:1: ( 'WINDOW' )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1157:1: ( 'WINDOW' )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1158:1: 'WINDOW'
                    {
                     before(grammarAccess.getTypeAccess().getIdWINDOWKeyword_0_0()); 
                    match(input,14,FOLLOW_14_in_rule__Type__IdAlternatives_02410); 
                     after(grammarAccess.getTypeAccess().getIdWINDOWKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1165:6: ( 'INNERCOMPLEX' )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1165:6: ( 'INNERCOMPLEX' )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1166:1: 'INNERCOMPLEX'
                    {
                     before(grammarAccess.getTypeAccess().getIdINNERCOMPLEXKeyword_0_1()); 
                    match(input,15,FOLLOW_15_in_rule__Type__IdAlternatives_02430); 
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


    // $ANTLR start "rule__DescriptionType__Alternatives"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1178:1: rule__DescriptionType__Alternatives : ( ( ruleUIDescriptionImport ) | ( ruleComplexComponent ) );
    public final void rule__DescriptionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1182:1: ( ( ruleUIDescriptionImport ) | ( ruleComplexComponent ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==43) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1183:1: ( ruleUIDescriptionImport )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1183:1: ( ruleUIDescriptionImport )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1184:1: ruleUIDescriptionImport
                    {
                     before(grammarAccess.getDescriptionTypeAccess().getUIDescriptionImportParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleUIDescriptionImport_in_rule__DescriptionType__Alternatives2464);
                    ruleUIDescriptionImport();

                    state._fsp--;

                     after(grammarAccess.getDescriptionTypeAccess().getUIDescriptionImportParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1189:6: ( ruleComplexComponent )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1189:6: ( ruleComplexComponent )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1190:1: ruleComplexComponent
                    {
                     before(grammarAccess.getDescriptionTypeAccess().getComplexComponentParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleComplexComponent_in_rule__DescriptionType__Alternatives2481);
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


    // $ANTLR start "rule__ComponentRefinement__Alternatives"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1200:1: rule__ComponentRefinement__Alternatives : ( ( ruleLabelRefinement ) | ( ruleButtonRefinement ) | ( ruleTextfieldRefinement ) | ( ruleTextareaRefinement ) | ( ruleTableRefinement ) | ( ruleTabViewRefinement ) | ( ruleTreeRefinement ) | ( ruleInterchangeableRefinement ) );
    public final void rule__ComponentRefinement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1204:1: ( ( ruleLabelRefinement ) | ( ruleButtonRefinement ) | ( ruleTextfieldRefinement ) | ( ruleTextareaRefinement ) | ( ruleTableRefinement ) | ( ruleTabViewRefinement ) | ( ruleTreeRefinement ) | ( ruleInterchangeableRefinement ) )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt3=1;
                }
                break;
            case 41:
                {
                alt3=2;
                }
                break;
            case 40:
                {
                alt3=3;
                }
                break;
            case 39:
                {
                alt3=4;
                }
                break;
            case 35:
                {
                alt3=5;
                }
                break;
            case 36:
                {
                alt3=6;
                }
                break;
            case 37:
                {
                alt3=7;
                }
                break;
            case 38:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1205:1: ( ruleLabelRefinement )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1205:1: ( ruleLabelRefinement )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1206:1: ruleLabelRefinement
                    {
                     before(grammarAccess.getComponentRefinementAccess().getLabelRefinementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLabelRefinement_in_rule__ComponentRefinement__Alternatives2513);
                    ruleLabelRefinement();

                    state._fsp--;

                     after(grammarAccess.getComponentRefinementAccess().getLabelRefinementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1211:6: ( ruleButtonRefinement )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1211:6: ( ruleButtonRefinement )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1212:1: ruleButtonRefinement
                    {
                     before(grammarAccess.getComponentRefinementAccess().getButtonRefinementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleButtonRefinement_in_rule__ComponentRefinement__Alternatives2530);
                    ruleButtonRefinement();

                    state._fsp--;

                     after(grammarAccess.getComponentRefinementAccess().getButtonRefinementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1217:6: ( ruleTextfieldRefinement )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1217:6: ( ruleTextfieldRefinement )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1218:1: ruleTextfieldRefinement
                    {
                     before(grammarAccess.getComponentRefinementAccess().getTextfieldRefinementParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleTextfieldRefinement_in_rule__ComponentRefinement__Alternatives2547);
                    ruleTextfieldRefinement();

                    state._fsp--;

                     after(grammarAccess.getComponentRefinementAccess().getTextfieldRefinementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1223:6: ( ruleTextareaRefinement )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1223:6: ( ruleTextareaRefinement )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1224:1: ruleTextareaRefinement
                    {
                     before(grammarAccess.getComponentRefinementAccess().getTextareaRefinementParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleTextareaRefinement_in_rule__ComponentRefinement__Alternatives2564);
                    ruleTextareaRefinement();

                    state._fsp--;

                     after(grammarAccess.getComponentRefinementAccess().getTextareaRefinementParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1229:6: ( ruleTableRefinement )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1229:6: ( ruleTableRefinement )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1230:1: ruleTableRefinement
                    {
                     before(grammarAccess.getComponentRefinementAccess().getTableRefinementParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleTableRefinement_in_rule__ComponentRefinement__Alternatives2581);
                    ruleTableRefinement();

                    state._fsp--;

                     after(grammarAccess.getComponentRefinementAccess().getTableRefinementParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1235:6: ( ruleTabViewRefinement )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1235:6: ( ruleTabViewRefinement )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1236:1: ruleTabViewRefinement
                    {
                     before(grammarAccess.getComponentRefinementAccess().getTabViewRefinementParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleTabViewRefinement_in_rule__ComponentRefinement__Alternatives2598);
                    ruleTabViewRefinement();

                    state._fsp--;

                     after(grammarAccess.getComponentRefinementAccess().getTabViewRefinementParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1241:6: ( ruleTreeRefinement )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1241:6: ( ruleTreeRefinement )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1242:1: ruleTreeRefinement
                    {
                     before(grammarAccess.getComponentRefinementAccess().getTreeRefinementParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleTreeRefinement_in_rule__ComponentRefinement__Alternatives2615);
                    ruleTreeRefinement();

                    state._fsp--;

                     after(grammarAccess.getComponentRefinementAccess().getTreeRefinementParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1247:6: ( ruleInterchangeableRefinement )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1247:6: ( ruleInterchangeableRefinement )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1248:1: ruleInterchangeableRefinement
                    {
                     before(grammarAccess.getComponentRefinementAccess().getInterchangeableRefinementParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleInterchangeableRefinement_in_rule__ComponentRefinement__Alternatives2632);
                    ruleInterchangeableRefinement();

                    state._fsp--;

                     after(grammarAccess.getComponentRefinementAccess().getInterchangeableRefinementParserRuleCall_7()); 

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


    // $ANTLR start "rule__ComponentDefinition__Alternatives"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1258:1: rule__ComponentDefinition__Alternatives : ( ( ruleLabelDefinition ) | ( ruleButtonDefinition ) | ( ruleTextfieldDefinition ) | ( ruleTextareaDefinition ) | ( ruleTreeDefinition ) | ( ruleTableDefinition ) | ( ruleTabViewDefinition ) | ( ruleInterchangeableDefinition ) );
    public final void rule__ComponentDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1262:1: ( ( ruleLabelDefinition ) | ( ruleButtonDefinition ) | ( ruleTextfieldDefinition ) | ( ruleTextareaDefinition ) | ( ruleTreeDefinition ) | ( ruleTableDefinition ) | ( ruleTabViewDefinition ) | ( ruleInterchangeableDefinition ) )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt4=1;
                }
                break;
            case 41:
                {
                alt4=2;
                }
                break;
            case 40:
                {
                alt4=3;
                }
                break;
            case 39:
                {
                alt4=4;
                }
                break;
            case 37:
                {
                alt4=5;
                }
                break;
            case 35:
                {
                alt4=6;
                }
                break;
            case 36:
                {
                alt4=7;
                }
                break;
            case 38:
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
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1263:1: ( ruleLabelDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1263:1: ( ruleLabelDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1264:1: ruleLabelDefinition
                    {
                     before(grammarAccess.getComponentDefinitionAccess().getLabelDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLabelDefinition_in_rule__ComponentDefinition__Alternatives2664);
                    ruleLabelDefinition();

                    state._fsp--;

                     after(grammarAccess.getComponentDefinitionAccess().getLabelDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1269:6: ( ruleButtonDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1269:6: ( ruleButtonDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1270:1: ruleButtonDefinition
                    {
                     before(grammarAccess.getComponentDefinitionAccess().getButtonDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleButtonDefinition_in_rule__ComponentDefinition__Alternatives2681);
                    ruleButtonDefinition();

                    state._fsp--;

                     after(grammarAccess.getComponentDefinitionAccess().getButtonDefinitionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1275:6: ( ruleTextfieldDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1275:6: ( ruleTextfieldDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1276:1: ruleTextfieldDefinition
                    {
                     before(grammarAccess.getComponentDefinitionAccess().getTextfieldDefinitionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleTextfieldDefinition_in_rule__ComponentDefinition__Alternatives2698);
                    ruleTextfieldDefinition();

                    state._fsp--;

                     after(grammarAccess.getComponentDefinitionAccess().getTextfieldDefinitionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1281:6: ( ruleTextareaDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1281:6: ( ruleTextareaDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1282:1: ruleTextareaDefinition
                    {
                     before(grammarAccess.getComponentDefinitionAccess().getTextareaDefinitionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleTextareaDefinition_in_rule__ComponentDefinition__Alternatives2715);
                    ruleTextareaDefinition();

                    state._fsp--;

                     after(grammarAccess.getComponentDefinitionAccess().getTextareaDefinitionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1287:6: ( ruleTreeDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1287:6: ( ruleTreeDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1288:1: ruleTreeDefinition
                    {
                     before(grammarAccess.getComponentDefinitionAccess().getTreeDefinitionParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleTreeDefinition_in_rule__ComponentDefinition__Alternatives2732);
                    ruleTreeDefinition();

                    state._fsp--;

                     after(grammarAccess.getComponentDefinitionAccess().getTreeDefinitionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1293:6: ( ruleTableDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1293:6: ( ruleTableDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1294:1: ruleTableDefinition
                    {
                     before(grammarAccess.getComponentDefinitionAccess().getTableDefinitionParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleTableDefinition_in_rule__ComponentDefinition__Alternatives2749);
                    ruleTableDefinition();

                    state._fsp--;

                     after(grammarAccess.getComponentDefinitionAccess().getTableDefinitionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1299:6: ( ruleTabViewDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1299:6: ( ruleTabViewDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1300:1: ruleTabViewDefinition
                    {
                     before(grammarAccess.getComponentDefinitionAccess().getTabViewDefinitionParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleTabViewDefinition_in_rule__ComponentDefinition__Alternatives2766);
                    ruleTabViewDefinition();

                    state._fsp--;

                     after(grammarAccess.getComponentDefinitionAccess().getTabViewDefinitionParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1305:6: ( ruleInterchangeableDefinition )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1305:6: ( ruleInterchangeableDefinition )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1306:1: ruleInterchangeableDefinition
                    {
                     before(grammarAccess.getComponentDefinitionAccess().getInterchangeableDefinitionParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleInterchangeableDefinition_in_rule__ComponentDefinition__Alternatives2783);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1316:1: rule__Interactiontype__IdAlternatives_0 : ( ( 'IfActivator' ) | ( 'IfTextDisplay' ) | ( 'IfViewImage' ) );
    public final void rule__Interactiontype__IdAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1320:1: ( ( 'IfActivator' ) | ( 'IfTextDisplay' ) | ( 'IfViewImage' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1321:1: ( 'IfActivator' )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1321:1: ( 'IfActivator' )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1322:1: 'IfActivator'
                    {
                     before(grammarAccess.getInteractiontypeAccess().getIdIfActivatorKeyword_0_0()); 
                    match(input,16,FOLLOW_16_in_rule__Interactiontype__IdAlternatives_02816); 
                     after(grammarAccess.getInteractiontypeAccess().getIdIfActivatorKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1329:6: ( 'IfTextDisplay' )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1329:6: ( 'IfTextDisplay' )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1330:1: 'IfTextDisplay'
                    {
                     before(grammarAccess.getInteractiontypeAccess().getIdIfTextDisplayKeyword_0_1()); 
                    match(input,17,FOLLOW_17_in_rule__Interactiontype__IdAlternatives_02836); 
                     after(grammarAccess.getInteractiontypeAccess().getIdIfTextDisplayKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1337:6: ( 'IfViewImage' )
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1337:6: ( 'IfViewImage' )
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1338:1: 'IfViewImage'
                    {
                     before(grammarAccess.getInteractiontypeAccess().getIdIfViewImageKeyword_0_2()); 
                    match(input,18,FOLLOW_18_in_rule__Interactiontype__IdAlternatives_02856); 
                     after(grammarAccess.getInteractiontypeAccess().getIdIfViewImageKeyword_0_2()); 

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1352:1: rule__UIDescription__Group__0 : rule__UIDescription__Group__0__Impl rule__UIDescription__Group__1 ;
    public final void rule__UIDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1356:1: ( rule__UIDescription__Group__0__Impl rule__UIDescription__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1357:2: rule__UIDescription__Group__0__Impl rule__UIDescription__Group__1
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__0__Impl_in_rule__UIDescription__Group__02888);
            rule__UIDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIDescription__Group__1_in_rule__UIDescription__Group__02891);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1364:1: rule__UIDescription__Group__0__Impl : ( ( rule__UIDescription__TypeDefinitionAssignment_0 ) ) ;
    public final void rule__UIDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1368:1: ( ( ( rule__UIDescription__TypeDefinitionAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1369:1: ( ( rule__UIDescription__TypeDefinitionAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1369:1: ( ( rule__UIDescription__TypeDefinitionAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1370:1: ( rule__UIDescription__TypeDefinitionAssignment_0 )
            {
             before(grammarAccess.getUIDescriptionAccess().getTypeDefinitionAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1371:1: ( rule__UIDescription__TypeDefinitionAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1371:2: rule__UIDescription__TypeDefinitionAssignment_0
            {
            pushFollow(FOLLOW_rule__UIDescription__TypeDefinitionAssignment_0_in_rule__UIDescription__Group__0__Impl2918);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1381:1: rule__UIDescription__Group__1 : rule__UIDescription__Group__1__Impl rule__UIDescription__Group__2 ;
    public final void rule__UIDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1385:1: ( rule__UIDescription__Group__1__Impl rule__UIDescription__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1386:2: rule__UIDescription__Group__1__Impl rule__UIDescription__Group__2
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__1__Impl_in_rule__UIDescription__Group__12948);
            rule__UIDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIDescription__Group__2_in_rule__UIDescription__Group__12951);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1393:1: rule__UIDescription__Group__1__Impl : ( ( rule__UIDescription__PropertyAssignment_1 )? ) ;
    public final void rule__UIDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1397:1: ( ( ( rule__UIDescription__PropertyAssignment_1 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1398:1: ( ( rule__UIDescription__PropertyAssignment_1 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1398:1: ( ( rule__UIDescription__PropertyAssignment_1 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1399:1: ( rule__UIDescription__PropertyAssignment_1 )?
            {
             before(grammarAccess.getUIDescriptionAccess().getPropertyAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1400:1: ( rule__UIDescription__PropertyAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1400:2: rule__UIDescription__PropertyAssignment_1
                    {
                    pushFollow(FOLLOW_rule__UIDescription__PropertyAssignment_1_in_rule__UIDescription__Group__1__Impl2978);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1410:1: rule__UIDescription__Group__2 : rule__UIDescription__Group__2__Impl rule__UIDescription__Group__3 ;
    public final void rule__UIDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1414:1: ( rule__UIDescription__Group__2__Impl rule__UIDescription__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1415:2: rule__UIDescription__Group__2__Impl rule__UIDescription__Group__3
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__2__Impl_in_rule__UIDescription__Group__23009);
            rule__UIDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIDescription__Group__3_in_rule__UIDescription__Group__23012);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1422:1: rule__UIDescription__Group__2__Impl : ( ( rule__UIDescription__LayoutAssignment_2 )? ) ;
    public final void rule__UIDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1426:1: ( ( ( rule__UIDescription__LayoutAssignment_2 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1427:1: ( ( rule__UIDescription__LayoutAssignment_2 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1427:1: ( ( rule__UIDescription__LayoutAssignment_2 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1428:1: ( rule__UIDescription__LayoutAssignment_2 )?
            {
             before(grammarAccess.getUIDescriptionAccess().getLayoutAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1429:1: ( rule__UIDescription__LayoutAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1429:2: rule__UIDescription__LayoutAssignment_2
                    {
                    pushFollow(FOLLOW_rule__UIDescription__LayoutAssignment_2_in_rule__UIDescription__Group__2__Impl3039);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1439:1: rule__UIDescription__Group__3 : rule__UIDescription__Group__3__Impl rule__UIDescription__Group__4 ;
    public final void rule__UIDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1443:1: ( rule__UIDescription__Group__3__Impl rule__UIDescription__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1444:2: rule__UIDescription__Group__3__Impl rule__UIDescription__Group__4
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__3__Impl_in_rule__UIDescription__Group__33070);
            rule__UIDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIDescription__Group__4_in_rule__UIDescription__Group__33073);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1451:1: rule__UIDescription__Group__3__Impl : ( ( rule__UIDescription__UsedDescriptionsAssignment_3 )* ) ;
    public final void rule__UIDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1455:1: ( ( ( rule__UIDescription__UsedDescriptionsAssignment_3 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1456:1: ( ( rule__UIDescription__UsedDescriptionsAssignment_3 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1456:1: ( ( rule__UIDescription__UsedDescriptionsAssignment_3 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1457:1: ( rule__UIDescription__UsedDescriptionsAssignment_3 )*
            {
             before(grammarAccess.getUIDescriptionAccess().getUsedDescriptionsAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1458:1: ( rule__UIDescription__UsedDescriptionsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1458:2: rule__UIDescription__UsedDescriptionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__UIDescription__UsedDescriptionsAssignment_3_in_rule__UIDescription__Group__3__Impl3100);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1468:1: rule__UIDescription__Group__4 : rule__UIDescription__Group__4__Impl rule__UIDescription__Group__5 ;
    public final void rule__UIDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1472:1: ( rule__UIDescription__Group__4__Impl rule__UIDescription__Group__5 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1473:2: rule__UIDescription__Group__4__Impl rule__UIDescription__Group__5
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__4__Impl_in_rule__UIDescription__Group__43131);
            rule__UIDescription__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIDescription__Group__5_in_rule__UIDescription__Group__43134);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1480:1: rule__UIDescription__Group__4__Impl : ( ( rule__UIDescription__RefinementsAssignment_4 )* ) ;
    public final void rule__UIDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1484:1: ( ( ( rule__UIDescription__RefinementsAssignment_4 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1485:1: ( ( rule__UIDescription__RefinementsAssignment_4 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1485:1: ( ( rule__UIDescription__RefinementsAssignment_4 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1486:1: ( rule__UIDescription__RefinementsAssignment_4 )*
            {
             before(grammarAccess.getUIDescriptionAccess().getRefinementsAssignment_4()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1487:1: ( rule__UIDescription__RefinementsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                alt9 = dfa9.predict(input);
                switch (alt9) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1487:2: rule__UIDescription__RefinementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__UIDescription__RefinementsAssignment_4_in_rule__UIDescription__Group__4__Impl3161);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1497:1: rule__UIDescription__Group__5 : rule__UIDescription__Group__5__Impl rule__UIDescription__Group__6 ;
    public final void rule__UIDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1501:1: ( rule__UIDescription__Group__5__Impl rule__UIDescription__Group__6 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1502:2: rule__UIDescription__Group__5__Impl rule__UIDescription__Group__6
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__5__Impl_in_rule__UIDescription__Group__53192);
            rule__UIDescription__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIDescription__Group__6_in_rule__UIDescription__Group__53195);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1509:1: rule__UIDescription__Group__5__Impl : ( ( rule__UIDescription__DefinitionsAssignment_5 )* ) ;
    public final void rule__UIDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1513:1: ( ( ( rule__UIDescription__DefinitionsAssignment_5 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1514:1: ( ( rule__UIDescription__DefinitionsAssignment_5 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1514:1: ( ( rule__UIDescription__DefinitionsAssignment_5 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1515:1: ( rule__UIDescription__DefinitionsAssignment_5 )*
            {
             before(grammarAccess.getUIDescriptionAccess().getDefinitionsAssignment_5()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1516:1: ( rule__UIDescription__DefinitionsAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=35 && LA10_0<=42)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1516:2: rule__UIDescription__DefinitionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__UIDescription__DefinitionsAssignment_5_in_rule__UIDescription__Group__5__Impl3222);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1526:1: rule__UIDescription__Group__6 : rule__UIDescription__Group__6__Impl ;
    public final void rule__UIDescription__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1530:1: ( rule__UIDescription__Group__6__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1531:2: rule__UIDescription__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__6__Impl_in_rule__UIDescription__Group__63253);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1537:1: rule__UIDescription__Group__6__Impl : ( ( rule__UIDescription__StructureAssignment_6 ) ) ;
    public final void rule__UIDescription__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1541:1: ( ( ( rule__UIDescription__StructureAssignment_6 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1542:1: ( ( rule__UIDescription__StructureAssignment_6 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1542:1: ( ( rule__UIDescription__StructureAssignment_6 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1543:1: ( rule__UIDescription__StructureAssignment_6 )
            {
             before(grammarAccess.getUIDescriptionAccess().getStructureAssignment_6()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1544:1: ( rule__UIDescription__StructureAssignment_6 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1544:2: rule__UIDescription__StructureAssignment_6
            {
            pushFollow(FOLLOW_rule__UIDescription__StructureAssignment_6_in_rule__UIDescription__Group__6__Impl3280);
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


    // $ANTLR start "rule__TypeDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1568:1: rule__TypeDefinition__Group__0 : rule__TypeDefinition__Group__0__Impl rule__TypeDefinition__Group__1 ;
    public final void rule__TypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1572:1: ( rule__TypeDefinition__Group__0__Impl rule__TypeDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1573:2: rule__TypeDefinition__Group__0__Impl rule__TypeDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Group__0__Impl_in_rule__TypeDefinition__Group__03324);
            rule__TypeDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDefinition__Group__1_in_rule__TypeDefinition__Group__03327);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1580:1: rule__TypeDefinition__Group__0__Impl : ( 'type: ' ) ;
    public final void rule__TypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1584:1: ( ( 'type: ' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1585:1: ( 'type: ' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1585:1: ( 'type: ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1586:1: 'type: '
            {
             before(grammarAccess.getTypeDefinitionAccess().getTypeKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__TypeDefinition__Group__0__Impl3355); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1599:1: rule__TypeDefinition__Group__1 : rule__TypeDefinition__Group__1__Impl rule__TypeDefinition__Group__2 ;
    public final void rule__TypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1603:1: ( rule__TypeDefinition__Group__1__Impl rule__TypeDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1604:2: rule__TypeDefinition__Group__1__Impl rule__TypeDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Group__1__Impl_in_rule__TypeDefinition__Group__13386);
            rule__TypeDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDefinition__Group__2_in_rule__TypeDefinition__Group__13389);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1611:1: rule__TypeDefinition__Group__1__Impl : ( ( rule__TypeDefinition__TypeAssignment_1 ) ) ;
    public final void rule__TypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1615:1: ( ( ( rule__TypeDefinition__TypeAssignment_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1616:1: ( ( rule__TypeDefinition__TypeAssignment_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1616:1: ( ( rule__TypeDefinition__TypeAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1617:1: ( rule__TypeDefinition__TypeAssignment_1 )
            {
             before(grammarAccess.getTypeDefinitionAccess().getTypeAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1618:1: ( rule__TypeDefinition__TypeAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1618:2: rule__TypeDefinition__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__TypeDefinition__TypeAssignment_1_in_rule__TypeDefinition__Group__1__Impl3416);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1628:1: rule__TypeDefinition__Group__2 : rule__TypeDefinition__Group__2__Impl ;
    public final void rule__TypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1632:1: ( rule__TypeDefinition__Group__2__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1633:2: rule__TypeDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Group__2__Impl_in_rule__TypeDefinition__Group__23446);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1639:1: rule__TypeDefinition__Group__2__Impl : ( ';' ) ;
    public final void rule__TypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1643:1: ( ( ';' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1644:1: ( ';' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1644:1: ( ';' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1645:1: ';'
            {
             before(grammarAccess.getTypeDefinitionAccess().getSemicolonKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__TypeDefinition__Group__2__Impl3474); 
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


    // $ANTLR start "rule__Property__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1664:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1668:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1669:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__03511);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__03514);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1676:1: rule__Property__Group__0__Impl : ( 'get properties from:' ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1680:1: ( ( 'get properties from:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1681:1: ( 'get properties from:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1681:1: ( 'get properties from:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1682:1: 'get properties from:'
            {
             before(grammarAccess.getPropertyAccess().getGetPropertiesFromKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Property__Group__0__Impl3542); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1695:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1699:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1700:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__13573);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__13576);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1707:1: rule__Property__Group__1__Impl : ( ( ( rule__Property__PropertiesFilesAssignment_1 ) ) ( ( rule__Property__PropertiesFilesAssignment_1 )* ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1711:1: ( ( ( ( rule__Property__PropertiesFilesAssignment_1 ) ) ( ( rule__Property__PropertiesFilesAssignment_1 )* ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1712:1: ( ( ( rule__Property__PropertiesFilesAssignment_1 ) ) ( ( rule__Property__PropertiesFilesAssignment_1 )* ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1712:1: ( ( ( rule__Property__PropertiesFilesAssignment_1 ) ) ( ( rule__Property__PropertiesFilesAssignment_1 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1713:1: ( ( rule__Property__PropertiesFilesAssignment_1 ) ) ( ( rule__Property__PropertiesFilesAssignment_1 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1713:1: ( ( rule__Property__PropertiesFilesAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1714:1: ( rule__Property__PropertiesFilesAssignment_1 )
            {
             before(grammarAccess.getPropertyAccess().getPropertiesFilesAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1715:1: ( rule__Property__PropertiesFilesAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1715:2: rule__Property__PropertiesFilesAssignment_1
            {
            pushFollow(FOLLOW_rule__Property__PropertiesFilesAssignment_1_in_rule__Property__Group__1__Impl3605);
            rule__Property__PropertiesFilesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getPropertiesFilesAssignment_1()); 

            }

            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1718:1: ( ( rule__Property__PropertiesFilesAssignment_1 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1719:1: ( rule__Property__PropertiesFilesAssignment_1 )*
            {
             before(grammarAccess.getPropertyAccess().getPropertiesFilesAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1720:1: ( rule__Property__PropertiesFilesAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1720:2: rule__Property__PropertiesFilesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Property__PropertiesFilesAssignment_1_in_rule__Property__Group__1__Impl3617);
            	    rule__Property__PropertiesFilesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1731:1: rule__Property__Group__2 : rule__Property__Group__2__Impl ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1735:1: ( rule__Property__Group__2__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1736:2: rule__Property__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__23650);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1742:1: rule__Property__Group__2__Impl : ( ';' ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1746:1: ( ( ';' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1747:1: ( ';' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1747:1: ( ';' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1748:1: ';'
            {
             before(grammarAccess.getPropertyAccess().getSemicolonKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__Property__Group__2__Impl3678); 
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


    // $ANTLR start "rule__Layout__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1767:1: rule__Layout__Group__0 : rule__Layout__Group__0__Impl rule__Layout__Group__1 ;
    public final void rule__Layout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1771:1: ( rule__Layout__Group__0__Impl rule__Layout__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1772:2: rule__Layout__Group__0__Impl rule__Layout__Group__1
            {
            pushFollow(FOLLOW_rule__Layout__Group__0__Impl_in_rule__Layout__Group__03715);
            rule__Layout__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Layout__Group__1_in_rule__Layout__Group__03718);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1779:1: rule__Layout__Group__0__Impl : ( 'get layout from:' ) ;
    public final void rule__Layout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1783:1: ( ( 'get layout from:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1784:1: ( 'get layout from:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1784:1: ( 'get layout from:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1785:1: 'get layout from:'
            {
             before(grammarAccess.getLayoutAccess().getGetLayoutFromKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Layout__Group__0__Impl3746); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1798:1: rule__Layout__Group__1 : rule__Layout__Group__1__Impl rule__Layout__Group__2 ;
    public final void rule__Layout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1802:1: ( rule__Layout__Group__1__Impl rule__Layout__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1803:2: rule__Layout__Group__1__Impl rule__Layout__Group__2
            {
            pushFollow(FOLLOW_rule__Layout__Group__1__Impl_in_rule__Layout__Group__13777);
            rule__Layout__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Layout__Group__2_in_rule__Layout__Group__13780);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1810:1: rule__Layout__Group__1__Impl : ( ( ( rule__Layout__LayoutFilesAssignment_1 ) ) ( ( rule__Layout__LayoutFilesAssignment_1 )* ) ) ;
    public final void rule__Layout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1814:1: ( ( ( ( rule__Layout__LayoutFilesAssignment_1 ) ) ( ( rule__Layout__LayoutFilesAssignment_1 )* ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1815:1: ( ( ( rule__Layout__LayoutFilesAssignment_1 ) ) ( ( rule__Layout__LayoutFilesAssignment_1 )* ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1815:1: ( ( ( rule__Layout__LayoutFilesAssignment_1 ) ) ( ( rule__Layout__LayoutFilesAssignment_1 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1816:1: ( ( rule__Layout__LayoutFilesAssignment_1 ) ) ( ( rule__Layout__LayoutFilesAssignment_1 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1816:1: ( ( rule__Layout__LayoutFilesAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1817:1: ( rule__Layout__LayoutFilesAssignment_1 )
            {
             before(grammarAccess.getLayoutAccess().getLayoutFilesAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1818:1: ( rule__Layout__LayoutFilesAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1818:2: rule__Layout__LayoutFilesAssignment_1
            {
            pushFollow(FOLLOW_rule__Layout__LayoutFilesAssignment_1_in_rule__Layout__Group__1__Impl3809);
            rule__Layout__LayoutFilesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLayoutAccess().getLayoutFilesAssignment_1()); 

            }

            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1821:1: ( ( rule__Layout__LayoutFilesAssignment_1 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1822:1: ( rule__Layout__LayoutFilesAssignment_1 )*
            {
             before(grammarAccess.getLayoutAccess().getLayoutFilesAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1823:1: ( rule__Layout__LayoutFilesAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_STRING) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1823:2: rule__Layout__LayoutFilesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Layout__LayoutFilesAssignment_1_in_rule__Layout__Group__1__Impl3821);
            	    rule__Layout__LayoutFilesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1834:1: rule__Layout__Group__2 : rule__Layout__Group__2__Impl ;
    public final void rule__Layout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1838:1: ( rule__Layout__Group__2__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1839:2: rule__Layout__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Layout__Group__2__Impl_in_rule__Layout__Group__23854);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1845:1: rule__Layout__Group__2__Impl : ( ';' ) ;
    public final void rule__Layout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1849:1: ( ( ';' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1850:1: ( ';' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1850:1: ( ';' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1851:1: ';'
            {
             before(grammarAccess.getLayoutAccess().getSemicolonKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__Layout__Group__2__Impl3882); 
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


    // $ANTLR start "rule__UsedDescription__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1870:1: rule__UsedDescription__Group__0 : rule__UsedDescription__Group__0__Impl rule__UsedDescription__Group__1 ;
    public final void rule__UsedDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1874:1: ( rule__UsedDescription__Group__0__Impl rule__UsedDescription__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1875:2: rule__UsedDescription__Group__0__Impl rule__UsedDescription__Group__1
            {
            pushFollow(FOLLOW_rule__UsedDescription__Group__0__Impl_in_rule__UsedDescription__Group__03919);
            rule__UsedDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsedDescription__Group__1_in_rule__UsedDescription__Group__03922);
            rule__UsedDescription__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedDescription__Group__0"


    // $ANTLR start "rule__UsedDescription__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1882:1: rule__UsedDescription__Group__0__Impl : ( 'use:' ) ;
    public final void rule__UsedDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1886:1: ( ( 'use:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1887:1: ( 'use:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1887:1: ( 'use:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1888:1: 'use:'
            {
             before(grammarAccess.getUsedDescriptionAccess().getUseKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__UsedDescription__Group__0__Impl3950); 
             after(grammarAccess.getUsedDescriptionAccess().getUseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedDescription__Group__0__Impl"


    // $ANTLR start "rule__UsedDescription__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1901:1: rule__UsedDescription__Group__1 : rule__UsedDescription__Group__1__Impl rule__UsedDescription__Group__2 ;
    public final void rule__UsedDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1905:1: ( rule__UsedDescription__Group__1__Impl rule__UsedDescription__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1906:2: rule__UsedDescription__Group__1__Impl rule__UsedDescription__Group__2
            {
            pushFollow(FOLLOW_rule__UsedDescription__Group__1__Impl_in_rule__UsedDescription__Group__13981);
            rule__UsedDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsedDescription__Group__2_in_rule__UsedDescription__Group__13984);
            rule__UsedDescription__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedDescription__Group__1"


    // $ANTLR start "rule__UsedDescription__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1913:1: rule__UsedDescription__Group__1__Impl : ( ( rule__UsedDescription__DescriptionTypeAssignment_1 ) ) ;
    public final void rule__UsedDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1917:1: ( ( ( rule__UsedDescription__DescriptionTypeAssignment_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1918:1: ( ( rule__UsedDescription__DescriptionTypeAssignment_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1918:1: ( ( rule__UsedDescription__DescriptionTypeAssignment_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1919:1: ( rule__UsedDescription__DescriptionTypeAssignment_1 )
            {
             before(grammarAccess.getUsedDescriptionAccess().getDescriptionTypeAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1920:1: ( rule__UsedDescription__DescriptionTypeAssignment_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1920:2: rule__UsedDescription__DescriptionTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__UsedDescription__DescriptionTypeAssignment_1_in_rule__UsedDescription__Group__1__Impl4011);
            rule__UsedDescription__DescriptionTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUsedDescriptionAccess().getDescriptionTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedDescription__Group__1__Impl"


    // $ANTLR start "rule__UsedDescription__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1930:1: rule__UsedDescription__Group__2 : rule__UsedDescription__Group__2__Impl rule__UsedDescription__Group__3 ;
    public final void rule__UsedDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1934:1: ( rule__UsedDescription__Group__2__Impl rule__UsedDescription__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1935:2: rule__UsedDescription__Group__2__Impl rule__UsedDescription__Group__3
            {
            pushFollow(FOLLOW_rule__UsedDescription__Group__2__Impl_in_rule__UsedDescription__Group__24041);
            rule__UsedDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsedDescription__Group__3_in_rule__UsedDescription__Group__24044);
            rule__UsedDescription__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedDescription__Group__2"


    // $ANTLR start "rule__UsedDescription__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1942:1: rule__UsedDescription__Group__2__Impl : ( ( rule__UsedDescription__Group_2__0 )? ) ;
    public final void rule__UsedDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1946:1: ( ( ( rule__UsedDescription__Group_2__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1947:1: ( ( rule__UsedDescription__Group_2__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1947:1: ( ( rule__UsedDescription__Group_2__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1948:1: ( rule__UsedDescription__Group_2__0 )?
            {
             before(grammarAccess.getUsedDescriptionAccess().getGroup_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1949:1: ( rule__UsedDescription__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1949:2: rule__UsedDescription__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__UsedDescription__Group_2__0_in_rule__UsedDescription__Group__2__Impl4071);
                    rule__UsedDescription__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUsedDescriptionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedDescription__Group__2__Impl"


    // $ANTLR start "rule__UsedDescription__Group__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1959:1: rule__UsedDescription__Group__3 : rule__UsedDescription__Group__3__Impl ;
    public final void rule__UsedDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1963:1: ( rule__UsedDescription__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1964:2: rule__UsedDescription__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__UsedDescription__Group__3__Impl_in_rule__UsedDescription__Group__34102);
            rule__UsedDescription__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedDescription__Group__3"


    // $ANTLR start "rule__UsedDescription__Group__3__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1970:1: rule__UsedDescription__Group__3__Impl : ( ';' ) ;
    public final void rule__UsedDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1974:1: ( ( ';' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1975:1: ( ';' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1975:1: ( ';' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1976:1: ';'
            {
             before(grammarAccess.getUsedDescriptionAccess().getSemicolonKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__UsedDescription__Group__3__Impl4130); 
             after(grammarAccess.getUsedDescriptionAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedDescription__Group__3__Impl"


    // $ANTLR start "rule__UsedDescription__Group_2__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1997:1: rule__UsedDescription__Group_2__0 : rule__UsedDescription__Group_2__0__Impl rule__UsedDescription__Group_2__1 ;
    public final void rule__UsedDescription__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2001:1: ( rule__UsedDescription__Group_2__0__Impl rule__UsedDescription__Group_2__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2002:2: rule__UsedDescription__Group_2__0__Impl rule__UsedDescription__Group_2__1
            {
            pushFollow(FOLLOW_rule__UsedDescription__Group_2__0__Impl_in_rule__UsedDescription__Group_2__04169);
            rule__UsedDescription__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsedDescription__Group_2__1_in_rule__UsedDescription__Group_2__04172);
            rule__UsedDescription__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedDescription__Group_2__0"


    // $ANTLR start "rule__UsedDescription__Group_2__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2009:1: rule__UsedDescription__Group_2__0__Impl : ( 'as:' ) ;
    public final void rule__UsedDescription__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2013:1: ( ( 'as:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2014:1: ( 'as:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2014:1: ( 'as:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2015:1: 'as:'
            {
             before(grammarAccess.getUsedDescriptionAccess().getAsKeyword_2_0()); 
            match(input,24,FOLLOW_24_in_rule__UsedDescription__Group_2__0__Impl4200); 
             after(grammarAccess.getUsedDescriptionAccess().getAsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedDescription__Group_2__0__Impl"


    // $ANTLR start "rule__UsedDescription__Group_2__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2028:1: rule__UsedDescription__Group_2__1 : rule__UsedDescription__Group_2__1__Impl ;
    public final void rule__UsedDescription__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2032:1: ( rule__UsedDescription__Group_2__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2033:2: rule__UsedDescription__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__UsedDescription__Group_2__1__Impl_in_rule__UsedDescription__Group_2__14231);
            rule__UsedDescription__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedDescription__Group_2__1"


    // $ANTLR start "rule__UsedDescription__Group_2__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2039:1: rule__UsedDescription__Group_2__1__Impl : ( ( rule__UsedDescription__IdAssignment_2_1 ) ) ;
    public final void rule__UsedDescription__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2043:1: ( ( ( rule__UsedDescription__IdAssignment_2_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2044:1: ( ( rule__UsedDescription__IdAssignment_2_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2044:1: ( ( rule__UsedDescription__IdAssignment_2_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2045:1: ( rule__UsedDescription__IdAssignment_2_1 )
            {
             before(grammarAccess.getUsedDescriptionAccess().getIdAssignment_2_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2046:1: ( rule__UsedDescription__IdAssignment_2_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2046:2: rule__UsedDescription__IdAssignment_2_1
            {
            pushFollow(FOLLOW_rule__UsedDescription__IdAssignment_2_1_in_rule__UsedDescription__Group_2__1__Impl4258);
            rule__UsedDescription__IdAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUsedDescriptionAccess().getIdAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedDescription__Group_2__1__Impl"


    // $ANTLR start "rule__Refinement__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2060:1: rule__Refinement__Group__0 : rule__Refinement__Group__0__Impl rule__Refinement__Group__1 ;
    public final void rule__Refinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2064:1: ( rule__Refinement__Group__0__Impl rule__Refinement__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2065:2: rule__Refinement__Group__0__Impl rule__Refinement__Group__1
            {
            pushFollow(FOLLOW_rule__Refinement__Group__0__Impl_in_rule__Refinement__Group__04292);
            rule__Refinement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Refinement__Group__1_in_rule__Refinement__Group__04295);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2072:1: rule__Refinement__Group__0__Impl : ( ( rule__Refinement__ConcreteRefinementAssignment_0 ) ) ;
    public final void rule__Refinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2076:1: ( ( ( rule__Refinement__ConcreteRefinementAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2077:1: ( ( rule__Refinement__ConcreteRefinementAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2077:1: ( ( rule__Refinement__ConcreteRefinementAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2078:1: ( rule__Refinement__ConcreteRefinementAssignment_0 )
            {
             before(grammarAccess.getRefinementAccess().getConcreteRefinementAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2079:1: ( rule__Refinement__ConcreteRefinementAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2079:2: rule__Refinement__ConcreteRefinementAssignment_0
            {
            pushFollow(FOLLOW_rule__Refinement__ConcreteRefinementAssignment_0_in_rule__Refinement__Group__0__Impl4322);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2089:1: rule__Refinement__Group__1 : rule__Refinement__Group__1__Impl ;
    public final void rule__Refinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2093:1: ( rule__Refinement__Group__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2094:2: rule__Refinement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Refinement__Group__1__Impl_in_rule__Refinement__Group__14352);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2100:1: rule__Refinement__Group__1__Impl : ( ';' ) ;
    public final void rule__Refinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2104:1: ( ( ';' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2105:1: ( ';' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2105:1: ( ';' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2106:1: ';'
            {
             before(grammarAccess.getRefinementAccess().getSemicolonKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Refinement__Group__1__Impl4380); 
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


    // $ANTLR start "rule__Definition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2123:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2127:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2128:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__04415);
            rule__Definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__04418);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2135:1: rule__Definition__Group__0__Impl : ( ( rule__Definition__ConcreteDefitionAssignment_0 ) ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2139:1: ( ( ( rule__Definition__ConcreteDefitionAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2140:1: ( ( rule__Definition__ConcreteDefitionAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2140:1: ( ( rule__Definition__ConcreteDefitionAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2141:1: ( rule__Definition__ConcreteDefitionAssignment_0 )
            {
             before(grammarAccess.getDefinitionAccess().getConcreteDefitionAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2142:1: ( rule__Definition__ConcreteDefitionAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2142:2: rule__Definition__ConcreteDefitionAssignment_0
            {
            pushFollow(FOLLOW_rule__Definition__ConcreteDefitionAssignment_0_in_rule__Definition__Group__0__Impl4445);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2152:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2156:1: ( rule__Definition__Group__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2157:2: rule__Definition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__14475);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2163:1: rule__Definition__Group__1__Impl : ( ';' ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2167:1: ( ( ';' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2168:1: ( ';' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2168:1: ( ';' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2169:1: ';'
            {
             before(grammarAccess.getDefinitionAccess().getSemicolonKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Definition__Group__1__Impl4503); 
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


    // $ANTLR start "rule__Structure__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2186:1: rule__Structure__Group__0 : rule__Structure__Group__0__Impl rule__Structure__Group__1 ;
    public final void rule__Structure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2190:1: ( rule__Structure__Group__0__Impl rule__Structure__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2191:2: rule__Structure__Group__0__Impl rule__Structure__Group__1
            {
            pushFollow(FOLLOW_rule__Structure__Group__0__Impl_in_rule__Structure__Group__04538);
            rule__Structure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Structure__Group__1_in_rule__Structure__Group__04541);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2198:1: rule__Structure__Group__0__Impl : ( ( rule__Structure__NameAssignment_0 ) ) ;
    public final void rule__Structure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2202:1: ( ( ( rule__Structure__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2203:1: ( ( rule__Structure__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2203:1: ( ( rule__Structure__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2204:1: ( rule__Structure__NameAssignment_0 )
            {
             before(grammarAccess.getStructureAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2205:1: ( rule__Structure__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2205:2: rule__Structure__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Structure__NameAssignment_0_in_rule__Structure__Group__0__Impl4568);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2215:1: rule__Structure__Group__1 : rule__Structure__Group__1__Impl rule__Structure__Group__2 ;
    public final void rule__Structure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2219:1: ( rule__Structure__Group__1__Impl rule__Structure__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2220:2: rule__Structure__Group__1__Impl rule__Structure__Group__2
            {
            pushFollow(FOLLOW_rule__Structure__Group__1__Impl_in_rule__Structure__Group__14598);
            rule__Structure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Structure__Group__2_in_rule__Structure__Group__14601);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2227:1: rule__Structure__Group__1__Impl : ( ':' ) ;
    public final void rule__Structure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2231:1: ( ( ':' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2232:1: ( ':' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2232:1: ( ':' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2233:1: ':'
            {
             before(grammarAccess.getStructureAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Structure__Group__1__Impl4629); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2246:1: rule__Structure__Group__2 : rule__Structure__Group__2__Impl rule__Structure__Group__3 ;
    public final void rule__Structure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2250:1: ( rule__Structure__Group__2__Impl rule__Structure__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2251:2: rule__Structure__Group__2__Impl rule__Structure__Group__3
            {
            pushFollow(FOLLOW_rule__Structure__Group__2__Impl_in_rule__Structure__Group__24660);
            rule__Structure__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Structure__Group__3_in_rule__Structure__Group__24663);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2258:1: rule__Structure__Group__2__Impl : ( ( rule__Structure__OrderedElementsAssignment_2 )* ) ;
    public final void rule__Structure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2262:1: ( ( ( rule__Structure__OrderedElementsAssignment_2 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2263:1: ( ( rule__Structure__OrderedElementsAssignment_2 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2263:1: ( ( rule__Structure__OrderedElementsAssignment_2 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2264:1: ( rule__Structure__OrderedElementsAssignment_2 )*
            {
             before(grammarAccess.getStructureAccess().getOrderedElementsAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2265:1: ( rule__Structure__OrderedElementsAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_STRING) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2265:2: rule__Structure__OrderedElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Structure__OrderedElementsAssignment_2_in_rule__Structure__Group__2__Impl4690);
            	    rule__Structure__OrderedElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2275:1: rule__Structure__Group__3 : rule__Structure__Group__3__Impl ;
    public final void rule__Structure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2279:1: ( rule__Structure__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2280:2: rule__Structure__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Structure__Group__3__Impl_in_rule__Structure__Group__34721);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2286:1: rule__Structure__Group__3__Impl : ( ';' ) ;
    public final void rule__Structure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2290:1: ( ( ';' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2291:1: ( ';' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2291:1: ( ';' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2292:1: ';'
            {
             before(grammarAccess.getStructureAccess().getSemicolonKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__Structure__Group__3__Impl4749); 
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


    // $ANTLR start "rule__TableRefinement__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2313:1: rule__TableRefinement__Group__0 : rule__TableRefinement__Group__0__Impl rule__TableRefinement__Group__1 ;
    public final void rule__TableRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2317:1: ( rule__TableRefinement__Group__0__Impl rule__TableRefinement__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2318:2: rule__TableRefinement__Group__0__Impl rule__TableRefinement__Group__1
            {
            pushFollow(FOLLOW_rule__TableRefinement__Group__0__Impl_in_rule__TableRefinement__Group__04788);
            rule__TableRefinement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableRefinement__Group__1_in_rule__TableRefinement__Group__04791);
            rule__TableRefinement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRefinement__Group__0"


    // $ANTLR start "rule__TableRefinement__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2325:1: rule__TableRefinement__Group__0__Impl : ( ( rule__TableRefinement__NameAssignment_0 ) ) ;
    public final void rule__TableRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2329:1: ( ( ( rule__TableRefinement__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2330:1: ( ( rule__TableRefinement__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2330:1: ( ( rule__TableRefinement__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2331:1: ( rule__TableRefinement__NameAssignment_0 )
            {
             before(grammarAccess.getTableRefinementAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2332:1: ( rule__TableRefinement__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2332:2: rule__TableRefinement__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__TableRefinement__NameAssignment_0_in_rule__TableRefinement__Group__0__Impl4818);
            rule__TableRefinement__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTableRefinementAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRefinement__Group__0__Impl"


    // $ANTLR start "rule__TableRefinement__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2342:1: rule__TableRefinement__Group__1 : rule__TableRefinement__Group__1__Impl rule__TableRefinement__Group__2 ;
    public final void rule__TableRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2346:1: ( rule__TableRefinement__Group__1__Impl rule__TableRefinement__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2347:2: rule__TableRefinement__Group__1__Impl rule__TableRefinement__Group__2
            {
            pushFollow(FOLLOW_rule__TableRefinement__Group__1__Impl_in_rule__TableRefinement__Group__14848);
            rule__TableRefinement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableRefinement__Group__2_in_rule__TableRefinement__Group__14851);
            rule__TableRefinement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRefinement__Group__1"


    // $ANTLR start "rule__TableRefinement__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2354:1: rule__TableRefinement__Group__1__Impl : ( ( rule__TableRefinement__InputTypeAssignment_1 )? ) ;
    public final void rule__TableRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2358:1: ( ( ( rule__TableRefinement__InputTypeAssignment_1 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2359:1: ( ( rule__TableRefinement__InputTypeAssignment_1 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2359:1: ( ( rule__TableRefinement__InputTypeAssignment_1 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2360:1: ( rule__TableRefinement__InputTypeAssignment_1 )?
            {
             before(grammarAccess.getTableRefinementAccess().getInputTypeAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2361:1: ( rule__TableRefinement__InputTypeAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INPUT_DESCRIPTION) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2361:2: rule__TableRefinement__InputTypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TableRefinement__InputTypeAssignment_1_in_rule__TableRefinement__Group__1__Impl4878);
                    rule__TableRefinement__InputTypeAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableRefinementAccess().getInputTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRefinement__Group__1__Impl"


    // $ANTLR start "rule__TableRefinement__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2371:1: rule__TableRefinement__Group__2 : rule__TableRefinement__Group__2__Impl rule__TableRefinement__Group__3 ;
    public final void rule__TableRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2375:1: ( rule__TableRefinement__Group__2__Impl rule__TableRefinement__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2376:2: rule__TableRefinement__Group__2__Impl rule__TableRefinement__Group__3
            {
            pushFollow(FOLLOW_rule__TableRefinement__Group__2__Impl_in_rule__TableRefinement__Group__24909);
            rule__TableRefinement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableRefinement__Group__3_in_rule__TableRefinement__Group__24912);
            rule__TableRefinement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRefinement__Group__2"


    // $ANTLR start "rule__TableRefinement__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2383:1: rule__TableRefinement__Group__2__Impl : ( 'change:' ) ;
    public final void rule__TableRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2387:1: ( ( 'change:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2388:1: ( 'change:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2388:1: ( 'change:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2389:1: 'change:'
            {
             before(grammarAccess.getTableRefinementAccess().getChangeKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__TableRefinement__Group__2__Impl4940); 
             after(grammarAccess.getTableRefinementAccess().getChangeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRefinement__Group__2__Impl"


    // $ANTLR start "rule__TableRefinement__Group__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2402:1: rule__TableRefinement__Group__3 : rule__TableRefinement__Group__3__Impl rule__TableRefinement__Group__4 ;
    public final void rule__TableRefinement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2406:1: ( rule__TableRefinement__Group__3__Impl rule__TableRefinement__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2407:2: rule__TableRefinement__Group__3__Impl rule__TableRefinement__Group__4
            {
            pushFollow(FOLLOW_rule__TableRefinement__Group__3__Impl_in_rule__TableRefinement__Group__34971);
            rule__TableRefinement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableRefinement__Group__4_in_rule__TableRefinement__Group__34974);
            rule__TableRefinement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRefinement__Group__3"


    // $ANTLR start "rule__TableRefinement__Group__3__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2414:1: rule__TableRefinement__Group__3__Impl : ( ( rule__TableRefinement__IdAssignment_3 ) ) ;
    public final void rule__TableRefinement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2418:1: ( ( ( rule__TableRefinement__IdAssignment_3 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2419:1: ( ( rule__TableRefinement__IdAssignment_3 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2419:1: ( ( rule__TableRefinement__IdAssignment_3 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2420:1: ( rule__TableRefinement__IdAssignment_3 )
            {
             before(grammarAccess.getTableRefinementAccess().getIdAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2421:1: ( rule__TableRefinement__IdAssignment_3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2421:2: rule__TableRefinement__IdAssignment_3
            {
            pushFollow(FOLLOW_rule__TableRefinement__IdAssignment_3_in_rule__TableRefinement__Group__3__Impl5001);
            rule__TableRefinement__IdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTableRefinementAccess().getIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRefinement__Group__3__Impl"


    // $ANTLR start "rule__TableRefinement__Group__4"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2431:1: rule__TableRefinement__Group__4 : rule__TableRefinement__Group__4__Impl ;
    public final void rule__TableRefinement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2435:1: ( rule__TableRefinement__Group__4__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2436:2: rule__TableRefinement__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TableRefinement__Group__4__Impl_in_rule__TableRefinement__Group__45031);
            rule__TableRefinement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRefinement__Group__4"


    // $ANTLR start "rule__TableRefinement__Group__4__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2442:1: rule__TableRefinement__Group__4__Impl : ( ( rule__TableRefinement__PropertiesAssignment_4 )? ) ;
    public final void rule__TableRefinement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2446:1: ( ( ( rule__TableRefinement__PropertiesAssignment_4 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2447:1: ( ( rule__TableRefinement__PropertiesAssignment_4 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2447:1: ( ( rule__TableRefinement__PropertiesAssignment_4 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2448:1: ( rule__TableRefinement__PropertiesAssignment_4 )?
            {
             before(grammarAccess.getTableRefinementAccess().getPropertiesAssignment_4()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2449:1: ( rule__TableRefinement__PropertiesAssignment_4 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2449:2: rule__TableRefinement__PropertiesAssignment_4
                    {
                    pushFollow(FOLLOW_rule__TableRefinement__PropertiesAssignment_4_in_rule__TableRefinement__Group__4__Impl5058);
                    rule__TableRefinement__PropertiesAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableRefinementAccess().getPropertiesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRefinement__Group__4__Impl"


    // $ANTLR start "rule__TabViewRefinement__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2469:1: rule__TabViewRefinement__Group__0 : rule__TabViewRefinement__Group__0__Impl rule__TabViewRefinement__Group__1 ;
    public final void rule__TabViewRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2473:1: ( rule__TabViewRefinement__Group__0__Impl rule__TabViewRefinement__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2474:2: rule__TabViewRefinement__Group__0__Impl rule__TabViewRefinement__Group__1
            {
            pushFollow(FOLLOW_rule__TabViewRefinement__Group__0__Impl_in_rule__TabViewRefinement__Group__05099);
            rule__TabViewRefinement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TabViewRefinement__Group__1_in_rule__TabViewRefinement__Group__05102);
            rule__TabViewRefinement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabViewRefinement__Group__0"


    // $ANTLR start "rule__TabViewRefinement__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2481:1: rule__TabViewRefinement__Group__0__Impl : ( ( rule__TabViewRefinement__NameAssignment_0 ) ) ;
    public final void rule__TabViewRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2485:1: ( ( ( rule__TabViewRefinement__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2486:1: ( ( rule__TabViewRefinement__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2486:1: ( ( rule__TabViewRefinement__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2487:1: ( rule__TabViewRefinement__NameAssignment_0 )
            {
             before(grammarAccess.getTabViewRefinementAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2488:1: ( rule__TabViewRefinement__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2488:2: rule__TabViewRefinement__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__TabViewRefinement__NameAssignment_0_in_rule__TabViewRefinement__Group__0__Impl5129);
            rule__TabViewRefinement__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTabViewRefinementAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabViewRefinement__Group__0__Impl"


    // $ANTLR start "rule__TabViewRefinement__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2498:1: rule__TabViewRefinement__Group__1 : rule__TabViewRefinement__Group__1__Impl rule__TabViewRefinement__Group__2 ;
    public final void rule__TabViewRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2502:1: ( rule__TabViewRefinement__Group__1__Impl rule__TabViewRefinement__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2503:2: rule__TabViewRefinement__Group__1__Impl rule__TabViewRefinement__Group__2
            {
            pushFollow(FOLLOW_rule__TabViewRefinement__Group__1__Impl_in_rule__TabViewRefinement__Group__15159);
            rule__TabViewRefinement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TabViewRefinement__Group__2_in_rule__TabViewRefinement__Group__15162);
            rule__TabViewRefinement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabViewRefinement__Group__1"


    // $ANTLR start "rule__TabViewRefinement__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2510:1: rule__TabViewRefinement__Group__1__Impl : ( ( rule__TabViewRefinement__TabsAssignment_1 )? ) ;
    public final void rule__TabViewRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2514:1: ( ( ( rule__TabViewRefinement__TabsAssignment_1 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2515:1: ( ( rule__TabViewRefinement__TabsAssignment_1 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2515:1: ( ( rule__TabViewRefinement__TabsAssignment_1 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2516:1: ( rule__TabViewRefinement__TabsAssignment_1 )?
            {
             before(grammarAccess.getTabViewRefinementAccess().getTabsAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2517:1: ( rule__TabViewRefinement__TabsAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_TABNAME) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2517:2: rule__TabViewRefinement__TabsAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TabViewRefinement__TabsAssignment_1_in_rule__TabViewRefinement__Group__1__Impl5189);
                    rule__TabViewRefinement__TabsAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTabViewRefinementAccess().getTabsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabViewRefinement__Group__1__Impl"


    // $ANTLR start "rule__TabViewRefinement__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2527:1: rule__TabViewRefinement__Group__2 : rule__TabViewRefinement__Group__2__Impl rule__TabViewRefinement__Group__3 ;
    public final void rule__TabViewRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2531:1: ( rule__TabViewRefinement__Group__2__Impl rule__TabViewRefinement__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2532:2: rule__TabViewRefinement__Group__2__Impl rule__TabViewRefinement__Group__3
            {
            pushFollow(FOLLOW_rule__TabViewRefinement__Group__2__Impl_in_rule__TabViewRefinement__Group__25220);
            rule__TabViewRefinement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TabViewRefinement__Group__3_in_rule__TabViewRefinement__Group__25223);
            rule__TabViewRefinement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabViewRefinement__Group__2"


    // $ANTLR start "rule__TabViewRefinement__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2539:1: rule__TabViewRefinement__Group__2__Impl : ( 'change:' ) ;
    public final void rule__TabViewRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2543:1: ( ( 'change:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2544:1: ( 'change:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2544:1: ( 'change:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2545:1: 'change:'
            {
             before(grammarAccess.getTabViewRefinementAccess().getChangeKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__TabViewRefinement__Group__2__Impl5251); 
             after(grammarAccess.getTabViewRefinementAccess().getChangeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabViewRefinement__Group__2__Impl"


    // $ANTLR start "rule__TabViewRefinement__Group__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2558:1: rule__TabViewRefinement__Group__3 : rule__TabViewRefinement__Group__3__Impl rule__TabViewRefinement__Group__4 ;
    public final void rule__TabViewRefinement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2562:1: ( rule__TabViewRefinement__Group__3__Impl rule__TabViewRefinement__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2563:2: rule__TabViewRefinement__Group__3__Impl rule__TabViewRefinement__Group__4
            {
            pushFollow(FOLLOW_rule__TabViewRefinement__Group__3__Impl_in_rule__TabViewRefinement__Group__35282);
            rule__TabViewRefinement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TabViewRefinement__Group__4_in_rule__TabViewRefinement__Group__35285);
            rule__TabViewRefinement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabViewRefinement__Group__3"


    // $ANTLR start "rule__TabViewRefinement__Group__3__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2570:1: rule__TabViewRefinement__Group__3__Impl : ( ( rule__TabViewRefinement__IdAssignment_3 ) ) ;
    public final void rule__TabViewRefinement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2574:1: ( ( ( rule__TabViewRefinement__IdAssignment_3 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2575:1: ( ( rule__TabViewRefinement__IdAssignment_3 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2575:1: ( ( rule__TabViewRefinement__IdAssignment_3 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2576:1: ( rule__TabViewRefinement__IdAssignment_3 )
            {
             before(grammarAccess.getTabViewRefinementAccess().getIdAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2577:1: ( rule__TabViewRefinement__IdAssignment_3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2577:2: rule__TabViewRefinement__IdAssignment_3
            {
            pushFollow(FOLLOW_rule__TabViewRefinement__IdAssignment_3_in_rule__TabViewRefinement__Group__3__Impl5312);
            rule__TabViewRefinement__IdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTabViewRefinementAccess().getIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabViewRefinement__Group__3__Impl"


    // $ANTLR start "rule__TabViewRefinement__Group__4"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2587:1: rule__TabViewRefinement__Group__4 : rule__TabViewRefinement__Group__4__Impl ;
    public final void rule__TabViewRefinement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2591:1: ( rule__TabViewRefinement__Group__4__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2592:2: rule__TabViewRefinement__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TabViewRefinement__Group__4__Impl_in_rule__TabViewRefinement__Group__45342);
            rule__TabViewRefinement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabViewRefinement__Group__4"


    // $ANTLR start "rule__TabViewRefinement__Group__4__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2598:1: rule__TabViewRefinement__Group__4__Impl : ( ( rule__TabViewRefinement__PropertiesAssignment_4 )? ) ;
    public final void rule__TabViewRefinement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2602:1: ( ( ( rule__TabViewRefinement__PropertiesAssignment_4 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2603:1: ( ( rule__TabViewRefinement__PropertiesAssignment_4 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2603:1: ( ( rule__TabViewRefinement__PropertiesAssignment_4 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2604:1: ( rule__TabViewRefinement__PropertiesAssignment_4 )?
            {
             before(grammarAccess.getTabViewRefinementAccess().getPropertiesAssignment_4()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2605:1: ( rule__TabViewRefinement__PropertiesAssignment_4 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2605:2: rule__TabViewRefinement__PropertiesAssignment_4
                    {
                    pushFollow(FOLLOW_rule__TabViewRefinement__PropertiesAssignment_4_in_rule__TabViewRefinement__Group__4__Impl5369);
                    rule__TabViewRefinement__PropertiesAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTabViewRefinementAccess().getPropertiesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabViewRefinement__Group__4__Impl"


    // $ANTLR start "rule__TreeRefinement__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2625:1: rule__TreeRefinement__Group__0 : rule__TreeRefinement__Group__0__Impl rule__TreeRefinement__Group__1 ;
    public final void rule__TreeRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2629:1: ( rule__TreeRefinement__Group__0__Impl rule__TreeRefinement__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2630:2: rule__TreeRefinement__Group__0__Impl rule__TreeRefinement__Group__1
            {
            pushFollow(FOLLOW_rule__TreeRefinement__Group__0__Impl_in_rule__TreeRefinement__Group__05410);
            rule__TreeRefinement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TreeRefinement__Group__1_in_rule__TreeRefinement__Group__05413);
            rule__TreeRefinement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeRefinement__Group__0"


    // $ANTLR start "rule__TreeRefinement__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2637:1: rule__TreeRefinement__Group__0__Impl : ( ( rule__TreeRefinement__NameAssignment_0 ) ) ;
    public final void rule__TreeRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2641:1: ( ( ( rule__TreeRefinement__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2642:1: ( ( rule__TreeRefinement__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2642:1: ( ( rule__TreeRefinement__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2643:1: ( rule__TreeRefinement__NameAssignment_0 )
            {
             before(grammarAccess.getTreeRefinementAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2644:1: ( rule__TreeRefinement__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2644:2: rule__TreeRefinement__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__TreeRefinement__NameAssignment_0_in_rule__TreeRefinement__Group__0__Impl5440);
            rule__TreeRefinement__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTreeRefinementAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeRefinement__Group__0__Impl"


    // $ANTLR start "rule__TreeRefinement__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2654:1: rule__TreeRefinement__Group__1 : rule__TreeRefinement__Group__1__Impl rule__TreeRefinement__Group__2 ;
    public final void rule__TreeRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2658:1: ( rule__TreeRefinement__Group__1__Impl rule__TreeRefinement__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2659:2: rule__TreeRefinement__Group__1__Impl rule__TreeRefinement__Group__2
            {
            pushFollow(FOLLOW_rule__TreeRefinement__Group__1__Impl_in_rule__TreeRefinement__Group__15470);
            rule__TreeRefinement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TreeRefinement__Group__2_in_rule__TreeRefinement__Group__15473);
            rule__TreeRefinement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeRefinement__Group__1"


    // $ANTLR start "rule__TreeRefinement__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2666:1: rule__TreeRefinement__Group__1__Impl : ( ( rule__TreeRefinement__InputTypeAssignment_1 )? ) ;
    public final void rule__TreeRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2670:1: ( ( ( rule__TreeRefinement__InputTypeAssignment_1 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2671:1: ( ( rule__TreeRefinement__InputTypeAssignment_1 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2671:1: ( ( rule__TreeRefinement__InputTypeAssignment_1 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2672:1: ( rule__TreeRefinement__InputTypeAssignment_1 )?
            {
             before(grammarAccess.getTreeRefinementAccess().getInputTypeAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2673:1: ( rule__TreeRefinement__InputTypeAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INPUT_DESCRIPTION) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2673:2: rule__TreeRefinement__InputTypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TreeRefinement__InputTypeAssignment_1_in_rule__TreeRefinement__Group__1__Impl5500);
                    rule__TreeRefinement__InputTypeAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTreeRefinementAccess().getInputTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeRefinement__Group__1__Impl"


    // $ANTLR start "rule__TreeRefinement__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2683:1: rule__TreeRefinement__Group__2 : rule__TreeRefinement__Group__2__Impl rule__TreeRefinement__Group__3 ;
    public final void rule__TreeRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2687:1: ( rule__TreeRefinement__Group__2__Impl rule__TreeRefinement__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2688:2: rule__TreeRefinement__Group__2__Impl rule__TreeRefinement__Group__3
            {
            pushFollow(FOLLOW_rule__TreeRefinement__Group__2__Impl_in_rule__TreeRefinement__Group__25531);
            rule__TreeRefinement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TreeRefinement__Group__3_in_rule__TreeRefinement__Group__25534);
            rule__TreeRefinement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeRefinement__Group__2"


    // $ANTLR start "rule__TreeRefinement__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2695:1: rule__TreeRefinement__Group__2__Impl : ( 'change:' ) ;
    public final void rule__TreeRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2699:1: ( ( 'change:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2700:1: ( 'change:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2700:1: ( 'change:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2701:1: 'change:'
            {
             before(grammarAccess.getTreeRefinementAccess().getChangeKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__TreeRefinement__Group__2__Impl5562); 
             after(grammarAccess.getTreeRefinementAccess().getChangeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeRefinement__Group__2__Impl"


    // $ANTLR start "rule__TreeRefinement__Group__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2714:1: rule__TreeRefinement__Group__3 : rule__TreeRefinement__Group__3__Impl rule__TreeRefinement__Group__4 ;
    public final void rule__TreeRefinement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2718:1: ( rule__TreeRefinement__Group__3__Impl rule__TreeRefinement__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2719:2: rule__TreeRefinement__Group__3__Impl rule__TreeRefinement__Group__4
            {
            pushFollow(FOLLOW_rule__TreeRefinement__Group__3__Impl_in_rule__TreeRefinement__Group__35593);
            rule__TreeRefinement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TreeRefinement__Group__4_in_rule__TreeRefinement__Group__35596);
            rule__TreeRefinement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeRefinement__Group__3"


    // $ANTLR start "rule__TreeRefinement__Group__3__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2726:1: rule__TreeRefinement__Group__3__Impl : ( ( rule__TreeRefinement__IdAssignment_3 ) ) ;
    public final void rule__TreeRefinement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2730:1: ( ( ( rule__TreeRefinement__IdAssignment_3 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2731:1: ( ( rule__TreeRefinement__IdAssignment_3 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2731:1: ( ( rule__TreeRefinement__IdAssignment_3 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2732:1: ( rule__TreeRefinement__IdAssignment_3 )
            {
             before(grammarAccess.getTreeRefinementAccess().getIdAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2733:1: ( rule__TreeRefinement__IdAssignment_3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2733:2: rule__TreeRefinement__IdAssignment_3
            {
            pushFollow(FOLLOW_rule__TreeRefinement__IdAssignment_3_in_rule__TreeRefinement__Group__3__Impl5623);
            rule__TreeRefinement__IdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTreeRefinementAccess().getIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeRefinement__Group__3__Impl"


    // $ANTLR start "rule__TreeRefinement__Group__4"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2743:1: rule__TreeRefinement__Group__4 : rule__TreeRefinement__Group__4__Impl ;
    public final void rule__TreeRefinement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2747:1: ( rule__TreeRefinement__Group__4__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2748:2: rule__TreeRefinement__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TreeRefinement__Group__4__Impl_in_rule__TreeRefinement__Group__45653);
            rule__TreeRefinement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeRefinement__Group__4"


    // $ANTLR start "rule__TreeRefinement__Group__4__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2754:1: rule__TreeRefinement__Group__4__Impl : ( ( rule__TreeRefinement__PropertiesAssignment_4 )? ) ;
    public final void rule__TreeRefinement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2758:1: ( ( ( rule__TreeRefinement__PropertiesAssignment_4 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2759:1: ( ( rule__TreeRefinement__PropertiesAssignment_4 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2759:1: ( ( rule__TreeRefinement__PropertiesAssignment_4 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2760:1: ( rule__TreeRefinement__PropertiesAssignment_4 )?
            {
             before(grammarAccess.getTreeRefinementAccess().getPropertiesAssignment_4()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2761:1: ( rule__TreeRefinement__PropertiesAssignment_4 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2761:2: rule__TreeRefinement__PropertiesAssignment_4
                    {
                    pushFollow(FOLLOW_rule__TreeRefinement__PropertiesAssignment_4_in_rule__TreeRefinement__Group__4__Impl5680);
                    rule__TreeRefinement__PropertiesAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTreeRefinementAccess().getPropertiesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeRefinement__Group__4__Impl"


    // $ANTLR start "rule__InterchangeableRefinement__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2781:1: rule__InterchangeableRefinement__Group__0 : rule__InterchangeableRefinement__Group__0__Impl rule__InterchangeableRefinement__Group__1 ;
    public final void rule__InterchangeableRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2785:1: ( rule__InterchangeableRefinement__Group__0__Impl rule__InterchangeableRefinement__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2786:2: rule__InterchangeableRefinement__Group__0__Impl rule__InterchangeableRefinement__Group__1
            {
            pushFollow(FOLLOW_rule__InterchangeableRefinement__Group__0__Impl_in_rule__InterchangeableRefinement__Group__05721);
            rule__InterchangeableRefinement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterchangeableRefinement__Group__1_in_rule__InterchangeableRefinement__Group__05724);
            rule__InterchangeableRefinement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterchangeableRefinement__Group__0"


    // $ANTLR start "rule__InterchangeableRefinement__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2793:1: rule__InterchangeableRefinement__Group__0__Impl : ( ( rule__InterchangeableRefinement__NameAssignment_0 ) ) ;
    public final void rule__InterchangeableRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2797:1: ( ( ( rule__InterchangeableRefinement__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2798:1: ( ( rule__InterchangeableRefinement__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2798:1: ( ( rule__InterchangeableRefinement__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2799:1: ( rule__InterchangeableRefinement__NameAssignment_0 )
            {
             before(grammarAccess.getInterchangeableRefinementAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2800:1: ( rule__InterchangeableRefinement__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2800:2: rule__InterchangeableRefinement__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__InterchangeableRefinement__NameAssignment_0_in_rule__InterchangeableRefinement__Group__0__Impl5751);
            rule__InterchangeableRefinement__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInterchangeableRefinementAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterchangeableRefinement__Group__0__Impl"


    // $ANTLR start "rule__InterchangeableRefinement__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2810:1: rule__InterchangeableRefinement__Group__1 : rule__InterchangeableRefinement__Group__1__Impl rule__InterchangeableRefinement__Group__2 ;
    public final void rule__InterchangeableRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2814:1: ( rule__InterchangeableRefinement__Group__1__Impl rule__InterchangeableRefinement__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2815:2: rule__InterchangeableRefinement__Group__1__Impl rule__InterchangeableRefinement__Group__2
            {
            pushFollow(FOLLOW_rule__InterchangeableRefinement__Group__1__Impl_in_rule__InterchangeableRefinement__Group__15781);
            rule__InterchangeableRefinement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterchangeableRefinement__Group__2_in_rule__InterchangeableRefinement__Group__15784);
            rule__InterchangeableRefinement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterchangeableRefinement__Group__1"


    // $ANTLR start "rule__InterchangeableRefinement__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2822:1: rule__InterchangeableRefinement__Group__1__Impl : ( 'change:' ) ;
    public final void rule__InterchangeableRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2826:1: ( ( 'change:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2827:1: ( 'change:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2827:1: ( 'change:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2828:1: 'change:'
            {
             before(grammarAccess.getInterchangeableRefinementAccess().getChangeKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__InterchangeableRefinement__Group__1__Impl5812); 
             after(grammarAccess.getInterchangeableRefinementAccess().getChangeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterchangeableRefinement__Group__1__Impl"


    // $ANTLR start "rule__InterchangeableRefinement__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2841:1: rule__InterchangeableRefinement__Group__2 : rule__InterchangeableRefinement__Group__2__Impl rule__InterchangeableRefinement__Group__3 ;
    public final void rule__InterchangeableRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2845:1: ( rule__InterchangeableRefinement__Group__2__Impl rule__InterchangeableRefinement__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2846:2: rule__InterchangeableRefinement__Group__2__Impl rule__InterchangeableRefinement__Group__3
            {
            pushFollow(FOLLOW_rule__InterchangeableRefinement__Group__2__Impl_in_rule__InterchangeableRefinement__Group__25843);
            rule__InterchangeableRefinement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterchangeableRefinement__Group__3_in_rule__InterchangeableRefinement__Group__25846);
            rule__InterchangeableRefinement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterchangeableRefinement__Group__2"


    // $ANTLR start "rule__InterchangeableRefinement__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2853:1: rule__InterchangeableRefinement__Group__2__Impl : ( ( rule__InterchangeableRefinement__IdAssignment_2 ) ) ;
    public final void rule__InterchangeableRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2857:1: ( ( ( rule__InterchangeableRefinement__IdAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2858:1: ( ( rule__InterchangeableRefinement__IdAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2858:1: ( ( rule__InterchangeableRefinement__IdAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2859:1: ( rule__InterchangeableRefinement__IdAssignment_2 )
            {
             before(grammarAccess.getInterchangeableRefinementAccess().getIdAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2860:1: ( rule__InterchangeableRefinement__IdAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2860:2: rule__InterchangeableRefinement__IdAssignment_2
            {
            pushFollow(FOLLOW_rule__InterchangeableRefinement__IdAssignment_2_in_rule__InterchangeableRefinement__Group__2__Impl5873);
            rule__InterchangeableRefinement__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInterchangeableRefinementAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterchangeableRefinement__Group__2__Impl"


    // $ANTLR start "rule__InterchangeableRefinement__Group__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2870:1: rule__InterchangeableRefinement__Group__3 : rule__InterchangeableRefinement__Group__3__Impl ;
    public final void rule__InterchangeableRefinement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2874:1: ( rule__InterchangeableRefinement__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2875:2: rule__InterchangeableRefinement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__InterchangeableRefinement__Group__3__Impl_in_rule__InterchangeableRefinement__Group__35903);
            rule__InterchangeableRefinement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterchangeableRefinement__Group__3"


    // $ANTLR start "rule__InterchangeableRefinement__Group__3__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2881:1: rule__InterchangeableRefinement__Group__3__Impl : ( ( rule__InterchangeableRefinement__PropertiesAssignment_3 )? ) ;
    public final void rule__InterchangeableRefinement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2885:1: ( ( ( rule__InterchangeableRefinement__PropertiesAssignment_3 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2886:1: ( ( rule__InterchangeableRefinement__PropertiesAssignment_3 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2886:1: ( ( rule__InterchangeableRefinement__PropertiesAssignment_3 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2887:1: ( rule__InterchangeableRefinement__PropertiesAssignment_3 )?
            {
             before(grammarAccess.getInterchangeableRefinementAccess().getPropertiesAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2888:1: ( rule__InterchangeableRefinement__PropertiesAssignment_3 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2888:2: rule__InterchangeableRefinement__PropertiesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__InterchangeableRefinement__PropertiesAssignment_3_in_rule__InterchangeableRefinement__Group__3__Impl5930);
                    rule__InterchangeableRefinement__PropertiesAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterchangeableRefinementAccess().getPropertiesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterchangeableRefinement__Group__3__Impl"


    // $ANTLR start "rule__TextareaRefinement__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2906:1: rule__TextareaRefinement__Group__0 : rule__TextareaRefinement__Group__0__Impl rule__TextareaRefinement__Group__1 ;
    public final void rule__TextareaRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2910:1: ( rule__TextareaRefinement__Group__0__Impl rule__TextareaRefinement__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2911:2: rule__TextareaRefinement__Group__0__Impl rule__TextareaRefinement__Group__1
            {
            pushFollow(FOLLOW_rule__TextareaRefinement__Group__0__Impl_in_rule__TextareaRefinement__Group__05969);
            rule__TextareaRefinement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextareaRefinement__Group__1_in_rule__TextareaRefinement__Group__05972);
            rule__TextareaRefinement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaRefinement__Group__0"


    // $ANTLR start "rule__TextareaRefinement__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2918:1: rule__TextareaRefinement__Group__0__Impl : ( ( rule__TextareaRefinement__NameAssignment_0 ) ) ;
    public final void rule__TextareaRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2922:1: ( ( ( rule__TextareaRefinement__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2923:1: ( ( rule__TextareaRefinement__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2923:1: ( ( rule__TextareaRefinement__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2924:1: ( rule__TextareaRefinement__NameAssignment_0 )
            {
             before(grammarAccess.getTextareaRefinementAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2925:1: ( rule__TextareaRefinement__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2925:2: rule__TextareaRefinement__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__TextareaRefinement__NameAssignment_0_in_rule__TextareaRefinement__Group__0__Impl5999);
            rule__TextareaRefinement__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTextareaRefinementAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaRefinement__Group__0__Impl"


    // $ANTLR start "rule__TextareaRefinement__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2935:1: rule__TextareaRefinement__Group__1 : rule__TextareaRefinement__Group__1__Impl rule__TextareaRefinement__Group__2 ;
    public final void rule__TextareaRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2939:1: ( rule__TextareaRefinement__Group__1__Impl rule__TextareaRefinement__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2940:2: rule__TextareaRefinement__Group__1__Impl rule__TextareaRefinement__Group__2
            {
            pushFollow(FOLLOW_rule__TextareaRefinement__Group__1__Impl_in_rule__TextareaRefinement__Group__16029);
            rule__TextareaRefinement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextareaRefinement__Group__2_in_rule__TextareaRefinement__Group__16032);
            rule__TextareaRefinement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaRefinement__Group__1"


    // $ANTLR start "rule__TextareaRefinement__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2947:1: rule__TextareaRefinement__Group__1__Impl : ( 'change:' ) ;
    public final void rule__TextareaRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2951:1: ( ( 'change:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2952:1: ( 'change:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2952:1: ( 'change:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2953:1: 'change:'
            {
             before(grammarAccess.getTextareaRefinementAccess().getChangeKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__TextareaRefinement__Group__1__Impl6060); 
             after(grammarAccess.getTextareaRefinementAccess().getChangeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaRefinement__Group__1__Impl"


    // $ANTLR start "rule__TextareaRefinement__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2966:1: rule__TextareaRefinement__Group__2 : rule__TextareaRefinement__Group__2__Impl rule__TextareaRefinement__Group__3 ;
    public final void rule__TextareaRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2970:1: ( rule__TextareaRefinement__Group__2__Impl rule__TextareaRefinement__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2971:2: rule__TextareaRefinement__Group__2__Impl rule__TextareaRefinement__Group__3
            {
            pushFollow(FOLLOW_rule__TextareaRefinement__Group__2__Impl_in_rule__TextareaRefinement__Group__26091);
            rule__TextareaRefinement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextareaRefinement__Group__3_in_rule__TextareaRefinement__Group__26094);
            rule__TextareaRefinement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaRefinement__Group__2"


    // $ANTLR start "rule__TextareaRefinement__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2978:1: rule__TextareaRefinement__Group__2__Impl : ( ( rule__TextareaRefinement__IdAssignment_2 ) ) ;
    public final void rule__TextareaRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2982:1: ( ( ( rule__TextareaRefinement__IdAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2983:1: ( ( rule__TextareaRefinement__IdAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2983:1: ( ( rule__TextareaRefinement__IdAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2984:1: ( rule__TextareaRefinement__IdAssignment_2 )
            {
             before(grammarAccess.getTextareaRefinementAccess().getIdAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2985:1: ( rule__TextareaRefinement__IdAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2985:2: rule__TextareaRefinement__IdAssignment_2
            {
            pushFollow(FOLLOW_rule__TextareaRefinement__IdAssignment_2_in_rule__TextareaRefinement__Group__2__Impl6121);
            rule__TextareaRefinement__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTextareaRefinementAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaRefinement__Group__2__Impl"


    // $ANTLR start "rule__TextareaRefinement__Group__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2995:1: rule__TextareaRefinement__Group__3 : rule__TextareaRefinement__Group__3__Impl ;
    public final void rule__TextareaRefinement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:2999:1: ( rule__TextareaRefinement__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3000:2: rule__TextareaRefinement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TextareaRefinement__Group__3__Impl_in_rule__TextareaRefinement__Group__36151);
            rule__TextareaRefinement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaRefinement__Group__3"


    // $ANTLR start "rule__TextareaRefinement__Group__3__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3006:1: rule__TextareaRefinement__Group__3__Impl : ( ( rule__TextareaRefinement__PropertiesAssignment_3 )? ) ;
    public final void rule__TextareaRefinement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3010:1: ( ( ( rule__TextareaRefinement__PropertiesAssignment_3 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3011:1: ( ( rule__TextareaRefinement__PropertiesAssignment_3 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3011:1: ( ( rule__TextareaRefinement__PropertiesAssignment_3 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3012:1: ( rule__TextareaRefinement__PropertiesAssignment_3 )?
            {
             before(grammarAccess.getTextareaRefinementAccess().getPropertiesAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3013:1: ( rule__TextareaRefinement__PropertiesAssignment_3 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3013:2: rule__TextareaRefinement__PropertiesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__TextareaRefinement__PropertiesAssignment_3_in_rule__TextareaRefinement__Group__3__Impl6178);
                    rule__TextareaRefinement__PropertiesAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextareaRefinementAccess().getPropertiesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaRefinement__Group__3__Impl"


    // $ANTLR start "rule__TextfieldRefinement__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3031:1: rule__TextfieldRefinement__Group__0 : rule__TextfieldRefinement__Group__0__Impl rule__TextfieldRefinement__Group__1 ;
    public final void rule__TextfieldRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3035:1: ( rule__TextfieldRefinement__Group__0__Impl rule__TextfieldRefinement__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3036:2: rule__TextfieldRefinement__Group__0__Impl rule__TextfieldRefinement__Group__1
            {
            pushFollow(FOLLOW_rule__TextfieldRefinement__Group__0__Impl_in_rule__TextfieldRefinement__Group__06217);
            rule__TextfieldRefinement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextfieldRefinement__Group__1_in_rule__TextfieldRefinement__Group__06220);
            rule__TextfieldRefinement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldRefinement__Group__0"


    // $ANTLR start "rule__TextfieldRefinement__Group__0__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3043:1: rule__TextfieldRefinement__Group__0__Impl : ( ( rule__TextfieldRefinement__NameAssignment_0 ) ) ;
    public final void rule__TextfieldRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3047:1: ( ( ( rule__TextfieldRefinement__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3048:1: ( ( rule__TextfieldRefinement__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3048:1: ( ( rule__TextfieldRefinement__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3049:1: ( rule__TextfieldRefinement__NameAssignment_0 )
            {
             before(grammarAccess.getTextfieldRefinementAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3050:1: ( rule__TextfieldRefinement__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3050:2: rule__TextfieldRefinement__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__TextfieldRefinement__NameAssignment_0_in_rule__TextfieldRefinement__Group__0__Impl6247);
            rule__TextfieldRefinement__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTextfieldRefinementAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldRefinement__Group__0__Impl"


    // $ANTLR start "rule__TextfieldRefinement__Group__1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3060:1: rule__TextfieldRefinement__Group__1 : rule__TextfieldRefinement__Group__1__Impl rule__TextfieldRefinement__Group__2 ;
    public final void rule__TextfieldRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3064:1: ( rule__TextfieldRefinement__Group__1__Impl rule__TextfieldRefinement__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3065:2: rule__TextfieldRefinement__Group__1__Impl rule__TextfieldRefinement__Group__2
            {
            pushFollow(FOLLOW_rule__TextfieldRefinement__Group__1__Impl_in_rule__TextfieldRefinement__Group__16277);
            rule__TextfieldRefinement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextfieldRefinement__Group__2_in_rule__TextfieldRefinement__Group__16280);
            rule__TextfieldRefinement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldRefinement__Group__1"


    // $ANTLR start "rule__TextfieldRefinement__Group__1__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3072:1: rule__TextfieldRefinement__Group__1__Impl : ( 'change:' ) ;
    public final void rule__TextfieldRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3076:1: ( ( 'change:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3077:1: ( 'change:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3077:1: ( 'change:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3078:1: 'change:'
            {
             before(grammarAccess.getTextfieldRefinementAccess().getChangeKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__TextfieldRefinement__Group__1__Impl6308); 
             after(grammarAccess.getTextfieldRefinementAccess().getChangeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldRefinement__Group__1__Impl"


    // $ANTLR start "rule__TextfieldRefinement__Group__2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3091:1: rule__TextfieldRefinement__Group__2 : rule__TextfieldRefinement__Group__2__Impl rule__TextfieldRefinement__Group__3 ;
    public final void rule__TextfieldRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3095:1: ( rule__TextfieldRefinement__Group__2__Impl rule__TextfieldRefinement__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3096:2: rule__TextfieldRefinement__Group__2__Impl rule__TextfieldRefinement__Group__3
            {
            pushFollow(FOLLOW_rule__TextfieldRefinement__Group__2__Impl_in_rule__TextfieldRefinement__Group__26339);
            rule__TextfieldRefinement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextfieldRefinement__Group__3_in_rule__TextfieldRefinement__Group__26342);
            rule__TextfieldRefinement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldRefinement__Group__2"


    // $ANTLR start "rule__TextfieldRefinement__Group__2__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3103:1: rule__TextfieldRefinement__Group__2__Impl : ( ( rule__TextfieldRefinement__IdAssignment_2 ) ) ;
    public final void rule__TextfieldRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3107:1: ( ( ( rule__TextfieldRefinement__IdAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3108:1: ( ( rule__TextfieldRefinement__IdAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3108:1: ( ( rule__TextfieldRefinement__IdAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3109:1: ( rule__TextfieldRefinement__IdAssignment_2 )
            {
             before(grammarAccess.getTextfieldRefinementAccess().getIdAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3110:1: ( rule__TextfieldRefinement__IdAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3110:2: rule__TextfieldRefinement__IdAssignment_2
            {
            pushFollow(FOLLOW_rule__TextfieldRefinement__IdAssignment_2_in_rule__TextfieldRefinement__Group__2__Impl6369);
            rule__TextfieldRefinement__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTextfieldRefinementAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldRefinement__Group__2__Impl"


    // $ANTLR start "rule__TextfieldRefinement__Group__3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3120:1: rule__TextfieldRefinement__Group__3 : rule__TextfieldRefinement__Group__3__Impl ;
    public final void rule__TextfieldRefinement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3124:1: ( rule__TextfieldRefinement__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3125:2: rule__TextfieldRefinement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TextfieldRefinement__Group__3__Impl_in_rule__TextfieldRefinement__Group__36399);
            rule__TextfieldRefinement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldRefinement__Group__3"


    // $ANTLR start "rule__TextfieldRefinement__Group__3__Impl"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3131:1: rule__TextfieldRefinement__Group__3__Impl : ( ( rule__TextfieldRefinement__PropertiesAssignment_3 )? ) ;
    public final void rule__TextfieldRefinement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3135:1: ( ( ( rule__TextfieldRefinement__PropertiesAssignment_3 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3136:1: ( ( rule__TextfieldRefinement__PropertiesAssignment_3 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3136:1: ( ( rule__TextfieldRefinement__PropertiesAssignment_3 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3137:1: ( rule__TextfieldRefinement__PropertiesAssignment_3 )?
            {
             before(grammarAccess.getTextfieldRefinementAccess().getPropertiesAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3138:1: ( rule__TextfieldRefinement__PropertiesAssignment_3 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3138:2: rule__TextfieldRefinement__PropertiesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__TextfieldRefinement__PropertiesAssignment_3_in_rule__TextfieldRefinement__Group__3__Impl6426);
                    rule__TextfieldRefinement__PropertiesAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextfieldRefinementAccess().getPropertiesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldRefinement__Group__3__Impl"


    // $ANTLR start "rule__ButtonRefinement__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3156:1: rule__ButtonRefinement__Group__0 : rule__ButtonRefinement__Group__0__Impl rule__ButtonRefinement__Group__1 ;
    public final void rule__ButtonRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3160:1: ( rule__ButtonRefinement__Group__0__Impl rule__ButtonRefinement__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3161:2: rule__ButtonRefinement__Group__0__Impl rule__ButtonRefinement__Group__1
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__Group__0__Impl_in_rule__ButtonRefinement__Group__06465);
            rule__ButtonRefinement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonRefinement__Group__1_in_rule__ButtonRefinement__Group__06468);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3168:1: rule__ButtonRefinement__Group__0__Impl : ( ( rule__ButtonRefinement__NameAssignment_0 ) ) ;
    public final void rule__ButtonRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3172:1: ( ( ( rule__ButtonRefinement__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3173:1: ( ( rule__ButtonRefinement__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3173:1: ( ( rule__ButtonRefinement__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3174:1: ( rule__ButtonRefinement__NameAssignment_0 )
            {
             before(grammarAccess.getButtonRefinementAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3175:1: ( rule__ButtonRefinement__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3175:2: rule__ButtonRefinement__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__NameAssignment_0_in_rule__ButtonRefinement__Group__0__Impl6495);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3185:1: rule__ButtonRefinement__Group__1 : rule__ButtonRefinement__Group__1__Impl rule__ButtonRefinement__Group__2 ;
    public final void rule__ButtonRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3189:1: ( rule__ButtonRefinement__Group__1__Impl rule__ButtonRefinement__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3190:2: rule__ButtonRefinement__Group__1__Impl rule__ButtonRefinement__Group__2
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__Group__1__Impl_in_rule__ButtonRefinement__Group__16525);
            rule__ButtonRefinement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonRefinement__Group__2_in_rule__ButtonRefinement__Group__16528);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3197:1: rule__ButtonRefinement__Group__1__Impl : ( 'change:' ) ;
    public final void rule__ButtonRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3201:1: ( ( 'change:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3202:1: ( 'change:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3202:1: ( 'change:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3203:1: 'change:'
            {
             before(grammarAccess.getButtonRefinementAccess().getChangeKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__ButtonRefinement__Group__1__Impl6556); 
             after(grammarAccess.getButtonRefinementAccess().getChangeKeyword_1()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3216:1: rule__ButtonRefinement__Group__2 : rule__ButtonRefinement__Group__2__Impl rule__ButtonRefinement__Group__3 ;
    public final void rule__ButtonRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3220:1: ( rule__ButtonRefinement__Group__2__Impl rule__ButtonRefinement__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3221:2: rule__ButtonRefinement__Group__2__Impl rule__ButtonRefinement__Group__3
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__Group__2__Impl_in_rule__ButtonRefinement__Group__26587);
            rule__ButtonRefinement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonRefinement__Group__3_in_rule__ButtonRefinement__Group__26590);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3228:1: rule__ButtonRefinement__Group__2__Impl : ( ( rule__ButtonRefinement__IdAssignment_2 ) ) ;
    public final void rule__ButtonRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3232:1: ( ( ( rule__ButtonRefinement__IdAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3233:1: ( ( rule__ButtonRefinement__IdAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3233:1: ( ( rule__ButtonRefinement__IdAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3234:1: ( rule__ButtonRefinement__IdAssignment_2 )
            {
             before(grammarAccess.getButtonRefinementAccess().getIdAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3235:1: ( rule__ButtonRefinement__IdAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3235:2: rule__ButtonRefinement__IdAssignment_2
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__IdAssignment_2_in_rule__ButtonRefinement__Group__2__Impl6617);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3245:1: rule__ButtonRefinement__Group__3 : rule__ButtonRefinement__Group__3__Impl ;
    public final void rule__ButtonRefinement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3249:1: ( rule__ButtonRefinement__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3250:2: rule__ButtonRefinement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ButtonRefinement__Group__3__Impl_in_rule__ButtonRefinement__Group__36647);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3256:1: rule__ButtonRefinement__Group__3__Impl : ( ( rule__ButtonRefinement__PropertiesAssignment_3 )? ) ;
    public final void rule__ButtonRefinement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3260:1: ( ( ( rule__ButtonRefinement__PropertiesAssignment_3 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3261:1: ( ( rule__ButtonRefinement__PropertiesAssignment_3 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3261:1: ( ( rule__ButtonRefinement__PropertiesAssignment_3 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3262:1: ( rule__ButtonRefinement__PropertiesAssignment_3 )?
            {
             before(grammarAccess.getButtonRefinementAccess().getPropertiesAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3263:1: ( rule__ButtonRefinement__PropertiesAssignment_3 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3263:2: rule__ButtonRefinement__PropertiesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__ButtonRefinement__PropertiesAssignment_3_in_rule__ButtonRefinement__Group__3__Impl6674);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3281:1: rule__LabelRefinement__Group__0 : rule__LabelRefinement__Group__0__Impl rule__LabelRefinement__Group__1 ;
    public final void rule__LabelRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3285:1: ( rule__LabelRefinement__Group__0__Impl rule__LabelRefinement__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3286:2: rule__LabelRefinement__Group__0__Impl rule__LabelRefinement__Group__1
            {
            pushFollow(FOLLOW_rule__LabelRefinement__Group__0__Impl_in_rule__LabelRefinement__Group__06713);
            rule__LabelRefinement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelRefinement__Group__1_in_rule__LabelRefinement__Group__06716);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3293:1: rule__LabelRefinement__Group__0__Impl : ( ( rule__LabelRefinement__NameAssignment_0 ) ) ;
    public final void rule__LabelRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3297:1: ( ( ( rule__LabelRefinement__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3298:1: ( ( rule__LabelRefinement__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3298:1: ( ( rule__LabelRefinement__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3299:1: ( rule__LabelRefinement__NameAssignment_0 )
            {
             before(grammarAccess.getLabelRefinementAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3300:1: ( rule__LabelRefinement__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3300:2: rule__LabelRefinement__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__LabelRefinement__NameAssignment_0_in_rule__LabelRefinement__Group__0__Impl6743);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3310:1: rule__LabelRefinement__Group__1 : rule__LabelRefinement__Group__1__Impl rule__LabelRefinement__Group__2 ;
    public final void rule__LabelRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3314:1: ( rule__LabelRefinement__Group__1__Impl rule__LabelRefinement__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3315:2: rule__LabelRefinement__Group__1__Impl rule__LabelRefinement__Group__2
            {
            pushFollow(FOLLOW_rule__LabelRefinement__Group__1__Impl_in_rule__LabelRefinement__Group__16773);
            rule__LabelRefinement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelRefinement__Group__2_in_rule__LabelRefinement__Group__16776);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3322:1: rule__LabelRefinement__Group__1__Impl : ( 'change:' ) ;
    public final void rule__LabelRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3326:1: ( ( 'change:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3327:1: ( 'change:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3327:1: ( 'change:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3328:1: 'change:'
            {
             before(grammarAccess.getLabelRefinementAccess().getChangeKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__LabelRefinement__Group__1__Impl6804); 
             after(grammarAccess.getLabelRefinementAccess().getChangeKeyword_1()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3341:1: rule__LabelRefinement__Group__2 : rule__LabelRefinement__Group__2__Impl rule__LabelRefinement__Group__3 ;
    public final void rule__LabelRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3345:1: ( rule__LabelRefinement__Group__2__Impl rule__LabelRefinement__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3346:2: rule__LabelRefinement__Group__2__Impl rule__LabelRefinement__Group__3
            {
            pushFollow(FOLLOW_rule__LabelRefinement__Group__2__Impl_in_rule__LabelRefinement__Group__26835);
            rule__LabelRefinement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelRefinement__Group__3_in_rule__LabelRefinement__Group__26838);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3353:1: rule__LabelRefinement__Group__2__Impl : ( ( rule__LabelRefinement__IdAssignment_2 ) ) ;
    public final void rule__LabelRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3357:1: ( ( ( rule__LabelRefinement__IdAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3358:1: ( ( rule__LabelRefinement__IdAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3358:1: ( ( rule__LabelRefinement__IdAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3359:1: ( rule__LabelRefinement__IdAssignment_2 )
            {
             before(grammarAccess.getLabelRefinementAccess().getIdAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3360:1: ( rule__LabelRefinement__IdAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3360:2: rule__LabelRefinement__IdAssignment_2
            {
            pushFollow(FOLLOW_rule__LabelRefinement__IdAssignment_2_in_rule__LabelRefinement__Group__2__Impl6865);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3370:1: rule__LabelRefinement__Group__3 : rule__LabelRefinement__Group__3__Impl ;
    public final void rule__LabelRefinement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3374:1: ( rule__LabelRefinement__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3375:2: rule__LabelRefinement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__LabelRefinement__Group__3__Impl_in_rule__LabelRefinement__Group__36895);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3381:1: rule__LabelRefinement__Group__3__Impl : ( ( rule__LabelRefinement__PropertiesAssignment_3 )? ) ;
    public final void rule__LabelRefinement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3385:1: ( ( ( rule__LabelRefinement__PropertiesAssignment_3 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3386:1: ( ( rule__LabelRefinement__PropertiesAssignment_3 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3386:1: ( ( rule__LabelRefinement__PropertiesAssignment_3 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3387:1: ( rule__LabelRefinement__PropertiesAssignment_3 )?
            {
             before(grammarAccess.getLabelRefinementAccess().getPropertiesAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3388:1: ( rule__LabelRefinement__PropertiesAssignment_3 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3388:2: rule__LabelRefinement__PropertiesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__LabelRefinement__PropertiesAssignment_3_in_rule__LabelRefinement__Group__3__Impl6922);
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


    // $ANTLR start "rule__TabViewDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3406:1: rule__TabViewDefinition__Group__0 : rule__TabViewDefinition__Group__0__Impl rule__TabViewDefinition__Group__1 ;
    public final void rule__TabViewDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3410:1: ( rule__TabViewDefinition__Group__0__Impl rule__TabViewDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3411:2: rule__TabViewDefinition__Group__0__Impl rule__TabViewDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__TabViewDefinition__Group__0__Impl_in_rule__TabViewDefinition__Group__06961);
            rule__TabViewDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TabViewDefinition__Group__1_in_rule__TabViewDefinition__Group__06964);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3418:1: rule__TabViewDefinition__Group__0__Impl : ( ( rule__TabViewDefinition__NameAssignment_0 ) ) ;
    public final void rule__TabViewDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3422:1: ( ( ( rule__TabViewDefinition__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3423:1: ( ( rule__TabViewDefinition__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3423:1: ( ( rule__TabViewDefinition__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3424:1: ( rule__TabViewDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getTabViewDefinitionAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3425:1: ( rule__TabViewDefinition__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3425:2: rule__TabViewDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__TabViewDefinition__NameAssignment_0_in_rule__TabViewDefinition__Group__0__Impl6991);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3435:1: rule__TabViewDefinition__Group__1 : rule__TabViewDefinition__Group__1__Impl rule__TabViewDefinition__Group__2 ;
    public final void rule__TabViewDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3439:1: ( rule__TabViewDefinition__Group__1__Impl rule__TabViewDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3440:2: rule__TabViewDefinition__Group__1__Impl rule__TabViewDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__TabViewDefinition__Group__1__Impl_in_rule__TabViewDefinition__Group__17021);
            rule__TabViewDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TabViewDefinition__Group__2_in_rule__TabViewDefinition__Group__17024);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3447:1: rule__TabViewDefinition__Group__1__Impl : ( ( rule__TabViewDefinition__TabsAssignment_1 )* ) ;
    public final void rule__TabViewDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3451:1: ( ( ( rule__TabViewDefinition__TabsAssignment_1 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3452:1: ( ( rule__TabViewDefinition__TabsAssignment_1 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3452:1: ( ( rule__TabViewDefinition__TabsAssignment_1 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3453:1: ( rule__TabViewDefinition__TabsAssignment_1 )*
            {
             before(grammarAccess.getTabViewDefinitionAccess().getTabsAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3454:1: ( rule__TabViewDefinition__TabsAssignment_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_TABNAME) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3454:2: rule__TabViewDefinition__TabsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__TabViewDefinition__TabsAssignment_1_in_rule__TabViewDefinition__Group__1__Impl7051);
            	    rule__TabViewDefinition__TabsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3464:1: rule__TabViewDefinition__Group__2 : rule__TabViewDefinition__Group__2__Impl rule__TabViewDefinition__Group__3 ;
    public final void rule__TabViewDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3468:1: ( rule__TabViewDefinition__Group__2__Impl rule__TabViewDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3469:2: rule__TabViewDefinition__Group__2__Impl rule__TabViewDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__TabViewDefinition__Group__2__Impl_in_rule__TabViewDefinition__Group__27082);
            rule__TabViewDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TabViewDefinition__Group__3_in_rule__TabViewDefinition__Group__27085);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3476:1: rule__TabViewDefinition__Group__2__Impl : ( 'as:' ) ;
    public final void rule__TabViewDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3480:1: ( ( 'as:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3481:1: ( 'as:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3481:1: ( 'as:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3482:1: 'as:'
            {
             before(grammarAccess.getTabViewDefinitionAccess().getAsKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__TabViewDefinition__Group__2__Impl7113); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3495:1: rule__TabViewDefinition__Group__3 : rule__TabViewDefinition__Group__3__Impl rule__TabViewDefinition__Group__4 ;
    public final void rule__TabViewDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3499:1: ( rule__TabViewDefinition__Group__3__Impl rule__TabViewDefinition__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3500:2: rule__TabViewDefinition__Group__3__Impl rule__TabViewDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__TabViewDefinition__Group__3__Impl_in_rule__TabViewDefinition__Group__37144);
            rule__TabViewDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TabViewDefinition__Group__4_in_rule__TabViewDefinition__Group__37147);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3507:1: rule__TabViewDefinition__Group__3__Impl : ( ( rule__TabViewDefinition__IdAssignment_3 ) ) ;
    public final void rule__TabViewDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3511:1: ( ( ( rule__TabViewDefinition__IdAssignment_3 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3512:1: ( ( rule__TabViewDefinition__IdAssignment_3 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3512:1: ( ( rule__TabViewDefinition__IdAssignment_3 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3513:1: ( rule__TabViewDefinition__IdAssignment_3 )
            {
             before(grammarAccess.getTabViewDefinitionAccess().getIdAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3514:1: ( rule__TabViewDefinition__IdAssignment_3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3514:2: rule__TabViewDefinition__IdAssignment_3
            {
            pushFollow(FOLLOW_rule__TabViewDefinition__IdAssignment_3_in_rule__TabViewDefinition__Group__3__Impl7174);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3524:1: rule__TabViewDefinition__Group__4 : rule__TabViewDefinition__Group__4__Impl ;
    public final void rule__TabViewDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3528:1: ( rule__TabViewDefinition__Group__4__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3529:2: rule__TabViewDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TabViewDefinition__Group__4__Impl_in_rule__TabViewDefinition__Group__47204);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3535:1: rule__TabViewDefinition__Group__4__Impl : ( ( rule__TabViewDefinition__PropertiesAssignment_4 )? ) ;
    public final void rule__TabViewDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3539:1: ( ( ( rule__TabViewDefinition__PropertiesAssignment_4 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3540:1: ( ( rule__TabViewDefinition__PropertiesAssignment_4 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3540:1: ( ( rule__TabViewDefinition__PropertiesAssignment_4 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3541:1: ( rule__TabViewDefinition__PropertiesAssignment_4 )?
            {
             before(grammarAccess.getTabViewDefinitionAccess().getPropertiesAssignment_4()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3542:1: ( rule__TabViewDefinition__PropertiesAssignment_4 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==29) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3542:2: rule__TabViewDefinition__PropertiesAssignment_4
                    {
                    pushFollow(FOLLOW_rule__TabViewDefinition__PropertiesAssignment_4_in_rule__TabViewDefinition__Group__4__Impl7231);
                    rule__TabViewDefinition__PropertiesAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTabViewDefinitionAccess().getPropertiesAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Multiselection__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3562:1: rule__Multiselection__Group__0 : rule__Multiselection__Group__0__Impl rule__Multiselection__Group__1 ;
    public final void rule__Multiselection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3566:1: ( rule__Multiselection__Group__0__Impl rule__Multiselection__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3567:2: rule__Multiselection__Group__0__Impl rule__Multiselection__Group__1
            {
            pushFollow(FOLLOW_rule__Multiselection__Group__0__Impl_in_rule__Multiselection__Group__07272);
            rule__Multiselection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiselection__Group__1_in_rule__Multiselection__Group__07275);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3574:1: rule__Multiselection__Group__0__Impl : ( ( rule__Multiselection__NameAssignment_0 ) ) ;
    public final void rule__Multiselection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3578:1: ( ( ( rule__Multiselection__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3579:1: ( ( rule__Multiselection__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3579:1: ( ( rule__Multiselection__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3580:1: ( rule__Multiselection__NameAssignment_0 )
            {
             before(grammarAccess.getMultiselectionAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3581:1: ( rule__Multiselection__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3581:2: rule__Multiselection__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Multiselection__NameAssignment_0_in_rule__Multiselection__Group__0__Impl7302);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3591:1: rule__Multiselection__Group__1 : rule__Multiselection__Group__1__Impl ;
    public final void rule__Multiselection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3595:1: ( rule__Multiselection__Group__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3596:2: rule__Multiselection__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiselection__Group__1__Impl_in_rule__Multiselection__Group__17332);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3602:1: rule__Multiselection__Group__1__Impl : ( ( rule__Multiselection__InputTypeAssignment_1 )? ) ;
    public final void rule__Multiselection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3606:1: ( ( ( rule__Multiselection__InputTypeAssignment_1 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3607:1: ( ( rule__Multiselection__InputTypeAssignment_1 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3607:1: ( ( rule__Multiselection__InputTypeAssignment_1 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3608:1: ( rule__Multiselection__InputTypeAssignment_1 )?
            {
             before(grammarAccess.getMultiselectionAccess().getInputTypeAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3609:1: ( rule__Multiselection__InputTypeAssignment_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_INPUT_DESCRIPTION) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3609:2: rule__Multiselection__InputTypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Multiselection__InputTypeAssignment_1_in_rule__Multiselection__Group__1__Impl7359);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3623:1: rule__TextfieldDefinition__Group__0 : rule__TextfieldDefinition__Group__0__Impl rule__TextfieldDefinition__Group__1 ;
    public final void rule__TextfieldDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3627:1: ( rule__TextfieldDefinition__Group__0__Impl rule__TextfieldDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3628:2: rule__TextfieldDefinition__Group__0__Impl rule__TextfieldDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__0__Impl_in_rule__TextfieldDefinition__Group__07394);
            rule__TextfieldDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__1_in_rule__TextfieldDefinition__Group__07397);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3635:1: rule__TextfieldDefinition__Group__0__Impl : ( ( rule__TextfieldDefinition__NameAssignment_0 ) ) ;
    public final void rule__TextfieldDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3639:1: ( ( ( rule__TextfieldDefinition__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3640:1: ( ( rule__TextfieldDefinition__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3640:1: ( ( rule__TextfieldDefinition__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3641:1: ( rule__TextfieldDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getTextfieldDefinitionAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3642:1: ( rule__TextfieldDefinition__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3642:2: rule__TextfieldDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__NameAssignment_0_in_rule__TextfieldDefinition__Group__0__Impl7424);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3652:1: rule__TextfieldDefinition__Group__1 : rule__TextfieldDefinition__Group__1__Impl rule__TextfieldDefinition__Group__2 ;
    public final void rule__TextfieldDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3656:1: ( rule__TextfieldDefinition__Group__1__Impl rule__TextfieldDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3657:2: rule__TextfieldDefinition__Group__1__Impl rule__TextfieldDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__1__Impl_in_rule__TextfieldDefinition__Group__17454);
            rule__TextfieldDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__2_in_rule__TextfieldDefinition__Group__17457);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3664:1: rule__TextfieldDefinition__Group__1__Impl : ( 'as:' ) ;
    public final void rule__TextfieldDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3668:1: ( ( 'as:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3669:1: ( 'as:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3669:1: ( 'as:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3670:1: 'as:'
            {
             before(grammarAccess.getTextfieldDefinitionAccess().getAsKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__TextfieldDefinition__Group__1__Impl7485); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3683:1: rule__TextfieldDefinition__Group__2 : rule__TextfieldDefinition__Group__2__Impl rule__TextfieldDefinition__Group__3 ;
    public final void rule__TextfieldDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3687:1: ( rule__TextfieldDefinition__Group__2__Impl rule__TextfieldDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3688:2: rule__TextfieldDefinition__Group__2__Impl rule__TextfieldDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__2__Impl_in_rule__TextfieldDefinition__Group__27516);
            rule__TextfieldDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__3_in_rule__TextfieldDefinition__Group__27519);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3695:1: rule__TextfieldDefinition__Group__2__Impl : ( ( rule__TextfieldDefinition__IdAssignment_2 ) ) ;
    public final void rule__TextfieldDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3699:1: ( ( ( rule__TextfieldDefinition__IdAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3700:1: ( ( rule__TextfieldDefinition__IdAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3700:1: ( ( rule__TextfieldDefinition__IdAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3701:1: ( rule__TextfieldDefinition__IdAssignment_2 )
            {
             before(grammarAccess.getTextfieldDefinitionAccess().getIdAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3702:1: ( rule__TextfieldDefinition__IdAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3702:2: rule__TextfieldDefinition__IdAssignment_2
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__IdAssignment_2_in_rule__TextfieldDefinition__Group__2__Impl7546);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3712:1: rule__TextfieldDefinition__Group__3 : rule__TextfieldDefinition__Group__3__Impl ;
    public final void rule__TextfieldDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3716:1: ( rule__TextfieldDefinition__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3717:2: rule__TextfieldDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TextfieldDefinition__Group__3__Impl_in_rule__TextfieldDefinition__Group__37576);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3723:1: rule__TextfieldDefinition__Group__3__Impl : ( ( rule__TextfieldDefinition__PropertiesAssignment_3 )? ) ;
    public final void rule__TextfieldDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3727:1: ( ( ( rule__TextfieldDefinition__PropertiesAssignment_3 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3728:1: ( ( rule__TextfieldDefinition__PropertiesAssignment_3 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3728:1: ( ( rule__TextfieldDefinition__PropertiesAssignment_3 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3729:1: ( rule__TextfieldDefinition__PropertiesAssignment_3 )?
            {
             before(grammarAccess.getTextfieldDefinitionAccess().getPropertiesAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3730:1: ( rule__TextfieldDefinition__PropertiesAssignment_3 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==29) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3730:2: rule__TextfieldDefinition__PropertiesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__TextfieldDefinition__PropertiesAssignment_3_in_rule__TextfieldDefinition__Group__3__Impl7603);
                    rule__TextfieldDefinition__PropertiesAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextfieldDefinitionAccess().getPropertiesAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__TextareaDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3748:1: rule__TextareaDefinition__Group__0 : rule__TextareaDefinition__Group__0__Impl rule__TextareaDefinition__Group__1 ;
    public final void rule__TextareaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3752:1: ( rule__TextareaDefinition__Group__0__Impl rule__TextareaDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3753:2: rule__TextareaDefinition__Group__0__Impl rule__TextareaDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__TextareaDefinition__Group__0__Impl_in_rule__TextareaDefinition__Group__07642);
            rule__TextareaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextareaDefinition__Group__1_in_rule__TextareaDefinition__Group__07645);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3760:1: rule__TextareaDefinition__Group__0__Impl : ( ( rule__TextareaDefinition__NameAssignment_0 ) ) ;
    public final void rule__TextareaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3764:1: ( ( ( rule__TextareaDefinition__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3765:1: ( ( rule__TextareaDefinition__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3765:1: ( ( rule__TextareaDefinition__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3766:1: ( rule__TextareaDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getTextareaDefinitionAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3767:1: ( rule__TextareaDefinition__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3767:2: rule__TextareaDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__TextareaDefinition__NameAssignment_0_in_rule__TextareaDefinition__Group__0__Impl7672);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3777:1: rule__TextareaDefinition__Group__1 : rule__TextareaDefinition__Group__1__Impl rule__TextareaDefinition__Group__2 ;
    public final void rule__TextareaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3781:1: ( rule__TextareaDefinition__Group__1__Impl rule__TextareaDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3782:2: rule__TextareaDefinition__Group__1__Impl rule__TextareaDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__TextareaDefinition__Group__1__Impl_in_rule__TextareaDefinition__Group__17702);
            rule__TextareaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextareaDefinition__Group__2_in_rule__TextareaDefinition__Group__17705);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3789:1: rule__TextareaDefinition__Group__1__Impl : ( 'as:' ) ;
    public final void rule__TextareaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3793:1: ( ( 'as:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3794:1: ( 'as:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3794:1: ( 'as:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3795:1: 'as:'
            {
             before(grammarAccess.getTextareaDefinitionAccess().getAsKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__TextareaDefinition__Group__1__Impl7733); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3808:1: rule__TextareaDefinition__Group__2 : rule__TextareaDefinition__Group__2__Impl rule__TextareaDefinition__Group__3 ;
    public final void rule__TextareaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3812:1: ( rule__TextareaDefinition__Group__2__Impl rule__TextareaDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3813:2: rule__TextareaDefinition__Group__2__Impl rule__TextareaDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__TextareaDefinition__Group__2__Impl_in_rule__TextareaDefinition__Group__27764);
            rule__TextareaDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextareaDefinition__Group__3_in_rule__TextareaDefinition__Group__27767);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3820:1: rule__TextareaDefinition__Group__2__Impl : ( ( rule__TextareaDefinition__IdAssignment_2 ) ) ;
    public final void rule__TextareaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3824:1: ( ( ( rule__TextareaDefinition__IdAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3825:1: ( ( rule__TextareaDefinition__IdAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3825:1: ( ( rule__TextareaDefinition__IdAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3826:1: ( rule__TextareaDefinition__IdAssignment_2 )
            {
             before(grammarAccess.getTextareaDefinitionAccess().getIdAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3827:1: ( rule__TextareaDefinition__IdAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3827:2: rule__TextareaDefinition__IdAssignment_2
            {
            pushFollow(FOLLOW_rule__TextareaDefinition__IdAssignment_2_in_rule__TextareaDefinition__Group__2__Impl7794);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3837:1: rule__TextareaDefinition__Group__3 : rule__TextareaDefinition__Group__3__Impl ;
    public final void rule__TextareaDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3841:1: ( rule__TextareaDefinition__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3842:2: rule__TextareaDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TextareaDefinition__Group__3__Impl_in_rule__TextareaDefinition__Group__37824);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3848:1: rule__TextareaDefinition__Group__3__Impl : ( ( rule__TextareaDefinition__PropertiesAssignment_3 )? ) ;
    public final void rule__TextareaDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3852:1: ( ( ( rule__TextareaDefinition__PropertiesAssignment_3 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3853:1: ( ( rule__TextareaDefinition__PropertiesAssignment_3 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3853:1: ( ( rule__TextareaDefinition__PropertiesAssignment_3 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3854:1: ( rule__TextareaDefinition__PropertiesAssignment_3 )?
            {
             before(grammarAccess.getTextareaDefinitionAccess().getPropertiesAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3855:1: ( rule__TextareaDefinition__PropertiesAssignment_3 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==29) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3855:2: rule__TextareaDefinition__PropertiesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__TextareaDefinition__PropertiesAssignment_3_in_rule__TextareaDefinition__Group__3__Impl7851);
                    rule__TextareaDefinition__PropertiesAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextareaDefinitionAccess().getPropertiesAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__TreeDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3873:1: rule__TreeDefinition__Group__0 : rule__TreeDefinition__Group__0__Impl rule__TreeDefinition__Group__1 ;
    public final void rule__TreeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3877:1: ( rule__TreeDefinition__Group__0__Impl rule__TreeDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3878:2: rule__TreeDefinition__Group__0__Impl rule__TreeDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group__0__Impl_in_rule__TreeDefinition__Group__07890);
            rule__TreeDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TreeDefinition__Group__1_in_rule__TreeDefinition__Group__07893);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3885:1: rule__TreeDefinition__Group__0__Impl : ( ( rule__TreeDefinition__NameAssignment_0 ) ) ;
    public final void rule__TreeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3889:1: ( ( ( rule__TreeDefinition__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3890:1: ( ( rule__TreeDefinition__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3890:1: ( ( rule__TreeDefinition__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3891:1: ( rule__TreeDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getTreeDefinitionAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3892:1: ( rule__TreeDefinition__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3892:2: rule__TreeDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__TreeDefinition__NameAssignment_0_in_rule__TreeDefinition__Group__0__Impl7920);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3902:1: rule__TreeDefinition__Group__1 : rule__TreeDefinition__Group__1__Impl rule__TreeDefinition__Group__2 ;
    public final void rule__TreeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3906:1: ( rule__TreeDefinition__Group__1__Impl rule__TreeDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3907:2: rule__TreeDefinition__Group__1__Impl rule__TreeDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group__1__Impl_in_rule__TreeDefinition__Group__17950);
            rule__TreeDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TreeDefinition__Group__2_in_rule__TreeDefinition__Group__17953);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3914:1: rule__TreeDefinition__Group__1__Impl : ( ( rule__TreeDefinition__InputTypeAssignment_1 )? ) ;
    public final void rule__TreeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3918:1: ( ( ( rule__TreeDefinition__InputTypeAssignment_1 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3919:1: ( ( rule__TreeDefinition__InputTypeAssignment_1 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3919:1: ( ( rule__TreeDefinition__InputTypeAssignment_1 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3920:1: ( rule__TreeDefinition__InputTypeAssignment_1 )?
            {
             before(grammarAccess.getTreeDefinitionAccess().getInputTypeAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3921:1: ( rule__TreeDefinition__InputTypeAssignment_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_INPUT_DESCRIPTION) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3921:2: rule__TreeDefinition__InputTypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TreeDefinition__InputTypeAssignment_1_in_rule__TreeDefinition__Group__1__Impl7980);
                    rule__TreeDefinition__InputTypeAssignment_1();

                    state._fsp--;


                    }
                    break;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3931:1: rule__TreeDefinition__Group__2 : rule__TreeDefinition__Group__2__Impl rule__TreeDefinition__Group__3 ;
    public final void rule__TreeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3935:1: ( rule__TreeDefinition__Group__2__Impl rule__TreeDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3936:2: rule__TreeDefinition__Group__2__Impl rule__TreeDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group__2__Impl_in_rule__TreeDefinition__Group__28011);
            rule__TreeDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TreeDefinition__Group__3_in_rule__TreeDefinition__Group__28014);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3943:1: rule__TreeDefinition__Group__2__Impl : ( 'as:' ) ;
    public final void rule__TreeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3947:1: ( ( 'as:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3948:1: ( 'as:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3948:1: ( 'as:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3949:1: 'as:'
            {
             before(grammarAccess.getTreeDefinitionAccess().getAsKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__TreeDefinition__Group__2__Impl8042); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3962:1: rule__TreeDefinition__Group__3 : rule__TreeDefinition__Group__3__Impl rule__TreeDefinition__Group__4 ;
    public final void rule__TreeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3966:1: ( rule__TreeDefinition__Group__3__Impl rule__TreeDefinition__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3967:2: rule__TreeDefinition__Group__3__Impl rule__TreeDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group__3__Impl_in_rule__TreeDefinition__Group__38073);
            rule__TreeDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TreeDefinition__Group__4_in_rule__TreeDefinition__Group__38076);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3974:1: rule__TreeDefinition__Group__3__Impl : ( ( rule__TreeDefinition__IdAssignment_3 ) ) ;
    public final void rule__TreeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3978:1: ( ( ( rule__TreeDefinition__IdAssignment_3 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3979:1: ( ( rule__TreeDefinition__IdAssignment_3 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3979:1: ( ( rule__TreeDefinition__IdAssignment_3 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3980:1: ( rule__TreeDefinition__IdAssignment_3 )
            {
             before(grammarAccess.getTreeDefinitionAccess().getIdAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3981:1: ( rule__TreeDefinition__IdAssignment_3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3981:2: rule__TreeDefinition__IdAssignment_3
            {
            pushFollow(FOLLOW_rule__TreeDefinition__IdAssignment_3_in_rule__TreeDefinition__Group__3__Impl8103);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3991:1: rule__TreeDefinition__Group__4 : rule__TreeDefinition__Group__4__Impl ;
    public final void rule__TreeDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3995:1: ( rule__TreeDefinition__Group__4__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:3996:2: rule__TreeDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TreeDefinition__Group__4__Impl_in_rule__TreeDefinition__Group__48133);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4002:1: rule__TreeDefinition__Group__4__Impl : ( ( rule__TreeDefinition__PropertiesAssignment_4 )? ) ;
    public final void rule__TreeDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4006:1: ( ( ( rule__TreeDefinition__PropertiesAssignment_4 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4007:1: ( ( rule__TreeDefinition__PropertiesAssignment_4 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4007:1: ( ( rule__TreeDefinition__PropertiesAssignment_4 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4008:1: ( rule__TreeDefinition__PropertiesAssignment_4 )?
            {
             before(grammarAccess.getTreeDefinitionAccess().getPropertiesAssignment_4()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4009:1: ( rule__TreeDefinition__PropertiesAssignment_4 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==29) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4009:2: rule__TreeDefinition__PropertiesAssignment_4
                    {
                    pushFollow(FOLLOW_rule__TreeDefinition__PropertiesAssignment_4_in_rule__TreeDefinition__Group__4__Impl8160);
                    rule__TreeDefinition__PropertiesAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTreeDefinitionAccess().getPropertiesAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__TableDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4029:1: rule__TableDefinition__Group__0 : rule__TableDefinition__Group__0__Impl rule__TableDefinition__Group__1 ;
    public final void rule__TableDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4033:1: ( rule__TableDefinition__Group__0__Impl rule__TableDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4034:2: rule__TableDefinition__Group__0__Impl rule__TableDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group__0__Impl_in_rule__TableDefinition__Group__08201);
            rule__TableDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableDefinition__Group__1_in_rule__TableDefinition__Group__08204);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4041:1: rule__TableDefinition__Group__0__Impl : ( ( rule__TableDefinition__NameAssignment_0 ) ) ;
    public final void rule__TableDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4045:1: ( ( ( rule__TableDefinition__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4046:1: ( ( rule__TableDefinition__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4046:1: ( ( rule__TableDefinition__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4047:1: ( rule__TableDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getTableDefinitionAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4048:1: ( rule__TableDefinition__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4048:2: rule__TableDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__TableDefinition__NameAssignment_0_in_rule__TableDefinition__Group__0__Impl8231);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4058:1: rule__TableDefinition__Group__1 : rule__TableDefinition__Group__1__Impl rule__TableDefinition__Group__2 ;
    public final void rule__TableDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4062:1: ( rule__TableDefinition__Group__1__Impl rule__TableDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4063:2: rule__TableDefinition__Group__1__Impl rule__TableDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group__1__Impl_in_rule__TableDefinition__Group__18261);
            rule__TableDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableDefinition__Group__2_in_rule__TableDefinition__Group__18264);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4070:1: rule__TableDefinition__Group__1__Impl : ( ( rule__TableDefinition__InputTypeAssignment_1 )? ) ;
    public final void rule__TableDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4074:1: ( ( ( rule__TableDefinition__InputTypeAssignment_1 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4075:1: ( ( rule__TableDefinition__InputTypeAssignment_1 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4075:1: ( ( rule__TableDefinition__InputTypeAssignment_1 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4076:1: ( rule__TableDefinition__InputTypeAssignment_1 )?
            {
             before(grammarAccess.getTableDefinitionAccess().getInputTypeAssignment_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4077:1: ( rule__TableDefinition__InputTypeAssignment_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_INPUT_DESCRIPTION) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4077:2: rule__TableDefinition__InputTypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TableDefinition__InputTypeAssignment_1_in_rule__TableDefinition__Group__1__Impl8291);
                    rule__TableDefinition__InputTypeAssignment_1();

                    state._fsp--;


                    }
                    break;

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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4087:1: rule__TableDefinition__Group__2 : rule__TableDefinition__Group__2__Impl rule__TableDefinition__Group__3 ;
    public final void rule__TableDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4091:1: ( rule__TableDefinition__Group__2__Impl rule__TableDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4092:2: rule__TableDefinition__Group__2__Impl rule__TableDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group__2__Impl_in_rule__TableDefinition__Group__28322);
            rule__TableDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableDefinition__Group__3_in_rule__TableDefinition__Group__28325);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4099:1: rule__TableDefinition__Group__2__Impl : ( 'as:' ) ;
    public final void rule__TableDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4103:1: ( ( 'as:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4104:1: ( 'as:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4104:1: ( 'as:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4105:1: 'as:'
            {
             before(grammarAccess.getTableDefinitionAccess().getAsKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__TableDefinition__Group__2__Impl8353); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4118:1: rule__TableDefinition__Group__3 : rule__TableDefinition__Group__3__Impl rule__TableDefinition__Group__4 ;
    public final void rule__TableDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4122:1: ( rule__TableDefinition__Group__3__Impl rule__TableDefinition__Group__4 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4123:2: rule__TableDefinition__Group__3__Impl rule__TableDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group__3__Impl_in_rule__TableDefinition__Group__38384);
            rule__TableDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableDefinition__Group__4_in_rule__TableDefinition__Group__38387);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4130:1: rule__TableDefinition__Group__3__Impl : ( ( rule__TableDefinition__IdAssignment_3 ) ) ;
    public final void rule__TableDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4134:1: ( ( ( rule__TableDefinition__IdAssignment_3 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4135:1: ( ( rule__TableDefinition__IdAssignment_3 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4135:1: ( ( rule__TableDefinition__IdAssignment_3 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4136:1: ( rule__TableDefinition__IdAssignment_3 )
            {
             before(grammarAccess.getTableDefinitionAccess().getIdAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4137:1: ( rule__TableDefinition__IdAssignment_3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4137:2: rule__TableDefinition__IdAssignment_3
            {
            pushFollow(FOLLOW_rule__TableDefinition__IdAssignment_3_in_rule__TableDefinition__Group__3__Impl8414);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4147:1: rule__TableDefinition__Group__4 : rule__TableDefinition__Group__4__Impl ;
    public final void rule__TableDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4151:1: ( rule__TableDefinition__Group__4__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4152:2: rule__TableDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TableDefinition__Group__4__Impl_in_rule__TableDefinition__Group__48444);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4158:1: rule__TableDefinition__Group__4__Impl : ( ( rule__TableDefinition__PropertiesAssignment_4 )? ) ;
    public final void rule__TableDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4162:1: ( ( ( rule__TableDefinition__PropertiesAssignment_4 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4163:1: ( ( rule__TableDefinition__PropertiesAssignment_4 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4163:1: ( ( rule__TableDefinition__PropertiesAssignment_4 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4164:1: ( rule__TableDefinition__PropertiesAssignment_4 )?
            {
             before(grammarAccess.getTableDefinitionAccess().getPropertiesAssignment_4()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4165:1: ( rule__TableDefinition__PropertiesAssignment_4 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==29) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4165:2: rule__TableDefinition__PropertiesAssignment_4
                    {
                    pushFollow(FOLLOW_rule__TableDefinition__PropertiesAssignment_4_in_rule__TableDefinition__Group__4__Impl8471);
                    rule__TableDefinition__PropertiesAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableDefinitionAccess().getPropertiesAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__InterchangeableDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4185:1: rule__InterchangeableDefinition__Group__0 : rule__InterchangeableDefinition__Group__0__Impl rule__InterchangeableDefinition__Group__1 ;
    public final void rule__InterchangeableDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4189:1: ( rule__InterchangeableDefinition__Group__0__Impl rule__InterchangeableDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4190:2: rule__InterchangeableDefinition__Group__0__Impl rule__InterchangeableDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__InterchangeableDefinition__Group__0__Impl_in_rule__InterchangeableDefinition__Group__08512);
            rule__InterchangeableDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterchangeableDefinition__Group__1_in_rule__InterchangeableDefinition__Group__08515);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4197:1: rule__InterchangeableDefinition__Group__0__Impl : ( ( rule__InterchangeableDefinition__NameAssignment_0 ) ) ;
    public final void rule__InterchangeableDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4201:1: ( ( ( rule__InterchangeableDefinition__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4202:1: ( ( rule__InterchangeableDefinition__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4202:1: ( ( rule__InterchangeableDefinition__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4203:1: ( rule__InterchangeableDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getInterchangeableDefinitionAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4204:1: ( rule__InterchangeableDefinition__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4204:2: rule__InterchangeableDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__InterchangeableDefinition__NameAssignment_0_in_rule__InterchangeableDefinition__Group__0__Impl8542);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4214:1: rule__InterchangeableDefinition__Group__1 : rule__InterchangeableDefinition__Group__1__Impl rule__InterchangeableDefinition__Group__2 ;
    public final void rule__InterchangeableDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4218:1: ( rule__InterchangeableDefinition__Group__1__Impl rule__InterchangeableDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4219:2: rule__InterchangeableDefinition__Group__1__Impl rule__InterchangeableDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__InterchangeableDefinition__Group__1__Impl_in_rule__InterchangeableDefinition__Group__18572);
            rule__InterchangeableDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterchangeableDefinition__Group__2_in_rule__InterchangeableDefinition__Group__18575);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4226:1: rule__InterchangeableDefinition__Group__1__Impl : ( 'as:' ) ;
    public final void rule__InterchangeableDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4230:1: ( ( 'as:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4231:1: ( 'as:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4231:1: ( 'as:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4232:1: 'as:'
            {
             before(grammarAccess.getInterchangeableDefinitionAccess().getAsKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__InterchangeableDefinition__Group__1__Impl8603); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4245:1: rule__InterchangeableDefinition__Group__2 : rule__InterchangeableDefinition__Group__2__Impl rule__InterchangeableDefinition__Group__3 ;
    public final void rule__InterchangeableDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4249:1: ( rule__InterchangeableDefinition__Group__2__Impl rule__InterchangeableDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4250:2: rule__InterchangeableDefinition__Group__2__Impl rule__InterchangeableDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__InterchangeableDefinition__Group__2__Impl_in_rule__InterchangeableDefinition__Group__28634);
            rule__InterchangeableDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterchangeableDefinition__Group__3_in_rule__InterchangeableDefinition__Group__28637);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4257:1: rule__InterchangeableDefinition__Group__2__Impl : ( ( rule__InterchangeableDefinition__IdAssignment_2 ) ) ;
    public final void rule__InterchangeableDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4261:1: ( ( ( rule__InterchangeableDefinition__IdAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4262:1: ( ( rule__InterchangeableDefinition__IdAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4262:1: ( ( rule__InterchangeableDefinition__IdAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4263:1: ( rule__InterchangeableDefinition__IdAssignment_2 )
            {
             before(grammarAccess.getInterchangeableDefinitionAccess().getIdAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4264:1: ( rule__InterchangeableDefinition__IdAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4264:2: rule__InterchangeableDefinition__IdAssignment_2
            {
            pushFollow(FOLLOW_rule__InterchangeableDefinition__IdAssignment_2_in_rule__InterchangeableDefinition__Group__2__Impl8664);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4274:1: rule__InterchangeableDefinition__Group__3 : rule__InterchangeableDefinition__Group__3__Impl ;
    public final void rule__InterchangeableDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4278:1: ( rule__InterchangeableDefinition__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4279:2: rule__InterchangeableDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__InterchangeableDefinition__Group__3__Impl_in_rule__InterchangeableDefinition__Group__38694);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4285:1: rule__InterchangeableDefinition__Group__3__Impl : ( ( rule__InterchangeableDefinition__PropertiesAssignment_3 )? ) ;
    public final void rule__InterchangeableDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4289:1: ( ( ( rule__InterchangeableDefinition__PropertiesAssignment_3 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4290:1: ( ( rule__InterchangeableDefinition__PropertiesAssignment_3 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4290:1: ( ( rule__InterchangeableDefinition__PropertiesAssignment_3 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4291:1: ( rule__InterchangeableDefinition__PropertiesAssignment_3 )?
            {
             before(grammarAccess.getInterchangeableDefinitionAccess().getPropertiesAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4292:1: ( rule__InterchangeableDefinition__PropertiesAssignment_3 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==29) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4292:2: rule__InterchangeableDefinition__PropertiesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__InterchangeableDefinition__PropertiesAssignment_3_in_rule__InterchangeableDefinition__Group__3__Impl8721);
                    rule__InterchangeableDefinition__PropertiesAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterchangeableDefinitionAccess().getPropertiesAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__ButtonDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4310:1: rule__ButtonDefinition__Group__0 : rule__ButtonDefinition__Group__0__Impl rule__ButtonDefinition__Group__1 ;
    public final void rule__ButtonDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4314:1: ( rule__ButtonDefinition__Group__0__Impl rule__ButtonDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4315:2: rule__ButtonDefinition__Group__0__Impl rule__ButtonDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__0__Impl_in_rule__ButtonDefinition__Group__08760);
            rule__ButtonDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonDefinition__Group__1_in_rule__ButtonDefinition__Group__08763);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4322:1: rule__ButtonDefinition__Group__0__Impl : ( ( rule__ButtonDefinition__NameAssignment_0 ) ) ;
    public final void rule__ButtonDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4326:1: ( ( ( rule__ButtonDefinition__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4327:1: ( ( rule__ButtonDefinition__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4327:1: ( ( rule__ButtonDefinition__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4328:1: ( rule__ButtonDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getButtonDefinitionAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4329:1: ( rule__ButtonDefinition__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4329:2: rule__ButtonDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__NameAssignment_0_in_rule__ButtonDefinition__Group__0__Impl8790);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4339:1: rule__ButtonDefinition__Group__1 : rule__ButtonDefinition__Group__1__Impl rule__ButtonDefinition__Group__2 ;
    public final void rule__ButtonDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4343:1: ( rule__ButtonDefinition__Group__1__Impl rule__ButtonDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4344:2: rule__ButtonDefinition__Group__1__Impl rule__ButtonDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__1__Impl_in_rule__ButtonDefinition__Group__18820);
            rule__ButtonDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonDefinition__Group__2_in_rule__ButtonDefinition__Group__18823);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4351:1: rule__ButtonDefinition__Group__1__Impl : ( 'as:' ) ;
    public final void rule__ButtonDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4355:1: ( ( 'as:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4356:1: ( 'as:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4356:1: ( 'as:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4357:1: 'as:'
            {
             before(grammarAccess.getButtonDefinitionAccess().getAsKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__ButtonDefinition__Group__1__Impl8851); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4370:1: rule__ButtonDefinition__Group__2 : rule__ButtonDefinition__Group__2__Impl rule__ButtonDefinition__Group__3 ;
    public final void rule__ButtonDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4374:1: ( rule__ButtonDefinition__Group__2__Impl rule__ButtonDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4375:2: rule__ButtonDefinition__Group__2__Impl rule__ButtonDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__2__Impl_in_rule__ButtonDefinition__Group__28882);
            rule__ButtonDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonDefinition__Group__3_in_rule__ButtonDefinition__Group__28885);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4382:1: rule__ButtonDefinition__Group__2__Impl : ( ( rule__ButtonDefinition__IdAssignment_2 ) ) ;
    public final void rule__ButtonDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4386:1: ( ( ( rule__ButtonDefinition__IdAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4387:1: ( ( rule__ButtonDefinition__IdAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4387:1: ( ( rule__ButtonDefinition__IdAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4388:1: ( rule__ButtonDefinition__IdAssignment_2 )
            {
             before(grammarAccess.getButtonDefinitionAccess().getIdAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4389:1: ( rule__ButtonDefinition__IdAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4389:2: rule__ButtonDefinition__IdAssignment_2
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__IdAssignment_2_in_rule__ButtonDefinition__Group__2__Impl8912);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4399:1: rule__ButtonDefinition__Group__3 : rule__ButtonDefinition__Group__3__Impl ;
    public final void rule__ButtonDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4403:1: ( rule__ButtonDefinition__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4404:2: rule__ButtonDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ButtonDefinition__Group__3__Impl_in_rule__ButtonDefinition__Group__38942);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4410:1: rule__ButtonDefinition__Group__3__Impl : ( ( rule__ButtonDefinition__PropertiesAssignment_3 )? ) ;
    public final void rule__ButtonDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4414:1: ( ( ( rule__ButtonDefinition__PropertiesAssignment_3 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4415:1: ( ( rule__ButtonDefinition__PropertiesAssignment_3 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4415:1: ( ( rule__ButtonDefinition__PropertiesAssignment_3 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4416:1: ( rule__ButtonDefinition__PropertiesAssignment_3 )?
            {
             before(grammarAccess.getButtonDefinitionAccess().getPropertiesAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4417:1: ( rule__ButtonDefinition__PropertiesAssignment_3 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==29) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4417:2: rule__ButtonDefinition__PropertiesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__ButtonDefinition__PropertiesAssignment_3_in_rule__ButtonDefinition__Group__3__Impl8969);
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


    // $ANTLR start "rule__LabelDefinition__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4435:1: rule__LabelDefinition__Group__0 : rule__LabelDefinition__Group__0__Impl rule__LabelDefinition__Group__1 ;
    public final void rule__LabelDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4439:1: ( rule__LabelDefinition__Group__0__Impl rule__LabelDefinition__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4440:2: rule__LabelDefinition__Group__0__Impl rule__LabelDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__0__Impl_in_rule__LabelDefinition__Group__09008);
            rule__LabelDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelDefinition__Group__1_in_rule__LabelDefinition__Group__09011);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4447:1: rule__LabelDefinition__Group__0__Impl : ( ( rule__LabelDefinition__NameAssignment_0 ) ) ;
    public final void rule__LabelDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4451:1: ( ( ( rule__LabelDefinition__NameAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4452:1: ( ( rule__LabelDefinition__NameAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4452:1: ( ( rule__LabelDefinition__NameAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4453:1: ( rule__LabelDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getLabelDefinitionAccess().getNameAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4454:1: ( rule__LabelDefinition__NameAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4454:2: rule__LabelDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__LabelDefinition__NameAssignment_0_in_rule__LabelDefinition__Group__0__Impl9038);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4464:1: rule__LabelDefinition__Group__1 : rule__LabelDefinition__Group__1__Impl rule__LabelDefinition__Group__2 ;
    public final void rule__LabelDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4468:1: ( rule__LabelDefinition__Group__1__Impl rule__LabelDefinition__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4469:2: rule__LabelDefinition__Group__1__Impl rule__LabelDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__1__Impl_in_rule__LabelDefinition__Group__19068);
            rule__LabelDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelDefinition__Group__2_in_rule__LabelDefinition__Group__19071);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4476:1: rule__LabelDefinition__Group__1__Impl : ( 'as:' ) ;
    public final void rule__LabelDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4480:1: ( ( 'as:' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4481:1: ( 'as:' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4481:1: ( 'as:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4482:1: 'as:'
            {
             before(grammarAccess.getLabelDefinitionAccess().getAsKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__LabelDefinition__Group__1__Impl9099); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4495:1: rule__LabelDefinition__Group__2 : rule__LabelDefinition__Group__2__Impl rule__LabelDefinition__Group__3 ;
    public final void rule__LabelDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4499:1: ( rule__LabelDefinition__Group__2__Impl rule__LabelDefinition__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4500:2: rule__LabelDefinition__Group__2__Impl rule__LabelDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__2__Impl_in_rule__LabelDefinition__Group__29130);
            rule__LabelDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelDefinition__Group__3_in_rule__LabelDefinition__Group__29133);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4507:1: rule__LabelDefinition__Group__2__Impl : ( ( rule__LabelDefinition__IdAssignment_2 ) ) ;
    public final void rule__LabelDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4511:1: ( ( ( rule__LabelDefinition__IdAssignment_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4512:1: ( ( rule__LabelDefinition__IdAssignment_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4512:1: ( ( rule__LabelDefinition__IdAssignment_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4513:1: ( rule__LabelDefinition__IdAssignment_2 )
            {
             before(grammarAccess.getLabelDefinitionAccess().getIdAssignment_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4514:1: ( rule__LabelDefinition__IdAssignment_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4514:2: rule__LabelDefinition__IdAssignment_2
            {
            pushFollow(FOLLOW_rule__LabelDefinition__IdAssignment_2_in_rule__LabelDefinition__Group__2__Impl9160);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4524:1: rule__LabelDefinition__Group__3 : rule__LabelDefinition__Group__3__Impl ;
    public final void rule__LabelDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4528:1: ( rule__LabelDefinition__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4529:2: rule__LabelDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__LabelDefinition__Group__3__Impl_in_rule__LabelDefinition__Group__39190);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4535:1: rule__LabelDefinition__Group__3__Impl : ( ( rule__LabelDefinition__PropertiesAssignment_3 )? ) ;
    public final void rule__LabelDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4539:1: ( ( ( rule__LabelDefinition__PropertiesAssignment_3 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4540:1: ( ( rule__LabelDefinition__PropertiesAssignment_3 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4540:1: ( ( rule__LabelDefinition__PropertiesAssignment_3 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4541:1: ( rule__LabelDefinition__PropertiesAssignment_3 )?
            {
             before(grammarAccess.getLabelDefinitionAccess().getPropertiesAssignment_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4542:1: ( rule__LabelDefinition__PropertiesAssignment_3 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==29) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4542:2: rule__LabelDefinition__PropertiesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__LabelDefinition__PropertiesAssignment_3_in_rule__LabelDefinition__Group__3__Impl9217);
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


    // $ANTLR start "rule__TextareaProperties__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4560:1: rule__TextareaProperties__Group__0 : rule__TextareaProperties__Group__0__Impl rule__TextareaProperties__Group__1 ;
    public final void rule__TextareaProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4564:1: ( rule__TextareaProperties__Group__0__Impl rule__TextareaProperties__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4565:2: rule__TextareaProperties__Group__0__Impl rule__TextareaProperties__Group__1
            {
            pushFollow(FOLLOW_rule__TextareaProperties__Group__0__Impl_in_rule__TextareaProperties__Group__09256);
            rule__TextareaProperties__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextareaProperties__Group__1_in_rule__TextareaProperties__Group__09259);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4572:1: rule__TextareaProperties__Group__0__Impl : ( ( rule__TextareaProperties__CommonPropertiesAssignment_0 ) ) ;
    public final void rule__TextareaProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4576:1: ( ( ( rule__TextareaProperties__CommonPropertiesAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4577:1: ( ( rule__TextareaProperties__CommonPropertiesAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4577:1: ( ( rule__TextareaProperties__CommonPropertiesAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4578:1: ( rule__TextareaProperties__CommonPropertiesAssignment_0 )
            {
             before(grammarAccess.getTextareaPropertiesAccess().getCommonPropertiesAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4579:1: ( rule__TextareaProperties__CommonPropertiesAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4579:2: rule__TextareaProperties__CommonPropertiesAssignment_0
            {
            pushFollow(FOLLOW_rule__TextareaProperties__CommonPropertiesAssignment_0_in_rule__TextareaProperties__Group__0__Impl9286);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4589:1: rule__TextareaProperties__Group__1 : rule__TextareaProperties__Group__1__Impl rule__TextareaProperties__Group__2 ;
    public final void rule__TextareaProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4593:1: ( rule__TextareaProperties__Group__1__Impl rule__TextareaProperties__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4594:2: rule__TextareaProperties__Group__1__Impl rule__TextareaProperties__Group__2
            {
            pushFollow(FOLLOW_rule__TextareaProperties__Group__1__Impl_in_rule__TextareaProperties__Group__19316);
            rule__TextareaProperties__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextareaProperties__Group__2_in_rule__TextareaProperties__Group__19319);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4601:1: rule__TextareaProperties__Group__1__Impl : ( ( rule__TextareaProperties__Group_1__0 )? ) ;
    public final void rule__TextareaProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4605:1: ( ( ( rule__TextareaProperties__Group_1__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4606:1: ( ( rule__TextareaProperties__Group_1__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4606:1: ( ( rule__TextareaProperties__Group_1__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4607:1: ( rule__TextareaProperties__Group_1__0 )?
            {
             before(grammarAccess.getTextareaPropertiesAccess().getGroup_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4608:1: ( rule__TextareaProperties__Group_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==27) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4608:2: rule__TextareaProperties__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TextareaProperties__Group_1__0_in_rule__TextareaProperties__Group__1__Impl9346);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4618:1: rule__TextareaProperties__Group__2 : rule__TextareaProperties__Group__2__Impl ;
    public final void rule__TextareaProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4622:1: ( rule__TextareaProperties__Group__2__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4623:2: rule__TextareaProperties__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TextareaProperties__Group__2__Impl_in_rule__TextareaProperties__Group__29377);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4629:1: rule__TextareaProperties__Group__2__Impl : ( ( rule__TextareaProperties__Group_2__0 )? ) ;
    public final void rule__TextareaProperties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4633:1: ( ( ( rule__TextareaProperties__Group_2__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4634:1: ( ( rule__TextareaProperties__Group_2__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4634:1: ( ( rule__TextareaProperties__Group_2__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4635:1: ( rule__TextareaProperties__Group_2__0 )?
            {
             before(grammarAccess.getTextareaPropertiesAccess().getGroup_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4636:1: ( rule__TextareaProperties__Group_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==28) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4636:2: rule__TextareaProperties__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TextareaProperties__Group_2__0_in_rule__TextareaProperties__Group__2__Impl9404);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4652:1: rule__TextareaProperties__Group_1__0 : rule__TextareaProperties__Group_1__0__Impl rule__TextareaProperties__Group_1__1 ;
    public final void rule__TextareaProperties__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4656:1: ( rule__TextareaProperties__Group_1__0__Impl rule__TextareaProperties__Group_1__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4657:2: rule__TextareaProperties__Group_1__0__Impl rule__TextareaProperties__Group_1__1
            {
            pushFollow(FOLLOW_rule__TextareaProperties__Group_1__0__Impl_in_rule__TextareaProperties__Group_1__09441);
            rule__TextareaProperties__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextareaProperties__Group_1__1_in_rule__TextareaProperties__Group_1__09444);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4664:1: rule__TextareaProperties__Group_1__0__Impl : ( 'text=' ) ;
    public final void rule__TextareaProperties__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4668:1: ( ( 'text=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4669:1: ( 'text=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4669:1: ( 'text=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4670:1: 'text='
            {
             before(grammarAccess.getTextareaPropertiesAccess().getTextKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__TextareaProperties__Group_1__0__Impl9472); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4683:1: rule__TextareaProperties__Group_1__1 : rule__TextareaProperties__Group_1__1__Impl ;
    public final void rule__TextareaProperties__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4687:1: ( rule__TextareaProperties__Group_1__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4688:2: rule__TextareaProperties__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TextareaProperties__Group_1__1__Impl_in_rule__TextareaProperties__Group_1__19503);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4694:1: rule__TextareaProperties__Group_1__1__Impl : ( ( rule__TextareaProperties__TextAssignment_1_1 ) ) ;
    public final void rule__TextareaProperties__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4698:1: ( ( ( rule__TextareaProperties__TextAssignment_1_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4699:1: ( ( rule__TextareaProperties__TextAssignment_1_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4699:1: ( ( rule__TextareaProperties__TextAssignment_1_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4700:1: ( rule__TextareaProperties__TextAssignment_1_1 )
            {
             before(grammarAccess.getTextareaPropertiesAccess().getTextAssignment_1_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4701:1: ( rule__TextareaProperties__TextAssignment_1_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4701:2: rule__TextareaProperties__TextAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TextareaProperties__TextAssignment_1_1_in_rule__TextareaProperties__Group_1__1__Impl9530);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4715:1: rule__TextareaProperties__Group_2__0 : rule__TextareaProperties__Group_2__0__Impl rule__TextareaProperties__Group_2__1 ;
    public final void rule__TextareaProperties__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4719:1: ( rule__TextareaProperties__Group_2__0__Impl rule__TextareaProperties__Group_2__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4720:2: rule__TextareaProperties__Group_2__0__Impl rule__TextareaProperties__Group_2__1
            {
            pushFollow(FOLLOW_rule__TextareaProperties__Group_2__0__Impl_in_rule__TextareaProperties__Group_2__09564);
            rule__TextareaProperties__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextareaProperties__Group_2__1_in_rule__TextareaProperties__Group_2__09567);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4727:1: rule__TextareaProperties__Group_2__0__Impl : ( 'editable=' ) ;
    public final void rule__TextareaProperties__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4731:1: ( ( 'editable=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4732:1: ( 'editable=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4732:1: ( 'editable=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4733:1: 'editable='
            {
             before(grammarAccess.getTextareaPropertiesAccess().getEditableKeyword_2_0()); 
            match(input,28,FOLLOW_28_in_rule__TextareaProperties__Group_2__0__Impl9595); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4746:1: rule__TextareaProperties__Group_2__1 : rule__TextareaProperties__Group_2__1__Impl ;
    public final void rule__TextareaProperties__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4750:1: ( rule__TextareaProperties__Group_2__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4751:2: rule__TextareaProperties__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TextareaProperties__Group_2__1__Impl_in_rule__TextareaProperties__Group_2__19626);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4757:1: rule__TextareaProperties__Group_2__1__Impl : ( ( rule__TextareaProperties__EditableAssignment_2_1 ) ) ;
    public final void rule__TextareaProperties__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4761:1: ( ( ( rule__TextareaProperties__EditableAssignment_2_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4762:1: ( ( rule__TextareaProperties__EditableAssignment_2_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4762:1: ( ( rule__TextareaProperties__EditableAssignment_2_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4763:1: ( rule__TextareaProperties__EditableAssignment_2_1 )
            {
             before(grammarAccess.getTextareaPropertiesAccess().getEditableAssignment_2_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4764:1: ( rule__TextareaProperties__EditableAssignment_2_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4764:2: rule__TextareaProperties__EditableAssignment_2_1
            {
            pushFollow(FOLLOW_rule__TextareaProperties__EditableAssignment_2_1_in_rule__TextareaProperties__Group_2__1__Impl9653);
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


    // $ANTLR start "rule__TextfieldProperties__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4778:1: rule__TextfieldProperties__Group__0 : rule__TextfieldProperties__Group__0__Impl rule__TextfieldProperties__Group__1 ;
    public final void rule__TextfieldProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4782:1: ( rule__TextfieldProperties__Group__0__Impl rule__TextfieldProperties__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4783:2: rule__TextfieldProperties__Group__0__Impl rule__TextfieldProperties__Group__1
            {
            pushFollow(FOLLOW_rule__TextfieldProperties__Group__0__Impl_in_rule__TextfieldProperties__Group__09687);
            rule__TextfieldProperties__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextfieldProperties__Group__1_in_rule__TextfieldProperties__Group__09690);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4790:1: rule__TextfieldProperties__Group__0__Impl : ( ( rule__TextfieldProperties__CommonPropertiesAssignment_0 ) ) ;
    public final void rule__TextfieldProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4794:1: ( ( ( rule__TextfieldProperties__CommonPropertiesAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4795:1: ( ( rule__TextfieldProperties__CommonPropertiesAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4795:1: ( ( rule__TextfieldProperties__CommonPropertiesAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4796:1: ( rule__TextfieldProperties__CommonPropertiesAssignment_0 )
            {
             before(grammarAccess.getTextfieldPropertiesAccess().getCommonPropertiesAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4797:1: ( rule__TextfieldProperties__CommonPropertiesAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4797:2: rule__TextfieldProperties__CommonPropertiesAssignment_0
            {
            pushFollow(FOLLOW_rule__TextfieldProperties__CommonPropertiesAssignment_0_in_rule__TextfieldProperties__Group__0__Impl9717);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4807:1: rule__TextfieldProperties__Group__1 : rule__TextfieldProperties__Group__1__Impl rule__TextfieldProperties__Group__2 ;
    public final void rule__TextfieldProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4811:1: ( rule__TextfieldProperties__Group__1__Impl rule__TextfieldProperties__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4812:2: rule__TextfieldProperties__Group__1__Impl rule__TextfieldProperties__Group__2
            {
            pushFollow(FOLLOW_rule__TextfieldProperties__Group__1__Impl_in_rule__TextfieldProperties__Group__19747);
            rule__TextfieldProperties__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextfieldProperties__Group__2_in_rule__TextfieldProperties__Group__19750);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4819:1: rule__TextfieldProperties__Group__1__Impl : ( ( rule__TextfieldProperties__Group_1__0 )? ) ;
    public final void rule__TextfieldProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4823:1: ( ( ( rule__TextfieldProperties__Group_1__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4824:1: ( ( rule__TextfieldProperties__Group_1__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4824:1: ( ( rule__TextfieldProperties__Group_1__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4825:1: ( rule__TextfieldProperties__Group_1__0 )?
            {
             before(grammarAccess.getTextfieldPropertiesAccess().getGroup_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4826:1: ( rule__TextfieldProperties__Group_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==27) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4826:2: rule__TextfieldProperties__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TextfieldProperties__Group_1__0_in_rule__TextfieldProperties__Group__1__Impl9777);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4836:1: rule__TextfieldProperties__Group__2 : rule__TextfieldProperties__Group__2__Impl ;
    public final void rule__TextfieldProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4840:1: ( rule__TextfieldProperties__Group__2__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4841:2: rule__TextfieldProperties__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TextfieldProperties__Group__2__Impl_in_rule__TextfieldProperties__Group__29808);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4847:1: rule__TextfieldProperties__Group__2__Impl : ( ( rule__TextfieldProperties__Group_2__0 )? ) ;
    public final void rule__TextfieldProperties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4851:1: ( ( ( rule__TextfieldProperties__Group_2__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4852:1: ( ( rule__TextfieldProperties__Group_2__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4852:1: ( ( rule__TextfieldProperties__Group_2__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4853:1: ( rule__TextfieldProperties__Group_2__0 )?
            {
             before(grammarAccess.getTextfieldPropertiesAccess().getGroup_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4854:1: ( rule__TextfieldProperties__Group_2__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==28) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4854:2: rule__TextfieldProperties__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TextfieldProperties__Group_2__0_in_rule__TextfieldProperties__Group__2__Impl9835);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4870:1: rule__TextfieldProperties__Group_1__0 : rule__TextfieldProperties__Group_1__0__Impl rule__TextfieldProperties__Group_1__1 ;
    public final void rule__TextfieldProperties__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4874:1: ( rule__TextfieldProperties__Group_1__0__Impl rule__TextfieldProperties__Group_1__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4875:2: rule__TextfieldProperties__Group_1__0__Impl rule__TextfieldProperties__Group_1__1
            {
            pushFollow(FOLLOW_rule__TextfieldProperties__Group_1__0__Impl_in_rule__TextfieldProperties__Group_1__09872);
            rule__TextfieldProperties__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextfieldProperties__Group_1__1_in_rule__TextfieldProperties__Group_1__09875);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4882:1: rule__TextfieldProperties__Group_1__0__Impl : ( 'text=' ) ;
    public final void rule__TextfieldProperties__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4886:1: ( ( 'text=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4887:1: ( 'text=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4887:1: ( 'text=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4888:1: 'text='
            {
             before(grammarAccess.getTextfieldPropertiesAccess().getTextKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__TextfieldProperties__Group_1__0__Impl9903); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4901:1: rule__TextfieldProperties__Group_1__1 : rule__TextfieldProperties__Group_1__1__Impl ;
    public final void rule__TextfieldProperties__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4905:1: ( rule__TextfieldProperties__Group_1__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4906:2: rule__TextfieldProperties__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TextfieldProperties__Group_1__1__Impl_in_rule__TextfieldProperties__Group_1__19934);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4912:1: rule__TextfieldProperties__Group_1__1__Impl : ( ( rule__TextfieldProperties__TextAssignment_1_1 ) ) ;
    public final void rule__TextfieldProperties__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4916:1: ( ( ( rule__TextfieldProperties__TextAssignment_1_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4917:1: ( ( rule__TextfieldProperties__TextAssignment_1_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4917:1: ( ( rule__TextfieldProperties__TextAssignment_1_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4918:1: ( rule__TextfieldProperties__TextAssignment_1_1 )
            {
             before(grammarAccess.getTextfieldPropertiesAccess().getTextAssignment_1_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4919:1: ( rule__TextfieldProperties__TextAssignment_1_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4919:2: rule__TextfieldProperties__TextAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TextfieldProperties__TextAssignment_1_1_in_rule__TextfieldProperties__Group_1__1__Impl9961);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4933:1: rule__TextfieldProperties__Group_2__0 : rule__TextfieldProperties__Group_2__0__Impl rule__TextfieldProperties__Group_2__1 ;
    public final void rule__TextfieldProperties__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4937:1: ( rule__TextfieldProperties__Group_2__0__Impl rule__TextfieldProperties__Group_2__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4938:2: rule__TextfieldProperties__Group_2__0__Impl rule__TextfieldProperties__Group_2__1
            {
            pushFollow(FOLLOW_rule__TextfieldProperties__Group_2__0__Impl_in_rule__TextfieldProperties__Group_2__09995);
            rule__TextfieldProperties__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextfieldProperties__Group_2__1_in_rule__TextfieldProperties__Group_2__09998);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4945:1: rule__TextfieldProperties__Group_2__0__Impl : ( 'editable=' ) ;
    public final void rule__TextfieldProperties__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4949:1: ( ( 'editable=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4950:1: ( 'editable=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4950:1: ( 'editable=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4951:1: 'editable='
            {
             before(grammarAccess.getTextfieldPropertiesAccess().getEditableKeyword_2_0()); 
            match(input,28,FOLLOW_28_in_rule__TextfieldProperties__Group_2__0__Impl10026); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4964:1: rule__TextfieldProperties__Group_2__1 : rule__TextfieldProperties__Group_2__1__Impl ;
    public final void rule__TextfieldProperties__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4968:1: ( rule__TextfieldProperties__Group_2__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4969:2: rule__TextfieldProperties__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TextfieldProperties__Group_2__1__Impl_in_rule__TextfieldProperties__Group_2__110057);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4975:1: rule__TextfieldProperties__Group_2__1__Impl : ( ( rule__TextfieldProperties__EditableAssignment_2_1 ) ) ;
    public final void rule__TextfieldProperties__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4979:1: ( ( ( rule__TextfieldProperties__EditableAssignment_2_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4980:1: ( ( rule__TextfieldProperties__EditableAssignment_2_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4980:1: ( ( rule__TextfieldProperties__EditableAssignment_2_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4981:1: ( rule__TextfieldProperties__EditableAssignment_2_1 )
            {
             before(grammarAccess.getTextfieldPropertiesAccess().getEditableAssignment_2_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4982:1: ( rule__TextfieldProperties__EditableAssignment_2_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4982:2: rule__TextfieldProperties__EditableAssignment_2_1
            {
            pushFollow(FOLLOW_rule__TextfieldProperties__EditableAssignment_2_1_in_rule__TextfieldProperties__Group_2__1__Impl10084);
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


    // $ANTLR start "rule__LabelProperties__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:4996:1: rule__LabelProperties__Group__0 : rule__LabelProperties__Group__0__Impl rule__LabelProperties__Group__1 ;
    public final void rule__LabelProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5000:1: ( rule__LabelProperties__Group__0__Impl rule__LabelProperties__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5001:2: rule__LabelProperties__Group__0__Impl rule__LabelProperties__Group__1
            {
            pushFollow(FOLLOW_rule__LabelProperties__Group__0__Impl_in_rule__LabelProperties__Group__010118);
            rule__LabelProperties__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelProperties__Group__1_in_rule__LabelProperties__Group__010121);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5008:1: rule__LabelProperties__Group__0__Impl : ( ( rule__LabelProperties__CommonPropertiesAssignment_0 ) ) ;
    public final void rule__LabelProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5012:1: ( ( ( rule__LabelProperties__CommonPropertiesAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5013:1: ( ( rule__LabelProperties__CommonPropertiesAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5013:1: ( ( rule__LabelProperties__CommonPropertiesAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5014:1: ( rule__LabelProperties__CommonPropertiesAssignment_0 )
            {
             before(grammarAccess.getLabelPropertiesAccess().getCommonPropertiesAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5015:1: ( rule__LabelProperties__CommonPropertiesAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5015:2: rule__LabelProperties__CommonPropertiesAssignment_0
            {
            pushFollow(FOLLOW_rule__LabelProperties__CommonPropertiesAssignment_0_in_rule__LabelProperties__Group__0__Impl10148);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5025:1: rule__LabelProperties__Group__1 : rule__LabelProperties__Group__1__Impl ;
    public final void rule__LabelProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5029:1: ( rule__LabelProperties__Group__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5030:2: rule__LabelProperties__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LabelProperties__Group__1__Impl_in_rule__LabelProperties__Group__110178);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5036:1: rule__LabelProperties__Group__1__Impl : ( ( rule__LabelProperties__Group_1__0 )? ) ;
    public final void rule__LabelProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5040:1: ( ( ( rule__LabelProperties__Group_1__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5041:1: ( ( rule__LabelProperties__Group_1__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5041:1: ( ( rule__LabelProperties__Group_1__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5042:1: ( rule__LabelProperties__Group_1__0 )?
            {
             before(grammarAccess.getLabelPropertiesAccess().getGroup_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5043:1: ( rule__LabelProperties__Group_1__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==27) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5043:2: rule__LabelProperties__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__LabelProperties__Group_1__0_in_rule__LabelProperties__Group__1__Impl10205);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5057:1: rule__LabelProperties__Group_1__0 : rule__LabelProperties__Group_1__0__Impl rule__LabelProperties__Group_1__1 ;
    public final void rule__LabelProperties__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5061:1: ( rule__LabelProperties__Group_1__0__Impl rule__LabelProperties__Group_1__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5062:2: rule__LabelProperties__Group_1__0__Impl rule__LabelProperties__Group_1__1
            {
            pushFollow(FOLLOW_rule__LabelProperties__Group_1__0__Impl_in_rule__LabelProperties__Group_1__010240);
            rule__LabelProperties__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelProperties__Group_1__1_in_rule__LabelProperties__Group_1__010243);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5069:1: rule__LabelProperties__Group_1__0__Impl : ( 'text=' ) ;
    public final void rule__LabelProperties__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5073:1: ( ( 'text=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5074:1: ( 'text=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5074:1: ( 'text=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5075:1: 'text='
            {
             before(grammarAccess.getLabelPropertiesAccess().getTextKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__LabelProperties__Group_1__0__Impl10271); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5088:1: rule__LabelProperties__Group_1__1 : rule__LabelProperties__Group_1__1__Impl ;
    public final void rule__LabelProperties__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5092:1: ( rule__LabelProperties__Group_1__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5093:2: rule__LabelProperties__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__LabelProperties__Group_1__1__Impl_in_rule__LabelProperties__Group_1__110302);
            rule__LabelProperties__Group_1__1__Impl();

            state._fsp--;


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5099:1: rule__LabelProperties__Group_1__1__Impl : ( ( rule__LabelProperties__TextAssignment_1_1 ) ) ;
    public final void rule__LabelProperties__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5103:1: ( ( ( rule__LabelProperties__TextAssignment_1_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5104:1: ( ( rule__LabelProperties__TextAssignment_1_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5104:1: ( ( rule__LabelProperties__TextAssignment_1_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5105:1: ( rule__LabelProperties__TextAssignment_1_1 )
            {
             before(grammarAccess.getLabelPropertiesAccess().getTextAssignment_1_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5106:1: ( rule__LabelProperties__TextAssignment_1_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5106:2: rule__LabelProperties__TextAssignment_1_1
            {
            pushFollow(FOLLOW_rule__LabelProperties__TextAssignment_1_1_in_rule__LabelProperties__Group_1__1__Impl10329);
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


    // $ANTLR start "rule__ButtonProperties__Group__0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5120:1: rule__ButtonProperties__Group__0 : rule__ButtonProperties__Group__0__Impl rule__ButtonProperties__Group__1 ;
    public final void rule__ButtonProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5124:1: ( rule__ButtonProperties__Group__0__Impl rule__ButtonProperties__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5125:2: rule__ButtonProperties__Group__0__Impl rule__ButtonProperties__Group__1
            {
            pushFollow(FOLLOW_rule__ButtonProperties__Group__0__Impl_in_rule__ButtonProperties__Group__010363);
            rule__ButtonProperties__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonProperties__Group__1_in_rule__ButtonProperties__Group__010366);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5132:1: rule__ButtonProperties__Group__0__Impl : ( ( rule__ButtonProperties__CommonPropertiesAssignment_0 ) ) ;
    public final void rule__ButtonProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5136:1: ( ( ( rule__ButtonProperties__CommonPropertiesAssignment_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5137:1: ( ( rule__ButtonProperties__CommonPropertiesAssignment_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5137:1: ( ( rule__ButtonProperties__CommonPropertiesAssignment_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5138:1: ( rule__ButtonProperties__CommonPropertiesAssignment_0 )
            {
             before(grammarAccess.getButtonPropertiesAccess().getCommonPropertiesAssignment_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5139:1: ( rule__ButtonProperties__CommonPropertiesAssignment_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5139:2: rule__ButtonProperties__CommonPropertiesAssignment_0
            {
            pushFollow(FOLLOW_rule__ButtonProperties__CommonPropertiesAssignment_0_in_rule__ButtonProperties__Group__0__Impl10393);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5149:1: rule__ButtonProperties__Group__1 : rule__ButtonProperties__Group__1__Impl ;
    public final void rule__ButtonProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5153:1: ( rule__ButtonProperties__Group__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5154:2: rule__ButtonProperties__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ButtonProperties__Group__1__Impl_in_rule__ButtonProperties__Group__110423);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5160:1: rule__ButtonProperties__Group__1__Impl : ( ( rule__ButtonProperties__Group_1__0 )? ) ;
    public final void rule__ButtonProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5164:1: ( ( ( rule__ButtonProperties__Group_1__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5165:1: ( ( rule__ButtonProperties__Group_1__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5165:1: ( ( rule__ButtonProperties__Group_1__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5166:1: ( rule__ButtonProperties__Group_1__0 )?
            {
             before(grammarAccess.getButtonPropertiesAccess().getGroup_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5167:1: ( rule__ButtonProperties__Group_1__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==27) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5167:2: rule__ButtonProperties__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ButtonProperties__Group_1__0_in_rule__ButtonProperties__Group__1__Impl10450);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5181:1: rule__ButtonProperties__Group_1__0 : rule__ButtonProperties__Group_1__0__Impl rule__ButtonProperties__Group_1__1 ;
    public final void rule__ButtonProperties__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5185:1: ( rule__ButtonProperties__Group_1__0__Impl rule__ButtonProperties__Group_1__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5186:2: rule__ButtonProperties__Group_1__0__Impl rule__ButtonProperties__Group_1__1
            {
            pushFollow(FOLLOW_rule__ButtonProperties__Group_1__0__Impl_in_rule__ButtonProperties__Group_1__010485);
            rule__ButtonProperties__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonProperties__Group_1__1_in_rule__ButtonProperties__Group_1__010488);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5193:1: rule__ButtonProperties__Group_1__0__Impl : ( 'text=' ) ;
    public final void rule__ButtonProperties__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5197:1: ( ( 'text=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5198:1: ( 'text=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5198:1: ( 'text=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5199:1: 'text='
            {
             before(grammarAccess.getButtonPropertiesAccess().getTextKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__ButtonProperties__Group_1__0__Impl10516); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5212:1: rule__ButtonProperties__Group_1__1 : rule__ButtonProperties__Group_1__1__Impl ;
    public final void rule__ButtonProperties__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5216:1: ( rule__ButtonProperties__Group_1__1__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5217:2: rule__ButtonProperties__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ButtonProperties__Group_1__1__Impl_in_rule__ButtonProperties__Group_1__110547);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5223:1: rule__ButtonProperties__Group_1__1__Impl : ( ( rule__ButtonProperties__TextAssignment_1_1 ) ) ;
    public final void rule__ButtonProperties__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5227:1: ( ( ( rule__ButtonProperties__TextAssignment_1_1 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5228:1: ( ( rule__ButtonProperties__TextAssignment_1_1 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5228:1: ( ( rule__ButtonProperties__TextAssignment_1_1 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5229:1: ( rule__ButtonProperties__TextAssignment_1_1 )
            {
             before(grammarAccess.getButtonPropertiesAccess().getTextAssignment_1_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5230:1: ( rule__ButtonProperties__TextAssignment_1_1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5230:2: rule__ButtonProperties__TextAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ButtonProperties__TextAssignment_1_1_in_rule__ButtonProperties__Group_1__1__Impl10574);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5244:1: rule__CommonProperties__Group__0 : rule__CommonProperties__Group__0__Impl rule__CommonProperties__Group__1 ;
    public final void rule__CommonProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5248:1: ( rule__CommonProperties__Group__0__Impl rule__CommonProperties__Group__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5249:2: rule__CommonProperties__Group__0__Impl rule__CommonProperties__Group__1
            {
            pushFollow(FOLLOW_rule__CommonProperties__Group__0__Impl_in_rule__CommonProperties__Group__010608);
            rule__CommonProperties__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommonProperties__Group__1_in_rule__CommonProperties__Group__010611);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5256:1: rule__CommonProperties__Group__0__Impl : ( '->' ) ;
    public final void rule__CommonProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5260:1: ( ( '->' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5261:1: ( '->' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5261:1: ( '->' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5262:1: '->'
            {
             before(grammarAccess.getCommonPropertiesAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__CommonProperties__Group__0__Impl10639); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5275:1: rule__CommonProperties__Group__1 : rule__CommonProperties__Group__1__Impl rule__CommonProperties__Group__2 ;
    public final void rule__CommonProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5279:1: ( rule__CommonProperties__Group__1__Impl rule__CommonProperties__Group__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5280:2: rule__CommonProperties__Group__1__Impl rule__CommonProperties__Group__2
            {
            pushFollow(FOLLOW_rule__CommonProperties__Group__1__Impl_in_rule__CommonProperties__Group__110670);
            rule__CommonProperties__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommonProperties__Group__2_in_rule__CommonProperties__Group__110673);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5287:1: rule__CommonProperties__Group__1__Impl : ( ( rule__CommonProperties__Group_1__0 )? ) ;
    public final void rule__CommonProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5291:1: ( ( ( rule__CommonProperties__Group_1__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5292:1: ( ( rule__CommonProperties__Group_1__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5292:1: ( ( rule__CommonProperties__Group_1__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5293:1: ( rule__CommonProperties__Group_1__0 )?
            {
             before(grammarAccess.getCommonPropertiesAccess().getGroup_1()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5294:1: ( rule__CommonProperties__Group_1__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==30) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5294:2: rule__CommonProperties__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CommonProperties__Group_1__0_in_rule__CommonProperties__Group__1__Impl10700);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5304:1: rule__CommonProperties__Group__2 : rule__CommonProperties__Group__2__Impl rule__CommonProperties__Group__3 ;
    public final void rule__CommonProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5308:1: ( rule__CommonProperties__Group__2__Impl rule__CommonProperties__Group__3 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5309:2: rule__CommonProperties__Group__2__Impl rule__CommonProperties__Group__3
            {
            pushFollow(FOLLOW_rule__CommonProperties__Group__2__Impl_in_rule__CommonProperties__Group__210731);
            rule__CommonProperties__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommonProperties__Group__3_in_rule__CommonProperties__Group__210734);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5316:1: rule__CommonProperties__Group__2__Impl : ( ( rule__CommonProperties__Group_2__0 )? ) ;
    public final void rule__CommonProperties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5320:1: ( ( ( rule__CommonProperties__Group_2__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5321:1: ( ( rule__CommonProperties__Group_2__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5321:1: ( ( rule__CommonProperties__Group_2__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5322:1: ( rule__CommonProperties__Group_2__0 )?
            {
             before(grammarAccess.getCommonPropertiesAccess().getGroup_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5323:1: ( rule__CommonProperties__Group_2__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==32) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5323:2: rule__CommonProperties__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__CommonProperties__Group_2__0_in_rule__CommonProperties__Group__2__Impl10761);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5333:1: rule__CommonProperties__Group__3 : rule__CommonProperties__Group__3__Impl ;
    public final void rule__CommonProperties__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5337:1: ( rule__CommonProperties__Group__3__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5338:2: rule__CommonProperties__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CommonProperties__Group__3__Impl_in_rule__CommonProperties__Group__310792);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5344:1: rule__CommonProperties__Group__3__Impl : ( ( rule__CommonProperties__Group_3__0 )? ) ;
    public final void rule__CommonProperties__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5348:1: ( ( ( rule__CommonProperties__Group_3__0 )? ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5349:1: ( ( rule__CommonProperties__Group_3__0 )? )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5349:1: ( ( rule__CommonProperties__Group_3__0 )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5350:1: ( rule__CommonProperties__Group_3__0 )?
            {
             before(grammarAccess.getCommonPropertiesAccess().getGroup_3()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5351:1: ( rule__CommonProperties__Group_3__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==33) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5351:2: rule__CommonProperties__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__CommonProperties__Group_3__0_in_rule__CommonProperties__Group__3__Impl10819);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5369:1: rule__CommonProperties__Group_1__0 : rule__CommonProperties__Group_1__0__Impl rule__CommonProperties__Group_1__1 ;
    public final void rule__CommonProperties__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5373:1: ( rule__CommonProperties__Group_1__0__Impl rule__CommonProperties__Group_1__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5374:2: rule__CommonProperties__Group_1__0__Impl rule__CommonProperties__Group_1__1
            {
            pushFollow(FOLLOW_rule__CommonProperties__Group_1__0__Impl_in_rule__CommonProperties__Group_1__010858);
            rule__CommonProperties__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommonProperties__Group_1__1_in_rule__CommonProperties__Group_1__010861);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5381:1: rule__CommonProperties__Group_1__0__Impl : ( 'propertyKey' ) ;
    public final void rule__CommonProperties__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5385:1: ( ( 'propertyKey' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5386:1: ( 'propertyKey' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5386:1: ( 'propertyKey' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5387:1: 'propertyKey'
            {
             before(grammarAccess.getCommonPropertiesAccess().getPropertyKeyKeyword_1_0()); 
            match(input,30,FOLLOW_30_in_rule__CommonProperties__Group_1__0__Impl10889); 
             after(grammarAccess.getCommonPropertiesAccess().getPropertyKeyKeyword_1_0()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5400:1: rule__CommonProperties__Group_1__1 : rule__CommonProperties__Group_1__1__Impl rule__CommonProperties__Group_1__2 ;
    public final void rule__CommonProperties__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5404:1: ( rule__CommonProperties__Group_1__1__Impl rule__CommonProperties__Group_1__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5405:2: rule__CommonProperties__Group_1__1__Impl rule__CommonProperties__Group_1__2
            {
            pushFollow(FOLLOW_rule__CommonProperties__Group_1__1__Impl_in_rule__CommonProperties__Group_1__110920);
            rule__CommonProperties__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommonProperties__Group_1__2_in_rule__CommonProperties__Group_1__110923);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5412:1: rule__CommonProperties__Group_1__1__Impl : ( '=' ) ;
    public final void rule__CommonProperties__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5416:1: ( ( '=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5417:1: ( '=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5417:1: ( '=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5418:1: '='
            {
             before(grammarAccess.getCommonPropertiesAccess().getEqualsSignKeyword_1_1()); 
            match(input,31,FOLLOW_31_in_rule__CommonProperties__Group_1__1__Impl10951); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5431:1: rule__CommonProperties__Group_1__2 : rule__CommonProperties__Group_1__2__Impl ;
    public final void rule__CommonProperties__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5435:1: ( rule__CommonProperties__Group_1__2__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5436:2: rule__CommonProperties__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__CommonProperties__Group_1__2__Impl_in_rule__CommonProperties__Group_1__210982);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5442:1: rule__CommonProperties__Group_1__2__Impl : ( ( rule__CommonProperties__PropertyKeyAssignment_1_2 ) ) ;
    public final void rule__CommonProperties__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5446:1: ( ( ( rule__CommonProperties__PropertyKeyAssignment_1_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5447:1: ( ( rule__CommonProperties__PropertyKeyAssignment_1_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5447:1: ( ( rule__CommonProperties__PropertyKeyAssignment_1_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5448:1: ( rule__CommonProperties__PropertyKeyAssignment_1_2 )
            {
             before(grammarAccess.getCommonPropertiesAccess().getPropertyKeyAssignment_1_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5449:1: ( rule__CommonProperties__PropertyKeyAssignment_1_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5449:2: rule__CommonProperties__PropertyKeyAssignment_1_2
            {
            pushFollow(FOLLOW_rule__CommonProperties__PropertyKeyAssignment_1_2_in_rule__CommonProperties__Group_1__2__Impl11009);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5465:1: rule__CommonProperties__Group_2__0 : rule__CommonProperties__Group_2__0__Impl rule__CommonProperties__Group_2__1 ;
    public final void rule__CommonProperties__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5469:1: ( rule__CommonProperties__Group_2__0__Impl rule__CommonProperties__Group_2__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5470:2: rule__CommonProperties__Group_2__0__Impl rule__CommonProperties__Group_2__1
            {
            pushFollow(FOLLOW_rule__CommonProperties__Group_2__0__Impl_in_rule__CommonProperties__Group_2__011045);
            rule__CommonProperties__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommonProperties__Group_2__1_in_rule__CommonProperties__Group_2__011048);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5477:1: rule__CommonProperties__Group_2__0__Impl : ( 'layoutKey' ) ;
    public final void rule__CommonProperties__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5481:1: ( ( 'layoutKey' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5482:1: ( 'layoutKey' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5482:1: ( 'layoutKey' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5483:1: 'layoutKey'
            {
             before(grammarAccess.getCommonPropertiesAccess().getLayoutKeyKeyword_2_0()); 
            match(input,32,FOLLOW_32_in_rule__CommonProperties__Group_2__0__Impl11076); 
             after(grammarAccess.getCommonPropertiesAccess().getLayoutKeyKeyword_2_0()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5496:1: rule__CommonProperties__Group_2__1 : rule__CommonProperties__Group_2__1__Impl rule__CommonProperties__Group_2__2 ;
    public final void rule__CommonProperties__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5500:1: ( rule__CommonProperties__Group_2__1__Impl rule__CommonProperties__Group_2__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5501:2: rule__CommonProperties__Group_2__1__Impl rule__CommonProperties__Group_2__2
            {
            pushFollow(FOLLOW_rule__CommonProperties__Group_2__1__Impl_in_rule__CommonProperties__Group_2__111107);
            rule__CommonProperties__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommonProperties__Group_2__2_in_rule__CommonProperties__Group_2__111110);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5508:1: rule__CommonProperties__Group_2__1__Impl : ( '=' ) ;
    public final void rule__CommonProperties__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5512:1: ( ( '=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5513:1: ( '=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5513:1: ( '=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5514:1: '='
            {
             before(grammarAccess.getCommonPropertiesAccess().getEqualsSignKeyword_2_1()); 
            match(input,31,FOLLOW_31_in_rule__CommonProperties__Group_2__1__Impl11138); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5527:1: rule__CommonProperties__Group_2__2 : rule__CommonProperties__Group_2__2__Impl ;
    public final void rule__CommonProperties__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5531:1: ( rule__CommonProperties__Group_2__2__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5532:2: rule__CommonProperties__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__CommonProperties__Group_2__2__Impl_in_rule__CommonProperties__Group_2__211169);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5538:1: rule__CommonProperties__Group_2__2__Impl : ( ( rule__CommonProperties__LayoutKeyAssignment_2_2 ) ) ;
    public final void rule__CommonProperties__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5542:1: ( ( ( rule__CommonProperties__LayoutKeyAssignment_2_2 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5543:1: ( ( rule__CommonProperties__LayoutKeyAssignment_2_2 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5543:1: ( ( rule__CommonProperties__LayoutKeyAssignment_2_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5544:1: ( rule__CommonProperties__LayoutKeyAssignment_2_2 )
            {
             before(grammarAccess.getCommonPropertiesAccess().getLayoutKeyAssignment_2_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5545:1: ( rule__CommonProperties__LayoutKeyAssignment_2_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5545:2: rule__CommonProperties__LayoutKeyAssignment_2_2
            {
            pushFollow(FOLLOW_rule__CommonProperties__LayoutKeyAssignment_2_2_in_rule__CommonProperties__Group_2__2__Impl11196);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5561:1: rule__CommonProperties__Group_3__0 : rule__CommonProperties__Group_3__0__Impl rule__CommonProperties__Group_3__1 ;
    public final void rule__CommonProperties__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5565:1: ( rule__CommonProperties__Group_3__0__Impl rule__CommonProperties__Group_3__1 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5566:2: rule__CommonProperties__Group_3__0__Impl rule__CommonProperties__Group_3__1
            {
            pushFollow(FOLLOW_rule__CommonProperties__Group_3__0__Impl_in_rule__CommonProperties__Group_3__011232);
            rule__CommonProperties__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommonProperties__Group_3__1_in_rule__CommonProperties__Group_3__011235);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5573:1: rule__CommonProperties__Group_3__0__Impl : ( 'interactiontype' ) ;
    public final void rule__CommonProperties__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5577:1: ( ( 'interactiontype' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5578:1: ( 'interactiontype' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5578:1: ( 'interactiontype' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5579:1: 'interactiontype'
            {
             before(grammarAccess.getCommonPropertiesAccess().getInteractiontypeKeyword_3_0()); 
            match(input,33,FOLLOW_33_in_rule__CommonProperties__Group_3__0__Impl11263); 
             after(grammarAccess.getCommonPropertiesAccess().getInteractiontypeKeyword_3_0()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5592:1: rule__CommonProperties__Group_3__1 : rule__CommonProperties__Group_3__1__Impl rule__CommonProperties__Group_3__2 ;
    public final void rule__CommonProperties__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5596:1: ( rule__CommonProperties__Group_3__1__Impl rule__CommonProperties__Group_3__2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5597:2: rule__CommonProperties__Group_3__1__Impl rule__CommonProperties__Group_3__2
            {
            pushFollow(FOLLOW_rule__CommonProperties__Group_3__1__Impl_in_rule__CommonProperties__Group_3__111294);
            rule__CommonProperties__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommonProperties__Group_3__2_in_rule__CommonProperties__Group_3__111297);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5604:1: rule__CommonProperties__Group_3__1__Impl : ( '=' ) ;
    public final void rule__CommonProperties__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5608:1: ( ( '=' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5609:1: ( '=' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5609:1: ( '=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5610:1: '='
            {
             before(grammarAccess.getCommonPropertiesAccess().getEqualsSignKeyword_3_1()); 
            match(input,31,FOLLOW_31_in_rule__CommonProperties__Group_3__1__Impl11325); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5623:1: rule__CommonProperties__Group_3__2 : rule__CommonProperties__Group_3__2__Impl ;
    public final void rule__CommonProperties__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5627:1: ( rule__CommonProperties__Group_3__2__Impl )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5628:2: rule__CommonProperties__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__CommonProperties__Group_3__2__Impl_in_rule__CommonProperties__Group_3__211356);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5634:1: rule__CommonProperties__Group_3__2__Impl : ( ( ( rule__CommonProperties__InteractiontypeAssignment_3_2 ) ) ( ( rule__CommonProperties__InteractiontypeAssignment_3_2 )* ) ) ;
    public final void rule__CommonProperties__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5638:1: ( ( ( ( rule__CommonProperties__InteractiontypeAssignment_3_2 ) ) ( ( rule__CommonProperties__InteractiontypeAssignment_3_2 )* ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5639:1: ( ( ( rule__CommonProperties__InteractiontypeAssignment_3_2 ) ) ( ( rule__CommonProperties__InteractiontypeAssignment_3_2 )* ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5639:1: ( ( ( rule__CommonProperties__InteractiontypeAssignment_3_2 ) ) ( ( rule__CommonProperties__InteractiontypeAssignment_3_2 )* ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5640:1: ( ( rule__CommonProperties__InteractiontypeAssignment_3_2 ) ) ( ( rule__CommonProperties__InteractiontypeAssignment_3_2 )* )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5640:1: ( ( rule__CommonProperties__InteractiontypeAssignment_3_2 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5641:1: ( rule__CommonProperties__InteractiontypeAssignment_3_2 )
            {
             before(grammarAccess.getCommonPropertiesAccess().getInteractiontypeAssignment_3_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5642:1: ( rule__CommonProperties__InteractiontypeAssignment_3_2 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5642:2: rule__CommonProperties__InteractiontypeAssignment_3_2
            {
            pushFollow(FOLLOW_rule__CommonProperties__InteractiontypeAssignment_3_2_in_rule__CommonProperties__Group_3__2__Impl11385);
            rule__CommonProperties__InteractiontypeAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getCommonPropertiesAccess().getInteractiontypeAssignment_3_2()); 

            }

            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5645:1: ( ( rule__CommonProperties__InteractiontypeAssignment_3_2 )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5646:1: ( rule__CommonProperties__InteractiontypeAssignment_3_2 )*
            {
             before(grammarAccess.getCommonPropertiesAccess().getInteractiontypeAssignment_3_2()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5647:1: ( rule__CommonProperties__InteractiontypeAssignment_3_2 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=16 && LA47_0<=18)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5647:2: rule__CommonProperties__InteractiontypeAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_rule__CommonProperties__InteractiontypeAssignment_3_2_in_rule__CommonProperties__Group_3__2__Impl11397);
            	    rule__CommonProperties__InteractiontypeAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
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


    // $ANTLR start "rule__UIDescription__TypeDefinitionAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5665:1: rule__UIDescription__TypeDefinitionAssignment_0 : ( ruleTypeDefinition ) ;
    public final void rule__UIDescription__TypeDefinitionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5669:1: ( ( ruleTypeDefinition ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5670:1: ( ruleTypeDefinition )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5670:1: ( ruleTypeDefinition )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5671:1: ruleTypeDefinition
            {
             before(grammarAccess.getUIDescriptionAccess().getTypeDefinitionTypeDefinitionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTypeDefinition_in_rule__UIDescription__TypeDefinitionAssignment_011441);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5680:1: rule__UIDescription__PropertyAssignment_1 : ( ruleProperty ) ;
    public final void rule__UIDescription__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5684:1: ( ( ruleProperty ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5685:1: ( ruleProperty )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5685:1: ( ruleProperty )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5686:1: ruleProperty
            {
             before(grammarAccess.getUIDescriptionAccess().getPropertyPropertyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__UIDescription__PropertyAssignment_111472);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5695:1: rule__UIDescription__LayoutAssignment_2 : ( ruleLayout ) ;
    public final void rule__UIDescription__LayoutAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5699:1: ( ( ruleLayout ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5700:1: ( ruleLayout )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5700:1: ( ruleLayout )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5701:1: ruleLayout
            {
             before(grammarAccess.getUIDescriptionAccess().getLayoutLayoutParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLayout_in_rule__UIDescription__LayoutAssignment_211503);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5710:1: rule__UIDescription__UsedDescriptionsAssignment_3 : ( ruleUsedDescription ) ;
    public final void rule__UIDescription__UsedDescriptionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5714:1: ( ( ruleUsedDescription ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5715:1: ( ruleUsedDescription )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5715:1: ( ruleUsedDescription )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5716:1: ruleUsedDescription
            {
             before(grammarAccess.getUIDescriptionAccess().getUsedDescriptionsUsedDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleUsedDescription_in_rule__UIDescription__UsedDescriptionsAssignment_311534);
            ruleUsedDescription();

            state._fsp--;

             after(grammarAccess.getUIDescriptionAccess().getUsedDescriptionsUsedDescriptionParserRuleCall_3_0()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5725:1: rule__UIDescription__RefinementsAssignment_4 : ( ruleRefinement ) ;
    public final void rule__UIDescription__RefinementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5729:1: ( ( ruleRefinement ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5730:1: ( ruleRefinement )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5730:1: ( ruleRefinement )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5731:1: ruleRefinement
            {
             before(grammarAccess.getUIDescriptionAccess().getRefinementsRefinementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleRefinement_in_rule__UIDescription__RefinementsAssignment_411565);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5740:1: rule__UIDescription__DefinitionsAssignment_5 : ( ruleDefinition ) ;
    public final void rule__UIDescription__DefinitionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5744:1: ( ( ruleDefinition ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5745:1: ( ruleDefinition )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5745:1: ( ruleDefinition )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5746:1: ruleDefinition
            {
             before(grammarAccess.getUIDescriptionAccess().getDefinitionsDefinitionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleDefinition_in_rule__UIDescription__DefinitionsAssignment_511596);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5755:1: rule__UIDescription__StructureAssignment_6 : ( ruleStructure ) ;
    public final void rule__UIDescription__StructureAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5759:1: ( ( ruleStructure ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5760:1: ( ruleStructure )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5760:1: ( ruleStructure )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5761:1: ruleStructure
            {
             before(grammarAccess.getUIDescriptionAccess().getStructureStructureParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleStructure_in_rule__UIDescription__StructureAssignment_611627);
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


    // $ANTLR start "rule__TypeDefinition__TypeAssignment_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5770:1: rule__TypeDefinition__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__TypeDefinition__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5774:1: ( ( ruleType ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5775:1: ( ruleType )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5775:1: ( ruleType )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5776:1: ruleType
            {
             before(grammarAccess.getTypeDefinitionAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__TypeDefinition__TypeAssignment_111658);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5785:1: rule__Type__IdAssignment : ( ( rule__Type__IdAlternatives_0 ) ) ;
    public final void rule__Type__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5789:1: ( ( ( rule__Type__IdAlternatives_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5790:1: ( ( rule__Type__IdAlternatives_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5790:1: ( ( rule__Type__IdAlternatives_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5791:1: ( rule__Type__IdAlternatives_0 )
            {
             before(grammarAccess.getTypeAccess().getIdAlternatives_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5792:1: ( rule__Type__IdAlternatives_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5792:2: rule__Type__IdAlternatives_0
            {
            pushFollow(FOLLOW_rule__Type__IdAlternatives_0_in_rule__Type__IdAssignment11689);
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


    // $ANTLR start "rule__Property__PropertiesFilesAssignment_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5801:1: rule__Property__PropertiesFilesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Property__PropertiesFilesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5805:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5806:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5806:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5807:1: RULE_STRING
            {
             before(grammarAccess.getPropertyAccess().getPropertiesFilesSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Property__PropertiesFilesAssignment_111722); 
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


    // $ANTLR start "rule__Layout__LayoutFilesAssignment_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5816:1: rule__Layout__LayoutFilesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Layout__LayoutFilesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5820:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5821:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5821:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5822:1: RULE_STRING
            {
             before(grammarAccess.getLayoutAccess().getLayoutFilesSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Layout__LayoutFilesAssignment_111753); 
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


    // $ANTLR start "rule__UsedDescription__DescriptionTypeAssignment_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5831:1: rule__UsedDescription__DescriptionTypeAssignment_1 : ( ruleDescriptionType ) ;
    public final void rule__UsedDescription__DescriptionTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5835:1: ( ( ruleDescriptionType ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5836:1: ( ruleDescriptionType )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5836:1: ( ruleDescriptionType )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5837:1: ruleDescriptionType
            {
             before(grammarAccess.getUsedDescriptionAccess().getDescriptionTypeDescriptionTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDescriptionType_in_rule__UsedDescription__DescriptionTypeAssignment_111784);
            ruleDescriptionType();

            state._fsp--;

             after(grammarAccess.getUsedDescriptionAccess().getDescriptionTypeDescriptionTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedDescription__DescriptionTypeAssignment_1"


    // $ANTLR start "rule__UsedDescription__IdAssignment_2_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5846:1: rule__UsedDescription__IdAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__UsedDescription__IdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5850:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5851:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5851:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5852:1: RULE_STRING
            {
             before(grammarAccess.getUsedDescriptionAccess().getIdSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UsedDescription__IdAssignment_2_111815); 
             after(grammarAccess.getUsedDescriptionAccess().getIdSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedDescription__IdAssignment_2_1"


    // $ANTLR start "rule__UIDescriptionImport__DescriptionNameAssignment"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5861:1: rule__UIDescriptionImport__DescriptionNameAssignment : ( RULE_STRING ) ;
    public final void rule__UIDescriptionImport__DescriptionNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5865:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5866:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5866:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5867:1: RULE_STRING
            {
             before(grammarAccess.getUIDescriptionImportAccess().getDescriptionNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UIDescriptionImport__DescriptionNameAssignment11846); 
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


    // $ANTLR start "rule__Refinement__ConcreteRefinementAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5876:1: rule__Refinement__ConcreteRefinementAssignment_0 : ( ruleComponentRefinement ) ;
    public final void rule__Refinement__ConcreteRefinementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5880:1: ( ( ruleComponentRefinement ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5881:1: ( ruleComponentRefinement )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5881:1: ( ruleComponentRefinement )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5882:1: ruleComponentRefinement
            {
             before(grammarAccess.getRefinementAccess().getConcreteRefinementComponentRefinementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleComponentRefinement_in_rule__Refinement__ConcreteRefinementAssignment_011877);
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


    // $ANTLR start "rule__Definition__ConcreteDefitionAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5891:1: rule__Definition__ConcreteDefitionAssignment_0 : ( ruleComponentDefinition ) ;
    public final void rule__Definition__ConcreteDefitionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5895:1: ( ( ruleComponentDefinition ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5896:1: ( ruleComponentDefinition )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5896:1: ( ruleComponentDefinition )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5897:1: ruleComponentDefinition
            {
             before(grammarAccess.getDefinitionAccess().getConcreteDefitionComponentDefinitionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleComponentDefinition_in_rule__Definition__ConcreteDefitionAssignment_011908);
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


    // $ANTLR start "rule__Structure__NameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5906:1: rule__Structure__NameAssignment_0 : ( ( 'Structure' ) ) ;
    public final void rule__Structure__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5910:1: ( ( ( 'Structure' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5911:1: ( ( 'Structure' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5911:1: ( ( 'Structure' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5912:1: ( 'Structure' )
            {
             before(grammarAccess.getStructureAccess().getNameStructureKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5913:1: ( 'Structure' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5914:1: 'Structure'
            {
             before(grammarAccess.getStructureAccess().getNameStructureKeyword_0_0()); 
            match(input,34,FOLLOW_34_in_rule__Structure__NameAssignment_011944); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5929:1: rule__Structure__OrderedElementsAssignment_2 : ( ruleElement ) ;
    public final void rule__Structure__OrderedElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5933:1: ( ( ruleElement ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5934:1: ( ruleElement )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5934:1: ( ruleElement )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5935:1: ruleElement
            {
             before(grammarAccess.getStructureAccess().getOrderedElementsElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleElement_in_rule__Structure__OrderedElementsAssignment_211983);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5944:1: rule__Element__IdAssignment : ( RULE_STRING ) ;
    public final void rule__Element__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5948:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5949:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5949:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5950:1: RULE_STRING
            {
             before(grammarAccess.getElementAccess().getIdSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Element__IdAssignment12014); 
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


    // $ANTLR start "rule__TableRefinement__NameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5959:1: rule__TableRefinement__NameAssignment_0 : ( ( 'Table' ) ) ;
    public final void rule__TableRefinement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5963:1: ( ( ( 'Table' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5964:1: ( ( 'Table' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5964:1: ( ( 'Table' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5965:1: ( 'Table' )
            {
             before(grammarAccess.getTableRefinementAccess().getNameTableKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5966:1: ( 'Table' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5967:1: 'Table'
            {
             before(grammarAccess.getTableRefinementAccess().getNameTableKeyword_0_0()); 
            match(input,35,FOLLOW_35_in_rule__TableRefinement__NameAssignment_012050); 
             after(grammarAccess.getTableRefinementAccess().getNameTableKeyword_0_0()); 

            }

             after(grammarAccess.getTableRefinementAccess().getNameTableKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRefinement__NameAssignment_0"


    // $ANTLR start "rule__TableRefinement__InputTypeAssignment_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5982:1: rule__TableRefinement__InputTypeAssignment_1 : ( RULE_INPUT_DESCRIPTION ) ;
    public final void rule__TableRefinement__InputTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5986:1: ( ( RULE_INPUT_DESCRIPTION ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5987:1: ( RULE_INPUT_DESCRIPTION )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5987:1: ( RULE_INPUT_DESCRIPTION )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5988:1: RULE_INPUT_DESCRIPTION
            {
             before(grammarAccess.getTableRefinementAccess().getInputTypeINPUT_DESCRIPTIONTerminalRuleCall_1_0()); 
            match(input,RULE_INPUT_DESCRIPTION,FOLLOW_RULE_INPUT_DESCRIPTION_in_rule__TableRefinement__InputTypeAssignment_112089); 
             after(grammarAccess.getTableRefinementAccess().getInputTypeINPUT_DESCRIPTIONTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRefinement__InputTypeAssignment_1"


    // $ANTLR start "rule__TableRefinement__IdAssignment_3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:5997:1: rule__TableRefinement__IdAssignment_3 : ( RULE_STRING ) ;
    public final void rule__TableRefinement__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6001:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6002:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6002:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6003:1: RULE_STRING
            {
             before(grammarAccess.getTableRefinementAccess().getIdSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TableRefinement__IdAssignment_312120); 
             after(grammarAccess.getTableRefinementAccess().getIdSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRefinement__IdAssignment_3"


    // $ANTLR start "rule__TableRefinement__PropertiesAssignment_4"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6012:1: rule__TableRefinement__PropertiesAssignment_4 : ( ruleCommonProperties ) ;
    public final void rule__TableRefinement__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6016:1: ( ( ruleCommonProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6017:1: ( ruleCommonProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6017:1: ( ruleCommonProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6018:1: ruleCommonProperties
            {
             before(grammarAccess.getTableRefinementAccess().getPropertiesCommonPropertiesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleCommonProperties_in_rule__TableRefinement__PropertiesAssignment_412151);
            ruleCommonProperties();

            state._fsp--;

             after(grammarAccess.getTableRefinementAccess().getPropertiesCommonPropertiesParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRefinement__PropertiesAssignment_4"


    // $ANTLR start "rule__TabViewRefinement__NameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6027:1: rule__TabViewRefinement__NameAssignment_0 : ( ( 'TabView' ) ) ;
    public final void rule__TabViewRefinement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6031:1: ( ( ( 'TabView' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6032:1: ( ( 'TabView' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6032:1: ( ( 'TabView' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6033:1: ( 'TabView' )
            {
             before(grammarAccess.getTabViewRefinementAccess().getNameTabViewKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6034:1: ( 'TabView' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6035:1: 'TabView'
            {
             before(grammarAccess.getTabViewRefinementAccess().getNameTabViewKeyword_0_0()); 
            match(input,36,FOLLOW_36_in_rule__TabViewRefinement__NameAssignment_012187); 
             after(grammarAccess.getTabViewRefinementAccess().getNameTabViewKeyword_0_0()); 

            }

             after(grammarAccess.getTabViewRefinementAccess().getNameTabViewKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabViewRefinement__NameAssignment_0"


    // $ANTLR start "rule__TabViewRefinement__TabsAssignment_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6050:1: rule__TabViewRefinement__TabsAssignment_1 : ( ruleTabDefinition ) ;
    public final void rule__TabViewRefinement__TabsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6054:1: ( ( ruleTabDefinition ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6055:1: ( ruleTabDefinition )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6055:1: ( ruleTabDefinition )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6056:1: ruleTabDefinition
            {
             before(grammarAccess.getTabViewRefinementAccess().getTabsTabDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTabDefinition_in_rule__TabViewRefinement__TabsAssignment_112226);
            ruleTabDefinition();

            state._fsp--;

             after(grammarAccess.getTabViewRefinementAccess().getTabsTabDefinitionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabViewRefinement__TabsAssignment_1"


    // $ANTLR start "rule__TabViewRefinement__IdAssignment_3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6065:1: rule__TabViewRefinement__IdAssignment_3 : ( RULE_STRING ) ;
    public final void rule__TabViewRefinement__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6069:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6070:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6070:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6071:1: RULE_STRING
            {
             before(grammarAccess.getTabViewRefinementAccess().getIdSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TabViewRefinement__IdAssignment_312257); 
             after(grammarAccess.getTabViewRefinementAccess().getIdSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabViewRefinement__IdAssignment_3"


    // $ANTLR start "rule__TabViewRefinement__PropertiesAssignment_4"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6080:1: rule__TabViewRefinement__PropertiesAssignment_4 : ( ruleCommonProperties ) ;
    public final void rule__TabViewRefinement__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6084:1: ( ( ruleCommonProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6085:1: ( ruleCommonProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6085:1: ( ruleCommonProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6086:1: ruleCommonProperties
            {
             before(grammarAccess.getTabViewRefinementAccess().getPropertiesCommonPropertiesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleCommonProperties_in_rule__TabViewRefinement__PropertiesAssignment_412288);
            ruleCommonProperties();

            state._fsp--;

             after(grammarAccess.getTabViewRefinementAccess().getPropertiesCommonPropertiesParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabViewRefinement__PropertiesAssignment_4"


    // $ANTLR start "rule__TreeRefinement__NameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6095:1: rule__TreeRefinement__NameAssignment_0 : ( ( 'Tree' ) ) ;
    public final void rule__TreeRefinement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6099:1: ( ( ( 'Tree' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6100:1: ( ( 'Tree' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6100:1: ( ( 'Tree' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6101:1: ( 'Tree' )
            {
             before(grammarAccess.getTreeRefinementAccess().getNameTreeKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6102:1: ( 'Tree' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6103:1: 'Tree'
            {
             before(grammarAccess.getTreeRefinementAccess().getNameTreeKeyword_0_0()); 
            match(input,37,FOLLOW_37_in_rule__TreeRefinement__NameAssignment_012324); 
             after(grammarAccess.getTreeRefinementAccess().getNameTreeKeyword_0_0()); 

            }

             after(grammarAccess.getTreeRefinementAccess().getNameTreeKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeRefinement__NameAssignment_0"


    // $ANTLR start "rule__TreeRefinement__InputTypeAssignment_1"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6118:1: rule__TreeRefinement__InputTypeAssignment_1 : ( RULE_INPUT_DESCRIPTION ) ;
    public final void rule__TreeRefinement__InputTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6122:1: ( ( RULE_INPUT_DESCRIPTION ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6123:1: ( RULE_INPUT_DESCRIPTION )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6123:1: ( RULE_INPUT_DESCRIPTION )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6124:1: RULE_INPUT_DESCRIPTION
            {
             before(grammarAccess.getTreeRefinementAccess().getInputTypeINPUT_DESCRIPTIONTerminalRuleCall_1_0()); 
            match(input,RULE_INPUT_DESCRIPTION,FOLLOW_RULE_INPUT_DESCRIPTION_in_rule__TreeRefinement__InputTypeAssignment_112363); 
             after(grammarAccess.getTreeRefinementAccess().getInputTypeINPUT_DESCRIPTIONTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeRefinement__InputTypeAssignment_1"


    // $ANTLR start "rule__TreeRefinement__IdAssignment_3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6133:1: rule__TreeRefinement__IdAssignment_3 : ( RULE_STRING ) ;
    public final void rule__TreeRefinement__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6137:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6138:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6138:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6139:1: RULE_STRING
            {
             before(grammarAccess.getTreeRefinementAccess().getIdSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TreeRefinement__IdAssignment_312394); 
             after(grammarAccess.getTreeRefinementAccess().getIdSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeRefinement__IdAssignment_3"


    // $ANTLR start "rule__TreeRefinement__PropertiesAssignment_4"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6148:1: rule__TreeRefinement__PropertiesAssignment_4 : ( ruleCommonProperties ) ;
    public final void rule__TreeRefinement__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6152:1: ( ( ruleCommonProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6153:1: ( ruleCommonProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6153:1: ( ruleCommonProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6154:1: ruleCommonProperties
            {
             before(grammarAccess.getTreeRefinementAccess().getPropertiesCommonPropertiesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleCommonProperties_in_rule__TreeRefinement__PropertiesAssignment_412425);
            ruleCommonProperties();

            state._fsp--;

             after(grammarAccess.getTreeRefinementAccess().getPropertiesCommonPropertiesParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeRefinement__PropertiesAssignment_4"


    // $ANTLR start "rule__InterchangeableRefinement__NameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6163:1: rule__InterchangeableRefinement__NameAssignment_0 : ( ( 'Interchangeable' ) ) ;
    public final void rule__InterchangeableRefinement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6167:1: ( ( ( 'Interchangeable' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6168:1: ( ( 'Interchangeable' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6168:1: ( ( 'Interchangeable' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6169:1: ( 'Interchangeable' )
            {
             before(grammarAccess.getInterchangeableRefinementAccess().getNameInterchangeableKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6170:1: ( 'Interchangeable' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6171:1: 'Interchangeable'
            {
             before(grammarAccess.getInterchangeableRefinementAccess().getNameInterchangeableKeyword_0_0()); 
            match(input,38,FOLLOW_38_in_rule__InterchangeableRefinement__NameAssignment_012461); 
             after(grammarAccess.getInterchangeableRefinementAccess().getNameInterchangeableKeyword_0_0()); 

            }

             after(grammarAccess.getInterchangeableRefinementAccess().getNameInterchangeableKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterchangeableRefinement__NameAssignment_0"


    // $ANTLR start "rule__InterchangeableRefinement__IdAssignment_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6186:1: rule__InterchangeableRefinement__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__InterchangeableRefinement__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6190:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6191:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6191:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6192:1: RULE_STRING
            {
             before(grammarAccess.getInterchangeableRefinementAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__InterchangeableRefinement__IdAssignment_212500); 
             after(grammarAccess.getInterchangeableRefinementAccess().getIdSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterchangeableRefinement__IdAssignment_2"


    // $ANTLR start "rule__InterchangeableRefinement__PropertiesAssignment_3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6201:1: rule__InterchangeableRefinement__PropertiesAssignment_3 : ( ruleCommonProperties ) ;
    public final void rule__InterchangeableRefinement__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6205:1: ( ( ruleCommonProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6206:1: ( ruleCommonProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6206:1: ( ruleCommonProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6207:1: ruleCommonProperties
            {
             before(grammarAccess.getInterchangeableRefinementAccess().getPropertiesCommonPropertiesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCommonProperties_in_rule__InterchangeableRefinement__PropertiesAssignment_312531);
            ruleCommonProperties();

            state._fsp--;

             after(grammarAccess.getInterchangeableRefinementAccess().getPropertiesCommonPropertiesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterchangeableRefinement__PropertiesAssignment_3"


    // $ANTLR start "rule__TextareaRefinement__NameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6216:1: rule__TextareaRefinement__NameAssignment_0 : ( ( 'Textarea' ) ) ;
    public final void rule__TextareaRefinement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6220:1: ( ( ( 'Textarea' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6221:1: ( ( 'Textarea' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6221:1: ( ( 'Textarea' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6222:1: ( 'Textarea' )
            {
             before(grammarAccess.getTextareaRefinementAccess().getNameTextareaKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6223:1: ( 'Textarea' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6224:1: 'Textarea'
            {
             before(grammarAccess.getTextareaRefinementAccess().getNameTextareaKeyword_0_0()); 
            match(input,39,FOLLOW_39_in_rule__TextareaRefinement__NameAssignment_012567); 
             after(grammarAccess.getTextareaRefinementAccess().getNameTextareaKeyword_0_0()); 

            }

             after(grammarAccess.getTextareaRefinementAccess().getNameTextareaKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaRefinement__NameAssignment_0"


    // $ANTLR start "rule__TextareaRefinement__IdAssignment_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6239:1: rule__TextareaRefinement__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TextareaRefinement__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6243:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6244:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6244:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6245:1: RULE_STRING
            {
             before(grammarAccess.getTextareaRefinementAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TextareaRefinement__IdAssignment_212606); 
             after(grammarAccess.getTextareaRefinementAccess().getIdSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaRefinement__IdAssignment_2"


    // $ANTLR start "rule__TextareaRefinement__PropertiesAssignment_3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6254:1: rule__TextareaRefinement__PropertiesAssignment_3 : ( ruleTextareaProperties ) ;
    public final void rule__TextareaRefinement__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6258:1: ( ( ruleTextareaProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6259:1: ( ruleTextareaProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6259:1: ( ruleTextareaProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6260:1: ruleTextareaProperties
            {
             before(grammarAccess.getTextareaRefinementAccess().getPropertiesTextareaPropertiesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTextareaProperties_in_rule__TextareaRefinement__PropertiesAssignment_312637);
            ruleTextareaProperties();

            state._fsp--;

             after(grammarAccess.getTextareaRefinementAccess().getPropertiesTextareaPropertiesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaRefinement__PropertiesAssignment_3"


    // $ANTLR start "rule__TextfieldRefinement__NameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6269:1: rule__TextfieldRefinement__NameAssignment_0 : ( ( 'Textfield' ) ) ;
    public final void rule__TextfieldRefinement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6273:1: ( ( ( 'Textfield' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6274:1: ( ( 'Textfield' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6274:1: ( ( 'Textfield' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6275:1: ( 'Textfield' )
            {
             before(grammarAccess.getTextfieldRefinementAccess().getNameTextfieldKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6276:1: ( 'Textfield' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6277:1: 'Textfield'
            {
             before(grammarAccess.getTextfieldRefinementAccess().getNameTextfieldKeyword_0_0()); 
            match(input,40,FOLLOW_40_in_rule__TextfieldRefinement__NameAssignment_012673); 
             after(grammarAccess.getTextfieldRefinementAccess().getNameTextfieldKeyword_0_0()); 

            }

             after(grammarAccess.getTextfieldRefinementAccess().getNameTextfieldKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldRefinement__NameAssignment_0"


    // $ANTLR start "rule__TextfieldRefinement__IdAssignment_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6292:1: rule__TextfieldRefinement__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TextfieldRefinement__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6296:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6297:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6297:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6298:1: RULE_STRING
            {
             before(grammarAccess.getTextfieldRefinementAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TextfieldRefinement__IdAssignment_212712); 
             after(grammarAccess.getTextfieldRefinementAccess().getIdSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldRefinement__IdAssignment_2"


    // $ANTLR start "rule__TextfieldRefinement__PropertiesAssignment_3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6307:1: rule__TextfieldRefinement__PropertiesAssignment_3 : ( ruleTextfieldProperties ) ;
    public final void rule__TextfieldRefinement__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6311:1: ( ( ruleTextfieldProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6312:1: ( ruleTextfieldProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6312:1: ( ruleTextfieldProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6313:1: ruleTextfieldProperties
            {
             before(grammarAccess.getTextfieldRefinementAccess().getPropertiesTextfieldPropertiesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTextfieldProperties_in_rule__TextfieldRefinement__PropertiesAssignment_312743);
            ruleTextfieldProperties();

            state._fsp--;

             after(grammarAccess.getTextfieldRefinementAccess().getPropertiesTextfieldPropertiesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldRefinement__PropertiesAssignment_3"


    // $ANTLR start "rule__ButtonRefinement__NameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6322:1: rule__ButtonRefinement__NameAssignment_0 : ( ( 'Button' ) ) ;
    public final void rule__ButtonRefinement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6326:1: ( ( ( 'Button' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6327:1: ( ( 'Button' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6327:1: ( ( 'Button' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6328:1: ( 'Button' )
            {
             before(grammarAccess.getButtonRefinementAccess().getNameButtonKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6329:1: ( 'Button' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6330:1: 'Button'
            {
             before(grammarAccess.getButtonRefinementAccess().getNameButtonKeyword_0_0()); 
            match(input,41,FOLLOW_41_in_rule__ButtonRefinement__NameAssignment_012779); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6345:1: rule__ButtonRefinement__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ButtonRefinement__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6349:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6350:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6350:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6351:1: RULE_STRING
            {
             before(grammarAccess.getButtonRefinementAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ButtonRefinement__IdAssignment_212818); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6360:1: rule__ButtonRefinement__PropertiesAssignment_3 : ( ruleButtonProperties ) ;
    public final void rule__ButtonRefinement__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6364:1: ( ( ruleButtonProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6365:1: ( ruleButtonProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6365:1: ( ruleButtonProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6366:1: ruleButtonProperties
            {
             before(grammarAccess.getButtonRefinementAccess().getPropertiesButtonPropertiesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleButtonProperties_in_rule__ButtonRefinement__PropertiesAssignment_312849);
            ruleButtonProperties();

            state._fsp--;

             after(grammarAccess.getButtonRefinementAccess().getPropertiesButtonPropertiesParserRuleCall_3_0()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6375:1: rule__LabelRefinement__NameAssignment_0 : ( ( 'Label' ) ) ;
    public final void rule__LabelRefinement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6379:1: ( ( ( 'Label' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6380:1: ( ( 'Label' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6380:1: ( ( 'Label' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6381:1: ( 'Label' )
            {
             before(grammarAccess.getLabelRefinementAccess().getNameLabelKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6382:1: ( 'Label' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6383:1: 'Label'
            {
             before(grammarAccess.getLabelRefinementAccess().getNameLabelKeyword_0_0()); 
            match(input,42,FOLLOW_42_in_rule__LabelRefinement__NameAssignment_012885); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6398:1: rule__LabelRefinement__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LabelRefinement__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6402:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6403:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6403:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6404:1: RULE_STRING
            {
             before(grammarAccess.getLabelRefinementAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LabelRefinement__IdAssignment_212924); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6413:1: rule__LabelRefinement__PropertiesAssignment_3 : ( ruleLabelProperties ) ;
    public final void rule__LabelRefinement__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6417:1: ( ( ruleLabelProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6418:1: ( ruleLabelProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6418:1: ( ruleLabelProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6419:1: ruleLabelProperties
            {
             before(grammarAccess.getLabelRefinementAccess().getPropertiesLabelPropertiesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleLabelProperties_in_rule__LabelRefinement__PropertiesAssignment_312955);
            ruleLabelProperties();

            state._fsp--;

             after(grammarAccess.getLabelRefinementAccess().getPropertiesLabelPropertiesParserRuleCall_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__TabViewDefinition__NameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6428:1: rule__TabViewDefinition__NameAssignment_0 : ( ( 'TabView' ) ) ;
    public final void rule__TabViewDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6432:1: ( ( ( 'TabView' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6433:1: ( ( 'TabView' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6433:1: ( ( 'TabView' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6434:1: ( 'TabView' )
            {
             before(grammarAccess.getTabViewDefinitionAccess().getNameTabViewKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6435:1: ( 'TabView' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6436:1: 'TabView'
            {
             before(grammarAccess.getTabViewDefinitionAccess().getNameTabViewKeyword_0_0()); 
            match(input,36,FOLLOW_36_in_rule__TabViewDefinition__NameAssignment_012991); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6451:1: rule__TabViewDefinition__TabsAssignment_1 : ( ruleTabDefinition ) ;
    public final void rule__TabViewDefinition__TabsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6455:1: ( ( ruleTabDefinition ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6456:1: ( ruleTabDefinition )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6456:1: ( ruleTabDefinition )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6457:1: ruleTabDefinition
            {
             before(grammarAccess.getTabViewDefinitionAccess().getTabsTabDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTabDefinition_in_rule__TabViewDefinition__TabsAssignment_113030);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6466:1: rule__TabViewDefinition__IdAssignment_3 : ( RULE_STRING ) ;
    public final void rule__TabViewDefinition__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6470:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6471:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6471:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6472:1: RULE_STRING
            {
             before(grammarAccess.getTabViewDefinitionAccess().getIdSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TabViewDefinition__IdAssignment_313061); 
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


    // $ANTLR start "rule__TabViewDefinition__PropertiesAssignment_4"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6481:1: rule__TabViewDefinition__PropertiesAssignment_4 : ( ruleCommonProperties ) ;
    public final void rule__TabViewDefinition__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6485:1: ( ( ruleCommonProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6486:1: ( ruleCommonProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6486:1: ( ruleCommonProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6487:1: ruleCommonProperties
            {
             before(grammarAccess.getTabViewDefinitionAccess().getPropertiesCommonPropertiesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleCommonProperties_in_rule__TabViewDefinition__PropertiesAssignment_413092);
            ruleCommonProperties();

            state._fsp--;

             after(grammarAccess.getTabViewDefinitionAccess().getPropertiesCommonPropertiesParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabViewDefinition__PropertiesAssignment_4"


    // $ANTLR start "rule__TabDefinition__NameAssignment"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6496:1: rule__TabDefinition__NameAssignment : ( RULE_TABNAME ) ;
    public final void rule__TabDefinition__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6500:1: ( ( RULE_TABNAME ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6501:1: ( RULE_TABNAME )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6501:1: ( RULE_TABNAME )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6502:1: RULE_TABNAME
            {
             before(grammarAccess.getTabDefinitionAccess().getNameTABNAMETerminalRuleCall_0()); 
            match(input,RULE_TABNAME,FOLLOW_RULE_TABNAME_in_rule__TabDefinition__NameAssignment13123); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6511:1: rule__Multiselection__NameAssignment_0 : ( ( 'Multiselection' ) ) ;
    public final void rule__Multiselection__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6515:1: ( ( ( 'Multiselection' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6516:1: ( ( 'Multiselection' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6516:1: ( ( 'Multiselection' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6517:1: ( 'Multiselection' )
            {
             before(grammarAccess.getMultiselectionAccess().getNameMultiselectionKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6518:1: ( 'Multiselection' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6519:1: 'Multiselection'
            {
             before(grammarAccess.getMultiselectionAccess().getNameMultiselectionKeyword_0_0()); 
            match(input,43,FOLLOW_43_in_rule__Multiselection__NameAssignment_013159); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6534:1: rule__Multiselection__InputTypeAssignment_1 : ( RULE_INPUT_DESCRIPTION ) ;
    public final void rule__Multiselection__InputTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6538:1: ( ( RULE_INPUT_DESCRIPTION ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6539:1: ( RULE_INPUT_DESCRIPTION )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6539:1: ( RULE_INPUT_DESCRIPTION )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6540:1: RULE_INPUT_DESCRIPTION
            {
             before(grammarAccess.getMultiselectionAccess().getInputTypeINPUT_DESCRIPTIONTerminalRuleCall_1_0()); 
            match(input,RULE_INPUT_DESCRIPTION,FOLLOW_RULE_INPUT_DESCRIPTION_in_rule__Multiselection__InputTypeAssignment_113198); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6549:1: rule__TextfieldDefinition__NameAssignment_0 : ( ( 'Textfield' ) ) ;
    public final void rule__TextfieldDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6553:1: ( ( ( 'Textfield' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6554:1: ( ( 'Textfield' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6554:1: ( ( 'Textfield' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6555:1: ( 'Textfield' )
            {
             before(grammarAccess.getTextfieldDefinitionAccess().getNameTextfieldKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6556:1: ( 'Textfield' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6557:1: 'Textfield'
            {
             before(grammarAccess.getTextfieldDefinitionAccess().getNameTextfieldKeyword_0_0()); 
            match(input,40,FOLLOW_40_in_rule__TextfieldDefinition__NameAssignment_013234); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6572:1: rule__TextfieldDefinition__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TextfieldDefinition__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6576:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6577:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6577:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6578:1: RULE_STRING
            {
             before(grammarAccess.getTextfieldDefinitionAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TextfieldDefinition__IdAssignment_213273); 
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


    // $ANTLR start "rule__TextfieldDefinition__PropertiesAssignment_3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6587:1: rule__TextfieldDefinition__PropertiesAssignment_3 : ( ruleTextfieldProperties ) ;
    public final void rule__TextfieldDefinition__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6591:1: ( ( ruleTextfieldProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6592:1: ( ruleTextfieldProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6592:1: ( ruleTextfieldProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6593:1: ruleTextfieldProperties
            {
             before(grammarAccess.getTextfieldDefinitionAccess().getPropertiesTextfieldPropertiesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTextfieldProperties_in_rule__TextfieldDefinition__PropertiesAssignment_313304);
            ruleTextfieldProperties();

            state._fsp--;

             after(grammarAccess.getTextfieldDefinitionAccess().getPropertiesTextfieldPropertiesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextfieldDefinition__PropertiesAssignment_3"


    // $ANTLR start "rule__TextareaDefinition__NameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6602:1: rule__TextareaDefinition__NameAssignment_0 : ( ( 'Textarea' ) ) ;
    public final void rule__TextareaDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6606:1: ( ( ( 'Textarea' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6607:1: ( ( 'Textarea' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6607:1: ( ( 'Textarea' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6608:1: ( 'Textarea' )
            {
             before(grammarAccess.getTextareaDefinitionAccess().getNameTextareaKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6609:1: ( 'Textarea' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6610:1: 'Textarea'
            {
             before(grammarAccess.getTextareaDefinitionAccess().getNameTextareaKeyword_0_0()); 
            match(input,39,FOLLOW_39_in_rule__TextareaDefinition__NameAssignment_013340); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6625:1: rule__TextareaDefinition__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TextareaDefinition__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6629:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6630:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6630:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6631:1: RULE_STRING
            {
             before(grammarAccess.getTextareaDefinitionAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TextareaDefinition__IdAssignment_213379); 
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


    // $ANTLR start "rule__TextareaDefinition__PropertiesAssignment_3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6640:1: rule__TextareaDefinition__PropertiesAssignment_3 : ( ruleTextareaProperties ) ;
    public final void rule__TextareaDefinition__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6644:1: ( ( ruleTextareaProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6645:1: ( ruleTextareaProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6645:1: ( ruleTextareaProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6646:1: ruleTextareaProperties
            {
             before(grammarAccess.getTextareaDefinitionAccess().getPropertiesTextareaPropertiesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTextareaProperties_in_rule__TextareaDefinition__PropertiesAssignment_313410);
            ruleTextareaProperties();

            state._fsp--;

             after(grammarAccess.getTextareaDefinitionAccess().getPropertiesTextareaPropertiesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextareaDefinition__PropertiesAssignment_3"


    // $ANTLR start "rule__TreeDefinition__NameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6655:1: rule__TreeDefinition__NameAssignment_0 : ( ( 'Tree' ) ) ;
    public final void rule__TreeDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6659:1: ( ( ( 'Tree' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6660:1: ( ( 'Tree' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6660:1: ( ( 'Tree' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6661:1: ( 'Tree' )
            {
             before(grammarAccess.getTreeDefinitionAccess().getNameTreeKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6662:1: ( 'Tree' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6663:1: 'Tree'
            {
             before(grammarAccess.getTreeDefinitionAccess().getNameTreeKeyword_0_0()); 
            match(input,37,FOLLOW_37_in_rule__TreeDefinition__NameAssignment_013446); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6678:1: rule__TreeDefinition__InputTypeAssignment_1 : ( RULE_INPUT_DESCRIPTION ) ;
    public final void rule__TreeDefinition__InputTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6682:1: ( ( RULE_INPUT_DESCRIPTION ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6683:1: ( RULE_INPUT_DESCRIPTION )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6683:1: ( RULE_INPUT_DESCRIPTION )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6684:1: RULE_INPUT_DESCRIPTION
            {
             before(grammarAccess.getTreeDefinitionAccess().getInputTypeINPUT_DESCRIPTIONTerminalRuleCall_1_0()); 
            match(input,RULE_INPUT_DESCRIPTION,FOLLOW_RULE_INPUT_DESCRIPTION_in_rule__TreeDefinition__InputTypeAssignment_113485); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6693:1: rule__TreeDefinition__IdAssignment_3 : ( RULE_STRING ) ;
    public final void rule__TreeDefinition__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6697:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6698:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6698:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6699:1: RULE_STRING
            {
             before(grammarAccess.getTreeDefinitionAccess().getIdSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TreeDefinition__IdAssignment_313516); 
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


    // $ANTLR start "rule__TreeDefinition__PropertiesAssignment_4"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6708:1: rule__TreeDefinition__PropertiesAssignment_4 : ( ruleCommonProperties ) ;
    public final void rule__TreeDefinition__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6712:1: ( ( ruleCommonProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6713:1: ( ruleCommonProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6713:1: ( ruleCommonProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6714:1: ruleCommonProperties
            {
             before(grammarAccess.getTreeDefinitionAccess().getPropertiesCommonPropertiesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleCommonProperties_in_rule__TreeDefinition__PropertiesAssignment_413547);
            ruleCommonProperties();

            state._fsp--;

             after(grammarAccess.getTreeDefinitionAccess().getPropertiesCommonPropertiesParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TreeDefinition__PropertiesAssignment_4"


    // $ANTLR start "rule__TableDefinition__NameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6723:1: rule__TableDefinition__NameAssignment_0 : ( ( 'Table' ) ) ;
    public final void rule__TableDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6727:1: ( ( ( 'Table' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6728:1: ( ( 'Table' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6728:1: ( ( 'Table' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6729:1: ( 'Table' )
            {
             before(grammarAccess.getTableDefinitionAccess().getNameTableKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6730:1: ( 'Table' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6731:1: 'Table'
            {
             before(grammarAccess.getTableDefinitionAccess().getNameTableKeyword_0_0()); 
            match(input,35,FOLLOW_35_in_rule__TableDefinition__NameAssignment_013583); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6746:1: rule__TableDefinition__InputTypeAssignment_1 : ( RULE_INPUT_DESCRIPTION ) ;
    public final void rule__TableDefinition__InputTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6750:1: ( ( RULE_INPUT_DESCRIPTION ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6751:1: ( RULE_INPUT_DESCRIPTION )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6751:1: ( RULE_INPUT_DESCRIPTION )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6752:1: RULE_INPUT_DESCRIPTION
            {
             before(grammarAccess.getTableDefinitionAccess().getInputTypeINPUT_DESCRIPTIONTerminalRuleCall_1_0()); 
            match(input,RULE_INPUT_DESCRIPTION,FOLLOW_RULE_INPUT_DESCRIPTION_in_rule__TableDefinition__InputTypeAssignment_113622); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6761:1: rule__TableDefinition__IdAssignment_3 : ( RULE_STRING ) ;
    public final void rule__TableDefinition__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6765:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6766:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6766:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6767:1: RULE_STRING
            {
             before(grammarAccess.getTableDefinitionAccess().getIdSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TableDefinition__IdAssignment_313653); 
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


    // $ANTLR start "rule__TableDefinition__PropertiesAssignment_4"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6776:1: rule__TableDefinition__PropertiesAssignment_4 : ( ruleCommonProperties ) ;
    public final void rule__TableDefinition__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6780:1: ( ( ruleCommonProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6781:1: ( ruleCommonProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6781:1: ( ruleCommonProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6782:1: ruleCommonProperties
            {
             before(grammarAccess.getTableDefinitionAccess().getPropertiesCommonPropertiesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleCommonProperties_in_rule__TableDefinition__PropertiesAssignment_413684);
            ruleCommonProperties();

            state._fsp--;

             after(grammarAccess.getTableDefinitionAccess().getPropertiesCommonPropertiesParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDefinition__PropertiesAssignment_4"


    // $ANTLR start "rule__InterchangeableDefinition__NameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6791:1: rule__InterchangeableDefinition__NameAssignment_0 : ( ( 'Interchangeable' ) ) ;
    public final void rule__InterchangeableDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6795:1: ( ( ( 'Interchangeable' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6796:1: ( ( 'Interchangeable' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6796:1: ( ( 'Interchangeable' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6797:1: ( 'Interchangeable' )
            {
             before(grammarAccess.getInterchangeableDefinitionAccess().getNameInterchangeableKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6798:1: ( 'Interchangeable' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6799:1: 'Interchangeable'
            {
             before(grammarAccess.getInterchangeableDefinitionAccess().getNameInterchangeableKeyword_0_0()); 
            match(input,38,FOLLOW_38_in_rule__InterchangeableDefinition__NameAssignment_013720); 
             after(grammarAccess.getInterchangeableDefinitionAccess().getNameInterchangeableKeyword_0_0()); 

            }

             after(grammarAccess.getInterchangeableDefinitionAccess().getNameInterchangeableKeyword_0_0()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6814:1: rule__InterchangeableDefinition__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__InterchangeableDefinition__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6818:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6819:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6819:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6820:1: RULE_STRING
            {
             before(grammarAccess.getInterchangeableDefinitionAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__InterchangeableDefinition__IdAssignment_213759); 
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


    // $ANTLR start "rule__InterchangeableDefinition__PropertiesAssignment_3"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6829:1: rule__InterchangeableDefinition__PropertiesAssignment_3 : ( ruleCommonProperties ) ;
    public final void rule__InterchangeableDefinition__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6833:1: ( ( ruleCommonProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6834:1: ( ruleCommonProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6834:1: ( ruleCommonProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6835:1: ruleCommonProperties
            {
             before(grammarAccess.getInterchangeableDefinitionAccess().getPropertiesCommonPropertiesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCommonProperties_in_rule__InterchangeableDefinition__PropertiesAssignment_313790);
            ruleCommonProperties();

            state._fsp--;

             after(grammarAccess.getInterchangeableDefinitionAccess().getPropertiesCommonPropertiesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterchangeableDefinition__PropertiesAssignment_3"


    // $ANTLR start "rule__ButtonDefinition__NameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6844:1: rule__ButtonDefinition__NameAssignment_0 : ( ( 'Button' ) ) ;
    public final void rule__ButtonDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6848:1: ( ( ( 'Button' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6849:1: ( ( 'Button' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6849:1: ( ( 'Button' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6850:1: ( 'Button' )
            {
             before(grammarAccess.getButtonDefinitionAccess().getNameButtonKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6851:1: ( 'Button' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6852:1: 'Button'
            {
             before(grammarAccess.getButtonDefinitionAccess().getNameButtonKeyword_0_0()); 
            match(input,41,FOLLOW_41_in_rule__ButtonDefinition__NameAssignment_013826); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6867:1: rule__ButtonDefinition__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ButtonDefinition__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6871:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6872:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6872:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6873:1: RULE_STRING
            {
             before(grammarAccess.getButtonDefinitionAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ButtonDefinition__IdAssignment_213865); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6882:1: rule__ButtonDefinition__PropertiesAssignment_3 : ( ruleButtonProperties ) ;
    public final void rule__ButtonDefinition__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6886:1: ( ( ruleButtonProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6887:1: ( ruleButtonProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6887:1: ( ruleButtonProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6888:1: ruleButtonProperties
            {
             before(grammarAccess.getButtonDefinitionAccess().getPropertiesButtonPropertiesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleButtonProperties_in_rule__ButtonDefinition__PropertiesAssignment_313896);
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


    // $ANTLR start "rule__LabelDefinition__NameAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6897:1: rule__LabelDefinition__NameAssignment_0 : ( ( 'Label' ) ) ;
    public final void rule__LabelDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6901:1: ( ( ( 'Label' ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6902:1: ( ( 'Label' ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6902:1: ( ( 'Label' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6903:1: ( 'Label' )
            {
             before(grammarAccess.getLabelDefinitionAccess().getNameLabelKeyword_0_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6904:1: ( 'Label' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6905:1: 'Label'
            {
             before(grammarAccess.getLabelDefinitionAccess().getNameLabelKeyword_0_0()); 
            match(input,42,FOLLOW_42_in_rule__LabelDefinition__NameAssignment_013932); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6920:1: rule__LabelDefinition__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LabelDefinition__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6924:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6925:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6925:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6926:1: RULE_STRING
            {
             before(grammarAccess.getLabelDefinitionAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LabelDefinition__IdAssignment_213971); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6935:1: rule__LabelDefinition__PropertiesAssignment_3 : ( ruleLabelProperties ) ;
    public final void rule__LabelDefinition__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6939:1: ( ( ruleLabelProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6940:1: ( ruleLabelProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6940:1: ( ruleLabelProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6941:1: ruleLabelProperties
            {
             before(grammarAccess.getLabelDefinitionAccess().getPropertiesLabelPropertiesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleLabelProperties_in_rule__LabelDefinition__PropertiesAssignment_314002);
            ruleLabelProperties();

            state._fsp--;

             after(grammarAccess.getLabelDefinitionAccess().getPropertiesLabelPropertiesParserRuleCall_3_0()); 

            }


            }

        }
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6950:1: rule__Interactiontype__IdAssignment : ( ( rule__Interactiontype__IdAlternatives_0 ) ) ;
    public final void rule__Interactiontype__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6954:1: ( ( ( rule__Interactiontype__IdAlternatives_0 ) ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6955:1: ( ( rule__Interactiontype__IdAlternatives_0 ) )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6955:1: ( ( rule__Interactiontype__IdAlternatives_0 ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6956:1: ( rule__Interactiontype__IdAlternatives_0 )
            {
             before(grammarAccess.getInteractiontypeAccess().getIdAlternatives_0()); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6957:1: ( rule__Interactiontype__IdAlternatives_0 )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6957:2: rule__Interactiontype__IdAlternatives_0
            {
            pushFollow(FOLLOW_rule__Interactiontype__IdAlternatives_0_in_rule__Interactiontype__IdAssignment14033);
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


    // $ANTLR start "rule__TextareaProperties__CommonPropertiesAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6966:1: rule__TextareaProperties__CommonPropertiesAssignment_0 : ( ruleCommonProperties ) ;
    public final void rule__TextareaProperties__CommonPropertiesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6970:1: ( ( ruleCommonProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6971:1: ( ruleCommonProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6971:1: ( ruleCommonProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6972:1: ruleCommonProperties
            {
             before(grammarAccess.getTextareaPropertiesAccess().getCommonPropertiesCommonPropertiesParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCommonProperties_in_rule__TextareaProperties__CommonPropertiesAssignment_014066);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6981:1: rule__TextareaProperties__TextAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__TextareaProperties__TextAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6985:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6986:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6986:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6987:1: RULE_STRING
            {
             before(grammarAccess.getTextareaPropertiesAccess().getTextSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TextareaProperties__TextAssignment_1_114097); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:6996:1: rule__TextareaProperties__EditableAssignment_2_1 : ( RULE_BOOLEAN ) ;
    public final void rule__TextareaProperties__EditableAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7000:1: ( ( RULE_BOOLEAN ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7001:1: ( RULE_BOOLEAN )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7001:1: ( RULE_BOOLEAN )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7002:1: RULE_BOOLEAN
            {
             before(grammarAccess.getTextareaPropertiesAccess().getEditableBOOLEANTerminalRuleCall_2_1_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__TextareaProperties__EditableAssignment_2_114128); 
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


    // $ANTLR start "rule__TextfieldProperties__CommonPropertiesAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7011:1: rule__TextfieldProperties__CommonPropertiesAssignment_0 : ( ruleCommonProperties ) ;
    public final void rule__TextfieldProperties__CommonPropertiesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7015:1: ( ( ruleCommonProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7016:1: ( ruleCommonProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7016:1: ( ruleCommonProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7017:1: ruleCommonProperties
            {
             before(grammarAccess.getTextfieldPropertiesAccess().getCommonPropertiesCommonPropertiesParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCommonProperties_in_rule__TextfieldProperties__CommonPropertiesAssignment_014159);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7026:1: rule__TextfieldProperties__TextAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__TextfieldProperties__TextAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7030:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7031:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7031:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7032:1: RULE_STRING
            {
             before(grammarAccess.getTextfieldPropertiesAccess().getTextSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TextfieldProperties__TextAssignment_1_114190); 
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7041:1: rule__TextfieldProperties__EditableAssignment_2_1 : ( RULE_BOOLEAN ) ;
    public final void rule__TextfieldProperties__EditableAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7045:1: ( ( RULE_BOOLEAN ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7046:1: ( RULE_BOOLEAN )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7046:1: ( RULE_BOOLEAN )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7047:1: RULE_BOOLEAN
            {
             before(grammarAccess.getTextfieldPropertiesAccess().getEditableBOOLEANTerminalRuleCall_2_1_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__TextfieldProperties__EditableAssignment_2_114221); 
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


    // $ANTLR start "rule__LabelProperties__CommonPropertiesAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7056:1: rule__LabelProperties__CommonPropertiesAssignment_0 : ( ruleCommonProperties ) ;
    public final void rule__LabelProperties__CommonPropertiesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7060:1: ( ( ruleCommonProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7061:1: ( ruleCommonProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7061:1: ( ruleCommonProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7062:1: ruleCommonProperties
            {
             before(grammarAccess.getLabelPropertiesAccess().getCommonPropertiesCommonPropertiesParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCommonProperties_in_rule__LabelProperties__CommonPropertiesAssignment_014252);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7071:1: rule__LabelProperties__TextAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__LabelProperties__TextAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7075:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7076:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7076:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7077:1: RULE_STRING
            {
             before(grammarAccess.getLabelPropertiesAccess().getTextSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LabelProperties__TextAssignment_1_114283); 
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


    // $ANTLR start "rule__ButtonProperties__CommonPropertiesAssignment_0"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7086:1: rule__ButtonProperties__CommonPropertiesAssignment_0 : ( ruleCommonProperties ) ;
    public final void rule__ButtonProperties__CommonPropertiesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7090:1: ( ( ruleCommonProperties ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7091:1: ( ruleCommonProperties )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7091:1: ( ruleCommonProperties )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7092:1: ruleCommonProperties
            {
             before(grammarAccess.getButtonPropertiesAccess().getCommonPropertiesCommonPropertiesParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCommonProperties_in_rule__ButtonProperties__CommonPropertiesAssignment_014314);
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
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7101:1: rule__ButtonProperties__TextAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__ButtonProperties__TextAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7105:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7106:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7106:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7107:1: RULE_STRING
            {
             before(grammarAccess.getButtonPropertiesAccess().getTextSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ButtonProperties__TextAssignment_1_114345); 
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


    // $ANTLR start "rule__CommonProperties__PropertyKeyAssignment_1_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7116:1: rule__CommonProperties__PropertyKeyAssignment_1_2 : ( RULE_STRING ) ;
    public final void rule__CommonProperties__PropertyKeyAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7120:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7121:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7121:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7122:1: RULE_STRING
            {
             before(grammarAccess.getCommonPropertiesAccess().getPropertyKeySTRINGTerminalRuleCall_1_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CommonProperties__PropertyKeyAssignment_1_214376); 
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


    // $ANTLR start "rule__CommonProperties__LayoutKeyAssignment_2_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7131:1: rule__CommonProperties__LayoutKeyAssignment_2_2 : ( RULE_STRING ) ;
    public final void rule__CommonProperties__LayoutKeyAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7135:1: ( ( RULE_STRING ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7136:1: ( RULE_STRING )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7136:1: ( RULE_STRING )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7137:1: RULE_STRING
            {
             before(grammarAccess.getCommonPropertiesAccess().getLayoutKeySTRINGTerminalRuleCall_2_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CommonProperties__LayoutKeyAssignment_2_214407); 
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


    // $ANTLR start "rule__CommonProperties__InteractiontypeAssignment_3_2"
    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7146:1: rule__CommonProperties__InteractiontypeAssignment_3_2 : ( ruleInteractiontype ) ;
    public final void rule__CommonProperties__InteractiontypeAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7150:1: ( ( ruleInteractiontype ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7151:1: ( ruleInteractiontype )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7151:1: ( ruleInteractiontype )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7152:1: ruleInteractiontype
            {
             before(grammarAccess.getCommonPropertiesAccess().getInteractiontypeInteractiontypeParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleInteractiontype_in_rule__CommonProperties__InteractiontypeAssignment_3_214438);
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

    // Delegated rules


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\16\uffff";
    static final String DFA9_eofS =
        "\16\uffff";
    static final String DFA9_minS =
        "\1\42\4\30\2\5\1\6\1\30\2\uffff\2\30\1\6";
    static final String DFA9_maxS =
        "\1\52\10\32\2\uffff\3\32";
    static final String DFA9_acceptS =
        "\11\uffff\1\2\1\1\3\uffff";
    static final String DFA9_specialS =
        "\16\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\11\1\6\1\7\1\5\1\10\1\4\1\3\1\2\1\1",
            "\1\11\1\uffff\1\12",
            "\1\11\1\uffff\1\12",
            "\1\11\1\uffff\1\12",
            "\1\11\1\uffff\1\12",
            "\1\13\22\uffff\1\11\1\uffff\1\12",
            "\1\14\22\uffff\1\11\1\uffff\1\12",
            "\1\15\21\uffff\1\11\1\uffff\1\12",
            "\1\11\1\uffff\1\12",
            "",
            "",
            "\1\11\1\uffff\1\12",
            "\1\11\1\uffff\1\12",
            "\1\11\21\uffff\1\11\1\uffff\1\12"
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "()* loopback of 1487:1: ( rule__UIDescription__RefinementsAssignment_4 )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleUIDescription_in_entryRuleUIDescription61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIDescription68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__0_in_ruleUIDescription94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__0_in_ruleTypeDefinition154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__IdAssignment_in_ruleType214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayout_in_entryRuleLayout301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayout308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layout__Group__0_in_ruleLayout334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsedDescription_in_entryRuleUsedDescription361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsedDescription368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescription__Group__0_in_ruleUsedDescription394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescriptionType_in_entryRuleDescriptionType421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescriptionType428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DescriptionType__Alternatives_in_ruleDescriptionType454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexComponent_in_entryRuleComplexComponent481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexComponent488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiselection_in_ruleComplexComponent514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIDescriptionImport_in_entryRuleUIDescriptionImport540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIDescriptionImport547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescriptionImport__DescriptionNameAssignment_in_ruleUIDescriptionImport573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefinement_in_entryRuleRefinement600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefinement607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refinement__Group__0_in_ruleRefinement633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentRefinement_in_entryRuleComponentRefinement660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentRefinement667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentRefinement__Alternatives_in_ruleComponentRefinement693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0_in_ruleDefinition753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDefinition_in_entryRuleComponentDefinition780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentDefinition787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentDefinition__Alternatives_in_ruleComponentDefinition813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructure_in_entryRuleStructure840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructure847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__Group__0_in_ruleStructure873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__IdAssignment_in_ruleElement933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableRefinement_in_entryRuleTableRefinement960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableRefinement967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableRefinement__Group__0_in_ruleTableRefinement993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabViewRefinement_in_entryRuleTabViewRefinement1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabViewRefinement1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabViewRefinement__Group__0_in_ruleTabViewRefinement1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreeRefinement_in_entryRuleTreeRefinement1080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTreeRefinement1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeRefinement__Group__0_in_ruleTreeRefinement1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterchangeableRefinement_in_entryRuleInterchangeableRefinement1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterchangeableRefinement1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterchangeableRefinement__Group__0_in_ruleInterchangeableRefinement1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextareaRefinement_in_entryRuleTextareaRefinement1200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextareaRefinement1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaRefinement__Group__0_in_ruleTextareaRefinement1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfieldRefinement_in_entryRuleTextfieldRefinement1260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextfieldRefinement1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldRefinement__Group__0_in_ruleTextfieldRefinement1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonRefinement_in_entryRuleButtonRefinement1320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonRefinement1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__0_in_ruleButtonRefinement1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelRefinement_in_entryRuleLabelRefinement1380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelRefinement1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__0_in_ruleLabelRefinement1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabViewDefinition_in_entryRuleTabViewDefinition1440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabViewDefinition1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabViewDefinition__Group__0_in_ruleTabViewDefinition1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabDefinition_in_entryRuleTabDefinition1500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabDefinition1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabDefinition__NameAssignment_in_ruleTabDefinition1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiselection_in_entryRuleMultiselection1560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiselection1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiselection__Group__0_in_ruleMultiselection1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfieldDefinition_in_entryRuleTextfieldDefinition1620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextfieldDefinition1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__0_in_ruleTextfieldDefinition1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextareaDefinition_in_entryRuleTextareaDefinition1680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextareaDefinition1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaDefinition__Group__0_in_ruleTextareaDefinition1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreeDefinition_in_entryRuleTreeDefinition1740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTreeDefinition1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__0_in_ruleTreeDefinition1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableDefinition_in_entryRuleTableDefinition1800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableDefinition1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__0_in_ruleTableDefinition1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterchangeableDefinition_in_entryRuleInterchangeableDefinition1860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterchangeableDefinition1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterchangeableDefinition__Group__0_in_ruleInterchangeableDefinition1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonDefinition_in_entryRuleButtonDefinition1920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonDefinition1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__0_in_ruleButtonDefinition1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelDefinition_in_entryRuleLabelDefinition1980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelDefinition1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__0_in_ruleLabelDefinition2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractiontype_in_entryRuleInteractiontype2040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractiontype2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interactiontype__IdAssignment_in_ruleInteractiontype2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextareaProperties_in_entryRuleTextareaProperties2100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextareaProperties2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaProperties__Group__0_in_ruleTextareaProperties2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfieldProperties_in_entryRuleTextfieldProperties2160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextfieldProperties2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldProperties__Group__0_in_ruleTextfieldProperties2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelProperties_in_entryRuleLabelProperties2220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelProperties2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelProperties__Group__0_in_ruleLabelProperties2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonProperties_in_entryRuleButtonProperties2280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonProperties2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonProperties__Group__0_in_ruleButtonProperties2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_entryRuleCommonProperties2340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonProperties2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group__0_in_ruleCommonProperties2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Type__IdAlternatives_02410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Type__IdAlternatives_02430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIDescriptionImport_in_rule__DescriptionType__Alternatives2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexComponent_in_rule__DescriptionType__Alternatives2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelRefinement_in_rule__ComponentRefinement__Alternatives2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonRefinement_in_rule__ComponentRefinement__Alternatives2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfieldRefinement_in_rule__ComponentRefinement__Alternatives2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextareaRefinement_in_rule__ComponentRefinement__Alternatives2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableRefinement_in_rule__ComponentRefinement__Alternatives2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabViewRefinement_in_rule__ComponentRefinement__Alternatives2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreeRefinement_in_rule__ComponentRefinement__Alternatives2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterchangeableRefinement_in_rule__ComponentRefinement__Alternatives2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelDefinition_in_rule__ComponentDefinition__Alternatives2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonDefinition_in_rule__ComponentDefinition__Alternatives2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfieldDefinition_in_rule__ComponentDefinition__Alternatives2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextareaDefinition_in_rule__ComponentDefinition__Alternatives2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreeDefinition_in_rule__ComponentDefinition__Alternatives2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableDefinition_in_rule__ComponentDefinition__Alternatives2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabViewDefinition_in_rule__ComponentDefinition__Alternatives2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterchangeableDefinition_in_rule__ComponentDefinition__Alternatives2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Interactiontype__IdAlternatives_02816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Interactiontype__IdAlternatives_02836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Interactiontype__IdAlternatives_02856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__0__Impl_in_rule__UIDescription__Group__02888 = new BitSet(new long[]{0x000007FC00E00000L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__1_in_rule__UIDescription__Group__02891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__TypeDefinitionAssignment_0_in_rule__UIDescription__Group__0__Impl2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__1__Impl_in_rule__UIDescription__Group__12948 = new BitSet(new long[]{0x000007FC00E00000L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__2_in_rule__UIDescription__Group__12951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__PropertyAssignment_1_in_rule__UIDescription__Group__1__Impl2978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__2__Impl_in_rule__UIDescription__Group__23009 = new BitSet(new long[]{0x000007FC00E00000L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__3_in_rule__UIDescription__Group__23012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__LayoutAssignment_2_in_rule__UIDescription__Group__2__Impl3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__3__Impl_in_rule__UIDescription__Group__33070 = new BitSet(new long[]{0x000007FC00E00000L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__4_in_rule__UIDescription__Group__33073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__UsedDescriptionsAssignment_3_in_rule__UIDescription__Group__3__Impl3100 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__4__Impl_in_rule__UIDescription__Group__43131 = new BitSet(new long[]{0x000007FC00E00000L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__5_in_rule__UIDescription__Group__43134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__RefinementsAssignment_4_in_rule__UIDescription__Group__4__Impl3161 = new BitSet(new long[]{0x000007F800000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__5__Impl_in_rule__UIDescription__Group__53192 = new BitSet(new long[]{0x000007FC00E00000L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__6_in_rule__UIDescription__Group__53195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__DefinitionsAssignment_5_in_rule__UIDescription__Group__5__Impl3222 = new BitSet(new long[]{0x000007F800000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__6__Impl_in_rule__UIDescription__Group__63253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__StructureAssignment_6_in_rule__UIDescription__Group__6__Impl3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__0__Impl_in_rule__TypeDefinition__Group__03324 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__1_in_rule__TypeDefinition__Group__03327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__TypeDefinition__Group__0__Impl3355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__1__Impl_in_rule__TypeDefinition__Group__13386 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__2_in_rule__TypeDefinition__Group__13389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__TypeAssignment_1_in_rule__TypeDefinition__Group__1__Impl3416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__2__Impl_in_rule__TypeDefinition__Group__23446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__TypeDefinition__Group__2__Impl3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__03511 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__03514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Property__Group__0__Impl3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__13573 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__13576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__PropertiesFilesAssignment_1_in_rule__Property__Group__1__Impl3605 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Property__PropertiesFilesAssignment_1_in_rule__Property__Group__1__Impl3617 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__23650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Property__Group__2__Impl3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layout__Group__0__Impl_in_rule__Layout__Group__03715 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Layout__Group__1_in_rule__Layout__Group__03718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Layout__Group__0__Impl3746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layout__Group__1__Impl_in_rule__Layout__Group__13777 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Layout__Group__2_in_rule__Layout__Group__13780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layout__LayoutFilesAssignment_1_in_rule__Layout__Group__1__Impl3809 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Layout__LayoutFilesAssignment_1_in_rule__Layout__Group__1__Impl3821 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Layout__Group__2__Impl_in_rule__Layout__Group__23854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Layout__Group__2__Impl3882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescription__Group__0__Impl_in_rule__UsedDescription__Group__03919 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__UsedDescription__Group__1_in_rule__UsedDescription__Group__03922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__UsedDescription__Group__0__Impl3950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescription__Group__1__Impl_in_rule__UsedDescription__Group__13981 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_rule__UsedDescription__Group__2_in_rule__UsedDescription__Group__13984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescription__DescriptionTypeAssignment_1_in_rule__UsedDescription__Group__1__Impl4011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescription__Group__2__Impl_in_rule__UsedDescription__Group__24041 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_rule__UsedDescription__Group__3_in_rule__UsedDescription__Group__24044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescription__Group_2__0_in_rule__UsedDescription__Group__2__Impl4071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescription__Group__3__Impl_in_rule__UsedDescription__Group__34102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__UsedDescription__Group__3__Impl4130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescription__Group_2__0__Impl_in_rule__UsedDescription__Group_2__04169 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UsedDescription__Group_2__1_in_rule__UsedDescription__Group_2__04172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__UsedDescription__Group_2__0__Impl4200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescription__Group_2__1__Impl_in_rule__UsedDescription__Group_2__14231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsedDescription__IdAssignment_2_1_in_rule__UsedDescription__Group_2__1__Impl4258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refinement__Group__0__Impl_in_rule__Refinement__Group__04292 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Refinement__Group__1_in_rule__Refinement__Group__04295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refinement__ConcreteRefinementAssignment_0_in_rule__Refinement__Group__0__Impl4322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refinement__Group__1__Impl_in_rule__Refinement__Group__14352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Refinement__Group__1__Impl4380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__04415 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__04418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__ConcreteDefitionAssignment_0_in_rule__Definition__Group__0__Impl4445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__14475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Definition__Group__1__Impl4503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__Group__0__Impl_in_rule__Structure__Group__04538 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Structure__Group__1_in_rule__Structure__Group__04541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__NameAssignment_0_in_rule__Structure__Group__0__Impl4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__Group__1__Impl_in_rule__Structure__Group__14598 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_rule__Structure__Group__2_in_rule__Structure__Group__14601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Structure__Group__1__Impl4629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__Group__2__Impl_in_rule__Structure__Group__24660 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_rule__Structure__Group__3_in_rule__Structure__Group__24663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__OrderedElementsAssignment_2_in_rule__Structure__Group__2__Impl4690 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Structure__Group__3__Impl_in_rule__Structure__Group__34721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Structure__Group__3__Impl4749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableRefinement__Group__0__Impl_in_rule__TableRefinement__Group__04788 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_rule__TableRefinement__Group__1_in_rule__TableRefinement__Group__04791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableRefinement__NameAssignment_0_in_rule__TableRefinement__Group__0__Impl4818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableRefinement__Group__1__Impl_in_rule__TableRefinement__Group__14848 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_rule__TableRefinement__Group__2_in_rule__TableRefinement__Group__14851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableRefinement__InputTypeAssignment_1_in_rule__TableRefinement__Group__1__Impl4878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableRefinement__Group__2__Impl_in_rule__TableRefinement__Group__24909 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TableRefinement__Group__3_in_rule__TableRefinement__Group__24912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TableRefinement__Group__2__Impl4940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableRefinement__Group__3__Impl_in_rule__TableRefinement__Group__34971 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__TableRefinement__Group__4_in_rule__TableRefinement__Group__34974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableRefinement__IdAssignment_3_in_rule__TableRefinement__Group__3__Impl5001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableRefinement__Group__4__Impl_in_rule__TableRefinement__Group__45031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableRefinement__PropertiesAssignment_4_in_rule__TableRefinement__Group__4__Impl5058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabViewRefinement__Group__0__Impl_in_rule__TabViewRefinement__Group__05099 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_rule__TabViewRefinement__Group__1_in_rule__TabViewRefinement__Group__05102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabViewRefinement__NameAssignment_0_in_rule__TabViewRefinement__Group__0__Impl5129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabViewRefinement__Group__1__Impl_in_rule__TabViewRefinement__Group__15159 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_rule__TabViewRefinement__Group__2_in_rule__TabViewRefinement__Group__15162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabViewRefinement__TabsAssignment_1_in_rule__TabViewRefinement__Group__1__Impl5189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabViewRefinement__Group__2__Impl_in_rule__TabViewRefinement__Group__25220 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TabViewRefinement__Group__3_in_rule__TabViewRefinement__Group__25223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TabViewRefinement__Group__2__Impl5251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabViewRefinement__Group__3__Impl_in_rule__TabViewRefinement__Group__35282 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__TabViewRefinement__Group__4_in_rule__TabViewRefinement__Group__35285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabViewRefinement__IdAssignment_3_in_rule__TabViewRefinement__Group__3__Impl5312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabViewRefinement__Group__4__Impl_in_rule__TabViewRefinement__Group__45342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabViewRefinement__PropertiesAssignment_4_in_rule__TabViewRefinement__Group__4__Impl5369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeRefinement__Group__0__Impl_in_rule__TreeRefinement__Group__05410 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_rule__TreeRefinement__Group__1_in_rule__TreeRefinement__Group__05413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeRefinement__NameAssignment_0_in_rule__TreeRefinement__Group__0__Impl5440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeRefinement__Group__1__Impl_in_rule__TreeRefinement__Group__15470 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_rule__TreeRefinement__Group__2_in_rule__TreeRefinement__Group__15473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeRefinement__InputTypeAssignment_1_in_rule__TreeRefinement__Group__1__Impl5500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeRefinement__Group__2__Impl_in_rule__TreeRefinement__Group__25531 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TreeRefinement__Group__3_in_rule__TreeRefinement__Group__25534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TreeRefinement__Group__2__Impl5562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeRefinement__Group__3__Impl_in_rule__TreeRefinement__Group__35593 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__TreeRefinement__Group__4_in_rule__TreeRefinement__Group__35596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeRefinement__IdAssignment_3_in_rule__TreeRefinement__Group__3__Impl5623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeRefinement__Group__4__Impl_in_rule__TreeRefinement__Group__45653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeRefinement__PropertiesAssignment_4_in_rule__TreeRefinement__Group__4__Impl5680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterchangeableRefinement__Group__0__Impl_in_rule__InterchangeableRefinement__Group__05721 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__InterchangeableRefinement__Group__1_in_rule__InterchangeableRefinement__Group__05724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterchangeableRefinement__NameAssignment_0_in_rule__InterchangeableRefinement__Group__0__Impl5751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterchangeableRefinement__Group__1__Impl_in_rule__InterchangeableRefinement__Group__15781 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InterchangeableRefinement__Group__2_in_rule__InterchangeableRefinement__Group__15784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__InterchangeableRefinement__Group__1__Impl5812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterchangeableRefinement__Group__2__Impl_in_rule__InterchangeableRefinement__Group__25843 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__InterchangeableRefinement__Group__3_in_rule__InterchangeableRefinement__Group__25846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterchangeableRefinement__IdAssignment_2_in_rule__InterchangeableRefinement__Group__2__Impl5873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterchangeableRefinement__Group__3__Impl_in_rule__InterchangeableRefinement__Group__35903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterchangeableRefinement__PropertiesAssignment_3_in_rule__InterchangeableRefinement__Group__3__Impl5930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaRefinement__Group__0__Impl_in_rule__TextareaRefinement__Group__05969 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__TextareaRefinement__Group__1_in_rule__TextareaRefinement__Group__05972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaRefinement__NameAssignment_0_in_rule__TextareaRefinement__Group__0__Impl5999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaRefinement__Group__1__Impl_in_rule__TextareaRefinement__Group__16029 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TextareaRefinement__Group__2_in_rule__TextareaRefinement__Group__16032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TextareaRefinement__Group__1__Impl6060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaRefinement__Group__2__Impl_in_rule__TextareaRefinement__Group__26091 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__TextareaRefinement__Group__3_in_rule__TextareaRefinement__Group__26094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaRefinement__IdAssignment_2_in_rule__TextareaRefinement__Group__2__Impl6121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaRefinement__Group__3__Impl_in_rule__TextareaRefinement__Group__36151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaRefinement__PropertiesAssignment_3_in_rule__TextareaRefinement__Group__3__Impl6178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldRefinement__Group__0__Impl_in_rule__TextfieldRefinement__Group__06217 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__TextfieldRefinement__Group__1_in_rule__TextfieldRefinement__Group__06220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldRefinement__NameAssignment_0_in_rule__TextfieldRefinement__Group__0__Impl6247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldRefinement__Group__1__Impl_in_rule__TextfieldRefinement__Group__16277 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TextfieldRefinement__Group__2_in_rule__TextfieldRefinement__Group__16280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TextfieldRefinement__Group__1__Impl6308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldRefinement__Group__2__Impl_in_rule__TextfieldRefinement__Group__26339 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__TextfieldRefinement__Group__3_in_rule__TextfieldRefinement__Group__26342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldRefinement__IdAssignment_2_in_rule__TextfieldRefinement__Group__2__Impl6369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldRefinement__Group__3__Impl_in_rule__TextfieldRefinement__Group__36399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldRefinement__PropertiesAssignment_3_in_rule__TextfieldRefinement__Group__3__Impl6426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__0__Impl_in_rule__ButtonRefinement__Group__06465 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__1_in_rule__ButtonRefinement__Group__06468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__NameAssignment_0_in_rule__ButtonRefinement__Group__0__Impl6495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__1__Impl_in_rule__ButtonRefinement__Group__16525 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__2_in_rule__ButtonRefinement__Group__16528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ButtonRefinement__Group__1__Impl6556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__2__Impl_in_rule__ButtonRefinement__Group__26587 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__3_in_rule__ButtonRefinement__Group__26590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__IdAssignment_2_in_rule__ButtonRefinement__Group__2__Impl6617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__Group__3__Impl_in_rule__ButtonRefinement__Group__36647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonRefinement__PropertiesAssignment_3_in_rule__ButtonRefinement__Group__3__Impl6674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__0__Impl_in_rule__LabelRefinement__Group__06713 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__1_in_rule__LabelRefinement__Group__06716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__NameAssignment_0_in_rule__LabelRefinement__Group__0__Impl6743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__1__Impl_in_rule__LabelRefinement__Group__16773 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__2_in_rule__LabelRefinement__Group__16776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__LabelRefinement__Group__1__Impl6804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__2__Impl_in_rule__LabelRefinement__Group__26835 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__3_in_rule__LabelRefinement__Group__26838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__IdAssignment_2_in_rule__LabelRefinement__Group__2__Impl6865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__Group__3__Impl_in_rule__LabelRefinement__Group__36895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelRefinement__PropertiesAssignment_3_in_rule__LabelRefinement__Group__3__Impl6922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabViewDefinition__Group__0__Impl_in_rule__TabViewDefinition__Group__06961 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_rule__TabViewDefinition__Group__1_in_rule__TabViewDefinition__Group__06964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabViewDefinition__NameAssignment_0_in_rule__TabViewDefinition__Group__0__Impl6991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabViewDefinition__Group__1__Impl_in_rule__TabViewDefinition__Group__17021 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_rule__TabViewDefinition__Group__2_in_rule__TabViewDefinition__Group__17024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabViewDefinition__TabsAssignment_1_in_rule__TabViewDefinition__Group__1__Impl7051 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__TabViewDefinition__Group__2__Impl_in_rule__TabViewDefinition__Group__27082 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TabViewDefinition__Group__3_in_rule__TabViewDefinition__Group__27085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TabViewDefinition__Group__2__Impl7113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabViewDefinition__Group__3__Impl_in_rule__TabViewDefinition__Group__37144 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__TabViewDefinition__Group__4_in_rule__TabViewDefinition__Group__37147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabViewDefinition__IdAssignment_3_in_rule__TabViewDefinition__Group__3__Impl7174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabViewDefinition__Group__4__Impl_in_rule__TabViewDefinition__Group__47204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabViewDefinition__PropertiesAssignment_4_in_rule__TabViewDefinition__Group__4__Impl7231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiselection__Group__0__Impl_in_rule__Multiselection__Group__07272 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Multiselection__Group__1_in_rule__Multiselection__Group__07275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiselection__NameAssignment_0_in_rule__Multiselection__Group__0__Impl7302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiselection__Group__1__Impl_in_rule__Multiselection__Group__17332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiselection__InputTypeAssignment_1_in_rule__Multiselection__Group__1__Impl7359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__0__Impl_in_rule__TextfieldDefinition__Group__07394 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__1_in_rule__TextfieldDefinition__Group__07397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__NameAssignment_0_in_rule__TextfieldDefinition__Group__0__Impl7424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__1__Impl_in_rule__TextfieldDefinition__Group__17454 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__2_in_rule__TextfieldDefinition__Group__17457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TextfieldDefinition__Group__1__Impl7485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__2__Impl_in_rule__TextfieldDefinition__Group__27516 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__3_in_rule__TextfieldDefinition__Group__27519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__IdAssignment_2_in_rule__TextfieldDefinition__Group__2__Impl7546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__Group__3__Impl_in_rule__TextfieldDefinition__Group__37576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldDefinition__PropertiesAssignment_3_in_rule__TextfieldDefinition__Group__3__Impl7603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaDefinition__Group__0__Impl_in_rule__TextareaDefinition__Group__07642 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__TextareaDefinition__Group__1_in_rule__TextareaDefinition__Group__07645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaDefinition__NameAssignment_0_in_rule__TextareaDefinition__Group__0__Impl7672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaDefinition__Group__1__Impl_in_rule__TextareaDefinition__Group__17702 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TextareaDefinition__Group__2_in_rule__TextareaDefinition__Group__17705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TextareaDefinition__Group__1__Impl7733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaDefinition__Group__2__Impl_in_rule__TextareaDefinition__Group__27764 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__TextareaDefinition__Group__3_in_rule__TextareaDefinition__Group__27767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaDefinition__IdAssignment_2_in_rule__TextareaDefinition__Group__2__Impl7794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaDefinition__Group__3__Impl_in_rule__TextareaDefinition__Group__37824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaDefinition__PropertiesAssignment_3_in_rule__TextareaDefinition__Group__3__Impl7851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__0__Impl_in_rule__TreeDefinition__Group__07890 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__1_in_rule__TreeDefinition__Group__07893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__NameAssignment_0_in_rule__TreeDefinition__Group__0__Impl7920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__1__Impl_in_rule__TreeDefinition__Group__17950 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__2_in_rule__TreeDefinition__Group__17953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__InputTypeAssignment_1_in_rule__TreeDefinition__Group__1__Impl7980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__2__Impl_in_rule__TreeDefinition__Group__28011 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__3_in_rule__TreeDefinition__Group__28014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TreeDefinition__Group__2__Impl8042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__3__Impl_in_rule__TreeDefinition__Group__38073 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__4_in_rule__TreeDefinition__Group__38076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__IdAssignment_3_in_rule__TreeDefinition__Group__3__Impl8103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__Group__4__Impl_in_rule__TreeDefinition__Group__48133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TreeDefinition__PropertiesAssignment_4_in_rule__TreeDefinition__Group__4__Impl8160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__0__Impl_in_rule__TableDefinition__Group__08201 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__1_in_rule__TableDefinition__Group__08204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__NameAssignment_0_in_rule__TableDefinition__Group__0__Impl8231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__1__Impl_in_rule__TableDefinition__Group__18261 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__2_in_rule__TableDefinition__Group__18264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__InputTypeAssignment_1_in_rule__TableDefinition__Group__1__Impl8291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__2__Impl_in_rule__TableDefinition__Group__28322 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__3_in_rule__TableDefinition__Group__28325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TableDefinition__Group__2__Impl8353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__3__Impl_in_rule__TableDefinition__Group__38384 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__4_in_rule__TableDefinition__Group__38387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__IdAssignment_3_in_rule__TableDefinition__Group__3__Impl8414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__Group__4__Impl_in_rule__TableDefinition__Group__48444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDefinition__PropertiesAssignment_4_in_rule__TableDefinition__Group__4__Impl8471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterchangeableDefinition__Group__0__Impl_in_rule__InterchangeableDefinition__Group__08512 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__InterchangeableDefinition__Group__1_in_rule__InterchangeableDefinition__Group__08515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterchangeableDefinition__NameAssignment_0_in_rule__InterchangeableDefinition__Group__0__Impl8542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterchangeableDefinition__Group__1__Impl_in_rule__InterchangeableDefinition__Group__18572 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InterchangeableDefinition__Group__2_in_rule__InterchangeableDefinition__Group__18575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__InterchangeableDefinition__Group__1__Impl8603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterchangeableDefinition__Group__2__Impl_in_rule__InterchangeableDefinition__Group__28634 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__InterchangeableDefinition__Group__3_in_rule__InterchangeableDefinition__Group__28637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterchangeableDefinition__IdAssignment_2_in_rule__InterchangeableDefinition__Group__2__Impl8664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterchangeableDefinition__Group__3__Impl_in_rule__InterchangeableDefinition__Group__38694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterchangeableDefinition__PropertiesAssignment_3_in_rule__InterchangeableDefinition__Group__3__Impl8721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__0__Impl_in_rule__ButtonDefinition__Group__08760 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__1_in_rule__ButtonDefinition__Group__08763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__NameAssignment_0_in_rule__ButtonDefinition__Group__0__Impl8790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__1__Impl_in_rule__ButtonDefinition__Group__18820 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__2_in_rule__ButtonDefinition__Group__18823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ButtonDefinition__Group__1__Impl8851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__2__Impl_in_rule__ButtonDefinition__Group__28882 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__3_in_rule__ButtonDefinition__Group__28885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__IdAssignment_2_in_rule__ButtonDefinition__Group__2__Impl8912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__Group__3__Impl_in_rule__ButtonDefinition__Group__38942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonDefinition__PropertiesAssignment_3_in_rule__ButtonDefinition__Group__3__Impl8969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__0__Impl_in_rule__LabelDefinition__Group__09008 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__1_in_rule__LabelDefinition__Group__09011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__NameAssignment_0_in_rule__LabelDefinition__Group__0__Impl9038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__1__Impl_in_rule__LabelDefinition__Group__19068 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__2_in_rule__LabelDefinition__Group__19071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__LabelDefinition__Group__1__Impl9099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__2__Impl_in_rule__LabelDefinition__Group__29130 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__3_in_rule__LabelDefinition__Group__29133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__IdAssignment_2_in_rule__LabelDefinition__Group__2__Impl9160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__Group__3__Impl_in_rule__LabelDefinition__Group__39190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelDefinition__PropertiesAssignment_3_in_rule__LabelDefinition__Group__3__Impl9217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaProperties__Group__0__Impl_in_rule__TextareaProperties__Group__09256 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__TextareaProperties__Group__1_in_rule__TextareaProperties__Group__09259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaProperties__CommonPropertiesAssignment_0_in_rule__TextareaProperties__Group__0__Impl9286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaProperties__Group__1__Impl_in_rule__TextareaProperties__Group__19316 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__TextareaProperties__Group__2_in_rule__TextareaProperties__Group__19319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaProperties__Group_1__0_in_rule__TextareaProperties__Group__1__Impl9346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaProperties__Group__2__Impl_in_rule__TextareaProperties__Group__29377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaProperties__Group_2__0_in_rule__TextareaProperties__Group__2__Impl9404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaProperties__Group_1__0__Impl_in_rule__TextareaProperties__Group_1__09441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TextareaProperties__Group_1__1_in_rule__TextareaProperties__Group_1__09444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TextareaProperties__Group_1__0__Impl9472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaProperties__Group_1__1__Impl_in_rule__TextareaProperties__Group_1__19503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaProperties__TextAssignment_1_1_in_rule__TextareaProperties__Group_1__1__Impl9530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaProperties__Group_2__0__Impl_in_rule__TextareaProperties__Group_2__09564 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__TextareaProperties__Group_2__1_in_rule__TextareaProperties__Group_2__09567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TextareaProperties__Group_2__0__Impl9595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaProperties__Group_2__1__Impl_in_rule__TextareaProperties__Group_2__19626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextareaProperties__EditableAssignment_2_1_in_rule__TextareaProperties__Group_2__1__Impl9653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldProperties__Group__0__Impl_in_rule__TextfieldProperties__Group__09687 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__TextfieldProperties__Group__1_in_rule__TextfieldProperties__Group__09690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldProperties__CommonPropertiesAssignment_0_in_rule__TextfieldProperties__Group__0__Impl9717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldProperties__Group__1__Impl_in_rule__TextfieldProperties__Group__19747 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__TextfieldProperties__Group__2_in_rule__TextfieldProperties__Group__19750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldProperties__Group_1__0_in_rule__TextfieldProperties__Group__1__Impl9777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldProperties__Group__2__Impl_in_rule__TextfieldProperties__Group__29808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldProperties__Group_2__0_in_rule__TextfieldProperties__Group__2__Impl9835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldProperties__Group_1__0__Impl_in_rule__TextfieldProperties__Group_1__09872 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TextfieldProperties__Group_1__1_in_rule__TextfieldProperties__Group_1__09875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TextfieldProperties__Group_1__0__Impl9903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldProperties__Group_1__1__Impl_in_rule__TextfieldProperties__Group_1__19934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldProperties__TextAssignment_1_1_in_rule__TextfieldProperties__Group_1__1__Impl9961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldProperties__Group_2__0__Impl_in_rule__TextfieldProperties__Group_2__09995 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__TextfieldProperties__Group_2__1_in_rule__TextfieldProperties__Group_2__09998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TextfieldProperties__Group_2__0__Impl10026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldProperties__Group_2__1__Impl_in_rule__TextfieldProperties__Group_2__110057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextfieldProperties__EditableAssignment_2_1_in_rule__TextfieldProperties__Group_2__1__Impl10084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelProperties__Group__0__Impl_in_rule__LabelProperties__Group__010118 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__LabelProperties__Group__1_in_rule__LabelProperties__Group__010121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelProperties__CommonPropertiesAssignment_0_in_rule__LabelProperties__Group__0__Impl10148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelProperties__Group__1__Impl_in_rule__LabelProperties__Group__110178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelProperties__Group_1__0_in_rule__LabelProperties__Group__1__Impl10205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelProperties__Group_1__0__Impl_in_rule__LabelProperties__Group_1__010240 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LabelProperties__Group_1__1_in_rule__LabelProperties__Group_1__010243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__LabelProperties__Group_1__0__Impl10271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelProperties__Group_1__1__Impl_in_rule__LabelProperties__Group_1__110302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelProperties__TextAssignment_1_1_in_rule__LabelProperties__Group_1__1__Impl10329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonProperties__Group__0__Impl_in_rule__ButtonProperties__Group__010363 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ButtonProperties__Group__1_in_rule__ButtonProperties__Group__010366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonProperties__CommonPropertiesAssignment_0_in_rule__ButtonProperties__Group__0__Impl10393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonProperties__Group__1__Impl_in_rule__ButtonProperties__Group__110423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonProperties__Group_1__0_in_rule__ButtonProperties__Group__1__Impl10450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonProperties__Group_1__0__Impl_in_rule__ButtonProperties__Group_1__010485 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ButtonProperties__Group_1__1_in_rule__ButtonProperties__Group_1__010488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ButtonProperties__Group_1__0__Impl10516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonProperties__Group_1__1__Impl_in_rule__ButtonProperties__Group_1__110547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonProperties__TextAssignment_1_1_in_rule__ButtonProperties__Group_1__1__Impl10574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group__0__Impl_in_rule__CommonProperties__Group__010608 = new BitSet(new long[]{0x0000000340000000L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group__1_in_rule__CommonProperties__Group__010611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CommonProperties__Group__0__Impl10639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group__1__Impl_in_rule__CommonProperties__Group__110670 = new BitSet(new long[]{0x0000000340000000L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group__2_in_rule__CommonProperties__Group__110673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_1__0_in_rule__CommonProperties__Group__1__Impl10700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group__2__Impl_in_rule__CommonProperties__Group__210731 = new BitSet(new long[]{0x0000000340000000L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group__3_in_rule__CommonProperties__Group__210734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_2__0_in_rule__CommonProperties__Group__2__Impl10761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group__3__Impl_in_rule__CommonProperties__Group__310792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_3__0_in_rule__CommonProperties__Group__3__Impl10819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_1__0__Impl_in_rule__CommonProperties__Group_1__010858 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_1__1_in_rule__CommonProperties__Group_1__010861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__CommonProperties__Group_1__0__Impl10889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_1__1__Impl_in_rule__CommonProperties__Group_1__110920 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_1__2_in_rule__CommonProperties__Group_1__110923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__CommonProperties__Group_1__1__Impl10951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_1__2__Impl_in_rule__CommonProperties__Group_1__210982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__PropertyKeyAssignment_1_2_in_rule__CommonProperties__Group_1__2__Impl11009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_2__0__Impl_in_rule__CommonProperties__Group_2__011045 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_2__1_in_rule__CommonProperties__Group_2__011048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__CommonProperties__Group_2__0__Impl11076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_2__1__Impl_in_rule__CommonProperties__Group_2__111107 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_2__2_in_rule__CommonProperties__Group_2__111110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__CommonProperties__Group_2__1__Impl11138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_2__2__Impl_in_rule__CommonProperties__Group_2__211169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__LayoutKeyAssignment_2_2_in_rule__CommonProperties__Group_2__2__Impl11196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_3__0__Impl_in_rule__CommonProperties__Group_3__011232 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_3__1_in_rule__CommonProperties__Group_3__011235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__CommonProperties__Group_3__0__Impl11263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_3__1__Impl_in_rule__CommonProperties__Group_3__111294 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_3__2_in_rule__CommonProperties__Group_3__111297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__CommonProperties__Group_3__1__Impl11325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__Group_3__2__Impl_in_rule__CommonProperties__Group_3__211356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonProperties__InteractiontypeAssignment_3_2_in_rule__CommonProperties__Group_3__2__Impl11385 = new BitSet(new long[]{0x0000000000070002L});
    public static final BitSet FOLLOW_rule__CommonProperties__InteractiontypeAssignment_3_2_in_rule__CommonProperties__Group_3__2__Impl11397 = new BitSet(new long[]{0x0000000000070002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_rule__UIDescription__TypeDefinitionAssignment_011441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__UIDescription__PropertyAssignment_111472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayout_in_rule__UIDescription__LayoutAssignment_211503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsedDescription_in_rule__UIDescription__UsedDescriptionsAssignment_311534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefinement_in_rule__UIDescription__RefinementsAssignment_411565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_rule__UIDescription__DefinitionsAssignment_511596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructure_in_rule__UIDescription__StructureAssignment_611627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__TypeDefinition__TypeAssignment_111658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__IdAlternatives_0_in_rule__Type__IdAssignment11689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Property__PropertiesFilesAssignment_111722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Layout__LayoutFilesAssignment_111753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescriptionType_in_rule__UsedDescription__DescriptionTypeAssignment_111784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__UsedDescription__IdAssignment_2_111815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__UIDescriptionImport__DescriptionNameAssignment11846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentRefinement_in_rule__Refinement__ConcreteRefinementAssignment_011877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDefinition_in_rule__Definition__ConcreteDefitionAssignment_011908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Structure__NameAssignment_011944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Structure__OrderedElementsAssignment_211983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Element__IdAssignment12014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__TableRefinement__NameAssignment_012050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INPUT_DESCRIPTION_in_rule__TableRefinement__InputTypeAssignment_112089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TableRefinement__IdAssignment_312120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_rule__TableRefinement__PropertiesAssignment_412151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__TabViewRefinement__NameAssignment_012187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabDefinition_in_rule__TabViewRefinement__TabsAssignment_112226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TabViewRefinement__IdAssignment_312257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_rule__TabViewRefinement__PropertiesAssignment_412288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__TreeRefinement__NameAssignment_012324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INPUT_DESCRIPTION_in_rule__TreeRefinement__InputTypeAssignment_112363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TreeRefinement__IdAssignment_312394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_rule__TreeRefinement__PropertiesAssignment_412425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__InterchangeableRefinement__NameAssignment_012461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__InterchangeableRefinement__IdAssignment_212500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_rule__InterchangeableRefinement__PropertiesAssignment_312531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__TextareaRefinement__NameAssignment_012567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TextareaRefinement__IdAssignment_212606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextareaProperties_in_rule__TextareaRefinement__PropertiesAssignment_312637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__TextfieldRefinement__NameAssignment_012673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TextfieldRefinement__IdAssignment_212712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfieldProperties_in_rule__TextfieldRefinement__PropertiesAssignment_312743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ButtonRefinement__NameAssignment_012779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ButtonRefinement__IdAssignment_212818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonProperties_in_rule__ButtonRefinement__PropertiesAssignment_312849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__LabelRefinement__NameAssignment_012885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__LabelRefinement__IdAssignment_212924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelProperties_in_rule__LabelRefinement__PropertiesAssignment_312955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__TabViewDefinition__NameAssignment_012991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabDefinition_in_rule__TabViewDefinition__TabsAssignment_113030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TabViewDefinition__IdAssignment_313061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_rule__TabViewDefinition__PropertiesAssignment_413092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TABNAME_in_rule__TabDefinition__NameAssignment13123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Multiselection__NameAssignment_013159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INPUT_DESCRIPTION_in_rule__Multiselection__InputTypeAssignment_113198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__TextfieldDefinition__NameAssignment_013234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TextfieldDefinition__IdAssignment_213273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfieldProperties_in_rule__TextfieldDefinition__PropertiesAssignment_313304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__TextareaDefinition__NameAssignment_013340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TextareaDefinition__IdAssignment_213379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextareaProperties_in_rule__TextareaDefinition__PropertiesAssignment_313410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__TreeDefinition__NameAssignment_013446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INPUT_DESCRIPTION_in_rule__TreeDefinition__InputTypeAssignment_113485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TreeDefinition__IdAssignment_313516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_rule__TreeDefinition__PropertiesAssignment_413547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__TableDefinition__NameAssignment_013583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INPUT_DESCRIPTION_in_rule__TableDefinition__InputTypeAssignment_113622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TableDefinition__IdAssignment_313653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_rule__TableDefinition__PropertiesAssignment_413684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__InterchangeableDefinition__NameAssignment_013720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__InterchangeableDefinition__IdAssignment_213759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_rule__InterchangeableDefinition__PropertiesAssignment_313790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ButtonDefinition__NameAssignment_013826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ButtonDefinition__IdAssignment_213865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonProperties_in_rule__ButtonDefinition__PropertiesAssignment_313896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__LabelDefinition__NameAssignment_013932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__LabelDefinition__IdAssignment_213971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelProperties_in_rule__LabelDefinition__PropertiesAssignment_314002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interactiontype__IdAlternatives_0_in_rule__Interactiontype__IdAssignment14033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_rule__TextareaProperties__CommonPropertiesAssignment_014066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TextareaProperties__TextAssignment_1_114097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__TextareaProperties__EditableAssignment_2_114128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_rule__TextfieldProperties__CommonPropertiesAssignment_014159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TextfieldProperties__TextAssignment_1_114190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__TextfieldProperties__EditableAssignment_2_114221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_rule__LabelProperties__CommonPropertiesAssignment_014252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__LabelProperties__TextAssignment_1_114283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonProperties_in_rule__ButtonProperties__CommonPropertiesAssignment_014314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ButtonProperties__TextAssignment_1_114345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CommonProperties__PropertyKeyAssignment_1_214376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CommonProperties__LayoutKeyAssignment_2_214407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractiontype_in_rule__CommonProperties__InteractiontypeAssignment_3_214438 = new BitSet(new long[]{0x0000000000000002L});

}