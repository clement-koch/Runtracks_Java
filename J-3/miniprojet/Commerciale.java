package miniprojet;
import java.util.Vector;
import java.util.Scanner;

public class Commerciale {
    
    Vector<Client> clients = new Vector<Client>();
    Vector<Article> articles = new Vector<Article>();
    Vector<Commande> commandes = new Vector<Commande>();
    Vector<Ligne> lignes = new Vector<Ligne>();

    public void passerCommande(Commande c){
        commandes.add(c);
    }

    public void annulerCommande(Commande c){
        commandes.remove(c);
    }

    public void ajouterArticle(Article a){
        articles.add(a);
    }

    public void retirerArticle(Article a){
        articles.remove(a);
    }

    public void ajouterClient(Client cl){
        clients.add(cl);
    }

    public void retirerClient(Client cl){
        clients.remove(cl);
    }

    public Vector<Client> getClients(){
    return this.clients;
    }

    public Vector<Article> getArticles(){
        return this.articles;
    }

    public Vector<Commande> getCommandes(){
        return this.commandes;
    }

    public static void main(String[] args) {
        Commerciale c = new Commerciale();
        Scanner scanner = new Scanner(System.in);
        int choix = -1;

        while (choix != 0) {
            System.out.println("--------Gestion commerciale---------");
            System.out.println("1) Ajouter un article");
            System.out.println("2) Supprimer un article");
            System.out.println("3) Ajouter un client");
            System.out.println("4) Supprimer un client");
            System.out.println("5) Passer une commande");
            System.out.println("6) Annuler une commande");
            System.out.println("0) Quitter");
            System.out.print("Entrer un choix : ");
            choix = scanner.nextInt();

            if (choix == 1) {
                System.out.print("Reference : ");
                String ref = scanner.next();
                System.out.print("Designation : ");
                String des = scanner.next();
                System.out.print("Prix : ");
                double prix = scanner.nextDouble();
                System.out.print("Quantite : ");
                int qte = scanner.nextInt();
                c.ajouterArticle(new Article(ref, des, prix, qte));
                System.out.println("Article ajouté !");

            } else if (choix == 2) {
                System.out.print("Reference de l'article a supprimer : ");
                String ref = scanner.next();
                for (Article a : c.getArticles()) {
                    if (a.getReference().equals(ref)) {
                        c.retirerArticle(a);
                        System.out.println("Article supprimé !");
                        break;
                    }
                }

            } else if (choix == 3) {
                System.out.print("ID : ");
                int id = scanner.nextInt();
                System.out.print("Nom : ");
                String nom = scanner.next();
                System.out.print("Adresse : ");
                String adr = scanner.next();
                System.out.print("Chiffre affaire : ");
                int ca = scanner.nextInt();
                c.ajouterClient(new Client(id, nom, adr, ca));
                System.out.println("Client ajouté !");

            } else if (choix == 4) {
                System.out.print("ID du client a supprimer : ");
                int id = scanner.nextInt();
                for (Client cl : c.getClients()) {
                    if (cl.getId() == id) {
                        c.retirerClient(cl);
                        System.out.println("Client supprimé !");
                        break;
                    }
                }

            } else if (choix == 5) {
                System.out.print("Numero commande : ");
                int num = scanner.nextInt();
                System.out.print("Date (ex: 20240401) : ");
                int date = scanner.nextInt();
                System.out.print("ID du client : ");
                int id = scanner.nextInt();
                for (Client cl : c.getClients()) {
                    if (cl.getId() == id) {
                        c.passerCommande(new Commande(num, date, cl));
                        System.out.println("Commande passée !");
                        break;
                    }
                }

            } else if (choix == 6) {
                System.out.print("Numero de la commande a annuler : ");
                int num = scanner.nextInt();
                for (Commande cmd : c.getCommandes()) {
                    if (cmd.getNumCommande() == num) {
                        c.annulerCommande(cmd);
                        System.out.println("Commande annulée !");
                        break;
                    }
                }

            } else if (choix == 0) {
                System.out.println("Au revoir !");
            }
        }
        scanner.close();
    }   
}