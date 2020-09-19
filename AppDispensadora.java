package com.dispensadora;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;

public class AppDispensadora {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido a la Dispensadora");

        Dispensador deMecato = new Dispensador("Checho");

        Producto Chocolatina = new Producto("Jumbo", "J12", 5, 1500);
        Producto Gatorade = new Producto("Gatorade", "G10", 2, 2000);
        Producto Papitas = new Producto("Margarita","D1",1,2000);
        Producto Gomitas = new Producto("Sandias", "S12", 8, 1000);
        Producto Lechera = new Producto("Nestle","N21",6,500);
        Producto Hit = new Producto("Hit Mango", "H54", 5, 2000);
        Producto Mani = new Producto("La especial", "L12", 4, 1500);
        Producto Galletas = new Producto("Noel", "N31", 3, 200);
        Producto BomBomBum = new Producto("Pirulito", "P43", 4, 100);
        Producto BonYurt = new Producto("BonYurt", "B31", 6, 2500);

        ArrayList <Producto> productos = new ArrayList<Producto>(Arrays.asList(Chocolatina, Gatorade, Papitas, Gomitas, Lechera, Hit, Mani, Galletas, BomBomBum, BonYurt));
        deMecato.setProductos(productos);

        System.out.println("Producto del dispensador " + Chocolatina.getNombre() + " su precio es " + Chocolatina.getPrecio() + " pesos " + "\n");

        //Por Nombre
        deMecato.retirarProducto("La especial");
        System.out.println("Las unidades que quedan de " + Mani.getNombre() + " son  " + Mani.getUnidadesProducto() + "\n");

        //Por Codigo
        deMecato.retirarProducto("D1");
        System.out.println("las unidades que quedan de " + Papitas.getNombre() + " son " +Papitas.getUnidadesProducto() + "\n");

        //Ver productos agotados
        System.out.println("Los productos agotados son: " + deMecato.consultarProductosAgotados() + "\n");

        //Consultar el total de unidades de un producto determinado
        System.out.println("Total de unidades de " + Gatorade.getNombre() + " que hay son  " + deMecato.consultarTotalUnidadesDeProducto(Gatorade) + "\n");

        //Consultar el total de unidades de todos los productos
        System.out.println("El total de unidades de todos los productos es " + deMecato.consultarTotalUnidadesTodosProductos() + "\n");

        //Aumentar la cantidad de unidades a un producto determinado
        deMecato.aumentarCantidadUnidadesProducto(BonYurt, 2);
        System.out.println(BonYurt.getNombre() + " son " +BonYurt.getUnidadesProducto());

        deMecato.aumentarCantidadUnidadesProducto(Papitas, 5);
        System.out.println(Papitas.getNombre() + " son " + Papitas.getUnidadesProducto() + "\n");
    }
}
