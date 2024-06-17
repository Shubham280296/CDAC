package assign1;

public class Cart {
	
	private static int numbers = 0;
	private static float price = 0;
	
	
	public Cart(float price)
	{
		Cart.numbers ++;
		Cart.price += price;
	}
	
	public static int getQuantity()
	{
		return numbers;
	}
	
	public static float getPrice()
	{
		return price;
	}
	

}