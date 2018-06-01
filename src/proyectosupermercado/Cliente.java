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
public class Cliente {

    private String numeroCliente;
    private String nombre;
    private String telefono;
    private String direccion;

    public Cliente() {
    }

    public Cliente(String numeroCliente, String nombre, String telefono, String direccion) throws Exception {
        if(Validaciones.validaNCliente(numeroCliente)){
             this.numeroCliente = numeroCliente;
        }
        if(Validaciones.validaNombre(nombre)){
            this.nombre = nombre;
        }
        if(Validaciones.validaTelefono(telefono)){
            this.telefono = telefono;
        }
        if(Validaciones.validaDireccion(direccion)){
            this.direccion = direccion;
        }
        
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public Cliente(Cliente c) {
        this.numeroCliente = c.getNumeroCliente();
        this.nombre = c.getNombre();
        this.telefono = c.getTelefono();
        this.direccion = c.getDireccion();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "------Cliente------ \nNúmero de Cliente: " + numeroCliente + "\nNombre: " + nombre + "\nTeléfono: " + telefono + "\nDirección: " + direccion;
    }

}
