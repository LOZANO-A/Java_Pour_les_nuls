import comportement.*;

public class Guerrier extends Personnage{
//constructeur
        //default
    public Guerrier(){
        this.espritCombatif = new CombatPistolet();
    }
        //paramèteres
    public Guerrier(EspritCombatif_if esprit, Soin_if soin, Deplacement_if deplacement){
        super(esprit, soin, deplacement);
    }


    // public void combattre(){
    //     //System.out.println("Fusil, pistolet, couteau ! J'ai tout ce qu'il faut");
    //     if(this.armes.equals("pistolet")){
    //         System.out.println("Attaque au couteau");
    //     }
    //     else if(this.armes.equals("fusil à lunette sniper")){
    //         System.out.println("attaque au fusil sniper");
    //     }
    //     else{
    //         System.out.println("attaque au couteau");
    //     }

    // }
    // public void seDeplacer(){
    //     System.out.println("Je me deplace a pied");
    // }
}
