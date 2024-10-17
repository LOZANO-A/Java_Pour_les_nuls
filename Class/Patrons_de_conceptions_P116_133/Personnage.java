import comportement.AucunSoin;
import comportement.Deplacement_if;
import comportement.EspritCombatif_if;
import comportement.Marcher;
import comportement.Pacifiste;
import comportement.Soin_if;

public abstract class Personnage{
//attributs ########################################################""
    //protected String armes="", chaussures="", sacDeSoin="";
    protected EspritCombatif_if espritCombatif = new Pacifiste();
    protected Soin_if soin = new AucunSoin();
    protected Deplacement_if deplacement = new Marcher();

//Constructeur ####################################################""
    //default
public Personnage(){};
    //avec paramètres
public Personnage(EspritCombatif_if esprit, Soin_if soin, Deplacement_if deplacement){
    this.espritCombatif = esprit;
    this.soin = soin;
    this.deplacement = deplacement;
}

//Méthodes ########################################################""
        //méthiode deplacement
    public /*abstract */ void seDeplacer(){
        //System.out.println("Je me déplace à pied");
        deplacement.deplacer();
    }

        //methode combat
    public /*abstract*/ void combattre(){
        //System.out.println("Je ne combat PAS");
        espritCombatif.combat();
    }

        //methode soin
    public void soigner(){
        //System.out.println("Je ne soigne pas");
        soin.soigne();
    }

//Mutateurs ########################################################""
    // protected void setArmes(String armes) {
    //     this.armes = armes;
    // }
    // protected void setChaussures(String chaussures) {
    //     this.chaussures = chaussures;
    // }
    // protected void setSacDeSoin(String sacDeSoin) {
    //     this.sacDeSoin = sacDeSoin;
    // }

    public void setEspritCombatif(EspritCombatif_if esprit){
        this.espritCombatif = esprit;
    }
    public void setSoin(Soin_if soin){
        this.soin = soin;
    }
    public void setDeplacement(Deplacement_if deplacement){
        this.deplacement =deplacement;
    }
}