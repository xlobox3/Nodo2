
package nodo2;

import java.util.Scanner;


public class Nodo2 {

    int dato;
    Nodo2 siguiente;
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcion;
        
        Nodito2 n = new Nodito2();
        
        do {            
            System.out.println("\n1.- Agregar nodo");
            System.out.println("2.- Mostrar nodo");
            System.out.println("3.- Eliminar nodo");
            System.out.println("4.- buscar Nodo");
            System.out.println("5.- Salir\n");

            System.out.print("Su opcion es --> ");
            
            opcion = lector.nextInt();
            switch(opcion)
            {
              case 1:
                  n.InsertarNodo();
                    break;
              case 2:
                  n.mostrarNodo();
                  break;
              case 3:
                  n.eliminarNodo();
                  break;
              case 4:
                  n.buscarNodo();
                  break;
              case 5: 
                  System.out.println("Programa terminado :D");
                  break;
              default: System.out.println("elija una opcion valida");
                }
        }
        while(opcion !=5);
    }    
}
