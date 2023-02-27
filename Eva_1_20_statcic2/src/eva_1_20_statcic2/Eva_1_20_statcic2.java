/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_1_20_statcic2;

/**
 *
 * @author invitado
 */
public class Eva_1_20_statcic2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        final int x = 3;//Una vez instanciada, ya no se puede instanciar otra vez
       //   x = 1;
       // x = 2;
        Formulas formulas = new Formulas();
        //formulas. no existe ningun metodo dentro del objeto
        System.out.println("Mi pi: " + Formulas.PI);
        System.out.println("Area triangulo: " + Formulas.areaTriangulo(5.0, 5.0));
        System.out.println("Volumen: " + Formulas.volumenEsfera(10));
    }
    
}
