public class Duo<T,S>{
//P155
    private T valeur1;
    private S valeur2;
//constructeurs #######################
    public Duo(){
        this.valeur1=null;
        this.valeur2=null;
    }
    public Duo(T val1, S val2){
        this.valeur1=val1;
        this.valeur2=val2;
    }
//Setteur
    public void setValeurs(T val1, S val2){
        this.valeur1=val1;
        this.valeur2=val2;
    }
    public void setValeur1(T val1){
        this.valeur1=val1;
    }
    public void setValeur2(S val2){
        this.valeur2=val2;
    }
//getteurs
    public T getValeur1(){
        return this.valeur1;
    }
    public S getValeur2(){
        return this.valeur2;
    }
}