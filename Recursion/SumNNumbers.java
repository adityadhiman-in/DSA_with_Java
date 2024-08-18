package Recursion;

public class SumNNumbers {
    public static void sumNNumbers(int i, int n, int sum) {
        if (i == n) {
            System.out.print(sum);
            return;
        }
        sum += i;
        sumNNumbers(i + 1, n, sum);
    }

    public static void main(String[] args) {
        sumNNumbers(1, 6, 0);
    }
}
