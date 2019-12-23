package IntroductionJava;

import java.util.Scanner;

public class calculateDaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tháng bạn muốn tính ngày : ");
        int month = scanner.nextInt();
        if (month >= 1 && month <= 12) {
            switch (month) {
                case 2:
                    System.out.println("tháng 2 sẽ có 28 or 29 ngày!");
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("tháng " + month + " có 31 days ");
                default:
                    System.out.println("tháng " + month + " có 30 days ");
            }
        } else {
            System.out.println("bạn đã nhập sai tháng!");
        }
    }
}
