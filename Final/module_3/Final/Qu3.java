//Write a program to Copy the data of a file, file name provided from command line argument, to another file.(Use Buffered I/O Stream). 

import java.io.*;
public class Qu3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream(args[0]);
        FileOutputStream fos = new FileOutputStream(args[1]);
        BufferedInputStream buffin = new BufferedInputStream(fin);
        BufferedOutputStream buffout = new BufferedOutputStream(fos);
        int i;
        while ((i = buffin.read()) != -1) {
            buffout.write(i);
        }
        buffin.close();
        buffout.close();
        System.out.println("File copied successfully");
    }
}