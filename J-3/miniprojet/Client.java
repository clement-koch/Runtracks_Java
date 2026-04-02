package miniprojet;

public class Client extends Personne {

    private int chiffreAffaire;

    public Client(int id, String nomSocial, String adresse, int chiffreAffaire){
        super(id, nomSocial, adresse);
        this.chiffreAffaire = chiffreAffaire;
    }

    public int getCA(){
        return this.chiffreAffaire;
    }

    public void setCA(int chiffreAffaire){
        this.chiffreAffaire = chiffreAffaire;
    }

    public void afficher(){
        super.afficher();
        System.out.println("et a un budget de " + this.chiffreAffaire);
    }
}
