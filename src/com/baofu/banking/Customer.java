package com.baofu.banking;

/**
 * Created by BF100427 on 2020/6/4.
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;
    private Account[] accounts;
    private int numOfAccounts;


    public Customer(String f ,String l){
        numOfAccounts = 0;
        accounts=new Account[5];
        firstName = f;
        lastName = l;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void addAccount(Account account){
        this.accounts[numOfAccounts] = account;
        numOfAccounts++;
    }
    public Account getAccount(int i){
        return accounts[i];
    }
    public int getNumOfAccounts(){
        return numOfAccounts;
    }




}
