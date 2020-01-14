package JavaCollectionsFramework;

import java.util.HashMap;
import java.util.Scanner;

public class Tu_Dien {
    public static void main(String[] args) {
        int luachon;
        HashMap<String, String> tudien = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("--------Menu---------");
            System.out.println("1  thêm từ ");
            System.out.println("2  dịch từ ");
            System.out.println("3  hiển thị danh sách ");
            System.out.println("4  thoát ");
            System.out.println("----------------------");
            System.out.println("mời bạn chọn :");
            luachon = scanner.nextInt();

            switch (luachon) {
                case 1:
                    scanner.nextLine();
                    System.out.println("nhập tiếng anh");
                    String english = scanner.nextLine();
                    System.out.println("nhập tiếng việt");
                    String tiengviet = scanner.nextLine();
                    tudien.put(english, tiengviet);
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("tìm kiếm từ :");
                    String timkiem = scanner.nextLine();
                    if (tudien.containsKey(timkiem)) {
                        System.out.println(tudien.get(timkiem));
                    } else {
                        System.out.println("từ không có trong từ điển");
                    }
                    break;
                case 3:
                    for (int i =0; i<tudien.size();i++){
                        System.out.println(tudien.entrySet());
                    }
                    break;
                case 4:
                    break;
            }

        } while (luachon != 4);
    }
}



