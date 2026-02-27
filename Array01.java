import java.util.*;

public class Array01 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 8, 6, 7};
        int target = 9;

        // ==============================
        // Approach 1: Brute Force (O(n²))
        // ==============================
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Brute force pair: " + arr[i] + " and " + arr[j]);
                }
            }
        }

        // ======================================
        // Approach 2: Optimized using HashMap O(n)
        // ======================================
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                System.out.println("HashMap pair: " +
                        complement + " and " + arr[i]);
            }

            map.put(arr[i], i);
        }

        // ======================
        // Reverse a number
        // ======================
        int x = 213;

        StringBuilder sb = new StringBuilder(String.valueOf(x));
        int reversedNumber = Integer.parseInt(sb.reverse().toString());

        System.out.println("Reversed number is: " + reversedNumber);
    }
}
