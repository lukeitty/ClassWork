
/**
 * Write a description of class Fruit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fruit extends Food
{
    //class fields
    private String kindOfFruit;
    private int numSeeds; 
    
    //constructors
    public Fruit()
    {
        super();
        kindOfFruit = "";
        numSeeds = 0;
    }
    
    public Fruit(int s, int c, String f, int seeds)
    {
        super(s, c);
        kindOfFruit = f;
        numSeeds = seeds;
    }
    
    //accessors
    public String getTypeOfFruit()
    {
        return kindOfFruit;
    }
    
    public int getSeeds()
    {
        return numSeeds;
    }
    
    //mutators
    public void setTypeOfFruit(String f)
    {
        kindOfFruit = f;
    }
    
    public void setSeeds(int s)
    {
        numSeeds = s;
    }
    
    //other methods
    public String isVegan()
    {
        return "IS VEGAN";
    }
    
    public double averagePrice(int numItems)
    {
        return numItems * 3.49; //average price of fruit
    }
    
    public boolean equals(Fruit f)
    {
        return (kindOfFruit.equals(f.kindOfFruit)) && (numSeeds == f.numSeeds);
    }
    
    public String toString()
    {
        return "Fruit: " + kindOfFruit + "Number of seeds: " + numSeeds;
    }
    
}
