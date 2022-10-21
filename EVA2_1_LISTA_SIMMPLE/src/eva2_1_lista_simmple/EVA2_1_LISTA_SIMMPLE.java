/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_lista_simmple;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
public class EVA2_1_LISTA_SIMMPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         lista miLista = new lista();
         
          miLista.add(10);
        miLista.add(20);
        miLista.add(30);
        miLista.add(40);
        miLista.add(50);
        miLista.add(60);
        System.out.println("cantidad de nodos: " + miLista.size());
        miLista.imprimir();
        try{
            miLista.insertarEn(70, 3);
        } catch (Exception ex){
            ex.printStackTrace();
        } 
        miLista.imprimir();
        System.out.println("cantidad de nodos: " + miLista.size());
        //miLista.deleteAll();
        //miLista.imprimir();
        try {
            miLista.delete1(0);
        } catch (Exception ex) {
            Logger.getLogger(Eva2_1_lista_simple.class.getName()).log(Level.SEVERE, null, ex);
        }
        miLista.imprimir();
        System.out.println("cantidad de nodos: " + miLista.size());
        try {
            System.out.println("Valor en posicion 4: " + miLista.obtenValorEn(4));
        } catch (Exception ex) {
            Logger.getLogger(Eva2_1_lista_simple.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
