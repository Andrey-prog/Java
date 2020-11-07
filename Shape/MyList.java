package com.company;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MyList {

    private ArrayList<Shape> list = new ArrayList<Shape>();

    public void add(Shape sh) {
        list.add(sh);
    }

    public double getPerim() {

        double perimetr = 0;
        for (int i = 0; i < list.size(); i++) {
            perimetr += list.get(i).calcL();
        }
        return perimetr;
    }

    public double getSquare() {

        double square = 0;
        for (int i = 0; i < list.size(); i++) {
            square += list.get(i).calcS();
        }
        return square;
    }

}
