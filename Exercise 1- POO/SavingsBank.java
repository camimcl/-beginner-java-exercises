import java.util.Scanner;

public class SavingsBank extends Bank{
    Scanner scan = new Scanner(System.in);
    @Override
    public void createAccount(){
        System.out.println("Name:");
        String name = scan.nextLine();
        SavingsAccount savingsAccount = new SavingsAccount("a4234",name);
    }

}

