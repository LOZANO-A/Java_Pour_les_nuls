public class P67_propre_methode {
    public static void main(String[] args) 
    {
        String[] tab = {"toto","tata","titi","tete"};
        parcourirTab(tab);
        System.out.println(toString(tab));
    }


    static void parcourirTab(String[] tab)
    {
        for(String str : tab)
        {
            System.out.println(str);
        }
    }



    static String toString(String[] tab)
    {
        System.out.println(("Methode toString() \n---------"));
        String retour ="";

        for(String str : tab){
            retour += str + "\n";
        }
        return retour;
    }
}
