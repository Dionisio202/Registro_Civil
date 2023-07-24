/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class Conexion {
     public static final String usuario = "u1czbcyszf9t058x";
    public static final String clave = "qaY0uux8d5a3KKge8goM";
    public static final String url="jdbc:mysql://u1czbcyszf9t058x:qaY0uux8d5a3KKge8goM@btrs5kxb7p1k89x7mtxs-mysql.services.clever-cloud.com:3306/btrs5kxb7p1k89x7mtxs";
    
    public Connection getConexion(){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //retorna la clase asociada a una cadena
            con = DriverManager.getConnection(url,usuario,clave);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la conexion: ");
        }
        return con;
    }
   
}
