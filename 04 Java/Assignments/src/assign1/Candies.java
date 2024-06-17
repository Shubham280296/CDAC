package assign1;

public class Candies extends Dessert {

	private float ppk;
	private int kgs;

	public Candies(String flavour, float ppk, int kgs) {
		super(flavour);
		this.ppk = ppk;
		this.kgs = kgs;
	}

	@Override
	public float calPrice() {
		return ppk*kgs;
	}
	
	
	
	
	
	

}