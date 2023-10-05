/* Escribe un programa que sume, reste, multiplique y divida dos números
introducidos por teclado. */
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce un numero: ");
        int n1 = sc.nextInt();
        System.out.print("Introduce otro numero: ");
        int n2 = sc.nextInt();

        int multiplicacion = n1*n2;
        int suma = n1+n2;
        int resta = n1-n2;
        double division = n1/n2;

        System.out.println("SUMA: " + suma);
        System.out.println("RESTA: " + resta);
        System.out.println("MULTIPLICACION: " + multiplicacion);
        System.out.println("DIVISION: " + division);

        sc.close();
    }
}
