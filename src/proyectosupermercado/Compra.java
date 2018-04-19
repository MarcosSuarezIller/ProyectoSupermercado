/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosupermercado;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author DAM103
 * @version 1.0
 */
public class Compra {
    private int numCompra;
    private Calendar fecha;
    private double precioTotal;
    private char metodoPago;

    public Compra(int numCompra, Calendar fecha, double precioTotal, char metodoPago) {
        this.numCompra = numCompra;
        this.fecha = fecha;
        this.precioTotal = precioTotal;
        this.metodoPago = metodoPago;
    }

    public Compra() {
    }

    public int getNumCompra() {
        return numCompra;
    }

    public void setNumCompra(int numCompra) {
        this.numCompra = numCompra;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public char getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(char metodoPago) {
        this.metodoPago = metodoPago;
    }
    
    @Override
    public String toString() {
        SimpleDateFormat m = new SimpleDateFormat("EEEE dd/MMMM/yyyy HH:mm:ss", new Locale("es", "ES"));   
        return "Compra con el " + "numero de compra=" + numCompra + " con la fecha=" + m.format(fecha.getTime()) + ",con el precio total " + precioTotal + "  metodo de pago " + metodoPago;
    }
    
    
}
