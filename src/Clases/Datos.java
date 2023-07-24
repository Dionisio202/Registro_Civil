
package Clases;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
public abstract class Datos {

  public abstract void InsertarPersona(Persona d ,Territorio t);  
  public abstract void Obtenerprovincias(JComboBox combo);
  public abstract void Obtenerciudades(JComboBox combo, String provincia);
  public abstract void obtenercedula(JComboBox r);
  public abstract void subirfoto(String cedula,javax.swing.JComboBox<String> combo);//este metodo se llamaba seleccionar cedula
  public abstract void insertarprovincia(String provincia);
  public abstract void Enviarciudad(String ciudad, String provincia);
  public abstract void InsertarUsuario(String usuario, String contraseña); //este metodo se llamaba ingresar
  public abstract void ObtNom(JComboBox combo);
 public abstract void enviarcedula(String nombrecompleto, String cedulalista);
}