/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superchino;

import java.util.Scanner;

/**
 *
 * @author 50672
 */
public class Inventario {
    
    private Producto[] productos;
    private int cantidadProductos;

    private String nombreSuper;
    private String codigoSuper;
    private String nombreEmpleado;
    private String cedulaEmpleado;

  
    //Constructor del inventario con tamaño máximo.
     
    public Inventario(int maxProductos) {
        productos = new Producto[maxProductos];
        cantidadProductos = 0;
    }

   
    //Pedimos los datos del supermercado y del empleado al usuario
     
    public void ingresarDatosSuper() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del Super: ");
        nombreSuper = sc.nextLine();
        System.out.print("Código del Super: ");
        codigoSuper = sc.nextLine();
        System.out.print("Nombre del Empleado: ");
        nombreEmpleado = sc.nextLine();
        System.out.print("Cédula del Empleado: ");
        cedulaEmpleado = sc.nextLine();
    }

    
    //Agrega un nuevo producto al inventario
     
    public void agregarProducto() {
        if (cantidadProductos >= productos.length) {
            System.out.println("Inventario lleno.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        Producto p = new Producto();

        System.out.print("Código del producto: ");
        p.setCodigoProducto(sc.nextLine());

        System.out.print("Nombre del producto: ");
        p.setNombreProducto(sc.nextLine());

        System.out.print("Tipo (Alimentos, Bebidas, Higiene, Limpieza): ");
        p.setTipoProducto(sc.nextLine());

        System.out.print("Cantidad: ");
        p.setCantidad(sc.nextInt());

        System.out.print("Precio base: ");
        p.setPrecioBase(sc.nextDouble());
        sc.nextLine(); // limpiar

        p.setNombreEmpleado(nombreEmpleado);
        p.setCedulaEmpleado(cedulaEmpleado);

        p.calcularPrecioBruto();
        p.calcularGanancia();

        productos[cantidadProductos] = p;
        cantidadProductos++;
    }

   
   //Muestra todos los productos del inventario
   
    public void mostrarTodosLosProductos() {
        for (int i = 0; i < cantidadProductos; i++) {
            productos[i].mostrarProducto();
        }
    }

    
    //Muestra la ganancia total esperada por todos los productos
     
    public void mostrarGananciaTotal() {
        double total = 0;
        for (int i = 0; i < cantidadProductos; i++) {
            total += productos[i].getGanancia();
        }
        System.out.println("Ganancia total esperada: " + total);
    }
}

