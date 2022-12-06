import java.sql.SQLOutput;
import java.util.Scanner;

public class EjercicioN3 {
    public static void main(String[] args) {

        /* Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9). Escriba un programa que imprima
        el número que tiene más ocurrencias en el arreglo y también imprimir la cantidad de veces que aparece en el arreglo.

        Por ejemplo, para el arreglo: {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}
        Como resultado debería imprimir lo siguiente:

        La mayor ocurrencias es: 3
        El elemento que mas se repite es: 5
        En el ejemplo, el elemento que más se repite en el arreglo es el número 5 con una ocurrencia de 3 veces. */

        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[10];
        int numeroRepetido = 0, numFinal = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero entre el 1 y el 9: ");
            numeros[i] = scan.nextInt();
        }

        for (int p = 0; p < numeros.length; p++) {
            int vecesRepite = 0;
            for (int s = 0; s < numeros.length; s++) {
                if(numeros[p] == numeros[s]){
                    vecesRepite++;
                }
            }

            if(vecesRepite > numeroRepetido){
                numFinal = numeros[p];
                numeroRepetido = vecesRepite;
            }
        }

        System.out.println("La mayor ocurrencias es: " + numeroRepetido);
        System.out.println("El elemento que mas se repite es: " + numFinal);
    }
}