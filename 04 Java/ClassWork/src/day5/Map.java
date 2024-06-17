package day5;

public class Map<K,V> {
	K key;
	V value;
	public Map(K key,V value)
	{
		this.key = key;
		this.value = value;
	}
	public void getName()
	{
		System.out.println( key.getClass().getName());
		System.out.println( value.getClass().getName());
	}

	public static void main(String[] args) {
		Map<String,Integer> obj1 = new Map<String,Integer>("10**2",100);
		obj1.getName();
	}

}
