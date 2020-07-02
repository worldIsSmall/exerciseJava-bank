package com.baofu.testBanking5_2;

import com.baofu.testBanking5_2.Account;
import com.baofu.testBanking5_2.Bank;
import com.baofu.testBanking5_2.CheckingAccount;
import com.baofu.testBanking5_2.SavingAccount;

import java.text.NumberFormat;

/**
 * Created by BF100427 on 2020/6/11.
 */
public class TestBanking {

    public static void main(String[] args) {
        Bank bank = new Bank(6);

        bank.addCustomer("Jane", "Smith");
        SavingAccount savingAccount = new SavingAccount(500, 0);
        CheckingAccount checkingAccount = new CheckingAccount(200, savingAccount);
        bank.getCustomers(0).setSavingAccount(savingAccount);
        bank.getCustomers(0).setCheckingAccount(checkingAccount);
        bank.addCustomer("Owen","Bryant");
        bank.getCustomers(1).setCheckingAccount(new CheckingAccount(200.00));
        System.out.println("Custmer ["+bank.getCustomers(0).getLastName()+","+bank.getCustomers(0).getFirstName()+"] : has a checking balance of "+bank.getCustomers(0).getCheckingAccount().getBalance()+" and a savings balance of "+bank.getCustomers(0).getSavingAccount().getBalance());
        System.out.println("Checking Acct [Jane Simms]: withdraw 150.00 suceeds?" + bank.getCustomers(0).getCheckingAccount().withdraw(150));
        System.out.println("Checking Acct [Jane Simms]: deposit 22.50 suceeds?" + bank.getCustomers(0).getCheckingAccount().deposit(22.5));
        System.out.println("Checking Acct [Jane Simms]: withdraw 147.62 suceeds?" + bank.getCustomers(0).getCheckingAccount().withdraw(147.62));
        System.out.println("Custmer ["+bank.getCustomers(0).getLastName()+","+bank.getCustomers(0).getFirstName()+"] : has a checking balance of "+bank.getCustomers(0).getCheckingAccount().getBalance()+" and a savings balance of "+bank.getCustomers(0).getSavingAccount().getBalance());

        System.out.println("Custmer ["+bank.getCustomers(1).getLastName()+","+bank.getCustomers(1).getFirstName()+"] : has a checking balance of "+bank.getCustomers(1).getCheckingAccount().getBalance());
        System.out.println("Checking Acct [Owen Bryant]: withdraw 100.00 suceeds?" + bank.getCustomers(1).getCheckingAccount().withdraw(100));
        System.out.println("Checking Acct [Owen Bryant]: deposit 25.00 suceeds?" + bank.getCustomers(1).getCheckingAccount().deposit(25));
        System.out.println("Checking Acct [Owen Bryant]: withdraw 175 suceeds?" + bank.getCustomers(1).getCheckingAccount().withdraw(175));
        System.out.println("Custmer ["+bank.getCustomers(1).getLastName()+","+bank.getCustomers(1).getFirstName()+"] : has a checking balance of "+bank.getCustomers(1).getCheckingAccount().getBalance());



    }
}
