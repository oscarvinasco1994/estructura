/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.listas;


public class NodoPersona {
    private persona dato;
    private NodoPersona siguiente;
    
    
    public void crearnodo(){
    siguiente=null;
    dato=null;
}


    public persona getDato() {
        return dato;
    }


    public void setDato(int cedula) {
        persona p =new persona (cedula);
        this.dato = p;
    }


    public NodoPersona getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPersona siguiente) {
        this.siguiente = siguiente;
    }    
}
