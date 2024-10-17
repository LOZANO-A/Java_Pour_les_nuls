public class Solo<T>{
    private T valeur;
//Constructeurs
        //default
    public Solo(){
        this.valeur=null;
    }
        //parametre
    public Solo(T val){
        this.valeur = val;
    }
//setteur
    public void setValeur(T val){
        this.valeur=val;
    }
//getteur
    public T getValeur(){
        return this.valeur;
    }
}