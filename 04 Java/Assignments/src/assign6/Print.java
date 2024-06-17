package assign6;

public class Print {
	int[] arr;
	
	public void printArray(int[] arr)
	{
		for (int a:arr)
		System.out.println(Thread.currentThread().getName()+"="+a);
	}

}
 