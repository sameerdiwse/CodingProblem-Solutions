import java.util.Arrays;

public class Distinct1 {
    public static void main(String[] args) {

        int[] arr = {1, 4, 23, 103, 54, 3, 21, 521, 90};

        // Max value (most efficient)
        int max = Arrays.stream(arr).max().orElseThrow();
        System.out.println("Max Value: " + max);

        // Highest element after sorting (if you really need sorted array)
        int[] sortedDesc = Arrays.stream(arr)
                                 .sorted()
                                 .toArray();

        int highest = sortedDesc[sortedDesc.length - 1];
        System.out.println("Highest (via sort): " + highest);
    }
}
