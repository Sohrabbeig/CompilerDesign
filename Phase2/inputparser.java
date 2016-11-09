/* A Bison parser, made by GNU Bison 2.5.  */

/* Skeleton implementation for Bison LALR(1) parsers in Java
   
      Copyright (C) 2007-2011 Free Software Foundation, Inc.
   
   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.
   
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.
   
   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.
   
   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

/* First part of user declarations.  */


/**
 * A Bison parser, automatically generated from <tt>inputparser.y</tt>.
 *
 * @author LALR (1) parser skeleton written by Paolo Bonzini.
 */
class YYParser
{
    /** Version number for the Bison executable that generated this parser.  */
  public static final String bisonVersion = "2.5";

  /** Name of the skeleton that generated this parser.  */
  public static final String bisonSkeleton = "lalr1.java";


  /** True if verbose error messages are enabled.  */
  public boolean errorVerbose = false;



  /** Token returned by the scanner to signal the end of its input.  */
  public static final int EOF = 0;

/* Tokens.  */
  /** Token number, to be returned by the scanner.  */
  public static final int Real_const = 258;
  /** Token number, to be returned by the scanner.  */
  public static final int number_error = 259;
  /** Token number, to be returned by the scanner.  */
  public static final int BoolConst = 260;
  /** Token number, to be returned by the scanner.  */
  public static final int greater_than = 261;
  /** Token number, to be returned by the scanner.  */
  public static final int greater_equal = 262;
  /** Token number, to be returned by the scanner.  */
  public static final int not_equal = 263;
  /** Token number, to be returned by the scanner.  */
  public static final int equal = 264;
  /** Token number, to be returned by the scanner.  */
  public static final int less_equal = 265;
  /** Token number, to be returned by the scanner.  */
  public static final int less_than = 266;
  /** Token number, to be returned by the scanner.  */
  public static final int square_bracket_left = 267;
  /** Token number, to be returned by the scanner.  */
  public static final int square_bracket_right = 268;
  /** Token number, to be returned by the scanner.  */
  public static final int curly_brace_left = 269;
  /** Token number, to be returned by the scanner.  */
  public static final int curly_brace_right = 270;
  /** Token number, to be returned by the scanner.  */
  public static final int parenthesis_left = 271;
  /** Token number, to be returned by the scanner.  */
  public static final int parenthesis_right = 272;
  /** Token number, to be returned by the scanner.  */
  public static final int semicolon = 273;
  /** Token number, to be returned by the scanner.  */
  public static final int comma = 274;
  /** Token number, to be returned by the scanner.  */
  public static final int colon = 275;
  /** Token number, to be returned by the scanner.  */
  public static final int dot = 276;
  /** Token number, to be returned by the scanner.  */
  public static final int AND_THEN = 277;
  /** Token number, to be returned by the scanner.  */
  public static final int OR_ELSE = 278;
  /** Token number, to be returned by the scanner.  */
  public static final int OR = 279;
  /** Token number, to be returned by the scanner.  */
  public static final int AND = 280;
  /** Token number, to be returned by the scanner.  */
  public static final int NOT = 281;
  /** Token number, to be returned by the scanner.  */
  public static final int IF = 282;
  /** Token number, to be returned by the scanner.  */
  public static final int ELSE = 283;
  /** Token number, to be returned by the scanner.  */
  public static final int SWITCH = 284;
  /** Token number, to be returned by the scanner.  */
  public static final int END = 285;
  /** Token number, to be returned by the scanner.  */
  public static final int CASE = 286;
  /** Token number, to be returned by the scanner.  */
  public static final int DEFAULT = 287;
  /** Token number, to be returned by the scanner.  */
  public static final int WHILE = 288;
  /** Token number, to be returned by the scanner.  */
  public static final int RETURN = 289;
  /** Token number, to be returned by the scanner.  */
  public static final int BREAK = 290;
  /** Token number, to be returned by the scanner.  */
  public static final int RECORD = 291;
  /** Token number, to be returned by the scanner.  */
  public static final int Static = 292;
  /** Token number, to be returned by the scanner.  */
  public static final int INT = 293;
  /** Token number, to be returned by the scanner.  */
  public static final int REAL = 294;
  /** Token number, to be returned by the scanner.  */
  public static final int BOOL = 295;
  /** Token number, to be returned by the scanner.  */
  public static final int CHAR = 296;
  /** Token number, to be returned by the scanner.  */
  public static final int plus_assign = 297;
  /** Token number, to be returned by the scanner.  */
  public static final int minus_assign = 298;
  /** Token number, to be returned by the scanner.  */
  public static final int multiply_assign = 299;
  /** Token number, to be returned by the scanner.  */
  public static final int divide_assign = 300;
  /** Token number, to be returned by the scanner.  */
  public static final int question_mark = 301;
  /** Token number, to be returned by the scanner.  */
  public static final int modulo = 302;
  /** Token number, to be returned by the scanner.  */
  public static final int division = 303;
  /** Token number, to be returned by the scanner.  */
  public static final int multiply = 304;
  /** Token number, to be returned by the scanner.  */
  public static final int minus = 305;
  /** Token number, to be returned by the scanner.  */
  public static final int plus = 306;
  /** Token number, to be returned by the scanner.  */
  public static final int assignment = 307;
  /** Token number, to be returned by the scanner.  */
  public static final int NUMCONST = 308;
  /** Token number, to be returned by the scanner.  */
  public static final int ID = 309;
  /** Token number, to be returned by the scanner.  */
  public static final int Fake_id = 310;
  /** Token number, to be returned by the scanner.  */
  public static final int WhiteSpace = 311;
  /** Token number, to be returned by the scanner.  */
  public static final int CHARCONST = 312;
  /** Token number, to be returned by the scanner.  */
  public static final int THEN = 313;



  

  /**
   * Communication interface between the scanner and the Bison-generated
   * parser <tt>YYParser</tt>.
   */
  public interface Lexer {
    

    /**
     * Method to retrieve the semantic value of the last scanned token.
     * @return the semantic value of the last scanned token.  */
    Object getLVal ();

    /**
     * Entry point for the scanner.  Returns the token identifier corresponding
     * to the next token and prepares to return the semantic value
     * of the token.
     * @return the token identifier corresponding to the next token. */
    int yylex () throws java.io.IOException;

    /**
     * Entry point for error reporting.  Emits an error
     * in a user-defined way.
     *
     * 
     * @param s The string for the error message.  */
     void yyerror (String s);
  }

  /** The object doing lexical analysis for us.  */
  private Lexer yylexer;
  
  



  /**
   * Instantiates the Bison-generated parser.
   * @param yylexer The scanner that will supply tokens to the parser.
   */
  public YYParser (Lexer yylexer) {
    this.yylexer = yylexer;
    
  }

  private java.io.PrintStream yyDebugStream = System.err;

  /**
   * Return the <tt>PrintStream</tt> on which the debugging output is
   * printed.
   */
  public final java.io.PrintStream getDebugStream () { return yyDebugStream; }

  /**
   * Set the <tt>PrintStream</tt> on which the debug output is printed.
   * @param s The stream that is used for debugging output.
   */
  public final void setDebugStream(java.io.PrintStream s) { yyDebugStream = s; }

  private int yydebug = 0;

  /**
   * Answer the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   */
  public final int getDebugLevel() { return yydebug; }

  /**
   * Set the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   * @param level The verbosity level for debugging output.
   */
  public final void setDebugLevel(int level) { yydebug = level; }

  private final int yylex () throws java.io.IOException {
    return yylexer.yylex ();
  }
  protected final void yyerror (String s) {
    yylexer.yyerror (s);
  }

  

  protected final void yycdebug (String s) {
    if (yydebug > 0)
      yyDebugStream.println (s);
  }

  private final class YYStack {
    private int[] stateStack = new int[16];
    
    private Object[] valueStack = new Object[16];

    public int size = 16;
    public int height = -1;

    public final void push (int state, Object value			    ) {
      height++;
      if (size == height)
        {
	  int[] newStateStack = new int[size * 2];
	  System.arraycopy (stateStack, 0, newStateStack, 0, height);
	  stateStack = newStateStack;
	  

	  Object[] newValueStack = new Object[size * 2];
	  System.arraycopy (valueStack, 0, newValueStack, 0, height);
	  valueStack = newValueStack;

	  size *= 2;
	}

      stateStack[height] = state;
      
      valueStack[height] = value;
    }

    public final void pop () {
      pop (1);
    }

    public final void pop (int num) {
      // Avoid memory leaks... garbage collection is a white lie!
      if (num > 0) {
	java.util.Arrays.fill (valueStack, height - num + 1, height + 1, null);
        
      }
      height -= num;
    }

    public final int stateAt (int i) {
      return stateStack[height - i];
    }

    public final Object valueAt (int i) {
      return valueStack[height - i];
    }

    // Print the state stack on the debug stream.
    public void print (java.io.PrintStream out)
    {
      out.print ("Stack now");

      for (int i = 0; i <= height; i++)
        {
	  out.print (' ');
	  out.print (stateStack[i]);
        }
      out.println ();
    }
  }

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return success (<tt>true</tt>).  */
  public static final int YYACCEPT = 0;

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return failure (<tt>false</tt>).  */
  public static final int YYABORT = 1;

  /**
   * Returned by a Bison action in order to start error recovery without
   * printing an error message.  */
  public static final int YYERROR = 2;

  // Internal return codes that are not supported for user semantic
  // actions.
  private static final int YYERRLAB = 3;
  private static final int YYNEWSTATE = 4;
  private static final int YYDEFAULT = 5;
  private static final int YYREDUCE = 6;
  private static final int YYERRLAB1 = 7;
  private static final int YYRETURN = 8;

  private int yyerrstatus_ = 0;

  /**
   * Return whether error recovery is being done.  In this state, the parser
   * reads token until it reaches a known state, and then restarts normal
   * operation.  */
  public final boolean recovering ()
  {
    return yyerrstatus_ == 0;
  }

  private int yyaction (int yyn, YYStack yystack, int yylen) 
  {
    Object yyval;
    

    /* If YYLEN is nonzero, implement the default value of the action:
       `$$ = $1'.  Otherwise, use the top of the stack.

       Otherwise, the following line sets YYVAL to garbage.
       This behavior is undocumented and Bison
       users should not rely upon it.  */
    if (yylen > 0)
      yyval = yystack.valueAt (yylen - 1);
    else
      yyval = yystack.valueAt (0);

    yy_reduce_print (yyn, yystack);

    switch (yyn)
      {
	  case 2:
  if (yyn == 2)
    
/* Line 351 of lalr1.java  */
/* Line 13 of "inputparser.y"  */
    {
		System.out.printf("Rule 1 program : declarationList\n") ;
	};
  break;
    

  case 3:
  if (yyn == 3)
    
/* Line 351 of lalr1.java  */
/* Line 19 of "inputparser.y"  */
    {
		System.out.printf("Rule 2 declarationList : declarationList declaration \n") ;
	};
  break;
    

  case 4:
  if (yyn == 4)
    
/* Line 351 of lalr1.java  */
/* Line 28 of "inputparser.y"  */
    {
		System.out.printf("Rule 3 declarationList : declaration\n") ;
	};
  break;
    

  case 5:
  if (yyn == 5)
    
/* Line 351 of lalr1.java  */
/* Line 36 of "inputparser.y"  */
    {
		System.out.printf("Rule 4 declaration : varDeclaration \n") ;
	};
  break;
    

  case 6:
  if (yyn == 6)
    
/* Line 351 of lalr1.java  */
/* Line 46 of "inputparser.y"  */
    {
		System.out.printf("Rule 5 declaration :  funDeclaration\n") ;
	};
  break;
    

  case 7:
  if (yyn == 7)
    
/* Line 351 of lalr1.java  */
/* Line 56 of "inputparser.y"  */
    {
		System.out.printf("Rule 6 declaration :  recDeclaration\n") ;
	};
  break;
    

  case 8:
  if (yyn == 8)
    
/* Line 351 of lalr1.java  */
/* Line 65 of "inputparser.y"  */
    {
		System.out.printf("Rule 7 recDeclaration : RECORD ID '{' localDeclarations '}'\n") ;
	};
  break;
    

  case 9:
  if (yyn == 9)
    
/* Line 351 of lalr1.java  */
/* Line 74 of "inputparser.y"  */
    {
		System.out.printf("Rule 8 varDeclaration : typeSpecifier varDeclList ';'\n") ;
	};
  break;
    

  case 10:
  if (yyn == 10)
    
/* Line 351 of lalr1.java  */
/* Line 86 of "inputparser.y"  */
    {
		System.out.printf("Rule 9 scopedVarDeclaration : scopedTypeSpecifier varDeclList ';'\n") ;
	};
  break;
    

  case 11:
  if (yyn == 11)
    
/* Line 351 of lalr1.java  */
/* Line 98 of "inputparser.y"  */
    {
		System.out.printf("Rule 10 varDeclList : varDeclList ',' varDeclInitialize\n") ;
	};
  break;
    

  case 12:
  if (yyn == 12)
    
/* Line 351 of lalr1.java  */
/* Line 108 of "inputparser.y"  */
    {
		System.out.printf("Rule 11 varDeclList : varDeclInitialize \n") ;
	};
  break;
    

  case 13:
  if (yyn == 13)
    
/* Line 351 of lalr1.java  */
/* Line 118 of "inputparser.y"  */
    {
		System.out.printf("Rule 11 varDeclInitialize : varDeclId  \n") ;
	};
  break;
    

  case 14:
  if (yyn == 14)
    
/* Line 351 of lalr1.java  */
/* Line 131 of "inputparser.y"  */
    {
		System.out.printf("Rule 12 varDeclInitialize :   varDeclId ':' simpleExpression\n") ;
	};
  break;
    

  case 15:
  if (yyn == 15)
    
/* Line 351 of lalr1.java  */
/* Line 144 of "inputparser.y"  */
    {
		System.out.printf("Rule 13 varDeclId : ID \n") ;
	};
  break;
    

  case 16:
  if (yyn == 16)
    
/* Line 351 of lalr1.java  */
/* Line 154 of "inputparser.y"  */
    {
		System.out.printf("Rule 14 varDeclId :  ID '[' NUMCONST ']' \n") ;
	};
  break;
    

  case 17:
  if (yyn == 17)
    
/* Line 351 of lalr1.java  */
/* Line 165 of "inputparser.y"  */
    {
		System.out.printf("Rule 15 varDeclId :  scopedTypeSpecifier : Static typeSpecifier\n") ;
	};
  break;
    

  case 18:
  if (yyn == 18)
    
/* Line 351 of lalr1.java  */
/* Line 178 of "inputparser.y"  */
    {
		System.out.printf("Rule 16 varDeclId : typeSpecifier \n") ;
	};
  break;
    

  case 19:
  if (yyn == 19)
    
/* Line 351 of lalr1.java  */
/* Line 191 of "inputparser.y"  */
    {
		System.out.printf("Rule 17 typeSpecifier : returnTypeSpecifier  \n") ;
	};
  break;
    

  case 20:
  if (yyn == 20)
    
/* Line 351 of lalr1.java  */
/* Line 204 of "inputparser.y"  */
    {
		System.out.printf("Rule 18 typeSpecifier :  /* | RECTYPE   */ \n") ;
	};
  break;
    

  case 21:
  if (yyn == 21)
    
/* Line 351 of lalr1.java  */
/* Line 216 of "inputparser.y"  */
    {
		System.out.printf("Rule 19 returnTypeSpecifier : INT \n") ;
	};
  break;
    

  case 22:
  if (yyn == 22)
    
/* Line 351 of lalr1.java  */
/* Line 227 of "inputparser.y"  */
    {
		System.out.printf("Rule 20 returnTypeSpecifier : REAL \n") ;
	};
  break;
    

  case 23:
  if (yyn == 23)
    
/* Line 351 of lalr1.java  */
/* Line 238 of "inputparser.y"  */
    {
		System.out.printf("Rule 21 returnTypeSpecifier :  BOOL\n") ;
	};
  break;
    

  case 24:
  if (yyn == 24)
    
/* Line 351 of lalr1.java  */
/* Line 253 of "inputparser.y"  */
    {
		System.out.printf("Rule 22 returnTypeSpecifier :  CHAR\n") ;
	};
  break;
    

  case 25:
  if (yyn == 25)
    
/* Line 351 of lalr1.java  */
/* Line 266 of "inputparser.y"  */
    {
		System.out.printf("Rule 23 funDeclaration : typeSpecifier ID '(' params ')' statement \n") ;
	};
  break;
    

  case 26:
  if (yyn == 26)
    
/* Line 351 of lalr1.java  */
/* Line 277 of "inputparser.y"  */
    {
		System.out.printf("Rule 24 funDeclaration : ID '(' params ')' statement\n") ;
	};
  break;
    

  case 27:
  if (yyn == 27)
    
/* Line 351 of lalr1.java  */
/* Line 286 of "inputparser.y"  */
    {
		System.out.printf("Rule 25 params : paramList \n") ;
	};
  break;
    

  case 28:
  if (yyn == 28)
    
/* Line 351 of lalr1.java  */
/* Line 295 of "inputparser.y"  */
    {
		System.out.printf("Rule 26 params : /*   lamda  */\n") ;
	};
  break;
    

  case 29:
  if (yyn == 29)
    
/* Line 351 of lalr1.java  */
/* Line 306 of "inputparser.y"  */
    {
		System.out.printf("Rule 27 paramList : paramList ';' paramTypeList \n") ;
	};
  break;
    

  case 30:
  if (yyn == 30)
    
/* Line 351 of lalr1.java  */
/* Line 317 of "inputparser.y"  */
    {
		System.out.printf("Rule 28 paramList : paramTypeList \n") ;
	};
  break;
    

  case 31:
  if (yyn == 31)
    
/* Line 351 of lalr1.java  */
/* Line 331 of "inputparser.y"  */
    {
		System.out.printf("Rule 29 paramTypeList : typeSpecifier paramIdList\n") ;
	};
  break;
    

  case 32:
  if (yyn == 32)
    
/* Line 351 of lalr1.java  */
/* Line 343 of "inputparser.y"  */
    {
		System.out.printf("Rule 30 paramIdList : paramIdList ',' paramId \n") ;
	};
  break;
    

  case 33:
  if (yyn == 33)
    
/* Line 351 of lalr1.java  */
/* Line 355 of "inputparser.y"  */
    {
		System.out.printf("Rule 31 paramIdList : paramId \n") ;
	};
  break;
    

  case 34:
  if (yyn == 34)
    
/* Line 351 of lalr1.java  */
/* Line 369 of "inputparser.y"  */
    {
		System.out.printf("Rule 32 paramId : ID  \n") ;
	};
  break;
    

  case 35:
  if (yyn == 35)
    
/* Line 351 of lalr1.java  */
/* Line 381 of "inputparser.y"  */
    {
		System.out.printf("Rule 33 paramId : ID '[' ']'\n") ;
	};
  break;
    

  case 36:
  if (yyn == 36)
    
/* Line 351 of lalr1.java  */
/* Line 397 of "inputparser.y"  */
    {
		System.out.printf("Rule 34 statement : expressionStmt \n") ;
	};
  break;
    

  case 37:
  if (yyn == 37)
    
/* Line 351 of lalr1.java  */
/* Line 409 of "inputparser.y"  */
    {
		System.out.printf("Rule 35 statement : compoundStmt \n") ;
	};
  break;
    

  case 38:
  if (yyn == 38)
    
/* Line 351 of lalr1.java  */
/* Line 420 of "inputparser.y"  */
    {
		System.out.printf("Rule 36 statement : selectionStmt \n") ;
	};
  break;
    

  case 39:
  if (yyn == 39)
    
/* Line 351 of lalr1.java  */
/* Line 432 of "inputparser.y"  */
    {
		System.out.printf("Rule 37 statement : iterationStmt \n") ;
	};
  break;
    

  case 40:
  if (yyn == 40)
    
/* Line 351 of lalr1.java  */
/* Line 442 of "inputparser.y"  */
    {
		System.out.printf("Rule 38 statement : returnStmt \n") ;
	};
  break;
    

  case 41:
  if (yyn == 41)
    
/* Line 351 of lalr1.java  */
/* Line 454 of "inputparser.y"  */
    {
		System.out.printf("Rule 39 statement : breakStmt \n") ;
	};
  break;
    

  case 42:
  if (yyn == 42)
    
/* Line 351 of lalr1.java  */
/* Line 464 of "inputparser.y"  */
    {
		System.out.printf("Rule 40 compoundStmt : '{' localDeclarations statementList '}'\n") ;
	};
  break;
    

  case 43:
  if (yyn == 43)
    
/* Line 351 of lalr1.java  */
/* Line 476 of "inputparser.y"  */
    {
		System.out.printf("Rule 41 compoundStmt : localDeclarations : localDeclarations scopedVarDeclaration  \n") ;
	};
  break;
    

  case 44:
  if (yyn == 44)
    
/* Line 351 of lalr1.java  */
/* Line 489 of "inputparser.y"  */
    {
		System.out.printf("Rule 42 compoundStmt :  /*   |    lamda   */\n") ;
	};
  break;
    

  case 45:
  if (yyn == 45)
    
/* Line 351 of lalr1.java  */
/* Line 500 of "inputparser.y"  */
    {
		System.out.printf("Rule 43 statementList : statementList statement   \n") ;
	};
  break;
    

  case 46:
  if (yyn == 46)
    
/* Line 351 of lalr1.java  */
/* Line 510 of "inputparser.y"  */
    {
		System.out.printf("Rule 44 statementList :  /* |   lamda  */ \n") ;
	};
  break;
    

  case 47:
  if (yyn == 47)
    
/* Line 351 of lalr1.java  */
/* Line 518 of "inputparser.y"  */
    {
		System.out.printf("Rule 45 expressionStmt : expression ';' \n") ;
	};
  break;
    

  case 48:
  if (yyn == 48)
    
/* Line 351 of lalr1.java  */
/* Line 529 of "inputparser.y"  */
    {
		System.out.printf("Rule 46 expressionStmt : ';' \n") ;
	};
  break;
    

  case 49:
  if (yyn == 49)
    
/* Line 351 of lalr1.java  */
/* Line 542 of "inputparser.y"  */
    {
		System.out.printf("Rule 47 selectionStmt : IF '(' simpleExpression ')' statement \n") ;
	};
  break;
    

  case 50:
  if (yyn == 50)
    
/* Line 351 of lalr1.java  */
/* Line 555 of "inputparser.y"  */
    {
		System.out.printf("Rule 48 selectionStmt : IF '(' simpleExpression ')' statement ELSE statement  \n") ;
	};
  break;
    

  case 51:
  if (yyn == 51)
    
/* Line 351 of lalr1.java  */
/* Line 567 of "inputparser.y"  */
    {
		System.out.printf("Rule 49 selectionStmt : SWITCH '(' simpleExpression ')' caseElement defaultElement END \n") ;
	};
  break;
    

  case 52:
  if (yyn == 52)
    
/* Line 351 of lalr1.java  */
/* Line 579 of "inputparser.y"  */
    {
		System.out.printf("Rule 50 selectionStmt : caseElement : CASE NUMCONST : statement ; \n") ;
	};
  break;
    

  case 53:
  if (yyn == 53)
    
/* Line 351 of lalr1.java  */
/* Line 589 of "inputparser.y"  */
    {
		System.out.printf("Rule 51 selectionStmt : caseElement CASE NUMCONST : statement ;\n") ;
	};
  break;
    

  case 54:
  if (yyn == 54)
    
/* Line 351 of lalr1.java  */
/* Line 598 of "inputparser.y"  */
    {
		System.out.printf("Rule 52 defaultElement : DEFAULT ':' statement ';'    \n") ;
	};
  break;
    

  case 55:
  if (yyn == 55)
    
/* Line 351 of lalr1.java  */
/* Line 610 of "inputparser.y"  */
    {
		System.out.printf("Rule 53 defaultElement : /*lamda     */\n") ;
	};
  break;
    

  case 56:
  if (yyn == 56)
    
/* Line 351 of lalr1.java  */
/* Line 620 of "inputparser.y"  */
    {
		System.out.printf("Rule 54 iterationStmt : WHILE '(' simpleExpression ')' statement\n") ;
	};
  break;
    

  case 57:
  if (yyn == 57)
    
/* Line 351 of lalr1.java  */
/* Line 630 of "inputparser.y"  */
    {
		System.out.printf("Rule 55  returnStmt : RETURN ';' \n") ;
	};
  break;
    

  case 58:
  if (yyn == 58)
    
/* Line 351 of lalr1.java  */
/* Line 640 of "inputparser.y"  */
    {
		System.out.printf("Rule 56  returnStmt : RETURN expression ';'\n") ;
	};
  break;
    

  case 59:
  if (yyn == 59)
    
/* Line 351 of lalr1.java  */
/* Line 652 of "inputparser.y"  */
    {
		System.out.printf("Rule 57  breakStmt : BREAK ';'\n") ;
	};
  break;
    

  case 60:
  if (yyn == 60)
    
/* Line 351 of lalr1.java  */
/* Line 667 of "inputparser.y"  */
    {
		System.out.printf("Rule 58 expression : mutable '=' expression \n") ;
	};
  break;
    

  case 61:
  if (yyn == 61)
    
/* Line 351 of lalr1.java  */
/* Line 679 of "inputparser.y"  */
    {
		System.out.printf("Rule 59 expression :mutable '+' '=' expression \n") ;
	};
  break;
    

  case 62:
  if (yyn == 62)
    
/* Line 351 of lalr1.java  */
/* Line 690 of "inputparser.y"  */
    {
		System.out.printf("Rule 60 expression : mutable '-' '=' expression \n") ;
	};
  break;
    

  case 63:
  if (yyn == 63)
    
/* Line 351 of lalr1.java  */
/* Line 703 of "inputparser.y"  */
    {
		System.out.printf("Rule 61 expression :  mutable '*' '=' expression \n") ;
	};
  break;
    

  case 64:
  if (yyn == 64)
    
/* Line 351 of lalr1.java  */
/* Line 716 of "inputparser.y"  */
    {
		System.out.printf("Rule 62 expression :  mutable '/' '=' expression \n") ;
	};
  break;
    

  case 65:
  if (yyn == 65)
    
/* Line 351 of lalr1.java  */
/* Line 728 of "inputparser.y"  */
    {
		System.out.printf("Rule 63 expression :mutable '+' '+'  \n") ;
	};
  break;
    

  case 66:
  if (yyn == 66)
    
/* Line 351 of lalr1.java  */
/* Line 741 of "inputparser.y"  */
    {
		System.out.printf("Rule 64 expression :  mutable '-' '-'  \n") ;
	};
  break;
    

  case 67:
  if (yyn == 67)
    
/* Line 351 of lalr1.java  */
/* Line 753 of "inputparser.y"  */
    {
		System.out.printf("Rule 66 expression : simpleExpression \n") ;
	};
  break;
    

  case 68:
  if (yyn == 68)
    
/* Line 351 of lalr1.java  */
/* Line 773 of "inputparser.y"  */
    {
		System.out.printf("Rule 67 simpleExpression : simpleExpression OR simpleExpression \n") ;
	};
  break;
    

  case 69:
  if (yyn == 69)
    
/* Line 351 of lalr1.java  */
/* Line 786 of "inputparser.y"  */
    {
		System.out.printf("Rule 68 simpleExpression : simpleExpression AND simpleExpression  \n") ;
	};
  break;
    

  case 70:
  if (yyn == 70)
    
/* Line 351 of lalr1.java  */
/* Line 798 of "inputparser.y"  */
    {
		System.out.printf("Rule 69 simpleExpression : simpleExpression OR ELSE simpleExpression  \n") ;
	};
  break;
    

  case 71:
  if (yyn == 71)
    
/* Line 351 of lalr1.java  */
/* Line 810 of "inputparser.y"  */
    {
		System.out.printf("Rule 70 simpleExpression : simpleExpression AND THEN simpleExpression  \n") ;
	};
  break;
    

  case 72:
  if (yyn == 72)
    
/* Line 351 of lalr1.java  */
/* Line 820 of "inputparser.y"  */
    {
		System.out.printf("Rule 71 simpleExpression :NOT simpleExpression \n") ;
	};
  break;
    

  case 73:
  if (yyn == 73)
    
/* Line 351 of lalr1.java  */
/* Line 830 of "inputparser.y"  */
    {
		System.out.printf("Rule 72 simpleExpression : relExpression \n") ;
	};
  break;
    

  case 74:
  if (yyn == 74)
    
/* Line 351 of lalr1.java  */
/* Line 841 of "inputparser.y"  */
    {
		System.out.printf("Rule 73 relExpression : mathlogicExpression relop mathlogicExpression \n") ;
	};
  break;
    

  case 75:
  if (yyn == 75)
    
/* Line 351 of lalr1.java  */
/* Line 851 of "inputparser.y"  */
    {
		System.out.printf("Rule 74 relExpression : mathlogicExpression\n") ;
	};
  break;
    

  case 76:
  if (yyn == 76)
    
/* Line 351 of lalr1.java  */
/* Line 867 of "inputparser.y"  */
    {
		System.out.printf("Rule 75 relop : less_equal \n") ;
	};
  break;
    

  case 77:
  if (yyn == 77)
    
/* Line 351 of lalr1.java  */
/* Line 880 of "inputparser.y"  */
    {
		System.out.printf("Rule 76 relop : less_than \n") ;
	};
  break;
    

  case 78:
  if (yyn == 78)
    
/* Line 351 of lalr1.java  */
/* Line 890 of "inputparser.y"  */
    {
		System.out.printf("Rule 77 relop : greater_than \n") ;
	};
  break;
    

  case 79:
  if (yyn == 79)
    
/* Line 351 of lalr1.java  */
/* Line 901 of "inputparser.y"  */
    {
		System.out.printf("Rule 78 relop : greater_equal \n") ;
	};
  break;
    

  case 80:
  if (yyn == 80)
    
/* Line 351 of lalr1.java  */
/* Line 912 of "inputparser.y"  */
    {
		System.out.printf("Rule 79 relop : equal \n") ;
	};
  break;
    

  case 81:
  if (yyn == 81)
    
/* Line 351 of lalr1.java  */
/* Line 923 of "inputparser.y"  */
    {
		System.out.printf("Rule 80 relop : not_equal \n") ;
	};
  break;
    

  case 82:
  if (yyn == 82)
    
/* Line 351 of lalr1.java  */
/* Line 932 of "inputparser.y"  */
    {
		System.out.printf("Rule 81 mathlogicExpression : mathlogicExpression mathop mathlogicExpression   \n") ;
	};
  break;
    

  case 83:
  if (yyn == 83)
    
/* Line 351 of lalr1.java  */
/* Line 941 of "inputparser.y"  */
    {
		System.out.printf("Rule 82 mathlogicExpression : unaryExpression\n") ;
	};
  break;
    

  case 84:
  if (yyn == 84)
    
/* Line 351 of lalr1.java  */
/* Line 951 of "inputparser.y"  */
    {
		System.out.printf("Rule 83 mathop : '+'  \n") ;
	};
  break;
    

  case 85:
  if (yyn == 85)
    
/* Line 351 of lalr1.java  */
/* Line 962 of "inputparser.y"  */
    {
		System.out.printf("Rule 84 mathop : '-'  \n") ;
	};
  break;
    

  case 86:
  if (yyn == 86)
    
/* Line 351 of lalr1.java  */
/* Line 973 of "inputparser.y"  */
    {
		System.out.printf("Rule 85 mathop : '*'  \n") ;
	};
  break;
    

  case 87:
  if (yyn == 87)
    
/* Line 351 of lalr1.java  */
/* Line 984 of "inputparser.y"  */
    {
		System.out.printf("Rule 86 mathop : '/'  \n") ;
	};
  break;
    

  case 88:
  if (yyn == 88)
    
/* Line 351 of lalr1.java  */
/* Line 996 of "inputparser.y"  */
    {
		System.out.printf("Rule 87 mathop : '%'  \n") ;
	};
  break;
    

  case 89:
  if (yyn == 89)
    
/* Line 351 of lalr1.java  */
/* Line 1015 of "inputparser.y"  */
    {
		System.out.printf("Rule 88 unaryExpression : unaryop unaryExpression  \n") ;
	};
  break;
    

  case 90:
  if (yyn == 90)
    
/* Line 351 of lalr1.java  */
/* Line 1028 of "inputparser.y"  */
    {
		System.out.printf("Rule 89 unaryExpression : factor  \n") ;
	};
  break;
    

  case 91:
  if (yyn == 91)
    
/* Line 351 of lalr1.java  */
/* Line 1047 of "inputparser.y"  */
    {
		System.out.printf("Rule 90 unaryop : '-'   \n") ;
	};
  break;
    

  case 92:
  if (yyn == 92)
    
/* Line 351 of lalr1.java  */
/* Line 1060 of "inputparser.y"  */
    {
		System.out.printf("Rule 91 unaryop : '*'  \n") ;
	};
  break;
    

  case 93:
  if (yyn == 93)
    
/* Line 351 of lalr1.java  */
/* Line 1073 of "inputparser.y"  */
    {
		System.out.printf("Rule 92 unaryop : '?'  \n") ;
	};
  break;
    

  case 94:
  if (yyn == 94)
    
/* Line 351 of lalr1.java  */
/* Line 1084 of "inputparser.y"  */
    {
		System.out.printf("Rule 93 factor : immutable   \n") ;
	};
  break;
    

  case 95:
  if (yyn == 95)
    
/* Line 351 of lalr1.java  */
/* Line 1096 of "inputparser.y"  */
    {
		System.out.printf("Rule 94 factor : mutable   \n") ;
	};
  break;
    

  case 96:
  if (yyn == 96)
    
/* Line 351 of lalr1.java  */
/* Line 1109 of "inputparser.y"  */
    {
		System.out.printf("Rule 95 mutable : ID  \n") ;
	};
  break;
    

  case 97:
  if (yyn == 97)
    
/* Line 351 of lalr1.java  */
/* Line 1121 of "inputparser.y"  */
    {
		System.out.printf("Rule 96 mutable : mutable '[' expression ']'  \n") ;
	};
  break;
    

  case 98:
  if (yyn == 98)
    
/* Line 351 of lalr1.java  */
/* Line 1132 of "inputparser.y"  */
    {
		System.out.printf("Rule 97 mutable :  mutable '.' ID  \n") ;
	};
  break;
    

  case 99:
  if (yyn == 99)
    
/* Line 351 of lalr1.java  */
/* Line 1147 of "inputparser.y"  */
    {
		System.out.printf("Rule 98 immutable : '(' expression ')' \n") ;
	};
  break;
    

  case 100:
  if (yyn == 100)
    
/* Line 351 of lalr1.java  */
/* Line 1158 of "inputparser.y"  */
    {
		System.out.printf("Rule 99 immutable : call \n") ;
	};
  break;
    

  case 101:
  if (yyn == 101)
    
/* Line 351 of lalr1.java  */
/* Line 1172 of "inputparser.y"  */
    {
		System.out.printf("Rule 100 immutable : constant \n") ;
	};
  break;
    

  case 102:
  if (yyn == 102)
    
/* Line 351 of lalr1.java  */
/* Line 1187 of "inputparser.y"  */
    {
		System.out.printf("Rule 101 call : ID '(' args ')' \n") ;
	};
  break;
    

  case 103:
  if (yyn == 103)
    
/* Line 351 of lalr1.java  */
/* Line 1203 of "inputparser.y"  */
    {
		System.out.printf("Rule 102 args : argList  \n") ;
	};
  break;
    

  case 104:
  if (yyn == 104)
    
/* Line 351 of lalr1.java  */
/* Line 1215 of "inputparser.y"  */
    {
		System.out.printf("Rule 103 args : /* | lamda    */  \n") ;
	};
  break;
    

  case 105:
  if (yyn == 105)
    
/* Line 351 of lalr1.java  */
/* Line 1226 of "inputparser.y"  */
    {
		System.out.printf("Rule 104 argList : argList ',' expression \n") ;
	};
  break;
    

  case 106:
  if (yyn == 106)
    
/* Line 351 of lalr1.java  */
/* Line 1243 of "inputparser.y"  */
    {
		System.out.printf("Rule 105 argList : expression \n") ;
	};
  break;
    

  case 107:
  if (yyn == 107)
    
/* Line 351 of lalr1.java  */
/* Line 1255 of "inputparser.y"  */
    {
		System.out.printf("Rule 105  constant : NUMCONST  \n") ;
	};
  break;
    

  case 108:
  if (yyn == 108)
    
/* Line 351 of lalr1.java  */
/* Line 1265 of "inputparser.y"  */
    {
		System.out.printf("Rule 105  constant : Real_const  \n") ;
	};
  break;
    

  case 109:
  if (yyn == 109)
    
/* Line 351 of lalr1.java  */
/* Line 1278 of "inputparser.y"  */
    {
		System.out.printf("Rule 105  constant : CHARCONST  \n") ;
	};
  break;
    

  case 110:
  if (yyn == 110)
    
/* Line 351 of lalr1.java  */
/* Line 1290 of "inputparser.y"  */
    {
		System.out.printf("Rule 105  constant : BoolConst  \n") ;
	};
  break;
    



/* Line 351 of lalr1.java  */
/* Line 1585 of "inputparser.java"  */
	default: break;
      }

    yy_symbol_print ("-> $$ =", yyr1_[yyn], yyval);

    yystack.pop (yylen);
    yylen = 0;

    /* Shift the result of the reduction.  */
    yyn = yyr1_[yyn];
    int yystate = yypgoto_[yyn - yyntokens_] + yystack.stateAt (0);
    if (0 <= yystate && yystate <= yylast_
	&& yycheck_[yystate] == yystack.stateAt (0))
      yystate = yytable_[yystate];
    else
      yystate = yydefgoto_[yyn - yyntokens_];

    yystack.push (yystate, yyval);
    return YYNEWSTATE;
  }

  /* Return YYSTR after stripping away unnecessary quotes and
     backslashes, so that it's suitable for yyerror.  The heuristic is
     that double-quoting is unnecessary unless the string contains an
     apostrophe, a comma, or backslash (other than backslash-backslash).
     YYSTR is taken from yytname.  */
  private final String yytnamerr_ (String yystr)
  {
    if (yystr.charAt (0) == '"')
      {
        StringBuffer yyr = new StringBuffer ();
        strip_quotes: for (int i = 1; i < yystr.length (); i++)
          switch (yystr.charAt (i))
            {
            case '\'':
            case ',':
              break strip_quotes;

            case '\\':
	      if (yystr.charAt(++i) != '\\')
                break strip_quotes;
              /* Fall through.  */
            default:
              yyr.append (yystr.charAt (i));
              break;

            case '"':
              return yyr.toString ();
            }
      }
    else if (yystr.equals ("$end"))
      return "end of input";

    return yystr;
  }

  /*--------------------------------.
  | Print this symbol on YYOUTPUT.  |
  `--------------------------------*/

  private void yy_symbol_print (String s, int yytype,
			         Object yyvaluep				 )
  {
    if (yydebug > 0)
    yycdebug (s + (yytype < yyntokens_ ? " token " : " nterm ")
	      + yytname_[yytype] + " ("
	      + (yyvaluep == null ? "(null)" : yyvaluep.toString ()) + ")");
  }

  /**
   * Parse input from the scanner that was specified at object construction
   * time.  Return whether the end of the input was reached successfully.
   *
   * @return <tt>true</tt> if the parsing succeeds.  Note that this does not
   *          imply that there were no syntax errors.
   */
  public boolean parse () throws java.io.IOException
  {
    /// Lookahead and lookahead in internal form.
    int yychar = yyempty_;
    int yytoken = 0;

    /* State.  */
    int yyn = 0;
    int yylen = 0;
    int yystate = 0;

    YYStack yystack = new YYStack ();

    /* Error handling.  */
    int yynerrs_ = 0;
    

    /// Semantic value of the lookahead.
    Object yylval = null;

    int yyresult;

    yycdebug ("Starting parse\n");
    yyerrstatus_ = 0;


    /* Initialize the stack.  */
    yystack.push (yystate, yylval);

    int label = YYNEWSTATE;
    for (;;)
      switch (label)
      {
        /* New state.  Unlike in the C/C++ skeletons, the state is already
	   pushed when we come here.  */
      case YYNEWSTATE:
        yycdebug ("Entering state " + yystate + "\n");
        if (yydebug > 0)
          yystack.print (yyDebugStream);

        /* Accept?  */
        if (yystate == yyfinal_)
          return true;

        /* Take a decision.  First try without lookahead.  */
        yyn = yypact_[yystate];
        if (yy_pact_value_is_default_ (yyn))
          {
            label = YYDEFAULT;
	    break;
          }

        /* Read a lookahead token.  */
        if (yychar == yyempty_)
          {
	    yycdebug ("Reading a token: ");
	    yychar = yylex ();
            
            yylval = yylexer.getLVal ();
          }

        /* Convert token to internal form.  */
        if (yychar <= EOF)
          {
	    yychar = yytoken = EOF;
	    yycdebug ("Now at end of input.\n");
          }
        else
          {
	    yytoken = yytranslate_ (yychar);
	    yy_symbol_print ("Next token is", yytoken,
			     yylval);
          }

        /* If the proper action on seeing token YYTOKEN is to reduce or to
           detect an error, take that action.  */
        yyn += yytoken;
        if (yyn < 0 || yylast_ < yyn || yycheck_[yyn] != yytoken)
          label = YYDEFAULT;

        /* <= 0 means reduce or error.  */
        else if ((yyn = yytable_[yyn]) <= 0)
          {
	    if (yy_table_value_is_error_ (yyn))
	      label = YYERRLAB;
	    else
	      {
	        yyn = -yyn;
	        label = YYREDUCE;
	      }
          }

        else
          {
            /* Shift the lookahead token.  */
	    yy_symbol_print ("Shifting", yytoken,
			     yylval);

            /* Discard the token being shifted.  */
            yychar = yyempty_;

            /* Count tokens shifted since error; after three, turn off error
               status.  */
            if (yyerrstatus_ > 0)
              --yyerrstatus_;

            yystate = yyn;
            yystack.push (yystate, yylval);
            label = YYNEWSTATE;
          }
        break;

      /*-----------------------------------------------------------.
      | yydefault -- do the default action for the current state.  |
      `-----------------------------------------------------------*/
      case YYDEFAULT:
        yyn = yydefact_[yystate];
        if (yyn == 0)
          label = YYERRLAB;
        else
          label = YYREDUCE;
        break;

      /*-----------------------------.
      | yyreduce -- Do a reduction.  |
      `-----------------------------*/
      case YYREDUCE:
        yylen = yyr2_[yyn];
        label = yyaction (yyn, yystack, yylen);
	yystate = yystack.stateAt (0);
        break;

      /*------------------------------------.
      | yyerrlab -- here on detecting error |
      `------------------------------------*/
      case YYERRLAB:
        /* If not already recovering from an error, report this error.  */
        if (yyerrstatus_ == 0)
          {
            ++yynerrs_;
            if (yychar == yyempty_)
              yytoken = yyempty_;
            yyerror (yysyntax_error (yystate, yytoken));
          }

        
        if (yyerrstatus_ == 3)
          {
	    /* If just tried and failed to reuse lookahead token after an
	     error, discard it.  */

	    if (yychar <= EOF)
	      {
	      /* Return failure if at end of input.  */
	      if (yychar == EOF)
	        return false;
	      }
	    else
	      yychar = yyempty_;
          }

        /* Else will try to reuse lookahead token after shifting the error
           token.  */
        label = YYERRLAB1;
        break;

      /*---------------------------------------------------.
      | errorlab -- error raised explicitly by YYERROR.  |
      `---------------------------------------------------*/
      case YYERROR:

        
        /* Do not reclaim the symbols of the rule which action triggered
           this YYERROR.  */
        yystack.pop (yylen);
        yylen = 0;
        yystate = yystack.stateAt (0);
        label = YYERRLAB1;
        break;

      /*-------------------------------------------------------------.
      | yyerrlab1 -- common code for both syntax error and YYERROR.  |
      `-------------------------------------------------------------*/
      case YYERRLAB1:
        yyerrstatus_ = 3;	/* Each real token shifted decrements this.  */

        for (;;)
          {
	    yyn = yypact_[yystate];
	    if (!yy_pact_value_is_default_ (yyn))
	      {
	        yyn += yyterror_;
	        if (0 <= yyn && yyn <= yylast_ && yycheck_[yyn] == yyterror_)
	          {
	            yyn = yytable_[yyn];
	            if (0 < yyn)
		      break;
	          }
	      }

	    /* Pop the current state because it cannot handle the error token.  */
	    if (yystack.height == 1)
	      return false;

	    
	    yystack.pop ();
	    yystate = yystack.stateAt (0);
	    if (yydebug > 0)
	      yystack.print (yyDebugStream);
          }

	

        /* Shift the error token.  */
        yy_symbol_print ("Shifting", yystos_[yyn],
			 yylval);

        yystate = yyn;
	yystack.push (yyn, yylval);
        label = YYNEWSTATE;
        break;

        /* Accept.  */
      case YYACCEPT:
        return true;

        /* Abort.  */
      case YYABORT:
        return false;
      }
  }

  // Generate an error message.
  private String yysyntax_error (int yystate, int tok)
  {
    if (errorVerbose)
      {
        /* There are many possibilities here to consider:
           - Assume YYFAIL is not used.  It's too flawed to consider.
             See
             <http://lists.gnu.org/archive/html/bison-patches/2009-12/msg00024.html>
             for details.  YYERROR is fine as it does not invoke this
             function.
           - If this state is a consistent state with a default action,
             then the only way this function was invoked is if the
             default action is an error action.  In that case, don't
             check for expected tokens because there are none.
           - The only way there can be no lookahead present (in tok) is
             if this state is a consistent state with a default action.
             Thus, detecting the absence of a lookahead is sufficient to
             determine that there is no unexpected or expected token to
             report.  In that case, just report a simple "syntax error".
           - Don't assume there isn't a lookahead just because this
             state is a consistent state with a default action.  There
             might have been a previous inconsistent state, consistent
             state with a non-default action, or user semantic action
             that manipulated yychar.  (However, yychar is currently out
             of scope during semantic actions.)
           - Of course, the expected token list depends on states to
             have correct lookahead information, and it depends on the
             parser not to perform extra reductions after fetching a
             lookahead from the scanner and before detecting a syntax
             error.  Thus, state merging (from LALR or IELR) and default
             reductions corrupt the expected token list.  However, the
             list is correct for canonical LR with one exception: it
             will still contain any token that will not be accepted due
             to an error action in a later state.
        */
        if (tok != yyempty_)
          {
            // FIXME: This method of building the message is not compatible
            // with internationalization.
            StringBuffer res =
              new StringBuffer ("syntax error, unexpected ");
            res.append (yytnamerr_ (yytname_[tok]));
            int yyn = yypact_[yystate];
            if (!yy_pact_value_is_default_ (yyn))
              {
                /* Start YYX at -YYN if negative to avoid negative
                   indexes in YYCHECK.  In other words, skip the first
                   -YYN actions for this state because they are default
                   actions.  */
                int yyxbegin = yyn < 0 ? -yyn : 0;
                /* Stay within bounds of both yycheck and yytname.  */
                int yychecklim = yylast_ - yyn + 1;
                int yyxend = yychecklim < yyntokens_ ? yychecklim : yyntokens_;
                int count = 0;
                for (int x = yyxbegin; x < yyxend; ++x)
                  if (yycheck_[x + yyn] == x && x != yyterror_
                      && !yy_table_value_is_error_ (yytable_[x + yyn]))
                    ++count;
                if (count < 5)
                  {
                    count = 0;
                    for (int x = yyxbegin; x < yyxend; ++x)
                      if (yycheck_[x + yyn] == x && x != yyterror_
                          && !yy_table_value_is_error_ (yytable_[x + yyn]))
                        {
                          res.append (count++ == 0 ? ", expecting " : " or ");
                          res.append (yytnamerr_ (yytname_[x]));
                        }
                  }
              }
            return res.toString ();
          }
      }

    return "syntax error";
  }

  /**
   * Whether the given <code>yypact_</code> value indicates a defaulted state.
   * @param yyvalue   the value to check
   */
  private static boolean yy_pact_value_is_default_ (int yyvalue)
  {
    return yyvalue == yypact_ninf_;
  }

  /**
   * Whether the given <code>yytable_</code> value indicates a syntax error.
   * @param yyvalue   the value to check
   */
  private static boolean yy_table_value_is_error_ (int yyvalue)
  {
    return yyvalue == yytable_ninf_;
  }

  /* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
     STATE-NUM.  */
  private static final short yypact_ninf_ = -63;
  private static final short yypact_[] =
  {
       146,   -10,   -63,   -63,   -63,   -63,   -43,    36,   146,   -63,
     -63,   -63,    -8,   -63,   -63,    -9,    16,   -63,   -63,   -47,
     -49,   -63,   -12,   -63,    -2,    -7,    -3,   -63,     6,    16,
     -63,     8,   204,   100,     5,    12,   -63,   144,    75,    13,
       9,    22,   -63,   -63,   -63,   204,   -63,     7,   -63,   204,
     -63,   -63,   -63,    -4,   -63,   283,   -63,   214,   -63,   -60,
     -63,   -63,   -63,    75,   -63,   -63,     8,   -63,    26,    -2,
      21,    29,    30,    11,    37,   -63,   -63,   -63,   -63,   -63,
     -63,   -63,   -63,   -63,    48,    -4,   152,   -63,   -63,   144,
      -4,   204,    51,   178,   185,   -63,   -63,   -63,   -63,   -63,
     -63,   -63,   -63,   -63,   -63,   -63,   214,   214,   -63,   204,
      66,   -63,   -33,   -63,   -63,   204,   204,   204,   -63,    62,
     -63,   154,   -63,   204,   -37,   -44,    58,    60,   -63,   -63,
      63,    67,   -63,   204,    -4,   204,    -4,   -31,   -31,    69,
     -63,   -63,   -22,   -18,   -14,   -63,    98,   -63,   204,   -63,
     204,   -63,   204,   204,   -63,   204,    -4,    -4,   -63,   144,
     104,   144,   -63,   -63,   -63,   -63,   -63,   -63,   -63,   108,
      89,     3,   -63,   144,    80,    91,    82,   116,   -63,   144,
      85,   144,   -63,    92,   144,    93,   -63,    95,   -63,   -63
  };

  /* YYDEFACT[S] -- default reduction number in state S.  Performed when
     YYTABLE doesn't specify something else to do.  Zero means the
     default is an error.  */
  private static final byte yydefact_[] =
  {
         0,     0,    21,    22,    23,    24,     0,     0,     2,     4,
       7,     5,     0,    19,     6,     0,    20,     1,     3,    15,
       0,    12,    13,    44,     0,     0,    27,    30,     0,    20,
       9,     0,     0,    20,    34,    31,    33,     0,    20,     0,
       0,    15,    11,   108,   110,     0,   107,    96,   109,     0,
      91,    92,    93,    14,    73,    75,    83,     0,    90,    95,
      94,   100,   101,    20,     8,    43,     0,    18,     0,     0,
       0,     0,     0,     0,     0,    44,    48,    26,    37,    36,
      38,    39,    40,    41,     0,    67,    95,    29,    16,     0,
      72,   104,     0,     0,     0,    78,    79,    81,    80,    76,
      77,    84,    85,    86,    87,    88,     0,     0,    89,     0,
       0,    17,     0,    35,    32,     0,     0,     0,    57,     0,
      59,    46,    47,     0,     0,     0,     0,     0,    25,   106,
       0,   103,    99,     0,    68,     0,    69,    74,    82,     0,
      98,    10,     0,     0,     0,    58,     0,    60,     0,    65,
       0,    66,     0,     0,   102,     0,    70,    71,    97,     0,
       0,     0,    42,    45,    61,    62,    63,    64,   105,    49,
       0,    55,    56,     0,     0,     0,     0,     0,    50,     0,
       0,     0,    51,     0,     0,     0,    52,     0,    54,    53
  };

  /* YYPGOTO[NTERM-NUM].  */
  private static final short yypgoto_[] =
  {
       -63,   -63,   -63,   142,   -63,   -63,   -63,    96,   130,   -63,
     -63,     0,   -63,   -63,   134,   -63,   127,   -63,    97,   -62,
     -63,    99,   -63,   -63,   -63,   -63,   -63,   -63,   -63,   -63,
     -48,   -23,   -63,   -63,   -59,   -63,   110,   -63,   -63,   -27,
     -63,   -63,   -63,   -63,   -63
  };

  /* YYDEFGOTO[NTERM-NUM].  */
  private static final short
  yydefgoto_[] =
  {
        -1,     7,     8,     9,    10,    11,    65,    20,    21,    22,
      66,    24,    13,    14,    25,    26,    27,    35,    36,    77,
      78,    33,   146,    79,    80,   171,   177,    81,    82,    83,
      84,    85,    54,   106,    55,   107,    56,    57,    58,    86,
      60,    61,   130,   131,    62
  };

  /* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
     positive, shift that token.  If negative, reduce the rule which
     number is the opposite.  If YYTABLE_NINF_, syntax error.  */
  private static final short yytable_ninf_ = -29;
  private static final short
  yytable_[] =
  {
        12,    92,    93,    94,   109,    59,    93,    94,    12,    53,
      93,    94,    30,    31,    43,   110,    44,    28,    59,    29,
      93,    94,    90,    16,   150,   119,   151,   128,   141,    31,
      59,   148,   149,    67,   175,   176,    17,    45,   101,   102,
     103,   104,   105,   129,    15,   159,    19,   137,   138,   160,
      23,    32,    34,   161,     2,     3,     4,     5,    38,    39,
      37,   139,    41,   111,    46,    47,    59,    59,    48,    68,
     134,   136,   118,    91,    69,   147,    89,    49,    88,    59,
      59,    50,    51,   -28,   163,    52,    28,   115,    59,    59,
      59,   113,   142,   143,   144,   116,   117,   169,   120,   172,
     164,    43,   165,    44,   166,   167,    59,   168,    59,   122,
     156,   178,   157,     2,     3,     4,     5,   183,   132,   185,
     140,    67,   187,   145,    45,    70,   152,    71,   153,   155,
     154,    72,    73,    74,   158,   170,   173,    63,     2,     3,
       4,     5,   174,   179,   180,   181,   182,    43,   184,    44,
      18,    46,    47,   186,   188,    48,   189,    75,   162,    76,
      64,    42,   112,    40,    49,    87,   114,   108,    50,    51,
      45,    70,    52,    71,   121,     0,     0,    72,    73,    74,
       0,    43,     1,    44,     2,     3,     4,     5,    43,     0,
      44,    63,     2,     3,     4,     5,     0,    46,    47,     0,
       6,    48,     0,    75,    45,    76,   133,    43,   -20,    44,
      49,    45,     0,     0,    50,    51,   109,    43,    52,    44,
     123,   124,   125,   126,   127,     0,     0,   110,     0,     0,
      45,    46,    47,     0,     0,    48,     0,     0,    46,    47,
       0,     0,    48,   135,    49,     0,     0,     0,    50,    51,
       0,    49,    52,     0,     0,    50,    51,    46,    47,    52,
       0,    48,     0,     0,     0,     0,     0,    46,    47,     0,
      49,    48,     0,     0,    50,    51,     0,     0,    52,     0,
      49,     0,     0,     0,    50,    51,     0,     0,    52,    95,
      96,    97,    98,    99,   100,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,   101,   102,   103,   104,   105
  };

  /* YYCHECK.  */
  private static final short
  yycheck_[] =
  {
         0,    49,    24,    25,    64,    32,    24,    25,     8,    32,
      24,    25,    61,    62,     3,    75,     5,    64,    45,    66,
      24,    25,    45,    66,    68,    73,    70,    89,    61,    62,
      57,    68,    69,    33,    31,    32,     0,    26,    69,    70,
      71,    72,    73,    91,    54,    67,    54,   106,   107,    67,
      59,    63,    54,    67,    38,    39,    40,    41,    61,    53,
      67,   109,    54,    63,    53,    54,    93,    94,    57,    64,
      93,    94,    61,    66,    62,   123,    67,    66,    65,   106,
     107,    70,    71,    67,   146,    74,    64,    66,   115,   116,
     117,    65,   115,   116,   117,    66,    66,   159,    61,   161,
     148,     3,   150,     5,   152,   153,   133,   155,   135,    61,
     133,   173,   135,    38,    39,    40,    41,   179,    67,   181,
      54,   121,   184,    61,    26,    27,    68,    29,    68,    62,
      67,    33,    34,    35,    65,    31,    28,    37,    38,    39,
      40,    41,    53,    63,    53,    63,    30,     3,    63,     5,
       8,    53,    54,    61,    61,    57,    61,    59,    60,    61,
      60,    31,    66,    29,    66,    38,    69,    57,    70,    71,
      26,    27,    74,    29,    75,    -1,    -1,    33,    34,    35,
      -1,     3,    36,     5,    38,    39,    40,    41,     3,    -1,
       5,    37,    38,    39,    40,    41,    -1,    53,    54,    -1,
      54,    57,    -1,    59,    26,    61,    28,     3,    54,     5,
      66,    26,    -1,    -1,    70,    71,    64,     3,    74,     5,
      68,    69,    70,    71,    72,    -1,    -1,    75,    -1,    -1,
      26,    53,    54,    -1,    -1,    57,    -1,    -1,    53,    54,
      -1,    -1,    57,    58,    66,    -1,    -1,    -1,    70,    71,
      -1,    66,    74,    -1,    -1,    70,    71,    53,    54,    74,
      -1,    57,    -1,    -1,    -1,    -1,    -1,    53,    54,    -1,
      66,    57,    -1,    -1,    70,    71,    -1,    -1,    74,    -1,
      66,    -1,    -1,    -1,    70,    71,    -1,    -1,    74,     6,
       7,     8,     9,    10,    11,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    69,    70,    71,    72,    73
  };

  /* STOS_[STATE-NUM] -- The (internal number of the) accessing
     symbol of state STATE-NUM.  */
  private static final byte
  yystos_[] =
  {
         0,    36,    38,    39,    40,    41,    54,    77,    78,    79,
      80,    81,    87,    88,    89,    54,    66,     0,    79,    54,
      83,    84,    85,    59,    87,    90,    91,    92,    64,    66,
      61,    62,    63,    97,    54,    93,    94,    67,    61,    53,
      90,    54,    84,     3,     5,    26,    53,    54,    57,    66,
      70,    71,    74,   107,   108,   110,   112,   113,   114,   115,
     116,   117,   120,    37,    60,    82,    86,    87,    64,    62,
      27,    29,    33,    34,    35,    59,    61,    95,    96,    99,
     100,   103,   104,   105,   106,   107,   115,    92,    65,    67,
     107,    66,   106,    24,    25,     6,     7,     8,     9,    10,
      11,    69,    70,    71,    72,    73,   109,   111,   112,    64,
      75,    87,    83,    65,    94,    66,    66,    66,    61,   106,
      61,    97,    61,    68,    69,    70,    71,    72,    95,   106,
     118,   119,    67,    28,   107,    58,   107,   110,   110,   106,
      54,    61,   107,   107,   107,    61,    98,   106,    68,    69,
      68,    70,    68,    68,    67,    62,   107,   107,    65,    67,
      67,    67,    60,    95,   106,   106,   106,   106,   106,    95,
      31,   101,    95,    28,    53,    31,    32,   102,    95,    63,
      53,    63,    30,    95,    63,    95,    61,    95,    61,    61
  };

  /* TOKEN_NUMBER_[YYLEX-NUM] -- Internal symbol number corresponding
     to YYLEX-NUM.  */
  private static final short
  yytoken_number_[] =
  {
         0,   256,   257,   258,   259,   260,   261,   262,   263,   264,
     265,   266,   267,   268,   269,   270,   271,   272,   273,   274,
     275,   276,   277,   278,   279,   280,   281,   282,   283,   284,
     285,   286,   287,   288,   289,   290,   291,   292,   293,   294,
     295,   296,   297,   298,   299,   300,   301,   302,   303,   304,
     305,   306,   307,   308,   309,   310,   311,   312,   313,   123,
     125,    59,    44,    58,    91,    93,    40,    41,    61,    43,
      45,    42,    47,    37,    63,    46
  };

  /* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
  private static final byte
  yyr1_[] =
  {
         0,    76,    77,    78,    78,    79,    79,    79,    80,    81,
      82,    83,    83,    84,    84,    85,    85,    86,    86,    87,
      87,    88,    88,    88,    88,    89,    89,    90,    90,    91,
      91,    92,    93,    93,    94,    94,    95,    95,    95,    95,
      95,    95,    96,    97,    97,    98,    98,    99,    99,   100,
     100,   100,   101,   101,   102,   102,   103,   104,   104,   105,
     106,   106,   106,   106,   106,   106,   106,   106,   107,   107,
     107,   107,   107,   107,   108,   108,   109,   109,   109,   109,
     109,   109,   110,   110,   111,   111,   111,   111,   111,   112,
     112,   113,   113,   113,   114,   114,   115,   115,   115,   116,
     116,   116,   117,   118,   118,   119,   119,   120,   120,   120,
     120
  };

  /* YYR2[YYN] -- Number of symbols composing right hand side of rule YYN.  */
  private static final byte
  yyr2_[] =
  {
         0,     2,     1,     2,     1,     1,     1,     1,     5,     3,
       3,     3,     1,     1,     3,     1,     4,     2,     1,     1,
       0,     1,     1,     1,     1,     6,     5,     1,     0,     3,
       1,     2,     3,     1,     1,     3,     1,     1,     1,     1,
       1,     1,     4,     2,     0,     2,     0,     2,     1,     5,
       7,     7,     5,     6,     4,     0,     5,     2,     3,     2,
       3,     4,     4,     4,     4,     3,     3,     1,     3,     3,
       4,     4,     2,     1,     3,     1,     1,     1,     1,     1,
       1,     1,     3,     1,     1,     1,     1,     1,     1,     2,
       1,     1,     1,     1,     1,     1,     1,     4,     3,     3,
       1,     1,     4,     1,     0,     3,     1,     1,     1,     1,
       1
  };

  /* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
     First, the terminals, then, starting at \a yyntokens_, nonterminals.  */
  private static final String yytname_[] =
  {
    "$end", "error", "$undefined", "Real_const", "number_error",
  "BoolConst", "greater_than", "greater_equal", "not_equal", "equal",
  "less_equal", "less_than", "square_bracket_left", "square_bracket_right",
  "curly_brace_left", "curly_brace_right", "parenthesis_left",
  "parenthesis_right", "semicolon", "comma", "colon", "dot", "AND_THEN",
  "OR_ELSE", "OR", "AND", "NOT", "IF", "ELSE", "SWITCH", "END", "CASE",
  "DEFAULT", "WHILE", "RETURN", "BREAK", "RECORD", "Static", "INT", "REAL",
  "BOOL", "CHAR", "plus_assign", "minus_assign", "multiply_assign",
  "divide_assign", "question_mark", "modulo", "division", "multiply",
  "minus", "plus", "assignment", "NUMCONST", "ID", "Fake_id", "WhiteSpace",
  "CHARCONST", "THEN", "'{'", "'}'", "';'", "','", "':'", "'['", "']'",
  "'('", "')'", "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'?'", "'.'",
  "$accept", "program", "declarationList", "declaration", "recDeclaration",
  "varDeclaration", "scopedVarDeclaration", "varDeclList",
  "varDeclInitialize", "varDeclId", "scopedTypeSpecifier", "typeSpecifier",
  "returnTypeSpecifier", "funDeclaration", "params", "paramList",
  "paramTypeList", "paramIdList", "paramId", "statement", "compoundStmt",
  "localDeclarations", "statementList", "expressionStmt", "selectionStmt",
  "caseElement", "defaultElement", "iterationStmt", "returnStmt",
  "breakStmt", "expression", "simpleExpression", "relExpression", "relop",
  "mathlogicExpression", "mathop", "unaryExpression", "unaryop", "factor",
  "mutable", "immutable", "call", "args", "argList", "constant", null
  };

  /* YYRHS -- A `-1'-separated list of the rules' RHS.  */
  private static final byte yyrhs_[] =
  {
        77,     0,    -1,    78,    -1,    78,    79,    -1,    79,    -1,
      81,    -1,    89,    -1,    80,    -1,    36,    54,    59,    97,
      60,    -1,    87,    83,    61,    -1,    86,    83,    61,    -1,
      83,    62,    84,    -1,    84,    -1,    85,    -1,    85,    63,
     107,    -1,    54,    -1,    54,    64,    53,    65,    -1,    37,
      87,    -1,    87,    -1,    88,    -1,    -1,    38,    -1,    39,
      -1,    40,    -1,    41,    -1,    87,    54,    66,    90,    67,
      95,    -1,    54,    66,    90,    67,    95,    -1,    91,    -1,
      -1,    91,    61,    92,    -1,    92,    -1,    87,    93,    -1,
      93,    62,    94,    -1,    94,    -1,    54,    -1,    54,    64,
      65,    -1,    99,    -1,    96,    -1,   100,    -1,   103,    -1,
     104,    -1,   105,    -1,    59,    97,    98,    60,    -1,    97,
      82,    -1,    -1,    98,    95,    -1,    -1,   106,    61,    -1,
      61,    -1,    27,    66,   107,    67,    95,    -1,    27,    66,
     107,    67,    95,    28,    95,    -1,    29,    66,   107,    67,
     101,   102,    30,    -1,    31,    53,    63,    95,    61,    -1,
     101,    31,    53,    63,    95,    61,    -1,    32,    63,    95,
      61,    -1,    -1,    33,    66,   107,    67,    95,    -1,    34,
      61,    -1,    34,   106,    61,    -1,    35,    61,    -1,   115,
      68,   106,    -1,   115,    69,    68,   106,    -1,   115,    70,
      68,   106,    -1,   115,    71,    68,   106,    -1,   115,    72,
      68,   106,    -1,   115,    69,    69,    -1,   115,    70,    70,
      -1,   107,    -1,   107,    24,   107,    -1,   107,    25,   107,
      -1,   107,    24,    28,   107,    -1,   107,    25,    58,   107,
      -1,    26,   107,    -1,   108,    -1,   110,   109,   110,    -1,
     110,    -1,    10,    -1,    11,    -1,     6,    -1,     7,    -1,
       9,    -1,     8,    -1,   110,   111,   110,    -1,   112,    -1,
      69,    -1,    70,    -1,    71,    -1,    72,    -1,    73,    -1,
     113,   112,    -1,   114,    -1,    70,    -1,    71,    -1,    74,
      -1,   116,    -1,   115,    -1,    54,    -1,   115,    64,   106,
      65,    -1,   115,    75,    54,    -1,    66,   106,    67,    -1,
     117,    -1,   120,    -1,    54,    66,   118,    67,    -1,   119,
      -1,    -1,   119,    62,   106,    -1,   106,    -1,    53,    -1,
       3,    -1,    57,    -1,     5,    -1
  };

  /* YYPRHS[YYN] -- Index of the first RHS symbol of rule number YYN in
     YYRHS.  */
  private static final short yyprhs_[] =
  {
         0,     0,     3,     5,     8,    10,    12,    14,    16,    22,
      26,    30,    34,    36,    38,    42,    44,    49,    52,    54,
      56,    57,    59,    61,    63,    65,    72,    78,    80,    81,
      85,    87,    90,    94,    96,    98,   102,   104,   106,   108,
     110,   112,   114,   119,   122,   123,   126,   127,   130,   132,
     138,   146,   154,   160,   167,   172,   173,   179,   182,   186,
     189,   193,   198,   203,   208,   213,   217,   221,   223,   227,
     231,   236,   241,   244,   246,   250,   252,   254,   256,   258,
     260,   262,   264,   268,   270,   272,   274,   276,   278,   280,
     283,   285,   287,   289,   291,   293,   295,   297,   302,   306,
     310,   312,   314,   319,   321,   322,   326,   328,   330,   332,
     334
  };

  /* YYRLINE[YYN] -- Source line where rule number YYN was defined.  */
  private static final short yyrline_[] =
  {
         0,    11,    11,    18,    27,    34,    44,    53,    62,    71,
      83,    94,   104,   115,   126,   141,   152,   162,   173,   186,
     204,   211,   223,   234,   248,   263,   273,   284,   295,   304,
     313,   327,   339,   351,   364,   378,   392,   404,   417,   427,
     438,   449,   460,   473,   489,   498,   510,   515,   525,   538,
     548,   563,   575,   585,   594,   610,   616,   627,   636,   648,
     662,   673,   686,   699,   712,   724,   736,   747,   767,   782,
     794,   805,   816,   826,   837,   848,   862,   875,   886,   896,
     907,   918,   929,   939,   948,   957,   969,   979,   991,  1010,
    1023,  1041,  1055,  1069,  1081,  1092,  1105,  1117,  1129,  1143,
    1153,  1166,  1182,  1198,  1215,  1222,  1236,  1251,  1262,  1274,
    1285
  };

  // Report on the debug stream that the rule yyrule is going to be reduced.
  private void yy_reduce_print (int yyrule, YYStack yystack)
  {
    if (yydebug == 0)
      return;

    int yylno = yyrline_[yyrule];
    int yynrhs = yyr2_[yyrule];
    /* Print the symbols being reduced, and their result.  */
    yycdebug ("Reducing stack by rule " + (yyrule - 1)
	      + " (line " + yylno + "), ");

    /* The symbols being reduced.  */
    for (int yyi = 0; yyi < yynrhs; yyi++)
      yy_symbol_print ("   $" + (yyi + 1) + " =",
		       yyrhs_[yyprhs_[yyrule] + yyi],
		       ((yystack.valueAt (yynrhs-(yyi + 1)))));
  }

  /* YYTRANSLATE(YYLEX) -- Bison symbol number corresponding to YYLEX.  */
  private static final byte yytranslate_table_[] =
  {
         0,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,    73,     2,     2,
      66,    67,    71,    69,    62,    70,    75,    72,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,    63,    61,
       2,    68,     2,    74,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,    64,     2,    65,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,    59,     2,    60,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     1,     2,     3,     4,
       5,     6,     7,     8,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,    23,    24,
      25,    26,    27,    28,    29,    30,    31,    32,    33,    34,
      35,    36,    37,    38,    39,    40,    41,    42,    43,    44,
      45,    46,    47,    48,    49,    50,    51,    52,    53,    54,
      55,    56,    57,    58
  };

  private static final byte yytranslate_ (int t)
  {
    if (t >= 0 && t <= yyuser_token_number_max_)
      return yytranslate_table_[t];
    else
      return yyundef_token_;
  }

  private static final int yylast_ = 356;
  private static final int yynnts_ = 45;
  private static final int yyempty_ = -2;
  private static final int yyfinal_ = 17;
  private static final int yyterror_ = 1;
  private static final int yyerrcode_ = 256;
  private static final int yyntokens_ = 76;

  private static final int yyuser_token_number_max_ = 313;
  private static final int yyundef_token_ = 2;

/* User implementation code.  */

}


