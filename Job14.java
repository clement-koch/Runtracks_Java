import java.util.Scanner;

public class Job14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Saisissez un nombre : ");
        int nb = scanner.nextInt();
        Inverse(nb);
    }

    public static void Inverse(int nb){
        int inverse = 0;
        while (nb != 0){
            int reste = nb % 10;
            inverse = inverse * 10 + reste;
            nb /= 10;
        }
        System.out.println(inverse);
    }
}
