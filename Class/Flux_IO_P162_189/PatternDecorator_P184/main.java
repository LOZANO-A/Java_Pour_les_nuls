public class main {
    public static void main(String args[]){
        abs_Patisserie Pat = new CoucheChocolat(
                                new CoucheCaramel(
                                    new CoucheBiscuit(
                                        new CoucheChocolat(
                                            new Gateau()
                                        )
                                    )
                                )
                            );
        System.out.println(Pat.preparer());
    }
}
