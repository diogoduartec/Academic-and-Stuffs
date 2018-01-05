package exception.checkedexception.test;

import exception.customexception.LoginInvalidException;

public class CustomExceptionTest {
    public static void main(String[] args) {
        try {
            login();
        } catch (LoginInvalidException e) {
            e.printStackTrace();
        }
    }

    private static void login()throws LoginInvalidException {
        String userBD = "Goku";
        String passBD = "123";
        String userGot = "Vegeta";
        String passGot = "buma";
        if(!userBD.equals(userGot) || !passBD.equals(userGot))
            throw new LoginInvalidException();
        else System.out.println("done");
    }

}
