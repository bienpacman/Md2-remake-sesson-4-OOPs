package com.company;

import java.util.Scanner;

public class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle(){
    }



    public double getArea() {
        return  this.width * this.height;
    }
    public double getPerimeter() {
        return (this.width + this.height);
    }
    public  String display(){
        return "Rectangle{" + "width = " + width + ",height =" + height + "}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều rộng :");
        double width = scanner.nextDouble();
        System.out.println("Nhập chiều dài :");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Chu vi hình chữ nhật là :" + rectangle.getPerimeter());
        System.out.println("Diện tích hình chữ nhật là : " + rectangle.getArea());
    }
}
