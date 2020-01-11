package Luyen_Tap.Bai_Tap_Tet;

import java.util.Scanner;

public class kiemTra_Chuoi_DX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập đọ dài chuỗi bạn muốn kiểm tra :");
        String[] array = new String[scanner.nextInt()];
        scanner.nextLine();
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhập ký tự thứ " + (i + 1));
            array[i] = scanner.nextLine();
        }

        if (kiemTra_DX(array) == true) {
            System.out.println("Chuỗi là đỗi xứng");
        } else {
            System.out.println("chuỗi không đối xứng");
        }

    }

    public static boolean kiemTra_DX(String[] arr) {
        int num = (arr.length / 2) - 1;
        System.out.println(num);
        for (int i = 0; i <= num; i++) {
            for (int j = arr.length - 1; j >= num; j--) {
                if (arr[i].equals(arr[j])) {
                    break;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
