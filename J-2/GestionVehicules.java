public class GestionVehicules {
    public static void main(String[] args) {
        Voiture v = new Voiture("Renault", 2018, 15000, 1600, 4, 90, 80000);
        v.calculePrix(2024);
        v.affiche();

        Avion a = new Avion("Boeing", 2010, 500000, "REACTION", 3000);
        a.calculePrix(2024);
        a.affiche();
    }
}

class Vehicule {
    protected String marque;
    protected int dateAchat;
    protected double prixAchat;
    protected double prixCourant;

    public Vehicule(String marque, int dateAchat, double prixAchat) {
        this.marque = marque;
        this.dateAchat = dateAchat;
        this.prixAchat = prixAchat;
    }

    public void calculePrix(int anneeActuelle) {
        int annees = anneeActuelle - dateAchat;
        prixCourant = prixAchat - (prixAchat * 0.01 * annees);
        if (prixCourant < 0) prixCourant = 0;
    }

    public void affiche() {
        System.out.println("Marque : " + marque);
        System.out.println("Date d'achat : " + dateAchat);
        System.out.println("Prix d'achat : " + prixAchat);
        System.out.println("Prix courant : " + prixCourant);
    }
}

class Voiture extends Vehicule {
    private int cylindree;
    private int nbPortes;
    private int puissance;
    private int kilometrage;

    public Voiture(String marque, int dateAchat, double prixAchat, int cylindree, int nbPortes, int puissance, int kilometrage) {
        super(marque, dateAchat, prixAchat);
        this.cylindree = cylindree;
        this.nbPortes = nbPortes;
        this.puissance = puissance;
        this.kilometrage = kilometrage;
    }

    public void calculePrix(int anneeActuelle) {
        int annees = anneeActuelle - dateAchat;
        double reduction = prixAchat * 0.02 * annees;
        reduction += prixAchat * 0.05 * Math.round(kilometrage / 10000.0);

        if (marque.equals("Renault") || marque.equals("Fiat"))
            reduction += prixAchat * 0.10;

        if (marque.equals("Ferrari") || marque.equals("Porsche"))
            reduction -= prixAchat * 0.20;

        prixCourant = prixAchat - reduction;
        if (prixCourant < 0) prixCourant = 0;
    }

    public void affiche() {
        super.affiche();
        System.out.println("Cylindrée : " + cylindree);
        System.out.println("Nb portes : " + nbPortes);
        System.out.println("Puissance : " + puissance);
        System.out.println("Kilométrage : " + kilometrage);
    }
}

class Avion extends Vehicule {
    private String typeMoteur;
    private int heuresVol;

    public Avion(String marque, int dateAchat, double prixAchat, String typeMoteur, int heuresVol) {
        super(marque, dateAchat, prixAchat);
        this.typeMoteur = typeMoteur;
        this.heuresVol = heuresVol;
    }

    public void calculePrix(int anneeActuelle) {
        double reduction;
        if (typeMoteur.equals("HELICES"))
            reduction = prixAchat * 0.10 * (heuresVol / 100);
        else
            reduction = prixAchat * 0.10 * (heuresVol / 1000);

        prixCourant = prixAchat - reduction;
        if (prixCourant < 0) prixCourant = 0;
    }

    public void affiche() {
        super.affiche();
        System.out.println("Type moteur : " + typeMoteur);
        System.out.println("Heures de vol : " + heuresVol);
    }
}