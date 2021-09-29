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
    int area;

    @Override               //method to give the x and y coordinates for the Rectangle
    public void createShape() {

        bottomRightX = 5;
        bottomRightY = 7;
        bottomLeftX = 2;
        bottomLeftY = 7;
        topLeftX = 2;
        topLeftY = 9;
        topRightX = 5;
        topRightY = 9;
    }

    @Override               //method to print out the rectangle coordinates to the terminal
    public void getShape() {
        System.out.println("Rectangle ABCD has the following coordinates. " +
                " A(bottom Right) = (" + bottomRightX + ", " + bottomRightY + ")" +
                " B(bottom Left) = (" + bottomLeftX + ", " + bottomLeftY + ")" +
                " C(top Left) = (" + topLeftX + ", " + topLeftY + ")" +
                " D(top Right) = (" + topRightX + ", " + topRightY + ")");
    }

    @Override
    public void calculateShapeArea() { //method to calculate the shape Area
        int length = bottomRightX - bottomLeftX;
        int width = topRightY - bottomRightY;

        System.out.println("the rectangle " + this.name + " length: " + length);  //printing length
        System.out.println("the rectangle " + this.name + " width: " + width);

        area = length * width;      //final calculation
        System.out.println("Area is: " + area);
    }

    @Override
    public void calculateShapeCircumference() {
        int length = bottomRightX - bottomLeftX;
        int width = topRightY - bottomRightY;
        int perimeter = (length * 2) + (width * 2);
        System.out.println("Perimeter is: " + perimeter);
    }

    @Override
    public void getCenter() {
        int centreX = (topLeftX + bottomRightX) / 2; //(x,y) = (x2 + x1)/2, (y2+y1)/2
        int centreY = (topLeftY + bottomRightY) / 2;
        System.out.println("Centre is located at (" + centreX + ", " + centreY + ")");
    }

    @Override
    public void moveShape(int moveX, int moveY) {
        bottomRightX += moveX;
        bottomLeftX += moveX;
        topRightX += moveX;
        topLeftX += moveX;

        bottomRightY += moveY;
        bottomLeftY += moveY;
        topRightY += moveY;
        topLeftY += moveY;

        System.out.println("Rectangle ABCD has been moved to following coordinates. " +
                " A(bottom Right) = (" + bottomRightX + ", " + bottomRightY + ")" +
                " B(bottom Left) = (" + bottomLeftX + ", " + bottomLeftY + ")" +
                " C(top Left) = (" + topLeftX + ", " + topLeftY + ")" +
                " D(top Right) = (" + topRightX + ", " + topRightY + ")");
    }

    public void pointGame(int X, int Y) { //

        int aX = bottomRightX;
        int aY = bottomRightY;
        int bX = bottomLeftX;
        int bY = bottomLeftY;
        int cX = topLeftX;
        int cY = topLeftY;
        int dX = topRightX;
        int dY = topRightY;
        pX = X;
        pY = Y;
        //pX, py, aX, aY, bX, bY, cX, cY, dX, dY
        //ABP = 0.5 * abs(xA*(yB - yP) + xB*(yP - yA) + xP*(yA - yB))

        double ABP = (Math.abs((aX * (bY - pY)) + (bX * (pY - aY)) + (pX * (aY - bY))/2));
        double BCP = (Math.abs((bX * (cY - pY)) + (cX * (pY - bY)) + (pX * (bY - cY))/2));
        double CDP = (Math.abs((cX * (dY - pY)) + (dX * (pY - bY)) + (pX * (cY - dY))/2));
        double DAP = (Math.abs((dX * (aY - pY)) + (aX * (pY - dY)) + (pX * (dY - aY))/2));

        System.out.println(ABP);
        System.out.println(ABP + BCP + CDP + DAP);

        if (this.area == ABP + BCP + CDP + DAP) {
            System.out.println(area + " it is in the rectangle");
        } else {
            System.out.println("The point ("+pX+", "+pY+")"+"is outside the rectangle");


        }
    }
}

