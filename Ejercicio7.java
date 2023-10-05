/* Escribe un programa que calcule el total de una factura a partir de la base
imponible. */
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Introduce la base imponible: ");
        double baseimp = sc.nextDouble();

        double iva = (baseimp*0.21); 
        System.out.println("El IVA es " + iva);
        System.out.println("El total de tu factura es "+ (iva+baseimp));
        sc.close();
    }
}
