package controladores;

public class LoginController {

    public static String validarLogin(String user, String pass){

        if(user.equals("admin") && pass.equals("1234"))
            return "ADMIN";

        if(user.equals("cliente") && pass.equals("5678"))
            return "CLIENTE";

        return "ERROR";
    }
}
