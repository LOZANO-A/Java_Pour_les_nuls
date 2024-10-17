package exceptions_P134_141;

public class P134_135_try_catch {
    public static void main (String args[]){
    //P134
        // int j =20, i=0;
        // System.out.println(j/i);
        // System.out.println("Coucou toi");
    
        // int j = 20, i=0;
        // try{
        //     System.out.println(j/i);
        // }catch(ArithmeticException e){
        //     //System.out.println("Division par zero");
        // }
        // System.out.println("coucou toi");

    //P135
        // int j = 20, i=0;
        // try{
        //     System.out.println(j/i);
        // }catch(ArithmeticException e){
        //     System.out.println("Division par zero ! "+e.getMessage());
        // }
        // System.out.println("coucou toi");

        try{
            System.out.println(" =>" + (1/0));
        }catch (ClassCastException e){
            e.printStackTrace();
        }
        //assure de faire une partie du code malgré une erreur potentielle
        finally{
            System.out.println("action faite systématiquement");
        }
    }
}