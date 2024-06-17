package day6;

public class DemoLambdda {
	
	public static boolean verifyNum(NumCheck check,int n)
	{
		return check.checkNum(n);
	}
	
	public static String operateOnString(StringFunc strfun, String str)
	{
		return strfun.stringLambda(str);
	}
	
	public static String reverseString(String str)
	{
		String reverse = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse += str.charAt(i);
		}
		return reverse;
	}	
	
	public static void main(String[] args) {
		NumCheck ispositive = (n) -> (n>=0);
		
		System.out.println("Positive : "+ispositive.checkNum(-10));
		
		NumCheck isprime = (n)->
		{
			for (int i=2;i<n;i++)
			{
				if (n%i==0)
				{
					return false;
				}
			}
			return true;
		};
		
		System.out.println("Prime : "+isprime.checkNum(13));
		
		
		StringFunc upperString = (str)->(str.toUpperCase());
		System.out.println("Uppercase string : "+upperString.stringLambda("ahgjhgjh"));
		
		StringFunc reverseString = (str)-> 
		{
			String reverse = "";
			for(int i=str.length()-1;i>=0;i--)
			{
				reverse += str.charAt(i);
			}
			return reverse;
		};
		System.out.println("Reverse string : "+ reverseString.stringLambda("ahgjhgjh"));	
		
		
		System.out.println("Even : "+verifyNum((n)->(n%2==0),12));
		
		System.out.println("Prime : "+verifyNum((n)->
		{
			for (int i=2;i<n;i++)
			{
				if (n%i==0)
				{
					return false;
				}
			}
			return true;
		},5));
		
		
		System.out.println("lowercase String : "+operateOnString((str)->(str.toLowerCase()),"ASFDFGHF"));
	
		String name = "Satyasish";
		System.out.println("Reversed String: "+operateOnString(DemoLambdda::reverseString, name));
	
		System.out.println("Prime : " + verifyNum(Math::isPrime,15));
	}

}
