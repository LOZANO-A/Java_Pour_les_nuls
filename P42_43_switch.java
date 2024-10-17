public class P42_43_switch {
    public static void main (String args[])
    {
        int note =10;

        switch (note)
        {
            case 0:
                System.out.println("Ouch");
            break;

            case 10:
                System.out.println("juste la moyenne");
            break;

            case 20:
                System.out.println("Parfait");
            break;

            default:
                System.out.println("il faut travailler plus");
        }

        String chaine = "Bonjour";
        switch(chaine)
        {
            case("Bonjour"):
                System.out.println("Bonjour M.");
            break;

            case("Bonsoir"):
                System.out.println("Bonsoir M.");
            break;

            default:
                System.out.println("BoNjOiR M.");
        }
    }
}
