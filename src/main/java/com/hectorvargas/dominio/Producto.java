package com.hectorvargas.dominio;

public class Producto {

    public static int getcodigoHV;
    private int codigoHv;
    private String nombreHV;
    private int cantidadHV;
    private int precioHV;
    private String tipoHV;

    public Producto(int codigoHv, String nombreHV, int cantidadHV, int precioHV, String tipoHV) {
        this.codigoHv = codigoHv;
        this.nombreHV = nombreHV;
        this.cantidadHV = cantidadHV;
        this.precioHV = precioHV;
        this.tipoHV = tipoHV;
    }

    public Producto(int codigoHv, String frutas) {
    }

    public Producto(String manzanas, double v) {
    }

    public Producto(String zanahorias, String verduras, double v) {
    }


    public int getCodigoHv() {
        return codigoHv;
    }

    public String getNombreHV() {
        return nombreHV;
    }

    public boolean getCantidadHV() {

        return false;
    }

    public int getPrecioHV() {
        return precioHV;
    }

    public String getTipoHV() {
        return tipoHV;
    }

    public void setCodigoHv(int codigoHv) {
        this.codigoHv = codigoHv;
    }

    public void setCantidadHV(int cantidadHV) {
        this.cantidadHV = cantidadHV;
    }

    public void setPrecioHV(int precioHV) {
        this.precioHV = precioHV;
    }


    public int getInventario() {
        return 0;
    }
}
