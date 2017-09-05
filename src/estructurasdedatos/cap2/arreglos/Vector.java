
package estructurasdedatos.cap2.arreglos;


public class Vector {
 
    private int tam;
    private String[] vector;


    public void crearVector(int n) {        
        this.tam = n; 
        this.vector = new String[this.tam]; 
    }
    public void settam(int t) {
        this.tam = t;
    }
    public int gettam() {
        return tam;
    }   
    public boolean Elimiar(int t) {  
        this.vector = null;
        return true;
    }
    public void Insertar(String n, int pos) { 
        vector[pos] = n;                     
    }
    public String[] listar() {

        for (int i = 0; i < tam; i++) {     
            System.out.println(vector[i]);  
        }
        return vector;
    }
    public void buscarDato(String dato) {  
        int i = 0;

        while (i < tam) {                   
            if (vector[i].equals(dato)) {   
                System.out.println("el dato esta en la posicion: " + i);  
            }
            i++;
        }
    } 
    public void actualizar (int pos, String dato){   
        if(pos < tam){                             
            System.out.println("la posicion no existe"); 
        }else {
            vector[pos]= dato;                       
        }
    } 
    public void borrarposicion (int pos){            
        vector[pos]= null;                           
    }
}


