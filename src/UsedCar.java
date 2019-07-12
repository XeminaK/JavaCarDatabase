
public class UsedCar extends Car{
	
	//instantiate the following
	private double mileage;

	//always use getters and setters with your variables that you want to change later
	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make,model,year,price); //reference the super class parameters
		this.mileage = mileage;
	}
	
	//right click -> source -> generate String
	@Override
	public String toString() {
		//super.toString() is borrowing the string you created in the parent
		return super.toString() + "(Used) " + String.format("%.2f", mileage);
	}

}
