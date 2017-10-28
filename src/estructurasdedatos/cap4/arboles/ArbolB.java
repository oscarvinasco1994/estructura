/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap4.arboles;


public class ArbolB{

    private NodoArbol raiz;

        public boolean vacio() {
            return raiz == null;
        }

        
    public void Insertar(int nodo) {
            if (raiz!= null) {
                NodoArbol nuevonodo = new NodoArbol();
                nuevonodo.dato = nodo;
                nuevonodo.hijoderecho= new ArbolB();
                nuevonodo.hijoizquierdo= new ArbolB();
                raiz=nuevonodo;
           }else{
                if(nodo > raiz.dato){
                    raiz.hijoderecho.Insertar(nodo);
                }
                if(nodo < raiz.dato){
                    raiz.hijoizquierdo.Insertar(nodo);
                }
            }
        }       
       
        
    public ArbolB Buscar(int nodo){
            ArbolB subarbol = null;
            if(raiz!= null){
                if(nodo == raiz.dato){
                    return this;
                }else{
                    if(nodo < raiz.dato){
                        subarbol=raiz.hijoizquierdo.Buscar(nodo);
                    }else{
                        subarbol=raiz.hijoderecho.Buscar(nodo);
                    }
                }
            }
            
            return subarbol;
        }
       
    
    public int buscarMin() {
        ArbolB arbolActual = this;
        while( !arbolActual.raiz.hijoizquierdo.vacio() ) {
            arbolActual = arbolActual.raiz.hijoizquierdo;
        }
        int devuelvo= arbolActual.raiz.dato;
        arbolActual.raiz=null;
        return devuelvo;

    }
 

    public int buscarMan() {
        ArbolB arbolActual = this;
        while( !arbolActual.raiz.hijoderecho.vacio() ) {
            arbolActual = arbolActual.raiz.hijoderecho;
        }
        int devuelvo= arbolActual.raiz.dato;
            arbolActual.raiz=null;
        return devuelvo;
    }
     
    
    public int AlturaArbol(){
            if(raiz!= null){
                return 0;
            }else{
                int hijoizquierdo=raiz.hijoizquierdo.AlturaArbol();
                int hijoderecho=raiz.hijoderecho.AlturaArbol();
                return (1+Math.max(hijoizquierdo, hijoderecho));
            }
        }
              
        
    public boolean hoja(){
            boolean hoja=false;
            if(raiz.hijoizquierdo.vacio() && raiz.hijoderecho.vacio()){
                hoja = true;
            }
            return hoja;
        }
    
    
    public void borrar(int a) {
        ArbolB eliminar = Buscar(a);
        if (!eliminar.vacio()) {
            if (eliminar.hoja()) {
                eliminar.raiz = null;
            }
            else {
                if (!eliminar.raiz.hijoizquierdo.vacio() && !eliminar.raiz.hijoderecho.vacio()) {
                    eliminar.raiz.dato = eliminar.raiz.hijoderecho.buscarMin();
                }
                else {
                    if (eliminar.raiz.hijoizquierdo.vacio()) {
                        eliminar.raiz = eliminar.raiz.hijoderecho.raiz;
                    }else{
                        eliminar.raiz = eliminar.raiz.hijoizquierdo.raiz;
                    }
                }
            }
        }
    }

   public void orden(){
            if(raiz!= null){
                raiz.hijoizquierdo.orden();
                System.out.print(raiz.dato + ",");
                raiz.hijoderecho.orden();
            }
        }
   
   
    public void preorden(){
            if(raiz!= null){
                System.out.print(raiz.dato + ",");
                raiz.hijoizquierdo.preorden();
                raiz.hijoderecho.preorden();
            }
        }
        
            
     public void postorden(){
            if(raiz!= null){
                raiz.hijoizquierdo.postorden();
                raiz.hijoderecho.postorden();
                System.out.print(raiz.dato + ",");
            }
        }   
    
    
    
    }

}
