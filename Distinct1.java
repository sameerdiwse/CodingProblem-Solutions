import java.util.*;
public class Distinct1
{
  public static void main(String [] args)
  {
	 int num = 123;
	// System.out.println(num[0]);

int[] i = {1,4,23,103,54,3,21, 521,90};
//			List<int[]> something = Arrays.asList(i);
//			System.out.println(something.get(0)[4]);
			//Arrays.stream(i).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
			int maxValue = Arrays.stream(i).boxed().max(Integer::compare).get();
			System.out.println("maxValue: "+maxValue);
			
			int[] a = Arrays.stream(i).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
			System.out.println(a[0]);
			//a[0]; -> is not valid; it's just a standalone expression and does nothing.
  }
}