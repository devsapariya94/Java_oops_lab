
import java.util.Scanner;

public class question1 {
    static Scanner scan = new Scanner(System.in);

    static void printElement(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at " + i + " is: " + array[i]);
        }
    }

    static void sortarr(int arr[]) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    // swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        printElement(arr);

    }

    static void maxele(int[] array) {
        int temp = array[0];
        for (int i = 0; i < array.length; i++) {
            if (temp < array[i]) {
                temp = array[i];
            }
        }
        System.out.println("The Maximum Element in the given array is: " + temp);
    }

    static void minele(int[] array) {
        int temp = array[0];
        for (int i = 0; i < array.length; i++) {
            if (temp > array[i]) {
                temp = array[i];
            }
        }
        System.out.println("The Maximum Element in the given array is: " + temp);
    }

    static void sumarr(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("The sum of all element of the array is: " + sum);
    }

    static void productarr(int[] array) {
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            product = product * array[i];
        }
        System.out.println("The product of all element of the array is: " + product);
    }

    static void divisibility15(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 15 == 0) {
                System.out.println(array[i] + " is divisible by 15");
            }
        }
    }

    static int[] takearr() {
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter Number:- ");
            array[i] = scan.nextInt();
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = takearr();
        System.out.println("Which function you want to Perform(Enter the number): ");
        System.out.println("for Sorting the array enter 1");
        System.out.println("for Finding the maximum Element enter 2");
        System.out.println("for Finding the minimum Element enter 3");
        System.out.println("for Fing the sum of element enter 4");
        System.out.println("for the Product of element enter 5");
        System.out.println("for checking the Divisibility with 15 enter 6");
        int ans = scan.nextInt();
        if (ans == 1) {
            sortarr(arr);
        } else if (ans == 2) {
            maxele(arr);
        } else if (ans == 3) {
            minele(arr);
        } else if (ans == 4) {
            sumarr(arr);
        } else if (ans == 5) {
            productarr(arr);
        } else if (ans == 6) {
            divisibility15(arr);
        } else {
            System.out.println("Enter the valid output");
        }
    }
}