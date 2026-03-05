import java.util.stream.IntStream;

class Pointing {

    private static final int LIMIT = 100;

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        int sqrt = (int) Math.sqrt(num);

        for (int i = 3; i <= sqrt; i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("Prime numbers from 0 to " + LIMIT + ":\n");

        long count =
                IntStream.rangeClosed(0, LIMIT)
                         .filter(Pointing::isPrime)
                         .peek(n -> System.out.print(n + " "))
                         .count();

        System.out.println("\n\nTotal Prime Numbers: " + count);
    }
}
