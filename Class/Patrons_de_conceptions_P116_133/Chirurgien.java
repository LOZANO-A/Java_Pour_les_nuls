import comportement.*;

public class Chirurgien extends Personnage{
//contructeur
        //default
    public Chirurgien(){
        this.soin = new Operation();
    } 
        //parametre
    public Chirurgien(EspritCombatif_if esprit, Soin_if soin, Deplacement_if deplacement){
        super(esprit, soin, deplacement);
    }




    // public void combattre(){
    //     System.out.println("Je ne combats PAS");
    // }
    // public void seDeplacer(){
    //     System.out.println("Je me deplace à pied");
    // }
    // public void soigner(){
    //     //System.out.println("Je fais des opérations");
    //     if(this.sacDeSoin.equals("gros sac")){
    //         System.out.println("Je fais des merveilles");
    //     }
    //     else{
    //         System.out.println("Je fais des opérations");
    //     }
    // }
} 