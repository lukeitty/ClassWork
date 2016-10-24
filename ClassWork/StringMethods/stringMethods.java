public class stringMethods{

	public static void main(String args[])
	{
		System.out.println(findString("racecar", "car", 0));
		System.out.println(findString("abcd", "ef", 1));
		System.out.println(findString("abcabcdabc", "abc", 2));
		System.out.println("--------------------");
		System.out.println(countStrings("abcdefabcghiabcz", "abc"));
		System.out.println(countStrings("abcdefabcghiabcz", "def"));
		System.out.println(countStrings("abcdefabcghiabcz", "pqr"));
		System.out.println(countStrings("abcdefabcghiabc", "abc"));
		System.out.println(countStrings("abcabcabcabcabc", "abc"));
		System.out.println("---------------------");
		System.out.println(convertItalics("This is _very_ good"));
		System.out.println(convertItalics("This is _very good_"));
		System.out.println(convertItalics("_This_ is _very_ good"));
		System.out.println(convertItalics("_This is _very_ good"));
		
	

	}
	
	
	/**
 * Finds the first instance of s in line,
 * starting at the position start
 * @param o the orignal string 
 * @param s the string to find 
 * @param start the position to start searching.
 * Guaranteed to be in the string line. (precondition)
 * @return the index of the first single instance of
 * s if the string is found OR -1 if it is not found.
 */
	public static int findString(String o, String s, int start)
	{
		String newStr = o.substring(start);
		
		int x = newStr.indexOf(s);
		
		if(x == -1)
		{		
			return x;
		}
		else
		{
			x = x + start;
			return x;
		}
	
	}

/**
 * Count the number of times instances of s appear in
 * the line.
 * @param o the original string
 * @param s the string to find.
 * @return the number of times the string appears in the line
 */
	public static int countStrings (String o, String s)
	{ 
		String newStr = o.substring(0);
		
		int x = newStr.indexOf(s);
		
		int count = 0;
		
		while(x != -1)
		{
		
			newStr = newStr.substring(x + s.length());
			count += 1; 
			
			x = newStr.indexOf(s);
		}
		
		return count; 

	}

/**
 * Replace all instances of underscores in the line given by
 * line with italics tags.  There must be an even number of underscores
 * in the line, and they will be replaced by <I>, </I>, alternating.
 * @param line a string with 0 or more underscores
 * @return the line that has underscores replaced with <I> </I> tags or 
 * the original line if there are not an even number of underscores.
 */
  public static String convertItalics(String line)
  {
  	String newStr = "";
  	int count = 0;
  	
  	for(int i = 0; i <= line.length() - 1; i++)
  	{
  		if(line.charAt(i) == '_')
  		{
  			if(count % 2 == 0)
  			{
  				newStr += "<I>";
  			}
  			else
  			{
  				newStr += "</I>";
  			}
  			count += 1;
  		}
  		else
  		{
  			newStr += line.charAt(i); 
  		}
  	}
  	if(count % 2 == 0)
  	{
  		return newStr;
  	}
  	else
  	{
  		return line;
  	}
  
  } 
  
}