package com.company;

public class Rectangle extends Shapes {
    int axRec;
    int ayRec;
    int bxRec;
    int byRec;
    int cxRec;
    int cyRec;
    int dxRec;
    int dyRec;

    int length;
    int width;
    int areal;

    String nameRectangle;

    boolean validShape =false;

    @Override
    public void setName(String name) {
        nameRectangle = name;
    }

    @Override
    public void getName() {
        System.out.println(nameRectangle);
    }

    @Override
    public void createShape() {

            axRec = 5;
            ayRec = 7;
            bxRec = 2;
            byRec = 9;
            cxRec = 5;
            cyRec = 9;
            dxRec = 2;
            dyRec = 7;
    }

    @Override
    public void validateShape(){
        if(this.axRec == this.cxRec && this.ayRec == this.dyRec){
            System.out.println("Nice");
        } else {
            System.out.println("yo");

        }
    }

    @Override
    public void getShape() {
        System.out.println("Rectangle ABCD has the following coordinates. " +
                " A=("+axRec+", "+ayRec+")"+
                " B=("+bxRec+", "+byRec+")"+
                " C=("+cxRec+", "+cyRec+")"+
                " D=("+dxRec+", "+dyRec+")");
    }

    @Override
    public void calculateShapeArea() {



    }


}

