import java.util.Scanner;

class Matrix {
    int m, n, p, q, i, j, k;
    int[][] first = new int[10][10];
    int[][] second = new int[10][10];
    int[][] result = new int[10][10];
    Scanner in = new Scanner(System.in);

    void input() {
        System.out.println("Enter the number of rows and columns of First matrix:");
        m = in.nextInt();
        n = in.nextInt();

        System.out.println("Enter elements of First matrix:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                first[i][j] = in.nextInt();
            }
        }

        System.out.println("Enter the number of rows and columns of Second matrix:");
        p = in.nextInt();
        q = in.nextInt();

        if (n != p) {
            System.out.println("The matrices can't be multiplied with each other.");
            System.exit(0);
        } else {
            System.out.println("Enter elements of Second matrix:");
            for (i = 0; i < p; i++) {
                for (j = 0; j < q; j++) {
                    second[i][j] = in.nextInt();
                }
            }
        }
    }

    void multiply() {
        for (i = 0; i < m; i++) {
            for (j = 0; j < q; j++) {
                for (k = 0; k < n; k++) {
                    result[i][j] += first[i][k] * second[k][j];
                }
            }
        }
    }

    void display() {
        System.out.println("Product of matrices:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < q; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
public class DemoMatrix {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.input();
        matrix.multiply();
        matrix.display();
    }
}
