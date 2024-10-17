public class P50_for {
    public static void main(String args[]){
        for(int i =1; i<=10; i++)
        {
            System.out.println("Ligne "+i);
        }


        for(int i=10; i>=0; i--)
        {
            System.out.println("il reste "+i+" lignes");
        }


        for(int i=0 , j=2;(i<10 && j<6);i++,j=+2)
        {
            System.out.println("i = "+i+" j = "+j);
        }
    }
}
