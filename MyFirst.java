import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyFirst {

    public static void main(String[] args) {

        // Original list
        List<Integer> numbers = Arrays.asList(1, 7, 6, 3, 9, 2);

        // Process list: filter >=3, sort descending
        List<Integer> result = numbers.stream()
                .filter(n -> n >= 3)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        // Print result using method reference
        System.out.println("Filtered and sorted numbers:");
        result.forEach(System.out::println);

        // Additional enhancements
        // 1. Get max number
        result.stream()
                .findFirst()
                .ifPresent(max -> System.out.println("Max number: " + max));

        // 2. Sum of numbers
        int sum = result.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum: " + sum);

        // 3. Count
        long count = result.size();
        System.out.println("Count: " + count);
    }
}
