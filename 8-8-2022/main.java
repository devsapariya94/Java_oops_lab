import java.util.Scanner;

class main {
    static void printElement(int[] array) {
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at " + i + " is: " + array[i]);
        }

    }

    public static void main(String[] args) {
        int [] array = new int[6];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter Number:- ");
            array[i]=scan.nextInt();
        }
        printElement(array);
    }
}