public class Account {
    final private String accountNumber;
    final private String accountHolder;
    private double balance;

    public Account (String accountNumber, String accountHolder){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance){
         if (balance < 0 ){
             balance = 0;
         }
         this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
}
