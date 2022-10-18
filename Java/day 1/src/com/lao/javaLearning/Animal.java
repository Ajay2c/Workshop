//Parameterized Constructor

package com.lao.javaLearning;


public class Animal {

    String animal_name;
    String animal_type;

    Animal(String name, String type){
        animal_name = name;
        animal_type = type;
    }
    public void sayAnimalname(){
        System.out.println("The animal name is " + animal_name + " the type is " + animal_type);

}
    public static void main(String [] args){
        Animal animal1 = new Animal("Duck", "Ominivores");
        animal1.sayAnimalname();
        Animal animal2 = new Animal("Lion","Ominivores");
        animal2.sayAnimalname();
    }

}
