package src.BT6;

public class Caculate {
    //tính tổng số chẵn 1 đến n
   public static int sumOfEvenNumber(int n) {
        int sum = 0;
        for (int i = 1; i <=n; i = i + 1) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
   }
   //check so nguyen to
   public static void checkPrimeNumber(int n) {
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
            System.out.println( n + " la so nguyen to");
        } else {
            System.out.println( n + " khong la so nguyen to");
        }
   }

//    public static void factorial(int soTinhGiaiThua) {
//         long giaiThua = 1;
//         int i = 1;
//         while(i <= soTinhGiaiThua) {
//             giaiThua *= i;
//             i++;
//         }
//         System.out.println("Giai thừa của " + soTinhGiaiThua + " là: " + giaiThua);
//   }
   //tinh giai thua
    public static long factorial(int soTinhGiaiThua) {
        long giaiThua = 1;
        int i = 1;
        while(i <= soTinhGiaiThua) {
            giaiThua *= i;
            i++;
        } 
        return giaiThua;
    }
}

