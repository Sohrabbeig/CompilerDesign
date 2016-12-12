



%token Real_const number_error BoolConst greater_than greater_equal not_equal equal less_equal less_than square_bracket_left square_bracket_right curly_brace_left curly_brace_right parenthesis_left parenthesis_right semicolon comma colon dot AND_THEN OR_ELSE OR AND NOT IF ELSE SWITCH END CASE DEFAULT WHILE RETURN BREAK RECORD Static INT REAL BOOL CHAR plus_assign minus_assign multiply_assign divide_assign question_mark modulo division multiply minus plus assignment NUMCONST ID Fake_id WhiteSpace  CHARCONST	THEN plus_plus minus_minus



%code {
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
	
	

	



}



%left OR OR_ELSE
%left AND AND_THEN
%left equal not_equal
%left less_than greater_than less_equal greater_equal
%left plus minus
%left modulo
%left multiply division
%right NOT
%nonassoc THEN
%nonassoc ELSE


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
		System.out.printf("Rule 41 localDeclarations : localDeclarations : localDeclarations scopedVarDeclaration  \n") ;
	};







| empty  /*   |    lamda   */


{
		System.out.printf("Rule 42 localDeclarations  :  /*   |    lamda   */\n") ;
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






selectionStmt : IF parenthesis_left simpleExpression parenthesis_right statement %prec THEN



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
  


| mutable plus_assign expression




  
  {
		System.out.printf("Rule 59 expression :mutable '+' '=' expression \n") ;
	};
  



| mutable minus_assign expression



  {
		System.out.printf("Rule 60 expression : mutable '-' '=' expression \n") ;
	};
  





|  mutable multiply_assign expression



  {
		System.out.printf("Rule 61 expression :  mutable '*' '=' expression \n") ;
	};
  





| mutable divide_assign expression



  {
		System.out.printf("Rule 62 expression :  mutable '/' '=' expression \n") ;
	};
  




| mutable plus_plus



  {
		System.out.printf("Rule 63 expression :mutable '+' '+'  \n") ;
	};





| mutable minus_minus




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



mathlogicExpression : mathlogicExpression plus mathlogicExpression


 {
		System.out.printf("Rule 81 mathlogicExpression : mathlogicExpression mathop mathlogicExpression   \n") ;
	};

|mathlogicExpression minus mathlogicExpression


  {
 		System.out.printf("Rule 81 mathlogicExpression : mathlogicExpression mathop mathlogicExpression   \n") ;
 	};

|mathlogicExpression multiply mathlogicExpression


  {
 		System.out.printf("Rule 81 mathlogicExpression : mathlogicExpression mathop mathlogicExpression   \n") ;
 	};

|mathlogicExpression division mathlogicExpression


  {
 		System.out.printf("Rule 81 mathlogicExpression : mathlogicExpression mathop mathlogicExpression   \n") ;
 	};

|mathlogicExpression modulo mathlogicExpression


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
		$$ = new EVal();
		((EVal)$$).place = $1.place;
		((EVal)$$).type = $1.type;

		
		
		
		
		
	};
 
 
 
 
 | BoolConst



 
 {
		System.out.printf("Rule 105  constant : BoolConst  \n") ;
	};
	
	
empty:

{
		System.out.printf("Rule 106 empty:   \n") ;
	};
	

 
 
 %%
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







 
 
 
 

 
 
 