import java.util.Scanner;

public class Job9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Saisissez votre age : ");
        int age = scanner.nextInt();
        if (age < 18){
            System.out.println("Vous êtes mineur!!!!!");
        }
        else{
            System.out.println("Vous êtes majeur!!!!!");
        }
    }
}
