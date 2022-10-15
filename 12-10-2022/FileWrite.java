//read a file and display it on the screen
import java.io.*;
public class FileWrite
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fr =null;
        FileOutputStream fr2 = null;
        try{
            fr = new FileInputStream("FileHandal.java");
            fr2 = new FileOutputStream("copy.txt",true);
            int data =0;
            while(fr.available()>0){
                data= fr.read();
                fr2.write((char)data);
                // System.out.print((char) data);
                // fr.skip(1);
            }
        }  
        catch(IOException e){
            System.out.println(e);
        }
        finally{
            try{
                fr.close();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}