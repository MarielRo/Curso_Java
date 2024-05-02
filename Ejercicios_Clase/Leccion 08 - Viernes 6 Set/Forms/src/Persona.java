/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marie
 */
public class Persona {

    
    // Atributos
    private int id;
    private String nombre;
            
    // Constructores
    public Persona()
    {
        id = 0;
        nombre = "";
    }
    
    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    //propiedades
    public int getId() {
        return id;
    }

   
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return nombre;
        //tambien sirve: return getNombre
    }
    
}// clase
