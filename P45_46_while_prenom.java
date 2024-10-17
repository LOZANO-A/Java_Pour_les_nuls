import java.util.Scanner;

public class P45_46_while_prenom {
    public static void main (String args[])
    {
        String prenom;

        char reponse = 'O';

        Scanner sc = new Scanner(System.in);

        while(reponse == 'O')
        {
            System.out.println("Saisir un prenom :");
            prenom =  sc.nextLine();
            System.out.println("Bonjour " + prenom + ", ça va ?");

        //reinitialisation de la variable de reponse
            reponse = ' ';
        //force la saisie reponse de 'O' ou 'N'
            while(reponse != 'O' && reponse != 'N')
            {
                System.out.println("Continuer ? (O/N)");
    //recupere le premier caractère et l'assigne à la reponse
    //recupre la chaine de caractère puis le premier caractère
                reponse = sc.nextLine().charAt(0);
            }
        }
        System.out.println("Au revoir");
    }
}
