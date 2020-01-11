package Luyen_Tap.Clotrolor;

import Luyen_Tap.SinhVien;

import java.util.ArrayList;
import java.util.Scanner;

public class Cotrolor {
    public static int menu(Scanner scanner) {
        System.out.println("----------------Menu----------------");
        System.out.println("1 - Thêm mới sinh viên");
        System.out.println("2 - Sửa sinh viên");
        System.out.println("3 - xóa sinh viên");
        System.out.println("4 - tìm kiếm sinh viên");
        System.out.println("5 - thoát");
        return scanner.nextInt();
    }


    public static void addNewArray(ArrayList arr) {
        SinhVien sinhVien = new SinhVien();
        sinhVien.enterInformation();
        arr.add(sinhVien);
    }

    public static void suaThongTinSV(Scanner scanner, ArrayList arr) {
        SinhVien sinhVien = new SinhVien();
        System.out.println("nhập vị trí muốn sửa");
        int vitri = scanner.nextInt();
        scanner.nextInt();
        sinhVien = (SinhVien) arr.get(vitri);
        System.out.println("tên sinh viên : " + sinhVien.getName());
        sinhVien.setName(scanner.nextLine());
        System.out.println("địa chỉ sinh viên : " + sinhVien.getAddress());
        sinhVien.setAddress(scanner.nextLine());
        System.out.println("năm sinh sinh viên : " + sinhVien.getBirthday());
        sinhVien.setBirthday(scanner.nextInt());
        System.out.println("mã sinh viên : " + sinhVien.getMaSV());
        sinhVien.setMaSV(scanner.nextLine());
        System.out.println("điểm môn toán sinh viên : " + sinhVien.getPointM());
        sinhVien.setPointM(scanner.nextDouble());
        System.out.println("điểm môn lý sinh viên : " + sinhVien.getPointP());
        sinhVien.setPointP(scanner.nextDouble());
        arr.set(vitri, sinhVien);
    }

    public static void remove(ArrayList arr, Scanner scanner) {
        System.out.println("nhập vị trí muốn xóa");
        arr.remove(scanner.nextInt());
    }

    public static void seach(ArrayList arr, Scanner scanner) {
        System.out.println("bạn muốn tìm kiếm sinh viên có id = ");
        SinhVien sinhVien1 = new SinhVien();
        String seachID = scanner.nextLine();
        System.out.println(seachID);
        for (int i = 0; i < arr.size(); i++) {
            sinhVien1 = (SinhVien) arr.get(i);
            System.out.println(sinhVien1.getMaSV() + "aaaaaaaaaaaaaaaaaaaaaaaaaa");
            if (sinhVien1.getMaSV().equals(seachID)) {
                sinhVien1.display();
            }
        }
        System.out.println("không thấy j thì không tìm được");
    }
}
