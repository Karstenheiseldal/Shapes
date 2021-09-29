package com.company;

public class Main {

    public static void main(String[] args) {
       //programStart
        Rectangle rec = new Rectangle();  //new rectangle object
        rec.setName("Oliver");            //give the rectangle a name
        rec.getName();                    //print out the rectangle name
        rec.createShape();                //sets the coordinates for the rectangle, and prints it after.
        rec.getShape();
        rec.calculateShapeArea();         //calculates and returns rectangle area, circumference and centre.
        rec.calculateShapeCircimfurence();
        rec.getCenter();                  //prints centre X and Y coordinates for the rectangle
        rec.moveShape(4,5); //move shape to inserted x and y coordinates
        rec.getCenter();                 //to confirm that the object has now been moved by printing centre again

        System.out.println();
        System.out.println();

        Triangle tri = new Triangle();      //new triangle
        tri.setName("Julius");              //give the triangle a name.
        tri.getName();                      //print out triangle name
        tri.createShape();                  //sets the coordinates for the triangle
        tri.getShape();                     //prints triangle coordinates (ABC)
        tri.calculateShapeArea();           //calculating area and circumference
        tri.calculateShapeCircimfurence();
        tri.getCenter();                    //prints centre coordinates for the triangle
        tri.moveShape(2,4);   //moves the triangles collective x and y coordinates

        System.out.println();
        System.out.println();

        Circle cir = new Circle(); //new circle object
        cir.setName("Ole");        //name the circle
        cir.getName();             //print name
        cir.createShape();         //sets centre x and y coordinates and radius
        cir.getShape();            //prints the coordinates
        cir.calculateShapeArea();  //calculates the area of the circle
        cir.calculateShapeCircimfurence(); //calculates and prints the circle circumference
        cir.getCenter();                    //prints the centre for the circle
        cir.moveShape(1,5);    //moves the circle's centre to given X and Y
    }
}
