import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//P164-167
public class File_Input_Output_Stream {
    public static void main(String args[])
    {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            fis = new FileInputStream( new File("test.txt"));
            fos = new FileOutputStream("test2.txt");
        //tableua de byte pour indiquer la qte lue
            byte[] buf = new byte[8];
        // entier pour affecter résultat de la lecture
            int n =0;
        //boucle pour affecter dans variable tant lecture possible
            while((n=fis.read(buf))>=0){
            //ecrit dans fichier 2
                fos.write(buf);
            //affiche la valeur lu au format byte et char
                for(byte bit : buf){
                    System.out.println("\t"+bit+"("+(char)bit +")");
                    System.out.println("");
                }
            //réinitialisation buffer
                buf = new byte[8];
            }
            System.out.println("Copie terminée");
        //exception si fichier introuvable
        }catch(FileNotFoundException e){
            e.printStackTrace();
        //exception si erreur de lecture/ecriture
        }catch(IOException e){
            e.printStackTrace();
        }finally{
        //fermeture des flux de données dans tt les cas
            try {
                if(fis!=null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fos!=null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
