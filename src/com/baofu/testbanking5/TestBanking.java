package com.baofu.testbanking5;
import com.baofu.banking.*;
/**
 * Created by BF100427 on 2020/6/11.
 */
public class TestBanking {
    public static void main(String[] args){
        Bank bank =new Bank(6);
        System.out.println("Creating the customer "+bank.getCustomers(0).getFirstName()+" "+bank.getCustomers(0).getLastName());
        bank.addCustomer("Jane","Smith");
         Account s = new SavingAccount(500,0.03);
        bank.getCustomers(0).setAccount(s);
        System.out.println("Creating her Saving Account with a "+bank.getCustomers(0).getAccount().getBalance()+" balance and "+((SavingAccount)s).getInterestRate()*100+"% interest");

        bank.addCustomer("Owen","Bryant");
        System.out.println("Creating the customer "+bank.getCustomers(1).getFirstName()+" "+bank.getCustomers(1).getLastName());
        Account ck =new CheckingAccount(500,0.00);
        bank.getCustomers(1).setAccount(ck);
        if (((CheckingAccount)ck).getOverdraftProtection() ==0){
            System.out.println("Creating his Checking Account with a "+bank.getCustomers(1).getAccount().getBalance()+" balance and no overdraft protection");
        }else {
            System.out.println("Creating his Checking Account with a "+bank.getCustomers(1).getAccount().getBalance()+" balance and "+((CheckingAccount)ck).getOverdraftProtection()+" in overdraft protection");
        }

        bank.addCustomer("Tim","Soley");
        System.out.println("Creating the customer "+bank.getCustomers(2).getFirstName()+" "+bank.getCustomers(2).getLastName());
        Account ck1 =new CheckingAccount(500,500.00);
        bank.getCustomers(2).setAccount(ck1);
        if (((CheckingAccount)ck1).getOverdraftProtection() ==0){
            System.out.println("Creating his Checking Account with a "+bank.getCustomers(2).getAccount().getBalance()+" balance and no overdraft protection");
        }else {
            System.out.println("Creating his Checking Account with a "+bank.getCustomers(2).getAccount().getBalance()+" balance and "+((CheckingAccount)ck1).getOverdraftProtection()+" in overdraft protection");
        }

        bank.addCustomer("Maria","Soley");
        System.out.println("Creating the customer "+bank.getCustomers(3).getFirstName()+" "+bank.getCustomers(3).getLastName());
        bank.getCustomers(3).setAccount(ck1);
        System.out.println("Maria shares her Checking Account with her husband Tim");
        System.out.println();
        for(int i = 0;i < 4;i++){
            if (i==0){
                System.out.println("Retrieving the customer "+bank.getCustomers(i).getFirstName()+" "+bank.getCustomers(i).getLastName() +" with her savings account:");
            }else if(i == 1){
                System.out.println("Retrieving the customer "+bank.getCustomers(i).getFirstName()+" "+bank.getCustomers(i).getLastName() +" with his checking account with no overdraft protection");
            }else if(i == 2) {
                System.out.println("Retrieving the customer "+bank.getCustomers(i).getFirstName()+" "+bank.getCustomers(i).getLastName() +" with his checking account that has overdraft protection");
            }else{
                System.out.println("Retrieving the customer "+bank.getCustomers(i).getFirstName()+" "+bank.getCustomers(i).getLastName() +" with her joint checking account with husband Tim");
            }
            if(i==3){
                System.out.println("Deposit 150.00:"+bank.getCustomers(i).getAccount().deposit(150.00));
                System.out.println("Withdraw 750.00:"+bank.getCustomers(i).getAccount().withdraw(750.00));
            }else{
                System.out.println("Withdraw 150.00:"+bank.getCustomers(i).getAccount().withdraw(150.00));
                System.out.println("Deposit 22.50:"+bank.getCustomers(i).getAccount().deposit(22.5));
                System.out.println("Withdraw 47.62:"+bank.getCustomers(i).getAccount().withdraw(47.62));
                System.out.println("Withdraw 400.00:"+bank.getCustomers(i).getAccount().withdraw(400));
            }

            System.out.println("Customer ["+bank.getCustomers(i).getLastName()+","+bank.getCustomers(i).getFirstName()+"] has a balance of "+bank.getCustomers(i).getAccount().getBalance());
            System.out.println();
        }






















    }
}
