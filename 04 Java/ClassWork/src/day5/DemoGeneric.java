package day5;

public class DemoGeneric <T> {
	T obj;
	public DemoGeneric(T obj)
	{
		this.obj =obj;
	}
	public String getName()
	{
		return obj.getClass().getName();
	}

	public static void main(String[] args) {
		DemoGeneric<Integer> obj1 = new DemoGeneric<Integer>(100);
		System.out.println(obj1.getName());
		
		DemoGeneric<String> obj2 = new DemoGeneric<String>("Book");
		System.out.println(obj2.getName());	

	}

}
