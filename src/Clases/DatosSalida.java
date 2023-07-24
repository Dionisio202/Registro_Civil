
package Clases;

import Camara.Camara;
import Conexion.Conexion;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
public  class DatosSalida extends Datos {
 Conexion co = new Conexion();
    @Override
    public void InsertarPersona(Persona d,Territorio t) {
        
     String mysql = "Insert into Registro(nombre,apellido,direccion,telefono,Nprovincia,Nciudad) values(?,?,?,?,?,?)";
        try {
            PreparedStatement st;
         try (Connection co = this.co.getConexion()) {
             st = co.prepareStatement(mysql);
             st.setString(1, d.getNombre());
             st.setString(2, d.getApellido());
             st.setString(3, t.getDireccion());
             st.setString(4, d.getTelefono());
             st.setString(5, t.getProvincia());
             st.setString(6, t.getCiudad());
             st.executeUpdate();
             JOptionPane.showMessageDialog(null, "Registro exitoso");
         }
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de registro");
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @Override
    public void subirfoto(String cedula, JComboBox<String> combo) {
             Camara jpf = new Camara();
        String comando ="update Registro set imagen=? where cedula='"+cedula+"'";
         try (PreparedStatement st = this.co.getConexion().prepareStatement(comando)) {
             File file = new File (jpf.getRuta1());
             FileInputStream fn = new FileInputStream(file);
             st.setBinaryStream(1,fn);
             st.executeUpdate();
         }catch(Exception e){
             JOptionPane.showMessageDialog(null,"Error al subir la imagen ");
         }  
    }

    @Override
    public void insertarprovincia(String provincia) {
                try {
            java.sql.PreparedStatement st;
            try (Connection co = this.co.getConexion()) {
                st = co.prepareStatement("insert into Provincias set Nprovincia=?");
                st.setString(1, provincia);
                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "Informacion ingresada con exito");
            }
            st.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al insertar la provincia \n"+e);
        }
    }
    @Override
    public void Enviarciudad(String ciudad, String provincia) {
             try {
            java.sql.PreparedStatement st;
            try (Connection co = this.co.getConexion()) {
                st = co.prepareStatement("insert into Ciudad set Nciudad=?, Nprovincia=?");
                st.setString(1, ciudad);
                st.setString(2, provincia);
                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "Informacion ingresada con exito");
            }
            st.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Eror al insertar la ciudad \n"+e);
          }   
    }

    @Override
    public void InsertarUsuario(String usuario, String contraseña) {
        try{     
        Connection co = this.co.getConexion();
        String comando=("Insert into Usuario set  usuario=?,clave=?");
  PreparedStatement sd=co.prepareStatement(comando);
       sd.setString(1,usuario);
       sd.setString(2,contraseña);
       sd.executeUpdate();  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al insertar el usuario \n"+e);
        }
    }
        @Override
    public void enviarcedula(String nombrecompleto, String cedulalista) {
        String [] separador = nombrecompleto.split(" ");
        try {
            Connection co = this.co.getConexion();
            java.sql.PreparedStatement st = co.prepareStatement("update Registro set cedula=? where nombre='"
                    +separador[0]+"'"+" and "+"apellido='"+separador[1]+"'");
            st.setString(1, cedulalista);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Informacion ingresada con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la cedula genere una nueva porfavor");
          }

    }

    @Override
    public void Obtenerprovincias(JComboBox combo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Obtenerciudades(JComboBox combo, String provincia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void obtenercedula(JComboBox r) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    @Override
    public void ObtNom(JComboBox combo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
