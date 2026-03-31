import java.util.Scanner;
//Job 10 = Job11


public class Job11 {
    public static void main(String[] args){
        Scanner sacnner = new Scanner (System.in);
        System.out.print("Saisissez un nombre : ");
        int nb = sacnner.nextInt();
        System.out.println("factorielle de " + nb);
        int resultat = 1;
        while (nb>0) {
            resultat = resultat * nb;
            nb--;
        }
        System.out.println(resultat);
    }
}
