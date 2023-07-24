
package Clases;

import Conexion.Conexion;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public  class DatosIngreso extends Datos {
    Conexion co =new Conexion();
    @Override
    public void Obtenerprovincias(JComboBox combo) {      
        try {
                java.sql.Statement st;
            try (java.sql.Connection co = this.co.getConexion()) {
                st = co.createStatement();
                java.sql.ResultSet rs = st.executeQuery("select * from Provincias"); 
                while(rs.next()){
                    combo.addItem(rs.getString(1));
                }
            }
               st.close(); 
         }catch(Exception e){
         }  
    }

    @Override
    public void Obtenerciudades(JComboBox combo, String provincia) {
       try {
                java.sql.Statement st;
            try (java.sql.Connection co = this.co.getConexion()) {
                st = co.createStatement();
                java.sql.ResultSet rs = st.executeQuery("select * from Ciudad where Nprovincia='"+provincia+"'"); 
                while(rs.next()){
                    combo.addItem(rs.getString(1));
                }
            }
                st.close();
         }catch(Exception e){
         }    
    }

    @Override
    public void obtenercedula(JComboBox r) {
        
        try {
            
             String  comando="select * from Registro";
            try (java.sql.PreparedStatement st = this.co.getConexion().prepareStatement(comando)) {
                ResultSet rs =st.executeQuery(comando);
                while(rs.next()){
                    if(rs.getString(8)!=null){ 
                             r.addItem(rs.getString(8)); 
                    }                    
                }
            }
        } catch (Exception e) {
        }
    }
   @Override
    public void ObtNom(JComboBox combo) {
        try {
                java.sql.Statement st;
                java.sql.Connection co = this.co.getConexion();
                st = co.createStatement();
                java.sql.ResultSet rs = st.executeQuery("select * from Registro "); 
                while(rs.next()){
                    if(rs.getString("cedula")==null){
            combo.addItem(rs.getString("nombre")+" "+rs.getString("apellido"));      
            }
                    
                }
                
         }catch(Exception e){
         }

    }
    
    @Override
    public void subirfoto(String cedula, JComboBox<String> combo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insertarprovincia(String provincia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Enviarciudad(String ciudad, String provincia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void InsertarUsuario(String usuario, String contraseña) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void InsertarPersona(Persona d, Territorio t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void enviarcedula(String nombrecompleto, String cedulalista) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
