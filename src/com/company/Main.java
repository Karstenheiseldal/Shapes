package com.company;

public class Main {

    public static void main(String[] args) {
       //program start
        Rectangle rec = new Rectangle();  //new rectangle object
        rec.setName("Oliver");            //give the rectangle a name
        //rec.getName();                    //print out the rectangle name
        rec.createShape();                //sets the coordinates for the rectangle, and prints it after.
        rec.getShape();
        rec.calculateShapeArea();         //calculate and print rectangle area, circumference and centre.
        rec.calculateShapeCircumference();
        rec.getCenter();
        //rec.moveShape(1,1); //move shape to inserted x and y coordinates
        rec.getCenter();                 //to prove that the object has now been moved by printing centre again
        rec.pointGame(5,7);         //insert points of interest to check if point is inside or outside the Rectangle

        System.out.println();
        System.out.println();


        Triangle tri = new Triangle();      //new triangle
        tri.setName("Julius");              //give the triangle a name.
        //tri.getName();                      //print out triangle name
        tri.createShape();                  //sets the coordinates for the triangle
        tri.getShape();                     //prints triangle coordinates (ABC)
        tri.calculateShapeArea();           //calculating area and circumference
        tri.calculateShapeCircumference();
        tri.getCenter();                    //prints centre coordinates for the triangle
        tri.moveShape(2,4);    //moves the triangles collective x and y coordinates
        tri.pointGame(4,7);

        System.out.println();
        System.out.println();

        Circle cir = new Circle(); //new circle object
        cir.setName("Ole");        //name the circle
        //cir.getName();             //print name
        cir.createShape();         //sets centre x and y coordinates and radius
        cir.getShape();            //prints the coordinates
        cir.calculateShapeArea();  //calculates the area of the circle
        cir.calculateShapeCircumference(); //calculates and prints the circle circumference
        cir.getCenter();                    //prints the centre for the circle
        cir.moveShape(1,5);    //moves the circle's centre to given X and Y
        cir.pointGame(11,10);          //insert point of choosing, it checks if it is inside or outside

        System.out.println();
        System.out.println();

        cir.euclideanDistance(cir.centreX,tri.centreX,cir.centreY,tri.centreY);


    }
    }
