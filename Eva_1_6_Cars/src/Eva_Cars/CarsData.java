package Eva_Cars;

import javax.swing.JOptionPane;

public class CarsData {

	private String brand;
	private String model;
	private int license;
	private int year;
	private String owner;
	
	public CarsData() {
		brand = "";
		model = "";
		license = 0;
		year = 0;
		owner = "";
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String value) {
		brand = value;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String value) {
		model = value;
	}
	
	public int getLicense() {
		return license;
	}
	
	public void setLicense(int value) {
		license = value;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int value){
		year = value;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String value) {
		owner = value;
	}
	
	
	public void PrintData() {
		if(year <= 2000) 
			JOptionPane.showMessageDialog(null, "Dueno: " +  owner + "\nSu adeudo es: $1500" + "\nMarca: " + brand + "\nModelo: " + model + "\nMatricula: " + license + "\nAno: " + year);
		else if(year >= 2001 && year <= 2005) 
			JOptionPane.showMessageDialog(null, "Dueno: " +  owner + "\nSu adeudo es: $3000" + "\nMarca: " + brand + "\nModelo: " + model + "\nMatricula: " + license + "\nAno: " + year);

		 else if(year >= 2006 && year <= 2010) 
				JOptionPane.showMessageDialog(null, "Dueno: " +  owner + "\nSu adeudo es: $4500" + "\nMarca: " + brand + "\nModelo: " + model + "\nMatricula: " + license + "\nAno: " + year);

		 else if(year >= 2011 && year <= 2015) 
				JOptionPane.showMessageDialog(null, "Dueno: " +  owner + "\nSu adeudo es: $6000" + "\nMarca: " + brand + "\nModelo: " + model + "\nMatricula: " + license + "\nAno: " + year);

		 else if(year >= 2016 && year <= 2023)
				JOptionPane.showMessageDialog(null, "Dueno: " +  owner + "\nSu adeudo es: $7500" + "\nMarca: " + brand + "\nModelo: " + model + "\nMatricula: " + license + "\nAno: " + year);
		
		 else
			 JOptionPane.showMessageDialog(null, "Los datos ingresados no son correctos");

		
	}
	
	
}
