import java.util.Arrays;
import java.util.stream.Stream;

import java.util.*;
public class ArraysFun {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Print all elements of a 2D array.
		int [][] intArr = {
		{1,2,3},
		{4,5,6},
		{7,8,9}
		};

		
	Arrays.stream(intArr).flatMapToInt(Arrays::stream).forEach(System.out::println);
	}

}
