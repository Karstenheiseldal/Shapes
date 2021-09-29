package com.company;

public class Rectangle extends Shapes {
    int bottomRightX; //int x and y coordinates for each point
    int bottomRightY;
    int bottomLeftX;
    int bottomLeftY;
    int topLeftX;
    int topLeftY;
    int topRightX;
    int topRightY;



    String nameRectangle;  //rectangle can be represented as a String

    @Override              //method to give the rectangle String value
    public void setName(String name) {
        nameRectangle = name;
    }

    @Override               //method to print out the name in the terminal
    public void getName() {
        System.out.println(nameRectangle);
    }

    @Override               //method to give the x and y coordinates for the Rectangle
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

    @Override               //method to print out the rectangle coordinates to the terminal
    public void getShape() {
        System.out.println("Rectangle ABCD has the following coordinates. " +
                " A(bottom Right) = ("+bottomRightX+", "+bottomRightY+")"+
                " B(bottom Left) = ("+bottomLeftX+", "+bottomLeftY+")"+
                " C(top Left) = ("+topLeftX+", "+topLeftY+")"+
                " D(top Right) = ("+topRightX+", "+topRightY+")");
    }

    @Override
    public void calculateShapeArea() { //method to calculate the shape Area
        int length = bottomRightX - bottomLeftX;
        int width =  topRightY - bottomRightY;

        System.out.println("the rectangle "+this.nameRectangle+" length: "+length);  //printing length
        System.out.println("the rectangle "+this.nameRectangle+" width: "+width);

        int area = length*width;      //final calculation
        System.out.println("Area is: "+area);

    }

    @Override
    public void calculateShapeCircimfurence() {
        int length = bottomRightX - bottomLeftX;
        int width =  topRightY - bottomRightY;
        int perimeter = (length*2)+(width*2);
        System.out.println("Perimeter is: "+ perimeter);
    }

    @Override
    public void getCenter() {
        int centreX = (topLeftX+bottomRightX)/2; //(x,y) = (x2 + x1)/2, (y2+y1)/2
        int centreY = (topLeftY+bottomRightY)/2;
        System.out.println("Centre is located at ("+centreX+", "+centreY+")");
    }

    @Override
    public void moveShape(int moveX, int moveY) {
        bottomRightX+=moveX;
        bottomLeftX+=moveX;
        topRightX+=moveX;
        topLeftX+=moveX;

        bottomRightY+=moveY;
        bottomLeftY+=moveY;
        topRightY+=moveY;
        topLeftY+=moveY;

        System.out.println("Rectangle ABCD has been moved to following coordinates. " +
                " A(bottom Right) = ("+bottomRightX+", "+bottomRightY+")"+
                " B(bottom Left) = ("+bottomLeftX+", "+bottomLeftY+")"+
                " C(top Left) = ("+topLeftX+", "+topLeftY+")"+
                " D(top Right) = ("+topRightX+", "+topRightY+")");
    }


}

