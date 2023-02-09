package eva_1_practica_2;

public class Eva_1_Practica_2 {

    public static void main(String[] args) {

        Persons persona = new Persons();
        
        
        persona.setName("Luis");
        persona.setLastName("García");
        persona.setCivil("Soltero");
        persona.setAge(18);
        persona.imprimirDatos();
        
        Persons persona2 = new Persons();
        persona2.setName("Fernando");
        persona2.setLastName("Pérez");
        persona2.setCivil("Casado");
        persona2.setAge(81);
        persona2.imprimirDatos2();
        

    }

}
