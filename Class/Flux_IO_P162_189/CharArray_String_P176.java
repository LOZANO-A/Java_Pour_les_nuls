import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class CharArray_String_P176{
    public static void main(String args[]){
        CharArrayWriter caw = new CharArrayWriter();
        CharArrayReader car;

        try{
            caw.write("coucou les zeros");
            System.out.println(caw);
            caw.close();

            car = new CharArrayReader(caw.toCharArray());
            int i;
            String str="";
    //ajoute les caract lu dans le tableau
            while((i=car.read())!= -1)
                str+=(char)i;
    //affiche le tableau        
            System.out.println(str);
        }catch(IOException e){
            e.printStackTrace();
        }



        StringWriter sw = new StringWriter();
        StringReader sr;
        try {
            sw.write("Coucou les Zéros2");
            System.out.println(sw);
            sw.close();
            sr = new StringReader(sw.toString());
            int i ;
            String str = "";
    //ajoute les string lu dans un tableau
            while(( i = sr.read()) != -1)
                str += (char) i;
    //affiche le tableau        
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


