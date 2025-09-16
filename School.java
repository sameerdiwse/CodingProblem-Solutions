import java.lang.Integer;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class School
{
	public static void main (String [] args)
	{
		IntStream.range(20,51).filter(x->x>=23).forEach(x->System.out.println(x));
	}
}