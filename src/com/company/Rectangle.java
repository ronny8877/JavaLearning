package com.company;

public class Rectangle {
    int length, breadth;

    Rectangle(int l ,int b){
        this.length =l;
        this.breadth= b;
    }

    void area (){
        System.out.println("Area of rectangle is ");
        System.out.println(length *breadth);
    }
}


class testRectangle{
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(15 , 25);
        rectangle.area();
    }

}