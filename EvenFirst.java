import java.util.Arrays;

class EvenFirst {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Original Array:");
        print(arr);

        rearrange(arr);

        System.out.println("\nRearranged Array (Even first, Odd last):");
        print(arr);
    }

    public static void rearrange(int[] arr) {

        int[] result = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;

        for (int num : arr) {

            if (num % 2 == 0) {
                result[left++] = num;
            } else {
                result[right--] = num;
            }
        }

        // copy result back to original array
        System.arraycopy(result, 0, arr, 0, arr.length);
    }

    public static void print(int[] arr) {
        Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
    }
}
