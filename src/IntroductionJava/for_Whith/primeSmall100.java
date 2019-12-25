package IntroductionJava.for_Whith;

public class primeSmall100 {
    public static void main(String[] args) {
        for (int i = 2; i < 101; i++) {

            if (check_Prime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean check_Prime(int num) {
        for (int j = 2; j < num; j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }
}
