import java.util.Arrays;
import java.util.stream.*;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.function.Function;
import java.util.List;
class HowManyTimes
{
	public static void main(String [] args)
	{
		Integer [] a = {2,2,5,1,9,8,5,0,2,4,6,2,7,5,0,5};
		Arrays.sort(a);
		isRepeated(a);
	}
	
	public static void isRepeated(Integer[] a)
	{
           List<Integer> aa = Arrays.asList(a);
	       Map<Integer,Long> repeated = aa.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
           System.out.println(repeated);
	}
}