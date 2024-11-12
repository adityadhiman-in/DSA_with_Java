public class rotateTwoDArray {
    public static void main(String[] args) {
        int[][] array = { { 1, 2, 3, 4 }, { 6, 7, 8, 9 }, { 5, 7, 1, 3 }, { 9, 6, 4, 3 } };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        for (int i = 0; i < array.length; i++) {
            int start = 0;
            int end = array[i].length - 1;

            while (start < end) {
                int temp = array[i][start];
                array[i][start] = array[i][end];
                array[i][end] = temp;
                start++;
                end--;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }

    }
}