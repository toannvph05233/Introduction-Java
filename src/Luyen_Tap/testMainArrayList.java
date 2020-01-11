package Luyen_Tap;

import Luyen_Tap.Clotrolor.Cotrolor;

import java.util.ArrayList;
import java.util.Scanner;

public class testMainArrayList extends Cotrolor {
    public static void main(String[] args) {
        ArrayList<SinhVien> arr = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn nhập bao nhiêu sinh viên :");
        int Final = scanner.nextInt();
        for (int i = 0; i < Final; i++) {
            SinhVien sv = new SinhVien();
            sv.enterInformation();
            arr.add(sv);
        }
        displaySV(arr);

        int num = menu(scanner);
        switch (num) {
            case 1:
                addNewArray(arr);
                displaySV(arr);
                break;
            case 2:
                suaThongTinSV(scanner,arr);
                displaySV(arr);
                break;
            case 3:
                remove(arr,scanner);
                displaySV(arr);
                break;
            case 4:
                scanner.nextLine();
                seach(arr,scanner);
                break;
            case 5:
                break;
        }

    }
    public static void displaySV(ArrayList array){
        for (int i = 0; i < array.size(); i++) {
            SinhVien sv2 = new SinhVien();
            sv2 = (SinhVien) array.get(i);
            sv2.display();
        }
    }

}
