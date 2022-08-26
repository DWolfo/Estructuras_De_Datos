/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_8_arreglos_objetos;

/**
 *
 * @author Daniel
 */
public class EVA1_8_ARREGLOS_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Prueba[] arregloPrueba = new Prueba[20];
        
        for (int i = 0; i < arregloPrueba.length; i++) {
            
            arregloPrueba[i] = new Prueba();
            
        }
        // leer x
        for (Prueba prueba : arregloPrueba) {
            //System.out.println(prueba);
            System.out.println("Valor de x = " + prueba.x);
        }
    }

    private static class Prueba {

        public Prueba() {
        }
    }
    
}
