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
public class Trabajador {
    private String NIF;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String telefono;
    private boolean senior;

    public Trabajador() {
    }

    public Trabajador(String NIF, String nombre, String apellidos, String direccion, String telefono, boolean senior) {
        if(Validaciones.validarNif(NIF))
        {
        this.NIF = NIF;}
        if(Validaciones.ValidarNombreTrabajador(nombre))
        {this.nombre = nombre;}
        if(Validaciones.validarApellido(apellidos))
        {this.apellidos = apellidos;}
        if(Validaciones.validaDirreccionTrabajdor(direccion))
        {this.direccion = direccion;}
        if(Validaciones.validarTelefonoTrabajador(telefono))
        {this.telefono = telefono;}
        this.senior = senior;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isSenior() {
        return senior;
    }

    public void setSenior(boolean senior) {
        this.senior = senior;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "NIF=" + NIF + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion + ", telefono=" + telefono + ", senior=" + senior + '}';
    }
    
    
}
