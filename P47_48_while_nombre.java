public class P47_48_while_nombre {
    public static void main (String args[])
    {
        int a=1, b=15;
        while(a<b)
        {
            System.out.println("Coucou1 "+a+" fois");
            a++;
        }


        a=1;
        b=15;
        while(a++ < b)
        {
            System.out.println("Hello "+a+" fois");
        }


        a=1;
        b=15;
        while(++a < b)
        {
            System.out.println("Salut "+a+" fois");
        }
    }
}
