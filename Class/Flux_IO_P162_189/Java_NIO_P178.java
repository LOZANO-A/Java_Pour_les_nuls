import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Java_NIO_P178 {
    public static void main(String[] args) {
        FileInputStream fis;
        BufferedInputStream bis;
        FileChannel fc;

        try{
            fis=new FileInputStream(new File("test_P178.txt"));
            bis=new BufferedInputStream(fis);

            long time = System.currentTimeMillis();

            while(bis.read() != -1);

            System.out.println("Temps exécution avec buffer classique : "+(System.currentTimeMillis()-time));

            fis=new FileInputStream(new File("test_P178.txt"));
            fc = fis.getChannel();

            int size = (int)fc.size();
            ByteBuffer bBuff = ByteBuffer.allocate(size);

            time = System.currentTimeMillis();
            fc.read(bBuff);
            bBuff.flip();

            System.out.println("Temps exécution avec buffer : "+(System.currentTimeMillis()-time));

            byte[] tabByte = bBuff.array();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}