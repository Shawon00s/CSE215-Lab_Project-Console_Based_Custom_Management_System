package exception;
import package1.CustomManagement;

public class InvalidPasswordException extends Exception{
	String password;
	
	InvalidPasswordException(String password){
		this.password=password;
	}
	public String toString() {
		return "Invalid Password"+password;
	}
}
