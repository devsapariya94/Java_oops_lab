//read a file and display it on the screen
import java.io.*;
public class FileHandal
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fr =null;
        try{
            fr = new FileInputStream("FileHandal.java");
            int data =0;
            while(fr.available()>0){
                data= fr.read();
                System.out.print((char) data);
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