/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2excep;

/**
 *
 * @author MegaTecnologia
 */
public class EJ2EXCEP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            
            int[] numbers = new int[] {1, 2, 3, 4, 5};
            int lastNumber = numbers[5];
            
            
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error del Array. El valor asignado es mayor al tamaño del Array");
        }
        
        
    }
    
}
