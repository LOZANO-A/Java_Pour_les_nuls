import java.util.ArrayList;
import java.util.List;

public class main3 {
//P157 - Générécité et collections
    public static void main(String[] args) {
        System.out.println("Liste de String");
        System.out.println("---------------");
        
        List<String> listeString=new ArrayList<String>();
        listeString.add("une chaine");
        listeString.add("une autre");
        listeString.add("Encore une autre");
        listeString.add("une derniere");

        for(String str : listeString){
            System.out.println(str);
        }


        System.out.println("Liste de Float");
        System.out.println("--------------");

        List<Float> listeFloat = new ArrayList<Float>();
        listeFloat.add(12.25f);
        listeFloat.add(15.25f);
        listeFloat.add(2.25f);
        listeFloat.add(128764.25f);

        for(Float f :listeFloat){
            System.out.println(f);
        }
    }
}
