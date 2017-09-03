
package estructurasdedatos.cap1.complejidad;

import java.awt.PageAttributes;
import static java.awt.PageAttributes.MediaType.A;
import java.util.Scanner;
import javax.swing.JOptionPane; 

public class EjerciciosComplejidad {
public void ejerciciosOn(){
Scanner a=new Scanner(System.in);
int j=0;
System.out.println("ejercicios On");
System.out.println("1-ejercicio O(1)");
System.out.println("2-ejercicio O(n)");
System.out.println("3-ejercicio O(n^2)");
System.out.println("4-ejercicio O(n log(n))");

j=a.nextInt();

switch (j){
    case 1:
        System.out.println("ingrese dato para determinar si es par");//--------------O1
        Scanner b=new Scanner(System.in);//--------------O1
        int z= b.nextInt();//--------------O1
        if (z%2==0){//--------------On
        System.out.println("el numero es par");//--------------O1
        } else {//--------------On
            System.out.println("el numero es impar");//--------------O1
        }
        break;
    case 2:
        System.out.println("ingrese un dato para determinar si es primo");//--------------O1
        Scanner c= new Scanner(System.in);//--------------O1
        int n1=c.nextInt();//--------------O1
        int n2=n1-1; //--------------O1
        while ((n1%n2)!=0){//--------------On
        n2--;//--------------O1
        } if (n2==1){//--------------On
        System.out.println("el numero es primo");//--------------O1
        }else{//--------------On
        System.out.println("El numero no es primo");//--------------O1
        }
        break;
    case 3:
        System.out.println("ingrese el numero de la tabla de multiplicar");//--------------O1
        Scanner d=new Scanner(System.in);//--------------O1
        int h=d.nextInt();//--------------O1
        int multi;//--------------O1
        for (int g=1;g<=h;g++){//--------------On
        for (int i=1;i<=10;i++){//--------------On
           multi=g*i; //--------------O1
           System.out.println(g+"x"+i+"="+multi);//--------------O1
           
        }
                } 
        break;
    case 4:
       
    int izq = 0;//--------------O1
    int A[] = null;//--------------O1
    
  int pivote; // tomamos primer elemento como pivote//--------------O1
    pivote = A[izq];//--------------O1
  int i=izq; // i realiza la búsqueda de izquierda a derecha//--------------O1
    int der = 0;//--------------O1
    int p;//--------------O1
  // j realiza la búsqueda de derecha a izquierda
    p = der;
  int aux;//--------------O1
 
  while(i<p){            // mientras no se crucen las búsquedas//--------------On
     while(A[i]<=pivote && i<p) i++; // busca elemento mayor que pivote//--------------On
     while(A[p]>pivote) j--;         // busca elemento menor que pivote//--------------On
     if (i<p) {                      // si no se han cruzado  //--------------On                    
         aux= A[i];                  // los intercambia//--------------O1
         A[i]=A[p];//--------------O1
         A[p]=aux;//--------------O1
     }
   }
   A[izq]=A[p]; // se coloca el pivote en su lugar de forma que tendremos//--------------O1
   A[p]=pivote; // los menores a su izquierda y los mayores a su derecha//--------------O1
   if(izq<p-1)//--------------On
      quicksort(A,izq,p-1); // ordenamos subarray izquierdo//--------------O1
   if(p+1 <der)//--------------On
      quicksort(A,p+1,der); // ordenamos subarray derecho//--------------O1   

break;
   
        } 
       
}

    private void quicksort(PageAttributes.MediaType A, int izq, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void quicksort(int[] A, int izq, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
