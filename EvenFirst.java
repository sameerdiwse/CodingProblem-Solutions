import java.util.Arrays;

public class EvenOddUtils {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Original: " + Arrays.toString(arr));

        rearrangeInPlace(arr);
        System.out.println("In-place (fast): " + Arrays.toString(arr));

        int[] stable = rearrangeStable(arr);
        System.out.println("Stable (order preserved): " + Arrays.toString(stable));
    }

    // 🔥 Fast, in-place (O(1) space, not stable)
    public static void rearrangeInPlace(int[] arr) {

        int left = 0, right = arr.length - 1;

        while (left < right) {

            while (left < right && isEven(arr[left])) left++;
            while (left < right && !isEven(arr[right])) right--;

            if (left < right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
    }

    // 🧠 Stable version (O(n) space)
    public static int[] rearrangeStable(int[] arr) {

        int[] result = new int[arr.length];
        int index = 0;

        // add evens first
        for (int num : arr) {
            if (isEven(num)) result[index++] = num;
        }

        // then odds
        for (int num : arr) {
            if (!isEven(num)) result[index++] = num;
        }

        return result;
    }

    // 🧩 Utility methods
    private static boolean isEven(int n) {
        return (n & 1) == 0; // bitwise check (faster than %)
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
