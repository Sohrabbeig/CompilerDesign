



%token Real_const number_error BoolConst greater_than greater_equal not_equal equal less_equal less_than square_bracket_left square_bracket_right curly_brace_left curly_brace_right parenthesis_left parenthesis_right semicolon comma colon dot AND_THEN OR_ELSE OR AND NOT IF ELSE SWITCH END CASE DEFAULT WHILE RETURN BREAK RECORD Static INT REAL BOOL CHAR plus_assign minus_assign multiply_assign divide_assign question_mark modulo division multiply minus plus assignment NUMCONST ID Fake_id WhiteSpace  CHARCONST	THEN

<<<<<<< HEAD


=======
>>>>>>> 0d4218834c01dcf4c87a748573f5ca5b3b43b58e
%left OR OR_ELSE
%left AND AND_THEN
%left equal not_equal
%left less_than greater_than less_equal greater_equal
<<<<<<< HEAD
%left plus minus
%left modulo
%left multiply division
%right NOT
%nonassoc THEN
%nonassoc ELSE

=======
%left '+' '-'
%left '%'
%left '*' '/'
%right NOT
%nonassoc THEN
%nonassoc ELSE
>>>>>>> 0d4218834c01dcf4c87a748573f5ca5b3b43b58e

%%


program : declarationList

{
		System.out.printf("Rule 1 program : declarationList\n") ;
	};


declarationList : declarationList declaration 
{
		System.out.printf("Rule 2 declarationList : declarationList declaration \n") ;
	};





| declaration
{
		System.out.printf("Rule 3 declarationList : declaration\n") ;
	};



declaration : varDeclaration 

{
		System.out.printf("Rule 4 declaration : varDeclaration \n") ;
	};





| funDeclaration 

{
		System.out.printf("Rule 5 declaration :  funDeclaration\n") ;
	};




| recDeclaration


{
		System.out.printf("Rule 6 declaration :  recDeclaration\n") ;
	};



recDeclaration : RECORD ID curly_brace_left localDeclarations curly_brace_right


{
		System.out.printf("Rule 7 recDeclaration : RECORD ID '{' localDeclarations \n") ;
	};



varDeclaration : typeSpecifier varDeclList semicolon


{
		System.out.printf("Rule 8 varDeclaration : typeSpecifier varDeclList ';'\n") ;
	};






scopedVarDeclaration : scopedTypeSpecifier varDeclList semicolon


{
		System.out.printf("Rule 9 scopedVarDeclaration : scopedTypeSpecifier varDeclList ';'\n") ;
	};





varDeclList : varDeclList comma varDeclInitialize



{
		System.out.printf("Rule 10 varDeclList : varDeclList ',' varDeclInitialize\n") ;
	};



 | varDeclInitialize
 
 
 
{
		System.out.printf("Rule 11 varDeclList : varDeclInitialize \n") ;
	};




varDeclInitialize : varDeclId 

 
{
		System.out.printf("Rule 11' varDeclInitialize : varDeclId  \n") ;
	};





| varDeclId colon simpleExpression



 
{
		System.out.printf("Rule 12 varDeclInitialize :   varDeclId ':' simpleExpression\n") ;
	};







varDeclId : ID 


{
		System.out.printf("Rule 13 varDeclId : ID \n") ;
	};





| ID square_bracket_left NUMCONST square_bracket_right

{
		System.out.printf("Rule 14 varDeclId :  ID  NUMCONST ']' \n") ;
	};





scopedTypeSpecifier : Static typeSpecifier 


{
		System.out.printf("Rule 15 varDeclId :  scopedTypeSpecifier : Static typeSpecifier\n") ;
	};





| typeSpecifier




{
		System.out.printf("Rule 16 varDeclId : typeSpecifier \n") ;
	};





typeSpecifier : returnTypeSpecifier  




{
		System.out.printf("Rule 17 typeSpecifier : returnTypeSpecifier  \n") ;
	};









returnTypeSpecifier : INT 




{
		System.out.printf("Rule 19 returnTypeSpecifier : INT \n") ;
	};




| REAL 



{
		System.out.printf("Rule 20 returnTypeSpecifier : REAL \n") ;
	};




| BOOL 



{
		System.out.printf("Rule 21 returnTypeSpecifier :  BOOL\n") ;
	};







| CHAR




{
		System.out.printf("Rule 22 returnTypeSpecifier :  CHAR\n") ;
	};







funDeclaration : typeSpecifier ID parenthesis_left params parenthesis_right statement 


{
		System.out.printf("Rule 23 funDeclaration : typeSpecifier ID '(' params ')' statement \n") ;
	};




| ID parenthesis_left params parenthesis_right statement



{
		System.out.printf("Rule 24 funDeclaration : ID '(' params ')' statement\n") ;
	};




params : paramList 

{
		System.out.printf("Rule 25 params : paramList \n") ;
	};




| /*   lamda  */

{
		System.out.printf("Rule 26 params : /*   lamda  */\n") ;
	};






paramList : paramList semicolon paramTypeList 

{
		System.out.printf("Rule 27 paramList : paramList ';' paramTypeList \n") ;
	};




| paramTypeList



{
		System.out.printf("Rule 28 paramList : paramTypeList \n") ;
	};







paramTypeList : typeSpecifier paramIdList



{
		System.out.printf("Rule 29 paramTypeList : typeSpecifier paramIdList\n") ;
	};





paramIdList : paramIdList comma paramId 



{
		System.out.printf("Rule 30 paramIdList : paramIdList ',' paramId \n") ;
	};





| paramId



{
		System.out.printf("Rule 31 paramIdList : paramId \n") ;
	};






paramId : ID 




{
		System.out.printf("Rule 32 paramId : ID  \n") ;
	};
 





| ID square_bracket_left square_bracket_right


{
		System.out.printf("Rule 33 paramId : ID '[' ']'\n") ;
	};
 







statement : expressionStmt 




{
		System.out.printf("Rule 34 statement : expressionStmt \n") ;
	};
 



| compoundStmt 




{
		System.out.printf("Rule 35 statement : compoundStmt \n") ;
	};
 




| selectionStmt 


{
		System.out.printf("Rule 36 statement : selectionStmt \n") ;
	};
 



| iterationStmt




{
		System.out.printf("Rule 37 statement : iterationStmt \n") ;
	};
 


 |  returnStmt 
 
 
 
{
		System.out.printf("Rule 38 statement : returnStmt \n") ;
	};
 
 
 
 
 | breakStmt




{
		System.out.printf("Rule 39 statement : breakStmt \n") ;
	};
 


 compoundStmt : curly_brace_left localDeclarations statementList curly_brace_right
 
 
 
 {
		System.out.printf("Rule 40 compoundStmt : '{' localDeclarations statementList '}'\n") ;
	};

 
 
 
 
 
localDeclarations : localDeclarations scopedVarDeclaration  


 {
		System.out.printf("Rule 41 compoundStmt : localDeclarations : localDeclarations scopedVarDeclaration  \n") ;
	};







|  /*   |    lamda   */


{
		System.out.printf("Rule 42 compoundStmt :  /*   |    lamda   */\n") ;
	};






statementList : statementList statement   

{
		System.out.printf("Rule 43 statementList : statementList statement   \n") ;
	};



	
|	 /* |   lamda  */


{
		System.out.printf("Rule 44 statementList :  /* |   lamda  */ \n") ;
	};


expressionStmt : expression semicolon 


{
		System.out.printf("Rule 45 expressionStmt : expression ';' \n") ;
	};




| semicolon
 
 

{
		System.out.printf("Rule 46 expressionStmt : ';' \n") ;
	};






<<<<<<< HEAD
selectionStmt : IF parenthesis_left simpleExpression parenthesis_right statement %prec THEN
=======
selectionStmt : IF '(' simpleExpression ')' statement %prec THEN
>>>>>>> 0d4218834c01dcf4c87a748573f5ca5b3b43b58e



{
		System.out.printf("Rule 47 selectionStmt : IF '(' simpleExpression ')' statement \n") ;
	};



| IF parenthesis_left simpleExpression parenthesis_right statement
ELSE statement 





{
		System.out.printf("Rule 48 selectionStmt : IF '(' simpleExpression ')' statement ELSE statement  \n") ;
	};





| SWITCH parenthesis_left simpleExpression parenthesis_right caseElement defaultElement END



{
		System.out.printf("Rule 49 selectionStmt : SWITCH '(' simpleExpression ')' caseElement defaultElement END \n") ;
	};





caseElement : CASE NUMCONST colon statement semicolon 



{
		System.out.printf("Rule 50 selectionStmt : caseElement : CASE NUMCONST : statement ; \n") ;
	};



| caseElement CASE NUMCONST colon statement semicolon



{
		System.out.printf("Rule 51 selectionStmt : caseElement CASE NUMCONST : statement ;\n") ;
	};


defaultElement : DEFAULT colon statement semicolon    



{
		System.out.printf("Rule 52 defaultElement : DEFAULT ':' statement ';'    \n") ;
	};




 |  /*lamda     */




{
		System.out.printf("Rule 53 defaultElement : /*lamda     */\n") ;
	};



 iterationStmt : WHILE parenthesis_left simpleExpression parenthesis_right statement
 
 

{
		System.out.printf("Rule 54 iterationStmt : WHILE '(' simpleExpression ')' statement\n") ;
	};
 
 
 
 
  returnStmt : RETURN semicolon 
  
  
  {
		System.out.printf("Rule 55  returnStmt : RETURN ';' \n") ;
	};
  
  
  
  | RETURN expression semicolon
  
  
    
  {
		System.out.printf("Rule 56  returnStmt : RETURN expression ';'\n") ;
	};
  
  
  
  
  
breakStmt : BREAK semicolon


   
  {
		System.out.printf("Rule 57  breakStmt : BREAK ';'\n") ;
	};
  
  
   
   
   
   
   
expression : mutable assignment expression 



  
  {
		System.out.printf("Rule 58 expression : mutable '=' expression \n") ;
	};
  


<<<<<<< HEAD
| mutable plus_assign expression
=======
| mutable "+=" expression
>>>>>>> 0d4218834c01dcf4c87a748573f5ca5b3b43b58e




  
  {
		System.out.printf("Rule 59 expression :mutable '+' '=' expression \n") ;
	};
  



<<<<<<< HEAD
| mutable minus_assign expression
=======
| mutable "-=" expression
>>>>>>> 0d4218834c01dcf4c87a748573f5ca5b3b43b58e



  {
		System.out.printf("Rule 60 expression : mutable '-' '=' expression \n") ;
	};
  





<<<<<<< HEAD
|  mutable multiply_assign expression
=======
|  mutable "*=" expression
>>>>>>> 0d4218834c01dcf4c87a748573f5ca5b3b43b58e



  {
		System.out.printf("Rule 61 expression :  mutable '*' '=' expression \n") ;
	};
  





<<<<<<< HEAD
| mutable divide_assign expression
=======
| mutable "/=" expression
>>>>>>> 0d4218834c01dcf4c87a748573f5ca5b3b43b58e



  {
		System.out.printf("Rule 62 expression :  mutable '/' '=' expression \n") ;
	};
  




| mutable "++"



  {
		System.out.printf("Rule 63 expression :mutable '+' '+'  \n") ;
	};





| mutable "--"




  {
		System.out.printf("Rule 64 expression :  mutable '-' '-'  \n") ;
	};



|  simpleExpression





  {
		System.out.printf("Rule 66 expression : simpleExpression \n") ;
	};
  










simpleExpression : simpleExpression OR simpleExpression 





  {
		System.out.printf("Rule 67 simpleExpression : simpleExpression OR simpleExpression \n") ;
	};
  





| simpleExpression AND simpleExpression 



  {
		System.out.printf("Rule 68 simpleExpression : simpleExpression AND simpleExpression  \n") ;
	};





| simpleExpression OR_ELSE simpleExpression



  {
		System.out.printf("Rule 69 simpleExpression : simpleExpression OR ELSE simpleExpression  \n") ;
	};




| simpleExpression AND_THEN simpleExpression




  {
		System.out.printf("Rule 70 simpleExpression : simpleExpression AND THEN simpleExpression  \n") ;
	};



| NOT simpleExpression 



  {
		System.out.printf("Rule 71 simpleExpression :NOT simpleExpression \n") ;
	};



| relExpression



  {
		System.out.printf("Rule 72 simpleExpression : relExpression \n") ;
	};




relExpression : mathlogicExpression relop mathlogicExpression 



  {
		System.out.printf("Rule 73 relExpression : mathlogicExpression relop mathlogicExpression \n") ;
	};




| mathlogicExpression


  {
		System.out.printf("Rule 74 relExpression : mathlogicExpression\n") ;
	};








relop : less_equal 




  {
		System.out.printf("Rule 75 relop : less_equal \n") ;
	};





| less_than 




  {
		System.out.printf("Rule 76 relop : less_than \n") ;
	};



| greater_than 



  {
		System.out.printf("Rule 77 relop : greater_than \n") ;
	};



| greater_equal 




  {
		System.out.printf("Rule 78 relop : greater_equal \n") ;
	};



| equal 




  {
		System.out.printf("Rule 79 relop : equal \n") ;
	};



| not_equal




  {
		System.out.printf("Rule 80 relop : not_equal \n") ;
	};



<<<<<<< HEAD
mathlogicExpression : mathlogicExpression plus mathlogicExpression
=======
mathlogicExpression : mathlogicExpression '+' mathlogicExpression
>>>>>>> 0d4218834c01dcf4c87a748573f5ca5b3b43b58e


 {
		System.out.printf("Rule 81 mathlogicExpression : mathlogicExpression mathop mathlogicExpression   \n") ;
	};

<<<<<<< HEAD
|mathlogicExpression minus mathlogicExpression
=======
|mathlogicExpression '-' mathlogicExpression
>>>>>>> 0d4218834c01dcf4c87a748573f5ca5b3b43b58e


  {
 		System.out.printf("Rule 81 mathlogicExpression : mathlogicExpression mathop mathlogicExpression   \n") ;
 	};

<<<<<<< HEAD
|mathlogicExpression multiply mathlogicExpression
=======
|mathlogicExpression '*' mathlogicExpression
>>>>>>> 0d4218834c01dcf4c87a748573f5ca5b3b43b58e


  {
 		System.out.printf("Rule 81 mathlogicExpression : mathlogicExpression mathop mathlogicExpression   \n") ;
 	};

<<<<<<< HEAD
|mathlogicExpression division mathlogicExpression
=======
|mathlogicExpression '/' mathlogicExpression
>>>>>>> 0d4218834c01dcf4c87a748573f5ca5b3b43b58e


  {
 		System.out.printf("Rule 81 mathlogicExpression : mathlogicExpression mathop mathlogicExpression   \n") ;
 	};

<<<<<<< HEAD
|mathlogicExpression modulo mathlogicExpression
=======
|mathlogicExpression '%' mathlogicExpression
>>>>>>> 0d4218834c01dcf4c87a748573f5ca5b3b43b58e


  {
 		System.out.printf("Rule 81 mathlogicExpression : mathlogicExpression mathop mathlogicExpression   \n") ;
 	};



| unaryExpression

 {
		System.out.printf("Rule 82 mathlogicExpression : unaryExpression\n") ;
	};






unaryExpression : unaryop unaryExpression 




{
		System.out.printf("Rule 88 unaryExpression : unaryop unaryExpression  \n") ;
	};





| factor




{
		System.out.printf("Rule 89 unaryExpression : factor  \n") ;
	};










unaryop : minus 





{
		System.out.printf("Rule 90 unaryop : '-'   \n") ;
	};





| multiply 




{
		System.out.printf("Rule 91 unaryop : '*'  \n") ;
	};






| question_mark



{
		System.out.printf("Rule 92 unaryop : '?'  \n") ;
	};





factor : immutable 


{
		System.out.printf("Rule 93 factor : immutable   \n") ;
	};





| mutable



{
		System.out.printf("Rule 94 factor : mutable   \n") ;
	};






mutable : ID 



{
		System.out.printf("Rule 95 mutable : ID  \n") ;
	};





| mutable square_bracket_left expression square_bracket_right 



{
		System.out.printf("Rule 96 mutable : mutable '[' expression ']'  \n") ;
	};





| mutable dot ID


{
		System.out.printf("Rule 97 mutable :  mutable '.' ID  \n") ;
	};








immutable : parenthesis_left expression parenthesis_right 



{
		System.out.printf("Rule 98 immutable : '(' expression ')' \n") ;
	};



| call 




{
		System.out.printf("Rule 99 immutable : call \n") ;
	};





| constant





{
		System.out.printf("Rule 100 immutable : constant \n") ;
	};







call : ID parenthesis_left args parenthesis_right




{
		System.out.printf("Rule 101 call : ID '(' args ')' \n") ;
	};








args : argList 




{
		System.out.printf("Rule 102 args : argList  \n") ;
	};





|  /* | lamda    */
 
 
 
{
		System.out.printf("Rule 103 args : /* | lamda    */  \n") ;
	};

 
 
 
argList : argList comma expression 



{
		System.out.printf("Rule 104 argList : argList ',' expression \n") ;
	};

 





| expression
  
  
  



{
		System.out.printf("Rule 105 argList : expression \n") ;
	};
  
  
  
  
  
 constant : NUMCONST 
 
 
 
 {
		System.out.printf("Rule 105  constant : NUMCONST  \n") ;
	};
 
 
 
 
 | Real_const 
 
 
 {
		System.out.printf("Rule 105  constant : Real_const  \n") ;
	};
 
 
 
 
 
 
 | CHARCONST 
 
 
 
 {
		System.out.printf("Rule 105  constant : CHARCONST  \n") ;
	};
 
 
 
 
 | BoolConst



 
 {
		System.out.printf("Rule 105  constant : BoolConst  \n") ;
	};
 
 
 %%
 

 
 
 