/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosupermercado;

/**
 *
 * @author DAM103
 */
public class Validaciones {
    /**
     * Aqui validamos el ncliente el cual no puede ser negativo ni contener un caracter
     * @param nCliente
     * @return boolean
     * @throws Exception 
     */
    public static boolean validaNCliente(String nCliente) throws Exception{
        boolean o = false;
        try {
            int numero = Integer.parseInt(nCliente);
            if(numero<0)
            {
                throw new Exception("Error el numero no puede ser negativo");
            }
            o=true;
        } catch (NumberFormatException e) {
            System.out.println("Error el parametro recibido no es un numero");
        } 
        return o;
    }
    /**
     * Aqui validamos el nombre el cual tiene que empezar con una letra mayuscula y maximo 15 letras
     * @param nombre
     * @return 
     */
    public static boolean validaNombre(String nombre){
        return nombre.matches("^[A-Z][a-z]{2,15}");
    }
    /**
     * Aqui validamos el telefono el cual tiene que empezar por 9 o 7 o 6 y tener una longitud de 9
     * @param telefono
     * @return 
     */
    public static boolean validaTelefono(String telefono){
        return telefono.matches("[6|9|7][0-9]{8}");
    }
    /**
     * Aqui validamos la direccion la cual no tiene tamño minimo pero de maximo 30 caracteres y no se puede dejar en blanco
     * @param dire
     * @return 
     */
    public static boolean validaDireccion(String dire){
        return dire.matches("[a-z ]{30}");
    }
    private String NIF;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String telefono;
    private boolean senior;
    
    public static boolean validarNif(String nif)
    {
        return nif.matches("[0-9]{8}[A-Z]{1}");
    }
    public static boolean ValidarNombreTrabajador(String nombre)
    {
        return nombre.matches("^[A-Z][a-z]{2,15}");
    }
    public static boolean validarApellido(String apellido)
    {return apellido.matches("^[A-Z][a-z]{2,15}");}
    public static boolean validaDirreccionTrabajdor(String direccion)
    { return direccion.matches("[a-z ]{30}");}
    
    public static boolean validarTelefonoTrabajador(String telefono)
    {return telefono.matches("[6|9|7][0-9]{8}");}
    
    
            }
