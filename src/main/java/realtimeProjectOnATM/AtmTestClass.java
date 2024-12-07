package realtimeProjectOnATM;

import java.util.Scanner;

public class AtmTestClass {
    public static int status;
    public static void main(String[] args) {
        AtmImple atmImple=new AtmImple();
        Scanner scanner=new Scanner(System.in);
        int atmnumber=123456;
        int atmpin=1234;
        System.out.println("Enter valid ATM Number");
        int atmnum2=scanner.nextInt();
        System.out.println("Enter valid ATM Pin num");
        int pin=scanner.nextInt();
        if(atmnumber==atmnum2 && atmpin==pin){
            while (true) {
                System.out.println("1.viewBalance/n,2.withdrawAmount/n,3.depositAmount,4.viewMiniStatement,5.exit");
                System.out.println("enter your choice");
                int ch = scanner.nextInt();
                if (ch == 1) {
                    atmImple.viewBalance();
                } else if (ch == 2) {
                    System.out.println("Enter the amount to withdraw");
                    double withdraw = scanner.nextDouble();
                    atmImple.withdrawAmount(withdraw);

                } else if (ch == 3) {
                    System.out.println("Enter the amount to deposit ");
                    double deposit = scanner.nextDouble();
                    atmImple.depositAmount(deposit);

                } else if (ch == 4) {
                    System.out.println("click on viewMinuStatement");
                    atmImple.veiwMiniStatement();

                } else if (ch == 5) {
                    System.out.println("take your ATM & thank you");
                    scanner.close();
                    System.exit(status);
                }
            }

        }else {
            System.out.println("Invalid ATM num & PIN");
        }
    }
}
