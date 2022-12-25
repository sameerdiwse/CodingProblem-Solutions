import java.lang.Comparable;
class Laptops 
{
  private int LapPrice;
  private int LapRam;
  private String LapColor;
  
  public Laptops(int LapPrice, int LapRam, String LapColor)
  {
   this.LapPrice=LapPrice;
   this.LapRam=LapRam;
   this.LapColor=LapColor;
  }
  
  /*@Override
  public int compareTo(Laptops lap0)
  {
	 return this.LapPrice-lap0.LapPrice;
  }*/
  
  public int getLapPrice()
  {
   return LapPrice;
  }
  
  public int getLapRam()
  {
   return LapRam;
  }
  
  public String getLapColor()
  {
   return LapColor;
  }
  
  public String toString()	
  {
   return " Price " + LapPrice + " Ram " + LapRam + " Color " + LapColor;
  }
}