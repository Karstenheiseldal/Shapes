package com.company;

public abstract class Shapes {
    double pX;
    double pY;
    String name;
    public double distanceCentre;

    public void setName(String nameShape) {             //methods that are available for subclasses to use
        name = nameShape;
    }
    public void getName(){
        System.out.println(name);
    }
    //All shapes should contain following methods
    public abstract void createShape();             //giving coordinates to the objects
    public abstract void getShape();                //a method for revealing the coordinates has to be applied
    public abstract void calculateShapeArea();      //all subclasses should be able to calculate the shape area and circumference and centre.
    public abstract void calculateShapeCircumference();
    public abstract void getCenter();
    public abstract void moveShape(double moveX, double moveY); //the shapes can be moved to new coordinates.
    public abstract void pointGame(double X, double Y);         //Insert coordinates to a point, and checks if the point is inside or outside shape.

    //Calculation to determine the distance between the two shapes centre. Formula is: d = sq(x2 - x1)2 + (y2 - y1)
    public void  euclideanDistance(double centreAx, double centreAy, double centreBx, double centreBy){
        distanceCentre = Math.sqrt((centreBx - centreAx) * (centreBx - centreAx) + (centreBy - centreAy) * (centreBy - centreAy));
        System.out.println("Distance between Object A and Object B is: " + distanceCentre);
 }
}

