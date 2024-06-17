package Lab_Exam;

import java.time.LocalDate;

public class PetsToy {
	
	private static int cnt=1;
	private int id;
	private String name;
	private String brand;
	private String privateSpecies;
	private String material;
	private int stock;
	private LocalDate listingDate;
	private LocalDate updateDate;
	private float price;
	private float discount;
	
	
	
	public PetsToy(String name, String brand, String privateSpecies, String material, int stock, LocalDate listingDate, float price) {
		this.id = cnt;
		this.name = name;
		this.brand = brand;
		this.privateSpecies = privateSpecies;
		this.material = material;
		this.stock = stock;
		this.listingDate = listingDate;
		this.updateDate = listingDate;
		this.price = price;
		this.discount = (float) 0.0;
		PetsToy.cnt+=1;
	}
	
	
	

	public static int getCnt() {
		return cnt;
	}




	public static void setCnt(int cnt) {
		PetsToy.cnt = cnt;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
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




	public String getPrivateSpecies() {
		return privateSpecies;
	}




	public void setPrivateSpecies(String privateSpecies) {
		this.privateSpecies = privateSpecies;
	}




	public String getMaterial() {
		return material;
	}




	public void setMaterial(String material) {
		this.material = material;
	}




	public int getStock() {
		return stock;
	}




	public void setStock(int stock) {
		this.stock = stock;
	}




	public LocalDate getListingDate() {
		return listingDate;
	}




	public void setListingDate(LocalDate listingDate) {
		this.listingDate = listingDate;
	}




	public LocalDate getUpdateDate() {
		return updateDate;
	}




	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}




	public float getPrice() {
		return price;
	}




	public void setPrice(float price) {
		this.price = price;
	}




	public float getDiscount() {
		return discount;
	}




	public void setDiscount(float discount) {
		this.discount = discount;
	}




	@Override
	public String toString() {
		return "PetsToy [Id="+id+"name=" + name + ", brand=" + brand + ", privateSpecies=" + privateSpecies + ", material="
				+ material + ", stock=" + stock + ", listingDate=" + listingDate + ", updateDate=" + updateDate
				+ ", price=" + price + ", discount=" + discount + "]";
	}
	
}

	