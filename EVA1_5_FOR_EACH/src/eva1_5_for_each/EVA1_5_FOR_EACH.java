/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_for_each;

/**
 *
 * @author Daniel
 */
public class EVA1_5_FOR_EACH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arregloDatos = new int[50];
              for (int i = 0; i < 50; i++) {
            arregloDatos[i] = (int) (Math.random() * 100);
            
        }
          for (int arregloDatos : arregloDatos) {
              System.out.println("i" +  arregloDatos  + "i" );
          }      
          

    }
    
}
