import comportement.CombatCouteau;
import comportement.CombatPistolet;
import comportement.Operation;

public class main {
    public static void main(String args[]){
        //Personnage[] tPers = {new Guerrier(), new Chirurgien(), new Medecin(), new Civil(), new Sniper()};
        // String[] tArmes = {"pistolet", "pistolet", "couteau", "fusil à pompe","couteau"};

        // for(int i=0; i<tPers.length;i++){
        //     System.out.println("\nInstance de "+tPers[i].getClass().getName());
        //     System.out.println("******************************************");
        //     tPers[i].combattre();
        //     tPers[i].setArmes(tArmes[i]);
        //     tPers[i].combattre();
        //     tPers[i].seDeplacer();
        //     tPers[i].soigner();
        // }

    //P131
        Personnage[] tPers = {new Guerrier(), new Civil(), new Medecin(), new Chirurgien(), new Sniper()};

        for(int i =0; i<tPers.length; i++){
            System.out.println("\nInstance de "+tPers[i].getClass().getName());
            System.out.println("******************************************");
            tPers[i].combattre();
            tPers[i].seDeplacer();
            tPers[i].soigner();
        }

        // Personnage pers = new Guerrier();
        // pers.soigner();
        // pers.setSoin(new Operation());
        // pers.soigner();
        

    }
    
}
