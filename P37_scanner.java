import java.util.Scanner;

public class P37_scanner{
    public static void main(String[] args) {
        /*
        Scanner sc1 = new Scanner(System.in);
        int i = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        double d = sc2.nextDouble();

        Scanner sc3 = new Scanner(System.in);
        byte b = sc3.nextByte();
        */

        System.out.println("Saisir une lettre : ");
        Scanner sc4 = new Scanner(System.in);
        String str = sc4.nextLine();
        char carac = str.charAt(0);
        System.out.println("Vous avez saisi le caractère : " + carac);

    }
}