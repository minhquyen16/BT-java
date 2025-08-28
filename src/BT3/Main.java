package src.BT3;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        // Tính tổng các số chắn từ 1 đến 100
        int sum = 0;
        for (int i = 1; i <=100; i = i + 1) {
            if (i % 2 == 0) {
                sum = sum + i;
                // sum += i;
            }
        }
        System.out.println("Tổng các số chẵn từ 1 đến 100 là :" + sum);
        //Kiểm tra số nguyên tố
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một số nguyên : ");
        int n = sc.nextInt();
        boolean laSoNguyenTo = true;
        if (n < 2) {
            laSoNguyenTo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    laSoNguyenTo = false;
                    break;
                }
            }
      
        }
        if (laSoNguyenTo) {
            System.out.println( n + " là số nguyên tố");
        } else {
            System.out.println( n + " không là số nguyên tố");
        }
        //Tính giai thừa của số
        System.out.print("Nhập một số nguyên để tính giai thừa: ");
        int a = sc.nextInt();
        long giaiThua = 1;
        int i = 1;
        while(i <= n) {
            giaiThua *= i;
            i++;
        }
        System.out.println("Giai thừa của " + a + " là: " + giaiThua);
        sc.close();
    }
 
}
