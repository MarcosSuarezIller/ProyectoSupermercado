/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosupermercado;

/**
 *
 * @author DAM103
 * @version 1.0
 */
public class Estanteria {

    private int id;
    private String lugar;
    private double longitud;

    public Estanteria() {
    }

    public Estanteria(int id, String lugar, double longitud) {
        this.id = id;
        this.lugar = lugar;
        this.longitud = longitud;
    }

    public Estanteria(Estanteria e) {
        this.id = e.getId();
        this.lugar = e.getLugar();
        this.longitud = e.getLongitud();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "------Estanteria------ \nId: " + id + "\nLugar: " + lugar + "\nLongitud: " + longitud;
    }

}
