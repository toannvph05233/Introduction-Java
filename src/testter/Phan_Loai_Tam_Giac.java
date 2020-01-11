package testter;

import java.util.Scanner;

public class Phan_Loai_Tam_Giac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 1, b = 1, c = 1;
        do {
            System.out.println("nhập cạnh a :");
            a = scanner.nextInt();
            System.out.println("nhập cạnh b :");
            b = scanner.nextInt();
            System.out.println("nhập cạnh c :");
            c = scanner.nextInt();
        }
        while (a < 0 || b < 0 || c < 0);

        if (a + b <= c || a + c < b || b + c <= a) {
            System.out.println("không phải tam giác");
        } else if (a == b && b == c) {
            System.out.println("là tam giác đều");
        } else if (a == b && b != c || b == c && c != a) {
            System.out.println("là tam giác cân");
        } else if ((a * a) + (b * b) == (c * c) || (c * c) + (b * b) == (a * a) || (a * a) + (c * c) == (b * b)) {
            System.out.println("là tam giác vuông");
        } else {
            System.out.println("là tam giác thường");
        }

    }
}
