import java.util.Arrays;

class EvenFirst {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] result = rearrangeEvenFirst(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] rearrangeEvenFirst(int[] input) {

        if (input == null || input.length == 0) {
            return new int[0];
        }

        int[] result = new int[input.length];
        int index = 0;

        // Add even numbers first
        for (int num : input) {
            if (num % 2 == 0) {
                result[index++] = num;
            }
        }

        // Add odd numbers next
        for (int num : input) {
            if (num % 2 != 0) {
                result[index++] = num;
            }
        }

        return result;
    }
}
