package IntroductionJava.for_Whith;

import java.util.Scanner;

public class gameDisplayGeometric {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the rectangle");
        System.out.println("3. Draw the Reverse triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Draw the triangle");
                String str = "";
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j <= i; j++) {
                        str += " * ";
                    }
                    str += "\n";
                }
                System.out.println(str);
                break;
            case 2:
                System.out.println("Draw the rectangle");
                String str3 = "";
                for (int i = 10; i > 0; i--) {
                    for (int j = 0; j < 10; j++) {
                        str3 += " * ";
                    }
                    str3 += "\n";
                }
                System.out.println(str3);
                break;
            case 3:
                System.out.println("Draw the Reverse triangle");
                String str2 = "";
                for (int i = 10; i > 0; i--) {
                    for (int j = 0; j < i; j++) {
                        str2 += " * ";
                    }
                    str2 += "\n";
                }
                System.out.println(str2);
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
}

