package Eva_Cars;

public class Cars {

	public static void main(String[] args) {

		CarsData cars = new CarsData();
		
		cars.setBrand("Nissan");
		cars.setModel("Sentra");
		cars.setOwner("Luis");
		cars.setLicense(616);
		cars.setYear(2023);
		cars.PrintData();

	}

}
