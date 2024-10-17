import java.util.Scanner;

public class P52_TP_Celsius_Fahrenheit {
    public static void main(String[] args) {

        double temp, newTemp= 0.0f;
        char rep ='O';
        char mode=' ';
        Scanner sc = new Scanner(System.in);
        System.out.println("CONVERTISSEUR DEGRES CELSIUS ET DEGRES FAHRENHEIT");
        System.out.println("-------------------------------------------------");

        do //BOUCLE PRINCIPALE
        { 
            do //BOUCLE CHOIX DU MODE
            { 
            //menu de choix
                System.out.println("Choisissez votre mode :");
                System.out.println("1 - Convertisseur Celsius vers Fahrenheit");
                System.out.println("2 - Convertisseur Fahrenheit vers Celsius");
            //recupère le menu
                mode = sc.nextLine().charAt(0);
            } while (mode != '1' && mode != '2');


            //temperature à convertir
            System.out.println("Température à convertir :");
                //recupere la saisi
            temp = sc.nextDouble();

            //conversion temperature
            if(mode == '1')  //verification du mode
            {
                newTemp = ((9.0/5.0)*temp)+32.0;
                System.out.println(temp + "°C correspond a "+newTemp + "°F.");
            }
            else
            {
                newTemp = ((temp - 32.0)*5.0)/9.0;                    
                System.out.println(temp + "°F correspond a "+newTemp + "°C.");
            }

            do //BOUCLE CHOIX SUIVANT
            { 
                System.out.println("Souhaitez vous convertir une autre valeur ? (O/N)");
                sc.nextLine();
                rep = sc.nextLine().charAt(0);
            } while (rep != 'O' && rep != 'N');
            sc.nextLine();
        } while (rep == 'O');
        System.out.println("Au revoir");
    }
}