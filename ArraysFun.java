import java.util.Arrays;

public class ArraysFun {
    public static void main(String[] args) {

        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};

        var flat = Arrays.stream(a).flatMapToInt(Arrays::stream);

        System.out.println(Arrays.deepToString(a));
        System.out.println("Sum=" + flat.sum());

        flat = Arrays.stream(a).flatMapToInt(Arrays::stream);
        System.out.println("Avg=" + flat.average().orElse(0));

        System.out.println("Max=" +
            Arrays.stream(a).flatMapToInt(Arrays::stream).max().orElse(0));
    }
}
