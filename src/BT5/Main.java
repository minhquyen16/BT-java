package src.BT5;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("=== TINH DIEN TICH HINH HOC ===");
        System.out.println("1. Hinh chu nhat");
        System.out.println("2. Hinh tron");
        System.out.println("3. Hinh tam giac");
        System.out.print("Ban hay chon (1-3): ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: {
                // S HCN
                System.out.print("Nhap chieu dai a: ");
                double a = sc.nextDouble();

                System.out.print("Nhap chieu rong b: ");
                double b = sc.nextDouble();

                double area = CalculateArea.areaOfRectangle(a, b);

                System.out.println("Dien tich hinh chu nhat = " + area);
                break;
            }
            case 2: {
                // S hình tròn
                System.out.print("Nhap ban kinh r: ");
                double r = sc.nextDouble();

                double area = CalculateArea.areaOfCircle(r);

                System.out.println("Dien tich hinh tron = " + area);
                break; 
            }
            case 3: {
                // S hình tam giác
                System.out.print("Nhap canh a: ");
                double a = sc.nextDouble();

                System.out.print("Nhap canh b: ");
                double b = sc.nextDouble();

                System.out.print("Nhap canh c: ");
                double c = sc.nextDouble();
                Double area = CalculateArea.areaOfTriangle(a, b, c);
                if (area == null) {
                    System.out.println("Ba cạnh không tạo thành tam giác hợp lệ.");
                } else {
                    System.out.println("Dien tich tam giac = " + area);
                }
                break; 
            }
            default: {
                System.out.println("Lua chon khong hop le!");
            }
        }
    sc.close();
    }
}
