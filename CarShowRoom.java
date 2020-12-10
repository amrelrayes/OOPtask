import java.awt.print.Book;

public class CarShowRoom {

	protected String name;
	protected String brand;
	protected String model;
	protected String price;
	protected String bodyType;
		
	bodyType= new body(sedan,hatchback,crossover);
	
	public CarShowRoom() {
		super();
	}

	public CarShowRoom(String name, String brand, String model, String price, String bodyType) {
		super();
		this.name = name;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.bodyType = bodyType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	}
	
