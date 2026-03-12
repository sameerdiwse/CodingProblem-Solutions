import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyFirst {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 7, 6, 3, 9, 2);

        // Filter >=3 and sort descending
        List<Integer> result = numbers.stream()
                .filter(n -> n >= 3)
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("Filtered and sorted numbers:");
        result.forEach(System.out::println);

        // Max number
        int max = result.stream()
                .max(Integer::compareTo)
                .orElse(0);
        System.out.println("Max number: " + max);

        // Sum
        int sum = result.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum: " + sum);

        // Count
        long count = result.stream().count();
        System.out.println("Count: " + count);

        // Average
        result.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(avg -> System.out.println("Average: " + avg));
    }
}
