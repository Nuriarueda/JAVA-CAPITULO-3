/* Escribe un programa que calcule el salario semanal de un empleado en base a
las horas trabajadas, a razón de 12 euros la hora. */
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantas horas trabajas al dia: ");
        int horas = sc.nextInt();

        int salario = horas * 12;

        System.out.println("Cobraras " + salario + " euros");
        sc.close();
    }
}
