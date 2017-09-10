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
 public void ordenarVec(int vector[]){
for(int i = 0; i < vector.length - 1; i++)
        {
            for(int j = 0; j < vector.length - 1; j++)
            {
                if (vector[j] < vector[j + 1])
                {
                    int tmp = vector[j+1];
                    vector[j+1] = vector[j];
                    vector[j] = tmp;
                }
            }
        }
    
}

public void buscarBinario(int pos, int vector[]){
Integer posini=0;
Integer posfin=vector.length-1;
Integer poscentral = null;
while(posini<=posfin){
if (vector[poscentral]==pos){
System.out.println("el dato esta en:"+posini+"y"+posfin);
}
else {if(pos<=vector[poscentral]){
posfin=poscentral;
}
 }
  }
   } 

    
    public void actualizar (int pos, String dato){   
        if(pos < tam){                             
            System.out.println("la posicion no existe"); 
        }else {
            vector[pos]= dato;                       
        }
    } 
    public void borrarposicion (Integer pos){            
        vector[pos]= null;                           
    }
}
