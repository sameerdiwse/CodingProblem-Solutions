import java.util.stream.IntStream;

class Pointing {

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        int limit = (int) Math.sqrt(num);

        for (int i = 3; i <= limit; i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("Prime numbers from 0 to 100:\n");

        IntStream.rangeClosed(0, 100)
                .filter(Pointing::isPrime)
                .forEach(n -> System.out.print(n + " "));
    }
}
