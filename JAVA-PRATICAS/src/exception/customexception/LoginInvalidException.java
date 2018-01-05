package exception.customexception;

public class LoginInvalidException extends Exception {
    public LoginInvalidException(){
        super("User or password invalid");
    }
}
