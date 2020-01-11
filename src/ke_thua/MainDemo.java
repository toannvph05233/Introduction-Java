package ke_thua;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class MainDemo extends Rectangle {
    public static void main(String[] args) {
        Rectangle[] rec = new Rectangle[4];

        rec[0] = new Rectangle(8., 10);
        rec[1] = new Rectangle(7., 11);
        rec[2] = new Rectangle(2., 6);
        rec[3] = new Rectangle(4., 5);

        sortByLength(rec);
        sortByWidth(rec);

        System.out.println("");

        Rectangle[] rec2 = array_Increase(rec);

        System.out.println("");

        sortByLength(rec2);
        sortByWidth(rec2);


    }

    static void sortByLength(Rectangle[] rec) {
        System.out.println("sắp xếp theo Length :");
        SortByLength sort_ByLength = new SortByLength();
        Arrays.sort(rec, sort_ByLength);

        for (Rectangle x : rec) {
            System.out.println(x);
        }
    }

    static void sortByWidth(Rectangle[] rec) {
        System.out.println("");
        System.out.println("sắp xếp theo Width :");
        SortByWidth sort_ByWidth = new SortByWidth();
        Arrays.sort(rec, sort_ByWidth);

        for (Rectangle x : rec) {
            System.out.println(x);
        }

    }

    static Rectangle[] array_Increase(Rectangle[] rec) {

        Scanner scanner = new Scanner(System.in);
        Rectangle[] arraynew = new Rectangle[rec.length];

        for (int i = 0; i < rec.length; i++) {
            double inc = rec[i].increase(scanner);
            rec[i].resize(inc);
            arraynew[i].setWidth(rec[i].getWidth() * inc);
            arraynew[i].setLength(rec[i].getLength() * inc);
        }
        return arraynew;
    }

}

