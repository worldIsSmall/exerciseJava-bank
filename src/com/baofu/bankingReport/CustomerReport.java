package com.baofu.bankingReport;
import com.baofu.testBanking6.*;
import java.text.NumberFormat;
/**
 * Created by BF100427 on 2020/7/8.
 */
public class CustomerReport {
    public CustomerReport(){

    }
    public  void getcustomerReport(){
        Bank bank=Bank.getBank();
        NumberFormat currency_format = NumberFormat.getCurrencyInstance();
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
