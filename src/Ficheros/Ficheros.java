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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DAM103
 */
public class Ficheros {

    public static String carga()
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
}
