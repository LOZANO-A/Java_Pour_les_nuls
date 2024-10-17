
public class P32_conv {
    public static void main(String[] args) {
        int nbr1=3, nbr2=2;
        double resultat=(double)(nbr1/nbr2);
        System.out.println("Le résulatat est : " + resultat);


        int nbr3 = 3, nbr4=2;
        double resultat2 = (double)(nbr1)/(double)(nbr2);
        System.out.println("Le résultat 2 est : " + resultat2);

        
//converti int en string
        int i =12;
        String j = new String();
        j = j.valueOf(i);
        System.out.println(j);


//converti int -> string -> int
        int k = 13;
        String l = new String();
        l = l.valueOf(k);
        System.out.println(l);
        int m = Integer.valueOf(l).intValue();
        System.out.println(m);
    }
}
