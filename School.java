import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class School {
    public static void main(String[] args) {

        // 23 to 50 (single line, clean)
        IntStream.rangeClosed(23, 50)
                .forEach(System.out::println);

        int[] arr = {5, 3, 8, 4, 2};

        // Max
        int max = Arrays.stream(arr).max().orElseThrow();
        System.out.println("Max: " + max);

        // Min
        int min = Arrays.stream(arr).min().orElseThrow();
        System.out.println("Min: " + min);

        // Average
        double avg = Arrays.stream(arr).average().orElse(0);
        System.out.println("Avg: " + avg);

        // Sorted (stream way - returns new array)
        int[] sorted = Arrays.stream(arr)
                .sorted()
                .toArray();

        System.out.println("Sorted: " + Arrays.toString(sorted));

        // Reverse sort (need boxed)
        List<Integer> desc = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("Desc: " + desc);

        // Remove duplicates (if any)
        int[] unique = Arrays.stream(arr)
                .distinct()
                .toArray();

        System.out.println("Unique: " + Arrays.toString(unique));
    }
}
