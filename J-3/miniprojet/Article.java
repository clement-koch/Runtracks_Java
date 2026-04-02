package miniprojet;

public class Article {
    
    String reference;
    String designation;
    double prix;
    int qteStock;

    public Article(String reference, String designation, double prix, int qteStock){
        this.reference = reference;
        this.designation = designation;
        this.prix = prix;
        this.qteStock = qteStock;
    }

    public Article(Article a){
        this.reference = a.reference;
        this.designation = a.designation;
        this.prix = a.prix;
        this.qteStock = a.qteStock;
    }

    public String getReference(){
        return this.reference;
    }

    public String getDesignation(){
        return this.designation;
    }

    public double getPrix(){
        return this.prix;
    }

    public int getQte(){
        return this.qteStock;
    }

    public void setReference(String reference){
        this.reference = reference;
    }

    public void setDesignation(String designation){
        this.designation = designation;
    }

    public void setPrix(double prix){
        this.prix = prix;
    }

    public void setQte(int qteStock){
        this.qteStock = qteStock;
    }

    public void afficher(){
        System.out.println(this.reference + this.designation + "coute " + this.prix + "€, il en reste " + this.qteStock);
    }
}
