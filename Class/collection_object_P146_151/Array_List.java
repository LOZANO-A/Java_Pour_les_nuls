import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(12);
        al.add("une chaine de caractère");
        al.add(12.20f);
        al.add('d');

        for(int i=0; i<al.size(); i++)
            System.out.println("Donnes à l'indice "+ i +" = "+al.get(i));
    }
}
