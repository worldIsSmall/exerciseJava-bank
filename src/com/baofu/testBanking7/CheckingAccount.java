package com.baofu.testBanking7;

/**
 * Created by BF100427 on 2020/6/11.
 * 信用卡账户
 */
public class CheckingAccount extends Account {
    private Double overdraftProtection;
    public CheckingAccount(double balance){
        super(balance);
    }
    public CheckingAccount(double balance,double protect){
        super(balance);
        this.overdraftProtection = protect;
    }

    public double getOverdraftProtection() {
        return overdraftProtection;
    }

    public void setOverdraftProtection(double overdraftProtection) {
        this.overdraftProtection = overdraftProtection;
    }

    public void withdraw(double amount) throws OverdraftException{
        if(balance >= amount){
            balance-=amount;
        }else {
            if (overdraftProtection == null){
                throw new OverdraftException("no overdraft protection",amount - balance);
            }else if(balance+overdraftProtection >= amount){
                overdraftProtection = balance+overdraftProtection-amount;
                balance =0;
            }else{
                throw new OverdraftException("Insufficient funds for overdraft protection",amount -balance-overdraftProtection);
            }
        }


    }

}
