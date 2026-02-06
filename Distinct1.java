public class Distinct1 {

    public static void main(String[] args) {

        int[] arr = {1, 4, 23, 103, 54, 3, 21, 521, 90};

        Result result = findMaxAndSecondMax(arr);

        System.out.println("Max Value: " + result.max);
        System.out.println("Second Highest: " + result.secondMax);
    }

    // Reusable logic
    private static Result findMaxAndSecondMax(int[] arr) {

        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least 2 elements");
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int n : arr) {
            if (n > max) {
                secondMax = max;
                max = n;
            } else if (n > secondMax && n != max) {
                secondMax = n;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            throw new IllegalStateException("No distinct second maximum found");
        }

        return new Result(max, secondMax);
    }

    // Small data holder (cleaner than arrays)
    private static class Result {
        int max;
        int secondMax;

        Result(int max, int secondMax) {
            this.max = max;
            this.secondMax = secondMax;
        }
    }
}
