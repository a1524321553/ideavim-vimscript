/* The following code was generated by JFlex 1.4.3 on 04.11.11 1:00 */

/**
* VimScript lexer.
*/

package com.maddyhome.idea.vim.lang.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 04.11.11 1:00 from the specification file
 * <tt>D:/CSC/IdeaVIM/ideavim/src/com/maddyhome/idea/vim/lang/lexer/vimscript.flex</tt>
 */
public final class _VimScriptLexer implements FlexLexer, VimScriptTokenTypes {
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
    "\11\0\1\2\1\1\2\0\1\3\22\0\1\2\1\23\1\34\1\0"+
    "\1\17\1\33\1\20\1\14\1\35\1\36\1\31\1\30\1\0\1\7"+
    "\1\12\1\32\1\6\7\11\2\5\1\16\1\0\1\25\1\22\1\24"+
    "\1\43\1\21\4\4\1\13\22\4\1\10\2\4\1\37\1\0\1\40"+
    "\1\0\1\4\1\0\2\15\2\4\1\13\1\4\1\15\4\4\1\15"+
    "\6\4\2\15\1\4\2\15\1\10\2\4\1\41\1\27\1\42\1\26"+
    "\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\2\1\4\2\5\1\6"+
    "\1\7\1\10\1\4\1\11\3\1\1\12\1\13\1\14"+
    "\1\15\1\1\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\0\1\5"+
    "\4\0\1\32\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\1\43\1\44\3\0\1\45\1\5\1\46"+
    "\1\47\1\50\1\46\2\50\2\45";

  private static int [] zzUnpackAction() {
    int [] result = new int[63];
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
    "\0\0\0\44\0\44\0\44\0\110\0\154\0\220\0\264"+
    "\0\330\0\44\0\374\0\u0120\0\44\0\u0144\0\u0168\0\u018c"+
    "\0\u01b0\0\u01d4\0\u01f8\0\u021c\0\u0240\0\330\0\44\0\44"+
    "\0\44\0\u0264\0\44\0\44\0\44\0\44\0\44\0\44"+
    "\0\44\0\u0288\0\u02ac\0\u02d0\0\u02f4\0\u0318\0\u033c\0\u0360"+
    "\0\u0384\0\44\0\u03a8\0\44\0\44\0\44\0\44\0\44"+
    "\0\44\0\44\0\u03cc\0\u03f0\0\u0414\0\u0438\0\u02d0\0\u0318"+
    "\0\u045c\0\u03f0\0\u0414\0\44\0\u0480\0\u04a4\0\u04c8";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[63];
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
    "\1\6\1\7\1\12\1\6\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\2\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\45\0\1\3\46\0\3\6"+
    "\1\0\2\6\1\0\1\6\1\0\1\6\33\0\2\7"+
    "\2\0\1\7\1\42\37\0\1\43\1\0\1\44\1\43"+
    "\1\42\36\0\1\7\1\45\2\0\1\7\32\0\1\46"+
    "\1\0\1\46\1\0\40\46\4\0\3\6\1\0\2\6"+
    "\1\0\1\6\1\0\1\6\1\47\31\0\1\50\3\0"+
    "\1\50\2\0\1\50\1\0\1\50\32\0\1\51\3\0"+
    "\1\51\2\0\1\51\1\0\1\51\2\0\1\52\27\0"+
    "\1\53\3\0\1\53\2\0\1\53\1\0\1\53\50\0"+
    "\1\54\3\0\1\55\37\0\1\56\3\0\1\57\37\0"+
    "\1\60\43\0\1\61\50\0\1\62\14\0\1\63\1\64"+
    "\1\63\1\64\10\63\1\65\17\63\1\65\7\63\5\0"+
    "\2\66\2\0\1\66\40\0\1\43\2\0\1\43\37\0"+
    "\2\67\2\0\1\67\44\0\1\42\31\0\1\46\1\0"+
    "\1\46\1\0\10\46\1\70\27\46\4\0\1\71\3\0"+
    "\1\71\2\0\1\71\1\0\1\71\32\0\3\50\1\0"+
    "\2\50\1\0\1\50\1\0\1\50\32\0\3\51\1\0"+
    "\2\51\1\0\1\51\1\0\1\51\32\0\3\53\1\0"+
    "\2\53\1\0\1\53\1\0\1\53\26\0\1\63\1\72"+
    "\1\63\1\72\10\63\1\65\17\63\1\73\7\63\1\0"+
    "\1\74\1\0\1\75\40\0\1\63\1\64\1\63\1\64"+
    "\10\63\1\65\17\63\1\73\7\63\5\0\2\66\2\0"+
    "\1\66\1\0\1\76\34\0\3\71\1\0\2\71\1\0"+
    "\1\71\1\0\1\71\27\0\1\74\47\0\3\77\1\0"+
    "\1\77\16\0\1\77\20\0\2\77\2\0\1\77\32\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1260];
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
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

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
    "\1\0\3\11\5\1\1\11\2\1\1\11\11\1\3\11"+
    "\1\1\7\11\1\0\1\1\4\0\2\1\1\11\1\1"+
    "\7\11\3\0\6\1\1\11\3\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[63];
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

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;


  public _VimScriptLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public _VimScriptLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 122) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
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
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
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
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
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
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL.charAt(zzCurrentPosL++);
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
              zzInput = zzBufferL.charAt(zzCurrentPosL++);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
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
        case 23: 
          { return LEFT_CURLY_BRACKET;
          }
        case 41: break;
        case 30: 
          { return OP_EQUAL_TO;
          }
        case 42: break;
        case 20: 
          { return RIGHT_ROUND_BRACKET;
          }
        case 43: break;
        case 5: 
          { return INTEGER;
          }
        case 44: break;
        case 12: 
          { return OP_GT;
          }
        case 45: break;
        case 14: 
          { return OP_PLUS;
          }
        case 46: break;
        case 10: 
          { return OP_ASSIGN;
          }
        case 47: break;
        case 8: 
          { return SINGLE_QUOTE;
          }
        case 48: break;
        case 24: 
          { return RIGHT_CURLY_BRACKET;
          }
        case 49: break;
        case 26: 
          { return ENVIRONMENT_VARIABLE;
          }
        case 50: break;
        case 40: 
          { return COMMENT;
          }
        case 51: break;
        case 21: 
          { return LEFT_SQUARE_BRACKET;
          }
        case 52: break;
        case 7: 
          { return DOT;
          }
        case 53: break;
        case 35: 
          { return OP_LT_EQ;
          }
        case 54: break;
        case 15: 
          { return OP_MULT;
          }
        case 55: break;
        case 6: 
          { return OP_MINUS;
          }
        case 56: break;
        case 9: 
          { return COLON;
          }
        case 57: break;
        case 39: 
          { return VARIABLE_WITH_PREFIX;
          }
        case 58: break;
        case 13: 
          { return OP_LT;
          }
        case 59: break;
        case 3: 
          { return WHITESPACE;
          }
        case 60: break;
        case 22: 
          { return RIGHT_SQUARE_BRACKET;
          }
        case 61: break;
        case 29: 
          { return REGISTER;
          }
        case 62: break;
        case 36: 
          { return OP_LOGICAL_OR;
          }
        case 63: break;
        case 31: 
          { return OP_MATCHES;
          }
        case 64: break;
        case 17: 
          { return OP_MOD;
          }
        case 65: break;
        case 37: 
          { return FLOAT;
          }
        case 66: break;
        case 33: 
          { return OP_NOT_MATCHES;
          }
        case 67: break;
        case 11: 
          { return EXCLAMATION_MARK;
          }
        case 68: break;
        case 32: 
          { return OP_NOT_EQUAL_TO;
          }
        case 69: break;
        case 34: 
          { return OP_GT_EQ;
          }
        case 70: break;
        case 38: 
          { return STRING;
          }
        case 71: break;
        case 27: 
          { return OPTION;
          }
        case 72: break;
        case 16: 
          { return OP_DIV;
          }
        case 73: break;
        case 1: 
          { return BAD_CHARACTER;
          }
        case 74: break;
        case 25: 
          { return QUESTION_MARK;
          }
        case 75: break;
        case 4: 
          { return IDENTIFIER;
          }
        case 76: break;
        case 19: 
          { return LEFT_ROUND_BRACKET;
          }
        case 77: break;
        case 18: 
          { return DOUBLE_QUOTE;
          }
        case 78: break;
        case 28: 
          { return OP_LOGICAL_AND;
          }
        case 79: break;
        case 2: 
          { 
          }
        case 80: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
              {
                return EOF;
              }
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
