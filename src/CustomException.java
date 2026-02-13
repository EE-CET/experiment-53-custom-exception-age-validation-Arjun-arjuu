import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            int age = scanner.nextInt();
            
            if (age < 18) {
                throw new InvalidAgeException("Not eligible to vote");
            } else {
                System.out.println("Eligible to vote");
            }
            
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

