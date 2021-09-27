package com.company;

public class Main {

    public static void main(String[] args) {
       //programStart
        Rectangle rec = new Rectangle();
        rec.setName("Oliver");
        rec.getName();
        rec.setShape(5,7,2,9,5,9,2,7);
        rec.getShape();
        rec.validateShape();
    }
}
