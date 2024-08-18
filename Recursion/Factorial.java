package Recursion;

public class Factorial {
    public static int factorialCalc(int n) {
        if (n == 0) {
            return 1;
        }
        int factorial = n * factorialCalc(n - 1);
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println(factorialCalc(5));
    }
}
