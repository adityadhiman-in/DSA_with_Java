package recursion;

public class PrintIncreasing {
    public static void printIncreasing(int n) {
        if (n <= 0) {
            return;
        }
        printIncreasing(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        printIncreasing(10);
    }
}