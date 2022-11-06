import java.io.*;
class Qu1
{
    public static void main(String args[]) throws IOException
    {
        FileInputStream fin = new FileInputStream("Qu1.java");
        FileOutputStream fout = new FileOutputStream("Qu1.txt");   
        int i;
        while((i=fin.read())!=-1)
        {
            fout.write(i+3);
        }
        fin.close();
        fout.close();
    }
}
