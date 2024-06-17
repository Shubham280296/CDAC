package day6;

public class streamExceptionLambda {
	public static boolean operateOnString(StringPredicate func,String s) throws EmptyStringException
	{
		if (s=="")
			throw new EmptyStringException("String is Empty");
		else
			return func.verifyString(s);
	}
	
	public static void main(String[] args)
	{
		String s = "";
		try
		{
			operateOnString((str)->str.equals(s),s);
		}
		catch (EmptyStringException e)
		{
			e.printStackTrace();
		}
		
		
	}
	

}
