package com.baofu.testBanking5_2;

/**
 * Created by BF100427 on 2020/6/11.
 * 储蓄账户
 */
public class SavingAccount extends Account {
    private double interestRate;
    public SavingAccount(double balance,double interest_rate){
        super(balance);
        this.interestRate = interest_rate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
