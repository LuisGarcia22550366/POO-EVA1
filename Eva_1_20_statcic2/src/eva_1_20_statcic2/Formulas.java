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
public class Formulas {
    //constante
    public static final double PI = 3.14159;
    //area
    public static double areaTriangulo(double base, double altura){
        return (base * altura)/2.0;
    }
    public static double areaCirculo(double radio)
    {
        return PI * radio * radio;
    }
    //perimetro
    
    public static double perimetroCirculo(double radio)
    {
        return PI *(radio * 2);
    }
    //volumen esfera
    public static double volumenEsfera(double radio)
    {
        return (4.0/3.0) * PI * (radio * radio * radio);
    }
    
}
