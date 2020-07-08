package com.baofu.testBanking6;

import com.baofu.bankingReport.CustomerReport;

/**
 * Created by BF100427 on 2020/7/8.
 */
public class TestBanking6 {
    public static void main(String[] args) {
        Bank bank =Bank.getBank();

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

        CustomerReport customerReport= new CustomerReport();
        customerReport.getcustomerReport();
    }
}
