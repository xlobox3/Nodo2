
package nodo2;

import java.util.Scanner;


public class Nodito2 {
     Scanner lector = new Scanner(System.in);
    
   Nodo2 primero = new Nodo2();
    Nodo2 ultimo = new Nodo2();
    
    public Nodito2(){
        primero = null;
        ultimo = null;
    }
    public void InsertarNodo(){
        Nodo2 nuevo = new Nodo2();
         System.out.println("ingrese el dato para el nodo: ");
         nuevo.dato = lector.nextInt();
         if(primero == null){
             primero = nuevo;
             primero.siguiente = null;
             ultimo = nuevo;
         }else{
             ultimo.siguiente = nuevo;
             nuevo.siguiente = null;
             ultimo = nuevo;
             
         }
         System.out.println("el dato fue ingresado correctamente");     
     }
    public void mostrarNodo(){
        Nodo2 actual = new Nodo2();
        actual = primero;
        if(primero != null){
            while(actual !=null){
                System.out.print("["+actual.dato+"]--->");
                actual = actual.siguiente; 
            }
        }else{
            System.out.println("la pila esta vacia");
        }
    }
    public void eliminarNodo(){
         Nodo2 actual = new Nodo2();
        actual=primero;
        Nodo2 anterior = new Nodo2();
        anterior = null;
        boolean encontrado = false;
        System.out.println("ingrese el dato del nodo a eliminar: ");
        int buscando = lector.nextInt();
        if(primero != null ){
          while(actual != null && encontrado != true){
            if(actual.dato == buscando){
              if(actual == primero){
               primero = primero.siguiente;
              }else{
               anterior.siguiente = actual.siguiente;
              }
              System.out.println("el nodo eliminado es: " +actual.dato );
              encontrado=true;
              }
              anterior = actual;
              actual = actual.siguiente;
          }  
          if(!encontrado){
              System.out.println("el nodo no se ha encontrado");
          }
        }else{
            System.out.println("la pila esta vacia");
        }
    }
     public void buscarNodo(){
        Nodo2 actual = new Nodo2();
        actual = primero;
        int posicion=1;
        boolean encontrar = false;
        System.out.println("digite el numero a buscar");
        int buscar = lector.nextInt();
        if(primero != null && encontrar !=true){           
            while(actual != null){
                if(actual.dato == buscar){
                    System.out.println("El dato "+actual.dato+" se ha encontrado "
                            + "en la posicion "+posicion);
                           
                    encontrar = true;
                }
                actual = actual.siguiente;
                posicion++;
            }if(!encontrar){
                System.out.println("nodo no encontrado");
            }
        }else{System.out.println("pila vacia");
                }
  }
}