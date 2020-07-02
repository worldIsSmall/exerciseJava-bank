package com.baofu.testbanking5_1;

import com.baofu.banking.*;

import java.text.NumberFormat;

/**
 * Created by BF100427 on 2020/6/11.
 */
public class TestBanking {

    public static void main(String[] args) {
        NumberFormat currency_format = NumberFormat.getCurrencyInstance();
        Bank bank = new Bank(6);

        bank.addCustomer("Jane", "Smith");
        Account s = new SavingAccount(500, 0.03);
        bank.getCustomers(0).addAccount(s);
        bank.getCustomers(0).addAccount(new CheckingAccount(200, 400));

        bank.addCustomer("Owen", "Bryant");
        Account ck = new CheckingAccount(200, 0.00);
        bank.getCustomers(1).addAccount(ck);


        bank.addCustomer("Tim", "Soley");
        bank.getCustomers(2).addAccount(new SavingAccount(1500, 0.05));
        bank.getCustomers(2).addAccount(new CheckingAccount(200));

        bank.addCustomer("Maria", "Soley");
        bank.getCustomers(3).addAccount(new SavingAccount(150, 0.05));
        bank.getCustomers(3).addAccount(bank.getCustomers(2).getAccount(1));

        System.out.println("\t\t\tCUSTOMERS REPORT");
        System.out.println();

        for (int i = 0; i < bank.getNumberOfCustormer(); i++) {
            System.out.println("Customer:" + bank.getCustomers(i).getFirstName() + "," + bank.getCustomers(i).getLastName());
            for (int j = 0; j < bank.getCustomers(i).getNumOfAccounts(); j++) {
                if (bank.getCustomers(i).getAccount(j) instanceof SavingAccount) {
                    System.out.println("SavingAccount has balance" + currency_format.format(bank.getCustomers(i).getAccount(j).getBalance()));
                } else if (bank.getCustomers(i).getAccount(j) instanceof CheckingAccount) {
                    System.out.println("CheckingAccount has balance:" + bank.getCustomers(i).getAccount(j).getBalance());
                    System.out.println("CheckingAccount has overdraftProtection:" + ((CheckingAccount)( bank.getCustomers(i).getAccount(j))).getOverdraftProtection());
                }else {
                    System.out.println("帐号类型不存在");
                }
            }
            System.out.println();
        }


    }
}
