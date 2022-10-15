public class Q7 {
    public static void main(String[] args) {
        int[] arr = { 15, 12, 10, 8, 5, 0, 7, 8, 9, 10 };
        int sum = 0;
        int product = 1;
        int count = 0;
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            product *= arr[i];
            if (arr[i] % 15 == 0) {
                count++;
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Numbers divisible by 15: " + count);
        System.out.println("Maximum Value: " + max);
        System.out.println("Minimum Value: " + min);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
