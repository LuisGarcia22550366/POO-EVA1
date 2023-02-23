/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_1_13_visible;

/**
 *
 * @author invitado
 */
public class Eva_14_Visible_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x  = 1;//Visible dentro de todo el bloque main
        for (int i = 0; i < args.length; i++) {
           //int x = 12;La variable ya esta declarada 
           
           int y = 1;
           
           if(i == 5){
               
           }
            
        }
        
        int y = 1;//La variable "Y" solo es visible en el loop for, por lo que se puede declarar fuera del metodo for
    }
    {
        int y = 1;
    }
    {
        int y = 1;
    }
    {
        int y = 1;
    }
    
}
