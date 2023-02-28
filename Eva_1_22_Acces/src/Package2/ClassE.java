/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package2;

/**
 *
 * @author invitado
 */
public class ClassE {

    public int publicE;

    int defaultE;

    private int privateE;

    public void pruebaS() {
        //NO visible hasta hacer un import
        ClassA classa = new ClassA();
        //No es visible, ya que la clase B es default y está en otro paquete    
        ClassB classb = new ClassB();
        //Visible gracias a que esta en el mismo paquete
        ClassF classf = new ClassF();

    }
}

class ClassF {

    public int publicF;

    int defaultF;

    private int privateF;
}
