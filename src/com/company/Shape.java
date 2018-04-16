package com.company;

public class Shape {

    private double side;
    private double width, height;
    private double base;
    private final double PI=Math.PI;

    public double Square (double side){
        return side*side;
    }

    public double Rectangle(double width, double height){
        return  width*height;
    }

    public double Triangle (double base, double height){
        return  base*height*0.5;
    }

    public double Circle (double radius){
        return radius*radius*PI;
    }

    public double CustomShape(){
        return 1.1234;
    }





}
