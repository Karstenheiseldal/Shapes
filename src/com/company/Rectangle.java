package com.company;

public class Rectangle extends Shapes {
    int bottomRightX;
    int bottomRightY;
    int bottomLeftX;
    int bottomLeftY;
    int topLeftX;
    int topLeftY;
    int topRightX;
    int topRightY;

    int length;
    int width;
    int areal;

    String nameRectangle;

    boolean validShape =false;

    @Override
    public void setName(String name) {
        nameRectangle = name;
    }

    @Override
    public void getName() {
        System.out.println(nameRectangle);
    }

    @Override
    public void createShape() {

        bottomRightX = 5;
        bottomRightY = 7;
        bottomLeftX = 2;
        bottomLeftY = 7;
        topLeftX = 2;
        topLeftY = 9;
        topRightX =5;
        topRightY = 9;
    }

    @Override
    public void getShape() {
        System.out.println("Rectangle ABCD has the following coordinates. " +
                " A(bottom Right) = ("+bottomRightX+", "+bottomRightY+")"+
                " B(bottom Left) = ("+bottomLeftX+", "+bottomLeftY+")"+
                " C(top Left) = ("+topLeftX+", "+topLeftY+")"+
                " D(top Right) = ("+topRightX+", "+topRightY+")");
    }

    @Override
    public void calculateShapeArea() {



    }


}

