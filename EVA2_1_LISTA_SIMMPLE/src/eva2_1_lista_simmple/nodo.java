/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_lista_simmple;

/**
 *
 * @author Daniel
 */
public class nodo {
    private int valor;
    private nodo next;

    public nodo() {
        this.next = null; 
    }

    public nodo(int valor) {
        this.valor = valor;
        this.next = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public nodo getNext() {
        return next;
    }

    public void setNext(nodo next) {
        this.next = next;
    }
}
