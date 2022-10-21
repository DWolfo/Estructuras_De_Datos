
package eva2_3_lista_doble;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
public class EVA2_3_LISTA_DOBLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ListaDoble listaDoble =  new ListaDoble();
        listaDoble.add(10);
        listaDoble.add(20);
        listaDoble.add(30);
        listaDoble.add(40);
        listaDoble.imprimir();
        try {
            listaDoble.insertarEn(50, 2);
        } catch (Exception ex) {
            Logger.getLogger(Eva2_3_lista_doble.class.getName()).log(Level.SEVERE, null, ex);
        }
        listaDoble.imprimir();
        try {
            listaDoble.delete1(1);
        } catch (Exception ex) {
            Logger.getLogger(Eva2_3_lista_doble.class.getName()).log(Level.SEVERE, null, ex);
        }
        listaDoble.imprimir();
    }
    
}
    }
    
}
