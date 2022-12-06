import javax.swing.*;
import java.util.Arrays;

public class EjercicioN5 {
    public static void main(String[] args) {

        /* Obtener el nombre mas largo de tres personas, según los siguientes requerimientos
           Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia o amigos usando la clase JOptionPane y método showInputDialog().
           Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres) (Imprimir sólo uno de los tres, el de más caracteres en el nombre.)
           Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo, y con el indice cero accedemos al nombre de la persona.
           Restricción no usar loops en el desarrollo de la tarea.
           Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo." */

        String nombreCompleto = "";
        int cantCaracteres = 0;

        String nombre1 = JOptionPane.showInputDialog("Por favor ingrese su nombre completo");
        String nombre2 = JOptionPane.showInputDialog("Por favor ingrese su nombre completo");
        String nombre3 = JOptionPane.showInputDialog("Por favor ingrese su nombre completo");

        if(nombre1.length() > cantCaracteres){
            cantCaracteres = nombre1.length();
            nombreCompleto = nombre1;
        }

        if(nombre2.length() > cantCaracteres){
            cantCaracteres = nombre2.length();
            nombreCompleto = nombre2;
        }

        if(nombre3.length() > cantCaracteres){
            cantCaracteres = nombre3.length();
            nombreCompleto = nombre3;
        }

        System.out.println(nombre1);
        System.out.println(nombre2);
        System.out.println(nombre3);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println(nombreCompleto + " tienen el nombre mas largo, con " + cantCaracteres + " caracteres");
    }
}
