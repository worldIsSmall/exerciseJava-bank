package com.baofu.testbanking2;

import com.baofu.banking.Account;
import com.baofu.banking.Customer;

/**
 * Created by BF100427 on 2020/6/4.
 */
public class TestBanking {
    public static void main(String[] args){
        Customer customer= new Customer("Jane","Smith");
        customer.setAccount(new Account(500.00));
        customer.getAccount().withdraw(150.00);
        customer.getAccount().deposit(22.50);
        customer.getAccount().withdraw(47.62);
        System.out.println(customer.getFirstName()+customer.getLastName()+"的余额:"+customer.getAccount().getBalance());

    }
}
