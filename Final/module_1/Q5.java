public class Q5 {
    public static void main(String[] args) {
        int a = 40;
        int b = 30;
        int c = 20;
        System.out.println("the value of a is " + a);
        System.out.println("the value of b is " + b);
        System.out.println("the value of c is " + c);
        if (a > b && a > c) {
            System.out.println("a is greater");
        }
        if (a > b || a > c) {
            System.out.println("a may be greater than c or b");
        }

        a += b;
        System.out.println("the value of a after a+=b is " + a);
        a++;
        System.out.println("the value of a after a++ is " + a);
        --a;
        System.out.println("the value of a after --a is " + a);
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + ~a);
        System.out.println("a << 2 = " + (a << 2));

    }
}
