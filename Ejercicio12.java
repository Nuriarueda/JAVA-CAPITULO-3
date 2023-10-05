/* Realiza un programa que calcule la nota que hace falta sacar en el segundo
examen de la asignatura Programación para obtener la media deseada. Hay
que tener en cuenta que la nota del primer examen cuenta el 40% y la del
segundo examen un 60%. */
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la nota del primer examen: ");
        double nota1 = sc.nextDouble();
        System.out.print("¿Qué nota final deseas sacar?: ");
        double notafinal = sc.nextDouble();

        double nota2 = (notafinal - (nota1 * 0.4)) / 0.6;
        System.out.println("Tienes que sacar en el siguiente examen " + nota2);

        sc.close();
    }
}
