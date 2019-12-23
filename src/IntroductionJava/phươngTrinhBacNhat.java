package IntroductionJava;

import java.util.Scanner;

public class phươngTrinhBacNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập giá trị a : = ");
        double a = scanner.nextDouble();

        System.out.println("nhập giá trị cho b : = ");
        double b = scanner.nextDouble();

        System.out.println("nhập giá trị cho c : = ");
        double c = scanner.nextDouble();

        System.out.println("phương trình của bạn là :" + a + "X "+" + " + b+" = " + c );

        if (a ==0){
            System.out.println("phương trình vô nghiệm!");
        } else {
            if (b == 0){
                double x = c/a;
                System.out.println("phương trình có nghiệm là = " + x);
            }else {
                double x1 = (c-b)/a;
                System.out.println("phuwogn trình có nghiệm là = " + x1);
            }
        }
    }
}
