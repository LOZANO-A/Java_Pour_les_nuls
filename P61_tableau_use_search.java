public class P61_tableau_use_search{
    public static void main(String args[]){
        int nbPre[][]={{0,2,4,6,8},{1,3,5,7,9}};
        for(int i =0;i<2;i++)
        {
            for(int j =0; j<5;j++)
            {
                System.out.print(nbPre[i][j]);
            }
            System.out.println("");
        }



        String tab[] = {"toto","titi","tutu","tete","tata"};
        for(String str : tab){
            System.out.println(str);
        }



        String tab2[][] = {{"toto","titi","tutu","tete","tata"},{"1","2","3","4"}};
        int i =0, j=0;
        for(String sousTab[] : tab2)
        {
            i=0;
            for(String str : sousTab)
            {
                System.out.println("valeur nouvelle boucle : "+str);
                System.out.println("valeur tableau avec incide ["+j+"]["+i+"] est : "+ tab2[j][i]);
                i++;
            }
            j++;
        }
    }
}