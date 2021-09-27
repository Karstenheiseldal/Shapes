package com.company;

public abstract class Shapes { //All shapes have to contain following methods

    String name;
    public abstract void setName(String name);
    public abstract void getName();
    public abstract void setShape(int ax, int ay, int bx, int by, int cx, int cy, int dx, int dy);
    public abstract void getShape();
    public abstract void validateShape();
    public abstract void  calculateShapeArea();
    /*public abstract void  calculateShapeCircimfurence(String name);
    public abstract void  getArea(int area);
    public abstract void  getCenter(int centre)/*

     */

}

