package Tasks;

public class Item implements Cloneable,Comparable<Item>{

	private int id;
	private String name;
	private float price;

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int id, String name, float price) {
		setId(id);
		setName(name);
		setPrice(price);
	}

	
	@Override
	public int compareTo(Item i2) {

		if(this.id > i2.id) {
			return 1;
		}else if(this.id< i2.id) {
			return -1;			
		}
		return 0;
	}
	
	public static int compareByPrice(Item i1,Item i2) {
		if(i1.getPrice() > i2.getPrice()) {
			return 1;
		}else if(i1.getPrice() < i2.getPrice()) {
			return -1;
		}
		return 0;	
		
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {

		return "Id : "+id+"\nName : "+name+"\nPrice : "+price;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Item item2 = (Item)obj; 
		
		if(item2 != null) {
			if(this.id == item2.id && this.name.equals(item2.name) && this.price == item2.price) {
				return true;
			}
		}	
		return false;
	}
	
		
	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(id>0) {
			this.id = id;
		}else {
			System.err.println("Invalid id");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	
	
}
