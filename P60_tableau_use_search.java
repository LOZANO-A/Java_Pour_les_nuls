public class P60_tableau_use_search {
    public static void main(String args[]){
        // String[] str = new String[10];
        // str[10] = "une Exception";

        int nbPremiers[][] = { {0,2,4,6,8},{1,3,5,7,9} };
        int i=0, j=0;
        while(i<2)
        {
            j=0;
            while(j<5)
            {
                System.out.print(nbPremiers[i][j]);
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}
