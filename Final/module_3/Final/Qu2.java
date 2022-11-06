import java.io.*;
public class Qu2 {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("Qu1.txt");
            int i;
            while ((i = fin.read()) != -1) {
                System.out.print((char) (i - 3));
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
