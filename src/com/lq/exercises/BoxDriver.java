package com.lq.exercises;

public class BoxDriver {

    public static void main(String[] args) {

        Box box1 = new Box(7, 6, 5);
        Box box2 = new Box(10);

        System.out.println("Box1:");
        System.out.println(box1);
        System.out.println("Box2:");
        System.out.println(box2);

        box1.setHeight(5);
        box1.setLength(3);
        box1.setWidth(4);

        System.out.println("Updated Box1:");
        System.out.println(box1);

        box1.setLength(-5);
        System.out.println("Wrong length for box1:");
        System.out.println(box1);
    }

}
