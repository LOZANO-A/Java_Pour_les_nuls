public class Capitale extends Ville {
//P84-87 : Heritage ################################################################
    private String monument;

    public Capitale(){
    //    this.nomVille = "toto";  
        super();
        monument ="Aucun";
    }

    public Capitale(String nom, int hab, String pays, String monument){
        super(nom, hab, pays);
        this.monument = monument;
    }
    //retourne descrition de la capitale
    public String decrisToi(){
        String str = super.decrisToi() + "\n\t ==>> "+ this.monument + " est un monument";
        //System.out.println("Invocation de super.decrisToi()");
        return str;
    }
    //renvoie le monument
    public String getMonument(){
        return monument;
    }
    //défini le monument de la capitale
    public void setMonument(String monument){
        this.monument = monument;
    }
//P88-92 : polymorphisme #######################################################################################

    public String toString(){
        String str = super.toString()+" ==> "+this.monument+" est un monument";
        return str;
    }

 //P93-94 : classe Object #######################################################################################
   





}
