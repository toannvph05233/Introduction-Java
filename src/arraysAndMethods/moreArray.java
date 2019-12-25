package arraysAndMethods;

import java.util.Scanner;

public class moreArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[4];
        System.out.println("nhập giá trị cho mảng :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("giá trị " + i);
            arr[i] = scanner.nextInt();
        }

        System.out.println("nhập số muốn thêm : ");
        int number = scanner.nextInt();

        System.out.println("nhập vị trí muốn chèn :");
        int indext = scanner.nextInt();

        System.out.println(more(arr,indext,number)[0] + " - " + more(arr,indext,number)[1] + " - " + more(arr,indext,number)[2] + " - " + more(arr,indext,number)[3] + " - " + + more(arr,indext,number)[4] );
    }

    public static int[] more(int[] arr, int indext, int number) {
        int[] array = new int[arr.length + 1];
        int k = arr.length-1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (i == indext) {
                array[i] = number;
                k--;
            } else {
                if (i >= 0 && k >= 0) {
                    array[i] = arr[k];
                    k--;
                }
            }
        }
        return  array;
    }

}
