package src.BT7;

import java.util.Scanner;

// Lớp chứa các hàm tiện ích quản lý sinh viên
public class StudentUtils {
    public static Scanner sc = new Scanner(System.in);

    // Hàm nhập số lượng sinh viên
    public static int inputN() {
        System.out.print("Nhap so luong sinh vien : ");
        int n = sc.nextInt();
        sc.nextLine();
        return n;
    }

    // Hàm nhập danh sách sinh viên
    public static Student[] inputStudents(int n) {
        Student[] arr = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("== Nhap sinh vien thu " + (i + 1));
            System.out.print("  Ten: ");
            String name = sc.nextLine();
            double score;
            while (true) {
                System.out.print("  Diem (0..10): ");
                score = sc.nextDouble();
                sc.nextLine();
                if (score >= 0 && score <= 10) break;
                System.out.println(" Diem khong hop le, nhap lai!");
            }
            arr[i] = new Student(name, score);
        }
        return arr;
    }

    // Hàm in danh sách
    public static void printStudents(Student[] arr) {
        System.out.println("\n--- Danh sach sinh vien ---");
        System.out.printf("%-3s | %-25s | %-5s%n", "STT", "Ten", "Diem");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%-3d | %-25s | %-5.2f%n", i + 1, arr[i].name, arr[i].score);
        }
    }

    // Hàm tìm sinh viên điểm cao nhất
    public static Student topStudent(Student[] arr) {
        Student best = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].score > best.score) best = arr[i];
        }
        return best;
    }

    // Hàm tìm sinh viên điểm thấp nhất
    public static Student lowestStudent(Student[] arr) {
        Student worst = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].score < worst.score) worst = arr[i];
        }
        return worst;
    }

    // Hàm tính điểm trung bình
    public static double averageScore(Student[] arr) {
        double sum = 0;
        for (Student s : arr) sum += s.score;
        return sum / arr.length;
    }

    // Hàm xếp loại
    public static String classify(double score) {
        if (score >= 8.0) return "Gioi";
        if (score >= 6.5) return "Kha";
        if (score >= 5.0) return "Trung binh";
        return "Yeu";
    }

    // Hàm in bảng xếp loại
    public static void printClassification(Student[] arr) {
        System.out.println("\n--- Xep loai hoc luc ---");
        System.out.printf("%-25s | %-5s | %-12s%n", "Ten", "Diem", "Xep loai");
        for (Student s : arr) {
            System.out.printf("%-25s | %-5.2f | %-12s%n", s.name, s.score, classify(s.score));
        }
    }
}

// Lớp Student để lưu tên và điểm
class Student {
    String name;
    double score;

    Student(String name, double score) {
        this.name = name;
        this.score = score;
    }
}

