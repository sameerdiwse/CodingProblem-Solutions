import java.util.*;
import java.util.stream.IntStream;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

public class Array01 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 8, 6, 7 };
		int target = 9;
		// for (int i = 0; i < arr.length - 1; i++) {
		// for (int j = i + 1; j < arr.length; j++) {
		// if (arr[i] + arr[j] == target) {
		// System.out.println("two elements are: " + arr[i] + " and " + arr[j]);
		//
		// }
		// }
		// }
//complement is nothing but to get the required num we desire, we'll search for it during traversing the array.
		Map<Integer, Integer> map = new HashMap<>();
		IntStream.range(0, arr.length).forEach(i -> {
			int complement = target - arr[i];
			if (map.containsKey(arr[i])) {
				// System.out.println("these are the values: " + arr[map.get(arr[i])] + " and "
				// + arr[i]);

			} else {
				//map.put(complement, i);
			}
		});
		int x = 213;
		char[] chr = String.valueOf(x).toCharArray();
		String revString = "";
		for (int j = chr.length - 1; j >= 0; j--) {
			revString = revString.concat(String.valueOf(chr[j]));
		}
		// System.out.println(Integer.valueOf(revString.getClass().getSimpleName()));
		System.out.println(Integer.valueOf(revString).getClass().getSimpleName());
	}

}
