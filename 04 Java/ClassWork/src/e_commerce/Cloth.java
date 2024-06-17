package e_commerce;

import java.time.LocalDate;

enum Size// enum for size
{
	S,M,L,XL;
}

enum Category//enum for category
{
	MENS_TSHIRT,MENS_SHIRTS,WOMENS_JEANS;
}

public class Cloth //cloth class
{
		private static int idcounter=1;
		private int id;
		private Category category;
		private int stock;
		LocalDate stockUpdateDate;
		private Size size;
		private double price;
		private String brand;
		private String color;
		private double discount;
		
		//cloth constructor
		public Cloth( Category category, int stock, LocalDate stockUpdateDate, Size size, double price,
				String brand, String color, double discount) {
			super();
			this.id = idcounter++;
			this.category = category;
			this.stock = stock;
			this.stockUpdateDate = stockUpdateDate;
			this.size = size;
			this.price = price;
			this.brand = brand;
			this.color = color;
			this.discount = discount;
		}

		//getter methods
		public int getStock() {
			return stock;
		}

		public void setStock(int stock) {
			this.stock = stock;
		}

		public LocalDate getStockUpdateDate() {
			return stockUpdateDate;
		}

		public void setStockUpdateDate(LocalDate stockUpdateDate) {
			this.stockUpdateDate = stockUpdateDate;
		}

		public double getDiscount() {
			return discount;
		}

		public void setDiscount(double discount) {
			this.discount = discount;
			this.price-=(price*discount)/100;
		}

		public int getId() {
			return id;
		}

		public Category getCategory() {
			return category;
		}

		public Size getSize() {
			return size;
		}

		public double getPrice() {
			return price;
		}

		public String getBrand() {
			return brand;
		}

		public String getColor() {
			return color;
		}

		
		//sto string method
		@Override
		public String toString() {
			return "Cloth [id=" + id + ", category=" + category + ", stock=" + stock + ", stockUpdateDate="
					+ stockUpdateDate + ", size=" + size + ", price=" + price + ", brand=" + brand + ", color=" + color
					+ ", discount=" + discount + "]";
		}
		
		
		
		
		
		
}
