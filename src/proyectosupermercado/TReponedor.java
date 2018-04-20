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
public class TReponedor extends Trabajador{
    public int idReponedor;

    public TReponedor() {
    }

    public TReponedor(int idReponedor, String NIF, String nombre, String apellidos, String direccion, String telefono, boolean senior) {
        super(NIF, nombre, apellidos, direccion, telefono, senior);
        this.idReponedor = idReponedor;
    }

    public int getIdReponedor() {
        return idReponedor;
    }

    public void setIdReponedor(int idReponedor) {
        this.idReponedor = idReponedor;
    }

    @Override
    public String toString() {
        return super.toString()+"TReponedor{" + "idReponedor=" + idReponedor + '}';
    }
    
    
    
}
