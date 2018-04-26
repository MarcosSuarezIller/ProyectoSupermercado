/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosupermercado;

/**
 *
 * @author anamg
 */
public class PeonAlmacen extends TAlmacen{
    public int edad;

    public PeonAlmacen() {
        super();
    }

    public PeonAlmacen(int edad, int idAlmacen, String categoria, String NIF, String nombre, String apellidos, String direccion, String telefono, boolean senior) {
        super(idAlmacen, categoria, NIF, nombre, apellidos, direccion, telefono, senior);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return super.toString()+"PeonAlmacen{" + "edad=" + edad + '}';
    }
    
}
