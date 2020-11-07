package com.company;
import java.util.Scanner;

public class MyPoint extends Shape{

    private double x;
    private double y;

    public MyPoint(Scanner scanner){
        x = scanner.nextDouble();
        y = scanner.nextDouble();
    }

    public double getX(){
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    @Override
    public double calcS() {
        return 0;

    }

    @Override
    public double calcL() {
        return 0;
    }
}