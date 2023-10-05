/* Realiza un conversor de Kb a Mb.*/
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("CONVERTIDOR DE KB A MB");
        System.out.print("Introduce los Kb: ");
        int kb = sc.nextInt();
        
        double mb = kb*0.001;
        System.out.println(kb+" Kb son " + mb + " Mb");
        sc.close();
    }
}