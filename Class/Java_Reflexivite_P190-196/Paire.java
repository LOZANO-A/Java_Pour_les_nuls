public class Paire {
//attributs
    private String val1,val2;
//constructeurs
    public Paire(){
        this.val1=null;
        this.val2=null;
        System.out.println("Instanciation");
    }
    public Paire(String v1, String v2){
        this.val1=v1;
        this.val2=v2;
        System.out.println("Instanciation avec param");
    }
//toString
    public String toString(){
        return "Je suis un obj avec pour valeur : "+this.val1+" - "+this.val2;
    }
//Getteurs
    public String getVal1(){
        return this.val1;
    }
    public String getVal2(){
        return this.val2;
    }
//Setteurs
    public void setVal1(String val){
        this.val1=val;
    }
    public void setVal2(String val){
        this.val2=val;
    }
}
