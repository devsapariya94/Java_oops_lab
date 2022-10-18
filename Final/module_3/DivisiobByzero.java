import java.util.Scanner;

public class DivisiobByzero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 numbers: ");
        int a = sc.nextInt();
        System.out.print("Enter 2 numbers: ");
        int b = sc.nextInt();

        try{
            System.out.println("a/b: " + a/b);
            System.out.println("b/a: " + b/a);
        }
        catch(ArithmeticException e){
            System.out.println("Denominator is 0.");
        }
    }    
}
