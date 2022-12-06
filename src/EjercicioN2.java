import java.util.Scanner;

public class EjercicioN2 {
    public static void main(String[] args) {

        /* Leer 7 números por teclado para llenar un arreglo y a continuación calcular el promedio de los números positivos,
        el promedio de los negativos y contar el número de ceros.*/

        Scanner scan = new Scanner(System.in);

        int[] datos = new int[7];
        double todoNeg = 0, totalNeg = 0, todoPos = 0, totalPos = 0;
        int totalCeros = 0;

        for (int i = 0; i < datos.length; i++) {
            System.out.print("INGRESE UN NUMERO: ");
            datos[i] = scan.nextInt();
        }

        for (int i = 0; i < datos.length; i++) {
            if(datos[i] < 0){
                todoNeg += datos[i];
                totalNeg += 1;
            }else if(datos[i] == 0) {
                totalCeros += 1;
            }else {
                todoPos += datos[i];
                totalPos += 1;
            }
        }

        if(todoPos != 0 && totalPos != 0){
            System.out.println("EL PROMEDIO DE LOS NUMEROS POSITIVOS ES: " + (todoPos/totalPos));
        }

        if(todoNeg != 0 && totalNeg != 0){
            System.out.println("EL PROMEDIO DE LOS NUMEROS NEGATIVOS ES: " + (todoNeg/totalNeg));
        }

        System.out.println("LA CANTIDAD DE CERO ES DE: " + totalCeros);
    }
}
