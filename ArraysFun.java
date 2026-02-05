import java.util.Arrays;

public class ArraysFun {
    public static void main(String[] args) {

        int[][] intArr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("2D Array Elements:");

        var flatStream = Arrays.stream(intArr)
                               .flatMapToInt(Arrays::stream);

        flatStream.forEach(n -> System.out.print(n + " "));
    }
}
