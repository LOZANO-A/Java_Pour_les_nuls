import java.util.ArrayList;
import java.util.List;

public class main4 {
//P158 - heritage et generecité
    public static void main(String[] args) {
        // List<Voiture> listVoiture = new ArrayList<Voiture>();
        // List<VoitureSansPermis> listVoitureSP = new ArrayList<VoitureSansPermis>();
        // listVoiture = listVoitureSP;

//P159 - WILDCARD
    //     List<? extends Voiture> listVoitureSP = new 
    //     ArrayList<VoitureSansPermis>();
    //     afficher(listVoitureSP);
    // }
    // static void afficher(List<? extends Voiture> list){
    //     for(Voiture v : list){
    //         System.out.println(v.toString());
    //     }
    // }

//#######################################################

    // List<Voiture> listVoiture = new ArrayList<Voiture>();
    // listVoiture.add(new Voiture());
    // listVoiture.add(new Voiture());

    // List<VoitureSansPermis> listVoitureSP = new ArrayList<VoitureSansPermis>();
    // listVoitureSP.add(new VoitureSansPermis());
    // listVoitureSP.add(new VoitureSansPermis());

    // affiche(listVoiture);
    // affiche(listVoitureSP);
    // }

    // static void affiche(List<? extends Voiture> list){
    //     for(Voiture v : list){
    //         System.out.println(v.toString());
    //     }
    // }

//P160
    // static void affiche(List<? extends Voiture> list){
    //     for(Voiture v : list){
    //         System.out.println(v.toString());
    //     }
    // }
    // static void affiche(List<? super Voiture> list){
    //     for(Object v : list){
    //         System.out.println(v.toString());
    //     }
    // }

//#########################################################
    //     List<Voiture> listVoiture = new ArrayList<Voiture>();
    //     listVoiture.add(new Voiture());
    //     listVoiture.add(new Voiture());

    //     List<Object> listVoitureSP = new ArrayList<Object>();
    //     listVoitureSP.add(new VoitureSansPermis());
    //     listVoitureSP.add(new VoitureSansPermis());

    //     affiche(listVoiture);
    // }

    // static void affiche(List<? super Voiture> list){
    //     for (Object v : list) {
    //         System.out.println(v.toString());            
    //     }
    // }

//P161 - garage
        List<Voiture> listVoiture = new ArrayList<Voiture>();
        listVoiture.add(new Voiture());

        List<VoitureSansPermis> listVoitureSP =new ArrayList<VoitureSansPermis>();
        listVoitureSP.add(new VoitureSansPermis());

        Garage garage = new Garage();
        garage.add(listVoiture);
        System.out.println("------------------");
        garage.add(listVoitureSP);
    }
}
