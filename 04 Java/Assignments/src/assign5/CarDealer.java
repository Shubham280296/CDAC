package assign5;

public class CarDealer implements Comparable<CarDealer> {
	private String model;
	private String colour;
	private double price;
	private int year;
	public CarDealer(String model, String colour, double price, int year) {
		super();
		this.model = model;
		this.colour = colour;
		this.price = price;
		this.year = year;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "CarDealer [model=" + model + ", colour=" + colour + ", price=" + price + ", year=" + year + "]";
	}
	@Override
	public int compareTo(CarDealer o1) {	
		return  (int) (this.getPrice()-o1.getPrice());
	}

}
