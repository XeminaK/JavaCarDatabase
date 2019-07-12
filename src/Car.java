
public class Car {

	// instance variables - typically set to private to keep it within the package
	private String make;
	private String model;
	private int year;
	private double price;

	// constructor with four arguments matching the order above
	// the below constructors (public Car and public Car) are an example of
	// overloading
	public Car(String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	// no-arguments constructor that sets data members to default values
	public Car() {
		make = "";
		model = "";
		year = 0;
		price = 0.0;
	}

	// Getters and Setters for the above members (make, model, year, price)
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// Following method is wrong, but is a good example of how formatting strings
	// works
	/*
	 * public void changeToString() { System.out.printf("Current Inventory:/n" +
	 * 								"Make: %s        Model: %s       Year: %i     Price: $%d",
	 *  							make, model, year,price); }
	 */

	//Following method returns a formatted string with the car details
	@Override // you need to override this because you are changing the toString method from the parent class in Java
	public String toString() {
		return String.format("Make: %s        Model: %s       Year: %s     Price: $%.2f",
							make, model, year, price);
	}

}
