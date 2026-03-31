import java.util.Scanner;

public class Job6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Saisissez cinq nombres : ");
        int nb1 = scanner.nextInt();
        int nb2 = scanner.nextInt();
        int nb3 = scanner.nextInt();
        int nb4 = scanner.nextInt();
        int nb5 = scanner.nextInt();
        int moy = (nb1 + nb2 + nb3 + nb4 + nb5) / 5;
        System.out.println(moy);
        
    }
}
