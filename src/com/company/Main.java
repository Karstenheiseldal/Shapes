package com.company;

public class Main {

    public static void main(String[] args) {
       //programStart
        Rectangle rec = new Rectangle();  //new rectangle object
        rec.setName("Oliver"); //give the rectangle a name
        rec.getName(); //print out the rectangle name
        rec.createShape(); //sets the coordinates for the rectangle, and prints it after.
        rec.getShape();
        rec.calculateShapeArea(); //calculates and returns rectangle area, circumference and centre.
        rec.calculateShapeCircimfurence();
        rec.getCenter();

        System.out.println();
        System.out.println();

        Triangle tri = new Triangle(); //new triangle
        tri.setName("Julius"); // give the triangle a name.
        tri.getName(); //print out triangle name
        tri.createShape(); //sets the coordinates for the triangle
        tri.getShape(); //prints triangle koordinates (ABC)
        tri.calculateShapeArea();
        tri.calculateShapeCircimfurence();
        tri.getCenter();

        System.out.println();
        System.out.println();

        Circle cir = new Circle();
        cir.setName("Ole");
        cir.getName();
        cir.createShape();
        cir.getShape();
        cir.calculateShapeArea();
        cir.calculateShapeCircimfurence();
    }
}
