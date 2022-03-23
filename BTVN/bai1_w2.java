import java.math.BigInteger;

public class bai1_w2 
{
    public static void main(String[] args) {
        BigInteger sum = BigInteger.valueOf(0);

        for (int i = 2; i <= 100; i++) {
            
            sum = sum.add(fibonacci(i)); 
            System.out.print(fibonacci(i) + " ");
        }
        System.out.print("\nTong la: "+sum);
    }
    /**
     * Tinh so Fibonacci thu n
     * 
     * @param n: chi so cua so Fibonacci tinh tu 0
     *           vd: F0 = 0, F1 = 1, F2 = 1, F3 = 2
     * @return So Fibonacci thu n
     */
    public static BigInteger fibonacci(int n) {
        BigInteger f0 = BigInteger.valueOf(0);
        BigInteger f1 = BigInteger.valueOf(1);
        BigInteger fn = BigInteger.valueOf(1);

        if (n < 0) {
            return BigInteger.valueOf(-1);
        } else if (n == 0 || n == 1) {
            return BigInteger.valueOf(n);
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0.add(f1);
            }
        }
        return fn;
    }  
}