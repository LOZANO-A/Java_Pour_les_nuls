import java.util.Objects;   //P93-94 : classe Objects 

public class Ville {
    /*
//Page 71-74 : Constructeurs ###############################################################################################################
    String nomVille;
    String nomPays;
    int nbHab;

    public Ville(){
        System.out.println("création d'une ville");
        this.nomVille = "inconnnu";
        this.nomPays = "inconnu";
        this.nbHab = 0;
    }

    public Ville(String pNom, int nbHab, String nPays){
        System.out.println("creation d'une ville avec paramètres");
        this.nomVille = pNom;
        this.nbHab = nbHab;
        this.nomPays =nPays;
    }

//Page 75-77 : Assesseurs et Mutateurs ####################################################################################################
//############# ASSESSEURS ############# Permet de récupere une information d'un objet
    public String getNom(){
        return this.nomVille;
    }

    public String getNomPays(){
        return this.nomPays;
    }
    
    public int getNbHab(){
        return this.nbHab;
    }

//############ Mutateurs ############## Permet de mofidier une partie d'un objet
    public void setNom(String pNom){
        this.nomVille = pNom;
    }

    public void setPays(String pPays){
        this.nomPays= pPays;
    }

    public void setHab(int nbr){
        this.nbHab = nbr;
    }
    */
//P78 - 80 : Les méthodes ##############################################################################################################
    // private String nomVille;
    // private String nomPays;
    // private int nbHab;
    // private char categorie;

    // public Ville(){
    //     System.out.println("création d'une ville");
    //     this.nomVille = "inconnnu";
    //     this.nomPays = "inconnu";
    //     this.nbHab = 0;
    //     this.setCategorie();
    // }

    // public Ville(String pNom, int nbHab, String nPays){
    //     System.out.println("creation d'une ville avec paramètres");
    //     this.nomVille = pNom;
    //     this.nbHab = nbHab;
    //     this.nomPays =nPays;
    //     this.setCategorie();
    // }

//Assesseur
    //retourne ville
    public String getNom(){
        return this.nomVille;
    }
    //retourne nom pays
    public String getNomPays(){
        return this.nomPays;
    }
    //retourne nb hab
    public int getNbHab(){
        return this.nbHab;
    }
    //retourne categorie
    public char getCategorie(){
        return categorie;
    }
//Mutateurs
    //defini nom ville
    public void setNom(String pNom){
        this.nomVille = pNom;
    }
    //defini pays
    public void setPays(String pPays){
        this.nomPays= pPays;
    }
    //defini nb hab
    public void setHab(int nbr){
        this.nbHab = nbr;
        this.setCategorie();
    }

    //Définir la categorie de la ville
    public void setCategorie(){
        int BorneSup[]={0, 1_000, 10_000, 100_000, 500_000, 1_000_000, 5_000_000, 10_000_000};
        char categorie[]={'?','A','B','C','D','E','F','G','H'};

        int i =0;
        while(i<BorneSup.length && this.nbHab>BorneSup[i]){
            i++;
        }
        this.categorie=categorie[i];
    }
    //retourne description ville
    public String decrisToi(){
        return (/*"\t"+*/this.nomVille+ " est une ville de "+this.nomPays+", elle comporte "+this.nbHab+" habitant(s), elle est donc de catégorie "+ this.categorie);
    }

    //retourne comparaison
    public String comparer(Ville v){
        String str = new String();

        if(v.getNbHab() > this.nbHab)
        {
            str=v.getNom()+" est une ville plus peuplée que "+this.nomVille;
        }
        else{
            str=this.nomVille+" est une ville plus peuplée que "+v.getNom();
        }
        return str;
    }
//P81-82 : Variables de classes ############################################################################################################
    // public static int nbrInstances = 0;
    // private static int nbrInstancesBis = 0;

    public Ville(){
        //System.out.println("création d'une ville");
        this.nomVille = "Inconnnu";
        this.nomPays = "Inconnu";
        this.nbHab = 0;
        this.setCategorie();
        nbrInstances++;
        nbrInstancesBis++;
    }

    // public Ville(String pNom, int pNbre, String pPays){
    //    // System.out.println("creation d'une ville avec paramètres");
    //     this.nomVille = pNom;
    //     this.nbHab = pNbre;
    //     this.nomPays =pPays;
    //     this.setCategorie();
    //     nbrInstances++;
    //     nbrInstancesBis++;
    // }

    public static int getNbreInstanceBis(){
        return nbrInstancesBis;
    }
//P83-87 : Héritage #######################################################################
    protected String nomVille;
    protected String nomPays;
    protected int nbHab;
    protected char categorie;
    public static int nbrInstances = 0;
    protected static int nbrInstancesBis = 0;
//P88-92 : polymorphisme #######################################################################################
    public String toString(){
        return ("\t"+this.nomVille+" est une ville de "+this.nomPays+", elle comporte "+this.nbHab+(" habitanst, elle est donc de catégorie "+this.categorie));
    }

    // public int hashCode(){
    //     final int prime = 31;
    //     int result =1;
    //     result = prime*result+categorie;
    //     result=prime*result+nbHab;
    //     result=prime*result+((nomPays==null)?0:nomPays.hashCode());
    //     result=prime*result+((nomVille==null)?0:nomVille.hashCode());
    //     return result;
    // }

    // public boolean equals(Object obj){
    // //compare les reference
    //     if(this==obj)
    //         return true;
    // //verifie si l'objet en paramètre est nul
    //     if(obj==null)
    //         return false;
    // //verifie le meme type
    //     if(getClass() != obj.getClass())
    //         return false;
    // //compare les attribue
    //     Ville other = (Ville) obj;
    //     if(this.categorie != other.categorie)
    //         return false;

    //     if(this.nbHab != other.nbHab)
    //         return false;

    //     if(this.nomPays == null)
    //     {
    //         if(other.nomPays != null)
    //             return false;
    //     }
    //     else if(!nomPays.equals(other.nomPays))
    //         return false;

    //     if (this.nomVille==null)
    //     {
    //         if (other.nomVille!=null)
    //             return false;
    //     }
    //     else if(!nomVille.equals(other.nomVille))
    //         return false;
        
    //     return true;
    // }
//P93-94 : classe Object #######################################################################################
    public int hashCode()
    {
        return Objects.hash(categorie, nbHab, nomPays, nomVille);
    }

    public boolean equals(Object obj)
    {
    //compare les references
        if(this==obj)
            return true;
    //compare le type
        if(this.getClass() != obj.getClass())
            return false;
    //compare les attribut
        Ville other = (Ville) obj;
        return Objects.equals(other.getCategorie(), this.getCategorie())
        && Objects.equals(other.getNom(), this.getNom())
        && Objects.equals(other.getNbHab(), this.getNbHab())
        && Objects.equals(other.getNomPays(), this.getNomPays());
    }

//P136-141 : Exception ######################################################################
    
    //public Ville(String pNom, int pNbre, String pPays)
        // throws NombreHabitantExceptions
        // {
        //     if(pNbre < 0)
        //         throw new NombreHabitantExceptions();
        //     else
        //     {
        //         nbrInstances++;
        //         nbrInstancesBis++;

        //         nomVille=pNom;
        //         nomPays=pPays;
        //         nbHab=pNbre;
        //         this.setCategorie();
        //     }
        // }


        // throws NombreHabitantExceptions{
        //     if(pNbre <0)
        //         throw new NombreHabitantExceptions(pNbre);
        //     else
        //     {
        //         nbrInstances++;
        //         nbrInstancesBis++;

        //         nomVille=pNom;
        //         nomPays=pPays;
        //         nbHab=pNbre;
        //         this.setCategorie();
        //     }
        // }
    
    public Ville(String pNom, int pNbre, String pPays) throws NombreHabitantExceptions,NomVilleException{
        if(pNbre<0)
            throw new NombreHabitantExceptions(pNbre);
        if(pNom.length()<3)
            throw new NomVilleException("Le nom de la ville est inférieur à trois caractères : nom = "+pNom);
        else
            {
                nbrInstances++;
                nbrInstancesBis++;

                nomVille=pNom;
                nomPays=pPays;
                nbHab=pNbre;
                this.setCategorie();
            }
    }
        
}
