public class Q15 {
    static double calculateArea (int r){
        return 3.14*r*r;
    }
    static int calculateArea (int l, int b){
        return l*b;
    }
    public static void main(String[] args) {
        System.out.println("Area of Circle: " + calculateArea(5));
        System.out.println("Area of Rectangle: " + calculateArea(5, 10));
        System.out.println("Area of Square: " + calculateArea(5, 5));

    }
}
