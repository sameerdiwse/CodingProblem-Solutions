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

    // In-place rearrangement
    public static void rearrange(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (arr[left] % 2 == 0) {
                left++; // already even, correct place
            } 
            else if (arr[right] % 2 != 0) {
                right--; // already odd, correct place
            } 
            else {
                // swap odd (left) with even (right)
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    }

    public static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
