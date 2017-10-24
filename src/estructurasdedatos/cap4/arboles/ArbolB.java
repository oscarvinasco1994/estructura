/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap4.arboles;

/**
 *
 * @author tusk
 */
public class ArbolB{
    
    

    private Nodoarbol raiz;

        public boolean vacio() {
            return raiz == null;
        }

        
    public void Insertar(Nodoarbol raiz) {
            if (raiz!= null) {
                Nodoarbol nuevonodo = new Nodoarbol();
                nuevonodo.setDato(raiz);
                nuevonodo.setHijoderecho(new Nodoarbol());
                nuevonodo.setHijoizquierdo(new Nodoarbol());
                raiz=nuevonodo;
           }else{
                if(raiz > raiz.getDato()){
                    raiz.getHijoderecho().Insertar(Nodoarbol);
                }
                if(Nodoarbol < raiz.getDato()){
                    raiz.getHijoizquierdo().Insertar(Nodoarbol);
                }
            }
        }       
       
        
    public ArbolB Buscar(int nodo){
            ArbolB subarbol = null;
            if(raiz!= null){
                if(nodo == raiz.getDato()){
                    return this;
                }else{
                    if(nodo < raiz.getDato()){
                        subarbol=raiz.getHijoizquierdo().Buscar(nodo);
                    }else{
                        subarbol=raiz.getHijoderecho().Buscar(nodo);
                    }
                }
            }
            
            return subarbol;
        }
       
    
    public int buscarMin() {
        ArbolB arbolActual = this;
        while( !arbolActual.raiz.hijoizquierdo.vacio() ) {
            arbolActual = arbolActual.raiz.getHijoizquierdo();
        }
        int devuelvo= arbolActual.raiz.getDato();
        arbolActual.raiz=null;
        return devuelvo;

    }
 

    public int buscarMan() {
        ArbolB arbolActual = this;
        while( !arbolActual.raiz.hijoderecho.vacio() ) {
            arbolActual = arbolActual.raiz.getHijoderecho();
        }
        int devuelvo= arbolActual.raiz.getDato();
            arbolActual.raiz=null;
        return devuelvo;
    }
     
    
    public int AlturaArbol(){
            if(raiz!= null){
                return 0;
            }else{
                int hijoizquierdo=raiz.getHijoizquierdo().AlturaArbol();
                int hijoderecho=raiz.getHijoderecho().AlturaArbol();
                return (1+Math.max(hijoizquierdo, hijoderecho));
            }
        }
              
        
  
    
    


   public void orden(Nodoarbol raiz){
            if(raiz!= null){
                orden(raiz.getHijoizquierdo());
                System.out.print(raiz.getDato() + ",");
                orden(raiz.getHijoderecho());
            }
        }
   
   
    public void preorden(Nodoarbol raiz){
            if(raiz!= null){
                System.out.print(raiz.getDato() + ",");
                preorden(raiz.getHijoizquierdo());
                preorden(raiz.getHijoderecho());
            }
        }
        
            
     public void postorden(Nodoarbol raiz){
            if(raiz!= null){
                postorden(raiz.getHijoizquierdo());
                postorden(raiz.getHijoderecho());
                System.out.print(raiz.getDato() + ",");
            }
        }   
    
    
    
}
