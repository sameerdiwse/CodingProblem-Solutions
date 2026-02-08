import java.util.HashMap;
import java.util.Map;

public class DuplicateFinder {

    public static void main(String[] args) {
        String[] names = {"Sameer", "Sameer", "akshay", "anku", "Narayan", "Bhujanga"};
        findDuplicates(names);
    }

    public static void findDuplicates(String[] names) {
        Map<String, Integer> countMap = new HashMap<>();

        for (String name : names) {
            countMap.put(name, countMap.getOrDefault(name, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
            }
        }
    }
}
