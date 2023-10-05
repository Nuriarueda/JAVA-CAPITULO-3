/* Escribe un programa que calcule el área de un rectángulo */
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Introduce el largo: ");
        int largo = sc.nextInt();
        System.out.print("Introduce el acho: ");
        int ancho = sc.nextInt();

        int area = largo*ancho;

        System.out.println("El área del rectángulo es: " + area);
        sc.close();
    }
}
