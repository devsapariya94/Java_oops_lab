import java.io.*;
class Product implements Serializable
{
    int pid;
    String pname;
    double price;
    Product(int pid,String pname,double price)
    {
        this.pid=pid;
        this.pname=pname;
        this.price=price;
    }
    public String toString()
    {
        return pid+" "+pname+" "+price;
    }
}
public class Qu4
{
    public static void main(String args[]) throws IOException
    {
        Product p1=new Product(1,"Apple",100);
        Product p2=new Product(2,"Samsung",200);
        Product p3=new Product(3,"Vivo",3000);
        Product p4=new Product(4,"Oppo",400);
        Product p5=new Product(5,"Nothing",500);
        FileOutputStream fout=new FileOutputStream("ProductDetails.dat");
        ObjectOutputStream out=new ObjectOutputStream(fout);
        out.writeObject(p1);
        out.writeObject(p2);
        out.writeObject(p3);
        out.writeObject(p4);
        out.writeObject(p5);
        out.close();
        fout.close();
        System.out.println("Object written successfully");
    }
}
