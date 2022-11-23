
package eva2_6_arbol_binario;

/**
 *
 * @author Daniel
 */
public class nodo {
     private int valor;
    private nodo derecha;
    private nodo izquierda;

    public nodo() {
        this.derecha= null; 
        this.izquierda = null;
    }

    public nodo(int valor) {
        this.valor = valor;
        this.derecha = null;
        this.izquierda = null;
    }
    
    

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public nodo getNext() {
        return derecha;
    }

    public void setNext(nodo next) {
        this.derecha = derecha;
    }

    public nodo getPrevio() {
        return izquierda;
    }

    public void setPrevio(nodo previo) {
        this.izquierda = izquierda;
    }
  
}
