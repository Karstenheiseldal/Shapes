package com.company;

public class Rectangle extends Shapes {
    public double bottomRightX; //double x and y coordinates for each point
    double bottomRightY;
    double bottomLeftX;
    double bottomLeftY;
    public double topLeftX;
    double topLeftY;
    double topRightX;
    double topRightY;
    public double area;
    public double perimeter;
    public double centreX;
    public double centreY;

    @Override
    public void createShape() {  //applying the x and y coordinates for the Rectangle.
        bottomRightX = 5;
        bottomRightY = 7;
        bottomLeftX = 2;
        bottomLeftY = 7;
        topLeftX = 2;
        topLeftY = 9;
        topRightX = 5;
        topRightY = 9;
    }

    @Override
    public void getShape() { //method to printle out the rectangle coordinates to the terminal
        System.out.println("Rectangle ABCD has the following coordinates. " +
                " A(bottom Right) = (" + bottomRightX + ", " + bottomRightY + ")" +
                " B(bottom Left) = (" + bottomLeftX + ", " + bottomLeftY + ")" +
                " C(top Left) = (" + topLeftX + ", " + topLeftY + ")" +
                " D(top Right) = (" + topRightX + ", " + topRightY + ")");
    }

    @Override
    public void calculateShapeArea() { //method to calculate the shape Area
        double length = bottomRightX - bottomLeftX;
        double width = topRightY - bottomRightY;

        System.out.println("the rectangle " + this.name + " length: " + length);  //prdoubleing length
        System.out.println("the rectangle " + this.name + " width: " + width);

        area = length * width;      //Area calculation
        System.out.println("Area is: " + area);
    }

    @Override
    public void calculateShapeCircumference() { // formula: p = 2a + 2b
        double length = bottomRightX - bottomLeftX;
        double width = topRightY - bottomRightY;
        perimeter = (length * 2) + (width * 2);
        System.out.println("Perimeter is: " + perimeter);
    }

    @Override
    public void getCenter() {
        centreX = (topLeftX + bottomRightX) / 2; //(x,y) = (x2 + x1)/2, (y2+y1)/2
        centreY = (topLeftY + bottomRightY) / 2;
        System.out.println("Centre is located at (" + centreX + ", " + centreY + ")");
       
    }

    @Override
    public void moveShape(double moveX, double moveY) {
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

    public void pointGame(double X, double Y) {
        double aX = bottomRightX;
        double aY = bottomRightY;
        double bX = bottomLeftX;
        double bY = bottomLeftY;
        double cX = topLeftX;
        double cY = topLeftY;
        double dX = topRightX;
        double dY = topRightY;

        pX = X;
        pY = Y;

        //Dividing the rectangel into 4 tringles. Tringle ABP, BCP, DPD and DAP.
        //Finding the area of each triangle. It cannot be negative, it is an absolute number. Double because of division by 2.

        double ABP = Math.abs(((aX * (bY - pY)) + (bX * (pY - aY)) + (pX * (aY - bY)))/2);
        double BCP = Math.abs(((bX * (cY - pY)) + (cX * (pY - bY)) + (pX * (bY - cY)))/2);
        double CDP = Math.abs(((cX * (dY - pY)) + (dX * (pY - cY)) + (pX * (cY - dY)))/2);
        double DAP = Math.abs(((dX * (aY - pY)) + (aX * (pY - dY)) + (pX * (dY - aY)))/2);

        //if adding the area of the three triangles is the ecact same as the rectangle, it is in the rectangle.
        if (this.area == ABP + BCP + CDP + DAP){
            System.out.println(area + " it is in the rectangle");
        }
        else {
            System.out.println("The point (" + pX + ", " + pY + ")" + "is outside the rectangle");
        }
    }
}

