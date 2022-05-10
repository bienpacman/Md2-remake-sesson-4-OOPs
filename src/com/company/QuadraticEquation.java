package com.company;
// Xây dựng lớp QuadraticEquation (Phương trình bậc hai)
import java.util.Scanner;

public class QuadraticEquation {
    double a;
    double b;
    double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public QuadraticEquation(){
    }

    public double delta() {
        return (- this.getB()*this.getB()-4*this.getA()*this.getC());
    }
    public double getR1(){
        return (-this.getB()+ Math.pow(this.delta(),0.5))/(2*this.getA());
    }
    public double getR2(){
        return (-this.getB()- Math.pow(this.delta(),0.5))/(2*this.getA());
    }

    public static void main(String[] args) {
        while (1 > 0){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập a");
            double a = scanner.nextDouble();
            System.out.println("Nhập b");
            double b = scanner.nextDouble();
            System.out.println("Nhập c");
            double c = scanner.nextDouble();
            System.out.println("Phương trình : " +a+"X^2+"+b+"X+"+c+"=0");
            if (a != 0){
                QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
                if (quadraticEquation.delta()<0){
                    System.out.println("Phương trình vô nghiệm");
                }else if (quadraticEquation.delta()==0){
                    System.out.println("Phương trình có 1 nghiệm kép");
                }else if (quadraticEquation.delta() > 0){
                    System.out.println("Phương trình có 2 nghiệm");
                    System.out.println("X1 =" +quadraticEquation.getR1());
                    System.out.println("X2 =" +quadraticEquation.getR2());
                }else {
                    if (b != 0){
                        System.out.println("pt có 1 nghiệm X =" +-c/b);
                    }else {
                        if (c != 0) {
                            System.out.println("pt vô nghiệm");
                        }else {
                            System.out.println("pt có vô số nghiệm");
                        }
                    }
                }
            }
        }
    }
}
