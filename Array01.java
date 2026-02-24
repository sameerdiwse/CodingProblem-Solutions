import java.util.*;
import java.util.stream.IntStream;

public class Array01 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 8, 6, 7};
        int target = 9;

        // Approach 1: Brute force (check every pair)
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Brute force pair: " + arr[i] + " and " + arr[j]);
                }
            }
        }

        // Approach 2: Optimized using HashMap (O(n))
        // Complement means the number required to reach the target
        Map<Integer, Integer> map = new HashMap<>();

        IntStream.range(0, arr.length).forEach(i -> {

            int complement = target - arr[i];

            if (map.containsKey(arr[i])) {
                System.out.println("HashMap pair: " +
                        arr[map.get(arr[i])] + " and " + arr[i]);
            } else {
                map.put(complement, i);
            }
        });

        // Reverse a number
        int x = 213;

        char[] chr = String.valueOf(x).toCharArray();

        String revString = "";

        for (int j = chr.length - 1; j >= 0; j--) {
            revString = revString.concat(String.valueOf(chr[j]));
        }

        // Correct conversion and print reversed number
        int reversedNumber = Integer.valueOf(revString);

        System.out.println("Reversed number is: " + reversedNumber);
    }
}
