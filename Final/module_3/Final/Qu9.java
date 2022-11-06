public class Qu9 {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException: " + e);
        }
    }
}
