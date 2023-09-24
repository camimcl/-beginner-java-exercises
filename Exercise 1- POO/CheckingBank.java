import java.util.Scanner;
public class CheckingBank extends Bank {
    @Override
    public void createAccount(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Name:");
        String name = scan.nextLine();
        CheckingAccount checkingAccount =
                new CheckingAccount("237df",name,2000);
    }

}