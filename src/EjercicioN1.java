import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class EjercicioN1 {
    public static void main(String[] args) {

        /*Para esta tarea se pide ingresar una fecha de nacimiento en formato string,
        convertirla a una fecha del tipo java.util.Date y calcular la edad de la persona de
        acuerdo a la fecha actual.*/

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

        Scanner scan = new Scanner(System.in);
        System.out.print("INGRESE LA FECHA DE NACIMIENTO: ");
        String fechaIngreso = scan.next();

        try{
            Date fechaNacimiento = dateFormat.parse(fechaIngreso);

            Calendar fechaNac = Calendar.getInstance();
            Calendar fechaAct = Calendar.getInstance();

            fechaNac.setTime(fechaNacimiento);
            int años = fechaAct.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);

            System.out.println("LA EDAD DE LA PERSONA ES: " + años);
        }catch (ParseException e){
            e.printStackTrace();
        }

    }
}
