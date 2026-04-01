public class ToStringEq {
    public static void main(String[] args) {
        System.out.println("Test 1 :");
        Rectangle rect = new Rectangle(12.5, 4.0);
        System.out.println(rect);
        System.out.println();

        System.out.println("Test 2: ");
        RectangleColore rect1 = new RectangleColore(12.5, 4.0, "rouge");
        System.out.println(rect1);
        System.out.println();

        System.out.println("Test 3 :");
        Rectangle rect2 = new RectangleColore(25.0/2, 8.0/2, new String("rouge"));
        System.out.println(rect2);

        System.out.println(rect1.equals(rect2)); // 1.
        System.out.println(rect2.equals(rect1)); // 2.
        System.out.println(rect1.equals(null));  // 3.
        System.out.println(rect.equals(rect1));  // 4.
        System.out.println(rect1.equals(rect));  // 5.
    }
}




class Rectangle {

    protected double largeur;
    protected double longueur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double surface() { return longueur * largeur; }

    public boolean equals(Object obj){
        if (obj instanceof Rectangle){
            Rectangle autre = (Rectangle)obj;
            return this.largeur == autre.largeur && this.longueur == autre.longueur;
        }
        return false;
    }
    @Override
    public String toString() {
        return "Longueur : " + longueur + " | Largeur : " + largeur;
    }
    

    public double getLongueur() { return longueur; }
    public double getLargeur() { return largeur; }
    public void setLongueur(double longueur) { this.longueur = longueur; }
    public void setLargeur(double largeur) { this.largeur = largeur; }
}


class RectangleColore extends Rectangle {

    protected String couleur;

    public RectangleColore(double longueur, double largeur, String couleur) {
        super(longueur, largeur);
        this.couleur = couleur;
    }

    public boolean equals(Object obj){
        if (obj instanceof RectangleColore){
            RectangleColore autre = (RectangleColore) obj;
            return super.equals(obj) && this.couleur.equals(autre.couleur);
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + " | Couleur : " + couleur;
    }

    public String getCouleur() { return couleur; }
    public void setCouleur(String couleur) { this.couleur = couleur; }
}

