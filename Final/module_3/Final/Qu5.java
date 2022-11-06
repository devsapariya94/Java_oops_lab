import java.io.*;
public class Qu5 {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("ProductDetails.dat");
            ObjectInputStream in = new ObjectInputStream(fin);
            Product p1 = (Product) in.readObject();
            Product p2 = (Product) in.readObject();
            Product p3 = (Product) in.readObject();
            Product p4 = (Product) in.readObject();
            Product p5 = (Product) in.readObject();
            Product[] p = {p1, p2, p3, p4, p5};
            double max = p[0].price;
            double min = p[0].price;
            for (int i = 1; i < p.length; i++) {
                if (p[i].price > max) {
                    max = p[i].price;
                }
                if (p[i].price < min) {
                    min = p[i].price;
                }
            }
            for (int i = 0; i < p.length; i++) {
                if (p[i].price == max) {
                    System.out.println("Highest Price: " + p[i]);
                }
                if (p[i].price == min) {
                    System.out.println("Lowest Price: " + p[i]);
                }
            }
            in.close();
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
