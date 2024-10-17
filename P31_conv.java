public class P31_conv{
    public static void main(String[] args) {
        int i = 123;
        float j = (float)i;
        System.out.println(j);

        double k = (double)i;
        System.out.println(k);


        double l = 1.33;
        double m = 2.99999999;

        int o = (int)l;
        System.out.println(o);
        o = (int)m;
        System.out.println(o);
        
        
        double nbr1 = 10, nbr2 = 3;
        int resultat = (int)(nbr1/nbr2);
        System.out.println("Le résultat est : " + resultat);


        int nbr3 = 3, nbr4 = 2;
        double resultat2 = (double)(nbr1/nbr2);
        System.out.print("Le résultat 2 est : " + resultat2);
    }
}