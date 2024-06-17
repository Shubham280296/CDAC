package day1;
import java.util.*;

public class DemoBasics {

	public static void main(String[] args) {
		
//	//Bubble sort	
//	int[] a = {100,50,60,40,80,30,10,90,70,20};
//	for(int i=0;i<a.length-1;i++)
//	{
//		for(int j=0;j<(a.length-i-1);j++)
//		{
//			if (a[j]>a[j+1])
//			{
//				int temp = a[j];
//				a[j] = a[j+1];
//				a[j+1] = temp;
//			}
//		}
//	}
//	for(int i : a)
//	{
//		System.out.print(i+" ");
//	}
	
	
	//prime no
	Scanner myObj = new Scanner(System.in);
//	System.out.print("Enter a number:");
//	int num = myObj.nextInt();
//	int ind = 2;
//	for (ind = 2; ind < num/2; ind ++) {
//		if (num % ind == 0) {
//			System.out.print("Non-prime number");
//			break;
//		}
//	}
//	if (ind == num/2)
//			System.out.print("Prime number");
//	
	
//	System.out.print("Enter the term of the fibonacci series");
//	int num = myObj.nextInt();
//	int result = 0;
//	int fir = 0, sec = 1;
//	if (num == 1 || num == 0)
//		result = num;
//	else {
//		for (int ind = 3; ind <= num; ind ++) {
//			int temp = fir;
//			fir = sec;
//			sec= sec+temp;
//		}
//		result = sec;
//	}
//	System.out.print("The result is: "+result);
	
// anagram
	String str1 = "toKYo", str2 = "kyoto";
	String[] list1 = str1.split("");
	//String[] list2 = str2.split("");
//	Arrays.sort(list1);
//	Arrays.sort(list2);

//	if (Arrays.equals(list2, list1)) {
//		System.out.print("Anagram");
//	}
//	else {
//		System.out.print("Not an Anagram"+list1+list2);
//	}
	
// reverse a string
	String resultString = "";
	for (int ind = str1.length()-1; ind >= 0; ind --)
			resultString += str1.charAt(ind);
	System.out.print("The reversed string is: "+resultString);
	int countLower = 0, countUpper = 0, countSpecial = 0;
	for (int ind = 0; ind < str1.length(); ind ++) {
		if ((str1.charAt(ind)) >='a' && str1.charAt(ind) <= 'z') {
			countLower ++;
		}
		else if (str1.charAt(ind) >='A' && str1.charAt(ind) <= 'Z') {
			countUpper ++;
		}
		else {
			countSpecial ++;
		}
	}
	System.out.println("Number of lower case: "+countLower);
	System.out.println("Number of upper case: "+countUpper);
	System.out.println("Number of special chars: "+countSpecial);
	
	int countLength = 0;
	for (String ch: list1) {
		countLength ++;
	}
	System.out.println("Length: "+countLength);
	
	String shiftedString = "";
	for (int ind = 1; ind < str1.length(); ind++) {
		shiftedString += list1[ind];
	}
	System.out.print(shiftedString);
	
}}