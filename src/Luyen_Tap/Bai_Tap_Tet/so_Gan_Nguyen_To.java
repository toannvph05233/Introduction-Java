package Luyen_Tap.Bai_Tap_Tet;

import java.util.Scanner;

public class so_Gan_Nguyen_To {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = nhapDoDaiArr(scanner);
        int[] array1 = nhapArr(scanner,length);
        int[] array2 = arrChuyenDoi(array1);
        display(array1);
        System.out.println("");
        display(array2);

    }

    public static int nhapDoDaiArr(Scanner scanner) {
        System.out.println("Bạn muốn kiểm tra bao nhiêu số :");
        return scanner.nextInt();
    }

    public static int[] nhapArr(Scanner scanner, int length) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.println("hãy nhập số muốn kiểm tra thứ : " + (i+1));
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static boolean isPrime(int num) {
        for (int j = 2; j < num; j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] arrChuyenDoi(int[] arr) {
        int[] array2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1 && isPrime(arr[i]) == true) {
                array2[i] = 1;
            } else {
                array2[i] = 0;
            }
        }
        return array2;
    }

    public static void display(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}