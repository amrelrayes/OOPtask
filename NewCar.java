
public class NewCar extends CarShowRoom {
	
	private int speed;
	
	public NewCar() {
	}	
	
	

	public NewCar(int speed, String name,String brand,String model, double price ,String bodyType) {
		super();
		this.speed = speed;
		this.name = name;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.bodyType = bodyType;
	}




	@Override
	void printCarDetails() {
System.out.println("car name"+name +"\ncar brand "+brand+"\ncar model"+model+"\ncar price"+price +
		"\ncar body type"+bodyType+"\n car speed "+speed		);

		
	}



	public int getSpeed() {
		return speed;
	}



	public void setSpeed(int speed) {
		this.speed = speed;
	}
 
	
	
	
}
