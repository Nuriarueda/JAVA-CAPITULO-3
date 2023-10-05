/* Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
convertir debe ser introducida por teclado. */
import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("CONERTIDOR DE EUROS A PESETAS");
        System.out.print("Introduce cuantos euros quieres pasar a pesetas: ");
        int euros = sc.nextInt();
        double pesetas = 166.386;
        double converion;

        converion = euros * pesetas;

        System.out.println(euros + "euros son " + converion + " pesetas");

        sc.close();
    }
    
}
