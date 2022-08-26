/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_arreglos;

import java.util.Arrays;

/**
 *
 * @author Daniel
 */
public class EVA1_4_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //TIPO ABSTRACTO DE DATO (Objetos y datos)
        int[] arregloEdades ,  arregloSalario , arregloCalif;
        double arregloPromedio[], porcentaje;
        
        arregloEdades = new int[50];
        
        System.out.println(Arrays.toString(arregloEdades));
        
        for (int i = 0; i < 50; i++) {
            arregloEdades[i] = (int) (Math.random() * 100);
            
        }
        
        for (int i = 0; i < 50; i++) {
            System.out.println("[ + i + ]  = " + arregloEdades[i]);
            
        }
    }
    
}
