import java.util.stream.IntStream;

class Pointing
{
    // Optimized prime check
    public static boolean isPrime(int num)
    {
        if (num < 2)
            return false;

        // check only till sqrt(num) for efficiency
        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println("Prime numbers from 0 to 100:\n");

        // Using Stream API (modern approach)
        IntStream.rangeClosed(0, 100)
                 .filter(Pointing::isPrime)
                 .forEach(n -> System.out.println(n + " is a prime number."));
    }
}
