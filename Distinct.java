import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

class Distinct {
    public static void main(String[] args) {

        // Distinct numbers sorted in descending order
        System.out.println("Distinct numbers (descending):");
        IntStream.of(21, 4, 7, 7, 5, 8, 9, 9, 14, 6, 6)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        // Numbers divisible by 7 till 100
        System.out.println("\nNumbers divisible by 7:");
        long countDivBy7 = IntStream.rangeClosed(1, 100)
                .filter(x -> x % 7 == 0)
                .peek(System.out::println)
                .count();

        System.out.println("Total numbers divisible by 7: " + countDivBy7);

        // Even numbers till 100
        long evenCount = IntStream.rangeClosed(1, 100)
                .filter(x -> x % 2 == 0)
                .count();

        System.out.println("\nTotal even numbers till 100: " + evenCount);

        // Sum of even numbers
        int evenSum = IntStream.rangeClosed(1, 100)
                .filter(x -> x % 2 == 0)
                .sum();

        System.out.println("Sum of even numbers: " + evenSum);

        // Statistics example
        IntSummaryStatistics stats = IntStream.of(21, 4, 7, 7, 5, 8, 9, 9, 14, 6, 6)
                .summaryStatistics();

        System.out.println("\nStatistics:");
        System.out.println("Max: " + stats.getMax());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Total Count: " + stats.getCount());
    }
}
