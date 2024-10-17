import java.util.Enumeration;
import java.util.Hashtable;

public class Hash_table {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable<>();
        ht.put(1, "Printemps");
        ht.put(10, "Été");
        ht.put(12,"Automne");
        ht.put(45, "Hiver");

        Enumeration e = ht.elements();

        while(e.hasMoreElements())
            System.out.println(e.nextElement());
    }
    
}
