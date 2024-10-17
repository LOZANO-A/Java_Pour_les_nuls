import comportement.*;

public class Civil extends Personnage {
//Constructeur
        //default
    public Civil(){}
        //paramètre
    public Civil(EspritCombatif_if esprit, Soin_if soin, Deplacement_if deplacement){
        super(esprit, soin, deplacement);
    }






    // public void combattre(){
    // //     System.out.println("Je ne combat PAS");
    //     if(this.armes.equals("couteau")){
    //         System.out.println("Attaque au couteau");
    //     }
    //     else{
    //         System.out.println("Je ne combat PAS");
    //     }
    // }
    // public void seDeplacer(){
    //     System.out.println("Je me deplace à pied");
    // }    
}
