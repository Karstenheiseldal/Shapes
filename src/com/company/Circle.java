package com.company;

public class Circle extends Shapes {
    int centreX; //applied attributes
    int centreY;
    double radius;
    double area;

    @Override //method to give the rectangle its coordinates as seen in the parent abstract class
    public void createShape() {
        centreX = 10;
        centreY= 5;
        radius=5;
    }

    @Override //method to reveal its coordinates as well
    public void getShape() {
        System.out.println("Circle has the following coordinates. " +
                " Point centre = (" + centreX+ ", " + centreY + ")" + " Radius = "+radius);
    }

    @Override
    public void calculateShapeArea() { //method to calculate triangle area A=ax(bx-cy)+bx(cy-ay)+cx(ay-by) / 2

        area = (3.14*(radius*radius));
        if(area <0){
            area=area*(-1);
        }
        System.out.println("Circle area: "+area);
    }

    @Override
    public void calculateShapeCircumference() { //2piR
        double circumference = (2*3.14)*radius;
        System.out.println("Circumference is: " + circumference );
    }

    @Override
    public void getCenter() {
        System.out.println("Centre is: ("+centreX +", "+centreY+")");
    }

    @Override
    public void moveShape(double moveX, double moveY) { //Moving the centres X and Y coordinates accordingly
        centreX+=moveX;
        centreY+=moveY;

        System.out.println("Circle "+this.name+ " has moved to following coordinates. "+
                " New centre = (" + centreX+ ", " + centreY + ")");
    }

    @Override
    public void pointGame(double X, double Y) { //Method to investigate if a point is inside or outside the Circle
        pX = X;
        pY = Y;
        double cX = centreX;
        double cY = centreY;

        double distance = (pX - cX) * (pX-cX)*(pY - cY) * (pY-cY);

            if (distance<=radius*radius){
                System.out.println("Point is inside circle");
            }
            else{
                System.out.println("Point is outside the circle");
            }
    }

}
