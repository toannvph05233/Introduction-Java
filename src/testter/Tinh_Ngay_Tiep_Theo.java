package testter;

import java.util.Scanner;

public class Tinh_Ngay_Tiep_Theo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day,month,year;
        do {
            System.out.println("nhập ngày :");
            day = scanner.nextInt();
            System.out.println("nhập tháng :");
            month = scanner.nextInt();
            System.out.println("nhập năm :");
            year = scanner.nextInt();
        } while (day < 0 || month <0 || year <0);

    }
}
