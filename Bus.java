package BusReservation;

public class Bus {
	
	//data should be private
	private int busNo;
	private boolean ac;
	private int capacity; // getter and setters
	
	
	//constructor get those value and initializes it
	Bus(int no, boolean ac, int cap) {
		this.setBusNo(no);
		this.setAc(ac);
		this.setCapacity(cap);
	}

	//accessor method
	public int getCapacity() {
		return capacity;
	}

	//mutator method
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public boolean isAc() {
		return ac;
	}


	public void setAc(boolean ac) {
		this.ac = ac;
	}
	
	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	//displaying Bus Info  prints the details of the object
	public void displayBusInfo() {
		
		System.out.println("Bus no: " + busNo + " Ac: " + ac + " Capacity: " + capacity);
		
	}

	

}
