import java.util.Scanner;

public class InsertionSort {

    static public void swap(int[] x, int idx1, int idx2) {

        int temp = x[idx1];
        x[idx1] = x[idx2];
        x[idx2] = temp;

    }

    static public void insertSort(int[] x) {

        // 2번째 요소부터 비교
        for (int i = 1; i < x.length; i++) {

            int j = i - 1; // 비교할 요소의 바로 왼쪽 요소

            while (j >= 0 && x[j] > x[j + 1]) {

                swap(x, j, j + 1);
                j--;

            }

            for (int k = 0; k < x.length; k++) {
                System.out.print("x[" + k + "] : " + x[k] + " ");
            }

            System.out.println();

        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("n : ");
        int n = scanner.nextInt();

        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }

        insertSort(x);

        for (int i = 0; i < n; i++) {
            System.out.println("x[" + i + "] : " + x[i]);
        }

    }

}
