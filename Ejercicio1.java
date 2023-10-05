/* Realiza un programa que pida dos números y que luego muestre el resultado
de su multiplicación. */
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Introduce el primer numero: ");
        int n1 = sc.nextInt();

        System.out.print("Introduce el segundo numero: ");
        int n2 = sc.nextInt();

        int multiplicacion;
        multiplicacion = n1 * n2;

        System.out.println("El resultado es " + multiplicacion);

        sc.close();

    }
}