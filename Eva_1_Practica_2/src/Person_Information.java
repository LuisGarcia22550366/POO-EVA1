import javax.swing.JOptionPane;

public class Person_Information {

	public static void main(String[] args) {
		Persons persona = new Persons();
		persona.name = "";
		persona.last_name = "";
		persona.age = 18;
		persona.civil = "Soltero";
		
		JOptionPane.showInternalMessageDialog(null, persona.civil);

	}

}
