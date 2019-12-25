package arraysAndMethods;

import java.lang.reflect.Array;
import java.util.Scanner;


public class sum_Array_Column {
    public static void main(String[] args) {
        double[][] array = drawArray();
        System.out.println(sum_Column(array));
    }

    public static void display_Array(double[][] array){
        System.out.println("Mang la:");
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);
            }
    }
    public static double sum_Diagonal_Line(double[][] arr){
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập cột bạn muốn tính tổng theo đường chéo :");
        int location = scanner.nextInt();
        for (int i = location;i<arr.length;i++){
            for (int j = location;j<arr.length;j++){
                sum += arr[location][location];
            }
        }
        return sum;
    }
    public static double sum_Column(double[][] arr){
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập cột bạn muốn tính tổng :");
        int location = scanner.nextInt();
        for (int i = 0;i<arr.length;i++){
            sum += arr[i][location];
        }
        return sum;
    }

    public static double[][] drawArray() {
        Scanner scanner = new Scanner(System.in);
        double[][] array = new double[2][2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println("nhập giá trị cho hàng " + i + " cột " + j);
                array[i][j] = scanner.nextDouble();
            }
        }
        return array;
    }
}


