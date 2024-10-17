import comportement.*;

public class Sniper extends Personnage{
//contructeur
        //default
    public Sniper(){
        this.espritCombatif = new CombatSniper();
    }
        //paramtres
    public Sniper(EspritCombatif_if esprit, Soin_if soin, Deplacement_if deplacement){
        super(esprit, soin, deplacement);
    }


    // public void combattre(){
    //     //System.out.println("J'utilise mon fusil à lunette");
    //     if(this.armes.equals("fusil à pompe")){
    //         System.out.println("Attaque au fusil à pompe");
    //     }
    //     else{
    //         System.out.println("Je me sers de mon fusil à lunette");
    //     }
    // }
    // public void seDeplacer(){
    //     System.out.println("Je me deplace à pied");
    // }    
}
