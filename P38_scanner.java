import java.util.Scanner;

public class P38_scanner {
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Saississez un entier : ");
        int i = sc1.nextInt();
        System.out.println("Saississez une chaîne : ");
        String str1 = sc1.nextLine();
        System.out.println("FIN !");


        Scanner sc2 = new Scanner(System.in);
        System.out.println("Saisir un entier : ");
        int j = sc2.nextInt();
        System.out.println("Saisir une chaine : ");
        //on vide la ligne avant de lire la suivante
        sc2.nextLine();
        String str2 = sc2.nextLine();
        System.out.println("FIN !");
    }   
}
