import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String string = sc.nextLine();
        int count = 0;
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        int digit = 0;
        for (int j = 0; j < string.length(); j++) {

            if (string.charAt(j) == 'a' || string.charAt(j) == 'A') {
                a++;
            } else if (string.charAt(j) == 'e' || string.charAt(j) == 'E') {
                e++;
            } else if (string.charAt(j) == 'i' || string.charAt(j) == 'I') {
                i++;
            } else if (string.charAt(j) == 'o' || string.charAt(j) == 'O') {
                o++;
            } else if (string.charAt(j) == 'u' || string.charAt(j) == 'U') {
                u++;
            } else if (string.charAt(j) == ' ') {
                continue;
            } else if (string.charAt(j) >= '0' && string.charAt(j) <= '9') {
                digit++;
            } else {
                count++;
            }
        }
        System.out.println("The total number of a in the string is: " + a);
        System.out.println("The total number of e in the string is: " + e);
        System.out.println("The total number of i in the string is: " + i);
        System.out.println("The total number of o in the string is: " + o);
        System.out.println("The total number of u in the string is: " + u);
        System.out.println("The total number of consonants in the string is: " + count);
        System.out.println("The total number of digits in the string is: " + digit);
    }
}
