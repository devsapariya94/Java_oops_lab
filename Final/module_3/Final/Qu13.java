//Write a program to create an ArrayList of Products. Traverse the list and print it to the console. Provide a searching of product on name basis using contains() method of List.

import java.util.*;

class Product {
    String name;
    int price;
    int id;
    Product(int i, String name, int price) {
        this.id=i;
        this.name = name;
        this.price = price;
    }
}
public class Qu13 {
    public static void main(String[] args) {
        ArrayList<Product> al = new ArrayList<Product>();
        al.add(new Product(1, "Samsung", 10000));
        al.add(new Product(2, "Apple", 20000));
        al.add(new Product(3, "Nokia", 30000));
        al.add(new Product(4, "Sony", 40000));
        al.add(new Product(5, "LG", 50000));
        for (Product p : al) {
            System.out.println(p.id + " " + p.name + " " + p.price);
        }
        System.out.println("Enter the name of the product to search:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if (al.contains(name)) {
            System.out.println("Product found");
        } else {
            System.out.println("Product not found");
        }
    }
}