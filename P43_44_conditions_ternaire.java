public class P43_44_conditions_ternaire {
    public static void main (String args[])
    {
        int x = 10, y=20;
        int max = (x<y) ? x:y;
        //si x<y alors max = x SINON max = y
        System.out.println(max);


        int i = 10, j=20;
        int max2 = (x<y) ? x*2 : y*2;
        //si x<y alors max = 2x SINON max = 2y
        System.out.println(max2);


        int k = 10, l=20;
        int max3 = (k<l) ? (l<10) ? l%10 : l*2 : k;
        //si k<l alors
            //si l<10 alors 
                //l%10 
            //sinon l*2
        //sinon k
        int max4 = (k<l) ? ((l<10) ? l%10 : l*2) : k;
        System.out.println(max4);
    }
}