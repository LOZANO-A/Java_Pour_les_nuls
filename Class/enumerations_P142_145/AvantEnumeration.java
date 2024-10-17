public class AvantEnumeration {
    //P142 ##############################################
    // public static final int PARAM1 = 1;
    // public static final int PARAM2 = 2;

    // public void fait(int param){
    //     if(param == PARAM1)
    //         System.out.println("Fait cours 1");
    //     if(param == PARAM2)
    //         System.out.println("Fait cours 2");
    // }

    // public static void main(String[] args) {
    //     AvantEnumeration ae = new AvantEnumeration();
    //     ae.fait(AvantEnumeration.PARAM1);
    //     ae.fait(AvantEnumeration.PARAM2);
    //     ae.fait(4);
    // }

    //P144 ##############################################
    public void fait(Langage param){
        if(param.equals(Langage.JAVA))
            System.out.println("Fait cours 1");
        if(param.equals(Langage.PHP))
            System.out.println("Fait cours 2");
    }

    public static void main(String[] args) {
        AvantEnumeration ae = new AvantEnumeration();
        ae.fait(Langage.JAVA);
        ae.fait(Langage.PHP);
        //ae.fait(4);
    }
}
