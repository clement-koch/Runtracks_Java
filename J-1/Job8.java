import java.util.Scanner;


public class Job8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Saisissez un nombre : ");
        int nb = scanner.nextInt();
        for (int i = 1; i<=nb; i++){
            System.out.println(i*i*i);
        }
    }
}
