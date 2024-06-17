package assign6;

public class StrbReadWrite {

	StringBuffer strb = new StringBuffer("String");
	int value;
	boolean hasValue = false;
	
	public synchronized void setValue(int value)
	{		
		this.strb=this.strb.append(value);
		System.out.println("Write value : "+value);
		if (value ==3)
		{
			hasValue = true;
			notify();
		}
	}
		
		
		public synchronized void getValue()
		{
			if (!hasValue)
			{
				try 
				{
					wait();
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
			System.out.println("read value : "+strb);
			hasValue = false;
	}
}
