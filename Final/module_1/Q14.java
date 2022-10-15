// Perform addition and multiplication of two matrix.

public class Q14 {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] b = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] c = new int[3][3];
        int[][] d = new int[3][3];
        System.out.println("Matrix A:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrix B:");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                d[i][j] = a[i][j] * b[i][j];
            }
        }
        System.out.println("Addition of two matrix is: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Multiplication of two matrix is: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
    }
}
