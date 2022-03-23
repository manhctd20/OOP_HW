/* Bài 2: Viết lớp Java cài đặt thuật toán tìm kiếm nhị phân (Binary Search). */

import java.util.Scanner;

public class bai2 {
    int BinarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] > x) {
                return BinarySearch(arr, l, mid - 1, x);
            }
            return BinarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static void main(String args[]) {

        try (Scanner sc = new Scanner(System.in)) {
            bai2 ob = new bai2();
            int arr[] = { 1, 4, 6, 7, 8, 15, 20, 35, 41 };
            System.out.println("Mang la: ");
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                System.out.print("\t" + arr[i]);
            }
            System.out.println("\n");
            System.out.println("Nhap x can tim kiem: ");
            int x = sc.nextInt();
            int result = ob.BinarySearch(arr, 0, n - 1, x);
            if (result == -1) {
                System.out.println("Phan tu can tim kiem khong ton tai.");
            } else {
                System.out.println("Phan tu can tim kiem tai vi tri: " + result);
            }
        }
    }

}