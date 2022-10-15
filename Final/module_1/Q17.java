import java.util.Scanner;

// Write a program which will make calculator application. Use Math class methods like pow, abs, max, min, exp, log, sqrt, cbrt, sin etc
public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the operation: ");
        String op = sc.next();
        switch (op) {
            case "+":
                System.out.println("The sum is: " + (a + b));
                break;
            case "-":
                System.out.println("The difference is: " + (a - b));
                break;
            case "*":
                System.out.println("The product is: " + (a * b));
                break;
            case "/":
                System.out.println("The quotient is: " + (a / b));
                break;
            case "%":
                System.out.println("The remainder is: " + (a % b));
                break;
            case "^":
                System.out.println("The power is: " + Math.pow(a, b));
                break;
            case "abs":
                System.out.println("The absolute value of a is: " + Math.abs(a));
                System.out.println("The absolute value of b is: " + Math.abs(b));
                break;
            case "max":
                System.out.println("The maximum value is: " + Math.max(a, b));
                break;
            case "min":
                System.out.println("The minimum value is: " + Math.min(a, b));
                break;
            case "exp":
                System.out.println("The exponential value of a is: " + Math.exp(a));
                System.out.println("The exponential value of b is: " + Math.exp(b));
                break;
            case "log":
                System.out.println("The logarithmic value of a is: " + Math.log(a));
                System.out.println("The logarithmic value of b is: " + Math.log(b));
                break;
            case "sqrt":
                System.out.println("The square root of a is: " + Math.sqrt(a));
                System.out.println("The square root of b is: " + Math.sqrt(b));
                break;
            case "cbrt":
                System.out.println("The cube root of a is: " + Math.cbrt(a));
                System.out.println("The cube root of b is: " + Math.cbrt(b));
                break;
            case "sin":
                System.out.println("The sine value of a is: " + Math.sin(a));
                System.out.println("The sine value of b is: " + Math.sin(b));
                break;
            case "cos":


                System.out.println("The cosine value of a is: " + Math.cos(a));
                System.out.println("The cosine value of b is: " + Math.cos(b));
                break;
            case "tan":
                System.out.println("The tangent value of a is: " + Math.tan(a));
                System.out.println("The tangent value of b is: " + Math.tan(b));
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
    }
}
