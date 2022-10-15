//read a file and display it on the screen
import java.io.*;
public class FileHandal
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fr =null;
        try{
            fr = new FileInputStream("12-10-2022\\FileWrite.java");
            int data =0;
            while(fr.read()!= (byte)-1){
                data= fr.read();
                System.out.print((char)data);
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