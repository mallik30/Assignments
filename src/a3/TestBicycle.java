package a3;

public class TestBicycle {

	public static void main(String[] args) {
		
		MountainBike bike = new MountainBike(1, 2, 4, "Hero","Mountain Bike");
		
		bike.printDetails();
		bike.chainRing(5);
		
		System.out.println();
		
		RoadBike bike2 = new RoadBike(2, 3, 2, "Hercules", "Road Bike");
		
		bike2.printDetails();
		bike2.handleBars();
		
		System.out.println();
		
		TandemBike bike3 = new TandemBike(1, 4, 2, "Atlas", "Tandem Bike");
		
		bike3.printDetails();
		bike3.features();
	}

}
