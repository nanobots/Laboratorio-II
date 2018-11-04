/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PilasYcolas;

import java.util.LinkedList;
import java.util.Queue;
import java.lang.Integer;
import java.util.Stack;
/**
 *
 * @author note
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    
    
     
      // C O L A S
    //    ------------
        Queue<Integer> cola = new LinkedList<>();
        cola.offer(1);
        cola.offer(9);
        cola.offer(3);
        cola.offer(7);
        //int sizeCola;
        for (int i : cola)
        {
            System.out.println(i);
        }
        System.out.println("Cantidad de elementos encolados: " + cola.size());
        System.out.println("Primer elemento a desencolar: " + cola.peek());
        //Tres formas de desapilar (el atributo size() se actualiza dinámicamente a medida que desapilo)
        //1)
        //sizeCola = cola.size();
        //for (int i = 0; i < sizeCola; i++)
        //{
        //    System.out.println("Desencolo: " + cola.poll());
        //}
        //2)
        //for (int i = cola.size(); i > 0; i--)
        //{
        //    System.out.println("Desencolo: " + cola.poll());
        //}
        //3)
        while (cola.size() > 0)
        {
            System.out.println("Desencolo: " + cola.poll());
        }
        System.out.println("Cantidad de elementos encolados: " + cola.size());
       
        
        /* P I L A S
        ------------*/
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(9);
        pila.push(3);
        pila.push(7);
        //int sizePila;
        //System.out.println("7\n3\n9\n1");
        for (int i : pila)
        {
            System.out.println(i);
        }
        System.out.println("Cantidad de elementos apilados: " + pila.size());
        System.out.println("Primer elemento a desapilar: " + pila.peek());
        //Tres formas de desapilar (el atributo size() se actualiza dinámicamente a medida que desapilo)
        //1)
        //sizePila = pila.size();
        //for (int i = 0; i < sizePila; i++)
        //{
        //    System.out.println("Desapilo: " + pila.pop());
        //}
        //2)
        for (int i = pila.size(); i > 0; i--)
        {
            System.out.println("Desapilo: " + pila.pop());
        }
        //3)
        while (pila.size() > 0)
        {
            System.out.println("Desapilo: " + pila.pop());
        }
        System.out.println("Cantidad de elementos apilados: " + pila.size());
   
    }  // TODO code application logic here
   // }
    
}
