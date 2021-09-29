package com.company;

public abstract class Shapes {              //All shapes have to contain following methods
    int pX;
    int pY;
    String name;
    public void setName(String nameShape){
        name=nameShape;
    }
    public void getName(){
        System.out.println(name);
    }
    //the program should be able to print out the name as well.
    public abstract void createShape();     //giving coordinates to the objects
    public abstract void getShape();        //a method for revealing the coordinates has to be applied
    public abstract void calculateShapeArea(); //all subclasses should be able to calculate the shape area and circumference and centre.
    public abstract void calculateShapeCircumference();
    public abstract void getCenter();
    public abstract void moveShape(int moveX, int moveY); //the shapes can be moved to new coordinates.

}

