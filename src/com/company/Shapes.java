package com.company;

public abstract class Shapes {              //All shapes have to contain following methods

    String name;
    public abstract void setName(String name); //saying all subclasses should use this method for naming objects.
    public abstract void getName();         //the program should be able to print out the name as well.
    public abstract void createShape();     //giving coordinates to the objects
    public abstract void getShape();        //a method for revealing the coordinates has to be applied
    public abstract void calculateShapeArea(); //all subclasses should be able to calculate the shape area and circumference and centre.
    public abstract void calculateShapeCircimfurence();
    public abstract void getCenter();
    public abstract void moveShape(int moveX, int moveY); //the shapes can be moved to new coordinates.

}

