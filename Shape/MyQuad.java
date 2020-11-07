package com.company;

import java.util.Scanner;

public class MyQuad extends Shape{

    private MyPoint point1;
    private MyPoint point2;
    private MyPoint point3;
    private MyPoint point4;

    public MyQuad(Scanner scanner) throws MyException {
        point1 = new MyPoint(scanner);
        point2 = new MyPoint(scanner);
        point3 = new MyPoint(scanner);
        point4 = new MyPoint(scanner);

        if (!isQuad()){
            throw new MyException("Не прямоугольник!");
        }
    }

    private boolean isQuad(){

        if ((point1.getX() - point2.getX())/(point1.getY() - point2.getY()) ==
                (point1.getX() - point3.getX())/(point1.getY() - point3.getY())){
            return false;
        }
        if ((point1.getX() - point2.getX())/(point1.getY() - point2.getY()) ==
                (point1.getX() - point4.getX())/(point1.getY() - point4.getY())){
            return false;
        }
        if ((point1.getX() - point3.getX())/(point1.getY() - point3.getY()) ==
                (point1.getX() - point4.getX())/(point1.getY() - point4.getY())){
            return false;
        }
        if ((point3.getX() - point2.getX())/(point3.getY() - point2.getY()) ==
                (point3.getX() - point4.getX())/(point3.getY() - point4.getY())){
            return false;
        }

        return true;
    }

    private double f(MyPoint p1, MyPoint p2, MyPoint p) {
        return (p2.getX() - p1.getX()) * p.getY() - (p2.getY() - p1.getY()) * p.getX() +
                p1.getX() * p2.getY() - p1.getY() * p2.getX();
    }

    @Override
    public double calcS() {

        System.out.println(shapeLength(point1, point3));

        double p = (shapeLength(point1, point2) + shapeLength(point2, point3) + shapeLength(point3, point1))/2;
        double pS = Math.sqrt(p * (p - shapeLength(point1, point2)) * (p - shapeLength(point2, point3)) * (p - shapeLength(point3, point1)));

        if (f(point1, point2, point3) < 0 && f(point1, point2, point4) > 0){
            double q = (shapeLength(point1, point2) + shapeLength(point2, point4) + shapeLength(point4, point1))/2;
            double qS = Math.sqrt(q * (q - shapeLength(point1, point2)) * (q - shapeLength(point2, point4)) * (q - shapeLength(point4, point1)));
            return qS+pS;

        }else{
            double q = (shapeLength(point1, point3) + shapeLength(point3, point4) + shapeLength(point4, point1))/2;
            double qS = Math.sqrt(q * (q - shapeLength(point1, point3)) * (q - shapeLength(point3, point4)) * (q - shapeLength(point4, point1)));
            return qS+pS;

        }
    }

    @Override
    public double calcL() {

        if (f(point1, point2, point3) < 0 && f(point1, point2, point4) > 0){

            return shapeLength(point1, point3) + shapeLength(point3, point2) +
                    shapeLength(point2, point4) + shapeLength(point4, point1);
        }else{

            return shapeLength(point1, point2) + shapeLength(point2, point3) +
                    shapeLength(point3, point4) + shapeLength(point4, point1);

        }


    }
}
