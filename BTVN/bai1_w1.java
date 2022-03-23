/* Bài 1: Viết chương trình nhập vào một dãy số nguyên từ dang số dòng lệnh; hiển thị; và sắp xếp dãy số đó. */

import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {
        int n, i, tempSort;

        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("Nhap vao so phan tu cua mang: ");
                n = sc.nextInt();
            } while (n < 0);

            // khởi tạo và cấp phát bộ nhớ cho mảng
            int array[] = new int[n];

            System.out.println("Nhap cac phan tu vao mang: ");
            for (i = 0; i < n; i++) {
                System.out.print("Nhap phan tu thu " + i + ": ");
                array[i] = sc.nextInt();
            }

            System.out.println("----------------------------");
            // Hiển thị mảng vừa nhập
            System.out.println("\nMang ban dau: ");
            for (i = 0; i < n; i++) {
                System.out.print(array[i] + "\t");
            }

            System.out.println("\n");

            // sắp xếp theo thứ tự tăng dần
            for (i = 0; i < n - 1; i++) {
                for (int j = i + 1; j > i + 1; j++) {
                    if (array[i] < array[j]) {
                        tempSort = array[j];
                        array[j] = array[i];
                        array[i] = tempSort;
                    }
                }
            }
            System.out.println("Mang sau khi duoc sap xep tang dan la: ");
            for (i = 0; i < n; i++) {
                System.out.print(array[i] + "\t");
            }

            System.out.println("\n");
            // sắp xếp theo thứ tự giảm dần
            for (i = 0; i < n - 1; i++) {
                for (int j = i + 1; j <= n - 1; j++) {
                    if (array[i] < array[j]) {
                        tempSort = array[i];
                        array[i] = array[j];
                        array[j] = tempSort;
                    }
                }
            }
            System.out.println("Mang sau khi duoc sap xep giam dan la: ");
            for (i = 0; i < n; i++) {
                System.out.print(array[i] + "\t");
            }
        }
    }
}