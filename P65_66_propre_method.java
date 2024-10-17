public class P65_66_propre_method {
    public static void main(String args[])
    {
        System.out.println(arrondi(10, 5));
    }
    public static double arrondi(double A, int B){
    return (double) ((int) (A * Math.pow(10, B) +.5) / Math.pow(10,B));
    }    
}
