public class mainVille {
    public static void main(String args[]){

//Page 71-74 : Constructeurs ####################################################################################################
        /*Ville ville = new Ville();
        Ville ville1 = new Ville("Marseille", 123456789, "France");
        //Ville ville2 = new Ville(12345, "France", "Lille"0;)


        System.out.println(ville.nomVille);
        ville.nomVille = "la tete a toto";
        System.out.println(ville.nomVille);

        Ville ville3 = new Ville("Marseille", 123456789, "France");
        ville3.nomVille = "la tete a tutu";
        System.out.println(ville3.nomVille);*/

//Page 75-77 : Assesseurs et Mutateurs ##########################################################################################
        // Ville v1 = new Ville();
        // Ville v2 = new Ville("Marseille", 500, "France");
        // Ville v3 = new Ville("Rio",10_000,"Brésil");

        // System.out.println("\n v1= "+v1.getNom() +" ville de "+v1.getNbHab()+ " habitants, se situant en "+v1.getNomPays());
        // System.out.println("\n v2= "+v2.getNom() +" ville de "+v2.getNbHab()+ " habitants, se situant en "+v2.getNomPays());
        // System.out.println("\n v3= "+v3.getNom() +" ville de "+v3.getNbHab()+ " habitants, se situant en "+v3.getNomPays()+"\n\n");
    
    //echage de valeur avec tampon
    //     Ville temp = new Ville();
    //     temp = v2;
    //     v2=v3;
    //     v3=temp;

    //     System.out.println("\n v2= "+v2.getNom() +" ville de "+v2.getNbHab()+ " habitants, se situant en "+v2.getNomPays());
    //     System.out.println("\n v3= "+v3.getNom() +" ville de "+v3.getNbHab()+ " habitants, se situant en "+v3.getNomPays()+"\n\n");
    
    //echange avec mutateurs
    //     v2.setNom("HongKong");
    //     v3.setNom("Djibouti");

    //     System.out.println("\n v2= "+v2.getNom() +" ville de "+v2.getNbHab()+ " habitants, se situant en "+v2.getNomPays());
    //     System.out.println("\n v3= "+v3.getNom() +" ville de "+v3.getNbHab()+ " habitants, se situant en "+v3.getNomPays()+"\n\n");

//P79-80 : Méthode ##############################################################################################################
        // Ville V = new Ville("Lyon", 654, "france");
        // Ville V2 = new Ville("Lille", 123, "France");
        // System.out.println(V.comparer(V2));

        // System.out.println("\n\n"+v2.decrisToi());
        // System.out.println(v1.decrisToi());
        // System.out.println(v3.decrisToi()+"\n\n");
        // System.err.println(v2.comparer(v3));

//P81-82 : Variables de classes ##########################################################################################
        // Ville v1 = new Ville();
        // System.out.println("le nombre d'instances de la classe Ville est : "+Ville.nbrInstances);
        // System.out.println("le nombre d'instances Bis de la classe Ville est : "+ Ville.getNbreInstanceBis());

        // Ville v2 = new Ville("Marseille", 500, "France");
        // System.out.println("le nombre d'instances de la classe Ville est : "+Ville.nbrInstances);
        // System.out.println("le nombre d'instances Bis de la classe Ville est : "+ Ville.getNbreInstanceBis());

        // Ville v3 = new Ville("Rio",10_000,"Brésil");   
        // System.out.println("le nombre d'instances de la classe Ville est : "+Ville.nbrInstances);
        // System.out.println("le nombre d'instances Bis de la classe Ville est : "+ Ville.getNbreInstanceBis());

//P84-87 : Héritage ##########################################################################################
        // Capitale cap = new Capitale();
        // System.out.println(cap.decrisToi());

        //Capitale cap1 = new Capitale("Paris",654987,"France","La Tour Eiffel");
        // System.out.println("\n"+cap1.decrisToi());

//P88-92 : Polymorphisme #####################################################################################
        Ville[] tableau = new Ville[6];
        String[] tab = {"Marseille", "Lille","Caen","Lyon","Paris","Nantes"};
        int[] tab2 = {0,1_000,10_000,100_000,500_000,1_000_000};
    //ajoute des villes et des capitales dans un tableau
        // for(int i =0; i<6;i++)
        // {
        //     if(i<3)
        //     {
        //         Ville V = new Ville(tab[i], tab2[i], "France");
        //         tableau[i]=V;
        //     }
        //     else
        //     {
        //         Capitale C = new Capitale(tab[i], tab2[i], "France", "La Tour Eiffel");
        //         tableau[i] = C;
        //     }
        // }
    //affiche le contenu du tableau de ville et capitale
        // for(Ville V : tableau)
        // {
        //     System.out.println(V.decrisToi()+"\n");
        // }

        // for(Object obj : tableau){
        //     System.out.println(obj.toString()+"\n");
        // }
        
        // Ville v = new Ville("Bordeaux", 800_000, "France");
        // System.out.println(v+"\n");
        // System.out.println(v.toString()+"\n");
//P93-94 : classe Object #######################################################################################


//P136-141 : exceptions ########################################################################################
        //Ville v = new Ville("Rennes", 12000,"France");
        // Ville v = null;
        // try{
        //     //Ville v = new Ville("Rennes", 12000,"France");
        //     v = new Ville("Rennes", 12000,"France");
        //     System.out.println(v.toString());
        // }catch (NombreHabitantExceptions e){}
        // finally{
        //     if(v==null)
        //         v = new Ville();
        // }
        // System.out.println(v.toString());


    //     Ville v = null;
    //     try{
    //         v = new Ville("Re", 12000, "France");
    //     }
    // //exception du nombre habitant
    //     catch (NombreHabitantExceptions e){
    //         e.printStackTrace();
    //     }
    // //exception nom ville
    //     catch(NomVilleException e2){
    //         System.out.println(e2.getMessage());
    //     }
    //     finally{
    //         if(v==null)
    //             v=new Ville();
    //     }
    //     System.out.println(v.toString());


        Ville v = null;
        try{
            v=new Ville("Re",12000, "France");
        }
        catch(NombreHabitantExceptions | NomVilleException e2){
            System.out.println(e2.getMessage());
        }
        finally{
            if(v==null)
                v=new Ville();
        }
        System.out.println(v.toString());
    }

    
}
