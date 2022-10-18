    import java.util.*;

public class Q16 {
    public static void main(String[] args) {

        int[] a = { 1, 35, 22, 78, 23, 74, 65, 23, 54, 90 };
        int[] b = { 1, 35, 21, 73, 26, 74, 65, 23, 53, 97 };
        System.out.print("The Given Array is: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("The Shorted Array is: ");
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("The Copied Array is: " + Arrays.toString(Arrays.copyOf(a, 5)));
        System.out.println("The Copied Range Array is: " + Arrays.toString(Arrays.copyOfRange(a, 2, 5)));
        Arrays.fill(a, 5);
        System.out.println("The Filled Array is: " + Arrays.toString(a));
        System.out.println("The Binary Search Array is: " + Arrays.binarySearch(a, 5));
        System.out.println("The Equals Array is: " + Arrays.equals(a, b));

    }
}
