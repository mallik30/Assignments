package a3;

public class MountainBike extends Bicycle{

	String bikeName;


	public MountainBike(int gear, int speed, int cadence, String name, String bikeName) {
		super(gear, speed, cadence, name);
		this.bikeName = bikeName;
	}


	public void printDetails() {
		System.out.println("Bike Mode : "+bikeName+ "\nName : "+name+"\nSpeed : "+speed+"\nGear : "+gear+"\nCadence : "+cadence);
	}	
	
	
	public void chainRing(int count) {
		
		
		System.out.println("Additional Chain Rings : "+count);
		
	}
	
	
	
	
}
