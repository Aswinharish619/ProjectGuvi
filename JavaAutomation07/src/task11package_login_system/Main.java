package task11package_login_system;



public class Main extends LoginSystem{
	
	public String IncorrectPasswordException(String message) {
        return(message);}

	public static void main(String[] args) {
	
		LoginSystem loginSystem = new LoginSystem();
	        String username = "user1";
	        String password = "wrongPassword"; // This should be obtained from user input

	        try {
	            loginSystem.authenticate(username, password);
	        } catch (IncorrectPasswordException e) {
	            // Display the error message
	            System.out.println(e.getMessage());
	        }
	    }
	
	

	}


