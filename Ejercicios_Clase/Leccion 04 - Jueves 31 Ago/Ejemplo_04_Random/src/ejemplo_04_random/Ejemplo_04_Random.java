
package ejemplo_04_random;
import java.util.Random;

public class Ejemplo_04_Random {

    public static void main(String[] args) {
       
        int x = 4; //filas
        int y = 5; //columnas
        
        Random random = new Random();
        int[][] matriz = new int[x][y];
        
        for (int i=0; i<x;i++){
            for (int j=0; j<y;j++){
                matriz[i][j]= random.nextInt(10);// entre 0 y 9
                 System.out.print(matriz[i][j] + " ");
            }
             System.out.println(); // salto linea en java
        }  
    }
}
    
    
  
