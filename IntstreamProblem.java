import java.util.stream.IntStream;

public class IntStreamProblem {

    public static void main(String[] args) {

        String str = "SomeString";

        long count = str.toLowerCase()
                        .chars()
                        .filter(c -> "aeiou".indexOf(c) != -1)
                        .count();

        System.out.println("This is the count of vowels: " + count);
    }
}
