package src.BT4;

public class Main {
    public static void main(String[] args) {
        // Tạo mảng
        int[] mang = {5, 3, 9, 1, 7};
        timSoLonNhatVaNhoNhat(mang);
        double tinhTrungBinhCong = tinhTrungBinhCong(mang);
        // System.out.println("Ben ngoai Trung bình cộng của mảng là: " + tinhTrungBinhCong);
        inRaTinhTrungBinhCong(tinhTrungBinhCong);

    }

    public static void inRaTinhTrungBinhCong(double tinhTrungBinhCong) {
        System.out.println("Ben trong  Trung bình cộng của mảng là: " + tinhTrungBinhCong);
    }

    public static void timSoLonNhatVaNhoNhat(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Mảng rỗng!");
            return;
        }
        int soLonNhat = arr[0];//mảng[vị trí]
        int soNhoNhat = arr[0];
        
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > soLonNhat) {
                soLonNhat = arr[i];
            }
            if (arr[i] < soNhoNhat) {
                soNhoNhat = arr[i];
            }
        }
        System.out.println("Mảng: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Số lớn nhất trong mảng: " + soLonNhat);
        System.out.println("Số nhỏ nhất trong mảng: " + soNhoNhat);
    }

    public static double tinhTrungBinhCong(int[] arr) {
        int tong = 0;
        for (int i = 0; i < arr.length; i++) {
            tong += arr[i];  // Cộng dồn từng phần tử
        }
        double trungBinh = (double) tong / arr.length;
        
        return trungBinh;
    }
}

