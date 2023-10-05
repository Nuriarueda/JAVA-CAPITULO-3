/* Realiza un conversor de Mb a Kb.*/
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("CONVERTIDOR DE MB A KB");
        System.out.print("Introduce los Mb: ");
        int mb = sc.nextInt();
        
        int bk = mb*1000;
        System.out.println(mb+" Mb son " + bk + " Kb");
        sc.close();
    }
}
