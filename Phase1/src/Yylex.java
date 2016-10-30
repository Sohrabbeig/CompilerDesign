/* The following code was generated by JFlex 1.6.0 */

/**
 * This class is a scanner generated by
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.0
 * from the specification file <tt>C:/Users/amirhossein/IdeaProjects/CompilerDesign/Phase1/JFlexInput.txt</tt>
 */
class Yylex {

    /** This character denotes the end of file */
    public static final int YYEOF = -1;

    /** initial size of the lookahead buffer */
    private static final int ZZ_BUFFERSIZE = 16384;

    /** lexical states */
    public static final int YYINITIAL = 0;

    /**
     * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
     * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
     *                  at the beginning of a line
     * l is of the form l = 2*k, k a non negative integer
     */
    private static final int ZZ_LEXSTATE[] = {
            0, 0
    };

    /**
     * Translates characters to character classes
     */
    private static final String ZZ_CMAP_PACKED =
            "\11\0\1\3\1\2\1\43\1\44\1\1\22\0\1\40\2\0\1\7"+
                    "\1\0\1\36\1\0\1\0\1\50\1\52\1\34\1\32\1\54\1\33"+
                    "\1\41\1\35\1\5\11\6\1\50\1\53\1\0\1\31\1\0\1\37"+
                    "\1\0\32\4\1\46\1\0\1\47\3\0\1\20\1\23\1\13\1\15"+
                    "\1\12\1\25\1\42\1\24\1\21\1\4\1\30\1\22\1\4\1\10"+
                    "\1\14\1\4\1\45\1\11\1\16\1\17\1\27\1\4\1\26\3\4"+
                    "\1\50\1\0\1\51\7\0\1\43\u1fa2\0\1\43\1\43\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

    /**
     * Translates characters to character classes
     */
    private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

    /**
     * Translates DFA states to action switch labels.
     */
    private static final int [] ZZ_ACTION = zzUnpackAction();

    private static final String ZZ_ACTION_PACKED_0 =
            "\1\0\1\1\3\2\1\3\2\4\16\3\1\5\1\6"+
                    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
                    "\1\3\1\17\1\20\1\21\1\22\4\0\5\3\1\4"+
                    "\1\23\1\4\1\0\13\3\1\24\6\3\1\25\4\3"+
                    "\1\26\1\27\1\30\1\31\1\32\1\23\2\0\1\33"+
                    "\1\34\1\35\1\36\1\37\1\33\1\34\1\35\1\36"+
                    "\1\37\1\23\1\40\1\3\1\33\1\34\1\35\1\36"+
                    "\1\37\1\41\3\3\1\42\3\3\1\0\4\3\1\43"+
                    "\1\44\4\3\1\45\1\23\3\3\1\46\1\47\1\50"+
                    "\1\51\1\0\3\3\1\52\1\0\1\3\1\53\1\3"+
                    "\1\54\2\3\1\0\3\3\1\0\1\55\1\56\1\57"+
                    "\1\60\1\0\1\3\1\61\1\62\1\0\1\63\1\64"+
                    "\1\0\1\65";

    private static int [] zzUnpackAction() {
        int [] result = new int[157];
        int offset = 0;
        offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackAction(String packed, int offset, int [] result) {
        int i = 0;       /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int count = packed.charAt(i++);
            int value = packed.charAt(i++);
            do result[j++] = value; while (--count > 0);
        }
        return j;
    }


    /**
     * Translates a state to a row index in the transition table
     */
    private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

    private static final String ZZ_ROWMAP_PACKED_0 =
            "\0\0\0\55\0\132\0\207\0\55\0\264\0\341\0\u010e"+
                    "\0\u013b\0\u0168\0\u0195\0\u01c2\0\u01ef\0\u021c\0\u0249\0\u0276"+
                    "\0\u02a3\0\u02d0\0\u02fd\0\u032a\0\u0357\0\u0384\0\55\0\u03b1"+
                    "\0\u03de\0\u040b\0\u0438\0\55\0\55\0\u0465\0\55\0\55"+
                    "\0\55\0\55\0\55\0\55\0\55\0\u0492\0\u04bf\0\u04ec"+
                    "\0\u0519\0\u0546\0\u0573\0\u05a0\0\u05cd\0\u05fa\0\u0627\0\u0654"+
                    "\0\u0681\0\u0654\0\u06ae\0\u06db\0\u0708\0\u0735\0\u0762\0\u078f"+
                    "\0\u07bc\0\u07e9\0\u0816\0\u0843\0\u0870\0\u089d\0\u08ca\0\u08f7"+
                    "\0\u0924\0\u0951\0\u097e\0\u09ab\0\u0546\0\u09d8\0\u0a05\0\u0a32"+
                    "\0\u0a5f\0\207\0\207\0\207\0\207\0\u0a8c\0\u0ab9\0\u0ab9"+
                    "\0\u0ae6\0\207\0\207\0\207\0\207\0\207\0\u0546\0\u0546"+
                    "\0\u0546\0\u0546\0\u0546\0\u0b13\0\u0b40\0\u0b6d\0\u0b6d\0\u0b6d"+
                    "\0\u0b6d\0\u0b6d\0\u0b6d\0\u0546\0\u0b9a\0\u0bc7\0\u0bf4\0\u0546"+
                    "\0\u0c21\0\u0c4e\0\u0c7b\0\u0ca8\0\u0cd5\0\u0d02\0\u0d2f\0\u0d5c"+
                    "\0\u0d89\0\u0546\0\u0db6\0\u0de3\0\u0e10\0\u0e3d\0\207\0\u0b40"+
                    "\0\u0e6a\0\u0e97\0\u0ec4\0\u0546\0\u0546\0\u0546\0\u0546\0\u0ef1"+
                    "\0\u0f1e\0\u0f4b\0\u0f78\0\u0546\0\u0fa5\0\u0fd2\0\u0546\0\u0fff"+
                    "\0\u0546\0\u102c\0\u1059\0\u1086\0\u10b3\0\u10e0\0\u110d\0\u113a"+
                    "\0\u0546\0\u0546\0\u0546\0\u0546\0\u1167\0\u1194\0\u0546\0\u0546"+
                    "\0\u11c1\0\207\0\u0546\0\u11ee\0\207";

    private static int [] zzUnpackRowMap() {
        int [] result = new int[157];
        int offset = 0;
        offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackRowMap(String packed, int offset, int [] result) {
        int i = 0;  /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int high = packed.charAt(i++) << 16;
            result[j++] = high | packed.charAt(i++);
        }
        return j;
    }

    /**
     * The transition table of the DFA
     */
    private static final int [] ZZ_TRANS = zzUnpackTrans();

    private static final String ZZ_TRANS_PACKED_0 =
            "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
                    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
                    "\1\22\1\23\1\6\1\24\1\6\1\25\1\26\2\6"+
                    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\5"+
                    "\1\36\1\6\1\0\1\4\1\6\1\37\1\40\1\41"+
                    "\1\42\1\43\1\44\1\45\10\0\1\46\1\0\1\47"+
                    "\7\0\1\50\17\0\1\51\14\0\1\4\133\0\3\52"+
                    "\1\0\1\53\1\52\1\54\7\52\1\55\6\52\11\0"+
                    "\1\56\2\0\1\52\13\0\1\52\2\57\1\0\1\53"+
                    "\1\52\1\54\7\52\1\55\6\52\10\0\1\60\1\56"+
                    "\2\0\1\52\13\0\1\52\2\61\1\0\1\53\1\52"+
                    "\1\54\7\52\1\55\6\52\10\0\1\62\1\56\2\0"+
                    "\1\52\13\0\1\63\2\52\1\0\1\64\1\63\1\65"+
                    "\7\63\1\66\6\63\11\0\1\67\2\0\1\63\13\0"+
                    "\3\52\1\0\1\53\1\52\1\54\1\52\1\70\5\52"+
                    "\1\55\6\52\11\0\1\56\2\0\1\52\13\0\3\52"+
                    "\1\0\1\53\1\52\1\71\7\52\1\55\6\52\11\0"+
                    "\1\56\2\0\1\52\13\0\3\52\1\0\1\72\1\52"+
                    "\1\54\7\52\1\73\6\52\11\0\1\56\2\0\1\52"+
                    "\13\0\3\52\1\0\1\53\1\52\1\54\5\52\1\74"+
                    "\1\52\1\55\1\52\1\75\4\52\11\0\1\56\2\0"+
                    "\1\52\13\0\3\52\1\0\1\53\1\76\1\54\7\52"+
                    "\1\55\6\52\11\0\1\56\2\0\1\52\13\0\3\52"+
                    "\1\0\1\53\1\52\1\77\7\52\1\55\6\52\11\0"+
                    "\1\56\2\0\1\52\13\0\3\52\1\0\1\53\1\52"+
                    "\1\54\4\52\1\100\2\52\1\55\3\52\1\101\2\52"+
                    "\11\0\1\56\2\0\1\52\13\0\3\52\1\0\1\53"+
                    "\1\102\1\54\7\52\1\55\6\52\11\0\1\56\2\0"+
                    "\1\52\13\0\3\52\1\0\1\103\1\52\1\54\7\52"+
                    "\1\55\6\52\11\0\1\56\2\0\1\52\13\0\3\52"+
                    "\1\0\1\104\1\52\1\54\7\52\1\55\2\52\1\105"+
                    "\3\52\11\0\1\56\2\0\1\52\13\0\3\52\1\0"+
                    "\1\53\1\106\1\54\1\52\1\107\5\52\1\55\6\52"+
                    "\11\0\1\56\2\0\1\52\13\0\3\52\1\0\1\53"+
                    "\1\52\1\54\5\52\1\110\1\52\1\55\6\52\11\0"+
                    "\1\56\2\0\1\52\13\0\3\52\1\0\1\53\1\52"+
                    "\1\54\7\52\1\55\1\52\1\111\4\52\11\0\1\56"+
                    "\2\0\1\52\17\0\1\46\1\0\1\47\7\0\1\50"+
                    "\6\0\1\112\10\0\1\51\22\0\1\46\1\0\1\47"+
                    "\7\0\1\50\6\0\1\113\10\0\1\51\22\0\1\46"+
                    "\1\0\1\47\7\0\1\50\6\0\1\114\10\0\1\51"+
                    "\22\0\1\46\1\0\1\47\7\0\1\50\6\0\1\115"+
                    "\3\0\1\116\4\0\1\51\17\0\1\117\1\120\1\0"+
                    "\1\46\1\0\1\47\7\0\1\50\17\0\1\121\24\0"+
                    "\1\122\107\0\1\123\21\0\1\124\4\0\1\125\47\0"+
                    "\1\126\46\0\3\52\1\0\21\52\11\0\1\52\2\0"+
                    "\1\52\13\0\3\52\1\0\2\52\1\127\16\52\11\0"+
                    "\1\52\2\0\1\52\13\0\3\52\1\0\21\52\11\0"+
                    "\1\52\2\0\1\130\13\0\3\52\1\0\2\52\1\131"+
                    "\4\52\1\132\11\52\11\0\1\52\2\0\1\52\13\0"+
                    "\3\52\1\0\2\52\1\133\16\52\11\0\1\52\2\0"+
                    "\1\52\13\0\1\52\2\57\1\0\21\52\10\0\1\134"+
                    "\1\52\2\0\1\52\14\0\2\135\52\0\1\52\2\61"+
                    "\1\0\21\52\10\0\1\62\1\52\2\0\1\52\13\0"+
                    "\1\136\2\52\1\0\21\136\11\0\1\136\2\0\1\136"+
                    "\13\0\1\136\2\52\1\0\2\136\1\137\16\136\11\0"+
                    "\1\136\2\0\1\136\13\0\1\136\2\52\1\0\21\136"+
                    "\11\0\1\136\2\0\1\140\13\0\1\136\2\52\1\0"+
                    "\2\136\1\141\4\136\1\142\11\136\11\0\1\136\2\0"+
                    "\1\136\13\0\1\136\2\52\1\0\2\136\1\143\16\136"+
                    "\11\0\1\136\2\0\1\136\13\0\3\52\1\0\7\52"+
                    "\1\144\11\52\11\0\1\52\2\0\1\52\13\0\3\52"+
                    "\1\0\3\52\1\145\3\52\1\146\1\147\10\52\11\0"+
                    "\1\52\2\0\1\130\13\0\3\52\1\0\2\52\1\127"+
                    "\2\52\1\150\13\52\11\0\1\52\2\0\1\52\13\0"+
                    "\3\52\1\0\2\52\1\131\3\52\1\151\1\132\11\52"+
                    "\11\0\1\52\2\0\1\52\13\0\3\52\1\0\6\52"+
                    "\1\152\12\52\11\0\1\52\2\0\1\52\13\0\3\52"+
                    "\1\0\10\52\1\153\10\52\11\0\1\52\2\0\1\52"+
                    "\13\0\3\52\1\0\21\52\7\0\1\154\1\0\1\52"+
                    "\2\0\1\52\13\0\3\52\1\0\15\52\1\155\3\52"+
                    "\11\0\1\52\2\0\1\130\13\0\3\52\1\0\10\52"+
                    "\1\156\10\52\11\0\1\52\2\0\1\52\13\0\3\52"+
                    "\1\0\11\52\1\157\7\52\11\0\1\52\2\0\1\52"+
                    "\13\0\3\52\1\0\17\52\1\160\1\52\11\0\1\52"+
                    "\2\0\1\52\13\0\3\52\1\0\2\52\1\127\2\52"+
                    "\1\161\13\52\11\0\1\52\2\0\1\52\13\0\3\52"+
                    "\1\0\2\52\1\127\4\52\1\162\11\52\11\0\1\52"+
                    "\2\0\1\52\13\0\3\52\1\0\2\52\1\163\16\52"+
                    "\11\0\1\52\2\0\1\52\13\0\3\52\1\0\4\52"+
                    "\1\164\14\52\11\0\1\52\2\0\1\52\13\0\3\52"+
                    "\1\0\12\52\1\165\6\52\11\0\1\52\2\0\1\52"+
                    "\13\0\3\52\1\0\11\52\1\166\7\52\11\0\1\52"+
                    "\2\0\1\52\7\0\1\116\2\0\40\116\2\0\10\116"+
                    "\5\0\1\117\1\120\60\0\1\126\4\0\1\167\42\0"+
                    "\2\134\53\0\1\170\1\135\52\0\1\52\2\171\1\0"+
                    "\21\52\11\0\1\52\2\0\1\52\13\0\3\52\1\0"+
                    "\4\52\1\172\14\52\11\0\1\52\2\0\1\52\13\0"+
                    "\3\52\1\0\17\52\1\173\1\52\11\0\1\52\2\0"+
                    "\1\52\13\0\3\52\1\0\12\52\1\174\6\52\11\0"+
                    "\1\52\2\0\1\52\13\0\3\52\1\0\2\52\1\175"+
                    "\16\52\11\0\1\52\2\0\1\52\13\0\3\52\1\0"+
                    "\2\52\1\176\16\52\11\0\1\52\2\0\1\52\13\0"+
                    "\3\52\1\0\1\52\1\177\17\52\11\0\1\52\2\0"+
                    "\1\52\21\0\1\200\46\0\3\52\1\0\10\52\1\201"+
                    "\10\52\11\0\1\52\2\0\1\52\13\0\3\52\1\0"+
                    "\7\52\1\202\11\52\11\0\1\52\2\0\1\52\13\0"+
                    "\3\52\1\0\7\52\1\203\11\52\11\0\1\52\2\0"+
                    "\1\52\13\0\3\52\1\0\2\52\1\204\16\52\11\0"+
                    "\1\52\2\0\1\52\13\0\3\52\1\0\21\52\7\0"+
                    "\1\205\1\0\1\52\2\0\1\52\13\0\3\52\1\0"+
                    "\10\52\1\206\10\52\11\0\1\52\2\0\1\52\13\0"+
                    "\3\52\1\0\12\52\1\207\6\52\11\0\1\52\2\0"+
                    "\1\52\13\0\3\52\1\0\6\52\1\160\12\52\11\0"+
                    "\1\52\2\0\1\52\13\0\3\52\1\0\12\52\1\210"+
                    "\6\52\11\0\1\52\2\0\1\52\13\0\1\52\2\211"+
                    "\1\0\21\52\11\0\1\52\2\0\1\52\13\0\3\52"+
                    "\1\0\1\52\1\212\17\52\11\0\1\52\2\0\1\52"+
                    "\13\0\3\52\1\0\1\52\1\213\17\52\11\0\1\52"+
                    "\2\0\1\52\31\0\1\214\36\0\3\52\1\0\17\52"+
                    "\1\215\1\52\11\0\1\52\2\0\1\52\13\0\3\52"+
                    "\1\0\11\52\1\216\7\52\11\0\1\52\2\0\1\52"+
                    "\13\0\3\52\1\0\3\52\1\217\15\52\11\0\1\52"+
                    "\2\0\1\52\26\0\1\220\41\0\3\52\1\0\20\52"+
                    "\1\221\11\0\1\52\2\0\1\52\13\0\3\52\1\0"+
                    "\2\52\1\222\16\52\11\0\1\52\2\0\1\52\13\0"+
                    "\3\52\1\0\5\52\1\223\13\52\11\0\1\52\2\0"+
                    "\1\52\13\0\3\52\1\0\1\224\20\52\11\0\1\52"+
                    "\2\0\1\52\25\0\1\225\42\0\3\52\1\0\12\52"+
                    "\1\226\6\52\11\0\1\52\2\0\1\52\13\0\3\52"+
                    "\1\0\3\52\1\227\15\52\11\0\1\52\2\0\1\52"+
                    "\13\0\3\52\1\0\14\52\1\230\4\52\11\0\1\52"+
                    "\2\0\1\52\33\0\1\231\42\0\1\232\46\0\3\52"+
                    "\1\0\7\52\1\233\11\52\11\0\1\52\2\0\1\52"+
                    "\21\0\1\234\52\0\1\235\44\0";

    private static int [] zzUnpackTrans() {
        int [] result = new int[4635];
        int offset = 0;
        offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackTrans(String packed, int offset, int [] result) {
        int i = 0;       /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int count = packed.charAt(i++);
            int value = packed.charAt(i++);
            value--;
            do result[j++] = value; while (--count > 0);
        }
        return j;
    }


    /* error codes */
    private static final int ZZ_UNKNOWN_ERROR = 0;
    private static final int ZZ_NO_MATCH = 1;
    private static final int ZZ_PUSHBACK_2BIG = 2;

    /* error messages for the codes above */
    private static final String ZZ_ERROR_MSG[] = {
            "Unkown internal scanner error",
            "Error: could not match input",
            "Error: pushback value was too large"
    };

    /**
     * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
     */
    private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

    private static final String ZZ_ATTRIBUTE_PACKED_0 =
            "\1\0\2\1\1\11\41\1\4\0\10\1\1\0\27\1"+
                    "\4\11\2\1\2\0\5\11\25\1\1\0\12\1\1\11"+
                    "\10\1\1\0\4\1\1\0\6\1\1\0\3\1\1\0"+
                    "\4\1\1\0\3\1\1\0\1\11\1\1\1\0\1\11";

    private static int [] zzUnpackAttribute() {
        int [] result = new int[157];
        int offset = 0;
        offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackAttribute(String packed, int offset, int [] result) {
        int i = 0;       /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int count = packed.charAt(i++);
            int value = packed.charAt(i++);
            do result[j++] = value; while (--count > 0);
        }
        return j;
    }

    /** the input device */
    private java.io.Reader zzReader;

    /** the current state of the DFA */
    private int zzState;

    /** the current lexical state */
    private int zzLexicalState = YYINITIAL;

    /** this buffer contains the current text to be matched and is
     the source of the yytext() string */
    private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

    /** the textposition at the last accepting state */
    private int zzMarkedPos;

    /** the current text position in the buffer */
    private int zzCurrentPos;

    /** startRead marks the beginning of the yytext() string in the buffer */
    private int zzStartRead;

    /** endRead marks the last character in the buffer, that has been read
     from input */
    private int zzEndRead;

    /** number of newlines encountered up to the start of the matched text */
    private int yyline;

    /** the number of characters up to the start of the matched text */
    private int yychar;

    /**
     * the number of characters from the last newline up to the start of the
     * matched text
     */
    private int yycolumn;

    /**
     * zzAtBOL == true <=> the scanner is currently at the beginning of a line
     */
    private boolean zzAtBOL = true;

    /** zzAtEOF == true <=> the scanner is at the EOF */
    private boolean zzAtEOF;

    /** denotes if the user-EOF-code has already been executed */
    private boolean zzEOFDone;

    /**
     * The number of occupied positions in zzBuffer beyond zzEndRead.
     * When a lead/high surrogate has been read from the input stream
     * into the final zzBuffer position, this will have a value of 1;
     * otherwise, it will have a value of 0.
     */
    private int zzFinalHighSurrogate = 0;


    /**
     * Creates a new scanner
     *
     * @param   in  the java.io.Reader to read input from.
     */
    Yylex(java.io.Reader in) {
        this.zzReader = in;
    }


    /**
     * Unpacks the compressed character translation table.
     *
     * @param packed   the packed character translation table
     * @return         the unpacked character translation table
     */
    private static char [] zzUnpackCMap(String packed) {
        char [] map = new char[0x110000];
        int i = 0;  /* index in packed string  */
        int j = 0;  /* index in unpacked array */
        while (i < 170) {
            int  count = packed.charAt(i++);
            char value = packed.charAt(i++);
            do map[j++] = value; while (--count > 0);
        }
        return map;
    }


    /**
     * Refills the input buffer.
     *
     * @return      <code>false</code>, iff there was new input.
     *
     * @exception   java.io.IOException  if any I/O-Error occurs
     */
    private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
        if (zzStartRead > 0) {
            zzEndRead += zzFinalHighSurrogate;
            zzFinalHighSurrogate = 0;
            System.arraycopy(zzBuffer, zzStartRead,
                    zzBuffer, 0,
                    zzEndRead-zzStartRead);

      /* translate stored positions */
            zzEndRead-= zzStartRead;
            zzCurrentPos-= zzStartRead;
            zzMarkedPos-= zzStartRead;
            zzStartRead = 0;
        }

    /* is the buffer big enough? */
        if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
            char newBuffer[] = new char[zzBuffer.length*2];
            System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
            zzBuffer = newBuffer;
            zzEndRead += zzFinalHighSurrogate;
            zzFinalHighSurrogate = 0;
        }

    /* fill the buffer with new input */
        int requested = zzBuffer.length - zzEndRead;
        int totalRead = 0;
        while (totalRead < requested) {
            int numRead = zzReader.read(zzBuffer, zzEndRead + totalRead, requested - totalRead);
            if (numRead == -1) {
                break;
            }
            totalRead += numRead;
        }

        if (totalRead > 0) {
            zzEndRead += totalRead;
            if (totalRead == requested) { /* possibly more input available */
                if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
                    --zzEndRead;
                    zzFinalHighSurrogate = 1;
                }
            }
            return false;
        }

        // totalRead = 0: End of stream
        return true;
    }


    /**
     * Closes the input stream.
     */
    public final void yyclose() throws java.io.IOException {
        zzAtEOF = true;            /* indicate end of file */
        zzEndRead = zzStartRead;  /* invalidate buffer    */

        if (zzReader != null)
            zzReader.close();
    }


    /**
     * Resets the scanner to read from a new input stream.
     * Does not close the old reader.
     *
     * All internal variables are reset, the old input stream
     * <b>cannot</b> be reused (internal buffer is discarded and lost).
     * Lexical state is set to <tt>ZZ_INITIAL</tt>.
     *
     * Internal scan buffer is resized down to its initial length, if it has grown.
     *
     * @param reader   the new input stream
     */
    public final void yyreset(java.io.Reader reader) {
        zzReader = reader;
        zzAtBOL  = true;
        zzAtEOF  = false;
        zzEOFDone = false;
        zzEndRead = zzStartRead = 0;
        zzCurrentPos = zzMarkedPos = 0;
        zzFinalHighSurrogate = 0;
        yyline = yychar = yycolumn = 0;
        zzLexicalState = YYINITIAL;
        if (zzBuffer.length > ZZ_BUFFERSIZE)
            zzBuffer = new char[ZZ_BUFFERSIZE];
    }


    /**
     * Returns the current lexical state.
     */
    public final int yystate() {
        return zzLexicalState;
    }


    /**
     * Enters a new lexical state
     *
     * @param newState the new lexical state
     */
    public final void yybegin(int newState) {
        zzLexicalState = newState;
    }


    /**
     * Returns the text matched by the current regular expression.
     */
    public final String yytext() {
        return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
    }


    /**
     * Returns the character at position <tt>pos</tt> from the
     * matched text.
     *
     * It is equivalent to yytext().charAt(pos), but faster
     *
     * @param pos the position of the character to fetch.
     *            A value from 0 to yylength()-1.
     *
     * @return the character at position pos
     */
    public final char yycharat(int pos) {
        return zzBuffer[zzStartRead+pos];
    }


    /**
     * Returns the length of the matched text region.
     */
    public final int yylength() {
        return zzMarkedPos-zzStartRead;
    }


    /**
     * Reports an error that occured while scanning.
     *
     * In a wellformed scanner (no or only correct usage of
     * yypushback(int) and a match-all fallback rule) this method
     * will only be called with things that "Can't Possibly Happen".
     * If this method is called, something is seriously wrong
     * (e.g. a JFlex bug producing a faulty scanner etc.).
     *
     * Usual syntax/scanner level error handling should be done
     * in error fallback rules.
     *
     * @param   errorCode  the code of the errormessage to display
     */
    private void zzScanError(int errorCode) {
        String message;
        try {
            message = ZZ_ERROR_MSG[errorCode];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
        }

        throw new Error(message);
    }


    /**
     * Pushes the specified amount of characters back into the input stream.
     *
     * They will be read again by then next call of the scanning method
     *
     * @param number  the number of characters to be read again.
     *                This number must not be greater than yylength()!
     */
    public void yypushback(int number)  {
        if ( number > yylength() )
            zzScanError(ZZ_PUSHBACK_2BIG);

        zzMarkedPos -= number;
    }


    /**
     * Resumes scanning until the next regular expression is matched,
     * the end of input is encountered or an I/O-Error occurs.
     *
     * @return      the next token
     * @exception   java.io.IOException  if any I/O-Error occurs
     */
    public Yytoken yylex() throws java.io.IOException {
        int zzInput;
        int zzAction;

        // cached fields:
        int zzCurrentPosL;
        int zzMarkedPosL;
        int zzEndReadL = zzEndRead;
        char [] zzBufferL = zzBuffer;
        char [] zzCMapL = ZZ_CMAP;

        int [] zzTransL = ZZ_TRANS;
        int [] zzRowMapL = ZZ_ROWMAP;
        int [] zzAttrL = ZZ_ATTRIBUTE;

        while (true) {
            zzMarkedPosL = zzMarkedPos;

            zzAction = -1;

            zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

            zzState = ZZ_LEXSTATE[zzLexicalState];

            // set up zzAction for empty match case:
            int zzAttributes = zzAttrL[zzState];
            if ( (zzAttributes & 1) == 1 ) {
                zzAction = zzState;
            }


            zzForAction: {
                while (true) {

                    if (zzCurrentPosL < zzEndReadL) {
                        zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
                        zzCurrentPosL += Character.charCount(zzInput);
                    }
                    else if (zzAtEOF) {
                        zzInput = YYEOF;
                        break zzForAction;
                    }
                    else {
                        // store back cached positions
                        zzCurrentPos  = zzCurrentPosL;
                        zzMarkedPos   = zzMarkedPosL;
                        boolean eof = zzRefill();
                        // get translated positions and possibly new buffer
                        zzCurrentPosL  = zzCurrentPos;
                        zzMarkedPosL   = zzMarkedPos;
                        zzBufferL      = zzBuffer;
                        zzEndReadL     = zzEndRead;
                        if (eof) {
                            zzInput = YYEOF;
                            break zzForAction;
                        }
                        else {
                            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
                            zzCurrentPosL += Character.charCount(zzInput);
                        }
                    }
                    int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
                    if (zzNext == -1) break zzForAction;
                    zzState = zzNext;

                    zzAttributes = zzAttrL[zzState];
                    if ( (zzAttributes & 1) == 1 ) {
                        zzAction = zzState;
                        zzMarkedPosL = zzCurrentPosL;
                        if ( (zzAttributes & 8) == 8 ) break zzForAction;
                    }

                }
            }

            // store back cached position
            zzMarkedPos = zzMarkedPosL;

            switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
                case 1:
                { System.out.println("illegal character");
                }
                case 54: break;
                case 2:
                {
                }
                case 55: break;
                case 3:
                { System.out.println(""+yytext());
                }
                case 56: break;
                case 4:
                { System.out.println("NUMCONST"+yytext());
                }
                case 57: break;
                case 5:
                { System.out.println("assignment"+yytext());
                }
                case 58: break;
                case 6:
                { System.out.println("plus"+yytext());
                }
                case 59: break;
                case 7:
                { System.out.println("minus"+yytext());
                }
                case 60: break;
                case 8:
                { System.out.println("multiply"+yytext());
                }
                case 61: break;
                case 9:
                { System.out.println("division"+yytext());
                }
                case 62: break;
                case 10:
                { System.out.println("modulo"+yytext());
                }
                case 63: break;
                case 11:
                { System.out.println("quesion_mark"+yytext());
                }
                case 64: break;
                case 12:
                { System.out.println("dot"+yytext());
                }
                case 65: break;
                case 13:
                { System.out.println("square_bracket_left"+yytext());
                }
                case 66: break;
                case 14:
                { System.out.println("curly_braces_left"+yytext());
                }
                case 67: break;
                case 15:
                { System.out.println("paranteces_left"+yytext());
                }
                case 68: break;
                case 16:
                { System.out.println("paranteces_right"+yytext());
                }
                case 69: break;
                case 17:
                { System.out.println("semicolon"+yytext());
                }
                case 70: break;
                case 18:
                { System.out.println("colon"+yytext());
                }
                case 71: break;
                case 19:
                { System.out.println("number_error"+yytext());
                }
                case 72: break;
                case 20:
                { System.out.println("OR"+yytext());
                }
                case 73: break;
                case 21:
                { System.out.println("IF"+yytext());
                }
                case 74: break;
                case 22:
                { System.out.println("plus_assign"+yytext());
                }
                case 75: break;
                case 23:
                { System.out.println("minus_assign"+yytext());
                }
                case 76: break;
                case 24:
                { System.out.println("multiply_assign"+yytext());
                }
                case 77: break;
                case 25:
                { System.out.println("divide_assign"+yytext());
                }
                case 78: break;
                case 26:
                { System.out.println("commment"+yytext());
                }
                case 79: break;
                case 27:
                { System.out.println("not_equal"+yytext());
                }
                case 80: break;
                case 28:
                { System.out.println("equal"+yytext());
                }
                case 81: break;
                case 29:
                { System.out.println("less_equal"+yytext());
                }
                case 82: break;
                case 30:
                { System.out.println("less_than"+yytext());
                }
                case 83: break;
                case 31:
                { System.out.println("greater_equal"+yytext());
                }
                case 84: break;
                case 32:
                { System.out.println("Real_const"+yytext()+"Real_const");
                }
                case 85: break;
                case 33:
                { System.out.println("NOT"+yytext());
                }
                case 86: break;
                case 34:
                { System.out.println("END"+yytext());
                }
                case 87: break;
                case 35:
                { System.out.println("AND"+yytext());
                }
                case 88: break;
                case 36:
                { System.out.println("INT"+yytext());
                }
                case 89: break;
                case 37:
                { System.out.println("greater_than"+yytext());
                }
                case 90: break;
                case 38:
                { System.out.println("REAL"+yytext());
                }
                case 91: break;
                case 39:
                { System.out.println("ELSE"+yytext());
                }
                case 92: break;
                case 40:
                { System.out.println("CASE"+yytext());
                }
                case 93: break;
                case 41:
                { System.out.println("CHAR"+yytext());
                }
                case 94: break;
                case 42:
                { System.out.println("BoolConst"+yytext());
                }
                case 95: break;
                case 43:
                { System.out.println("BOOL"+yytext());
                }
                case 96: break;
                case 44:
                { System.out.println("Fake_id"+yytext());
                }
                case 97: break;
                case 45:
                { System.out.println("BREAK"+yytext());
                }
                case 98: break;
                case 46:
                { System.out.println("WHILE"+yytext());
                }
                case 99: break;
                case 47:
                { System.out.println("RECORD"+yytext());
                }
                case 100: break;
                case 48:
                { System.out.println("RETURN"+yytext());
                }
                case 101: break;
                case 49:
                { System.out.println("Static"+yytext());
                }
                case 102: break;
                case 50:
                { System.out.println("SWITCH"+yytext());
                }
                case 103: break;
                case 51:
                { System.out.println("OR_ELSE"+yytext());
                }
                case 104: break;
                case 52:
                { System.out.println("DEFUALT"+yytext());
                }
                case 105: break;
                case 53:
                { System.out.println("AND_THEN"+yytext());
                }
                case 106: break;
                default:
                    if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
                        zzAtEOF = true;
                        return null;
                    }
                    else {
                        zzScanError(ZZ_NO_MATCH);
                    }
            }
        }
    }


}
