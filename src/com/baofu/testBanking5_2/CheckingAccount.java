package com.baofu.testBanking5_2;


/**
 * Created by BF100427 on 2020/6/11.
 * 信用卡账户
 */
public class CheckingAccount extends Account {
    private SavingAccount protectedBy=null;
    public CheckingAccount(double balance){
        super(balance);
    }
    public CheckingAccount(double balance,SavingAccount protect){
        super(balance);
        this.protectedBy = protect;
    }

    public SavingAccount getProtectedBy() {
        return protectedBy;
    }

    public void setProtectedBy(SavingAccount protectedBy) {
        this.protectedBy = protectedBy;
    }

    public boolean withdraw(double amount){
          if(balance>= amount){
              this.balance-=amount;
              return true;
          }
        if (protectedBy ==null){
            return false;
        }
        if (protectedBy.getBalance() >= (amount-balance) ){
            boolean result =protectedBy.withdraw(amount-balance);
            this.balance = 0;
            return result;
        }else {
            return false;
        }

    }

}
