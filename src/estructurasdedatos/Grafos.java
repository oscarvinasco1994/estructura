/* * To change this license header, choose License Headers in Project Properties. * To change this template file, choose Tools | Templates * and open the template in the editor. */package grafos;
import java.util.ArrayList;import java.util.List;import java.util.Vector;
/** * * @author utp */public class Grafos {
      public int[] vertice;   public int[][] matrizAdyacencia;   public int tam;        public void crear(int n){    this.tam=n;    this.vertice=new int[this.tam];     this.matrizAdyacencia=new int[this.tam][this.tam];    }        public void insertarVertice(String dato) {        Vertice nodo = new Vertice();        nodo.setDato(dato);         for(int i=0;i< vertice.length;i++){        if(vertice[i]==null){                }        }            }       
           }        
}
