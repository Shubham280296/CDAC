package day5;

public class Stat<T extends Number> {
	T [] obj;
	

	public Stat(T[] obj) {
		super();
		this.obj = obj;
	}

	public double getAverage()
	{
		double sum = 0;
		for (int i = 0;i<obj.length;i++ )
		{
			sum+=obj[i].doubleValue();	
		}
		return sum/obj.length;
	}
	public boolean isAvgEqual(Stat <? extends Number> obj1) {
		if(this.getAverage()==obj1.getAverage())
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		Integer [] arr = {1,2,3,4,5};
		Double [] darr = {1.0,2.0,3.0,4.0,5.0};
		Stat<Integer> obj = new Stat<Integer>(arr);
		Stat<Double> obj1 = new Stat<Double>(darr);
		
		System.out.println(obj.getAverage());
		System.out.println(obj1.getAverage());
		
		System.out.println(obj.isAvgEqual(obj1));

	}

}
