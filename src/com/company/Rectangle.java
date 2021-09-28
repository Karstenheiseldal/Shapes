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
        bottomLeftY = 9;
        topLeftX = 5;
        topLeftY = 9;
        topRightX = 2;
        topRightY = 7;
    }

    @Override
    public void validateShape(){
        if(this.bottomRightX == this.topRightX && this.bottomRightY == this.topRightY){
            System.out.println("Nice");
        } else {
            System.out.println("yo");

        }
    }

    @Override
    public void getShape() {
        System.out.println("Rectangle ABCD has the following coordinates. " +
                " A=("+bottomRightX+", "+bottomRightY+")"+
                " B=("+bottomLeftX+", "+bottomLeftY+")"+
                " C=("+topLeftX+", "+topLeftY+")"+
                " D=("+topRightX+", "+topRightY+")");
    }

    @Override
    public void calculateShapeArea() {



    }


}

