public class recursiveNum
{
	public static void main(String args[])
	{
		printNum(5);
		System.out.println("done");
	}
	/**
	* This method prints the integers from 0 to n both inclusive, on separate lines
	* using recursion
	* @param n the largest integer printed on screen
	*/
	public static void printNum(int n)
	{
		if(n == 0)
		{
			System.out.println(n);
		}
		else
		{
			printNum(n - 1);
			System.out.println(n);
			
		}
			
			
	
	}
	

}