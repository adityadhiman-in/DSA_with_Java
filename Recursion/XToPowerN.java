//Stack height = n

package Recursion;

public class XToPowerN {
    public static int calcPower(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int xPowerNMOne = calcPower(x, n - 1);
        int xPowerN = x * xPowerNMOne;
        return xPowerN;
    }

    public static void main(String[] args) {
        int x = 10, n = 4;
        System.out.println(calcPower(x, n));
    }
}
