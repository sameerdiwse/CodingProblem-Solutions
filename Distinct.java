import java.util.*;
import java.lang.*;
import java.util.stream.*;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
class Distinct
{
   public static void main(String [] args)
   {
     //IntStream.of(21,4,7,7,5,8,9,9,14,6,6).sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);
	// IntStream.range(1,101).filter(x->x%7==0).forEach(x->System.out.println(x));
	 long l = IntStream.range(1,101).filter(x->x%7==0).count());
	 System.out.println(l);
   }
}