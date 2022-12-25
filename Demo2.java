import java.util.*;
import java.lang.*;
import java.util.stream.Stream;
import java.lang.Integer;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
class Demo2
{
	public static void main(String [] args)
	{
		Integer [] a = {1,2,3,4,5,6,7};
		
		List<Integer> list = Arrays.asList(a);
		
		long l = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		
		System.out.println(l);
	}
}