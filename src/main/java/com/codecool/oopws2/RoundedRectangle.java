package com.codecool.oopws2;


public class RoundedRectangle extends Rectangle {
    private int roundRadius = 2;

    public RoundedRectangle(int width, int height) {
        super(width, height);
    }

    public int getRoundRadius() {
        return roundRadius;
    }

    @Override
    public double calculateArea() {
        return (getWidth() * getHeight()) - (4 * (getRoundRadius() * getRoundRadius())) + (getRoundRadius() * getRoundRadius() * Math.PI);
    }

    @Override
    public String toString() {
        return "RoundedRectangle{" +
                "roundRadius=" + roundRadius + ", width=" + getWidth() + ", height=" + getHeight() +
                '}';
    }
}
