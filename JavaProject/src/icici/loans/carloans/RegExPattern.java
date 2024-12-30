package icici.loans.carloans;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegExPattern 
{

	public static void main(String[] args)
	{
		//boolean b1= Pattern.matches("[A-Z][a-z]+\\.[0-9]+[@][a-z]+\\.[a-z]{2,3}","Swathi.3@gmail.com");
		 // System.out.println(b1);
		
		
		/* "visit our website at https://amazon.in or https://flipkart.com"
		
		boolean b2= Pattern.matches("https://[a-z]*[.][a-z]{2,3}"," https://amazon.in");
		System.out.println(b2);
		
		
		/* "Ravi kanth" - RK
		string s1=Ravi;
		string s2=Kanth
		boolean b3= Pattern.matches("", null)*/
		
		
		//"192.168.0.1"
        
		boolean b4= Pattern.matches("[0-9]{3}[.][0-9]{3}[.][0][.][1]", "192.168.0.1");
	    System.out.println(b4);
		
		
		//"The order numbers are 123, 456, &  789"
		
		boolean b5= Pattern.matches("[A-Z][a-z]*\s[a-z]*\s[a-z]*\s[a-z]*\s[0-9]{3}[,]\s[0-9]{3}[,]\s[&]\s\s[0-9]{3}", "The order numbers are 123, 456, &  789");
		System.out.println(b5);
		
		// "This     is a    test for    you"
		boolean b6=Pattern.matches("[A-Z][a-z]*\s[a-z]*\s[a-z]*\s[a-z]*\s[a-z]*\s[a-z]*","This is a test for you");
		System.out.println(b6);

	}

}
