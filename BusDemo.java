package BusReservation;
import java.util.*;
public class BusDemo {
	public static void main(String[] args) {
		//need to create object for Bus class
		//if 50 busses are available 50 objects are hare to maintain better go to array
		//Bus buses[] = new Bus[50];
		//More better go to ArrayList size need not to be specified
		//ArrayList<Integer> buses = new ArrayList<>(); 
		//Usage of Generic
		//buses.add(5);
		//buses.add(10);
		//buses. => will see all functions
		ArrayList<Bus> buses = new ArrayList<>(); //type of Bus
		ArrayList<Booking> bookings = new ArrayList<>();
		
		buses.add(new Bus(1, true, 2)); //directly add bus object
		buses.add(new Bus(2, false, 50));
		buses.add(new Bus(3, true, 48));
		
		
		
		// take one booking ask for another stops only user says no
		int userOpt = 1;
		Scanner scanner = new Scanner(System.in);
		
		//loop will execute three times
		//for every iteration details stored in b
		for(Bus b:buses) {
			b.displayBusInfo();
		}
		
		while(userOpt == 1) { //boolean cannot be as number
			System.out.println("Enter 1 to Book and 2 to exit");
			userOpt = scanner.nextInt();  //Change as user decision
			if(userOpt == 1) {  //only if 1 proceed to booking
				//System.out.println("Booking...");
				Booking booking = new Booking();
				if(booking.isAvailable(bookings, buses)) {
					bookings.add(booking);  //adding booking in arrayList
					System.out.println("Your booking is confirmed");
				} else {
					System.out.println("Sorry, Bus id full, Try another bus or data...");
				}
			}
		}
	}

}
