package com.lao.javaLearning;

public class BankAccount {

    String accountName = "Ajay";
    Integer accountBalance = 500;

    public void getBalance(){
        System.out.println("Your Bank Balance is " + accountBalance);

    }
    public static void main(String [] args){
        BankAccount account = new BankAccount();
        account.getBalance();
    }

}






