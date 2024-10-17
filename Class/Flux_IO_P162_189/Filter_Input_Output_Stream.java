import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filter_Input_Output_Stream {
    public static void main(String[] args) {
//P168 - Lecture ###################################################################################################
    //     FileInputStream fis;
    //     BufferedInputStream bis;
    //     try{
    //         fis=new FileInputStream(new File("test.txt"));
    //         bis=new BufferedInputStream(new FileInputStream(new File("test.txt")));
    //         byte[] buf = new byte[8];
    //     //recupere heure systeme
    //         long startTime = System.currentTimeMillis();
    // //Boucle File input
    //         while(fis.read(buf)!=-1);
    //     //affiche temps d'execution
    //         System.out.println("Temps de lecture FileInputStream : "+(System.currentTimeMillis()-startTime));
    //     //reinitalisation
    //         startTime = System.currentTimeMillis();
    // //boucle Buffer
    //         while(bis.read(buf)!=-1);
    //     //réaffiche
    //         System.out.println("Temps de lecture avec BufferedInputStream : "+(System.currentTimeMillis()-startTime));
    //     //fermeture flux
    //         fis.close();
    //         bis.close();
    //     }catch(FileNotFoundException e){
    //         e.printStackTrace();
    //     }catch(IOException e){
    //         e.printStackTrace();
    //     }

//P169 - Lecture + Ecriture ###################################################################################################
        // FileInputStream fis;
        // FileOutputStream fos;
        // BufferedInputStream bis;
        // BufferedOutputStream bos;
        // try {
        //     fis = new FileInputStream(new File("test.txt"));
        //     fos = new FileOutputStream(new File("test2.txt"));
        //     bis = new BufferedInputStream(new FileInputStream(new
        //     File("test.txt")));
        //     bos = new BufferedOutputStream(new FileOutputStream(new
        //     File("test3.txt")));
        //     byte[] buf = new byte[8];
        // //On récupère le temps du système
        //     long startTime = System.currentTimeMillis();
        //     while(fis.read(buf) != -1){
        //         fos.write(buf);
        //     }
        // //On affiche le temps d'exécution
        //     System.out.println("Temps de lecture + écriture avec FileInputStream et FileOutputStream : " +(System.currentTimeMillis() - startTime));
        // //On réinitialise
        //     startTime = System.currentTimeMillis();
        //     while(bis.read(buf) != -1){
        //         bos.write(buf);
        //     }
        //     System.out.println("Temps de lecture + écriture avec BufferedInputStream et BufferedOutputStream : " +(System.currentTimeMillis() - startTime));
        // //On ferme nos flux de données
        //     fis.close();
        //     bis.close();
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
//P170 - creation fichier + lecture ##################################################################################
        DataInputStream dis;
        DataOutputStream dos;
        try {
            dos = new DataOutputStream(
                new BufferedOutputStream(
                    new FileOutputStream(
                        new File("P170-171.txt")
                    )
                )
            );
            dos.writeBoolean(true);
            dos.writeByte(100);
            dos.writeChar('C');
            dos.writeDouble(12.05);
            dos.writeFloat(100.52f);
            dos.writeInt(1024);
            dos.writeLong(123456789654321L);
            dos.writeShort(2);
            dos.close();

            dis = new DataInputStream(
                new BufferedInputStream(
                    new FileInputStream(
                        new File("P170-171.txt")
                    )
                )
            );

            System.out.println(dis.readBoolean());
            System.out.println(dis.readByte());
            System.out.println(dis.readChar());
            System.out.println(dis.readDouble());
            System.out.println(dis.readFloat());
            System.out.println(dis.readInt());
            System.out.println(dis.readLong());
            System.out.println(dis.readShort());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

