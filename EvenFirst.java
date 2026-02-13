class EvenFirst {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        rearrange(arr);
    }

    public static void rearrange(int[] arr) {

        int[] result = new int[arr.length];
        int start = 0;                  // for even numbers
        int end = arr.length - 1;       // for odd numbers

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                result[start] = arr[i];
                start++;
            } else {
                result[end] = arr[i];
                end--;
            }
        }

        // Print result
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
