package com.company;

public class Rectangle extends Shapes {
        int x1;
        int x2;
        int y1;
        int y2;
        public String name;

        public Rectangle(String name){
            this.name = name;
        }

    @Override
    public String setName(String name) {
    this.name = name;
    return this.name;
    }

    @Override
        public void getName(String name) {
            return;
        }


        public void getName() {
            System.out.println("the name is"+ name);
        }

        @Override
        public void setShape(int x1, int x2, int y1, int y2) {

        }

        @Override
        public void getShape(int x1, int x2, int y1, int y2) {


        }

        @Override
        public void calculateShapeArea(String name) {

        }

        @Override
        public void calculateShapeCircimfurence(String name) {

        }

        @Override
        public void getArea(int area) {

        }

        @Override
        public void getCenter(int centre) {

        }
    }

