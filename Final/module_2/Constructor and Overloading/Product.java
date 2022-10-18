
class ProductTest {
    int pID;
    String pName;
    int pRate;
    static int count;

    public ProductTest(String pName, int rate) {
        pID = 101 + count++;
        this.pName = pName;
        pRate = rate;
        System.out.println("Constructor called with " + pName + " and " + rate);
        System.out.println("Name: " + pName + " Rate: " + rate);
    }

    public ProductTest(String name) {
        pID = 101 + count++;
        pName = name;
        System.out.println("Constructor called with " + name);
        System.out.println("Name: " + name);

    }

    public ProductTest(){
        this("NoName", 0);
        System.out.println("Default constructor called");
        System.out.println("NoName");
    }
}

public class Product {
    public static void main(String[] args) {
        ProductTest p1 = new ProductTest("Dev", 2);

    }
}