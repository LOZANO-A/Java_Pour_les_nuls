public class MainEnum {
    public static void main(String args[]){
    //P143
        for(Langage lang : Langage.values()){
            if(Langage.JAVA.equals(lang))
                System.out.println("J'aime le "+lang);
            else
                System.out.println(lang);
        }
    }
}
