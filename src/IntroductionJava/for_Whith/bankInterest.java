package IntroductionJava.for_Whith;

import java.util.Scanner;

public class bankInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số tiền muốn tính lãi :");
        double money = scanner.nextDouble();

        System.out.println("bạn muốn gửi 1 tháng ---> 1");
        System.out.println("bạn muốn gửi 3 tháng ---> 3");
        System.out.println("bạn muốn gửi 6 tháng ---> 6");

        int keypress = scanner.nextInt();

        switch (keypress) {
            case 1:
                for (int i = 1; i < 13; i++) {
                    double interest = (money / 100) * 0.5;
                    System.out.println("lãi tháng " + i + " = " + interest);
                    money += interest;
                }
                break;
            case 3:
                for (int i = 1; i < 13; i++) {
                    double interest = (money / 100) * 0.6;
                    System.out.println("lãi tháng " + i + " = " + interest);
                    money += interest;
                }
                break;
            case 6:
                for (int i = 1; i < 13; i++) {
                    double interest = (money / 100) * 0.7;
                    System.out.println("lãi tháng " + i + " = " + interest);
                    money += interest;
                }
                break;
            default:
                System.out.println("bạn đã chọn sai!");
        }
    }
}
