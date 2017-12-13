package a5;

public class Cylinder extends Rectangle{
		
	double areaOfCylinder;
		
	public Cylinder(int radius, int height) {
		super(radius, height);
	}

	public double cylinderArea() {
			
		areaOfCylinder = 2 * circleArea(radius)+ rectangleArea(height, circleCircumference(radius));
		
		return areaOfCylinder; 
	}
			
		
}

