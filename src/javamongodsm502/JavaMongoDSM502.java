/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javamongodsm502;

/**
 *
 * @author jonai
 */
public class JavaMongoDSM502
{
public static void main(String[] args) {
            System.out.println("Esperando conexión...");
        Connection con = new Connection();
            System.out.println("Mostrar los datos de la colección");
        con.mostrar();
        con.insertar("Nadar");
        System.out.println("OTRO");
        con.mostrar();
        System.out.println("Actualizamos Nadar a Brincar");
        con.actualizar("Nadar", "Brincar");
        con.mostrar();
        System.out.println("Eliminamos brincar");
        con.eliminar("Brincar");
        con.mostrar();
            
    }
    
}
