package Polymorphismbankingsystemexample;

public class CheckingAccount extends BankAccount {


    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void applyInterest() {
        System.out.println("No interest for checking accounts.");

    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal.");
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        }

    }
}
