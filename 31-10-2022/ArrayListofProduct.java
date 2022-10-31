import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListofProduct {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product(1, "Laptop", 1000));
        products.add(new Product(2, "Mobile", 500));
        products.add(new Product(3, "Tablet", 300));
        products.add(new Product(4, "TV", 2000));

        Iterator i = products.iterator();
        while (i.hasNext()) {
            Product p = (Product) i.next();
            System.out.println(p.id + " " + p.name + " " + p.price);
        }

        
    }

}

class Product {
    int id;
    String name;
    int price;
    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}