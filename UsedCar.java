import javax.swing.JOptionPane;

public class UsedCar extends CarShowRoom  {

	private int kiloMeter;
	private String year;
	private String owner;
	private String ownerName;
	private String ownerNumber;
	
	public UsedCar(int kiloMeter, String year, String owner, String ownerName,
			String ownerNumber, String name,String brand,String model, double price ,String bodyType) {
		super();
		this.kiloMeter = kiloMeter;
		this.year = year;
		this.owner = owner;
		this.ownerName = ownerName;
		this.ownerNumber = ownerNumber;
		this.name = name;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.bodyType = bodyType;
	}
	public int getKiloMeter() {
		return kiloMeter;
	}
	public void setKiloMeter(int kiloMeter) {
		this.kiloMeter = kiloMeter;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getOwnerNumber() {
		return ownerNumber;
	}
	public void setOwnerNumber(String ownerNumber) {
		this.ownerNumber = ownerNumber;
	}

	@Override
	void printCarDetails() {
		System.out.println("car name"+name +"\ncar brand "+brand+"\ncar model"+model+"\ncar price"+price +
				"\ncar body type"+bodyType+	"\nkilo meters: "+kiloMeter+"\nyear"+year+"\ncar owner "+owner +
				"\nowner name"+ownerName +"\nowner number"+ownerNumber	);
		
	}

	
	
	
}
