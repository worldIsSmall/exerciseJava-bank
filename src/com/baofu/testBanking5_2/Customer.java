package com.baofu.testBanking5_2;


/**
 * Created by BF100427 on 2020/6/4.
 */
public class Customer {
    private String firstName;
    private String lastName;
    private SavingAccount savingAccount;
    private CheckingAccount checkingAccount;


    public Customer(String f ,String l){
        firstName = f;
        lastName = l;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }


    public SavingAccount getSavingAccount() {
        return savingAccount;
    }

    public CheckingAccount getCheckingAccount() {
        return checkingAccount;
    }

    public void setSavingAccount(SavingAccount savingAccount) {
        this.savingAccount = savingAccount;
    }

    public void setCheckingAccount(CheckingAccount checkingAccount) {
        this.checkingAccount = checkingAccount;
    }
}
