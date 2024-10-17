public class Chien extends Canin implements interface_P112_115_Rintintin{

    public Chien(){
    }
    public Chien(String couleur, int poids){
        this.couleur=couleur;
        this.poids=poids;
    }

    void crier(){
        System.out.println("j'aboie sans raison");
    }

    //interface
    public void faireCalin(){
        System.out.println("Je fais des câlins");
    }

    public void faireLeBeau(){
        System.out.println("Je fais le beau");
    }
    public void faireLechouille(){
        System.out.println("Je fais des léchouilles");
    }
}
