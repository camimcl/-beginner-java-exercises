public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder) {
        super(accountNumber, accountHolder);
        this.interestRate=0.05;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate){
        if (interestRate<0){
            interestRate=0;
        }
        this.interestRate = interestRate;
    }
}
