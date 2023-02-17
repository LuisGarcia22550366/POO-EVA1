package eva_1_6_automovil;

import javax.swing.JOptionPane;

public class Automovil {

    private String Marca;
    private String Modelo;
    private int Placas;
    private int Año;
    private String Dueño;

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String value) {
        Marca = value;
    }

    public String setModelo() {
        return Modelo;
    }

    public void setModelo(String value) {
        Modelo = value;
    }

    public int getPlacas() {
        return Placas;
    }

    public void setPlacas(int value) {
        Placas = value;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int value) {

        if (Año <= 2000) {
            JOptionPane.showMessageDialog(null, "Su adeudo es de: $1500");
        } else if(Año >= 2001 && Año <= 2005){
            JOptionPane.showMessageDialog(null, "Su adeudo es de: $2000");
        } else if(Año >= 2006 && Año <= 2010){
            JOptionPane.showMessageDialog(null, "Su adeudo es de: $2500");
        } else if(Año >= 2011 && Año <= 2015){
             JOptionPane.showMessageDialog(null, "Su adeudo es de: $3000");

        } else (Año >= 2016 && Año <= 2023)
                    JOptionPane.showMessageDialog(null, "Su adeudo es de: $2500");

    }
            

    
    
    public String getDueño(){
        return Dueño;
    }
    
    public void setDueño(String value){
        Dueño = value;
    }
          

}
