package com.company;

public class Main {

    public static void main(String[] args) {
       //programStart
        Rectangle rec = new Rectangle();  //new rectangle object. Sets fixed koordinates for rectangle
        rec.setName("Oliver"); //give the rectangle a name
        rec.getName(); //print out the rectangle name
        rec.createShape(); //sets the coordinates for the Triangle
        rec.getShape();
        rec.calculateShapeArea();

        System.out.println();
        System.out.println();

        Triangle tri = new Triangle(); //new triangle
        tri.setName("Julius"); // give the triangle a name.
        tri.getName(); //print out triangle name
        tri.createShape(); //sets the coordinates for the triangle
        tri.getShape(); //prints triangle koordinates (ABC)
        tri.calculateShapeArea();
    }
}
