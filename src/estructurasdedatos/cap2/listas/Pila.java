/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.listas;
import estructurasdedatos.utiles.nodos.NodoSimple;
public class Pila {
    
      private Actividad dato;
    
    private NodoSimple tope;
    
    
    
    public Actividad getDato() {
        return dato;
    }


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
       
        if (vacia()) {
          
            System.out.println("No existen elementos en la pila");
        } else {
           
            System.out.println("dato ( " + tope.getDato().getNombre() + " )" + " Ha sido eliminado");
           
            tope = tope.getSiguiente();

        }
    }
   
       
        public void listar() {
       
        if (!(tope == null)) {
           
            NodoSimple aux = tope;
            
            System.out.println("LA PILA SE CONFORMA POR");
            while (aux != null) {

                System.out.println("el dato :" + "[" + aux.getDato().getNombre() + "]");

                aux = aux.getSiguiente();
            }
        }

    }
}
