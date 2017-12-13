package a5;

public class Circle implements CircleProperties{
	
	double area;
	double circumference;
	int radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}

	public double circleArea(int r) {
			
		radius =r;
		
		area = Math.PI * r * r;
		
		return area;
		
	}
	
	public double circleCircumference(int r) {
		
		radius =r;
		
		circumference = 2 * Math.PI * r;
		
		return circumference;
	
	}

}
