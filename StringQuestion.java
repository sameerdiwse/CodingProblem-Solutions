public class StringQuestion {
    public static void main(String[] args) {

        // Reverse words in given string
        String string = "I Love Java";
        String[] words = string.split(" ");

        StringBuilder revString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            revString.append(words[i]);
            if (i != 0) {
                revString.append(" ");
            }
        }

        System.out.println("Reversed string: " + revString.toString());
    }
}
