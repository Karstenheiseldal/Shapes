package com.company;
import java.lang.Math;

public class Triangle extends Shapes {
    int bottomRightX; //triangle points ACD x and y coordinates.
    int bottomRightY;
    int bottomLeftX;
    int bottomLeftY;
    int topX;
    int topY;

    String nameTriangle; //triangle can be set with a name

    @Override //method for naming the triangle
    public void setName(String name) {
        nameTriangle = name;
    }

    @Override //method to get printed in the terminal.
    public void getName() {
        System.out.println(nameTriangle);
    }

    @Override //method to give the rectangle its coordinates as seen in the parent abstract class
    public void createShape() {

        bottomRightX = 10;
        bottomRightY = 7;
        bottomLeftX = 2;
        bottomLeftY = 7;
        topX = 2;
        topY = 9;
    }

    @Override //method to reveal its coordinates as well
    public void getShape() {
        System.out.println("Triangle has the following coordinates. "+
                " Point A(bottom Right) = (" + bottomRightX + ", " + bottomRightY + ")" +
                " Point B(bottom Left) = (" + bottomLeftX + ", " + bottomLeftY + ")" +
                " Point C(top) = (" + topX + ", " + topY + ")};");
    }

    @Override
    public void calculateShapeArea() { //method to calculate triangle area A=ax(bx-cy)+bx(cy-ay)+cx(ay-by) / 2

        int area = (bottomRightX*(bottomLeftY-topY))+(bottomLeftX*(topY-bottomRightY))+(topX*(bottomRightY-bottomLeftY))/2;
        if(area <0){
            area=area*(-1);
        }
        System.out.println("Triangle "+this.nameTriangle+" has an area of "+area);

    }

    @Override
    public void calculateShapeCircimfurence() { //d=sq(x2-x1)2+(y2-y1)2
        int unSquaredAB = (bottomLeftX-bottomRightX)*(bottomLeftX-bottomRightX)+(bottomLeftY-bottomRightY)*(bottomLeftY-bottomRightY);
        int unSquaredBC = (topX - bottomRightX)*(topX - bottomRightX)+(topY-bottomLeftY)*(topY-bottomLeftY);
        int unSquaredCA = (bottomRightX - topX)*(bottomRightX - topX)+(bottomRightY-topY);


        double sideAB = Math.sqrt(unSquaredAB);
        double sideBC = Math.sqrt(unSquaredBC);
        double sideCA = Math.sqrt(unSquaredCA);
        double perimeter = sideAB + sideBC + sideCA;

        System.out.println("side AB: "+sideAB);
        System.out.println("side BC: "+sideBC);
        System.out.println("side CA: "+sideCA);
        System.out.println("Perimeter: "+perimeter);
    }

    @Override
    public void getCenter() { //Cx = (Ax + BX + CX)/3, Cy = (Ay + By + Cy)
        double centreX = (bottomRightX + bottomLeftX + topX)/3;
        double centreY = (bottomRightY + bottomLeftY + topY)/3;
        System.out.println("Centre: ("+centreX+", "+centreY+")");
    }


}

