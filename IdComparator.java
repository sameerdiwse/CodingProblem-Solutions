import java.util.Comparator;
class IdComparator implements Comparator<Laptops>
{
   @Override
   public int compare(Laptops i0, Laptops i1)
   {
     return i0.getLapRam()-i1.getLapRam();
   }
}