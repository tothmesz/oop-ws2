package com.codecool.oopws2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,4);
        rectangle.printRectangle();

        RoundedRectangle roundedRectangle = new RoundedRectangle(4, 5);
        roundedRectangle.printRectangle();
    }
}
