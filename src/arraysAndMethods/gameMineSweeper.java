package arraysAndMethods;

import java.util.Scanner;

public class gameMineSweeper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập giá trị . và * cho game :");
        String[][] array = create_Array(scanner);
        draw_Array(array);
        System.out.println("thành :");
        String[][] array_Number = check_Number(array);
        draw_Array(array_Number);
    }

    public static String[][] create_Array(Scanner scanner) {
        String[][] array = new String[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = scanner.nextLine();
            }
        }
        return array;
    }

    public static String[][] check_Number(String[][] arr) {
        String[][] array2 = new String[3][3];
        int cout = 0 ;
        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j].equals(".")) {
                    if (j < 2 && arr[i][j + 1].equals("*")) {
                        cout ++;
                    }
                    if (i < 2 && arr[i + 1][j].equals("*")) {
                        cout ++;
                    }
                    if (j < 2 && i < 2 && arr[i + 1][j + 1].equals("*")) {
                        cout ++;
                    }
                    if (i >= 1 && j >= 1 && arr[i - 1][j - 1].equals("*")) {
                        cout ++;
                    }
                    if (i >= 1 && j < 2 && arr[i - 1][j + 1].equals("*")) {
                        cout ++;
                    }
                    if (j >= 1 && i < 2 && arr[i + 1][j - 1].equals("*")) {
                        cout ++;
                    }
                    array2[i][j] = String.valueOf(cout);
                } else {
                    array2[i][j] = "*";
                }
            } cout =0;
        }
        return array2;
    }

    public static void draw_Array(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }
}
