package com.baofu.testBanking5_2;

/**
 * Created by BF100427 on 2020/6/5.
 */
public class Bank {
    private Customer[] customers;//用于存放客户
    private int numberOfCustormer;//记录客户的个数

    public Bank(int i){
      if(i >= 5){
          customers = new Customer[i];
      }else{
          System.out.println("该银行客户量不足");
      }
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
