public class Notice{
    private String langue;


    public Notice(){
        this.langue="Français";
    }
    public Notice(String lang){
        this.langue = lang;
    }

    public String toString(){
        return "\n Langue de la notice : "+this.langue+"\n";
    }
}