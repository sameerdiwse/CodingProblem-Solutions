import java.util.Arrays;
import java.util.stream.IntStream;

class School {
    public static void main(String[] args) {

        // Print numbers from 23 to 50
        IntStream.rangeClosed(23, 50)
                .forEach(System.out::println);

        int[] arr = {5, 3, 8, 4, 2};

        // Find max
        int maxNum = Arrays.stream(arr)
                .max()
                .orElseThrow();
        System.out.println("Max number: " + maxNum);

        // Sort array
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
