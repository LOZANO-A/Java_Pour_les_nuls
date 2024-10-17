
import java.net.InterfaceAddress;
import java.security.AlgorithmConstraints;
import java.util.ArrayList;

public class Base_Main {
    public static void main(String args[]){
//P152
        // Solo val = new Solo(12);
        // int nbre = val.getValeur();

//P154
    //fonctionnel avec entier
        Solo<Integer> val = new Solo<Integer>(12);
        int nbre = val.getValeur();
    //non fonctionnel avec string
        //Solo<Integer> val2 = new Solo<Integer>("toto");
        //int nbre2 = val2.getValeur();
    //non fonctionnle avec flottant
        //Solo<Integer> val3 = new Solo<Integer>(12);
        //val.setValeur(12.2f);
    
    //test différent types de valeur
        // Solo<Integer> valI = new Solo<Integer>();
        // Solo<String> valS = new Solo<String>("TOT");
        // Solo<Float> valF = new Solo<Float>(12.2f);
        // Solo<Double> valD = new Solo<Double>(12.36421368);


        int i = new Integer(12);
        double d = new Double(12.2586);

        Double d = 12.0;
        Character c ='C';
        al = new ArrayList<>();

        al.add(12);

    }
}
