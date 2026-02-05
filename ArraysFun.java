import java.util.Arrays;

public class ArraysFun {
    public static void main(String[] args) {

        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};

        int[] flat = Arrays.stream(a).flatMapToInt(Arrays::stream).toArray();

        System.out.println(Arrays.deepToString(a));
        System.out.println("Flat=" + Arrays.toString(flat));
        System.out.println("Sum=" + Arrays.stream(flat).sum());
        System.out.println("Avg=" + Arrays.stream(flat).average().orElse(0));
        System.out.println("Max=" + Arrays.stream(flat).max().orElse(0));
        System.out.println("Even=" + Arrays.stream(flat).filter(n -> n % 2 == 0).count());
    }
}
