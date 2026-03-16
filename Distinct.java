import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.OptionalInt;
import java.util.stream.IntStream;

class Distinct {

    public static void main(String[] args) {

        int[] numbers = {21, 4, 7, 7, 5, 8, 9, 9, 14, 6, 6};

        // 1. Distinct numbers sorted in descending order
        System.out.println("Distinct numbers (descending):");
        IntStream.of(numbers)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        // 2. Numbers divisible by 7 till 100
        System.out.println("\nNumbers divisible by 7:");
        long countDivBy7 = IntStream.rangeClosed(1, 100)
                .filter(x -> x % 7 == 0)
                .peek(System.out::println)
                .count();

        System.out.println("Total numbers divisible by 7: " + countDivBy7);

        // 3. Even numbers till 100
        long evenCount = IntStream.rangeClosed(1, 100)
                .filter(x -> x % 2 == 0)
                .count();

        System.out.println("\nTotal even numbers till 100: " + evenCount);

        // 4. Sum of even numbers
        int evenSum = IntStream.rangeClosed(1, 100)
                .filter(x -> x % 2 == 0)
                .sum();

        System.out.println("Sum of even numbers: " + evenSum);

        // 5. Maximum value from array
        OptionalInt max = IntStream.of(numbers).max();
        max.ifPresent(value -> System.out.println("\nMax value in array: " + value));

        // 6. Minimum value from array
        OptionalInt min = IntStream.of(numbers).min();
        min.ifPresent(value -> System.out.println("Min value in array: " + value));

        // 7. Summary statistics
        IntSummaryStatistics stats = IntStream.of(numbers).summaryStatistics();

        System.out.println("\nStatistics:");
        System.out.println("Count: " + stats.getCount());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Sum: " + stats.getSum());

        // 8. First number greater than 10
        IntStream.of(numbers)
                .filter(x -> x > 10)
                .findFirst()
                .ifPresent(x -> System.out.println("\nFirst number greater than 10: " + x));
    }
}
