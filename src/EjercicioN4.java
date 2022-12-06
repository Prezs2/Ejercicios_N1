import java.util.Scanner;

public class EjercicioN4 {
    public static void main(String[] args) {

        /* Pedir el radio de un círculo y calcular su área.
           utilizar la formula: area = PI*r² (Constante PI multiplicado por el radio al cuadrado). */

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresar el radio del circulo: ");
        double valor = scan.nextDouble();

        System.out.println("************************");
        System.out.println("EL AREA DEL CIRCULO ES: " + (3.14 * (valor * valor)) + "(m)^2");
    }
}
