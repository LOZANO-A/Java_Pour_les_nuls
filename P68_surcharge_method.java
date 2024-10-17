public class P68_surcharge_method {
    public static void main(String arg[]){
        String[] tabStr = {"toto","tata","titi","tete"};
        int[] tabInt = {1,2,3,4};
        String[][] tabStr2 = {{"1","2","3","4"},{"toto","tata","titi"}};

        parcourirTab(tabStr);

        parcourirTab(tabInt);

        parcourirTab(tabStr2);
    }

    static void parcourirTab(String[] tab)
    {
        System.out.println("string : ");
        for(String str : tab)
        {
            System.out.println(str);
        }
    }

    static void parcourirTab(int[] tab){
        System.out.println("\nint : ");
        for(int str : tab)
        {
            System.out.println(str);
        }
    }

    static void parcourirTab(String[][] tab)
    {
        System.out.println("\nmixte : ");
        for(String tab2[] :tab)
        {
            for(String str : tab2)
            {
                System.out.println(str);
            }
        }
    }
}
