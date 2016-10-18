public class exercises{

	public static void main(String args[])
	{
		System.out.println(hasDigit("Abc"));
		System.out.println("--------------");
		System.out.println(isPalindrome0("mother"));
		System.out.println("--------------");
		System.out.println(isPalindrome1("dad"));
		System.out.println("--------------");
		System.out.println(isPalindrome2("tacocat"));
		System.out.println("--------------");
		System.out.println(isPalindrome3("wonder"));
		
	}
	/**
	* This methods takes in a String and returns true if it has a digit. It uses ASCII number
	* to check whether the given String has a digit
	* @param s The String to check whether it has a digit
	* @return boolean true if the String has a digit, false otherwise
	*/
	
	public static boolean hasDigit(String s)
	{
		for(int i = 0; i < s.length(); i++)
		{
			int ascii = (int) s.charAt(i); //changes char into ascii
			if(ascii <= 57 && ascii >= 48)
			{
				return true;
			}
				
		}
		return false;	
	
	}
	
	/**
	* This method takes in a String and returns true if it is a palindrome.
	* Iterative function
	* Includes charAt
	* @param s String
	* @return boolean true if the String is a palindrome, false otherwise
	*/
	
	public static boolean isPalindrome0(String s)
	{
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) != s.charAt(s.length() - (i + 1)))
			{
				return false;
			}
		}
		return true;
	}
	
	/**
	* This method takes in a String and returns true if it is a palindrome.
	* Iterative function
	* Includes substring
	* @param s String
	* @return boolean true if the String is a palindrome, false otherwise
	*/
	
	public static boolean isPalindrome1(String s)
	{
		int l = s.length();
		for(int i = 0; i < s.length(); i++)
		{
			if(!s.substring(i,i+1).equals(s.substring(l - (i + 1), l - i)))
			{
				return false;
			}
		}
		return true;
	}
	
	/**
	* This method takes in a String and returns true if it is a palindrome.
	* recursive function
	* Includes charAt
	* @param s String
	* @return boolean true if the String is a palindrome, false otherwise
	*/
	
	public static boolean isPalindrome2(String s)
	{
		if (s.length() == 1)
		{
			return true;
		}
		
		if (s.charAt(0) == s.charAt(s.length() - 1))
		{
			return isPalindrome2(s.substring(1, s.length() - 1));
		}
		
		else
		{
			return false;
		}
	}
	
	/**
	* This method takes in a String and returns true if it is a palindrome.
	* recursive function
	* Includes substring
	* @param s String
	* @return boolean true if the String is a palindrome, false otherwise
	*/
	
	public static boolean isPalindrome3(String s) //PROBLEMS
	{
		if (s.length() == 1)
		{
			return true;
		}
		
		if (s.substring(0,1).equals(s.substring(s.length() - 1)))
		{
			return isPalindrome2(s.substring(1, s.length() - 1));
		}
		
		else
		{
			return false;
		}
	}
	
}
