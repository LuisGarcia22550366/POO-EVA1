/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_1_19_statci;

/**
 *
 * @author invitado
 */
public class Eva_1_19_static {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("PI: " + Math.PI);
        System.out.println("Random number: "+ Math.random());
        System.out.println(Math.ceil(2));
        
        Utilerias utileria = new Utilerias();
        utileria.Saludo();
        Utilerias.oSaludo();
        //saludo2();Si no es estatico y no se ha creado un objeto, el metodo no existe

    }
    
        public void saludo2(){
            System.out.println("HOLA M ABOY");
        }
    
}
class Utilerias{
    //Este metodo existe hasta que se crea un objeto de la clase. Solo se puede usaer a traves de un obejeto
    public void Saludo(){
        System.out.println("Hola");
    }
    //Este metodo existe en el momento en el que el programa arranca. Se usa a traves de la clase 
    public static void oSaludo(){
        System.out.println("Holaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }
    
}
