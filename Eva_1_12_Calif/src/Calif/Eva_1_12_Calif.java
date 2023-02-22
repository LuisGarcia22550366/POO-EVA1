/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Calif;

/**
 *
 * @author invitado
 */
public class Eva_1_12_Calif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String calii;
        calii = califEU(85);
        System.out.println("Calificación de 85: " + calii);
        System.out.println("Calificación para 75: " + califEU(75));
    }
    
    public static String califEU(int calif){
        String califE = "";
        if(calif <= 100 && calif >= 91){
            califE = "A";
        }else if(calif <= 90 && calif >= 81){
             califE = "B";
        }else if(calif <= 80 && calif >= 71){
             califE = "C";
        }else if(calif <= 70){
             califE = "D";
        } else{
            
        }
           
        return califE;
       
        
    }
    
}
