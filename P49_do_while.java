import java.util.Scanner;

public class P49_do_while {
    public static void main(String arg[]){
        String prenom = new String();
        char reponse = ' ';

        Scanner sc = new Scanner(System.in);

        do { 
            System.out.println("Saisir prénom :");
            prenom = sc.nextLine();
            System.out.println("Bonjour "+prenom+" , ça va ?");
            do{
                System.out.println("Continuer ? (O/N)");
                reponse = sc.nextLine().charAt(0);
            }while(reponse != 'O' && reponse != 'N');
        } while (reponse == 'O');

        System.out.println("Au revoir.");
    }
}
