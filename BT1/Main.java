package BT1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //1.Tính diện tích hình chữ nhật
    System.out.println("bai 1: Tinh dien tich hinh chu nhat");
    System.out.print("Nhap chieu dai: ");
    double chieuDai = sc.nextDouble();
    System.out.print("Nhap chieu rong: ");
    double chieuRong = sc.nextDouble();
    double dienTichChuNhat = chieuDai * chieuRong;
    System.out.println("Dien tich hinh chu nhat: " + dienTichChuNhat);
    //2. Tính diện tích hình tròn
    System.out.println("bai 2: Tinh dien tich hinh tron");
    System.out.print("Nhap ban kinh: ");
    double banKinh = sc.nextDouble();
    double dienTichHinhTron = Math.PI * banKinh * banKinh;
    System.out.println("Dien tich hinh tron "+ dienTichHinhTron);
    //3. Tính diện tích hình tam giác 
    System.out.println("bai 3: Tinh dien tich hinh tam giac");
    System.out.print("Nhap canh a: ");
    double a = sc.nextDouble();
    System.out.print("Nhap canh b: ");
    double b = sc.nextDouble();
    System.out.print("Nhap canh c: "); 
    double c = sc.nextDouble();
    double p = (a + b + c) /2;
    double dienTichTamGiac = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    System.out.println("Dien tich hinh tam giac" + dienTichTamGiac);
    sc.close();
    }
}
