package JavaCollectionsFramework;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Dem_So_Tu_Trong_Chuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bạn nhập 1 đoạn văn bản muốn đếm");
        String str = scanner.nextLine();
        String[] str1 = str.split(" ");

        HashMap<String, Integer> demTu = new HashMap<>();

        for (int i = 0; i < str1.length; i++) {

            Set<String> setKey = demTu.keySet();
            System.out.println(setKey + "--");

            if (!isKiemTraTrung(setKey, str1[i])) {
                int cout = 0;
                for (int j = i; j < str1.length; j++) {
                    if (str1[i].equals(str1[j])) {
                        cout++;
                    }
                }
                demTu.put(str1[i], cout);
            }
        }
        for (String x : str1) {
            System.out.println(x);
        }
        System.out.println(demTu);
    }

    public static boolean isKiemTraTrung(Set<String> set, String string) {
        for (String x : set) {
            if (x.equals(string)) {
                return true;
            }
        }
        return false;
    }
}
