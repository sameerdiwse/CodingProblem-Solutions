import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicates {

    public static void main(String[] args) {

        String[] names = {"Sameer", "Sameer", "akshay", "Anku", "Narayan", "Bhujanga", "AKSHAY"};

        Map<String, Long> duplicates =
                Arrays.stream(names)
                        .map(String::toLowerCase)              // case-insensitive
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                TreeMap::new,                   // sorted output
                                Collectors.counting()
                        ));

        duplicates.entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .forEach(e ->
                        System.out.println("Duplicate: " + e.getKey() + " -> " + e.getValue() + " times")
                );
    }
}
