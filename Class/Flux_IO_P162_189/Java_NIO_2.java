import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Java_NIO_2 {
    public static void main(String args[]){
        Path path = Paths.get("test.txt");
        System.out.println("Chemin absolu du ficher : "+path.toAbsolutePath());
        System.out.println("Existe ? "+Files.exists(path));
        System.out.println("Nom du fichier : "+path.getFileName());
        System.out.println("Répertoire ? "+Files.isDirectory(path));


        Iterable<Path> roots = FileSystems.getDefault().getRootDirectories();
        for(Path chemin : roots){
            System.out.println(chemin);
            try(DirectoryStream<Path> listing = Files.newDirectoryStream(chemin)){
                int i =0;
                for(Path nom : listing){
                    System.out.println("\t\t"+((Files.isDirectory(nom))? nom + "/" : nom));
                    i++;
                    if(i%4 ==0) System.out.println("\n");
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }


    //copie de fichier
        Path source = Paths.get("test.txt");
        Path cible = Paths.get("test2.txt");
        try {
            Files.copy(source, cible, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) { 
                e.printStackTrace(); 
            }

    //deplacement fichier
        Path source2 = Paths.get("test2.txt");
        Path cible2 = Paths.get("test3.txt");
        try {
            Files.move(source, cible, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) { 
                e.printStackTrace(); 
            }
    //supprime fichier
        Path cible3 = Paths.get("test3.txt");
        try {
            Files.delete(cible3);
        } catch (IOException e) {
            e.printStackTrace();
        }

    //crer new fichier
        Path cible4 = Paths.get("test4.txt");
        try {
            Files.createFile(cible4);
        } catch (IOException e) {
            e.printStackTrace();
        }
    //gerer ZIP
        try (FileSystem zipFS = FileSystems.newFileSystem(Paths.get("monFichier.txt"),null)){
            Files.deleteIfExists(zipFS.getPath("test.txt"));

            Path path2 = zipFS.getPath("nouveau.txt");
            String message = "Hello World";
            Files.write(path2,message.getBytes());

            try(DirectoryStream<Path> stream = Files.newDirectoryStream(zipFS.getPath("/"))){
                for(Path entry : stream){
                    System.out.println(entry);
                }
            }

            Files.copy(Paths.get("fichierSurDisque.txt"),zipFS.getPath("fichierDansZIP.txt"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
