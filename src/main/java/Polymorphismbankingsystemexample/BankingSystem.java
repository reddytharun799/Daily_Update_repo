package Polymorphismbankingsystemexample;

import java.util.ArrayList;
import java.util.List;

public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount>accounts=new ArrayList<>();

        accounts.add(new SavingsAccount("420",6000,2.5));
        accounts.add(new CheckingAccount("KDNO1",1000));

        for (BankAccount account: accounts){
            account.deposit(500);
        }
        for (BankAccount account:accounts){
            account.applyInterest();
        }
        for (BankAccount account:accounts){
            try {
                account.withdraw(10000);
            } catch (InsufficientFundsException e) {
                System.out.println(e.getMessage());
            }
            for (BankAccount account1: accounts) {
                System.out.println("Account: " + account.getAccountNumber() + ", Balance: " + account.getBalance());
            }
        }
    }
}
