//Write a program to print first N prime numbers
public class Q6 {
    
    public static void main(String[] args) {
        int n = 5;
        int count = 0;
        int i = 2;
        while (count < n) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
    
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
