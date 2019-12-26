package Luyen_Tap;

public class main {
    public static void main(String[] args) {
        SinhVien[] arr = new SinhVien[2];
        for (int i=0;i<2;i++) {
            SinhVien sv = new SinhVien();
            sv.enterInformation();
            arr[i] = sv;
        }
        for (int i =0 ; i<arr.length;i++){
            arr[i].display();
        }
    }
}
