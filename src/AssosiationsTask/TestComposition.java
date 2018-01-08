package AssosiationsTask;

public class TestComposition {

	public static void main(String[] args) {
		
		Mobile mobile = new Mobile(123, "G42", 500);
		
		Sim simProp = new Sim("T-Mobile");
		
		mobile.sim = simProp;
		
		System.out.println("Network : "+mobile.sim.getNetwork() );

	}

}
