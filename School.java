import java.lang.Integer;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class School {
	public static void main(String[] args) {
		IntStream.range(20, 51).filter(x -> x >= 23).forEach(x -> System.out.println(x));

		// Let's say we have one int array, and we have to sort import
		int[] arr = { 5, 3, 8, 4, 2 };

		for (int outArr = 0; outArr < arr.length; outArr++) {
			for (int innerArr = 0; innerArr < arr.length - 1 - outArr; innerArr++) {
				while (arr[innerArr] > arr[innerArr + 1]) {
					// int temp = arr[innerArr];
					// arr[innerArr] = arr[innerArr + 1];
					// arr[innerArr + 1] = temp;
					Collections.sort(Arrays.asList(arr), innerArr, innerArr+1);
				}
			}

		}
		System.out.println("sorted arr: " + Arrays.toString(arr));
	}

}
