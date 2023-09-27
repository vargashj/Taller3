package com.hectorvargas.app;

import com.hectorvargas.dominio.Mercado;
import com.hectorvargas.dominio.Producto;

import java.util.ArrayList;

public class Aplicacion {


        public static void main(String[] args) {
            Mercado mercado = new Mercado(24); // Capacidad máxima de 10 productos por clase

            Producto producto1 = new Producto(1, "Frutas");
            Producto producto2 = new Producto(3, "Verduras");
            Producto producto3 = new Producto(3, "Frutas");
            Producto producto4 = new Producto("Manzanas", 1.900);



            boolean resultado4 = mercado.retirar("Manzanas");
            boolean resultado1 = mercado.agregar(producto1); // Debería devolver true
            boolean resultado2 = mercado.agregar(producto2); // Debería devolver true
            boolean resultado3 = mercado.agregar(producto3); // Debería devolver false


            int totalInventario = mercado.calcularTotal();






            System.out.println(resultado1); // true
            System.out.println(resultado2); // true
            System.out.println(resultado3); // false
            System.out.println(resultado4); // true
            System.out.println(totalInventario);
        }








}
