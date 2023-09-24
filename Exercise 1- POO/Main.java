public class Main {
    public static void main(String[] args) {

        Bank bank = new SavingsBank();
        bank.createAccount();
        Bank bank2 = new CheckingBank();
        bank2.createAccount();
    }
}