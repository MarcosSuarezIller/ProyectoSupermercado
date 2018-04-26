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
public class TAlmacen extends Trabajador{
    public int idAlmacen;
    public String categoria;

    public TAlmacen() {
        super();
    }

    public TAlmacen(int idAlmacen, String categoria, String NIF, String nombre, String apellidos, String direccion, String telefono, boolean senior) {
        super(NIF, nombre, apellidos, direccion, telefono, senior);
        this.idAlmacen = idAlmacen;
        this.categoria = categoria;
    }

    public int getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(int idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString()+"TAlmacen{" + "idAlmacen=" + idAlmacen + ", categoria=" + categoria + '}';
    }

    
    
}
