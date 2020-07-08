package com.baofu.testBanking6;

/**
 * Created by BF100427 on 2020/6/5.
 */
public class Bank {
    private Customer[] customers;//用于存放客户
    private int numberOfCustormer;//记录客户的个数

   private Bank(){
      customers =new Customer[5];
    }

    private static Bank bank =new Bank();

    public  static Bank getBank(){
        return bank;
    }

    public int getNumberOfCustormer(){
        return numberOfCustormer;
    }
    public Customer getCustomers(int i){
        return customers[i];
    }

    public void addCustomer(String f,String l){
        if (numberOfCustormer < customers.length){
            Customer customer=new Customer(f,l);
            customers[numberOfCustormer]=customer;
            numberOfCustormer++;
        }else {
            System.out.println("存蓄客户已银行最大存量");
        }

    }



}
