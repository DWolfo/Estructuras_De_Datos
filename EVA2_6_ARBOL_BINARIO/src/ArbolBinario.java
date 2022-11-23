
import eva2_6_arbol_binario.nodo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class ArbolBinario {
    private nodo root;
    
    public ArbolBinario(){
        this.root = null;
    }
    
    
    public void agregar (int valor){
        agregarRecur(valor, root);
    }
    
    
    // metodo recursivo agregar
    //necesita el valor y el nodo actual
    private void agregarRecur(int valor, nodo nodoActual){
        
    }
}
