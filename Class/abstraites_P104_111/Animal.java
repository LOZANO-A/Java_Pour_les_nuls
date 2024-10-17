abstract class Animal{
    protected int poids;
    protected String couleur;

    protected void manger(){
        System.out.println("je mange de la viande");
    }
    protected void boire(){
        System.out.println("Je bois de l'eau");
    }
    abstract void crier();
    abstract void deplacement();

    public String toString(){
        String str = ("Je suis un objet de la "+this.getClass()+", je suis "+this.couleur+", je pèse "+this.poids+"kg");
        return str;
    }
}