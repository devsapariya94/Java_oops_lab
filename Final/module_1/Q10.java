import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        System.out.print("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int v = 0;
        int c = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u') {
                v++;
            }
            else if(a.charAt(i)==' '){
                continue;
            } 
            else {
                c++;
            }
        }
        System.out.println("The number of vowels are: " + v);
        System.out.println("The number of consonants are: " + c);
    }
}
