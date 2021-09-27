package com.company;

public class Rectangle extends Shapes {
    int x1Rec;
    int x2Rec;
    int y1Rec;
    int y2Rec;

    String nameRectangle;

    @Override
    public void setName(String name) {
        nameRectangle = name;
    }

    @Override
    public void getName() {
        System.out.println(nameRectangle);
    }

    @Override
    public void setShape(int x1, int x2, int y1, int y2) {
        x1 = x1Rec;
        x2 = x2Rec;
        y1 = y1Rec;
        y2 = x1Rec;
    }
}

