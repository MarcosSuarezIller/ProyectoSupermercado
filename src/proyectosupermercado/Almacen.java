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
public class Almacen {
    private int id;
    private String nombre;
    private int capacidad;
    private String hubicacion;

    public Almacen(int id, String nombre, int capacidad, String hubicacion) {
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.hubicacion = hubicacion;
    }

    public Almacen() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getHubicacion() {
        return hubicacion;
    }

    public void setHubicacion(String hubicacion) {
        this.hubicacion = hubicacion;
    }

    @Override
    public String toString() {
        return "Almacen" + "id: " + id + ", nombre: " + nombre + ", capacidad: " + capacidad + ", hubicacion: " + hubicacion;
    }
    
    
}
