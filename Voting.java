// Custom Exception
class CustomEx extends Exception {
    public CustomEx(String message) {
        super(message);
    }
}

public class Voting {

    // Method to check voting eligibility
    public static void checkEligibility(int age) throws CustomEx {
        if (age < 18) {
            throw new CustomEx("You are not eligible to vote. Minimum age is 18.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }

    public static void main(String[] args) {

        int age = 16;

        try {
            checkEligibility(age);
        } 
        catch (CustomEx e) {
            System.out.println("Exception: " + e.getMessage());
        } 
        finally {
            System.out.println("Voting eligibility check completed.");
        }

        System.out.println("Program execution continues...");
    }
}
