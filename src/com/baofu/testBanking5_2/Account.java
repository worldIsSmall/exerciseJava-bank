package com.baofu.testBanking5_2;

/**
 * Created by BF100427 on 2020/6/4.
 */

public class Account {
    protected double balance;

    public Account(double init_balance) {
        balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double i) {
        if(i>0){
            balance += i;
            return true;
        }else {
            return false;
        }
    }

    public boolean withdraw(double j) {
        if (balance >= j) {
            balance -= j;
            return true;
        } else {
            return false;
        }
    }

}


