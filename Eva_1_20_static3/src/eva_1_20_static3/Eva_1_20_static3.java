/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_1_20_static3;

/**
 *
 * @author invitado
 */
public class Eva_1_20_static3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Valor: " + Prueba.valor);
        Prueba.valor++;
        System.out.println("Valor 2: " + Prueba.valor);
        System.out.println("Ahora con objetos -->");
        PruebaObjeto obj = new PruebaObjeto();
        System.out.println(obj.valor);
        obj.valor++;
        System.out.println(obj.valor);
        PruebaObjeto obj2 = new PruebaObjeto();
        System.out.println(obj2.valor);
    }
    
}

class Prueba
{
    public static int valor = 100;
    
}

class PruebaObjeto
{
    public int valor = 200;
}
