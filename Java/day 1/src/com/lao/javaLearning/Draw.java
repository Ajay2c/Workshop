package com.lao.javaLearning;

public class Draw {
    String draw_object;

    Draw(){
        System.out.println("The Object is Empty");
    }

    Draw(String toDraw){
        draw_object = toDraw;
        System.out.println("The Draw object is" + toDraw);
    }
    public static void main(String [] args){
        Draw object1 = new Draw();
        Draw object2 = new Draw("Circle");
    }

}
