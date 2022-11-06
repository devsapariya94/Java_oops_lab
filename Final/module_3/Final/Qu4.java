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
        Product p1=new Product(1,"A",100);
        Product p2=new Product(2,"B",200);
        Product p3=new Product(3,"C",3000);
        Product p4=new Product(4,"D",400);
        Product p5=new Product(5,"E",500);
        FileOutputStream fout=new FileOutputStream("ProductDetails.dat");
        ObjectOutputStream out=new ObjectOutputStream(fout);
        out.writeObject(p1);
        out.writeObject(p2);
        out.writeObject(p3);
        out.writeObject(p4);
        out.writeObject(p5);
        out.close();
        fout.close();
    }
}
