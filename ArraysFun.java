import java.util.Arrays;

public class ArraysFun {

    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        Arrays.stream(arr).forEach(r -> System.out.println(Arrays.toString(r)));

        int sum = Arrays.stream(arr).flatMapToInt(Arrays::stream).sum();
        int max = Arrays.stream(arr).flatMapToInt(Arrays::stream).max().orElse(0);

        System.out.println("Flattened: " + Arrays.toString(Arrays.stream(arr).flatMapToInt(Arrays::stream).toArray()));
        System.out.println("Sum: " + sum + " | Max: " + max);
    }
}
