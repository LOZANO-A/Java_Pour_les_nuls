import comportement.*;

public class Medecin extends Personnage {
//constructeur
        //default
    public Medecin(){
        this.soin = new PremierSoin();
    }
        //parametre
    public Medecin(EspritCombatif_if esprit, Soin_if soin,Deplacement_if deplacement){
        super(esprit,soin,deplacement);
    }



    // public void combattre(){
    //     //System.out.println("Vive le scalpel");
    //     if(this.armes.equals("pistolet")){
    //         System.out.println("Attaque au pistolet");
    //     }
    //     else{
    //         System.out.println("Vive le scalpel");
    //     }
    // }
    // // public void seDeplacer(){
    // //     System.out.println("Je me déplace à pied");
    // // }
    // public void soigner(){
    //     //System.out.println("Je soigne les blessures");
    //     if(this.sacDeSoin.equals("petit sac")){
    //         System.out.println(("je peux recoudre des blessures"));
    //     }
    //     else{
    //         System.out.println("Je soigne les blessures");
    //     }
    // }
}
