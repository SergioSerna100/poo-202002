package com.parcial;



import java.util.ArrayList;
import java.util.Arrays;

public class AppMercado {
    public static void main(String[] args) {
        Mercado mercadito = new Mercado ("Super Mercado");

        Producto Carne = new Producto(123, "cerdo", 10, 1500, "fina");
        Producto Verdura = new Producto(1234, "cilantro", 5, 100, "seco");
        Producto Celular = new Producto(311, "Huawei", 2, 10000, "y5");
        Producto Lacteo = new Producto(344, "Yougurt", 5, 2000, "kumis");

        ArrayList <Producto> productos = new ArrayList<Producto>(Arrays.asList(Carne, Verdura, Celular, Lacteo));
        mercadito.setProductos(productos);
    }
}
