
package estructurasdedatos.cap2.listas;

import estructurasdedatos.utiles.nodos.NodoSimple;


public class ListaSimple {

    private NodoSimple cabeza;
    private NodoSimple cola;
    private NodoSimple actual;

    public void CrearListaSimple() {

        this.cabeza = null;
        this.cola = null;

    }

    public void insertar(int dato) {
        NodoSimple nodo = new NodoSimple();
        nodo.crearnodo();
        nodo.setDato(dato);
        if (this.cabeza == null && this.cola == null) {

            this.cabeza = nodo;
            this.cola = nodo;

        } else {
            cola.setSiguiente(nodo);
            this.cola = nodo;

        }
    }

    public void eliminar(int dato) {
        if (cabeza.getDato() == dato) {
            cabeza = cabeza.getSiguiente();
        } else {
            NodoSimple aux = cabeza;
            while (aux.getSiguiente().getDato() != dato) {
                aux = aux.getSiguiente();
            }
            NodoSimple siguiente = aux.getSiguiente().getSiguiente();
            aux.setSiguiente(siguiente);
        }

    }

    public void listar() {

        if (!(this.cabeza == null && this.cola == null)) {

            NodoSimple aux = cabeza;

            int i = 0;
            while (aux != null) {
             System.out.println("el dato :" + "[" + aux.getDato() + "]" + " " + "esta en la posicion" + "(" + i + ")" + "de la lista");
              aux = aux.getSiguiente();
                i++;
            }
        }

    }
