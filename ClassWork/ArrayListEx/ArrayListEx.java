import java.util.ArrayList;
/*
* ArrayList Examples
* @author Luke Ittycheria
*/
public class ArrayListEx
{	
	/*
	* main method
	* has my classNotes and work
	*/
	public static void main(String[] args)
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		System.out.println(a.size());
		a.add(3);
		a.add(4);
		System.out.println(a);
		
		Integer i = new Integer(5); //Integer Reference Type?
		a.add(i);
		System.out.println(a);
		i = 6;
		System.out.println(a);
		a.add(0, -3); //Puts in -3 in for the 0th place. Shifts everything else over
		System.out.println(a);
		a.set(a.size()-1, 6);
		System.out.println(a);
		
		a.add(a.size(), 1);
		
		System.out.println(a);
		
		a.set(0, -2);
		
		a.remove(0);
		
		System.out.println(a.size());
		System.out.println(a);
		
		System.out.println("In-Class Exercises: ");
		
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(2);
		b.add(2);
		b.add(0);
		b.add(-2);
		b.add(4);
		b.add(2);
		
		removeInt(b, 2);
		System.out.println(b);
		
		ArrayList<String> str = new ArrayList<String>();
		str.add("eye");
		str.add("abc");
		str.add("bye");
		replace(str);
		System.out.println(str);
		
	}
	/*
	* removeInt method
	* this method removes an specified int from an array list
	* @param ArrayList<Integer> b, int num
	*/
	public static void removeInt(ArrayList<Integer> b, int num)
	{
		int x = 0;
		while(x < b.size())
		{
			if(b.get(x) == num)
				b.remove(x);
			else
				x += 1;
		}
	}
	/*
	* replace method
	* this method takes in an ArrayList of strings and replaces
	* "e"s with with "x"s.
	* @param ArrayList<String> str
	*/
	public static void replace(ArrayList<String> str)
	{
		int x = 0;
		
		while(x < str.size())
		{
			String newStr = ("");
			String item = str.get(x);
			for(int i = 0; i < item.length(); i++)
			{
				if(item.substring(i, i+1).equals("e"))
					newStr += "x";
				
				else
					newStr += item.substring(i, i + 1);
			}
			str.set(x, newStr);
			x+= 1;
			
		}
		
	}
}