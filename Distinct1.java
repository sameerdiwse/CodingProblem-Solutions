import java.util.Arrays;

public class Distinct1 {

    public static void main(String[] args) {

        int[] arr = {1, 4, 23, 103, 54, 3, 21, 521, 90};

        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        // Fastest way — single pass
        int max = arr[0];
        for (int n : arr) {
            if (n > max) {
                max = n;
            }
        }
        System.out.println("Max Value: " + max);

        // Second highest (no sorting, still O(n))
        int secondMax = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > secondMax && n < max) {
                secondMax = n;
            }
        }
        System.out.println("Second Highest: " + secondMax);
    }
}
