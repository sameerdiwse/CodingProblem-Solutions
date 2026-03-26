import java.util.*;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class ArrayPartitioner {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Original: " + Arrays.toString(arr));

        // 🔥 In-place generic partition
        partitionInPlace(arr, n -> (n & 1) == 0);
        System.out.println("In-place Even First: " + Arrays.toString(arr));

        // 🧠 Stable version
        int[] stable = partitionStable(arr, n -> (n & 1) == 0);
        System.out.println("Stable Even First: " + Arrays.toString(stable));

        // ⚡ Streams version
        int[] streamResult = partitionUsingStreams(arr, n -> (n & 1) == 0);
        System.out.println("Streams Version: " + Arrays.toString(streamResult));

        // 🧩 Comparator version (sorting approach)
        Integer[] boxed = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(boxed, Comparator.comparingInt(n -> n % 2));
        System.out.println("Comparator Sort: " + Arrays.toString(boxed));
    }

    // 🔥 Generic in-place partition (O(1) space)
    public static void partitionInPlace(int[] arr, IntPredicate condition) {

        int left = 0, right = arr.length - 1;

        while (left < right) {

            while (left < right && condition.test(arr[left])) left++;
            while (left < right && !condition.test(arr[right])) right--;

            if (left < right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
    }

    // 🧠 Stable partition (O(n) space)
    public static int[] partitionStable(int[] arr, IntPredicate condition) {

        int[] result = new int[arr.length];
        int index = 0;

        for (int num : arr)
            if (condition.test(num)) result[index++] = num;

        for (int num : arr)
            if (!condition.test(num)) result[index++] = num;

        return result;
    }

    // ⚡ Functional Streams version
    public static int[] partitionUsingStreams(int[] arr, IntPredicate condition) {

        return IntStream.concat(
                Arrays.stream(arr).filter(condition),
                Arrays.stream(arr).filter(condition.negate())
        ).toArray();
    }

    // 🔁 Swap utility
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
