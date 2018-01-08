package CustomerTask;

import java.util.Comparator;

public class AgeCompare implements Comparator<Customer>{

	
//	@Override
//	public int compare(Customer c1, Customer c2) {
//
//		return c1.getDob().compareTo(c2.getDob());
//	}

@Override
public int compare(Customer c1, Customer c2) {
	return  c1.getDob().compareTo(c2.getDob());
}

}
