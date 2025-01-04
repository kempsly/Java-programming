
public class RethrowingExceptionExample {
    public static void main(String[] args){
        //
        try {
            handleUserRegistration("Elise", "password12345");
            handleUserRegistration("Elie","");
        } catch (Exception e) {
            System.out.println("Exception caught in main : " + e.getMessage());
        }

    }
    public static void handleUserRegistration(String username, String password) throws Exception {
        try{
            validatePassword(password);
            System.out.println("User : " + username + " registered successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error in handleUserRegistration: " + e.getMessage());
            //Adding context before rethrowing
            throw new Exception("Registration failed for user: " + username, e);
        }
    }
    public static void validatePassword(String password){
        if(password == null || password.isEmpty()){
            throw new IllegalArgumentException("Password can not be empty");
        }
    }
}

