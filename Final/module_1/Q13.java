import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        System.out.print("Enter the String1: ");
        Scanner sc = new Scanner(System.in);

        String string1 = sc.nextLine();
        System.out.print("Enter the String2: ");
        String string2 = sc.nextLine();
        System.out.println("The string1 is: " + string1);
        System.out.println("The string1 in uppercase is: " + string1.toUpperCase());
        System.out.println("The string1 in lowercase is: " + string1.toLowerCase());
        System.out.println("The total number of words in the string1 is: " + string1.split(" ").length);
        System.out.println("The substring of the string1 is: " + string1.substring(0, 5));
        if (string1.endsWith("Java")) {
            System.out.println("The string1 after concatenation is: " + string1.concat("StandardEdition"));
        }
        System.out.println("The string1 after trimming is: " + string1.trim());
        System.out.println("The length of the string1 is: " + string1.length());

        if (string1.equals(string2)) {
            System.out.println("The two strings are equal");
        } else {
            System.out.println("The two strings are not equal");
        }

    }
}
