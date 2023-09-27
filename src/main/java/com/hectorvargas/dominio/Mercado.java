package com.hectorvargas.dominio;

import java.util.ArrayList;
import java.util.List;

public class Mercado {
 private String nombreSuperMercadoHV;
 public static Byte capacidadHv = 24;
 private List<Producto> productos;


    public Mercado(int capacidad) {
        this.productos = new ArrayList<Producto>();
        this.capacidadHv = (byte) capacidad;
    }
    public boolean agregar(Producto p) {

        for (Producto producto : productos) {
            if (producto.getCodigoHv() == p.getCodigoHv()) {
                return false;
            }
        }


        int contador = 0;
        for (Producto producto : productos) {
            if (producto.getCantidadHV()) {
                contador++;
            }
        }
        if (contador >= capacidadHv) {
            return false;
        }


        productos.add(p);
        return true;
    }
    public boolean retirar(String nombre) {

        for (Producto producto : productos) {
            if (producto.getNombreHV().equals(nombre)) {

                productos.remove(producto);
                return true;
            }
        }

        return false;
    }

    public ArrayList<Producto> buscar(String tipo) {
        ArrayList<Producto> productosTipo = new ArrayList<Producto>();
        // Buscar los productos del mismo tipo
        for (Producto producto : productos) {
            if (producto.getTipoHV().equals(tipo)) {
                productosTipo.add(producto);
            }
        }
        // Devolver la lista de productos del mismo tipo
        return productosTipo;
    }

    public int calcularTotal() {
        int total = 0;
        // Calcular el total de inventario de todos los productos
        for (Producto producto : productos) {
            total += producto.getInventario();
        }
        // Devolver el total de inventario
        return total;
    }

}
