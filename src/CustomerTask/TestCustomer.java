package CustomerTask;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class TestCustomer {

	public static void main(String[] args) {
		
		
		
		ArrayList<Customer> customerProfile = new ArrayList<>();
		
		customerProfile.add(new Customer("rose",LocalDate.of(1994,11,5),Gender.FEMALE,"rose@gmail.com"));
		customerProfile.add(new Customer("Raju",LocalDate.of(2011,12,6),Gender.MALE,"raju@gmail.com"));
		customerProfile.add(new Customer("Ramu",LocalDate.of(1895,11,20),Gender.MALE,"ramu@gmail.com"));
		customerProfile.add(new Customer("mohan",LocalDate.of(2000,1,15),Gender.MALE,"mohan@gmail.com"));
		customerProfile.add(new Customer("mallik",LocalDate.of(1994,2,26),Gender.MALE,"mallik@gmail.com"));
		customerProfile.add(new Customer("arjun",LocalDate.of(2009,3,20),Gender.MALE,"arjun@gmail.com"));
		customerProfile.add(new Customer("mani",LocalDate.of(2007,4,17),Gender.MALE,"mani@gmail.com"));
		customerProfile.add(new Customer("karthik",LocalDate.of(2000,7,15),Gender.MALE,"karthik@gmail.com"));
		customerProfile.add(new Customer("gopal",LocalDate.of(2017,9,12),Gender.MALE,"gopal@gmail.com"));
		customerProfile.add(new Customer("vinusha",LocalDate.of(2016,8,12),Gender.FEMALE,"vinusha@gmail.com"));

		//by using AgeCompare Class
//		Collections.sort(customerProfile,new AgeCompare());
		
		//by using compareTo method
//		Collections.sort(customerProfile);
//		
//		
//		for (Customer cust : customerProfile) {
//			
//			System.out.println("Name   : "+cust.getName());
//			System.out.println("dob    : "+cust.getDob());
//			System.out.println("Gender : "+cust.getGender());
//			System.out.println("Email  : "+cust.getEmail());
//			System.out.println();
//			
//		}
		
//		//hashcode testing
//		Customer customer = new Customer("HashTesting", LocalDate.of(2011, 5, 10), Gender.FEMALE, "xyz@abc.com");
//		
//		System.out.println(customer);
		

		Customer c1 = new Customer();
		ArrayList<Customer> result1 = c1.Age20PlusAndFemale(customerProfile,20, Gender.FEMALE);
		
		for (Customer c : result1) { System.out.println(c.getName()); }

		
}

}
