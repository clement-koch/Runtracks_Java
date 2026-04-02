package miniprojet;

public class Commande {
    
    private int numCommande;
    private int date;
    private Client client;

    public Commande(int numCommande, int date, Client client){
        this.numCommande = numCommande;
        this.date = date;
        this.client = client;
    }

    public int getNumCommande(){
        return this.numCommande;
    }

    public int getDate(){
        return this.date;
    }

    public Client getClient(){
        return this.client;
    }

    public void setNumCommande(int numCommande){
        this.numCommande = numCommande;
    }

    public void setDate (int date){
        this.date = date;
    }

    public void setClient(Client client){
        this.client = client;
    }
}
