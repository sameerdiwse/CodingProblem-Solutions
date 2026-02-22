public class StringQuestion {

    public static void main(String[] args) {

        String input = "I Love Java";

        String reversed = reverseWords(input);

        System.out.println("Original String : " + input);
        System.out.println("Reversed String : " + reversed);
    }

    // Method to reverse words
    public static String reverseWords(String input) {

        if (input == null || input.trim().isEmpty()) {
            return input;
        }

        String[] words = input.trim().split("\\s+");

        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);

            if (i != 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
