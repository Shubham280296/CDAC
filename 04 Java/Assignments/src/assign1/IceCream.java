package assign1;

public class IceCream extends Dessert {
	
	private float ppp;
	private int pieces;

	public IceCream(String flavour,float ppp, int pieces) {
		super(flavour);
		this.ppp = ppp;
		this.pieces = pieces;	
	}

	@Override
	public float calPrice() {
		return ppp*pieces;
	}

}
