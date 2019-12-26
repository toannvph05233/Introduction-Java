package Luyen_Tap;

import java.util.Scanner;

public class Nguoi {
    String name;
    String address;
    int birthday;

    public Nguoi() {

    }

    public Nguoi(String name, String address, int birthday) {
        this.name = name;
        this.address = address;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public void enterInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên :");
        this.name = scanner.nextLine();
        System.out.println("Nhập địa chỉ sinh viên :");
        this.address = scanner.nextLine();
        System.out.println("Nhập ngày sinh sinh viên :");
        // chưa hiểu : khác phục tình trạnh trôi lệnh
        this.birthday = Integer.parseInt(scanner.nextLine());

    }

    public void display() {
        System.out.println("họ tên :" + this.name);
        System.out.println("địa chỉ :" + this.address);
        System.out.println("năm sinh :" + this.birthday);
    }

}
