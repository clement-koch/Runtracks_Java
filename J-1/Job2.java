import java.util.Scanner;

public class Job2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Quel est votre nom ? ");
        String nom = scanner.nextLine();
        System.out.println("Bonjour " + nom);
    }
}