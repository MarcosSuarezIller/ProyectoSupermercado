/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectosupermercado.Producto;

/**
 *
 * @author DAM103
 */
public class Ficheros {

    public static String cargaEmplados()
    {
        FileReader fr=null;
        BufferedReader br = null;
        String linea;
        try {
            fr=new FileReader("empleados.txt");   
            br=new BufferedReader(fr);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
        }
        String cadena = null;
        try {
            while((linea=br.readLine())!=null)
            {
                cadena+=linea+"\n";
            }
        } catch (IOException ex) {
            Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
        }
    return cadena;
    }
    public static ArrayList cargaProductos()
    {
        ArrayList<proyectosupermercado.Producto>productos=new ArrayList<>();
        String array[]=new String [3];
        FileReader fr=null;
        BufferedReader br = null;
        String linea;
        StringTokenizer tokens;
        int contador=0;
        try {
            fr=new FileReader("productos.txt");   
            br=new BufferedReader(fr);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
        }
        String cadena = null;
        try {
           
            while((linea=br.readLine())!=null)
            {
                tokens=new StringTokenizer(linea);
                while(tokens.hasMoreElements()) {
                   
                    array[contador]=tokens.nextToken();
                    contador++;
                }
                contador=0;
                double precio=Double.parseDouble(array[2]);
                proyectosupermercado.Producto p1=new Producto(array[0], array[1],precio);
                System.out.println(p1);
            productos.add(p1);
            }
                
            
        
        } catch (IOException ex) {
            Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
        }
    return productos;
    }
}
