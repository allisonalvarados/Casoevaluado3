/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superchino;

/**
 *
 * @author 50672
 */
public class Producto {
    //Desglose de datos
    private String codigoProducto;
    private String nombreProducto;
    private String tipoProducto;
    private int cantidad;
    private double precioBase;
    private double precioBruto;
    private double ganancia;
    private String nombreEmpleado;
    private String cedulaEmpleado;

    //Setters and Getters
    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPrecioBruto() {
        return precioBruto;
    }

    public void setPrecioBruto(double precioBruto) {
        this.precioBruto = precioBruto;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    public void setCedulaEmpleado(String cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }
    
    //Calcular la ganancia esperada
    
    public void calcularGanancia() {
        ganancia = (precioBruto - precioBase) * cantidad;
    }

    
    //Mostrar la información completa del producto
     
    public void mostrarProducto() {
        System.out.println("Código: " + codigoProducto);
        System.out.println("Nombre: " + nombreProducto);
        System.out.println("Tipo: " + tipoProducto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio Base: " + precioBase);
        System.out.println("Precio Bruto: " + precioBruto);
        System.out.println("Ganancia: " + ganancia);
        System.out.println("Empleado: " + nombreEmpleado + " - " + cedulaEmpleado);
        System.out.println("");
}

    void calcularPrecioBruto() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    }
 