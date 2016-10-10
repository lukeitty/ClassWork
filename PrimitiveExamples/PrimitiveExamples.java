/**
* This is a project for learning Primitives
* There are 8 Primitive types in Java
* @author Luke Ittycheria
* @version 1.0
*/

public class PrimitiveExamples
{
	/**
	* This is the main method that the java interpreter looks for
	*
	*
	*/
	
	public static void main(String[] args)
	{
		int i;//variable declaration
		i = 8;//assignment or initializing variables
		
		int j = 2; //you can assign them whilst initializing
		
		int a = 9, b = 5; //you can do multiple variables at once if the same type
		
		i = 9;
		System.out.println(i);
		
		double d = 5.6;
		
		//double and int
		//i = d;  (This can't happen because a double cannot be assigned to an int)
		
		d = i; //This CAN happen because you can assign an int 
		
		/*
		This is a block comment
		*/
		
		boolean bb = true;
		char c = 'a';
		
		
		//Strings are objects
		String s1 = "abc" ; //interned String
		String s2 = new String();
		String s3 = new String("abc");
		String s4 = new String("abc");
		String s5 = "abc"; //Another interned String
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s4 == s3);
		System.out.println(s1 == s5);
		
		System.out.println(s1.equals(s4)); //now it compares the content of the strings
		int k = 8;
		int l = 8;
		System.out.println(k == l);
		
		//arrays
		int[] arr = {1, 2, 3};
		int[] arr1 = new int[10];
		arr1[0] = 3;
		System.out.println(arr);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		
		
		
		
	
	
	}




}