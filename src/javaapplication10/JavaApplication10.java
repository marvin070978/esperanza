/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author marvi
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int contador = 2, numero=0;
        boolean primo=true;
        
        while ((primo) && (contador!=numero)){
            if (numero % contador == 0)
                primo = false;
                contador++;
            }
        
        System.out.println("Contador de veces "+contador);
        
    }
    
}
