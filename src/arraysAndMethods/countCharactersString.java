package arraysAndMethods;

import java.util.Scanner;

public class countCharactersString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi để đém ký tự :");
        String str = scanner.nextLine();

        System.out.println("nhập ký tự muốn tìm kiếm :");
        String characters = scanner.nextLine();
        int cout = 0;
        for (int i = 0; i < str.length(); i++) {
            System.out.println(String.valueOf(str.charAt(i)));

            if (String.valueOf(str.charAt(i)).equals(characters)) {
                cout ++;
            }
        }
        System.out.println("ký tự " + characters + " hiển thị số lần = " + cout);

    }
}
