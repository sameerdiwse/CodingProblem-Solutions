import java.util.Arrays;
import java.util.stream.Collectors;

public class RepeatingNum
{
	public static void main(String[] args) {
		int[] arr = {4,5,2,6,3,2,6,4,1,9,9,9,20};
		Arrays.stream(arr).boxed().collect(Collectors.groupingBy(e->e, Collectors.counting())).forEach((num, repeat)->System.out.println(num +" is  repeating "+repeat+" times"));	
	}
}

