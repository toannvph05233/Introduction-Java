package Luyen_Tap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class testMainSort {
    public static void main(String[] args) {
        SinhVien[] arr = new SinhVien[2];
        for (int i = 0; i < 2; i++) {
            SinhVien sv = new SinhVien();
            sv.enterInformation();
            arr[i] = sv;
        }

        System.out.println("chưa sắp xếp : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i].display();
        }

        SortByID sortByID = new SortByID();
        Arrays.sort(arr, sortByID);
        System.out.println("đã sắp xếp theo id :");
        for (int i = 0; i < arr.length; i++) {
            arr[i].display();
        }
    }
}
