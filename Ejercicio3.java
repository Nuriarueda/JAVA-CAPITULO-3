/* Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
convertir debe ser introducida por teclado. */
import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("CONERTIDOR DE PESETAS A EUROS");
        System.out.print("Introduce cuantas pesetas quieres pasar a euros: ");
        int pesetas = sc.nextInt();
        double euros = 0.00601012;
        double converion;

        converion = euros * pesetas;

        System.out.println(pesetas + " pesetas son " + converion + " euros");

        sc.close();
    }
    
}

