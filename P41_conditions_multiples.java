public class P41_conditions_multiples {
    public static void main (String args[])
    {
        int i = 58;
        if(i<100 && i>50)
        {
            System.out.println("présent dans l'intervalle");
        }
        else
        {
            System.out.println("pas présent dans  intervalle");
        }


        int j = 58;
        if(j<100 && j>100)
        {
            System.out.println("dans l'intervalle");
        }
        else
        {
            System.out.println("hors intervalle");
        }


        int k = 58;
        if(k<100 || k>100)
        {
            System.out.println("dedans");
        }
        else
        {
            System.out.println("dehors");
        }
    }
}
