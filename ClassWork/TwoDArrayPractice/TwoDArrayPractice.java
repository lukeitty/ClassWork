/**
* 2D Array Practice
* This Program has several different methods that manipulate 2D arrays
* @author Luke Ittycheria
*/
public class TwoDArrayPractice
{

	public static void main(String[] args)
	{
		//int[][] arr = new int[3][4];
		//printArray(arr);
		
		//String[][] arr1 = new String[3][3];
		//printArray(arr1);
		
		printArray(create2D(4, 4));
	
	}
	
	/*
	* create2D method
	* this method creates the 2D array based on the dimension
	* parameters given
	* @param rowLen --> row length dim
	* @param colLen --> column length dim
	* @return the newly created array
	*/
	public static int[][] create2D(int rowLen, int colLen)
	{
		int[][] arr = new int[rowLen][colLen];
		int counter = 1;
		for(int row = 0; row < arr.length; row++)
		{
			for(int col = 0; col < arr[row].length; col++)
			{
				arr[row][col] = counter;
				counter += 1;
			}
		}
		return arr;
	}
	/*
	* printArray method
	* this method prints the given int array (no return type)
	* @param int[][] a --> the int array
	*/
	public static void printArray(int[][] a)
	{
		System.out.println("---------------------");
		for(int row = 0; row < a.length; row++)
		{
			System.out.print("| ");
			for(int col = 0; col < a[row].length; col++)
			{
				System.out.print(a[row][col]);
				System.out.print(" | ");
			}
			System.out.println();
			System.out.println("---------------------");
		}
	}
	/*
	* printArray method
	* this method prints the given String array (no return type)
	* @param String[][] a --> the int array
	*/
	public static void printArray(String[][] a)
	{
		for(int row = 0; row < a.length; row++)
		{
			for(int col = 0; col < a[row].length; col++)
			{
				System.out.print(a[row][col] + " ");
			}
			System.out.println();
		}
	}

}