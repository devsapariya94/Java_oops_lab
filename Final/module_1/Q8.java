import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        System.out.print("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String a= sc.nextLine();
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < a.length() - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(a.charAt(j) + " ");
            }
            System.out.println();
        }
    }
}
