import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicates {

    public static void main(String[] args) {

        String[] names = {
                "Sameer", " Sameer ", "akshay", "Anku",
                "Narayan", "Bhujanga", "AKSHAY", null, ""
        };

        printDuplicates(names, s -> s.trim().toLowerCase()); // custom normalization
    }

    // Generic duplicate finder
    public static void printDuplicates(String[] input,
                                       Function<String, String> normalizer) {

        if (input == null || input.length == 0) {
            System.out.println("No data.");
            return;
        }

        Map<String, Long> result =
                Arrays.stream(input)
                        .filter(Objects::nonNull)                 // null-safe
                        .map(normalizer)                          // normalize
                        .filter(s -> !s.isEmpty())                // remove blanks
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                LinkedHashMap::new,               // preserve order
                                Collectors.counting()
                        ));

        result.entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .forEach(e -> System.out.printf(
                        "Duplicate: %-10s Count: %d%n",
                        e.getKey(), e.getValue()
                ));
    }
}
