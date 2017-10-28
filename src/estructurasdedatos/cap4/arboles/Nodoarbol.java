
package estructurasdedatos.cap4.arboles;

public class NodoArbol {
    
        public ArbolB hijoderecho;
        public ArbolB hijoizquierdo;
        public int dato;

        public void NodoArbol() {
            this.hijoderecho = null;
            this.hijoizquierdo = null;
            this.dato = 0;
        }
}
