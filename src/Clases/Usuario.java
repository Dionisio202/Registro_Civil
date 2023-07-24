
package Clases;

import Conexion.Conexion;
import Interfaces.Princi;
import Login.Login;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Usuario {
    Datos dt = new DatosSalida();
    
    public void comparar_contraseña(javax.swing.JPasswordField contraseña1 , javax.swing.JPasswordField contraseña2, javax.swing.JTextField usuario) throws SQLException{
        try{
        if(contraseña1.getText().equals(contraseña2.getText())){
            dt.InsertarUsuario(String.valueOf(usuario.getText()),String.valueOf(contraseña2.getPassword()));
            JOptionPane.showMessageDialog(null,"Usuario creado con exito");
            }else{
            JOptionPane.showMessageDialog(null,"Error en la contraseña o ");
            System.out.println("contraseña1"+String.valueOf(contraseña1.getPassword()));
            System.out.println("contraseña1"+String.valueOf(contraseña2.getPassword()));
        } 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error usuario ya existente"+e);
        }
        //este no me obtiene nada asi aque no va en datos 
    } 
    //Log in 
        public void comparar(String instruccion,javax.swing.JTextField usuario , javax.swing.JPasswordField contraseña){
        if(usuario.getText().equals("")&&contraseña.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo vacio");
        }else if(usuario.getText().equals("")||contraseña.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo vacio");
        }
        else{
            Conexion c = new Conexion();
            java.sql.Statement st;
            try {
                java.sql.Connection co = c.getConexion();
                st = co.createStatement();
                java.sql.ResultSet rs = st.executeQuery(instruccion);
                ArrayList usuarios = new ArrayList();
                ArrayList contraseñas = new ArrayList();
                while (rs.next()) {
                    usuarios.add(rs.getString(1));
                    contraseñas.add(rs.getString(2));
                }
                boolean valor = false;
                for (int i = 0; i <usuarios.size(); i++) {
                        if(usuario.getText().equals(usuarios.get(i))&&contraseña.getText().equals(contraseñas.get(i))){                        
                            valor = true;
                            break;
                        }else{
                            valor = false;   
                        }
                }
                if(valor==true){
                    JOptionPane.showMessageDialog(null,"Usuario Correcto ");
                      Princi pr = new Princi();
                   pr.setVisible(true);
                   Login lg = new Login();
                   lg.setVisible(false);
                }else{
                  JOptionPane.showMessageDialog(null, "Usuario Incorrecto ");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error en el log in "+e);
            }
        }
    }
}
