import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class ArraysFun {
    public static void main(String[] args) {

        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};

        int[] flat = Arrays.stream(a).flatMapToInt(Arrays::stream).toArray();
        IntSummaryStatistics stats = Arrays.stream(flat).summaryStatistics();

        System.out.println(Arrays.deepToString(a));
        System.out.println("Flat=" + Arrays.toString(flat));
        System.out.println("Stats=" + stats);
        System.out.println("Distinct=" + Arrays.stream(flat).distinct().count());
        System.out.println("SortedDesc=" +
                Arrays.toString(Arrays.stream(flat).boxed()
                        .sorted((x,y)->y-x).toArray()));
    }
}
