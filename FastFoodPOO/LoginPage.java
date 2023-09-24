import java.util.HashMap;

public class LoginPage {

    private HashMap <String, String> Login = new HashMap<>();
    private HashMap<String, Double> Products = new HashMap<>();
    private AdmPage admPage = new AdmPage(Products);
    private AttenderPage attenderPage = new AttenderPage(Products);

    public LoginPage(){
        Login.put("admin","admin123");
        Login.put("attend","attender123");
        Products.put("Pizza", 30.00);
        Products.put("Hot Dog", 7.00);
        Products.put("Burguer", 12.00);
        Products.put("Fries", 8.00);
    }
    public void Login(String Username, String Password){
        String userPassword = Login.get(Username); //retorna password do hashmap.

        if (userPassword == null) {
            System.out.println("Sorry, this account doesn't exist");
        }
        else if (userPassword.equals(Password)) {
            if (Username.equals("admin")) {
                admPage.changePrices();
            }
            else{
                attenderPage.AttenderMenu();
            }
        }
        else {
            System.out.println("Incorrect password.");
        }

    }
}
