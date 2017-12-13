package a3;

public class TandemBike extends Bicycle{
	
	String bikeName;

	public TandemBike(int gear, int speed, int cadence, String name, String bikeName) {
		super(gear, speed, cadence, name);
		this.bikeName = bikeName;
	}

	
	public void printDetails() {
		System.out.println("Bike Mode : "+bikeName +"\nName : "+name+"\nSpeed : "+speed+"\nGear : "+gear+"\nCadence : "+cadence);
	}

	public void features() {
		
		System.out.println("It has 2 seats and 2 set of handle bars");
		
	}
	
}
