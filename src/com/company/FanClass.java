package com.company;

public class FanClass {
    private final byte SLOW = 1;
    private final byte MEDIUM = 2;
    private final byte FAST = 3;
    private int speed = 1;
    private boolean status = false;
    private double radius = 5;
    private String color = " blue";

    public FanClass(int speed, boolean status, double radius, String color) {
        this.speed = speed;
        this.status = status;
        this.radius = radius;
        this.color = color;
    }

    public FanClass() {
    }

    public byte getSLOW() {
        return SLOW;
    }

    public byte getMEDIUM() {
        return MEDIUM;
    }

    public byte getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        if (this.isStatus()) {
            return "FanClass{" +
                    "fan is on" +
                    ", speed=" + speed +
                    ", status=" + status +
                    ", color='" + color + '\'' +
                    '}';
        } else {
            return "FanClass{" +
                    "fan is off" +
                    ", radius =" + radius +
                    ", color = " + color + '\''+
                    '}';
        }
    }

    public static void main(String[] args) {
        FanClass fanClass1 = new FanClass(3,true,10,"yellow");
        FanClass fanClass2 = new FanClass(2,false,5,"blue");
        System.out.println("status fun 1 " + fanClass1);
        System.out.println("status fun 2 "+ fanClass2);

    }
}