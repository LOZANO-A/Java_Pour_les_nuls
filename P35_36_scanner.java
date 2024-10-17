import java.util.Scanner;

public class P35_36_scanner{
    public static void main(String[] args) {
        Scanner scs = new Scanner(System.in);
        System.out.println("Veuillez saisir un mot :");
        String str = scs.nextLine(); 
        System.out.println("Vous avez saisi : " + str);


        Scanner scn = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre");
        int nb = scn.nextInt();
        System.out.println("Vous avez saisi le nombre : " + nb);

    }
}