import java.io.*;
public class Qu7 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("Qu7.java"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("Qu7.txt"));
            String s;
            while ((s = br.readLine()) != null) {
                bw.write(s.toUpperCase());
                bw.newLine();
            }
            br.close();
            bw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("File is Printed in Uppercase");
    }
}
