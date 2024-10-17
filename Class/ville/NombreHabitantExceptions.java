class NombreHabitantExceptions extends Exception{
    public NombreHabitantExceptions(){
        System.out.println("Vous essayez d'instancier une classe Ville avec un nombre d'habitants négatif");
    }
    public NombreHabitantExceptions(int nbre){
        System.out.println("Instanciation avec un nombre d'habitants negatif");
        System.out.println("\t => "+ nbre);
    }
}