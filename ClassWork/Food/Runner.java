
/**
 * Write a description of class Runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Runner
{
    public static void main(String[] args)
    {
        System.out.println("------Food objects-------");
        Food a = new Food(5, 100);
        Food b = new Food(5, 100);
        System.out.println(a.equals(b));
        System.out.println(a);
        
        System.out.println("-------Fruit objects-------");
        Fruit apple = new Fruit(2, 100, "apple", 6);
        Fruit banana = new Fruit(1, 100, "banana", 10);
        System.out.println(apple);
        System.out.println(apple.equals(banana));
        
        System.out.println("-------Meat objects-------");
        Meat chicken = new Meat(6, 150, "chicken", 5);
        Meat beef = new Meat(6, 300, "beef", 10);
        System.out.println(beef);
        System.out.println(chicken.equals(beef));
        
        System.out.println("-------Other Methods-------");
        System.out.println("-------Vegan or Not?-------");
        System.out.println(a.isVegan());
        System.out.println(apple.getTypeOfFruit() + " " + apple.isVegan());
        System.out.println(beef.getKindOfMeat() + " " + beef.isVegan());
        
        System.out.println("-------Price-----------");
        System.out.println(a.averagePrice(1.9));
        System.out.println(apple.getTypeOfFruit() + " " + apple.averagePrice(4));
        System.out.println(beef.getKindOfMeat() +  " " + beef.averagePrice(3.2));
        
        
   }
}
