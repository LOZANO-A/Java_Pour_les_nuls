import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Linked_List{
    public static void main(String[] args) {
        List l = new LinkedList();
        l.add(12);
        l.add("toto ! ! ");
        l.add(12.20f);

        for(int i=0; i<l.size();i++){
            System.out.println("Element à l'index "+i+" = "+l.get(i));
        //parcours avec itérateur
            System.out.println("\n\t Parcours avec un itérateur");
            ListIterator li = l.listIterator();

            while(li.hasNext())
                System.out.println(li.next());
        }
    }
}