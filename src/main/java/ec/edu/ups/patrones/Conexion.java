/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.patrones;

/**
 *
 * @author ESTUDIANTE
 */
public class Conexion {
    private String usuario;
    private static Conexion instancia;

    public Conexion(String usuario) {
        this.usuario = usuario;
        System.out.println("Se crea el acceso con el usuario: "+ usuario);
    }
    
    public static Conexion obtenerIntancia(String usuario){
        if (instancia == null) {
            instancia = new Conexion(usuario);
        }else{
            System.out.println("No se pudo crear el acceso con el usuario " + usuario);
        }
        
        return instancia;
    }
    
    public String getUsuario(){
        return usuario;
    }
    
    
    
    
}
