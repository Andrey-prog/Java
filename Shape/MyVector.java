package com.company;
import java.util.Scanner;
import java.lang.Math;

public class MyVector extends Shape{

    private MyPoint point1;
    private MyPoint point2;

    public MyVector(Scanner scanner){

        point1 = new MyPoint(scanner);
        point2 = new MyPoint(scanner);

    }

    public double calcS(){
        return 0;

    }

    public double calcL(){
        return shapeLength(point1, point2);

    }

}
