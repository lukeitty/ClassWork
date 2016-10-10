/**
*
*
*
*/

public class Loops
{
	public static void main(String[] args)
	{
		//call to While Loop
		//whileLoop();
		
		//System.out.println("---------------------");
		
		//call to forLoop
		forLoop();
		
		//call to nestedWhileLoop with n = 4
		//nestedWhileLoop(4);	
		
		//System.out.println("-----------------------");
		
		//call to nestedForLoop with n = 4
		//nestedForLoop(4);
		
		//call to staircase with n = 5
		staircase(5);
		
		System.out.println("-----------------------");
		
		//call to staircaseTwo with n = 5
		staircaseTwo(5);
		
	
	}
	
	public static void whileLoop()
	{
		/*int counter = 1;
		while (counter <= 10)
		{
			System.out.println(counter);
			counter++; //counter += 1;
			//counter = counter + 1;
		
		} */
	
	public static void forLoop()
	{
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(i);
		}
	}
	
	public static void nestedWhileLoop(int n)
	{
		char star = '*';
		int row = 0;
		while(row < n)
		{
			int col = 0;
			while(col < n)
			{
				System.out.print(star);
				col++;
			}
			System.out.println();
			row++;	
		}
	}
	
	public static void nestedForLoop(int n)
	{
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	public static void staircase(int n)
	{
		
		char star = '*';
		int row = 0;
		
		while(row < n)
		{
			int newCount = n - row;
			int col = 0;
			while(col < newCount)
			{
				System.out.print(star);
				col++;
				
			}
			System.out.println();
			row++;	
		}
	}
	
	public static void staircaseTwo(int n)
	{
		
		char star = '*';
		int row = 0;
		int count = 1;
		
		while(row < n)
		{
			int newCount = count + row;
			int col = 0;
			while(col < newCount)
			{
				System.out.print(star);
				col++;
				
			}
			System.out.println();
			row++;	
		}
	}
	


}