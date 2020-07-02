package com.baofu.banking;

/**
 * Created by BF100427 on 2020/6/11.
 * 信用卡账户
 */
public class CheckingAccount extends Account {
    private double overdraftProtection;
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

    public boolean withdraw(double amount){
        if(balance >= amount){
            balance-=amount;
            return true;
        }else if(balance+overdraftProtection >= amount){
            overdraftProtection = balance+overdraftProtection-amount;
            balance =0;
            return true;
        }else{
            return false;
        }

    }

}
