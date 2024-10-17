

public class P33_formatage{
    public static void main(String[] args) {
        double nombre = 1000000000000d;
        System.out.println(nombre);


        double nombre2 = 1_000__000___000____000d;
        System.out.println(nombre2);


        int entier = 32__000;
        System.out.println(entier);


        double monDouble = 12_34_56_78_90d;
        System.out.println(monDouble);


        double monDouble2 = 1234_5678_91011d;
        System.out.println(monDouble2);


        // double d = 123_.159;
        // int entier2 = _123;
        // int entier3 = 123_;


        int entier4 = 0xFF;                     //=255
        System.out.println(entier4);
        int entier5 = 0b1000_0000_0000;         //=2048
        System.out.println(entier5);
        int entier6 = 0b100000000000;           //=2048
        System.out.println(entier6);

    }
}