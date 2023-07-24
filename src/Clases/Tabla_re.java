package Clases;

import Conexion.Conexion;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tabla_re {
    private DefaultTableModel modelo;
    private Object[] datos = new Object[4];
    private Conexion con = new Conexion();
    private Connection co;
    //private JTable tabla;

//    public Tabla_re(JTable tabla) {
//        this.modelo = new DefaultTableModel();
//        //this.modelo.addColumn("Codigo");
//        this.modelo.addColumn("Cedula");
//        this.modelo.addColumn("Nombre");
//        this.modelo.addColumn("Apellido");
//        this.modelo.addColumn("Direccion");
//        this.modelo.addColumn("Imagen");
//        //tabla.setModel(this.modelo);
//    }
    public DefaultTableModel llenar_tabla(){
        this.modelo = new DefaultTableModel();
        this.modelo.addColumn("Cedula");
        this.modelo.addColumn("Nombre");
        this.modelo.addColumn("Apellido");
        this.modelo.addColumn("Direccion");
        //this.modelo.addColumn("Imagen");
        return this.modelo;
    }
    
     public void Datos(JTable tabla) {
        String ins2 = "SELECT * FROM `Registro`";
        try {
            this.co = this.con.getConexion();
            PreparedStatement st = this.co.prepareStatement(ins2);
            ResultSet rs = st.executeQuery(ins2);

            //byte[] bi = null;
            BufferedImage image = null;
            while (rs.next()) {
                //this.datos[0] = String.valueOf(rs.getInt("codigo"));
                this.datos[0] = rs.getString("cedula");
                this.datos[1] = rs.getString("nombre");
                this.datos[2] = rs.getString("apellido");
                this.datos[3] = rs.getString("direccion");
//                try {
//                    //bi = rs.getBytes("imagen");
//                    InputStream in = rs.getBinaryStream("imagen");
//                    image = ImageIO.read(in);
//                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(60, 60, 0));
//                    this.datos[4] = new JLabel(imgi);
//                } catch (Exception ex) {
//                    this.datos[4] = new JLabel("No imagen");
//                }
                
                this.modelo.addRow(this.datos);
                tabla.setModel(this.modelo);
                tabla.setRowHeight(60);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void mostrar_imagen(JTable tabla, JLabel imagen){
        int fila = tabla.getSelectedRow();
        String ced = tabla.getValueAt(fila, 0).toString();
        //this.co = this.con.getConexion();
        //System.out.println(fila+1);
        //Object imagen [] = new Object[1];
        String sql = "select * from Registro where cedula=?";
        PreparedStatement ps;
        try {
            ps = this.co.prepareStatement(sql);
            ps.setString(1, ced);
            ResultSet re = ps.executeQuery();
            byte[] bi = null;
            BufferedImage image = null;
            while (re.next()) {
                //this.setCod(re.getInt("codigo"));
                try {
                    //bi = re.getBytes("imagen");
                    InputStream in = re.getBinaryStream("imagen");
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(imagen.getWidth(), 
                            imagen.getHeight(), Image.SCALE_DEFAULT));
                    //imagen[1] = new JLabel(imgi);
                    imagen.setIcon(imgi);
                } catch (Exception ex) {
                    //imagen[1] = new JLabel("No imagen");
                }
            }
            re.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
}
