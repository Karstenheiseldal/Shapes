package com.company;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShapesFunctionalityTest {
//rectangle
    @Test
    public void createShape() {
        Rectangle rick = new Rectangle();

    }

    @Test
    public void getShape() {
        Rectangle rick = new Rectangle();
        rick.createShape();
        rick.moveShape(5,5);

        assertEquals(7, rick.topLeftX);

    }

    @Test
    public void calculateShapeArea() {
        Rectangle rick = new Rectangle();
        rick.createShape();
        rick.calculateShapeArea();
        assertEquals(6, rick.area);
    }

    @Test
    public void calculateShapeCircumference() {
        Rectangle rick = new Rectangle();
        rick.createShape();
        rick.calculateShapeCircumference();
        assertEquals(10,rick.perimeter);
    }

    @Test
    public void getCenter() {
        Rectangle rick = new Rectangle();
        rick.createShape();
        rick.getCenter();
        assertEquals(3.5, rick.centreX);
        assertEquals(8,rick.centreY);
    }

    @Test
    public void moveShape() {
        Rectangle ruben = new Rectangle();
        ruben.createShape();
        ruben.moveShape(4,4);
        assertEquals(9,ruben.bottomRightX);

    }

    @Test
   public void pointGame(){
        Rectangle rick = new Rectangle();
        rick.createShape();
        rick.calculateShapeArea();
        assertEquals(6, rick.area);
    }
}