package customException;

// Step 1: Define the custom unchecked exception by extending RuntimeException
public class InvalidPasswordException extends RuntimeException {

    // Step 2: Define constructors
    public InvalidPasswordException(String message) {
        super(message);  // Pass the message to the parent RuntimeException class
    }

    public InvalidPasswordException(String message, Throwable cause) {
        super(message, cause);  // Allows exception chaining
    }
}
