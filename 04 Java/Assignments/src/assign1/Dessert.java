package assign1;

public abstract class Dessert {
	
	protected String flavour;
	
	public Dessert(String flavour)
	{
		this.flavour = flavour;
		
	}
	
	public abstract float calPrice();
	
}
