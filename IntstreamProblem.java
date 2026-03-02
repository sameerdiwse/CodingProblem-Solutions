import java.util.Set;

public class IntStreamProblem {

    private static final Set<Character> VOWELS = Set.of('a','e','i','o','u');

    public static void main(String[] args) {

        String str = "SomeString";

        long count = str == null ? 0 :
                str.chars()
                   .map(Character::toLowerCase)
                   .filter(c -> VOWELS.contains((char) c))
                   .count();

        System.out.println("Vowel count: " + count);
    }
}
