package com.company;
import java.util.Scanner;

public class MyTriangle extends Shape {

    private MyPoint point1;
    private MyPoint point2;
    private MyPoint point3;

    public MyTriangle(Scanner scanner) throws MyException {

        point1 = new MyPoint(scanner);
        point2 = new MyPoint(scanner);
        point3 = new MyPoint(scanner);

        if (!isTriangle()){
            throw new MyException("Не треугольник!");
        }
    }

    private boolean isTriangle(){
        if ((point1.getX() - point2.getX())/(point1.getY() - point2.getY()) ==
                (point1.getX() - point3.getX())/(point1.getY() - point3.getY())){
            return false;
        }
        return true;
    }

    public double calcS(){
        double p = this.calcL() / 2;
        return Math.sqrt(p * (p - shapeLength(point1, point2)) * (p - shapeLength(point2, point3)) * (p - shapeLength(point3, point1)));
    };

    public double calcL(){

        return shapeLength(point1, point2) + shapeLength(point2, point3) + shapeLength(point3, point1);

    };
}
