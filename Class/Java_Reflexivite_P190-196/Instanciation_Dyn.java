import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.xml.crypto.NoSuchMechanismException;

public class Instanciation_Dyn {
    public static void main(String[] args) throws IllegalAccessException {
        String nom = Paire.class.getName();
//P194
        try{
            Class cl = Class.forName(nom);
            Object o = cl.newInstance();

            Class[] types = new Class[]{String.class, String.class};
            Constructor ct = cl.getConstructor(types);

            Object o2 =  ct.newInstance(new String[]{"Valeur 1","Valeur 2"});

    //P195 - ajout
            Method m = cl.getMethod("toString",null);
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Methode "+m.getName()+" sur o2 : "+m.invoke(o2,null));
            System.out.println("Methode "+m.getName()+" sur o : "+m.invoke(o,null));

        }catch(SecurityException e){
            e.printStackTrace();
        }catch(IllegalArgumentException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(InstantiationException e){
            e.printStackTrace();
        }catch(NoSuchMethodException e){
            e.printStackTrace();
        }catch(InvocationTargetException e){
            e.printStackTrace();
        }


    }

}


