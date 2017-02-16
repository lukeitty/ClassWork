
/**
 * Write a description of class Meat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Meat extends Food
{
   //class fields
   private String kindOfMeat;
   private int numBones;
   
   //constructors
   public Meat()
   {
        super();
        kindOfMeat = "";
        numBones = 0;
    }
    
   public Meat(int s, int c, String m, int b)
   {
       super(s, c);
       kindOfMeat = m;
       numBones = b;
   }
   
   //accessors
   public String getKindOfMeat()
   {
       return kindOfMeat;
   }
   
   public int getNumBones()
   {
       return numBones;
   }
   
   //mutators
   public void setKindOfMeat(String m)
   {
       kindOfMeat = m;
   }
   
   public void setNumBones(int b)
   {
       numBones = b;
   }
   
   //other methods
   public String isVegan()
   {
       return "NOT VEGAN";
   }
   
   public double averagePrice(double pounds)
   {
       return 3.70 * pounds;
   }
   
   public boolean equals(Meat m)
   {
       return (kindOfMeat.equals(m.kindOfMeat)) && (numBones == m.numBones);
   }
    
   public String toString()
   {
       return "Type Of Meat: " + kindOfMeat + " Number of bones " + numBones;
   }
}
