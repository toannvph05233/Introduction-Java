package queueAndStack;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Dao_Nguoc_Phan_Tu extends Stack {
    private static int num;


    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        Stack<String> stackNew = new Stack();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị tối đa");
        num = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.println("bạn nhập giá trị thứ : " + i);
            stack.push(scanner.nextLine());
        }
            System.out.println("khi chưa hoán đổi");
            System.out.println(stack);

        for (int i = 0; i < num; i++) {
            stackNew.push(stack.pop());
        }
        System.out.println("khi đã hoán đổi");
        System.out.println(stackNew);
    }
}
