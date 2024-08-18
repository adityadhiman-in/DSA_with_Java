//Stack height = log(n)

package Recursion;

public class XToPowerNII {
    public static int PowerCalc(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return PowerCalc(x, n / 2) * PowerCalc(x, n / 2);
        } else {
            return PowerCalc(x, n / 2) * PowerCalc(x, n / 2) * x;
        }

    }

    public static void main(String[] args) {
        System.out.println(PowerCalc(10, 2));
    }
}
