package com.company;


public abstract class Shape {


    protected double shapeLength(MyPoint p1, MyPoint p2){
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    };

    abstract public double calcS();

    abstract public double calcL();

}
