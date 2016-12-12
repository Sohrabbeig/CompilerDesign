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
  /** Token number, to be returned by the scanner.  */
  public static final int plus_plus = 314;
  /** Token number, to be returned by the scanner.  */
  public static final int minus_minus = 315;



  

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
/* Line 138 of "inputparser.y"  */
    {
		System.out.printf("Rule 1 program : declarationList\n") ;
	};
  break;
    

  case 3:
  if (yyn == 3)
    
/* Line 351 of lalr1.java  */
/* Line 144 of "inputparser.y"  */
    {
		System.out.printf("Rule 2 declarationList : declarationList declaration \n") ;
	};
  break;
    

  case 4:
  if (yyn == 4)
    
/* Line 351 of lalr1.java  */
/* Line 153 of "inputparser.y"  */
    {
		System.out.printf("Rule 3 declarationList : declaration\n") ;
	};
  break;
    

  case 5:
  if (yyn == 5)
    
/* Line 351 of lalr1.java  */
/* Line 161 of "inputparser.y"  */
    {
		System.out.printf("Rule 4 declaration : varDeclaration \n") ;
	};
  break;
    

  case 6:
  if (yyn == 6)
    
/* Line 351 of lalr1.java  */
/* Line 171 of "inputparser.y"  */
    {
		System.out.printf("Rule 5 declaration :  funDeclaration\n") ;
	};
  break;
    

  case 7:
  if (yyn == 7)
    
/* Line 351 of lalr1.java  */
/* Line 181 of "inputparser.y"  */
    {
		System.out.printf("Rule 6 declaration :  recDeclaration\n") ;
	};
  break;
    

  case 8:
  if (yyn == 8)
    
/* Line 351 of lalr1.java  */
/* Line 190 of "inputparser.y"  */
    {
		System.out.printf("Rule 7 recDeclaration : RECORD ID '{' localDeclarations \n") ;
	};
  break;
    

  case 9:
  if (yyn == 9)
    
/* Line 351 of lalr1.java  */
/* Line 201 of "inputparser.y"  */
    {
		System.out.printf("Rule 8 varDeclaration : typeSpecifier varDeclList ';'\n") ;
	};
  break;
    

  case 10:
  if (yyn == 10)
    
/* Line 351 of lalr1.java  */
/* Line 213 of "inputparser.y"  */
    {
		System.out.printf("Rule 9 scopedVarDeclaration : scopedTypeSpecifier varDeclList ';'\n") ;
	};
  break;
    

  case 11:
  if (yyn == 11)
    
/* Line 351 of lalr1.java  */
/* Line 225 of "inputparser.y"  */
    {
		System.out.printf("Rule 10 varDeclList : varDeclList ',' varDeclInitialize\n") ;
	};
  break;
    

  case 12:
  if (yyn == 12)
    
/* Line 351 of lalr1.java  */
/* Line 235 of "inputparser.y"  */
    {
		System.out.printf("Rule 11 varDeclList : varDeclInitialize \n") ;
	};
  break;
    

  case 13:
  if (yyn == 13)
    
/* Line 351 of lalr1.java  */
/* Line 245 of "inputparser.y"  */
    {
		System.out.printf("Rule 11' varDeclInitialize : varDeclId  \n") ;
	};
  break;
    

  case 14:
  if (yyn == 14)
    
/* Line 351 of lalr1.java  */
/* Line 258 of "inputparser.y"  */
    {
		System.out.printf("Rule 12 varDeclInitialize :   varDeclId ':' simpleExpression\n") ;
	};
  break;
    

  case 15:
  if (yyn == 15)
    
/* Line 351 of lalr1.java  */
/* Line 271 of "inputparser.y"  */
    {
		System.out.printf("Rule 13 varDeclId : ID \n") ;
	};
  break;
    

  case 16:
  if (yyn == 16)
    
/* Line 351 of lalr1.java  */
/* Line 281 of "inputparser.y"  */
    {
		System.out.printf("Rule 14 varDeclId :  ID  NUMCONST ']' \n") ;
	};
  break;
    

  case 17:
  if (yyn == 17)
    
/* Line 351 of lalr1.java  */
/* Line 292 of "inputparser.y"  */
    {
		System.out.printf("Rule 15 varDeclId :  scopedTypeSpecifier : Static typeSpecifier\n") ;
	};
  break;
    

  case 18:
  if (yyn == 18)
    
/* Line 351 of lalr1.java  */
/* Line 305 of "inputparser.y"  */
    {
		System.out.printf("Rule 16 varDeclId : typeSpecifier \n") ;
	};
  break;
    

  case 19:
  if (yyn == 19)
    
/* Line 351 of lalr1.java  */
/* Line 318 of "inputparser.y"  */
    {
		System.out.printf("Rule 17 typeSpecifier : returnTypeSpecifier  \n") ;
	};
  break;
    

  case 20:
  if (yyn == 20)
    
/* Line 351 of lalr1.java  */
/* Line 335 of "inputparser.y"  */
    {
		System.out.printf("Rule 19 returnTypeSpecifier : INT \n") ;
	};
  break;
    

  case 21:
  if (yyn == 21)
    
/* Line 351 of lalr1.java  */
/* Line 346 of "inputparser.y"  */
    {
		System.out.printf("Rule 20 returnTypeSpecifier : REAL \n") ;
	};
  break;
    

  case 22:
  if (yyn == 22)
    
/* Line 351 of lalr1.java  */
/* Line 357 of "inputparser.y"  */
    {
		System.out.printf("Rule 21 returnTypeSpecifier :  BOOL\n") ;
	};
  break;
    

  case 23:
  if (yyn == 23)
    
/* Line 351 of lalr1.java  */
/* Line 372 of "inputparser.y"  */
    {
		System.out.printf("Rule 22 returnTypeSpecifier :  CHAR\n") ;
	};
  break;
    

  case 24:
  if (yyn == 24)
    
/* Line 351 of lalr1.java  */
/* Line 385 of "inputparser.y"  */
    {
		System.out.printf("Rule 23 funDeclaration : typeSpecifier ID '(' params ')' statement \n") ;
	};
  break;
    

  case 25:
  if (yyn == 25)
    
/* Line 351 of lalr1.java  */
/* Line 396 of "inputparser.y"  */
    {
		System.out.printf("Rule 24 funDeclaration : ID '(' params ')' statement\n") ;
	};
  break;
    

  case 26:
  if (yyn == 26)
    
/* Line 351 of lalr1.java  */
/* Line 405 of "inputparser.y"  */
    {
		System.out.printf("Rule 25 params : paramList \n") ;
	};
  break;
    

  case 27:
  if (yyn == 27)
    
/* Line 351 of lalr1.java  */
/* Line 414 of "inputparser.y"  */
    {
		System.out.printf("Rule 26 params : /*   lamda  */\n") ;
	};
  break;
    

  case 28:
  if (yyn == 28)
    
/* Line 351 of lalr1.java  */
/* Line 425 of "inputparser.y"  */
    {
		System.out.printf("Rule 27 paramList : paramList ';' paramTypeList \n") ;
	};
  break;
    

  case 29:
  if (yyn == 29)
    
/* Line 351 of lalr1.java  */
/* Line 436 of "inputparser.y"  */
    {
		System.out.printf("Rule 28 paramList : paramTypeList \n") ;
	};
  break;
    

  case 30:
  if (yyn == 30)
    
/* Line 351 of lalr1.java  */
/* Line 450 of "inputparser.y"  */
    {
		System.out.printf("Rule 29 paramTypeList : typeSpecifier paramIdList\n") ;
	};
  break;
    

  case 31:
  if (yyn == 31)
    
/* Line 351 of lalr1.java  */
/* Line 462 of "inputparser.y"  */
    {
		System.out.printf("Rule 30 paramIdList : paramIdList ',' paramId \n") ;
	};
  break;
    

  case 32:
  if (yyn == 32)
    
/* Line 351 of lalr1.java  */
/* Line 474 of "inputparser.y"  */
    {
		System.out.printf("Rule 31 paramIdList : paramId \n") ;
	};
  break;
    

  case 33:
  if (yyn == 33)
    
/* Line 351 of lalr1.java  */
/* Line 488 of "inputparser.y"  */
    {
		System.out.printf("Rule 32 paramId : ID  \n") ;
	};
  break;
    

  case 34:
  if (yyn == 34)
    
/* Line 351 of lalr1.java  */
/* Line 500 of "inputparser.y"  */
    {
		System.out.printf("Rule 33 paramId : ID '[' ']'\n") ;
	};
  break;
    

  case 35:
  if (yyn == 35)
    
/* Line 351 of lalr1.java  */
/* Line 516 of "inputparser.y"  */
    {
		System.out.printf("Rule 34 statement : expressionStmt \n") ;
	};
  break;
    

  case 36:
  if (yyn == 36)
    
/* Line 351 of lalr1.java  */
/* Line 528 of "inputparser.y"  */
    {
		System.out.printf("Rule 35 statement : compoundStmt \n") ;
	};
  break;
    

  case 37:
  if (yyn == 37)
    
/* Line 351 of lalr1.java  */
/* Line 539 of "inputparser.y"  */
    {
		System.out.printf("Rule 36 statement : selectionStmt \n") ;
	};
  break;
    

  case 38:
  if (yyn == 38)
    
/* Line 351 of lalr1.java  */
/* Line 551 of "inputparser.y"  */
    {
		System.out.printf("Rule 37 statement : iterationStmt \n") ;
	};
  break;
    

  case 39:
  if (yyn == 39)
    
/* Line 351 of lalr1.java  */
/* Line 561 of "inputparser.y"  */
    {
		System.out.printf("Rule 38 statement : returnStmt \n") ;
	};
  break;
    

  case 40:
  if (yyn == 40)
    
/* Line 351 of lalr1.java  */
/* Line 573 of "inputparser.y"  */
    {
		System.out.printf("Rule 39 statement : breakStmt \n") ;
	};
  break;
    

  case 41:
  if (yyn == 41)
    
/* Line 351 of lalr1.java  */
/* Line 583 of "inputparser.y"  */
    {
		System.out.printf("Rule 40 compoundStmt : '{' localDeclarations statementList '}'\n") ;
	};
  break;
    

  case 42:
  if (yyn == 42)
    
/* Line 351 of lalr1.java  */
/* Line 595 of "inputparser.y"  */
    {
		System.out.printf("Rule 41 localDeclarations : localDeclarations : localDeclarations scopedVarDeclaration  \n") ;
	};
  break;
    

  case 43:
  if (yyn == 43)
    
/* Line 351 of lalr1.java  */
/* Line 608 of "inputparser.y"  */
    {
		System.out.printf("Rule 42 localDeclarations  :  /*   |    lamda   */\n") ;
	};
  break;
    

  case 44:
  if (yyn == 44)
    
/* Line 351 of lalr1.java  */
/* Line 619 of "inputparser.y"  */
    {
		System.out.printf("Rule 43 statementList : statementList statement   \n") ;
	};
  break;
    

  case 45:
  if (yyn == 45)
    
/* Line 351 of lalr1.java  */
/* Line 629 of "inputparser.y"  */
    {
		System.out.printf("Rule 44 statementList :  /* |   lamda  */ \n") ;
	};
  break;
    

  case 46:
  if (yyn == 46)
    
/* Line 351 of lalr1.java  */
/* Line 637 of "inputparser.y"  */
    {
		System.out.printf("Rule 45 expressionStmt : expression ';' \n") ;
	};
  break;
    

  case 47:
  if (yyn == 47)
    
/* Line 351 of lalr1.java  */
/* Line 648 of "inputparser.y"  */
    {
		System.out.printf("Rule 46 expressionStmt : ';' \n") ;
	};
  break;
    

  case 48:
  if (yyn == 48)
    
/* Line 351 of lalr1.java  */
/* Line 661 of "inputparser.y"  */
    {
		System.out.printf("Rule 47 selectionStmt : IF '(' simpleExpression ')' statement \n") ;
	};
  break;
    

  case 49:
  if (yyn == 49)
    
/* Line 351 of lalr1.java  */
/* Line 674 of "inputparser.y"  */
    {
		System.out.printf("Rule 48 selectionStmt : IF '(' simpleExpression ')' statement ELSE statement  \n") ;
	};
  break;
    

  case 50:
  if (yyn == 50)
    
/* Line 351 of lalr1.java  */
/* Line 686 of "inputparser.y"  */
    {
		System.out.printf("Rule 49 selectionStmt : SWITCH '(' simpleExpression ')' caseElement defaultElement END \n") ;
	};
  break;
    

  case 51:
  if (yyn == 51)
    
/* Line 351 of lalr1.java  */
/* Line 698 of "inputparser.y"  */
    {
		System.out.printf("Rule 50 selectionStmt : caseElement : CASE NUMCONST : statement ; \n") ;
	};
  break;
    

  case 52:
  if (yyn == 52)
    
/* Line 351 of lalr1.java  */
/* Line 708 of "inputparser.y"  */
    {
		System.out.printf("Rule 51 selectionStmt : caseElement CASE NUMCONST : statement ;\n") ;
	};
  break;
    

  case 53:
  if (yyn == 53)
    
/* Line 351 of lalr1.java  */
/* Line 717 of "inputparser.y"  */
    {
		System.out.printf("Rule 52 defaultElement : DEFAULT ':' statement ';'    \n") ;
	};
  break;
    

  case 54:
  if (yyn == 54)
    
/* Line 351 of lalr1.java  */
/* Line 729 of "inputparser.y"  */
    {
		System.out.printf("Rule 53 defaultElement : /*lamda     */\n") ;
	};
  break;
    

  case 55:
  if (yyn == 55)
    
/* Line 351 of lalr1.java  */
/* Line 739 of "inputparser.y"  */
    {
		System.out.printf("Rule 54 iterationStmt : WHILE '(' simpleExpression ')' statement\n") ;
	};
  break;
    

  case 56:
  if (yyn == 56)
    
/* Line 351 of lalr1.java  */
/* Line 749 of "inputparser.y"  */
    {
		System.out.printf("Rule 55  returnStmt : RETURN ';' \n") ;
	};
  break;
    

  case 57:
  if (yyn == 57)
    
/* Line 351 of lalr1.java  */
/* Line 759 of "inputparser.y"  */
    {
		System.out.printf("Rule 56  returnStmt : RETURN expression ';'\n") ;
	};
  break;
    

  case 58:
  if (yyn == 58)
    
/* Line 351 of lalr1.java  */
/* Line 771 of "inputparser.y"  */
    {
		System.out.printf("Rule 57  breakStmt : BREAK ';'\n") ;
	};
  break;
    

  case 59:
  if (yyn == 59)
    
/* Line 351 of lalr1.java  */
/* Line 786 of "inputparser.y"  */
    {
		System.out.printf("Rule 58 expression : mutable '=' expression \n") ;
	};
  break;
    

  case 60:
  if (yyn == 60)
    
/* Line 351 of lalr1.java  */
/* Line 798 of "inputparser.y"  */
    {
		System.out.printf("Rule 59 expression :mutable '+' '=' expression \n") ;
	};
  break;
    

  case 61:
  if (yyn == 61)
    
/* Line 351 of lalr1.java  */
/* Line 809 of "inputparser.y"  */
    {
		System.out.printf("Rule 60 expression : mutable '-' '=' expression \n") ;
	};
  break;
    

  case 62:
  if (yyn == 62)
    
/* Line 351 of lalr1.java  */
/* Line 822 of "inputparser.y"  */
    {
		System.out.printf("Rule 61 expression :  mutable '*' '=' expression \n") ;
	};
  break;
    

  case 63:
  if (yyn == 63)
    
/* Line 351 of lalr1.java  */
/* Line 835 of "inputparser.y"  */
    {
		System.out.printf("Rule 62 expression :  mutable '/' '=' expression \n") ;
	};
  break;
    

  case 64:
  if (yyn == 64)
    
/* Line 351 of lalr1.java  */
/* Line 847 of "inputparser.y"  */
    {
		System.out.printf("Rule 63 expression :mutable '+' '+'  \n") ;
	};
  break;
    

  case 65:
  if (yyn == 65)
    
/* Line 351 of lalr1.java  */
/* Line 860 of "inputparser.y"  */
    {
		System.out.printf("Rule 64 expression :  mutable '-' '-'  \n") ;
	};
  break;
    

  case 66:
  if (yyn == 66)
    
/* Line 351 of lalr1.java  */
/* Line 872 of "inputparser.y"  */
    {
		System.out.printf("Rule 66 expression : simpleExpression \n") ;
	};
  break;
    

  case 67:
  if (yyn == 67)
    
/* Line 351 of lalr1.java  */
/* Line 892 of "inputparser.y"  */
    {
		System.out.printf("Rule 67 simpleExpression : simpleExpression OR simpleExpression \n") ;
	};
  break;
    

  case 68:
  if (yyn == 68)
    
/* Line 351 of lalr1.java  */
/* Line 905 of "inputparser.y"  */
    {
		System.out.printf("Rule 68 simpleExpression : simpleExpression AND simpleExpression  \n") ;
	};
  break;
    

  case 69:
  if (yyn == 69)
    
/* Line 351 of lalr1.java  */
/* Line 917 of "inputparser.y"  */
    {
		System.out.printf("Rule 69 simpleExpression : simpleExpression OR ELSE simpleExpression  \n") ;
	};
  break;
    

  case 70:
  if (yyn == 70)
    
/* Line 351 of lalr1.java  */
/* Line 929 of "inputparser.y"  */
    {
		System.out.printf("Rule 70 simpleExpression : simpleExpression AND THEN simpleExpression  \n") ;
	};
  break;
    

  case 71:
  if (yyn == 71)
    
/* Line 351 of lalr1.java  */
/* Line 939 of "inputparser.y"  */
    {
		System.out.printf("Rule 71 simpleExpression :NOT simpleExpression \n") ;
	};
  break;
    

  case 72:
  if (yyn == 72)
    
/* Line 351 of lalr1.java  */
/* Line 949 of "inputparser.y"  */
    {
		System.out.printf("Rule 72 simpleExpression : relExpression \n") ;
	};
  break;
    

  case 73:
  if (yyn == 73)
    
/* Line 351 of lalr1.java  */
/* Line 960 of "inputparser.y"  */
    {
		System.out.printf("Rule 73 relExpression : mathlogicExpression relop mathlogicExpression \n") ;
	};
  break;
    

  case 74:
  if (yyn == 74)
    
/* Line 351 of lalr1.java  */
/* Line 970 of "inputparser.y"  */
    {
		System.out.printf("Rule 74 relExpression : mathlogicExpression\n") ;
	};
  break;
    

  case 75:
  if (yyn == 75)
    
/* Line 351 of lalr1.java  */
/* Line 986 of "inputparser.y"  */
    {
		System.out.printf("Rule 75 relop : less_equal \n") ;
	};
  break;
    

  case 76:
  if (yyn == 76)
    
/* Line 351 of lalr1.java  */
/* Line 999 of "inputparser.y"  */
    {
		System.out.printf("Rule 76 relop : less_than \n") ;
	};
  break;
    

  case 77:
  if (yyn == 77)
    
/* Line 351 of lalr1.java  */
/* Line 1009 of "inputparser.y"  */
    {
		System.out.printf("Rule 77 relop : greater_than \n") ;
	};
  break;
    

  case 78:
  if (yyn == 78)
    
/* Line 351 of lalr1.java  */
/* Line 1020 of "inputparser.y"  */
    {
		System.out.printf("Rule 78 relop : greater_equal \n") ;
	};
  break;
    

  case 79:
  if (yyn == 79)
    
/* Line 351 of lalr1.java  */
/* Line 1031 of "inputparser.y"  */
    {
		System.out.printf("Rule 79 relop : equal \n") ;
	};
  break;
    

  case 80:
  if (yyn == 80)
    
/* Line 351 of lalr1.java  */
/* Line 1042 of "inputparser.y"  */
    {
		System.out.printf("Rule 80 relop : not_equal \n") ;
	};
  break;
    

  case 81:
  if (yyn == 81)
    
/* Line 351 of lalr1.java  */
/* Line 1051 of "inputparser.y"  */
    {
		System.out.printf("Rule 81 mathlogicExpression : mathlogicExpression mathop mathlogicExpression   \n") ;
	};
  break;
    

  case 82:
  if (yyn == 82)
    
/* Line 351 of lalr1.java  */
/* Line 1058 of "inputparser.y"  */
    {
 		System.out.printf("Rule 81 mathlogicExpression : mathlogicExpression mathop mathlogicExpression   \n") ;
 	};
  break;
    

  case 83:
  if (yyn == 83)
    
/* Line 351 of lalr1.java  */
/* Line 1065 of "inputparser.y"  */
    {
 		System.out.printf("Rule 81 mathlogicExpression : mathlogicExpression mathop mathlogicExpression   \n") ;
 	};
  break;
    

  case 84:
  if (yyn == 84)
    
/* Line 351 of lalr1.java  */
/* Line 1072 of "inputparser.y"  */
    {
 		System.out.printf("Rule 81 mathlogicExpression : mathlogicExpression mathop mathlogicExpression   \n") ;
 	};
  break;
    

  case 85:
  if (yyn == 85)
    
/* Line 351 of lalr1.java  */
/* Line 1079 of "inputparser.y"  */
    {
 		System.out.printf("Rule 81 mathlogicExpression : mathlogicExpression mathop mathlogicExpression   \n") ;
 	};
  break;
    

  case 86:
  if (yyn == 86)
    
/* Line 351 of lalr1.java  */
/* Line 1087 of "inputparser.y"  */
    {
		System.out.printf("Rule 82 mathlogicExpression : unaryExpression\n") ;
	};
  break;
    

  case 87:
  if (yyn == 87)
    
/* Line 351 of lalr1.java  */
/* Line 1101 of "inputparser.y"  */
    {
		System.out.printf("Rule 88 unaryExpression : unaryop unaryExpression  \n") ;
	};
  break;
    

  case 88:
  if (yyn == 88)
    
/* Line 351 of lalr1.java  */
/* Line 1114 of "inputparser.y"  */
    {
		System.out.printf("Rule 89 unaryExpression : factor  \n") ;
	};
  break;
    

  case 89:
  if (yyn == 89)
    
/* Line 351 of lalr1.java  */
/* Line 1133 of "inputparser.y"  */
    {
		System.out.printf("Rule 90 unaryop : '-'   \n") ;
	};
  break;
    

  case 90:
  if (yyn == 90)
    
/* Line 351 of lalr1.java  */
/* Line 1146 of "inputparser.y"  */
    {
		System.out.printf("Rule 91 unaryop : '*'  \n") ;
	};
  break;
    

  case 91:
  if (yyn == 91)
    
/* Line 351 of lalr1.java  */
/* Line 1159 of "inputparser.y"  */
    {
		System.out.printf("Rule 92 unaryop : '?'  \n") ;
	};
  break;
    

  case 92:
  if (yyn == 92)
    
/* Line 351 of lalr1.java  */
/* Line 1170 of "inputparser.y"  */
    {
		System.out.printf("Rule 93 factor : immutable   \n") ;
	};
  break;
    

  case 93:
  if (yyn == 93)
    
/* Line 351 of lalr1.java  */
/* Line 1182 of "inputparser.y"  */
    {
		System.out.printf("Rule 94 factor : mutable   \n") ;
	};
  break;
    

  case 94:
  if (yyn == 94)
    
/* Line 351 of lalr1.java  */
/* Line 1195 of "inputparser.y"  */
    {
		System.out.printf("Rule 95 mutable : ID  \n") ;
	};
  break;
    

  case 95:
  if (yyn == 95)
    
/* Line 351 of lalr1.java  */
/* Line 1207 of "inputparser.y"  */
    {
		System.out.printf("Rule 96 mutable : mutable '[' expression ']'  \n") ;
	};
  break;
    

  case 96:
  if (yyn == 96)
    
/* Line 351 of lalr1.java  */
/* Line 1218 of "inputparser.y"  */
    {
		System.out.printf("Rule 97 mutable :  mutable '.' ID  \n") ;
	};
  break;
    

  case 97:
  if (yyn == 97)
    
/* Line 351 of lalr1.java  */
/* Line 1233 of "inputparser.y"  */
    {
		System.out.printf("Rule 98 immutable : '(' expression ')' \n") ;
	};
  break;
    

  case 98:
  if (yyn == 98)
    
/* Line 351 of lalr1.java  */
/* Line 1244 of "inputparser.y"  */
    {
		System.out.printf("Rule 99 immutable : call \n") ;
	};
  break;
    

  case 99:
  if (yyn == 99)
    
/* Line 351 of lalr1.java  */
/* Line 1258 of "inputparser.y"  */
    {
		System.out.printf("Rule 100 immutable : constant \n") ;
	};
  break;
    

  case 100:
  if (yyn == 100)
    
/* Line 351 of lalr1.java  */
/* Line 1273 of "inputparser.y"  */
    {
		System.out.printf("Rule 101 call : ID '(' args ')' \n") ;
	};
  break;
    

  case 101:
  if (yyn == 101)
    
/* Line 351 of lalr1.java  */
/* Line 1289 of "inputparser.y"  */
    {
		System.out.printf("Rule 102 args : argList  \n") ;
	};
  break;
    

  case 102:
  if (yyn == 102)
    
/* Line 351 of lalr1.java  */
/* Line 1301 of "inputparser.y"  */
    {
		System.out.printf("Rule 103 args : /* | lamda    */  \n") ;
	};
  break;
    

  case 103:
  if (yyn == 103)
    
/* Line 351 of lalr1.java  */
/* Line 1312 of "inputparser.y"  */
    {
		System.out.printf("Rule 104 argList : argList ',' expression \n") ;
	};
  break;
    

  case 104:
  if (yyn == 104)
    
/* Line 351 of lalr1.java  */
/* Line 1329 of "inputparser.y"  */
    {
		System.out.printf("Rule 105 argList : expression \n") ;
	};
  break;
    

  case 105:
  if (yyn == 105)
    
/* Line 351 of lalr1.java  */
/* Line 1341 of "inputparser.y"  */
    {
		System.out.printf("Rule 105  constant : NUMCONST  \n") ;
	};
  break;
    

  case 106:
  if (yyn == 106)
    
/* Line 351 of lalr1.java  */
/* Line 1351 of "inputparser.y"  */
    {
		System.out.printf("Rule 105  constant : Real_const  \n") ;
	};
  break;
    

  case 107:
  if (yyn == 107)
    
/* Line 351 of lalr1.java  */
/* Line 1364 of "inputparser.y"  */
    {
		System.out.printf("Rule 105  constant : CHARCONST  \n") ;
		yyval = new EVal();
		((EVal)yyval).place = ((yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((yystack.valueAt (1-(1)))).type;

		
		
		
		
		
	};
  break;
    

  case 108:
  if (yyn == 108)
    
/* Line 351 of lalr1.java  */
/* Line 1385 of "inputparser.y"  */
    {
		System.out.printf("Rule 105  constant : BoolConst  \n") ;
	};
  break;
    

  case 109:
  if (yyn == 109)
    
/* Line 351 of lalr1.java  */
/* Line 1392 of "inputparser.y"  */
    {
		System.out.printf("Rule 106 empty:   \n") ;
	};
  break;
    



/* Line 351 of lalr1.java  */
/* Line 1587 of "inputparser.java"  */
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
  private static final short yypact_ninf_ = -89;
  private static final short yypact_[] =
  {
       -22,   -43,   -89,   -89,   -89,   -89,    -1,    24,   -22,   -89,
     -89,   -89,   -11,   -89,   -89,    35,   -12,   -89,   -89,    -6,
     -14,   -89,    32,   -89,     1,    46,    55,   -89,    21,   -12,
     -89,    22,    18,    -2,   -89,    66,    67,   -89,   146,   -12,
      79,    77,    83,   -89,   -89,   -89,    18,    18,   -89,   -89,
     -89,   -89,    92,   -89,   101,   -89,   202,   -89,   140,   -89,
      -9,   -89,   -89,   -89,   -89,   -12,   -89,    22,   -89,    97,
       1,   -89,   -89,    98,    99,   105,     4,   114,   -89,   -89,
     -89,   -89,   -89,   -89,   -89,   122,   101,   162,   -89,   -89,
     146,   124,   -89,    18,    18,    18,    18,    18,   -89,   -89,
     -89,   -89,   -89,   -89,   140,   140,   140,   140,   140,   140,
     -89,    18,    88,   -89,    28,   -89,   -89,   203,    18,    18,
      18,   -89,   126,   -89,   -89,    18,    18,    18,    18,    18,
     -89,   -89,   -89,   -89,   -89,   129,   128,   -89,    20,    20,
     -89,    11,   -89,   -89,    87,    87,   207,   135,   -89,   -89,
     104,   201,   210,   214,   -89,   -89,   -89,   -89,   -89,   -89,
     -89,    18,   -89,   -89,   -89,   146,   121,   146,   -89,   127,
     106,    38,   -89,   146,   143,   118,   156,   147,   -89,   146,
     158,   146,   -89,   164,   146,   166,   -89,   167,   -89,   -89
  };

  /* YYDEFACT[S] -- default reduction number in state S.  Performed when
     YYTABLE doesn't specify something else to do.  Zero means the
     default is an error.  */
  private static final byte yydefact_[] =
  {
         0,     0,    20,    21,    22,    23,     0,     0,     2,     4,
       7,     5,     0,    19,     6,     0,    27,     1,     3,    15,
       0,    12,    13,   109,     0,     0,    26,    29,     0,    27,
       9,     0,     0,     0,    43,    33,    30,    32,     0,     0,
       0,     0,    15,    11,   106,   108,     0,     0,    91,    90,
      89,   105,    94,   107,    14,    72,    74,    86,     0,    88,
      93,    92,    98,    99,     8,     0,    42,     0,    18,     0,
       0,   109,    47,     0,     0,     0,     0,     0,    25,    36,
      35,    37,    38,    39,    40,     0,    66,    93,    28,    16,
       0,     0,    71,   102,     0,     0,     0,     0,    77,    78,
      80,    79,    75,    76,     0,     0,     0,     0,     0,     0,
      87,     0,     0,    17,     0,    34,    31,    45,     0,     0,
       0,    56,     0,    58,    46,     0,     0,     0,     0,     0,
      64,    65,    24,    97,   104,     0,   101,    70,    69,    67,
      68,    85,    84,    83,    82,    81,    73,     0,    96,    10,
       0,     0,     0,     0,    57,    60,    61,    62,    63,    59,
     100,     0,    95,    41,    44,     0,     0,     0,   103,    48,
       0,    54,    55,     0,     0,     0,     0,     0,    49,     0,
       0,     0,    50,     0,     0,     0,    51,     0,    53,    52
  };

  /* YYPGOTO[NTERM-NUM].  */
  private static final short yypgoto_[] =
  {
       -89,   -89,   -89,   179,   -89,   -89,   -89,   131,   157,   -89,
     -89,     0,   -89,   -89,   172,   -89,   152,   -89,   132,   -88,
     -89,   144,   -89,   -89,   -89,   -89,   -89,   -89,   -89,   -89,
     -45,     9,   -89,   -89,    61,   159,   -89,   -89,    -7,   -89,
     -89,   -89,   -89,   -89,   -89
  };

  /* YYDEFGOTO[NTERM-NUM].  */
  private static final short
  yydefgoto_[] =
  {
        -1,     7,     8,     9,    10,    11,    66,    20,    21,    22,
      67,    24,    13,    14,    25,    26,    27,    36,    37,    78,
      79,    33,   150,    80,    81,   171,   177,    82,    83,    84,
      85,    86,    55,   109,    56,    57,    58,    59,    87,    61,
      62,   135,   136,    63,    34
  };

  /* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
     positive, shift that token.  If negative, reduce the rule which
     number is the opposite.  If YYTABLE_NINF_, syntax error.  */
  private static final short yytable_ninf_ = -1;
  private static final short
  yytable_[] =
  {
        12,    91,   132,   111,    30,    31,    28,    44,    12,    45,
      29,    15,   112,    64,     1,    16,     2,     3,     4,     5,
      46,    44,   121,    45,    17,    60,     2,     3,     4,     5,
      47,   122,     6,    68,    46,    65,     2,     3,     4,     5,
      60,    54,    94,    19,    47,    97,   149,    31,   134,    23,
      48,    60,    32,    49,    50,    35,    92,    51,    52,   105,
     106,    53,   164,    38,    48,   113,   147,    49,    50,   175,
     176,    51,    52,    39,    40,    53,    42,   169,    69,   172,
     155,   156,   157,   158,   159,   178,    70,    60,    60,    60,
      60,   183,    89,   185,    90,    28,   187,    60,    60,    60,
      60,    60,    60,   137,   138,   139,   140,    44,    93,    45,
     115,    60,    60,    60,   118,   119,   168,    68,    71,   163,
      46,   120,    72,    94,    95,    96,    97,   151,   152,   153,
      47,    73,   123,    74,   104,   105,   106,    75,    76,    77,
     124,   133,   148,    44,   154,    45,   160,   161,   162,    44,
      48,    45,   170,    49,    50,   173,    46,    51,    52,   174,
      71,    53,    46,   179,    72,   141,   142,   143,   144,   145,
     146,   180,    47,    73,   111,    74,   181,   182,   184,    75,
      76,    77,   186,   112,   188,   189,    48,    18,    43,    49,
      50,    88,    48,    51,    52,    49,    50,    53,   114,    51,
      52,    41,   116,    53,   125,   126,   127,   128,    98,    99,
     100,   101,   102,   103,   129,   117,     0,   110,   165,     0,
       0,   130,   131,    94,    95,    96,    97,   166,     0,     0,
       0,   167,    94,    95,    96,    97,    94,    95,    96,    97,
      65,     2,     3,     4,     5,     0,     0,     0,     0,   104,
     105,   106,   107,   108,   104,   105,   106,   107,   108
  };

  /* YYCHECK.  */
  private static final short
  yycheck_[] =
  {
         0,    46,    90,    12,    18,    19,    12,     3,     8,     5,
      16,    54,    21,    15,    36,    16,    38,    39,    40,    41,
      16,     3,    18,     5,     0,    32,    38,    39,    40,    41,
      26,    76,    54,    33,    16,    37,    38,    39,    40,    41,
      47,    32,    22,    54,    26,    25,    18,    19,    93,    14,
      46,    58,    20,    49,    50,    54,    47,    53,    54,    48,
      49,    57,   150,    17,    46,    65,   111,    49,    50,    31,
      32,    53,    54,    18,    53,    57,    54,   165,    12,   167,
     125,   126,   127,   128,   129,   173,    19,    94,    95,    96,
      97,   179,    13,   181,    17,    12,   184,   104,   105,   106,
     107,   108,   109,    94,    95,    96,    97,     3,    16,     5,
      13,   118,   119,   120,    16,    16,   161,   117,    14,    15,
      16,    16,    18,    22,    23,    24,    25,   118,   119,   120,
      26,    27,    18,    29,    47,    48,    49,    33,    34,    35,
      18,    17,    54,     3,    18,     5,    17,    19,    13,     3,
      46,     5,    31,    49,    50,    28,    16,    53,    54,    53,
      14,    57,    16,    20,    18,   104,   105,   106,   107,   108,
     109,    53,    26,    27,    12,    29,    20,    30,    20,    33,
      34,    35,    18,    21,    18,    18,    46,     8,    31,    49,
      50,    39,    46,    53,    54,    49,    50,    57,    67,    53,
      54,    29,    70,    57,    42,    43,    44,    45,     6,     7,
       8,     9,    10,    11,    52,    71,    -1,    58,    17,    -1,
      -1,    59,    60,    22,    23,    24,    25,    17,    -1,    -1,
      -1,    17,    22,    23,    24,    25,    22,    23,    24,    25,
      37,    38,    39,    40,    41,    -1,    -1,    -1,    -1,    47,
      48,    49,    50,    51,    47,    48,    49,    50,    51
  };

  /* STOS_[STATE-NUM] -- The (internal number of the) accessing
     symbol of state STATE-NUM.  */
  private static final byte
  yystos_[] =
  {
         0,    36,    38,    39,    40,    41,    54,    62,    63,    64,
      65,    66,    72,    73,    74,    54,    16,     0,    64,    54,
      68,    69,    70,    14,    72,    75,    76,    77,    12,    16,
      18,    19,    20,    82,   105,    54,    78,    79,    17,    18,
      53,    75,    54,    69,     3,     5,    16,    26,    46,    49,
      50,    53,    54,    57,    92,    93,    95,    96,    97,    98,
      99,   100,   101,   104,    15,    37,    67,    71,    72,    12,
      19,    14,    18,    27,    29,    33,    34,    35,    80,    81,
      84,    85,    88,    89,    90,    91,    92,    99,    77,    13,
      17,    91,    92,    16,    22,    23,    24,    25,     6,     7,
       8,     9,    10,    11,    47,    48,    49,    50,    51,    94,
      96,    12,    21,    72,    68,    13,    79,    82,    16,    16,
      16,    18,    91,    18,    18,    42,    43,    44,    45,    52,
      59,    60,    80,    17,    91,   102,   103,    92,    92,    92,
      92,    95,    95,    95,    95,    95,    95,    91,    54,    18,
      83,    92,    92,    92,    18,    91,    91,    91,    91,    91,
      17,    19,    13,    15,    80,    17,    17,    17,    91,    80,
      31,    86,    80,    28,    53,    31,    32,    87,    80,    20,
      53,    20,    30,    80,    20,    80,    18,    80,    18,    18
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
     305,   306,   307,   308,   309,   310,   311,   312,   313,   314,
     315
  };

  /* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
  private static final byte
  yyr1_[] =
  {
         0,    61,    62,    63,    63,    64,    64,    64,    65,    66,
      67,    68,    68,    69,    69,    70,    70,    71,    71,    72,
      73,    73,    73,    73,    74,    74,    75,    75,    76,    76,
      77,    78,    78,    79,    79,    80,    80,    80,    80,    80,
      80,    81,    82,    82,    83,    83,    84,    84,    85,    85,
      85,    86,    86,    87,    87,    88,    89,    89,    90,    91,
      91,    91,    91,    91,    91,    91,    91,    92,    92,    92,
      92,    92,    92,    93,    93,    94,    94,    94,    94,    94,
      94,    95,    95,    95,    95,    95,    95,    96,    96,    97,
      97,    97,    98,    98,    99,    99,    99,   100,   100,   100,
     101,   102,   102,   103,   103,   104,   104,   104,   104,   105
  };

  /* YYR2[YYN] -- Number of symbols composing right hand side of rule YYN.  */
  private static final byte
  yyr2_[] =
  {
         0,     2,     1,     2,     1,     1,     1,     1,     5,     3,
       3,     3,     1,     1,     3,     1,     4,     2,     1,     1,
       1,     1,     1,     1,     6,     5,     1,     0,     3,     1,
       2,     3,     1,     1,     3,     1,     1,     1,     1,     1,
       1,     4,     2,     1,     2,     0,     2,     1,     5,     7,
       7,     5,     6,     4,     0,     5,     2,     3,     2,     3,
       3,     3,     3,     3,     2,     2,     1,     3,     3,     3,
       3,     2,     1,     3,     1,     1,     1,     1,     1,     1,
       1,     3,     3,     3,     3,     3,     1,     2,     1,     1,
       1,     1,     1,     1,     1,     4,     3,     3,     1,     1,
       4,     1,     0,     3,     1,     1,     1,     1,     1,     0
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
  "CHARCONST", "THEN", "plus_plus", "minus_minus", "$accept", "program",
  "declarationList", "declaration", "recDeclaration", "varDeclaration",
  "scopedVarDeclaration", "varDeclList", "varDeclInitialize", "varDeclId",
  "scopedTypeSpecifier", "typeSpecifier", "returnTypeSpecifier",
  "funDeclaration", "params", "paramList", "paramTypeList", "paramIdList",
  "paramId", "statement", "compoundStmt", "localDeclarations",
  "statementList", "expressionStmt", "selectionStmt", "caseElement",
  "defaultElement", "iterationStmt", "returnStmt", "breakStmt",
  "expression", "simpleExpression", "relExpression", "relop",
  "mathlogicExpression", "unaryExpression", "unaryop", "factor", "mutable",
  "immutable", "call", "args", "argList", "constant", "empty", null
  };

  /* YYRHS -- A `-1'-separated list of the rules' RHS.  */
  private static final byte yyrhs_[] =
  {
        62,     0,    -1,    63,    -1,    63,    64,    -1,    64,    -1,
      66,    -1,    74,    -1,    65,    -1,    36,    54,    14,    82,
      15,    -1,    72,    68,    18,    -1,    71,    68,    18,    -1,
      68,    19,    69,    -1,    69,    -1,    70,    -1,    70,    20,
      92,    -1,    54,    -1,    54,    12,    53,    13,    -1,    37,
      72,    -1,    72,    -1,    73,    -1,    38,    -1,    39,    -1,
      40,    -1,    41,    -1,    72,    54,    16,    75,    17,    80,
      -1,    54,    16,    75,    17,    80,    -1,    76,    -1,    -1,
      76,    18,    77,    -1,    77,    -1,    72,    78,    -1,    78,
      19,    79,    -1,    79,    -1,    54,    -1,    54,    12,    13,
      -1,    84,    -1,    81,    -1,    85,    -1,    88,    -1,    89,
      -1,    90,    -1,    14,    82,    83,    15,    -1,    82,    67,
      -1,   105,    -1,    83,    80,    -1,    -1,    91,    18,    -1,
      18,    -1,    27,    16,    92,    17,    80,    -1,    27,    16,
      92,    17,    80,    28,    80,    -1,    29,    16,    92,    17,
      86,    87,    30,    -1,    31,    53,    20,    80,    18,    -1,
      86,    31,    53,    20,    80,    18,    -1,    32,    20,    80,
      18,    -1,    -1,    33,    16,    92,    17,    80,    -1,    34,
      18,    -1,    34,    91,    18,    -1,    35,    18,    -1,    99,
      52,    91,    -1,    99,    42,    91,    -1,    99,    43,    91,
      -1,    99,    44,    91,    -1,    99,    45,    91,    -1,    99,
      59,    -1,    99,    60,    -1,    92,    -1,    92,    24,    92,
      -1,    92,    25,    92,    -1,    92,    23,    92,    -1,    92,
      22,    92,    -1,    26,    92,    -1,    93,    -1,    95,    94,
      95,    -1,    95,    -1,    10,    -1,    11,    -1,     6,    -1,
       7,    -1,     9,    -1,     8,    -1,    95,    51,    95,    -1,
      95,    50,    95,    -1,    95,    49,    95,    -1,    95,    48,
      95,    -1,    95,    47,    95,    -1,    96,    -1,    97,    96,
      -1,    98,    -1,    50,    -1,    49,    -1,    46,    -1,   100,
      -1,    99,    -1,    54,    -1,    99,    12,    91,    13,    -1,
      99,    21,    54,    -1,    16,    91,    17,    -1,   101,    -1,
     104,    -1,    54,    16,   102,    17,    -1,   103,    -1,    -1,
     103,    19,    91,    -1,    91,    -1,    53,    -1,     3,    -1,
      57,    -1,     5,    -1,    -1
  };

  /* YYPRHS[YYN] -- Index of the first RHS symbol of rule number YYN in
     YYRHS.  */
  private static final short yyprhs_[] =
  {
         0,     0,     3,     5,     8,    10,    12,    14,    16,    22,
      26,    30,    34,    36,    38,    42,    44,    49,    52,    54,
      56,    58,    60,    62,    64,    71,    77,    79,    80,    84,
      86,    89,    93,    95,    97,   101,   103,   105,   107,   109,
     111,   113,   118,   121,   123,   126,   127,   130,   132,   138,
     146,   154,   160,   167,   172,   173,   179,   182,   186,   189,
     193,   197,   201,   205,   209,   212,   215,   217,   221,   225,
     229,   233,   236,   238,   242,   244,   246,   248,   250,   252,
     254,   256,   260,   264,   268,   272,   276,   278,   281,   283,
     285,   287,   289,   291,   293,   295,   300,   304,   308,   310,
     312,   317,   319,   320,   324,   326,   328,   330,   332,   334
  };

  /* YYRLINE[YYN] -- Source line where rule number YYN was defined.  */
  private static final short yyrline_[] =
  {
         0,   136,   136,   143,   152,   159,   169,   178,   187,   198,
     210,   221,   231,   242,   253,   268,   279,   289,   300,   313,
     330,   342,   353,   367,   382,   392,   403,   414,   423,   432,
     446,   458,   470,   483,   497,   511,   523,   536,   546,   557,
     568,   579,   592,   605,   617,   629,   634,   644,   657,   667,
     682,   694,   704,   713,   729,   735,   746,   755,   767,   781,
     792,   805,   818,   831,   843,   855,   866,   886,   901,   913,
     924,   935,   945,   956,   967,   981,   994,  1005,  1015,  1026,
    1037,  1048,  1055,  1062,  1069,  1076,  1085,  1096,  1109,  1127,
    1141,  1155,  1167,  1178,  1191,  1203,  1215,  1229,  1239,  1252,
    1268,  1284,  1301,  1308,  1322,  1337,  1348,  1360,  1380,  1392
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
      55,    56,    57,    58,    59,    60
  };

  private static final byte yytranslate_ (int t)
  {
    if (t >= 0 && t <= yyuser_token_number_max_)
      return yytranslate_table_[t];
    else
      return yyundef_token_;
  }

  private static final int yylast_ = 258;
  private static final int yynnts_ = 45;
  private static final int yyempty_ = -2;
  private static final int yyfinal_ = 17;
  private static final int yyterror_ = 1;
  private static final int yyerrcode_ = 256;
  private static final int yyntokens_ = 61;

  private static final int yyuser_token_number_max_ = 315;
  private static final int yyundef_token_ = 2;

/* User implementation code.  */
/* Unqualified %code blocks.  */

/* Line 927 of lalr1.java  */
/* Line 9 of "inputparser.y"  */

private ArrayList<Quadruple> quadruples = new ArrayList<>();
private SymbolTable symbolTable = new SymbolTable();
	
	
private void emit(String operation, String arg0, String arg1, String result) {
		quadruples.add(new Quadruple(operation, arg0, arg1, result));
	}
	
	
		private void backpatch(ArrayList<Integer> list, int quadNumber) {
		for (int i = 0; i < list.size(); i++)
			quadruples.get(list.get(i)).result = String.valueOf(quadNumber);
	}
	
		private void backpatch(int quadNumber, int destination) {
		quadruples.get(quadNumber).result = String.valueOf(destination);
	}

		private String newTemp(int type, boolean array) {
		String name = tempStr + tempCounter++;
		symbolTable.addToSymbolTable(name, type, array);
		return name;
	}
	
	
		private int nextQuad() {
		return quadruples.size();
	}

	
		private String getTypeString(int typeCode){
		switch(typeCode){
			case EVal.TYPE_CODE_INTEGER:
				return TYPE_STRING_INTEGER;
			case EVal.TYPE_CODE_REAL:
				return TYPE_STRING_REAL;
			case EVal.TYPE_CODE_CHAR:
				return TYPE_STRING_CHAR;
			case EVal.TYPE_CODE_BOOLEAN:
				return TYPE_STRING_BOOLEAN;
			case EVal.TYPE_CODE_UNKNOWN:
			case EVal.TYPE_CODE_RANGE:
			default:
				return null;
		}
	}
	
	
	
		private void exportIntermediateCode() {
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(new FileOutputStream(fileAddress));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			dos.writeBytes("#include <stdio.h>\n\nint main() {\n\t// ////////////////// Symbol Table \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ \\\\\n\n");
			dos.writeBytes(symbolTable.toString());
			dos.writeBytes("\n\t// ////////////////// Quadruples \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ \\\\\n\n");
			// Backpatch of error controllers.
			backpatch(EVal.arrayIndexOutOfBoundList, (quadruples.size() + 1)); // Array index out of bound error.
			backpatch(EVal.invalidArraySizeList, (quadruples.size() + 2)); // Invalid array size error.
			for (int i = 0; i < quadruples.size() && i < 100; i++) {
				dos.writeBytes(Quadruple.LINE_STR + i + ":" + "\t\t" + quadruples.get(i) + "\n");
			}
			for (int i = 100; i < quadruples.size(); i++) {
				dos.writeBytes(Quadruple.LINE_STR + i + ":" + "\t\t" + quadruples.get(i) + "\n");
			}
			// Normal Finish
			if(quadruples.size() < 100)
				dos.writeBytes(Quadruple.LINE_STR + quadruples.size() + ":" + "\t\tprintf(\"Process is terminated with no error.\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\t\treturn 0;\n");
			else
				dos.writeBytes(Quadruple.LINE_STR + quadruples.size() + ":" + "\t\tprintf(\"Process is terminated with no error.\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\t\treturn 0;\n");

			// Array index out of bound error.
			if(quadruples.size() < 100)
				dos.writeBytes(Quadruple.LINE_STR + (quadruples.size() + 1) + ":" + "\t\tprintf(\"Array Error: Index out of bound!\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\treturn -1;\n");
			else
				dos.writeBytes(Quadruple.LINE_STR + (quadruples.size() + 1) + ":" + "\t\tprintf(\"Array Error: Index out of bound!\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\treturn -1;\n");

			// Invalid array size error.
			if(quadruples.size() < 100)
				dos.writeBytes(Quadruple.LINE_STR + (quadruples.size() + 2) + ":" + "\t\tprintf(\"Array Error: Invalid array size!\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\treturn -2;\n");
			else
				dos.writeBytes(Quadruple.LINE_STR + (quadruples.size() + 2) + ":" + "\t\tprintf(\"Array Error: Invalid array size!\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\treturn -2;\n");

			dos.writeBytes("}\n");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	

	






/* Line 927 of lalr1.java  */
/* Line 2497 of "inputparser.java"  */

}


/* Line 931 of lalr1.java  */
/* Line 1399 of "inputparser.y"  */

 class EVal {

	public static final int TYPE_CODE_UNKNOWN = -1;
	public static final int TYPE_CODE_INTEGER = 0;
	public static final int TYPE_CODE_REAL = 1;
	public static final int TYPE_CODE_CHAR = 2;
	public static final int TYPE_CODE_BOOLEAN = 3;
	public static final int TYPE_CODE_RANGE = 4;
	

	public String place;
	public int type;
	public boolean array;

	public int quad;

	public static ArrayList<Integer> arrayIndexOutOfBoundList = new ArrayList<>();
	public static ArrayList<Integer> invalidArraySizeList = new ArrayList<>();
	public ArrayList<Integer> initList;
	public ArrayList<Integer> nextList;
	public ArrayList<Integer> trueList;
	public ArrayList<Integer> falseList;

	public ArrayList<ArrayList<EVal>> initializersList;
	public ArrayList<EVal> declareds;

	public ArrayList<EVal> initializers;

	public EVal() {
	}

	public static ArrayList<Integer> makeList(int number) {
		ArrayList<Integer> result = new ArrayList<>();
		result.add(number);
		return result;
	}

	public static ArrayList<Integer> merge(ArrayList<Integer> al1, ArrayList<Integer> al2) {
		ArrayList<Integer> result = new ArrayList<>();
		result.addAll(al1);
		result.addAll(al2);
		return result;
	}

	public static ArrayList<ArrayList<EVal>> makeInitializersList(ArrayList<EVal> initializers) {
		ArrayList<ArrayList<EVal>> result = new ArrayList<>();
		result.add(initializers);
		return result;
	}

	public static ArrayList<EVal> makeInitializersOrDeclareds(EVal initializerOrdDeclared) {
		ArrayList<EVal> result = new ArrayList<>();
		result.add(initializerOrdDeclared);
		return result;
	}
}



class Quadruple {

	public static final String LINE_STR = "Line";

	public String operation;
	public String arg0;
	public String arg1;
	public String result;

	public Quadruple(String operation, String arg0, String arg1, String result) {
		this.operation = operation;
		this.arg0 = arg0;
		this.arg1 = arg1;
		this.result = result;
	}

	@Override
	public String toString() {
		switch(operation.toLowerCase()){
			case "goto":
				return operation + " " + LINE_STR + result + ";";
			case "check":
				return "if (" + arg0 + ") goto " + LINE_STR + result + ";";
			case "<":
			case "<=":
			case ">":
			case ">=":
			case "+":
			case "-":
			case "*":
			case "/":
			case "%":
				return result + " = " + arg0 + " " + operation + " " + arg1 + ";";
			case "=":
				return result + " = " + arg0 + " " + "==" + " " + arg1 + ";";
			case "<>":
				return result + " != " + arg0 + " " + "==" + " " + arg1 + ";";
			case "usub":
				return result + " = -" + arg0 + ";";
			case ":=":
				return result + " = " + arg0 + ";";
			case "cast":
				return result + " = (" + arg1 + ") " + arg0 + ";";
			case "init":
				return arg1 + " " + result + ";";
			case "iprint":
				return "printf(\"%s = %d\\n\", \"" + result + "\", " + result + ");";
			case "rprint":
				return "printf(\"%s = %f\\n\", \"" + result + "\", " + result + ");";
			case "cprint":
				return "printf(\"%s = '%c'\\n\", \"" + result + "\", " + result + ");";
			case "bprint":
				return "printf(\"%s = %s\\n\", \"" + result + "\", " + result + " ? \"true\" : \"false\");";
			case "aiprint":
				return "printf(\"%s[%d] = %d\\n\", \"" + result + "\", " + arg0 + ", " + result + "[" + arg1 + "]);";
			case "arprint":
				return "printf(\"%s[%d] = %f\\n\", \"" + result + "\", " + arg0 + ", " + result + "[" + arg1 + "]);";
			case "acprint":
				return "printf(\"%s[%d] = '%c'\\n\", \"" + result + "\", " + arg0 + ", " + result + "[" + arg1 + "]);";
			case "abprint":
				return "printf(\"%s[%d] = %s\\n\", \"" + result + "\", " + arg0 + ", " + result + "[" + arg1 + "] ? \"true\" : \"false\");";
			case "[]=":
				return "*(" + result + " + " + arg1 + ") = " + arg0 + ";";
			case "=[]":
				return result + " = *(" + arg0 + " + " + arg1 + ");";
			case "malloc":
				return result + " = " + "malloc(sizeof(" + arg0 + ") * " + arg1+ ");";
			default:
				return null;
		}
	}
}


class SymbolTable {

	public static final int NOT_IN_SYMBOL_TABLE = -1;

	public ArrayList<String> names;
	public ArrayList<Integer> types;
	public ArrayList<Boolean> arrays;

	public SymbolTable() {
		names = new ArrayList<>();
		types = new ArrayList<>();
		arrays = new ArrayList<>();
	}

	public int lookUp(String name) {
		return names.indexOf(name);
	}

	public boolean addToSymbolTable(String name, int type, boolean array) {
		if (lookUp(name) == -1) {
			names.add(name);
			types.add(type);
			arrays.add(array);
			return true;
		}
		return false;
	}

	@Override
    public String toString() {
        if(names.size() == 0)
            return null;
        String res = "";
        for(int i = 0; i < names.size(); i++) {
            switch (types.get(i)) {
                case EVal.TYPE_CODE_INTEGER:
                    res += "\t" + YYParser.TYPE_STRING_INTEGER;
                    break;
                case EVal.TYPE_CODE_REAL:
                    res += "\t" + YYParser.TYPE_STRING_REAL;
                    break;
                case EVal.TYPE_CODE_CHAR:
                    res += "\t" + YYParser.TYPE_STRING_CHAR;
                    break;
                case EVal.TYPE_CODE_BOOLEAN:
                    res += "\t" + YYParser.TYPE_STRING_BOOLEAN;
                    break;
                case EVal.TYPE_CODE_RANGE:
                    continue;
            }
            res += (arrays.get(i) ? " *" : " ") + names.get(i) + ";\n";
        }
        return res;
	}

}







 
 
 
 

 
 
 
