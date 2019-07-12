import java.util.ArrayList;
import java.util.Scanner;

public class UsedCarApp {

	public static void main(String[] args) {

		// you need to use the parent Car object to access everything
		ArrayList<Car> carList = new ArrayList<>();
		// ^if you have multiple data types, use the object (Car) that you are
		// referencing
		carList.add(new Car("Nikolia", "Model S", 2017, 54999.90));
		carList.add(new Car("Fourd", "Escapade", 2017, 31999.90));
		carList.add(new Car("Hyonda", "Prior", 2015, 44989.99));
		carList.add(new UsedCar("GC", "Chirpus", 2013, 14795.00, 35987.6));
		// new UsedCar to use the constructor with mileage in it
		carList.add(new UsedCar("GC", "Witherell", 2016, 14450.00, 3500.3));
		carList.add(new UsedCar("Chewie", "Vette", 2015, 8500.00, 12345.0));

		Scanner sc = new Scanner(System.in);
		String ans2 = "continue";

		while (!ans2.equalsIgnoreCase("quit")) {
			// print the list
			int counter = 1;
			for (Car c : carList) {
				System.out.println(counter++ + ". " + c);
			}
			// add the Quit function to the menu
			System.out.println(counter + ". Quit");

			// Q1
			System.out.println("Which car would you like?");
			int indexNumber = sc.nextInt();

			sc.nextLine(); //garbage line to clean scanner
			
			// carList.size -> array version of carList.length
			if (indexNumber == carList.size() + 1) {
				break;
			}

			// Print answer selected
			System.out.println(carList.get(indexNumber - 1));
			// You need to use .get notation to retrieve the item

			// Q2
			System.out.println("Would you like to buy this car?");
			String ans = sc.nextLine();

			// Choose between yes or no
			if (ans.equalsIgnoreCase("yes")) {
				carList.remove(indexNumber - 1);
				System.out.println("Excellent! Our finance department will be with you shortly!");
			} else if (ans.equalsIgnoreCase("no")) {
				continue; // this goes back to the top of the while loop
			}

		} // end while loop

		System.out.println("Have a nice day!");
	}

}
