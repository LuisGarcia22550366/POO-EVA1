/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Package1;

import Package2.ClassE;

/**
 *
 * @author invitado
 */
public class ClassA {
    public int publicA;
    
    int defaultA;
    
    private int privateA;
    
    public void prueba()
    {
        ClassB claseb = new ClassB();
        //claseb.publicB; Atributos visibles
        //clasb.defaultB;
        //Clase C visible
        ClassC clasec = new ClassC();
        //Clase E no es visible
        ClassE clasee = new ClassE();
        //Clase D si es visible
        ClassD clased = new ClassD();
        //No es visible para las clases de este paquete, debido a que es privada
        ClassF clasef = new ClassF();
    }
}

class ClassB
{
     public int publicB;
    
    int defaultB;
    
    private int privateB;
}