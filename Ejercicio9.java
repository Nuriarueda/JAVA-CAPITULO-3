/* Escribe un programa que calcule el volumen de un cono según la fórmula V = 1/3πr2h */
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Introduce el radio del cono: ");
        int radio = sc.nextInt();

        System.out.print("Introduce la altura del cono: ");
        int altura = sc.nextInt();

        int r2 = radio*radio;
        double PI = 3.1416;

        double volumen = ((1*3)*PI*r2*altura);
        System.out.println("El volumen del cono es: " + volumen);
        sc.close();
    }
}
