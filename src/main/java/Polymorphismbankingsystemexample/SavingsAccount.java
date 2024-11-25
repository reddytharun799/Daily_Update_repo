package Polymorphismbankingsystemexample;

public class SavingsAccount extends BankAccount{


    private double interestRate;

    public SavingsAccount(String accountNumber, double balance,double interestRate) {
        super(accountNumber, balance);
        this.interestRate=interestRate;
    }


    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void applyInterest() {

        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest applied: " + interest);
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount>balance){
            throw new InsufficientFundsException("insufficient fund for withdraw");
        }else {
            balance -=amount;
            System.out.println("transfer successfully");
        }

    }
}
