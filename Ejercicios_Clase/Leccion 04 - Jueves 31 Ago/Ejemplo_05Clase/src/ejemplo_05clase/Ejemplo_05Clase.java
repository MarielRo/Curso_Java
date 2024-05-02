//Mariel Rojas

package ejemplo_05clase;

/**
 *
 * @author marie
 */
public class Ejemplo_05Clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.printf("%.2f %n", 12.3698);
        /*  El primer % indica que en esa posición se va a escribir un valor.
            .2 indica el número de decimales
            La f indica que el número es de tipo float o double. 
            %n indica un salto de línea. Equivale a \n. Con printf podemos usar ambos para hacer un salto de línea.
            Salida : 12,37
        */  

        
        //Para mostrar el signo + en un número positivo: 
        double n = 1.25036;
        // f = 3 decimales
        System.out.printf("%+.3f %n", n); // +.
        //Salida: +1.250

        
        
        
        
        //Si el número a mostrar es un entero se utiliza el carácter d:
        int x = 10;
        System.out.printf("%d %n", x);
        //Salida: 10
        // Con signo
        System.out.printf("%+d %n", x);
        

        /*Cuando hay varias variables podemos indicar de cuál de ellas es el valor a mostrar escribiendo 1$, 2$, 3$, ... 
        indicando que el valor a mostrar es el de la primera variable que aparece a continuación de las comillas, de la segunda, etc.
            La instrucción anterior la podemos escribir así:
        */
        
        
            //Si queremos mostrar el número 123.4567 y su cuadrado ambos con dos decimales debemos escribir:
            double n1 = 123.4567;
            System.out.printf("El cuadrado de %.2f es %.2f\n", n1, n1*n1);
            //Salida: El cuadrado de 123,46 es 15241,56


            //printf permite mostrar valores con un ancho de campo determinado. Por ejemplo, si queremos mostrar el contenido de n en un ancho                  de campo de //10 caracteres escribimos:
            double n2 = 1.25036;
            System.out.printf("%+10.2f %n", n2);
            //Salida:  bbbbb+1.25 
            //Donde cada b indica un espacio en blanco.
            //El 10 indica el tamaño en caracteres que ocupará el número en pantalla
            
            //Si queremos que en lugar de espacios en blancos nos muestre el número completando el ancho con ceros escribimos: 
           // System.out.printf("%+010.2f %n", n); 
            //Salida:+000001.25

        
    }
    
}
