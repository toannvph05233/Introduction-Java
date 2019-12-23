package IntroductionJava;

import java.util.Scanner;

public class rectangularArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập chiều dài của hình chữ nhật : ");
        double length = scanner.nextDouble();

        System.out.println("nhập chiều rộng của hình chữ nhật : ");
        double width = scanner.nextDouble();

        System.out.println("diện tích hình chữ nhật có chiều length = " + length + " có chiều width = " + width + " = " + (length*width));
    }
}
