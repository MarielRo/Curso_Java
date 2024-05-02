/**
  Mariel Daniela Rojas Sánchez
  Repaso Leccion 7, 05 Set 2023
 */
package paqueteHerencia;
import java.text.DateFormat;
import java.util.Date;

public class Persona { // clase padre
    private String identificacion;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Date fechaNacimiento;
    
    
    
    //Constructor vacio
    public Persona(){
        identificacion = "";
        nombre = "" ;
        apellido1 = "";
        apellido2 = "";
        fechaNacimiento = new Date();
    }
    
    // Constructor que recibe todos los parametros
    public Persona(String identificacion, String nombre, String apellido1, String apellido2, Date fechaNacimiento) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    //Metodos set
    public void setIdentificacion( String identificacion){
        this.identificacion =identificacion; 
    }
    public void setNombre( String nombre){
        this.nombre = nombre;
    }
    public void setApellido1( String apellido1){
        this.apellido1= apellido1;
    }
    public void setIApellido2( String apellido2){
        this.apellido2 = apellido2;
    }
    public void setFechaNacimiento(Date fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
   
    // Metodos get
    public String getIdentificacion(){
        return identificacion;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido1(){
        return apellido1;
    }
    public String getapellido2(){
        return apellido2;
    }
    public Date getFechaNacimiento(){
        return fechaNacimiento;
    }
    
    public void mostrarInformacion() {
        
        System.out.println("Identificación: " + identificacion);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido 1: " + apellido1);
        System.out.println("Apellido 2: " + apellido2);
        DateFormat formatoFechaMedia = DateFormat.getDateInstance(DateFormat.MEDIUM);
        String fechaConFormato = formatoFechaMedia.format(fechaNacimiento);
        System.out.println("Fecha de Nacimiento: " + fechaConFormato);
        
    }
    
}// fin clase persona




