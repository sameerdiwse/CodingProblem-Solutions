import java.util.stream.IntStream;
import java.util.Comparator;

class Distinct {
    public static void main(String[] args) {

        // Print distinct numbers in descending order
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

        System.out.println("Count divisible by 7: " + countDivBy7);

        // Count even numbers till 100
        long evenCount = IntStream.rangeClosed(1, 100)
                .filter(x -> x % 2 == 0)
                .count();

        System.out.println("Count of even numbers: " + evenCount);
    }
}
