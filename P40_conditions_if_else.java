public class P40_conditions_if_else {
    public static void main(String[] args) {
        //sans accolade => une seule ligne
        int i=10;
        if(i<0) System.out.println("le nombre est négatif");
        else System.out.println("le nombre est positif");

        //avec accolade => plusieurs lignes
        int j = 0;
        if(j<0)
        {
            System.out.println("ce nombre est négatif");
        }
        else
        {
            if(j ==0)
            {
                System.out.println("nombre nul");
            }
            else
            {
                System.out.println("nombre positif");
            }
        }

        //avec else if
        int k = 0;
        if(k<0)
        {
            System.out.println("négatif");
        }
        else if(k>0)
        {
            System.out.println("positif");
        }
        else
        {
            System.out.println("null");
        }
    }
}
