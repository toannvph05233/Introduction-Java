package IntroductionJava;

import java.util.Scanner;

public class numbersIntoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số bạn muốn chuyển đổi :");
        int number = scanner.nextInt();

        if (number > 100) {
            int so_tram = number / 100;
            int so_chuc = (number - (so_tram * 100)) / 10;
            int so_don_vi = number - (so_tram * 100) - (so_chuc * 10);
            switch (so_tram) {
                case 1:
                    System.out.println(" một ");
                    break;
                case 2:
                    System.out.println(" hai ");
                    break;
                case 3:
                    System.out.println(" ba ");
                    break;
                case 4:
                    System.out.println(" bốn ");
                    break;
                case 5:
                    System.out.println(" năm ");
                    break;
                case 6:
                    System.out.println(" sáu ");
                    break;
                case 7:
                    System.out.println(" bảy ");
                    break;
                case 8:
                    System.out.println(" tám ");
                    break;
                case 9:
                    System.out.println(" chín ");
                    break;
            }
            switch (so_chuc) {
                case 1:
                    System.out.println(" một ");
                    break;
                case 2:
                    System.out.println(" hai ");
                    break;
                case 3:
                    System.out.println(" ba ");
                    break;
                case 4:
                    System.out.println(" bốn ");
                    break;
                case 5:
                    System.out.println(" năm ");
                    break;
                case 6:
                    System.out.println(" sáu ");
                    break;
                case 7:
                    System.out.println(" bảy ");
                    break;
                case 8:
                    System.out.println(" tám ");
                    break;
                case 9:
                    System.out.println(" chín ");
                    break;
            }
            switch (so_don_vi) {
                case 1:
                    System.out.println(" một ");
                    break;
                case 2:
                    System.out.println(" hai ");
                    break;
                case 3:
                    System.out.println(" ba ");
                    break;
                case 4:
                    System.out.println(" bốn ");
                    break;
                case 5:
                    System.out.println(" năm ");
                    break;
                case 6:
                    System.out.println(" sáu ");
                    break;
                case 7:
                    System.out.println(" bảy ");
                    break;
                case 8:
                    System.out.println(" tám ");
                    break;
                case 9:
                    System.out.println(" chín ");
                    break;
            }
        }

    }

}
