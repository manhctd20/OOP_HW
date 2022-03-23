import java.util.Scanner;

public class StackArray {

  static int curren_size = -1;

  static int MAX_SIZE = 100;

  static int stack[] = new int[MAX_SIZE];

  /* kiểm tra stack rỗng */
  public static boolean isEmpty() {
    return (curren_size == -1);
  }

  public static boolean isFull() {

    return (curren_size == MAX_SIZE);
  }

  /* hàm thêm phần tử vào Stack */
  static void push(int data) {

    if (!isFull()) {

      curren_size++;

      stack[curren_size] = data;
    }

    else {
      System.out.println("Stack day");
    }
  }

  public static int top() {
    int data;
    if (!isEmpty()) {
      data = stack[curren_size];
      return data;
    } else {
      System.out.println("Stack rong");
      return 0;
    }
  }

  public static int pop() {
    int data;
    if (!isEmpty()) {
      data = stack[curren_size];
      curren_size--;
      return data;
    } else{
      System.out.println("Stack rong");
      return 0;
    }
  }

  static void hienthi() {
    if (!isEmpty()) {
      System.out.println("Cac phan tu cua Stack: ");
      for (int i = 0; i <= curren_size; i++) {
        System.out.print(stack[i] + "\t");
      }
    } else {
      System.out.println("Stack rong");
    }
  }

  public static void main(String[] args) {
    int lc;

    //Danh sach cac so bao gom: 10, 11, 12, 13, 14, 15, 16
    for (int i = 10; i <= 16; i++) {
    push(i);
    }
    do {
      System.out.println("\n\t\t ============== Menu ==============");
      System.out.println("\t1. Hien thi phan tu cua Stack");
      System.out.println("\t2. Hien thi phan tu dau Stack");
      System.out.println("\t3. Xoa phan tu dau Stack");
      System.out.println("\t0. Ket thuc");
      System.out.println("\n\n\t\t ============== End ==============");
      System.out.println("\nNhap lua chon ban muon chon: ");
      try (Scanner sc = new Scanner(System.in)) {
        lc = sc.nextInt();
      }
      switch (lc) {
        case 0:
          break;
        case 1:
          hienthi();
          break;
        case 2:
          top();
          if (!isEmpty()) {
          System.out.println("Phan tu dau tien trong Stack: "+top());
          }
          break;
        case 3:
          pop();
          if (!isEmpty()) {
            System.out.println("Xoa phan tu top thanh cong !!!");
            System.out.println("Cac phan tu cua Stack sau khi xoa: ");
            for (int i = 0; i <= curren_size; i++) {
              System.out.print(stack[i] + "\t");
            }
          }
          break;
        default:
          System.out.println("\nNhap sai, vui long nhap lai!");
      }
    } while(lc < 0);
  }
}
