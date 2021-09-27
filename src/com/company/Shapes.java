package com.company;

public abstract class Shapes { //All shapes have to contain following methods
    int x1;
    int x2;
    int y1;
    int y2;
    int centre;
    int area;

    String name;

    public abstract String setName(String name);
    public abstract void getName(String name);
    public abstract void  setShape(int x1, int x2, int y1, int y2);
    public abstract void getShape(int x1, int x2, int y1, int y2);
    public abstract void  calculateShapeArea(String name);
    public abstract void  calculateShapeCircimfurence(String name);
    public abstract void  getArea(int area);
    public abstract void  getCenter(int centre);

}

