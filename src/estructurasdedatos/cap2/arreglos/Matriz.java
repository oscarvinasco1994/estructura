package estructurasdedatos.cap2.arreglos;

/**
 *
 * @author tusk
 */
public class Matriz {
   
//declarar las variables//

    private int filas;           
    private int columnas;        
    private int[][] matriz;      

//se le implementa en la estructura matriz//
    public void crearmatriz(int f, int c) {  
        this.filas = f;                      
        this.columnas = c;                  
        this.matriz = new int[f][c];         
    }

//se incorporan los datos dentro de la matriz//
    public void insertar(int f, int c, int dato) {  
        this.filas = f;
        this.columnas = c;
        this.matriz[f][c] = dato;                   
    }

//eliminar algun dato de la matriz//
    public void eliminar(int f, int c) {
        this.filas = f;
        this.columnas = c;
        this.matriz[f][c] = 0;
    }

// para buscar un dato//
    public void buscardato(int dato) {     

        for (int f = 0; f < matriz.length; f++) {   
            for (int c = 0; c < matriz.length; c++) {  
                if (this.matriz[f][c] == dato) {       
                    System.out.println("el dato se encuenta en la posicion: " + f
                            + "," + c);
                }
            }
        }
    }

//  para listar la matriz//
    public void listar() {

        for (int x = 0; x < matriz.length; x++) {        
            for (int y = 0; y < matriz[x].length; y++) { 
                System.out.print(matriz[x][y] + " ");   
            }
            System.out.println(" ");
        }
    }
}
