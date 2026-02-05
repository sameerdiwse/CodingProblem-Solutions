import java.util.Arrays;

public class ArraysFun {

    public static void main(String[] args) {

        int[][] intArr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        print2DArray(intArr);
        printFlattenedArray(intArr);
        printArraySum(intArr);
    }

    // Prints row by row
    private static void print2DArray(int[][] arr) {
        System.out.println("Original 2D Array:");
        Arrays.stream(arr)
              .forEach(row -> System.out.println(Arrays.toString(row)));
    }

    // Flattens and prints
    private static void printFlattenedArray(int[][] arr) {
        System.out.print("\nFlattened Elements: ");
        Arrays.stream(arr)
              .flatMapToInt(Arrays::stream)
              .forEach(n -> System.out.print(n + " "));
        System.out.println();
    }

    // Extra logic — calculates sum
    private static void printArraySum(int[][] arr) {
        int sum = Arrays.stream(arr)
                        .flatMapToInt(Arrays::stream)
                        .sum();
        System.out.println("\nSum of all elements: " + sum);
    }
}
