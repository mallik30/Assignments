package CustomerTask;

import java.time.LocalDate;
import java.util.ArrayList;

public class Customer implements Cloneable,Comparable<Customer>{	
	
	private String name;
	private LocalDate dob;
	private Gender gender;
	private String email;

public Customer() {
	// TODO Auto-generated constructor stub
}

public Customer(String name, LocalDate dob, Gender gender, String email) {
	super();
	this.name = name;
	this.dob = dob;
	this.gender = gender;
	this.email = email;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public LocalDate getDob() {
	return dob;
}

public void setDob(LocalDate dob) {
	this.dob = dob;
}

public Gender getGender() {
	return gender;
}

public void setGender(Gender gender) {
	this.gender = gender;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}


@Override
public boolean equals(Object obj) {
	
	if(this.name.equals(getName()) && this.dob.equals(getDob()) && this.gender.equals(getGender()) && this.email.equals(getEmail())) {
		return true;
	}
	return false;

}

@Override
public int compareTo(Customer cust) {
	
	return this.getDob().compareTo(cust.getDob());
}

@Override
public String toString() {
	return "Name : "+getName();
}


ArrayList<Customer> above20ListAndGender = new ArrayList<>();

public int Age20Plus(ArrayList<Customer> customers){	
	LocalDate todayDate = LocalDate.now();
	return todayDate.getYear()-getDob().getYear();
}

public ArrayList<Customer> Age20PlusAndFemale(ArrayList<Customer> customer1,int age, Gender gen){	
	for (Customer c : customer1) {
		if(c.getGender().equals(gen) && c.Age20Plus(customer1) > age) {
			above20ListAndGender.add(c);
		}
	}
	return above20ListAndGender;
}

public ArrayList<Customer> GenericMethod(ArrayList<Customer> customers){
	
	
	
	return null;
}


}//main