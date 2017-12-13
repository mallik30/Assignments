package Task;

public class StringLength {
	
	public static void main (String[] args) { 
	
		String s = "Hello! How are you?";

	    String[] words = s.trim().split("\\s+");

	    System.out.println("String count is = "+(words.length));
		
			
	
	}
}
