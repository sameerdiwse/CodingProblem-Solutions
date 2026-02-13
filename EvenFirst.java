class EvenFirst {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        firstEvenAndOdd(arr);
    }

    public static void firstEvenAndOdd(int[] arr) {

        int[] result = new int[arr.length];
        int count = 0;

        // First store even numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[count] = arr[i];
                count++;
            }
        }

        // Then store odd numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[count] = arr[i];
                count++;
            }
        }

        // Print array properly
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
