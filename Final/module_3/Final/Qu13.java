
import java.util.Scanner;
import java.util.ArrayList;
public class Qu13 {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        products.add("samsung");
        products.add("apple");
        products.add("mi");
        products.add("vivo");
        products.add("oneplus");
        System.out.println(products + " ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product to search in ArrayList");
        String name = sc.nextLine();
        if (products.contains(name)) {
            System.out.println("Product found");
        } else {
            System.out.println("Product not found");
        }
    }
}