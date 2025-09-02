package src.BT8;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Tim so nguyen to trong khoang [A, B] ===");

        do {
            int a = PrimeUtils.inputInt("Nhap A: ");
            int b = PrimeUtils.inputInt("Nhap B: ");
            PrimeUtils.printPrimesCountSum(a, b);
        } while (PrimeUtils.askContinue());

        System.out.println("Ket thuc chuong trinh.");
    }
}

