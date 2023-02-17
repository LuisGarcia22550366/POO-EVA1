package CircleMaBoy;

import javax.swing.JOptionPane;

public class Circle {

	private double pi;
	private double radio;
	private double perimetro;
	private double area;

	public Circle() {
		pi = 3.14;
		radio = 2;
		perimetro = 2 * radio * pi;
		area = pi * Math.pow(radio, 2);
	}

	public void PrintData() {
		JOptionPane.showMessageDialog(null, "El perimetro es: " + perimetro + "\nEl area es: " + area);
	}
}
