package testter;

public class De_Quy {
    // tìm giá trị của dãy fibonaci ở vị trí num
    public static int fibonacci(int num) {
        if (num == 1 || num ==2){
            return 1;
        } else
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5));

    }
}
