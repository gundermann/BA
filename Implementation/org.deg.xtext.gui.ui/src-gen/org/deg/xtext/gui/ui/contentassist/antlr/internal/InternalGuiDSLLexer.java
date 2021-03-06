package org.deg.xtext.gui.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGuiDSLLexer extends Lexer {
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_ID=9;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int RULE_INPUT_DESCRIPTION=5;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=13;
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

    public InternalGuiDSLLexer() {;} 
    public InternalGuiDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGuiDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:11:7: ( 'WINDOW' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:11:9: 'WINDOW'
            {
            match("WINDOW"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:12:7: ( 'INNERCOMPLEX' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:12:9: 'INNERCOMPLEX'
            {
            match("INNERCOMPLEX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:13:7: ( 'IfActivator' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:13:9: 'IfActivator'
            {
            match("IfActivator"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:14:7: ( 'IfTextDisplay' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:14:9: 'IfTextDisplay'
            {
            match("IfTextDisplay"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:15:7: ( 'IfViewImage' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:15:9: 'IfViewImage'
            {
            match("IfViewImage"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:16:7: ( 'type: ' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:16:9: 'type: '
            {
            match("type: "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:17:7: ( ';' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:17:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:18:7: ( 'get properties from:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:18:9: 'get properties from:'
            {
            match("get properties from:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:19:7: ( 'get layout from:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:19:9: 'get layout from:'
            {
            match("get layout from:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:20:7: ( 'use:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:20:9: 'use:'
            {
            match("use:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:21:7: ( 'as:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:21:9: 'as:'
            {
            match("as:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:22:7: ( ':' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:22:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:23:7: ( 'change:' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:23:9: 'change:'
            {
            match("change:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:24:7: ( 'text=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:24:9: 'text='
            {
            match("text="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:25:7: ( 'editable=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:25:9: 'editable='
            {
            match("editable="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:26:7: ( '->' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:26:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:27:7: ( 'propertyKey' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:27:9: 'propertyKey'
            {
            match("propertyKey"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:28:7: ( '=' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:28:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:29:7: ( 'layoutKey' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:29:9: 'layoutKey'
            {
            match("layoutKey"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:30:7: ( 'interactiontype' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:30:9: 'interactiontype'
            {
            match("interactiontype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:31:7: ( 'Structure' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:31:9: 'Structure'
            {
            match("Structure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:32:7: ( 'Table' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:32:9: 'Table'
            {
            match("Table"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:33:7: ( 'TabView' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:33:9: 'TabView'
            {
            match("TabView"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:34:7: ( 'Tree' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:34:9: 'Tree'
            {
            match("Tree"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:35:7: ( 'Interchangeable' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:35:9: 'Interchangeable'
            {
            match("Interchangeable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:36:7: ( 'Textarea' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:36:9: 'Textarea'
            {
            match("Textarea"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:37:7: ( 'Textfield' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:37:9: 'Textfield'
            {
            match("Textfield"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:38:7: ( 'Button' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:38:9: 'Button'
            {
            match("Button"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:39:7: ( 'Label' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:39:9: 'Label'
            {
            match("Label"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:40:7: ( 'Multiselection' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:40:9: 'Multiselection'
            {
            match("Multiselection"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7162:9: ( ( ' ' | '\\t' | '\\r' | '\\n' | ',' )+ )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7162:11: ( ' ' | '\\t' | '\\r' | '\\n' | ',' )+
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7162:11: ( ' ' | '\\t' | '\\r' | '\\n' | ',' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\t' && LA1_0<='\n')||LA1_0=='\r'||LA1_0==' '||LA1_0==',') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' '||input.LA(1)==',' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_TABNAME"
    public final void mRULE_TABNAME() throws RecognitionException {
        try {
            int _type = RULE_TABNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7164:14: ( '[' (~ ( ( '[' | ']' ) ) )* ']' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7164:16: '[' (~ ( ( '[' | ']' ) ) )* ']'
            {
            match('['); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7164:20: (~ ( ( '[' | ']' ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='Z')||LA2_0=='\\'||(LA2_0>='^' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7164:20: ~ ( ( '[' | ']' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='Z')||input.LA(1)=='\\'||(input.LA(1)>='^' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TABNAME"

    // $ANTLR start "RULE_INPUT_DESCRIPTION"
    public final void mRULE_INPUT_DESCRIPTION() throws RecognitionException {
        try {
            int _type = RULE_INPUT_DESCRIPTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7166:24: ( '<' (~ ( ( '<' | '>' ) ) )* '>' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7166:26: '<' (~ ( ( '<' | '>' ) ) )* '>'
            {
            match('<'); 
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7166:30: (~ ( ( '<' | '>' ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<=';')||LA3_0=='='||(LA3_0>='?' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7166:30: ~ ( ( '<' | '>' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<=';')||input.LA(1)=='='||(input.LA(1)>='?' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INPUT_DESCRIPTION"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7168:14: ( ( 'TRUE' | 'FALSE' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7168:16: ( 'TRUE' | 'FALSE' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7168:16: ( 'TRUE' | 'FALSE' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='T') ) {
                alt4=1;
            }
            else if ( (LA4_0=='F') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7168:17: 'TRUE'
                    {
                    match("TRUE"); 


                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7168:24: 'FALSE'
                    {
                    match("FALSE"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7170:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7170:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7170:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7170:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7170:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7172:10: ( ( '0' .. '9' )+ )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7172:12: ( '0' .. '9' )+
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7172:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7172:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7174:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7174:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7174:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7174:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7174:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7174:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7174:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7174:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7174:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7174:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7174:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7176:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7176:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7176:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7176:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7178:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7178:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7178:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7178:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7178:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7178:41: ( '\\r' )? '\\n'
                    {
                    // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7178:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7178:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7180:16: ( . )
            // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:7180:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_WS | RULE_TABNAME | RULE_INPUT_DESCRIPTION | RULE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER )
        int alt15=40;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:190: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 32 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:198: RULE_TABNAME
                {
                mRULE_TABNAME(); 

                }
                break;
            case 33 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:211: RULE_INPUT_DESCRIPTION
                {
                mRULE_INPUT_DESCRIPTION(); 

                }
                break;
            case 34 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:234: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 35 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:247: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 36 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:255: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 37 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:264: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 38 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:276: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 39 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:292: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 40 :
                // ../org.deg.xtext.gui.ui/src-gen/org/deg/xtext/gui/ui/contentassist/antlr/internal/InternalGuiDSL.g:1:308: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\3\41\1\uffff\3\41\1\uffff\2\41\1\37\1\41\1\uffff\7\41"+
        "\1\uffff\2\37\1\41\1\37\2\uffff\3\37\1\uffff\1\41\1\uffff\5\41\1"+
        "\uffff\3\41\1\uffff\2\41\1\uffff\1\41\1\uffff\12\41\3\uffff\1\41"+
        "\4\uffff\12\41\1\uffff\26\41\2\uffff\10\41\1\u0087\1\41\1\u008a"+
        "\12\41\4\uffff\6\41\1\u009b\1\41\1\uffff\2\41\1\uffff\1\41\1\u00a0"+
        "\1\41\1\u008a\1\u00a2\13\41\1\uffff\3\41\1\u00b1\1\uffff\1\41\1"+
        "\uffff\5\41\1\uffff\5\41\1\u00bd\2\41\1\uffff\13\41\1\uffff\1\u00cb"+
        "\7\41\1\uffff\1\41\1\u00d4\1\41\1\u00d6\1\uffff\1\u00d7\7\41\1\uffff"+
        "\1\41\2\uffff\2\41\1\u00e2\1\41\1\u00e4\1\41\1\u00e6\2\41\1\u00e9"+
        "\1\uffff\1\41\1\uffff\1\41\1\uffff\2\41\1\uffff\1\u00ee\3\41\1\uffff"+
        "\2\41\1\u00f4\1\u00f5\1\u00f6\3\uffff";
    static final String DFA15_eofS =
        "\u00f7\uffff";
    static final String DFA15_minS =
        "\1\0\1\111\1\116\1\145\1\uffff\1\145\2\163\1\uffff\1\150\1\144"+
        "\1\76\1\162\1\uffff\1\141\1\156\1\164\1\122\1\165\1\141\1\165\1"+
        "\uffff\2\0\2\101\2\uffff\2\0\1\52\1\uffff\1\116\1\uffff\1\116\1"+
        "\101\1\164\1\160\1\170\1\uffff\1\164\1\145\1\72\1\uffff\1\141\1"+
        "\151\1\uffff\1\157\1\uffff\1\171\1\164\1\162\1\142\1\145\1\170\1"+
        "\125\1\164\1\142\1\154\3\uffff\1\114\4\uffff\1\104\1\105\1\143\1"+
        "\145\1\151\2\145\1\164\1\40\1\72\1\uffff\1\156\1\164\1\160\1\157"+
        "\1\145\1\165\1\126\1\145\1\164\1\105\1\164\1\145\1\164\1\123\1\117"+
        "\1\122\1\164\1\170\1\145\1\162\1\72\1\75\1\154\1\uffff\1\147\1\141"+
        "\1\145\1\165\1\162\1\143\1\145\1\151\1\60\1\141\1\60\1\157\1\154"+
        "\1\151\1\105\1\127\1\103\1\151\1\164\1\167\1\143\4\uffff\1\145\1"+
        "\142\1\162\1\164\1\141\1\164\1\60\1\145\1\uffff\1\162\1\151\1\uffff"+
        "\1\156\1\60\1\163\2\60\1\117\1\166\1\104\1\111\1\150\1\72\1\154"+
        "\1\164\1\113\1\143\1\165\1\uffff\1\167\2\145\1\60\1\uffff\1\145"+
        "\1\uffff\1\115\1\141\1\151\1\155\1\141\1\uffff\1\145\1\171\1\145"+
        "\1\164\1\162\1\60\1\141\1\154\1\uffff\1\154\1\120\1\164\1\163\1"+
        "\141\1\156\1\75\1\113\1\171\1\151\1\145\1\uffff\1\60\1\144\1\145"+
        "\1\114\1\157\1\160\2\147\1\uffff\1\145\1\60\1\157\1\60\1\uffff\1"+
        "\60\1\143\1\105\1\162\1\154\2\145\1\171\1\uffff\1\156\2\uffff\1"+
        "\164\1\130\1\60\1\141\1\60\1\141\1\60\1\164\1\151\1\60\1\uffff\1"+
        "\171\1\uffff\1\142\1\uffff\1\171\1\157\1\uffff\1\60\1\154\1\160"+
        "\1\156\1\uffff\2\145\3\60\3\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\111\1\156\1\171\1\uffff\1\145\2\163\1\uffff\1\150\1"+
        "\144\1\76\1\162\1\uffff\1\141\1\156\1\164\1\162\1\165\1\141\1\165"+
        "\1\uffff\2\uffff\1\101\1\172\2\uffff\2\uffff\1\57\1\uffff\1\116"+
        "\1\uffff\1\116\1\126\1\164\1\160\1\170\1\uffff\1\164\1\145\1\72"+
        "\1\uffff\1\141\1\151\1\uffff\1\157\1\uffff\1\171\1\164\1\162\1\142"+
        "\1\145\1\170\1\125\1\164\1\142\1\154\3\uffff\1\114\4\uffff\1\104"+
        "\1\105\1\143\1\145\1\151\2\145\1\164\1\40\1\72\1\uffff\1\156\1\164"+
        "\1\160\1\157\1\145\1\165\1\154\1\145\1\164\1\105\1\164\1\145\1\164"+
        "\1\123\1\117\1\122\1\164\1\170\1\145\1\162\1\72\1\75\1\160\1\uffff"+
        "\1\147\1\141\1\145\1\165\1\162\1\143\1\145\1\151\1\172\1\146\1\172"+
        "\1\157\1\154\1\151\1\105\1\127\1\103\1\151\1\164\1\167\1\143\4\uffff"+
        "\1\145\1\142\1\162\1\164\1\141\1\164\1\172\1\145\1\uffff\1\162\1"+
        "\151\1\uffff\1\156\1\172\1\163\2\172\1\117\1\166\1\104\1\111\1\150"+
        "\1\72\1\154\1\164\1\113\1\143\1\165\1\uffff\1\167\2\145\1\172\1"+
        "\uffff\1\145\1\uffff\1\115\1\141\1\151\1\155\1\141\1\uffff\1\145"+
        "\1\171\1\145\1\164\1\162\1\172\1\141\1\154\1\uffff\1\154\1\120\1"+
        "\164\1\163\1\141\1\156\1\75\1\113\1\171\1\151\1\145\1\uffff\1\172"+
        "\1\144\1\145\1\114\1\157\1\160\2\147\1\uffff\1\145\1\172\1\157\1"+
        "\172\1\uffff\1\172\1\143\1\105\1\162\1\154\2\145\1\171\1\uffff\1"+
        "\156\2\uffff\1\164\1\130\1\172\1\141\1\172\1\141\1\172\1\164\1\151"+
        "\1\172\1\uffff\1\171\1\uffff\1\142\1\uffff\1\171\1\157\1\uffff\1"+
        "\172\1\154\1\160\1\156\1\uffff\2\145\3\172\3\uffff";
    static final String DFA15_acceptS =
        "\4\uffff\1\7\3\uffff\1\14\4\uffff\1\22\7\uffff\1\37\4\uffff\1\43"+
        "\1\44\3\uffff\1\50\1\uffff\1\43\5\uffff\1\7\3\uffff\1\14\2\uffff"+
        "\1\20\1\uffff\1\22\12\uffff\1\37\1\40\1\41\1\uffff\1\44\1\45\1\46"+
        "\1\47\12\uffff\1\13\27\uffff\1\12\25\uffff\1\6\1\16\1\10\1\11\10"+
        "\uffff\1\30\2\uffff\1\42\20\uffff\1\26\4\uffff\1\35\1\uffff\1\1"+
        "\5\uffff\1\15\10\uffff\1\34\13\uffff\1\27\10\uffff\1\17\4\uffff"+
        "\1\32\10\uffff\1\23\1\uffff\1\25\1\33\12\uffff\1\3\1\uffff\1\5\1"+
        "\uffff\1\21\2\uffff\1\2\4\uffff\1\4\5\uffff\1\36\1\31\1\24";
    static final String DFA15_specialS =
        "\1\0\25\uffff\1\2\1\4\4\uffff\1\3\1\1\u00d9\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\37\2\25\2\37\1\25\22\37\1\25\1\37\1\34\4\37\1\35\4\37\1"+
            "\25\1\13\1\37\1\36\12\33\1\10\1\4\1\27\1\15\3\37\1\32\1\22\3"+
            "\32\1\30\2\32\1\2\2\32\1\23\1\24\5\32\1\20\1\21\2\32\1\1\3\32"+
            "\1\26\2\37\1\31\1\32\1\37\1\7\1\32\1\11\1\32\1\12\1\32\1\5\1"+
            "\32\1\17\2\32\1\16\3\32\1\14\3\32\1\3\1\6\5\32\uff85\37",
            "\1\40",
            "\1\42\27\uffff\1\43\7\uffff\1\44",
            "\1\46\23\uffff\1\45",
            "",
            "\1\50",
            "\1\51",
            "\1\52",
            "",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\67\16\uffff\1\64\3\uffff\1\66\14\uffff\1\65",
            "\1\70",
            "\1\71",
            "\1\72",
            "",
            "\133\74\1\uffff\uffa4\74",
            "\74\75\1\uffff\uffc3\75",
            "\1\76",
            "\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\0\100",
            "\0\100",
            "\1\101\4\uffff\1\102",
            "",
            "\1\103",
            "",
            "\1\104",
            "\1\105\22\uffff\1\106\1\uffff\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "",
            "\1\113",
            "\1\114",
            "\1\115",
            "",
            "\1\116",
            "\1\117",
            "",
            "\1\120",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "",
            "",
            "",
            "\1\133",
            "",
            "",
            "",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\155\25\uffff\1\154",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\176\3\uffff\1\175",
            "",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0088\4\uffff\1\u0089",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "",
            "",
            "",
            "",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u009c",
            "",
            "\1\u009d",
            "\1\u009e",
            "",
            "\1\u009f",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00a1",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u00b2",
            "",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00be",
            "\1\u00bf",
            "",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "",
            "\1\u00d3",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00d5",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "",
            "\1\u00df",
            "",
            "",
            "\1\u00e0",
            "\1\u00e1",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00e3",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00e5",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00e7",
            "\1\u00e8",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u00ea",
            "",
            "\1\u00eb",
            "",
            "\1\u00ec",
            "\1\u00ed",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "",
            "\1\u00f2",
            "\1\u00f3",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_WS | RULE_TABNAME | RULE_INPUT_DESCRIPTION | RULE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='W') ) {s = 1;}

                        else if ( (LA15_0=='I') ) {s = 2;}

                        else if ( (LA15_0=='t') ) {s = 3;}

                        else if ( (LA15_0==';') ) {s = 4;}

                        else if ( (LA15_0=='g') ) {s = 5;}

                        else if ( (LA15_0=='u') ) {s = 6;}

                        else if ( (LA15_0=='a') ) {s = 7;}

                        else if ( (LA15_0==':') ) {s = 8;}

                        else if ( (LA15_0=='c') ) {s = 9;}

                        else if ( (LA15_0=='e') ) {s = 10;}

                        else if ( (LA15_0=='-') ) {s = 11;}

                        else if ( (LA15_0=='p') ) {s = 12;}

                        else if ( (LA15_0=='=') ) {s = 13;}

                        else if ( (LA15_0=='l') ) {s = 14;}

                        else if ( (LA15_0=='i') ) {s = 15;}

                        else if ( (LA15_0=='S') ) {s = 16;}

                        else if ( (LA15_0=='T') ) {s = 17;}

                        else if ( (LA15_0=='B') ) {s = 18;}

                        else if ( (LA15_0=='L') ) {s = 19;}

                        else if ( (LA15_0=='M') ) {s = 20;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' '||LA15_0==',') ) {s = 21;}

                        else if ( (LA15_0=='[') ) {s = 22;}

                        else if ( (LA15_0=='<') ) {s = 23;}

                        else if ( (LA15_0=='F') ) {s = 24;}

                        else if ( (LA15_0=='^') ) {s = 25;}

                        else if ( (LA15_0=='A'||(LA15_0>='C' && LA15_0<='E')||(LA15_0>='G' && LA15_0<='H')||(LA15_0>='J' && LA15_0<='K')||(LA15_0>='N' && LA15_0<='R')||(LA15_0>='U' && LA15_0<='V')||(LA15_0>='X' && LA15_0<='Z')||LA15_0=='_'||LA15_0=='b'||LA15_0=='d'||LA15_0=='f'||LA15_0=='h'||(LA15_0>='j' && LA15_0<='k')||(LA15_0>='m' && LA15_0<='o')||(LA15_0>='q' && LA15_0<='s')||(LA15_0>='v' && LA15_0<='z')) ) {s = 26;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 27;}

                        else if ( (LA15_0=='\"') ) {s = 28;}

                        else if ( (LA15_0=='\'') ) {s = 29;}

                        else if ( (LA15_0=='/') ) {s = 30;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='+')||LA15_0=='.'||(LA15_0>='>' && LA15_0<='@')||(LA15_0>='\\' && LA15_0<=']')||LA15_0=='`'||(LA15_0>='{' && LA15_0<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_29 = input.LA(1);

                        s = -1;
                        if ( ((LA15_29>='\u0000' && LA15_29<='\uFFFF')) ) {s = 64;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_22 = input.LA(1);

                        s = -1;
                        if ( ((LA15_22>='\u0000' && LA15_22<='Z')||(LA15_22>='\\' && LA15_22<='\uFFFF')) ) {s = 60;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_28 = input.LA(1);

                        s = -1;
                        if ( ((LA15_28>='\u0000' && LA15_28<='\uFFFF')) ) {s = 64;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_23 = input.LA(1);

                        s = -1;
                        if ( ((LA15_23>='\u0000' && LA15_23<=';')||(LA15_23>='=' && LA15_23<='\uFFFF')) ) {s = 61;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}