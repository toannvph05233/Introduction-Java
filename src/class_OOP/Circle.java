package class_OOP;

public class Circle {
    private String color;
    private double radius;

    public Circle() {
        this.color = "zed";
        this.radius=1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getgetArea(){
        return this.radius*this.radius*Math.PI;
    }

}
