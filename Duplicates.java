import java.util.HashMap;
import java.util.Map;

public class Duplicates {

    public static void main(String[] args) {

        String[] names = {"Sameer", "Sameer", "akshay", "anku", "Narayan", "Bhujanga"};

        Map<String, Integer> countMap = new HashMap<>();

        // Step 1: Count each name
        for (String name : names) {
            if (countMap.containsKey(name)) {
                countMap.put(name, countMap.get(name) + 1);
            } else {
                countMap.put(name, 1);
            }
        }

        // Step 2: Print duplicates
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Repeated Name: " + entry.getKey() +
                                   " | Count: " + entry.getValue());
            }
        }
    }
}
