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
public class TCajero extends Trabajador{
    public int idCajero;

    public TCajero() {
        super();
    }

    public TCajero(int idCajero, String NIF, String nombre, String apellidos, String direccion, String telefono, boolean senior) {
        super(NIF, nombre, apellidos, direccion, telefono, senior);
        this.idCajero = idCajero;
    }

    public int getIdCajero() {
        return idCajero;
    }

    public void setIdCajero(int idCajero) {
        this.idCajero = idCajero;
    }

    @Override
    public String toString() {
        return super.toString()+"TCajero{" + "idCajero=" + idCajero + '}';
    }
    
    
}
