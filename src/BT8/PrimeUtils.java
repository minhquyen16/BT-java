package src.BT8;

import java.util.Scanner;

public class PrimeUtils {
    public static Scanner sc = new Scanner(System.in);

    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Hàm đảm bảo A <= B
    public static int[] normalizeRange(int a, int b) {
        if (a > b) {
            int t = a; a = b; b = t;
        }
        return new int[]{a, b};
    }

    // Hàm in số nguyên tố, đồng thời đếm và tính tổng
    public static void printPrimesCountSum(int a, int b) {
        int[] r = normalizeRange(a, b);
        a = r[0]; b = r[1];
        int count = 0;
        long sum = 0;
        boolean any = false;

        System.out.print("Cac so nguyen to trong [" + a + ", " + b + "]: ");
        for (int x = a; x <= b; x++) {
            if (isPrime(x)) {
                System.out.print(x + " ");
                count++;
                sum += x;
                any = true;
            }
        }

        if (!any) System.out.print("(khong co)");
        System.out.println();
        System.out.println("-> So luong so nguyen to: " + count);
        System.out.println("-> Tong cac so nguyen to  : " + sum);
    }

    // Hàm nhập 1 số nguyên với label gợi ý
    public static int inputInt(String label) {
        System.out.print(label);
        int v = sc.nextInt();
        sc.nextLine();
        return v;
    }

    // Hàm hỏi người dùng có tiếp tục không
    public static boolean askContinue() {
        System.out.print("\nBan co muon tiep tuc? (Y/N): ");
        String ans = sc.nextLine().trim();
        return ans.equalsIgnoreCase("Y");
    }
}

