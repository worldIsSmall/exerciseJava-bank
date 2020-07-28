package com.baofu.testBanking7;

/**
 * Created by BF100427 on 2020/7/8.
 */
public class TestBanking7 {
    public static void main(String[] args) {
        Bank bank = Bank.getBank();

        bank.addCustomer("Jane", "Smith");
        Account s = new SavingAccount(500, 0.05);
        bank.getCustomers(0).addAccount(s);
        bank.getCustomers(0).addAccount(new CheckingAccount(200, 500));

        bank.addCustomer("Owen", "Bryant");
        Account ck = new CheckingAccount(200);
        bank.getCustomers(1).addAccount(ck);

        Customer customer =bank.getCustomers(0);
        Account account = customer.getAccount(1);
        System.out.println("Customer [ "+customer.getLastName()+","+customer.getFirstName()+"] has a checking balance of "+account.getBalance()+" with a 500.00 overdraft protection");
        try{
            System.out.println("Checking Acct [Jane Simms] : withdraw 150.00");
            account.withdraw(150);
            System.out.println("Checking Acct [Jane Simms] : deposit 22.50");
            account.deposit(22.5);
            System.out.println("Checking Acct [Jane Simms] : withdraw 147.62");
            account.withdraw(147.62);
            System.out.println("Checking Acct [Jane Simms] : withdraw 470.00");
            account.withdraw(470);
        }catch(OverdraftException e){
            System.out.println("Exception: "+ e.getMessage()+" Deficit: "+e.getDeficit());
        }finally {
            System.out.println("Customer [ "+customer.getLastName()+","+customer.getFirstName()+"] has a checking balance of "+account.getBalance());

        }
        System.out.println();
        Customer customer1 =bank.getCustomers(1);
        Account account1 = customer1.getAccount(0);
        System.out.println("Customer [ "+customer1.getLastName()+","+customer1.getFirstName()+"] has a checking balance of "+account1.getBalance());
        try{
            System.out.println("Checking Acct [Owen Bryant] : withdraw 100.00");
            account1.withdraw(100);
            System.out.println("Checking Acct [Owen Bryant] : deposit 25.00");
            account1.deposit(25);
            System.out.println("Checking Acct [Owen Bryant] : withdraw 175.00");
            account1.withdraw(175);
        }catch(OverdraftException e){
            System.out.println("Exception: "+ e.getMessage()+" Deficit: "+e.getDeficit());
        }finally {
            System.out.println("Customer [ "+customer1.getLastName()+","+customer1.getFirstName()+"] has a checking balance of "+account1.getBalance());

        }


    }
}
