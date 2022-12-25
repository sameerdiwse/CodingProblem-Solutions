import java.util.*;
import java.lang.*;
import java.util.stream.*;
class MyFirst
{
  public static void main(String [] args)
  {
   List<Integer> l = Arrays.asList(1,7,6,3,9,2);
    List<Integer> num = l.stream().sorted(Comparator.reverseOrder()).filter(x->x>=3).collect(Collectors.toList());
	for(Integer n : num)
	{
		System.out.println(n);
	}
  }
}