import java.util.Scanner;

public class Job4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Choisis une chiffre/ nombre : ");
        int nb = scanner.nextInt();
        int nv_nb = nb*nb;
        System.out.println("Le carré de " + nb + " est " + nv_nb);
    }
}
