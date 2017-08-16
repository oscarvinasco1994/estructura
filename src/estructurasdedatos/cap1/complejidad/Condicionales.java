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
public class Condicionales {
    
     public void ejercicioscondicionales(){
    Scanner N = new Scanner(System.in);
    
    int x;
    
    System.out.println("Ejercicios Condicionales..");
    System.out.println("1... Prolema 11.");
    System.out.println("2... Problema 4");
    System.out.println("3... Problema 5");
    
     x= N.nextInt();
     
     switch(x){
    case 1:
    int num1, num2,a;
    System.out.println("Problema 11");
    System.out.println("Ingrese primer numero");
    Scanner S = new Scanner(System.in);
    
    num1= S.nextInt();
    System.out.println("Ingrese segundo numero");
    Scanner A = new Scanner(System.in);
    num2= A.nextInt();       
        	if (num1>num2)
            {
   	System.out.println("Los valores introducidos no son correctos ");
           }
        	else
        	{
	    	for (x=num1;x<=num2;x++)
	    	{
       	System.out.println(x);
        }
	}
        break;
        
      case 2: 
           int b;
           System.out.println("-------------------------------");
           System.out.println("Problema 4");
        	for (b=1;b<=100;b++)
        	{
    	if (b%2==0)
    	{
       	System.out.println(b);
    	}
	}
           break;
        case 3:
             System.out.println("-------------------------------");
            System.out.println("Problema 5");
                int c;
           
        	for (c=1;c<=100;c++)
        	{
    	if (c%2!=0)
    	{
       	System.out.println(c);
    	}
	}
                break;
        case 4:
                int v,sum;
           
        	sum=0;
           
        	for (v=1;v<=100;v++)
        	{
    	if (v%2==0)
    	{
     	  sum=sum+v;
    	}
	}
           
        	System.out.println(sum);
               break;
     }
}
}