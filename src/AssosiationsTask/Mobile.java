package AssosiationsTask;

public class Mobile {

	int id;
	String model;
	int price;
	
	
	Sim sim;
	
	public Mobile() {
		// TODO Auto-generated constructor stub
	}

	public Mobile(int id, String model, int price) {
		super();
		this.id = id;
		this.model = model;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
