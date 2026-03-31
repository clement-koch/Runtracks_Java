import java.util.Scanner;

public class Job5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Choisi 3 Nombres: ");
        int nb1 = scanner.nextInt();
        int nb2 = scanner.nextInt();
        int nb3 = scanner.nextInt();
        if (nb1>nb2 && nb1>nb3){
            System.out.println(nb1);
        }
        else if (nb2>nb1 && nb2>nb3){
            System.out.println(nb2);
        }
        else{
            System.out.println(nb3);
        }
    }
}
