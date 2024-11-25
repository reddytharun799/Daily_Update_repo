package Polymorphismbankingsystemexample;

public abstract class BankAccount implements AccountOperations{
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;

    }

    public String getAccountNumber() {
        return accountNumber;
    }


    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        if(amount>0){
            balance +=amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");


        }

    }

    public abstract void applyInterest();
}
