class Carte {

    protected int cout;

    public Carte(int cout){
        this.cout = cout;
    }

    public String afficher(){
        return "le cout est de " + cout;
    }
}


class Terrain extends Carte {

    protected String couleur;

    public Terrain(String couleur){
        super(0);
        this.couleur = couleur;
        System.out.println("Terrain créé");
    }

    public String afficher(){
        return super.afficher() + "la couleur du terrain est " + this.couleur;
    }
}

class Creature extends Carte {

    protected String nom;
    protected int degats;
    protected int vie;
    

    public Creature(String nom, int degats, int vie){
        super(1);
        this.nom = nom;
        this.degats = degats;
        this.vie = vie;
        System.out.println("Creature créée");
    }

    public String afficher(){
        return super.afficher() + "le nom de la creature est " + this.nom + "elle inflige " + this.degats + "degats et a " + this.vie + " points de vie";
    }
}

class Sortilege extends Carte {

    protected String nom;
    protected String explication;
    

    public Sortilege(String nom, String explication){
        super(2);
        this.nom = nom;
        this.explication = explication;
        System.out.println("Sortilege créé");
    }

    public String afficher(){
        return super.afficher() + "le nom du sortilege est " + this.nom + "il a pour effet " + this.explication;
    }
}

class Jeu{

    Carte[] pioche;

    public Jeu(){
        pioche = new Carte[10];
    }

    public void piocher(Carte carte){
        for (int i = 0; i < 10; i++){
            if (this.pioche[i] == null){
                this.pioche[i] = carte;
                break;
            }
        }
    }

    public void jouer(){
        for (int i = 0; i<10; i++){
            if (this.pioche[i] != null){
                System.out.println(this.pioche[i].afficher());
                this.pioche[i] = null;
                break;
            }
        }
    }

    public void afficher(){
        for (int i = 0; i < 10; i++){
            if (this.pioche[i] != null){
                System.out.println(this.pioche[i].afficher());
            }
        }
    }
}




public class Magic {
    public static void main(String[] args) {
        
        // Création du jeu
        Jeu jeu = new Jeu();

        // Piocher des cartes (les constructeurs vont afficher "X créé")
        jeu.piocher(new Terrain("rouge"));
        jeu.piocher(new Creature("Dragon", 10, 50));
        jeu.piocher(new Sortilege("Boule de feu", "inflige 5 degats"));

        // Afficher toutes les cartes du jeu
        System.out.println("\n--- Jeu complet ---");
        jeu.afficher();

        // Jouer une carte (la première)
        System.out.println("\n--- On joue une carte ---");
        jeu.jouer();

        // Afficher le jeu après avoir joué
        System.out.println("\n--- Jeu apres avoir joue ---");
        jeu.afficher();
    }
}