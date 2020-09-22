package com.parcial;
import java.util.ArrayList;
import java.util.List;

public class Mercado {
    public static byte CAPACIDAD = 22;
    private String supermercado;

    private ArrayList<Producto> productos;

    public Mercado (String supermercado){
        this.supermercado = supermercado;
    }

    public boolean Agregar(Producto p){
        boolean ingresar = true;
        Producto buscarProducto = buscarCodigo(p.getCodigo());

        if (buscarProducto == null && this.productos.size() < CAPACIDAD) {
            this.productos.add(p);
            CAPACIDAD--;
        } else {
            ingresar = false;
        }

        return ingresar;
    }

    public boolean retirar (String nombre){
        for (Producto producto : productos) {
            if (producto.equals(producto)) {
                productos.remove(producto);
                CAPACIDAD++;
            }
        }
        return false;
    }

    public ArrayList <Producto> buscarNombre (String nombre){
        ArrayList <Producto> encontrarProducto = new ArrayList<Producto>();
        for (Producto productoM : productos) {
            if (productoM.getNombre().equalsIgnoreCase(nombre)) {
                boolean add = encontrarProducto.add(productoM);
            }
        }
        return encontrarProducto;
    }

    public Producto buscarCodigo (int codigo){
        Producto encontrarProducto = null;

        for (Producto productoE : productos) {

            if (productoE.getCodigo() == codigo) {
                encontrarProducto = productoE;
                break;
            }
        }

        return encontrarProducto;
    }

    public ArrayList<Producto> buscarTipo(String tipo) {
        List<Producto> RecibeProducto = new ArrayList<Producto>();

                for (Producto producto : productos) {
            if (producto.getTipo() == tipo) {
                RecibeProducto.add(producto);
            }
        }
        return (ArrayList<Producto>) RecibeProducto;
    }

    public double calcularTotal(){
        double totalAPagar = 0;
        for (int i = 0; i < productos.size(); i++) totalAPagar = totalAPagar + productos.get(i).getPrecio();
        return totalAPagar;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
}
