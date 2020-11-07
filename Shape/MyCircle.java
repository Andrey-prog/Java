package com.company;
import java.util.Scanner;

public class MyCircle extends Shape {

    private MyPoint center;
    private double radius;

    public MyCircle(Scanner scanner) throws MyException {

        center = new MyPoint(scanner);
        double p = scanner.nextDouble();
        if (p <= 0){
            throw new MyException("Радиус меньше нуля!");
        }else{
            radius = p;
        }
    }

    @Override
    public double calcS() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calcL() {
        return 2*Math.PI*radius;
    }
}
