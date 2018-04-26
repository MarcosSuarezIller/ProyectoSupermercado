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

    private int numeroCliente;
    private String nombre;
    private String telefono;
    private String direccion;

    public Cliente() {
    }

    public Cliente(int numeroCliente, String nombre, String telefono, String direccion) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Cliente(Cliente c) {
        this.numeroCliente = c.getNumeroCliente();
        this.nombre = c.getNombre();
        this.telefono = c.getTelefono();
        this.direccion = c.getDireccion();
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
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
