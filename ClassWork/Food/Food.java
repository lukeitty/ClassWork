
/**
 * Write a description of class Food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Food
{
    //private fields
    private int shelfLife;
    private int carbs;
    
    //constructors
    public Food()
    {
        shelfLife = 0;
        carbs = 0;
    }
    
    public Food(int s, int c)
    {
        shelfLife = s;
        carbs = c;
    }
    
    //accessor
    public int getShelfLife()
    {
        return shelfLife;
    }
    
    public int getCarbs()
    {
        return carbs;
    }
    
    //mutators
    public void setShelfLife(int s)
    {
        shelfLife = s;
    }
    
    public void setCarbs(int c)
    {
        carbs = c;
    }
    
    //other methods
    public String isVegan()
    {
        return "unknown";
    }
    
    public double averagePrice(double pounds)
    {
        return pounds * 0.0;
    }
    
    public boolean equals(Food f)
    {
        return (shelfLife == f.shelfLife) && (carbs == f.carbs);
    }
    
    public String toString()
    {
        return "Months of shelf life " + shelfLife + " Number of carbs " + carbs;
    }
    
    
}
