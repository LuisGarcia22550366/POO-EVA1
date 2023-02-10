package eva_1_practica_2;

public class Persons {

    private String name;
    private String last_name;
    private int age;
    private String civil;

    public String getName() {
        return name;

    }

    public void setName(String value) {
        name = value;
    }

    public String getLast_Name() {
        return last_name;
    }

    public void setLastName(String value) {
        last_name = value;
    }

    public String getCivil() {
        return civil;
    }

    public void setCivil(String value) {
        civil = value;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int value) {
        age = value;
    }

    public void imprimirDatos() {
        System.out.println("Primer nombre :" + name);

        System.out.println("Primer apellido :" + last_name);

        System.out.println("Estado civil :" + civil);

        System.out.println("Edad :" + age);

        System.out.println("Persona #2 : ");

        

    }
    
    public void imprimirDatos2(){
        System.out.println("Primer nombre :" + name);
        
        System.out.println("Primer apellido :" + last_name);
       
        System.out.println("Estado civil :" + civil);
        
        System.out.println("Edad :" + age);
    }

}
