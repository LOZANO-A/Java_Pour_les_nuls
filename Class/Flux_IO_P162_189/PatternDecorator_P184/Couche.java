public abstract class Couche extends abs_Patisserie{
    protected abs_Patisserie pat;
    protected String nom;
    
    public Couche(abs_Patisserie p){
        pat = p;
    }
    public String preparer() {
        String str = pat.preparer();
        return str + nom;
    }
}