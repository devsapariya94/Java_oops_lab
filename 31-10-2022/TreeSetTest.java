import java.util.Set;

public class TreeSetTest {
    public static void main(String[] args) {
        Set store = new TreeSetTest();
        
    }
}


class Product implements Comparable{
    int id;
    String name;
    int price;
    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    @Override
    public int compareTo(Object o) {
        Product that = (Product) o;
        if (this.id < that.id) {
            return -1;
        } else if (this.id > that.id) {
            return 1;
        } else {
            return 0;
        }
    }
}