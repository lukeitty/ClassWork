public class StringImmutability
{


	public static void main(String[]args)
	{
		
		/*
		String a = "abc";
		String b  new String("abc");
		String c = "abc";
		
		System.out.println(a == c);
		
		a = b; // after this line a is referring to B's memory address
		
		
		System.out.println(a == b); // a's memory address equals b's memory address
		Sytem.out.println(a == c); 
		
		
		a = a + "!";
		
		System.out.println(a == c);
		*/
		
		int j = 10;
		String str = "abc";
		int[] arr = {1, 2, 3};
		
		System.out.println("j =" + j);
		System.out.println("arr =" + arr);
				
		mystery(j, str, arr);
	
	}
	
	public static void mystery(int i, String s, int[] ar)
	{

		System.out.println(s);
	
	}
	/**
	* This method takes in an integer array and prints
	* and prints the content of it using a loop
	* @param ar the int array that needs to be printed
	*/
	
	public static void printArray(int[] ar)
	{
		System.out.print(" { ");
		for(int i = 0; i < ar.length; i++) // to print the actual LENGTH of the array is arr.length
		{
			System.out.print(ar[i] + ", ");
		}
		System.out.print(" } ");
	
	}
	
	//add foreach loop





}