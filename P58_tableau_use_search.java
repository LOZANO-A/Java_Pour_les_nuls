import java.util.Scanner;

public class P58_tableau_use_search {
    public static void main(String args[]){
        char tableauCaract[] = {'a','b','c','d','e','f','g'};
        for(int i =0; i<tableauCaract.length; i++)
        {
            System.out.println("A l'emplacement "+i+" du tableau nous avons "+tableauCaract[i]);
        }





        int i =0;
        char reponse =' ', carac =' ';
        Scanner sc = new Scanner(System.in);

        do{
            do{
                i =0;
                System.out.println("Saisir une lettre minuscule");

                carac = sc.nextLine().charAt(0);

                while(i < tableauCaract.length && carac != tableauCaract[i]){
                    i++;
                }

                if(i<tableauCaract.length){
                    System.out.println("la lettre "+carac+" est présente dans la tableau");
                }
                else{
                    System.out.println("la lettre "+carac+" est absente dans la tableau");
                }
            }while(i>tableauCaract.length);

            do{
                System.out.println("Réessayer ? (O/N)");
                reponse = sc.nextLine().charAt(0);
            }while(reponse != 'N' && reponse != 'O');
        }while(reponse=='O');

        System.out.println("Au revoir");
    }
}
