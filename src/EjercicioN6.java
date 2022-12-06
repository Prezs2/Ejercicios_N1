import java.util.Scanner;

public class EjercicioN6 {
    public static void main(String[] args) {

        /* Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas.
           Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1,
           además mostrar el promedio total.*/

        Scanner scan = new Scanner(System.in);
        double[] notas = new double[20];
        double mayorCinco = 0, cantMayorCinco = 0, menorCuatro = 0, cantMenorCuatro = 0, cantUno = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese la nota del estudiante " + i);
            notas[i] = scan.nextDouble();

            if(notas[i] >= 5){
                mayorCinco += notas[i];
                cantMayorCinco++;
            } else if(notas[i] <= 4){
                menorCuatro += notas[i];
                cantMenorCuatro++;
            } else if(notas[i] == 1){
                cantUno++;
            }
        }

        System.out.println("Promedio de notas mayores de 5: " + (mayorCinco/cantMayorCinco));
        System.out.println("Promedio de notas menores de 4: " + (menorCuatro/cantMenorCuatro));
        System.out.println("La cantidad de notas 1 es: " + cantUno);

    }
}
