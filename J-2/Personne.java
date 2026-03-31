public class Personne {
    
    String nom;
    String prenom;
    protected int dateNaissance;
    protected String lieuxNaissance;
    private int num;
    private String adresse;

    Personne(String nom, String prenom, int dateNaissance, String lieuxNaissance, int num, String adresse){
        this.prenom = prenom;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.lieuxNaissance = lieuxNaissance;
        this.num = num;
        this.adresse = adresse;
    }
}
