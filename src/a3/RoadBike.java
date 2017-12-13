package a3;

public class RoadBike extends Bicycle{

	String bikeName;

	public RoadBike(int gear, int speed, int cadence, String name, String bikeName) {
		super(gear, speed, cadence, name);
		this.bikeName = bikeName;
	}
	
	public void printDetails() {
		System.out.println("Bike Mode : "+bikeName +"\nName : "+name+"\nSpeed : "+speed+"\nGear : "+gear+"\nCadence : "+cadence);
	}
	
	public void handleBars() {
		
		System.out.println("It has dropped handle bars");
		
	}
	
	
}
