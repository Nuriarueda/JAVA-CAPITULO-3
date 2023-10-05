/* Escribe un programa que calcule el área de un triángulo. */
import java.util.Scanner;
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce la base: ");
        int base = sc.nextInt();
        System.out.print("Introduce la altura: ");
        int altura = sc.nextInt();

        int area = (base*altura)/2;

        System.out.println("El área del triangulo es: " + area);
        sc.close();
    }
    
}
