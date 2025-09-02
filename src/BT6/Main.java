package src.BT6;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        System.out.println("=== Giai bai tap 6 ===");
        System.out.println("1. Tinh tong cac so chan");
        System.out.println("2. Kiem tra so nguyen to");
        System.out.println("3. Tinh giai thua cua mot so nguyen");
        System.out.print("Ban hay chon (1-3): ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:{    
                // Tính tổng các số chắn từ 1 đến n
                System.out.println("Nhap vao so tu man hinh de tinh tong: ");
                int giaTri = sc.nextInt();
                int ketQua = Caculate.sumOfEvenNumber(giaTri);
                System.out.println("Ket qua sau khi tinh toan la: " + ketQua);
                break;
            }
            case 2: {
                //Kiểm tra số nguyên tố
                System.out.print("Nhap mot so nguyen : ");
                int n = sc.nextInt();
                Caculate.checkPrimeNumber(n);
                break;

            }
            case 3: {
                // //Tính giai thừa của số
            // Scanner sc = new Scanner(System.in);
            // System.out.print("Nhập một số nguyên để tính giai thừa: ");
            // int soTinhGiaiThua = sc.nextInt();
            // Caculate.factorial(soTinhGiaiThua);
            // sc.close();
                System.out.print("Nhap vao 1 so nguyen de tinh giai thua: ");
                int soTinhGiaiThua = sc.nextInt();
                long giaiThua = Caculate.factorial(soTinhGiaiThua);
                System.out.println("Giai thua cua so" + soTinhGiaiThua + "la: " + giaiThua);
                break;
            }
            default: {
                System.out.println("Lua chon khong hop le!");
            }
        sc.close();
        }
    }
}
