import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class Main {

    public static void main(String[] args) {


        FileReader fr = null;
        try {
            fr = new FileReader("test.txt");
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }



        Yylex yylex=new Yylex(fr);
        YYParser yyParser=new YYParser(yylex);
        try {
            yyParser.parse();
        } catch (IOException e) {
            e.printStackTrace();
        }


//        Yylex lexer=new Yylex(fr);
//        YYParser yyParser=new YYParser(lexer);
//        yyParser.parse();

//		 ylex = new Yylex(fr);
//		try {
//			ylex.yylex();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
    }

}
