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
    private String id;
    private String nombre;
    private String capacidad;
    private String ubicacion;

    public Almacen(String id, String nombre, String capacidad, String ubicacion) {
        if(Validaciones.validarIdAlmacen(id)){
            this.id = id;
        }
        if(Validaciones.validarNombreAlmacen(nombre))
        this.nombre = nombre;
        if(Validaciones.validarCapacidadAlmacen(capacidad))
        this.capacidad = capacidad;
        if(Validaciones.validarUbicacionAlmacen(ubicacion))
        this.ubicacion = ubicacion;
    }

    public Almacen() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getHubicacion() {
        return ubicacion;
    }

    public void setHubicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Almacen" + "id: " + id + ", nombre: " + nombre + ", capacidad: " + capacidad + ", hubicacion: " + ubicacion;
    }
    
    
}
