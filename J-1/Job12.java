import java.util.Scanner;

public class Job12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisissez un nombre : ");
        int nb = scanner.nextInt();
        for (int i=0 ; i<=nb ; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
        main_2(args);
    }
    
    

    public static void main_2(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisissez un 2ème nombre : ");
        int nb = scanner.nextInt();
        for (int i=0; i<=nb; i+=2){
            System.out.println(i);
        }
    }
}
