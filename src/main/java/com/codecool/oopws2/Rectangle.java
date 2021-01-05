package com.codecool.oopws2;

public class Rectangle {
    private int height;
    private int width;
    private int size;


    public Rectangle(int width, int height){
        this.height = height;
        this.width = width;
    }

    public Rectangle(int size){
        this.size = size;
    }


    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public double calculateArea(){
        return getWidth() * getHeight();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    public void printRectangle(){
        System.out.println(toString());
    }
}
