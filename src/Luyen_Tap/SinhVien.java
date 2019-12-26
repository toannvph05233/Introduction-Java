package Luyen_Tap;

import java.util.Scanner;

public class SinhVien extends Nguoi {
    String maSV;
    String maMath = "Math", maPhysical = "Physical";
    double pointM, pointP;
    double mediumScore;

    public SinhVien() {

    }

    public SinhVien(String name, String address, int birthday, String maSV) {
        this.name = name;
        this.address = address;
        this.birthday = birthday;
        this.maSV = maSV;

    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public double getPointM() {
        return pointM;
    }

    public void setPointM(double pointM) {
        this.pointM = pointM;
    }

    public double getPointP() {
        return pointP;
    }

    public void setPointP(double pointP) {
        this.pointP = pointP;
    }

    @Override
    public void enterInformation(){
        super.enterInformation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập mã sinh viên : ");
        this.maSV = scanner.nextLine();
         System.out.println("nhập điểm toán sinh viên : ");
        this.pointM = scanner.nextDouble();
         System.out.println("nhập điểm lý sinh viên : ");
        this.pointP = scanner.nextDouble();

    }

    public void display(){
        super.display();
        System.out.println("mã sinh viên : " + maSV);
        System.out.println("mã môn Toán : " + maMath);
        System.out.println("mã môn Lý : " + maPhysical);
        System.out.println("điểm môn toán : " + pointM);
        System.out.println("điểm môn lý : " + pointP);
        System.out.println("điểm trung bình 2 môn : " + mediumScore);

    }

    public double mediumScore(){
        mediumScore = (pointM+pointP)/2;
        return mediumScore;
    }

}
