package customException;

// Step 1: Define the custom checked exception by extending Exception
public class InvalidAgeException extends Exception {

    // Step 2: Define constructors (you can customize messages)
    public InvalidAgeException(String message) {
        super(message);  // Pass the message to the parent Exception class
    }

    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);  // Allows chaining of exceptions
    }
}
