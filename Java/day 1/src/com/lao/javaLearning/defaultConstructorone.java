package com.lao.javaLearning;

public class defaultConstructorone {

    // defaultConstructor{
    //                   default con
    // }

    String student_name;
    Integer rollNo;
    int age;
    public static void main(String [] args){
        defaultConstructorone student = new defaultConstructorone();
        System.out.println(student.rollNo);
        System.out.println(student.student_name);
        System.out.println(student.age);
    }
}
