package miniprojet;

public class Ligne {
    
    private Commande commande;
    private Article article;
    private int qte;

    public Ligne(Commande commande, Article article, int qte){
        this.commande = commande;
        this.article = article;
        this.qte = qte;
    }

    public Commande getCommande(){
        return this.commande;
    }

    public Article getArticle(){
        return this.article;
    }

    public int getQte(){
        return this.qte;
    }

    public void setCommande(Commande commande){
        this.commande = commande;
    }

    public void setArticle(Article article){
        this.article = article;
    }

    public void setQte(int qte){
        this.qte = qte;
    }
}
