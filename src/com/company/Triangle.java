package com.company;

import org.w3c.dom.ls.LSOutput;

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
        System.out.println("Triangle ABC has the following coordinates. "+
                " Point A(bottom Right) = (" + bottomRightX + ", " + bottomRightY + ")" +
                " Point bB(bottom Left) = (" + bottomLeftX + ", " + bottomLeftY + ")" +
                " C(top) = (" + topX + ", " + topY + ")};");
    }

    @Override
    public void calculateShapeArea() { //method to calculate triangle area A=ax(bx-cy)+bx(cy-ay)+cx(ay-by) / 2

        int area = (bottomRightX*(bottomLeftY-topY))+(bottomLeftX*(topY-bottomRightY))+(topX*(bottomRightY-bottomLeftY))/2;
        if(area <0){
            area=area*(-1);
        }
        System.out.println("Triangle "+this.nameTriangle+" has an area of "+area);



    }
}

