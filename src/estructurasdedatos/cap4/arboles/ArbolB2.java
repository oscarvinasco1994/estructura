/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap4.arboles;


public class ArbolB2 {
    
    
    
    
       private Nodoarbol2 raiz;
 
     
    public ArbolB2( int valor ) {
        this.raiz = new Nodoarbol2( valor );
    }
 
    public ArbolB2( Nodoarbol2 raiz ) {
        this.raiz = raiz;
    }
 
 
    public Nodoarbol2 getRaiz() {
        return raiz;
    }
 
    public void setRaiz(Nodoarbol2 raiz) {
        this.raiz = raiz;
    }
             
  
    private void Insertar( Nodoarbol2 nodo, Nodoarbol2 raiz ) {
        
        if ( raiz == null ) {
            
            this.setRaiz(nodo);
        }
        else {           
            if ( nodo.getValor() <= raiz.getValor() ) {              
                if (raiz.gethijoIzquierdo() == null) {
                    raiz.sethijoIzquierdo(nodo);
                }
                else {
                    Insertar( nodo , raiz.gethijoIzquierdo() );
                }
            }
            else {              
                if (raiz.gethijoDerecho() == null) {
                    raiz.sethijoDerecho(nodo);
                }
                else {
                    Insertar( nodo, raiz.gethijoDerecho() );
                }
            }
        }
    }
    
     public boolean Buscar(Nodoarbol2 dato, Nodoarbol2 raiz){
            boolean respuesta = false;
            if(raiz == null){
                System.out.println("no hay datos");
            } else {
                if(dato == raiz.dato){
                    respuesta = true;
                    return true;
                }else{
                    if(dato < raiz.getDato()){
                        respuesta(raiz.gethijoIzquierdo().dato);
                    }else{
                        if(dato > raiz.getDato()){
                        respuesta(raiz.gethijoDerecho().dato);
                    }
                }
           }
            
            return respuesta;
        }
           return false;
       
     }

     public int AlturaArbol(){
            if(raiz!= null){
                return 0;
            }else{
                int hijoizquierdo=raiz.hijoIzquierdo.AlturaArbol();
                int hijoderecho=raiz.hijoDerecho.AlturaArbol();
                return (1+Math.max(hijoizquierdo, hijoderecho));
            }
        }
    


   public void orden(Nodoarbol2 raiz){
            if(raiz!= null){
                orden(raiz.gethijoIzquierdo());
                System.out.print(raiz.getDato() + ",");
                orden(raiz.gethijoDerecho());
            }
        }
  
  
    public void preorden(Nodoarbol2 raiz){
            if(raiz!= null){
                System.out.print(raiz.getDato() + ",");
                preorden(raiz.gethijoIzquierdo());
                preorden(raiz.gethijoDerecho());
            }
        }
       
           
     public void postorden(Nodoarbol2 raiz){
            if(raiz!= null){
                postorden(raiz.gethijoIzquierdo());
                postorden(raiz.gethijoDerecho());
                System.out.print(raiz.getDato() + ",");
            }
        }  
   
   
   
}
