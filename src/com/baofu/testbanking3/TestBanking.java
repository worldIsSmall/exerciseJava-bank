package com.baofu.testbanking3;
import com.baofu.banking.*;
/**
 * Created by BF100427 on 2020/6/4.
 */
public class TestBanking {
    public static void main(String[] args){
        Customer customer =  new Customer("Jane","Smith");
        System.out.println("Creating the customer "+customer.getFirstName()+" "+customer.getLastName());
        Account account = new Account(500.00);
        customer.setAccount(account);
        System.out.println("Creating her account with a "+customer.getAccount().getBalance()+" balance");
        System.out.println("Withdraw 150.00："+customer.getAccount().withdraw(150.00));
        System.out.println("Deposit 22.50："+customer.getAccount().deposit(22.50));
        System.out.println("Withdraw 47.62："+customer.getAccount().withdraw(47.62));
        System.out.println("Withdraw 400.00："+customer.getAccount().withdraw(400.00));
        System.out.println("Customer ["+customer.getLastName()+","+customer.getFirstName()+"] has a balance of "+customer.getAccount().getBalance());



    }
}
