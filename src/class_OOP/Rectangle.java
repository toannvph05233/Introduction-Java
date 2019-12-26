package class_OOP;

import java.awt.*;

public class Rectangle {
    double width, heigth;

    public Rectangle() {

    }

    public Rectangle(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public double getArea() {
        return this.heigth * this.width;
    }

    public double getPerimeter() {
        return (heigth + width) * 2;
    }
}

class mainRectangle{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(50,30);
        System.out.println(" diện tích hình chữ nhật = " + rectangle.getArea());
    }
}
