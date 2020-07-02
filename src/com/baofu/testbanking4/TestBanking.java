package com.baofu.testbanking4;
import com.baofu.banking.*;
/**
 * Created by BF100427 on 2020/6/6.
 */
public class TestBanking {
    public static void main(String[] args){
        Bank bank = new Bank(6);
        bank.addCustomer("Jane","Smith");
        bank.addCustomer("Owen","Bryant");
        bank.addCustomer("Tim","Soley");
        bank.addCustomer("Maria","Soley");
        //自己扩展，添加余额
       /* for(int j = 0;j < 4;j++){
            Account account = new Account(500+j);
            bank.getCustomers(j).setAccount(account);
        }
        for(int i=0;i < 4;i++){
            System.out.println("Customet [ "+(i+1)+" ] is "+bank.getCustomers(i).getLastName()+","+bank.getCustomers(i).getFirstName()+"的资产余额："+bank.getCustomers(i).getAccount().getBalance());
        }*/
        for(int i=0;i < 4;i++){
            System.out.println("Customet [ "+(i+1)+" ] is "+bank.getCustomers(i).getLastName()+","+bank.getCustomers(i).getFirstName());
        }




    }

}
