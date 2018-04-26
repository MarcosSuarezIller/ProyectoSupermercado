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
public class JefeAlmacen extends TAlmacen{

    public JefeAlmacen() {
    }

    public JefeAlmacen(int idAlmacen, String categoria, String NIF, String nombre, String apellidos, String direccion, String telefono, boolean senior) {
        super(idAlmacen, categoria, NIF, nombre, apellidos, direccion, telefono, senior);
    }

    @Override
    public String toString() {
        return super.toString()+"JefeAlmacen{" + '}';
    }
    
}
