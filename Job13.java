import java.util.Scanner;

public class Job13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisissez un nombre inferieur a 9: ");
        int nb = scanner.nextInt();
        if (nb<9){
            for (int i=0; i<=10; i++){
                System.out.println(nb + " x " + i + " = " + (nb*i));
            }
        }
        else {
            System.out.println("Le nombre doit être inférieur à 9");
        }
    }
}
