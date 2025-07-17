/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package superchino;

import java.util.Scanner;

/**
 *
 * @author 50672
 */
public class SuperChino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        Inventario inventario = new Inventario(10); //10 productos
        inventario.ingresarDatosSuper();

        Scanner sc = new Scanner(System.in);
        String seguir = "seguir";

        while (seguir.equalsIgnoreCase("seguir")) {
            inventario.agregarProducto();
            System.out.print("¿Desea agregar otro producto? (si/no)"
                    + "");
            seguir = sc.nextLine();
        }
        
        System.out.println("Productos Agregados");
        inventario.mostrarTodosLosProductos();

        System.out.println("Productos Agregados");
        inventario.mostrarGananciaTotal();
    }
}
   
    

