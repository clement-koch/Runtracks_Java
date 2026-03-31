class Figure {

    protected double x;
    protected double y;

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void affiche() {
        System.out.println("Centre : (" + x + ", " + y + ")");
    }

    public void setCentre(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class Rectangle extends Figure {

    protected double largeur;
    protected double longueur;

    public Rectangle(double x, double y, double longueur, double largeur) {
        super(x, y);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double surface() { return longueur * largeur; }

    public void affiche() {
        super.affiche();
        System.out.println("Longueur : " + longueur + " | Largeur : " + largeur);
    }

    public double getLongueur() { return longueur; }
    public double getLargeur() { return largeur; }
    public void setLongueur(double longueur) { this.longueur = longueur; }
    public void setLargeur(double largeur) { this.largeur = largeur; }
}

class Cercle extends Figure {

    protected double rayon;

    public Cercle(double x, double y, double rayon) {
        super(x, y);
        this.rayon = rayon;
    }

    public double surface() { return Math.PI * rayon * rayon; }

    public void affiche() {
        super.affiche();
        System.out.println("Rayon : " + rayon);
    }

    public boolean estInterieur(double px, double py) {
        double distance = Math.sqrt(Math.pow(px - x, 2) + Math.pow(py - y, 2));
        return distance <= rayon;
    }

    public double getRayon() { return rayon; }
    public void setRayon(double rayon) { this.rayon = rayon; }
}

class RectangleColore extends Rectangle {

    protected int couleur;

    public RectangleColore(double x, double y, double longueur, double largeur, int couleur) {
        super(x, y, longueur, largeur);
        this.couleur = couleur;
    }

    public void affiche() {
        super.affiche();
        System.out.println("Couleur : " + couleur);
    }

    public int getCouleur() { return couleur; }
    public void setCouleur(int couleur) { this.couleur = couleur; }
}