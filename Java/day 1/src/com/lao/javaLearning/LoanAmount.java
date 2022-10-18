package com.lao.javaLearning;

public class LoanAmount {
    Integer collectAmount = 633;
    public Integer collectMyamount(){
        System.out.println("Daddy have to collect " + collectAmount + "and sent it to you");
        return collectAmount;
    }
    public static void main(String [] args){
        LoanAmount mySon = new LoanAmount();
        Integer amount = mySon.collectMyamount();
        System.out.println("Got the amount son " + amount);
    }
}
