//Mariel Rojas
package ejemplo_clase03;
        


public class Ejemplo_Clase03 {

    public static void main(String[] args) {
        
        char[] abecedario = {'a','b','c','d','e','f','g','h','i','j','k','l',
                'm','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        
         // Convertir el arreglo de caracteres a un String
        String abc = new String(abecedario);
        System.out.println("El abecedario completo es " + abc);
        
        mostrarNombre(abecedario);
        mostrarApellido(abecedario);
        mostrarNombre1(abecedario);
    }
    
    public static void mostrarNombre(char[] abecedario) {
        char[] nombre = {'m', 'a', 'r', 'i', 'e', 'l'};
        
        String nombreMayus = new String(nombre);
        nombreMayus = nombreMayus.toUpperCase();
        
        System.out.println("Mi nombre en mayuscula es " + nombreMayus); 
    }
    
     public static void mostrarApellido(char[] abecedario) {
        char[] nombre = {'R', 'O', 'J', 'A', 'S'};
        
        String apellidoMin = new String(nombre);
        apellidoMin = apellidoMin.toLowerCase();
        
        System.out.println("Mi nombre en mayuscula es " + apellidoMin); 
    }
     
}
    
    

