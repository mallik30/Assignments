package a5;

public class Rectangle extends Circle{

	double areaOfRectangle;
	int height;
	
	public Rectangle(int radius, int height) {
		super(radius);
		this.height = height;
	}



	public double rectangleArea(int h, double circumference) {
		
		height = h;
		
		areaOfRectangle = h * circumference;
		
		return areaOfRectangle;
		
	}
	
}
