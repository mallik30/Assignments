package a1a2;

public class TestOrder {

	public static void main(String[] args) {
	
		OrderObject object = new OrderObject("Dell",0001,"John",200,0,"ABC, Texas.");
			
		object.printDetails();
		System.out.println();
		object.cashPayment(300);
		System.out.println();
		
		OrderObject  object1 = new OrderObject("HP",0002,"Rock",300,1234,"XYZ, Boston.");
				
		object1.printDetails();
		System.out.println();
		object1.ccPayment(300);		
		
		
	}

}
