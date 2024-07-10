package task11package_login_system;

public class LoginSystem {
	

    
    // Dummy method to simulate retrieving the password for a user from a database
    private String getPasswordForUser(String username) {
        // For demonstration purposes, we assume the password is "password123" for any user
        return "password123";

}
	  // Dummy method to simulate user authentication
	public void authenticate(String username, String password) throws IncorrectPasswordException {
		 String correctPassword = getPasswordForUser(username); 
	        
	        if (!password.equals(correctPassword)) {
	            throw new IncorrectPasswordException("Incorrect password. Please try again.");
	        }
	        
	        // Proceed with the login process if the password is correct
	        System.out.println("Login successful!");
		
	}
}
