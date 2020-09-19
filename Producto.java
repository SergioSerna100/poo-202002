package com.dispensadora;

public class Producto {
    private String nombre;
    private String codigo;
    private int unidadesProducto;
    private double precio;

    public Producto(String nombre, String codigo, int unidadesProducto, double precio) {

        this.nombre = nombre;
        this.codigo = codigo;
        this.unidadesProducto = unidadesProducto;
        this.precio = precio;

    }

    public void removerProducto() {
        this.unidadesProducto = unidadesProducto -1;
    }

    public boolean aumentarUnidadesProducto(int cantidad_Aumentar) {
        if (unidadesProducto <= 8) {
            if (unidadesProducto + cantidad_Aumentar > 8) {
                System.out.println("No se puede tener mas de 8 unidades por producto, la cantidad de: ");
            } else {
                this.unidadesProducto += cantidad_Aumentar;
                System.out.println("La cantidad aumentada de: ");
            }
        }
        return true;
    }

    public int getUnidadesProducto() {
        return unidadesProducto;
    }

    public void setUnidadesProducto(int unidadesProducto) {
        this.unidadesProducto = unidadesProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }
}
