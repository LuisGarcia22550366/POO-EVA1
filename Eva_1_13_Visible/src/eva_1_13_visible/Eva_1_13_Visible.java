

package eva_1_13_visible;


public class Eva_1_13_Visible {
    
    int k = 1;//Variable visible dentro de toda la clase 

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x = 1;//Variable visible en todo el metodo main
        
        for (int i = 0; i < args.length; i++) {
            System.out.println("I = " + i);//Variable visible en todo el loop for
            System.out.println("j = "+ j);// Variable no visible

            int j = 1;
            System.out.println("j = "+ j);//Variable visible a partir de la declaración
            
            {
                int z = 1;
                System.out.println("Z = " + z);
            }
                System.out.println("Z = " + z);//No se encuentra la variable ya que no está dentro del bloque 

            
        }
    }
    
    public static void something(){
        System.out.println("j" + j);//Variable no visible
    }
   
}
