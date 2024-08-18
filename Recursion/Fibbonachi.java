package Recursion;

public class Fibbonachi {
    public static int fibbonachiGenerator(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibbonachiGenerator(n - 1) + fibbonachiGenerator(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibbonachiGenerator(10));
    }
}
