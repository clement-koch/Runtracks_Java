package miniprojet;

public abstract class Personne {

    protected int id;
    protected String nomSocial;
    protected String adresse;

    protected Personne(int id, String nomSocial, String adresse){
        this.id = id;
        this.nomSocial = nomSocial;
        this.adresse = adresse;
    }


    protected int getId() {
        return this.id;
    }

    protected String getNomSocial(){
        return this.nomSocial;
    }

    protected String getAdresse(){
        return this.adresse;
    }

    protected void setId(int id){
        this.id = id;
    } 

    protected void setNomSocial(String nomSocial){
        this.nomSocial = nomSocial;
    }

    protected void setAdresse(String adresse){
        this.adresse = adresse;
    }

    protected void afficher(){
        System.out.println("La personne numero " + this.id + " nommé " + this.nomSocial + "qui habite a " + this.adresse);
    }
}
