/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap4.arboles;

public class Nodoarbol2 {
    
    
    private int valor; 
    public Nodoarbol2 dato;
    public Nodoarbol2 hijoIzquierdo;
    public Nodoarbol2 hijoDerecho;
 
   
    
    public Nodoarbol2(int valor) {
        this.valor = valor;
    }
 
   
    public void setValor(int valor) {
        this.valor = valor;
    }
 
    public int getValor() {
        return valor;
    }
 
    public Nodoarbol2 getDato() {
        return dato;
    }
 
    public void setdato(Nodoarbol2 dato) {
        this.dato = dato;
    }
 
    public Nodoarbol2 gethijoIzquierdo() {
        return hijoIzquierdo;
    }
 
    public void sethijoIzquierdo(Nodoarbol2 hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }
 
    public Nodoarbol2 gethijoDerecho() {
        return hijoDerecho;
    }
 
    public void sethijoDerecho(Nodoarbol2 hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    int AlturaArbol() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
