import java.net.http.WebSocket;
import java.util.List;
import java.util.ArrayList;

public class Garage {
    List<Voiture> list = new ArrayList<Voiture> ();

    public void add(List<? extends Voiture> listVoiture){
        for(Voiture v : listVoiture){
            list.add(v);
        }
        System.out.println("contenu de notre garage : ");
        for(Voiture v : list){
            System.out.println(v.toString());
        }
    }
}
