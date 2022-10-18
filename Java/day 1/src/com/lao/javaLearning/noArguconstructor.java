package com.lao.javaLearning;

public class noArguconstructor {
    int employeeid;
    String employeeName;
    noArguconstructor(){
        employeeid = 1;
        employeeName = "Ajay";
        System.out.println("Employee Id Created");

    }
    public static void main(String [] args){
        noArguconstructor employee = new noArguconstructor();

    }

}
