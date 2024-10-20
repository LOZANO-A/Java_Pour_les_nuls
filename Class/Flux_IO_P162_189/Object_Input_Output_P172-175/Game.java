import java.io.Serializable;

public class Game implements  Serializable{
//P172 - simple
    private String nom, style;
    private double prix;

    // public Game(String nom, String style, double prix){
    //     this.nom=nom;
    //     this.style=style;
    //     this.prix=prix;
    // }

    // public String toString(){
    //     return "Nom du jeu : "+this.nom+"\nStyle de jeu : "+this.style+"\nPrix du jeu : "+this.prix+"$\n";
    // }

//P174 - ajout notice
    private transient Notice notice;
    
    public Game(String nom, String style, Double prix){
        this.nom=nom;
        this.style=style;
        this.prix=prix;
        this.notice=new Notice();
    }

    public String toString(){
        return "Nom du jeu : "+this.nom+"\nStyle de jeu : "+this.style+"\nPrix du jeu : "+this.prix+"$\n";
    }
}
