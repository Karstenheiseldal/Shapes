package com.company;
import java.lang.Math;
import static java.lang.System.*;

public class Triangle extends Shapes {
    double bottomRightX; //triangle points ABC x and y coordinates.
    double bottomRightY;
    double bottomLeftX;
    double bottomLeftY;
    double topX;
    double topY;
    double area;
    public double centreX;
    public double centreY;


    @Override
    public void createShape() { //gives the attributes values
        bottomRightX = 10;
        bottomRightY = 7;
        bottomLeftX = 2;
        bottomLeftY = 7;
        topX = 2;
        topY = 9;
    }

    @Override
    public void getShape() { //Prints the coordinates
        out.println("Triangle has the following coordinates. "+
                " Point A(bottom Right) = (" + bottomRightX + ", " + bottomRightY + ")" +
                " Point B(bottom Left) = (" + bottomLeftX + ", " + bottomLeftY + ")" +
                " Point C(top) = (" + topX + ", " + topY + ")};");
    }

    @Override
    public void calculateShapeArea() { //formula to calculate triangle area A=ax(bx-cy)+bx(cy-ay)+cx(ay-by) / 2

        area = (((bottomRightX*(bottomLeftY-topY))+(bottomLeftX*(topY-bottomRightY))+(topX*(bottomRightY-bottomLeftY)))/2);
        if(area <0){
            area=area*(-1);
        }
        out.println("Triangle "+this.name+" has an area of "+area);

    }

    @Override
    public void calculateShapeCircumference() { //Distance formula d = sq(x2-x1)^2+(y2-y1)
        double AB = Math.sqrt((bottomLeftX - bottomRightX) * (bottomLeftX - bottomRightX) + (bottomLeftY - bottomRightY) * (bottomLeftY - bottomRightY));
        double BC = Math.sqrt((topX - bottomRightX) * (topX - bottomRightX) + (topY-bottomLeftY) * (topY-bottomLeftY));
        double CA = Math.sqrt((bottomRightX - topX) * (bottomRightX - topX) + (bottomRightY - topY));

        double perimeter = AB + BC + CA; //Formula P = a + b + c

        out.println("side AB: " + AB);
        out.println("side BC: " + BC);
        out.println("side CA: " + CA);
        out.println("Perimeter: " + perimeter);
    }

    @Override
    public void getCenter() { //Cx = (Ax + BX + CX)/3, Cy = (Ay + By + Cy)
        centreX = (bottomRightX + bottomLeftX + topX)/3;
        centreY = (bottomRightY + bottomLeftY + topY)/3;
        out.println("Centre: (" + centreX + ", " + centreY + ")");
    }

    @Override
    public void moveShape(double moveX, double moveY) {
        bottomRightX += moveX; //adding move x and y to the x and y coordinates of the triangle points
        bottomLeftX += moveX;
        topX += moveX;

        bottomRightY += moveY;
        bottomLeftY += moveY;
        topY += moveY;

        out.println("Triangle has been moved to following coordinates." +
                " Point A(bottom Right) = (" + bottomRightX + ", " + bottomRightY + ")" +
                " Point B(bottom Left) = (" + bottomLeftX + ", " + bottomLeftY + ")" +
                " Point C(top) = (" + topX + ", " + topY + ")};");
    }

    public void pointGame(double X, double Y){ //checks if x and y points are inside the triangle

        double aX = bottomRightX;
        double aY = bottomRightY;
        double bX = bottomLeftX;
        double bY = bottomLeftY;
        double cX = topX;
        double cY = topY;

        //X and Y coordinates for the point.
        pX = X;
        pY = Y;

        double ABP = Math.abs(((aX * (bY - pY)) + (bX * (pY - aY)) + (pX * (aY - bY)))/2);
        double BCP = Math.abs(((bX * (cY - pY)) + (cX * (pY - bY)) + (pX * (bY - cY)))/2);
        double CAP = Math.abs(((cX * (aY - pY)) + (aX * (pY - cY)) + (pX * (cY - aY)))/2);

        if(ABP + BCP + CAP == this.area) out.println("Point is inside triangle");

        else{
            out.println("Point is outside triangle");
        }
    }
}
