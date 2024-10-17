import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Print_W_R_P177 {
    public static void main(String[] args) {
        File file = new File("testFileWriter_P177.txt");
        FileWriter fw;
        FileReader fr;

        try{
    //crée l'obj écriture
            fw = new FileWriter(file);
            String str="Bjr à tous amis zéros";
            str+="\tComment va ?";
        //ecris la chaine
            fw.write(str);
        //Ferme le flux
            fw.close();
            
    //crée l'obj lecture
            fr = new FileReader(file);
            str="";
            int i =0;

            while((i=fr.read())!=-1)
                str+=(char)i;

            System.out.println(str);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
