/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisonnumero;

import static java.lang.Integer.parseInt;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author MegaTecnologia
 */
public class DivisonNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número");
            String numero1 = leer.next();
            System.out.println("Ingrese el segundo número");
            String numero2 = leer.next();
        
        try {
                    
            int num1 = Integer.parseInt(numero1);
            int num2 = Integer.parseInt(numero2);
        
            System.out.println(num1/num2);
         
        } catch(InputMismatchException e) {
            
            System.out.println("Error de ingreso por teclado");
            
        } catch(NumberFormatException e) {
            
            System.out.println("La cadena no puede convertirse a entero");
            
        } catch(ArithmeticException e) {
            
            System.out.println("Se está dividiendo por 0");
            
        }
        
    }
        
        
    
        
}
