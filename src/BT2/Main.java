package src.BT2;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Bài 1: Nhập điểm của học sinh và xếp loại
        System.out.print("Nhập điểm của học sinh: ");
        double diem = sc.nextDouble();
        //Xếp loại học sinh bằng if - else
        if (diem >= 8) {
            System.out.println("Xếp loại giỏi");
        } else if (diem >= 6.5) {
            System.out.println("Xếp loại khá");
        } else if (diem >= 5) {
            System.out.println("Xếp loại trung bình");
        } else if (diem >= 3.5) {
            System.out.println("Xếp loại yếu");
        } else {
            System.out.println("Xếp loại kém");
        }
        // Xếp loại theo switch case
        int xepLoai;
        if (diem >=8) {
            xepLoai = 1;
        } else if (diem >=6.5) {
            xepLoai = 2;
        } else if (diem >=5) {
            xepLoai = 3;
        } else if (diem >= 3.5) { 
            xepLoai =4;
        }else {
                xepLoai = 5;
            }
        
        switch (xepLoai) {
            case 1 : System.out.println("Xếp loại giỏi");
            break;
            case 2 : System.out.println("Xếp loại khá");
            break;
            case 3 : System.out.println("Xếp loại trung bình");
            break;
            case 4 : System.out.println("Xếp loại yếu"); 
            break;
            default : System.out.println("Xếp loại kém");
                  
        }
        // Bài 2: Kiểm tra số nguyên chẵn/lẻ
        System.out.print("Nhập một số nguyên: ");
        int n = sc.nextInt(); 

        // // Sử dụng if-else kiểm tra chẵn lẻ
        if (n % 2 == 0) {
            System.out.println(n + " là số chẵn");
        } else {
            System.out.println(n + " là số lẻ");
        }

        // Sử dụng switch-case kiểm tra chẵn/lẻ 
        switch (n % 2) {
            case 0:
                System.out.println("Số chẵn");
                break;
            case 1:
            case -1:
                System.out.println("Số lẻ");
                break;
        }

        sc.close();
    
    }

}