import java.io.*;
import java.util.HashSet;

public class Qu8 {
    public static void main(String[] args) throws IOException {
        // PrintWriter pw = new PrintWriter("Qu81.txt");
        FileOutputStream fos = new FileOutputStream("Qu8-1.txt");
        BufferedOutputStream buffout = new BufferedOutputStream(fos);
        BufferedReader br = new BufferedReader(new FileReader("Qu8.txt"));
        String line = br.readLine();
        HashSet<String> hs = new HashSet<String>();
        
        while (line != null) {
            hs.add(line);
            line = br.readLine();
        }
        for (String s : hs) {
            buffout.write(s.getBytes());
            buffout.write("\n".getBytes());
        }


        br.close();
        buffout.close();

        System.out.println("File operation performed successfully");
    }
}