
package paqueteHerencia;
import java.util.Calendar;
//import java.time.LocalDate;
import java.util.Date;
/**
 *
 * @author marie
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        // nuevo objeto de la clase persona
        Estudiante estudiante01 = new Estudiante();
        
        // llamar al constructor vacia 
        System.out.println("Información de estudiante01 con el constructor vacío):");
        estudiante01.mostrarInformacionEstudiante();
        
        
        Calendar cal =  Calendar.getInstance();
        cal.set(Calendar.YEAR,2000);
        cal.set(Calendar.MONTH,Calendar.APRIL);
        cal.set(Calendar.DAY_OF_MONTH,12);
        
        Date fecha = cal.getTime();
        System.out.println("Información de estudiante02 con parámetros):");

        Estudiante estudiante02 = new Estudiante("ID123", "Mariel", "Rojas", "Sanchez", fecha, "CARNET001");

        // Llamar al método mostrarInformacion() de estudiante2
        
        estudiante02.mostrarInformacionEstudiante();
        
        // nuevo objeto de la clase estudiante con parametros
       
        
        
        
        
    }
}
