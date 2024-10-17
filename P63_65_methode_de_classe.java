public class P63_65_methode_de_classe {
    public static void main(String args[]){
    //passage en minuscule
        String chaine = new String("COUcou Tt Le MONde");
        String chaine2 = new String();
        chaine2=chaine.toLowerCase();
        System.out.println(chaine +" = "+ chaine2);


    //passage majuscule
        String chaine3 = new String();
        chaine3=chaine.toUpperCase();
        System.out.println(chaine+" = "+chaine3);


    //longueur
        int longueur = 0;
        longueur = chaine.length();
        System.out.println("longueur : "+longueur);


    //egalité
        String str = new String("Hello");
        if(chaine.equals(str)){
            System.out.println("same");
        }    
        else{
            System.out.println("different");
        }


    //différence
        String str2 = new String("Hello");
        if(!chaine.equals(str)){
            System.out.println("différent");
        }    
        else{
            System.out.println("same");
        }

        


    //recuperation caract en position i
        String nbr = new String("123456");
        char carac = nbr.charAt(4);
        System.out.println(carac);



    //enlever carcr
        String chaine4 = new String("la paix niche");
        String chaine4moins = new String();
        //extrait les caractère 3 a 13 dans une nouvelle chaine
        chaine4moins=chaine4.substring(3,13);
        System.out.println(chaine4moins);



    //index
        String mot = new String("anticonstitutionnellement");
        int n =0;
        n=mot.indexOf('t');
        System.out.println(n);
        n=mot.lastIndexOf('t');
        System.out.println(n);
        n=mot.indexOf("ti");
        System.out.println(n);
        n=mot.lastIndexOf("ti");
        System.out.println(n);



    //math
        double X =0.0;
        X=Math.random();

        double sin = Math.sin(120);
        System.out.println(sin);
    
        double cos = Math.sin(120);
        System.out.println(cos);

        double tan = Math.sin(120);
        System.out.println(tan);

        double abs = Math.sin(-120.25);
        System.out.println(abs);
        //puissance
        double d =2;
        double exp = Math.pow(d,2);
        System.out.println(exp);
    
    }
}
