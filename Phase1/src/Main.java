import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Main {

    public static void main(String[] args) {
        Yylex ylex;
        FileReader fr = null;
        try {
            fr = new FileReader("test.txt");
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

//     try {
//          parser p = new parser(new Yylex(fr));
//          Object result = p.parse().value;
//        } catch (Exception e) {
//

        ylex = new Yylex(fr);
        try {
            ylex.yylex();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}