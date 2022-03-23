import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class bai2_w2 {
    public static int[][] Array1;
    public static int[][] Array2;

    public static void main(String[] agrs) throws Exception {
        Scanner sc = new Scanner(new BufferedReader(new FileReader("data.txt")));
        int rows = 3;
        int columns = 3;

        Array1 = new int[rows][columns];
        Array2 = new int[rows][columns];

        while (sc.hasNextLine()) {
            for (int i = 0; i < Array1.length * 2; i++) {
                String[] line = sc.nextLine().trim().split(" ");
                for (int j = 0; j < line.length; j++) {
                    if (i < rows) {
                        Array1[i][j] = Integer.parseInt(line[j]);
                    } else {
                        Array2[i - rows][j] = Integer.parseInt(line[j]);
                    }

                }
            }
        }

        System.out.println("Ma tran A: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(Array1[i][j] + "\t");
            }
            System.out.println("\n");
        }

        System.out.println("Ma tran B: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(Array2[i][j] + "\t");
            }
            System.out.println("\n");
        }

        int T[][] = new int[rows][columns];
        // tính và in ra ma trận T = A + B
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                T[i][j] = Array1[i][j] + Array2[i][j];
            }
        }

        // hiển thị ma trận tổng T
        System.out.println("Ma tran tong T: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(T[i][j] + "\t");
            }
            System.out.println("\n");
        }

        int C[][] = new int[rows][columns];
        // tính và in ra ma trận C = A * B
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                C[i][j] = 0;
                for (int k = 0; k < columns; k++) {
                    C[i][j] = C[i][j] + Array1[i][k] * Array2[k][j];
                }
            }
        }
        // hiển thị ma trận tích C
        System.out.println("Ma tran tich C: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println("\n");
        }

        // tìm ma trận D là ma trận chuyển vị của ma trận C
        // ma trận D là ma trận chuyển vị của ma trận C
        // thì các dòng của ma trận C sẽ trở thành
        // các cột của ma trận D và ngược lại
        // ví dụ: ma trận C có số dòng rows = 3 và số cột columns = 4 thì
        // ma trận D sẽ có số dòng rows = 4 và số cột columns = 3
        int D[][] = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                D[j][i] = C[i][j];
            }
        }

        // hiển thị ma trận D
        System.out.println("Ma tran chuyen vi cua ma tran C la: ");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(D[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}