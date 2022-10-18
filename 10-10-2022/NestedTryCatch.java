
public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            try {
                System.out.println("Inside block1");
                int b = 45 / 0;
                System.out.println(b);
            } catch (ArithmeticException e1) {
                System.out.println("Exception: e1");
            }
            try {
                System.out.println("Inside block2");
                int b = 45 / 0;
                System.out.println(b);
            } catch (ArrayIndexOutOfBoundsException e2) {
                System.out.println("Exception: e2");
            }
            System.out.println("Just other statement");
        }
        
        catch (Exception e3) {
            System.out.println("Exception: e3");
        }
        System.out.println("Next statement..");

    }
}