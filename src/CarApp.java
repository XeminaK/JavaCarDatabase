import java.util.Scanner;

public class CarApp {

	// this needs to get the user input, create multiple instances of car object,
	// and display the information

	public static void main(String[] args) {

		// ctrl + shift + o -> auto imports
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Grand Circus Motors admin console!");
		System.out.println("How many cars are you entering?");

		int amountCar = sc.nextInt(); // to take in numbers from user

		sc.nextLine(); // garbage line -> to clean out your scanner
		// if you go from a number to a string you need to clean it out since it won't accept the data type
		// if you go from string to number it's fine since strings can take all datatypes

		//Car references your Car blueprint
		Car carList[] = new Car[amountCar]; // input user answer about what they want to enter

		// loop to prompt user for the details of the car
		for (int i = 0; i < amountCar; i++) {
			System.out.println("Make:");
			String make = sc.nextLine();
			System.out.println("Model");
			String model = sc.nextLine();
			System.out.println("Year");
			int year = sc.nextInt();
			System.out.println("Price");
			double price = sc.nextDouble();

			sc.nextLine(); // garbage line to clean out scanner

			carList[i] = new Car(make, model, year, price);

		}
		
		System.out.println("Current Inventory:");
		//Enhance for loop (object: arrayName) -> for each object within the arrayName
		for (Car c : carList) {
			System.out.println(c); //print each object
		}
		
		/* Original for loop, prints out each index within the array
		for(int i=0;i<carList.length;i++) {
			System.out.println(carList[i]);
		}*/
		
		
		/*carList[0] = new Car("Chevy","Cruze",2006, 210.00);
		carList[1] = new Car("Ford","Escape",2010, 100.22);
		
		System.out.println(carList);
		
		 Car car = new Car(); 
		 car.setMake("Ford"); 
		 car.setModel("Escape");
		 car.setYear(2018); 
		 car.setPrice(100.12);
		 
		 Car car2 = new Car("Chevy", "Cruze", 2006, 210.00);
		 
		 Car car3 = new Car();
 
		 System.out.println(car); System.out.println(car2); System.out.println(car3);
		*/

	}

}
