

public enum Langage {
    //P142 ##########################
    // JAVA,
    // C,
    // CPLUS,
    // PHP;

    //P143 ##########################
    // JAVA ("langage JAVA"),
    // C ("Langage C"),
    // CPLUS ("Langage C++"),
    // PHP ("Langage PHP");

    // private String name ="";

    // Langage(String name){
    //     this.name = name;
    // }

    // public String toString(){
    //     return name;
    // }

    //P145 ##########################
    JAVA ("langage JAVA","Eclipse"),
    C ("Langage C","CodeBlock"),
    CPLUS ("Langage C++","Visual Studio"),
    PHP ("Langage PHP", "PS PAD");

    private String name="";
    private String editor="";

    private Langage(String name, String editor) {
        this.name=name;
        this.editor=editor;
    }

    public void getEditor(){
        System.out.println("Editeur : "+this.editor);
    }
    public String toString(){
        return name;
    }
    public static void main(String args[]){
        Langage l1 = Langage.JAVA;
        Langage l2 = Langage.PHP;

        l1.getEditor();
        l2.getEditor();
    }
}
