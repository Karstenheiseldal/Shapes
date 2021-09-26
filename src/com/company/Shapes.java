package com.company;

public abstract class Shapes {
    public abstract void  makeShape(int x, int y);
    public abstract void  showShape();
    public abstract void  calculateShapeArea();
    public abstract void  calculateShapeCirc();
    public abstract void  getCenter();
    boolean collision = false;
}

class Rectangle extends Shapes{
    int a;
    int b;

    @Override
    public void makeShape(int x, int y) {
        this.a = x;
        this.b = y;
    }

    @Override
    public void showShape() {
        System.out.println("Rectangle coordinates is X="+a+" Y="+b);
    }

    @Override
    public void calculateShapeArea() {

    }

    @Override
    public void calculateShapeCirc() {

    }

    @Override
    public void getCenter() {

    }
}
