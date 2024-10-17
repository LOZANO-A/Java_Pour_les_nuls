import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Object_Class{
    public static void main(String args[]){
        Class c = String.class;
        Class c2 = new String().getClass();

//connaitre superclass P189
        System.out.println("La superclass de " + String.class.getName()+ " est : "+String.class.getSuperclass());
        System.out.println("\n");
    //avec Object
        Class o = Object.class;
        System.out.println("La superclass de " + Object.class.getName()+ " est : "+Object.class.getSuperclass());
        System.out.println("\n");

//Connaitre interfaces classe P190
        Class iface = new String().getClass();
        Class[] faces = c.getInterfaces();
        System.out.println("il y a "+faces.length+" interfaces");
        for(int i =0;i<faces.length;i++){
            System.out.println("\t- "+faces[i]);
        }
        System.out.println("\n");

//Liste methoide des class P190
        Class met = new String().getClass();
        Method[] m = met.getMethods();
        System.out.println("Il y a " + m.length + " méthodes dans cette classe");
        for(int i=0;i<m.length;i++){
            System.out.println("\t- "+m[i]);

    //affichage des arguments P191
            Class[] p = m[i].getParameterTypes();
            for(int j=0; j<p.length; j++){
                System.out.println("\t\t*"+p[j].getName());
            }
            System.out.println("------------------------------------------------------------------------------------------------------");
        }
        System.out.println("\n");

//list de champs P192
        Class champ = new String().getClass();
        Field[] f = champ.getDeclaredFields();
        System.out.println("il y a "+f.length+" champs dans cette classe");
        for(int i = 0; i<f.length;i++){
            System.out.println("\t- "+f[i].getName());
        }
        System.out.println("\n");

//liste des constructeurs P193
        Class constru = new String().getClass();
        Constructor[] tabConstruc = constru.getConstructors(); 
        System.out.println("il y a "+tabConstruc.length+" constructeurs");
        for(int i =0; i<tabConstruc.length;i++){
            System.out.println("\t- "+tabConstruc[i].getName());

            Class[] param = tabConstruc[i].getParameterTypes();
            for(int j=0; j<param.length;j++){
                System.out.println("\t\t* "+param[j]);
            }
            System.out.println("------------------------------------------------------------------------------------------------------");
        }
        System.out.println("\n");
    }
}