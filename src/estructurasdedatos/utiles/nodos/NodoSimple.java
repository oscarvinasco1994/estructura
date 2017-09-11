
package estructurasdedatos.utiles.nodos;


public class NodoSimple {
    
    private NodoSimple siguiente;
    private int dato;

    
    public NodoSimple  getSiguiente() {
        return siguiente;
    }

  
    public void setSiguiente(NodoSimple siguiente) {
        this.siguiente = siguiente;
    }

  
    public int getDato() {
        return dato;
    }

 
    public void setDato(int dato) {
        this.dato = dato;
    }

    public void crearnodo() {
        this.siguiente = null;
        this.dato = 0;

    }

}
