package assign1;

public class Coockies extends Dessert{
	

	private float ppd;
	private int dozen;

	public Coockies(String flavour,float ppd, int dozen) {
		super(flavour);
		this.ppd = ppd;
		this.dozen = dozen;	
	}


	@Override
	public float calPrice() {
		return ppd*dozen;
	}
	
}
	
