import java.io.*;
public class Qu6 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("Qu6.java"));
            int lines = 0, words = 0, chars = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lines++;
                String[] w = s.split(" ");
                words += w.length;
                chars += s.length();
            }
            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + chars);
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}