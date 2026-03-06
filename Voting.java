import java.util.Scanner;

// Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Enum to represent eligibility status
enum VotingStatus {
    ELIGIBLE,
    NOT_ELIGIBLE
}

// Service class for voting logic
class VotingService {

    private static final int MIN_VOTING_AGE = 18;

    public static VotingStatus checkEligibility(int age) throws InvalidAgeException {

        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative.");
        }

        if (age < MIN_VOTING_AGE) {
            return VotingStatus.NOT_ELIGIBLE;
        }

        return VotingStatus.ELIGIBLE;
    }
}

public class Voting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            VotingStatus status = VotingService.checkEligibility(age);

            switch (status) {
                case ELIGIBLE:
                    System.out.println("You are eligible to vote.");
                    break;

                case NOT_ELIGIBLE:
                    System.out.println("You are not eligible to vote yet.");
                    break;
            }

        } catch (InvalidAgeException e) {
            System.out.println("Business Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            sc.close();
            System.out.println("Voting eligibility check completed.");
        }
    }
}
