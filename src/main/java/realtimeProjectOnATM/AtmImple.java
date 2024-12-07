package realtimeProjectOnATM;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AtmImple implements ATMInterface {
    AtmData atm =new AtmData();
    Map<Double,String> ministatement =new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("AvailableBalance"+atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawBalance) {
        if(withdrawBalance%500==0){
            if(withdrawBalance<=atm.getBalance()){
                System.out.println("collect the cash"+withdrawBalance);
                atm.setBalance(atm.getBalance()-withdrawBalance);
                ministatement.put(withdrawBalance,"Amount withdraw");
                viewBalance();

            }else {
                System.out.println("insufficent balance");
            }

        }else {
            System.out.println("enter max Amount for 500");
        }

    }

    @Override
    public void depositAmount(double depositBalance) {
        System.out.println("depositeAmount"+depositBalance);
        atm.setBalance(atm.getDepositAmount()+depositBalance);
        ministatement.put(depositBalance,"depositAmount successfully");
        viewBalance();


    }

    @Override
    public void veiwMiniStatement() {
        Set<Double> set=ministatement.keySet();
        for (Double d:set){
            System.out.println(d+"="+ministatement.get(d));
        }


    }
}
