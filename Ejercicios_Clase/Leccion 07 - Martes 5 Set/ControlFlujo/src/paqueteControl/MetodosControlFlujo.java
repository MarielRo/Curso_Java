/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteControl;

/**
 *
 * @author marie
 */
public class MetodosControlFlujo {
    
    public void ifElse(int numero)
    {
        if(numero < 10)
            System.out.println(" El numero esta compuesto por unidades");
        else if(numero > 10 && numero < 99)
            System.out.println(" El numero esta compuesto por unidades");
        else if( numero > 100 && numero < 999)
            System.out.println(" El numero esta compuesto por centenas");
        else 
           System.out.println(" El numero esta compuesto por unidadeds de millar");
        
    }
    
    
    
    
    
    
    
    
    
    
} // Fin de metodos de control flujo

