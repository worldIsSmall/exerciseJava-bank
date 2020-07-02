package com.baofu.testbanking;
import com.baofu.banking.*;
/**
 * Created by BF100427 on 2020/6/4.
 */
public class TestBanking {
    public static void main(String[] args){
        Account account =new Account(500.00);
        account.withdraw(150.00);
        account.deposit(22.5);
        account.withdraw(47.62);
        System.out.println("余额："+account.getBalance());
    }
}
