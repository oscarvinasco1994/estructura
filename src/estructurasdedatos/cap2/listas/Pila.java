/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.listas;
import estructurasdedatos.utiles.nodos.NodoSimple;
/**
 *
 * @author tusk
 */
public class Pila {
    
      private Actividad dato;
    
    private NodoSimple tope;
    
    
     /**
     * @return the dato
     */
    public Actividad getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(Actividad dato) {
        this.dato = dato;
    }

    
    public Pila(){
        dato = null;
       
    }

    public boolean vacia(){
        return (tope == null);
    }
    
    
    
       public void apilar(String nombre, String fecha, String responsable){
        NodoSimple nuevo =new NodoSimple();
        nuevo.setDato(nombre, fecha, responsable);
        if(vacia()){
            tope=nuevo;
        }else{
        nuevo.setSiguiente(tope);
        tope = nuevo;

        }
        
    }
       
       public void desapilar() {
        // verificar que la lista este vacia
        if (vacia()) {
            // si la lista se encuentra vacia imprimos en pantalla
            System.out.println("No existen elementos en la pila");
        } else {
            // se imprime en pantalla el dato eliminado 
            System.out.println("dato ( " + tope.getDato().getNombre() + " )" + " Ha sido eliminado");
            // tomar ahora el dato seguiente del eliminado 
            tope = tope.getSiguiente();

        }
    }
   
       
        public void listar() {
        // verificar que la pila no este vacia 
        if (!(tope == null)) {
            // se crea un nodo auxiliar que nos va a recorrer la pila 
            // imprimir los elementos de la pila
            NodoSimple aux = tope;
            // ciclo por el cual el nodo recorre la lista hasta que la  pila tenga el valor de null
            System.out.println("LA PILA SE CONFORMA POR");
            while (aux != null) {

                System.out.println("el dato :" + "[" + aux.getDato().getNombre() + "]");

                aux = aux.getSiguiente();
            }
        }

    }
}
