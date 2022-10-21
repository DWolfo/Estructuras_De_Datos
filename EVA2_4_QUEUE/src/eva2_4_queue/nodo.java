
package eva2_4_queue;

/**
 *
 * @author Daniel
 */
public class nodo {
    private int valor;
    private nodo next;
    private nodo previo;

    public nodo() {
        this.next = null; 
        this.previo = null;
    }

    public nodo(int valor) {
        this.valor = valor;
        this.next = null;
        this.previo = null;
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

    public nodo getPrevio() {
        return previo;
    }

    public void setPrevio(nodo previo) {
        this.previo = previo;
    }
}
