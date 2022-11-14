//Write a program to create a TreeSet of Products. Traverse it and provide ordering on basis of name(Use comparator interface).
import java.util.*;
class Product{
    String name;
    int Id;
    Product(int i,String name){
        this.Id=i;
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getId(){
        return Id;
    }
}
class nameComparator implements Comparator<Product>{
    public int compare(Product p1,Product p2){
        return p1.getName().compareTo(p2.getName());
    }
}
public class Qu15 {
    public static void main(String[] args) {
        TreeSet<Product> set = new TreeSet<Product>(new nameComparator());
        set.add(new Product(1000, "samsung"));
        set.add(new Product(02, "apple"));
        set.add(new Product(300, "oneplus"));
        set.add(new Product(4, "vivo"));
        set.add(new Product(555, "mi"));
        for (Product p : set) {
            System.out.println(p.Id + " " + p.name);
        }

    }
}
