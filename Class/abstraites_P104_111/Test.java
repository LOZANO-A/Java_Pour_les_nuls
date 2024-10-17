public class Test {
    public static void main(String args[]){
        Loup l = new Loup("Gris bleuté", 56);
        l.boire();
        l.manger();
        l.deplacement();
        l.crier();
        System.out.println(l.toString());

        //methode chien
        Chien c = new Chien("Gris", 26);
        c.boire();
        c.manger();
        c.deplacement();
        c.crier();
        System.out.println(c.toString());
        //interace chien
        c.faireCalin();
        c.faireLeBeau();
        c.faireLechouille();
        //polymorphisme
        interface_P112_115_Rintintin r = new Chien();
        r.faireCalin();
        r.faireLeBeau();
        r.faireLechouille();
    }

}