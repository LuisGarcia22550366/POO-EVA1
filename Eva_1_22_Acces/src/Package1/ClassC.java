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
public class ClassC {
    public int publicC;
    
    int defaultC;
    
    private int privateC;
    
    public void pruebaC()
    {
        //Clase visible pero solo con un import
        ClassE classe = new ClassE();
    }
}

class ClassD
{
     public int publicD;
    
    int defaultD;
    
    private int privateD;
}
