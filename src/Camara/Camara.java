package Camara;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;

public class Camara  {
    private  static String ruta1;
 public  static int count;
    public String getRuta1() {
        return ruta1;
    }

    public void setRuta1(String ruta1) {
        this.ruta1 = ruta1;
    }
public Camara(){
    this.count =this.count+1;
}
    Dimension dm =new Dimension(230,213); // SOn las dimensiones de nuestro panel negro 
    Dimension dm1 = WebcamResolution.VGA.getSize();// aqui se les da las resoluciones de la cama y va variando de acuerdo a la camara 
    Webcam wb = Webcam.getDefault(); // este metodo me traera la camara que tengo por defecto en este caso mi laptop solo tiene una 
    WebcamPanel wbp = new WebcamPanel(wb,dm,false); // nos pide la camara que se va a usar sus dimensiones que van a estar en el panel y falso nose xd
    BufferedImage ruta; // aqui se va a almacenar la ruta de nuestra imagen 
  
    public void camera(javax.swing.JPanel camara) {
     
        wb.setViewSize(dm1); // aqui va a leer la resolucion de la camara
        wbp.setFillArea(true); // nos va a aparecer el nombre de nuestra camara 
        camara.setLayout(new FlowLayout());
        camara.add(wbp); // aqui se nos añadira la camara en el panel 
        System.out.println(" camara "+wb.toString());
        
    }
       
    public void encender(){
        Thread hilo = new Thread(){ // esto mantendra encendida la camara mientras le de encender 
        @Override
        public void run(){ // se usa un override porque todos los formularios tienen un metodo run que es el que mantiene a los formularios
          wbp.start();
       
        }
        }; 
        hilo.setDaemon(true); // el setdemon es un hilo de bajo impacto que mantiene vivo todo el proceso
        hilo.start();
    }
    public void capturar(javax.swing.JLabel mostrar){
         //capturar foto
        ImageIcon imagen;
        imagen = new ImageIcon(wb.getImage()); // aqui traemos a la imagen de la camara 
        Icon icf = new ImageIcon(imagen.getImage().getScaledInstance(mostrar.getWidth(),mostrar.getHeight(),Image.SCALE_SMOOTH )); //aqui le enviamos las dimensiones 
        //Image.Sclae smoth nos pinta mejor la imagen si ponemos defauld nos pixelea la imagen 
        mostrar.setIcon(icf);
        ruta=wb.getImage(); // aqui vamos a tener la ruta desde la camara 
    }
    public void apagar(){
         //apagar
        wbp.stop();
    }
    public void guardar(javax.swing.JLabel mostrar , javax.swing.JComboBox<String> combo){
        //guardar fotografia
          if(combo.getSelectedItem().equals("Seleccione una cedula") || combo.getSelectedItem().toString().equals("")){
            JOptionPane.showMessageDialog(null, "Falta ingresar datos");
        }else{
        String numero = String.valueOf(this.count);
        this.setRuta1("C:\\Users\\DELL\\OneDrive\\Documents\\NetBeansProjects\\ProyectoTerminado\\foto\\foto"+numero+".jpg");
        File file = new File(this.getRuta1()); //Aqui falta ponerle un contador
        try{
            ImageIO.write(ruta,"jpg", file); // aqui le damos el formato a la imagen 
        }catch(Exception e){
            System.out.println("Error "+e);
        }
        mostrar.setIcon(null);
        
          }
    }


     
}
