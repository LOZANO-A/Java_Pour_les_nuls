import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class main {
    public static void main(String[] args) {
        ObjectInputStream ois;
        ObjectOutputStream oos;

        try {
            oos = new ObjectOutputStream(
                    new BufferedOutputStream(
                        new FileOutputStream(
                            new File("game.txt")
                        )
                    )
                );
            oos.writeObject(new Game("Assassin's Creed", "Aventure", 44.99));
            oos.writeObject(new Game("Tomb Raider", "plateforme", 39.99));
            oos.writeObject(new Game("TETRIS", "Stratégie", 14.99));

            oos.close();

            ois= new ObjectInputStream(
                    new BufferedInputStream(
                        new FileInputStream(
                            new File("game.txt")
                        )
                    )
                );

            try {
                    System.out.println("Affichage des jeux :");
                    System.out.println("*************************\n");
                    System.out.println(((Game)ois.readObject()).toString());
                    System.out.println(((Game)ois.readObject()).toString());
                    System.out.println(((Game)ois.readObject()).toString());
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
    
}
