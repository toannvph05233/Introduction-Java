package ke_thua;

import java.util.Scanner;

public class Rectangle extends Shape implements Resizeable {
    double width, length;

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;

    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width*length;
    }

    public double getPerimeter(){
        return (width+length)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}' + super.toString();
    }

    @Override
    public void resize(double percent) {
        System.out.println("Kich thuoc sau thay doi : "+ percent);
    }

    @Override
    public double increase(Scanner scanner) {
        System.out.println("bạn muốn tăng lên bao nhiêu :");
        return scanner.nextDouble();
    }
}
