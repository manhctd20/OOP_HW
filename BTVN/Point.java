import java.lang.Math;
import java.util.Scanner;

public class Point {
    private double x;
    private double y;

    public Point() {

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // phuong thuc kiem tra thang hang
    public static boolean ktthanghang(Point a, Point b, Point c) {
        double c1 = khoangcach(a, b);
        double c2 = khoangcach(a, c);
        double c3 = khoangcach(b, c);
        if (c1 + c2 == c3 || c1 + c3 == c2 || c2 + c3 == c1)
            return true;
        else
            return false;
    }

    // phương thức tinh khoang cach
    public static double khoangcach(Point a, Point b) {
        double c = Math.sqrt(Math.pow((a.x - b.x), 2) + Math.pow((a.y - b.y), 2));
        return c;
    }

    // phuong thuc dien tich
    public static double dientich(Point a, Point b, Point c) {
        double d = 0.5 * (Math.abs((b.x - a.x) * (c.y - a.y) - (c.x - a.x) * (b.y - a.y)));
        return d;
    }

    public static double chuvi(Point a, Point b, Point c) {
        double e = khoangcach(a, b) + khoangcach(a, c) + khoangcach(c, b);
        return e;
    }

    // Main
    public static void main(String[] args) {
        Point a = new Point();
        Point b = new Point();
        Point c = new Point();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nhap gia tri cua x point 1: ");
            a.x = sc.nextDouble();
            System.out.println("Nhap gia tri cua y point 1: ");
            a.y = sc.nextDouble();
            System.out.println("Nhap gia tri cua x point 2: ");
            b.x = sc.nextDouble();
            System.out.println("Nhap gia tri cua y point 2: ");
            b.y = sc.nextDouble();
            System.out.println("Nhap gia tri cua x point 3: ");
            c.x = sc.nextDouble();
            System.out.println("Nhap gia tri cua y point 3: ");
            c.y = sc.nextDouble();
        }
        System.out.println("3 diem ban vua nhap la: a(" + a.x + " , " + a.y + ") b(" + b.x + " , " + b.y + ") c(" + c.x
                + " , " + c.y + ")");
        // Main kiem tra 3 diem thang hang
        if (Point.ktthanghang(a, b, c) == true)
            System.out.println("-Ba diem tren thang hang ");
        else
            System.out.println("3 diem khong thang hang");

        // Main tinh khoang cach giua cac diem
        System.out.println("-Khoang cach giua 2 diem a va b la: " + Point.khoangcach(a, b));
        System.out.println("-Khoang cach giua 2 diem a va c la: " + Point.khoangcach(a, c));
        System.out.println("-Khoang cach giua 2 diem b va c la: " + Point.khoangcach(b, c));

        System.out.println("-Dien tich tam giac ABC la: " + Point.dientich(a, b, c));
        System.out.println("-Chu vi tam giac ABC la:" + Point.chuvi(a, b, c));

    }

}
