/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_2_tipos_de_datos_genericos;

import java.util.LinkedList;

/**
 *
 * @author Daniel
 */
public class EVA2_2_TIPOS_DE_DATOS_GENERICOS {

    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList <String> miLista = new LinkedList<String>();
        TiposDatosGenricos <Integer> miObj = new TiposDatosGenricos <Integer>();
        miObj.setValor(100);
        System.out.println(miObj.getValor());
    }
    
}

class TiposDatosGenricos<T>{
    private T valor;

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
}   

