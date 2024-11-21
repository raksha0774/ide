public class Sort {
    void sortAscend(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void sortDescend(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
import java.util.Scanner;

public class TestSort {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        Sort s = new Sort();

        System.out.println("Input number of integers to sort:");
        n = sc.nextInt();

        int array[] = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Entered Array is:");
        s.printArray(array, n);

        s.sortAscend(array, n);
        System.out.println("Ascending Order:");
        s.printArray(array, n);

        s.sortDescend(array, n);
        System.out.println("Descending Order:");
        s.printArray(array, n);

        sc.close();
    }
}
