package com.company;

public class Circle extends Shapes {
    int centreX;
    int centreY;
    int radius;
    double area;
    double circumference;

 String nameCircle;

    @Override //method for naming the triangle
    public void setName(String name){
        nameCircle = name;
    }

    @Override //method to get printed in the terminal.
    public void getName() {
        System.out.println(nameCircle);
    }

    @Override //method to give the rectangle its coordinates as seen in the parent abstract class
    public void createShape() {

        centreX = 10;
        centreY= 5;
        radius=5;
    }

    @Override //method to reveal its coordinates as well
    public void getShape() {
        System.out.println("Circle has the following coordinates. "+
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
    public void calculateShapeCircimfurence() { //2piR
        circumference = (2*3.14)*radius;
        System.out.println("Circumference is: " + circumference );
    }

    @Override
    public void getCenter() {
        System.out.println("Centre: ("+centreX +", "+centreY+")");
    }

    @Override
    public void moveShape(int moveX, int moveY) {
        centreX+=moveX;
        centreY+=moveY;

        System.out.println("Circle "+this.nameCircle+ " has been moved following coordinates. "+
                " Point centre = (" + centreX+ ", " + centreY + ")" + " Radius = "+radius);

    }

}
