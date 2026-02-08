import java.util.HashMap;
import java.util.Map;

public class Duplicates {

    public static void main(String[] args) {

        String[] names = {"Sameer", "Sameer", "akshay", "anku", "Narayan", "Bhujanga"};

        Map<String, Integer> countMap = new HashMap<>();

        // Count occurrences
        for (String name : names) {
            countMap.put(name, countMap.getOrDefault(name, 0) + 1);
        }

        // Print duplicates only
        countMap.forEach((key, value) -> {
            if (value > 1) {
                System.out.println("Repeated Name: " + key + " -> " + value + " times");
            }
        });
    }
}
