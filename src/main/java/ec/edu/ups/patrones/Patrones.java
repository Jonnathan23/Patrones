/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.ups.patrones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author ESTUDIANTE
 */
public class Patrones {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        var ruta = "C:\\Users\\ESTUDIANTE\\Documents\\NetBeansProjects\\Patrones\\src\\escribir.txt";
        String usuario1 = "Felipe";
        String usuario2 = "Pancracio";
   
        File fichero = null;
        fichero = new File(ruta);
        PrintWriter pw = null;
        pw = new PrintWriter(fichero);
        
        

      
            pw.write("Usuario: " + usuario1);
            pw.write(" ");
            pw.write("Usuario: " + usuario2);
        

        System.out.println("");

    }

}
