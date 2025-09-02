package src.BT7;

public class Main {
    public static void main(String[] args) {
        int n = StudentUtils.inputN();
        if (n <= 0) {
            System.out.println("So luong sinh vien phai > 0");
            return;
        }

        Student[] list = StudentUtils.inputStudents(n);
        StudentUtils.printStudents(list);

        Student best = StudentUtils.topStudent(list);
        Student worst = StudentUtils.lowestStudent(list);
        double avg = StudentUtils.averageScore(list);

        System.out.println("\n--- Thong ke ---");
        System.out.printf("Diem cao nhat: %s (%.2f)%n", best.name, best.score);
        System.out.printf("Diem thap nhat: %s (%.2f)%n", worst.name, worst.score);
        System.out.printf("Diem trung binh ca lop: %.2f%n", avg);

        StudentUtils.printClassification(list);
    }
}
