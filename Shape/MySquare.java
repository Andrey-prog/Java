package com.company;
import java.util.Scanner;

public class MySquare extends Shape {

    private MyPoint point1;
    private MyPoint point2;
    private MyPoint point3;
    private MyPoint point4;


    public MySquare(Scanner scanner) throws MyException {
        point1 = new MyPoint(scanner);
        point2 = new MyPoint(scanner);
        point3 = new MyPoint(scanner);
        point4 = new MyPoint(scanner);

        if (!isQuad()) {
            throw new MyException("Не прямоугольник");
        }
    }

    private boolean isQuad() {

        if ((point1.getX() - point2.getX()) / (point1.getY() - point2.getY()) ==
                (point1.getX() - point3.getX()) / (point1.getY() - point3.getY())) {
            return false;
        }
        if ((point1.getX() - point2.getX()) / (point1.getY() - point2.getY()) ==
                (point1.getX() - point4.getX()) / (point1.getY() - point4.getY())) {
            return false;
        }
        if ((point1.getX() - point3.getX()) / (point1.getY() - point3.getY()) ==
                (point1.getX() - point4.getX()) / (point1.getY() - point4.getY())) {
            return false;
        }
        if ((point3.getX() - point2.getX()) / (point3.getY() - point2.getY()) ==
                (point3.getX() - point4.getX()) / (point3.getY() - point4.getY())) {
            return false;
        }

        return true;
    }

    @Override
    public double calcS() {

        if (shapeLength(point1, point2) > shapeLength(point1, point3)){
            return Math.pow(shapeLength(point1, point3), 2);
        }
        return Math.pow(shapeLength(point1, point2), 2);

    }

    @Override
    public  double calcL() {

        double k = 0;
        if (shapeLength(point1, point3) > shapeLength(point1, point2)){
            k = shapeLength(point1, point2);
        }else{
            k = shapeLength(point1, point3);
        }
        return 4*k;

    }
}
