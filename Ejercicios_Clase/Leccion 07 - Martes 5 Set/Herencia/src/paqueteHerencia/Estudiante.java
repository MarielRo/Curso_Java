/**
  Mariel Daniela Rojas Sánchez
  Repaso Leccion 7, 05 Set 2023
 */
package paqueteHerencia;
import java.util.Date;

public class Estudiante extends Persona{
    
    // Tendrá un atributo carnetEstudiante tipo String, el cual tendrá un método Get y un método Set
    public String carnetEstudiante;
    
    // metodo set
    public void setCarnetEstudiante (String carnetEstudiante)
    {
        this.carnetEstudiante = carnetEstudiante;
    }
    // metodo get
    public String getCarnetEstudiante()
    {
        return carnetEstudiante;
    }
    
    //Constructor vacio
    public Estudiante ()
    {
        super();
        carnetEstudiante = "";
    }
    
    
    //Constructor con parametros
    public Estudiante(String identificacion, String nombre, String apellido1, String apellido2, 
        Date fechaNacimiento, String carnetEstudiante) {
        // se llaman los atributos de la clase padre (persdona)
        super(identificacion, nombre, apellido1, apellido2, fechaNacimiento);
        this.carnetEstudiante = carnetEstudiante;
    }
    
    //Cree un método llamado mostrarInformacion que muestre el carnet del estudiante 
        //y además llame al método mostrarInformacion() de la clase Persona. La apariencia de la salida debe ser como se muestra a                 //continuación
     
    public void mostrarInformacionEstudiante()
    {
        System.out.println("____STUDENT INFORMATION");
        System.out.println("Carnet : " + carnetEstudiante);
        super.mostrarInformacion(); // llama el metodo de mostrar info de la clase padre
    }
    
    
    
    
} // fin clase estudiante (hija de clase persona)
