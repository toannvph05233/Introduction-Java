package IntroductionJava.for_Whith;

public class displayGeometric {
    public static void main(String[] args) {
        String str = "";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                str += " * ";
            }
            str += "\n";
        }
        System.out.println(str);
        String str2 = "";
        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                str2 += " * ";
            }
            str2 += "\n";
        }
        System.out.println(str2);
        String str3 = "";
        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < 10; j++) {
                str3 += " * ";
            }
            str3 += "\n";
        }
        System.out.println(str3);
    }

}
