
package Clases;

public class Cedulado {
    
    public String generarcedula(){
        String cedula ="1805";
        for (int i = 0; i <6; i++) {
            int numero = (int)(Math.random()*10);
            cedula=cedula+String.valueOf(numero);
        }
        return cedula;
    }   
}
