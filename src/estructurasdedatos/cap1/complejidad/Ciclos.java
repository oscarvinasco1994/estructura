/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap1.complejidad;

import java.util.Scanner;
/**
 *
 * @author tusk
 */
public class Ciclos {
    
    public void ejerciciosCiclos(){
    Scanner N = new Scanner(System.in);
    
    int x;
    
    System.out.println("Ejercicios ciclos..");
    System.out.println("1... Prolema 21.");
    System.out.println("2... Problema 3");
    System.out.println("3... Problema 6");
     
     x= N.nextInt();
     
     switch(x){
         case 1:
         int num, num4;
         System.out.println("Ingrese Numero a sacar factorial.. ");
         Scanner W = new Scanner(System.in);
   
         num= W.nextInt();
         num4=num;

  while (num4!=1){
    	num4=num4-1;
    	num=num*num4;
  }
    System.out.println("El factorial es... " +num);
    break;
    
         case 2: 
            int z;
            for(z=100;z>=1;z--){
            System.out.println(z);
        }
            break;
        
         case 3:
             int v,sum;
           
        	sum=0;
           
        	for (v=1;v<=100;v++)
        	{
                sum=sum+v;
                }
                System.out.println(sum); 
                break;
     }
     
    
    
    }
    
}
